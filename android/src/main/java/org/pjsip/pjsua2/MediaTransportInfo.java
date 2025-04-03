/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.3.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

/**
 * This structure describes media transport informations. It corresponds to the<br>
 * pjmedia_transport_info structure. The address name field can be empty string<br>
 * if the address in the pjmedia_transport_info is invalid.
 */
public class MediaTransportInfo {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MediaTransportInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MediaTransportInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(MediaTransportInfo obj) {
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
        pjsua2JNI.delete_MediaTransportInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   * Address to be advertised as the local address for the RTP socket, <br>
   * which does not need to be equal as the bound address (for example, <br>
   * this address can be the address resolved with STUN).
   */
  public void setLocalRtpName(String value) {
    pjsua2JNI.MediaTransportInfo_localRtpName_set(swigCPtr, this, value);
  }

  /**
   * Address to be advertised as the local address for the RTP socket, <br>
   * which does not need to be equal as the bound address (for example, <br>
   * this address can be the address resolved with STUN).
   */
  public String getLocalRtpName() {
    return pjsua2JNI.MediaTransportInfo_localRtpName_get(swigCPtr, this);
  }

  /**
   * Address to be advertised as the local address for the RTCP socket, <br>
   * which does not need to be equal as the bound address (for example, <br>
   * this address can be the address resolved with STUN).
   */
  public void setLocalRtcpName(String value) {
    pjsua2JNI.MediaTransportInfo_localRtcpName_set(swigCPtr, this, value);
  }

  /**
   * Address to be advertised as the local address for the RTCP socket, <br>
   * which does not need to be equal as the bound address (for example, <br>
   * this address can be the address resolved with STUN).
   */
  public String getLocalRtcpName() {
    return pjsua2JNI.MediaTransportInfo_localRtcpName_get(swigCPtr, this);
  }

  /**
   * Remote address where RTP originated from. This can be empty string if <br>
   * no data is received from the remote.
   */
  public void setSrcRtpName(String value) {
    pjsua2JNI.MediaTransportInfo_srcRtpName_set(swigCPtr, this, value);
  }

  /**
   * Remote address where RTP originated from. This can be empty string if <br>
   * no data is received from the remote.
   */
  public String getSrcRtpName() {
    return pjsua2JNI.MediaTransportInfo_srcRtpName_get(swigCPtr, this);
  }

  /**
   * Remote address where RTCP originated from. This can be empty string if <br>
   * no data is recevied from the remote.
   */
  public void setSrcRtcpName(String value) {
    pjsua2JNI.MediaTransportInfo_srcRtcpName_set(swigCPtr, this, value);
  }

  /**
   * Remote address where RTCP originated from. This can be empty string if <br>
   * no data is recevied from the remote.
   */
  public String getSrcRtcpName() {
    return pjsua2JNI.MediaTransportInfo_srcRtcpName_get(swigCPtr, this);
  }

  public MediaTransportInfo() {
    this(pjsua2JNI.new_MediaTransportInfo(), true);
  }

}
