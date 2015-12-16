/**
 */
package com.misc.touse.moplaf.tousepropagator.impl;

import com.misc.common.moplaf.propagator.PropagatorPackage;
import com.misc.touse.moplaf.tousepropagator.Dependence;
import com.misc.touse.moplaf.tousepropagator.Project;
import com.misc.touse.moplaf.tousepropagator.Resource;
import com.misc.touse.moplaf.tousepropagator.ResourceCandidate;
import com.misc.touse.moplaf.tousepropagator.Task;
import com.misc.touse.moplaf.tousepropagator.TaskItem;
import com.misc.touse.moplaf.tousepropagator.ToUsePropagatorFactory;
import com.misc.touse.moplaf.tousepropagator.ToUsePropagatorPackage;
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
public class ToUsePropagatorPackageImpl extends EPackageImpl implements ToUsePropagatorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceCandidateEClass = null;

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
	 * @see com.misc.touse.moplaf.tousepropagator.ToUsePropagatorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ToUsePropagatorPackageImpl() {
		super(eNS_URI, ToUsePropagatorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ToUsePropagatorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ToUsePropagatorPackage init() {
		if (isInited) return (ToUsePropagatorPackage)EPackage.Registry.INSTANCE.getEPackage(ToUsePropagatorPackage.eNS_URI);

		// Obtain or create and register package
		ToUsePropagatorPackageImpl theToUsePropagatorPackage = (ToUsePropagatorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ToUsePropagatorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ToUsePropagatorPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PropagatorPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theToUsePropagatorPackage.createPackageContents();

		// Initialize created meta-data
		theToUsePropagatorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theToUsePropagatorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ToUsePropagatorPackage.eNS_URI, theToUsePropagatorPackage);
		return theToUsePropagatorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Tasks() {
		return (EReference)projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Dependences() {
		return (EReference)projectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_NofRes() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_Start() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_End() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_ProjectName() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Resources() {
		return (EReference)projectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProject__RefreshEnd() {
		return projectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProject__Refresh() {
		return projectEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Start() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_End() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Hours() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_HoursItems() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_HoursVar() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_HoursVarPerRes() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_DependencesAfter() {
		return (EReference)taskEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_DependencesBefore() {
		return (EReference)taskEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_TaskName() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Items() {
		return (EReference)taskEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Project() {
		return (EReference)taskEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Resourcecandidate() {
		return (EReference)taskEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__RefreshStart() {
		return taskEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__RefreshEnd() {
		return taskEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__RefreshHours() {
		return taskEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__RefreshHoursItem() {
		return taskEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__RefreshHoursVar() {
		return taskEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__RefreshResourceCandidates__Resource() {
		return taskEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__RefreshResourceCandidates() {
		return taskEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependence() {
		return dependenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependence_TaskBefore() {
		return (EReference)dependenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependence_TaskAfter() {
		return (EReference)dependenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependence_Hours() {
		return (EAttribute)dependenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependence_Project() {
		return (EReference)dependenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependence_Notes() {
		return (EAttribute)dependenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskItem() {
		return taskItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskItem_Name() {
		return (EAttribute)taskItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskItem_Hours() {
		return (EAttribute)taskItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Start() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_End() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_Project() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_ResourceName() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceCandidate() {
		return resourceCandidateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceCandidate_Resource() {
		return (EReference)resourceCandidateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceCandidate_Match() {
		return (EAttribute)resourceCandidateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUsePropagatorFactory getToUsePropagatorFactory() {
		return (ToUsePropagatorFactory)getEFactoryInstance();
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
		projectEClass = createEClass(PROJECT);
		createEReference(projectEClass, PROJECT__TASKS);
		createEReference(projectEClass, PROJECT__DEPENDENCES);
		createEAttribute(projectEClass, PROJECT__NOF_RES);
		createEAttribute(projectEClass, PROJECT__START);
		createEAttribute(projectEClass, PROJECT__END);
		createEAttribute(projectEClass, PROJECT__PROJECT_NAME);
		createEReference(projectEClass, PROJECT__RESOURCES);
		createEOperation(projectEClass, PROJECT___REFRESH_END);
		createEOperation(projectEClass, PROJECT___REFRESH);

		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__START);
		createEAttribute(taskEClass, TASK__END);
		createEAttribute(taskEClass, TASK__HOURS);
		createEAttribute(taskEClass, TASK__HOURS_ITEMS);
		createEAttribute(taskEClass, TASK__HOURS_VAR);
		createEAttribute(taskEClass, TASK__HOURS_VAR_PER_RES);
		createEReference(taskEClass, TASK__DEPENDENCES_AFTER);
		createEReference(taskEClass, TASK__DEPENDENCES_BEFORE);
		createEAttribute(taskEClass, TASK__TASK_NAME);
		createEReference(taskEClass, TASK__ITEMS);
		createEReference(taskEClass, TASK__PROJECT);
		createEReference(taskEClass, TASK__RESOURCECANDIDATE);
		createEOperation(taskEClass, TASK___REFRESH_START);
		createEOperation(taskEClass, TASK___REFRESH_END);
		createEOperation(taskEClass, TASK___REFRESH_HOURS);
		createEOperation(taskEClass, TASK___REFRESH_HOURS_ITEM);
		createEOperation(taskEClass, TASK___REFRESH_HOURS_VAR);
		createEOperation(taskEClass, TASK___REFRESH_RESOURCE_CANDIDATES__RESOURCE);
		createEOperation(taskEClass, TASK___REFRESH_RESOURCE_CANDIDATES);

		dependenceEClass = createEClass(DEPENDENCE);
		createEReference(dependenceEClass, DEPENDENCE__TASK_BEFORE);
		createEReference(dependenceEClass, DEPENDENCE__TASK_AFTER);
		createEAttribute(dependenceEClass, DEPENDENCE__HOURS);
		createEReference(dependenceEClass, DEPENDENCE__PROJECT);
		createEAttribute(dependenceEClass, DEPENDENCE__NOTES);

		taskItemEClass = createEClass(TASK_ITEM);
		createEAttribute(taskItemEClass, TASK_ITEM__NAME);
		createEAttribute(taskItemEClass, TASK_ITEM__HOURS);

		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__START);
		createEAttribute(resourceEClass, RESOURCE__END);
		createEReference(resourceEClass, RESOURCE__PROJECT);
		createEAttribute(resourceEClass, RESOURCE__RESOURCE_NAME);

		resourceCandidateEClass = createEClass(RESOURCE_CANDIDATE);
		createEReference(resourceCandidateEClass, RESOURCE_CANDIDATE__RESOURCE);
		createEAttribute(resourceCandidateEClass, RESOURCE_CANDIDATE__MATCH);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		projectEClass.getESuperTypes().add(thePropagatorPackage.getObjectWithPropagatorFunctionAdapter());
		projectEClass.getESuperTypes().add(thePropagatorPackage.getObjectWithPropagatorFunctionAdapterScope());
		taskEClass.getESuperTypes().add(thePropagatorPackage.getObjectWithPropagatorFunctionAdapter());

		// Initialize classes, features, and operations; add parameters
		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProject_Tasks(), this.getTask(), this.getTask_Project(), "Tasks", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Dependences(), this.getDependence(), this.getDependence_Project(), "Dependences", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_NofRes(), ecorePackage.getEInt(), "NofRes", "1", 0, 1, Project.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Start(), ecorePackage.getEDate(), "Start", "2001-01-01", 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_End(), ecorePackage.getEDate(), "End", "2001-01-01", 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_ProjectName(), ecorePackage.getEString(), "ProjectName", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Resources(), this.getResource(), this.getResource_Project(), "Resources", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getProject__RefreshEnd(), null, "refreshEnd", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProject__Refresh(), null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_Start(), ecorePackage.getEDate(), "Start", "2001-01-01", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_End(), ecorePackage.getEDate(), "End", "2001-01-01", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Hours(), ecorePackage.getEFloat(), "Hours", "1.0", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_HoursItems(), ecorePackage.getEFloat(), "HoursItems", "1.0", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_HoursVar(), ecorePackage.getEFloat(), "HoursVar", "0.0", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_HoursVarPerRes(), ecorePackage.getEFloat(), "HoursVarPerRes", "0.0", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_DependencesAfter(), this.getDependence(), this.getDependence_TaskBefore(), "DependencesAfter", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_DependencesBefore(), this.getDependence(), this.getDependence_TaskAfter(), "DependencesBefore", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_TaskName(), ecorePackage.getEString(), "TaskName", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Items(), this.getTaskItem(), null, "Items", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Project(), this.getProject(), this.getProject_Tasks(), "Project", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Resourcecandidate(), this.getResourceCandidate(), null, "resourcecandidate", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTask__RefreshStart(), null, "refreshStart", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTask__RefreshEnd(), null, "refreshEnd", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTask__RefreshHours(), null, "refreshHours", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTask__RefreshHoursItem(), null, "refreshHoursItem", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTask__RefreshHoursVar(), null, "refreshHoursVar", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getTask__RefreshResourceCandidates__Resource(), null, "refreshResourceCandidates", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getResource(), "resource", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTask__RefreshResourceCandidates(), null, "refreshResourceCandidates", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dependenceEClass, Dependence.class, "Dependence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependence_TaskBefore(), this.getTask(), this.getTask_DependencesAfter(), "TaskBefore", null, 1, 1, Dependence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependence_TaskAfter(), this.getTask(), this.getTask_DependencesBefore(), "TaskAfter", null, 1, 1, Dependence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDependence_Hours(), ecorePackage.getEFloat(), "Hours", "1.0", 0, 1, Dependence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependence_Project(), this.getProject(), this.getProject_Dependences(), "Project", null, 1, 1, Dependence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDependence_Notes(), ecorePackage.getEString(), "Notes", null, 0, 1, Dependence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskItemEClass, TaskItem.class, "TaskItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskItem_Name(), ecorePackage.getEString(), "Name", null, 0, 1, TaskItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskItem_Hours(), ecorePackage.getEFloat(), "Hours", null, 0, 1, TaskItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_Start(), ecorePackage.getEDate(), "Start", "2001-01-01", 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_End(), ecorePackage.getEDate(), "End", "2001-01-01", 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_Project(), this.getProject(), this.getProject_Resources(), "project", null, 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_ResourceName(), ecorePackage.getEString(), "ResourceName", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceCandidateEClass, ResourceCandidate.class, "ResourceCandidate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceCandidate_Resource(), this.getResource(), null, "resource", null, 0, 1, ResourceCandidate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceCandidate_Match(), ecorePackage.getEFloat(), "Match", null, 0, 1, ResourceCandidate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ToUsePropagatorPackageImpl
