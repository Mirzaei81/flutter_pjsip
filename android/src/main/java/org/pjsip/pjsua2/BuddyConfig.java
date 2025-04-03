/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.3.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

/**
 * This structure describes buddy configuration when adding a buddy to<br>
 * the buddy list with Buddy::create().
 */
public class BuddyConfig extends PersistentObject {
  private transient long swigCPtr;

  protected BuddyConfig(long cPtr, boolean cMemoryOwn) {
    super(pjsua2JNI.BuddyConfig_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BuddyConfig obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(BuddyConfig obj) {
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
        pjsua2JNI.delete_BuddyConfig(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   * Buddy URL or name address.
   */
  public void setUri(String value) {
    pjsua2JNI.BuddyConfig_uri_set(swigCPtr, this, value);
  }

  /**
   * Buddy URL or name address.
   */
  public String getUri() {
    return pjsua2JNI.BuddyConfig_uri_get(swigCPtr, this);
  }

  /**
   * Specify whether presence subscription should start immediately.
   */
  public void setSubscribe(boolean value) {
    pjsua2JNI.BuddyConfig_subscribe_set(swigCPtr, this, value);
  }

  /**
   * Specify whether presence subscription should start immediately.
   */
  public boolean getSubscribe() {
    return pjsua2JNI.BuddyConfig_subscribe_get(swigCPtr, this);
  }

  /**
   * Specify whether we should immediately subscribe to the buddy's<br>
   * dialog event, such as for Busy Lamp Field (BLF) feature.<br>
   * Note that only one subscription (presence or dialog event)<br>
   * can be active at any time.
   */
  public void setSubscribe_dlg_event(boolean value) {
    pjsua2JNI.BuddyConfig_subscribe_dlg_event_set(swigCPtr, this, value);
  }

  /**
   * Specify whether we should immediately subscribe to the buddy's<br>
   * dialog event, such as for Busy Lamp Field (BLF) feature.<br>
   * Note that only one subscription (presence or dialog event)<br>
   * can be active at any time.
   */
  public boolean getSubscribe_dlg_event() {
    return pjsua2JNI.BuddyConfig_subscribe_dlg_event_get(swigCPtr, this);
  }

  /**
   * Read this object from a container node.<br>
   * <br>
   * @param node              Container to read values from.
   */
  public void readObject(ContainerNode node) throws java.lang.Exception {
    pjsua2JNI.BuddyConfig_readObject(swigCPtr, this, ContainerNode.getCPtr(node), node);
  }

  /**
   * Write this object to a container node.<br>
   * <br>
   * @param node              Container to write values to.
   */
  public void writeObject(ContainerNode node) throws java.lang.Exception {
    pjsua2JNI.BuddyConfig_writeObject(swigCPtr, this, ContainerNode.getCPtr(node), node);
  }

  public BuddyConfig() {
    this(pjsua2JNI.new_BuddyConfig(), true);
  }

}
