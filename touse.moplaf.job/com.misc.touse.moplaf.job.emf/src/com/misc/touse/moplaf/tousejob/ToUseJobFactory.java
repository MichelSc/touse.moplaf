/**
 */
package com.misc.touse.moplaf.tousejob;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.touse.moplaf.tousejob.ToUseJobPackage
 * @generated
 */
public interface ToUseJobFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToUseJobFactory eINSTANCE = com.misc.touse.moplaf.tousejob.impl.ToUseJobFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain</em>'.
	 * @generated
	 */
	Domain createDomain();

	/**
	 * Returns a new object of class '<em>To Use Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>To Use Job</em>'.
	 * @generated
	 */
	ToUseJob createToUseJob();

	/**
	 * Returns a new object of class '<em>Console</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Console</em>'.
	 * @generated
	 */
	ToUseJobConsole createToUseJobConsole();

	/**
	 * Returns a new object of class '<em>Runs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Runs</em>'.
	 * @generated
	 */
	Runs createRuns();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ToUseJobPackage getToUseJobPackage();

} //ToUseJobFactory
