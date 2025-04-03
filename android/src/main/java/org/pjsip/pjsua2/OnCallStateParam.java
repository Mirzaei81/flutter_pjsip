/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.3.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

/**
 * This structure contains parameters for Call::onCallState() callback.
 */
public class OnCallStateParam {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected OnCallStateParam(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OnCallStateParam obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(OnCallStateParam obj) {
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
        pjsua2JNI.delete_OnCallStateParam(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   * Event which causes the call state to change.
   */
  public void setE(SipEvent value) {
    pjsua2JNI.OnCallStateParam_e_set(swigCPtr, this, SipEvent.getCPtr(value), value);
  }

  /**
   * Event which causes the call state to change.
   */
  public SipEvent getE() {
    long cPtr = pjsua2JNI.OnCallStateParam_e_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SipEvent(cPtr, false);
  }

  public OnCallStateParam() {
    this(pjsua2JNI.new_OnCallStateParam(), true);
  }

}
