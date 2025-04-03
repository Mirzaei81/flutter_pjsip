/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.3.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

/**
 * Parameter of Endpoint::onRejectedIncomingCall() callback.
 */
public class OnRejectedIncomingCallParam {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected OnRejectedIncomingCallParam(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OnRejectedIncomingCallParam obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(OnRejectedIncomingCallParam obj) {
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
        pjsua2JNI.delete_OnRejectedIncomingCallParam(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   * The incoming call id. This will be set to PJSUA_INVALID_ID when there is<br>
   * no available call slot at the time.
   */
  public void setCallId(int value) {
    pjsua2JNI.OnRejectedIncomingCallParam_callId_set(swigCPtr, this, value);
  }

  /**
   * The incoming call id. This will be set to PJSUA_INVALID_ID when there is<br>
   * no available call slot at the time.
   */
  public int getCallId() {
    return pjsua2JNI.OnRejectedIncomingCallParam_callId_get(swigCPtr, this);
  }

  /**
   * Local URI.
   */
  public void setLocalInfo(String value) {
    pjsua2JNI.OnRejectedIncomingCallParam_localInfo_set(swigCPtr, this, value);
  }

  /**
   * Local URI.
   */
  public String getLocalInfo() {
    return pjsua2JNI.OnRejectedIncomingCallParam_localInfo_get(swigCPtr, this);
  }

  /**
   * Remote URI.
   */
  public void setRemoteInfo(String value) {
    pjsua2JNI.OnRejectedIncomingCallParam_remoteInfo_set(swigCPtr, this, value);
  }

  /**
   * Remote URI.
   */
  public String getRemoteInfo() {
    return pjsua2JNI.OnRejectedIncomingCallParam_remoteInfo_get(swigCPtr, this);
  }

  /**
   * Rejection code.
   */
  public void setStatusCode(int value) {
    pjsua2JNI.OnRejectedIncomingCallParam_statusCode_set(swigCPtr, this, value);
  }

  /**
   * Rejection code.
   */
  public int getStatusCode() {
    return pjsua2JNI.OnRejectedIncomingCallParam_statusCode_get(swigCPtr, this);
  }

  /**
   * Rejection text.
   */
  public void setReason(String value) {
    pjsua2JNI.OnRejectedIncomingCallParam_reason_set(swigCPtr, this, value);
  }

  /**
   * Rejection text.
   */
  public String getReason() {
    return pjsua2JNI.OnRejectedIncomingCallParam_reason_get(swigCPtr, this);
  }

  /**
   * The original INVITE message, on some cases it is not available.
   */
  public void setRdata(SipRxData value) {
    pjsua2JNI.OnRejectedIncomingCallParam_rdata_set(swigCPtr, this, SipRxData.getCPtr(value), value);
  }

  /**
   * The original INVITE message, on some cases it is not available.
   */
  public SipRxData getRdata() {
    long cPtr = pjsua2JNI.OnRejectedIncomingCallParam_rdata_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SipRxData(cPtr, false);
  }

  public OnRejectedIncomingCallParam() {
    this(pjsua2JNI.new_OnRejectedIncomingCallParam(), true);
  }

}
