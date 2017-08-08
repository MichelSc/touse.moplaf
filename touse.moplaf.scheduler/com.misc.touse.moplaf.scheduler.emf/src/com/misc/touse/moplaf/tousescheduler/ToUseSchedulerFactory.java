/**
 */
package com.misc.touse.moplaf.tousescheduler;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage
 * @generated
 */
public interface ToUseSchedulerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToUseSchedulerFactory eINSTANCE = com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain</em>'.
	 * @generated
	 */
	Domain createDomain();

	/**
	 * Returns a new object of class '<em>To Use Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>To Use Scheduler</em>'.
	 * @generated
	 */
	ToUseScheduler createToUseScheduler();

	/**
	 * Returns a new object of class '<em>To Use Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>To Use Task</em>'.
	 * @generated
	 */
	ToUseTask createToUseTask();

	/**
	 * Returns a new object of class '<em>To Use Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>To Use Resource</em>'.
	 * @generated
	 */
	ToUseResource createToUseResource();

	/**
	 * Returns a new object of class '<em>To Use Solution Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>To Use Solution Task</em>'.
	 * @generated
	 */
	ToUseSolutionTask createToUseSolutionTask();

	/**
	 * Returns a new object of class '<em>To Use Solution Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>To Use Solution Resource</em>'.
	 * @generated
	 */
	ToUseSolutionResource createToUseSolutionResource();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ToUseSchedulerPackage getToUseSchedulerPackage();

} //ToUseSchedulerFactory
