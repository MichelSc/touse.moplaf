/**
 */
package com.misc.touse.moplaf.tousepropagator2.calc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcPackage
 * @generated
 */
public interface CalcFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CalcFactory eINSTANCE = com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Task Start</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Start</em>'.
	 * @generated
	 */
	CalcTaskStart createCalcTaskStart();

	/**
	 * Returns a new object of class '<em>Task End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task End</em>'.
	 * @generated
	 */
	CalcTaskEnd createCalcTaskEnd();

	/**
	 * Returns a new object of class '<em>Task Resources</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Resources</em>'.
	 * @generated
	 */
	CalcTaskResources createCalcTaskResources();

	/**
	 * Returns a new object of class '<em>Project End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project End</em>'.
	 * @generated
	 */
	CalcProjectEnd createCalcProjectEnd();

	/**
	 * Returns a new object of class '<em>Layer Task Resources</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layer Task Resources</em>'.
	 * @generated
	 */
	LayerTaskResources createLayerTaskResources();

	/**
	 * Returns a new object of class '<em>To Use Propagator Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>To Use Propagator Function</em>'.
	 * @generated
	 */
	ToUsePropagatorFunction createToUsePropagatorFunction();

	/**
	 * Returns a new object of class '<em>Layer Task Times</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layer Task Times</em>'.
	 * @generated
	 */
	LayerTaskTimes createLayerTaskTimes();

	/**
	 * Returns a new object of class '<em>Task Hours Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Hours Item</em>'.
	 * @generated
	 */
	CalcTaskHoursItem createCalcTaskHoursItem();

	/**
	 * Returns a new object of class '<em>Task Hours Var</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Hours Var</em>'.
	 * @generated
	 */
	CalcTaskHoursVar createCalcTaskHoursVar();

	/**
	 * Returns a new object of class '<em>Task Hours</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Hours</em>'.
	 * @generated
	 */
	CalcTaskHours createCalcTaskHours();

	/**
	 * Returns a new object of class '<em>Scope Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scope Project</em>'.
	 * @generated
	 */
	ScopeProject createScopeProject();

	/**
	 * Returns a new object of class '<em>Layer Task Hours Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layer Task Hours Item</em>'.
	 * @generated
	 */
	LayerTaskHoursItem createLayerTaskHoursItem();

	/**
	 * Returns a new object of class '<em>Layer Task Hours Var</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layer Task Hours Var</em>'.
	 * @generated
	 */
	LayerTaskHoursVar createLayerTaskHoursVar();

	/**
	 * Returns a new object of class '<em>Layer Task Hours</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layer Task Hours</em>'.
	 * @generated
	 */
	LayerTaskHours createLayerTaskHours();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CalcPackage getCalcPackage();

} //CalcFactory
