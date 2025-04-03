/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.3.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

/**
 * Parameter for switching device with PJMEDIA_VID_DEV_CAP_SWITCH capability.
 */
public class VideoSwitchParam {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected VideoSwitchParam(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(VideoSwitchParam obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(VideoSwitchParam obj) {
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
        pjsua2JNI.delete_VideoSwitchParam(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   * Target device ID to switch to. Once the switching is successful, the<br>
   * video stream will use this device and the old device will be closed.
   */
  public void setTarget_id(int value) {
    pjsua2JNI.VideoSwitchParam_target_id_set(swigCPtr, this, value);
  }

  /**
   * Target device ID to switch to. Once the switching is successful, the<br>
   * video stream will use this device and the old device will be closed.
   */
  public int getTarget_id() {
    return pjsua2JNI.VideoSwitchParam_target_id_get(swigCPtr, this);
  }

  public VideoSwitchParam() {
    this(pjsua2JNI.new_VideoSwitchParam(), true);
  }

}
