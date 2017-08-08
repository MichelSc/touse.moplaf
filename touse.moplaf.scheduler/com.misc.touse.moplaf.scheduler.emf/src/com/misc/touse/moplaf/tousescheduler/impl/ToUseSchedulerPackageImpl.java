/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.common.moplaf.propagator2.PropagatorPackage;

import com.misc.common.moplaf.scheduler.SchedulerPackage;

import com.misc.touse.moplaf.tousescheduler.Domain;
import com.misc.touse.moplaf.tousescheduler.ToUseResource;
import com.misc.touse.moplaf.tousescheduler.ToUseScheduler;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerFactory;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;
import com.misc.touse.moplaf.tousescheduler.ToUseSolutionResource;
import com.misc.touse.moplaf.tousescheduler.ToUseSolutionTask;
import com.misc.touse.moplaf.tousescheduler.ToUseTask;
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
	private EClass toUseSolutionTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toUseSolutionResourceEClass = null;

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
	public EClass getToUseScheduler() {
		return toUseSchedulerEClass;
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
	public EClass getToUseSolutionTask() {
		return toUseSolutionTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseSolutionTask_ToUseTask() {
		return (EReference)toUseSolutionTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUseSolutionResource() {
		return toUseSolutionResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseSolutionResource_ToUseResource() {
		return (EReference)toUseSolutionResourceEClass.getEStructuralFeatures().get(0);
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

		toUseSchedulerEClass = createEClass(TO_USE_SCHEDULER);

		toUseTaskEClass = createEClass(TO_USE_TASK);
		createEAttribute(toUseTaskEClass, TO_USE_TASK__NAME);

		toUseResourceEClass = createEClass(TO_USE_RESOURCE);
		createEAttribute(toUseResourceEClass, TO_USE_RESOURCE__NAME);

		toUseSolutionTaskEClass = createEClass(TO_USE_SOLUTION_TASK);
		createEReference(toUseSolutionTaskEClass, TO_USE_SOLUTION_TASK__TO_USE_TASK);

		toUseSolutionResourceEClass = createEClass(TO_USE_SOLUTION_RESOURCE);
		createEReference(toUseSolutionResourceEClass, TO_USE_SOLUTION_RESOURCE__TO_USE_RESOURCE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		toUseSchedulerEClass.getESuperTypes().add(theSchedulerPackage.getScheduler());
		toUseSolutionTaskEClass.getESuperTypes().add(theSchedulerPackage.getSolutionTask());
		toUseSolutionResourceEClass.getESuperTypes().add(theSchedulerPackage.getSolutionResource());

		// Initialize classes, features, and operations; add parameters
		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomain_Schedulers(), this.getToUseScheduler(), null, "Schedulers", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Resources(), this.getToUseResource(), null, "Resources", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Tasks(), this.getToUseTask(), null, "Tasks", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toUseSchedulerEClass, ToUseScheduler.class, "ToUseScheduler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(toUseTaskEClass, ToUseTask.class, "ToUseTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToUseTask_Name(), ecorePackage.getEString(), "Name", null, 0, 1, ToUseTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toUseResourceEClass, ToUseResource.class, "ToUseResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToUseResource_Name(), ecorePackage.getEString(), "Name", null, 0, 1, ToUseResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toUseSolutionTaskEClass, ToUseSolutionTask.class, "ToUseSolutionTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToUseSolutionTask_ToUseTask(), this.getToUseTask(), null, "ToUseTask", null, 1, 1, ToUseSolutionTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toUseSolutionResourceEClass, ToUseSolutionResource.class, "ToUseSolutionResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToUseSolutionResource_ToUseResource(), this.getToUseResource(), null, "ToUseResource", null, 1, 1, ToUseSolutionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ToUseSchedulerPackageImpl
