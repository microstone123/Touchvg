/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public class GiSaveModelTransform {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected GiSaveModelTransform(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GiSaveModelTransform obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        touchvgJNI.delete_GiSaveModelTransform(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public GiSaveModelTransform(GiTransform xform, Matrix2d mat) {
    this(touchvgJNI.new_GiSaveModelTransform(GiTransform.getCPtr(xform), xform, Matrix2d.getCPtr(mat), mat), true);
  }

}
