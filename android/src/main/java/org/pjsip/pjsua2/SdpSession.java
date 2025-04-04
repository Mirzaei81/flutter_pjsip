/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.3.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

/**
 * This structure describes SDP session description. It corresponds to the<br>
 * pjmedia_sdp_session structure.
 */
public class SdpSession {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SdpSession(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SdpSession obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(SdpSession obj) {
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
        pjsua2JNI.delete_SdpSession(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   * The whole SDP as a string.
   */
  public void setWholeSdp(String value) {
    pjsua2JNI.SdpSession_wholeSdp_set(swigCPtr, this, value);
  }

  /**
   * The whole SDP as a string.
   */
  public String getWholeSdp() {
    return pjsua2JNI.SdpSession_wholeSdp_get(swigCPtr, this);
  }

  /**
   * Pointer to its original pjmedia_sdp_session. Only valid when the struct<br>
   * is converted from PJSIP's pjmedia_sdp_session.
   */
  public void setPjSdpSession(long value) {
    pjsua2JNI.SdpSession_pjSdpSession_set(swigCPtr, this, value);
  }

  /**
   * Pointer to its original pjmedia_sdp_session. Only valid when the struct<br>
   * is converted from PJSIP's pjmedia_sdp_session.
   */
  public long getPjSdpSession() {
    return pjsua2JNI.SdpSession_pjSdpSession_get(swigCPtr, this);
  }

  public SdpSession() {
    this(pjsua2JNI.new_SdpSession(), true);
  }

}
