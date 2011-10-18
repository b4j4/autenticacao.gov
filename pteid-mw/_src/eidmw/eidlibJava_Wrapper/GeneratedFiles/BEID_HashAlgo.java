/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.35
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package be.belgium.eid;

public final class BEID_HashAlgo {
  public final static BEID_HashAlgo BEID_ALGO_MD5 = new BEID_HashAlgo("BEID_ALGO_MD5");
  public final static BEID_HashAlgo BEID_ALGO_SHA1 = new BEID_HashAlgo("BEID_ALGO_SHA1");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static BEID_HashAlgo swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + BEID_HashAlgo.class + " with value " + swigValue);
  }

  private BEID_HashAlgo(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private BEID_HashAlgo(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private BEID_HashAlgo(String swigName, BEID_HashAlgo swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static BEID_HashAlgo[] swigValues = { BEID_ALGO_MD5, BEID_ALGO_SHA1 };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

