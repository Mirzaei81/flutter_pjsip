/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.3.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

/**
 * Endpoint represents an instance of pjsua library. There can only be<br>
 * one instance of pjsua library in an application, hence this class<br>
 * is a singleton.
 */
public class Endpoint {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Endpoint(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Endpoint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(Endpoint obj) {
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
        pjsua2JNI.delete_Endpoint(swigCPtr);
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
    pjsua2JNI.Endpoint_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    pjsua2JNI.Endpoint_change_ownership(this, swigCPtr, true);
  }

  public void libDestroy(long prmFlags) throws java.lang.Exception {
    Runtime.getRuntime().gc();
    libDestroy_(prmFlags);
  }

  public void libDestroy() throws java.lang.Exception {
    Runtime.getRuntime().gc();
    libDestroy_();
  }

  /**
   *  Retrieve the singleton instance of the endpoint 
   */
  public static Endpoint instance() throws java.lang.Exception {
    return new Endpoint(pjsua2JNI.Endpoint_instance(), false);
  }

  /**
   *  Default constructor 
   */
  public Endpoint() {
    this(pjsua2JNI.new_Endpoint(), true);
    pjsua2JNI.Endpoint_director_connect(this, swigCPtr, true, true);
  }

  /**
   * Get library version.
   */
  public Version libVersion() {
    return new Version(pjsua2JNI.Endpoint_libVersion(swigCPtr, this), true);
  }

  /**
   * Instantiate pjsua application. Application must call this function before<br>
   * calling any other functions, to make sure that the underlying libraries<br>
   * are properly initialized. Once this function has returned success,<br>
   * application must call libDestroy() before quitting.
   */
  public void libCreate() throws java.lang.Exception {
    pjsua2JNI.Endpoint_libCreate(swigCPtr, this);
  }

  /**
   * Get library state.<br>
   * <br>
   * @return library state.
   */
  public int libGetState() {
    return pjsua2JNI.Endpoint_libGetState(swigCPtr, this);
  }

  /**
   * Initialize pjsua with the specified settings. All the settings are<br>
   * optional, and the default values will be used when the config is not<br>
   * specified.<br>
   * <br>
   * Note that create() MUST be called before calling this function.<br>
   * <br>
   * @param prmEpConfig       Endpoint configurations
   */
  public void libInit(EpConfig prmEpConfig) throws java.lang.Exception {
    pjsua2JNI.Endpoint_libInit(swigCPtr, this, EpConfig.getCPtr(prmEpConfig), prmEpConfig);
  }

  /**
   * Call this function after all initialization is done, so that the<br>
   * library can do additional checking set up. Application may call this<br>
   * function any time after init().
   */
  public void libStart() throws java.lang.Exception {
    pjsua2JNI.Endpoint_libStart(swigCPtr, this);
  }

  /**
   * Register a thread that was created by external or native API to the<br>
   * library. Note that each time this function is called, it will allocate<br>
   * some memory to store the thread description, which will only be freed<br>
   * when the library is destroyed.<br>
   * <br>
   * @param name      The optional name to be assigned to the thread.
   */
  public void libRegisterThread(String name) throws java.lang.Exception {
    pjsua2JNI.Endpoint_libRegisterThread(swigCPtr, this, name);
  }

  /**
   * Check if this thread has been registered to the library. Note that<br>
   * this function is only applicable for library main &amp; worker threads and<br>
   * external/native threads registered using libRegisterThread().
   */
  public boolean libIsThreadRegistered() {
    return pjsua2JNI.Endpoint_libIsThreadRegistered(swigCPtr, this);
  }

  /**
   * Stop all worker threads.
   */
  public void libStopWorkerThreads() {
    pjsua2JNI.Endpoint_libStopWorkerThreads(swigCPtr, this);
  }

  /**
   * Poll pjsua for events, and if necessary block the caller thread for<br>
   * the specified maximum interval (in miliseconds).<br>
   * <br>
   * Application doesn't normally need to call this function if it has<br>
   * configured worker thread (<i>thread_cnt</i> field) in pjsua_config<br>
   * structure, because polling then will be done by these worker threads<br>
   * instead.<br>
   * <br>
   * If EpConfig::UaConfig::mainThreadOnly is enabled and this function<br>
   * is called from the main thread (by default the main thread is thread<br>
   * that calls libCreate()), this function will also scan and run any<br>
   * pending jobs in the list.<br>
   * <br>
   * @param msec_timeout Maximum time to wait, in miliseconds.<br>
   * <br>
   * @return The number of events that have been handled during the<br>
   *                  poll. Negative value indicates error, and application<br>
   *                  can retrieve the error as (status = -return_value).
   */
  public int libHandleEvents(long msec_timeout) {
    return pjsua2JNI.Endpoint_libHandleEvents(swigCPtr, this, msec_timeout);
  }

  /**
   * Destroy pjsua. Application is recommended to perform graceful shutdown<br>
   * before calling this function (such as unregister the account from the<br>
   * SIP server, terminate presense subscription, and hangup active calls),<br>
   * however, this function will do all of these if it finds there are<br>
   * active sessions that need to be terminated. This function will<br>
   * block for few seconds to wait for replies from remote.<br>
   * <br>
   * Application.may safely call this function more than once if it doesn't<br>
   * keep track of it's state.<br>
   * <br>
   * @param prmFlags  Combination of pjsua_destroy_flag enumeration.
   */
  public void libDestroy_(long prmFlags) throws java.lang.Exception {
    pjsua2JNI.Endpoint_libDestroy___SWIG_0(swigCPtr, this, prmFlags);
  }

  /**
   * Destroy pjsua. Application is recommended to perform graceful shutdown<br>
   * before calling this function (such as unregister the account from the<br>
   * SIP server, terminate presense subscription, and hangup active calls),<br>
   * however, this function will do all of these if it finds there are<br>
   * active sessions that need to be terminated. This function will<br>
   * block for few seconds to wait for replies from remote.<br>
   * <br>
   * Application.may safely call this function more than once if it doesn't<br>
   * keep track of it's state.<br>
   * <br>
   * 
   */
  public void libDestroy_() throws java.lang.Exception {
    pjsua2JNI.Endpoint_libDestroy___SWIG_1(swigCPtr, this);
  }

  /**
   * Retrieve the error string for the specified status code.<br>
   * <br>
   * @param prmErr            The error code.
   */
  public String utilStrError(int prmErr) {
    return pjsua2JNI.Endpoint_utilStrError(swigCPtr, this, prmErr);
  }

  /**
   * Write a log message.<br>
   * <br>
   * @param prmLevel          Log verbosity level (1-5)<br>
   * @param prmSender         The log sender.<br>
   * @param prmMsg            The log message.
   */
  public void utilLogWrite(int prmLevel, String prmSender, String prmMsg) {
    pjsua2JNI.Endpoint_utilLogWrite__SWIG_0(swigCPtr, this, prmLevel, prmSender, prmMsg);
  }

  /**
   * Write a log entry.<br>
   * Application must implement its own custom LogWriter and<br>
   * this function will then call the LogWriter::write() method.<br>
   * Note that this function does not call PJSIP's internal<br>
   * logging functionality. For that, you should use<br>
   * utilLogWrite(prmLevel, prmSender, prmMsg) above.<br>
   * <br>
   * @param e                 The log entry.
   */
  public void utilLogWrite(LogEntry e) {
    pjsua2JNI.Endpoint_utilLogWrite__SWIG_1(swigCPtr, this, LogEntry.getCPtr(e), e);
  }

  /**
   * This is a utility function to verify that valid SIP url is given. If the<br>
   * URL is a valid SIP/SIPS scheme, PJ_SUCCESS will be returned.<br>
   * <br>
   * @param prmUri            The URL string.<br>
   * <br>
   * @return PJ_SUCCESS on success, or the appropriate error<br>
   *                          code.<br>
   * <br>
   * @see utilVerifyUri()
   */
  public int utilVerifySipUri(String prmUri) {
    return pjsua2JNI.Endpoint_utilVerifySipUri(swigCPtr, this, prmUri);
  }

  /**
   * This is a utility function to verify that valid URI is given. Unlike<br>
   * utilVerifySipUri(), this function will return PJ_SUCCESS if tel: URI<br>
   * is given.<br>
   * <br>
   * @param prmUri            The URL string.<br>
   * <br>
   * @return PJ_SUCCESS on success, or the appropriate error<br>
   *                          code.<br>
   * <br>
   * @see pjsua_verify_sip_url()
   */
  public int utilVerifyUri(String prmUri) {
    return pjsua2JNI.Endpoint_utilVerifyUri(swigCPtr, this, prmUri);
  }

  /**
   * Schedule a timer with the specified interval and user data. When the<br>
   * interval elapsed, onTimer() callback will be<br>
   * called. Note that the callback may be executed by different thread,<br>
   * depending on whether worker thread is enabled or not.<br>
   * <br>
   * @param prmMsecDelay      The time interval in msec.<br>
   * @param prmUserData       Arbitrary user data, to be given back to<br>
   *                          application in the callback.<br>
   * <br>
   * @return Token to identify the timer, which could be<br>
   *                          given to utilTimerCancel().
   */
  public long utilTimerSchedule(long prmMsecDelay, long prmUserData) throws java.lang.Exception {
    return pjsua2JNI.Endpoint_utilTimerSchedule(swigCPtr, this, prmMsecDelay, prmUserData);
  }

  /**
   * Cancel previously scheduled timer with the specified timer token.<br>
   * <br>
   * @param prmToken          The timer token, which was returned from<br>
   *                          previous utilTimerSchedule() call.
   */
  public void utilTimerCancel(long prmToken) {
    pjsua2JNI.Endpoint_utilTimerCancel(swigCPtr, this, prmToken);
  }

  /**
   * Get cipher list supported by SSL/TLS backend.
   */
  public IntVector utilSslGetAvailableCiphers() throws java.lang.Exception {
    return new IntVector(pjsua2JNI.Endpoint_utilSslGetAvailableCiphers(swigCPtr, this), true);
  }

  /**
   * This is a utility function to detect NAT type in front of this endpoint.<br>
   * Once invoked successfully, this function will complete asynchronously<br>
   * and report the result in onNatDetectionComplete().<br>
   * <br>
   * After NAT has been detected and the callback is called, application can<br>
   * get the detected NAT type by calling natGetType(). Application<br>
   * can also perform NAT detection by calling natDetectType()<br>
   * again at later time.<br>
   * <br>
   * Note that STUN must be enabled to run this function successfully.
   */
  public void natDetectType() throws java.lang.Exception {
    pjsua2JNI.Endpoint_natDetectType(swigCPtr, this);
  }

  /**
   * Get the NAT type as detected by natDetectType() function. This<br>
   * function will only return useful NAT type after natDetectType()<br>
   * has completed successfully and onNatDetectionComplete()<br>
   * callback has been called.<br>
   * <br>
   * Exception: if this function is called while detection is in progress,<br>
   * PJ_EPENDING exception will be raised.
   */
  public int natGetType() throws java.lang.Exception {
    return pjsua2JNI.Endpoint_natGetType(swigCPtr, this);
  }

  /**
   * Update the STUN servers list. The libInit() must have been called<br>
   * before calling this function.<br>
   * <br>
   * @param prmServers        Array of STUN servers to try. The endpoint<br>
   *                          will try to resolve and contact each of the<br>
   *                          STUN server entry until it finds one that is<br>
   *                          usable. Each entry may be a domain name, host<br>
   *                          name, IP address, and it may contain an<br>
   *                          optional port number. For example:<br>
   *                          - "pjsip.org" (domain name)<br>
   *                          - "sip.pjsip.org" (host name)<br>
   *                          - "pjsip.org:33478" (domain name and a non-<br>
   *                             standard port number)<br>
   *                          - "10.0.0.1:3478" (IP address and port number)<br>
   * @param prmWait           Specify if the function should block until<br>
   *                          it gets the result. In this case, the<br>
   *                          function will block while the resolution<br>
   *                          is being done, and the callback<br>
   *                          onNatCheckStunServersComplete() will be called<br>
   *                          before this function returns.
   */
  public void natUpdateStunServers(StringVector prmServers, boolean prmWait) throws java.lang.Exception {
    pjsua2JNI.Endpoint_natUpdateStunServers(swigCPtr, this, StringVector.getCPtr(prmServers), prmServers, prmWait);
  }

  /**
   * Auxiliary function to resolve and contact each of the STUN server<br>
   * entries (sequentially) to find which is usable. The libInit() must<br>
   * have been called before calling this function.<br>
   * <br>
   * @param prmServers        Array of STUN servers to try. The endpoint<br>
   *                          will try to resolve and contact each of the<br>
   *                          STUN server entry until it finds one that is<br>
   *                          usable. Each entry may be a domain name, host<br>
   *                          name, IP address, and it may contain an<br>
   *                          optional port number. For example:<br>
   *                          - "pjsip.org" (domain name)<br>
   *                          - "sip.pjsip.org" (host name)<br>
   *                          - "pjsip.org:33478" (domain name and a non-<br>
   *                             standard port number)<br>
   *                          - "10.0.0.1:3478" (IP address and port number)<br>
   * @param prmWait           Specify if the function should block until<br>
   *                          it gets the result. In this case, the function<br>
   *                          will block while the resolution is being done,<br>
   *                          and the callback will be called before this<br>
   *                          function returns.<br>
   * @param prmUserData       Arbitrary user data to be passed back to<br>
   *                          application in the callback.<br>
   * <br>
   * @see natCancelCheckStunServers()
   */
  public void natCheckStunServers(StringVector prmServers, boolean prmWait, long prmUserData) throws java.lang.Exception {
    pjsua2JNI.Endpoint_natCheckStunServers(swigCPtr, this, StringVector.getCPtr(prmServers), prmServers, prmWait, prmUserData);
  }

  /**
   * Cancel pending STUN resolution which match the specified token.<br>
   * <br>
   * @param token             The token to match. This token was given to<br>
   *                          natCheckStunServers()<br>
   * @param notify_cb         Boolean to control whether the callback should<br>
   *                          be called for cancelled resolutions. When the<br>
   *                          callback is called, the status in the result<br>
   *                          will be set as PJ_ECANCELLED.<br>
   * <br>
   * Exception: PJ_ENOTFOUND if there is no matching one, or other error.
   */
  public void natCancelCheckStunServers(long token, boolean notify_cb) throws java.lang.Exception {
    pjsua2JNI.Endpoint_natCancelCheckStunServers__SWIG_0(swigCPtr, this, token, notify_cb);
  }

  /**
   * Cancel pending STUN resolution which match the specified token.<br>
   * <br>
   * @param token             The token to match. This token was given to<br>
   *                          natCheckStunServers()<br>
   * <br>
   * <br>
   * Exception: PJ_ENOTFOUND if there is no matching one, or other error.
   */
  public void natCancelCheckStunServers(long token) throws java.lang.Exception {
    pjsua2JNI.Endpoint_natCancelCheckStunServers__SWIG_1(swigCPtr, this, token);
  }

  /**
   * Create and start a new SIP transport according to the specified<br>
   * settings.<br>
   * <br>
   * @param type              Transport type.<br>
   * @param cfg               Transport configuration.<br>
   * <br>
   * @return The transport ID.
   */
  public int transportCreate(int type, TransportConfig cfg) throws java.lang.Exception {
    return pjsua2JNI.Endpoint_transportCreate(swigCPtr, this, type, TransportConfig.getCPtr(cfg), cfg);
  }

  /**
   * Enumerate all transports currently created in the system. This<br>
   * function will return all transport IDs, and application may then<br>
   * call transportGetInfo() function to retrieve detailed information<br>
   * about the transport.<br>
   * <br>
   * @return Array of transport IDs.
   */
  public IntVector transportEnum() throws java.lang.Exception {
    return new IntVector(pjsua2JNI.Endpoint_transportEnum(swigCPtr, this), true);
  }

  /**
   * Get information about transport.<br>
   * <br>
   * @param id                Transport ID.<br>
   * <br>
   * @return Transport info.
   */
  public TransportInfo transportGetInfo(int id) throws java.lang.Exception {
    return new TransportInfo(pjsua2JNI.Endpoint_transportGetInfo(swigCPtr, this, id), true);
  }

  /**
   * Close the transport. The system will wait until all transactions are<br>
   * closed while preventing new users from using the transport, and will<br>
   * close the transport when its usage count reaches zero.<br>
   * <br>
   * @param id                Transport ID.
   */
  public void transportClose(int id) throws java.lang.Exception {
    pjsua2JNI.Endpoint_transportClose(swigCPtr, this, id);
  }

  /**
   * Start graceful shutdown procedure for this transport handle. After<br>
   * graceful shutdown has been initiated, no new reference can be<br>
   * obtained for the transport. However, existing objects that currently<br>
   * uses the transport may still use this transport to send and receive<br>
   * packets. After all objects release their reference to this transport,<br>
   * the transport will be destroyed immediately.<br>
   * <br>
   * Note: application normally uses this API after obtaining the handle<br>
   * from onTransportState() callback.<br>
   * <br>
   * @param tp                The transport.
   */
  public void transportShutdown(long tp) throws java.lang.Exception {
    pjsua2JNI.Endpoint_transportShutdown(swigCPtr, this, tp);
  }

  /**
   * Terminate all calls. This will initiate call hangup for all<br>
   * currently active calls.
   */
  public void hangupAllCalls() {
    pjsua2JNI.Endpoint_hangupAllCalls(swigCPtr, this);
  }

  /**
   * Add media to the media list.<br>
   * <br>
   * @param media     media to be added.
   */
  public void mediaAdd(AudioMedia media) {
    pjsua2JNI.Endpoint_mediaAdd(swigCPtr, this, AudioMedia.getCPtr(media), media);
  }

  /**
   * Remove media from the media list.<br>
   * <br>
   * @param media     media to be removed.
   */
  public void mediaRemove(AudioMedia media) {
    pjsua2JNI.Endpoint_mediaRemove(swigCPtr, this, AudioMedia.getCPtr(media), media);
  }

  /**
   * Check if media has been added to the media list.<br>
   * <br>
   * @param media     media to be check.<br>
   * <br>
   * @return True if media has been added, false otherwise.
   */
  public boolean mediaExists(AudioMedia media) {
    return pjsua2JNI.Endpoint_mediaExists(swigCPtr, this, AudioMedia.getCPtr(media), media);
  }

  /**
   * Get maximum number of media port.<br>
   * <br>
   * @return Maximum number of media port in the conference bridge.
   */
  public long mediaMaxPorts() {
    return pjsua2JNI.Endpoint_mediaMaxPorts(swigCPtr, this);
  }

  /**
   * Get current number of active media port in the bridge.<br>
   * <br>
   * @return The number of active media port.
   */
  public long mediaActivePorts() {
    return pjsua2JNI.Endpoint_mediaActivePorts(swigCPtr, this);
  }

  /**
   * Enumerate all audio media port.<br>
   * <br>
   * @return The list of audio media port.
   */
  public AudioMediaVector2 mediaEnumPorts2() throws java.lang.Exception {
    return new AudioMediaVector2(pjsua2JNI.Endpoint_mediaEnumPorts2(swigCPtr, this), true);
  }

  /**
   * Enumerate all video media port.<br>
   * <br>
   * @return The list of video media port.
   */
  public VideoMediaVector mediaEnumVidPorts() throws java.lang.Exception {
    return new VideoMediaVector(pjsua2JNI.Endpoint_mediaEnumVidPorts(swigCPtr, this), true);
  }

  /**
   * Get the instance of Audio Device Manager.<br>
   * <br>
   * @return The Audio Device Manager.
   */
  public AudDevManager audDevManager() {
    return new AudDevManager(pjsua2JNI.Endpoint_audDevManager(swigCPtr, this), false);
  }

  /**
   * Get the instance of Video Device Manager.<br>
   * <br>
   * @return The Video Device Manager.
   */
  public VidDevManager vidDevManager() {
    return new VidDevManager(pjsua2JNI.Endpoint_vidDevManager(swigCPtr, this), false);
  }

  /**
   * Enum all supported codecs in the system.<br>
   * <br>
   * @return Array of codec info.
   */
  public CodecInfoVector2 codecEnum2() throws java.lang.Exception {
    return new CodecInfoVector2(pjsua2JNI.Endpoint_codecEnum2(swigCPtr, this), true);
  }

  /**
   * Change codec priority.<br>
   * <br>
   * @param codec_id  Codec ID, which is a string that uniquely identify<br>
   *                  the codec (such as "speex/8000").<br>
   * @param priority  Codec priority, 0-255, where zero means to disable<br>
   *                  the codec.
   */
  public void codecSetPriority(String codec_id, short priority) throws java.lang.Exception {
    pjsua2JNI.Endpoint_codecSetPriority(swigCPtr, this, codec_id, priority);
  }

  /**
   * Get codec parameters.<br>
   * <br>
   * @param codec_id  Codec ID.<br>
   * <br>
   * @return Codec parameters. If codec is not found, Error<br>
   *                  will be thrown.
   */
  public CodecParam codecGetParam(String codec_id) throws java.lang.Exception {
    return new CodecParam(pjsua2JNI.Endpoint_codecGetParam(swigCPtr, this, codec_id), true);
  }

  /**
   * Set codec parameters.<br>
   * <br>
   * @param codec_id  Codec ID.<br>
   * @param param     Codec parameter to set. Set to NULL to reset<br>
   *                  codec parameter to library default settings.
   */
  public void codecSetParam(String codec_id, CodecParam param) throws java.lang.Exception {
    pjsua2JNI.Endpoint_codecSetParam(swigCPtr, this, codec_id, CodecParam.getCPtr(param), param);
  }

  /**
   * Enum all supported video codecs in the system.<br>
   * <br>
   * @return Array of video codec info.
   */
  public CodecInfoVector2 videoCodecEnum2() throws java.lang.Exception {
    return new CodecInfoVector2(pjsua2JNI.Endpoint_videoCodecEnum2(swigCPtr, this), true);
  }

  /**
   * Change video codec priority.<br>
   * <br>
   * @param codec_id  Codec ID, which is a string that uniquely identify<br>
   *                  the codec (such as "H263/90000"). Please see pjsua<br>
   *                  manual or pjmedia codec reference for details.<br>
   * @param priority  Codec priority, 0-255, where zero means to disable<br>
   *                  the codec.
   */
  public void videoCodecSetPriority(String codec_id, short priority) throws java.lang.Exception {
    pjsua2JNI.Endpoint_videoCodecSetPriority(swigCPtr, this, codec_id, priority);
  }

  /**
   * Get video codec parameters.<br>
   * <br>
   * @param codec_id  Codec ID.<br>
   * <br>
   * @return Codec parameters. If codec is not found, Error <br>
   *                  will be thrown.
   */
  public VidCodecParam getVideoCodecParam(String codec_id) throws java.lang.Exception {
    return new VidCodecParam(pjsua2JNI.Endpoint_getVideoCodecParam(swigCPtr, this, codec_id), true);
  }

  /**
   * Set video codec parameters.<br>
   * <br>
   * @param codec_id  Codec ID.<br>
   * @param param     Codec parameter to set.
   */
  public void setVideoCodecParam(String codec_id, VidCodecParam param) throws java.lang.Exception {
    pjsua2JNI.Endpoint_setVideoCodecParam(swigCPtr, this, codec_id, VidCodecParam.getCPtr(param), param);
  }

  /**
   * Reset video codec parameters to library default settings.<br>
   * <br>
   * @param codec_id  Codec ID.
   */
  public void resetVideoCodecParam(String codec_id) throws java.lang.Exception {
    pjsua2JNI.Endpoint_resetVideoCodecParam(swigCPtr, this, codec_id);
  }

  /**
   * Get codec Opus config.
   */
  public CodecOpusConfig getCodecOpusConfig() throws java.lang.Exception {
    return new CodecOpusConfig(pjsua2JNI.Endpoint_getCodecOpusConfig(swigCPtr, this), true);
  }

  /**
   * Set codec Opus config.<br>
   * <br>
   * @param opus_cfg  Codec Opus configuration.
   */
  public void setCodecOpusConfig(CodecOpusConfig opus_cfg) throws java.lang.Exception {
    pjsua2JNI.Endpoint_setCodecOpusConfig(swigCPtr, this, CodecOpusConfig.getCPtr(opus_cfg), opus_cfg);
  }

  /**
   * Get codec Lyra config.
   */
  public CodecLyraConfig getCodecLyraConfig() throws java.lang.Exception {
    return new CodecLyraConfig(pjsua2JNI.Endpoint_getCodecLyraConfig(swigCPtr, this), true);
  }

  /**
   * Set codec Lyra config.<br>
   * <br>
   * @param lyra_cfg  Codec Lyra configuration.
   */
  public void setCodecLyraConfig(CodecLyraConfig lyra_cfg) throws java.lang.Exception {
    pjsua2JNI.Endpoint_setCodecLyraConfig(swigCPtr, this, CodecLyraConfig.getCPtr(lyra_cfg), lyra_cfg);
  }

  /**
   * Enumerate all SRTP crypto-suite names.<br>
   * <br>
   * @return The list of SRTP crypto-suite name.
   */
  public StringVector srtpCryptoEnum() throws java.lang.Exception {
    return new StringVector(pjsua2JNI.Endpoint_srtpCryptoEnum(swigCPtr, this), true);
  }

  /**
   * Inform the stack that IP address change event was detected.<br>
   * The stack will:<br>
   * 1. Restart the listener (this step is configurable via<br>
   *    <i>IpChangeParam.restartListener)</i>.<br>
   * 2. Shutdown the transport used by account registration (this step is<br>
   *    configurable via <i>AccountConfig.ipChangeConfig.shutdownTp)</i>.<br>
   * 3. Update contact URI by sending re-Registration (this step is <br>
   *    configurable via a\ AccountConfig.natConfig.contactRewriteUse and<br>
   *    a\ AccountConfig.natConfig.contactRewriteMethod)<br>
   * 4. Hangup active calls (this step is configurable via<br>
   *    a\ AccountConfig.ipChangeConfig.hangupCalls) or<br>
   *    continue the call by sending re-INVITE<br>
   *    (configurable via <i>AccountConfig.ipChangeConfig.reinviteFlags)</i>.<br>
   * <br>
   * @param param     The IP change parameter, have a look at IpChangeParam.
   */
  public void handleIpChange(IpChangeParam param) throws java.lang.Exception {
    pjsua2JNI.Endpoint_handleIpChange(swigCPtr, this, IpChangeParam.getCPtr(param), param);
  }

  /**
   * Callback when the Endpoint has finished performing NAT type<br>
   * detection that is initiated with natDetectType().<br>
   * <br>
   * @param prm       Callback parameters containing the detection<br>
   *                  result.
   */
  public void onNatDetectionComplete(OnNatDetectionCompleteParam prm) {
    if (getClass() == Endpoint.class) pjsua2JNI.Endpoint_onNatDetectionComplete(swigCPtr, this, OnNatDetectionCompleteParam.getCPtr(prm), prm); else pjsua2JNI.Endpoint_onNatDetectionCompleteSwigExplicitEndpoint(swigCPtr, this, OnNatDetectionCompleteParam.getCPtr(prm), prm);
  }

  /**
   * Callback when the Endpoint has finished performing STUN server<br>
   * checking that is initiated when calling libInit(), or by<br>
   * calling natCheckStunServers() or natUpdateStunServers().<br>
   * <br>
   * @param prm       Callback parameters.
   */
  public void onNatCheckStunServersComplete(OnNatCheckStunServersCompleteParam prm) {
    if (getClass() == Endpoint.class) pjsua2JNI.Endpoint_onNatCheckStunServersComplete(swigCPtr, this, OnNatCheckStunServersCompleteParam.getCPtr(prm), prm); else pjsua2JNI.Endpoint_onNatCheckStunServersCompleteSwigExplicitEndpoint(swigCPtr, this, OnNatCheckStunServersCompleteParam.getCPtr(prm), prm);
  }

  /**
   * This callback is called when transport state has changed.<br>
   * <br>
   * @param prm       Callback parameters.
   */
  public void onTransportState(OnTransportStateParam prm) {
    if (getClass() == Endpoint.class) pjsua2JNI.Endpoint_onTransportState(swigCPtr, this, OnTransportStateParam.getCPtr(prm), prm); else pjsua2JNI.Endpoint_onTransportStateSwigExplicitEndpoint(swigCPtr, this, OnTransportStateParam.getCPtr(prm), prm);
  }

  /**
   * Callback when a timer has fired. The timer was scheduled by<br>
   * utilTimerSchedule().<br>
   * <br>
   * @param prm       Callback parameters.
   */
  public void onTimer(OnTimerParam prm) {
    if (getClass() == Endpoint.class) pjsua2JNI.Endpoint_onTimer(swigCPtr, this, OnTimerParam.getCPtr(prm), prm); else pjsua2JNI.Endpoint_onTimerSwigExplicitEndpoint(swigCPtr, this, OnTimerParam.getCPtr(prm), prm);
  }

  /**
   * This callback can be used by application to override the account<br>
   * to be used to handle an incoming message. Initially, the account to<br>
   * be used will be calculated automatically by the library. This initial<br>
   * account will be used if application does not implement this callback,<br>
   * or application sets an invalid account upon returning from this<br>
   * callback.<br>
   * <br>
   * Note that currently the incoming messages requiring account assignment<br>
   * are INVITE, MESSAGE, SUBSCRIBE, and unsolicited NOTIFY. This callback<br>
   * may be called before the callback of the SIP event itself, i.e:<br>
   * incoming call, pager, subscription, or unsolicited-event.<br>
   * <br>
   * @param prm       Callback parameters.
   */
  public void onSelectAccount(OnSelectAccountParam prm) {
    if (getClass() == Endpoint.class) pjsua2JNI.Endpoint_onSelectAccount(swigCPtr, this, OnSelectAccountParam.getCPtr(prm), prm); else pjsua2JNI.Endpoint_onSelectAccountSwigExplicitEndpoint(swigCPtr, this, OnSelectAccountParam.getCPtr(prm), prm);
  }

  /**
   * Calling #handleIpChange() may involve different operation. This <br>
   * callback is called to report the progress of each enabled operation.<br>
   * <br>
   * @param prm       Callback parameters.
   */
  public void onIpChangeProgress(OnIpChangeProgressParam prm) {
    if (getClass() == Endpoint.class) pjsua2JNI.Endpoint_onIpChangeProgress(swigCPtr, this, OnIpChangeProgressParam.getCPtr(prm), prm); else pjsua2JNI.Endpoint_onIpChangeProgressSwigExplicitEndpoint(swigCPtr, this, OnIpChangeProgressParam.getCPtr(prm), prm);
  }

  /**
   * Notification about media events such as video notifications. This<br>
   * callback will most likely be called from media threads, thus<br>
   * application must not perform heavy processing in this callback.<br>
   * If application needs to perform more complex tasks to handle the<br>
   * event, it should post the task to another thread.<br>
   * <br>
   * @param prm       Callback parameter.
   */
  public void onMediaEvent(OnMediaEventParam prm) {
    if (getClass() == Endpoint.class) pjsua2JNI.Endpoint_onMediaEvent(swigCPtr, this, OnMediaEventParam.getCPtr(prm), prm); else pjsua2JNI.Endpoint_onMediaEventSwigExplicitEndpoint(swigCPtr, this, OnMediaEventParam.getCPtr(prm), prm);
  }

  /**
   * Callback for custom computation of the digest AKA response.<br>
   * <br>
   * Usually an application does not need to implement (overload) this<br>
   * callback because by default the response digest AKA is automatically<br>
   * computed using <b>libmilenage</b>.<br>
   * <br>
   * To use Digest AKA authentication, add <i>PJSIP_CRED_DATA_EXT_AKA</i> flag<br>
   * in the AuthCredInfo's <i>dataType</i> field of the AccountConfig, and<br>
   * fill up other AKA specific information in AuthCredInfo.<br>
   * Please see <a href="#PJSIP_AUTH_AKA_API">PJSIP_AUTH_AKA_API</a> for more information.<br>
   * <br>
   * @param prm       Callback parameter.<br>
   * <br>
   * @return Return PJ_ENOTSUP to let the library compute<br>
   *                  the response digest automatically.<br>
   *                  Return PJ_SUCCESS if application does the computation<br>
   *                  and sets the response digest in<br>
   *                  <i>prm.DigestCredential.response</i>.
   */
  public int onCredAuth(OnCredAuthParam prm) {
    return (getClass() == Endpoint.class) ? pjsua2JNI.Endpoint_onCredAuth(swigCPtr, this, OnCredAuthParam.getCPtr(prm), prm) : pjsua2JNI.Endpoint_onCredAuthSwigExplicitEndpoint(swigCPtr, this, OnCredAuthParam.getCPtr(prm), prm);
  }

  /**
   * This callback will be invoked when the library implicitly rejects<br>
   * an incoming call.<br>
   * <br>
   * In addition to being declined explicitly using the Call::answer()<br>
   * method, the library may also automatically reject the incoming call<br>
   * due to different scenarios, e.g:<br>
   * - no available call slot.<br>
   * - no available account to handle the call.<br>
   * - when an incoming INVITE is received with, for instance, a message<br>
   *   containing invalid SDP.<br>
   * <br>
   * @param prm       Callback parameters.
   */
  public void onRejectedIncomingCall(OnRejectedIncomingCallParam prm) {
    if (getClass() == Endpoint.class) pjsua2JNI.Endpoint_onRejectedIncomingCall(swigCPtr, this, OnRejectedIncomingCallParam.getCPtr(prm), prm); else pjsua2JNI.Endpoint_onRejectedIncomingCallSwigExplicitEndpoint(swigCPtr, this, OnRejectedIncomingCallParam.getCPtr(prm), prm);
  }

}
