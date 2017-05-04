/**
 */
package com.misc.tools.moplaf.model.overview;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.tools.moplaf.model.overview.ModelOverviewPackage
 * @generated
 */
public interface ModelOverviewFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelOverviewFactory eINSTANCE = com.misc.tools.moplaf.model.overview.impl.ModelOverviewFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Overviews</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Overviews</em>'.
	 * @generated
	 */
	Overviews createOverviews();

	/**
	 * Returns a new object of class '<em>Overview Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Overview Object</em>'.
	 * @generated
	 */
	OverviewObject createOverviewObject();

	/**
	 * Returns a new object of class '<em>Overview Count</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Overview Count</em>'.
	 * @generated
	 */
	OverviewCount createOverviewCount();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelOverviewPackage getModelOverviewPackage();

} //ModelOverviewFactory
