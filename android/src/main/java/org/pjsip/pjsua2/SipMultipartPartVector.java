/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.3.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class SipMultipartPartVector extends java.util.AbstractList<SipMultipartPart> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SipMultipartPartVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SipMultipartPartVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(SipMultipartPartVector obj) {
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
        pjsua2JNI.delete_SipMultipartPartVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SipMultipartPartVector(SipMultipartPart[] initialElements) {
    this();
    reserve(initialElements.length);

    for (SipMultipartPart element : initialElements) {
      add(element);
    }
  }

  public SipMultipartPartVector(Iterable<SipMultipartPart> initialElements) {
    this();
    for (SipMultipartPart element : initialElements) {
      add(element);
    }
  }

  public SipMultipartPart get(int index) {
    return doGet(index);
  }

  public SipMultipartPart set(int index, SipMultipartPart e) {
    return doSet(index, e);
  }

  public boolean add(SipMultipartPart e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, SipMultipartPart e) {
    modCount++;
    doAdd(index, e);
  }

  public SipMultipartPart remove(int index) {
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

  public SipMultipartPartVector() {
    this(pjsua2JNI.new_SipMultipartPartVector__SWIG_0(), true);
  }

  public SipMultipartPartVector(SipMultipartPartVector other) {
    this(pjsua2JNI.new_SipMultipartPartVector__SWIG_1(SipMultipartPartVector.getCPtr(other), other), true);
  }

  public boolean isEmpty() {
    return pjsua2JNI.SipMultipartPartVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    pjsua2JNI.SipMultipartPartVector_clear(swigCPtr, this);
  }

  public SipMultipartPartVector(int count, SipMultipartPart value) {
    this(pjsua2JNI.new_SipMultipartPartVector__SWIG_2(count, SipMultipartPart.getCPtr(value), value), true);
  }

  private int doCapacity() {
    return pjsua2JNI.SipMultipartPartVector_doCapacity(swigCPtr, this);
  }

  private void doReserve(int n) {
    pjsua2JNI.SipMultipartPartVector_doReserve(swigCPtr, this, n);
  }

  private int doSize() {
    return pjsua2JNI.SipMultipartPartVector_doSize(swigCPtr, this);
  }

  private void doAdd(SipMultipartPart x) {
    pjsua2JNI.SipMultipartPartVector_doAdd__SWIG_0(swigCPtr, this, SipMultipartPart.getCPtr(x), x);
  }

  private void doAdd(int index, SipMultipartPart x) {
    pjsua2JNI.SipMultipartPartVector_doAdd__SWIG_1(swigCPtr, this, index, SipMultipartPart.getCPtr(x), x);
  }

  private SipMultipartPart doRemove(int index) {
    return new SipMultipartPart(pjsua2JNI.SipMultipartPartVector_doRemove(swigCPtr, this, index), true);
  }

  private SipMultipartPart doGet(int index) {
    return new SipMultipartPart(pjsua2JNI.SipMultipartPartVector_doGet(swigCPtr, this, index), false);
  }

  private SipMultipartPart doSet(int index, SipMultipartPart val) {
    return new SipMultipartPart(pjsua2JNI.SipMultipartPartVector_doSet(swigCPtr, this, index, SipMultipartPart.getCPtr(val), val), true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    pjsua2JNI.SipMultipartPartVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
