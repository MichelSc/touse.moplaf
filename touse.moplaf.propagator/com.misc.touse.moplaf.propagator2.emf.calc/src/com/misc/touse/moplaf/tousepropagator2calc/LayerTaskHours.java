/**
 */
package com.misc.touse.moplaf.tousepropagator2calc;

import com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorFunctionProject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer Task Hours</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHours#getConcreteParent <em>Concrete Parent</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHours#getAntecedentLayerTaskHoursItem <em>Antecedent Layer Task Hours Item</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHours#getAntecedentLayerTaskHoursVar <em>Antecedent Layer Task Hours Var</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousepropagator2calc.ToUsePropagatorCalcPackage#getLayerTaskHours()
 * @model
 * @generated
 */
public interface LayerTaskHours extends ToUsePropagatorFunctionProject {
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
	 * @see com.misc.touse.moplaf.tousepropagator2calc.ToUsePropagatorCalcPackage#getLayerTaskHours_ConcreteParent()
	 * @model required="true"
	 * @generated
	 */
	ScopeProject getConcreteParent();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHours#getConcreteParent <em>Concrete Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concrete Parent</em>' reference.
	 * @see #getConcreteParent()
	 * @generated
	 */
	void setConcreteParent(ScopeProject value);

	/**
	 * Returns the value of the '<em><b>Antecedent Layer Task Hours Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antecedent Layer Task Hours Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antecedent Layer Task Hours Item</em>' reference.
	 * @see #setAntecedentLayerTaskHoursItem(LayerTaskHoursItem)
	 * @see com.misc.touse.moplaf.tousepropagator2calc.ToUsePropagatorCalcPackage#getLayerTaskHours_AntecedentLayerTaskHoursItem()
	 * @model
	 * @generated
	 */
	LayerTaskHoursItem getAntecedentLayerTaskHoursItem();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHours#getAntecedentLayerTaskHoursItem <em>Antecedent Layer Task Hours Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antecedent Layer Task Hours Item</em>' reference.
	 * @see #getAntecedentLayerTaskHoursItem()
	 * @generated
	 */
	void setAntecedentLayerTaskHoursItem(LayerTaskHoursItem value);

	/**
	 * Returns the value of the '<em><b>Antecedent Layer Task Hours Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antecedent Layer Task Hours Var</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antecedent Layer Task Hours Var</em>' reference.
	 * @see #setAntecedentLayerTaskHoursVar(LayerTaskHoursVar)
	 * @see com.misc.touse.moplaf.tousepropagator2calc.ToUsePropagatorCalcPackage#getLayerTaskHours_AntecedentLayerTaskHoursVar()
	 * @model
	 * @generated
	 */
	LayerTaskHoursVar getAntecedentLayerTaskHoursVar();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHours#getAntecedentLayerTaskHoursVar <em>Antecedent Layer Task Hours Var</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antecedent Layer Task Hours Var</em>' reference.
	 * @see #getAntecedentLayerTaskHoursVar()
	 * @generated
	 */
	void setAntecedentLayerTaskHoursVar(LayerTaskHoursVar value);

} // LayerTaskHours
