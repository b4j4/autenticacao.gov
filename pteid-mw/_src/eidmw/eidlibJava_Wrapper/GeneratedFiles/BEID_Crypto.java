/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.35
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package be.belgium.eid;

public class BEID_Crypto extends BEID_XMLDoc {
  private long swigCPtr;

  protected BEID_Crypto(long cPtr, boolean cMemoryOwn) {
    super(beidlibJava_WrapperJNI.SWIGBEID_CryptoUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BEID_Crypto obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      beidlibJava_WrapperJNI.delete_BEID_Crypto(swigCPtr);
    }
    swigCPtr = 0;
    super.delete();
  }

}
