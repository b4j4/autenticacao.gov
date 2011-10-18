/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.35
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

namespace be.belgium.eid {

using System;
using System.Runtime.InteropServices;

public class BEID_CardVersionInfo : BEID_XMLDoc {
  private HandleRef swigCPtr;

  internal BEID_CardVersionInfo(IntPtr cPtr, bool cMemoryOwn) : base(beidlib_dotNetPINVOKE.BEID_CardVersionInfoUpcast(cPtr), cMemoryOwn) {
    swigCPtr = new HandleRef(this, cPtr);
  }

  internal static HandleRef getCPtr(BEID_CardVersionInfo obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~BEID_CardVersionInfo() {
    Dispose();
  }

  public override void Dispose() {
    lock(this) {
      if(swigCPtr.Handle != IntPtr.Zero && swigCMemOwn) {
        swigCMemOwn = false;
        beidlib_dotNetPINVOKE.delete_BEID_CardVersionInfo(swigCPtr);
      }
      swigCPtr = new HandleRef(null, IntPtr.Zero);
      GC.SuppressFinalize(this);
      base.Dispose();
    }
  }

  public string getSerialNumber() {
    string ret = beidlib_dotNetPINVOKE.BEID_CardVersionInfo_getSerialNumber(swigCPtr);
    if (beidlib_dotNetPINVOKE.SWIGPendingException.Pending) throw beidlib_dotNetPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public string getComponentCode() {
    string ret = beidlib_dotNetPINVOKE.BEID_CardVersionInfo_getComponentCode(swigCPtr);
    if (beidlib_dotNetPINVOKE.SWIGPendingException.Pending) throw beidlib_dotNetPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public string getOsNumber() {
    string ret = beidlib_dotNetPINVOKE.BEID_CardVersionInfo_getOsNumber(swigCPtr);
    if (beidlib_dotNetPINVOKE.SWIGPendingException.Pending) throw beidlib_dotNetPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public string getOsVersion() {
    string ret = beidlib_dotNetPINVOKE.BEID_CardVersionInfo_getOsVersion(swigCPtr);
    if (beidlib_dotNetPINVOKE.SWIGPendingException.Pending) throw beidlib_dotNetPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public string getSoftmaskNumber() {
    string ret = beidlib_dotNetPINVOKE.BEID_CardVersionInfo_getSoftmaskNumber(swigCPtr);
    if (beidlib_dotNetPINVOKE.SWIGPendingException.Pending) throw beidlib_dotNetPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public string getSoftmaskVersion() {
    string ret = beidlib_dotNetPINVOKE.BEID_CardVersionInfo_getSoftmaskVersion(swigCPtr);
    if (beidlib_dotNetPINVOKE.SWIGPendingException.Pending) throw beidlib_dotNetPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public string getAppletVersion() {
    string ret = beidlib_dotNetPINVOKE.BEID_CardVersionInfo_getAppletVersion(swigCPtr);
    if (beidlib_dotNetPINVOKE.SWIGPendingException.Pending) throw beidlib_dotNetPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public string getGlobalOsVersion() {
    string ret = beidlib_dotNetPINVOKE.BEID_CardVersionInfo_getGlobalOsVersion(swigCPtr);
    if (beidlib_dotNetPINVOKE.SWIGPendingException.Pending) throw beidlib_dotNetPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public string getAppletInterfaceVersion() {
    string ret = beidlib_dotNetPINVOKE.BEID_CardVersionInfo_getAppletInterfaceVersion(swigCPtr);
    if (beidlib_dotNetPINVOKE.SWIGPendingException.Pending) throw beidlib_dotNetPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public string getPKCS1Support() {
    string ret = beidlib_dotNetPINVOKE.BEID_CardVersionInfo_getPKCS1Support(swigCPtr);
    if (beidlib_dotNetPINVOKE.SWIGPendingException.Pending) throw beidlib_dotNetPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public string getKeyExchangeVersion() {
    string ret = beidlib_dotNetPINVOKE.BEID_CardVersionInfo_getKeyExchangeVersion(swigCPtr);
    if (beidlib_dotNetPINVOKE.SWIGPendingException.Pending) throw beidlib_dotNetPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public string getAppletLifeCycle() {
    string ret = beidlib_dotNetPINVOKE.BEID_CardVersionInfo_getAppletLifeCycle(swigCPtr);
    if (beidlib_dotNetPINVOKE.SWIGPendingException.Pending) throw beidlib_dotNetPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public string getGraphicalPersonalisation() {
    string ret = beidlib_dotNetPINVOKE.BEID_CardVersionInfo_getGraphicalPersonalisation(swigCPtr);
    if (beidlib_dotNetPINVOKE.SWIGPendingException.Pending) throw beidlib_dotNetPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public string getElectricalPersonalisation() {
    string ret = beidlib_dotNetPINVOKE.BEID_CardVersionInfo_getElectricalPersonalisation(swigCPtr);
    if (beidlib_dotNetPINVOKE.SWIGPendingException.Pending) throw beidlib_dotNetPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public string getElectricalPersonalisationInterface() {
    string ret = beidlib_dotNetPINVOKE.BEID_CardVersionInfo_getElectricalPersonalisationInterface(swigCPtr);
    if (beidlib_dotNetPINVOKE.SWIGPendingException.Pending) throw beidlib_dotNetPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public BEID_ByteArray getSignature() {
    BEID_ByteArray ret = new BEID_ByteArray(beidlib_dotNetPINVOKE.BEID_CardVersionInfo_getSignature(swigCPtr), false);
    if (beidlib_dotNetPINVOKE.SWIGPendingException.Pending) throw beidlib_dotNetPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

}

}
