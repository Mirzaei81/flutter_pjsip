/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.3.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

/**
 * Tone digit (abstraction for pjmedia_tone_digit)
 */
public class ToneDigit extends pjmedia_tone_digit {
  private transient long swigCPtr;

  protected ToneDigit(long cPtr, boolean cMemoryOwn) {
    super(pjsua2JNI.ToneDigit_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ToneDigit obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(ToneDigit obj) {
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
        pjsua2JNI.delete_ToneDigit(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ToneDigit() {
    this(pjsua2JNI.new_ToneDigit(), true);
  }

}
