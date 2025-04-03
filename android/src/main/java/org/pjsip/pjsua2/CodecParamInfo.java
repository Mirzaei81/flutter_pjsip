/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.3.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

/**
 * Audio codec parameters info.
 */
public class CodecParamInfo {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CodecParamInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CodecParamInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CodecParamInfo obj) {
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
        pjsua2JNI.delete_CodecParamInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Sampling rate in Hz            
   */
  public void setClockRate(long value) {
    pjsua2JNI.CodecParamInfo_clockRate_set(swigCPtr, this, value);
  }

  /**
   *  Sampling rate in Hz            
   */
  public long getClockRate() {
    return pjsua2JNI.CodecParamInfo_clockRate_get(swigCPtr, this);
  }

  /**
   *  Channel count.                 
   */
  public void setChannelCnt(long value) {
    pjsua2JNI.CodecParamInfo_channelCnt_set(swigCPtr, this, value);
  }

  /**
   *  Channel count.                 
   */
  public long getChannelCnt() {
    return pjsua2JNI.CodecParamInfo_channelCnt_get(swigCPtr, this);
  }

  /**
   *  Average bandwidth in bits/sec  
   */
  public void setAvgBps(long value) {
    pjsua2JNI.CodecParamInfo_avgBps_set(swigCPtr, this, value);
  }

  /**
   *  Average bandwidth in bits/sec  
   */
  public long getAvgBps() {
    return pjsua2JNI.CodecParamInfo_avgBps_get(swigCPtr, this);
  }

  /**
   *  Maximum bandwidth in bits/sec  
   */
  public void setMaxBps(long value) {
    pjsua2JNI.CodecParamInfo_maxBps_set(swigCPtr, this, value);
  }

  /**
   *  Maximum bandwidth in bits/sec  
   */
  public long getMaxBps() {
    return pjsua2JNI.CodecParamInfo_maxBps_get(swigCPtr, this);
  }

  /**
   *  Maximum frame size             
   */
  public void setMaxRxFrameSize(long value) {
    pjsua2JNI.CodecParamInfo_maxRxFrameSize_set(swigCPtr, this, value);
  }

  /**
   *  Maximum frame size             
   */
  public long getMaxRxFrameSize() {
    return pjsua2JNI.CodecParamInfo_maxRxFrameSize_get(swigCPtr, this);
  }

  /**
   *  Decoder frame ptime in msec.   
   */
  public void setFrameLen(long value) {
    pjsua2JNI.CodecParamInfo_frameLen_set(swigCPtr, this, value);
  }

  /**
   *  Decoder frame ptime in msec.   
   */
  public long getFrameLen() {
    return pjsua2JNI.CodecParamInfo_frameLen_get(swigCPtr, this);
  }

  /**
   *  Decoder frame ptime denum, or<br>
   *                                              zero if ptime is integer.      
   */
  public void setFrameLenDenum(long value) {
    pjsua2JNI.CodecParamInfo_frameLenDenum_set(swigCPtr, this, value);
  }

  /**
   *  Decoder frame ptime denum, or<br>
   *                                              zero if ptime is integer.      
   */
  public long getFrameLenDenum() {
    return pjsua2JNI.CodecParamInfo_frameLenDenum_get(swigCPtr, this);
  }

  /**
   *  Encoder ptime, or zero if it's<br>
   *                                              equal to decoder ptime.        
   */
  public void setEncFrameLen(long value) {
    pjsua2JNI.CodecParamInfo_encFrameLen_set(swigCPtr, this, value);
  }

  /**
   *  Encoder ptime, or zero if it's<br>
   *                                              equal to decoder ptime.        
   */
  public long getEncFrameLen() {
    return pjsua2JNI.CodecParamInfo_encFrameLen_get(swigCPtr, this);
  }

  /**
   *  Encoder ptime denum, or zero<br>
   *                                              if ptime is integer.           
   */
  public void setEncFrameLenDenum(long value) {
    pjsua2JNI.CodecParamInfo_encFrameLenDenum_set(swigCPtr, this, value);
  }

  /**
   *  Encoder ptime denum, or zero<br>
   *                                              if ptime is integer.           
   */
  public long getEncFrameLenDenum() {
    return pjsua2JNI.CodecParamInfo_encFrameLenDenum_get(swigCPtr, this);
  }

  /**
   *  Bits/sample in the PCM side    
   */
  public void setPcmBitsPerSample(long value) {
    pjsua2JNI.CodecParamInfo_pcmBitsPerSample_set(swigCPtr, this, value);
  }

  /**
   *  Bits/sample in the PCM side    
   */
  public long getPcmBitsPerSample() {
    return pjsua2JNI.CodecParamInfo_pcmBitsPerSample_get(swigCPtr, this);
  }

  /**
   *  Payload type.                  
   */
  public void setPt(long value) {
    pjsua2JNI.CodecParamInfo_pt_set(swigCPtr, this, value);
  }

  /**
   *  Payload type.                  
   */
  public long getPt() {
    return pjsua2JNI.CodecParamInfo_pt_get(swigCPtr, this);
  }

  /**
   *  Source format, it's format of<br>
   *                                              encoder input and decoder<br>
   *                                              output.                        
   */
  public void setFmtId(int value) {
    pjsua2JNI.CodecParamInfo_fmtId_set(swigCPtr, this, value);
  }

  /**
   *  Source format, it's format of<br>
   *                                              encoder input and decoder<br>
   *                                              output.                        
   */
  public int getFmtId() {
    return pjsua2JNI.CodecParamInfo_fmtId_get(swigCPtr, this);
  }

  /**
   * Default constructor
   */
  public CodecParamInfo() {
    this(pjsua2JNI.new_CodecParamInfo(), true);
  }

}
