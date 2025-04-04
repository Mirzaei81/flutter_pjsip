/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.3.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

/**
 * Representation of media coordinate.
 */
public class MediaCoordinate {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MediaCoordinate(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MediaCoordinate obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(MediaCoordinate obj) {
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
        pjsua2JNI.delete_MediaCoordinate(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  X position of the coordinate 
   */
  public void setX(int value) {
    pjsua2JNI.MediaCoordinate_x_set(swigCPtr, this, value);
  }

  /**
   *  X position of the coordinate 
   */
  public int getX() {
    return pjsua2JNI.MediaCoordinate_x_get(swigCPtr, this);
  }

  /**
   *  Y position of the coordinate 
   */
  public void setY(int value) {
    pjsua2JNI.MediaCoordinate_y_set(swigCPtr, this, value);
  }

  /**
   *  Y position of the coordinate 
   */
  public int getY() {
    return pjsua2JNI.MediaCoordinate_y_get(swigCPtr, this);
  }

  public MediaCoordinate() {
    this(pjsua2JNI.new_MediaCoordinate(), true);
  }

}
