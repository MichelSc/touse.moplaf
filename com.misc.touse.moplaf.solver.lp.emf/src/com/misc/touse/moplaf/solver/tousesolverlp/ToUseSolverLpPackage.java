/**
 */
package com.misc.touse.moplaf.solver.tousesolverlp;

import com.misc.common.moplaf.solver.SolverPackage;

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
	 * The number of structural features of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_FEATURE_COUNT = 2;

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
	 * The feature id for the '<em><b>Tuple Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR__TUPLE_ROOT = SolverPackage.GENERATOR__TUPLE_ROOT;

	/**
	 * The feature id for the '<em><b>Generator Feature Modes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR__GENERATOR_FEATURE_MODES = SolverPackage.GENERATOR__GENERATOR_FEATURE_MODES;

	/**
	 * The feature id for the '<em><b>Objective Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR__OBJECTIVE_TYPE = SolverPackage.GENERATOR__OBJECTIVE_TYPE;

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
	 * The feature id for the '<em><b>Count Cons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR__COUNT_CONS = SolverPackage.GENERATOR__COUNT_CONS;

	/**
	 * The feature id for the '<em><b>Count Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR__COUNT_VARS = SolverPackage.GENERATOR__COUNT_VARS;

	/**
	 * The feature id for the '<em><b>ELp Var Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR__ELP_VAR_COUNT = SolverPackage.GENERATOR__ELP_VAR_COUNT;

	/**
	 * The feature id for the '<em><b>ELp Cons Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR__ELP_CONS_COUNT = SolverPackage.GENERATOR__ELP_CONS_COUNT;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR__CODE = SolverPackage.GENERATOR__CODE;

	/**
	 * The feature id for the '<em><b>Solution Provider</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR__SOLUTION_PROVIDER = SolverPackage.GENERATOR__SOLUTION_PROVIDER;

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
	 * The operation id for the '<em>Accept Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR___ACCEPT_SOLUTION__SOLUTION = SolverPackage.GENERATOR___ACCEPT_SOLUTION__SOLUTION;

	/**
	 * The operation id for the '<em>Select Feature Mode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR___SELECT_FEATURE_MODE__GENERATORFEATUREMODE_GENERATORTUPLE = SolverPackage.GENERATOR___SELECT_FEATURE_MODE__GENERATORFEATUREMODE_GENERATORTUPLE;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GENERATOR___VISIT_TUPLES__ITUPLEVISITOR = SolverPackage.GENERATOR___VISIT_TUPLES__ITUPLEVISITOR;

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
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_TUPLE__CODE = SolverPackage.GENERATOR_TUPLE__CODE;

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
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_TUPLE___GET_GENERATOR = SolverPackage.GENERATOR_TUPLE___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_TUPLE___VISIT_TUPLES__ITUPLEVISITOR = SolverPackage.GENERATOR_TUPLE___VISIT_TUPLES__ITUPLEVISITOR;

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
