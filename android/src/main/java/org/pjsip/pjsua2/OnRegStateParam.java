/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.3.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

/**
 * This structure contains parameters for onRegState() account callback.
 */
public class OnRegStateParam {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected OnRegStateParam(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OnRegStateParam obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(OnRegStateParam obj) {
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
        pjsua2JNI.delete_OnRegStateParam(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   * Registration operation status.
   */
  public void setStatus(int value) {
    pjsua2JNI.OnRegStateParam_status_set(swigCPtr, this, value);
  }

  /**
   * Registration operation status.
   */
  public int getStatus() {
    return pjsua2JNI.OnRegStateParam_status_get(swigCPtr, this);
  }

  /**
   * SIP status code received.
   */
  public void setCode(int value) {
    pjsua2JNI.OnRegStateParam_code_set(swigCPtr, this, value);
  }

  /**
   * SIP status code received.
   */
  public int getCode() {
    return pjsua2JNI.OnRegStateParam_code_get(swigCPtr, this);
  }

  /**
   * SIP reason phrase received.
   */
  public void setReason(String value) {
    pjsua2JNI.OnRegStateParam_reason_set(swigCPtr, this, value);
  }

  /**
   * SIP reason phrase received.
   */
  public String getReason() {
    return pjsua2JNI.OnRegStateParam_reason_get(swigCPtr, this);
  }

  /**
   * The incoming message.
   */
  public void setRdata(SipRxData value) {
    pjsua2JNI.OnRegStateParam_rdata_set(swigCPtr, this, SipRxData.getCPtr(value), value);
  }

  /**
   * The incoming message.
   */
  public SipRxData getRdata() {
    long cPtr = pjsua2JNI.OnRegStateParam_rdata_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SipRxData(cPtr, false);
  }

  /**
   * Next expiration interval.
   */
  public void setExpiration(long value) {
    pjsua2JNI.OnRegStateParam_expiration_set(swigCPtr, this, value);
  }

  /**
   * Next expiration interval.
   */
  public long getExpiration() {
    return pjsua2JNI.OnRegStateParam_expiration_get(swigCPtr, this);
  }

  public OnRegStateParam() {
    this(pjsua2JNI.new_OnRegStateParam(), true);
  }

}
