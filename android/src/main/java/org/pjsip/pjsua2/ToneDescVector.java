/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.3.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class ToneDescVector extends java.util.AbstractList<ToneDesc> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ToneDescVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ToneDescVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(ToneDescVector obj) {
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
        pjsua2JNI.delete_ToneDescVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ToneDescVector(ToneDesc[] initialElements) {
    this();
    reserve(initialElements.length);

    for (ToneDesc element : initialElements) {
      add(element);
    }
  }

  public ToneDescVector(Iterable<ToneDesc> initialElements) {
    this();
    for (ToneDesc element : initialElements) {
      add(element);
    }
  }

  public ToneDesc get(int index) {
    return doGet(index);
  }

  public ToneDesc set(int index, ToneDesc e) {
    return doSet(index, e);
  }

  public boolean add(ToneDesc e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, ToneDesc e) {
    modCount++;
    doAdd(index, e);
  }

  public ToneDesc remove(int index) {
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

  public ToneDescVector() {
    this(pjsua2JNI.new_ToneDescVector__SWIG_0(), true);
  }

  public ToneDescVector(ToneDescVector other) {
    this(pjsua2JNI.new_ToneDescVector__SWIG_1(ToneDescVector.getCPtr(other), other), true);
  }

  public boolean isEmpty() {
    return pjsua2JNI.ToneDescVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    pjsua2JNI.ToneDescVector_clear(swigCPtr, this);
  }

  public ToneDescVector(int count, ToneDesc value) {
    this(pjsua2JNI.new_ToneDescVector__SWIG_2(count, ToneDesc.getCPtr(value), value), true);
  }

  private int doCapacity() {
    return pjsua2JNI.ToneDescVector_doCapacity(swigCPtr, this);
  }

  private void doReserve(int n) {
    pjsua2JNI.ToneDescVector_doReserve(swigCPtr, this, n);
  }

  private int doSize() {
    return pjsua2JNI.ToneDescVector_doSize(swigCPtr, this);
  }

  private void doAdd(ToneDesc x) {
    pjsua2JNI.ToneDescVector_doAdd__SWIG_0(swigCPtr, this, ToneDesc.getCPtr(x), x);
  }

  private void doAdd(int index, ToneDesc x) {
    pjsua2JNI.ToneDescVector_doAdd__SWIG_1(swigCPtr, this, index, ToneDesc.getCPtr(x), x);
  }

  private ToneDesc doRemove(int index) {
    return new ToneDesc(pjsua2JNI.ToneDescVector_doRemove(swigCPtr, this, index), true);
  }

  private ToneDesc doGet(int index) {
    return new ToneDesc(pjsua2JNI.ToneDescVector_doGet(swigCPtr, this, index), false);
  }

  private ToneDesc doSet(int index, ToneDesc val) {
    return new ToneDesc(pjsua2JNI.ToneDescVector_doSet(swigCPtr, this, index, ToneDesc.getCPtr(val), val), true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    pjsua2JNI.ToneDescVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
