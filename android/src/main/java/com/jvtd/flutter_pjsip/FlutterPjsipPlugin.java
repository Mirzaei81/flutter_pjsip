package com.jvtd.flutter_pjsip;

import androidx.annotation.NonNull;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.media.SoundPool;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Message;
import android.os.PowerManager;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.content.pm.PackageManager;

import com.jvtd.flutter_pjsip.entity.MSG_TYPE;
import com.jvtd.flutter_pjsip.entity.MyBuddy;
import com.jvtd.flutter_pjsip.entity.MyCall;
import com.jvtd.flutter_pjsip.interfaces.MyAppObserver;
import com.jvtd.flutter_pjsip.utils.MethodResultWrapper;
import com.jvtd.flutter_pjsip.utils.SoundPoolUtil;

import org.pjsip.pjsua2.CallInfo;
import org.pjsip.pjsua2.CallOpParam;
import org.pjsip.pjsua2.pjsip_inv_state;
import org.pjsip.pjsua2.pjsip_status_code;

import java.util.HashMap;
import java.util.Map;

import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;



public class FlutterPjsipPlugin  implements FlutterPlugin, MethodCallHandler, ActivityAware 
{
  private static final String TAG = "FlutterPjsipPlugin";

  private static final String CHANNEL = "flutter_pjsip";
  private static final String METHOD_PJSIP_INIT = "method_pjsip_init";
  private static final String METHOD_PJSIP_LOGIN = "method_pjsip_login";
  private static final String METHOD_PJSIP_CALL = "method_pjsip_call";
  private static final String METHOD_PJSIP_LOGOUT = "method_pjsip_logout";
  private static final String METHOD_PJSIP_DEINIT = "method_pjsip_deinit";
  private static final String METHOD_PJSIP_RECEIVE = "method_pjsip_receive";
  private static final String METHOD_PJSIP_REFUSE = "method_pjsip_refuse";
  private static final String METHOD_PJSIP_HANDS_FREE = "method_pjsip_hands_free";
  private static final String METHOD_PJSIP_MUTE = "method_pjsip_mute";
  private static final String METHOD_CALL_STATUS_CHANGED = "method_call_state_changed";
  private  static  final String METHOD_PJSIP_HOLD_CALL = "method_pjsip_hold_call";
  private  static  final String METHOD_PJSIP_REINVITE_CALL = "method_pjsip_reinvite_call";


  private MethodChannel mChannel;
  private Activity mActivity;
  private Result mResult;
  private String mMethod;
  private MyBroadcastReceiver mReceiver;
  private String mIp;
  private String mPort;
  private MyCall mCurrentCall;// 记录当前通话，若没有通话，为null

  private AudioManager mAudioManager;
  private SoundPoolUtil mSoundPoolUtil;
  private int mSoundWaitId;
  private TelephonyManager mTelephonyManager;
  private SystemPhoneStateListener mSystemPhoneStateListener;
  private PowerManager.WakeLock mWakeLock;
  private SensorManager mSensorManager;
  private Vibrator mVibrator;

  private PjSipManagerState mPjSipManagerState = PjSipManagerState.STATE_UNDEFINED;
  private final PjSipManager mPjSipManager = PjSipManager.getInstance();

  private final MyAppObserver mAppObserver = new MyAppObserver()
  {
    @Override
    public void notifyRegState(final long code, String reason, final long expiration)
    {
      if (TextUtils.equals(mMethod, METHOD_PJSIP_LOGIN))
      {
        boolean loginResult = code / 100 == 2;
        mMethod = "";

        Message m = Message.obtain(handler, MSG_TYPE.REG_STATE, loginResult);
        m.sendToTarget();
      }
    }

    @Override
    public void notifyIncomingCall(MyCall call)
    {
      Message m = Message.obtain(handler, MSG_TYPE.INCOMING_CALL, call);
      m.sendToTarget();
    }

    @Override
    public void notifyCallState(MyCall call)
    {
      if (mCurrentCall == null || call.getId() != mCurrentCall.getId()) return;
      CallInfo info = null;
      try
      {
        info = call.getInfo();
      } catch (Exception e)
      {
        e.printStackTrace();
      }

      if (info != null)
      {
        Message m = Message.obtain(handler, MSG_TYPE.CALL_STATE, info);
        m.sendToTarget();
      }
    }

    @Override
    public void notifyCallMediaState(MyCall call)
    {
      Message m = Message.obtain(handler, MSG_TYPE.CALL_MEDIA_STATE, null);
      m.sendToTarget();
    }

    @Override
    public void notifyBuddyState(MyBuddy buddy)
    {
      Message m = Message.obtain(handler, MSG_TYPE.BUDDY_STATE, buddy);
      m.sendToTarget();
    }

    @Override
    public void notifyChangeNetwork()
    {
      Message m = Message.obtain(handler, MSG_TYPE.CHANGE_NETWORK, null);
      m.sendToTarget();
    }
  };

