/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.3.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

/**
 * Argument to Endpoint::onNatCheckStunServersComplete() callback.
 */
public class OnNatCheckStunServersCompleteParam {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected OnNatCheckStunServersCompleteParam(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OnNatCheckStunServersCompleteParam obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(OnNatCheckStunServersCompleteParam obj) {
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
        pjsua2JNI.delete_OnNatCheckStunServersCompleteParam(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   * Arbitrary user data that was passed to Endpoint::natCheckStunServers()<br>
   * function.
   */
  public void setUserData(long value) {
    pjsua2JNI.OnNatCheckStunServersCompleteParam_userData_set(swigCPtr, this, value);
  }

  /**
   * Arbitrary user data that was passed to Endpoint::natCheckStunServers()<br>
   * function.
   */
  public long getUserData() {
    return pjsua2JNI.OnNatCheckStunServersCompleteParam_userData_get(swigCPtr, this);
  }

  /**
   * This will contain PJ_SUCCESS if at least one usable STUN server<br>
   * is found, otherwise it will contain the last error code during<br>
   * the operation.
   */
  public void setStatus(int value) {
    pjsua2JNI.OnNatCheckStunServersCompleteParam_status_set(swigCPtr, this, value);
  }

  /**
   * This will contain PJ_SUCCESS if at least one usable STUN server<br>
   * is found, otherwise it will contain the last error code during<br>
   * the operation.
   */
  public int getStatus() {
    return pjsua2JNI.OnNatCheckStunServersCompleteParam_status_get(swigCPtr, this);
  }

  /**
   * The server name that yields successful result. This will only<br>
   * contain value if status is successful.
   */
  public void setName(String value) {
    pjsua2JNI.OnNatCheckStunServersCompleteParam_name_set(swigCPtr, this, value);
  }

  /**
   * The server name that yields successful result. This will only<br>
   * contain value if status is successful.
   */
  public String getName() {
    return pjsua2JNI.OnNatCheckStunServersCompleteParam_name_get(swigCPtr, this);
  }

  /**
   * The server IP address and port in "IP:port" format. This will only<br>
   * contain value if status is successful.
   */
  public void setAddr(String value) {
    pjsua2JNI.OnNatCheckStunServersCompleteParam_addr_set(swigCPtr, this, value);
  }

  /**
   * The server IP address and port in "IP:port" format. This will only<br>
   * contain value if status is successful.
   */
  public String getAddr() {
    return pjsua2JNI.OnNatCheckStunServersCompleteParam_addr_get(swigCPtr, this);
  }

  public OnNatCheckStunServersCompleteParam() {
    this(pjsua2JNI.new_OnNatCheckStunServersCompleteParam(), true);
  }

}
