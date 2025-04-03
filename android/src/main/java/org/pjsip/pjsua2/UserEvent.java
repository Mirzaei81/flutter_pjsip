/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.3.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

/**
 * This structure describes user event.
 */
public class UserEvent {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected UserEvent(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(UserEvent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(UserEvent obj) {
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
        pjsua2JNI.delete_UserEvent(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  User data 1.               
   */
  public void setUser1(long value) {
    pjsua2JNI.UserEvent_user1_set(swigCPtr, this, value);
  }

  /**
   *  User data 1.               
   */
  public long getUser1() {
    return pjsua2JNI.UserEvent_user1_get(swigCPtr, this);
  }

  /**
   *  User data 2.               
   */
  public void setUser2(long value) {
    pjsua2JNI.UserEvent_user2_set(swigCPtr, this, value);
  }

  /**
   *  User data 2.               
   */
  public long getUser2() {
    return pjsua2JNI.UserEvent_user2_get(swigCPtr, this);
  }

  /**
   *  User data 3.               
   */
  public void setUser3(long value) {
    pjsua2JNI.UserEvent_user3_set(swigCPtr, this, value);
  }

  /**
   *  User data 3.               
   */
  public long getUser3() {
    return pjsua2JNI.UserEvent_user3_get(swigCPtr, this);
  }

  /**
   *  User data 4.               
   */
  public void setUser4(long value) {
    pjsua2JNI.UserEvent_user4_set(swigCPtr, this, value);
  }

  /**
   *  User data 4.               
   */
  public long getUser4() {
    return pjsua2JNI.UserEvent_user4_get(swigCPtr, this);
  }

  public UserEvent() {
    this(pjsua2JNI.new_UserEvent(), true);
  }

}
