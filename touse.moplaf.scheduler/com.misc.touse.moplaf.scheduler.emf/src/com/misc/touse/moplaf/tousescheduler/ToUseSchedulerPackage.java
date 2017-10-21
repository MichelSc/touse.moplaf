/**
 */
package com.misc.touse.moplaf.tousescheduler;

import com.misc.common.moplaf.localsearch.LocalSearchPackage;
import com.misc.common.moplaf.propagator2.PropagatorPackage;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
	 * The feature id for the '<em><b>Vehicles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__VEHICLES = 1;

	/**
	 * The feature id for the '<em><b>Shipments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__SHIPMENTS = 2;

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
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.VehicleImpl <em>Vehicle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.VehicleImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getVehicle()
	 * @generated
	 */
	int VEHICLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Home Location X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__HOME_LOCATION_X = 1;

	/**
	 * The feature id for the '<em><b>Home Location Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__HOME_LOCATION_Y = 2;

	/**
	 * The number of structural features of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseScoreImpl <em>To Use Score</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseScoreImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getToUseScore()
	 * @generated
	 */
	int TO_USE_SCORE = 5;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerImpl <em>To Use Scheduler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getToUseScheduler()
	 * @generated
	 */
	int TO_USE_SCHEDULER = 3;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ShipmentImpl <em>Shipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ShipmentImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getShipment()
	 * @generated
	 */
	int SHIPMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Load Location X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__LOAD_LOCATION_X = 1;

	/**
	 * The feature id for the '<em><b>Load Location Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__LOAD_LOCATION_Y = 2;

	/**
	 * The feature id for the '<em><b>Unload Location X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__UNLOAD_LOCATION_X = 3;

	/**
	 * The feature id for the '<em><b>Unload Location Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__UNLOAD_LOCATION_Y = 4;

	/**
	 * The number of structural features of the '<em>Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Improvments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER__IMPROVMENTS = SchedulerPackage.SCHEDULER__IMPROVMENTS;

	/**
	 * The feature id for the '<em><b>Best Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER__BEST_SOLUTION = SchedulerPackage.SCHEDULER__BEST_SOLUTION;

	/**
	 * The feature id for the '<em><b>Solutions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER__SOLUTIONS = SchedulerPackage.SCHEDULER__SOLUTIONS;

	/**
	 * The feature id for the '<em><b>Current Solution Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER__CURRENT_SOLUTION_NR = SchedulerPackage.SCHEDULER__CURRENT_SOLUTION_NR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER__NAME = SchedulerPackage.SCHEDULER__NAME;

	/**
	 * The feature id for the '<em><b>Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER__SCHEDULES = SchedulerPackage.SCHEDULER__SCHEDULES;

	/**
	 * The feature id for the '<em><b>Selected Vehicles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER__SELECTED_VEHICLES = SchedulerPackage.SCHEDULER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selected Shipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER__SELECTED_SHIPMENTS = SchedulerPackage.SCHEDULER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER__ACTIONS = SchedulerPackage.SCHEDULER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>To Use Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER_FEATURE_COUNT = SchedulerPackage.SCHEDULER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Select Solutions To Improve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER___SELECT_SOLUTIONS_TO_IMPROVE = SchedulerPackage.SCHEDULER___SELECT_SOLUTIONS_TO_IMPROVE;

	/**
	 * The operation id for the '<em>Prune Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER___PRUNE_SOLUTION = SchedulerPackage.SCHEDULER___PRUNE_SOLUTION;

	/**
	 * The operation id for the '<em>Construct Score</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER___CONSTRUCT_SCORE = SchedulerPackage.SCHEDULER___CONSTRUCT_SCORE;

	/**
	 * The operation id for the '<em>Generate Tasks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER___GENERATE_TASKS__SCHEDULE = SchedulerPackage.SCHEDULER___GENERATE_TASKS__SCHEDULE;

	/**
	 * The operation id for the '<em>Generate Resources</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER___GENERATE_RESOURCES__SCHEDULE = SchedulerPackage.SCHEDULER___GENERATE_RESOURCES__SCHEDULE;

	/**
	 * The number of operations of the '<em>To Use Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER_OPERATION_COUNT = SchedulerPackage.SCHEDULER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseScheduleTaskImpl <em>To Use Schedule Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseScheduleTaskImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getToUseScheduleTask()
	 * @generated
	 */
	int TO_USE_SCHEDULE_TASK = 7;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.CalcSchedulerImpl <em>Calc Scheduler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.CalcSchedulerImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getCalcScheduler()
	 * @generated
	 */
	int CALC_SCHEDULER = 12;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.CalcScheduleImpl <em>Calc Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.CalcScheduleImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getCalcSchedule()
	 * @generated
	 */
	int CALC_SCHEDULE = 13;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.CalcResourceImpl <em>Calc Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.CalcResourceImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getCalcResource()
	 * @generated
	 */
	int CALC_RESOURCE = 14;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.CalcTaskImpl <em>Calc Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.CalcTaskImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getCalcTask()
	 * @generated
	 */
	int CALC_TASK = 15;

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
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ScopeScheduleScoreImpl <em>Scope Schedule Score</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ScopeScheduleScoreImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getScopeScheduleScore()
	 * @generated
	 */
	int SCOPE_SCHEDULE_SCORE = 16;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.LayerScheduleDistanceImpl <em>Layer Schedule Distance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.LayerScheduleDistanceImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getLayerScheduleDistance()
	 * @generated
	 */
	int LAYER_SCHEDULE_DISTANCE = 17;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.CalcTaskDistanceImpl <em>Calc Task Distance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.CalcTaskDistanceImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getCalcTaskDistance()
	 * @generated
	 */
	int CALC_TASK_DISTANCE = 18;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.CalcResourceDistanceImpl <em>Calc Resource Distance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.CalcResourceDistanceImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getCalcResourceDistance()
	 * @generated
	 */
	int CALC_RESOURCE_DISTANCE = 19;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseScheduleImpl <em>To Use Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseScheduleImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getToUseSchedule()
	 * @generated
	 */
	int TO_USE_SCHEDULE = 4;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE__PROPAGATOR_FUNCTIONS = SchedulerPackage.SCHEDULE__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Score</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE__SCORE = SchedulerPackage.SCHEDULE__SCORE;

	/**
	 * The feature id for the '<em><b>Solution Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE__SOLUTION_NR = SchedulerPackage.SCHEDULE__SOLUTION_NR;

	/**
	 * The feature id for the '<em><b>Ancestor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE__ANCESTOR = SchedulerPackage.SCHEDULE__ANCESTOR;

	/**
	 * The feature id for the '<em><b>Descendants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE__DESCENDANTS = SchedulerPackage.SCHEDULE__DESCENDANTS;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE__STRATEGY = SchedulerPackage.SCHEDULE__STRATEGY;

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
	 * The feature id for the '<em><b>Nr Scheduled Tasks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE__NR_SCHEDULED_TASKS = SchedulerPackage.SCHEDULE__NR_SCHEDULED_TASKS;

	/**
	 * The feature id for the '<em><b>Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE__SCHEDULER = SchedulerPackage.SCHEDULE__SCHEDULER;

	/**
	 * The number of structural features of the '<em>To Use Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_FEATURE_COUNT = SchedulerPackage.SCHEDULE_FEATURE_COUNT + 0;

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
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE___CLONE = SchedulerPackage.SCHEDULE___CLONE;

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
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE___ENABLE = SchedulerPackage.SCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>To Use Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_OPERATION_COUNT = SchedulerPackage.SCHEDULE_OPERATION_COUNT + 1;

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
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCORE___CLONE = LocalSearchPackage.SCORE___CLONE;

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
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_RESOURCE__DESCRIPTION = SchedulerPackage.RESOURCE__DESCRIPTION;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_RESOURCE__NAME = SchedulerPackage.RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_RESOURCE__VEHICLE = SchedulerPackage.RESOURCE_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_TASK__PROPAGATOR_FUNCTIONS = SchedulerPackage.TASK__PROPAGATOR_FUNCTIONS;

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
	 * The feature id for the '<em><b>Shipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_TASK__SHIPMENT = SchedulerPackage.TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_TASK__DISTANCE = SchedulerPackage.TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Location X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_TASK__LOCATION_X = SchedulerPackage.TASK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Location Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_TASK__LOCATION_Y = SchedulerPackage.TASK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>To Use Schedule Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_TASK_FEATURE_COUNT = SchedulerPackage.TASK_FEATURE_COUNT + 4;

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
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseScheduleLoadUnloadImpl <em>To Use Schedule Load Unload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseScheduleLoadUnloadImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getToUseScheduleLoadUnload()
	 * @generated
	 */
	int TO_USE_SCHEDULE_LOAD_UNLOAD = 11;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseLoadShipmentImpl <em>To Use Load Shipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseLoadShipmentImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getToUseLoadShipment()
	 * @generated
	 */
	int TO_USE_LOAD_SHIPMENT = 8;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LOAD_SHIPMENT__PROPAGATOR_FUNCTIONS = TO_USE_SCHEDULE_TASK__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Next Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LOAD_SHIPMENT__NEXT_TASK = TO_USE_SCHEDULE_TASK__NEXT_TASK;

	/**
	 * The feature id for the '<em><b>Previous Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LOAD_SHIPMENT__PREVIOUS_TASK = TO_USE_SCHEDULE_TASK__PREVIOUS_TASK;

	/**
	 * The feature id for the '<em><b>Scheduled Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LOAD_SHIPMENT__SCHEDULED_RESOURCE = TO_USE_SCHEDULE_TASK__SCHEDULED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LOAD_SHIPMENT__DESCRIPTION = TO_USE_SCHEDULE_TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Schedule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LOAD_SHIPMENT__SCHEDULE = TO_USE_SCHEDULE_TASK__SCHEDULE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LOAD_SHIPMENT__NAME = TO_USE_SCHEDULE_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Shipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LOAD_SHIPMENT__SHIPMENT = TO_USE_SCHEDULE_TASK__SHIPMENT;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LOAD_SHIPMENT__DISTANCE = TO_USE_SCHEDULE_TASK__DISTANCE;

	/**
	 * The feature id for the '<em><b>Location X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LOAD_SHIPMENT__LOCATION_X = TO_USE_SCHEDULE_TASK__LOCATION_X;

	/**
	 * The feature id for the '<em><b>Location Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LOAD_SHIPMENT__LOCATION_Y = TO_USE_SCHEDULE_TASK__LOCATION_Y;

	/**
	 * The feature id for the '<em><b>Shipment Loaded</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LOAD_SHIPMENT__SHIPMENT_LOADED = TO_USE_SCHEDULE_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unload Shipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LOAD_SHIPMENT__UNLOAD_SHIPMENT = TO_USE_SCHEDULE_TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>To Use Load Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LOAD_SHIPMENT_FEATURE_COUNT = TO_USE_SCHEDULE_TASK_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LOAD_SHIPMENT___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = TO_USE_SCHEDULE_TASK___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LOAD_SHIPMENT___GET_PROPAGATOR_FUNCTION__ECLASS = TO_USE_SCHEDULE_TASK___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Add Propagator Functions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LOAD_SHIPMENT___ADD_PROPAGATOR_FUNCTIONS__STRING = TO_USE_SCHEDULE_TASK___ADD_PROPAGATOR_FUNCTIONS__STRING;

	/**
	 * The operation id for the '<em>Unset Previous Next</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LOAD_SHIPMENT___UNSET_PREVIOUS_NEXT = TO_USE_SCHEDULE_TASK___UNSET_PREVIOUS_NEXT;

	/**
	 * The operation id for the '<em>Set Previous Next</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LOAD_SHIPMENT___SET_PREVIOUS_NEXT__RESOURCE_TASK_TASK = TO_USE_SCHEDULE_TASK___SET_PREVIOUS_NEXT__RESOURCE_TASK_TASK;

	/**
	 * The operation id for the '<em>Schedule Resource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LOAD_SHIPMENT___SCHEDULE_RESOURCE__RESOURCE = TO_USE_SCHEDULE_TASK___SCHEDULE_RESOURCE__RESOURCE;

	/**
	 * The number of operations of the '<em>To Use Load Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LOAD_SHIPMENT_OPERATION_COUNT = TO_USE_SCHEDULE_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseUnloadShipmentImpl <em>To Use Unload Shipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseUnloadShipmentImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getToUseUnloadShipment()
	 * @generated
	 */
	int TO_USE_UNLOAD_SHIPMENT = 9;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNLOAD_SHIPMENT__PROPAGATOR_FUNCTIONS = TO_USE_SCHEDULE_TASK__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Next Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNLOAD_SHIPMENT__NEXT_TASK = TO_USE_SCHEDULE_TASK__NEXT_TASK;

	/**
	 * The feature id for the '<em><b>Previous Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNLOAD_SHIPMENT__PREVIOUS_TASK = TO_USE_SCHEDULE_TASK__PREVIOUS_TASK;

	/**
	 * The feature id for the '<em><b>Scheduled Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNLOAD_SHIPMENT__SCHEDULED_RESOURCE = TO_USE_SCHEDULE_TASK__SCHEDULED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNLOAD_SHIPMENT__DESCRIPTION = TO_USE_SCHEDULE_TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Schedule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNLOAD_SHIPMENT__SCHEDULE = TO_USE_SCHEDULE_TASK__SCHEDULE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNLOAD_SHIPMENT__NAME = TO_USE_SCHEDULE_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Shipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNLOAD_SHIPMENT__SHIPMENT = TO_USE_SCHEDULE_TASK__SHIPMENT;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNLOAD_SHIPMENT__DISTANCE = TO_USE_SCHEDULE_TASK__DISTANCE;

	/**
	 * The feature id for the '<em><b>Location X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNLOAD_SHIPMENT__LOCATION_X = TO_USE_SCHEDULE_TASK__LOCATION_X;

	/**
	 * The feature id for the '<em><b>Location Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNLOAD_SHIPMENT__LOCATION_Y = TO_USE_SCHEDULE_TASK__LOCATION_Y;

	/**
	 * The feature id for the '<em><b>Shipment Unloaded</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNLOAD_SHIPMENT__SHIPMENT_UNLOADED = TO_USE_SCHEDULE_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Load Shipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNLOAD_SHIPMENT__LOAD_SHIPMENT = TO_USE_SCHEDULE_TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>To Use Unload Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNLOAD_SHIPMENT_FEATURE_COUNT = TO_USE_SCHEDULE_TASK_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNLOAD_SHIPMENT___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION = TO_USE_SCHEDULE_TASK___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNLOAD_SHIPMENT___GET_PROPAGATOR_FUNCTION__ECLASS = TO_USE_SCHEDULE_TASK___GET_PROPAGATOR_FUNCTION__ECLASS;

	/**
	 * The operation id for the '<em>Add Propagator Functions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNLOAD_SHIPMENT___ADD_PROPAGATOR_FUNCTIONS__STRING = TO_USE_SCHEDULE_TASK___ADD_PROPAGATOR_FUNCTIONS__STRING;

	/**
	 * The operation id for the '<em>Unset Previous Next</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNLOAD_SHIPMENT___UNSET_PREVIOUS_NEXT = TO_USE_SCHEDULE_TASK___UNSET_PREVIOUS_NEXT;

	/**
	 * The operation id for the '<em>Set Previous Next</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNLOAD_SHIPMENT___SET_PREVIOUS_NEXT__RESOURCE_TASK_TASK = TO_USE_SCHEDULE_TASK___SET_PREVIOUS_NEXT__RESOURCE_TASK_TASK;

	/**
	 * The operation id for the '<em>Schedule Resource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNLOAD_SHIPMENT___SCHEDULE_RESOURCE__RESOURCE = TO_USE_SCHEDULE_TASK___SCHEDULE_RESOURCE__RESOURCE;

	/**
	 * The number of operations of the '<em>To Use Unload Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNLOAD_SHIPMENT_OPERATION_COUNT = TO_USE_SCHEDULE_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseActionLoadUnloadImpl <em>To Use Action Load Unload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseActionLoadUnloadImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getToUseActionLoadUnload()
	 * @generated
	 */
	int TO_USE_ACTION_LOAD_UNLOAD = 10;

	/**
	 * The feature id for the '<em><b>Root Moves</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_ACTION_LOAD_UNLOAD__ROOT_MOVES = LocalSearchPackage.ACTION__ROOT_MOVES;

	/**
	 * The feature id for the '<em><b>Current Move</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_ACTION_LOAD_UNLOAD__CURRENT_MOVE = LocalSearchPackage.ACTION__CURRENT_MOVE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_ACTION_LOAD_UNLOAD__DESCRIPTION = LocalSearchPackage.ACTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Valid Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_ACTION_LOAD_UNLOAD__VALID_FEEDBACK = LocalSearchPackage.ACTION__VALID_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_ACTION_LOAD_UNLOAD__VALID = LocalSearchPackage.ACTION__VALID;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_ACTION_LOAD_UNLOAD__SOLUTION = LocalSearchPackage.ACTION__SOLUTION;

	/**
	 * The feature id for the '<em><b>Load Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_ACTION_LOAD_UNLOAD__LOAD_TASK = LocalSearchPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>To Use Action Load Unload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_ACTION_LOAD_UNLOAD_FEATURE_COUNT = LocalSearchPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_ACTION_LOAD_UNLOAD___INITIALIZE = LocalSearchPackage.ACTION___INITIALIZE;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_ACTION_LOAD_UNLOAD___RUN = LocalSearchPackage.ACTION___RUN;

	/**
	 * The operation id for the '<em>Finalize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_ACTION_LOAD_UNLOAD___FINALIZE = LocalSearchPackage.ACTION___FINALIZE;

	/**
	 * The number of operations of the '<em>To Use Action Load Unload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_ACTION_LOAD_UNLOAD_OPERATION_COUNT = LocalSearchPackage.ACTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Root Moves</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_LOAD_UNLOAD__ROOT_MOVES = TO_USE_ACTION_LOAD_UNLOAD__ROOT_MOVES;

	/**
	 * The feature id for the '<em><b>Current Move</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_LOAD_UNLOAD__CURRENT_MOVE = TO_USE_ACTION_LOAD_UNLOAD__CURRENT_MOVE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_LOAD_UNLOAD__DESCRIPTION = TO_USE_ACTION_LOAD_UNLOAD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Valid Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_LOAD_UNLOAD__VALID_FEEDBACK = TO_USE_ACTION_LOAD_UNLOAD__VALID_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_LOAD_UNLOAD__VALID = TO_USE_ACTION_LOAD_UNLOAD__VALID;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_LOAD_UNLOAD__SOLUTION = TO_USE_ACTION_LOAD_UNLOAD__SOLUTION;

	/**
	 * The feature id for the '<em><b>Load Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_LOAD_UNLOAD__LOAD_TASK = TO_USE_ACTION_LOAD_UNLOAD__LOAD_TASK;

	/**
	 * The number of structural features of the '<em>To Use Schedule Load Unload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_LOAD_UNLOAD_FEATURE_COUNT = TO_USE_ACTION_LOAD_UNLOAD_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_LOAD_UNLOAD___INITIALIZE = TO_USE_ACTION_LOAD_UNLOAD___INITIALIZE;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_LOAD_UNLOAD___RUN = TO_USE_ACTION_LOAD_UNLOAD___RUN;

	/**
	 * The operation id for the '<em>Finalize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_LOAD_UNLOAD___FINALIZE = TO_USE_ACTION_LOAD_UNLOAD___FINALIZE;

	/**
	 * The number of operations of the '<em>To Use Schedule Load Unload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_LOAD_UNLOAD_OPERATION_COUNT = TO_USE_ACTION_LOAD_UNLOAD_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULER__PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULER__ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULER__ANTECEDENTS_SIBLING = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULER__TOUCHED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULER__TOUCHED_CHILDREN = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULER__TOUCHERS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULER__ENABLED = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULER__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULER__TYPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULER__OBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULER__INSTANCE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULER__DESCRIPTION = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULER__TOUCHED_PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS__TOUCHED_PARENT;

	/**
	 * The number of structural features of the '<em>Calc Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULER_FEATURE_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULER___INIT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULER___ENABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULER___DISABLE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULER___RESET = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULER___TOUCH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULER___UNTOUCH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULER___REFRESH_ANTECEDENTS__REFRESHER = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULER___REFRESH_THIS__REFRESHER = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULER___REFRESH_CHILDREN_AND_THIS__REFRESHER = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULER___REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULER___REFRESH__REFRESHER = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULER___DO_GET_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULER___DO_GET_PARENT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULER___DO_REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULER___DO_REFRESH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULER___GET_SCOPE = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULER___GET_FACTORY_ID = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULER___DO_GET_BINDINGS = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULER_OPERATION_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULE__PARENT = CALC_SCHEDULER__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULE__ANTECEDENTS = CALC_SCHEDULER__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULE__ANTECEDENTS_SIBLING = CALC_SCHEDULER__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULE__TOUCHED = CALC_SCHEDULER__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULE__TOUCHED_CHILDREN = CALC_SCHEDULER__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULE__TOUCHERS = CALC_SCHEDULER__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULE__ENABLED = CALC_SCHEDULER__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_SCHEDULER__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULE__TYPE = CALC_SCHEDULER__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULE__OBJECT = CALC_SCHEDULER__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULE__INSTANCE = CALC_SCHEDULER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULE__DESCRIPTION = CALC_SCHEDULER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULE__TOUCHED_PARENT = CALC_SCHEDULER__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULE__SCHEDULE = CALC_SCHEDULER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Calc Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULE_FEATURE_COUNT = CALC_SCHEDULER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULE___INIT = CALC_SCHEDULER___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULE___ENABLE = CALC_SCHEDULER___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULE___DISABLE = CALC_SCHEDULER___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULE___RESET = CALC_SCHEDULER___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULE___TOUCH__EOBJECT = CALC_SCHEDULER___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULE___UNTOUCH = CALC_SCHEDULER___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULE___REFRESH_ANTECEDENTS__REFRESHER = CALC_SCHEDULER___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULE___REFRESH_THIS__REFRESHER = CALC_SCHEDULER___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULE___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_SCHEDULER___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULE___REFRESH = CALC_SCHEDULER___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULE___REFRESH__REFRESHER = CALC_SCHEDULER___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULE___DO_GET_ANTECEDENTS = CALC_SCHEDULER___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULE___DO_GET_PARENT = CALC_SCHEDULER___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULE___DO_REFRESH = CALC_SCHEDULER___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULE___DO_REFRESH__EOBJECT = CALC_SCHEDULER___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULE___GET_SCOPE = CALC_SCHEDULER___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULE___GET_FACTORY_ID = CALC_SCHEDULER___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULE___DO_GET_BINDINGS = CALC_SCHEDULER___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_SCHEDULER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_SCHEDULE_OPERATION_COUNT = CALC_SCHEDULER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE__PARENT = CALC_SCHEDULER__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE__ANTECEDENTS = CALC_SCHEDULER__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE__ANTECEDENTS_SIBLING = CALC_SCHEDULER__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE__TOUCHED = CALC_SCHEDULER__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE__TOUCHED_CHILDREN = CALC_SCHEDULER__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE__TOUCHERS = CALC_SCHEDULER__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE__ENABLED = CALC_SCHEDULER__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_SCHEDULER__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE__TYPE = CALC_SCHEDULER__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE__OBJECT = CALC_SCHEDULER__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE__INSTANCE = CALC_SCHEDULER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE__DESCRIPTION = CALC_SCHEDULER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE__TOUCHED_PARENT = CALC_SCHEDULER__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE__RESOURCE = CALC_SCHEDULER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Calc Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_FEATURE_COUNT = CALC_SCHEDULER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE___INIT = CALC_SCHEDULER___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE___ENABLE = CALC_SCHEDULER___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE___DISABLE = CALC_SCHEDULER___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE___RESET = CALC_SCHEDULER___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE___TOUCH__EOBJECT = CALC_SCHEDULER___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE___UNTOUCH = CALC_SCHEDULER___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE___REFRESH_ANTECEDENTS__REFRESHER = CALC_SCHEDULER___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE___REFRESH_THIS__REFRESHER = CALC_SCHEDULER___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_SCHEDULER___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE___REFRESH = CALC_SCHEDULER___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE___REFRESH__REFRESHER = CALC_SCHEDULER___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE___DO_GET_ANTECEDENTS = CALC_SCHEDULER___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE___DO_GET_PARENT = CALC_SCHEDULER___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE___DO_REFRESH = CALC_SCHEDULER___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE___DO_REFRESH__EOBJECT = CALC_SCHEDULER___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE___GET_SCOPE = CALC_SCHEDULER___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE___GET_FACTORY_ID = CALC_SCHEDULER___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE___DO_GET_BINDINGS = CALC_SCHEDULER___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_SCHEDULER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_OPERATION_COUNT = CALC_SCHEDULER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK__PARENT = CALC_SCHEDULER__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK__ANTECEDENTS = CALC_SCHEDULER__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK__ANTECEDENTS_SIBLING = CALC_SCHEDULER__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK__TOUCHED = CALC_SCHEDULER__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK__TOUCHED_CHILDREN = CALC_SCHEDULER__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK__TOUCHERS = CALC_SCHEDULER__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK__ENABLED = CALC_SCHEDULER__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_SCHEDULER__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK__TYPE = CALC_SCHEDULER__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK__OBJECT = CALC_SCHEDULER__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK__INSTANCE = CALC_SCHEDULER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK__DESCRIPTION = CALC_SCHEDULER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK__TOUCHED_PARENT = CALC_SCHEDULER__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK__TASK = CALC_SCHEDULER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Calc Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_FEATURE_COUNT = CALC_SCHEDULER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK___INIT = CALC_SCHEDULER___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK___ENABLE = CALC_SCHEDULER___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK___DISABLE = CALC_SCHEDULER___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK___RESET = CALC_SCHEDULER___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK___TOUCH__EOBJECT = CALC_SCHEDULER___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK___UNTOUCH = CALC_SCHEDULER___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK___REFRESH_ANTECEDENTS__REFRESHER = CALC_SCHEDULER___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK___REFRESH_THIS__REFRESHER = CALC_SCHEDULER___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_SCHEDULER___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK___REFRESH = CALC_SCHEDULER___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK___REFRESH__REFRESHER = CALC_SCHEDULER___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK___DO_GET_ANTECEDENTS = CALC_SCHEDULER___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK___DO_GET_PARENT = CALC_SCHEDULER___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK___DO_REFRESH = CALC_SCHEDULER___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK___DO_REFRESH__EOBJECT = CALC_SCHEDULER___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK___GET_SCOPE = CALC_SCHEDULER___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK___GET_FACTORY_ID = CALC_SCHEDULER___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK___DO_GET_BINDINGS = CALC_SCHEDULER___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_SCHEDULER___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_OPERATION_COUNT = CALC_SCHEDULER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE__PARENT = CALC_SCHEDULE__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE__ANTECEDENTS = CALC_SCHEDULE__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE__ANTECEDENTS_SIBLING = CALC_SCHEDULE__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE__TOUCHED = CALC_SCHEDULE__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE__TOUCHED_CHILDREN = CALC_SCHEDULE__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE__TOUCHERS = CALC_SCHEDULE__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE__ENABLED = CALC_SCHEDULE__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_SCHEDULE__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE__TYPE = CALC_SCHEDULE__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE__OBJECT = CALC_SCHEDULE__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE__INSTANCE = CALC_SCHEDULE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE__DESCRIPTION = CALC_SCHEDULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE__TOUCHED_PARENT = CALC_SCHEDULE__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE__SCHEDULE = CALC_SCHEDULE__SCHEDULE;

	/**
	 * The number of structural features of the '<em>Scope Schedule Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE_FEATURE_COUNT = CALC_SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE___INIT = CALC_SCHEDULE___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE___ENABLE = CALC_SCHEDULE___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE___DISABLE = CALC_SCHEDULE___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE___RESET = CALC_SCHEDULE___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE___TOUCH__EOBJECT = CALC_SCHEDULE___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE___UNTOUCH = CALC_SCHEDULE___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE___REFRESH_ANTECEDENTS__REFRESHER = CALC_SCHEDULE___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE___REFRESH_THIS__REFRESHER = CALC_SCHEDULE___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_SCHEDULE___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE___REFRESH = CALC_SCHEDULE___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE___REFRESH__REFRESHER = CALC_SCHEDULE___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE___DO_GET_ANTECEDENTS = CALC_SCHEDULE___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE___DO_GET_PARENT = CALC_SCHEDULE___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE___DO_REFRESH = CALC_SCHEDULE___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE___DO_REFRESH__EOBJECT = CALC_SCHEDULE___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE___GET_SCOPE = CALC_SCHEDULE___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE___GET_FACTORY_ID = CALC_SCHEDULE___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE___DO_GET_BINDINGS = CALC_SCHEDULE___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_SCHEDULE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Scope Schedule Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SCHEDULE_SCORE_OPERATION_COUNT = CALC_SCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE__PARENT = CALC_SCHEDULE__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE__ANTECEDENTS = CALC_SCHEDULE__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE__ANTECEDENTS_SIBLING = CALC_SCHEDULE__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE__TOUCHED = CALC_SCHEDULE__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE__TOUCHED_CHILDREN = CALC_SCHEDULE__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE__TOUCHERS = CALC_SCHEDULE__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE__ENABLED = CALC_SCHEDULE__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_SCHEDULE__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE__TYPE = CALC_SCHEDULE__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE__OBJECT = CALC_SCHEDULE__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE__INSTANCE = CALC_SCHEDULE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE__DESCRIPTION = CALC_SCHEDULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE__TOUCHED_PARENT = CALC_SCHEDULE__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE__SCHEDULE = CALC_SCHEDULE__SCHEDULE;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE__CONCRETE_PARENT = CALC_SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Layer Schedule Distance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE_FEATURE_COUNT = CALC_SCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE___INIT = CALC_SCHEDULE___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE___ENABLE = CALC_SCHEDULE___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE___DISABLE = CALC_SCHEDULE___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE___RESET = CALC_SCHEDULE___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE___TOUCH__EOBJECT = CALC_SCHEDULE___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE___UNTOUCH = CALC_SCHEDULE___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE___REFRESH_ANTECEDENTS__REFRESHER = CALC_SCHEDULE___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE___REFRESH_THIS__REFRESHER = CALC_SCHEDULE___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_SCHEDULE___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE___REFRESH = CALC_SCHEDULE___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE___REFRESH__REFRESHER = CALC_SCHEDULE___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE___DO_GET_ANTECEDENTS = CALC_SCHEDULE___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE___DO_GET_PARENT = CALC_SCHEDULE___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE___DO_REFRESH = CALC_SCHEDULE___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE___DO_REFRESH__EOBJECT = CALC_SCHEDULE___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE___GET_SCOPE = CALC_SCHEDULE___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE___GET_FACTORY_ID = CALC_SCHEDULE___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE___DO_GET_BINDINGS = CALC_SCHEDULE___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_SCHEDULE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Layer Schedule Distance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_DISTANCE_OPERATION_COUNT = CALC_SCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE__PARENT = CALC_TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE__ANTECEDENTS = CALC_TASK__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE__ANTECEDENTS_SIBLING = CALC_TASK__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE__TOUCHED = CALC_TASK__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE__TOUCHED_CHILDREN = CALC_TASK__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE__TOUCHERS = CALC_TASK__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE__ENABLED = CALC_TASK__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_TASK__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE__TYPE = CALC_TASK__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE__OBJECT = CALC_TASK__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE__INSTANCE = CALC_TASK__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE__DESCRIPTION = CALC_TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE__TOUCHED_PARENT = CALC_TASK__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE__TASK = CALC_TASK__TASK;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE__CONCRETE_PARENT = CALC_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Calc Task Distance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE_FEATURE_COUNT = CALC_TASK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE___INIT = CALC_TASK___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE___ENABLE = CALC_TASK___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE___DISABLE = CALC_TASK___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE___RESET = CALC_TASK___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE___TOUCH__EOBJECT = CALC_TASK___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE___UNTOUCH = CALC_TASK___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE___REFRESH_ANTECEDENTS__REFRESHER = CALC_TASK___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE___REFRESH_THIS__REFRESHER = CALC_TASK___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_TASK___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE___REFRESH = CALC_TASK___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE___REFRESH__REFRESHER = CALC_TASK___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE___DO_GET_ANTECEDENTS = CALC_TASK___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE___DO_GET_PARENT = CALC_TASK___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE___DO_REFRESH = CALC_TASK___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE___DO_REFRESH__EOBJECT = CALC_TASK___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE___GET_SCOPE = CALC_TASK___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE___GET_FACTORY_ID = CALC_TASK___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE___DO_GET_BINDINGS = CALC_TASK___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_TASK___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Task Distance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE_OPERATION_COUNT = CALC_TASK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE__PARENT = CALC_RESOURCE__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE__ANTECEDENTS = CALC_RESOURCE__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE__ANTECEDENTS_SIBLING = CALC_RESOURCE__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE__TOUCHED = CALC_RESOURCE__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE__TOUCHED_CHILDREN = CALC_RESOURCE__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE__TOUCHERS = CALC_RESOURCE__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE__ENABLED = CALC_RESOURCE__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_RESOURCE__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE__TYPE = CALC_RESOURCE__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE__OBJECT = CALC_RESOURCE__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE__INSTANCE = CALC_RESOURCE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE__DESCRIPTION = CALC_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE__TOUCHED_PARENT = CALC_RESOURCE__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE__RESOURCE = CALC_RESOURCE__RESOURCE;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE__CONCRETE_PARENT = CALC_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Calc Resource Distance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE_FEATURE_COUNT = CALC_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE___INIT = CALC_RESOURCE___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE___ENABLE = CALC_RESOURCE___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE___DISABLE = CALC_RESOURCE___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE___RESET = CALC_RESOURCE___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE___TOUCH__EOBJECT = CALC_RESOURCE___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE___UNTOUCH = CALC_RESOURCE___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE___REFRESH_ANTECEDENTS__REFRESHER = CALC_RESOURCE___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE___REFRESH_THIS__REFRESHER = CALC_RESOURCE___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_RESOURCE___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE___REFRESH = CALC_RESOURCE___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE___REFRESH__REFRESHER = CALC_RESOURCE___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE___DO_GET_ANTECEDENTS = CALC_RESOURCE___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE___DO_GET_PARENT = CALC_RESOURCE___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE___DO_REFRESH = CALC_RESOURCE___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE___DO_REFRESH__EOBJECT = CALC_RESOURCE___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE___GET_SCOPE = CALC_RESOURCE___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE___GET_FACTORY_ID = CALC_RESOURCE___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE___DO_GET_BINDINGS = CALC_RESOURCE___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_RESOURCE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Resource Distance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE_OPERATION_COUNT = CALC_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseUnscheduleLoadUnloadImpl <em>To Use Unschedule Load Unload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseUnscheduleLoadUnloadImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getToUseUnscheduleLoadUnload()
	 * @generated
	 */
	int TO_USE_UNSCHEDULE_LOAD_UNLOAD = 20;

	/**
	 * The feature id for the '<em><b>Root Moves</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNSCHEDULE_LOAD_UNLOAD__ROOT_MOVES = TO_USE_ACTION_LOAD_UNLOAD__ROOT_MOVES;

	/**
	 * The feature id for the '<em><b>Current Move</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNSCHEDULE_LOAD_UNLOAD__CURRENT_MOVE = TO_USE_ACTION_LOAD_UNLOAD__CURRENT_MOVE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNSCHEDULE_LOAD_UNLOAD__DESCRIPTION = TO_USE_ACTION_LOAD_UNLOAD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Valid Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNSCHEDULE_LOAD_UNLOAD__VALID_FEEDBACK = TO_USE_ACTION_LOAD_UNLOAD__VALID_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNSCHEDULE_LOAD_UNLOAD__VALID = TO_USE_ACTION_LOAD_UNLOAD__VALID;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNSCHEDULE_LOAD_UNLOAD__SOLUTION = TO_USE_ACTION_LOAD_UNLOAD__SOLUTION;

	/**
	 * The feature id for the '<em><b>Load Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNSCHEDULE_LOAD_UNLOAD__LOAD_TASK = TO_USE_ACTION_LOAD_UNLOAD__LOAD_TASK;

	/**
	 * The number of structural features of the '<em>To Use Unschedule Load Unload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNSCHEDULE_LOAD_UNLOAD_FEATURE_COUNT = TO_USE_ACTION_LOAD_UNLOAD_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNSCHEDULE_LOAD_UNLOAD___INITIALIZE = TO_USE_ACTION_LOAD_UNLOAD___INITIALIZE;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNSCHEDULE_LOAD_UNLOAD___RUN = TO_USE_ACTION_LOAD_UNLOAD___RUN;

	/**
	 * The operation id for the '<em>Finalize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNSCHEDULE_LOAD_UNLOAD___FINALIZE = TO_USE_ACTION_LOAD_UNLOAD___FINALIZE;

	/**
	 * The number of operations of the '<em>To Use Unschedule Load Unload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNSCHEDULE_LOAD_UNLOAD_OPERATION_COUNT = TO_USE_ACTION_LOAD_UNLOAD_OPERATION_COUNT + 0;

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
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.tousescheduler.Domain#getVehicles <em>Vehicles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vehicles</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.Domain#getVehicles()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Vehicles();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.tousescheduler.Domain#getShipments <em>Shipments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shipments</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.Domain#getShipments()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Shipments();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousescheduler.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.Vehicle
	 * @generated
	 */
	EClass getVehicle();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousescheduler.Vehicle#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.Vehicle#getName()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousescheduler.Vehicle#getHomeLocationX <em>Home Location X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Home Location X</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.Vehicle#getHomeLocationX()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_HomeLocationX();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousescheduler.Vehicle#getHomeLocationY <em>Home Location Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Home Location Y</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.Vehicle#getHomeLocationY()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_HomeLocationY();

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
	 * Returns the meta object for the reference list '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduler#getSelectedVehicles <em>Selected Vehicles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Selected Vehicles</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseScheduler#getSelectedVehicles()
	 * @see #getToUseScheduler()
	 * @generated
	 */
	EReference getToUseScheduler_SelectedVehicles();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduler#getSelectedShipments <em>Selected Shipments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Selected Shipments</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseScheduler#getSelectedShipments()
	 * @see #getToUseScheduler()
	 * @generated
	 */
	EReference getToUseScheduler_SelectedShipments();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduler#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseScheduler#getActions()
	 * @see #getToUseScheduler()
	 * @generated
	 */
	EReference getToUseScheduler_Actions();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousescheduler.Shipment <em>Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.Shipment
	 * @generated
	 */
	EClass getShipment();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousescheduler.Shipment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.Shipment#getName()
	 * @see #getShipment()
	 * @generated
	 */
	EAttribute getShipment_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousescheduler.Shipment#getLoadLocationX <em>Load Location X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load Location X</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.Shipment#getLoadLocationX()
	 * @see #getShipment()
	 * @generated
	 */
	EAttribute getShipment_LoadLocationX();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousescheduler.Shipment#getLoadLocationY <em>Load Location Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load Location Y</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.Shipment#getLoadLocationY()
	 * @see #getShipment()
	 * @generated
	 */
	EAttribute getShipment_LoadLocationY();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousescheduler.Shipment#getUnloadLocationX <em>Unload Location X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unload Location X</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.Shipment#getUnloadLocationX()
	 * @see #getShipment()
	 * @generated
	 */
	EAttribute getShipment_UnloadLocationX();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousescheduler.Shipment#getUnloadLocationY <em>Unload Location Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unload Location Y</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.Shipment#getUnloadLocationY()
	 * @see #getShipment()
	 * @generated
	 */
	EAttribute getShipment_UnloadLocationY();

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
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask#getShipment <em>Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask#getShipment()
	 * @see #getToUseScheduleTask()
	 * @generated
	 */
	EReference getToUseScheduleTask_Shipment();

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
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask#getLocationX <em>Location X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location X</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask#getLocationX()
	 * @see #getToUseScheduleTask()
	 * @generated
	 */
	EAttribute getToUseScheduleTask_LocationX();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask#getLocationY <em>Location Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location Y</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask#getLocationY()
	 * @see #getToUseScheduleTask()
	 * @generated
	 */
	EAttribute getToUseScheduleTask_LocationY();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousescheduler.CalcScheduler <em>Calc Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Scheduler</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.CalcScheduler
	 * @generated
	 */
	EClass getCalcScheduler();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousescheduler.CalcSchedule <em>Calc Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Schedule</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.CalcSchedule
	 * @generated
	 */
	EClass getCalcSchedule();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousescheduler.CalcSchedule#getSchedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Schedule</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.CalcSchedule#getSchedule()
	 * @see #getCalcSchedule()
	 * @generated
	 */
	EReference getCalcSchedule_Schedule();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousescheduler.CalcResource <em>Calc Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Resource</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.CalcResource
	 * @generated
	 */
	EClass getCalcResource();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousescheduler.CalcResource#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.CalcResource#getResource()
	 * @see #getCalcResource()
	 * @generated
	 */
	EReference getCalcResource_Resource();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousescheduler.CalcTask <em>Calc Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Task</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.CalcTask
	 * @generated
	 */
	EClass getCalcTask();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousescheduler.CalcTask#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.CalcTask#getTask()
	 * @see #getCalcTask()
	 * @generated
	 */
	EReference getCalcTask_Task();

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
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource#getVehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vehicle</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource#getVehicle()
	 * @see #getToUseScheduleResource()
	 * @generated
	 */
	EReference getToUseScheduleResource_Vehicle();

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
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousescheduler.ToUseUnscheduleLoadUnload <em>To Use Unschedule Load Unload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Use Unschedule Load Unload</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseUnscheduleLoadUnload
	 * @generated
	 */
	EClass getToUseUnscheduleLoadUnload();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleLoadUnload <em>To Use Schedule Load Unload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Use Schedule Load Unload</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseScheduleLoadUnload
	 * @generated
	 */
	EClass getToUseScheduleLoadUnload();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousescheduler.ToUseLoadShipment <em>To Use Load Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Use Load Shipment</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseLoadShipment
	 * @generated
	 */
	EClass getToUseLoadShipment();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousescheduler.ToUseLoadShipment#getShipmentLoaded <em>Shipment Loaded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment Loaded</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseLoadShipment#getShipmentLoaded()
	 * @see #getToUseLoadShipment()
	 * @generated
	 */
	EReference getToUseLoadShipment_ShipmentLoaded();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousescheduler.ToUseLoadShipment#getUnloadShipment <em>Unload Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unload Shipment</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseLoadShipment#getUnloadShipment()
	 * @see #getToUseLoadShipment()
	 * @generated
	 */
	EReference getToUseLoadShipment_UnloadShipment();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousescheduler.ToUseUnloadShipment <em>To Use Unload Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Use Unload Shipment</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseUnloadShipment
	 * @generated
	 */
	EClass getToUseUnloadShipment();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousescheduler.ToUseUnloadShipment#getShipmentUnloaded <em>Shipment Unloaded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment Unloaded</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseUnloadShipment#getShipmentUnloaded()
	 * @see #getToUseUnloadShipment()
	 * @generated
	 */
	EReference getToUseUnloadShipment_ShipmentUnloaded();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousescheduler.ToUseUnloadShipment#getLoadShipment <em>Load Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Load Shipment</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseUnloadShipment#getLoadShipment()
	 * @see #getToUseUnloadShipment()
	 * @generated
	 */
	EReference getToUseUnloadShipment_LoadShipment();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousescheduler.ToUseActionLoadUnload <em>To Use Action Load Unload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Use Action Load Unload</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseActionLoadUnload
	 * @generated
	 */
	EClass getToUseActionLoadUnload();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousescheduler.ToUseActionLoadUnload#getLoadTask <em>Load Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Load Task</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseActionLoadUnload#getLoadTask()
	 * @see #getToUseActionLoadUnload()
	 * @generated
	 */
	EReference getToUseActionLoadUnload_LoadTask();

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
	 * Returns the meta object for the '{@link com.misc.touse.moplaf.tousescheduler.ToUseSchedule#enable() <em>Enable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Enable</em>' operation.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedule#enable()
	 * @generated
	 */
	EOperation getToUseSchedule__Enable();

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
		 * The meta object literal for the '<em><b>Vehicles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__VEHICLES = eINSTANCE.getDomain_Vehicles();

		/**
		 * The meta object literal for the '<em><b>Shipments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__SHIPMENTS = eINSTANCE.getDomain_Shipments();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousescheduler.impl.VehicleImpl <em>Vehicle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousescheduler.impl.VehicleImpl
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getVehicle()
		 * @generated
		 */
		EClass VEHICLE = eINSTANCE.getVehicle();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__NAME = eINSTANCE.getVehicle_Name();

		/**
		 * The meta object literal for the '<em><b>Home Location X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__HOME_LOCATION_X = eINSTANCE.getVehicle_HomeLocationX();

		/**
		 * The meta object literal for the '<em><b>Home Location Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__HOME_LOCATION_Y = eINSTANCE.getVehicle_HomeLocationY();

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
		 * The meta object literal for the '<em><b>Selected Vehicles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_SCHEDULER__SELECTED_VEHICLES = eINSTANCE.getToUseScheduler_SelectedVehicles();

		/**
		 * The meta object literal for the '<em><b>Selected Shipments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_SCHEDULER__SELECTED_SHIPMENTS = eINSTANCE.getToUseScheduler_SelectedShipments();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_SCHEDULER__ACTIONS = eINSTANCE.getToUseScheduler_Actions();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ShipmentImpl <em>Shipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ShipmentImpl
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getShipment()
		 * @generated
		 */
		EClass SHIPMENT = eINSTANCE.getShipment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT__NAME = eINSTANCE.getShipment_Name();

		/**
		 * The meta object literal for the '<em><b>Load Location X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT__LOAD_LOCATION_X = eINSTANCE.getShipment_LoadLocationX();

		/**
		 * The meta object literal for the '<em><b>Load Location Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT__LOAD_LOCATION_Y = eINSTANCE.getShipment_LoadLocationY();

		/**
		 * The meta object literal for the '<em><b>Unload Location X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT__UNLOAD_LOCATION_X = eINSTANCE.getShipment_UnloadLocationX();

		/**
		 * The meta object literal for the '<em><b>Unload Location Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT__UNLOAD_LOCATION_Y = eINSTANCE.getShipment_UnloadLocationY();

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
		 * The meta object literal for the '<em><b>Shipment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_SCHEDULE_TASK__SHIPMENT = eINSTANCE.getToUseScheduleTask_Shipment();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_USE_SCHEDULE_TASK__DISTANCE = eINSTANCE.getToUseScheduleTask_Distance();

		/**
		 * The meta object literal for the '<em><b>Location X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_USE_SCHEDULE_TASK__LOCATION_X = eINSTANCE.getToUseScheduleTask_LocationX();

		/**
		 * The meta object literal for the '<em><b>Location Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_USE_SCHEDULE_TASK__LOCATION_Y = eINSTANCE.getToUseScheduleTask_LocationY();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousescheduler.impl.CalcSchedulerImpl <em>Calc Scheduler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousescheduler.impl.CalcSchedulerImpl
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getCalcScheduler()
		 * @generated
		 */
		EClass CALC_SCHEDULER = eINSTANCE.getCalcScheduler();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousescheduler.impl.CalcScheduleImpl <em>Calc Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousescheduler.impl.CalcScheduleImpl
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getCalcSchedule()
		 * @generated
		 */
		EClass CALC_SCHEDULE = eINSTANCE.getCalcSchedule();

		/**
		 * The meta object literal for the '<em><b>Schedule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_SCHEDULE__SCHEDULE = eINSTANCE.getCalcSchedule_Schedule();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousescheduler.impl.CalcResourceImpl <em>Calc Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousescheduler.impl.CalcResourceImpl
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getCalcResource()
		 * @generated
		 */
		EClass CALC_RESOURCE = eINSTANCE.getCalcResource();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_RESOURCE__RESOURCE = eINSTANCE.getCalcResource_Resource();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousescheduler.impl.CalcTaskImpl <em>Calc Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousescheduler.impl.CalcTaskImpl
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getCalcTask()
		 * @generated
		 */
		EClass CALC_TASK = eINSTANCE.getCalcTask();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_TASK__TASK = eINSTANCE.getCalcTask_Task();

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
		 * The meta object literal for the '<em><b>Vehicle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_SCHEDULE_RESOURCE__VEHICLE = eINSTANCE.getToUseScheduleResource_Vehicle();

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
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_RESOURCE_DISTANCE__CONCRETE_PARENT = eINSTANCE.getCalcResourceDistance_ConcreteParent();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseUnscheduleLoadUnloadImpl <em>To Use Unschedule Load Unload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseUnscheduleLoadUnloadImpl
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getToUseUnscheduleLoadUnload()
		 * @generated
		 */
		EClass TO_USE_UNSCHEDULE_LOAD_UNLOAD = eINSTANCE.getToUseUnscheduleLoadUnload();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseScheduleLoadUnloadImpl <em>To Use Schedule Load Unload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseScheduleLoadUnloadImpl
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getToUseScheduleLoadUnload()
		 * @generated
		 */
		EClass TO_USE_SCHEDULE_LOAD_UNLOAD = eINSTANCE.getToUseScheduleLoadUnload();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseLoadShipmentImpl <em>To Use Load Shipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseLoadShipmentImpl
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getToUseLoadShipment()
		 * @generated
		 */
		EClass TO_USE_LOAD_SHIPMENT = eINSTANCE.getToUseLoadShipment();

		/**
		 * The meta object literal for the '<em><b>Shipment Loaded</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_LOAD_SHIPMENT__SHIPMENT_LOADED = eINSTANCE.getToUseLoadShipment_ShipmentLoaded();

		/**
		 * The meta object literal for the '<em><b>Unload Shipment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_LOAD_SHIPMENT__UNLOAD_SHIPMENT = eINSTANCE.getToUseLoadShipment_UnloadShipment();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseUnloadShipmentImpl <em>To Use Unload Shipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseUnloadShipmentImpl
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getToUseUnloadShipment()
		 * @generated
		 */
		EClass TO_USE_UNLOAD_SHIPMENT = eINSTANCE.getToUseUnloadShipment();

		/**
		 * The meta object literal for the '<em><b>Shipment Unloaded</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_UNLOAD_SHIPMENT__SHIPMENT_UNLOADED = eINSTANCE.getToUseUnloadShipment_ShipmentUnloaded();

		/**
		 * The meta object literal for the '<em><b>Load Shipment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_UNLOAD_SHIPMENT__LOAD_SHIPMENT = eINSTANCE.getToUseUnloadShipment_LoadShipment();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseActionLoadUnloadImpl <em>To Use Action Load Unload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseActionLoadUnloadImpl
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getToUseActionLoadUnload()
		 * @generated
		 */
		EClass TO_USE_ACTION_LOAD_UNLOAD = eINSTANCE.getToUseActionLoadUnload();

		/**
		 * The meta object literal for the '<em><b>Load Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_ACTION_LOAD_UNLOAD__LOAD_TASK = eINSTANCE.getToUseActionLoadUnload_LoadTask();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseScheduleImpl <em>To Use Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseScheduleImpl
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getToUseSchedule()
		 * @generated
		 */
		EClass TO_USE_SCHEDULE = eINSTANCE.getToUseSchedule();

		/**
		 * The meta object literal for the '<em><b>Enable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TO_USE_SCHEDULE___ENABLE = eINSTANCE.getToUseSchedule__Enable();

	}

} //ToUseSchedulerPackage
