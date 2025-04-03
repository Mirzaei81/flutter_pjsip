/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.3.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

/**
 * TLS transport settings, to be specified in TransportConfig.
 */
public class TlsConfig extends PersistentObject {
  private transient long swigCPtr;

  protected TlsConfig(long cPtr, boolean cMemoryOwn) {
    super(pjsua2JNI.TlsConfig_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TlsConfig obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(TlsConfig obj) {
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
        pjsua2JNI.delete_TlsConfig(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   * Certificate of Authority (CA) list file.
   */
  public void setCaListFile(String value) {
    pjsua2JNI.TlsConfig_CaListFile_set(swigCPtr, this, value);
  }

  /**
   * Certificate of Authority (CA) list file.
   */
  public String getCaListFile() {
    return pjsua2JNI.TlsConfig_CaListFile_get(swigCPtr, this);
  }

  /**
   * Public endpoint certificate file, which will be used as client-<br>
   * side  certificate for outgoing TLS connection, and server-side<br>
   * certificate for incoming TLS connection.
   */
  public void setCertFile(String value) {
    pjsua2JNI.TlsConfig_certFile_set(swigCPtr, this, value);
  }

  /**
   * Public endpoint certificate file, which will be used as client-<br>
   * side  certificate for outgoing TLS connection, and server-side<br>
   * certificate for incoming TLS connection.
   */
  public String getCertFile() {
    return pjsua2JNI.TlsConfig_certFile_get(swigCPtr, this);
  }

  /**
   * Optional private key of the endpoint certificate to be used.
   */
  public void setPrivKeyFile(String value) {
    pjsua2JNI.TlsConfig_privKeyFile_set(swigCPtr, this, value);
  }

  /**
   * Optional private key of the endpoint certificate to be used.
   */
  public String getPrivKeyFile() {
    return pjsua2JNI.TlsConfig_privKeyFile_get(swigCPtr, this);
  }

  /**
   * Password to open private key.
   */
  public void setPassword(String value) {
    pjsua2JNI.TlsConfig_password_set(swigCPtr, this, value);
  }

  /**
   * Password to open private key.
   */
  public String getPassword() {
    return pjsua2JNI.TlsConfig_password_get(swigCPtr, this);
  }

  /**
   * Certificate of Authority (CA) buffer. If CaListFile, certFile or<br>
   * privKeyFile are set, this setting will be ignored.
   */
  public void setCaBuf(String value) {
    pjsua2JNI.TlsConfig_CaBuf_set(swigCPtr, this, value);
  }

  /**
   * Certificate of Authority (CA) buffer. If CaListFile, certFile or<br>
   * privKeyFile are set, this setting will be ignored.
   */
  public String getCaBuf() {
    return pjsua2JNI.TlsConfig_CaBuf_get(swigCPtr, this);
  }

  /**
   * Public endpoint certificate buffer, which will be used as client-<br>
   * side  certificate for outgoing TLS connection, and server-side<br>
   * certificate for incoming TLS connection. If CaListFile, certFile or<br>
   * privKeyFile are set, this setting will be ignored.
   */
  public void setCertBuf(String value) {
    pjsua2JNI.TlsConfig_certBuf_set(swigCPtr, this, value);
  }

  /**
   * Public endpoint certificate buffer, which will be used as client-<br>
   * side  certificate for outgoing TLS connection, and server-side<br>
   * certificate for incoming TLS connection. If CaListFile, certFile or<br>
   * privKeyFile are set, this setting will be ignored.
   */
  public String getCertBuf() {
    return pjsua2JNI.TlsConfig_certBuf_get(swigCPtr, this);
  }

  /**
   * Optional private key buffer of the endpoint certificate to be used. <br>
   * If CaListFile, certFile or privKeyFile are set, this setting will <br>
   * be ignored.
   */
  public void setPrivKeyBuf(String value) {
    pjsua2JNI.TlsConfig_privKeyBuf_set(swigCPtr, this, value);
  }

  /**
   * Optional private key buffer of the endpoint certificate to be used. <br>
   * If CaListFile, certFile or privKeyFile are set, this setting will <br>
   * be ignored.
   */
  public String getPrivKeyBuf() {
    return pjsua2JNI.TlsConfig_privKeyBuf_get(swigCPtr, this);
  }

  /**
   * Lookup certificate from OS certificate store, this setting will<br>
   * specify the field type to lookup.<br>
   * <br>
   * Currently only used by Windows Schannel backend, see also<br>
   * <i>pj_ssl_cert_load_from_store()</i> for more info.
   */
  public void setCertLookupType(int value) {
    pjsua2JNI.TlsConfig_certLookupType_set(swigCPtr, this, value);
  }

  /**
   * Lookup certificate from OS certificate store, this setting will<br>
   * specify the field type to lookup.<br>
   * <br>
   * Currently only used by Windows Schannel backend, see also<br>
   * <i>pj_ssl_cert_load_from_store()</i> for more info.
   */
  public int getCertLookupType() {
    return pjsua2JNI.TlsConfig_certLookupType_get(swigCPtr, this);
  }

  /**
   * Lookup certificate from OS certificate store, this setting will<br>
   * specify the keyword to match on the field specified in<br>
   * <i>certLookupType</i> above.<br>
   * <br>
   * Currently only used by Windows Schannel backend, see also<br>
   * <i>pj_ssl_cert_load_from_store()</i> for more info.
   */
  public void setCertLookupKeyword(String value) {
    pjsua2JNI.TlsConfig_certLookupKeyword_set(swigCPtr, this, value);
  }

  /**
   * Lookup certificate from OS certificate store, this setting will<br>
   * specify the keyword to match on the field specified in<br>
   * <i>certLookupType</i> above.<br>
   * <br>
   * Currently only used by Windows Schannel backend, see also<br>
   * <i>pj_ssl_cert_load_from_store()</i> for more info.
   */
  public String getCertLookupKeyword() {
    return pjsua2JNI.TlsConfig_certLookupKeyword_get(swigCPtr, this);
  }

  /**
   * TLS protocol method from #pjsip_ssl_method. In the future, this field<br>
   * might be deprecated in favor of <b>proto</b> field. For now, this field <br>
   * is only applicable only when <b>proto</b> field is set to zero.<br>
   * <br>
   * Default is PJSIP_SSL_UNSPECIFIED_METHOD (0), which in turn will<br>
   * use PJSIP_SSL_DEFAULT_METHOD, which default value is PJSIP_TLSV1_METHOD.
   */
  public void setMethod(int value) {
    pjsua2JNI.TlsConfig_method_set(swigCPtr, this, value);
  }

  /**
   * TLS protocol method from #pjsip_ssl_method. In the future, this field<br>
   * might be deprecated in favor of <b>proto</b> field. For now, this field <br>
   * is only applicable only when <b>proto</b> field is set to zero.<br>
   * <br>
   * Default is PJSIP_SSL_UNSPECIFIED_METHOD (0), which in turn will<br>
   * use PJSIP_SSL_DEFAULT_METHOD, which default value is PJSIP_TLSV1_METHOD.
   */
  public int getMethod() {
    return pjsua2JNI.TlsConfig_method_get(swigCPtr, this);
  }

  /**
   * TLS protocol type from #pj_ssl_sock_proto. Use this field to enable <br>
   * specific protocol type. Use bitwise OR operation to combine the protocol <br>
   * type.<br>
   * <br>
   * Default is PJSIP_SSL_DEFAULT_PROTO.
   */
  public void setProto(long value) {
    pjsua2JNI.TlsConfig_proto_set(swigCPtr, this, value);
  }

  /**
   * TLS protocol type from #pj_ssl_sock_proto. Use this field to enable <br>
   * specific protocol type. Use bitwise OR operation to combine the protocol <br>
   * type.<br>
   * <br>
   * Default is PJSIP_SSL_DEFAULT_PROTO.
   */
  public long getProto() {
    return pjsua2JNI.TlsConfig_proto_get(swigCPtr, this);
  }

  /**
   * Ciphers and order preference. The Endpoint::utilSslGetAvailableCiphers()<br>
   * can be used to check the available ciphers supported by backend.<br>
   * If the array is empty, then default cipher list of the backend<br>
   * will be used.
   */
  public void setCiphers(IntVector value) {
    pjsua2JNI.TlsConfig_ciphers_set(swigCPtr, this, IntVector.getCPtr(value), value);
  }

  /**
   * Ciphers and order preference. The Endpoint::utilSslGetAvailableCiphers()<br>
   * can be used to check the available ciphers supported by backend.<br>
   * If the array is empty, then default cipher list of the backend<br>
   * will be used.
   */
  public IntVector getCiphers() {
    long cPtr = pjsua2JNI.TlsConfig_ciphers_get(swigCPtr, this);
    return (cPtr == 0) ? null : new IntVector(cPtr, false);
  }

  /**
   * Specifies TLS transport behavior on the server TLS certificate<br>
   * verification result:<br>
   * - If <i>verifyServer</i> is disabled, TLS transport will just notify<br>
   *   the application via pjsip_tp_state_callback with state<br>
   *   PJSIP_TP_STATE_CONNECTED regardless TLS verification result.<br>
   * - If <i>verifyServer</i> is enabled, TLS transport will be shutdown<br>
   *   and application will be notified with state<br>
   *   PJSIP_TP_STATE_DISCONNECTED whenever there is any TLS verification<br>
   *   error, otherwise PJSIP_TP_STATE_CONNECTED will be notified.<br>
   * <br>
   * In any cases, application can inspect pjsip_tls_state_info in the<br>
   * callback to see the verification detail.<br>
   * <br>
   * Default value is false.
   */
  public void setVerifyServer(boolean value) {
    pjsua2JNI.TlsConfig_verifyServer_set(swigCPtr, this, value);
  }

  /**
   * Specifies TLS transport behavior on the server TLS certificate<br>
   * verification result:<br>
   * - If <i>verifyServer</i> is disabled, TLS transport will just notify<br>
   *   the application via pjsip_tp_state_callback with state<br>
   *   PJSIP_TP_STATE_CONNECTED regardless TLS verification result.<br>
   * - If <i>verifyServer</i> is enabled, TLS transport will be shutdown<br>
   *   and application will be notified with state<br>
   *   PJSIP_TP_STATE_DISCONNECTED whenever there is any TLS verification<br>
   *   error, otherwise PJSIP_TP_STATE_CONNECTED will be notified.<br>
   * <br>
   * In any cases, application can inspect pjsip_tls_state_info in the<br>
   * callback to see the verification detail.<br>
   * <br>
   * Default value is false.
   */
  public boolean getVerifyServer() {
    return pjsua2JNI.TlsConfig_verifyServer_get(swigCPtr, this);
  }

  /**
   * Specifies TLS transport behavior on the client TLS certificate<br>
   * verification result:<br>
   * - If <i>verifyClient</i> is disabled, TLS transport will just notify<br>
   *   the application via pjsip_tp_state_callback with state<br>
   *   PJSIP_TP_STATE_CONNECTED regardless TLS verification result.<br>
   * - If <i>verifyClient</i> is enabled, TLS transport will be shutdown<br>
   *   and application will be notified with state<br>
   *   PJSIP_TP_STATE_DISCONNECTED whenever there is any TLS verification<br>
   *   error, otherwise PJSIP_TP_STATE_CONNECTED will be notified.<br>
   * <br>
   * In any cases, application can inspect pjsip_tls_state_info in the<br>
   * callback to see the verification detail.<br>
   * <br>
   * Default value is PJ_FALSE.
   */
  public void setVerifyClient(boolean value) {
    pjsua2JNI.TlsConfig_verifyClient_set(swigCPtr, this, value);
  }

  /**
   * Specifies TLS transport behavior on the client TLS certificate<br>
   * verification result:<br>
   * - If <i>verifyClient</i> is disabled, TLS transport will just notify<br>
   *   the application via pjsip_tp_state_callback with state<br>
   *   PJSIP_TP_STATE_CONNECTED regardless TLS verification result.<br>
   * - If <i>verifyClient</i> is enabled, TLS transport will be shutdown<br>
   *   and application will be notified with state<br>
   *   PJSIP_TP_STATE_DISCONNECTED whenever there is any TLS verification<br>
   *   error, otherwise PJSIP_TP_STATE_CONNECTED will be notified.<br>
   * <br>
   * In any cases, application can inspect pjsip_tls_state_info in the<br>
   * callback to see the verification detail.<br>
   * <br>
   * Default value is PJ_FALSE.
   */
  public boolean getVerifyClient() {
    return pjsua2JNI.TlsConfig_verifyClient_get(swigCPtr, this);
  }

  /**
   * When acting as server (incoming TLS connections), reject incoming<br>
   * connection if client doesn't supply a TLS certificate.<br>
   * <br>
   * This setting corresponds to SSL_VERIFY_FAIL_IF_NO_PEER_CERT flag.<br>
   * Default value is PJ_FALSE.
   */
  public void setRequireClientCert(boolean value) {
    pjsua2JNI.TlsConfig_requireClientCert_set(swigCPtr, this, value);
  }

  /**
   * When acting as server (incoming TLS connections), reject incoming<br>
   * connection if client doesn't supply a TLS certificate.<br>
   * <br>
   * This setting corresponds to SSL_VERIFY_FAIL_IF_NO_PEER_CERT flag.<br>
   * Default value is PJ_FALSE.
   */
  public boolean getRequireClientCert() {
    return pjsua2JNI.TlsConfig_requireClientCert_get(swigCPtr, this);
  }

  /**
   * TLS negotiation timeout to be applied for both outgoing and incoming<br>
   * connection, in milliseconds. If zero, the SSL negotiation doesn't<br>
   * have a timeout.<br>
   * <br>
   * Default: zero
   */
  public void setMsecTimeout(long value) {
    pjsua2JNI.TlsConfig_msecTimeout_set(swigCPtr, this, value);
  }

  /**
   * TLS negotiation timeout to be applied for both outgoing and incoming<br>
   * connection, in milliseconds. If zero, the SSL negotiation doesn't<br>
   * have a timeout.<br>
   * <br>
   * Default: zero
   */
  public long getMsecTimeout() {
    return pjsua2JNI.TlsConfig_msecTimeout_get(swigCPtr, this);
  }

  /**
   * QoS traffic type to be set on this transport. When application wants<br>
   * to apply QoS tagging to the transport, it's preferable to set this<br>
   * field rather than <i>qosParam</i> fields since this is more portable.<br>
   * <br>
   * Default value is PJ_QOS_TYPE_BEST_EFFORT.
   */
  public void setQosType(int value) {
    pjsua2JNI.TlsConfig_qosType_set(swigCPtr, this, value);
  }

  /**
   * QoS traffic type to be set on this transport. When application wants<br>
   * to apply QoS tagging to the transport, it's preferable to set this<br>
   * field rather than <i>qosParam</i> fields since this is more portable.<br>
   * <br>
   * Default value is PJ_QOS_TYPE_BEST_EFFORT.
   */
  public int getQosType() {
    return pjsua2JNI.TlsConfig_qosType_get(swigCPtr, this);
  }

  /**
   * Set the low level QoS parameters to the transport. This is a lower<br>
   * level operation than setting the <i>qosType</i> field and may not be<br>
   * supported on all platforms.<br>
   * <br>
   * By default all settings in this structure are disabled.
   */
  public void setQosParams(pj_qos_params value) {
    pjsua2JNI.TlsConfig_qosParams_set(swigCPtr, this, pj_qos_params.getCPtr(value), value);
  }

  /**
   * Set the low level QoS parameters to the transport. This is a lower<br>
   * level operation than setting the <i>qosType</i> field and may not be<br>
   * supported on all platforms.<br>
   * <br>
   * By default all settings in this structure are disabled.
   */
  public pj_qos_params getQosParams() {
    long cPtr = pjsua2JNI.TlsConfig_qosParams_get(swigCPtr, this);
    return (cPtr == 0) ? null : new pj_qos_params(cPtr, false);
  }

  /**
   * Specify if the transport should ignore any errors when setting the QoS<br>
   * traffic type/parameters.<br>
   * <br>
   * Default: PJ_TRUE
   */
  public void setQosIgnoreError(boolean value) {
    pjsua2JNI.TlsConfig_qosIgnoreError_set(swigCPtr, this, value);
  }

  /**
   * Specify if the transport should ignore any errors when setting the QoS<br>
   * traffic type/parameters.<br>
   * <br>
   * Default: PJ_TRUE
   */
  public boolean getQosIgnoreError() {
    return pjsua2JNI.TlsConfig_qosIgnoreError_get(swigCPtr, this);
  }

  /**
   * Specify options to be set on the transport.<br>
   * <br>
   * By default, this is unset, which means that the underlying sockopt<br>
   * params as returned by #pj_ssl_sock_param_default() will be used.
   */
  public void setSockOptParams(SockOptParams value) {
    pjsua2JNI.TlsConfig_sockOptParams_set(swigCPtr, this, SockOptParams.getCPtr(value), value);
  }

  /**
   * Specify options to be set on the transport.<br>
   * <br>
   * By default, this is unset, which means that the underlying sockopt<br>
   * params as returned by #pj_ssl_sock_param_default() will be used.
   */
  public SockOptParams getSockOptParams() {
    long cPtr = pjsua2JNI.TlsConfig_sockOptParams_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SockOptParams(cPtr, false);
  }

  /**
   * Specify if the transport should ignore any errors when setting the<br>
   * sockopt parameters.<br>
   * <br>
   * Default: true
   */
  public void setSockOptIgnoreError(boolean value) {
    pjsua2JNI.TlsConfig_sockOptIgnoreError_set(swigCPtr, this, value);
  }

  /**
   * Specify if the transport should ignore any errors when setting the<br>
   * sockopt parameters.<br>
   * <br>
   * Default: true
   */
  public boolean getSockOptIgnoreError() {
    return pjsua2JNI.TlsConfig_sockOptIgnoreError_get(swigCPtr, this);
  }

  /**
   * Specify if renegotiation is enabled for TLSv1.2 or earlier.<br>
   * <br>
   * Default: PJ_TRUE
   */
  public void setEnableRenegotiation(boolean value) {
    pjsua2JNI.TlsConfig_enableRenegotiation_set(swigCPtr, this, value);
  }

  /**
   * Specify if renegotiation is enabled for TLSv1.2 or earlier.<br>
   * <br>
   * Default: PJ_TRUE
   */
  public boolean getEnableRenegotiation() {
    return pjsua2JNI.TlsConfig_enableRenegotiation_get(swigCPtr, this);
  }

  /**
   *  Default constructor initialises with default values 
   */
  public TlsConfig() {
    this(pjsua2JNI.new_TlsConfig(), true);
  }

  /**
   * Read this object from a container node.<br>
   * <br>
   * @param node              Container to read values from.
   */
  public void readObject(ContainerNode node) throws java.lang.Exception {
    pjsua2JNI.TlsConfig_readObject(swigCPtr, this, ContainerNode.getCPtr(node), node);
  }

  /**
   * Write this object to a container node.<br>
   * <br>
   * @param node              Container to write values to.
   */
  public void writeObject(ContainerNode node) throws java.lang.Exception {
    pjsua2JNI.TlsConfig_writeObject(swigCPtr, this, ContainerNode.getCPtr(node), node);
  }

}
