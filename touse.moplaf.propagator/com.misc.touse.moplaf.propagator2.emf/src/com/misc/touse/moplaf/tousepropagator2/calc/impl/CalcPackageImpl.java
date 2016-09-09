/**
 */
package com.misc.touse.moplaf.tousepropagator2.calc.impl;

import com.misc.common.moplaf.propagator2.PropagatorPackage;
import com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage;
import com.misc.touse.moplaf.tousepropagator2.calc.CalcFactory;
import com.misc.touse.moplaf.tousepropagator2.calc.CalcPackage;
import com.misc.touse.moplaf.tousepropagator2.calc.CalcProjectEnd;
import com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskEnd;
import com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskHours;
import com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskHoursItem;
import com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskHoursVar;
import com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskResources;
import com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskStart;
import com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskHours;
import com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskHoursItem;
import com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskHoursVar;
import com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskResources;
import com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskTimes;
import com.misc.touse.moplaf.tousepropagator2.calc.ScopeProject;
import com.misc.touse.moplaf.tousepropagator2.calc.ToUsePropagatorFunction;
import com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorPackageImpl;

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
public class CalcPackageImpl extends EPackageImpl implements CalcPackage {
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
	private EClass toUsePropagatorFunctionEClass = null;

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
	private EClass calcTaskHoursEClass = null;

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
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CalcPackageImpl() {
		super(eNS_URI, CalcFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CalcPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CalcPackage init() {
		if (isInited) return (CalcPackage)EPackage.Registry.INSTANCE.getEPackage(CalcPackage.eNS_URI);

		// Obtain or create and register package
		CalcPackageImpl theCalcPackage = (CalcPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CalcPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CalcPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PropagatorPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ToUsePropagatorPackageImpl theToUsePropagatorPackage = (ToUsePropagatorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ToUsePropagatorPackage.eNS_URI) instanceof ToUsePropagatorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ToUsePropagatorPackage.eNS_URI) : ToUsePropagatorPackage.eINSTANCE);

		// Create package meta-data objects
		theCalcPackage.createPackageContents();
		theToUsePropagatorPackage.createPackageContents();

		// Initialize created meta-data
		theCalcPackage.initializePackageContents();
		theToUsePropagatorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCalcPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CalcPackage.eNS_URI, theCalcPackage);
		return theCalcPackage;
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
	public EReference getCalcTaskStart_Task() {
		return (EReference)calcTaskStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcTaskStart_ConcreteParent() {
		return (EReference)calcTaskStartEClass.getEStructuralFeatures().get(1);
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
	public EReference getCalcTaskEnd_Task() {
		return (EReference)calcTaskEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcTaskEnd_ConcreteParent() {
		return (EReference)calcTaskEndEClass.getEStructuralFeatures().get(1);
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
	public EReference getCalcTaskResources_Task() {
		return (EReference)calcTaskResourcesEClass.getEStructuralFeatures().get(1);
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
	public EReference getCalcProjectEnd_Project() {
		return (EReference)calcProjectEndEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcProjectEnd_AntecedentLayerTaskTimes() {
		return (EReference)calcProjectEndEClass.getEStructuralFeatures().get(2);
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
	public EReference getLayerTaskResources_Project() {
		return (EReference)layerTaskResourcesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayerTaskResources_AntecedentLayerTaskTimes() {
		return (EReference)layerTaskResourcesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayerTaskResources_ConcreteParent() {
		return (EReference)layerTaskResourcesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUsePropagatorFunction() {
		return toUsePropagatorFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToUsePropagatorFunction_Calculated() {
		return (EAttribute)toUsePropagatorFunctionEClass.getEStructuralFeatures().get(0);
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
	public EReference getLayerTaskTimes_Project() {
		return (EReference)layerTaskTimesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayerTaskTimes_ConcreteParent() {
		return (EReference)layerTaskTimesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayerTaskTimes_AntecedentLayerTaskHours() {
		return (EReference)layerTaskTimesEClass.getEStructuralFeatures().get(2);
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
	public EReference getCalcTaskHoursItem_Task() {
		return (EReference)calcTaskHoursItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcTaskHoursItem_ConcreteParent() {
		return (EReference)calcTaskHoursItemEClass.getEStructuralFeatures().get(1);
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
	public EReference getCalcTaskHoursVar_Task() {
		return (EReference)calcTaskHoursVarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcTaskHoursVar_ConcreteParent() {
		return (EReference)calcTaskHoursVarEClass.getEStructuralFeatures().get(1);
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
	public EReference getCalcTaskHours_Task() {
		return (EReference)calcTaskHoursEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcTaskHours_ConcreteParent() {
		return (EReference)calcTaskHoursEClass.getEStructuralFeatures().get(1);
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
	public EReference getScopeProject_Project() {
		return (EReference)scopeProjectEClass.getEStructuralFeatures().get(0);
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
	public EReference getLayerTaskHoursItem_Project() {
		return (EReference)layerTaskHoursItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayerTaskHoursItem_ConcreteParent() {
		return (EReference)layerTaskHoursItemEClass.getEStructuralFeatures().get(1);
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
	public EReference getLayerTaskHoursVar_Project() {
		return (EReference)layerTaskHoursVarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayerTaskHoursVar_ConcreteParent() {
		return (EReference)layerTaskHoursVarEClass.getEStructuralFeatures().get(1);
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
	public EReference getLayerTaskHours_Project() {
		return (EReference)layerTaskHoursEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayerTaskHours_ConcreteParent() {
		return (EReference)layerTaskHoursEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayerTaskHours_AntecedentLayerTaskHoursItem() {
		return (EReference)layerTaskHoursEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayerTaskHours_AntecedentLayerTaskHoursVar() {
		return (EReference)layerTaskHoursEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcFactory getCalcFactory() {
		return (CalcFactory)getEFactoryInstance();
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
		createEReference(scopeProjectEClass, SCOPE_PROJECT__PROJECT);

		layerTaskHoursItemEClass = createEClass(LAYER_TASK_HOURS_ITEM);
		createEReference(layerTaskHoursItemEClass, LAYER_TASK_HOURS_ITEM__PROJECT);
		createEReference(layerTaskHoursItemEClass, LAYER_TASK_HOURS_ITEM__CONCRETE_PARENT);

		layerTaskHoursVarEClass = createEClass(LAYER_TASK_HOURS_VAR);
		createEReference(layerTaskHoursVarEClass, LAYER_TASK_HOURS_VAR__PROJECT);
		createEReference(layerTaskHoursVarEClass, LAYER_TASK_HOURS_VAR__CONCRETE_PARENT);

		layerTaskHoursEClass = createEClass(LAYER_TASK_HOURS);
		createEReference(layerTaskHoursEClass, LAYER_TASK_HOURS__PROJECT);
		createEReference(layerTaskHoursEClass, LAYER_TASK_HOURS__CONCRETE_PARENT);
		createEReference(layerTaskHoursEClass, LAYER_TASK_HOURS__ANTECEDENT_LAYER_TASK_HOURS_ITEM);
		createEReference(layerTaskHoursEClass, LAYER_TASK_HOURS__ANTECEDENT_LAYER_TASK_HOURS_VAR);

		layerTaskTimesEClass = createEClass(LAYER_TASK_TIMES);
		createEReference(layerTaskTimesEClass, LAYER_TASK_TIMES__PROJECT);
		createEReference(layerTaskTimesEClass, LAYER_TASK_TIMES__CONCRETE_PARENT);
		createEReference(layerTaskTimesEClass, LAYER_TASK_TIMES__ANTECEDENT_LAYER_TASK_HOURS);

		calcProjectEndEClass = createEClass(CALC_PROJECT_END);
		createEReference(calcProjectEndEClass, CALC_PROJECT_END__CONCRETE_PARENT);
		createEReference(calcProjectEndEClass, CALC_PROJECT_END__PROJECT);
		createEReference(calcProjectEndEClass, CALC_PROJECT_END__ANTECEDENT_LAYER_TASK_TIMES);

		layerTaskResourcesEClass = createEClass(LAYER_TASK_RESOURCES);
		createEReference(layerTaskResourcesEClass, LAYER_TASK_RESOURCES__PROJECT);
		createEReference(layerTaskResourcesEClass, LAYER_TASK_RESOURCES__ANTECEDENT_LAYER_TASK_TIMES);
		createEReference(layerTaskResourcesEClass, LAYER_TASK_RESOURCES__CONCRETE_PARENT);

		calcTaskHoursItemEClass = createEClass(CALC_TASK_HOURS_ITEM);
		createEReference(calcTaskHoursItemEClass, CALC_TASK_HOURS_ITEM__TASK);
		createEReference(calcTaskHoursItemEClass, CALC_TASK_HOURS_ITEM__CONCRETE_PARENT);

		calcTaskHoursVarEClass = createEClass(CALC_TASK_HOURS_VAR);
		createEReference(calcTaskHoursVarEClass, CALC_TASK_HOURS_VAR__TASK);
		createEReference(calcTaskHoursVarEClass, CALC_TASK_HOURS_VAR__CONCRETE_PARENT);

		calcTaskHoursEClass = createEClass(CALC_TASK_HOURS);
		createEReference(calcTaskHoursEClass, CALC_TASK_HOURS__TASK);
		createEReference(calcTaskHoursEClass, CALC_TASK_HOURS__CONCRETE_PARENT);

		calcTaskStartEClass = createEClass(CALC_TASK_START);
		createEReference(calcTaskStartEClass, CALC_TASK_START__TASK);
		createEReference(calcTaskStartEClass, CALC_TASK_START__CONCRETE_PARENT);

		calcTaskEndEClass = createEClass(CALC_TASK_END);
		createEReference(calcTaskEndEClass, CALC_TASK_END__TASK);
		createEReference(calcTaskEndEClass, CALC_TASK_END__CONCRETE_PARENT);

		calcTaskResourcesEClass = createEClass(CALC_TASK_RESOURCES);
		createEReference(calcTaskResourcesEClass, CALC_TASK_RESOURCES__CONCRETE_PARENT);
		createEReference(calcTaskResourcesEClass, CALC_TASK_RESOURCES__TASK);

		toUsePropagatorFunctionEClass = createEClass(TO_USE_PROPAGATOR_FUNCTION);
		createEAttribute(toUsePropagatorFunctionEClass, TO_USE_PROPAGATOR_FUNCTION__CALCULATED);
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
		PropagatorPackage thePropagatorPackage = (PropagatorPackage)EPackage.Registry.INSTANCE.getEPackage(PropagatorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		scopeProjectEClass.getESuperTypes().add(this.getToUsePropagatorFunction());
		layerTaskHoursItemEClass.getESuperTypes().add(this.getToUsePropagatorFunction());
		layerTaskHoursVarEClass.getESuperTypes().add(this.getToUsePropagatorFunction());
		layerTaskHoursEClass.getESuperTypes().add(this.getToUsePropagatorFunction());
		layerTaskTimesEClass.getESuperTypes().add(this.getToUsePropagatorFunction());
		calcProjectEndEClass.getESuperTypes().add(this.getToUsePropagatorFunction());
		layerTaskResourcesEClass.getESuperTypes().add(this.getToUsePropagatorFunction());
		calcTaskHoursItemEClass.getESuperTypes().add(this.getToUsePropagatorFunction());
		calcTaskHoursVarEClass.getESuperTypes().add(this.getToUsePropagatorFunction());
		calcTaskHoursEClass.getESuperTypes().add(this.getToUsePropagatorFunction());
		calcTaskStartEClass.getESuperTypes().add(this.getToUsePropagatorFunction());
		calcTaskEndEClass.getESuperTypes().add(this.getToUsePropagatorFunction());
		calcTaskResourcesEClass.getESuperTypes().add(this.getToUsePropagatorFunction());
		toUsePropagatorFunctionEClass.getESuperTypes().add(thePropagatorPackage.getPropagatorFunction());

		// Initialize classes, features, and operations; add parameters
		initEClass(scopeProjectEClass, ScopeProject.class, "ScopeProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScopeProject_Project(), theToUsePropagatorPackage.getProject(), theToUsePropagatorPackage.getProject_ScopeProject(), "Project", null, 1, 1, ScopeProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layerTaskHoursItemEClass, LayerTaskHoursItem.class, "LayerTaskHoursItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLayerTaskHoursItem_Project(), theToUsePropagatorPackage.getProject(), theToUsePropagatorPackage.getProject_LayerTaskHoursItem(), "Project", null, 1, 1, LayerTaskHoursItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayerTaskHoursItem_ConcreteParent(), this.getScopeProject(), null, "ConcreteParent", null, 1, 1, LayerTaskHoursItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layerTaskHoursVarEClass, LayerTaskHoursVar.class, "LayerTaskHoursVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLayerTaskHoursVar_Project(), theToUsePropagatorPackage.getProject(), theToUsePropagatorPackage.getProject_LayerTaskHoursVar(), "Project", null, 1, 1, LayerTaskHoursVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayerTaskHoursVar_ConcreteParent(), this.getScopeProject(), null, "ConcreteParent", null, 1, 1, LayerTaskHoursVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layerTaskHoursEClass, LayerTaskHours.class, "LayerTaskHours", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLayerTaskHours_Project(), theToUsePropagatorPackage.getProject(), theToUsePropagatorPackage.getProject_LayerTaskHours(), "Project", null, 1, 1, LayerTaskHours.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayerTaskHours_ConcreteParent(), this.getScopeProject(), null, "ConcreteParent", null, 1, 1, LayerTaskHours.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayerTaskHours_AntecedentLayerTaskHoursItem(), this.getLayerTaskHoursItem(), null, "AntecedentLayerTaskHoursItem", null, 0, 1, LayerTaskHours.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayerTaskHours_AntecedentLayerTaskHoursVar(), this.getLayerTaskHoursVar(), null, "AntecedentLayerTaskHoursVar", null, 0, 1, LayerTaskHours.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layerTaskTimesEClass, LayerTaskTimes.class, "LayerTaskTimes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLayerTaskTimes_Project(), theToUsePropagatorPackage.getProject(), theToUsePropagatorPackage.getProject_LayerTaskTimes(), "Project", null, 1, 1, LayerTaskTimes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayerTaskTimes_ConcreteParent(), this.getScopeProject(), null, "ConcreteParent", null, 1, 1, LayerTaskTimes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayerTaskTimes_AntecedentLayerTaskHours(), this.getLayerTaskHours(), null, "AntecedentLayerTaskHours", null, 0, 1, LayerTaskTimes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calcProjectEndEClass, CalcProjectEnd.class, "CalcProjectEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcProjectEnd_ConcreteParent(), this.getScopeProject(), null, "ConcreteParent", null, 0, 1, CalcProjectEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCalcProjectEnd_Project(), theToUsePropagatorPackage.getProject(), theToUsePropagatorPackage.getProject_CalcProjectEnd(), "Project", null, 1, 1, CalcProjectEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCalcProjectEnd_AntecedentLayerTaskTimes(), this.getLayerTaskTimes(), null, "AntecedentLayerTaskTimes", null, 0, 1, CalcProjectEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layerTaskResourcesEClass, LayerTaskResources.class, "LayerTaskResources", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLayerTaskResources_Project(), theToUsePropagatorPackage.getProject(), theToUsePropagatorPackage.getProject_LayerTaskResources(), "Project", null, 1, 1, LayerTaskResources.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayerTaskResources_AntecedentLayerTaskTimes(), this.getLayerTaskTimes(), null, "AntecedentLayerTaskTimes", null, 0, 1, LayerTaskResources.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayerTaskResources_ConcreteParent(), this.getScopeProject(), null, "ConcreteParent", null, 0, 1, LayerTaskResources.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calcTaskHoursItemEClass, CalcTaskHoursItem.class, "CalcTaskHoursItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcTaskHoursItem_Task(), theToUsePropagatorPackage.getTask(), theToUsePropagatorPackage.getTask_CalcTaskHoursItem(), "Task", null, 1, 1, CalcTaskHoursItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCalcTaskHoursItem_ConcreteParent(), this.getLayerTaskHoursItem(), null, "ConcreteParent", null, 1, 1, CalcTaskHoursItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calcTaskHoursVarEClass, CalcTaskHoursVar.class, "CalcTaskHoursVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcTaskHoursVar_Task(), theToUsePropagatorPackage.getTask(), theToUsePropagatorPackage.getTask_CalcTaskHoursVar(), "Task", null, 1, 1, CalcTaskHoursVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCalcTaskHoursVar_ConcreteParent(), this.getLayerTaskHoursVar(), null, "ConcreteParent", null, 1, 1, CalcTaskHoursVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calcTaskHoursEClass, CalcTaskHours.class, "CalcTaskHours", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcTaskHours_Task(), theToUsePropagatorPackage.getTask(), theToUsePropagatorPackage.getTask_CalcTaskHours(), "Task", null, 1, 1, CalcTaskHours.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCalcTaskHours_ConcreteParent(), this.getLayerTaskHours(), null, "ConcreteParent", null, 1, 1, CalcTaskHours.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calcTaskStartEClass, CalcTaskStart.class, "CalcTaskStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcTaskStart_Task(), theToUsePropagatorPackage.getTask(), theToUsePropagatorPackage.getTask_CalcTaskStart(), "Task", null, 1, 1, CalcTaskStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCalcTaskStart_ConcreteParent(), this.getLayerTaskTimes(), null, "ConcreteParent", null, 1, 1, CalcTaskStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calcTaskEndEClass, CalcTaskEnd.class, "CalcTaskEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcTaskEnd_Task(), theToUsePropagatorPackage.getTask(), theToUsePropagatorPackage.getTask_CalcTaskEnd(), "Task", null, 1, 1, CalcTaskEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCalcTaskEnd_ConcreteParent(), this.getLayerTaskTimes(), null, "ConcreteParent", null, 1, 1, CalcTaskEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calcTaskResourcesEClass, CalcTaskResources.class, "CalcTaskResources", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcTaskResources_ConcreteParent(), this.getLayerTaskResources(), null, "ConcreteParent", null, 0, 1, CalcTaskResources.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCalcTaskResources_Task(), theToUsePropagatorPackage.getTask(), theToUsePropagatorPackage.getTask_CalcTaskResources(), "Task", null, 1, 1, CalcTaskResources.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toUsePropagatorFunctionEClass, ToUsePropagatorFunction.class, "ToUsePropagatorFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToUsePropagatorFunction_Calculated(), ecorePackage.getEBoolean(), "Calculated", null, 0, 1, ToUsePropagatorFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //CalcPackageImpl
