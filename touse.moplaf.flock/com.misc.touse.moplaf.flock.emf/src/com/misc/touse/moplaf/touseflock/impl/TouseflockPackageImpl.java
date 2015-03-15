/**
 */
package com.misc.touse.moplaf.touseflock.impl;

import com.misc.common.moplaf.flock.FlockPackage;
import com.misc.common.moplaf.propagator.PropagatorPackage;
import com.misc.touse.moplaf.touseflock.AttachTrailer;
import com.misc.touse.moplaf.touseflock.DetachTrailer;
import com.misc.touse.moplaf.touseflock.FlockScopeToUse;
import com.misc.touse.moplaf.touseflock.LoadShipment;
import com.misc.touse.moplaf.touseflock.Shipment;
import com.misc.touse.moplaf.touseflock.ToUseDomain;
import com.misc.touse.moplaf.touseflock.ToUseLocation;
import com.misc.touse.moplaf.touseflock.ToUseResource;
import com.misc.touse.moplaf.touseflock.ToUseResourceConfiguration;
import com.misc.touse.moplaf.touseflock.ToUseResourceMount;
import com.misc.touse.moplaf.touseflock.ToUseResourceTransition;
import com.misc.touse.moplaf.touseflock.TouseflockFactory;
import com.misc.touse.moplaf.touseflock.TouseflockPackage;
import com.misc.touse.moplaf.touseflock.Tractor;
import com.misc.touse.moplaf.touseflock.TractorConfiguration;
import com.misc.touse.moplaf.touseflock.Trailer;
import com.misc.touse.moplaf.touseflock.TrailerConfiguration;
import com.misc.touse.moplaf.touseflock.UnloadShipment;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TouseflockPackageImpl extends EPackageImpl implements TouseflockPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toUseDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toUseResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tractorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toUseResourceTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toUseResourceMountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toUseResourceConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trailerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachTrailerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass detachTrailerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadShipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unloadShipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toUseLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flockScopeToUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tractorConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trailerConfigurationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.misc.touse.moplaf.touseflock.TouseflockPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TouseflockPackageImpl() {
		super(eNS_URI, TouseflockFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TouseflockPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TouseflockPackage init() {
		if (isInited) return (TouseflockPackage)EPackage.Registry.INSTANCE.getEPackage(TouseflockPackage.eNS_URI);

		// Obtain or create and register package
		TouseflockPackageImpl theTouseflockPackage = (TouseflockPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TouseflockPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TouseflockPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FlockPackage.eINSTANCE.eClass();
		PropagatorPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTouseflockPackage.createPackageContents();

		// Initialize created meta-data
		theTouseflockPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTouseflockPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TouseflockPackage.eNS_URI, theTouseflockPackage);
		return theTouseflockPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUseDomain() {
		return toUseDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseDomain_Location() {
		return (EReference)toUseDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseDomain_Resource() {
		return (EReference)toUseDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseDomain_FlockScope() {
		return (EReference)toUseDomainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getToUseDomain__Refresh() {
		return toUseDomainEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUseResource() {
		return toUseResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseResource_Domain() {
		return (EReference)toUseResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToUseResource_Name() {
		return (EAttribute)toUseResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseResource_Chain() {
		return (EReference)toUseResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getToUseResource__RefreshChain() {
		return toUseResourceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTractor() {
		return tractorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTractor_Configuration() {
		return (EReference)tractorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUseResourceTransition() {
		return toUseResourceTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToUseResourceTransition_Comments() {
		return (EAttribute)toUseResourceTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseResourceTransition_Resource() {
		return (EReference)toUseResourceTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getToUseResourceTransition__RefreshResource() {
		return toUseResourceTransitionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUseResourceMount() {
		return toUseResourceMountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseResourceMount_ChainMount() {
		return (EReference)toUseResourceMountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getToUseResourceMount__RefreshChainMount() {
		return toUseResourceMountEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUseResourceConfiguration() {
		return toUseResourceConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseResourceConfiguration_ChainConfiguration() {
		return (EReference)toUseResourceConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getToUseResourceConfiguration__RefreshChainConfiguration() {
		return toUseResourceConfigurationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrailer() {
		return trailerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrailer_Detach() {
		return (EReference)trailerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrailer_Attach() {
		return (EReference)trailerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrailer_Configuration() {
		return (EReference)trailerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShipment() {
		return shipmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShipment_Load() {
		return (EReference)shipmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShipment_Unload() {
		return (EReference)shipmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachTrailer() {
		return attachTrailerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachTrailer_Trailer() {
		return (EReference)attachTrailerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDetachTrailer() {
		return detachTrailerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetachTrailer_Trailer() {
		return (EReference)detachTrailerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadShipment() {
		return loadShipmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoadShipment_Shipment() {
		return (EReference)loadShipmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnloadShipment() {
		return unloadShipmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnloadShipment_Shipment() {
		return (EReference)unloadShipmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUseLocation() {
		return toUseLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToUseLocation_Name() {
		return (EAttribute)toUseLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlockScopeToUse() {
		return flockScopeToUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlockScopeToUse_ToUseDomain() {
		return (EReference)flockScopeToUseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTractorConfiguration() {
		return tractorConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTractorConfiguration_Tractor() {
		return (EReference)tractorConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrailerConfiguration() {
		return trailerConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrailerConfiguration_Trailer() {
		return (EReference)trailerConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouseflockFactory getTouseflockFactory() {
		return (TouseflockFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		toUseDomainEClass = createEClass(TO_USE_DOMAIN);
		createEReference(toUseDomainEClass, TO_USE_DOMAIN__LOCATION);
		createEReference(toUseDomainEClass, TO_USE_DOMAIN__RESOURCE);
		createEReference(toUseDomainEClass, TO_USE_DOMAIN__FLOCK_SCOPE);
		createEOperation(toUseDomainEClass, TO_USE_DOMAIN___REFRESH);

		toUseResourceEClass = createEClass(TO_USE_RESOURCE);
		createEReference(toUseResourceEClass, TO_USE_RESOURCE__DOMAIN);
		createEAttribute(toUseResourceEClass, TO_USE_RESOURCE__NAME);
		createEReference(toUseResourceEClass, TO_USE_RESOURCE__CHAIN);
		createEOperation(toUseResourceEClass, TO_USE_RESOURCE___REFRESH_CHAIN);

		toUseResourceTransitionEClass = createEClass(TO_USE_RESOURCE_TRANSITION);
		createEAttribute(toUseResourceTransitionEClass, TO_USE_RESOURCE_TRANSITION__COMMENTS);
		createEReference(toUseResourceTransitionEClass, TO_USE_RESOURCE_TRANSITION__RESOURCE);
		createEOperation(toUseResourceTransitionEClass, TO_USE_RESOURCE_TRANSITION___REFRESH_RESOURCE);

		toUseResourceConfigurationEClass = createEClass(TO_USE_RESOURCE_CONFIGURATION);
		createEReference(toUseResourceConfigurationEClass, TO_USE_RESOURCE_CONFIGURATION__CHAIN_CONFIGURATION);
		createEOperation(toUseResourceConfigurationEClass, TO_USE_RESOURCE_CONFIGURATION___REFRESH_CHAIN_CONFIGURATION);

		toUseResourceMountEClass = createEClass(TO_USE_RESOURCE_MOUNT);
		createEReference(toUseResourceMountEClass, TO_USE_RESOURCE_MOUNT__CHAIN_MOUNT);
		createEOperation(toUseResourceMountEClass, TO_USE_RESOURCE_MOUNT___REFRESH_CHAIN_MOUNT);

		tractorEClass = createEClass(TRACTOR);
		createEReference(tractorEClass, TRACTOR__CONFIGURATION);

		trailerEClass = createEClass(TRAILER);
		createEReference(trailerEClass, TRAILER__DETACH);
		createEReference(trailerEClass, TRAILER__ATTACH);
		createEReference(trailerEClass, TRAILER__CONFIGURATION);

		shipmentEClass = createEClass(SHIPMENT);
		createEReference(shipmentEClass, SHIPMENT__LOAD);
		createEReference(shipmentEClass, SHIPMENT__UNLOAD);

		tractorConfigurationEClass = createEClass(TRACTOR_CONFIGURATION);
		createEReference(tractorConfigurationEClass, TRACTOR_CONFIGURATION__TRACTOR);

		attachTrailerEClass = createEClass(ATTACH_TRAILER);
		createEReference(attachTrailerEClass, ATTACH_TRAILER__TRAILER);

		detachTrailerEClass = createEClass(DETACH_TRAILER);
		createEReference(detachTrailerEClass, DETACH_TRAILER__TRAILER);

		trailerConfigurationEClass = createEClass(TRAILER_CONFIGURATION);
		createEReference(trailerConfigurationEClass, TRAILER_CONFIGURATION__TRAILER);

		loadShipmentEClass = createEClass(LOAD_SHIPMENT);
		createEReference(loadShipmentEClass, LOAD_SHIPMENT__SHIPMENT);

		unloadShipmentEClass = createEClass(UNLOAD_SHIPMENT);
		createEReference(unloadShipmentEClass, UNLOAD_SHIPMENT__SHIPMENT);

		toUseLocationEClass = createEClass(TO_USE_LOCATION);
		createEAttribute(toUseLocationEClass, TO_USE_LOCATION__NAME);

		flockScopeToUseEClass = createEClass(FLOCK_SCOPE_TO_USE);
		createEReference(flockScopeToUseEClass, FLOCK_SCOPE_TO_USE__TO_USE_DOMAIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PropagatorPackage thePropagatorPackage = (PropagatorPackage)EPackage.Registry.INSTANCE.getEPackage(PropagatorPackage.eNS_URI);
		FlockPackage theFlockPackage = (FlockPackage)EPackage.Registry.INSTANCE.getEPackage(FlockPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		toUseDomainEClass.getESuperTypes().add(thePropagatorPackage.getObjectWithPropagatorFunctionAdapter());
		toUseDomainEClass.getESuperTypes().add(thePropagatorPackage.getObjectWithPropagatorFunctionAdapterScope());
		toUseResourceConfigurationEClass.getESuperTypes().add(this.getToUseResourceTransition());
		toUseResourceMountEClass.getESuperTypes().add(this.getToUseResourceTransition());
		tractorEClass.getESuperTypes().add(this.getToUseResource());
		trailerEClass.getESuperTypes().add(this.getToUseResource());
		shipmentEClass.getESuperTypes().add(this.getToUseResource());
		tractorConfigurationEClass.getESuperTypes().add(this.getToUseResourceConfiguration());
		attachTrailerEClass.getESuperTypes().add(this.getToUseResourceMount());
		detachTrailerEClass.getESuperTypes().add(this.getToUseResourceMount());
		trailerConfigurationEClass.getESuperTypes().add(this.getToUseResourceConfiguration());
		loadShipmentEClass.getESuperTypes().add(this.getToUseResourceMount());
		unloadShipmentEClass.getESuperTypes().add(this.getToUseResourceMount());
		toUseLocationEClass.getESuperTypes().add(theFlockPackage.getLocation());
		flockScopeToUseEClass.getESuperTypes().add(theFlockPackage.getFlockScope());

		// Initialize classes, features, and operations; add parameters
		initEClass(toUseDomainEClass, ToUseDomain.class, "ToUseDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToUseDomain_Location(), this.getToUseLocation(), null, "Location", null, 0, -1, ToUseDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToUseDomain_Resource(), this.getToUseResource(), this.getToUseResource_Domain(), "Resource", null, 0, -1, ToUseDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToUseDomain_FlockScope(), this.getFlockScopeToUse(), this.getFlockScopeToUse_ToUseDomain(), "FlockScope", null, 0, 1, ToUseDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getToUseDomain__Refresh(), null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(toUseResourceEClass, ToUseResource.class, "ToUseResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToUseResource_Domain(), this.getToUseDomain(), this.getToUseDomain_Resource(), "Domain", null, 1, 1, ToUseResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToUseResource_Name(), ecorePackage.getEString(), "Name", null, 0, 1, ToUseResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToUseResource_Chain(), theFlockPackage.getChain(), null, "Chain", null, 0, 1, ToUseResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getToUseResource__RefreshChain(), null, "refreshChain", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(toUseResourceTransitionEClass, ToUseResourceTransition.class, "ToUseResourceTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToUseResourceTransition_Comments(), ecorePackage.getEString(), "Comments", null, 0, 1, ToUseResourceTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToUseResourceTransition_Resource(), this.getToUseResource(), null, "Resource", null, 1, 1, ToUseResourceTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getToUseResourceTransition__RefreshResource(), null, "refreshResource", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(toUseResourceConfigurationEClass, ToUseResourceConfiguration.class, "ToUseResourceConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToUseResourceConfiguration_ChainConfiguration(), theFlockPackage.getChainConfiguration(), null, "ChainConfiguration", null, 0, 1, ToUseResourceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getToUseResourceConfiguration__RefreshChainConfiguration(), null, "refreshChainConfiguration", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(toUseResourceMountEClass, ToUseResourceMount.class, "ToUseResourceMount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToUseResourceMount_ChainMount(), theFlockPackage.getChainMount(), null, "ChainMount", null, 0, 1, ToUseResourceMount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getToUseResourceMount__RefreshChainMount(), null, "refreshChainMount", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tractorEClass, Tractor.class, "Tractor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTractor_Configuration(), this.getTractorConfiguration(), this.getTractorConfiguration_Tractor(), "Configuration", null, 0, -1, Tractor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trailerEClass, Trailer.class, "Trailer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrailer_Detach(), this.getDetachTrailer(), this.getDetachTrailer_Trailer(), "Detach", null, 0, -1, Trailer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrailer_Attach(), this.getAttachTrailer(), this.getAttachTrailer_Trailer(), "Attach", null, 0, -1, Trailer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrailer_Configuration(), this.getTrailerConfiguration(), this.getTrailerConfiguration_Trailer(), "Configuration", null, 0, -1, Trailer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shipmentEClass, Shipment.class, "Shipment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShipment_Load(), this.getLoadShipment(), this.getLoadShipment_Shipment(), "Load", null, 0, -1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShipment_Unload(), this.getUnloadShipment(), this.getUnloadShipment_Shipment(), "Unload", null, 0, -1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tractorConfigurationEClass, TractorConfiguration.class, "TractorConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTractorConfiguration_Tractor(), this.getTractor(), this.getTractor_Configuration(), "Tractor", null, 1, 1, TractorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachTrailerEClass, AttachTrailer.class, "AttachTrailer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachTrailer_Trailer(), this.getTrailer(), this.getTrailer_Attach(), "Trailer", null, 1, 1, AttachTrailer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(detachTrailerEClass, DetachTrailer.class, "DetachTrailer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDetachTrailer_Trailer(), this.getTrailer(), this.getTrailer_Detach(), "Trailer", null, 1, 1, DetachTrailer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trailerConfigurationEClass, TrailerConfiguration.class, "TrailerConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrailerConfiguration_Trailer(), this.getTrailer(), this.getTrailer_Configuration(), "Trailer", null, 1, 1, TrailerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loadShipmentEClass, LoadShipment.class, "LoadShipment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoadShipment_Shipment(), this.getShipment(), this.getShipment_Load(), "Shipment", null, 1, 1, LoadShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unloadShipmentEClass, UnloadShipment.class, "UnloadShipment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnloadShipment_Shipment(), this.getShipment(), this.getShipment_Unload(), "Shipment", null, 1, 1, UnloadShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toUseLocationEClass, ToUseLocation.class, "ToUseLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToUseLocation_Name(), ecorePackage.getEString(), "Name", null, 0, 1, ToUseLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flockScopeToUseEClass, FlockScopeToUse.class, "FlockScopeToUse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlockScopeToUse_ToUseDomain(), this.getToUseDomain(), this.getToUseDomain_FlockScope(), "ToUseDomain", null, 0, 1, FlockScopeToUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TouseflockPackageImpl
