/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.3.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

/**
 * This structure contains parameters for onIncomingSubscribe() callback.
 */
public class OnIncomingSubscribeParam {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected OnIncomingSubscribeParam(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OnIncomingSubscribeParam obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(OnIncomingSubscribeParam obj) {
    long ptr = 0;
    if (obj != null) {
      if (!obj.swigCMemOwn)
        throw new RuntimeException("Cannot release ownership as memory is not owned");
      ptr = obj.swigCPtr;
      obj.swigCMemOwn = false;
      obj.delete();
    }
    return ptr;
  }

  @SuppressWarnings({"deprecation", "removal"})
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_OnIncomingSubscribeParam(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   * Server presence subscription instance. If application delays<br>
   * the acceptance of the request, it will need to specify this object<br>
   * when calling Account::presNotify().
   */
  public void setSrvPres(long value) {
    pjsua2JNI.OnIncomingSubscribeParam_srvPres_set(swigCPtr, this, value);
  }

  /**
   * Server presence subscription instance. If application delays<br>
   * the acceptance of the request, it will need to specify this object<br>
   * when calling Account::presNotify().
   */
  public long getSrvPres() {
    return pjsua2JNI.OnIncomingSubscribeParam_srvPres_get(swigCPtr, this);
  }

  /**
   *  Sender URI.
   */
  public void setFromUri(String value) {
    pjsua2JNI.OnIncomingSubscribeParam_fromUri_set(swigCPtr, this, value);
  }

  /**
   *  Sender URI.
   */
  public String getFromUri() {
    return pjsua2JNI.OnIncomingSubscribeParam_fromUri_get(swigCPtr, this);
  }

  /**
   * The incoming message.
   */
  public void setRdata(SipRxData value) {
    pjsua2JNI.OnIncomingSubscribeParam_rdata_set(swigCPtr, this, SipRxData.getCPtr(value), value);
  }

  /**
   * The incoming message.
   */
  public SipRxData getRdata() {
    long cPtr = pjsua2JNI.OnIncomingSubscribeParam_rdata_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SipRxData(cPtr, false);
  }

  /**
   * The status code to respond to the request. The default value is 200.<br>
   * Application may set this to other final status code to accept or<br>
   * reject the request.
   */
  public void setCode(int value) {
    pjsua2JNI.OnIncomingSubscribeParam_code_set(swigCPtr, this, value);
  }

  /**
   * The status code to respond to the request. The default value is 200.<br>
   * Application may set this to other final status code to accept or<br>
   * reject the request.
   */
  public int getCode() {
    return pjsua2JNI.OnIncomingSubscribeParam_code_get(swigCPtr, this);
  }

  /**
   * The reason phrase to respond to the request.
   */
  public void setReason(String value) {
    pjsua2JNI.OnIncomingSubscribeParam_reason_set(swigCPtr, this, value);
  }

  /**
   * The reason phrase to respond to the request.
   */
  public String getReason() {
    return pjsua2JNI.OnIncomingSubscribeParam_reason_get(swigCPtr, this);
  }

  /**
   * Additional data to be sent with the response, if any.
   */
  public void setTxOption(SipTxOption value) {
    pjsua2JNI.OnIncomingSubscribeParam_txOption_set(swigCPtr, this, SipTxOption.getCPtr(value), value);
  }

  /**
   * Additional data to be sent with the response, if any.
   */
  public SipTxOption getTxOption() {
    long cPtr = pjsua2JNI.OnIncomingSubscribeParam_txOption_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SipTxOption(cPtr, false);
  }

  public OnIncomingSubscribeParam() {
    this(pjsua2JNI.new_OnIncomingSubscribeParam(), true);
  }

}
