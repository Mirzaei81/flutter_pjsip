/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.3.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class VideoDevInfoVector extends java.util.AbstractList<VideoDevInfo> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected VideoDevInfoVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(VideoDevInfoVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(VideoDevInfoVector obj) {
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
        pjsua2JNI.delete_VideoDevInfoVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public VideoDevInfoVector(VideoDevInfo[] initialElements) {
    this();
    reserve(initialElements.length);

    for (VideoDevInfo element : initialElements) {
      add(element);
    }
  }

  public VideoDevInfoVector(Iterable<VideoDevInfo> initialElements) {
    this();
    for (VideoDevInfo element : initialElements) {
      add(element);
    }
  }

  public VideoDevInfo get(int index) {
    return doGet(index);
  }

  public VideoDevInfo set(int index, VideoDevInfo e) {
    return doSet(index, e);
  }

  public boolean add(VideoDevInfo e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, VideoDevInfo e) {
    modCount++;
    doAdd(index, e);
  }

  public VideoDevInfo remove(int index) {
    modCount++;
    return doRemove(index);
  }

  protected void removeRange(int fromIndex, int toIndex) {
    modCount++;
    doRemoveRange(fromIndex, toIndex);
  }

  public int size() {
    return doSize();
  }

  public int capacity() {
    return doCapacity();
  }

  public void reserve(int n) {
    doReserve(n);
  }

  public VideoDevInfoVector() {
    this(pjsua2JNI.new_VideoDevInfoVector__SWIG_0(), true);
  }

  public VideoDevInfoVector(VideoDevInfoVector other) {
    this(pjsua2JNI.new_VideoDevInfoVector__SWIG_1(VideoDevInfoVector.getCPtr(other), other), true);
  }

  public boolean isEmpty() {
    return pjsua2JNI.VideoDevInfoVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    pjsua2JNI.VideoDevInfoVector_clear(swigCPtr, this);
  }

  public VideoDevInfoVector(int count, VideoDevInfo value) {
    this(pjsua2JNI.new_VideoDevInfoVector__SWIG_2(count, VideoDevInfo.getCPtr(value), value), true);
  }

  private int doCapacity() {
    return pjsua2JNI.VideoDevInfoVector_doCapacity(swigCPtr, this);
  }

  private void doReserve(int n) {
    pjsua2JNI.VideoDevInfoVector_doReserve(swigCPtr, this, n);
  }

  private int doSize() {
    return pjsua2JNI.VideoDevInfoVector_doSize(swigCPtr, this);
  }

  private void doAdd(VideoDevInfo x) {
    pjsua2JNI.VideoDevInfoVector_doAdd__SWIG_0(swigCPtr, this, VideoDevInfo.getCPtr(x), x);
  }

  private void doAdd(int index, VideoDevInfo x) {
    pjsua2JNI.VideoDevInfoVector_doAdd__SWIG_1(swigCPtr, this, index, VideoDevInfo.getCPtr(x), x);
  }

  private VideoDevInfo doRemove(int index) {
    long cPtr = pjsua2JNI.VideoDevInfoVector_doRemove(swigCPtr, this, index);
    return (cPtr == 0) ? null : new VideoDevInfo(cPtr, false);
  }

  private VideoDevInfo doGet(int index) {
    long cPtr = pjsua2JNI.VideoDevInfoVector_doGet(swigCPtr, this, index);
    return (cPtr == 0) ? null : new VideoDevInfo(cPtr, false);
  }

  private VideoDevInfo doSet(int index, VideoDevInfo val) {
    long cPtr = pjsua2JNI.VideoDevInfoVector_doSet(swigCPtr, this, index, VideoDevInfo.getCPtr(val), val);
    return (cPtr == 0) ? null : new VideoDevInfo(cPtr, false);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    pjsua2JNI.VideoDevInfoVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
