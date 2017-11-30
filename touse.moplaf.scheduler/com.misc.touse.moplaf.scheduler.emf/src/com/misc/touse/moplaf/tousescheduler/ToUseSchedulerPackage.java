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
	 * The feature id for the '<em><b>Max Volume Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__MAX_VOLUME_LOADED = 3;

	/**
	 * The number of structural features of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE_COUNT = 4;

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
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__VOLUME = 5;

	/**
	 * The feature id for the '<em><b>Planned Benefit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__PLANNED_BENEFIT = 6;

	/**
	 * The number of structural features of the '<em>Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Run Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER__RUN_FEEDBACK = SchedulerPackage.SCHEDULER__RUN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Cancel Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER__CANCEL_FEEDBACK = SchedulerPackage.SCHEDULER__CANCEL_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Reset Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER__RESET_FEEDBACK = SchedulerPackage.SCHEDULER__RESET_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Cancelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER__CANCELLED = SchedulerPackage.SCHEDULER__CANCELLED;

	/**
	 * The feature id for the '<em><b>Returned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER__RETURNED = SchedulerPackage.SCHEDULER__RETURNED;

	/**
	 * The feature id for the '<em><b>Return Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER__RETURN_SUCCESS = SchedulerPackage.SCHEDULER__RETURN_SUCCESS;

	/**
	 * The feature id for the '<em><b>Return Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER__RETURN_FEEDBACK = SchedulerPackage.SCHEDULER__RETURN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Return Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER__RETURN_INFORMATION = SchedulerPackage.SCHEDULER__RETURN_INFORMATION;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER__PHASES = SchedulerPackage.SCHEDULER__PHASES;

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
	 * The feature id for the '<em><b>Max Nr Solutions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER__MAX_NR_SOLUTIONS = SchedulerPackage.SCHEDULER__MAX_NR_SOLUTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER__NAME = SchedulerPackage.SCHEDULER__NAME;

	/**
	 * The feature id for the '<em><b>Select Best Chance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER__SELECT_BEST_CHANCE = SchedulerPackage.SCHEDULER__SELECT_BEST_CHANCE;

	/**
	 * The feature id for the '<em><b>Select Worst Chance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER__SELECT_WORST_CHANCE = SchedulerPackage.SCHEDULER__SELECT_WORST_CHANCE;

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
	 * The number of structural features of the '<em>To Use Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER_FEATURE_COUNT = SchedulerPackage.SCHEDULER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Copy Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER___COPY_PARAMS__RUNPARAMS = SchedulerPackage.SCHEDULER___COPY_PARAMS__RUNPARAMS;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER___RESET = SchedulerPackage.SCHEDULER___RESET;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER___RUN = SchedulerPackage.SCHEDULER___RUN;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER___RUN__RUNCONTEXT = SchedulerPackage.SCHEDULER___RUN__RUNCONTEXT;

	/**
	 * The operation id for the '<em>Run Asynch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER___RUN_ASYNCH__RUNCONTEXT = SchedulerPackage.SCHEDULER___RUN_ASYNCH__RUNCONTEXT;

	/**
	 * The operation id for the '<em>Cancel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER___CANCEL = SchedulerPackage.SCHEDULER___CANCEL;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER___SET_PROGRESS__STRING_FLOAT = SchedulerPackage.SCHEDULER___SET_PROGRESS__STRING_FLOAT;

	/**
	 * The operation id for the '<em>Set Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER___SET_RETURN__RETURNFEEDBACK = SchedulerPackage.SCHEDULER___SET_RETURN__RETURNFEEDBACK;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER___SET_PROGRESS__PROGRESSFEEDBACK = SchedulerPackage.SCHEDULER___SET_PROGRESS__PROGRESSFEEDBACK;

	/**
	 * The operation id for the '<em>Get Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER___GET_RETURN = SchedulerPackage.SCHEDULER___GET_RETURN;

	/**
	 * The operation id for the '<em>Construct Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER___CONSTRUCT_PARAMS = SchedulerPackage.SCHEDULER___CONSTRUCT_PARAMS;

	/**
	 * The operation id for the '<em>Select Good Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER___SELECT_GOOD_SOLUTION = SchedulerPackage.SCHEDULER___SELECT_GOOD_SOLUTION;

	/**
	 * The operation id for the '<em>Select Bad Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER___SELECT_BAD_SOLUTION = SchedulerPackage.SCHEDULER___SELECT_BAD_SOLUTION;

	/**
	 * The operation id for the '<em>Sort Solutions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER___SORT_SOLUTIONS = SchedulerPackage.SCHEDULER___SORT_SOLUTIONS;

	/**
	 * The operation id for the '<em>Make New Solution Nr</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER___MAKE_NEW_SOLUTION_NR = SchedulerPackage.SCHEDULER___MAKE_NEW_SOLUTION_NR;

	/**
	 * The operation id for the '<em>Prune</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER___PRUNE = SchedulerPackage.SCHEDULER___PRUNE;

	/**
	 * The operation id for the '<em>Construct Score</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULER___CONSTRUCT_SCORE = SchedulerPackage.SCHEDULER___CONSTRUCT_SCORE;

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
	int CALC_SCHEDULER = 14;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.CalcScheduleImpl <em>Calc Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.CalcScheduleImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getCalcSchedule()
	 * @generated
	 */
	int CALC_SCHEDULE = 15;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.CalcResourceImpl <em>Calc Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.CalcResourceImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getCalcResource()
	 * @generated
	 */
	int CALC_RESOURCE = 16;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.CalcTaskImpl <em>Calc Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.CalcTaskImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getCalcTask()
	 * @generated
	 */
	int CALC_TASK = 17;

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
	int SCOPE_SCHEDULE_SCORE = 18;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.LayerScheduleDistanceImpl <em>Layer Schedule Distance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.LayerScheduleDistanceImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getLayerScheduleDistance()
	 * @generated
	 */
	int LAYER_SCHEDULE_DISTANCE = 19;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.CalcTaskDistanceImpl <em>Calc Task Distance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.CalcTaskDistanceImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getCalcTaskDistance()
	 * @generated
	 */
	int CALC_TASK_DISTANCE = 21;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.CalcResourceDistanceImpl <em>Calc Resource Distance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.CalcResourceDistanceImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getCalcResourceDistance()
	 * @generated
	 */
	int CALC_RESOURCE_DISTANCE = 23;

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
	 * The feature id for the '<em><b>Strategy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE__STRATEGY = SchedulerPackage.SCHEDULE__STRATEGY;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE__STEP = SchedulerPackage.SCHEDULE__STEP;

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
	 * The operation id for the '<em>Get Task Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE___GET_TASK_LOAD__SHIPMENT = SchedulerPackage.SCHEDULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Task Unload</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE___GET_TASK_UNLOAD__SHIPMENT = SchedulerPackage.SCHEDULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Resource Vehicle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE___GET_RESOURCE_VEHICLE__VEHICLE = SchedulerPackage.SCHEDULE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>To Use Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_OPERATION_COUNT = SchedulerPackage.SCHEDULE_OPERATION_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Feasible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCORE__FEASIBLE = LocalSearchPackage.SCORE__FEASIBLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCORE__DESCRIPTION = LocalSearchPackage.SCORE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Total Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCORE__TOTAL_DISTANCE = LocalSearchPackage.SCORE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Volume Overload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCORE__VOLUME_OVERLOAD = LocalSearchPackage.SCORE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Planned Benefit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCORE__PLANNED_BENEFIT = LocalSearchPackage.SCORE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>To Use Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCORE_FEATURE_COUNT = LocalSearchPackage.SCORE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Better</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCORE___IS_BETTER__SCORE = LocalSearchPackage.SCORE___IS_BETTER__SCORE;

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
	 * The feature id for the '<em><b>Distance From Last</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_RESOURCE__DISTANCE_FROM_LAST = SchedulerPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Total Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_RESOURCE__TOTAL_DISTANCE = SchedulerPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Volume Overload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_RESOURCE__VOLUME_OVERLOAD = SchedulerPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Planned Benefit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_RESOURCE__PLANNED_BENEFIT = SchedulerPackage.RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>To Use Schedule Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_RESOURCE_FEATURE_COUNT = SchedulerPackage.RESOURCE_FEATURE_COUNT + 5;

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
	 * The feature id for the '<em><b>Schedule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_TASK__SCHEDULE = SchedulerPackage.TASK__SCHEDULE;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_TASK__NAME = SchedulerPackage.TASK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_TASK__DESCRIPTION = SchedulerPackage.TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Scheduled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_TASK__SCHEDULED = SchedulerPackage.TASK__SCHEDULED;

	/**
	 * The feature id for the '<em><b>Shipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_TASK__SHIPMENT = SchedulerPackage.TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_TASK__LOCATION_X = SchedulerPackage.TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Location Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_TASK__LOCATION_Y = SchedulerPackage.TASK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Load Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_TASK__LOAD_FACTOR = SchedulerPackage.TASK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_TASK__DISTANCE = SchedulerPackage.TASK_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Distance From Previous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_TASK__DISTANCE_FROM_PREVIOUS = SchedulerPackage.TASK_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Start Volume Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_TASK__START_VOLUME_LOADED = SchedulerPackage.TASK_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>End Volume Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_TASK__END_VOLUME_LOADED = SchedulerPackage.TASK_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Volume Overload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_TASK__VOLUME_OVERLOAD = SchedulerPackage.TASK_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>To Use Schedule Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_TASK_FEATURE_COUNT = SchedulerPackage.TASK_FEATURE_COUNT + 9;

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
	 * The operation id for the '<em>Schedule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_TASK___SCHEDULE__RESOURCE_TASK_TASK = SchedulerPackage.TASK___SCHEDULE__RESOURCE_TASK_TASK;

	/**
	 * The operation id for the '<em>Unschedule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_TASK___UNSCHEDULE = SchedulerPackage.TASK___UNSCHEDULE;

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
	 * The feature id for the '<em><b>Schedule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LOAD_SHIPMENT__SCHEDULE = TO_USE_SCHEDULE_TASK__SCHEDULE;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LOAD_SHIPMENT__NAME = TO_USE_SCHEDULE_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LOAD_SHIPMENT__DESCRIPTION = TO_USE_SCHEDULE_TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Scheduled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LOAD_SHIPMENT__SCHEDULED = TO_USE_SCHEDULE_TASK__SCHEDULED;

	/**
	 * The feature id for the '<em><b>Shipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LOAD_SHIPMENT__SHIPMENT = TO_USE_SCHEDULE_TASK__SHIPMENT;

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
	 * The feature id for the '<em><b>Load Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LOAD_SHIPMENT__LOAD_FACTOR = TO_USE_SCHEDULE_TASK__LOAD_FACTOR;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LOAD_SHIPMENT__DISTANCE = TO_USE_SCHEDULE_TASK__DISTANCE;

	/**
	 * The feature id for the '<em><b>Distance From Previous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LOAD_SHIPMENT__DISTANCE_FROM_PREVIOUS = TO_USE_SCHEDULE_TASK__DISTANCE_FROM_PREVIOUS;

	/**
	 * The feature id for the '<em><b>Start Volume Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LOAD_SHIPMENT__START_VOLUME_LOADED = TO_USE_SCHEDULE_TASK__START_VOLUME_LOADED;

	/**
	 * The feature id for the '<em><b>End Volume Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LOAD_SHIPMENT__END_VOLUME_LOADED = TO_USE_SCHEDULE_TASK__END_VOLUME_LOADED;

	/**
	 * The feature id for the '<em><b>Volume Overload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LOAD_SHIPMENT__VOLUME_OVERLOAD = TO_USE_SCHEDULE_TASK__VOLUME_OVERLOAD;

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
	 * The operation id for the '<em>Schedule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LOAD_SHIPMENT___SCHEDULE__RESOURCE_TASK_TASK = TO_USE_SCHEDULE_TASK___SCHEDULE__RESOURCE_TASK_TASK;

	/**
	 * The operation id for the '<em>Unschedule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LOAD_SHIPMENT___UNSCHEDULE = TO_USE_SCHEDULE_TASK___UNSCHEDULE;

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
	 * The feature id for the '<em><b>Schedule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNLOAD_SHIPMENT__SCHEDULE = TO_USE_SCHEDULE_TASK__SCHEDULE;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNLOAD_SHIPMENT__NAME = TO_USE_SCHEDULE_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNLOAD_SHIPMENT__DESCRIPTION = TO_USE_SCHEDULE_TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Scheduled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNLOAD_SHIPMENT__SCHEDULED = TO_USE_SCHEDULE_TASK__SCHEDULED;

	/**
	 * The feature id for the '<em><b>Shipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNLOAD_SHIPMENT__SHIPMENT = TO_USE_SCHEDULE_TASK__SHIPMENT;

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
	 * The feature id for the '<em><b>Load Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNLOAD_SHIPMENT__LOAD_FACTOR = TO_USE_SCHEDULE_TASK__LOAD_FACTOR;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNLOAD_SHIPMENT__DISTANCE = TO_USE_SCHEDULE_TASK__DISTANCE;

	/**
	 * The feature id for the '<em><b>Distance From Previous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNLOAD_SHIPMENT__DISTANCE_FROM_PREVIOUS = TO_USE_SCHEDULE_TASK__DISTANCE_FROM_PREVIOUS;

	/**
	 * The feature id for the '<em><b>Start Volume Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNLOAD_SHIPMENT__START_VOLUME_LOADED = TO_USE_SCHEDULE_TASK__START_VOLUME_LOADED;

	/**
	 * The feature id for the '<em><b>End Volume Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNLOAD_SHIPMENT__END_VOLUME_LOADED = TO_USE_SCHEDULE_TASK__END_VOLUME_LOADED;

	/**
	 * The feature id for the '<em><b>Volume Overload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNLOAD_SHIPMENT__VOLUME_OVERLOAD = TO_USE_SCHEDULE_TASK__VOLUME_OVERLOAD;

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
	 * The operation id for the '<em>Schedule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNLOAD_SHIPMENT___SCHEDULE__RESOURCE_TASK_TASK = TO_USE_SCHEDULE_TASK___SCHEDULE__RESOURCE_TASK_TASK;

	/**
	 * The operation id for the '<em>Unschedule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNLOAD_SHIPMENT___UNSCHEDULE = TO_USE_SCHEDULE_TASK___UNSCHEDULE;

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
	 * The feature id for the '<em><b>Start Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_ACTION_LOAD_UNLOAD__START_SOLUTION = LocalSearchPackage.ACTION__START_SOLUTION;

	/**
	 * The feature id for the '<em><b>End Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_ACTION_LOAD_UNLOAD__END_SOLUTION = LocalSearchPackage.ACTION__END_SOLUTION;

	/**
	 * The feature id for the '<em><b>End Solution Owned</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_ACTION_LOAD_UNLOAD__END_SOLUTION_OWNED = LocalSearchPackage.ACTION__END_SOLUTION_OWNED;

	/**
	 * The feature id for the '<em><b>Previous Change</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_ACTION_LOAD_UNLOAD__PREVIOUS_CHANGE = LocalSearchPackage.ACTION__PREVIOUS_CHANGE;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_ACTION_LOAD_UNLOAD__LEVEL = LocalSearchPackage.ACTION__LEVEL;

	/**
	 * The feature id for the '<em><b>Solutions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_ACTION_LOAD_UNLOAD__SOLUTIONS = LocalSearchPackage.ACTION__SOLUTIONS;

	/**
	 * The feature id for the '<em><b>Sub Changes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_ACTION_LOAD_UNLOAD__SUB_CHANGES = LocalSearchPackage.ACTION__SUB_CHANGES;

	/**
	 * The feature id for the '<em><b>Current Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_ACTION_LOAD_UNLOAD__CURRENT_SOLUTION = LocalSearchPackage.ACTION__CURRENT_SOLUTION;

	/**
	 * The feature id for the '<em><b>Keep Solutions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_ACTION_LOAD_UNLOAD__KEEP_SOLUTIONS = LocalSearchPackage.ACTION__KEEP_SOLUTIONS;

	/**
	 * The feature id for the '<em><b>New Solution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_ACTION_LOAD_UNLOAD__NEW_SOLUTION = LocalSearchPackage.ACTION__NEW_SOLUTION;

	/**
	 * The feature id for the '<em><b>Super Change</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_ACTION_LOAD_UNLOAD__SUPER_CHANGE = LocalSearchPackage.ACTION__SUPER_CHANGE;

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
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_ACTION_LOAD_UNLOAD__VALID = LocalSearchPackage.ACTION__VALID;

	/**
	 * The feature id for the '<em><b>Valid Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_ACTION_LOAD_UNLOAD__VALID_FEEDBACK = LocalSearchPackage.ACTION__VALID_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Action Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_ACTION_LOAD_UNLOAD__ACTION_NR = LocalSearchPackage.ACTION__ACTION_NR;

	/**
	 * The feature id for the '<em><b>Step</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_ACTION_LOAD_UNLOAD__STEP = LocalSearchPackage.ACTION__STEP;

	/**
	 * The feature id for the '<em><b>Shipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_ACTION_LOAD_UNLOAD__SHIPMENT = LocalSearchPackage.ACTION_FEATURE_COUNT + 0;

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
	 * The operation id for the '<em>Select</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_ACTION_LOAD_UNLOAD___SELECT__MOVE = LocalSearchPackage.ACTION___SELECT__MOVE;

	/**
	 * The number of operations of the '<em>To Use Action Load Unload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_ACTION_LOAD_UNLOAD_OPERATION_COUNT = LocalSearchPackage.ACTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_LOAD_UNLOAD__START_SOLUTION = TO_USE_ACTION_LOAD_UNLOAD__START_SOLUTION;

	/**
	 * The feature id for the '<em><b>End Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_LOAD_UNLOAD__END_SOLUTION = TO_USE_ACTION_LOAD_UNLOAD__END_SOLUTION;

	/**
	 * The feature id for the '<em><b>End Solution Owned</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_LOAD_UNLOAD__END_SOLUTION_OWNED = TO_USE_ACTION_LOAD_UNLOAD__END_SOLUTION_OWNED;

	/**
	 * The feature id for the '<em><b>Previous Change</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_LOAD_UNLOAD__PREVIOUS_CHANGE = TO_USE_ACTION_LOAD_UNLOAD__PREVIOUS_CHANGE;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_LOAD_UNLOAD__LEVEL = TO_USE_ACTION_LOAD_UNLOAD__LEVEL;

	/**
	 * The feature id for the '<em><b>Solutions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_LOAD_UNLOAD__SOLUTIONS = TO_USE_ACTION_LOAD_UNLOAD__SOLUTIONS;

	/**
	 * The feature id for the '<em><b>Sub Changes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_LOAD_UNLOAD__SUB_CHANGES = TO_USE_ACTION_LOAD_UNLOAD__SUB_CHANGES;

	/**
	 * The feature id for the '<em><b>Current Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_LOAD_UNLOAD__CURRENT_SOLUTION = TO_USE_ACTION_LOAD_UNLOAD__CURRENT_SOLUTION;

	/**
	 * The feature id for the '<em><b>Keep Solutions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_LOAD_UNLOAD__KEEP_SOLUTIONS = TO_USE_ACTION_LOAD_UNLOAD__KEEP_SOLUTIONS;

	/**
	 * The feature id for the '<em><b>New Solution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_LOAD_UNLOAD__NEW_SOLUTION = TO_USE_ACTION_LOAD_UNLOAD__NEW_SOLUTION;

	/**
	 * The feature id for the '<em><b>Super Change</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_LOAD_UNLOAD__SUPER_CHANGE = TO_USE_ACTION_LOAD_UNLOAD__SUPER_CHANGE;

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
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_LOAD_UNLOAD__VALID = TO_USE_ACTION_LOAD_UNLOAD__VALID;

	/**
	 * The feature id for the '<em><b>Valid Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_LOAD_UNLOAD__VALID_FEEDBACK = TO_USE_ACTION_LOAD_UNLOAD__VALID_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Action Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_LOAD_UNLOAD__ACTION_NR = TO_USE_ACTION_LOAD_UNLOAD__ACTION_NR;

	/**
	 * The feature id for the '<em><b>Step</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_LOAD_UNLOAD__STEP = TO_USE_ACTION_LOAD_UNLOAD__STEP;

	/**
	 * The feature id for the '<em><b>Shipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_LOAD_UNLOAD__SHIPMENT = TO_USE_ACTION_LOAD_UNLOAD__SHIPMENT;

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
	 * The operation id for the '<em>Select</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_LOAD_UNLOAD___SELECT__MOVE = TO_USE_ACTION_LOAD_UNLOAD___SELECT__MOVE;

	/**
	 * The number of operations of the '<em>To Use Schedule Load Unload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCHEDULE_LOAD_UNLOAD_OPERATION_COUNT = TO_USE_ACTION_LOAD_UNLOAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.LayerScheduleVolumeLoadedImpl <em>Layer Schedule Volume Loaded</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.LayerScheduleVolumeLoadedImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getLayerScheduleVolumeLoaded()
	 * @generated
	 */
	int LAYER_SCHEDULE_VOLUME_LOADED = 24;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.CalcTaskStartVolumeLoadedImpl <em>Calc Task Start Volume Loaded</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.CalcTaskStartVolumeLoadedImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getCalcTaskStartVolumeLoaded()
	 * @generated
	 */
	int CALC_TASK_START_VOLUME_LOADED = 25;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.CalcTaskEndVolumeLoadedImpl <em>Calc Task End Volume Loaded</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.CalcTaskEndVolumeLoadedImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getCalcTaskEndVolumeLoaded()
	 * @generated
	 */
	int CALC_TASK_END_VOLUME_LOADED = 26;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseUnscheduleLoadUnloadImpl <em>To Use Unschedule Load Unload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseUnscheduleLoadUnloadImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getToUseUnscheduleLoadUnload()
	 * @generated
	 */
	int TO_USE_UNSCHEDULE_LOAD_UNLOAD = 12;

	/**
	 * The feature id for the '<em><b>Start Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNSCHEDULE_LOAD_UNLOAD__START_SOLUTION = TO_USE_ACTION_LOAD_UNLOAD__START_SOLUTION;

	/**
	 * The feature id for the '<em><b>End Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNSCHEDULE_LOAD_UNLOAD__END_SOLUTION = TO_USE_ACTION_LOAD_UNLOAD__END_SOLUTION;

	/**
	 * The feature id for the '<em><b>End Solution Owned</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNSCHEDULE_LOAD_UNLOAD__END_SOLUTION_OWNED = TO_USE_ACTION_LOAD_UNLOAD__END_SOLUTION_OWNED;

	/**
	 * The feature id for the '<em><b>Previous Change</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNSCHEDULE_LOAD_UNLOAD__PREVIOUS_CHANGE = TO_USE_ACTION_LOAD_UNLOAD__PREVIOUS_CHANGE;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNSCHEDULE_LOAD_UNLOAD__LEVEL = TO_USE_ACTION_LOAD_UNLOAD__LEVEL;

	/**
	 * The feature id for the '<em><b>Solutions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNSCHEDULE_LOAD_UNLOAD__SOLUTIONS = TO_USE_ACTION_LOAD_UNLOAD__SOLUTIONS;

	/**
	 * The feature id for the '<em><b>Sub Changes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNSCHEDULE_LOAD_UNLOAD__SUB_CHANGES = TO_USE_ACTION_LOAD_UNLOAD__SUB_CHANGES;

	/**
	 * The feature id for the '<em><b>Current Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNSCHEDULE_LOAD_UNLOAD__CURRENT_SOLUTION = TO_USE_ACTION_LOAD_UNLOAD__CURRENT_SOLUTION;

	/**
	 * The feature id for the '<em><b>Keep Solutions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNSCHEDULE_LOAD_UNLOAD__KEEP_SOLUTIONS = TO_USE_ACTION_LOAD_UNLOAD__KEEP_SOLUTIONS;

	/**
	 * The feature id for the '<em><b>New Solution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNSCHEDULE_LOAD_UNLOAD__NEW_SOLUTION = TO_USE_ACTION_LOAD_UNLOAD__NEW_SOLUTION;

	/**
	 * The feature id for the '<em><b>Super Change</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNSCHEDULE_LOAD_UNLOAD__SUPER_CHANGE = TO_USE_ACTION_LOAD_UNLOAD__SUPER_CHANGE;

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
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNSCHEDULE_LOAD_UNLOAD__VALID = TO_USE_ACTION_LOAD_UNLOAD__VALID;

	/**
	 * The feature id for the '<em><b>Valid Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNSCHEDULE_LOAD_UNLOAD__VALID_FEEDBACK = TO_USE_ACTION_LOAD_UNLOAD__VALID_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Action Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNSCHEDULE_LOAD_UNLOAD__ACTION_NR = TO_USE_ACTION_LOAD_UNLOAD__ACTION_NR;

	/**
	 * The feature id for the '<em><b>Step</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNSCHEDULE_LOAD_UNLOAD__STEP = TO_USE_ACTION_LOAD_UNLOAD__STEP;

	/**
	 * The feature id for the '<em><b>Shipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNSCHEDULE_LOAD_UNLOAD__SHIPMENT = TO_USE_ACTION_LOAD_UNLOAD__SHIPMENT;

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
	 * The operation id for the '<em>Select</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNSCHEDULE_LOAD_UNLOAD___SELECT__MOVE = TO_USE_ACTION_LOAD_UNLOAD___SELECT__MOVE;

	/**
	 * The number of operations of the '<em>To Use Unschedule Load Unload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_UNSCHEDULE_LOAD_UNLOAD_OPERATION_COUNT = TO_USE_ACTION_LOAD_UNLOAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ToUsePhaseDestructConstructImpl <em>To Use Phase Destruct Construct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUsePhaseDestructConstructImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getToUsePhaseDestructConstruct()
	 * @generated
	 */
	int TO_USE_PHASE_DESTRUCT_CONSTRUCT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PHASE_DESTRUCT_CONSTRUCT__NAME = LocalSearchPackage.PHASE__NAME;

	/**
	 * The feature id for the '<em><b>Keep Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PHASE_DESTRUCT_CONSTRUCT__KEEP_LEVEL = LocalSearchPackage.PHASE__KEEP_LEVEL;

	/**
	 * The feature id for the '<em><b>Max Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PHASE_DESTRUCT_CONSTRUCT__MAX_STEPS = LocalSearchPackage.PHASE__MAX_STEPS;

	/**
	 * The feature id for the '<em><b>Max Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PHASE_DESTRUCT_CONSTRUCT__MAX_SECONDS = LocalSearchPackage.PHASE__MAX_SECONDS;

	/**
	 * The feature id for the '<em><b>Phase Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PHASE_DESTRUCT_CONSTRUCT__PHASE_START = LocalSearchPackage.PHASE__PHASE_START;

	/**
	 * The feature id for the '<em><b>Phase End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PHASE_DESTRUCT_CONSTRUCT__PHASE_END = LocalSearchPackage.PHASE__PHASE_END;

	/**
	 * The feature id for the '<em><b>Nr Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PHASE_DESTRUCT_CONSTRUCT__NR_STEPS = LocalSearchPackage.PHASE__NR_STEPS;

	/**
	 * The feature id for the '<em><b>Duration Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PHASE_DESTRUCT_CONSTRUCT__DURATION_TOTAL = LocalSearchPackage.PHASE__DURATION_TOTAL;

	/**
	 * The feature id for the '<em><b>Duration Average</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PHASE_DESTRUCT_CONSTRUCT__DURATION_AVERAGE = LocalSearchPackage.PHASE__DURATION_AVERAGE;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PHASE_DESTRUCT_CONSTRUCT__STRATEGY = LocalSearchPackage.PHASE__STRATEGY;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PHASE_DESTRUCT_CONSTRUCT__STEPS = LocalSearchPackage.PHASE__STEPS;

	/**
	 * The feature id for the '<em><b>Destruction Chance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PHASE_DESTRUCT_CONSTRUCT__DESTRUCTION_CHANCE = LocalSearchPackage.PHASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Construction Chance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PHASE_DESTRUCT_CONSTRUCT__CONSTRUCTION_CHANCE = LocalSearchPackage.PHASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>To Use Phase Destruct Construct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PHASE_DESTRUCT_CONSTRUCT_FEATURE_COUNT = LocalSearchPackage.PHASE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Do Phase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PHASE_DESTRUCT_CONSTRUCT___DO_PHASE = LocalSearchPackage.PHASE___DO_PHASE;

	/**
	 * The operation id for the '<em>Do Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PHASE_DESTRUCT_CONSTRUCT___DO_STEP__STEP = LocalSearchPackage.PHASE___DO_STEP__STEP;

	/**
	 * The operation id for the '<em>Do Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PHASE_DESTRUCT_CONSTRUCT___DO_ACTION__STEP_ACTION = LocalSearchPackage.PHASE___DO_ACTION__STEP_ACTION;

	/**
	 * The number of operations of the '<em>To Use Phase Destruct Construct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PHASE_DESTRUCT_CONSTRUCT_OPERATION_COUNT = LocalSearchPackage.PHASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.CalcTaskDistanceFromPreviousImpl <em>Calc Task Distance From Previous</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.CalcTaskDistanceFromPreviousImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getCalcTaskDistanceFromPrevious()
	 * @generated
	 */
	int CALC_TASK_DISTANCE_FROM_PREVIOUS = 20;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.CalcResourceDistanceFromLastImpl <em>Calc Resource Distance From Last</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.CalcResourceDistanceFromLastImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getCalcResourceDistanceFromLast()
	 * @generated
	 */
	int CALC_RESOURCE_DISTANCE_FROM_LAST = 22;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.CalcResourceVolumeOverloadImpl <em>Calc Resource Volume Overload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.CalcResourceVolumeOverloadImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getCalcResourceVolumeOverload()
	 * @generated
	 */
	int CALC_RESOURCE_VOLUME_OVERLOAD = 27;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.LayerSchedulePlannedBenefitImpl <em>Layer Schedule Planned Benefit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.LayerSchedulePlannedBenefitImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getLayerSchedulePlannedBenefit()
	 * @generated
	 */
	int LAYER_SCHEDULE_PLANNED_BENEFIT = 28;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousescheduler.impl.CalcResourcePlannedBenefitImpl <em>Calc Resource Planned Benefit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousescheduler.impl.CalcResourcePlannedBenefitImpl
	 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getCalcResourcePlannedBenefit()
	 * @generated
	 */
	int CALC_RESOURCE_PLANNED_BENEFIT = 29;

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
	int CALC_TASK_DISTANCE_FROM_PREVIOUS__PARENT = CALC_TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE_FROM_PREVIOUS__ANTECEDENTS = CALC_TASK__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE_FROM_PREVIOUS__ANTECEDENTS_SIBLING = CALC_TASK__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE_FROM_PREVIOUS__TOUCHED = CALC_TASK__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE_FROM_PREVIOUS__TOUCHED_CHILDREN = CALC_TASK__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE_FROM_PREVIOUS__TOUCHERS = CALC_TASK__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE_FROM_PREVIOUS__ENABLED = CALC_TASK__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE_FROM_PREVIOUS__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_TASK__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE_FROM_PREVIOUS__TYPE = CALC_TASK__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE_FROM_PREVIOUS__OBJECT = CALC_TASK__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE_FROM_PREVIOUS__INSTANCE = CALC_TASK__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE_FROM_PREVIOUS__DESCRIPTION = CALC_TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE_FROM_PREVIOUS__TOUCHED_PARENT = CALC_TASK__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE_FROM_PREVIOUS__TASK = CALC_TASK__TASK;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE_FROM_PREVIOUS__CONCRETE_PARENT = CALC_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Calc Task Distance From Previous</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE_FROM_PREVIOUS_FEATURE_COUNT = CALC_TASK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE_FROM_PREVIOUS___INIT = CALC_TASK___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE_FROM_PREVIOUS___ENABLE = CALC_TASK___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE_FROM_PREVIOUS___DISABLE = CALC_TASK___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE_FROM_PREVIOUS___RESET = CALC_TASK___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE_FROM_PREVIOUS___TOUCH__EOBJECT = CALC_TASK___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE_FROM_PREVIOUS___UNTOUCH = CALC_TASK___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE_FROM_PREVIOUS___REFRESH_ANTECEDENTS__REFRESHER = CALC_TASK___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE_FROM_PREVIOUS___REFRESH_THIS__REFRESHER = CALC_TASK___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE_FROM_PREVIOUS___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_TASK___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE_FROM_PREVIOUS___REFRESH = CALC_TASK___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE_FROM_PREVIOUS___REFRESH__REFRESHER = CALC_TASK___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE_FROM_PREVIOUS___DO_GET_ANTECEDENTS = CALC_TASK___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE_FROM_PREVIOUS___DO_GET_PARENT = CALC_TASK___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE_FROM_PREVIOUS___DO_REFRESH = CALC_TASK___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE_FROM_PREVIOUS___DO_REFRESH__EOBJECT = CALC_TASK___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE_FROM_PREVIOUS___GET_SCOPE = CALC_TASK___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE_FROM_PREVIOUS___GET_FACTORY_ID = CALC_TASK___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE_FROM_PREVIOUS___DO_GET_BINDINGS = CALC_TASK___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE_FROM_PREVIOUS___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_TASK___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Task Distance From Previous</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_DISTANCE_FROM_PREVIOUS_OPERATION_COUNT = CALC_TASK_OPERATION_COUNT + 0;

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
	int CALC_RESOURCE_DISTANCE_FROM_LAST__PARENT = CALC_RESOURCE__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE_FROM_LAST__ANTECEDENTS = CALC_RESOURCE__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE_FROM_LAST__ANTECEDENTS_SIBLING = CALC_RESOURCE__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE_FROM_LAST__TOUCHED = CALC_RESOURCE__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE_FROM_LAST__TOUCHED_CHILDREN = CALC_RESOURCE__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE_FROM_LAST__TOUCHERS = CALC_RESOURCE__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE_FROM_LAST__ENABLED = CALC_RESOURCE__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE_FROM_LAST__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_RESOURCE__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE_FROM_LAST__TYPE = CALC_RESOURCE__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE_FROM_LAST__OBJECT = CALC_RESOURCE__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE_FROM_LAST__INSTANCE = CALC_RESOURCE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE_FROM_LAST__DESCRIPTION = CALC_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE_FROM_LAST__TOUCHED_PARENT = CALC_RESOURCE__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE_FROM_LAST__RESOURCE = CALC_RESOURCE__RESOURCE;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE_FROM_LAST__CONCRETE_PARENT = CALC_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Calc Resource Distance From Last</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE_FROM_LAST_FEATURE_COUNT = CALC_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE_FROM_LAST___INIT = CALC_RESOURCE___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE_FROM_LAST___ENABLE = CALC_RESOURCE___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE_FROM_LAST___DISABLE = CALC_RESOURCE___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE_FROM_LAST___RESET = CALC_RESOURCE___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE_FROM_LAST___TOUCH__EOBJECT = CALC_RESOURCE___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE_FROM_LAST___UNTOUCH = CALC_RESOURCE___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE_FROM_LAST___REFRESH_ANTECEDENTS__REFRESHER = CALC_RESOURCE___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE_FROM_LAST___REFRESH_THIS__REFRESHER = CALC_RESOURCE___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE_FROM_LAST___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_RESOURCE___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE_FROM_LAST___REFRESH = CALC_RESOURCE___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE_FROM_LAST___REFRESH__REFRESHER = CALC_RESOURCE___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE_FROM_LAST___DO_GET_ANTECEDENTS = CALC_RESOURCE___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE_FROM_LAST___DO_GET_PARENT = CALC_RESOURCE___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE_FROM_LAST___DO_REFRESH = CALC_RESOURCE___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE_FROM_LAST___DO_REFRESH__EOBJECT = CALC_RESOURCE___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE_FROM_LAST___GET_SCOPE = CALC_RESOURCE___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE_FROM_LAST___GET_FACTORY_ID = CALC_RESOURCE___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE_FROM_LAST___DO_GET_BINDINGS = CALC_RESOURCE___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE_FROM_LAST___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_RESOURCE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Resource Distance From Last</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_DISTANCE_FROM_LAST_OPERATION_COUNT = CALC_RESOURCE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_VOLUME_LOADED__PARENT = CALC_SCHEDULE__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_VOLUME_LOADED__ANTECEDENTS = CALC_SCHEDULE__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_VOLUME_LOADED__ANTECEDENTS_SIBLING = CALC_SCHEDULE__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_VOLUME_LOADED__TOUCHED = CALC_SCHEDULE__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_VOLUME_LOADED__TOUCHED_CHILDREN = CALC_SCHEDULE__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_VOLUME_LOADED__TOUCHERS = CALC_SCHEDULE__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_VOLUME_LOADED__ENABLED = CALC_SCHEDULE__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_VOLUME_LOADED__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_SCHEDULE__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_VOLUME_LOADED__TYPE = CALC_SCHEDULE__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_VOLUME_LOADED__OBJECT = CALC_SCHEDULE__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_VOLUME_LOADED__INSTANCE = CALC_SCHEDULE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_VOLUME_LOADED__DESCRIPTION = CALC_SCHEDULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_VOLUME_LOADED__TOUCHED_PARENT = CALC_SCHEDULE__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_VOLUME_LOADED__SCHEDULE = CALC_SCHEDULE__SCHEDULE;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_VOLUME_LOADED__CONCRETE_PARENT = CALC_SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Layer Schedule Volume Loaded</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_VOLUME_LOADED_FEATURE_COUNT = CALC_SCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_VOLUME_LOADED___INIT = CALC_SCHEDULE___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_VOLUME_LOADED___ENABLE = CALC_SCHEDULE___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_VOLUME_LOADED___DISABLE = CALC_SCHEDULE___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_VOLUME_LOADED___RESET = CALC_SCHEDULE___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_VOLUME_LOADED___TOUCH__EOBJECT = CALC_SCHEDULE___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_VOLUME_LOADED___UNTOUCH = CALC_SCHEDULE___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_VOLUME_LOADED___REFRESH_ANTECEDENTS__REFRESHER = CALC_SCHEDULE___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_VOLUME_LOADED___REFRESH_THIS__REFRESHER = CALC_SCHEDULE___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_VOLUME_LOADED___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_SCHEDULE___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_VOLUME_LOADED___REFRESH = CALC_SCHEDULE___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_VOLUME_LOADED___REFRESH__REFRESHER = CALC_SCHEDULE___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_VOLUME_LOADED___DO_GET_ANTECEDENTS = CALC_SCHEDULE___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_VOLUME_LOADED___DO_GET_PARENT = CALC_SCHEDULE___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_VOLUME_LOADED___DO_REFRESH = CALC_SCHEDULE___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_VOLUME_LOADED___DO_REFRESH__EOBJECT = CALC_SCHEDULE___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_VOLUME_LOADED___GET_SCOPE = CALC_SCHEDULE___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_VOLUME_LOADED___GET_FACTORY_ID = CALC_SCHEDULE___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_VOLUME_LOADED___DO_GET_BINDINGS = CALC_SCHEDULE___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_VOLUME_LOADED___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_SCHEDULE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Layer Schedule Volume Loaded</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_VOLUME_LOADED_OPERATION_COUNT = CALC_SCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START_VOLUME_LOADED__PARENT = CALC_TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START_VOLUME_LOADED__ANTECEDENTS = CALC_TASK__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START_VOLUME_LOADED__ANTECEDENTS_SIBLING = CALC_TASK__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START_VOLUME_LOADED__TOUCHED = CALC_TASK__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START_VOLUME_LOADED__TOUCHED_CHILDREN = CALC_TASK__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START_VOLUME_LOADED__TOUCHERS = CALC_TASK__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START_VOLUME_LOADED__ENABLED = CALC_TASK__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START_VOLUME_LOADED__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_TASK__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START_VOLUME_LOADED__TYPE = CALC_TASK__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START_VOLUME_LOADED__OBJECT = CALC_TASK__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START_VOLUME_LOADED__INSTANCE = CALC_TASK__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START_VOLUME_LOADED__DESCRIPTION = CALC_TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START_VOLUME_LOADED__TOUCHED_PARENT = CALC_TASK__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START_VOLUME_LOADED__TASK = CALC_TASK__TASK;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START_VOLUME_LOADED__CONCRETE_PARENT = CALC_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Calc Task Start Volume Loaded</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START_VOLUME_LOADED_FEATURE_COUNT = CALC_TASK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START_VOLUME_LOADED___INIT = CALC_TASK___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START_VOLUME_LOADED___ENABLE = CALC_TASK___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START_VOLUME_LOADED___DISABLE = CALC_TASK___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START_VOLUME_LOADED___RESET = CALC_TASK___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START_VOLUME_LOADED___TOUCH__EOBJECT = CALC_TASK___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START_VOLUME_LOADED___UNTOUCH = CALC_TASK___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START_VOLUME_LOADED___REFRESH_ANTECEDENTS__REFRESHER = CALC_TASK___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START_VOLUME_LOADED___REFRESH_THIS__REFRESHER = CALC_TASK___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START_VOLUME_LOADED___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_TASK___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START_VOLUME_LOADED___REFRESH = CALC_TASK___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START_VOLUME_LOADED___REFRESH__REFRESHER = CALC_TASK___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START_VOLUME_LOADED___DO_GET_ANTECEDENTS = CALC_TASK___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START_VOLUME_LOADED___DO_GET_PARENT = CALC_TASK___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START_VOLUME_LOADED___DO_REFRESH = CALC_TASK___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START_VOLUME_LOADED___DO_REFRESH__EOBJECT = CALC_TASK___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START_VOLUME_LOADED___GET_SCOPE = CALC_TASK___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START_VOLUME_LOADED___GET_FACTORY_ID = CALC_TASK___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START_VOLUME_LOADED___DO_GET_BINDINGS = CALC_TASK___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START_VOLUME_LOADED___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_TASK___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Task Start Volume Loaded</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START_VOLUME_LOADED_OPERATION_COUNT = CALC_TASK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END_VOLUME_LOADED__PARENT = CALC_TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END_VOLUME_LOADED__ANTECEDENTS = CALC_TASK__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END_VOLUME_LOADED__ANTECEDENTS_SIBLING = CALC_TASK__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END_VOLUME_LOADED__TOUCHED = CALC_TASK__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END_VOLUME_LOADED__TOUCHED_CHILDREN = CALC_TASK__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END_VOLUME_LOADED__TOUCHERS = CALC_TASK__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END_VOLUME_LOADED__ENABLED = CALC_TASK__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END_VOLUME_LOADED__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_TASK__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END_VOLUME_LOADED__TYPE = CALC_TASK__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END_VOLUME_LOADED__OBJECT = CALC_TASK__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END_VOLUME_LOADED__INSTANCE = CALC_TASK__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END_VOLUME_LOADED__DESCRIPTION = CALC_TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END_VOLUME_LOADED__TOUCHED_PARENT = CALC_TASK__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END_VOLUME_LOADED__TASK = CALC_TASK__TASK;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END_VOLUME_LOADED__CONCRETE_PARENT = CALC_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Calc Task End Volume Loaded</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END_VOLUME_LOADED_FEATURE_COUNT = CALC_TASK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END_VOLUME_LOADED___INIT = CALC_TASK___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END_VOLUME_LOADED___ENABLE = CALC_TASK___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END_VOLUME_LOADED___DISABLE = CALC_TASK___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END_VOLUME_LOADED___RESET = CALC_TASK___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END_VOLUME_LOADED___TOUCH__EOBJECT = CALC_TASK___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END_VOLUME_LOADED___UNTOUCH = CALC_TASK___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END_VOLUME_LOADED___REFRESH_ANTECEDENTS__REFRESHER = CALC_TASK___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END_VOLUME_LOADED___REFRESH_THIS__REFRESHER = CALC_TASK___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END_VOLUME_LOADED___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_TASK___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END_VOLUME_LOADED___REFRESH = CALC_TASK___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END_VOLUME_LOADED___REFRESH__REFRESHER = CALC_TASK___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END_VOLUME_LOADED___DO_GET_ANTECEDENTS = CALC_TASK___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END_VOLUME_LOADED___DO_GET_PARENT = CALC_TASK___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END_VOLUME_LOADED___DO_REFRESH = CALC_TASK___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END_VOLUME_LOADED___DO_REFRESH__EOBJECT = CALC_TASK___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END_VOLUME_LOADED___GET_SCOPE = CALC_TASK___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END_VOLUME_LOADED___GET_FACTORY_ID = CALC_TASK___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END_VOLUME_LOADED___DO_GET_BINDINGS = CALC_TASK___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END_VOLUME_LOADED___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_TASK___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Task End Volume Loaded</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END_VOLUME_LOADED_OPERATION_COUNT = CALC_TASK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_VOLUME_OVERLOAD__PARENT = CALC_RESOURCE__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_VOLUME_OVERLOAD__ANTECEDENTS = CALC_RESOURCE__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_VOLUME_OVERLOAD__ANTECEDENTS_SIBLING = CALC_RESOURCE__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_VOLUME_OVERLOAD__TOUCHED = CALC_RESOURCE__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_VOLUME_OVERLOAD__TOUCHED_CHILDREN = CALC_RESOURCE__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_VOLUME_OVERLOAD__TOUCHERS = CALC_RESOURCE__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_VOLUME_OVERLOAD__ENABLED = CALC_RESOURCE__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_VOLUME_OVERLOAD__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_RESOURCE__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_VOLUME_OVERLOAD__TYPE = CALC_RESOURCE__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_VOLUME_OVERLOAD__OBJECT = CALC_RESOURCE__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_VOLUME_OVERLOAD__INSTANCE = CALC_RESOURCE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_VOLUME_OVERLOAD__DESCRIPTION = CALC_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_VOLUME_OVERLOAD__TOUCHED_PARENT = CALC_RESOURCE__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_VOLUME_OVERLOAD__RESOURCE = CALC_RESOURCE__RESOURCE;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_VOLUME_OVERLOAD__CONCRETE_PARENT = CALC_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Calc Resource Volume Overload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_VOLUME_OVERLOAD_FEATURE_COUNT = CALC_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_VOLUME_OVERLOAD___INIT = CALC_RESOURCE___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_VOLUME_OVERLOAD___ENABLE = CALC_RESOURCE___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_VOLUME_OVERLOAD___DISABLE = CALC_RESOURCE___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_VOLUME_OVERLOAD___RESET = CALC_RESOURCE___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_VOLUME_OVERLOAD___TOUCH__EOBJECT = CALC_RESOURCE___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_VOLUME_OVERLOAD___UNTOUCH = CALC_RESOURCE___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_VOLUME_OVERLOAD___REFRESH_ANTECEDENTS__REFRESHER = CALC_RESOURCE___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_VOLUME_OVERLOAD___REFRESH_THIS__REFRESHER = CALC_RESOURCE___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_VOLUME_OVERLOAD___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_RESOURCE___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_VOLUME_OVERLOAD___REFRESH = CALC_RESOURCE___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_VOLUME_OVERLOAD___REFRESH__REFRESHER = CALC_RESOURCE___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_VOLUME_OVERLOAD___DO_GET_ANTECEDENTS = CALC_RESOURCE___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_VOLUME_OVERLOAD___DO_GET_PARENT = CALC_RESOURCE___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_VOLUME_OVERLOAD___DO_REFRESH = CALC_RESOURCE___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_VOLUME_OVERLOAD___DO_REFRESH__EOBJECT = CALC_RESOURCE___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_VOLUME_OVERLOAD___GET_SCOPE = CALC_RESOURCE___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_VOLUME_OVERLOAD___GET_FACTORY_ID = CALC_RESOURCE___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_VOLUME_OVERLOAD___DO_GET_BINDINGS = CALC_RESOURCE___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_VOLUME_OVERLOAD___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_RESOURCE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Resource Volume Overload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_VOLUME_OVERLOAD_OPERATION_COUNT = CALC_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_PLANNED_BENEFIT__PARENT = CALC_SCHEDULE__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_PLANNED_BENEFIT__ANTECEDENTS = CALC_SCHEDULE__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_PLANNED_BENEFIT__ANTECEDENTS_SIBLING = CALC_SCHEDULE__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_PLANNED_BENEFIT__TOUCHED = CALC_SCHEDULE__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_PLANNED_BENEFIT__TOUCHED_CHILDREN = CALC_SCHEDULE__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_PLANNED_BENEFIT__TOUCHERS = CALC_SCHEDULE__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_PLANNED_BENEFIT__ENABLED = CALC_SCHEDULE__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_PLANNED_BENEFIT__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_SCHEDULE__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_PLANNED_BENEFIT__TYPE = CALC_SCHEDULE__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_PLANNED_BENEFIT__OBJECT = CALC_SCHEDULE__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_PLANNED_BENEFIT__INSTANCE = CALC_SCHEDULE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_PLANNED_BENEFIT__DESCRIPTION = CALC_SCHEDULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_PLANNED_BENEFIT__TOUCHED_PARENT = CALC_SCHEDULE__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_PLANNED_BENEFIT__SCHEDULE = CALC_SCHEDULE__SCHEDULE;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_PLANNED_BENEFIT__CONCRETE_PARENT = CALC_SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Layer Schedule Planned Benefit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_PLANNED_BENEFIT_FEATURE_COUNT = CALC_SCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_PLANNED_BENEFIT___INIT = CALC_SCHEDULE___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_PLANNED_BENEFIT___ENABLE = CALC_SCHEDULE___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_PLANNED_BENEFIT___DISABLE = CALC_SCHEDULE___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_PLANNED_BENEFIT___RESET = CALC_SCHEDULE___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_PLANNED_BENEFIT___TOUCH__EOBJECT = CALC_SCHEDULE___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_PLANNED_BENEFIT___UNTOUCH = CALC_SCHEDULE___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_PLANNED_BENEFIT___REFRESH_ANTECEDENTS__REFRESHER = CALC_SCHEDULE___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_PLANNED_BENEFIT___REFRESH_THIS__REFRESHER = CALC_SCHEDULE___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_PLANNED_BENEFIT___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_SCHEDULE___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_PLANNED_BENEFIT___REFRESH = CALC_SCHEDULE___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_PLANNED_BENEFIT___REFRESH__REFRESHER = CALC_SCHEDULE___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_PLANNED_BENEFIT___DO_GET_ANTECEDENTS = CALC_SCHEDULE___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_PLANNED_BENEFIT___DO_GET_PARENT = CALC_SCHEDULE___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_PLANNED_BENEFIT___DO_REFRESH = CALC_SCHEDULE___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_PLANNED_BENEFIT___DO_REFRESH__EOBJECT = CALC_SCHEDULE___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_PLANNED_BENEFIT___GET_SCOPE = CALC_SCHEDULE___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_PLANNED_BENEFIT___GET_FACTORY_ID = CALC_SCHEDULE___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_PLANNED_BENEFIT___DO_GET_BINDINGS = CALC_SCHEDULE___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_PLANNED_BENEFIT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_SCHEDULE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Layer Schedule Planned Benefit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SCHEDULE_PLANNED_BENEFIT_OPERATION_COUNT = CALC_SCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_PLANNED_BENEFIT__PARENT = CALC_RESOURCE__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_PLANNED_BENEFIT__ANTECEDENTS = CALC_RESOURCE__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_PLANNED_BENEFIT__ANTECEDENTS_SIBLING = CALC_RESOURCE__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_PLANNED_BENEFIT__TOUCHED = CALC_RESOURCE__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_PLANNED_BENEFIT__TOUCHED_CHILDREN = CALC_RESOURCE__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_PLANNED_BENEFIT__TOUCHERS = CALC_RESOURCE__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_PLANNED_BENEFIT__ENABLED = CALC_RESOURCE__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_PLANNED_BENEFIT__OBJECT_WITH_PROPAGATOR_FUNCTIONS = CALC_RESOURCE__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_PLANNED_BENEFIT__TYPE = CALC_RESOURCE__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_PLANNED_BENEFIT__OBJECT = CALC_RESOURCE__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_PLANNED_BENEFIT__INSTANCE = CALC_RESOURCE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_PLANNED_BENEFIT__DESCRIPTION = CALC_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_PLANNED_BENEFIT__TOUCHED_PARENT = CALC_RESOURCE__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_PLANNED_BENEFIT__RESOURCE = CALC_RESOURCE__RESOURCE;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_PLANNED_BENEFIT__CONCRETE_PARENT = CALC_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Calc Resource Planned Benefit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_PLANNED_BENEFIT_FEATURE_COUNT = CALC_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_PLANNED_BENEFIT___INIT = CALC_RESOURCE___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_PLANNED_BENEFIT___ENABLE = CALC_RESOURCE___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_PLANNED_BENEFIT___DISABLE = CALC_RESOURCE___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_PLANNED_BENEFIT___RESET = CALC_RESOURCE___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_PLANNED_BENEFIT___TOUCH__EOBJECT = CALC_RESOURCE___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_PLANNED_BENEFIT___UNTOUCH = CALC_RESOURCE___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_PLANNED_BENEFIT___REFRESH_ANTECEDENTS__REFRESHER = CALC_RESOURCE___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_PLANNED_BENEFIT___REFRESH_THIS__REFRESHER = CALC_RESOURCE___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_PLANNED_BENEFIT___REFRESH_CHILDREN_AND_THIS__REFRESHER = CALC_RESOURCE___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_PLANNED_BENEFIT___REFRESH = CALC_RESOURCE___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_PLANNED_BENEFIT___REFRESH__REFRESHER = CALC_RESOURCE___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_PLANNED_BENEFIT___DO_GET_ANTECEDENTS = CALC_RESOURCE___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_PLANNED_BENEFIT___DO_GET_PARENT = CALC_RESOURCE___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_PLANNED_BENEFIT___DO_REFRESH = CALC_RESOURCE___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_PLANNED_BENEFIT___DO_REFRESH__EOBJECT = CALC_RESOURCE___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_PLANNED_BENEFIT___GET_SCOPE = CALC_RESOURCE___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_PLANNED_BENEFIT___GET_FACTORY_ID = CALC_RESOURCE___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_PLANNED_BENEFIT___DO_GET_BINDINGS = CALC_RESOURCE___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_PLANNED_BENEFIT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = CALC_RESOURCE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Calc Resource Planned Benefit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_RESOURCE_PLANNED_BENEFIT_OPERATION_COUNT = CALC_RESOURCE_OPERATION_COUNT + 0;

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
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousescheduler.Vehicle#getMaxVolumeLoaded <em>Max Volume Loaded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Volume Loaded</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.Vehicle#getMaxVolumeLoaded()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_MaxVolumeLoaded();

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
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousescheduler.ToUseScore#isVolumeOverload <em>Volume Overload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume Overload</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseScore#isVolumeOverload()
	 * @see #getToUseScore()
	 * @generated
	 */
	EAttribute getToUseScore_VolumeOverload();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousescheduler.ToUseScore#getPlannedBenefit <em>Planned Benefit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Planned Benefit</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseScore#getPlannedBenefit()
	 * @see #getToUseScore()
	 * @generated
	 */
	EAttribute getToUseScore_PlannedBenefit();

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
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousescheduler.Shipment#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.Shipment#getVolume()
	 * @see #getShipment()
	 * @generated
	 */
	EAttribute getShipment_Volume();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousescheduler.Shipment#getPlannedBenefit <em>Planned Benefit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Planned Benefit</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.Shipment#getPlannedBenefit()
	 * @see #getShipment()
	 * @generated
	 */
	EAttribute getShipment_PlannedBenefit();

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
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask#getDistanceFromPrevious <em>Distance From Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance From Previous</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask#getDistanceFromPrevious()
	 * @see #getToUseScheduleTask()
	 * @generated
	 */
	EAttribute getToUseScheduleTask_DistanceFromPrevious();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask#getStartVolumeLoaded <em>Start Volume Loaded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Volume Loaded</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask#getStartVolumeLoaded()
	 * @see #getToUseScheduleTask()
	 * @generated
	 */
	EAttribute getToUseScheduleTask_StartVolumeLoaded();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask#getEndVolumeLoaded <em>End Volume Loaded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Volume Loaded</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask#getEndVolumeLoaded()
	 * @see #getToUseScheduleTask()
	 * @generated
	 */
	EAttribute getToUseScheduleTask_EndVolumeLoaded();

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
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask#getLoadFactor <em>Load Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load Factor</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask#getLoadFactor()
	 * @see #getToUseScheduleTask()
	 * @generated
	 */
	EAttribute getToUseScheduleTask_LoadFactor();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask#isVolumeOverload <em>Volume Overload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume Overload</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask#isVolumeOverload()
	 * @see #getToUseScheduleTask()
	 * @generated
	 */
	EAttribute getToUseScheduleTask_VolumeOverload();

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
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource#getDistanceFromLast <em>Distance From Last</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance From Last</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource#getDistanceFromLast()
	 * @see #getToUseScheduleResource()
	 * @generated
	 */
	EAttribute getToUseScheduleResource_DistanceFromLast();

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
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource#isVolumeOverload <em>Volume Overload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume Overload</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource#isVolumeOverload()
	 * @see #getToUseScheduleResource()
	 * @generated
	 */
	EAttribute getToUseScheduleResource_VolumeOverload();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource#getPlannedBenefit <em>Planned Benefit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Planned Benefit</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource#getPlannedBenefit()
	 * @see #getToUseScheduleResource()
	 * @generated
	 */
	EAttribute getToUseScheduleResource_PlannedBenefit();

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
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousescheduler.CalcTaskDistanceFromPrevious <em>Calc Task Distance From Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Task Distance From Previous</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.CalcTaskDistanceFromPrevious
	 * @generated
	 */
	EClass getCalcTaskDistanceFromPrevious();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousescheduler.CalcTaskDistanceFromPrevious#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.CalcTaskDistanceFromPrevious#getConcreteParent()
	 * @see #getCalcTaskDistanceFromPrevious()
	 * @generated
	 */
	EReference getCalcTaskDistanceFromPrevious_ConcreteParent();

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
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousescheduler.CalcResourceDistanceFromLast <em>Calc Resource Distance From Last</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Resource Distance From Last</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.CalcResourceDistanceFromLast
	 * @generated
	 */
	EClass getCalcResourceDistanceFromLast();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousescheduler.CalcResourceDistanceFromLast#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.CalcResourceDistanceFromLast#getConcreteParent()
	 * @see #getCalcResourceDistanceFromLast()
	 * @generated
	 */
	EReference getCalcResourceDistanceFromLast_ConcreteParent();

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
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousescheduler.LayerScheduleVolumeLoaded <em>Layer Schedule Volume Loaded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer Schedule Volume Loaded</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.LayerScheduleVolumeLoaded
	 * @generated
	 */
	EClass getLayerScheduleVolumeLoaded();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousescheduler.LayerScheduleVolumeLoaded#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.LayerScheduleVolumeLoaded#getConcreteParent()
	 * @see #getLayerScheduleVolumeLoaded()
	 * @generated
	 */
	EReference getLayerScheduleVolumeLoaded_ConcreteParent();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousescheduler.CalcResourceVolumeOverload <em>Calc Resource Volume Overload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Resource Volume Overload</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.CalcResourceVolumeOverload
	 * @generated
	 */
	EClass getCalcResourceVolumeOverload();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousescheduler.CalcResourceVolumeOverload#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.CalcResourceVolumeOverload#getConcreteParent()
	 * @see #getCalcResourceVolumeOverload()
	 * @generated
	 */
	EReference getCalcResourceVolumeOverload_ConcreteParent();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousescheduler.LayerSchedulePlannedBenefit <em>Layer Schedule Planned Benefit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer Schedule Planned Benefit</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.LayerSchedulePlannedBenefit
	 * @generated
	 */
	EClass getLayerSchedulePlannedBenefit();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousescheduler.LayerSchedulePlannedBenefit#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.LayerSchedulePlannedBenefit#getConcreteParent()
	 * @see #getLayerSchedulePlannedBenefit()
	 * @generated
	 */
	EReference getLayerSchedulePlannedBenefit_ConcreteParent();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousescheduler.CalcResourcePlannedBenefit <em>Calc Resource Planned Benefit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Resource Planned Benefit</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.CalcResourcePlannedBenefit
	 * @generated
	 */
	EClass getCalcResourcePlannedBenefit();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousescheduler.CalcResourcePlannedBenefit#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.CalcResourcePlannedBenefit#getConcreteParent()
	 * @see #getCalcResourcePlannedBenefit()
	 * @generated
	 */
	EReference getCalcResourcePlannedBenefit_ConcreteParent();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousescheduler.CalcTaskStartVolumeLoaded <em>Calc Task Start Volume Loaded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Task Start Volume Loaded</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.CalcTaskStartVolumeLoaded
	 * @generated
	 */
	EClass getCalcTaskStartVolumeLoaded();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousescheduler.CalcTaskStartVolumeLoaded#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.CalcTaskStartVolumeLoaded#getConcreteParent()
	 * @see #getCalcTaskStartVolumeLoaded()
	 * @generated
	 */
	EReference getCalcTaskStartVolumeLoaded_ConcreteParent();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousescheduler.CalcTaskEndVolumeLoaded <em>Calc Task End Volume Loaded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Task End Volume Loaded</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.CalcTaskEndVolumeLoaded
	 * @generated
	 */
	EClass getCalcTaskEndVolumeLoaded();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousescheduler.CalcTaskEndVolumeLoaded#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.CalcTaskEndVolumeLoaded#getConcreteParent()
	 * @see #getCalcTaskEndVolumeLoaded()
	 * @generated
	 */
	EReference getCalcTaskEndVolumeLoaded_ConcreteParent();

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
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousescheduler.ToUsePhaseDestructConstruct <em>To Use Phase Destruct Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Use Phase Destruct Construct</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUsePhaseDestructConstruct
	 * @generated
	 */
	EClass getToUsePhaseDestructConstruct();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousescheduler.ToUsePhaseDestructConstruct#getDestructionChance <em>Destruction Chance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destruction Chance</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUsePhaseDestructConstruct#getDestructionChance()
	 * @see #getToUsePhaseDestructConstruct()
	 * @generated
	 */
	EAttribute getToUsePhaseDestructConstruct_DestructionChance();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousescheduler.ToUsePhaseDestructConstruct#getConstructionChance <em>Construction Chance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Construction Chance</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUsePhaseDestructConstruct#getConstructionChance()
	 * @see #getToUsePhaseDestructConstruct()
	 * @generated
	 */
	EAttribute getToUsePhaseDestructConstruct_ConstructionChance();

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
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousescheduler.ToUseActionLoadUnload#getShipment <em>Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment</em>'.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseActionLoadUnload#getShipment()
	 * @see #getToUseActionLoadUnload()
	 * @generated
	 */
	EReference getToUseActionLoadUnload_Shipment();

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
	 * Returns the meta object for the '{@link com.misc.touse.moplaf.tousescheduler.ToUseSchedule#getTaskLoad(com.misc.touse.moplaf.tousescheduler.Shipment) <em>Get Task Load</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Task Load</em>' operation.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedule#getTaskLoad(com.misc.touse.moplaf.tousescheduler.Shipment)
	 * @generated
	 */
	EOperation getToUseSchedule__GetTaskLoad__Shipment();

	/**
	 * Returns the meta object for the '{@link com.misc.touse.moplaf.tousescheduler.ToUseSchedule#getTaskUnload(com.misc.touse.moplaf.tousescheduler.Shipment) <em>Get Task Unload</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Task Unload</em>' operation.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedule#getTaskUnload(com.misc.touse.moplaf.tousescheduler.Shipment)
	 * @generated
	 */
	EOperation getToUseSchedule__GetTaskUnload__Shipment();

	/**
	 * Returns the meta object for the '{@link com.misc.touse.moplaf.tousescheduler.ToUseSchedule#getResourceVehicle(com.misc.touse.moplaf.tousescheduler.Vehicle) <em>Get Resource Vehicle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Resource Vehicle</em>' operation.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedule#getResourceVehicle(com.misc.touse.moplaf.tousescheduler.Vehicle)
	 * @generated
	 */
	EOperation getToUseSchedule__GetResourceVehicle__Vehicle();

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
		 * The meta object literal for the '<em><b>Max Volume Loaded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__MAX_VOLUME_LOADED = eINSTANCE.getVehicle_MaxVolumeLoaded();

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
		 * The meta object literal for the '<em><b>Volume Overload</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_USE_SCORE__VOLUME_OVERLOAD = eINSTANCE.getToUseScore_VolumeOverload();

		/**
		 * The meta object literal for the '<em><b>Planned Benefit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_USE_SCORE__PLANNED_BENEFIT = eINSTANCE.getToUseScore_PlannedBenefit();

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
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT__VOLUME = eINSTANCE.getShipment_Volume();

		/**
		 * The meta object literal for the '<em><b>Planned Benefit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT__PLANNED_BENEFIT = eINSTANCE.getShipment_PlannedBenefit();

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
		 * The meta object literal for the '<em><b>Distance From Previous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_USE_SCHEDULE_TASK__DISTANCE_FROM_PREVIOUS = eINSTANCE.getToUseScheduleTask_DistanceFromPrevious();

		/**
		 * The meta object literal for the '<em><b>Start Volume Loaded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_USE_SCHEDULE_TASK__START_VOLUME_LOADED = eINSTANCE.getToUseScheduleTask_StartVolumeLoaded();

		/**
		 * The meta object literal for the '<em><b>End Volume Loaded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_USE_SCHEDULE_TASK__END_VOLUME_LOADED = eINSTANCE.getToUseScheduleTask_EndVolumeLoaded();

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
		 * The meta object literal for the '<em><b>Load Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_USE_SCHEDULE_TASK__LOAD_FACTOR = eINSTANCE.getToUseScheduleTask_LoadFactor();

		/**
		 * The meta object literal for the '<em><b>Volume Overload</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_USE_SCHEDULE_TASK__VOLUME_OVERLOAD = eINSTANCE.getToUseScheduleTask_VolumeOverload();

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
		 * The meta object literal for the '<em><b>Distance From Last</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_USE_SCHEDULE_RESOURCE__DISTANCE_FROM_LAST = eINSTANCE.getToUseScheduleResource_DistanceFromLast();

		/**
		 * The meta object literal for the '<em><b>Total Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_USE_SCHEDULE_RESOURCE__TOTAL_DISTANCE = eINSTANCE.getToUseScheduleResource_TotalDistance();

		/**
		 * The meta object literal for the '<em><b>Volume Overload</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_USE_SCHEDULE_RESOURCE__VOLUME_OVERLOAD = eINSTANCE.getToUseScheduleResource_VolumeOverload();

		/**
		 * The meta object literal for the '<em><b>Planned Benefit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_USE_SCHEDULE_RESOURCE__PLANNED_BENEFIT = eINSTANCE.getToUseScheduleResource_PlannedBenefit();

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
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousescheduler.impl.CalcTaskDistanceFromPreviousImpl <em>Calc Task Distance From Previous</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousescheduler.impl.CalcTaskDistanceFromPreviousImpl
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getCalcTaskDistanceFromPrevious()
		 * @generated
		 */
		EClass CALC_TASK_DISTANCE_FROM_PREVIOUS = eINSTANCE.getCalcTaskDistanceFromPrevious();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_TASK_DISTANCE_FROM_PREVIOUS__CONCRETE_PARENT = eINSTANCE.getCalcTaskDistanceFromPrevious_ConcreteParent();

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
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousescheduler.impl.CalcResourceDistanceFromLastImpl <em>Calc Resource Distance From Last</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousescheduler.impl.CalcResourceDistanceFromLastImpl
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getCalcResourceDistanceFromLast()
		 * @generated
		 */
		EClass CALC_RESOURCE_DISTANCE_FROM_LAST = eINSTANCE.getCalcResourceDistanceFromLast();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_RESOURCE_DISTANCE_FROM_LAST__CONCRETE_PARENT = eINSTANCE.getCalcResourceDistanceFromLast_ConcreteParent();

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
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousescheduler.impl.LayerScheduleVolumeLoadedImpl <em>Layer Schedule Volume Loaded</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousescheduler.impl.LayerScheduleVolumeLoadedImpl
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getLayerScheduleVolumeLoaded()
		 * @generated
		 */
		EClass LAYER_SCHEDULE_VOLUME_LOADED = eINSTANCE.getLayerScheduleVolumeLoaded();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_SCHEDULE_VOLUME_LOADED__CONCRETE_PARENT = eINSTANCE.getLayerScheduleVolumeLoaded_ConcreteParent();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousescheduler.impl.CalcResourceVolumeOverloadImpl <em>Calc Resource Volume Overload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousescheduler.impl.CalcResourceVolumeOverloadImpl
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getCalcResourceVolumeOverload()
		 * @generated
		 */
		EClass CALC_RESOURCE_VOLUME_OVERLOAD = eINSTANCE.getCalcResourceVolumeOverload();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_RESOURCE_VOLUME_OVERLOAD__CONCRETE_PARENT = eINSTANCE.getCalcResourceVolumeOverload_ConcreteParent();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousescheduler.impl.LayerSchedulePlannedBenefitImpl <em>Layer Schedule Planned Benefit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousescheduler.impl.LayerSchedulePlannedBenefitImpl
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getLayerSchedulePlannedBenefit()
		 * @generated
		 */
		EClass LAYER_SCHEDULE_PLANNED_BENEFIT = eINSTANCE.getLayerSchedulePlannedBenefit();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_SCHEDULE_PLANNED_BENEFIT__CONCRETE_PARENT = eINSTANCE.getLayerSchedulePlannedBenefit_ConcreteParent();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousescheduler.impl.CalcResourcePlannedBenefitImpl <em>Calc Resource Planned Benefit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousescheduler.impl.CalcResourcePlannedBenefitImpl
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getCalcResourcePlannedBenefit()
		 * @generated
		 */
		EClass CALC_RESOURCE_PLANNED_BENEFIT = eINSTANCE.getCalcResourcePlannedBenefit();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_RESOURCE_PLANNED_BENEFIT__CONCRETE_PARENT = eINSTANCE.getCalcResourcePlannedBenefit_ConcreteParent();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousescheduler.impl.CalcTaskStartVolumeLoadedImpl <em>Calc Task Start Volume Loaded</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousescheduler.impl.CalcTaskStartVolumeLoadedImpl
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getCalcTaskStartVolumeLoaded()
		 * @generated
		 */
		EClass CALC_TASK_START_VOLUME_LOADED = eINSTANCE.getCalcTaskStartVolumeLoaded();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_TASK_START_VOLUME_LOADED__CONCRETE_PARENT = eINSTANCE.getCalcTaskStartVolumeLoaded_ConcreteParent();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousescheduler.impl.CalcTaskEndVolumeLoadedImpl <em>Calc Task End Volume Loaded</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousescheduler.impl.CalcTaskEndVolumeLoadedImpl
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getCalcTaskEndVolumeLoaded()
		 * @generated
		 */
		EClass CALC_TASK_END_VOLUME_LOADED = eINSTANCE.getCalcTaskEndVolumeLoaded();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_TASK_END_VOLUME_LOADED__CONCRETE_PARENT = eINSTANCE.getCalcTaskEndVolumeLoaded_ConcreteParent();

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
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousescheduler.impl.ToUsePhaseDestructConstructImpl <em>To Use Phase Destruct Construct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUsePhaseDestructConstructImpl
		 * @see com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerPackageImpl#getToUsePhaseDestructConstruct()
		 * @generated
		 */
		EClass TO_USE_PHASE_DESTRUCT_CONSTRUCT = eINSTANCE.getToUsePhaseDestructConstruct();

		/**
		 * The meta object literal for the '<em><b>Destruction Chance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_USE_PHASE_DESTRUCT_CONSTRUCT__DESTRUCTION_CHANCE = eINSTANCE.getToUsePhaseDestructConstruct_DestructionChance();

		/**
		 * The meta object literal for the '<em><b>Construction Chance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_USE_PHASE_DESTRUCT_CONSTRUCT__CONSTRUCTION_CHANCE = eINSTANCE.getToUsePhaseDestructConstruct_ConstructionChance();

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
		 * The meta object literal for the '<em><b>Shipment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_ACTION_LOAD_UNLOAD__SHIPMENT = eINSTANCE.getToUseActionLoadUnload_Shipment();

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

		/**
		 * The meta object literal for the '<em><b>Get Task Load</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TO_USE_SCHEDULE___GET_TASK_LOAD__SHIPMENT = eINSTANCE.getToUseSchedule__GetTaskLoad__Shipment();

		/**
		 * The meta object literal for the '<em><b>Get Task Unload</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TO_USE_SCHEDULE___GET_TASK_UNLOAD__SHIPMENT = eINSTANCE.getToUseSchedule__GetTaskUnload__Shipment();

		/**
		 * The meta object literal for the '<em><b>Get Resource Vehicle</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TO_USE_SCHEDULE___GET_RESOURCE_VEHICLE__VEHICLE = eINSTANCE.getToUseSchedule__GetResourceVehicle__Vehicle();

	}

} //ToUseSchedulerPackage
