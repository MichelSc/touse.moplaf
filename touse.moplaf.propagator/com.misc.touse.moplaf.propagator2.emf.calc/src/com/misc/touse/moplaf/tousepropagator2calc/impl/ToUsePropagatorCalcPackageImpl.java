/**
 */
package com.misc.touse.moplaf.tousepropagator2calc.impl;

import com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage;

import com.misc.touse.moplaf.tousepropagator2calc.CalcProjectEnd;
import com.misc.touse.moplaf.tousepropagator2calc.CalcTaskEnd;
import com.misc.touse.moplaf.tousepropagator2calc.CalcTaskHours;
import com.misc.touse.moplaf.tousepropagator2calc.CalcTaskHoursItem;
import com.misc.touse.moplaf.tousepropagator2calc.CalcTaskHoursVar;
import com.misc.touse.moplaf.tousepropagator2calc.CalcTaskResources;
import com.misc.touse.moplaf.tousepropagator2calc.CalcTaskStart;
import com.misc.touse.moplaf.tousepropagator2calc.CalcTaskWithOverheadHoursVar;
import com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHours;
import com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHoursItem;
import com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHoursVar;
import com.misc.touse.moplaf.tousepropagator2calc.LayerTaskResources;
import com.misc.touse.moplaf.tousepropagator2calc.LayerTaskTimes;
import com.misc.touse.moplaf.tousepropagator2calc.ScopeProject;
import com.misc.touse.moplaf.tousepropagator2calc.ToUsePropagatorCalcFactory;
import com.misc.touse.moplaf.tousepropagator2calc.ToUsePropagatorCalcPackage;
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
public class ToUsePropagatorCalcPackageImpl extends EPackageImpl implements ToUsePropagatorCalcPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopeProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layerTaskHoursItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layerTaskHoursVarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layerTaskHoursEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layerTaskTimesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcProjectEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layerTaskResourcesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcTaskHoursItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcTaskHoursVarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcTaskWithOverheadHoursVarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcTaskHoursEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcTaskStartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcTaskEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcTaskResourcesEClass = null;

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
	 * @see com.misc.touse.moplaf.tousepropagator2calc.ToUsePropagatorCalcPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ToUsePropagatorCalcPackageImpl() {
		super(eNS_URI, ToUsePropagatorCalcFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ToUsePropagatorCalcPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ToUsePropagatorCalcPackage init() {
		if (isInited) return (ToUsePropagatorCalcPackage)EPackage.Registry.INSTANCE.getEPackage(ToUsePropagatorCalcPackage.eNS_URI);

		// Obtain or create and register package
		ToUsePropagatorCalcPackageImpl theToUsePropagatorCalcPackage = (ToUsePropagatorCalcPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ToUsePropagatorCalcPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ToUsePropagatorCalcPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ToUsePropagatorPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theToUsePropagatorCalcPackage.createPackageContents();

		// Initialize created meta-data
		theToUsePropagatorCalcPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theToUsePropagatorCalcPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ToUsePropagatorCalcPackage.eNS_URI, theToUsePropagatorCalcPackage);
		return theToUsePropagatorCalcPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScopeProject() {
		return scopeProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayerTaskHoursItem() {
		return layerTaskHoursItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayerTaskHoursItem_ConcreteParent() {
		return (EReference)layerTaskHoursItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayerTaskHoursVar() {
		return layerTaskHoursVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayerTaskHoursVar_ConcreteParent() {
		return (EReference)layerTaskHoursVarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayerTaskHours() {
		return layerTaskHoursEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayerTaskHours_ConcreteParent() {
		return (EReference)layerTaskHoursEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayerTaskHours_AntecedentLayerTaskHoursItem() {
		return (EReference)layerTaskHoursEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayerTaskHours_AntecedentLayerTaskHoursVar() {
		return (EReference)layerTaskHoursEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayerTaskTimes() {
		return layerTaskTimesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayerTaskTimes_ConcreteParent() {
		return (EReference)layerTaskTimesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayerTaskTimes_AntecedentLayerTaskHours() {
		return (EReference)layerTaskTimesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcProjectEnd() {
		return calcProjectEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcProjectEnd_ConcreteParent() {
		return (EReference)calcProjectEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcProjectEnd_AntecedentLayerTaskTimes() {
		return (EReference)calcProjectEndEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayerTaskResources() {
		return layerTaskResourcesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayerTaskResources_AntecedentLayerTaskTimes() {
		return (EReference)layerTaskResourcesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayerTaskResources_ConcreteParent() {
		return (EReference)layerTaskResourcesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcTaskHoursItem() {
		return calcTaskHoursItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcTaskHoursItem_ConcreteParent() {
		return (EReference)calcTaskHoursItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcTaskHoursVar() {
		return calcTaskHoursVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcTaskHoursVar_ConcreteParent() {
		return (EReference)calcTaskHoursVarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcTaskWithOverheadHoursVar() {
		return calcTaskWithOverheadHoursVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcTaskHours() {
		return calcTaskHoursEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcTaskHours_ConcreteParent() {
		return (EReference)calcTaskHoursEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcTaskStart() {
		return calcTaskStartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcTaskStart_ConcreteParent() {
		return (EReference)calcTaskStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcTaskEnd() {
		return calcTaskEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcTaskEnd_ConcreteParent() {
		return (EReference)calcTaskEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcTaskResources() {
		return calcTaskResourcesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcTaskResources_ConcreteParent() {
		return (EReference)calcTaskResourcesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUsePropagatorCalcFactory getToUsePropagatorCalcFactory() {
		return (ToUsePropagatorCalcFactory)getEFactoryInstance();
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
		scopeProjectEClass = createEClass(SCOPE_PROJECT);

		layerTaskHoursItemEClass = createEClass(LAYER_TASK_HOURS_ITEM);
		createEReference(layerTaskHoursItemEClass, LAYER_TASK_HOURS_ITEM__CONCRETE_PARENT);

		layerTaskHoursVarEClass = createEClass(LAYER_TASK_HOURS_VAR);
		createEReference(layerTaskHoursVarEClass, LAYER_TASK_HOURS_VAR__CONCRETE_PARENT);

		layerTaskHoursEClass = createEClass(LAYER_TASK_HOURS);
		createEReference(layerTaskHoursEClass, LAYER_TASK_HOURS__CONCRETE_PARENT);
		createEReference(layerTaskHoursEClass, LAYER_TASK_HOURS__ANTECEDENT_LAYER_TASK_HOURS_ITEM);
		createEReference(layerTaskHoursEClass, LAYER_TASK_HOURS__ANTECEDENT_LAYER_TASK_HOURS_VAR);

		layerTaskTimesEClass = createEClass(LAYER_TASK_TIMES);
		createEReference(layerTaskTimesEClass, LAYER_TASK_TIMES__CONCRETE_PARENT);
		createEReference(layerTaskTimesEClass, LAYER_TASK_TIMES__ANTECEDENT_LAYER_TASK_HOURS);

		layerTaskResourcesEClass = createEClass(LAYER_TASK_RESOURCES);
		createEReference(layerTaskResourcesEClass, LAYER_TASK_RESOURCES__ANTECEDENT_LAYER_TASK_TIMES);
		createEReference(layerTaskResourcesEClass, LAYER_TASK_RESOURCES__CONCRETE_PARENT);

		calcProjectEndEClass = createEClass(CALC_PROJECT_END);
		createEReference(calcProjectEndEClass, CALC_PROJECT_END__CONCRETE_PARENT);
		createEReference(calcProjectEndEClass, CALC_PROJECT_END__ANTECEDENT_LAYER_TASK_TIMES);

		calcTaskHoursItemEClass = createEClass(CALC_TASK_HOURS_ITEM);
		createEReference(calcTaskHoursItemEClass, CALC_TASK_HOURS_ITEM__CONCRETE_PARENT);

		calcTaskHoursVarEClass = createEClass(CALC_TASK_HOURS_VAR);
		createEReference(calcTaskHoursVarEClass, CALC_TASK_HOURS_VAR__CONCRETE_PARENT);

		calcTaskWithOverheadHoursVarEClass = createEClass(CALC_TASK_WITH_OVERHEAD_HOURS_VAR);

		calcTaskHoursEClass = createEClass(CALC_TASK_HOURS);
		createEReference(calcTaskHoursEClass, CALC_TASK_HOURS__CONCRETE_PARENT);

		calcTaskStartEClass = createEClass(CALC_TASK_START);
		createEReference(calcTaskStartEClass, CALC_TASK_START__CONCRETE_PARENT);

		calcTaskEndEClass = createEClass(CALC_TASK_END);
		createEReference(calcTaskEndEClass, CALC_TASK_END__CONCRETE_PARENT);

		calcTaskResourcesEClass = createEClass(CALC_TASK_RESOURCES);
		createEReference(calcTaskResourcesEClass, CALC_TASK_RESOURCES__CONCRETE_PARENT);
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
		ToUsePropagatorPackage theToUsePropagatorPackage = (ToUsePropagatorPackage)EPackage.Registry.INSTANCE.getEPackage(ToUsePropagatorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		scopeProjectEClass.getESuperTypes().add(theToUsePropagatorPackage.getToUsePropagatorFunctionProject());
		layerTaskHoursItemEClass.getESuperTypes().add(theToUsePropagatorPackage.getToUsePropagatorFunctionProject());
		layerTaskHoursVarEClass.getESuperTypes().add(theToUsePropagatorPackage.getToUsePropagatorFunctionProject());
		layerTaskHoursEClass.getESuperTypes().add(theToUsePropagatorPackage.getToUsePropagatorFunctionProject());
		layerTaskTimesEClass.getESuperTypes().add(theToUsePropagatorPackage.getToUsePropagatorFunctionProject());
		layerTaskResourcesEClass.getESuperTypes().add(theToUsePropagatorPackage.getToUsePropagatorFunctionProject());
		calcProjectEndEClass.getESuperTypes().add(theToUsePropagatorPackage.getToUsePropagatorFunctionProject());
		calcTaskHoursItemEClass.getESuperTypes().add(theToUsePropagatorPackage.getToUsePropagatorFunctionTask());
		calcTaskHoursVarEClass.getESuperTypes().add(theToUsePropagatorPackage.getToUsePropagatorFunctionTask());
		calcTaskWithOverheadHoursVarEClass.getESuperTypes().add(this.getCalcTaskHoursVar());
		calcTaskHoursEClass.getESuperTypes().add(theToUsePropagatorPackage.getToUsePropagatorFunctionTask());
		calcTaskStartEClass.getESuperTypes().add(theToUsePropagatorPackage.getToUsePropagatorFunctionTask());
		calcTaskEndEClass.getESuperTypes().add(theToUsePropagatorPackage.getToUsePropagatorFunctionTask());
		calcTaskResourcesEClass.getESuperTypes().add(theToUsePropagatorPackage.getToUsePropagatorFunctionTask());

		// Initialize classes, features, and operations; add parameters
		initEClass(scopeProjectEClass, ScopeProject.class, "ScopeProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(layerTaskHoursItemEClass, LayerTaskHoursItem.class, "LayerTaskHoursItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLayerTaskHoursItem_ConcreteParent(), this.getScopeProject(), null, "ConcreteParent", null, 1, 1, LayerTaskHoursItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layerTaskHoursVarEClass, LayerTaskHoursVar.class, "LayerTaskHoursVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLayerTaskHoursVar_ConcreteParent(), this.getScopeProject(), null, "ConcreteParent", null, 1, 1, LayerTaskHoursVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layerTaskHoursEClass, LayerTaskHours.class, "LayerTaskHours", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLayerTaskHours_ConcreteParent(), this.getScopeProject(), null, "ConcreteParent", null, 1, 1, LayerTaskHours.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayerTaskHours_AntecedentLayerTaskHoursItem(), this.getLayerTaskHoursItem(), null, "AntecedentLayerTaskHoursItem", null, 0, 1, LayerTaskHours.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayerTaskHours_AntecedentLayerTaskHoursVar(), this.getLayerTaskHoursVar(), null, "AntecedentLayerTaskHoursVar", null, 0, 1, LayerTaskHours.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layerTaskTimesEClass, LayerTaskTimes.class, "LayerTaskTimes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLayerTaskTimes_ConcreteParent(), this.getScopeProject(), null, "ConcreteParent", null, 1, 1, LayerTaskTimes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayerTaskTimes_AntecedentLayerTaskHours(), this.getLayerTaskHours(), null, "AntecedentLayerTaskHours", null, 0, 1, LayerTaskTimes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layerTaskResourcesEClass, LayerTaskResources.class, "LayerTaskResources", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLayerTaskResources_AntecedentLayerTaskTimes(), this.getLayerTaskTimes(), null, "AntecedentLayerTaskTimes", null, 0, 1, LayerTaskResources.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayerTaskResources_ConcreteParent(), this.getScopeProject(), null, "ConcreteParent", null, 0, 1, LayerTaskResources.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calcProjectEndEClass, CalcProjectEnd.class, "CalcProjectEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcProjectEnd_ConcreteParent(), this.getScopeProject(), null, "ConcreteParent", null, 0, 1, CalcProjectEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCalcProjectEnd_AntecedentLayerTaskTimes(), this.getLayerTaskTimes(), null, "AntecedentLayerTaskTimes", null, 0, 1, CalcProjectEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calcTaskHoursItemEClass, CalcTaskHoursItem.class, "CalcTaskHoursItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcTaskHoursItem_ConcreteParent(), this.getLayerTaskHoursItem(), null, "ConcreteParent", null, 1, 1, CalcTaskHoursItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calcTaskHoursVarEClass, CalcTaskHoursVar.class, "CalcTaskHoursVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcTaskHoursVar_ConcreteParent(), this.getLayerTaskHoursVar(), null, "ConcreteParent", null, 1, 1, CalcTaskHoursVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calcTaskWithOverheadHoursVarEClass, CalcTaskWithOverheadHoursVar.class, "CalcTaskWithOverheadHoursVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcTaskHoursEClass, CalcTaskHours.class, "CalcTaskHours", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcTaskHours_ConcreteParent(), this.getLayerTaskHours(), null, "ConcreteParent", null, 1, 1, CalcTaskHours.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calcTaskStartEClass, CalcTaskStart.class, "CalcTaskStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcTaskStart_ConcreteParent(), this.getLayerTaskTimes(), null, "ConcreteParent", null, 1, 1, CalcTaskStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calcTaskEndEClass, CalcTaskEnd.class, "CalcTaskEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcTaskEnd_ConcreteParent(), this.getLayerTaskTimes(), null, "ConcreteParent", null, 1, 1, CalcTaskEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calcTaskResourcesEClass, CalcTaskResources.class, "CalcTaskResources", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcTaskResources_ConcreteParent(), this.getLayerTaskResources(), null, "ConcreteParent", null, 0, 1, CalcTaskResources.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ToUsePropagatorCalcPackageImpl
