/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.3.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

/**
 * Interface for writing log messages. Applications can inherit this class<br>
 * and supply it in the LogConfig structure to implement custom log<br>
 * writing facility.
 */
public class LogWriter {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected LogWriter(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(LogWriter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(LogWriter obj) {
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
        pjsua2JNI.delete_LogWriter(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    pjsua2JNI.LogWriter_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    pjsua2JNI.LogWriter_change_ownership(this, swigCPtr, true);
  }

  /**
   *  Write a log entry. 
   */
  public void write(LogEntry entry) {
    pjsua2JNI.LogWriter_write(swigCPtr, this, LogEntry.getCPtr(entry), entry);
  }

  public LogWriter() {
    this(pjsua2JNI.new_LogWriter(), true);
    pjsua2JNI.LogWriter_director_connect(this, swigCPtr, true, true);
  }

}
