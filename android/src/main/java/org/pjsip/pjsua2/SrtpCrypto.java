/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.3.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

/**
 * SRTP crypto.
 */
public class SrtpCrypto {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SrtpCrypto(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SrtpCrypto obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(SrtpCrypto obj) {
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
        pjsua2JNI.delete_SrtpCrypto(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   * Optional key. If empty, a random key will be autogenerated.
   */
  public void setKey(String value) {
    pjsua2JNI.SrtpCrypto_key_set(swigCPtr, this, value);
  }

  /**
   * Optional key. If empty, a random key will be autogenerated.
   */
  public String getKey() {
    return pjsua2JNI.SrtpCrypto_key_get(swigCPtr, this);
  }

  /**
   * Crypto name.
   */
  public void setName(String value) {
    pjsua2JNI.SrtpCrypto_name_set(swigCPtr, this, value);
  }

  /**
   * Crypto name.
   */
  public String getName() {
    return pjsua2JNI.SrtpCrypto_name_get(swigCPtr, this);
  }

  /**
   * Flags, bitmask from #pjmedia_srtp_crypto_option
   */
  public void setFlags(long value) {
    pjsua2JNI.SrtpCrypto_flags_set(swigCPtr, this, value);
  }

  /**
   * Flags, bitmask from #pjmedia_srtp_crypto_option
   */
  public long getFlags() {
    return pjsua2JNI.SrtpCrypto_flags_get(swigCPtr, this);
  }

  public SrtpCrypto() {
    this(pjsua2JNI.new_SrtpCrypto(), true);
  }

}
