/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.35
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package be.belgium.eid;

public class BEID_ExCardTypeUnknown extends BEID_Exception {
  private long swigCPtr;

  protected BEID_ExCardTypeUnknown(long cPtr, boolean cMemoryOwn) {
    super(beidlibJava_WrapperJNI.SWIGBEID_ExCardTypeUnknownUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BEID_ExCardTypeUnknown obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      beidlibJava_WrapperJNI.delete_BEID_ExCardTypeUnknown(swigCPtr);
    }
    swigCPtr = 0;
    super.delete();
  }

  public BEID_ExCardTypeUnknown() {
    this(beidlibJava_WrapperJNI.new_BEID_ExCardTypeUnknown(), true);
  }

}
