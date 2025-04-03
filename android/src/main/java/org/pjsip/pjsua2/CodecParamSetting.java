/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.3.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

/**
 * Audio codec parameters setting.
 */
public class CodecParamSetting {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CodecParamSetting(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CodecParamSetting obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CodecParamSetting obj) {
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
        pjsua2JNI.delete_CodecParamSetting(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Number of frames per packet.   
   */
  public void setFrmPerPkt(long value) {
    pjsua2JNI.CodecParamSetting_frmPerPkt_set(swigCPtr, this, value);
  }

  /**
   *  Number of frames per packet.   
   */
  public long getFrmPerPkt() {
    return pjsua2JNI.CodecParamSetting_frmPerPkt_get(swigCPtr, this);
  }

  /**
   *  Voice Activity Detector.       
   */
  public void setVad(boolean value) {
    pjsua2JNI.CodecParamSetting_vad_set(swigCPtr, this, value);
  }

  /**
   *  Voice Activity Detector.       
   */
  public boolean getVad() {
    return pjsua2JNI.CodecParamSetting_vad_get(swigCPtr, this);
  }

  /**
   *  Comfort Noise Generator.       
   */
  public void setCng(boolean value) {
    pjsua2JNI.CodecParamSetting_cng_set(swigCPtr, this, value);
  }

  /**
   *  Comfort Noise Generator.       
   */
  public boolean getCng() {
    return pjsua2JNI.CodecParamSetting_cng_get(swigCPtr, this);
  }

  /**
   *  Perceptual Enhancement         
   */
  public void setPenh(boolean value) {
    pjsua2JNI.CodecParamSetting_penh_set(swigCPtr, this, value);
  }

  /**
   *  Perceptual Enhancement         
   */
  public boolean getPenh() {
    return pjsua2JNI.CodecParamSetting_penh_get(swigCPtr, this);
  }

  /**
   *  Packet loss concealment        
   */
  public void setPlc(boolean value) {
    pjsua2JNI.CodecParamSetting_plc_set(swigCPtr, this, value);
  }

  /**
   *  Packet loss concealment        
   */
  public boolean getPlc() {
    return pjsua2JNI.CodecParamSetting_plc_get(swigCPtr, this);
  }

  /**
   *  Reserved, must be zero.        
   */
  public void setReserved(boolean value) {
    pjsua2JNI.CodecParamSetting_reserved_set(swigCPtr, this, value);
  }

  /**
   *  Reserved, must be zero.        
   */
  public boolean getReserved() {
    return pjsua2JNI.CodecParamSetting_reserved_get(swigCPtr, this);
  }

  /**
   *  Encoder's fmtp params.         
   */
  public void setEncFmtp(CodecFmtpVector value) {
    pjsua2JNI.CodecParamSetting_encFmtp_set(swigCPtr, this, CodecFmtpVector.getCPtr(value), value);
  }

  /**
   *  Encoder's fmtp params.         
   */
  public CodecFmtpVector getEncFmtp() {
    long cPtr = pjsua2JNI.CodecParamSetting_encFmtp_get(swigCPtr, this);
    return (cPtr == 0) ? null : new CodecFmtpVector(cPtr, false);
  }

  /**
   *  Decoder's fmtp params.         
   */
  public void setDecFmtp(CodecFmtpVector value) {
    pjsua2JNI.CodecParamSetting_decFmtp_set(swigCPtr, this, CodecFmtpVector.getCPtr(value), value);
  }

  /**
   *  Decoder's fmtp params.         
   */
  public CodecFmtpVector getDecFmtp() {
    long cPtr = pjsua2JNI.CodecParamSetting_decFmtp_get(swigCPtr, this);
    return (cPtr == 0) ? null : new CodecFmtpVector(cPtr, false);
  }

  /**
   *  Encoder's expected pkt loss %. 
   */
  public void setPacketLoss(long value) {
    pjsua2JNI.CodecParamSetting_packetLoss_set(swigCPtr, this, value);
  }

  /**
   *  Encoder's expected pkt loss %. 
   */
  public long getPacketLoss() {
    return pjsua2JNI.CodecParamSetting_packetLoss_get(swigCPtr, this);
  }

  /**
   *  Encoder complexity, 0-10(max). 
   */
  public void setComplexity(long value) {
    pjsua2JNI.CodecParamSetting_complexity_set(swigCPtr, this, value);
  }

  /**
   *  Encoder complexity, 0-10(max). 
   */
  public long getComplexity() {
    return pjsua2JNI.CodecParamSetting_complexity_get(swigCPtr, this);
  }

  /**
   *  Constant bit rate?             
   */
  public void setCbr(boolean value) {
    pjsua2JNI.CodecParamSetting_cbr_set(swigCPtr, this, value);
  }

  /**
   *  Constant bit rate?             
   */
  public boolean getCbr() {
    return pjsua2JNI.CodecParamSetting_cbr_get(swigCPtr, this);
  }

  public CodecParamSetting() {
    this(pjsua2JNI.new_CodecParamSetting(), true);
  }

}
