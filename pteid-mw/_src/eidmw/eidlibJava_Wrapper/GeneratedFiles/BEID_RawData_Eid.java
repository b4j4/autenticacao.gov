/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.35
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package be.belgium.eid;

public class BEID_RawData_Eid {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected BEID_RawData_Eid(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BEID_RawData_Eid obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      beidlibJava_WrapperJNI.delete_BEID_RawData_Eid(swigCPtr);
    }
    swigCPtr = 0;
  }

  public void setIdData(BEID_ByteArray value) {
    beidlibJava_WrapperJNI.BEID_RawData_Eid_idData_set(swigCPtr, this, BEID_ByteArray.getCPtr(value), value);
  }

  public BEID_ByteArray getIdData() {
    long cPtr = beidlibJava_WrapperJNI.BEID_RawData_Eid_idData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BEID_ByteArray(cPtr, false);
  }

  public void setIdSigData(BEID_ByteArray value) {
    beidlibJava_WrapperJNI.BEID_RawData_Eid_idSigData_set(swigCPtr, this, BEID_ByteArray.getCPtr(value), value);
  }

  public BEID_ByteArray getIdSigData() {
    long cPtr = beidlibJava_WrapperJNI.BEID_RawData_Eid_idSigData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BEID_ByteArray(cPtr, false);
  }

  public void setAddrData(BEID_ByteArray value) {
    beidlibJava_WrapperJNI.BEID_RawData_Eid_addrData_set(swigCPtr, this, BEID_ByteArray.getCPtr(value), value);
  }

  public BEID_ByteArray getAddrData() {
    long cPtr = beidlibJava_WrapperJNI.BEID_RawData_Eid_addrData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BEID_ByteArray(cPtr, false);
  }

  public void setAddrSigData(BEID_ByteArray value) {
    beidlibJava_WrapperJNI.BEID_RawData_Eid_addrSigData_set(swigCPtr, this, BEID_ByteArray.getCPtr(value), value);
  }

  public BEID_ByteArray getAddrSigData() {
    long cPtr = beidlibJava_WrapperJNI.BEID_RawData_Eid_addrSigData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BEID_ByteArray(cPtr, false);
  }

  public void setSodData(BEID_ByteArray value) {
    beidlibJava_WrapperJNI.BEID_RawData_Eid_sodData_set(swigCPtr, this, BEID_ByteArray.getCPtr(value), value);
  }

  public BEID_ByteArray getSodData() {
    long cPtr = beidlibJava_WrapperJNI.BEID_RawData_Eid_sodData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BEID_ByteArray(cPtr, false);
  }

  public void setCardData(BEID_ByteArray value) {
    beidlibJava_WrapperJNI.BEID_RawData_Eid_cardData_set(swigCPtr, this, BEID_ByteArray.getCPtr(value), value);
  }

  public BEID_ByteArray getCardData() {
    long cPtr = beidlibJava_WrapperJNI.BEID_RawData_Eid_cardData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BEID_ByteArray(cPtr, false);
  }

  public void setTokenInfo(BEID_ByteArray value) {
    beidlibJava_WrapperJNI.BEID_RawData_Eid_tokenInfo_set(swigCPtr, this, BEID_ByteArray.getCPtr(value), value);
  }

  public BEID_ByteArray getTokenInfo() {
    long cPtr = beidlibJava_WrapperJNI.BEID_RawData_Eid_tokenInfo_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BEID_ByteArray(cPtr, false);
  }

  public void setCertRN(BEID_ByteArray value) {
    beidlibJava_WrapperJNI.BEID_RawData_Eid_certRN_set(swigCPtr, this, BEID_ByteArray.getCPtr(value), value);
  }

  public BEID_ByteArray getCertRN() {
    long cPtr = beidlibJava_WrapperJNI.BEID_RawData_Eid_certRN_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BEID_ByteArray(cPtr, false);
  }

  public void setChallenge(BEID_ByteArray value) {
    beidlibJava_WrapperJNI.BEID_RawData_Eid_challenge_set(swigCPtr, this, BEID_ByteArray.getCPtr(value), value);
  }

  public BEID_ByteArray getChallenge() {
    long cPtr = beidlibJava_WrapperJNI.BEID_RawData_Eid_challenge_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BEID_ByteArray(cPtr, false);
  }

  public void setResponse(BEID_ByteArray value) {
    beidlibJava_WrapperJNI.BEID_RawData_Eid_response_set(swigCPtr, this, BEID_ByteArray.getCPtr(value), value);
  }

  public BEID_ByteArray getResponse() {
    long cPtr = beidlibJava_WrapperJNI.BEID_RawData_Eid_response_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BEID_ByteArray(cPtr, false);
  }

  public void setPersoData(BEID_ByteArray value) {
    beidlibJava_WrapperJNI.BEID_RawData_Eid_persoData_set(swigCPtr, this, BEID_ByteArray.getCPtr(value), value);
  }

  public BEID_ByteArray getPersoData() {
    long cPtr = beidlibJava_WrapperJNI.BEID_RawData_Eid_persoData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BEID_ByteArray(cPtr, false);
  }

  public void setTrace(BEID_ByteArray value) {
    beidlibJava_WrapperJNI.BEID_RawData_Eid_trace_set(swigCPtr, this, BEID_ByteArray.getCPtr(value), value);
  }

  public BEID_ByteArray getTrace() {
    long cPtr = beidlibJava_WrapperJNI.BEID_RawData_Eid_trace_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BEID_ByteArray(cPtr, false);
  }

  public BEID_RawData_Eid() {
    this(beidlibJava_WrapperJNI.new_BEID_RawData_Eid(), true);
  }

}
