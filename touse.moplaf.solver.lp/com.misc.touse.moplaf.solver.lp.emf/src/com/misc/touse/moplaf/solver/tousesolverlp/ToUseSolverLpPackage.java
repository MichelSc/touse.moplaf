/**
 */
package com.misc.touse.moplaf.solver.tousesolverlp;

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
 * @see com.misc.touse.moplaf.solver.tousesolverlp.ToUseSolverLpFactory
 * @model kind="package"
 * @generated
 */
public interface ToUseSolverLpPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tousesolverlp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common/touse/solverlp/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tsollp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToUseSolverLpPackage eINSTANCE = com.misc.touse.moplaf.solver.tousesolverlp.impl.ToUseSolverLpPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.solver.tousesolverlp.impl.FolderImpl <em>Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.solver.tousesolverlp.impl.FolderImpl
	 * @see com.misc.touse.moplaf.solver.tousesolverlp.impl.ToUseSolverLpPackageImpl#getFolder()
	 * @generated
	 */
	int FOLDER = 0;

	/**
	 * The feature id for the '<em><b>Sub Folders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__SUB_FOLDERS = 0;

	/**
	 * The feature id for the '<em><b>Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__GENERATORS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__NAME = 2;

	/**
	 * The number of structural features of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.solver.tousesolverlp.impl.ToUseGeneratorImpl <em>To Use Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.solver.tousesolverlp.impl.ToUseGeneratorImpl
	 * @see com.misc.touse.moplaf.solver.tousesolverlp.impl.ToUseSolverLpPackageImpl#getToUseGenerator()
	 * @generated
	 */
	int TO_USE_GENERATOR = 1;

	/**
	 * The feature id for the '<em><b>Run Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR__RUN_FEEDBACK = SolverPackage.GENERATOR__RUN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Cancel Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR__CANCEL_FEEDBACK = SolverPackage.GENERATOR__CANCEL_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Reset Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR__RESET_FEEDBACK = SolverPackage.GENERATOR__RESET_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR__LABEL = SolverPackage.GENERATOR__LABEL;

	/**
	 * The feature id for the '<em><b>Cancelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR__CANCELLED = SolverPackage.GENERATOR__CANCELLED;

	/**
	 * The feature id for the '<em><b>Returned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR__RETURNED = SolverPackage.GENERATOR__RETURNED;

	/**
	 * The feature id for the '<em><b>Return Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR__RETURN_SUCCESS = SolverPackage.GENERATOR__RETURN_SUCCESS;

	/**
	 * The feature id for the '<em><b>Return Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR__RETURN_FEEDBACK = SolverPackage.GENERATOR__RETURN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Return Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR__RETURN_INFORMATION = SolverPackage.GENERATOR__RETURN_INFORMATION;

	/**
	 * The feature id for the '<em><b>Tuple Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR__TUPLE_ROOT = SolverPackage.GENERATOR__TUPLE_ROOT;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR__GOALS = SolverPackage.GENERATOR__GOALS;

	/**
	 * The feature id for the '<em><b>Var Binders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR__VAR_BINDERS = SolverPackage.GENERATOR__VAR_BINDERS;

	/**
	 * The feature id for the '<em><b>Solution Provider</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR__SOLUTION_PROVIDER = SolverPackage.GENERATOR__SOLUTION_PROVIDER;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR__REMARKS = SolverPackage.GENERATOR__REMARKS;

	/**
	 * The feature id for the '<em><b>Footprint Nof Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR__FOOTPRINT_NOF_VARS = SolverPackage.GENERATOR__FOOTPRINT_NOF_VARS;

	/**
	 * The feature id for the '<em><b>Footprint Nof Cons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR__FOOTPRINT_NOF_CONS = SolverPackage.GENERATOR__FOOTPRINT_NOF_CONS;

	/**
	 * The feature id for the '<em><b>Footprint Nof Terms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR__FOOTPRINT_NOF_TERMS = SolverPackage.GENERATOR__FOOTPRINT_NOF_TERMS;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR__CODE = SolverPackage.GENERATOR__CODE;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR__SELECTED = SolverPackage.GENERATOR__SELECTED;

	/**
	 * The feature id for the '<em><b>Root Tuples</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR__ROOT_TUPLES = SolverPackage.GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Solvers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR__SOLVERS = SolverPackage.GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>To Use Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR_FEATURE_COUNT = SolverPackage.GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Copy Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR___COPY_PARAMS__RUNPARAMS = SolverPackage.GENERATOR___COPY_PARAMS__RUNPARAMS;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR___RESET = SolverPackage.GENERATOR___RESET;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR___RUN = SolverPackage.GENERATOR___RUN;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR___RUN__RUNCONTEXT = SolverPackage.GENERATOR___RUN__RUNCONTEXT;

	/**
	 * The operation id for the '<em>Run Asynch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR___RUN_ASYNCH__RUNCONTEXT = SolverPackage.GENERATOR___RUN_ASYNCH__RUNCONTEXT;

	/**
	 * The operation id for the '<em>Cancel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR___CANCEL = SolverPackage.GENERATOR___CANCEL;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR___SET_PROGRESS__STRING_FLOAT = SolverPackage.GENERATOR___SET_PROGRESS__STRING_FLOAT;

	/**
	 * The operation id for the '<em>Set Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR___SET_RETURN__RETURNFEEDBACK = SolverPackage.GENERATOR___SET_RETURN__RETURNFEEDBACK;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR___SET_PROGRESS__PROGRESSFEEDBACK = SolverPackage.GENERATOR___SET_PROGRESS__PROGRESSFEEDBACK;

	/**
	 * The operation id for the '<em>Get Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR___GET_RETURN = SolverPackage.GENERATOR___GET_RETURN;

	/**
	 * The operation id for the '<em>Construct Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR___CONSTRUCT_PARAMS = SolverPackage.GENERATOR___CONSTRUCT_PARAMS;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR___GENERATE = SolverPackage.GENERATOR___GENERATE;

	/**
	 * The operation id for the '<em>Generate Root Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR___GENERATE_ROOT_TUPLES = SolverPackage.GENERATOR___GENERATE_ROOT_TUPLES;

	/**
	 * The operation id for the '<em>Generate Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR___GENERATE_TUPLES = SolverPackage.GENERATOR___GENERATE_TUPLES;

	/**
	 * The operation id for the '<em>Generate Tuple XReferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR___GENERATE_TUPLE_XREFERENCES = SolverPackage.GENERATOR___GENERATE_TUPLE_XREFERENCES;

	/**
	 * The operation id for the '<em>Generate Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR___GENERATE_VARS = SolverPackage.GENERATOR___GENERATE_VARS;

	/**
	 * The operation id for the '<em>Generate Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR___GENERATE_CONS = SolverPackage.GENERATOR___GENERATE_CONS;

	/**
	 * The operation id for the '<em>Generate Goals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR___GENERATE_GOALS = SolverPackage.GENERATOR___GENERATE_GOALS;

	/**
	 * The operation id for the '<em>Accept Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR___ACCEPT_SOLUTION__SOLUTION = SolverPackage.GENERATOR___ACCEPT_SOLUTION__SOLUTION;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR___VISIT_TUPLES__ITUPLEVISITOR = SolverPackage.GENERATOR___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR___REFRESH_SELECTED_SOLUTION = SolverPackage.GENERATOR___REFRESH_SELECTED_SOLUTION;

	/**
	 * The number of operations of the '<em>To Use Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR_OPERATION_COUNT = SolverPackage.GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.solver.tousesolverlp.impl.ToUseTupleImpl <em>To Use Tuple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.solver.tousesolverlp.impl.ToUseTupleImpl
	 * @see com.misc.touse.moplaf.solver.tousesolverlp.impl.ToUseSolverLpPackageImpl#getToUseTuple()
	 * @generated
	 */
	int TO_USE_TUPLE = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_TUPLE__CODE = SolverPackage.GENERATOR_TUPLE__CODE;

	/**
	 * The feature id for the '<em><b>Generator As Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_TUPLE__GENERATOR_AS_ROOT = SolverPackage.GENERATOR_TUPLE__GENERATOR_AS_ROOT;

	/**
	 * The feature id for the '<em><b>Tuple Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_TUPLE__TUPLE_ELEMENT = SolverPackage.GENERATOR_TUPLE__TUPLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Tuple Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_TUPLE__TUPLE_CONTAINER = SolverPackage.GENERATOR_TUPLE__TUPLE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_TUPLE__VAR = SolverPackage.GENERATOR_TUPLE__VAR;

	/**
	 * The feature id for the '<em><b>Cons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_TUPLE__CONS = SolverPackage.GENERATOR_TUPLE__CONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_TUPLE__NAME = SolverPackage.GENERATOR_TUPLE__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_TUPLE__MEMBERS = SolverPackage.GENERATOR_TUPLE__MEMBERS;

	/**
	 * The feature id for the '<em><b>Child Tuples</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_TUPLE__CHILD_TUPLES = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Use Vars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_TUPLE__TO_USE_VARS = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To Use Cons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_TUPLE__TO_USE_CONS = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>To Use Tuple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_TUPLE_FEATURE_COUNT = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_TUPLE___GET_GENERATOR = SolverPackage.GENERATOR_TUPLE___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_TUPLE___REFRESH_SELECTED_SOLUTION = SolverPackage.GENERATOR_TUPLE___REFRESH_SELECTED_SOLUTION;

	/**
	 * The operation id for the '<em>Generate Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_TUPLE___GENERATE_VARS = SolverPackage.GENERATOR_TUPLE___GENERATE_VARS;

	/**
	 * The operation id for the '<em>Generate Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_TUPLE___GENERATE_CONS = SolverPackage.GENERATOR_TUPLE___GENERATE_CONS;

	/**
	 * The operation id for the '<em>Generate Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_TUPLE___GENERATE_TUPLES = SolverPackage.GENERATOR_TUPLE___GENERATE_TUPLES;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_TUPLE___VISIT_TUPLES__ITUPLEVISITOR = SolverPackage.GENERATOR_TUPLE___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The operation id for the '<em>Generate XReferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_TUPLE___GENERATE_XREFERENCES = SolverPackage.GENERATOR_TUPLE___GENERATE_XREFERENCES;

	/**
	 * The number of operations of the '<em>To Use Tuple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_TUPLE_OPERATION_COUNT = SolverPackage.GENERATOR_TUPLE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.solver.tousesolverlp.Folder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolverlp.Folder
	 * @generated
	 */
	EClass getFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.solver.tousesolverlp.Folder#getSubFolders <em>Sub Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Folders</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolverlp.Folder#getSubFolders()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_SubFolders();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.solver.tousesolverlp.Folder#getGenerators <em>Generators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generators</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolverlp.Folder#getGenerators()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_Generators();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.solver.tousesolverlp.Folder#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolverlp.Folder#getName()
	 * @see #getFolder()
	 * @generated
	 */
	EAttribute getFolder_Name();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.solver.tousesolverlp.ToUseGenerator <em>To Use Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Use Generator</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolverlp.ToUseGenerator
	 * @generated
	 */
	EClass getToUseGenerator();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.solver.tousesolverlp.ToUseGenerator#getRootTuples <em>Root Tuples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Root Tuples</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolverlp.ToUseGenerator#getRootTuples()
	 * @see #getToUseGenerator()
	 * @generated
	 */
	EReference getToUseGenerator_RootTuples();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.solver.tousesolverlp.ToUseGenerator#getSolvers <em>Solvers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Solvers</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolverlp.ToUseGenerator#getSolvers()
	 * @see #getToUseGenerator()
	 * @generated
	 */
	EReference getToUseGenerator_Solvers();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.solver.tousesolverlp.ToUseTuple <em>To Use Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Use Tuple</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolverlp.ToUseTuple
	 * @generated
	 */
	EClass getToUseTuple();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.solver.tousesolverlp.ToUseTuple#getChildTuples <em>Child Tuples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Tuples</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolverlp.ToUseTuple#getChildTuples()
	 * @see #getToUseTuple()
	 * @generated
	 */
	EReference getToUseTuple_ChildTuples();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.solver.tousesolverlp.ToUseTuple#getToUseVars <em>To Use Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>To Use Vars</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolverlp.ToUseTuple#getToUseVars()
	 * @see #getToUseTuple()
	 * @generated
	 */
	EReference getToUseTuple_ToUseVars();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.solver.tousesolverlp.ToUseTuple#getToUseCons <em>To Use Cons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>To Use Cons</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolverlp.ToUseTuple#getToUseCons()
	 * @see #getToUseTuple()
	 * @generated
	 */
	EReference getToUseTuple_ToUseCons();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ToUseSolverLpFactory getToUseSolverLpFactory();

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
		 * The meta object literal for the '{@link com.misc.touse.moplaf.solver.tousesolverlp.impl.FolderImpl <em>Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.solver.tousesolverlp.impl.FolderImpl
		 * @see com.misc.touse.moplaf.solver.tousesolverlp.impl.ToUseSolverLpPackageImpl#getFolder()
		 * @generated
		 */
		EClass FOLDER = eINSTANCE.getFolder();

		/**
		 * The meta object literal for the '<em><b>Sub Folders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__SUB_FOLDERS = eINSTANCE.getFolder_SubFolders();

		/**
		 * The meta object literal for the '<em><b>Generators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__GENERATORS = eINSTANCE.getFolder_Generators();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOLDER__NAME = eINSTANCE.getFolder_Name();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.solver.tousesolverlp.impl.ToUseGeneratorImpl <em>To Use Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.solver.tousesolverlp.impl.ToUseGeneratorImpl
		 * @see com.misc.touse.moplaf.solver.tousesolverlp.impl.ToUseSolverLpPackageImpl#getToUseGenerator()
		 * @generated
		 */
		EClass TO_USE_GENERATOR = eINSTANCE.getToUseGenerator();

		/**
		 * The meta object literal for the '<em><b>Root Tuples</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_GENERATOR__ROOT_TUPLES = eINSTANCE.getToUseGenerator_RootTuples();

		/**
		 * The meta object literal for the '<em><b>Solvers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_GENERATOR__SOLVERS = eINSTANCE.getToUseGenerator_Solvers();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.solver.tousesolverlp.impl.ToUseTupleImpl <em>To Use Tuple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.solver.tousesolverlp.impl.ToUseTupleImpl
		 * @see com.misc.touse.moplaf.solver.tousesolverlp.impl.ToUseSolverLpPackageImpl#getToUseTuple()
		 * @generated
		 */
		EClass TO_USE_TUPLE = eINSTANCE.getToUseTuple();

		/**
		 * The meta object literal for the '<em><b>Child Tuples</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_TUPLE__CHILD_TUPLES = eINSTANCE.getToUseTuple_ChildTuples();

		/**
		 * The meta object literal for the '<em><b>To Use Vars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_TUPLE__TO_USE_VARS = eINSTANCE.getToUseTuple_ToUseVars();

		/**
		 * The meta object literal for the '<em><b>To Use Cons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_TUPLE__TO_USE_CONS = eINSTANCE.getToUseTuple_ToUseCons();

	}

} //ToUseSolverLpPackage
