/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.common.moplaf.localsearch.LocalSearchPackage;
import com.misc.common.moplaf.propagator2.PropagatorPackage;

import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.touse.moplaf.tousescheduler.CalcResource;
import com.misc.touse.moplaf.tousescheduler.CalcResourceDistance;
import com.misc.touse.moplaf.tousescheduler.CalcSchedule;
import com.misc.touse.moplaf.tousescheduler.CalcScheduler;
import com.misc.touse.moplaf.tousescheduler.CalcTask;
import com.misc.touse.moplaf.tousescheduler.CalcTaskDistance;
import com.misc.touse.moplaf.tousescheduler.Domain;
import com.misc.touse.moplaf.tousescheduler.LayerScheduleDistance;
import com.misc.touse.moplaf.tousescheduler.ScopeScheduleScore;
import com.misc.touse.moplaf.tousescheduler.ToUseAction;
import com.misc.touse.moplaf.tousescheduler.ToUseResource;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedule;
import com.misc.touse.moplaf.tousescheduler.ToUseScheduleLoadUnload;
import com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource;
import com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask;
import com.misc.touse.moplaf.tousescheduler.ToUseScheduler;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerFactory;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;
import com.misc.touse.moplaf.tousescheduler.ToUseScore;
import com.misc.touse.moplaf.tousescheduler.ToUseTask;
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
public class ToUseSchedulerPackageImpl extends EPackageImpl implements ToUseSchedulerPackage {
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
	private EClass toUseScoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toUseSchedulerEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toUseTaskEClass = null;

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
	private EClass toUseScheduleTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcSchedulerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toUseScheduleResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopeScheduleScoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layerScheduleDistanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcTaskDistanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcResourceDistanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toUseActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toUseScheduleLoadUnloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toUseScheduleEClass = null;

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
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ToUseSchedulerPackageImpl() {
		super(eNS_URI, ToUseSchedulerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ToUseSchedulerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ToUseSchedulerPackage init() {
		if (isInited) return (ToUseSchedulerPackage)EPackage.Registry.INSTANCE.getEPackage(ToUseSchedulerPackage.eNS_URI);

		// Obtain or create and register package
		ToUseSchedulerPackageImpl theToUseSchedulerPackage = (ToUseSchedulerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ToUseSchedulerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ToUseSchedulerPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PropagatorPackage.eINSTANCE.eClass();
		SchedulerPackage.eINSTANCE.eClass();
		LocalSearchPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theToUseSchedulerPackage.createPackageContents();

		// Initialize created meta-data
		theToUseSchedulerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theToUseSchedulerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ToUseSchedulerPackage.eNS_URI, theToUseSchedulerPackage);
		return theToUseSchedulerPackage;
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
	public EReference getDomain_Schedulers() {
		return (EReference)domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Resources() {
		return (EReference)domainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Tasks() {
		return (EReference)domainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUseScore() {
		return toUseScoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToUseScore_TotalDistance() {
		return (EAttribute)toUseScoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUseScheduler() {
		return toUseSchedulerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseScheduler_SchedulerResources() {
		return (EReference)toUseSchedulerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseScheduler_SchedulerTasks() {
		return (EReference)toUseSchedulerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUseTask() {
		return toUseTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToUseTask_Name() {
		return (EAttribute)toUseTaskEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getToUseResource_Name() {
		return (EAttribute)toUseResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUseScheduleTask() {
		return toUseScheduleTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseScheduleTask_ToUseTask() {
		return (EReference)toUseScheduleTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToUseScheduleTask_Distance() {
		return (EAttribute)toUseScheduleTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcScheduler() {
		return calcSchedulerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcSchedule() {
		return calcScheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcSchedule_Schedule() {
		return (EReference)calcScheduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcResource() {
		return calcResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcResource_Resource() {
		return (EReference)calcResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcTask() {
		return calcTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcTask_Task() {
		return (EReference)calcTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUseScheduleResource() {
		return toUseScheduleResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseScheduleResource_ToUseResource() {
		return (EReference)toUseScheduleResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToUseScheduleResource_TotalDistance() {
		return (EAttribute)toUseScheduleResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScopeScheduleScore() {
		return scopeScheduleScoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayerScheduleDistance() {
		return layerScheduleDistanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayerScheduleDistance_ConcreteParent() {
		return (EReference)layerScheduleDistanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcTaskDistance() {
		return calcTaskDistanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcTaskDistance_ConcreteParent() {
		return (EReference)calcTaskDistanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcResourceDistance() {
		return calcResourceDistanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcResourceDistance_ConcreteParent() {
		return (EReference)calcResourceDistanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUseAction() {
		return toUseActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUseScheduleLoadUnload() {
		return toUseScheduleLoadUnloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseScheduleLoadUnload_LoadTask() {
		return (EReference)toUseScheduleLoadUnloadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseScheduleLoadUnload_UnloadTask() {
		return (EReference)toUseScheduleLoadUnloadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUseSchedule() {
		return toUseScheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseSchedule_Actions() {
		return (EReference)toUseScheduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getToUseSchedule__Enable() {
		return toUseScheduleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseSchedulerFactory getToUseSchedulerFactory() {
		return (ToUseSchedulerFactory)getEFactoryInstance();
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
		createEReference(domainEClass, DOMAIN__SCHEDULERS);
		createEReference(domainEClass, DOMAIN__RESOURCES);
		createEReference(domainEClass, DOMAIN__TASKS);

		toUseResourceEClass = createEClass(TO_USE_RESOURCE);
		createEAttribute(toUseResourceEClass, TO_USE_RESOURCE__NAME);

		toUseTaskEClass = createEClass(TO_USE_TASK);
		createEAttribute(toUseTaskEClass, TO_USE_TASK__NAME);

		toUseSchedulerEClass = createEClass(TO_USE_SCHEDULER);
		createEReference(toUseSchedulerEClass, TO_USE_SCHEDULER__SCHEDULER_RESOURCES);
		createEReference(toUseSchedulerEClass, TO_USE_SCHEDULER__SCHEDULER_TASKS);

		toUseScheduleEClass = createEClass(TO_USE_SCHEDULE);
		createEReference(toUseScheduleEClass, TO_USE_SCHEDULE__ACTIONS);
		createEOperation(toUseScheduleEClass, TO_USE_SCHEDULE___ENABLE);

		toUseScoreEClass = createEClass(TO_USE_SCORE);
		createEAttribute(toUseScoreEClass, TO_USE_SCORE__TOTAL_DISTANCE);

		toUseScheduleResourceEClass = createEClass(TO_USE_SCHEDULE_RESOURCE);
		createEReference(toUseScheduleResourceEClass, TO_USE_SCHEDULE_RESOURCE__TO_USE_RESOURCE);
		createEAttribute(toUseScheduleResourceEClass, TO_USE_SCHEDULE_RESOURCE__TOTAL_DISTANCE);

		toUseScheduleTaskEClass = createEClass(TO_USE_SCHEDULE_TASK);
		createEReference(toUseScheduleTaskEClass, TO_USE_SCHEDULE_TASK__TO_USE_TASK);
		createEAttribute(toUseScheduleTaskEClass, TO_USE_SCHEDULE_TASK__DISTANCE);

		calcSchedulerEClass = createEClass(CALC_SCHEDULER);

		calcScheduleEClass = createEClass(CALC_SCHEDULE);
		createEReference(calcScheduleEClass, CALC_SCHEDULE__SCHEDULE);

		calcResourceEClass = createEClass(CALC_RESOURCE);
		createEReference(calcResourceEClass, CALC_RESOURCE__RESOURCE);

		calcTaskEClass = createEClass(CALC_TASK);
		createEReference(calcTaskEClass, CALC_TASK__TASK);

		scopeScheduleScoreEClass = createEClass(SCOPE_SCHEDULE_SCORE);

		layerScheduleDistanceEClass = createEClass(LAYER_SCHEDULE_DISTANCE);
		createEReference(layerScheduleDistanceEClass, LAYER_SCHEDULE_DISTANCE__CONCRETE_PARENT);

		calcTaskDistanceEClass = createEClass(CALC_TASK_DISTANCE);
		createEReference(calcTaskDistanceEClass, CALC_TASK_DISTANCE__CONCRETE_PARENT);

		calcResourceDistanceEClass = createEClass(CALC_RESOURCE_DISTANCE);
		createEReference(calcResourceDistanceEClass, CALC_RESOURCE_DISTANCE__CONCRETE_PARENT);

		toUseActionEClass = createEClass(TO_USE_ACTION);

		toUseScheduleLoadUnloadEClass = createEClass(TO_USE_SCHEDULE_LOAD_UNLOAD);
		createEReference(toUseScheduleLoadUnloadEClass, TO_USE_SCHEDULE_LOAD_UNLOAD__LOAD_TASK);
		createEReference(toUseScheduleLoadUnloadEClass, TO_USE_SCHEDULE_LOAD_UNLOAD__UNLOAD_TASK);
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
		SchedulerPackage theSchedulerPackage = (SchedulerPackage)EPackage.Registry.INSTANCE.getEPackage(SchedulerPackage.eNS_URI);
		LocalSearchPackage theLocalSearchPackage = (LocalSearchPackage)EPackage.Registry.INSTANCE.getEPackage(LocalSearchPackage.eNS_URI);
		PropagatorPackage thePropagatorPackage = (PropagatorPackage)EPackage.Registry.INSTANCE.getEPackage(PropagatorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		toUseSchedulerEClass.getESuperTypes().add(theSchedulerPackage.getScheduler());
		toUseScheduleEClass.getESuperTypes().add(theSchedulerPackage.getSchedule());
		toUseScoreEClass.getESuperTypes().add(theLocalSearchPackage.getScore());
		toUseScheduleResourceEClass.getESuperTypes().add(theSchedulerPackage.getResource());
		toUseScheduleTaskEClass.getESuperTypes().add(theSchedulerPackage.getTask());
		calcSchedulerEClass.getESuperTypes().add(thePropagatorPackage.getPropagatorFunctionBindings());
		calcScheduleEClass.getESuperTypes().add(this.getCalcScheduler());
		calcResourceEClass.getESuperTypes().add(this.getCalcScheduler());
		calcTaskEClass.getESuperTypes().add(this.getCalcScheduler());
		scopeScheduleScoreEClass.getESuperTypes().add(this.getCalcSchedule());
		layerScheduleDistanceEClass.getESuperTypes().add(this.getCalcSchedule());
		calcTaskDistanceEClass.getESuperTypes().add(this.getCalcTask());
		calcResourceDistanceEClass.getESuperTypes().add(this.getCalcResource());
		toUseActionEClass.getESuperTypes().add(theLocalSearchPackage.getAction());
		toUseScheduleLoadUnloadEClass.getESuperTypes().add(this.getToUseAction());

		// Initialize classes, features, and operations; add parameters
		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomain_Schedulers(), this.getToUseScheduler(), null, "Schedulers", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Resources(), this.getToUseResource(), null, "Resources", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Tasks(), this.getToUseTask(), null, "Tasks", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toUseResourceEClass, ToUseResource.class, "ToUseResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToUseResource_Name(), ecorePackage.getEString(), "Name", null, 0, 1, ToUseResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toUseTaskEClass, ToUseTask.class, "ToUseTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToUseTask_Name(), ecorePackage.getEString(), "Name", null, 0, 1, ToUseTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toUseSchedulerEClass, ToUseScheduler.class, "ToUseScheduler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToUseScheduler_SchedulerResources(), this.getToUseScheduleResource(), null, "SchedulerResources", null, 0, 1, ToUseScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToUseScheduler_SchedulerTasks(), this.getToUseScheduleTask(), null, "SchedulerTasks", null, 0, 1, ToUseScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toUseScheduleEClass, ToUseSchedule.class, "ToUseSchedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToUseSchedule_Actions(), this.getToUseAction(), null, "Actions", null, 0, -1, ToUseSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getToUseSchedule__Enable(), null, "enable", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(toUseScoreEClass, ToUseScore.class, "ToUseScore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToUseScore_TotalDistance(), ecorePackage.getEFloat(), "TotalDistance", null, 0, 1, ToUseScore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toUseScheduleResourceEClass, ToUseScheduleResource.class, "ToUseScheduleResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToUseScheduleResource_ToUseResource(), this.getToUseResource(), null, "ToUseResource", null, 1, 1, ToUseScheduleResource.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getToUseScheduleResource_TotalDistance(), ecorePackage.getEFloat(), "TotalDistance", null, 0, 1, ToUseScheduleResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toUseScheduleTaskEClass, ToUseScheduleTask.class, "ToUseScheduleTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToUseScheduleTask_ToUseTask(), this.getToUseTask(), null, "ToUseTask", null, 1, 1, ToUseScheduleTask.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getToUseScheduleTask_Distance(), ecorePackage.getEFloat(), "Distance", null, 0, 1, ToUseScheduleTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calcSchedulerEClass, CalcScheduler.class, "CalcScheduler", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcScheduleEClass, CalcSchedule.class, "CalcSchedule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcSchedule_Schedule(), this.getToUseSchedule(), null, "Schedule", null, 1, 1, CalcSchedule.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(calcResourceEClass, CalcResource.class, "CalcResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcResource_Resource(), this.getToUseScheduleResource(), null, "Resource", null, 1, 1, CalcResource.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(calcTaskEClass, CalcTask.class, "CalcTask", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcTask_Task(), this.getToUseScheduleTask(), null, "Task", null, 1, 1, CalcTask.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(scopeScheduleScoreEClass, ScopeScheduleScore.class, "ScopeScheduleScore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(layerScheduleDistanceEClass, LayerScheduleDistance.class, "LayerScheduleDistance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLayerScheduleDistance_ConcreteParent(), this.getScopeScheduleScore(), null, "ConcreteParent", null, 1, 1, LayerScheduleDistance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(calcTaskDistanceEClass, CalcTaskDistance.class, "CalcTaskDistance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcTaskDistance_ConcreteParent(), this.getLayerScheduleDistance(), null, "ConcreteParent", null, 1, 1, CalcTaskDistance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(calcResourceDistanceEClass, CalcResourceDistance.class, "CalcResourceDistance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcResourceDistance_ConcreteParent(), this.getLayerScheduleDistance(), null, "ConcreteParent", null, 1, 1, CalcResourceDistance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(toUseActionEClass, ToUseAction.class, "ToUseAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(toUseScheduleLoadUnloadEClass, ToUseScheduleLoadUnload.class, "ToUseScheduleLoadUnload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToUseScheduleLoadUnload_LoadTask(), this.getToUseScheduleTask(), null, "LoadTask", null, 1, 1, ToUseScheduleLoadUnload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToUseScheduleLoadUnload_UnloadTask(), this.getToUseScheduleTask(), null, "UnloadTask", null, 1, 1, ToUseScheduleLoadUnload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ToUseSchedulerPackageImpl
