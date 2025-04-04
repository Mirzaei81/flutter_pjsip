/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.3.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

/**
 * This structure contains parameters for Account::onSendRequest() callback.
 */
public class OnSendRequestParam {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected OnSendRequestParam(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OnSendRequestParam obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(OnSendRequestParam obj) {
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
        pjsua2JNI.delete_OnSendRequestParam(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   * Token or arbitrary user data owned by the application,<br>
   * which was passed to Endpoint::sendRquest() function.
   */
  public void setUserData(long value) {
    pjsua2JNI.OnSendRequestParam_userData_set(swigCPtr, this, value);
  }

  /**
   * Token or arbitrary user data owned by the application,<br>
   * which was passed to Endpoint::sendRquest() function.
   */
  public long getUserData() {
    return pjsua2JNI.OnSendRequestParam_userData_get(swigCPtr, this);
  }

  /**
   * Transaction event that caused the state change.
   */
  public void setE(SipEvent value) {
    pjsua2JNI.OnSendRequestParam_e_set(swigCPtr, this, SipEvent.getCPtr(value), value);
  }

  /**
   * Transaction event that caused the state change.
   */
  public SipEvent getE() {
    long cPtr = pjsua2JNI.OnSendRequestParam_e_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SipEvent(cPtr, false);
  }

  public OnSendRequestParam() {
    this(pjsua2JNI.new_OnSendRequestParam(), true);
  }

}
