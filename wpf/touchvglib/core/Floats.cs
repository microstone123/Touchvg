/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

namespace touchvg.core {

using System;
using System.Runtime.InteropServices;

public class Floats : IDisposable {
  private HandleRef swigCPtr;
  protected bool swigCMemOwn;

  internal Floats(IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new HandleRef(this, cPtr);
  }

  internal static HandleRef getCPtr(Floats obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~Floats() {
    Dispose();
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          touchvgPINVOKE.delete_Floats(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
    }
  }

  public Floats(int n) : this(touchvgPINVOKE.new_Floats__SWIG_0(n), true) {
  }

  public Floats() : this(touchvgPINVOKE.new_Floats__SWIG_1(), true) {
  }

  public void setSize(int n) {
    touchvgPINVOKE.Floats_setSize(swigCPtr, n);
  }

  public Floats(float v1, float v2) : this(touchvgPINVOKE.new_Floats__SWIG_2(v1, v2), true) {
  }

  public Floats(float v1, float v2, float v3, float v4) : this(touchvgPINVOKE.new_Floats__SWIG_3(v1, v2, v3, v4), true) {
  }

  public int count() {
    int ret = touchvgPINVOKE.Floats_count(swigCPtr);
    return ret;
  }

  public float get(int index) {
    float ret = touchvgPINVOKE.Floats_get(swigCPtr, index);
    return ret;
  }

  public void set(int index, float value) {
    touchvgPINVOKE.Floats_set__SWIG_0(swigCPtr, index, value);
  }

  public void set(int index, float v1, float v2) {
    touchvgPINVOKE.Floats_set__SWIG_1(swigCPtr, index, v1, v2);
  }

}

}
