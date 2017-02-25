/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline.calc.impl;

import com.misc.common.moplaf.propagator2.PropagatorPackage;

import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;

import com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage;

import com.misc.touse.moplaf.timeline.tousetimeline.calc.PropagatorCalcDomainDistributionFunctionInterval;
import com.misc.touse.moplaf.timeline.tousetimeline.calc.PropagatorCalcDomainDistributionFunctionPossible;
import com.misc.touse.moplaf.timeline.tousetimeline.calc.PropagatorLayerDomainDistributionFunctions;
import com.misc.touse.moplaf.timeline.tousetimeline.calc.PropagatorScopeDomain;
import com.misc.touse.moplaf.timeline.tousetimeline.calc.PropagatorScopeDomainDistribution;
import com.misc.touse.moplaf.timeline.tousetimeline.calc.ToUseTimeLineCalcFactory;
import com.misc.touse.moplaf.timeline.tousetimeline.calc.ToUseTimeLineCalcPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToUseTimeLineCalcPackageImpl extends EPackageImpl implements ToUseTimeLineCalcPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorScopeDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorScopeDomainDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorLayerDomainDistributionFunctionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcDomainDistributionFunctionIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propagatorCalcDomainDistributionFunctionPossibleEClass = null;

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
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.ToUseTimeLineCalcPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ToUseTimeLineCalcPackageImpl() {
		super(eNS_URI, ToUseTimeLineCalcFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ToUseTimeLineCalcPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ToUseTimeLineCalcPackage init() {
		if (isInited) return (ToUseTimeLineCalcPackage)EPackage.Registry.INSTANCE.getEPackage(ToUseTimeLineCalcPackage.eNS_URI);

		// Obtain or create and register package
		ToUseTimeLineCalcPackageImpl theToUseTimeLineCalcPackage = (ToUseTimeLineCalcPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ToUseTimeLineCalcPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ToUseTimeLineCalcPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TimeContinuousCalcPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theToUseTimeLineCalcPackage.createPackageContents();

		// Initialize created meta-data
		theToUseTimeLineCalcPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theToUseTimeLineCalcPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ToUseTimeLineCalcPackage.eNS_URI, theToUseTimeLineCalcPackage);
		return theToUseTimeLineCalcPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorScopeDomain() {
		return propagatorScopeDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorScopeDomainDistribution() {
		return propagatorScopeDomainDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorLayerDomainDistributionFunctions() {
		return propagatorLayerDomainDistributionFunctionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcDomainDistributionFunctionInterval() {
		return propagatorCalcDomainDistributionFunctionIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropagatorCalcDomainDistributionFunctionPossible() {
		return propagatorCalcDomainDistributionFunctionPossibleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseTimeLineCalcFactory getToUseTimeLineCalcFactory() {
		return (ToUseTimeLineCalcFactory)getEFactoryInstance();
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
		propagatorScopeDomainEClass = createEClass(PROPAGATOR_SCOPE_DOMAIN);

		propagatorScopeDomainDistributionEClass = createEClass(PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION);

		propagatorLayerDomainDistributionFunctionsEClass = createEClass(PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS);

		propagatorCalcDomainDistributionFunctionIntervalEClass = createEClass(PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL);

		propagatorCalcDomainDistributionFunctionPossibleEClass = createEClass(PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE);
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
		TimeContinuousCalcPackage theTimeContinuousCalcPackage = (TimeContinuousCalcPackage)EPackage.Registry.INSTANCE.getEPackage(TimeContinuousCalcPackage.eNS_URI);
		TimeContinuousPackage theTimeContinuousPackage = (TimeContinuousPackage)EPackage.Registry.INSTANCE.getEPackage(TimeContinuousPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		propagatorScopeDomainEClass.getESuperTypes().add(thePropagatorPackage.getPropagatorFunctionBindings());
		propagatorScopeDomainDistributionEClass.getESuperTypes().add(theTimeContinuousCalcPackage.getPropagatorScopeDistribution());
		propagatorLayerDomainDistributionFunctionsEClass.getESuperTypes().add(theTimeContinuousPackage.getPropagatorFunctionDistribution());
		propagatorCalcDomainDistributionFunctionIntervalEClass.getESuperTypes().add(thePropagatorPackage.getPropagatorFunctionBindings());
		propagatorCalcDomainDistributionFunctionPossibleEClass.getESuperTypes().add(thePropagatorPackage.getPropagatorFunctionBindings());

		// Initialize classes, features, and operations; add parameters
		initEClass(propagatorScopeDomainEClass, PropagatorScopeDomain.class, "PropagatorScopeDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorScopeDomainDistributionEClass, PropagatorScopeDomainDistribution.class, "PropagatorScopeDomainDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorLayerDomainDistributionFunctionsEClass, PropagatorLayerDomainDistributionFunctions.class, "PropagatorLayerDomainDistributionFunctions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorCalcDomainDistributionFunctionIntervalEClass, PropagatorCalcDomainDistributionFunctionInterval.class, "PropagatorCalcDomainDistributionFunctionInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propagatorCalcDomainDistributionFunctionPossibleEClass, PropagatorCalcDomainDistributionFunctionPossible.class, "PropagatorCalcDomainDistributionFunctionPossible", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ToUseTimeLineCalcPackageImpl
