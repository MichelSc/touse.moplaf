/**
 */
package com.misc.touse.moplaf.tousescheduler;

import com.misc.common.moplaf.localsearch.LocalSearchPackage;
import com.misc.common.moplaf.propagator2.PropagatorPackage;
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
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseScoreImpl <em>To Use Score</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseScoreImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getToUseScore()
	 * @generated
	 */
	int TO_USE_SCORE = 1;

	/**
	 * The feature id for the '<em><b>Total Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCORE__TOTAL_DISTANCE = LocalSearchPackage.SCORE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>To Use Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCORE_FEATURE_COUNT = LocalSearchPackage.SCORE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCORE___COMPARE__SCORE = LocalSearchPackage.SCORE___COMPARE__SCORE;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCORE___COPY__SCORE = LocalSearchPackage.SCORE___COPY__SCORE;

	/**
	 * The number of operations of the '<em>To Use Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCORE_OPERATION_COUNT = LocalSearchPackage.SCORE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerImpl <em>To Use Scheduler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getToUseScheduler()
	 * @generated
	 */
	int TO_USE_SCHEDULER = 2;

	/**
	 * The feature id for the '<em><b>Schedulers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER__SCHEDULERS = SchedulerPackage.SCHEDULER__SCHEDULERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER__NAME = SchedulerPackage.SCHEDULER__NAME;

	/**
	 * The feature id for the '<em><b>Current Solution Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER__CURRENT_SOLUTION_NR = SchedulerPackage.SCHEDULER__CURRENT_SOLUTION_NR;

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
	 * The feature id for the '<em><b>Scheduler Resources</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER__SCHEDULER_RESOURCES = SchedulerPackage.SCHEDULER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scheduler Tasks</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER__SCHEDULER_TASKS = SchedulerPackage.SCHEDULER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>To Use Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER_FEATURE_COUNT = SchedulerPackage.SCHEDULER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Construct Schedule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER___CONSTRUCT_SCHEDULE = SchedulerPackage.SCHEDULER___CONSTRUCT_SCHEDULE;

	/**
	 * The operation id for the '<em>Construct Score</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER___CONSTRUCT_SCORE = SchedulerPackage.SCHEDULER___CONSTRUCT_SCORE;

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
	int TO_USE_TASK = 3;

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
	int TO_USE_RESOURCE = 4;

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
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseScheduleTaskImpl <em>To Use Schedule Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseScheduleTaskImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getToUseScheduleTask()
	 * @generated
	 */
	int TO_USE_SCHEDULE_TASK = 5;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_TASK__PROPAGATOR_FUNCTIONS = SchedulerPackage.TASK__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_TASK__TASK = SchedulerPackage.TASK__TASK;

	/**
	 * The feature id for the '<em><b>Next Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_TASK__NEXT_TASK = SchedulerPackage.TASK__NEXT_TASK;

	/**
	 * The feature id for the '<em><b>Previous Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_TASK__PREVIOUS_TASK = SchedulerPackage.TASK__PREVIOUS_TASK;

	/**
	 * The feature id for the '<em><b>Scheduled Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_TASK__SCHEDULED_RESOURCE = SchedulerPackage.TASK__SCHEDULED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_TASK__DESCRIPTION = SchedulerPackage.TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Schedule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_TASK__SCHEDULE = SchedulerPackage.TASK__SCHEDULE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_TASK__NAME = SchedulerPackage.TASK__NAME;

	/**
	 * The feature id for the '<em><b>To Use Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_TASK__TO_USE_TASK = SchedulerPackage.TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_TASK__DISTANCE = SchedulerPackage.TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>To Use Schedule Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_TASK_FEATURE_COUNT = SchedulerPackage.TASK_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_TASK___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = SchedulerPackage.TASK___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_TASK___GET_PROPAGATOR_FUNCTION__ECLASS = SchedulerPackage.TASK___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Add Propagator Functions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_TASK___ADD_PROPAGATOR_FUNCTIONS__STRING = SchedulerPackage.TASK___ADD_PROPAGATOR_FUNCTIONS__STRING;

	/**
	 * The operation id for the '<em>Unset Previous Next</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_TASK___UNSET_PREVIOUS_NEXT = SchedulerPackage.TASK___UNSET_PREVIOUS_NEXT;

	/**
	 * The operation id for the '<em>Set Previous Next</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_TASK___SET_PREVIOUS_NEXT__RESOURCE_TASK_TASK = SchedulerPackage.TASK___SET_PREVIOUS_NEXT__RESOURCE_TASK_TASK;

	/**
	 * The operation id for the '<em>Schedule Resource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_TASK___SCHEDULE_RESOURCE__RESOURCE = SchedulerPackage.TASK___SCHEDULE_RESOURCE__RESOURCE;

	/**
	 * The number of operations of the '<em>To Use Schedule Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_TASK_OPERATION_COUNT = SchedulerPackage.TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseScheduleResourceImpl <em>To Use Schedule Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseScheduleResourceImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getToUseScheduleResource()
	 * @generated
	 */
	int TO_USE_SCHEDULE_RESOURCE = 6;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_RESOURCE__PROPAGATOR_FUNCTIONS = SchedulerPackage.RESOURCE__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Schedule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_RESOURCE__SCHEDULE = SchedulerPackage.RESOURCE__SCHEDULE;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_RESOURCE__RESOURCE = SchedulerPackage.RESOURCE__RESOURCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_RESOURCE__NAME = SchedulerPackage.RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_RESOURCE__DESCRIPTION = SchedulerPackage.RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Nr Candidate Scheduled Tasks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_RESOURCE__NR_CANDIDATE_SCHEDULED_TASKS = SchedulerPackage.RESOURCE__NR_CANDIDATE_SCHEDULED_TASKS;

	/**
	 * The feature id for the '<em><b>Scheduled Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_RESOURCE__SCHEDULED_TASKS = SchedulerPackage.RESOURCE__SCHEDULED_TASKS;

	/**
	 * The feature id for the '<em><b>First Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_RESOURCE__FIRST_TASK = SchedulerPackage.RESOURCE__FIRST_TASK;

	/**
	 * The feature id for the '<em><b>Last Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_RESOURCE__LAST_TASK = SchedulerPackage.RESOURCE__LAST_TASK;

	/**
	 * The feature id for the '<em><b>Nr Scheduled Tasks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_RESOURCE__NR_SCHEDULED_TASKS = SchedulerPackage.RESOURCE__NR_SCHEDULED_TASKS;

	/**
	 * The feature id for the '<em><b>To Use Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_RESOURCE__TO_USE_RESOURCE = SchedulerPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Total Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_RESOURCE__TOTAL_DISTANCE = SchedulerPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>To Use Schedule Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_RESOURCE_FEATURE_COUNT = SchedulerPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_RESOURCE___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = SchedulerPackage.RESOURCE___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_RESOURCE___GET_PROPAGATOR_FUNCTION__ECLASS = SchedulerPackage.RESOURCE___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Add Propagator Functions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_RESOURCE___ADD_PROPAGATOR_FUNCTIONS__STRING = SchedulerPackage.RESOURCE___ADD_PROPAGATOR_FUNCTIONS__STRING;

	/**
	 * The number of operations of the '<em>To Use Schedule Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_RESOURCE_OPERATION_COUNT = SchedulerPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ScopeScheduleScoreImpl <em>Scope Schedule Score</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ScopeScheduleScoreImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getScopeScheduleScore()
	 * @generated
	 */
	int SCOPE_SCHEDULE_SCORE = 7;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE__PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE__ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE__ANTECEDENTS_SIBLING = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE__TOUCHED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE__TOUCHED_CHILDREN = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE__TOUCHERS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE__ENABLED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE__TYPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE__OBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE__INSTANCE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE__DESCRIPTION = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE__TOUCHED_PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED_PARENT;

	/**
	 * The number of structural features of the '<em>Scope Schedule Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE_FEATURE_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE___INIT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE___ENABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE___DISABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE___RESET = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE___TOUCH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE___UNTOUCH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE___REFRESH_ANTECEDENTS__REFRESHER = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE___REFRESH_THIS__REFRESHER = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE___REFRESH_CHILDREN_AND_THIS__REFRESHER = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE___REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE___REFRESH__REFRESHER = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE___DO_GET_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE___DO_GET_PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE___DO_REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE___DO_REFRESH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE___GET_SCOPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE___GET_FACTORY_ID = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE___DO_GET_BINDINGS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Scope Schedule Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE_OPERATION_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.LayerScheduleDistanceImpl <em>Layer Schedule Distance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.LayerScheduleDistanceImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getLayerScheduleDistance()
	 * @generated
	 */
	int LAYER_SCHEDULE_DISTANCE = 8;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE__PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE__ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE__ANTECEDENTS_SIBLING = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE__TOUCHED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE__TOUCHED_CHILDREN = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE__TOUCHERS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE__ENABLED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE__TYPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE__OBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE__INSTANCE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE__DESCRIPTION = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE__TOUCHED_PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE__CONCRETE_PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Layer Schedule Distance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE_FEATURE_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE___INIT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE___ENABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE___DISABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE___RESET = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE___TOUCH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE___UNTOUCH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE___REFRESH_ANTECEDENTS__REFRESHER = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE___REFRESH_THIS__REFRESHER = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE___REFRESH_CHILDREN_AND_THIS__REFRESHER = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE___REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE___REFRESH__REFRESHER = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE___DO_GET_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE___DO_GET_PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE___DO_REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE___DO_REFRESH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE___GET_SCOPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE___GET_FACTORY_ID = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE___DO_GET_BINDINGS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Layer Schedule Distance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE_OPERATION_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.CalcTaskDistanceImpl <em>Calc Task Distance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.CalcTaskDistanceImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getCalcTaskDistance()
	 * @generated
	 */
	int CALC_TASK_DISTANCE = 9;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE__PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE__ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE__ANTECEDENTS_SIBLING = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE__TOUCHED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE__TOUCHED_CHILDREN = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE__TOUCHERS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE__ENABLED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE__TYPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE__OBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE__INSTANCE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE__DESCRIPTION = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE__TOUCHED_PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE__TASK = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE__CONCRETE_PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Calc Task Distance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE_FEATURE_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE___INIT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE___ENABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE___DISABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE___RESET = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE___TOUCH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE___UNTOUCH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE___REFRESH_ANTECEDENTS__REFRESHER = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE___REFRESH_THIS__REFRESHER = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE___REFRESH_CHILDREN_AND_THIS__REFRESHER = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE___REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE___REFRESH__REFRESHER = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE___DO_GET_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE___DO_GET_PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE___DO_REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE___DO_REFRESH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE___GET_SCOPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE___GET_FACTORY_ID = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE___DO_GET_BINDINGS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Task Distance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE_OPERATION_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.CalcResourceDistanceImpl <em>Calc Resource Distance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.CalcResourceDistanceImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getCalcResourceDistance()
	 * @generated
	 */
	int CALC_RESOURCE_DISTANCE = 10;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE__PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE__ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE__ANTECEDENTS_SIBLING = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE__TOUCHED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE__TOUCHED_CHILDREN = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE__TOUCHERS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE__ENABLED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE__TYPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE__OBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE__INSTANCE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE__DESCRIPTION = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE__TOUCHED_PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE__RESOURCE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE__CONCRETE_PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Calc Resource Distance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE_FEATURE_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE___INIT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE___ENABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE___DISABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE___RESET = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE___TOUCH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE___UNTOUCH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE___REFRESH_ANTECEDENTS__REFRESHER = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE___REFRESH_THIS__REFRESHER = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE___REFRESH_CHILDREN_AND_THIS__REFRESHER = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE___REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE___REFRESH__REFRESHER = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE___DO_GET_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE___DO_GET_PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE___DO_REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE___DO_REFRESH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE___GET_SCOPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE___GET_FACTORY_ID = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE___DO_GET_BINDINGS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Resource Distance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE_OPERATION_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseScheduleImpl <em>To Use Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseScheduleImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getToUseSchedule()
	 * @generated
	 */
	int TO_USE_SCHEDULE = 11;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE__PROPAGATOR_FUNCTIONS = SchedulerPackage.SCHEDULE__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Score</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE__SCORE = SchedulerPackage.SCHEDULE__SCORE;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE__TASKS = SchedulerPackage.SCHEDULE__TASKS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE__RESOURCES = SchedulerPackage.SCHEDULE__RESOURCES;

	/**
	 * The feature id for the '<em><b>Solution Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE__SOLUTION_NR = SchedulerPackage.SCHEDULE__SOLUTION_NR;

	/**
	 * The feature id for the '<em><b>Scheduler</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE__SCHEDULER = SchedulerPackage.SCHEDULE__SCHEDULER;

	/**
	 * The feature id for the '<em><b>Nr Candidate Scheduled Tasks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE__NR_CANDIDATE_SCHEDULED_TASKS = SchedulerPackage.SCHEDULE__NR_CANDIDATE_SCHEDULED_TASKS;

	/**
	 * The feature id for the '<em><b>Nr Scheduled Tasks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE__NR_SCHEDULED_TASKS = SchedulerPackage.SCHEDULE__NR_SCHEDULED_TASKS;

	/**
	 * The feature id for the '<em><b>Total Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE__TOTAL_DISTANCE = SchedulerPackage.SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>To Use Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_FEATURE_COUNT = SchedulerPackage.SCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = SchedulerPackage.SCHEDULE___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE___GET_PROPAGATOR_FUNCTION__ECLASS = SchedulerPackage.SCHEDULE___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Add Propagator Functions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE___ADD_PROPAGATOR_FUNCTIONS__STRING = SchedulerPackage.SCHEDULE___ADD_PROPAGATOR_FUNCTIONS__STRING;

	/**
	 * The operation id for the '<em>Replicate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE___REPLICATE = SchedulerPackage.SCHEDULE___REPLICATE;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE___REFRESH = SchedulerPackage.SCHEDULE___REFRESH;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE___INITIALIZE = SchedulerPackage.SCHEDULE___INITIALIZE;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE___COMPARE__SCORE = SchedulerPackage.SCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE___COPY__SCORE = SchedulerPackage.SCHEDULE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>To Use Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_OPERATION_COUNT = SchedulerPackage.SCHEDULE_OPERATION_COUNT + 2;

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
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousescheduler.ToUseScore <em>To Use Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Use Score</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseScore
	 * @generated
	 */
	EClass getToUseScore();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousescheduler.ToUseScore#getTotalDistance <em>Total Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Distance</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseScore#getTotalDistance()
	 * @see #getToUseScore()
	 * @generated
	 */
	EAttribute getToUseScore_TotalDistance();

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
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduler#getSchedulerResources <em>Scheduler Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scheduler Resources</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseScheduler#getSchedulerResources()
	 * @see #getToUseScheduler()
	 * @generated
	 */
	EReference getToUseScheduler_SchedulerResources();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduler#getSchedulerTasks <em>Scheduler Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scheduler Tasks</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseScheduler#getSchedulerTasks()
	 * @see #getToUseScheduler()
	 * @generated
	 */
	EReference getToUseScheduler_SchedulerTasks();

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
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask <em>To Use Schedule Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Use Schedule Task</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask
	 * @generated
	 */
	EClass getToUseScheduleTask();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask#getToUseTask <em>To Use Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Use Task</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask#getToUseTask()
	 * @see #getToUseScheduleTask()
	 * @generated
	 */
	EReference getToUseScheduleTask_ToUseTask();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask#getDistance()
	 * @see #getToUseScheduleTask()
	 * @generated
	 */
	EAttribute getToUseScheduleTask_Distance();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource <em>To Use Schedule Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Use Schedule Resource</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource
	 * @generated
	 */
	EClass getToUseScheduleResource();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource#getToUseResource <em>To Use Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Use Resource</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource#getToUseResource()
	 * @see #getToUseScheduleResource()
	 * @generated
	 */
	EReference getToUseScheduleResource_ToUseResource();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource#getTotalDistance <em>Total Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Distance</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource#getTotalDistance()
	 * @see #getToUseScheduleResource()
	 * @generated
	 */
	EAttribute getToUseScheduleResource_TotalDistance();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousescheduler.ScopeScheduleScore <em>Scope Schedule Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope Schedule Score</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ScopeScheduleScore
	 * @generated
	 */
	EClass getScopeScheduleScore();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousescheduler.LayerScheduleDistance <em>Layer Schedule Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer Schedule Distance</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.LayerScheduleDistance
	 * @generated
	 */
	EClass getLayerScheduleDistance();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousescheduler.LayerScheduleDistance#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.LayerScheduleDistance#getConcreteParent()
	 * @see #getLayerScheduleDistance()
	 * @generated
	 */
	EReference getLayerScheduleDistance_ConcreteParent();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousescheduler.CalcTaskDistance <em>Calc Task Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Task Distance</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.CalcTaskDistance
	 * @generated
	 */
	EClass getCalcTaskDistance();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousescheduler.CalcTaskDistance#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.CalcTaskDistance#getTask()
	 * @see #getCalcTaskDistance()
	 * @generated
	 */
	EReference getCalcTaskDistance_Task();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousescheduler.CalcTaskDistance#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.CalcTaskDistance#getConcreteParent()
	 * @see #getCalcTaskDistance()
	 * @generated
	 */
	EReference getCalcTaskDistance_ConcreteParent();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousescheduler.CalcResourceDistance <em>Calc Resource Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Resource Distance</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.CalcResourceDistance
	 * @generated
	 */
	EClass getCalcResourceDistance();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousescheduler.CalcResourceDistance#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.CalcResourceDistance#getResource()
	 * @see #getCalcResourceDistance()
	 * @generated
	 */
	EReference getCalcResourceDistance_Resource();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousescheduler.CalcResourceDistance#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.CalcResourceDistance#getConcreteParent()
	 * @see #getCalcResourceDistance()
	 * @generated
	 */
	EReference getCalcResourceDistance_ConcreteParent();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousescheduler.ToUseSchedule <em>To Use Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Use Schedule</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedule
	 * @generated
	 */
	EClass getToUseSchedule();

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
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseScoreImpl <em>To Use Score</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseScoreImpl
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getToUseScore()
		 * @generated
		 */
		EClass TO_USE_SCORE = eINSTANCE.getToUseScore();

		/**
		 * The meta object literal for the '<em><b>Total Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_USE_SCORE__TOTAL_DISTANCE = eINSTANCE.getToUseScore_TotalDistance();

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
		 * The meta object literal for the '<em><b>Scheduler Resources</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_SCHEDULER__SCHEDULER_RESOURCES = eINSTANCE.getToUseScheduler_SchedulerResources();

		/**
		 * The meta object literal for the '<em><b>Scheduler Tasks</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_SCHEDULER__SCHEDULER_TASKS = eINSTANCE.getToUseScheduler_SchedulerTasks();

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
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseScheduleTaskImpl <em>To Use Schedule Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseScheduleTaskImpl
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getToUseScheduleTask()
		 * @generated
		 */
		EClass TO_USE_SCHEDULE_TASK = eINSTANCE.getToUseScheduleTask();

		/**
		 * The meta object literal for the '<em><b>To Use Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_SCHEDULE_TASK__TO_USE_TASK = eINSTANCE.getToUseScheduleTask_ToUseTask();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_USE_SCHEDULE_TASK__DISTANCE = eINSTANCE.getToUseScheduleTask_Distance();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseScheduleResourceImpl <em>To Use Schedule Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseScheduleResourceImpl
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getToUseScheduleResource()
		 * @generated
		 */
		EClass TO_USE_SCHEDULE_RESOURCE = eINSTANCE.getToUseScheduleResource();

		/**
		 * The meta object literal for the '<em><b>To Use Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_SCHEDULE_RESOURCE__TO_USE_RESOURCE = eINSTANCE.getToUseScheduleResource_ToUseResource();

		/**
		 * The meta object literal for the '<em><b>Total Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_USE_SCHEDULE_RESOURCE__TOTAL_DISTANCE = eINSTANCE.getToUseScheduleResource_TotalDistance();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ScopeScheduleScoreImpl <em>Scope Schedule Score</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ScopeScheduleScoreImpl
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getScopeScheduleScore()
		 * @generated
		 */
		EClass SCOPE_SCHEDULE_SCORE = eINSTANCE.getScopeScheduleScore();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousescheduler.impl.LayerScheduleDistanceImpl <em>Layer Schedule Distance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousescheduler.impl.LayerScheduleDistanceImpl
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getLayerScheduleDistance()
		 * @generated
		 */
		EClass LAYER_SCHEDULE_DISTANCE = eINSTANCE.getLayerScheduleDistance();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_SCHEDULE_DISTANCE__CONCRETE_PARENT = eINSTANCE.getLayerScheduleDistance_ConcreteParent();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousescheduler.impl.CalcTaskDistanceImpl <em>Calc Task Distance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousescheduler.impl.CalcTaskDistanceImpl
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getCalcTaskDistance()
		 * @generated
		 */
		EClass CALC_TASK_DISTANCE = eINSTANCE.getCalcTaskDistance();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_TASK_DISTANCE__TASK = eINSTANCE.getCalcTaskDistance_Task();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_TASK_DISTANCE__CONCRETE_PARENT = eINSTANCE.getCalcTaskDistance_ConcreteParent();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousescheduler.impl.CalcResourceDistanceImpl <em>Calc Resource Distance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousescheduler.impl.CalcResourceDistanceImpl
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getCalcResourceDistance()
		 * @generated
		 */
		EClass CALC_RESOURCE_DISTANCE = eINSTANCE.getCalcResourceDistance();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_RESOURCE_DISTANCE__RESOURCE = eINSTANCE.getCalcResourceDistance_Resource();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_RESOURCE_DISTANCE__CONCRETE_PARENT = eINSTANCE.getCalcResourceDistance_ConcreteParent();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseScheduleImpl <em>To Use Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseScheduleImpl
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getToUseSchedule()
		 * @generated
		 */
		EClass TO_USE_SCHEDULE = eINSTANCE.getToUseSchedule();

	}

} //ToUseSchedulerPackage
