/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.35
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package be.belgium.eid;

public class BEID_ReaderSet extends BEID_Object {
  private long swigCPtr;

  protected BEID_ReaderSet(long cPtr, boolean cMemoryOwn) {
    super(beidlibJava_WrapperJNI.SWIGBEID_ReaderSetUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BEID_ReaderSet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      beidlibJava_WrapperJNI.delete_BEID_ReaderSet(swigCPtr);
    }
    swigCPtr = 0;
    super.delete();
  }

  public static BEID_ReaderSet instance() {
    return new BEID_ReaderSet(beidlibJava_WrapperJNI.BEID_ReaderSet_instance(), false);
  }

  public static void initSDK(boolean bManageTestCard) throws BEID_Exception {
    beidlibJava_WrapperJNI.BEID_ReaderSet_initSDK__SWIG_0(bManageTestCard);
  }

  public static void initSDK() throws BEID_Exception {
    beidlibJava_WrapperJNI.BEID_ReaderSet_initSDK__SWIG_1();
  }

  public static void releaseSDK() throws BEID_Exception {
    beidlibJava_WrapperJNI.BEID_ReaderSet_releaseSDK();
  }

  public void releaseReaders(boolean bAllReference) throws BEID_Exception {
    beidlibJava_WrapperJNI.BEID_ReaderSet_releaseReaders__SWIG_0(swigCPtr, this, bAllReference);
  }

  public void releaseReaders() throws BEID_Exception {
    beidlibJava_WrapperJNI.BEID_ReaderSet_releaseReaders__SWIG_1(swigCPtr, this);
  }

  public boolean isReadersChanged() throws BEID_Exception {
    return beidlibJava_WrapperJNI.BEID_ReaderSet_isReadersChanged(swigCPtr, this);
  }

  public String[] readerList(boolean bForceRefresh) throws BEID_Exception {
    return beidlibJava_WrapperJNI.BEID_ReaderSet_readerList__SWIG_0(swigCPtr, this, bForceRefresh);
  }

  public String[] readerList() throws BEID_Exception {
    return beidlibJava_WrapperJNI.BEID_ReaderSet_readerList__SWIG_1(swigCPtr, this);
  }

  public BEID_ReaderContext getReader() throws BEID_Exception {
    return new BEID_ReaderContext(beidlibJava_WrapperJNI.BEID_ReaderSet_getReader(swigCPtr, this), false);
  }

  public BEID_ReaderContext getReaderByName(String readerName) throws BEID_Exception {
    return new BEID_ReaderContext(beidlibJava_WrapperJNI.BEID_ReaderSet_getReaderByName(swigCPtr, this, readerName), false);
  }

  public long readerCount(boolean bForceRefresh) throws BEID_Exception {
    return beidlibJava_WrapperJNI.BEID_ReaderSet_readerCount__SWIG_0(swigCPtr, this, bForceRefresh);
  }

  public long readerCount() throws BEID_Exception {
    return beidlibJava_WrapperJNI.BEID_ReaderSet_readerCount__SWIG_1(swigCPtr, this);
  }

  public String getReaderName(long ulIndex) throws BEID_Exception {
    return beidlibJava_WrapperJNI.BEID_ReaderSet_getReaderName(swigCPtr, this, ulIndex);
  }

  public BEID_ReaderContext getReaderByNum(long ulIndex) throws BEID_Exception {
    return new BEID_ReaderContext(beidlibJava_WrapperJNI.BEID_ReaderSet_getReaderByNum(swigCPtr, this, ulIndex), false);
  }

  public BEID_ReaderContext getReaderByCardSerialNumber(String cardSerialNumber) throws BEID_Exception {
    return new BEID_ReaderContext(beidlibJava_WrapperJNI.BEID_ReaderSet_getReaderByCardSerialNumber(swigCPtr, this, cardSerialNumber), false);
  }

  public boolean flushCache() throws BEID_Exception {
    return beidlibJava_WrapperJNI.BEID_ReaderSet_flushCache(swigCPtr, this);
  }

}
