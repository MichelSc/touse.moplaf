/**
 */
package com.misc.touse.moplaf.tousepropagator2;

import com.misc.common.moplaf.propagator2.PropagatorFunctionBindings;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorFunction#isCalculated <em>Calculated</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage#getToUsePropagatorFunction()
 * @model
 * @generated
 */
public interface ToUsePropagatorFunction extends PropagatorFunctionBindings {
	/**
	 * the Id for the factory
	 */
	public static String factoryID = "com.misc.touse.moplaf.propagator.factory1";

	/**
	 * Returns the value of the '<em><b>Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calculated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculated</em>' attribute.
	 * @see #setCalculated(boolean)
	 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage#getToUsePropagatorFunction_Calculated()
	 * @model
	 * @generated
	 */
	boolean isCalculated();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorFunction#isCalculated <em>Calculated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculated</em>' attribute.
	 * @see #isCalculated()
	 * @generated
	 */
	void setCalculated(boolean value);

} // ToUsePropagatorFunction