  private final Handler handler = new Handler(new Handler.Callback()
  {
    @Override
    public boolean handleMessage(Message msg)
    {
      if (mResult == null) return false;
      int what = msg.what;
      switch (what)
      {
        case MSG_TYPE.REG_STATE:
          boolean loginResult = (boolean) msg.obj;
          mPjSipManagerState = PjSipManagerState.STATE_LOGINED;
          mResult.success(loginResult);
          break;

        case MSG_TYPE.CALL_STATE:
          CallInfo callInfo = (CallInfo) msg.obj;
          if (mCurrentCall == null || callInfo == null || callInfo.getId() != mCurrentCall.getId())
          {
            System.out.println("Call state event received, but call info is invalid");
            return true;
          }

          long state = callInfo.getState();
          if (state == pjsip_inv_state.PJSIP_INV_STATE_CALLING)
          {
            mSoundPoolUtil = new SoundPoolUtil(mActivity, new SoundPool.OnLoadCompleteListener()
            {
              @Override
              public void onLoadComplete(SoundPool soundPool, int sampleId, int status)
              {
                if (mSoundPoolUtil != null)
                  mSoundPoolUtil.play(mSoundWaitId);
              }
            });
            int rawId = R.raw.ring_back;
            mSoundWaitId = mSoundPoolUtil.load(rawId);
            mPjSipManagerState = PjSipManagerState.STATE_CALLING;
          } else if (state == pjsip_inv_state.PJSIP_INV_STATE_CONFIRMED)
          {
            registerPhoneState();
            stopRingBackSound();

            mPjSipManagerState = PjSipManagerState.STATE_CONFIRMED;
            // 通话状态被确认，震动500ms
            if (mVibrator != null)
              mVibrator.vibrate(VibrationEffect.createOneShot(500,10));
            if (mActivity != null)
              mActivity.setVolumeControlStream(AudioManager.STREAM_VOICE_CALL);
            if (mAudioManager != null)
            {
              if (mAudioManager.getMode() != AudioManager.MODE_IN_COMMUNICATION)
                mAudioManager.setMode(AudioManager.MODE_IN_COMMUNICATION);
              if (mAudioManager.isMicrophoneMute())
                mAudioManager.setMicrophoneMute(false);
              if (mAudioManager.isSpeakerphoneOn())
                mAudioManager.setSpeakerphoneOn(false);
            }
          } else if (state == pjsip_inv_state.PJSIP_INV_STATE_DISCONNECTED)
          {
            mPjSipManagerState = PjSipManagerState.STATE_DISCONNECTED;
            mCurrentCall.delete();
            mCurrentCall = null;

            stopRingBackSound();
            unRegisterPhoneState();
          }

          if (mChannel != null)
          {
            Log.i(TAG, "FlutterPjsipPlugin Error" + callInfo.getStateText());
            mChannel.invokeMethod(METHOD_CALL_STATUS_CHANGED, buildArguments(callInfo.getStateText(), callInfo.getRemoteUri()));
          }
          break;

        case MSG_TYPE.CALL_MEDIA_STATE:
          // TODO 未实现视频通话，暂不用实现
          break;

        case MSG_TYPE.INCOMING_CALL:
          /* Incoming call */
          MyCall call = (MyCall) msg.obj;
          CallOpParam prm = new CallOpParam();
          /* Only one call at anytime */
          if (mCurrentCall != null)
          {
            try
            {
              // 设置StatusCode
              prm.setStatusCode(pjsip_status_code.PJSIP_SC_BUSY_HERE);
              call.hangup(prm);
              call.delete();
            } catch (Exception e)
            {
              e.printStackTrace();
            }
            return true;
          } else
          {
            try
            {
              mSoundPoolUtil = new SoundPoolUtil(mActivity, new SoundPool.OnLoadCompleteListener()
              {
                @Override
                public void onLoadComplete(SoundPool soundPool, int sampleId, int status)
                {
                  if (mSoundPoolUtil != null)
                    mSoundPoolUtil.play(mSoundWaitId);
                }
              });
              int rawId = R.raw.incoming_ring;
              mSoundWaitId = mSoundPoolUtil.load(rawId);

              /* Answer with ringing */
              prm.setStatusCode(pjsip_status_code.PJSIP_SC_RINGING);
              call.answer(prm);
              mCurrentCall = call;

              mPjSipManagerState = PjSipManagerState.STATE_INCOMING;

              if (mChannel != null)
              {
                mChannel.invokeMethod(METHOD_CALL_STATUS_CHANGED, buildArguments("INCOMING", mCurrentCall.getInfo().getRemoteUri()));
              }
            } catch (Exception e)
            {
              e.printStackTrace();
            }
          }
          break;

        case MSG_TYPE.CHANGE_NETWORK:
          if (mPjSipManager != null)
            mPjSipManager.handleNetworkChange();
          break;
      }
      return false;
    }
  });

