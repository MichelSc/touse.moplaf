/**
 */
package com.misc.touse.moplaf.touseflock;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.touse.moplaf.touseflock.TouseflockPackage
 * @generated
 */
public interface TouseflockFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TouseflockFactory eINSTANCE = com.misc.touse.moplaf.touseflock.impl.TouseflockFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>To Use Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>To Use Domain</em>'.
	 * @generated
	 */
	ToUseDomain createToUseDomain();

	/**
	 * Returns a new object of class '<em>Tractor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tractor</em>'.
	 * @generated
	 */
	Tractor createTractor();

	/**
	 * Returns a new object of class '<em>To Use Resource Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>To Use Resource Transition</em>'.
	 * @generated
	 */
	ToUseResourceTransition createToUseResourceTransition();

	/**
	 * Returns a new object of class '<em>To Use Resource Mount</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>To Use Resource Mount</em>'.
	 * @generated
	 */
	ToUseResourceMount createToUseResourceMount();

	/**
	 * Returns a new object of class '<em>To Use Resource Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>To Use Resource Configuration</em>'.
	 * @generated
	 */
	ToUseResourceConfiguration createToUseResourceConfiguration();

	/**
	 * Returns a new object of class '<em>Trailer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trailer</em>'.
	 * @generated
	 */
	Trailer createTrailer();

	/**
	 * Returns a new object of class '<em>Shipment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shipment</em>'.
	 * @generated
	 */
	Shipment createShipment();

	/**
	 * Returns a new object of class '<em>Attach Trailer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attach Trailer</em>'.
	 * @generated
	 */
	AttachTrailer createAttachTrailer();

	/**
	 * Returns a new object of class '<em>Detach Trailer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Detach Trailer</em>'.
	 * @generated
	 */
	DetachTrailer createDetachTrailer();

	/**
	 * Returns a new object of class '<em>Load Shipment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load Shipment</em>'.
	 * @generated
	 */
	LoadShipment createLoadShipment();

	/**
	 * Returns a new object of class '<em>Unload Shipment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unload Shipment</em>'.
	 * @generated
	 */
	UnloadShipment createUnloadShipment();

	/**
	 * Returns a new object of class '<em>To Use Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>To Use Location</em>'.
	 * @generated
	 */
	ToUseLocation createToUseLocation();

	/**
	 * Returns a new object of class '<em>Flock Scope To Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flock Scope To Use</em>'.
	 * @generated
	 */
	FlockScopeToUse createFlockScopeToUse();

	/**
	 * Returns a new object of class '<em>Tractor Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tractor Configuration</em>'.
	 * @generated
	 */
	TractorConfiguration createTractorConfiguration();

	/**
	 * Returns a new object of class '<em>Trailer Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trailer Configuration</em>'.
	 * @generated
	 */
	TrailerConfiguration createTrailerConfiguration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TouseflockPackage getTouseflockPackage();

} //TouseflockFactory
