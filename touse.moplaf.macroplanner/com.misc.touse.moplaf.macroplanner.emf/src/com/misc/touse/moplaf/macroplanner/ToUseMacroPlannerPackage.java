/**
 */
package com.misc.touse.moplaf.macroplanner;

import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage;
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
 * @see com.misc.touse.moplaf.macroplanner.ToUseMacroPlannerFactory
 * @model kind="package"
 * @generated
 */
public interface ToUseMacroPlannerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "macroplanner";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/touse/moplaf/macroplanner/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mptu";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToUseMacroPlannerPackage eINSTANCE = com.misc.touse.moplaf.macroplanner.impl.ToUseMacroPlannerPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.macroplanner.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.macroplanner.impl.DomainImpl
	 * @see com.misc.touse.moplaf.macroplanner.impl.ToUseMacroPlannerPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Master Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__MASTER_DATA = 0;

	/**
	 * The feature id for the '<em><b>Limits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__LIMITS = 1;

	/**
	 * The feature id for the '<em><b>Routings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__ROUTINGS = 2;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__DATA = 3;

	/**
	 * The feature id for the '<em><b>Scenarios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__SCENARIOS = 4;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.macroplanner.impl.ToUseLPMacroPlannerImpl <em>To Use LP Macro Planner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.macroplanner.impl.ToUseLPMacroPlannerImpl
	 * @see com.misc.touse.moplaf.macroplanner.impl.ToUseMacroPlannerPackageImpl#getToUseLPMacroPlanner()
	 * @generated
	 */
	int TO_USE_LP_MACRO_PLANNER = 1;

	/**
	 * The feature id for the '<em><b>Run Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER__RUN_FEEDBACK = MacroPlannerSolverPackage.LP_MACRO_PLANNER__RUN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Cancel Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER__CANCEL_FEEDBACK = MacroPlannerSolverPackage.LP_MACRO_PLANNER__CANCEL_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Reset Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER__RESET_FEEDBACK = MacroPlannerSolverPackage.LP_MACRO_PLANNER__RESET_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Canceled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER__CANCELED = MacroPlannerSolverPackage.LP_MACRO_PLANNER__CANCELED;

	/**
	 * The feature id for the '<em><b>Return Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER__RETURN_SUCCESS = MacroPlannerSolverPackage.LP_MACRO_PLANNER__RETURN_SUCCESS;

	/**
	 * The feature id for the '<em><b>Return Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER__RETURN_FEEDBACK = MacroPlannerSolverPackage.LP_MACRO_PLANNER__RETURN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Return Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER__RETURN_INFORMATION = MacroPlannerSolverPackage.LP_MACRO_PLANNER__RETURN_INFORMATION;

	/**
	 * The feature id for the '<em><b>Tuple Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER__TUPLE_ROOT = MacroPlannerSolverPackage.LP_MACRO_PLANNER__TUPLE_ROOT;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER__GOALS = MacroPlannerSolverPackage.LP_MACRO_PLANNER__GOALS;

	/**
	 * The feature id for the '<em><b>Generator Feature Modes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER__GENERATOR_FEATURE_MODES = MacroPlannerSolverPackage.LP_MACRO_PLANNER__GENERATOR_FEATURE_MODES;

	/**
	 * The feature id for the '<em><b>Solution Provider</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER__SOLUTION_PROVIDER = MacroPlannerSolverPackage.LP_MACRO_PLANNER__SOLUTION_PROVIDER;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER__REMARKS = MacroPlannerSolverPackage.LP_MACRO_PLANNER__REMARKS;

	/**
	 * The feature id for the '<em><b>Footprint Nof Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER__FOOTPRINT_NOF_VARS = MacroPlannerSolverPackage.LP_MACRO_PLANNER__FOOTPRINT_NOF_VARS;

	/**
	 * The feature id for the '<em><b>Footprint Nof Cons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER__FOOTPRINT_NOF_CONS = MacroPlannerSolverPackage.LP_MACRO_PLANNER__FOOTPRINT_NOF_CONS;

	/**
	 * The feature id for the '<em><b>Footprint Nof Terms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER__FOOTPRINT_NOF_TERMS = MacroPlannerSolverPackage.LP_MACRO_PLANNER__FOOTPRINT_NOF_TERMS;

	/**
	 * The feature id for the '<em><b>Count Cons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER__COUNT_CONS = MacroPlannerSolverPackage.LP_MACRO_PLANNER__COUNT_CONS;

	/**
	 * The feature id for the '<em><b>Count Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER__COUNT_VARS = MacroPlannerSolverPackage.LP_MACRO_PLANNER__COUNT_VARS;

	/**
	 * The feature id for the '<em><b>ELp Var Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER__ELP_VAR_COUNT = MacroPlannerSolverPackage.LP_MACRO_PLANNER__ELP_VAR_COUNT;

	/**
	 * The feature id for the '<em><b>ELp Cons Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER__ELP_CONS_COUNT = MacroPlannerSolverPackage.LP_MACRO_PLANNER__ELP_CONS_COUNT;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER__CODE = MacroPlannerSolverPackage.LP_MACRO_PLANNER__CODE;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER__SELECTED = MacroPlannerSolverPackage.LP_MACRO_PLANNER__SELECTED;

	/**
	 * The feature id for the '<em><b>Bucket Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER__BUCKET_SIZE = MacroPlannerSolverPackage.LP_MACRO_PLANNER__BUCKET_SIZE;

	/**
	 * The feature id for the '<em><b>Product Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER__PRODUCT_SET = MacroPlannerSolverPackage.LP_MACRO_PLANNER__PRODUCT_SET;

	/**
	 * The feature id for the '<em><b>Resource Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER__RESOURCE_SET = MacroPlannerSolverPackage.LP_MACRO_PLANNER__RESOURCE_SET;

	/**
	 * The feature id for the '<em><b>Routing Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER__ROUTING_SET = MacroPlannerSolverPackage.LP_MACRO_PLANNER__ROUTING_SET;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER__SCENARIO = MacroPlannerSolverPackage.LP_MACRO_PLANNER__SCENARIO;

	/**
	 * The feature id for the '<em><b>Time Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER__TIME_LINE = MacroPlannerSolverPackage.LP_MACRO_PLANNER__TIME_LINE;

	/**
	 * The feature id for the '<em><b>Cost Routings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER__COST_ROUTINGS = MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_ROUTINGS;

	/**
	 * The feature id for the '<em><b>Cost Supplies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER__COST_SUPPLIES = MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_SUPPLIES;

	/**
	 * The feature id for the '<em><b>Cost Capacities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER__COST_CAPACITIES = MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_CAPACITIES;

	/**
	 * The feature id for the '<em><b>Cost Availabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER__COST_AVAILABILITIES = MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_AVAILABILITIES;

	/**
	 * The feature id for the '<em><b>Penalty Capacities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER__PENALTY_CAPACITIES = MacroPlannerSolverPackage.LP_MACRO_PLANNER__PENALTY_CAPACITIES;

	/**
	 * The feature id for the '<em><b>Penalty Availabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER__PENALTY_AVAILABILITIES = MacroPlannerSolverPackage.LP_MACRO_PLANNER__PENALTY_AVAILABILITIES;

	/**
	 * The feature id for the '<em><b>Solvers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER__SOLVERS = MacroPlannerSolverPackage.LP_MACRO_PLANNER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>To Use LP Macro Planner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER_FEATURE_COUNT = MacroPlannerSolverPackage.LP_MACRO_PLANNER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER___RESET = MacroPlannerSolverPackage.LP_MACRO_PLANNER___RESET;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER___RUN = MacroPlannerSolverPackage.LP_MACRO_PLANNER___RUN;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER___RUN__RUNCONTEXT = MacroPlannerSolverPackage.LP_MACRO_PLANNER___RUN__RUNCONTEXT;

	/**
	 * The operation id for the '<em>Cancel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER___CANCEL = MacroPlannerSolverPackage.LP_MACRO_PLANNER___CANCEL;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER___SET_PROGRESS__STRING_FLOAT = MacroPlannerSolverPackage.LP_MACRO_PLANNER___SET_PROGRESS__STRING_FLOAT;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER___SET_PROGRESS__PROGRESSFEEDBACK = MacroPlannerSolverPackage.LP_MACRO_PLANNER___SET_PROGRESS__PROGRESSFEEDBACK;

	/**
	 * The operation id for the '<em>Get Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER___GET_RETURN = MacroPlannerSolverPackage.LP_MACRO_PLANNER___GET_RETURN;

	/**
	 * The operation id for the '<em>Set Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER___SET_RETURN__RETURNFEEDBACK = MacroPlannerSolverPackage.LP_MACRO_PLANNER___SET_RETURN__RETURNFEEDBACK;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER___GENERATE = MacroPlannerSolverPackage.LP_MACRO_PLANNER___GENERATE;

	/**
	 * The operation id for the '<em>Generate Root Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER___GENERATE_ROOT_TUPLES = MacroPlannerSolverPackage.LP_MACRO_PLANNER___GENERATE_ROOT_TUPLES;

	/**
	 * The operation id for the '<em>Generate Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER___GENERATE_TUPLES = MacroPlannerSolverPackage.LP_MACRO_PLANNER___GENERATE_TUPLES;

	/**
	 * The operation id for the '<em>Generate Tuple XReferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER___GENERATE_TUPLE_XREFERENCES = MacroPlannerSolverPackage.LP_MACRO_PLANNER___GENERATE_TUPLE_XREFERENCES;

	/**
	 * The operation id for the '<em>Generate Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER___GENERATE_VARS = MacroPlannerSolverPackage.LP_MACRO_PLANNER___GENERATE_VARS;

	/**
	 * The operation id for the '<em>Generate Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER___GENERATE_CONS = MacroPlannerSolverPackage.LP_MACRO_PLANNER___GENERATE_CONS;

	/**
	 * The operation id for the '<em>Generate Goals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER___GENERATE_GOALS = MacroPlannerSolverPackage.LP_MACRO_PLANNER___GENERATE_GOALS;

	/**
	 * The operation id for the '<em>Accept Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER___ACCEPT_SOLUTION__SOLUTION = MacroPlannerSolverPackage.LP_MACRO_PLANNER___ACCEPT_SOLUTION__SOLUTION;

	/**
	 * The operation id for the '<em>Select Feature Mode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER___SELECT_FEATURE_MODE__GENERATORFEATUREMODE_GENERATORTUPLE = MacroPlannerSolverPackage.LP_MACRO_PLANNER___SELECT_FEATURE_MODE__GENERATORFEATUREMODE_GENERATORTUPLE;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER___VISIT_TUPLES__ITUPLEVISITOR = MacroPlannerSolverPackage.LP_MACRO_PLANNER___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER___REFRESH_SELECTED_SOLUTION = MacroPlannerSolverPackage.LP_MACRO_PLANNER___REFRESH_SELECTED_SOLUTION;

	/**
	 * The number of operations of the '<em>To Use LP Macro Planner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_LP_MACRO_PLANNER_OPERATION_COUNT = MacroPlannerSolverPackage.LP_MACRO_PLANNER_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.macroplanner.impl.ToUseScenarioImpl <em>To Use Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.macroplanner.impl.ToUseScenarioImpl
	 * @see com.misc.touse.moplaf.macroplanner.impl.ToUseMacroPlannerPackageImpl#getToUseScenario()
	 * @generated
	 */
	int TO_USE_SCENARIO = 2;

	/**
	 * The feature id for the '<em><b>LPs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCENARIO__LPS = MacroPlannerSolverPackage.SCENARIO__LPS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCENARIO__NAME = MacroPlannerSolverPackage.SCENARIO__NAME;

	/**
	 * The feature id for the '<em><b>Scenario Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCENARIO__SCENARIO_START = MacroPlannerSolverPackage.SCENARIO__SCENARIO_START;

	/**
	 * The feature id for the '<em><b>Scenario End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCENARIO__SCENARIO_END = MacroPlannerSolverPackage.SCENARIO__SCENARIO_END;

	/**
	 * The feature id for the '<em><b>Selected Master Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCENARIO__SELECTED_MASTER_DATA = MacroPlannerSolverPackage.SCENARIO__SELECTED_MASTER_DATA;

	/**
	 * The feature id for the '<em><b>Selected Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCENARIO__SELECTED_DATA = MacroPlannerSolverPackage.SCENARIO__SELECTED_DATA;

	/**
	 * The feature id for the '<em><b>Selected Routings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCENARIO__SELECTED_ROUTINGS = MacroPlannerSolverPackage.SCENARIO__SELECTED_ROUTINGS;

	/**
	 * The number of structural features of the '<em>To Use Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCENARIO_FEATURE_COUNT = MacroPlannerSolverPackage.SCENARIO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>To Use Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SCENARIO_OPERATION_COUNT = MacroPlannerSolverPackage.SCENARIO_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.macroplanner.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see com.misc.touse.moplaf.macroplanner.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.macroplanner.Domain#getMasterData <em>Master Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Master Data</em>'.
	 * @see com.misc.touse.moplaf.macroplanner.Domain#getMasterData()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_MasterData();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.macroplanner.Domain#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see com.misc.touse.moplaf.macroplanner.Domain#getData()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Data();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.macroplanner.Domain#getRoutings <em>Routings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Routings</em>'.
	 * @see com.misc.touse.moplaf.macroplanner.Domain#getRoutings()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Routings();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.macroplanner.Domain#getScenarios <em>Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenarios</em>'.
	 * @see com.misc.touse.moplaf.macroplanner.Domain#getScenarios()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Scenarios();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.macroplanner.Domain#getLimits <em>Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Limits</em>'.
	 * @see com.misc.touse.moplaf.macroplanner.Domain#getLimits()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Limits();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.macroplanner.ToUseLPMacroPlanner <em>To Use LP Macro Planner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Use LP Macro Planner</em>'.
	 * @see com.misc.touse.moplaf.macroplanner.ToUseLPMacroPlanner
	 * @generated
	 */
	EClass getToUseLPMacroPlanner();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.macroplanner.ToUseLPMacroPlanner#getSolvers <em>Solvers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Solvers</em>'.
	 * @see com.misc.touse.moplaf.macroplanner.ToUseLPMacroPlanner#getSolvers()
	 * @see #getToUseLPMacroPlanner()
	 * @generated
	 */
	EReference getToUseLPMacroPlanner_Solvers();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.macroplanner.ToUseScenario <em>To Use Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Use Scenario</em>'.
	 * @see com.misc.touse.moplaf.macroplanner.ToUseScenario
	 * @generated
	 */
	EClass getToUseScenario();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ToUseMacroPlannerFactory getToUseMacroPlannerFactory();

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
		 * The meta object literal for the '{@link com.misc.touse.moplaf.macroplanner.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.macroplanner.impl.DomainImpl
		 * @see com.misc.touse.moplaf.macroplanner.impl.ToUseMacroPlannerPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Master Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__MASTER_DATA = eINSTANCE.getDomain_MasterData();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__DATA = eINSTANCE.getDomain_Data();

		/**
		 * The meta object literal for the '<em><b>Routings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__ROUTINGS = eINSTANCE.getDomain_Routings();

		/**
		 * The meta object literal for the '<em><b>Scenarios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__SCENARIOS = eINSTANCE.getDomain_Scenarios();

		/**
		 * The meta object literal for the '<em><b>Limits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__LIMITS = eINSTANCE.getDomain_Limits();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.macroplanner.impl.ToUseLPMacroPlannerImpl <em>To Use LP Macro Planner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.macroplanner.impl.ToUseLPMacroPlannerImpl
		 * @see com.misc.touse.moplaf.macroplanner.impl.ToUseMacroPlannerPackageImpl#getToUseLPMacroPlanner()
		 * @generated
		 */
		EClass TO_USE_LP_MACRO_PLANNER = eINSTANCE.getToUseLPMacroPlanner();

		/**
		 * The meta object literal for the '<em><b>Solvers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_LP_MACRO_PLANNER__SOLVERS = eINSTANCE.getToUseLPMacroPlanner_Solvers();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.macroplanner.impl.ToUseScenarioImpl <em>To Use Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.macroplanner.impl.ToUseScenarioImpl
		 * @see com.misc.touse.moplaf.macroplanner.impl.ToUseMacroPlannerPackageImpl#getToUseScenario()
		 * @generated
		 */
		EClass TO_USE_SCENARIO = eINSTANCE.getToUseScenario();

	}

} //ToUseMacroPlannerPackage