  @Override
  public void onMethodCall(@NonNull MethodCall call,final @NonNull Result result)
  {
    try
    {
      handleMethodCall(call, result);
    } catch (Exception e)
    {
      result.error("Unexpected error!", e.getMessage(), e);
    }
  }
  @Override
  public void onReattachedToActivityForConfigChanges(@NonNull ActivityPluginBinding binding){
    mActivity = binding.getActivity();
    registerAudioManager();
  }
  @Override 
  public void onAttachedToActivity(@NonNull ActivityPluginBinding binding){
    mActivity = binding.getActivity();
    registerAudioManager();
  }

  @Override
  public void onAttachedToEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
    mChannel = new MethodChannel(flutterPluginBinding.getFlutterEngine().getDartExecutor(), CHANNEL);
    mChannel.setMethodCallHandler(this);
  }

  @Override
  public void onDetachedFromEngine(@NonNull FlutterPluginBinding binding) {
      mChannel.setMethodCallHandler(null);
  }
  @Override 
  public void  onDetachedFromActivity(){
    mActivity = null;
    mAudioManager = null;
  }
  @Override 
  public void onDetachedFromActivityForConfigChanges(){
    mActivity = null;
    mAudioManager = null;
  }

  private static final int PERMISSION_CODE = 1001; // Define a unique request code for permissions

  private void checkPermissions() {
      if (mActivity.checkSelfPermission(android.Manifest.permission.RECORD_AUDIO)
              != PackageManager.PERMISSION_GRANTED) {

          mActivity.requestPermissions(new String[]{android.Manifest.permission.RECORD_AUDIO},
                  PERMISSION_CODE);
      }
}

  private void handleMethodCall(MethodCall call, Result rawResult)
  {
    MethodChannel.Result result = new MethodResultWrapper(rawResult);
    mMethod = call.method;
    mResult = result;
    if (mMethod == null || mResult == null) return;
    if (mActivity == null)
    {
      mResult.success(false);
      return;
    }
    switch (mMethod)
    {
      case METHOD_PJSIP_INIT -> pjsipInit();

      case METHOD_PJSIP_LOGIN -> {
          String username = call.argument("username");
          String password = call.argument("password");
          mIp = call.argument("ip");
          mPort = call.argument("port");
          pjsipLogin(username, password, mIp, mPort);
          }

      case METHOD_PJSIP_CALL -> {
          String toUsername = call.argument("username");
          String toIp = call.argument("ip");
          String toPort = call.argument("port");
          pjsipCall(toUsername, TextUtils.isEmpty(toIp) ? mIp : toIp, TextUtils.isEmpty(toPort) ? mPort : toPort);
          }

      case METHOD_PJSIP_LOGOUT -> pjsipLogout();

      case METHOD_PJSIP_DEINIT -> pjsipDeinit();

      case METHOD_PJSIP_RECEIVE -> pjsipReceive();

      case METHOD_PJSIP_REFUSE -> {
          pjsipRefuse();
          unRegisterPhoneState();
          }

      case METHOD_PJSIP_HANDS_FREE -> pjsipHandsFree();
      case METHOD_PJSIP_MUTE -> pjsipMute();
      case METHOD_PJSIP_HOLD_CALL -> pjsipHoldCall();
      case METHOD_PJSIP_REINVITE_CALL ->  pjsipReInvite();

      default -> result.notImplemented();
    }
  }

  private void pjsipReInvite() {
    if (mCurrentCall != null&& mPjSipManagerState.getCode() == PjSipManagerState.STATE_HOLDING.getCode()) {
      if(mPjSipManager.reInvite()){
        mResult.success(true);
        mPjSipManagerState=PjSipManagerState.STATE_HOLDING;
        return;
      };
    }
    mResult.success(false);
  }



  private void pjsipHoldCall() {
    if (mCurrentCall == null)
      mResult.success(false);
    else{
      if ( mPjSipManagerState.getCode() == PjSipManagerState.STATE_CONFIRMED.getCode()){
        mPjSipManager.hold();
        mPjSipManagerState=PjSipManagerState.STATE_HOLDING;
        mResult.success(true);
      }
    }

  }

  private void pjsipInit()
  {
    if (mPjSipManagerState.getCode() > PjSipManagerState.STATE_UNDEFINED.getCode())
      mResult.success(false);
    else
    {
          checkPermissions();
          mPjSipManager.init(mAppObserver);

          if (mReceiver == null) {
              mReceiver = new MyBroadcastReceiver();
              IntentFilter intentFilter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
              mActivity.getApplication().registerReceiver(mReceiver, intentFilter);
          }
          mPjSipManagerState = PjSipManagerState.STATE_INITED;
          mResult.success(true);
      }
  }

  private void pjsipLogin(String username, String password, String ip, String port)
  {
    if (mPjSipManagerState.getCode() == PjSipManagerState.STATE_INITED.getCode())
      mPjSipManager.login(username, password, ip, port);
    else
      mResult.success(false);
  }

  /**
   * PjSip打电话方法
   *
   * @author Jack Zhang
   * create at 2019-08-12 23:45
   */
  private void pjsipCall(String username, String ip, String port)
  {
    if (mCurrentCall != null)
      mResult.success(false);
    else
    {
      MyCall call = null;
      if (mPjSipManagerState.getCode() >= PjSipManagerState.STATE_LOGINED.getCode())
        call = mPjSipManager.call(username, ip, port);
      else
        mResult.success(false);

      if (call == null)
        mResult.success(false);
      else
      {
        mCurrentCall = call;
        mResult.success(true);
      }
    }
  }

  /**
   * PjSip登出方法
   *
   * @author Jack Zhang
   * create at 2019-08-22 00:02
   */
  private void pjsipLogout()
  {
    if (mPjSipManagerState.getCode() > PjSipManagerState.STATE_LOGINED.getCode())
    {
      mPjSipManager.logout();
      mPjSipManagerState = PjSipManagerState.STATE_INITED;
      mResult.success(true);
    } else
      mResult.success(false);
  }

  /**
   * PjSip销毁方法
   *
   * @author Jack Zhang
   * create at 2019-08-22 00:05
   */
  private void pjsipDeinit()
  {
    if (mPjSipManagerState.getCode() > PjSipManagerState.STATE_INITED.getCode())
    {
      mPjSipManager.deinit();
      if (mReceiver != null)
        mActivity.getApplication().unregisterReceiver(mReceiver);
      mReceiver = null;
      mPjSipManagerState = PjSipManagerState.STATE_UNDEFINED;
      mResult.success(true);
    } else
      mResult.success(false);
  }

  /**
   * PjSip接听电话
   *
   * @author Jack Zhang
   * create at 2019-08-22 11:45
   */
  private void pjsipReceive()
  {
    if (mCurrentCall == null)
      mResult.success(false);
    else
      try
      {
        CallOpParam prm = new CallOpParam();
        prm.setStatusCode(pjsip_status_code.PJSIP_SC_OK);
        mCurrentCall.answer(prm);
        CallInfo callInfo = mCurrentCall.getInfo();
        if (mChannel != null)
        {
          mChannel.invokeMethod(METHOD_CALL_STATUS_CHANGED, buildArguments(callInfo.getStateText(), callInfo.getRemoteUri()));
          mResult.success(true);
        } else
          mResult.success(false);
      } catch (Exception e)
      {
        e.printStackTrace();
        mResult.success(false);
      }
  }

  /**
   * PjSip拒接/挂断
   *
   * @author Jack Zhang
   * create at 2019-08-22 16:32
   */
  private void pjsipRefuse()
  {
    if (mCurrentCall == null)
      mResult.success(false);
    else
    {
      try
      {
        CallOpParam prm = new CallOpParam();
        prm.setStatusCode(pjsip_status_code.PJSIP_SC_DECLINE);
        mCurrentCall.hangup(prm);
        mResult.success(true);
      } catch (Exception e)
      {
        e.printStackTrace();
        mResult.success(false);
      } finally
      {
        mCurrentCall = null;
        stopRingBackSound();
        if (mChannel != null)
        {
          mChannel.invokeMethod(METHOD_CALL_STATUS_CHANGED, buildArguments("DISCONNCTD", null));
        }
        mPjSipManagerState = PjSipManagerState.STATE_DISCONNECTED;
      }
    }
  }

  /**
   * PjSip免提功能
   *
   * @author Jack Zhang
   * create at 2019-08-22 17:23
   */
  private void pjsipHandsFree()
  {
    if (mPjSipManagerState == PjSipManagerState.STATE_CONFIRMED)
    {
      if (mActivity != null)
        mActivity.setVolumeControlStream(AudioManager.STREAM_VOICE_CALL);
      mAudioManager.setMode(AudioManager.MODE_IN_COMMUNICATION);
      mAudioManager.setSpeakerphoneOn(!mAudioManager.isSpeakerphoneOn());
      mResult.success(true);
    } else
      mResult.success(false);
  }

  private void pjsipMute()
  {
    if (mPjSipManagerState == PjSipManagerState.STATE_CONFIRMED)
    {
      mAudioManager.setMicrophoneMute(!mAudioManager.isMicrophoneMute());
      mResult.success(true);
    } else
      mResult.success(false);
  }

  private class MyBroadcastReceiver extends BroadcastReceiver
  {
    private String conn_name = "";

    @Override
    public void onReceive(Context context, Intent intent)
    {
      if (isNetworkChange(context))
      {
        Message m = Message.obtain(handler, MSG_TYPE.CHANGE_NETWORK, null);
        m.sendToTarget();
      }
    }

    private boolean isNetworkChange(Context context)
    {
      boolean network_changed = false;
      ConnectivityManager connectivity_mgr = ((ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE));
      if (connectivity_mgr != null)
      {
        NetworkInfo net_info = connectivity_mgr.getActiveNetworkInfo();
        if (net_info != null && conn_name != null)
        {
          if (net_info.isConnectedOrConnecting() && !conn_name.equalsIgnoreCase(""))
          {
            String new_con = net_info.getExtraInfo();
            if (new_con != null && !new_con.equalsIgnoreCase(conn_name))
              network_changed = true;
            conn_name = (new_con == null) ? "" : new_con;
          } else
          {
            if (conn_name.equalsIgnoreCase(""))
              conn_name = net_info.getExtraInfo();
          }
        }
      }
      return network_changed;
    }
  }

  private Map<String, Object> buildArguments(String status, Object remoteUri)
  {
    Map<String, Object> result = new HashMap<>();
    result.put("call_state", status);
    result.put("remote_uri", remoteUri != null ? remoteUri : "");
    return result;
  }

  /**
   * 注册基本监听
   *
   * @author Jack Zhang
   * create at 2019-08-22 17:41
   */
  private void registerAudioManager()
  {
    mAudioManager = (AudioManager) mActivity.getSystemService(Context.AUDIO_SERVICE);
  }

  /**
   * 注册相关监听
   *
   * @author Jack Zhang
   * create at 2019-08-20 23:37
   */
  private void registerPhoneState()
  {
    PowerManager powerManager = (PowerManager) mActivity.getSystemService(Context.POWER_SERVICE);
    // 距离感应器的电源锁
    // PowerManager.PROXIMITY_SCREEN_OFF_WAKE_LOCK 值为 32
    mWakeLock = powerManager.newWakeLock(32, getClass().getName());
    mWakeLock.setReferenceCounted(false); // 设置不启用引用计数

    // 传感器管理对象,调用距离传感器，控制屏幕
    mSensorManager = (SensorManager) mActivity.getSystemService(Context.SENSOR_SERVICE);
    mSensorManager.registerListener(mSensorEventListener, mSensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY), SensorManager.SENSOR_DELAY_NORMAL);

    mTelephonyManager = (TelephonyManager) mActivity.getSystemService(Context.TELEPHONY_SERVICE);
    mSystemPhoneStateListener = new SystemPhoneStateListener();
    mTelephonyManager.listen(mSystemPhoneStateListener, PhoneStateListener.LISTEN_CALL_STATE);

    mVibrator = (Vibrator) mActivity.getSystemService(Context.VIBRATOR_SERVICE);
  }

  private void unRegisterPhoneState()
  {
    if (mSystemPhoneStateListener != null && mTelephonyManager != null)
    {
      mTelephonyManager.listen(mSystemPhoneStateListener, PhoneStateListener.LISTEN_NONE);
      mSystemPhoneStateListener = null;
      mTelephonyManager = null;
    }
    if (mSensorManager != null)
    {
      mSensorManager.unregisterListener(mSensorEventListener);
      mSensorManager = null;
    }
    if (mWakeLock != null)
    {
      mWakeLock.release();// 释放电源锁
      mWakeLock = null;
    }
    if (mVibrator != null)
    {
      mVibrator.cancel();
      mVibrator = null;
    }
    if (mAudioManager != null)// 还原系统音频设置
    {
      try
      {
        if (mActivity != null)
          mActivity.setVolumeControlStream(AudioManager.USE_DEFAULT_STREAM_TYPE);
        if (mAudioManager.getMode() != AudioManager.MODE_NORMAL)
          mAudioManager.setMode(AudioManager.MODE_NORMAL);
        if (mAudioManager.isMicrophoneMute())
          mAudioManager.setMicrophoneMute(false);
        if (mAudioManager.isSpeakerphoneOn())
          mAudioManager.setSpeakerphoneOn(false);
      } catch (Exception e)
      {
        e.printStackTrace();
      }
    }
  }

  /**
   * 销毁SoundPoolUtil
   *
   * @author Jack Zhang
   * create at 2019-08-22 19:43
   */
  private void stopRingBackSound()
  {
    if (mSoundPoolUtil != null && mSoundWaitId != 0)
    {
      mSoundPoolUtil.stop(mSoundWaitId);
      mSoundWaitId = 0;
      mSoundPoolUtil.destroy();
      mSoundPoolUtil = null;
    }
  }

  private SensorEventListener mSensorEventListener = new SensorEventListener()
  {
    @Override
    public void onSensorChanged(SensorEvent event)
    {
      float[] its = event.values;
      if (its != null && event.sensor.getType() == Sensor.TYPE_PROXIMITY)
      {
        if (its[0] == 0.0f)
        {
          // 贴近手机
          if (!mWakeLock.isHeld())
            mWakeLock.acquire();// 申请设备电源锁
        } else
        {
          // 远离手机
          if (mWakeLock.isHeld())
          {
            mWakeLock.setReferenceCounted(false);
            mWakeLock.release(); // 释放设备电源锁
          }
        }
      }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy)
    {

    }
  };

  private class SystemPhoneStateListener extends PhoneStateListener
  {
    @Override
    public void onCallStateChanged(int state, String incomingNumber)
    {
      switch (state)
      {
        case TelephonyManager.CALL_STATE_RINGING:
          //等待接电话
          break;
        case TelephonyManager.CALL_STATE_IDLE:
          //电话挂断
          break;
        case TelephonyManager.CALL_STATE_OFFHOOK:
          pjsipRefuse();
          break;
      }
      super.onCallStateChanged(state, incomingNumber);
    }
  }
}