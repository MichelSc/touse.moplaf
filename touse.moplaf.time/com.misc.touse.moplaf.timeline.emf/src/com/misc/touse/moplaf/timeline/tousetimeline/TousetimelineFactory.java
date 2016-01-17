/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage
 * @generated
 */
public interface TousetimelineFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TousetimelineFactory eINSTANCE = com.misc.touse.moplaf.timeline.tousetimeline.impl.TousetimelineFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain</em>'.
	 * @generated
	 */
	Domain createDomain();

	/**
	 * Returns a new object of class '<em>Domain Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Distribution</em>'.
	 * @generated
	 */
	DomainDistribution createDomainDistribution();

	/**
	 * Returns a new object of class '<em>Function Minimum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Minimum</em>'.
	 * @generated
	 */
	FunctionMinimum createFunctionMinimum();

	/**
	 * Returns a new object of class '<em>Function Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Interval</em>'.
	 * @generated
	 */
	FunctionInterval createFunctionInterval();

	/**
	 * Returns a new object of class '<em>Function Cumulated</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Cumulated</em>'.
	 * @generated
	 */
	FunctionCumulated createFunctionCumulated();

	/**
	 * Returns a new object of class '<em>Function Average</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Average</em>'.
	 * @generated
	 */
	FunctionAverage createFunctionAverage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TousetimelinePackage getTousetimelinePackage();

} //TousetimelineFactory
