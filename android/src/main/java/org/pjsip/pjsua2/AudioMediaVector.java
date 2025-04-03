/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.3.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class AudioMediaVector extends java.util.AbstractList<AudioMedia> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected AudioMediaVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AudioMediaVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(AudioMediaVector obj) {
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
        pjsua2JNI.delete_AudioMediaVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public AudioMediaVector(AudioMedia[] initialElements) {
    this();
    reserve(initialElements.length);

    for (AudioMedia element : initialElements) {
      add(element);
    }
  }

  public AudioMediaVector(Iterable<AudioMedia> initialElements) {
    this();
    for (AudioMedia element : initialElements) {
      add(element);
    }
  }

  public AudioMedia get(int index) {
    return doGet(index);
  }

  public AudioMedia set(int index, AudioMedia e) {
    return doSet(index, e);
  }

  public boolean add(AudioMedia e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, AudioMedia e) {
    modCount++;
    doAdd(index, e);
  }

  public AudioMedia remove(int index) {
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

  public AudioMediaVector() {
    this(pjsua2JNI.new_AudioMediaVector__SWIG_0(), true);
  }

  public AudioMediaVector(AudioMediaVector other) {
    this(pjsua2JNI.new_AudioMediaVector__SWIG_1(AudioMediaVector.getCPtr(other), other), true);
  }

  public boolean isEmpty() {
    return pjsua2JNI.AudioMediaVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    pjsua2JNI.AudioMediaVector_clear(swigCPtr, this);
  }

  public AudioMediaVector(int count, AudioMedia value) {
    this(pjsua2JNI.new_AudioMediaVector__SWIG_2(count, AudioMedia.getCPtr(value), value), true);
  }

  private int doCapacity() {
    return pjsua2JNI.AudioMediaVector_doCapacity(swigCPtr, this);
  }

  private void doReserve(int n) {
    pjsua2JNI.AudioMediaVector_doReserve(swigCPtr, this, n);
  }

  private int doSize() {
    return pjsua2JNI.AudioMediaVector_doSize(swigCPtr, this);
  }

  private void doAdd(AudioMedia x) {
    pjsua2JNI.AudioMediaVector_doAdd__SWIG_0(swigCPtr, this, AudioMedia.getCPtr(x), x);
  }

  private void doAdd(int index, AudioMedia x) {
    pjsua2JNI.AudioMediaVector_doAdd__SWIG_1(swigCPtr, this, index, AudioMedia.getCPtr(x), x);
  }

  private AudioMedia doRemove(int index) {
    long cPtr = pjsua2JNI.AudioMediaVector_doRemove(swigCPtr, this, index);
    return (cPtr == 0) ? null : new AudioMedia(cPtr, false);
  }

  private AudioMedia doGet(int index) {
    long cPtr = pjsua2JNI.AudioMediaVector_doGet(swigCPtr, this, index);
    return (cPtr == 0) ? null : new AudioMedia(cPtr, false);
  }

  private AudioMedia doSet(int index, AudioMedia val) {
    long cPtr = pjsua2JNI.AudioMediaVector_doSet(swigCPtr, this, index, AudioMedia.getCPtr(val), val);
    return (cPtr == 0) ? null : new AudioMedia(cPtr, false);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    pjsua2JNI.AudioMediaVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
