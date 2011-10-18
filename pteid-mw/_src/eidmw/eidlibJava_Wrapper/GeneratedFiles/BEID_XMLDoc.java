/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.35
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package be.belgium.eid;

public class BEID_XMLDoc extends BEID_Object {
  private long swigCPtr;

  protected BEID_XMLDoc(long cPtr, boolean cMemoryOwn) {
    super(beidlibJava_WrapperJNI.SWIGBEID_XMLDocUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BEID_XMLDoc obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      beidlibJava_WrapperJNI.delete_BEID_XMLDoc(swigCPtr);
    }
    swigCPtr = 0;
    super.delete();
  }

  public boolean isAllowed() {
    return beidlibJava_WrapperJNI.BEID_XMLDoc_isAllowed(swigCPtr, this);
  }

  public BEID_ByteArray getXML() throws BEID_Exception {
    return new BEID_ByteArray(beidlibJava_WrapperJNI.BEID_XMLDoc_getXML(swigCPtr, this), true);
  }

  public BEID_ByteArray getCSV() throws BEID_Exception {
    return new BEID_ByteArray(beidlibJava_WrapperJNI.BEID_XMLDoc_getCSV(swigCPtr, this), true);
  }

  public BEID_ByteArray getTLV() throws BEID_Exception {
    return new BEID_ByteArray(beidlibJava_WrapperJNI.BEID_XMLDoc_getTLV(swigCPtr, this), true);
  }

  public boolean writeXmlToFile(String csFilePath) throws BEID_Exception {
    return beidlibJava_WrapperJNI.BEID_XMLDoc_writeXmlToFile(swigCPtr, this, csFilePath);
  }

  public boolean writeCsvToFile(String csFilePath) throws BEID_Exception {
    return beidlibJava_WrapperJNI.BEID_XMLDoc_writeCsvToFile(swigCPtr, this, csFilePath);
  }

  public boolean writeTlvToFile(String csFilePath) throws BEID_Exception {
    return beidlibJava_WrapperJNI.BEID_XMLDoc_writeTlvToFile(swigCPtr, this, csFilePath);
  }

}
