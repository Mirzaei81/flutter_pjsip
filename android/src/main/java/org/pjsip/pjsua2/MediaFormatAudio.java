/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.3.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

/**
 * This structure describe detail information about an audio media.
 */
public class MediaFormatAudio extends MediaFormat {
  private transient long swigCPtr;

  protected MediaFormatAudio(long cPtr, boolean cMemoryOwn) {
    super(pjsua2JNI.MediaFormatAudio_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MediaFormatAudio obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(MediaFormatAudio obj) {
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
        pjsua2JNI.delete_MediaFormatAudio(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  Audio clock rate in samples or Hz. 
   */
  public void setClockRate(long value) {
    pjsua2JNI.MediaFormatAudio_clockRate_set(swigCPtr, this, value);
  }

  /**
   *  Audio clock rate in samples or Hz. 
   */
  public long getClockRate() {
    return pjsua2JNI.MediaFormatAudio_clockRate_get(swigCPtr, this);
  }

  /**
   *  Number of channels.                
   */
  public void setChannelCount(long value) {
    pjsua2JNI.MediaFormatAudio_channelCount_set(swigCPtr, this, value);
  }

  /**
   *  Number of channels.                
   */
  public long getChannelCount() {
    return pjsua2JNI.MediaFormatAudio_channelCount_get(swigCPtr, this);
  }

  /**
   *  Frame interval, in microseconds.   
   */
  public void setFrameTimeUsec(long value) {
    pjsua2JNI.MediaFormatAudio_frameTimeUsec_set(swigCPtr, this, value);
  }

  /**
   *  Frame interval, in microseconds.   
   */
  public long getFrameTimeUsec() {
    return pjsua2JNI.MediaFormatAudio_frameTimeUsec_get(swigCPtr, this);
  }

  /**
   *  Number of bits per sample.         
   */
  public void setBitsPerSample(long value) {
    pjsua2JNI.MediaFormatAudio_bitsPerSample_set(swigCPtr, this, value);
  }

  /**
   *  Number of bits per sample.         
   */
  public long getBitsPerSample() {
    return pjsua2JNI.MediaFormatAudio_bitsPerSample_get(swigCPtr, this);
  }

  /**
   *  Average bitrate                    
   */
  public void setAvgBps(long value) {
    pjsua2JNI.MediaFormatAudio_avgBps_set(swigCPtr, this, value);
  }

  /**
   *  Average bitrate                    
   */
  public long getAvgBps() {
    return pjsua2JNI.MediaFormatAudio_avgBps_get(swigCPtr, this);
  }

  /**
   *  Maximum bitrate                    
   */
  public void setMaxBps(long value) {
    pjsua2JNI.MediaFormatAudio_maxBps_set(swigCPtr, this, value);
  }

  /**
   *  Maximum bitrate                    
   */
  public long getMaxBps() {
    return pjsua2JNI.MediaFormatAudio_maxBps_get(swigCPtr, this);
  }

  /**
   * Default constructor
   */
  public MediaFormatAudio() {
    this(pjsua2JNI.new_MediaFormatAudio(), true);
  }

  /**
   * Initialization
   */
  public void init(long formatId, long clockRate, long channelCount, int frameTimeUsec, int bitsPerSample, long avgBps, long maxBps) {
    pjsua2JNI.MediaFormatAudio_init__SWIG_0(swigCPtr, this, formatId, clockRate, channelCount, frameTimeUsec, bitsPerSample, avgBps, maxBps);
  }

  /**
   * Initialization
   */
  public void init(long formatId, long clockRate, long channelCount, int frameTimeUsec, int bitsPerSample, long avgBps) {
    pjsua2JNI.MediaFormatAudio_init__SWIG_1(swigCPtr, this, formatId, clockRate, channelCount, frameTimeUsec, bitsPerSample, avgBps);
  }

  /**
   * Initialization
   */
  public void init(long formatId, long clockRate, long channelCount, int frameTimeUsec, int bitsPerSample) {
    pjsua2JNI.MediaFormatAudio_init__SWIG_2(swigCPtr, this, formatId, clockRate, channelCount, frameTimeUsec, bitsPerSample);
  }

}
