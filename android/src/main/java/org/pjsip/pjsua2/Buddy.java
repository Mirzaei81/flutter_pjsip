/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.3.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

/**
 * Buddy. This is a lite wrapper class for PJSUA-LIB buddy, i.e: this class<br>
 * only maintains one data member, PJSUA-LIB buddy ID, and the methods are<br>
 * simply proxies for PJSUA-LIB buddy operations.<br>
 * <br>
 * Application can use create() to register a buddy to PJSUA-LIB, and<br>
 * the destructor of the original instance (i.e: the instance that calls<br>
 * create()) will unregister and delete the buddy from PJSUA-LIB. Application<br>
 * must delete all Buddy instances belong to an account before shutting down<br>
 * the account (via Account::shutdown()).<br>
 * <br>
 * The library will not keep a list of Buddy instances, so any Buddy (or<br>
 * descendant) instances instantiated by application must be maintained<br>
 * and destroyed by the application itself. Any PJSUA2 APIs that return Buddy<br>
 * instance(s) such as Account::enumBuddies2() or Account::findBuddy2() will<br>
 * just return generated copy. All Buddy methods should work normally on this<br>
 * generated copy instance.
 */
public class Buddy {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Buddy(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Buddy obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(Buddy obj) {
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
        pjsua2JNI.delete_Buddy(swigCPtr);
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
    pjsua2JNI.Buddy_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    pjsua2JNI.Buddy_change_ownership(this, swigCPtr, true);
  }

  /**
   * Constructor.
   */
  public Buddy() {
    this(pjsua2JNI.new_Buddy(), true);
    pjsua2JNI.Buddy_director_connect(this, swigCPtr, true, true);
  }

  /**
   * Create buddy and register the buddy to PJSUA-LIB.<br>
   * <br>
   * Note that application should maintain the Buddy original instance, i.e:<br>
   * the instance that calls this create() method as it is only the original<br>
   * instance destructor that will delete the underlying Buddy in PJSUA-LIB.<br>
   * <br>
   * IMPORTANT: Application must make sure that the Account instance remains<br>
   * valid for the entire lifetime of the Buddy object.<br>
   * <br>
   * @param acc               The account for this buddy.<br>
   * @param cfg               The buddy config.
   */
  public void create(Account acc, BuddyConfig cfg) throws java.lang.Exception {
    pjsua2JNI.Buddy_create(swigCPtr, this, Account.getCPtr(acc), acc, BuddyConfig.getCPtr(cfg), cfg);
  }

  /**
   * Check if this buddy is valid.<br>
   * <br>
   * @return True if it is.
   */
  public boolean isValid() {
    return pjsua2JNI.Buddy_isValid(swigCPtr, this);
  }

  /**
   * Get PJSUA-LIB buddy ID or index associated with this buddy.<br>
   * <br>
   * @return Integer greater than or equal to zero.
   */
  public int getId() {
    return pjsua2JNI.Buddy_getId(swigCPtr, this);
  }

  /**
   * Get detailed buddy info.<br>
   * <br>
   * @return Buddy info.
   */
  public BuddyInfo getInfo() throws java.lang.Exception {
    return new BuddyInfo(pjsua2JNI.Buddy_getInfo(swigCPtr, this), true);
  }

  /**
   * Enable/disable buddy's presence monitoring. Once buddy's presence is<br>
   * subscribed, application will be informed about buddy's presence status<br>
   * changed via <i>onBuddyState()</i> callback.<br>
   * <br>
   * @param subscribe         Specify true to activate presence<br>
   *                          subscription.
   */
  public void subscribePresence(boolean subscribe) throws java.lang.Exception {
    pjsua2JNI.Buddy_subscribePresence(swigCPtr, this, subscribe);
  }

  /**
   * Update the presence information for the buddy. Although the library<br>
   * periodically refreshes the presence subscription for all buddies,<br>
   * some application may want to refresh the buddy's presence subscription<br>
   * immediately, and in this case it can use this function to accomplish<br>
   * this.<br>
   * <br>
   * Note that the buddy's presence subscription will only be initiated<br>
   * if presence monitoring is enabled for the buddy. See<br>
   * subscribePresence() for more info. Also if presence subscription for<br>
   * the buddy is already active, this function will not do anything.<br>
   * <br>
   * Once the presence subscription is activated successfully for the buddy,<br>
   * application will be notified about the buddy's presence status in the<br>
   * <i>onBuddyState()</i> callback.
   */
  public void updatePresence() throws java.lang.Exception {
    pjsua2JNI.Buddy_updatePresence(swigCPtr, this);
  }

  /**
   * Enable/disable buddy's dialog event monitoring. Once buddy's dialog event<br>
   * is subscribed, application will be informed about buddy's dialog info<br>
   * status change via <i>onBuddyDlgEventState()</i> callback.<br>
   * <br>
   * Note that only one subscription (presence or dialog event) can be active<br>
   * at any time.<br>
   * <br>
   * @param subscribe     Specify non-zero to activate dialog event subscription<br>
   *                      to the specified buddy.<br>
   * <br>
   * @return PJ_SUCCESS on success, or the appropriate error code.
   */
  public void subscribeDlgEvent(boolean subscribe) throws java.lang.Exception {
    pjsua2JNI.Buddy_subscribeDlgEvent(swigCPtr, this, subscribe);
  }

  /**
   * Update the dialog event information for the buddy. Although the library<br>
   * periodically refreshes the dialog event subscription for all buddies, some<br>
   * application may want to refresh the buddy's dialog event subscription<br>
   * immediately, and in this case it can use this function to accomplish<br>
   * this.<br>
   * <br>
   * Note that the buddy's dialog event subscription will only be initiated<br>
   * if dialog event monitoring is enabled for the buddy. See<br>
   * subscribeDlgEvent() for more info. Also if dialog event<br>
   * subscription for the buddy is already active, this function will not do<br>
   * anything.<br>
   * <br>
   * Once the dialog event subscription is activated successfully for the buddy,<br>
   * application will be notified about the buddy's dialog info status in the<br>
   * onBuddyDlgEventState() callback.
   */
  public void updateDlgEvent() throws java.lang.Exception {
    pjsua2JNI.Buddy_updateDlgEvent(swigCPtr, this);
  }

  /**
   * Send instant messaging outside dialog, using this buddy's specified<br>
   * account for route set and authentication.<br>
   * <br>
   * @param prm       Sending instant message parameter.
   */
  public void sendInstantMessage(SendInstantMessageParam prm) throws java.lang.Exception {
    pjsua2JNI.Buddy_sendInstantMessage(swigCPtr, this, SendInstantMessageParam.getCPtr(prm), prm);
  }

  /**
   * Send typing indication outside dialog.<br>
   * <br>
   * @param prm       Sending instant message parameter.
   */
  public void sendTypingIndication(SendTypingIndicationParam prm) throws java.lang.Exception {
    pjsua2JNI.Buddy_sendTypingIndication(swigCPtr, this, SendTypingIndicationParam.getCPtr(prm), prm);
  }

  /**
   * Notify application when the buddy state has changed.<br>
   * Application may then query the buddy info to get the details.
   */
  public void onBuddyState() {
    if (getClass() == Buddy.class) pjsua2JNI.Buddy_onBuddyState(swigCPtr, this); else pjsua2JNI.Buddy_onBuddyStateSwigExplicitBuddy(swigCPtr, this);
  }

  /**
   * Notify application when the buddy dialog state has changed.<br>
   * Application may then query the buddy into to get the details.
   */
  public void onBuddyDlgEventState() {
    if (getClass() == Buddy.class) pjsua2JNI.Buddy_onBuddyDlgEventState(swigCPtr, this); else pjsua2JNI.Buddy_onBuddyDlgEventStateSwigExplicitBuddy(swigCPtr, this);
  }

  /**
   * Notify application when the state of client subscription session<br>
   * associated with a buddy has changed. Application may use this<br>
   * callback to retrieve more detailed information about the state<br>
   * changed event.<br>
   * <br>
   * @param prm       Callback parameter.
   */
  public void onBuddyEvSubState(OnBuddyEvSubStateParam prm) {
    if (getClass() == Buddy.class) pjsua2JNI.Buddy_onBuddyEvSubState(swigCPtr, this, OnBuddyEvSubStateParam.getCPtr(prm), prm); else pjsua2JNI.Buddy_onBuddyEvSubStateSwigExplicitBuddy(swigCPtr, this, OnBuddyEvSubStateParam.getCPtr(prm), prm);
  }

  /**
   * Notify application when the state of client subscription session<br>
   * associated with a buddy dialog state has changed. Application<br>
   * may use this callback to retrieve more detailed information about the<br>
   * state changed event.
   */
  public void onBuddyEvSubDlgEventState(OnBuddyEvSubStateParam prm) {
    if (getClass() == Buddy.class) pjsua2JNI.Buddy_onBuddyEvSubDlgEventState(swigCPtr, this, OnBuddyEvSubStateParam.getCPtr(prm), prm); else pjsua2JNI.Buddy_onBuddyEvSubDlgEventStateSwigExplicitBuddy(swigCPtr, this, OnBuddyEvSubStateParam.getCPtr(prm), prm);
  }

}
