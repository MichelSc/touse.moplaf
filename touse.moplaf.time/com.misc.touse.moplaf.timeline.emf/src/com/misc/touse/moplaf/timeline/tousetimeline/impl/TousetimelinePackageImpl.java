/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline.impl;

import com.misc.common.moplaf.propagator.PropagatorPackage;

import com.misc.common.moplaf.time.continuous.ContinuousPackage;

import com.misc.common.moplaf.time.discrete.DiscretePackage;
import com.misc.touse.moplaf.timeline.tousetimeline.Domain;
import com.misc.touse.moplaf.timeline.tousetimeline.DomainDistribution;
import com.misc.touse.moplaf.timeline.tousetimeline.FunctionMinimum;
import com.misc.touse.moplaf.timeline.tousetimeline.TousetimelineFactory;
import com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage;

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
	private EClass domainDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionMinimumEClass = null;

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
	public EReference getDomain_TimeLineMerges() {
		return (EReference)domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Distribution() {
		return (EReference)domainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_Name() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Timelines() {
		return (EReference)domainEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getDomainDistribution_Color() {
		return (EAttribute)domainDistributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainDistribution_Calcs() {
		return (EReference)domainDistributionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionMinimum() {
		return functionMinimumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionMinimum_From() {
		return (EAttribute)functionMinimumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionMinimum_To() {
		return (EAttribute)functionMinimumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionMinimum_Minimum() {
		return (EAttribute)functionMinimumEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionMinimum_Distribution() {
		return (EReference)functionMinimumEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFunctionMinimum__RefreshMinimum() {
		return functionMinimumEClass.getEOperations().get(0);
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
		createEReference(domainEClass, DOMAIN__TIME_LINE_MERGES);
		createEReference(domainEClass, DOMAIN__DISTRIBUTION);
		createEAttribute(domainEClass, DOMAIN__NAME);
		createEReference(domainEClass, DOMAIN__TIMELINES);

		domainDistributionEClass = createEClass(DOMAIN_DISTRIBUTION);
		createEAttribute(domainDistributionEClass, DOMAIN_DISTRIBUTION__NAME);
		createEAttribute(domainDistributionEClass, DOMAIN_DISTRIBUTION__COLOR);
		createEReference(domainDistributionEClass, DOMAIN_DISTRIBUTION__CALCS);

		functionMinimumEClass = createEClass(FUNCTION_MINIMUM);
		createEAttribute(functionMinimumEClass, FUNCTION_MINIMUM__FROM);
		createEAttribute(functionMinimumEClass, FUNCTION_MINIMUM__TO);
		createEAttribute(functionMinimumEClass, FUNCTION_MINIMUM__MINIMUM);
		createEReference(functionMinimumEClass, FUNCTION_MINIMUM__DISTRIBUTION);
		createEOperation(functionMinimumEClass, FUNCTION_MINIMUM___REFRESH_MINIMUM);
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
		domainDistributionEClass.getESuperTypes().add(theContinuousPackage.getDistribution());
		functionMinimumEClass.getESuperTypes().add(thePropagatorPackage.getObjectWithPropagatorFunctionAdapter());

		// Initialize classes, features, and operations; add parameters
		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomain_TimeLineMerges(), theDiscretePackage.getTimeLineMerge(), null, "TimeLineMerges", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Distribution(), this.getDomainDistribution(), null, "Distribution", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomain_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Timelines(), theDiscretePackage.getTimeLine(), null, "Timelines", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainDistributionEClass, DomainDistribution.class, "DomainDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainDistribution_Name(), ecorePackage.getEString(), "Name", null, 0, 1, DomainDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainDistribution_Color(), ecorePackage.getEInt(), "Color", null, 0, 1, DomainDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainDistribution_Calcs(), this.getFunctionMinimum(), this.getFunctionMinimum_Distribution(), "Calcs", null, 0, -1, DomainDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionMinimumEClass, FunctionMinimum.class, "FunctionMinimum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionMinimum_From(), ecorePackage.getEDate(), "from", null, 0, 1, FunctionMinimum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionMinimum_To(), ecorePackage.getEDate(), "to", null, 0, 1, FunctionMinimum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionMinimum_Minimum(), ecorePackage.getEFloat(), "minimum", null, 0, 1, FunctionMinimum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionMinimum_Distribution(), this.getDomainDistribution(), this.getDomainDistribution_Calcs(), "Distribution", null, 1, 1, FunctionMinimum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getFunctionMinimum__RefreshMinimum(), null, "refreshMinimum", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TousetimelinePackageImpl
