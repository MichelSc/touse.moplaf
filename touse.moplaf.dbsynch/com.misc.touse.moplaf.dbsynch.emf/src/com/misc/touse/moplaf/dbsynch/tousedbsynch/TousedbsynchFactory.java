/**
 */
package com.misc.touse.moplaf.dbsynch.tousedbsynch;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.TousedbsynchPackage
 * @generated
 */
public interface TousedbsynchFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TousedbsynchFactory eINSTANCE = com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.TousedbsynchFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>FPD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FPD</em>'.
	 * @generated
	 */
	FPD createFPD();

	/**
	 * Returns a new object of class '<em>FPD Group Sorting Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FPD Group Sorting Plan</em>'.
	 * @generated
	 */
	FPDGroupSortingPlan createFPDGroupSortingPlan();

	/**
	 * Returns a new object of class '<em>FPD Sorting Plans</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FPD Sorting Plans</em>'.
	 * @generated
	 */
	FPDSortingPlans createFPDSortingPlans();

	/**
	 * Returns a new object of class '<em>FPD Sorting Plan Inputs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FPD Sorting Plan Inputs</em>'.
	 * @generated
	 */
	FPDSortingPlanInputs createFPDSortingPlanInputs();

	/**
	 * Returns a new object of class '<em>FPD Sorting Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FPD Sorting Plan</em>'.
	 * @generated
	 */
	FPDSortingPlan createFPDSortingPlan();

	/**
	 * Returns a new object of class '<em>FPD Sorting Plan Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FPD Sorting Plan Input</em>'.
	 * @generated
	 */
	FPDSortingPlanInput createFPDSortingPlanInput();

	/**
	 * Returns a new object of class '<em>FPD My Sql</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FPD My Sql</em>'.
	 * @generated
	 */
	FPDMySql createFPDMySql();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TousedbsynchPackage getTousedbsynchPackage();

} //TousedbsynchFactory
