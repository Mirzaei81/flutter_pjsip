/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.3.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

/**
 * This structure contains parameters for Call::onCallMediaEvent() callback.
 */
public class OnCallMediaEventParam {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected OnCallMediaEventParam(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OnCallMediaEventParam obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(OnCallMediaEventParam obj) {
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
        pjsua2JNI.delete_OnCallMediaEventParam(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   * The media stream index.
   */
  public void setMedIdx(long value) {
    pjsua2JNI.OnCallMediaEventParam_medIdx_set(swigCPtr, this, value);
  }

  /**
   * The media stream index.
   */
  public long getMedIdx() {
    return pjsua2JNI.OnCallMediaEventParam_medIdx_get(swigCPtr, this);
  }

  /**
   * The media event.
   */
  public void setEv(MediaEvent value) {
    pjsua2JNI.OnCallMediaEventParam_ev_set(swigCPtr, this, MediaEvent.getCPtr(value), value);
  }

  /**
   * The media event.
   */
  public MediaEvent getEv() {
    long cPtr = pjsua2JNI.OnCallMediaEventParam_ev_get(swigCPtr, this);
    return (cPtr == 0) ? null : new MediaEvent(cPtr, false);
  }

  public OnCallMediaEventParam() {
    this(pjsua2JNI.new_OnCallMediaEventParam(), true);
  }

}
