/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.3.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public final class pj_stun_nat_type {
  public final static int PJ_STUN_NAT_TYPE_UNKNOWN = 0;
  public final static int PJ_STUN_NAT_TYPE_ERR_UNKNOWN = PJ_STUN_NAT_TYPE_UNKNOWN + 1;
  public final static int PJ_STUN_NAT_TYPE_OPEN = PJ_STUN_NAT_TYPE_ERR_UNKNOWN + 1;
  public final static int PJ_STUN_NAT_TYPE_BLOCKED = PJ_STUN_NAT_TYPE_OPEN + 1;
  public final static int PJ_STUN_NAT_TYPE_SYMMETRIC_UDP = PJ_STUN_NAT_TYPE_BLOCKED + 1;
  public final static int PJ_STUN_NAT_TYPE_FULL_CONE = PJ_STUN_NAT_TYPE_SYMMETRIC_UDP + 1;
  public final static int PJ_STUN_NAT_TYPE_SYMMETRIC = PJ_STUN_NAT_TYPE_FULL_CONE + 1;
  public final static int PJ_STUN_NAT_TYPE_RESTRICTED = PJ_STUN_NAT_TYPE_SYMMETRIC + 1;
  public final static int PJ_STUN_NAT_TYPE_PORT_RESTRICTED = PJ_STUN_NAT_TYPE_RESTRICTED + 1;
}

