/**
 */
package tousesolvercp;

import com.misc.common.moplaf.solver.SolverPackage;
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
 * @see tousesolvercp.TousesolvercpFactory
 * @model kind="package"
 * @generated
 */
public interface TousesolvercpPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tousesolvercp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/touse.moplaf.solver.cp.emf";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tsocp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TousesolvercpPackage eINSTANCE = tousesolvercp.impl.TousesolvercpPackageImpl.init();

	/**
	 * The meta object id for the '{@link tousesolvercp.impl.ToUseSolverCpFolderImpl <em>To Use Solver Cp Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tousesolvercp.impl.ToUseSolverCpFolderImpl
	 * @see tousesolvercp.impl.TousesolvercpPackageImpl#getToUseSolverCpFolder()
	 * @generated
	 */
	int TO_USE_SOLVER_CP_FOLDER = 0;

	/**
	 * The feature id for the '<em><b>Sub Folders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_FOLDER__SUB_FOLDERS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_FOLDER__NAME = 1;

	/**
	 * The feature id for the '<em><b>To Use Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_FOLDER__TO_USE_GENERATORS = 2;

	/**
	 * The number of structural features of the '<em>To Use Solver Cp Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_FOLDER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>To Use Solver Cp Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_FOLDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tousesolvercp.impl.ToUseSolverCpGeneratorImpl <em>To Use Solver Cp Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tousesolvercp.impl.ToUseSolverCpGeneratorImpl
	 * @see tousesolvercp.impl.TousesolvercpPackageImpl#getToUseSolverCpGenerator()
	 * @generated
	 */
	int TO_USE_SOLVER_CP_GENERATOR = 1;

	/**
	 * The feature id for the '<em><b>Run Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR__RUN_FEEDBACK = SolverPackage.GENERATOR__RUN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Cancel Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR__CANCEL_FEEDBACK = SolverPackage.GENERATOR__CANCEL_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Reset Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR__RESET_FEEDBACK = SolverPackage.GENERATOR__RESET_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR__LABEL = SolverPackage.GENERATOR__LABEL;

	/**
	 * The feature id for the '<em><b>Cancelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR__CANCELLED = SolverPackage.GENERATOR__CANCELLED;

	/**
	 * The feature id for the '<em><b>Returned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR__RETURNED = SolverPackage.GENERATOR__RETURNED;

	/**
	 * The feature id for the '<em><b>Return Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR__RETURN_SUCCESS = SolverPackage.GENERATOR__RETURN_SUCCESS;

	/**
	 * The feature id for the '<em><b>Return Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR__RETURN_FEEDBACK = SolverPackage.GENERATOR__RETURN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Return Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR__RETURN_INFORMATION = SolverPackage.GENERATOR__RETURN_INFORMATION;

	/**
	 * The feature id for the '<em><b>Tuple Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR__TUPLE_ROOT = SolverPackage.GENERATOR__TUPLE_ROOT;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR__GOALS = SolverPackage.GENERATOR__GOALS;

	/**
	 * The feature id for the '<em><b>Var Binders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR__VAR_BINDERS = SolverPackage.GENERATOR__VAR_BINDERS;

	/**
	 * The feature id for the '<em><b>Solution Provider</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR__SOLUTION_PROVIDER = SolverPackage.GENERATOR__SOLUTION_PROVIDER;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR__REMARKS = SolverPackage.GENERATOR__REMARKS;

	/**
	 * The feature id for the '<em><b>Footprint Nof Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR__FOOTPRINT_NOF_VARS = SolverPackage.GENERATOR__FOOTPRINT_NOF_VARS;

	/**
	 * The feature id for the '<em><b>Footprint Nof Cons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR__FOOTPRINT_NOF_CONS = SolverPackage.GENERATOR__FOOTPRINT_NOF_CONS;

	/**
	 * The feature id for the '<em><b>Footprint Nof Terms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR__FOOTPRINT_NOF_TERMS = SolverPackage.GENERATOR__FOOTPRINT_NOF_TERMS;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR__CODE = SolverPackage.GENERATOR__CODE;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR__SELECTED = SolverPackage.GENERATOR__SELECTED;

	/**
	 * The feature id for the '<em><b>Solver</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR__SOLVER = SolverPackage.GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Use Tuples</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR__TO_USE_TUPLES = SolverPackage.GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>To Use Solver Cp Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR_FEATURE_COUNT = SolverPackage.GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Copy Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR___COPY_PARAMS__RUNPARAMS = SolverPackage.GENERATOR___COPY_PARAMS__RUNPARAMS;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR___RESET = SolverPackage.GENERATOR___RESET;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR___RUN = SolverPackage.GENERATOR___RUN;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR___RUN__RUNCONTEXT = SolverPackage.GENERATOR___RUN__RUNCONTEXT;

	/**
	 * The operation id for the '<em>Run Asynch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR___RUN_ASYNCH__RUNCONTEXT = SolverPackage.GENERATOR___RUN_ASYNCH__RUNCONTEXT;

	/**
	 * The operation id for the '<em>Cancel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR___CANCEL = SolverPackage.GENERATOR___CANCEL;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR___SET_PROGRESS__STRING_FLOAT = SolverPackage.GENERATOR___SET_PROGRESS__STRING_FLOAT;

	/**
	 * The operation id for the '<em>Set Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR___SET_RETURN__RETURNFEEDBACK = SolverPackage.GENERATOR___SET_RETURN__RETURNFEEDBACK;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR___SET_PROGRESS__PROGRESSFEEDBACK = SolverPackage.GENERATOR___SET_PROGRESS__PROGRESSFEEDBACK;

	/**
	 * The operation id for the '<em>Get Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR___GET_RETURN = SolverPackage.GENERATOR___GET_RETURN;

	/**
	 * The operation id for the '<em>Construct Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR___CONSTRUCT_PARAMS = SolverPackage.GENERATOR___CONSTRUCT_PARAMS;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR___GENERATE = SolverPackage.GENERATOR___GENERATE;

	/**
	 * The operation id for the '<em>Generate Root Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR___GENERATE_ROOT_TUPLES = SolverPackage.GENERATOR___GENERATE_ROOT_TUPLES;

	/**
	 * The operation id for the '<em>Generate Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR___GENERATE_TUPLES = SolverPackage.GENERATOR___GENERATE_TUPLES;

	/**
	 * The operation id for the '<em>Generate Tuple XReferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR___GENERATE_TUPLE_XREFERENCES = SolverPackage.GENERATOR___GENERATE_TUPLE_XREFERENCES;

	/**
	 * The operation id for the '<em>Generate Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR___GENERATE_VARS = SolverPackage.GENERATOR___GENERATE_VARS;

	/**
	 * The operation id for the '<em>Generate Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR___GENERATE_CONS = SolverPackage.GENERATOR___GENERATE_CONS;

	/**
	 * The operation id for the '<em>Generate Goals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR___GENERATE_GOALS = SolverPackage.GENERATOR___GENERATE_GOALS;

	/**
	 * The operation id for the '<em>Accept Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR___ACCEPT_SOLUTION__SOLUTION = SolverPackage.GENERATOR___ACCEPT_SOLUTION__SOLUTION;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR___VISIT_TUPLES__ITUPLEVISITOR = SolverPackage.GENERATOR___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR___REFRESH_SELECTED_SOLUTION = SolverPackage.GENERATOR___REFRESH_SELECTED_SOLUTION;

	/**
	 * The number of operations of the '<em>To Use Solver Cp Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_GENERATOR_OPERATION_COUNT = SolverPackage.GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tousesolvercp.impl.ToUseSolverCpTupleImpl <em>To Use Solver Cp Tuple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tousesolvercp.impl.ToUseSolverCpTupleImpl
	 * @see tousesolvercp.impl.TousesolvercpPackageImpl#getToUseSolverCpTuple()
	 * @generated
	 */
	int TO_USE_SOLVER_CP_TUPLE = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_TUPLE__CODE = SolverPackage.GENERATOR_TUPLE__CODE;

	/**
	 * The feature id for the '<em><b>Generator As Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_TUPLE__GENERATOR_AS_ROOT = SolverPackage.GENERATOR_TUPLE__GENERATOR_AS_ROOT;

	/**
	 * The feature id for the '<em><b>Tuple Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_TUPLE__TUPLE_ELEMENT = SolverPackage.GENERATOR_TUPLE__TUPLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Tuple Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_TUPLE__TUPLE_CONTAINER = SolverPackage.GENERATOR_TUPLE__TUPLE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_TUPLE__VAR = SolverPackage.GENERATOR_TUPLE__VAR;

	/**
	 * The feature id for the '<em><b>Cons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_TUPLE__CONS = SolverPackage.GENERATOR_TUPLE__CONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_TUPLE__NAME = SolverPackage.GENERATOR_TUPLE__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_TUPLE__MEMBERS = SolverPackage.GENERATOR_TUPLE__MEMBERS;

	/**
	 * The feature id for the '<em><b>To Use Linears</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_TUPLE__TO_USE_LINEARS = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Use Vars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_TUPLE__TO_USE_VARS = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To Use Logicals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_TUPLE__TO_USE_LOGICALS = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>To Use Solver Cp Tuple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_TUPLE_FEATURE_COUNT = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_TUPLE___GET_GENERATOR = SolverPackage.GENERATOR_TUPLE___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_TUPLE___REFRESH_SELECTED_SOLUTION = SolverPackage.GENERATOR_TUPLE___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Generate Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_TUPLE___GENERATE_VARS = SolverPackage.GENERATOR_TUPLE___GENERATE_VARS;

	/**
	 * The operation id for the '<em>Generate Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_TUPLE___GENERATE_CONS = SolverPackage.GENERATOR_TUPLE___GENERATE_CONS;

	/**
	 * The operation id for the '<em>Generate Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_TUPLE___GENERATE_TUPLES = SolverPackage.GENERATOR_TUPLE___GENERATE_TUPLES;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_TUPLE___VISIT_TUPLES__ITUPLEVISITOR = SolverPackage.GENERATOR_TUPLE___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The operation id for the '<em>Generate XReferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_TUPLE___GENERATE_XREFERENCES = SolverPackage.GENERATOR_TUPLE___GENERATE_XREFERENCES;

	/**
	 * The number of operations of the '<em>To Use Solver Cp Tuple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SOLVER_CP_TUPLE_OPERATION_COUNT = SolverPackage.GENERATOR_TUPLE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link tousesolvercp.ToUseSolverCpFolder <em>To Use Solver Cp Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Use Solver Cp Folder</em>'.
	 * @see tousesolvercp.ToUseSolverCpFolder
	 * @generated
	 */
	EClass getToUseSolverCpFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link tousesolvercp.ToUseSolverCpFolder#getSubFolders <em>Sub Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Folders</em>'.
	 * @see tousesolvercp.ToUseSolverCpFolder#getSubFolders()
	 * @see #getToUseSolverCpFolder()
	 * @generated
	 */
	EReference getToUseSolverCpFolder_SubFolders();

	/**
	 * Returns the meta object for the attribute '{@link tousesolvercp.ToUseSolverCpFolder#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tousesolvercp.ToUseSolverCpFolder#getName()
	 * @see #getToUseSolverCpFolder()
	 * @generated
	 */
	EAttribute getToUseSolverCpFolder_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tousesolvercp.ToUseSolverCpFolder#getToUseGenerators <em>To Use Generators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>To Use Generators</em>'.
	 * @see tousesolvercp.ToUseSolverCpFolder#getToUseGenerators()
	 * @see #getToUseSolverCpFolder()
	 * @generated
	 */
	EReference getToUseSolverCpFolder_ToUseGenerators();

	/**
	 * Returns the meta object for class '{@link tousesolvercp.ToUseSolverCpGenerator <em>To Use Solver Cp Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Use Solver Cp Generator</em>'.
	 * @see tousesolvercp.ToUseSolverCpGenerator
	 * @generated
	 */
	EClass getToUseSolverCpGenerator();

	/**
	 * Returns the meta object for the containment reference list '{@link tousesolvercp.ToUseSolverCpGenerator#getSolver <em>Solver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Solver</em>'.
	 * @see tousesolvercp.ToUseSolverCpGenerator#getSolver()
	 * @see #getToUseSolverCpGenerator()
	 * @generated
	 */
	EReference getToUseSolverCpGenerator_Solver();

	/**
	 * Returns the meta object for the containment reference list '{@link tousesolvercp.ToUseSolverCpGenerator#getToUseTuples <em>To Use Tuples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>To Use Tuples</em>'.
	 * @see tousesolvercp.ToUseSolverCpGenerator#getToUseTuples()
	 * @see #getToUseSolverCpGenerator()
	 * @generated
	 */
	EReference getToUseSolverCpGenerator_ToUseTuples();

	/**
	 * Returns the meta object for class '{@link tousesolvercp.ToUseSolverCpTuple <em>To Use Solver Cp Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Use Solver Cp Tuple</em>'.
	 * @see tousesolvercp.ToUseSolverCpTuple
	 * @generated
	 */
	EClass getToUseSolverCpTuple();

	/**
	 * Returns the meta object for the containment reference list '{@link tousesolvercp.ToUseSolverCpTuple#getToUseLinears <em>To Use Linears</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>To Use Linears</em>'.
	 * @see tousesolvercp.ToUseSolverCpTuple#getToUseLinears()
	 * @see #getToUseSolverCpTuple()
	 * @generated
	 */
	EReference getToUseSolverCpTuple_ToUseLinears();

	/**
	 * Returns the meta object for the containment reference list '{@link tousesolvercp.ToUseSolverCpTuple#getToUseVars <em>To Use Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>To Use Vars</em>'.
	 * @see tousesolvercp.ToUseSolverCpTuple#getToUseVars()
	 * @see #getToUseSolverCpTuple()
	 * @generated
	 */
	EReference getToUseSolverCpTuple_ToUseVars();

	/**
	 * Returns the meta object for the containment reference list '{@link tousesolvercp.ToUseSolverCpTuple#getToUseLogicals <em>To Use Logicals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>To Use Logicals</em>'.
	 * @see tousesolvercp.ToUseSolverCpTuple#getToUseLogicals()
	 * @see #getToUseSolverCpTuple()
	 * @generated
	 */
	EReference getToUseSolverCpTuple_ToUseLogicals();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TousesolvercpFactory getTousesolvercpFactory();

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
		 * The meta object literal for the '{@link tousesolvercp.impl.ToUseSolverCpFolderImpl <em>To Use Solver Cp Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tousesolvercp.impl.ToUseSolverCpFolderImpl
		 * @see tousesolvercp.impl.TousesolvercpPackageImpl#getToUseSolverCpFolder()
		 * @generated
		 */
		EClass TO_USE_SOLVER_CP_FOLDER = eINSTANCE.getToUseSolverCpFolder();

		/**
		 * The meta object literal for the '<em><b>Sub Folders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_SOLVER_CP_FOLDER__SUB_FOLDERS = eINSTANCE.getToUseSolverCpFolder_SubFolders();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_USE_SOLVER_CP_FOLDER__NAME = eINSTANCE.getToUseSolverCpFolder_Name();

		/**
		 * The meta object literal for the '<em><b>To Use Generators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_SOLVER_CP_FOLDER__TO_USE_GENERATORS = eINSTANCE.getToUseSolverCpFolder_ToUseGenerators();

		/**
		 * The meta object literal for the '{@link tousesolvercp.impl.ToUseSolverCpGeneratorImpl <em>To Use Solver Cp Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tousesolvercp.impl.ToUseSolverCpGeneratorImpl
		 * @see tousesolvercp.impl.TousesolvercpPackageImpl#getToUseSolverCpGenerator()
		 * @generated
		 */
		EClass TO_USE_SOLVER_CP_GENERATOR = eINSTANCE.getToUseSolverCpGenerator();

		/**
		 * The meta object literal for the '<em><b>Solver</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_SOLVER_CP_GENERATOR__SOLVER = eINSTANCE.getToUseSolverCpGenerator_Solver();

		/**
		 * The meta object literal for the '<em><b>To Use Tuples</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_SOLVER_CP_GENERATOR__TO_USE_TUPLES = eINSTANCE.getToUseSolverCpGenerator_ToUseTuples();

		/**
		 * The meta object literal for the '{@link tousesolvercp.impl.ToUseSolverCpTupleImpl <em>To Use Solver Cp Tuple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tousesolvercp.impl.ToUseSolverCpTupleImpl
		 * @see tousesolvercp.impl.TousesolvercpPackageImpl#getToUseSolverCpTuple()
		 * @generated
		 */
		EClass TO_USE_SOLVER_CP_TUPLE = eINSTANCE.getToUseSolverCpTuple();

		/**
		 * The meta object literal for the '<em><b>To Use Linears</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_SOLVER_CP_TUPLE__TO_USE_LINEARS = eINSTANCE.getToUseSolverCpTuple_ToUseLinears();

		/**
		 * The meta object literal for the '<em><b>To Use Vars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_SOLVER_CP_TUPLE__TO_USE_VARS = eINSTANCE.getToUseSolverCpTuple_ToUseVars();

		/**
		 * The meta object literal for the '<em><b>To Use Logicals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_SOLVER_CP_TUPLE__TO_USE_LOGICALS = eINSTANCE.getToUseSolverCpTuple_ToUseLogicals();

	}

} //TousesolvercpPackage
