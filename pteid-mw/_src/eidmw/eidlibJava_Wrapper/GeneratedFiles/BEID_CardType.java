/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.35
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package be.belgium.eid;

public final class BEID_CardType {
  public final static BEID_CardType BEID_CARDTYPE_UNKNOWN = new BEID_CardType("BEID_CARDTYPE_UNKNOWN", beidlibJava_WrapperJNI.BEID_CARDTYPE_UNKNOWN_get());
  public final static BEID_CardType BEID_CARDTYPE_EID = new BEID_CardType("BEID_CARDTYPE_EID");
  public final static BEID_CardType BEID_CARDTYPE_KIDS = new BEID_CardType("BEID_CARDTYPE_KIDS");
  public final static BEID_CardType BEID_CARDTYPE_FOREIGNER = new BEID_CardType("BEID_CARDTYPE_FOREIGNER");
  public final static BEID_CardType BEID_CARDTYPE_SIS = new BEID_CardType("BEID_CARDTYPE_SIS");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static BEID_CardType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + BEID_CardType.class + " with value " + swigValue);
  }

  private BEID_CardType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private BEID_CardType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private BEID_CardType(String swigName, BEID_CardType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static BEID_CardType[] swigValues = { BEID_CARDTYPE_UNKNOWN, BEID_CARDTYPE_EID, BEID_CARDTYPE_KIDS, BEID_CARDTYPE_FOREIGNER, BEID_CARDTYPE_SIS };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

