/**
 */
package com.misc.touse.moplaf.tousepropagator2calc;

import com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorFunctionProject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer Task Times</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2calc.LayerTaskTimes#getConcreteParent <em>Concrete Parent</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2calc.LayerTaskTimes#getAntecedentLayerTaskHours <em>Antecedent Layer Task Hours</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousepropagator2calc.ToUsePropagatorCalcPackage#getLayerTaskTimes()
 * @model
 * @generated
 */
public interface LayerTaskTimes extends ToUsePropagatorFunctionProject {

	/**
	 * Returns the value of the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Parent</em>' reference.
	 * @see #setConcreteParent(ScopeProject)
	 * @see com.misc.touse.moplaf.tousepropagator2calc.ToUsePropagatorCalcPackage#getLayerTaskTimes_ConcreteParent()
	 * @model required="true"
	 * @generated
	 */
	ScopeProject getConcreteParent();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousepropagator2calc.LayerTaskTimes#getConcreteParent <em>Concrete Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concrete Parent</em>' reference.
	 * @see #getConcreteParent()
	 * @generated
	 */
	void setConcreteParent(ScopeProject value);

	/**
	 * Returns the value of the '<em><b>Antecedent Layer Task Hours</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antecedent Layer Task Hours</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antecedent Layer Task Hours</em>' reference.
	 * @see #setAntecedentLayerTaskHours(LayerTaskHours)
	 * @see com.misc.touse.moplaf.tousepropagator2calc.ToUsePropagatorCalcPackage#getLayerTaskTimes_AntecedentLayerTaskHours()
	 * @model
	 * @generated
	 */
	LayerTaskHours getAntecedentLayerTaskHours();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousepropagator2calc.LayerTaskTimes#getAntecedentLayerTaskHours <em>Antecedent Layer Task Hours</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antecedent Layer Task Hours</em>' reference.
	 * @see #getAntecedentLayerTaskHours()
	 * @generated
	 */
	void setAntecedentLayerTaskHours(LayerTaskHours value);
} // LayerTaskTimes
