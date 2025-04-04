/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.3.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

/**
 * Video window handle.
 */
public class VideoWindowHandle {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected VideoWindowHandle(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(VideoWindowHandle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(VideoWindowHandle obj) {
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
        pjsua2JNI.delete_VideoWindowHandle(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   * The window handle type.
   */
  public void setType(int value) {
    pjsua2JNI.VideoWindowHandle_type_set(swigCPtr, this, value);
  }

  /**
   * The window handle type.
   */
  public int getType() {
    return pjsua2JNI.VideoWindowHandle_type_get(swigCPtr, this);
  }

  /**
   * The window handle.
   */
  public void setHandle(WindowHandle value) {
    pjsua2JNI.VideoWindowHandle_handle_set(swigCPtr, this, WindowHandle.getCPtr(value), value);
  }

  /**
   * The window handle.
   */
  public WindowHandle getHandle() {
    long cPtr = pjsua2JNI.VideoWindowHandle_handle_get(swigCPtr, this);
    return (cPtr == 0) ? null : new WindowHandle(cPtr, false);
  }

  public VideoWindowHandle() {
    this(pjsua2JNI.new_VideoWindowHandle(), true);
  }

}
