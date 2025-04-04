/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.3.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class SslCertNameVector extends java.util.AbstractList<SslCertName> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SslCertNameVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SslCertNameVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(SslCertNameVector obj) {
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
        pjsua2JNI.delete_SslCertNameVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SslCertNameVector(SslCertName[] initialElements) {
    this();
    reserve(initialElements.length);

    for (SslCertName element : initialElements) {
      add(element);
    }
  }

  public SslCertNameVector(Iterable<SslCertName> initialElements) {
    this();
    for (SslCertName element : initialElements) {
      add(element);
    }
  }

  public SslCertName get(int index) {
    return doGet(index);
  }

  public SslCertName set(int index, SslCertName e) {
    return doSet(index, e);
  }

  public boolean add(SslCertName e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, SslCertName e) {
    modCount++;
    doAdd(index, e);
  }

  public SslCertName remove(int index) {
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

  public SslCertNameVector() {
    this(pjsua2JNI.new_SslCertNameVector__SWIG_0(), true);
  }

  public SslCertNameVector(SslCertNameVector other) {
    this(pjsua2JNI.new_SslCertNameVector__SWIG_1(SslCertNameVector.getCPtr(other), other), true);
  }

  public boolean isEmpty() {
    return pjsua2JNI.SslCertNameVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    pjsua2JNI.SslCertNameVector_clear(swigCPtr, this);
  }

  public SslCertNameVector(int count, SslCertName value) {
    this(pjsua2JNI.new_SslCertNameVector__SWIG_2(count, SslCertName.getCPtr(value), value), true);
  }

  private int doCapacity() {
    return pjsua2JNI.SslCertNameVector_doCapacity(swigCPtr, this);
  }

  private void doReserve(int n) {
    pjsua2JNI.SslCertNameVector_doReserve(swigCPtr, this, n);
  }

  private int doSize() {
    return pjsua2JNI.SslCertNameVector_doSize(swigCPtr, this);
  }

  private void doAdd(SslCertName x) {
    pjsua2JNI.SslCertNameVector_doAdd__SWIG_0(swigCPtr, this, SslCertName.getCPtr(x), x);
  }

  private void doAdd(int index, SslCertName x) {
    pjsua2JNI.SslCertNameVector_doAdd__SWIG_1(swigCPtr, this, index, SslCertName.getCPtr(x), x);
  }

  private SslCertName doRemove(int index) {
    return new SslCertName(pjsua2JNI.SslCertNameVector_doRemove(swigCPtr, this, index), true);
  }

  private SslCertName doGet(int index) {
    return new SslCertName(pjsua2JNI.SslCertNameVector_doGet(swigCPtr, this, index), false);
  }

  private SslCertName doSet(int index, SslCertName val) {
    return new SslCertName(pjsua2JNI.SslCertNameVector_doSet(swigCPtr, this, index, SslCertName.getCPtr(val), val), true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    pjsua2JNI.SslCertNameVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
