/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public final class GiPathNode {
  public final static GiPathNode kGiCloseFigure = new GiPathNode("kGiCloseFigure", 1);
  public final static GiPathNode kGiLineTo = new GiPathNode("kGiLineTo", 2);
  public final static GiPathNode kGiBeziersTo = new GiPathNode("kGiBeziersTo", 4);
  public final static GiPathNode kGiMoveTo = new GiPathNode("kGiMoveTo", 6);

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GiPathNode swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GiPathNode.class + " with value " + swigValue);
  }

  private GiPathNode(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GiPathNode(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GiPathNode(String swigName, GiPathNode swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GiPathNode[] swigValues = { kGiCloseFigure, kGiLineTo, kGiBeziersTo, kGiMoveTo };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

