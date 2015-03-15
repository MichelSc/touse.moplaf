/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline.impl;

import com.misc.common.moplaf.propagator.PropagatorPackage;

import com.misc.common.moplaf.time.continuous.ContinuousPackage;

import com.misc.common.moplaf.time.discrete.DiscretePackage;

import com.misc.touse.moplaf.timeline.tousetimeline.Domain;
import com.misc.touse.moplaf.timeline.tousetimeline.DomainDistribution;
import com.misc.touse.moplaf.timeline.tousetimeline.DomainTimeBucket;
import com.misc.touse.moplaf.timeline.tousetimeline.DomainTimeLine;
import com.misc.touse.moplaf.timeline.tousetimeline.ToUseAmountAbsolute;
import com.misc.touse.moplaf.timeline.tousetimeline.ToUseAmountImpulsion;
import com.misc.touse.moplaf.timeline.tousetimeline.ToUseSlopeAbsolute;
import com.misc.touse.moplaf.timeline.tousetimeline.ToUseSlopeImpulsion;
import com.misc.touse.moplaf.timeline.tousetimeline.TousetimelineFactory;
import com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TousetimelinePackageImpl extends EPackageImpl implements TousetimelinePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainTimeLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainTimeBucketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toUseAmountImpulsionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toUseAmountAbsoluteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toUseSlopeAbsoluteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toUseSlopeImpulsionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainDistributionEClass = null;

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
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TousetimelinePackageImpl() {
		super(eNS_URI, TousetimelineFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TousetimelinePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TousetimelinePackage init() {
		if (isInited) return (TousetimelinePackage)EPackage.Registry.INSTANCE.getEPackage(TousetimelinePackage.eNS_URI);

		// Obtain or create and register package
		TousetimelinePackageImpl theTousetimelinePackage = (TousetimelinePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TousetimelinePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TousetimelinePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ContinuousPackage.eINSTANCE.eClass();
		DiscretePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTousetimelinePackage.createPackageContents();

		// Initialize created meta-data
		theTousetimelinePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTousetimelinePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TousetimelinePackage.eNS_URI, theTousetimelinePackage);
		return theTousetimelinePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_TimeLine() {
		return (EReference)domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_TimeLineMerge() {
		return (EReference)domainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_AmountImpulsion() {
		return (EReference)domainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_AmountAbsolute() {
		return (EReference)domainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_SlopeAbsolute() {
		return (EReference)domainEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_SlopeImpulsion() {
		return (EReference)domainEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_CapacityChange() {
		return (EReference)domainEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_StockChange() {
		return (EReference)domainEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Distribution() {
		return (EReference)domainEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_Name() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainTimeLine() {
		return domainTimeLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainTimeBucket() {
		return domainTimeBucketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUseAmountImpulsion() {
		return toUseAmountImpulsionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUseAmountAbsolute() {
		return toUseAmountAbsoluteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUseSlopeAbsolute() {
		return toUseSlopeAbsoluteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUseSlopeImpulsion() {
		return toUseSlopeImpulsionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainDistribution() {
		return domainDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainDistribution_Name() {
		return (EAttribute)domainDistributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TousetimelineFactory getTousetimelineFactory() {
		return (TousetimelineFactory)getEFactoryInstance();
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
		domainEClass = createEClass(DOMAIN);
		createEReference(domainEClass, DOMAIN__TIME_LINE);
		createEReference(domainEClass, DOMAIN__TIME_LINE_MERGE);
		createEReference(domainEClass, DOMAIN__AMOUNT_IMPULSION);
		createEReference(domainEClass, DOMAIN__AMOUNT_ABSOLUTE);
		createEReference(domainEClass, DOMAIN__SLOPE_ABSOLUTE);
		createEReference(domainEClass, DOMAIN__SLOPE_IMPULSION);
		createEReference(domainEClass, DOMAIN__CAPACITY_CHANGE);
		createEReference(domainEClass, DOMAIN__STOCK_CHANGE);
		createEReference(domainEClass, DOMAIN__DISTRIBUTION);
		createEAttribute(domainEClass, DOMAIN__NAME);

		domainTimeLineEClass = createEClass(DOMAIN_TIME_LINE);

		domainTimeBucketEClass = createEClass(DOMAIN_TIME_BUCKET);

		toUseAmountImpulsionEClass = createEClass(TO_USE_AMOUNT_IMPULSION);

		toUseAmountAbsoluteEClass = createEClass(TO_USE_AMOUNT_ABSOLUTE);

		toUseSlopeAbsoluteEClass = createEClass(TO_USE_SLOPE_ABSOLUTE);

		toUseSlopeImpulsionEClass = createEClass(TO_USE_SLOPE_IMPULSION);

		domainDistributionEClass = createEClass(DOMAIN_DISTRIBUTION);
		createEAttribute(domainDistributionEClass, DOMAIN_DISTRIBUTION__NAME);
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
		DiscretePackage theDiscretePackage = (DiscretePackage)EPackage.Registry.INSTANCE.getEPackage(DiscretePackage.eNS_URI);
		ContinuousPackage theContinuousPackage = (ContinuousPackage)EPackage.Registry.INSTANCE.getEPackage(ContinuousPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		domainEClass.getESuperTypes().add(thePropagatorPackage.getObjectWithPropagatorFunctionAdapterScope());
		domainEClass.getESuperTypes().add(thePropagatorPackage.getObjectWithPropagatorFunctionAdapter());
		domainTimeLineEClass.getESuperTypes().add(theDiscretePackage.getTimeLine());
		domainTimeBucketEClass.getESuperTypes().add(theDiscretePackage.getTimeBucket());
		toUseAmountImpulsionEClass.getESuperTypes().add(theContinuousPackage.getAmountImpulsion());
		toUseAmountAbsoluteEClass.getESuperTypes().add(theContinuousPackage.getAmountAbsolute());
		toUseSlopeAbsoluteEClass.getESuperTypes().add(theContinuousPackage.getSlopeAbsolute());
		toUseSlopeImpulsionEClass.getESuperTypes().add(theContinuousPackage.getSlopeImpulsion());
		domainDistributionEClass.getESuperTypes().add(theContinuousPackage.getDistribution());

		// Initialize classes, features, and operations; add parameters
		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomain_TimeLine(), this.getDomainTimeLine(), null, "TimeLine", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_TimeLineMerge(), theDiscretePackage.getTimeLineMerge(), null, "TimeLineMerge", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_AmountImpulsion(), this.getToUseAmountImpulsion(), null, "AmountImpulsion", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_AmountAbsolute(), this.getToUseAmountAbsolute(), null, "AmountAbsolute", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_SlopeAbsolute(), this.getToUseSlopeAbsolute(), null, "SlopeAbsolute", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_SlopeImpulsion(), this.getToUseSlopeImpulsion(), null, "SlopeImpulsion", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_CapacityChange(), theContinuousPackage.getCapacityChange(), null, "CapacityChange", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_StockChange(), theContinuousPackage.getStockChange(), null, "StockChange", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Distribution(), this.getDomainDistribution(), null, "Distribution", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomain_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainTimeLineEClass, DomainTimeLine.class, "DomainTimeLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainTimeBucketEClass, DomainTimeBucket.class, "DomainTimeBucket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(toUseAmountImpulsionEClass, ToUseAmountImpulsion.class, "ToUseAmountImpulsion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(toUseAmountAbsoluteEClass, ToUseAmountAbsolute.class, "ToUseAmountAbsolute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(toUseSlopeAbsoluteEClass, ToUseSlopeAbsolute.class, "ToUseSlopeAbsolute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(toUseSlopeImpulsionEClass, ToUseSlopeImpulsion.class, "ToUseSlopeImpulsion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainDistributionEClass, DomainDistribution.class, "DomainDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainDistribution_Name(), ecorePackage.getEString(), "Name", null, 0, 1, DomainDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TousetimelinePackageImpl
