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

public class BEID_ExCertNoOcsp : BEID_Exception {
  private HandleRef swigCPtr;

  internal BEID_ExCertNoOcsp(IntPtr cPtr, bool cMemoryOwn) : base(beidlib_dotNetPINVOKE.BEID_ExCertNoOcspUpcast(cPtr), cMemoryOwn) {
    swigCPtr = new HandleRef(this, cPtr);
  }

  internal static HandleRef getCPtr(BEID_ExCertNoOcsp obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~BEID_ExCertNoOcsp() {
    Dispose();
  }

  public override void Dispose() {
    lock(this) {
      if(swigCPtr.Handle != IntPtr.Zero && swigCMemOwn) {
        swigCMemOwn = false;
        beidlib_dotNetPINVOKE.delete_BEID_ExCertNoOcsp(swigCPtr);
      }
      swigCPtr = new HandleRef(null, IntPtr.Zero);
      GC.SuppressFinalize(this);
      base.Dispose();
    }
  }

  public BEID_ExCertNoOcsp() : this(beidlib_dotNetPINVOKE.new_BEID_ExCertNoOcsp(), true) {
  }

}

}
