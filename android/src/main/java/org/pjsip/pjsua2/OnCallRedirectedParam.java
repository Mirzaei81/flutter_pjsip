/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.3.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

/**
 * This structure contains parameters for Call::onCallRedirected() callback.
 */
public class OnCallRedirectedParam {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected OnCallRedirectedParam(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OnCallRedirectedParam obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(OnCallRedirectedParam obj) {
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
        pjsua2JNI.delete_OnCallRedirectedParam(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   * The current target to be tried.
   */
  public void setTargetUri(String value) {
    pjsua2JNI.OnCallRedirectedParam_targetUri_set(swigCPtr, this, value);
  }

  /**
   * The current target to be tried.
   */
  public String getTargetUri() {
    return pjsua2JNI.OnCallRedirectedParam_targetUri_get(swigCPtr, this);
  }

  /**
   * The event that caused this callback to be called.<br>
   * This could be the receipt of 3xx response, or 4xx/5xx response<br>
   * received for the INVITE sent to subsequent targets, or empty<br>
   * (e.type == PJSIP_EVENT_UNKNOWN) if this callback is called from <br>
   * within Call::processRedirect() context.
   */
  public void setE(SipEvent value) {
    pjsua2JNI.OnCallRedirectedParam_e_set(swigCPtr, this, SipEvent.getCPtr(value), value);
  }

  /**
   * The event that caused this callback to be called.<br>
   * This could be the receipt of 3xx response, or 4xx/5xx response<br>
   * received for the INVITE sent to subsequent targets, or empty<br>
   * (e.type == PJSIP_EVENT_UNKNOWN) if this callback is called from <br>
   * within Call::processRedirect() context.
   */
  public SipEvent getE() {
    long cPtr = pjsua2JNI.OnCallRedirectedParam_e_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SipEvent(cPtr, false);
  }

  public OnCallRedirectedParam() {
    this(pjsua2JNI.new_OnCallRedirectedParam(), true);
  }

}
