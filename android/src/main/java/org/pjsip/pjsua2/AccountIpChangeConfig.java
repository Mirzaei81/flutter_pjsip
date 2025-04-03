/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.3.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

/**
 * Account config specific to IP address change.
 */
public class AccountIpChangeConfig {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected AccountIpChangeConfig(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AccountIpChangeConfig obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(AccountIpChangeConfig obj) {
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
        pjsua2JNI.delete_AccountIpChangeConfig(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   * Shutdown the transport used for account registration. If this is set to<br>
   * PJ_TRUE, the transport will be shutdown altough it's used by multiple<br>
   * account. Shutdown transport will be followed by re-Registration if<br>
   * AccountConfig.natConfig.contactRewriteUse is enabled.<br>
   * <br>
   * Default: true
   */
  public void setShutdownTp(boolean value) {
    pjsua2JNI.AccountIpChangeConfig_shutdownTp_set(swigCPtr, this, value);
  }

  /**
   * Shutdown the transport used for account registration. If this is set to<br>
   * PJ_TRUE, the transport will be shutdown altough it's used by multiple<br>
   * account. Shutdown transport will be followed by re-Registration if<br>
   * AccountConfig.natConfig.contactRewriteUse is enabled.<br>
   * <br>
   * Default: true
   */
  public boolean getShutdownTp() {
    return pjsua2JNI.AccountIpChangeConfig_shutdownTp_get(swigCPtr, this);
  }

  /**
   * Hangup active calls associated with the acount. If this is set to true, <br>
   * then the calls will be hang up.<br>
   * <br>
   * Default: false
   */
  public void setHangupCalls(boolean value) {
    pjsua2JNI.AccountIpChangeConfig_hangupCalls_set(swigCPtr, this, value);
  }

  /**
   * Hangup active calls associated with the acount. If this is set to true, <br>
   * then the calls will be hang up.<br>
   * <br>
   * Default: false
   */
  public boolean getHangupCalls() {
    return pjsua2JNI.AccountIpChangeConfig_hangupCalls_get(swigCPtr, this);
  }

  /**
   * Specify the call flags used in the re-INVITE when <i>hangupCalls</i> is set <br>
   * to false. If this is set to 0, no re-INVITE will be sent. The <br>
   * re-INVITE will be sent after re-Registration is finished.<br>
   * <br>
   * Default: PJSUA_CALL_REINIT_MEDIA | PJSUA_CALL_UPDATE_CONTACT |<br>
   *          PJSUA_CALL_UPDATE_VIA
   */
  public void setReinviteFlags(long value) {
    pjsua2JNI.AccountIpChangeConfig_reinviteFlags_set(swigCPtr, this, value);
  }

  /**
   * Specify the call flags used in the re-INVITE when <i>hangupCalls</i> is set <br>
   * to false. If this is set to 0, no re-INVITE will be sent. The <br>
   * re-INVITE will be sent after re-Registration is finished.<br>
   * <br>
   * Default: PJSUA_CALL_REINIT_MEDIA | PJSUA_CALL_UPDATE_CONTACT |<br>
   *          PJSUA_CALL_UPDATE_VIA
   */
  public long getReinviteFlags() {
    return pjsua2JNI.AccountIpChangeConfig_reinviteFlags_get(swigCPtr, this);
  }

  /**
   * For refreshing the call, use SIP UPDATE, instead of re-INVITE, if<br>
   * remote supports it (by publishing it in Allow header). If remote<br>
   * does not support UPDATE method or somehow the UPDATE attempt fails,<br>
   * it will fallback to using re-INVITE. The <i>reinviteFlags</i> will be<br>
   * used regardless whether it is re-INVITE or UPDATE that is sent.<br>
   * <br>
   * Default: PJ_FALSE (using re-INVITE).
   */
  public void setReinvUseUpdate(long value) {
    pjsua2JNI.AccountIpChangeConfig_reinvUseUpdate_set(swigCPtr, this, value);
  }

  /**
   * For refreshing the call, use SIP UPDATE, instead of re-INVITE, if<br>
   * remote supports it (by publishing it in Allow header). If remote<br>
   * does not support UPDATE method or somehow the UPDATE attempt fails,<br>
   * it will fallback to using re-INVITE. The <i>reinviteFlags</i> will be<br>
   * used regardless whether it is re-INVITE or UPDATE that is sent.<br>
   * <br>
   * Default: PJ_FALSE (using re-INVITE).
   */
  public long getReinvUseUpdate() {
    return pjsua2JNI.AccountIpChangeConfig_reinvUseUpdate_get(swigCPtr, this);
  }

  /**
   * Read this object from a container node.<br>
   * <br>
   * @param node              Container to read values from.
   */
  public void readObject(ContainerNode node) throws java.lang.Exception {
    pjsua2JNI.AccountIpChangeConfig_readObject(swigCPtr, this, ContainerNode.getCPtr(node), node);
  }

  /**
   * Write this object to a container node.<br>
   * <br>
   * @param node              Container to write values to.
   */
  public void writeObject(ContainerNode node) throws java.lang.Exception {
    pjsua2JNI.AccountIpChangeConfig_writeObject(swigCPtr, this, ContainerNode.getCPtr(node), node);
  }

  public AccountIpChangeConfig() {
    this(pjsua2JNI.new_AccountIpChangeConfig(), true);
  }

}
