/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.3.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

/**
 * This structure describe event descriptor to fully identify a SIP event. It<br>
 * corresponds to the pjsip_event structure in PJSIP library.
 */
public class SipEvent {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SipEvent(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SipEvent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(SipEvent obj) {
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
        pjsua2JNI.delete_SipEvent(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   * The event type, can be any value of <b>pjsip_event_id_e</b>.
   */
  public void setType(int value) {
    pjsua2JNI.SipEvent_type_set(swigCPtr, this, value);
  }

  /**
   * The event type, can be any value of <b>pjsip_event_id_e</b>.
   */
  public int getType() {
    return pjsua2JNI.SipEvent_type_get(swigCPtr, this);
  }

  /**
   * The event body, which fields depends on the event type.
   */
  public void setBody(SipEventBody value) {
    pjsua2JNI.SipEvent_body_set(swigCPtr, this, SipEventBody.getCPtr(value), value);
  }

  /**
   * The event body, which fields depends on the event type.
   */
  public SipEventBody getBody() {
    long cPtr = pjsua2JNI.SipEvent_body_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SipEventBody(cPtr, false);
  }

  /**
   * Pointer to its original pjsip_event. Only valid when the struct is<br>
   * constructed from PJSIP's pjsip_event.
   */
  public void setPjEvent(long value) {
    pjsua2JNI.SipEvent_pjEvent_set(swigCPtr, this, value);
  }

  /**
   * Pointer to its original pjsip_event. Only valid when the struct is<br>
   * constructed from PJSIP's pjsip_event.
   */
  public long getPjEvent() {
    return pjsua2JNI.SipEvent_pjEvent_get(swigCPtr, this);
  }

  /**
   * Default constructor.
   */
  public SipEvent() {
    this(pjsua2JNI.new_SipEvent(), true);
  }

}
