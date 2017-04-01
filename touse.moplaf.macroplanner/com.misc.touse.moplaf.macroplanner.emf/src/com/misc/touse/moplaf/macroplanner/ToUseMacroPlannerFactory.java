/**
 */
package com.misc.touse.moplaf.macroplanner;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.touse.moplaf.macroplanner.ToUseMacroPlannerPackage
 * @generated
 */
public interface ToUseMacroPlannerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToUseMacroPlannerFactory eINSTANCE = com.misc.touse.moplaf.macroplanner.impl.ToUseMacroPlannerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain</em>'.
	 * @generated
	 */
	Domain createDomain();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ToUseMacroPlannerPackage getToUseMacroPlannerPackage();

} //ToUseMacroPlannerFactory
