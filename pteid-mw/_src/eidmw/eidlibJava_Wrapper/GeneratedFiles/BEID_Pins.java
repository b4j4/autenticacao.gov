/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.35
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package be.belgium.eid;

public class BEID_Pins extends BEID_Crypto {
  private long swigCPtr;

  protected BEID_Pins(long cPtr, boolean cMemoryOwn) {
    super(beidlibJava_WrapperJNI.SWIGBEID_PinsUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BEID_Pins obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      beidlibJava_WrapperJNI.delete_BEID_Pins(swigCPtr);
    }
    swigCPtr = 0;
    super.delete();
  }

  public long count() throws BEID_Exception {
    return beidlibJava_WrapperJNI.BEID_Pins_count(swigCPtr, this);
  }

  public BEID_Pin getPinByNumber(long ulIndex) throws BEID_Exception {
    return new BEID_Pin(beidlibJava_WrapperJNI.BEID_Pins_getPinByNumber(swigCPtr, this, ulIndex), false);
  }

}
