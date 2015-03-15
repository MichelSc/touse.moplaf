/**
 */
package com.misc.touse.moplaf.touseflock.impl;

import com.misc.touse.moplaf.touseflock.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TouseflockFactoryImpl extends EFactoryImpl implements TouseflockFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TouseflockFactory init() {
		try {
			TouseflockFactory theTouseflockFactory = (TouseflockFactory)EPackage.Registry.INSTANCE.getEFactory(TouseflockPackage.eNS_URI);
			if (theTouseflockFactory != null) {
				return theTouseflockFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TouseflockFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouseflockFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TouseflockPackage.TO_USE_DOMAIN: return createToUseDomain();
			case TouseflockPackage.TO_USE_RESOURCE_TRANSITION: return createToUseResourceTransition();
			case TouseflockPackage.TO_USE_RESOURCE_CONFIGURATION: return createToUseResourceConfiguration();
			case TouseflockPackage.TO_USE_RESOURCE_MOUNT: return createToUseResourceMount();
			case TouseflockPackage.TRACTOR: return createTractor();
			case TouseflockPackage.TRAILER: return createTrailer();
			case TouseflockPackage.SHIPMENT: return createShipment();
			case TouseflockPackage.TRACTOR_CONFIGURATION: return createTractorConfiguration();
			case TouseflockPackage.ATTACH_TRAILER: return createAttachTrailer();
			case TouseflockPackage.DETACH_TRAILER: return createDetachTrailer();
			case TouseflockPackage.TRAILER_CONFIGURATION: return createTrailerConfiguration();
			case TouseflockPackage.LOAD_SHIPMENT: return createLoadShipment();
			case TouseflockPackage.UNLOAD_SHIPMENT: return createUnloadShipment();
			case TouseflockPackage.TO_USE_LOCATION: return createToUseLocation();
			case TouseflockPackage.FLOCK_SCOPE_TO_USE: return createFlockScopeToUse();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseDomain createToUseDomain() {
		ToUseDomainImpl toUseDomain = new ToUseDomainImpl();
		return toUseDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tractor createTractor() {
		TractorImpl tractor = new TractorImpl();
		return tractor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseResourceTransition createToUseResourceTransition() {
		ToUseResourceTransitionImpl toUseResourceTransition = new ToUseResourceTransitionImpl();
		return toUseResourceTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseResourceMount createToUseResourceMount() {
		ToUseResourceMountImpl toUseResourceMount = new ToUseResourceMountImpl();
		return toUseResourceMount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseResourceConfiguration createToUseResourceConfiguration() {
		ToUseResourceConfigurationImpl toUseResourceConfiguration = new ToUseResourceConfigurationImpl();
		return toUseResourceConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trailer createTrailer() {
		TrailerImpl trailer = new TrailerImpl();
		return trailer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shipment createShipment() {
		ShipmentImpl shipment = new ShipmentImpl();
		return shipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachTrailer createAttachTrailer() {
		AttachTrailerImpl attachTrailer = new AttachTrailerImpl();
		return attachTrailer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetachTrailer createDetachTrailer() {
		DetachTrailerImpl detachTrailer = new DetachTrailerImpl();
		return detachTrailer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadShipment createLoadShipment() {
		LoadShipmentImpl loadShipment = new LoadShipmentImpl();
		return loadShipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnloadShipment createUnloadShipment() {
		UnloadShipmentImpl unloadShipment = new UnloadShipmentImpl();
		return unloadShipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseLocation createToUseLocation() {
		ToUseLocationImpl toUseLocation = new ToUseLocationImpl();
		return toUseLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlockScopeToUse createFlockScopeToUse() {
		FlockScopeToUseImpl flockScopeToUse = new FlockScopeToUseImpl();
		return flockScopeToUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TractorConfiguration createTractorConfiguration() {
		TractorConfigurationImpl tractorConfiguration = new TractorConfigurationImpl();
		return tractorConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrailerConfiguration createTrailerConfiguration() {
		TrailerConfigurationImpl trailerConfiguration = new TrailerConfigurationImpl();
		return trailerConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouseflockPackage getTouseflockPackage() {
		return (TouseflockPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TouseflockPackage getPackage() {
		return TouseflockPackage.eINSTANCE;
	}

} //TouseflockFactoryImpl
