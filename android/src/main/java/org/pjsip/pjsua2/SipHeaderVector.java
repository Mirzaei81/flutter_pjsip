/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.3.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class SipHeaderVector extends java.util.AbstractList<SipHeader> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SipHeaderVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SipHeaderVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(SipHeaderVector obj) {
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
        pjsua2JNI.delete_SipHeaderVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SipHeaderVector(SipHeader[] initialElements) {
    this();
    reserve(initialElements.length);

    for (SipHeader element : initialElements) {
      add(element);
    }
  }

  public SipHeaderVector(Iterable<SipHeader> initialElements) {
    this();
    for (SipHeader element : initialElements) {
      add(element);
    }
  }

  public SipHeader get(int index) {
    return doGet(index);
  }

  public SipHeader set(int index, SipHeader e) {
    return doSet(index, e);
  }

  public boolean add(SipHeader e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, SipHeader e) {
    modCount++;
    doAdd(index, e);
  }

  public SipHeader remove(int index) {
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

  public SipHeaderVector() {
    this(pjsua2JNI.new_SipHeaderVector__SWIG_0(), true);
  }

  public SipHeaderVector(SipHeaderVector other) {
    this(pjsua2JNI.new_SipHeaderVector__SWIG_1(SipHeaderVector.getCPtr(other), other), true);
  }

  public boolean isEmpty() {
    return pjsua2JNI.SipHeaderVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    pjsua2JNI.SipHeaderVector_clear(swigCPtr, this);
  }

  public SipHeaderVector(int count, SipHeader value) {
    this(pjsua2JNI.new_SipHeaderVector__SWIG_2(count, SipHeader.getCPtr(value), value), true);
  }

  private int doCapacity() {
    return pjsua2JNI.SipHeaderVector_doCapacity(swigCPtr, this);
  }

  private void doReserve(int n) {
    pjsua2JNI.SipHeaderVector_doReserve(swigCPtr, this, n);
  }

  private int doSize() {
    return pjsua2JNI.SipHeaderVector_doSize(swigCPtr, this);
  }

  private void doAdd(SipHeader x) {
    pjsua2JNI.SipHeaderVector_doAdd__SWIG_0(swigCPtr, this, SipHeader.getCPtr(x), x);
  }

  private void doAdd(int index, SipHeader x) {
    pjsua2JNI.SipHeaderVector_doAdd__SWIG_1(swigCPtr, this, index, SipHeader.getCPtr(x), x);
  }

  private SipHeader doRemove(int index) {
    return new SipHeader(pjsua2JNI.SipHeaderVector_doRemove(swigCPtr, this, index), true);
  }

  private SipHeader doGet(int index) {
    return new SipHeader(pjsua2JNI.SipHeaderVector_doGet(swigCPtr, this, index), false);
  }

  private SipHeader doSet(int index, SipHeader val) {
    return new SipHeader(pjsua2JNI.SipHeaderVector_doSet(swigCPtr, this, index, SipHeader.getCPtr(val), val), true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    pjsua2JNI.SipHeaderVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
