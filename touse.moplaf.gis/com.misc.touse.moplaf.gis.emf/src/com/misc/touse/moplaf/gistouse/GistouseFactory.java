/**
 */
package com.misc.touse.moplaf.gistouse;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.touse.moplaf.gistouse.GistousePackage
 * @generated
 */
public interface GistouseFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GistouseFactory eINSTANCE = com.misc.touse.moplaf.gistouse.impl.GistouseFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>To Use Gis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>To Use Gis</em>'.
	 * @generated
	 */
	ToUseGis createToUseGis();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GistousePackage getGistousePackage();

} //GistouseFactory
