/**
 */
package com.misc.touse.moplaf.tousepropagator2calc;

import com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorFunctionProject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer Task Resources</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2calc.LayerTaskResources#getAntecedentLayerTaskTimes <em>Antecedent Layer Task Times</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2calc.LayerTaskResources#getConcreteParent <em>Concrete Parent</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousepropagator2calc.ToUsePropagatorCalcPackage#getLayerTaskResources()
 * @model
 * @generated
 */
public interface LayerTaskResources extends ToUsePropagatorFunctionProject {
	/**
	 * Returns the value of the '<em><b>Antecedent Layer Task Times</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antecedent Layer Task Times</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antecedent Layer Task Times</em>' reference.
	 * @see #setAntecedentLayerTaskTimes(LayerTaskTimes)
	 * @see com.misc.touse.moplaf.tousepropagator2calc.ToUsePropagatorCalcPackage#getLayerTaskResources_AntecedentLayerTaskTimes()
	 * @model
	 * @generated
	 */
	LayerTaskTimes getAntecedentLayerTaskTimes();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousepropagator2calc.LayerTaskResources#getAntecedentLayerTaskTimes <em>Antecedent Layer Task Times</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antecedent Layer Task Times</em>' reference.
	 * @see #getAntecedentLayerTaskTimes()
	 * @generated
	 */
	void setAntecedentLayerTaskTimes(LayerTaskTimes value);

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
	 * @see com.misc.touse.moplaf.tousepropagator2calc.ToUsePropagatorCalcPackage#getLayerTaskResources_ConcreteParent()
	 * @model
	 * @generated
	 */
	ScopeProject getConcreteParent();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousepropagator2calc.LayerTaskResources#getConcreteParent <em>Concrete Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concrete Parent</em>' reference.
	 * @see #getConcreteParent()
	 * @generated
	 */
	void setConcreteParent(ScopeProject value);

} // LayerTaskResources
