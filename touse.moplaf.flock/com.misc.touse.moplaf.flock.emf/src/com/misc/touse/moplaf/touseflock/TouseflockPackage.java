/**
 */
package com.misc.touse.moplaf.touseflock;

import com.misc.common.moplaf.flock.FlockPackage;

import com.misc.common.moplaf.propagator.PropagatorPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.misc.touse.moplaf.touseflock.TouseflockFactory
 * @model kind="package"
 * @generated
 */
public interface TouseflockPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "touseflock";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.misc.touse.moplaf.flock.emf";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tufl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TouseflockPackage eINSTANCE = com.misc.touse.moplaf.touseflock.impl.TouseflockPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.touseflock.impl.ToUseDomainImpl <em>To Use Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.touseflock.impl.ToUseDomainImpl
	 * @see com.misc.touse.moplaf.touseflock.impl.TouseflockPackageImpl#getToUseDomain()
	 * @generated
	 */
	int TO_USE_DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_DOMAIN__LOCATION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_DOMAIN__RESOURCE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Flock Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_DOMAIN__FLOCK_SCOPE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>To Use Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_DOMAIN_FEATURE_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Add Propagator Function Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_DOMAIN___ADD_PROPAGATOR_FUNCTION_ADAPTER = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER___ADD_PROPAGATOR_FUNCTION_ADAPTER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_DOMAIN___REFRESH = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>To Use Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_DOMAIN_OPERATION_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.touseflock.impl.ToUseResourceImpl <em>To Use Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.touseflock.impl.ToUseResourceImpl
	 * @see com.misc.touse.moplaf.touseflock.impl.TouseflockPackageImpl#getToUseResource()
	 * @generated
	 */
	int TO_USE_RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_RESOURCE__DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_RESOURCE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Chain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_RESOURCE__CHAIN = 2;

	/**
	 * The number of structural features of the '<em>To Use Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_RESOURCE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Refresh Chain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_RESOURCE___REFRESH_CHAIN = 0;

	/**
	 * The number of operations of the '<em>To Use Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_RESOURCE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.touseflock.impl.TractorImpl <em>Tractor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.touseflock.impl.TractorImpl
	 * @see com.misc.touse.moplaf.touseflock.impl.TouseflockPackageImpl#getTractor()
	 * @generated
	 */
	int TRACTOR = 5;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.touseflock.impl.TrailerImpl <em>Trailer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.touseflock.impl.TrailerImpl
	 * @see com.misc.touse.moplaf.touseflock.impl.TouseflockPackageImpl#getTrailer()
	 * @generated
	 */
	int TRAILER = 6;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.touseflock.impl.ShipmentImpl <em>Shipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.touseflock.impl.ShipmentImpl
	 * @see com.misc.touse.moplaf.touseflock.impl.TouseflockPackageImpl#getShipment()
	 * @generated
	 */
	int SHIPMENT = 7;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.touseflock.impl.AttachTrailerImpl <em>Attach Trailer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.touseflock.impl.AttachTrailerImpl
	 * @see com.misc.touse.moplaf.touseflock.impl.TouseflockPackageImpl#getAttachTrailer()
	 * @generated
	 */
	int ATTACH_TRAILER = 9;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.touseflock.impl.DetachTrailerImpl <em>Detach Trailer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.touseflock.impl.DetachTrailerImpl
	 * @see com.misc.touse.moplaf.touseflock.impl.TouseflockPackageImpl#getDetachTrailer()
	 * @generated
	 */
	int DETACH_TRAILER = 10;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.touseflock.impl.LoadShipmentImpl <em>Load Shipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.touseflock.impl.LoadShipmentImpl
	 * @see com.misc.touse.moplaf.touseflock.impl.TouseflockPackageImpl#getLoadShipment()
	 * @generated
	 */
	int LOAD_SHIPMENT = 12;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.touseflock.impl.UnloadShipmentImpl <em>Unload Shipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.touseflock.impl.UnloadShipmentImpl
	 * @see com.misc.touse.moplaf.touseflock.impl.TouseflockPackageImpl#getUnloadShipment()
	 * @generated
	 */
	int UNLOAD_SHIPMENT = 13;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.touseflock.impl.ToUseLocationImpl <em>To Use Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.touseflock.impl.ToUseLocationImpl
	 * @see com.misc.touse.moplaf.touseflock.impl.TouseflockPackageImpl#getToUseLocation()
	 * @generated
	 */
	int TO_USE_LOCATION = 14;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.touseflock.impl.TractorConfigurationImpl <em>Tractor Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.touseflock.impl.TractorConfigurationImpl
	 * @see com.misc.touse.moplaf.touseflock.impl.TouseflockPackageImpl#getTractorConfiguration()
	 * @generated
	 */
	int TRACTOR_CONFIGURATION = 8;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.touseflock.impl.TrailerConfigurationImpl <em>Trailer Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.touseflock.impl.TrailerConfigurationImpl
	 * @see com.misc.touse.moplaf.touseflock.impl.TouseflockPackageImpl#getTrailerConfiguration()
	 * @generated
	 */
	int TRAILER_CONFIGURATION = 11;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.touseflock.impl.ToUseResourceTransitionImpl <em>To Use Resource Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.touseflock.impl.ToUseResourceTransitionImpl
	 * @see com.misc.touse.moplaf.touseflock.impl.TouseflockPackageImpl#getToUseResourceTransition()
	 * @generated
	 */
	int TO_USE_RESOURCE_TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_RESOURCE_TRANSITION__COMMENTS = 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_RESOURCE_TRANSITION__RESOURCE = 1;

	/**
	 * The number of structural features of the '<em>To Use Resource Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_RESOURCE_TRANSITION_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Refresh Resource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_RESOURCE_TRANSITION___REFRESH_RESOURCE = 0;

	/**
	 * The number of operations of the '<em>To Use Resource Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_RESOURCE_TRANSITION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.touseflock.impl.ToUseResourceMountImpl <em>To Use Resource Mount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.touseflock.impl.ToUseResourceMountImpl
	 * @see com.misc.touse.moplaf.touseflock.impl.TouseflockPackageImpl#getToUseResourceMount()
	 * @generated
	 */
	int TO_USE_RESOURCE_MOUNT = 4;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.touseflock.impl.ToUseResourceConfigurationImpl <em>To Use Resource Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.touseflock.impl.ToUseResourceConfigurationImpl
	 * @see com.misc.touse.moplaf.touseflock.impl.TouseflockPackageImpl#getToUseResourceConfiguration()
	 * @generated
	 */
	int TO_USE_RESOURCE_CONFIGURATION = 3;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_RESOURCE_CONFIGURATION__COMMENTS = TO_USE_RESOURCE_TRANSITION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_RESOURCE_CONFIGURATION__RESOURCE = TO_USE_RESOURCE_TRANSITION__RESOURCE;

	/**
	 * The feature id for the '<em><b>Chain Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_RESOURCE_CONFIGURATION__CHAIN_CONFIGURATION = TO_USE_RESOURCE_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>To Use Resource Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_RESOURCE_CONFIGURATION_FEATURE_COUNT = TO_USE_RESOURCE_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Refresh Resource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_RESOURCE_CONFIGURATION___REFRESH_RESOURCE = TO_USE_RESOURCE_TRANSITION___REFRESH_RESOURCE;

	/**
	 * The operation id for the '<em>Refresh Chain Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_RESOURCE_CONFIGURATION___REFRESH_CHAIN_CONFIGURATION = TO_USE_RESOURCE_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>To Use Resource Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_RESOURCE_CONFIGURATION_OPERATION_COUNT = TO_USE_RESOURCE_TRANSITION_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_RESOURCE_MOUNT__COMMENTS = TO_USE_RESOURCE_TRANSITION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_RESOURCE_MOUNT__RESOURCE = TO_USE_RESOURCE_TRANSITION__RESOURCE;

	/**
	 * The feature id for the '<em><b>Chain Mount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_RESOURCE_MOUNT__CHAIN_MOUNT = TO_USE_RESOURCE_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>To Use Resource Mount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_RESOURCE_MOUNT_FEATURE_COUNT = TO_USE_RESOURCE_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Refresh Resource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_RESOURCE_MOUNT___REFRESH_RESOURCE = TO_USE_RESOURCE_TRANSITION___REFRESH_RESOURCE;

	/**
	 * The operation id for the '<em>Refresh Chain Mount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_RESOURCE_MOUNT___REFRESH_CHAIN_MOUNT = TO_USE_RESOURCE_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>To Use Resource Mount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_RESOURCE_MOUNT_OPERATION_COUNT = TO_USE_RESOURCE_TRANSITION_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACTOR__DOMAIN = TO_USE_RESOURCE__DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACTOR__NAME = TO_USE_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Chain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACTOR__CHAIN = TO_USE_RESOURCE__CHAIN;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACTOR__CONFIGURATION = TO_USE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tractor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACTOR_FEATURE_COUNT = TO_USE_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Refresh Chain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACTOR___REFRESH_CHAIN = TO_USE_RESOURCE___REFRESH_CHAIN;

	/**
	 * The number of operations of the '<em>Tractor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACTOR_OPERATION_COUNT = TO_USE_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAILER__DOMAIN = TO_USE_RESOURCE__DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAILER__NAME = TO_USE_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Chain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAILER__CHAIN = TO_USE_RESOURCE__CHAIN;

	/**
	 * The feature id for the '<em><b>Detach</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAILER__DETACH = TO_USE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attach</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAILER__ATTACH = TO_USE_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAILER__CONFIGURATION = TO_USE_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Trailer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAILER_FEATURE_COUNT = TO_USE_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Refresh Chain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAILER___REFRESH_CHAIN = TO_USE_RESOURCE___REFRESH_CHAIN;

	/**
	 * The number of operations of the '<em>Trailer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAILER_OPERATION_COUNT = TO_USE_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__DOMAIN = TO_USE_RESOURCE__DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__NAME = TO_USE_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Chain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__CHAIN = TO_USE_RESOURCE__CHAIN;

	/**
	 * The feature id for the '<em><b>Load</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__LOAD = TO_USE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unload</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__UNLOAD = TO_USE_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_FEATURE_COUNT = TO_USE_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Refresh Chain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT___REFRESH_CHAIN = TO_USE_RESOURCE___REFRESH_CHAIN;

	/**
	 * The number of operations of the '<em>Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_OPERATION_COUNT = TO_USE_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.touseflock.impl.FlockScopeToUseImpl <em>Flock Scope To Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.touseflock.impl.FlockScopeToUseImpl
	 * @see com.misc.touse.moplaf.touseflock.impl.TouseflockPackageImpl#getFlockScopeToUse()
	 * @generated
	 */
	int FLOCK_SCOPE_TO_USE = 15;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACTOR_CONFIGURATION__COMMENTS = TO_USE_RESOURCE_CONFIGURATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACTOR_CONFIGURATION__RESOURCE = TO_USE_RESOURCE_CONFIGURATION__RESOURCE;

	/**
	 * The feature id for the '<em><b>Chain Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACTOR_CONFIGURATION__CHAIN_CONFIGURATION = TO_USE_RESOURCE_CONFIGURATION__CHAIN_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Tractor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACTOR_CONFIGURATION__TRACTOR = TO_USE_RESOURCE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tractor Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACTOR_CONFIGURATION_FEATURE_COUNT = TO_USE_RESOURCE_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Refresh Resource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACTOR_CONFIGURATION___REFRESH_RESOURCE = TO_USE_RESOURCE_CONFIGURATION___REFRESH_RESOURCE;

	/**
	 * The operation id for the '<em>Refresh Chain Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACTOR_CONFIGURATION___REFRESH_CHAIN_CONFIGURATION = TO_USE_RESOURCE_CONFIGURATION___REFRESH_CHAIN_CONFIGURATION;

	/**
	 * The number of operations of the '<em>Tractor Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACTOR_CONFIGURATION_OPERATION_COUNT = TO_USE_RESOURCE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_TRAILER__COMMENTS = TO_USE_RESOURCE_MOUNT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_TRAILER__RESOURCE = TO_USE_RESOURCE_MOUNT__RESOURCE;

	/**
	 * The feature id for the '<em><b>Chain Mount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_TRAILER__CHAIN_MOUNT = TO_USE_RESOURCE_MOUNT__CHAIN_MOUNT;

	/**
	 * The feature id for the '<em><b>Trailer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_TRAILER__TRAILER = TO_USE_RESOURCE_MOUNT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attach Trailer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_TRAILER_FEATURE_COUNT = TO_USE_RESOURCE_MOUNT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Refresh Resource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_TRAILER___REFRESH_RESOURCE = TO_USE_RESOURCE_MOUNT___REFRESH_RESOURCE;

	/**
	 * The operation id for the '<em>Refresh Chain Mount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_TRAILER___REFRESH_CHAIN_MOUNT = TO_USE_RESOURCE_MOUNT___REFRESH_CHAIN_MOUNT;

	/**
	 * The number of operations of the '<em>Attach Trailer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_TRAILER_OPERATION_COUNT = TO_USE_RESOURCE_MOUNT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETACH_TRAILER__COMMENTS = TO_USE_RESOURCE_MOUNT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETACH_TRAILER__RESOURCE = TO_USE_RESOURCE_MOUNT__RESOURCE;

	/**
	 * The feature id for the '<em><b>Chain Mount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETACH_TRAILER__CHAIN_MOUNT = TO_USE_RESOURCE_MOUNT__CHAIN_MOUNT;

	/**
	 * The feature id for the '<em><b>Trailer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETACH_TRAILER__TRAILER = TO_USE_RESOURCE_MOUNT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Detach Trailer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETACH_TRAILER_FEATURE_COUNT = TO_USE_RESOURCE_MOUNT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Refresh Resource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETACH_TRAILER___REFRESH_RESOURCE = TO_USE_RESOURCE_MOUNT___REFRESH_RESOURCE;

	/**
	 * The operation id for the '<em>Refresh Chain Mount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETACH_TRAILER___REFRESH_CHAIN_MOUNT = TO_USE_RESOURCE_MOUNT___REFRESH_CHAIN_MOUNT;

	/**
	 * The number of operations of the '<em>Detach Trailer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETACH_TRAILER_OPERATION_COUNT = TO_USE_RESOURCE_MOUNT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAILER_CONFIGURATION__COMMENTS = TO_USE_RESOURCE_CONFIGURATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAILER_CONFIGURATION__RESOURCE = TO_USE_RESOURCE_CONFIGURATION__RESOURCE;

	/**
	 * The feature id for the '<em><b>Chain Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAILER_CONFIGURATION__CHAIN_CONFIGURATION = TO_USE_RESOURCE_CONFIGURATION__CHAIN_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Trailer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAILER_CONFIGURATION__TRAILER = TO_USE_RESOURCE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trailer Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAILER_CONFIGURATION_FEATURE_COUNT = TO_USE_RESOURCE_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Refresh Resource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAILER_CONFIGURATION___REFRESH_RESOURCE = TO_USE_RESOURCE_CONFIGURATION___REFRESH_RESOURCE;

	/**
	 * The operation id for the '<em>Refresh Chain Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAILER_CONFIGURATION___REFRESH_CHAIN_CONFIGURATION = TO_USE_RESOURCE_CONFIGURATION___REFRESH_CHAIN_CONFIGURATION;

	/**
	 * The number of operations of the '<em>Trailer Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAILER_CONFIGURATION_OPERATION_COUNT = TO_USE_RESOURCE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SHIPMENT__COMMENTS = TO_USE_RESOURCE_MOUNT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SHIPMENT__RESOURCE = TO_USE_RESOURCE_MOUNT__RESOURCE;

	/**
	 * The feature id for the '<em><b>Chain Mount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SHIPMENT__CHAIN_MOUNT = TO_USE_RESOURCE_MOUNT__CHAIN_MOUNT;

	/**
	 * The feature id for the '<em><b>Shipment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SHIPMENT__SHIPMENT = TO_USE_RESOURCE_MOUNT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Load Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SHIPMENT_FEATURE_COUNT = TO_USE_RESOURCE_MOUNT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Refresh Resource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SHIPMENT___REFRESH_RESOURCE = TO_USE_RESOURCE_MOUNT___REFRESH_RESOURCE;

	/**
	 * The operation id for the '<em>Refresh Chain Mount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SHIPMENT___REFRESH_CHAIN_MOUNT = TO_USE_RESOURCE_MOUNT___REFRESH_CHAIN_MOUNT;

	/**
	 * The number of operations of the '<em>Load Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SHIPMENT_OPERATION_COUNT = TO_USE_RESOURCE_MOUNT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLOAD_SHIPMENT__COMMENTS = TO_USE_RESOURCE_MOUNT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLOAD_SHIPMENT__RESOURCE = TO_USE_RESOURCE_MOUNT__RESOURCE;

	/**
	 * The feature id for the '<em><b>Chain Mount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLOAD_SHIPMENT__CHAIN_MOUNT = TO_USE_RESOURCE_MOUNT__CHAIN_MOUNT;

	/**
	 * The feature id for the '<em><b>Shipment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLOAD_SHIPMENT__SHIPMENT = TO_USE_RESOURCE_MOUNT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unload Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLOAD_SHIPMENT_FEATURE_COUNT = TO_USE_RESOURCE_MOUNT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Refresh Resource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLOAD_SHIPMENT___REFRESH_RESOURCE = TO_USE_RESOURCE_MOUNT___REFRESH_RESOURCE;

	/**
	 * The operation id for the '<em>Refresh Chain Mount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLOAD_SHIPMENT___REFRESH_CHAIN_MOUNT = TO_USE_RESOURCE_MOUNT___REFRESH_CHAIN_MOUNT;

	/**
	 * The number of operations of the '<em>Unload Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLOAD_SHIPMENT_OPERATION_COUNT = TO_USE_RESOURCE_MOUNT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LOCATION__NAME = FlockPackage.LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>To Use Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LOCATION_FEATURE_COUNT = FlockPackage.LOCATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>To Use Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LOCATION_OPERATION_COUNT = FlockPackage.LOCATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Chains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_SCOPE_TO_USE__CHAINS = FlockPackage.FLOCK_SCOPE__CHAINS;

	/**
	 * The feature id for the '<em><b>Flocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_SCOPE_TO_USE__FLOCKS = FlockPackage.FLOCK_SCOPE__FLOCKS;

	/**
	 * The feature id for the '<em><b>To Use Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_SCOPE_TO_USE__TO_USE_DOMAIN = FlockPackage.FLOCK_SCOPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Flock Scope To Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_SCOPE_TO_USE_FEATURE_COUNT = FlockPackage.FLOCK_SCOPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Refresh Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_SCOPE_TO_USE___REFRESH_CONFIGURATION = FlockPackage.FLOCK_SCOPE___REFRESH_CONFIGURATION;

	/**
	 * The operation id for the '<em>Refresh Moves</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_SCOPE_TO_USE___REFRESH_MOVES = FlockPackage.FLOCK_SCOPE___REFRESH_MOVES;

	/**
	 * The operation id for the '<em>Refresh Idles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_SCOPE_TO_USE___REFRESH_IDLES = FlockPackage.FLOCK_SCOPE___REFRESH_IDLES;

	/**
	 * The number of operations of the '<em>Flock Scope To Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOCK_SCOPE_TO_USE_OPERATION_COUNT = FlockPackage.FLOCK_SCOPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.touseflock.ToUseDomain <em>To Use Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Use Domain</em>'.
	 * @see com.misc.touse.moplaf.touseflock.ToUseDomain
	 * @generated
	 */
	EClass getToUseDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.touseflock.ToUseDomain#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Location</em>'.
	 * @see com.misc.touse.moplaf.touseflock.ToUseDomain#getLocation()
	 * @see #getToUseDomain()
	 * @generated
	 */
	EReference getToUseDomain_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.touseflock.ToUseDomain#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource</em>'.
	 * @see com.misc.touse.moplaf.touseflock.ToUseDomain#getResource()
	 * @see #getToUseDomain()
	 * @generated
	 */
	EReference getToUseDomain_Resource();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.touse.moplaf.touseflock.ToUseDomain#getFlockScope <em>Flock Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flock Scope</em>'.
	 * @see com.misc.touse.moplaf.touseflock.ToUseDomain#getFlockScope()
	 * @see #getToUseDomain()
	 * @generated
	 */
	EReference getToUseDomain_FlockScope();

	/**
	 * Returns the meta object for the '{@link com.misc.touse.moplaf.touseflock.ToUseDomain#refresh() <em>Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh</em>' operation.
	 * @see com.misc.touse.moplaf.touseflock.ToUseDomain#refresh()
	 * @generated
	 */
	EOperation getToUseDomain__Refresh();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.touseflock.ToUseResource <em>To Use Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Use Resource</em>'.
	 * @see com.misc.touse.moplaf.touseflock.ToUseResource
	 * @generated
	 */
	EClass getToUseResource();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.touse.moplaf.touseflock.ToUseResource#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Domain</em>'.
	 * @see com.misc.touse.moplaf.touseflock.ToUseResource#getDomain()
	 * @see #getToUseResource()
	 * @generated
	 */
	EReference getToUseResource_Domain();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.touseflock.ToUseResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.touse.moplaf.touseflock.ToUseResource#getName()
	 * @see #getToUseResource()
	 * @generated
	 */
	EAttribute getToUseResource_Name();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.touse.moplaf.touseflock.ToUseResource#getChain <em>Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Chain</em>'.
	 * @see com.misc.touse.moplaf.touseflock.ToUseResource#getChain()
	 * @see #getToUseResource()
	 * @generated
	 */
	EReference getToUseResource_Chain();

	/**
	 * Returns the meta object for the '{@link com.misc.touse.moplaf.touseflock.ToUseResource#refreshChain() <em>Refresh Chain</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Chain</em>' operation.
	 * @see com.misc.touse.moplaf.touseflock.ToUseResource#refreshChain()
	 * @generated
	 */
	EOperation getToUseResource__RefreshChain();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.touseflock.Tractor <em>Tractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tractor</em>'.
	 * @see com.misc.touse.moplaf.touseflock.Tractor
	 * @generated
	 */
	EClass getTractor();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.touseflock.Tractor#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configuration</em>'.
	 * @see com.misc.touse.moplaf.touseflock.Tractor#getConfiguration()
	 * @see #getTractor()
	 * @generated
	 */
	EReference getTractor_Configuration();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.touseflock.ToUseResourceTransition <em>To Use Resource Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Use Resource Transition</em>'.
	 * @see com.misc.touse.moplaf.touseflock.ToUseResourceTransition
	 * @generated
	 */
	EClass getToUseResourceTransition();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.touseflock.ToUseResourceTransition#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see com.misc.touse.moplaf.touseflock.ToUseResourceTransition#getComments()
	 * @see #getToUseResourceTransition()
	 * @generated
	 */
	EAttribute getToUseResourceTransition_Comments();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.touseflock.ToUseResourceTransition#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see com.misc.touse.moplaf.touseflock.ToUseResourceTransition#getResource()
	 * @see #getToUseResourceTransition()
	 * @generated
	 */
	EReference getToUseResourceTransition_Resource();

	/**
	 * Returns the meta object for the '{@link com.misc.touse.moplaf.touseflock.ToUseResourceTransition#refreshResource() <em>Refresh Resource</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Resource</em>' operation.
	 * @see com.misc.touse.moplaf.touseflock.ToUseResourceTransition#refreshResource()
	 * @generated
	 */
	EOperation getToUseResourceTransition__RefreshResource();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.touseflock.ToUseResourceMount <em>To Use Resource Mount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Use Resource Mount</em>'.
	 * @see com.misc.touse.moplaf.touseflock.ToUseResourceMount
	 * @generated
	 */
	EClass getToUseResourceMount();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.touse.moplaf.touseflock.ToUseResourceMount#getChainMount <em>Chain Mount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Chain Mount</em>'.
	 * @see com.misc.touse.moplaf.touseflock.ToUseResourceMount#getChainMount()
	 * @see #getToUseResourceMount()
	 * @generated
	 */
	EReference getToUseResourceMount_ChainMount();

	/**
	 * Returns the meta object for the '{@link com.misc.touse.moplaf.touseflock.ToUseResourceMount#refreshChainMount() <em>Refresh Chain Mount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Chain Mount</em>' operation.
	 * @see com.misc.touse.moplaf.touseflock.ToUseResourceMount#refreshChainMount()
	 * @generated
	 */
	EOperation getToUseResourceMount__RefreshChainMount();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.touseflock.ToUseResourceConfiguration <em>To Use Resource Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Use Resource Configuration</em>'.
	 * @see com.misc.touse.moplaf.touseflock.ToUseResourceConfiguration
	 * @generated
	 */
	EClass getToUseResourceConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.touse.moplaf.touseflock.ToUseResourceConfiguration#getChainConfiguration <em>Chain Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Chain Configuration</em>'.
	 * @see com.misc.touse.moplaf.touseflock.ToUseResourceConfiguration#getChainConfiguration()
	 * @see #getToUseResourceConfiguration()
	 * @generated
	 */
	EReference getToUseResourceConfiguration_ChainConfiguration();

	/**
	 * Returns the meta object for the '{@link com.misc.touse.moplaf.touseflock.ToUseResourceConfiguration#refreshChainConfiguration() <em>Refresh Chain Configuration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Chain Configuration</em>' operation.
	 * @see com.misc.touse.moplaf.touseflock.ToUseResourceConfiguration#refreshChainConfiguration()
	 * @generated
	 */
	EOperation getToUseResourceConfiguration__RefreshChainConfiguration();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.touseflock.Trailer <em>Trailer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trailer</em>'.
	 * @see com.misc.touse.moplaf.touseflock.Trailer
	 * @generated
	 */
	EClass getTrailer();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.touseflock.Trailer#getDetach <em>Detach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Detach</em>'.
	 * @see com.misc.touse.moplaf.touseflock.Trailer#getDetach()
	 * @see #getTrailer()
	 * @generated
	 */
	EReference getTrailer_Detach();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.touseflock.Trailer#getAttach <em>Attach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attach</em>'.
	 * @see com.misc.touse.moplaf.touseflock.Trailer#getAttach()
	 * @see #getTrailer()
	 * @generated
	 */
	EReference getTrailer_Attach();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.touseflock.Trailer#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configuration</em>'.
	 * @see com.misc.touse.moplaf.touseflock.Trailer#getConfiguration()
	 * @see #getTrailer()
	 * @generated
	 */
	EReference getTrailer_Configuration();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.touseflock.Shipment <em>Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment</em>'.
	 * @see com.misc.touse.moplaf.touseflock.Shipment
	 * @generated
	 */
	EClass getShipment();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.touseflock.Shipment#getLoad <em>Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Load</em>'.
	 * @see com.misc.touse.moplaf.touseflock.Shipment#getLoad()
	 * @see #getShipment()
	 * @generated
	 */
	EReference getShipment_Load();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.touseflock.Shipment#getUnload <em>Unload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unload</em>'.
	 * @see com.misc.touse.moplaf.touseflock.Shipment#getUnload()
	 * @see #getShipment()
	 * @generated
	 */
	EReference getShipment_Unload();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.touseflock.AttachTrailer <em>Attach Trailer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attach Trailer</em>'.
	 * @see com.misc.touse.moplaf.touseflock.AttachTrailer
	 * @generated
	 */
	EClass getAttachTrailer();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.touse.moplaf.touseflock.AttachTrailer#getTrailer <em>Trailer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Trailer</em>'.
	 * @see com.misc.touse.moplaf.touseflock.AttachTrailer#getTrailer()
	 * @see #getAttachTrailer()
	 * @generated
	 */
	EReference getAttachTrailer_Trailer();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.touseflock.DetachTrailer <em>Detach Trailer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Detach Trailer</em>'.
	 * @see com.misc.touse.moplaf.touseflock.DetachTrailer
	 * @generated
	 */
	EClass getDetachTrailer();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.touse.moplaf.touseflock.DetachTrailer#getTrailer <em>Trailer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Trailer</em>'.
	 * @see com.misc.touse.moplaf.touseflock.DetachTrailer#getTrailer()
	 * @see #getDetachTrailer()
	 * @generated
	 */
	EReference getDetachTrailer_Trailer();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.touseflock.LoadShipment <em>Load Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Shipment</em>'.
	 * @see com.misc.touse.moplaf.touseflock.LoadShipment
	 * @generated
	 */
	EClass getLoadShipment();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.touse.moplaf.touseflock.LoadShipment#getShipment <em>Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Shipment</em>'.
	 * @see com.misc.touse.moplaf.touseflock.LoadShipment#getShipment()
	 * @see #getLoadShipment()
	 * @generated
	 */
	EReference getLoadShipment_Shipment();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.touseflock.UnloadShipment <em>Unload Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unload Shipment</em>'.
	 * @see com.misc.touse.moplaf.touseflock.UnloadShipment
	 * @generated
	 */
	EClass getUnloadShipment();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.touse.moplaf.touseflock.UnloadShipment#getShipment <em>Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Shipment</em>'.
	 * @see com.misc.touse.moplaf.touseflock.UnloadShipment#getShipment()
	 * @see #getUnloadShipment()
	 * @generated
	 */
	EReference getUnloadShipment_Shipment();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.touseflock.ToUseLocation <em>To Use Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Use Location</em>'.
	 * @see com.misc.touse.moplaf.touseflock.ToUseLocation
	 * @generated
	 */
	EClass getToUseLocation();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.touseflock.ToUseLocation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.touse.moplaf.touseflock.ToUseLocation#getName()
	 * @see #getToUseLocation()
	 * @generated
	 */
	EAttribute getToUseLocation_Name();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.touseflock.FlockScopeToUse <em>Flock Scope To Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flock Scope To Use</em>'.
	 * @see com.misc.touse.moplaf.touseflock.FlockScopeToUse
	 * @generated
	 */
	EClass getFlockScopeToUse();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.touse.moplaf.touseflock.FlockScopeToUse#getToUseDomain <em>To Use Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>To Use Domain</em>'.
	 * @see com.misc.touse.moplaf.touseflock.FlockScopeToUse#getToUseDomain()
	 * @see #getFlockScopeToUse()
	 * @generated
	 */
	EReference getFlockScopeToUse_ToUseDomain();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.touseflock.TractorConfiguration <em>Tractor Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tractor Configuration</em>'.
	 * @see com.misc.touse.moplaf.touseflock.TractorConfiguration
	 * @generated
	 */
	EClass getTractorConfiguration();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.touse.moplaf.touseflock.TractorConfiguration#getTractor <em>Tractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tractor</em>'.
	 * @see com.misc.touse.moplaf.touseflock.TractorConfiguration#getTractor()
	 * @see #getTractorConfiguration()
	 * @generated
	 */
	EReference getTractorConfiguration_Tractor();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.touseflock.TrailerConfiguration <em>Trailer Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trailer Configuration</em>'.
	 * @see com.misc.touse.moplaf.touseflock.TrailerConfiguration
	 * @generated
	 */
	EClass getTrailerConfiguration();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.touse.moplaf.touseflock.TrailerConfiguration#getTrailer <em>Trailer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Trailer</em>'.
	 * @see com.misc.touse.moplaf.touseflock.TrailerConfiguration#getTrailer()
	 * @see #getTrailerConfiguration()
	 * @generated
	 */
	EReference getTrailerConfiguration_Trailer();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TouseflockFactory getTouseflockFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.touseflock.impl.ToUseDomainImpl <em>To Use Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.touseflock.impl.ToUseDomainImpl
		 * @see com.misc.touse.moplaf.touseflock.impl.TouseflockPackageImpl#getToUseDomain()
		 * @generated
		 */
		EClass TO_USE_DOMAIN = eINSTANCE.getToUseDomain();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_DOMAIN__LOCATION = eINSTANCE.getToUseDomain_Location();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_DOMAIN__RESOURCE = eINSTANCE.getToUseDomain_Resource();

		/**
		 * The meta object literal for the '<em><b>Flock Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_DOMAIN__FLOCK_SCOPE = eINSTANCE.getToUseDomain_FlockScope();

		/**
		 * The meta object literal for the '<em><b>Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TO_USE_DOMAIN___REFRESH = eINSTANCE.getToUseDomain__Refresh();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.touseflock.impl.ToUseResourceImpl <em>To Use Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.touseflock.impl.ToUseResourceImpl
		 * @see com.misc.touse.moplaf.touseflock.impl.TouseflockPackageImpl#getToUseResource()
		 * @generated
		 */
		EClass TO_USE_RESOURCE = eINSTANCE.getToUseResource();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_RESOURCE__DOMAIN = eINSTANCE.getToUseResource_Domain();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_USE_RESOURCE__NAME = eINSTANCE.getToUseResource_Name();

		/**
		 * The meta object literal for the '<em><b>Chain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_RESOURCE__CHAIN = eINSTANCE.getToUseResource_Chain();

		/**
		 * The meta object literal for the '<em><b>Refresh Chain</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TO_USE_RESOURCE___REFRESH_CHAIN = eINSTANCE.getToUseResource__RefreshChain();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.touseflock.impl.TractorImpl <em>Tractor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.touseflock.impl.TractorImpl
		 * @see com.misc.touse.moplaf.touseflock.impl.TouseflockPackageImpl#getTractor()
		 * @generated
		 */
		EClass TRACTOR = eINSTANCE.getTractor();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACTOR__CONFIGURATION = eINSTANCE.getTractor_Configuration();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.touseflock.impl.ToUseResourceTransitionImpl <em>To Use Resource Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.touseflock.impl.ToUseResourceTransitionImpl
		 * @see com.misc.touse.moplaf.touseflock.impl.TouseflockPackageImpl#getToUseResourceTransition()
		 * @generated
		 */
		EClass TO_USE_RESOURCE_TRANSITION = eINSTANCE.getToUseResourceTransition();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_USE_RESOURCE_TRANSITION__COMMENTS = eINSTANCE.getToUseResourceTransition_Comments();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_RESOURCE_TRANSITION__RESOURCE = eINSTANCE.getToUseResourceTransition_Resource();

		/**
		 * The meta object literal for the '<em><b>Refresh Resource</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TO_USE_RESOURCE_TRANSITION___REFRESH_RESOURCE = eINSTANCE.getToUseResourceTransition__RefreshResource();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.touseflock.impl.ToUseResourceMountImpl <em>To Use Resource Mount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.touseflock.impl.ToUseResourceMountImpl
		 * @see com.misc.touse.moplaf.touseflock.impl.TouseflockPackageImpl#getToUseResourceMount()
		 * @generated
		 */
		EClass TO_USE_RESOURCE_MOUNT = eINSTANCE.getToUseResourceMount();

		/**
		 * The meta object literal for the '<em><b>Chain Mount</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_RESOURCE_MOUNT__CHAIN_MOUNT = eINSTANCE.getToUseResourceMount_ChainMount();

		/**
		 * The meta object literal for the '<em><b>Refresh Chain Mount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TO_USE_RESOURCE_MOUNT___REFRESH_CHAIN_MOUNT = eINSTANCE.getToUseResourceMount__RefreshChainMount();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.touseflock.impl.ToUseResourceConfigurationImpl <em>To Use Resource Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.touseflock.impl.ToUseResourceConfigurationImpl
		 * @see com.misc.touse.moplaf.touseflock.impl.TouseflockPackageImpl#getToUseResourceConfiguration()
		 * @generated
		 */
		EClass TO_USE_RESOURCE_CONFIGURATION = eINSTANCE.getToUseResourceConfiguration();

		/**
		 * The meta object literal for the '<em><b>Chain Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_RESOURCE_CONFIGURATION__CHAIN_CONFIGURATION = eINSTANCE.getToUseResourceConfiguration_ChainConfiguration();

		/**
		 * The meta object literal for the '<em><b>Refresh Chain Configuration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TO_USE_RESOURCE_CONFIGURATION___REFRESH_CHAIN_CONFIGURATION = eINSTANCE.getToUseResourceConfiguration__RefreshChainConfiguration();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.touseflock.impl.TrailerImpl <em>Trailer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.touseflock.impl.TrailerImpl
		 * @see com.misc.touse.moplaf.touseflock.impl.TouseflockPackageImpl#getTrailer()
		 * @generated
		 */
		EClass TRAILER = eINSTANCE.getTrailer();

		/**
		 * The meta object literal for the '<em><b>Detach</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAILER__DETACH = eINSTANCE.getTrailer_Detach();

		/**
		 * The meta object literal for the '<em><b>Attach</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAILER__ATTACH = eINSTANCE.getTrailer_Attach();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAILER__CONFIGURATION = eINSTANCE.getTrailer_Configuration();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.touseflock.impl.ShipmentImpl <em>Shipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.touseflock.impl.ShipmentImpl
		 * @see com.misc.touse.moplaf.touseflock.impl.TouseflockPackageImpl#getShipment()
		 * @generated
		 */
		EClass SHIPMENT = eINSTANCE.getShipment();

		/**
		 * The meta object literal for the '<em><b>Load</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT__LOAD = eINSTANCE.getShipment_Load();

		/**
		 * The meta object literal for the '<em><b>Unload</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT__UNLOAD = eINSTANCE.getShipment_Unload();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.touseflock.impl.AttachTrailerImpl <em>Attach Trailer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.touseflock.impl.AttachTrailerImpl
		 * @see com.misc.touse.moplaf.touseflock.impl.TouseflockPackageImpl#getAttachTrailer()
		 * @generated
		 */
		EClass ATTACH_TRAILER = eINSTANCE.getAttachTrailer();

		/**
		 * The meta object literal for the '<em><b>Trailer</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACH_TRAILER__TRAILER = eINSTANCE.getAttachTrailer_Trailer();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.touseflock.impl.DetachTrailerImpl <em>Detach Trailer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.touseflock.impl.DetachTrailerImpl
		 * @see com.misc.touse.moplaf.touseflock.impl.TouseflockPackageImpl#getDetachTrailer()
		 * @generated
		 */
		EClass DETACH_TRAILER = eINSTANCE.getDetachTrailer();

		/**
		 * The meta object literal for the '<em><b>Trailer</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DETACH_TRAILER__TRAILER = eINSTANCE.getDetachTrailer_Trailer();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.touseflock.impl.LoadShipmentImpl <em>Load Shipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.touseflock.impl.LoadShipmentImpl
		 * @see com.misc.touse.moplaf.touseflock.impl.TouseflockPackageImpl#getLoadShipment()
		 * @generated
		 */
		EClass LOAD_SHIPMENT = eINSTANCE.getLoadShipment();

		/**
		 * The meta object literal for the '<em><b>Shipment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_SHIPMENT__SHIPMENT = eINSTANCE.getLoadShipment_Shipment();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.touseflock.impl.UnloadShipmentImpl <em>Unload Shipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.touseflock.impl.UnloadShipmentImpl
		 * @see com.misc.touse.moplaf.touseflock.impl.TouseflockPackageImpl#getUnloadShipment()
		 * @generated
		 */
		EClass UNLOAD_SHIPMENT = eINSTANCE.getUnloadShipment();

		/**
		 * The meta object literal for the '<em><b>Shipment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNLOAD_SHIPMENT__SHIPMENT = eINSTANCE.getUnloadShipment_Shipment();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.touseflock.impl.ToUseLocationImpl <em>To Use Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.touseflock.impl.ToUseLocationImpl
		 * @see com.misc.touse.moplaf.touseflock.impl.TouseflockPackageImpl#getToUseLocation()
		 * @generated
		 */
		EClass TO_USE_LOCATION = eINSTANCE.getToUseLocation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_USE_LOCATION__NAME = eINSTANCE.getToUseLocation_Name();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.touseflock.impl.FlockScopeToUseImpl <em>Flock Scope To Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.touseflock.impl.FlockScopeToUseImpl
		 * @see com.misc.touse.moplaf.touseflock.impl.TouseflockPackageImpl#getFlockScopeToUse()
		 * @generated
		 */
		EClass FLOCK_SCOPE_TO_USE = eINSTANCE.getFlockScopeToUse();

		/**
		 * The meta object literal for the '<em><b>To Use Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOCK_SCOPE_TO_USE__TO_USE_DOMAIN = eINSTANCE.getFlockScopeToUse_ToUseDomain();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.touseflock.impl.TractorConfigurationImpl <em>Tractor Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.touseflock.impl.TractorConfigurationImpl
		 * @see com.misc.touse.moplaf.touseflock.impl.TouseflockPackageImpl#getTractorConfiguration()
		 * @generated
		 */
		EClass TRACTOR_CONFIGURATION = eINSTANCE.getTractorConfiguration();

		/**
		 * The meta object literal for the '<em><b>Tractor</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACTOR_CONFIGURATION__TRACTOR = eINSTANCE.getTractorConfiguration_Tractor();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.touseflock.impl.TrailerConfigurationImpl <em>Trailer Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.touseflock.impl.TrailerConfigurationImpl
		 * @see com.misc.touse.moplaf.touseflock.impl.TouseflockPackageImpl#getTrailerConfiguration()
		 * @generated
		 */
		EClass TRAILER_CONFIGURATION = eINSTANCE.getTrailerConfiguration();

		/**
		 * The meta object literal for the '<em><b>Trailer</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAILER_CONFIGURATION__TRAILER = eINSTANCE.getTrailerConfiguration_Trailer();

	}

} //TouseflockPackage
