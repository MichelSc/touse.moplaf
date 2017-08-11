/**
 */
package com.misc.touse.moplaf.tousescheduler;

import com.misc.common.moplaf.scheduler.SchedulerPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerFactory
 * @model kind="package"
 * @generated
 */
public interface ToUseSchedulerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tousescheduler";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/touse/moplaf/scheduler/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tus";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToUseSchedulerPackage eINSTANCE = com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.DomainImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Schedulers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__SCHEDULERS = 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__RESOURCES = 1;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__TASKS = 2;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerImpl <em>To Use Scheduler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getToUseScheduler()
	 * @generated
	 */
	int TO_USE_SCHEDULER = 1;

	/**
	 * The feature id for the '<em><b>Solutions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER__SOLUTIONS = SchedulerPackage.SCHEDULER__SOLUTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER__NAME = SchedulerPackage.SCHEDULER__NAME;

	/**
	 * The feature id for the '<em><b>Current Solutionntr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER__CURRENT_SOLUTIONNTR = SchedulerPackage.SCHEDULER__CURRENT_SOLUTIONNTR;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER__TASKS = SchedulerPackage.SCHEDULER__TASKS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER__RESOURCES = SchedulerPackage.SCHEDULER__RESOURCES;

	/**
	 * The number of structural features of the '<em>To Use Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER_FEATURE_COUNT = SchedulerPackage.SCHEDULER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Construct Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER___CONSTRUCT_TASK__EOBJECT = SchedulerPackage.SCHEDULER___CONSTRUCT_TASK__EOBJECT;

	/**
	 * The operation id for the '<em>Construct Resource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER___CONSTRUCT_RESOURCE__EOBJECT = SchedulerPackage.SCHEDULER___CONSTRUCT_RESOURCE__EOBJECT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER___ENABLE = SchedulerPackage.SCHEDULER___ENABLE;

	/**
	 * The number of operations of the '<em>To Use Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER_OPERATION_COUNT = SchedulerPackage.SCHEDULER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseTaskImpl <em>To Use Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseTaskImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getToUseTask()
	 * @generated
	 */
	int TO_USE_TASK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_TASK__NAME = 0;

	/**
	 * The number of structural features of the '<em>To Use Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_TASK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>To Use Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseResourceImpl <em>To Use Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseResourceImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getToUseResource()
	 * @generated
	 */
	int TO_USE_RESOURCE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_RESOURCE__NAME = 0;

	/**
	 * The number of structural features of the '<em>To Use Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_RESOURCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>To Use Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseSolutionTaskImpl <em>To Use Solution Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSolutionTaskImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getToUseSolutionTask()
	 * @generated
	 */
	int TO_USE_SOLUTION_TASK = 4;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_TASK__PROPAGATOR_FUNCTIONS = SchedulerPackage.SOLUTION_TASK__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_TASK__TASK = SchedulerPackage.SOLUTION_TASK__TASK;

	/**
	 * The feature id for the '<em><b>Next Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_TASK__NEXT_TASK = SchedulerPackage.SOLUTION_TASK__NEXT_TASK;

	/**
	 * The feature id for the '<em><b>Previous Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_TASK__PREVIOUS_TASK = SchedulerPackage.SOLUTION_TASK__PREVIOUS_TASK;

	/**
	 * The feature id for the '<em><b>Scheduled Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_TASK__SCHEDULED_RESOURCE = SchedulerPackage.SOLUTION_TASK__SCHEDULED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Candidate Next Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_TASK__CANDIDATE_NEXT_TASK = SchedulerPackage.SOLUTION_TASK__CANDIDATE_NEXT_TASK;

	/**
	 * The feature id for the '<em><b>Candidate Previous Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_TASK__CANDIDATE_PREVIOUS_TASK = SchedulerPackage.SOLUTION_TASK__CANDIDATE_PREVIOUS_TASK;

	/**
	 * The feature id for the '<em><b>Resource As Candidate First Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_TASK__RESOURCE_AS_CANDIDATE_FIRST_TASK = SchedulerPackage.SOLUTION_TASK__RESOURCE_AS_CANDIDATE_FIRST_TASK;

	/**
	 * The feature id for the '<em><b>Resource As Candidate Last Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_TASK__RESOURCE_AS_CANDIDATE_LAST_TASK = SchedulerPackage.SOLUTION_TASK__RESOURCE_AS_CANDIDATE_LAST_TASK;

	/**
	 * The feature id for the '<em><b>Candidate Scheduled Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_TASK__CANDIDATE_SCHEDULED_RESOURCE = SchedulerPackage.SOLUTION_TASK__CANDIDATE_SCHEDULED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_TASK__EXPRESSIONS = SchedulerPackage.SOLUTION_TASK__EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_TASK__DESCRIPTION = SchedulerPackage.SOLUTION_TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_TASK__SOLUTION = SchedulerPackage.SOLUTION_TASK__SOLUTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_TASK__NAME = SchedulerPackage.SOLUTION_TASK__NAME;

	/**
	 * The feature id for the '<em><b>To Use Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_TASK__TO_USE_TASK = SchedulerPackage.SOLUTION_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_TASK__DISTANCE = SchedulerPackage.SOLUTION_TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_TASK__TIME = SchedulerPackage.SOLUTION_TASK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>To Use Solution Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_TASK_FEATURE_COUNT = SchedulerPackage.SOLUTION_TASK_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_TASK___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = SchedulerPackage.SOLUTION_TASK___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_TASK___GET_PROPAGATOR_FUNCTION__ECLASS = SchedulerPackage.SOLUTION_TASK___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Unset Candidate Previous Next</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_TASK___UNSET_CANDIDATE_PREVIOUS_NEXT = SchedulerPackage.SOLUTION_TASK___UNSET_CANDIDATE_PREVIOUS_NEXT;

	/**
	 * The operation id for the '<em>Set Candidate Previous Next</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_TASK___SET_CANDIDATE_PREVIOUS_NEXT__SOLUTIONRESOURCE_SOLUTIONTASK_SOLUTIONTASK = SchedulerPackage.SOLUTION_TASK___SET_CANDIDATE_PREVIOUS_NEXT__SOLUTIONRESOURCE_SOLUTIONTASK_SOLUTIONTASK;

	/**
	 * The operation id for the '<em>Construct Expressions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_TASK___CONSTRUCT_EXPRESSIONS = SchedulerPackage.SOLUTION_TASK___CONSTRUCT_EXPRESSIONS;

	/**
	 * The number of operations of the '<em>To Use Solution Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_TASK_OPERATION_COUNT = SchedulerPackage.SOLUTION_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseSolutionResourceImpl <em>To Use Solution Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSolutionResourceImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getToUseSolutionResource()
	 * @generated
	 */
	int TO_USE_SOLUTION_RESOURCE = 5;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_RESOURCE__PROPAGATOR_FUNCTIONS = SchedulerPackage.SOLUTION_RESOURCE__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_RESOURCE__RESOURCE = SchedulerPackage.SOLUTION_RESOURCE__RESOURCE;

	/**
	 * The feature id for the '<em><b>Scheduled Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_RESOURCE__SCHEDULED_TASKS = SchedulerPackage.SOLUTION_RESOURCE__SCHEDULED_TASKS;

	/**
	 * The feature id for the '<em><b>Candidate Scheduled Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_RESOURCE__CANDIDATE_SCHEDULED_TASKS = SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_SCHEDULED_TASKS;

	/**
	 * The feature id for the '<em><b>Candidate First Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_RESOURCE__CANDIDATE_FIRST_TASK = SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_FIRST_TASK;

	/**
	 * The feature id for the '<em><b>Candidate Last Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_RESOURCE__CANDIDATE_LAST_TASK = SchedulerPackage.SOLUTION_RESOURCE__CANDIDATE_LAST_TASK;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_RESOURCE__EXPRESSIONS = SchedulerPackage.SOLUTION_RESOURCE__EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_RESOURCE__DESCRIPTION = SchedulerPackage.SOLUTION_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_RESOURCE__SOLUTION = SchedulerPackage.SOLUTION_RESOURCE__SOLUTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_RESOURCE__NAME = SchedulerPackage.SOLUTION_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>To Use Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_RESOURCE__TO_USE_RESOURCE = SchedulerPackage.SOLUTION_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Total Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_RESOURCE__TOTAL_DISTANCE = SchedulerPackage.SOLUTION_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_RESOURCE__END_TIME = SchedulerPackage.SOLUTION_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>To Use Solution Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_RESOURCE_FEATURE_COUNT = SchedulerPackage.SOLUTION_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_RESOURCE___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = SchedulerPackage.SOLUTION_RESOURCE___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_RESOURCE___GET_PROPAGATOR_FUNCTION__ECLASS = SchedulerPackage.SOLUTION_RESOURCE___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Construct Expressions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_RESOURCE___CONSTRUCT_EXPRESSIONS = SchedulerPackage.SOLUTION_RESOURCE___CONSTRUCT_EXPRESSIONS;

	/**
	 * The number of operations of the '<em>To Use Solution Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLUTION_RESOURCE_OPERATION_COUNT = SchedulerPackage.SOLUTION_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousescheduler.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.tousescheduler.Domain#getSchedulers <em>Schedulers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schedulers</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.Domain#getSchedulers()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Schedulers();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.tousescheduler.Domain#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.Domain#getResources()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Resources();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.tousescheduler.Domain#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.Domain#getTasks()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Tasks();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduler <em>To Use Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Use Scheduler</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseScheduler
	 * @generated
	 */
	EClass getToUseScheduler();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousescheduler.ToUseTask <em>To Use Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Use Task</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseTask
	 * @generated
	 */
	EClass getToUseTask();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousescheduler.ToUseTask#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseTask#getName()
	 * @see #getToUseTask()
	 * @generated
	 */
	EAttribute getToUseTask_Name();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousescheduler.ToUseResource <em>To Use Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Use Resource</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseResource
	 * @generated
	 */
	EClass getToUseResource();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousescheduler.ToUseResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseResource#getName()
	 * @see #getToUseResource()
	 * @generated
	 */
	EAttribute getToUseResource_Name();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousescheduler.ToUseSolutionTask <em>To Use Solution Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Use Solution Task</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSolutionTask
	 * @generated
	 */
	EClass getToUseSolutionTask();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousescheduler.ToUseSolutionTask#getToUseTask <em>To Use Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Use Task</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSolutionTask#getToUseTask()
	 * @see #getToUseSolutionTask()
	 * @generated
	 */
	EReference getToUseSolutionTask_ToUseTask();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.touse.moplaf.tousescheduler.ToUseSolutionTask#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distance</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSolutionTask#getDistance()
	 * @see #getToUseSolutionTask()
	 * @generated
	 */
	EReference getToUseSolutionTask_Distance();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.touse.moplaf.tousescheduler.ToUseSolutionTask#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSolutionTask#getTime()
	 * @see #getToUseSolutionTask()
	 * @generated
	 */
	EReference getToUseSolutionTask_Time();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousescheduler.ToUseSolutionResource <em>To Use Solution Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Use Solution Resource</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSolutionResource
	 * @generated
	 */
	EClass getToUseSolutionResource();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousescheduler.ToUseSolutionResource#getToUseResource <em>To Use Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Use Resource</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSolutionResource#getToUseResource()
	 * @see #getToUseSolutionResource()
	 * @generated
	 */
	EReference getToUseSolutionResource_ToUseResource();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.touse.moplaf.tousescheduler.ToUseSolutionResource#getTotalDistance <em>Total Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Total Distance</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSolutionResource#getTotalDistance()
	 * @see #getToUseSolutionResource()
	 * @generated
	 */
	EReference getToUseSolutionResource_TotalDistance();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.touse.moplaf.tousescheduler.ToUseSolutionResource#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End Time</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSolutionResource#getEndTime()
	 * @see #getToUseSolutionResource()
	 * @generated
	 */
	EReference getToUseSolutionResource_EndTime();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ToUseSchedulerFactory getToUseSchedulerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousescheduler.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousescheduler.impl.DomainImpl
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Schedulers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__SCHEDULERS = eINSTANCE.getDomain_Schedulers();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__RESOURCES = eINSTANCE.getDomain_Resources();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__TASKS = eINSTANCE.getDomain_Tasks();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerImpl <em>To Use Scheduler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerImpl
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getToUseScheduler()
		 * @generated
		 */
		EClass TO_USE_SCHEDULER = eINSTANCE.getToUseScheduler();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseTaskImpl <em>To Use Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseTaskImpl
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getToUseTask()
		 * @generated
		 */
		EClass TO_USE_TASK = eINSTANCE.getToUseTask();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_USE_TASK__NAME = eINSTANCE.getToUseTask_Name();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseResourceImpl <em>To Use Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseResourceImpl
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getToUseResource()
		 * @generated
		 */
		EClass TO_USE_RESOURCE = eINSTANCE.getToUseResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_USE_RESOURCE__NAME = eINSTANCE.getToUseResource_Name();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseSolutionTaskImpl <em>To Use Solution Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSolutionTaskImpl
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getToUseSolutionTask()
		 * @generated
		 */
		EClass TO_USE_SOLUTION_TASK = eINSTANCE.getToUseSolutionTask();

		/**
		 * The meta object literal for the '<em><b>To Use Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_SOLUTION_TASK__TO_USE_TASK = eINSTANCE.getToUseSolutionTask_ToUseTask();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_SOLUTION_TASK__DISTANCE = eINSTANCE.getToUseSolutionTask_Distance();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_SOLUTION_TASK__TIME = eINSTANCE.getToUseSolutionTask_Time();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseSolutionResourceImpl <em>To Use Solution Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSolutionResourceImpl
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getToUseSolutionResource()
		 * @generated
		 */
		EClass TO_USE_SOLUTION_RESOURCE = eINSTANCE.getToUseSolutionResource();

		/**
		 * The meta object literal for the '<em><b>To Use Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_SOLUTION_RESOURCE__TO_USE_RESOURCE = eINSTANCE.getToUseSolutionResource_ToUseResource();

		/**
		 * The meta object literal for the '<em><b>Total Distance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_SOLUTION_RESOURCE__TOTAL_DISTANCE = eINSTANCE.getToUseSolutionResource_TotalDistance();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_SOLUTION_RESOURCE__END_TIME = eINSTANCE.getToUseSolutionResource_EndTime();

	}

} //ToUseSchedulerPackage
