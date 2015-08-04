/**
 */
package com.misc.touse.moplaf.solver.tousesolverlp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.touse.moplaf.solver.tousesolverlp.ToUseSolverLpPackage
 * @generated
 */
public interface ToUseSolverLpFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToUseSolverLpFactory eINSTANCE = com.misc.touse.moplaf.solver.tousesolverlp.impl.ToUseSolverLpFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Folder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Folder</em>'.
	 * @generated
	 */
	Folder createFolder();

	/**
	 * Returns a new object of class '<em>To Use Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>To Use Generator</em>'.
	 * @generated
	 */
	ToUseGenerator createToUseGenerator();

	/**
	 * Returns a new object of class '<em>To Use Tuple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>To Use Tuple</em>'.
	 * @generated
	 */
	ToUseTuple createToUseTuple();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ToUseSolverLpPackage getToUseSolverLpPackage();

} //ToUseSolverLpFactory
