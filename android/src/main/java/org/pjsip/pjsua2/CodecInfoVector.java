/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.3.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class CodecInfoVector extends java.util.AbstractList<CodecInfo> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CodecInfoVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CodecInfoVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CodecInfoVector obj) {
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
        pjsua2JNI.delete_CodecInfoVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CodecInfoVector(CodecInfo[] initialElements) {
    this();
    reserve(initialElements.length);

    for (CodecInfo element : initialElements) {
      add(element);
    }
  }

  public CodecInfoVector(Iterable<CodecInfo> initialElements) {
    this();
    for (CodecInfo element : initialElements) {
      add(element);
    }
  }

  public CodecInfo get(int index) {
    return doGet(index);
  }

  public CodecInfo set(int index, CodecInfo e) {
    return doSet(index, e);
  }

  public boolean add(CodecInfo e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, CodecInfo e) {
    modCount++;
    doAdd(index, e);
  }

  public CodecInfo remove(int index) {
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

  public CodecInfoVector() {
    this(pjsua2JNI.new_CodecInfoVector__SWIG_0(), true);
  }

  public CodecInfoVector(CodecInfoVector other) {
    this(pjsua2JNI.new_CodecInfoVector__SWIG_1(CodecInfoVector.getCPtr(other), other), true);
  }

  public boolean isEmpty() {
    return pjsua2JNI.CodecInfoVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    pjsua2JNI.CodecInfoVector_clear(swigCPtr, this);
  }

  public CodecInfoVector(int count, CodecInfo value) {
    this(pjsua2JNI.new_CodecInfoVector__SWIG_2(count, CodecInfo.getCPtr(value), value), true);
  }

  private int doCapacity() {
    return pjsua2JNI.CodecInfoVector_doCapacity(swigCPtr, this);
  }

  private void doReserve(int n) {
    pjsua2JNI.CodecInfoVector_doReserve(swigCPtr, this, n);
  }

  private int doSize() {
    return pjsua2JNI.CodecInfoVector_doSize(swigCPtr, this);
  }

  private void doAdd(CodecInfo x) {
    pjsua2JNI.CodecInfoVector_doAdd__SWIG_0(swigCPtr, this, CodecInfo.getCPtr(x), x);
  }

  private void doAdd(int index, CodecInfo x) {
    pjsua2JNI.CodecInfoVector_doAdd__SWIG_1(swigCPtr, this, index, CodecInfo.getCPtr(x), x);
  }

  private CodecInfo doRemove(int index) {
    long cPtr = pjsua2JNI.CodecInfoVector_doRemove(swigCPtr, this, index);
    return (cPtr == 0) ? null : new CodecInfo(cPtr, false);
  }

  private CodecInfo doGet(int index) {
    long cPtr = pjsua2JNI.CodecInfoVector_doGet(swigCPtr, this, index);
    return (cPtr == 0) ? null : new CodecInfo(cPtr, false);
  }

  private CodecInfo doSet(int index, CodecInfo val) {
    long cPtr = pjsua2JNI.CodecInfoVector_doSet(swigCPtr, this, index, CodecInfo.getCPtr(val), val);
    return (cPtr == 0) ? null : new CodecInfo(cPtr, false);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    pjsua2JNI.CodecInfoVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
