/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.3.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

/**
 * Parameters for onMwiInfo() account callback.
 */
public class OnMwiInfoParam {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected OnMwiInfoParam(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OnMwiInfoParam obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(OnMwiInfoParam obj) {
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
        pjsua2JNI.delete_OnMwiInfoParam(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   * MWI subscription state.
   */
  public void setState(int value) {
    pjsua2JNI.OnMwiInfoParam_state_set(swigCPtr, this, value);
  }

  /**
   * MWI subscription state.
   */
  public int getState() {
    return pjsua2JNI.OnMwiInfoParam_state_get(swigCPtr, this);
  }

  /**
   * The whole message buffer.
   */
  public void setRdata(SipRxData value) {
    pjsua2JNI.OnMwiInfoParam_rdata_set(swigCPtr, this, SipRxData.getCPtr(value), value);
  }

  /**
   * The whole message buffer.
   */
  public SipRxData getRdata() {
    long cPtr = pjsua2JNI.OnMwiInfoParam_rdata_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SipRxData(cPtr, false);
  }

  public OnMwiInfoParam() {
    this(pjsua2JNI.new_OnMwiInfoParam(), true);
  }

}
