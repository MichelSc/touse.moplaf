/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline.calc.impl;

import com.misc.common.moplaf.propagator2.PropagatorPackage;

import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;

import com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage;

import com.misc.touse.moplaf.timeline.tousetimeline.calc.CalcDomainDistributionFunctionInterval;
import com.misc.touse.moplaf.timeline.tousetimeline.calc.CalcDomainDistributionFunctionPossible;
import com.misc.touse.moplaf.timeline.tousetimeline.calc.LayerDomainDistributionFunctions;
import com.misc.touse.moplaf.timeline.tousetimeline.calc.ScopeDomain;
import com.misc.touse.moplaf.timeline.tousetimeline.calc.ScopeDomainDistribution;
import com.misc.touse.moplaf.timeline.tousetimeline.calc.ToUseTimeLineCalcFactory;
import com.misc.touse.moplaf.timeline.tousetimeline.calc.ToUseTimeLineCalcPackage;

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
public class ToUseTimeLineCalcPackageImpl extends EPackageImpl implements ToUseTimeLineCalcPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopeDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopeDomainDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layerDomainDistributionFunctionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcDomainDistributionFunctionIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcDomainDistributionFunctionPossibleEClass = null;

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
		PropagatorPackage.eINSTANCE.eClass();
		TimeContinuousPackage.eINSTANCE.eClass();
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
	public EClass getScopeDomain() {
		return scopeDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScopeDomainDistribution() {
		return scopeDomainDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScopeDomainDistribution_ConcreteParent() {
		return (EReference)scopeDomainDistributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayerDomainDistributionFunctions() {
		return layerDomainDistributionFunctionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayerDomainDistributionFunctions_ConcreteParent() {
		return (EReference)layerDomainDistributionFunctionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayerDomainDistributionFunctions_AntecedentLayerDistributionAmounts() {
		return (EReference)layerDomainDistributionFunctionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcDomainDistributionFunctionInterval() {
		return calcDomainDistributionFunctionIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcDomainDistributionFunctionInterval_ConcreteParent() {
		return (EReference)calcDomainDistributionFunctionIntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcDomainDistributionFunctionPossible() {
		return calcDomainDistributionFunctionPossibleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcDomainDistributionFunctionPossible_ConcreteParent() {
		return (EReference)calcDomainDistributionFunctionPossibleEClass.getEStructuralFeatures().get(0);
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
		scopeDomainEClass = createEClass(SCOPE_DOMAIN);

		scopeDomainDistributionEClass = createEClass(SCOPE_DOMAIN_DISTRIBUTION);
		createEReference(scopeDomainDistributionEClass, SCOPE_DOMAIN_DISTRIBUTION__CONCRETE_PARENT);

		layerDomainDistributionFunctionsEClass = createEClass(LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS);
		createEReference(layerDomainDistributionFunctionsEClass, LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS__CONCRETE_PARENT);
		createEReference(layerDomainDistributionFunctionsEClass, LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS__ANTECEDENT_LAYER_DISTRIBUTION_AMOUNTS);

		calcDomainDistributionFunctionIntervalEClass = createEClass(CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL);
		createEReference(calcDomainDistributionFunctionIntervalEClass, CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL__CONCRETE_PARENT);

		calcDomainDistributionFunctionPossibleEClass = createEClass(CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE);
		createEReference(calcDomainDistributionFunctionPossibleEClass, CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE__CONCRETE_PARENT);
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
		TimeContinuousPackage theTimeContinuousPackage = (TimeContinuousPackage)EPackage.Registry.INSTANCE.getEPackage(TimeContinuousPackage.eNS_URI);
		TimeContinuousCalcPackage theTimeContinuousCalcPackage = (TimeContinuousCalcPackage)EPackage.Registry.INSTANCE.getEPackage(TimeContinuousCalcPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		scopeDomainEClass.getESuperTypes().add(theTimeContinuousPackage.getPropagatorFunctionDistributionAbstract());
		scopeDomainDistributionEClass.getESuperTypes().add(theTimeContinuousCalcPackage.getScopeDistribution());
		layerDomainDistributionFunctionsEClass.getESuperTypes().add(theTimeContinuousPackage.getPropagatorFunctionDistribution());
		calcDomainDistributionFunctionIntervalEClass.getESuperTypes().add(theTimeContinuousPackage.getPropagatorFunctionDistributionAbstract());
		calcDomainDistributionFunctionPossibleEClass.getESuperTypes().add(theTimeContinuousPackage.getPropagatorFunctionDistributionAbstract());

		// Initialize classes, features, and operations; add parameters
		initEClass(scopeDomainEClass, ScopeDomain.class, "ScopeDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scopeDomainDistributionEClass, ScopeDomainDistribution.class, "ScopeDomainDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScopeDomainDistribution_ConcreteParent(), this.getScopeDomain(), null, "ConcreteParent", null, 0, 1, ScopeDomainDistribution.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(layerDomainDistributionFunctionsEClass, LayerDomainDistributionFunctions.class, "LayerDomainDistributionFunctions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLayerDomainDistributionFunctions_ConcreteParent(), this.getScopeDomainDistribution(), null, "ConcreteParent", null, 1, 1, LayerDomainDistributionFunctions.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLayerDomainDistributionFunctions_AntecedentLayerDistributionAmounts(), theTimeContinuousCalcPackage.getLayerDistributionAmounts(), null, "AntecedentLayerDistributionAmounts", null, 1, 1, LayerDomainDistributionFunctions.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(calcDomainDistributionFunctionIntervalEClass, CalcDomainDistributionFunctionInterval.class, "CalcDomainDistributionFunctionInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcDomainDistributionFunctionInterval_ConcreteParent(), this.getLayerDomainDistributionFunctions(), null, "ConcreteParent", null, 1, 1, CalcDomainDistributionFunctionInterval.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(calcDomainDistributionFunctionPossibleEClass, CalcDomainDistributionFunctionPossible.class, "CalcDomainDistributionFunctionPossible", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcDomainDistributionFunctionPossible_ConcreteParent(), this.getLayerDomainDistributionFunctions(), null, "ConcreteParent", null, 1, 1, CalcDomainDistributionFunctionPossible.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ToUseTimeLineCalcPackageImpl
