/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.35
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package be.belgium.eid;

public final class BEID_CertifStatus {
  public final static BEID_CertifStatus BEID_CERTIF_STATUS_UNKNOWN = new BEID_CertifStatus("BEID_CERTIF_STATUS_UNKNOWN", beidlibJava_WrapperJNI.BEID_CERTIF_STATUS_UNKNOWN_get());
  public final static BEID_CertifStatus BEID_CERTIF_STATUS_REVOKED = new BEID_CertifStatus("BEID_CERTIF_STATUS_REVOKED");
  public final static BEID_CertifStatus BEID_CERTIF_STATUS_TEST = new BEID_CertifStatus("BEID_CERTIF_STATUS_TEST");
  public final static BEID_CertifStatus BEID_CERTIF_STATUS_DATE = new BEID_CertifStatus("BEID_CERTIF_STATUS_DATE");
  public final static BEID_CertifStatus BEID_CERTIF_STATUS_CONNECT = new BEID_CertifStatus("BEID_CERTIF_STATUS_CONNECT");
  public final static BEID_CertifStatus BEID_CERTIF_STATUS_ISSUER = new BEID_CertifStatus("BEID_CERTIF_STATUS_ISSUER");
  public final static BEID_CertifStatus BEID_CERTIF_STATUS_ERROR = new BEID_CertifStatus("BEID_CERTIF_STATUS_ERROR");
  public final static BEID_CertifStatus BEID_CERTIF_STATUS_VALID = new BEID_CertifStatus("BEID_CERTIF_STATUS_VALID");
  public final static BEID_CertifStatus BEID_CERTIF_STATUS_VALID_CRL = new BEID_CertifStatus("BEID_CERTIF_STATUS_VALID_CRL");
  public final static BEID_CertifStatus BEID_CERTIF_STATUS_VALID_OCSP = new BEID_CertifStatus("BEID_CERTIF_STATUS_VALID_OCSP");
  public final static BEID_CertifStatus BEID_CERTIF_STATUS_OCSP_NOT_CHECKED = new BEID_CertifStatus("BEID_CERTIF_STATUS_OCSP_NOT_CHECKED");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static BEID_CertifStatus swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + BEID_CertifStatus.class + " with value " + swigValue);
  }

  private BEID_CertifStatus(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private BEID_CertifStatus(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private BEID_CertifStatus(String swigName, BEID_CertifStatus swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static BEID_CertifStatus[] swigValues = { BEID_CERTIF_STATUS_UNKNOWN, BEID_CERTIF_STATUS_REVOKED, BEID_CERTIF_STATUS_TEST, BEID_CERTIF_STATUS_DATE, BEID_CERTIF_STATUS_CONNECT, BEID_CERTIF_STATUS_ISSUER, BEID_CERTIF_STATUS_ERROR, BEID_CERTIF_STATUS_VALID, BEID_CERTIF_STATUS_VALID_CRL, BEID_CERTIF_STATUS_VALID_OCSP, BEID_CERTIF_STATUS_OCSP_NOT_CHECKED };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

