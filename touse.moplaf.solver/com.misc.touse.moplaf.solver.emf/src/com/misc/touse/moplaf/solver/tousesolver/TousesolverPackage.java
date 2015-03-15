/**
 */
package com.misc.touse.moplaf.solver.tousesolver;

import com.misc.common.moplaf.solver.SolverPackage;
import com.misc.common.moplaf.solver.solvercplex.SolvercplexPackage;
import com.misc.common.moplaf.solver.solverglpk.SolverglpkPackage;
import com.misc.common.moplaf.solver.solverjavailp.SolverjavailpPackage;
import com.misc.common.moplaf.solver.solverneos.SolverneosPackage;
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
 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverFactory
 * @model kind="package"
 * @generated
 */
public interface TousesolverPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tousesolver";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.misc.touse.moplaf.solver.emf";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tos";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TousesolverPackage eINSTANCE = com.misc.touse.moplaf.solver.tousesolver.impl.TousesolverPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.solver.tousesolver.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.solver.tousesolver.impl.DomainImpl
	 * @see com.misc.touse.moplaf.solver.tousesolver.impl.TousesolverPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Root Folder</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__ROOT_FOLDER = 0;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.solver.tousesolver.impl.DomainObjectImpl <em>Domain Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.solver.tousesolver.impl.DomainObjectImpl
	 * @see com.misc.touse.moplaf.solver.tousesolver.impl.TousesolverPackageImpl#getDomainObject()
	 * @generated
	 */
	int DOMAIN_OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__SHORT_NAME = 1;

	/**
	 * The number of structural features of the '<em>Domain Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Domain Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.solver.tousesolver.impl.KnapsackImpl <em>Knapsack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.solver.tousesolver.impl.KnapsackImpl
	 * @see com.misc.touse.moplaf.solver.tousesolver.impl.TousesolverPackageImpl#getKnapsack()
	 * @generated
	 */
	int KNAPSACK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK__NAME = DOMAIN_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK__SHORT_NAME = DOMAIN_OBJECT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK__CAPACITY = DOMAIN_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Knapsack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_FEATURE_COUNT = DOMAIN_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Knapsack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_OPERATION_COUNT = DOMAIN_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.solver.tousesolver.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.solver.tousesolver.impl.ItemImpl
	 * @see com.misc.touse.moplaf.solver.tousesolver.impl.TousesolverPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__NAME = DOMAIN_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__SHORT_NAME = DOMAIN_OBJECT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__WEIGHT = DOMAIN_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__VALUE = DOMAIN_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = DOMAIN_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = DOMAIN_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.solver.tousesolver.impl.DomainObjectFolderImpl <em>Domain Object Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.solver.tousesolver.impl.DomainObjectFolderImpl
	 * @see com.misc.touse.moplaf.solver.tousesolver.impl.TousesolverPackageImpl#getDomainObjectFolder()
	 * @generated
	 */
	int DOMAIN_OBJECT_FOLDER = 4;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_FOLDER__OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Sub Folder</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_FOLDER__SUB_FOLDER = 1;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_FOLDER__SCENARIO = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_FOLDER__NAME = 3;

	/**
	 * The number of structural features of the '<em>Domain Object Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_FOLDER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Domain Object Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_FOLDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.solver.tousesolver.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.solver.tousesolver.impl.ScenarioImpl
	 * @see com.misc.touse.moplaf.solver.tousesolver.impl.TousesolverPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 5;

	/**
	 * The feature id for the '<em><b>Knapsack</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__KNAPSACK = 0;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__ITEM = 1;

	/**
	 * The feature id for the '<em><b>LP</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__LP = 2;

	/**
	 * The feature id for the '<em><b>Sol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__SOL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__NAME = 4;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__REMARKS = 5;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.solver.tousesolver.impl.KnapsackSolImpl <em>Knapsack Sol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.solver.tousesolver.impl.KnapsackSolImpl
	 * @see com.misc.touse.moplaf.solver.tousesolver.impl.TousesolverPackageImpl#getKnapsackSol()
	 * @generated
	 */
	int KNAPSACK_SOL = 6;

	/**
	 * The feature id for the '<em><b>Total Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_SOL__TOTAL_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Total Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_SOL__TOTAL_WEIGHT = 1;

	/**
	 * The feature id for the '<em><b>Solver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_SOL__SOLVER = 2;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_SOL__ITEM = 3;

	/**
	 * The feature id for the '<em><b>Lp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_SOL__LP = 4;

	/**
	 * The number of structural features of the '<em>Knapsack Sol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_SOL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Knapsack Sol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_SOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.solver.tousesolver.impl.KnapsackLpImpl <em>Knapsack Lp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.solver.tousesolver.impl.KnapsackLpImpl
	 * @see com.misc.touse.moplaf.solver.tousesolver.impl.TousesolverPackageImpl#getKnapsackLp()
	 * @generated
	 */
	int KNAPSACK_LP = 7;

	/**
	 * The feature id for the '<em><b>Tuple Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP__TUPLE_ROOT = SolverPackage.GENERATOR__TUPLE_ROOT;

	/**
	 * The feature id for the '<em><b>Generator Feature Modes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP__GENERATOR_FEATURE_MODES = SolverPackage.GENERATOR__GENERATOR_FEATURE_MODES;

	/**
	 * The feature id for the '<em><b>Objective Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP__OBJECTIVE_TYPE = SolverPackage.GENERATOR__OBJECTIVE_TYPE;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP__REMARKS = SolverPackage.GENERATOR__REMARKS;

	/**
	 * The feature id for the '<em><b>Footprint Nof Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP__FOOTPRINT_NOF_VARS = SolverPackage.GENERATOR__FOOTPRINT_NOF_VARS;

	/**
	 * The feature id for the '<em><b>Footprint Nof Cons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP__FOOTPRINT_NOF_CONS = SolverPackage.GENERATOR__FOOTPRINT_NOF_CONS;

	/**
	 * The feature id for the '<em><b>Footprint Nof Terms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP__FOOTPRINT_NOF_TERMS = SolverPackage.GENERATOR__FOOTPRINT_NOF_TERMS;

	/**
	 * The feature id for the '<em><b>Count Cons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP__COUNT_CONS = SolverPackage.GENERATOR__COUNT_CONS;

	/**
	 * The feature id for the '<em><b>Count Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP__COUNT_VARS = SolverPackage.GENERATOR__COUNT_VARS;

	/**
	 * The feature id for the '<em><b>ELp Var Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP__ELP_VAR_COUNT = SolverPackage.GENERATOR__ELP_VAR_COUNT;

	/**
	 * The feature id for the '<em><b>ELp Cons Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP__ELP_CONS_COUNT = SolverPackage.GENERATOR__ELP_CONS_COUNT;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP__CODE = SolverPackage.GENERATOR__CODE;

	/**
	 * The feature id for the '<em><b>Solution Provider</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP__SOLUTION_PROVIDER = SolverPackage.GENERATOR__SOLUTION_PROVIDER;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP__SELECTED = SolverPackage.GENERATOR__SELECTED;

	/**
	 * The feature id for the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP__ROOT = SolverPackage.GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP__SCENARIO = SolverPackage.GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>GLPK</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP__GLPK = SolverPackage.GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Java ILP</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP__JAVA_ILP = SolverPackage.GENERATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Neos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP__NEOS = SolverPackage.GENERATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Reader</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP__READER = SolverPackage.GENERATOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cplex</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP__CPLEX = SolverPackage.GENERATOR_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Knapsack Lp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP_FEATURE_COUNT = SolverPackage.GENERATOR_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP___GENERATE = SolverPackage.GENERATOR___GENERATE;

	/**
	 * The operation id for the '<em>Generate Root Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP___GENERATE_ROOT_TUPLES = SolverPackage.GENERATOR___GENERATE_ROOT_TUPLES;

	/**
	 * The operation id for the '<em>Generate Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP___GENERATE_TUPLES = SolverPackage.GENERATOR___GENERATE_TUPLES;

	/**
	 * The operation id for the '<em>Generate Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP___GENERATE_VARS = SolverPackage.GENERATOR___GENERATE_VARS;

	/**
	 * The operation id for the '<em>Generate Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP___GENERATE_CONS = SolverPackage.GENERATOR___GENERATE_CONS;

	/**
	 * The operation id for the '<em>Accept Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP___ACCEPT_SOLUTION__SOLUTION_1 = SolverPackage.GENERATOR___ACCEPT_SOLUTION__SOLUTION;

	/**
	 * The operation id for the '<em>Select Feature Mode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP___SELECT_FEATURE_MODE__GENERATORFEATUREMODE_GENERATORTUPLE_1 = SolverPackage.GENERATOR___SELECT_FEATURE_MODE__GENERATORFEATUREMODE_GENERATORTUPLE;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP___VISIT_TUPLES__ITUPLEVISITOR_1 = SolverPackage.GENERATOR___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The number of operations of the '<em>Knapsack Lp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP_OPERATION_COUNT = SolverPackage.GENERATOR_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.solver.tousesolver.impl.LpRootImpl <em>Lp Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.solver.tousesolver.impl.LpRootImpl
	 * @see com.misc.touse.moplaf.solver.tousesolver.impl.TousesolverPackageImpl#getLpRoot()
	 * @generated
	 */
	int LP_ROOT = 8;

	/**
	 * The feature id for the '<em><b>Generator As Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROOT__GENERATOR_AS_ROOT = SolverPackage.GENERATOR_TUPLE__GENERATOR_AS_ROOT;

	/**
	 * The feature id for the '<em><b>Tuple Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROOT__TUPLE_ELEMENT = SolverPackage.GENERATOR_TUPLE__TUPLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Tuple Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROOT__TUPLE_CONTAINER = SolverPackage.GENERATOR_TUPLE__TUPLE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROOT__VAR = SolverPackage.GENERATOR_TUPLE__VAR;

	/**
	 * The feature id for the '<em><b>Cons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROOT__CONS = SolverPackage.GENERATOR_TUPLE__CONS;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROOT__CODE = SolverPackage.GENERATOR_TUPLE__CODE;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROOT__ITEM = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Knapsack</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROOT__KNAPSACK = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lp Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROOT_FEATURE_COUNT = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Generate Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROOT___GENERATE_VARS = SolverPackage.GENERATOR_TUPLE___GENERATE_VARS;

	/**
	 * The operation id for the '<em>Generate Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROOT___GENERATE_CONS = SolverPackage.GENERATOR_TUPLE___GENERATE_CONS;

	/**
	 * The operation id for the '<em>Generate Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROOT___GENERATE_TUPLES = SolverPackage.GENERATOR_TUPLE___GENERATE_TUPLES;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROOT___GET_GENERATOR = SolverPackage.GENERATOR_TUPLE___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROOT___VISIT_TUPLES__ITUPLEVISITOR_1 = SolverPackage.GENERATOR_TUPLE___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The number of operations of the '<em>Lp Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROOT_OPERATION_COUNT = SolverPackage.GENERATOR_TUPLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.solver.tousesolver.impl.LpKnapsackImpl <em>Lp Knapsack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.solver.tousesolver.impl.LpKnapsackImpl
	 * @see com.misc.touse.moplaf.solver.tousesolver.impl.TousesolverPackageImpl#getLpKnapsack()
	 * @generated
	 */
	int LP_KNAPSACK = 9;

	/**
	 * The feature id for the '<em><b>Generator As Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_KNAPSACK__GENERATOR_AS_ROOT = SolverPackage.GENERATOR_TUPLE__GENERATOR_AS_ROOT;

	/**
	 * The feature id for the '<em><b>Tuple Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_KNAPSACK__TUPLE_ELEMENT = SolverPackage.GENERATOR_TUPLE__TUPLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Tuple Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_KNAPSACK__TUPLE_CONTAINER = SolverPackage.GENERATOR_TUPLE__TUPLE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_KNAPSACK__VAR = SolverPackage.GENERATOR_TUPLE__VAR;

	/**
	 * The feature id for the '<em><b>Cons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_KNAPSACK__CONS = SolverPackage.GENERATOR_TUPLE__CONS;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_KNAPSACK__CODE = SolverPackage.GENERATOR_TUPLE__CODE;

	/**
	 * The feature id for the '<em><b>Knapsack</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_KNAPSACK__KNAPSACK = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cons Capacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_KNAPSACK__CONS_CAPACITY = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lp Knapsack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_KNAPSACK_FEATURE_COUNT = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Generate Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_KNAPSACK___GENERATE_VARS = SolverPackage.GENERATOR_TUPLE___GENERATE_VARS;

	/**
	 * The operation id for the '<em>Generate Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_KNAPSACK___GENERATE_CONS = SolverPackage.GENERATOR_TUPLE___GENERATE_CONS;

	/**
	 * The operation id for the '<em>Generate Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_KNAPSACK___GENERATE_TUPLES = SolverPackage.GENERATOR_TUPLE___GENERATE_TUPLES;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_KNAPSACK___GET_GENERATOR = SolverPackage.GENERATOR_TUPLE___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_KNAPSACK___VISIT_TUPLES__ITUPLEVISITOR_1 = SolverPackage.GENERATOR_TUPLE___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The number of operations of the '<em>Lp Knapsack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_KNAPSACK_OPERATION_COUNT = SolverPackage.GENERATOR_TUPLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.solver.tousesolver.impl.LpItemImpl <em>Lp Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.solver.tousesolver.impl.LpItemImpl
	 * @see com.misc.touse.moplaf.solver.tousesolver.impl.TousesolverPackageImpl#getLpItem()
	 * @generated
	 */
	int LP_ITEM = 10;

	/**
	 * The feature id for the '<em><b>Generator As Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ITEM__GENERATOR_AS_ROOT = SolverPackage.GENERATOR_TUPLE__GENERATOR_AS_ROOT;

	/**
	 * The feature id for the '<em><b>Tuple Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ITEM__TUPLE_ELEMENT = SolverPackage.GENERATOR_TUPLE__TUPLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Tuple Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ITEM__TUPLE_CONTAINER = SolverPackage.GENERATOR_TUPLE__TUPLE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ITEM__VAR = SolverPackage.GENERATOR_TUPLE__VAR;

	/**
	 * The feature id for the '<em><b>Cons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ITEM__CONS = SolverPackage.GENERATOR_TUPLE__CONS;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ITEM__CODE = SolverPackage.GENERATOR_TUPLE__CODE;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ITEM__ITEM = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Var In Knapsack</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ITEM__VAR_IN_KNAPSACK = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lp Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ITEM_FEATURE_COUNT = SolverPackage.GENERATOR_TUPLE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Generate Vars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ITEM___GENERATE_VARS = SolverPackage.GENERATOR_TUPLE___GENERATE_VARS;

	/**
	 * The operation id for the '<em>Generate Cons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ITEM___GENERATE_CONS = SolverPackage.GENERATOR_TUPLE___GENERATE_CONS;

	/**
	 * The operation id for the '<em>Generate Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ITEM___GENERATE_TUPLES = SolverPackage.GENERATOR_TUPLE___GENERATE_TUPLES;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ITEM___GET_GENERATOR = SolverPackage.GENERATOR_TUPLE___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ITEM___VISIT_TUPLES__ITUPLEVISITOR_1 = SolverPackage.GENERATOR_TUPLE___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The number of operations of the '<em>Lp Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ITEM_OPERATION_COUNT = SolverPackage.GENERATOR_TUPLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.solver.tousesolver.impl.VarItemInKnapsackImpl <em>Var Item In Knapsack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.solver.tousesolver.impl.VarItemInKnapsackImpl
	 * @see com.misc.touse.moplaf.solver.tousesolver.impl.TousesolverPackageImpl#getVarItemInKnapsack()
	 * @generated
	 */
	int VAR_ITEM_IN_KNAPSACK = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_ITEM_IN_KNAPSACK__NAME = SolverPackage.GENERATOR_LP_VAR__NAME;

	/**
	 * The feature id for the '<em><b>Tuple</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_ITEM_IN_KNAPSACK__TUPLE = SolverPackage.GENERATOR_LP_VAR__TUPLE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_ITEM_IN_KNAPSACK__CODE = SolverPackage.GENERATOR_LP_VAR__CODE;

	/**
	 * The feature id for the '<em><b>Selected Solution Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_ITEM_IN_KNAPSACK__SELECTED_SOLUTION_DISPLAY = SolverPackage.GENERATOR_LP_VAR__SELECTED_SOLUTION_DISPLAY;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_ITEM_IN_KNAPSACK__SOLUTION = SolverPackage.GENERATOR_LP_VAR__SOLUTION;

	/**
	 * The feature id for the '<em><b>Selected Solution Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_ITEM_IN_KNAPSACK__SELECTED_SOLUTION_VALUE = SolverPackage.GENERATOR_LP_VAR__SELECTED_SOLUTION_VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_ITEM_IN_KNAPSACK__TYPE = SolverPackage.GENERATOR_LP_VAR__TYPE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_ITEM_IN_KNAPSACK__LOWER_BOUND = SolverPackage.GENERATOR_LP_VAR__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_ITEM_IN_KNAPSACK__UPPER_BOUND = SolverPackage.GENERATOR_LP_VAR__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Objective Coeff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_ITEM_IN_KNAPSACK__OBJECTIVE_COEFF = SolverPackage.GENERATOR_LP_VAR__OBJECTIVE_COEFF;

	/**
	 * The number of structural features of the '<em>Var Item In Knapsack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_ITEM_IN_KNAPSACK_FEATURE_COUNT = SolverPackage.GENERATOR_LP_VAR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Solution Var</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_ITEM_IN_KNAPSACK___GET_SOLUTION_VAR__SOLUTION_1 = SolverPackage.GENERATOR_LP_VAR___GET_SOLUTION_VAR__SOLUTION;

	/**
	 * The operation id for the '<em>Is Solution One</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_ITEM_IN_KNAPSACK___IS_SOLUTION_ONE__SOLUTION_1 = SolverPackage.GENERATOR_LP_VAR___IS_SOLUTION_ONE__SOLUTION;

	/**
	 * The operation id for the '<em>Is Solution Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_ITEM_IN_KNAPSACK___IS_SOLUTION_ZERO__SOLUTION_1 = SolverPackage.GENERATOR_LP_VAR___IS_SOLUTION_ZERO__SOLUTION;

	/**
	 * The operation id for the '<em>Get Solution Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_ITEM_IN_KNAPSACK___GET_SOLUTION_VALUE__SOLUTION_1 = SolverPackage.GENERATOR_LP_VAR___GET_SOLUTION_VALUE__SOLUTION;

	/**
	 * The number of operations of the '<em>Var Item In Knapsack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_ITEM_IN_KNAPSACK_OPERATION_COUNT = SolverPackage.GENERATOR_LP_VAR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.solver.tousesolver.impl.ConsKnapsackCapacityImpl <em>Cons Knapsack Capacity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.solver.tousesolver.impl.ConsKnapsackCapacityImpl
	 * @see com.misc.touse.moplaf.solver.tousesolver.impl.TousesolverPackageImpl#getConsKnapsackCapacity()
	 * @generated
	 */
	int CONS_KNAPSACK_CAPACITY = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONS_KNAPSACK_CAPACITY__NAME = SolverPackage.GENERATOR_LP_CONS__NAME;

	/**
	 * The feature id for the '<em><b>Tuple</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONS_KNAPSACK_CAPACITY__TUPLE = SolverPackage.GENERATOR_LP_CONS__TUPLE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONS_KNAPSACK_CAPACITY__CODE = SolverPackage.GENERATOR_LP_CONS__CODE;

	/**
	 * The feature id for the '<em><b>Selected Solution Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONS_KNAPSACK_CAPACITY__SELECTED_SOLUTION_DISPLAY = SolverPackage.GENERATOR_LP_CONS__SELECTED_SOLUTION_DISPLAY;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONS_KNAPSACK_CAPACITY__SOLUTION = SolverPackage.GENERATOR_LP_CONS__SOLUTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONS_KNAPSACK_CAPACITY__TYPE = SolverPackage.GENERATOR_LP_CONS__TYPE;

	/**
	 * The feature id for the '<em><b>Lp Term</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONS_KNAPSACK_CAPACITY__LP_TERM = SolverPackage.GENERATOR_LP_CONS__LP_TERM;

	/**
	 * The feature id for the '<em><b>Righ Hand Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONS_KNAPSACK_CAPACITY__RIGH_HAND_SIDE = SolverPackage.GENERATOR_LP_CONS__RIGH_HAND_SIDE;

	/**
	 * The number of structural features of the '<em>Cons Knapsack Capacity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONS_KNAPSACK_CAPACITY_FEATURE_COUNT = SolverPackage.GENERATOR_LP_CONS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONS_KNAPSACK_CAPACITY___GENERATE = SolverPackage.GENERATOR_LP_CONS___GENERATE;

	/**
	 * The operation id for the '<em>Get Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONS_KNAPSACK_CAPACITY___GET_SOLUTION__SOLUTION_1 = SolverPackage.GENERATOR_LP_CONS___GET_SOLUTION__SOLUTION;

	/**
	 * The operation id for the '<em>Construct Term</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONS_KNAPSACK_CAPACITY___CONSTRUCT_TERM__GENERATORLPVAR_FLOAT_1 = SolverPackage.GENERATOR_LP_CONS___CONSTRUCT_TERM__GENERATORLPVAR_FLOAT;

	/**
	 * The number of operations of the '<em>Cons Knapsack Capacity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONS_KNAPSACK_CAPACITY_OPERATION_COUNT = SolverPackage.GENERATOR_LP_CONS_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.solver.tousesolver.impl.SolverToUseGLPKImpl <em>Solver To Use GLPK</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.solver.tousesolver.impl.SolverToUseGLPKImpl
	 * @see com.misc.touse.moplaf.solver.tousesolver.impl.TousesolverPackageImpl#getSolverToUseGLPK()
	 * @generated
	 */
	int SOLVER_TO_USE_GLPK = 13;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK__SOLUTION = SolverglpkPackage.SOLVER_GLPK__SOLUTION;

	/**
	 * The feature id for the '<em><b>Current Solution Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK__CURRENT_SOLUTION_NR = SolverglpkPackage.SOLVER_GLPK__CURRENT_SOLUTION_NR;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK__CODE = SolverglpkPackage.SOLVER_GLPK__CODE;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK__REMARKS = SolverglpkPackage.SOLVER_GLPK__REMARKS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK__STATUS = SolverglpkPackage.SOLVER_GLPK__STATUS;

	/**
	 * The feature id for the '<em><b>Solver Max Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK__SOLVER_MAX_DURATION = SolverglpkPackage.SOLVER_GLPK__SOLVER_MAX_DURATION;

	/**
	 * The feature id for the '<em><b>Solver Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK__SOLVER_BACKGROUND = SolverglpkPackage.SOLVER_GLPK__SOLVER_BACKGROUND;

	/**
	 * The feature id for the '<em><b>Sol Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK__SOL_VALUE = SolverglpkPackage.SOLVER_GLPK__SOL_VALUE;

	/**
	 * The feature id for the '<em><b>Solver Log Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK__SOLVER_LOG_LEVEL = SolverglpkPackage.SOLVER_GLPK__SOLVER_LOG_LEVEL;

	/**
	 * The feature id for the '<em><b>Solver Dump</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK__SOLVER_DUMP = SolverglpkPackage.SOLVER_GLPK__SOLVER_DUMP;

	/**
	 * The feature id for the '<em><b>Run Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK__RUN_STARTED = SolverglpkPackage.SOLVER_GLPK__RUN_STARTED;

	/**
	 * The feature id for the '<em><b>Run Initialization Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK__RUN_INITIALIZATION_ENDED = SolverglpkPackage.SOLVER_GLPK__RUN_INITIALIZATION_ENDED;

	/**
	 * The feature id for the '<em><b>Run Solving Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK__RUN_SOLVING_ENDED = SolverglpkPackage.SOLVER_GLPK__RUN_SOLVING_ENDED;

	/**
	 * The feature id for the '<em><b>Run Finalization Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK__RUN_FINALIZATION_ENDED = SolverglpkPackage.SOLVER_GLPK__RUN_FINALIZATION_ENDED;

	/**
	 * The feature id for the '<em><b>Run Duration Initialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK__RUN_DURATION_INITIALIZATION = SolverglpkPackage.SOLVER_GLPK__RUN_DURATION_INITIALIZATION;

	/**
	 * The feature id for the '<em><b>Run Duration Finalization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK__RUN_DURATION_FINALIZATION = SolverglpkPackage.SOLVER_GLPK__RUN_DURATION_FINALIZATION;

	/**
	 * The feature id for the '<em><b>Run Duration Solving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK__RUN_DURATION_SOLVING = SolverglpkPackage.SOLVER_GLPK__RUN_DURATION_SOLVING;

	/**
	 * The feature id for the '<em><b>Run Request Terminate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK__RUN_REQUEST_TERMINATE = SolverglpkPackage.SOLVER_GLPK__RUN_REQUEST_TERMINATE;

	/**
	 * The feature id for the '<em><b>Sol Unfeasible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK__SOL_UNFEASIBLE = SolverglpkPackage.SOLVER_GLPK__SOL_UNFEASIBLE;

	/**
	 * The feature id for the '<em><b>Sol Feasible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK__SOL_FEASIBLE = SolverglpkPackage.SOLVER_GLPK__SOL_FEASIBLE;

	/**
	 * The feature id for the '<em><b>Sol Optimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK__SOL_OPTIMAL = SolverglpkPackage.SOLVER_GLPK__SOL_OPTIMAL;

	/**
	 * The feature id for the '<em><b>Run Interrupted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK__RUN_INTERRUPTED = SolverglpkPackage.SOLVER_GLPK__RUN_INTERRUPTED;

	/**
	 * The feature id for the '<em><b>Solving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK__SOLVING = SolverglpkPackage.SOLVER_GLPK__SOLVING;

	/**
	 * The feature id for the '<em><b>Finalizing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK__FINALIZING = SolverglpkPackage.SOLVER_GLPK__FINALIZING;

	/**
	 * The feature id for the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK__FINISHED = SolverglpkPackage.SOLVER_GLPK__FINISHED;

	/**
	 * The feature id for the '<em><b>Run Time Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK__RUN_TIME_OUT = SolverglpkPackage.SOLVER_GLPK__RUN_TIME_OUT;

	/**
	 * The feature id for the '<em><b>Initializing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK__INITIALIZING = SolverglpkPackage.SOLVER_GLPK__INITIALIZING;

	/**
	 * The feature id for the '<em><b>Solver Optimality Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK__SOLVER_OPTIMALITY_TOLERANCE = SolverglpkPackage.SOLVER_GLPK__SOLVER_OPTIMALITY_TOLERANCE;

	/**
	 * The feature id for the '<em><b>Solver Linear Relaxation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK__SOLVER_LINEAR_RELAXATION = SolverglpkPackage.SOLVER_GLPK__SOLVER_LINEAR_RELAXATION;

	/**
	 * The feature id for the '<em><b>Sol Optimality Gap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK__SOL_OPTIMALITY_GAP = SolverglpkPackage.SOLVER_GLPK__SOL_OPTIMALITY_GAP;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK__FILE_PATH = SolverglpkPackage.SOLVER_GLPK__FILE_PATH;

	/**
	 * The feature id for the '<em><b>File Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK__FILE_FORMAT = SolverglpkPackage.SOLVER_GLPK__FILE_FORMAT;

	/**
	 * The feature id for the '<em><b>File Compressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK__FILE_COMPRESSED = SolverglpkPackage.SOLVER_GLPK__FILE_COMPRESSED;

	/**
	 * The feature id for the '<em><b>Enable Feasibility Pump</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK__ENABLE_FEASIBILITY_PUMP = SolverglpkPackage.SOLVER_GLPK__ENABLE_FEASIBILITY_PUMP;

	/**
	 * The feature id for the '<em><b>Enable Gomory Cuts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK__ENABLE_GOMORY_CUTS = SolverglpkPackage.SOLVER_GLPK__ENABLE_GOMORY_CUTS;

	/**
	 * The feature id for the '<em><b>Enable Generating Mixed Cover Cuts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK__ENABLE_GENERATING_MIXED_COVER_CUTS = SolverglpkPackage.SOLVER_GLPK__ENABLE_GENERATING_MIXED_COVER_CUTS;

	/**
	 * The feature id for the '<em><b>Enable Generating Clique Cuts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK__ENABLE_GENERATING_CLIQUE_CUTS = SolverglpkPackage.SOLVER_GLPK__ENABLE_GENERATING_CLIQUE_CUTS;

	/**
	 * The feature id for the '<em><b>Enable Mixed Integer Rounding Cuts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK__ENABLE_MIXED_INTEGER_ROUNDING_CUTS = SolverglpkPackage.SOLVER_GLPK__ENABLE_MIXED_INTEGER_ROUNDING_CUTS;

	/**
	 * The number of structural features of the '<em>Solver To Use GLPK</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK_FEATURE_COUNT = SolverglpkPackage.SOLVER_GLPK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Parent Generator Tool</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK___GET_PARENT_GENERATOR_TOOL = SolverglpkPackage.SOLVER_GLPK___GET_PARENT_GENERATOR_TOOL;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK___GET_GENERATOR = SolverglpkPackage.SOLVER_GLPK___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Solution Factory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK___SOLUTION_FACTORY = SolverglpkPackage.SOLVER_GLPK___SOLUTION_FACTORY;

	/**
	 * The operation id for the '<em>Construct Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK___CONSTRUCT_SOLUTION = SolverglpkPackage.SOLVER_GLPK___CONSTRUCT_SOLUTION;

	/**
	 * The operation id for the '<em>Solve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK___SOLVE = SolverglpkPackage.SOLVER_GLPK___SOLVE;

	/**
	 * The operation id for the '<em>Write Lp To File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK___WRITE_LP_TO_FILE = SolverglpkPackage.SOLVER_GLPK___WRITE_LP_TO_FILE;

	/**
	 * The operation id for the '<em>Get Lp As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK___GET_LP_AS_STRING = SolverglpkPackage.SOLVER_GLPK___GET_LP_AS_STRING;

	/**
	 * The number of operations of the '<em>Solver To Use GLPK</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_GLPK_OPERATION_COUNT = SolverglpkPackage.SOLVER_GLPK_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.solver.tousesolver.impl.SolverToUseJavaILPImpl <em>Solver To Use Java ILP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.solver.tousesolver.impl.SolverToUseJavaILPImpl
	 * @see com.misc.touse.moplaf.solver.tousesolver.impl.TousesolverPackageImpl#getSolverToUseJavaILP()
	 * @generated
	 */
	int SOLVER_TO_USE_JAVA_ILP = 14;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP__SOLUTION = SolverjavailpPackage.SOLVER_JAVA_ILP__SOLUTION;

	/**
	 * The feature id for the '<em><b>Current Solution Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP__CURRENT_SOLUTION_NR = SolverjavailpPackage.SOLVER_JAVA_ILP__CURRENT_SOLUTION_NR;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP__CODE = SolverjavailpPackage.SOLVER_JAVA_ILP__CODE;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP__REMARKS = SolverjavailpPackage.SOLVER_JAVA_ILP__REMARKS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP__STATUS = SolverjavailpPackage.SOLVER_JAVA_ILP__STATUS;

	/**
	 * The feature id for the '<em><b>Solver Max Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP__SOLVER_MAX_DURATION = SolverjavailpPackage.SOLVER_JAVA_ILP__SOLVER_MAX_DURATION;

	/**
	 * The feature id for the '<em><b>Solver Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP__SOLVER_BACKGROUND = SolverjavailpPackage.SOLVER_JAVA_ILP__SOLVER_BACKGROUND;

	/**
	 * The feature id for the '<em><b>Sol Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP__SOL_VALUE = SolverjavailpPackage.SOLVER_JAVA_ILP__SOL_VALUE;

	/**
	 * The feature id for the '<em><b>Solver Log Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP__SOLVER_LOG_LEVEL = SolverjavailpPackage.SOLVER_JAVA_ILP__SOLVER_LOG_LEVEL;

	/**
	 * The feature id for the '<em><b>Solver Dump</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP__SOLVER_DUMP = SolverjavailpPackage.SOLVER_JAVA_ILP__SOLVER_DUMP;

	/**
	 * The feature id for the '<em><b>Run Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP__RUN_STARTED = SolverjavailpPackage.SOLVER_JAVA_ILP__RUN_STARTED;

	/**
	 * The feature id for the '<em><b>Run Initialization Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP__RUN_INITIALIZATION_ENDED = SolverjavailpPackage.SOLVER_JAVA_ILP__RUN_INITIALIZATION_ENDED;

	/**
	 * The feature id for the '<em><b>Run Solving Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP__RUN_SOLVING_ENDED = SolverjavailpPackage.SOLVER_JAVA_ILP__RUN_SOLVING_ENDED;

	/**
	 * The feature id for the '<em><b>Run Finalization Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP__RUN_FINALIZATION_ENDED = SolverjavailpPackage.SOLVER_JAVA_ILP__RUN_FINALIZATION_ENDED;

	/**
	 * The feature id for the '<em><b>Run Duration Initialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP__RUN_DURATION_INITIALIZATION = SolverjavailpPackage.SOLVER_JAVA_ILP__RUN_DURATION_INITIALIZATION;

	/**
	 * The feature id for the '<em><b>Run Duration Finalization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP__RUN_DURATION_FINALIZATION = SolverjavailpPackage.SOLVER_JAVA_ILP__RUN_DURATION_FINALIZATION;

	/**
	 * The feature id for the '<em><b>Run Duration Solving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP__RUN_DURATION_SOLVING = SolverjavailpPackage.SOLVER_JAVA_ILP__RUN_DURATION_SOLVING;

	/**
	 * The feature id for the '<em><b>Run Request Terminate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP__RUN_REQUEST_TERMINATE = SolverjavailpPackage.SOLVER_JAVA_ILP__RUN_REQUEST_TERMINATE;

	/**
	 * The feature id for the '<em><b>Sol Unfeasible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP__SOL_UNFEASIBLE = SolverjavailpPackage.SOLVER_JAVA_ILP__SOL_UNFEASIBLE;

	/**
	 * The feature id for the '<em><b>Sol Feasible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP__SOL_FEASIBLE = SolverjavailpPackage.SOLVER_JAVA_ILP__SOL_FEASIBLE;

	/**
	 * The feature id for the '<em><b>Sol Optimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP__SOL_OPTIMAL = SolverjavailpPackage.SOLVER_JAVA_ILP__SOL_OPTIMAL;

	/**
	 * The feature id for the '<em><b>Run Interrupted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP__RUN_INTERRUPTED = SolverjavailpPackage.SOLVER_JAVA_ILP__RUN_INTERRUPTED;

	/**
	 * The feature id for the '<em><b>Solving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP__SOLVING = SolverjavailpPackage.SOLVER_JAVA_ILP__SOLVING;

	/**
	 * The feature id for the '<em><b>Finalizing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP__FINALIZING = SolverjavailpPackage.SOLVER_JAVA_ILP__FINALIZING;

	/**
	 * The feature id for the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP__FINISHED = SolverjavailpPackage.SOLVER_JAVA_ILP__FINISHED;

	/**
	 * The feature id for the '<em><b>Run Time Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP__RUN_TIME_OUT = SolverjavailpPackage.SOLVER_JAVA_ILP__RUN_TIME_OUT;

	/**
	 * The feature id for the '<em><b>Initializing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP__INITIALIZING = SolverjavailpPackage.SOLVER_JAVA_ILP__INITIALIZING;

	/**
	 * The feature id for the '<em><b>Solver Optimality Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP__SOLVER_OPTIMALITY_TOLERANCE = SolverjavailpPackage.SOLVER_JAVA_ILP__SOLVER_OPTIMALITY_TOLERANCE;

	/**
	 * The feature id for the '<em><b>Solver Linear Relaxation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP__SOLVER_LINEAR_RELAXATION = SolverjavailpPackage.SOLVER_JAVA_ILP__SOLVER_LINEAR_RELAXATION;

	/**
	 * The feature id for the '<em><b>Sol Optimality Gap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP__SOL_OPTIMALITY_GAP = SolverjavailpPackage.SOLVER_JAVA_ILP__SOL_OPTIMALITY_GAP;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP__FILE_PATH = SolverjavailpPackage.SOLVER_JAVA_ILP__FILE_PATH;

	/**
	 * The feature id for the '<em><b>File Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP__FILE_FORMAT = SolverjavailpPackage.SOLVER_JAVA_ILP__FILE_FORMAT;

	/**
	 * The feature id for the '<em><b>File Compressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP__FILE_COMPRESSED = SolverjavailpPackage.SOLVER_JAVA_ILP__FILE_COMPRESSED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP__TYPE = SolverjavailpPackage.SOLVER_JAVA_ILP__TYPE;

	/**
	 * The number of structural features of the '<em>Solver To Use Java ILP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP_FEATURE_COUNT = SolverjavailpPackage.SOLVER_JAVA_ILP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Parent Generator Tool</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP___GET_PARENT_GENERATOR_TOOL = SolverjavailpPackage.SOLVER_JAVA_ILP___GET_PARENT_GENERATOR_TOOL;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP___GET_GENERATOR = SolverjavailpPackage.SOLVER_JAVA_ILP___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Solution Factory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP___SOLUTION_FACTORY = SolverjavailpPackage.SOLVER_JAVA_ILP___SOLUTION_FACTORY;

	/**
	 * The operation id for the '<em>Construct Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP___CONSTRUCT_SOLUTION = SolverjavailpPackage.SOLVER_JAVA_ILP___CONSTRUCT_SOLUTION;

	/**
	 * The operation id for the '<em>Solve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP___SOLVE = SolverjavailpPackage.SOLVER_JAVA_ILP___SOLVE;

	/**
	 * The operation id for the '<em>Write Lp To File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP___WRITE_LP_TO_FILE = SolverjavailpPackage.SOLVER_JAVA_ILP___WRITE_LP_TO_FILE;

	/**
	 * The operation id for the '<em>Get Lp As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP___GET_LP_AS_STRING = SolverjavailpPackage.SOLVER_JAVA_ILP___GET_LP_AS_STRING;

	/**
	 * The number of operations of the '<em>Solver To Use Java ILP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_JAVA_ILP_OPERATION_COUNT = SolverjavailpPackage.SOLVER_JAVA_ILP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.solver.tousesolver.impl.SolverToUseNeosImpl <em>Solver To Use Neos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.solver.tousesolver.impl.SolverToUseNeosImpl
	 * @see com.misc.touse.moplaf.solver.tousesolver.impl.TousesolverPackageImpl#getSolverToUseNeos()
	 * @generated
	 */
	int SOLVER_TO_USE_NEOS = 15;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__SOLUTION = SolverneosPackage.SOLVER_NEOS__SOLUTION;

	/**
	 * The feature id for the '<em><b>Current Solution Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__CURRENT_SOLUTION_NR = SolverneosPackage.SOLVER_NEOS__CURRENT_SOLUTION_NR;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__CODE = SolverneosPackage.SOLVER_NEOS__CODE;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__REMARKS = SolverneosPackage.SOLVER_NEOS__REMARKS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__STATUS = SolverneosPackage.SOLVER_NEOS__STATUS;

	/**
	 * The feature id for the '<em><b>Solver Max Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__SOLVER_MAX_DURATION = SolverneosPackage.SOLVER_NEOS__SOLVER_MAX_DURATION;

	/**
	 * The feature id for the '<em><b>Solver Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__SOLVER_BACKGROUND = SolverneosPackage.SOLVER_NEOS__SOLVER_BACKGROUND;

	/**
	 * The feature id for the '<em><b>Sol Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__SOL_VALUE = SolverneosPackage.SOLVER_NEOS__SOL_VALUE;

	/**
	 * The feature id for the '<em><b>Solver Log Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__SOLVER_LOG_LEVEL = SolverneosPackage.SOLVER_NEOS__SOLVER_LOG_LEVEL;

	/**
	 * The feature id for the '<em><b>Solver Dump</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__SOLVER_DUMP = SolverneosPackage.SOLVER_NEOS__SOLVER_DUMP;

	/**
	 * The feature id for the '<em><b>Run Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__RUN_STARTED = SolverneosPackage.SOLVER_NEOS__RUN_STARTED;

	/**
	 * The feature id for the '<em><b>Run Initialization Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__RUN_INITIALIZATION_ENDED = SolverneosPackage.SOLVER_NEOS__RUN_INITIALIZATION_ENDED;

	/**
	 * The feature id for the '<em><b>Run Solving Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__RUN_SOLVING_ENDED = SolverneosPackage.SOLVER_NEOS__RUN_SOLVING_ENDED;

	/**
	 * The feature id for the '<em><b>Run Finalization Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__RUN_FINALIZATION_ENDED = SolverneosPackage.SOLVER_NEOS__RUN_FINALIZATION_ENDED;

	/**
	 * The feature id for the '<em><b>Run Duration Initialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__RUN_DURATION_INITIALIZATION = SolverneosPackage.SOLVER_NEOS__RUN_DURATION_INITIALIZATION;

	/**
	 * The feature id for the '<em><b>Run Duration Finalization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__RUN_DURATION_FINALIZATION = SolverneosPackage.SOLVER_NEOS__RUN_DURATION_FINALIZATION;

	/**
	 * The feature id for the '<em><b>Run Duration Solving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__RUN_DURATION_SOLVING = SolverneosPackage.SOLVER_NEOS__RUN_DURATION_SOLVING;

	/**
	 * The feature id for the '<em><b>Run Request Terminate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__RUN_REQUEST_TERMINATE = SolverneosPackage.SOLVER_NEOS__RUN_REQUEST_TERMINATE;

	/**
	 * The feature id for the '<em><b>Sol Unfeasible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__SOL_UNFEASIBLE = SolverneosPackage.SOLVER_NEOS__SOL_UNFEASIBLE;

	/**
	 * The feature id for the '<em><b>Sol Feasible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__SOL_FEASIBLE = SolverneosPackage.SOLVER_NEOS__SOL_FEASIBLE;

	/**
	 * The feature id for the '<em><b>Sol Optimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__SOL_OPTIMAL = SolverneosPackage.SOLVER_NEOS__SOL_OPTIMAL;

	/**
	 * The feature id for the '<em><b>Run Interrupted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__RUN_INTERRUPTED = SolverneosPackage.SOLVER_NEOS__RUN_INTERRUPTED;

	/**
	 * The feature id for the '<em><b>Solving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__SOLVING = SolverneosPackage.SOLVER_NEOS__SOLVING;

	/**
	 * The feature id for the '<em><b>Finalizing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__FINALIZING = SolverneosPackage.SOLVER_NEOS__FINALIZING;

	/**
	 * The feature id for the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__FINISHED = SolverneosPackage.SOLVER_NEOS__FINISHED;

	/**
	 * The feature id for the '<em><b>Run Time Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__RUN_TIME_OUT = SolverneosPackage.SOLVER_NEOS__RUN_TIME_OUT;

	/**
	 * The feature id for the '<em><b>Initializing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__INITIALIZING = SolverneosPackage.SOLVER_NEOS__INITIALIZING;

	/**
	 * The feature id for the '<em><b>Solver Optimality Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__SOLVER_OPTIMALITY_TOLERANCE = SolverneosPackage.SOLVER_NEOS__SOLVER_OPTIMALITY_TOLERANCE;

	/**
	 * The feature id for the '<em><b>Solver Linear Relaxation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__SOLVER_LINEAR_RELAXATION = SolverneosPackage.SOLVER_NEOS__SOLVER_LINEAR_RELAXATION;

	/**
	 * The feature id for the '<em><b>Sol Optimality Gap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__SOL_OPTIMALITY_GAP = SolverneosPackage.SOLVER_NEOS__SOL_OPTIMALITY_GAP;

	/**
	 * The feature id for the '<em><b>Lp Writer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__LP_WRITER = SolverneosPackage.SOLVER_NEOS__LP_WRITER;

	/**
	 * The feature id for the '<em><b>Sol Reader</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__SOL_READER = SolverneosPackage.SOLVER_NEOS__SOL_READER;

	/**
	 * The feature id for the '<em><b>Server Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__SERVER_HOST = SolverneosPackage.SOLVER_NEOS__SERVER_HOST;

	/**
	 * The feature id for the '<em><b>Server Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__SERVER_PORT = SolverneosPackage.SOLVER_NEOS__SERVER_PORT;

	/**
	 * The feature id for the '<em><b>Solver Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__SOLVER_CATEGORY = SolverneosPackage.SOLVER_NEOS__SOLVER_CATEGORY;

	/**
	 * The feature id for the '<em><b>Solver Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__SOLVER_NAME = SolverneosPackage.SOLVER_NEOS__SOLVER_NAME;

	/**
	 * The feature id for the '<em><b>Solver Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__SOLVER_INPUT = SolverneosPackage.SOLVER_NEOS__SOLVER_INPUT;

	/**
	 * The feature id for the '<em><b>Solver Poll Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__SOLVER_POLL_DURATION = SolverneosPackage.SOLVER_NEOS__SOLVER_POLL_DURATION;

	/**
	 * The feature id for the '<em><b>Job Submitted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__JOB_SUBMITTED = SolverneosPackage.SOLVER_NEOS__JOB_SUBMITTED;

	/**
	 * The feature id for the '<em><b>Job Done</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__JOB_DONE = SolverneosPackage.SOLVER_NEOS__JOB_DONE;

	/**
	 * The feature id for the '<em><b>Job Result Retrieved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__JOB_RESULT_RETRIEVED = SolverneosPackage.SOLVER_NEOS__JOB_RESULT_RETRIEVED;

	/**
	 * The feature id for the '<em><b>Job Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__JOB_NUMBER = SolverneosPackage.SOLVER_NEOS__JOB_NUMBER;

	/**
	 * The feature id for the '<em><b>Job Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__JOB_PASSWORD = SolverneosPackage.SOLVER_NEOS__JOB_PASSWORD;

	/**
	 * The feature id for the '<em><b>Job Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__JOB_STATUS = SolverneosPackage.SOLVER_NEOS__JOB_STATUS;

	/**
	 * The feature id for the '<em><b>Job Last Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__JOB_LAST_STATUS = SolverneosPackage.SOLVER_NEOS__JOB_LAST_STATUS;

	/**
	 * The feature id for the '<em><b>Job Neos Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__JOB_NEOS_STATUS = SolverneosPackage.SOLVER_NEOS__JOB_NEOS_STATUS;

	/**
	 * The feature id for the '<em><b>Job Submitter Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__JOB_SUBMITTER_EMAIL = SolverneosPackage.SOLVER_NEOS__JOB_SUBMITTER_EMAIL;

	/**
	 * The feature id for the '<em><b>Job Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS__JOB_RESULT = SolverneosPackage.SOLVER_NEOS__JOB_RESULT;

	/**
	 * The number of structural features of the '<em>Solver To Use Neos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS_FEATURE_COUNT = SolverneosPackage.SOLVER_NEOS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Parent Generator Tool</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS___GET_PARENT_GENERATOR_TOOL = SolverneosPackage.SOLVER_NEOS___GET_PARENT_GENERATOR_TOOL;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS___GET_GENERATOR = SolverneosPackage.SOLVER_NEOS___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Solution Factory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS___SOLUTION_FACTORY = SolverneosPackage.SOLVER_NEOS___SOLUTION_FACTORY;

	/**
	 * The operation id for the '<em>Construct Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS___CONSTRUCT_SOLUTION = SolverneosPackage.SOLVER_NEOS___CONSTRUCT_SOLUTION;

	/**
	 * The operation id for the '<em>Solve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS___SOLVE = SolverneosPackage.SOLVER_NEOS___SOLVE;

	/**
	 * The operation id for the '<em>Retrieve Job Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS___RETRIEVE_JOB_STATUS = SolverneosPackage.SOLVER_NEOS___RETRIEVE_JOB_STATUS;

	/**
	 * The operation id for the '<em>Retrieve Job Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS___RETRIEVE_JOB_RESULT = SolverneosPackage.SOLVER_NEOS___RETRIEVE_JOB_RESULT;

	/**
	 * The operation id for the '<em>Kill Job</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS___KILL_JOB = SolverneosPackage.SOLVER_NEOS___KILL_JOB;

	/**
	 * The operation id for the '<em>Submit Job</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS___SUBMIT_JOB = SolverneosPackage.SOLVER_NEOS___SUBMIT_JOB;

	/**
	 * The number of operations of the '<em>Solver To Use Neos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USE_NEOS_OPERATION_COUNT = SolverneosPackage.SOLVER_NEOS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.solver.tousesolver.impl.SolutionReaderToUseImpl <em>Solution Reader To Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.solver.tousesolver.impl.SolutionReaderToUseImpl
	 * @see com.misc.touse.moplaf.solver.tousesolver.impl.TousesolverPackageImpl#getSolutionReaderToUse()
	 * @generated
	 */
	int SOLUTION_READER_TO_USE = 16;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_TO_USE__SOLUTION = SolverPackage.SOLUTION_READER__SOLUTION;

	/**
	 * The feature id for the '<em><b>Current Solution Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_TO_USE__CURRENT_SOLUTION_NR = SolverPackage.SOLUTION_READER__CURRENT_SOLUTION_NR;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_TO_USE__CODE = SolverPackage.SOLUTION_READER__CODE;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_TO_USE__FILE_PATH = SolverPackage.SOLUTION_READER__FILE_PATH;

	/**
	 * The number of structural features of the '<em>Solution Reader To Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_TO_USE_FEATURE_COUNT = SolverPackage.SOLUTION_READER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Parent Generator Tool</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_TO_USE___GET_PARENT_GENERATOR_TOOL = SolverPackage.SOLUTION_READER___GET_PARENT_GENERATOR_TOOL;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_TO_USE___GET_GENERATOR = SolverPackage.SOLUTION_READER___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Solution Factory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_TO_USE___SOLUTION_FACTORY = SolverPackage.SOLUTION_READER___SOLUTION_FACTORY;

	/**
	 * The operation id for the '<em>Construct Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_TO_USE___CONSTRUCT_SOLUTION = SolverPackage.SOLUTION_READER___CONSTRUCT_SOLUTION;

	/**
	 * The operation id for the '<em>Read Sol From File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_TO_USE___READ_SOL_FROM_FILE = SolverPackage.SOLUTION_READER___READ_SOL_FROM_FILE;

	/**
	 * The operation id for the '<em>Set Sol As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_TO_USE___SET_SOL_AS_STRING__STRING_1 = SolverPackage.SOLUTION_READER___SET_SOL_AS_STRING__STRING;

	/**
	 * The number of operations of the '<em>Solution Reader To Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_READER_TO_USE_OPERATION_COUNT = SolverPackage.SOLUTION_READER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.solver.tousesolver.impl.SolverToUserCplexImpl <em>Solver To User Cplex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.solver.tousesolver.impl.SolverToUserCplexImpl
	 * @see com.misc.touse.moplaf.solver.tousesolver.impl.TousesolverPackageImpl#getSolverToUserCplex()
	 * @generated
	 */
	int SOLVER_TO_USER_CPLEX = 17;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX__SOLUTION = SolvercplexPackage.SOLVER_CPLEX__SOLUTION;

	/**
	 * The feature id for the '<em><b>Current Solution Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX__CURRENT_SOLUTION_NR = SolvercplexPackage.SOLVER_CPLEX__CURRENT_SOLUTION_NR;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX__CODE = SolvercplexPackage.SOLVER_CPLEX__CODE;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX__REMARKS = SolvercplexPackage.SOLVER_CPLEX__REMARKS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX__STATUS = SolvercplexPackage.SOLVER_CPLEX__STATUS;

	/**
	 * The feature id for the '<em><b>Solver Max Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX__SOLVER_MAX_DURATION = SolvercplexPackage.SOLVER_CPLEX__SOLVER_MAX_DURATION;

	/**
	 * The feature id for the '<em><b>Solver Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX__SOLVER_BACKGROUND = SolvercplexPackage.SOLVER_CPLEX__SOLVER_BACKGROUND;

	/**
	 * The feature id for the '<em><b>Sol Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX__SOL_VALUE = SolvercplexPackage.SOLVER_CPLEX__SOL_VALUE;

	/**
	 * The feature id for the '<em><b>Solver Log Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX__SOLVER_LOG_LEVEL = SolvercplexPackage.SOLVER_CPLEX__SOLVER_LOG_LEVEL;

	/**
	 * The feature id for the '<em><b>Solver Dump</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX__SOLVER_DUMP = SolvercplexPackage.SOLVER_CPLEX__SOLVER_DUMP;

	/**
	 * The feature id for the '<em><b>Run Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX__RUN_STARTED = SolvercplexPackage.SOLVER_CPLEX__RUN_STARTED;

	/**
	 * The feature id for the '<em><b>Run Initialization Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX__RUN_INITIALIZATION_ENDED = SolvercplexPackage.SOLVER_CPLEX__RUN_INITIALIZATION_ENDED;

	/**
	 * The feature id for the '<em><b>Run Solving Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX__RUN_SOLVING_ENDED = SolvercplexPackage.SOLVER_CPLEX__RUN_SOLVING_ENDED;

	/**
	 * The feature id for the '<em><b>Run Finalization Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX__RUN_FINALIZATION_ENDED = SolvercplexPackage.SOLVER_CPLEX__RUN_FINALIZATION_ENDED;

	/**
	 * The feature id for the '<em><b>Run Duration Initialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX__RUN_DURATION_INITIALIZATION = SolvercplexPackage.SOLVER_CPLEX__RUN_DURATION_INITIALIZATION;

	/**
	 * The feature id for the '<em><b>Run Duration Finalization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX__RUN_DURATION_FINALIZATION = SolvercplexPackage.SOLVER_CPLEX__RUN_DURATION_FINALIZATION;

	/**
	 * The feature id for the '<em><b>Run Duration Solving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX__RUN_DURATION_SOLVING = SolvercplexPackage.SOLVER_CPLEX__RUN_DURATION_SOLVING;

	/**
	 * The feature id for the '<em><b>Run Request Terminate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX__RUN_REQUEST_TERMINATE = SolvercplexPackage.SOLVER_CPLEX__RUN_REQUEST_TERMINATE;

	/**
	 * The feature id for the '<em><b>Sol Unfeasible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX__SOL_UNFEASIBLE = SolvercplexPackage.SOLVER_CPLEX__SOL_UNFEASIBLE;

	/**
	 * The feature id for the '<em><b>Sol Feasible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX__SOL_FEASIBLE = SolvercplexPackage.SOLVER_CPLEX__SOL_FEASIBLE;

	/**
	 * The feature id for the '<em><b>Sol Optimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX__SOL_OPTIMAL = SolvercplexPackage.SOLVER_CPLEX__SOL_OPTIMAL;

	/**
	 * The feature id for the '<em><b>Run Interrupted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX__RUN_INTERRUPTED = SolvercplexPackage.SOLVER_CPLEX__RUN_INTERRUPTED;

	/**
	 * The feature id for the '<em><b>Solving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX__SOLVING = SolvercplexPackage.SOLVER_CPLEX__SOLVING;

	/**
	 * The feature id for the '<em><b>Finalizing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX__FINALIZING = SolvercplexPackage.SOLVER_CPLEX__FINALIZING;

	/**
	 * The feature id for the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX__FINISHED = SolvercplexPackage.SOLVER_CPLEX__FINISHED;

	/**
	 * The feature id for the '<em><b>Run Time Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX__RUN_TIME_OUT = SolvercplexPackage.SOLVER_CPLEX__RUN_TIME_OUT;

	/**
	 * The feature id for the '<em><b>Initializing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX__INITIALIZING = SolvercplexPackage.SOLVER_CPLEX__INITIALIZING;

	/**
	 * The feature id for the '<em><b>Solver Optimality Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX__SOLVER_OPTIMALITY_TOLERANCE = SolvercplexPackage.SOLVER_CPLEX__SOLVER_OPTIMALITY_TOLERANCE;

	/**
	 * The feature id for the '<em><b>Solver Linear Relaxation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX__SOLVER_LINEAR_RELAXATION = SolvercplexPackage.SOLVER_CPLEX__SOLVER_LINEAR_RELAXATION;

	/**
	 * The feature id for the '<em><b>Sol Optimality Gap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX__SOL_OPTIMALITY_GAP = SolvercplexPackage.SOLVER_CPLEX__SOL_OPTIMALITY_GAP;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX__FILE_PATH = SolvercplexPackage.SOLVER_CPLEX__FILE_PATH;

	/**
	 * The feature id for the '<em><b>File Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX__FILE_FORMAT = SolvercplexPackage.SOLVER_CPLEX__FILE_FORMAT;

	/**
	 * The feature id for the '<em><b>File Compressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX__FILE_COMPRESSED = SolvercplexPackage.SOLVER_CPLEX__FILE_COMPRESSED;

	/**
	 * The number of structural features of the '<em>Solver To User Cplex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX_FEATURE_COUNT = SolvercplexPackage.SOLVER_CPLEX_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Parent Generator Tool</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX___GET_PARENT_GENERATOR_TOOL = SolvercplexPackage.SOLVER_CPLEX___GET_PARENT_GENERATOR_TOOL;

	/**
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX___GET_GENERATOR = SolvercplexPackage.SOLVER_CPLEX___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Solution Factory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX___SOLUTION_FACTORY = SolvercplexPackage.SOLVER_CPLEX___SOLUTION_FACTORY;

	/**
	 * The operation id for the '<em>Construct Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX___CONSTRUCT_SOLUTION = SolvercplexPackage.SOLVER_CPLEX___CONSTRUCT_SOLUTION;

	/**
	 * The operation id for the '<em>Solve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX___SOLVE = SolvercplexPackage.SOLVER_CPLEX___SOLVE;

	/**
	 * The operation id for the '<em>Write Lp To File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX___WRITE_LP_TO_FILE = SolvercplexPackage.SOLVER_CPLEX___WRITE_LP_TO_FILE;

	/**
	 * The operation id for the '<em>Get Lp As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX___GET_LP_AS_STRING = SolvercplexPackage.SOLVER_CPLEX___GET_LP_AS_STRING;

	/**
	 * The number of operations of the '<em>Solver To User Cplex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_TO_USER_CPLEX_OPERATION_COUNT = SolvercplexPackage.SOLVER_CPLEX_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.solver.tousesolver.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.solver.tousesolver.Domain#getRootFolder <em>Root Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Root Folder</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.Domain#getRootFolder()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_RootFolder();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.solver.tousesolver.Knapsack <em>Knapsack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knapsack</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.Knapsack
	 * @generated
	 */
	EClass getKnapsack();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.solver.tousesolver.Knapsack#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.Knapsack#getCapacity()
	 * @see #getKnapsack()
	 * @generated
	 */
	EAttribute getKnapsack_Capacity();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.solver.tousesolver.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.solver.tousesolver.Item#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.Item#getWeight()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Weight();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.solver.tousesolver.Item#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.Item#getValue()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Value();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.solver.tousesolver.DomainObject <em>Domain Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Object</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.DomainObject
	 * @generated
	 */
	EClass getDomainObject();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.solver.tousesolver.DomainObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.DomainObject#getName()
	 * @see #getDomainObject()
	 * @generated
	 */
	EAttribute getDomainObject_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.solver.tousesolver.DomainObject#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.DomainObject#getShortName()
	 * @see #getDomainObject()
	 * @generated
	 */
	EAttribute getDomainObject_ShortName();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.solver.tousesolver.DomainObjectFolder <em>Domain Object Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Object Folder</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.DomainObjectFolder
	 * @generated
	 */
	EClass getDomainObjectFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.solver.tousesolver.DomainObjectFolder#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.DomainObjectFolder#getObject()
	 * @see #getDomainObjectFolder()
	 * @generated
	 */
	EReference getDomainObjectFolder_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.solver.tousesolver.DomainObjectFolder#getSubFolder <em>Sub Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Folder</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.DomainObjectFolder#getSubFolder()
	 * @see #getDomainObjectFolder()
	 * @generated
	 */
	EReference getDomainObjectFolder_SubFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.solver.tousesolver.DomainObjectFolder#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenario</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.DomainObjectFolder#getScenario()
	 * @see #getDomainObjectFolder()
	 * @generated
	 */
	EReference getDomainObjectFolder_Scenario();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.solver.tousesolver.DomainObjectFolder#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.DomainObjectFolder#getName()
	 * @see #getDomainObjectFolder()
	 * @generated
	 */
	EAttribute getDomainObjectFolder_Name();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.solver.tousesolver.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.solver.tousesolver.Scenario#getKnapsack <em>Knapsack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Knapsack</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.Scenario#getKnapsack()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Knapsack();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.touse.moplaf.solver.tousesolver.Scenario#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Item</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.Scenario#getItem()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Item();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.solver.tousesolver.Scenario#getLP <em>LP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>LP</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.Scenario#getLP()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_LP();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.solver.tousesolver.Scenario#getSol <em>Sol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sol</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.Scenario#getSol()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Sol();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.solver.tousesolver.Scenario#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.Scenario#getName()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.solver.tousesolver.Scenario#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remarks</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.Scenario#getRemarks()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Remarks();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackSol <em>Knapsack Sol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knapsack Sol</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.KnapsackSol
	 * @generated
	 */
	EClass getKnapsackSol();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackSol#getTotalValue <em>Total Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Value</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.KnapsackSol#getTotalValue()
	 * @see #getKnapsackSol()
	 * @generated
	 */
	EAttribute getKnapsackSol_TotalValue();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackSol#getTotalWeight <em>Total Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Weight</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.KnapsackSol#getTotalWeight()
	 * @see #getKnapsackSol()
	 * @generated
	 */
	EAttribute getKnapsackSol_TotalWeight();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackSol#getSolver <em>Solver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Solver</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.KnapsackSol#getSolver()
	 * @see #getKnapsackSol()
	 * @generated
	 */
	EReference getKnapsackSol_Solver();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackSol#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Item</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.KnapsackSol#getItem()
	 * @see #getKnapsackSol()
	 * @generated
	 */
	EReference getKnapsackSol_Item();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackSol#getLp <em>Lp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lp</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.KnapsackSol#getLp()
	 * @see #getKnapsackSol()
	 * @generated
	 */
	EReference getKnapsackSol_Lp();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackLp <em>Knapsack Lp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knapsack Lp</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.KnapsackLp
	 * @generated
	 */
	EClass getKnapsackLp();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackLp#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.KnapsackLp#getRoot()
	 * @see #getKnapsackLp()
	 * @generated
	 */
	EReference getKnapsackLp_Root();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackLp#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Scenario</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.KnapsackLp#getScenario()
	 * @see #getKnapsackLp()
	 * @generated
	 */
	EReference getKnapsackLp_Scenario();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackLp#getGLPK <em>GLPK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>GLPK</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.KnapsackLp#getGLPK()
	 * @see #getKnapsackLp()
	 * @generated
	 */
	EReference getKnapsackLp_GLPK();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackLp#getJavaILP <em>Java ILP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Java ILP</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.KnapsackLp#getJavaILP()
	 * @see #getKnapsackLp()
	 * @generated
	 */
	EReference getKnapsackLp_JavaILP();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackLp#getNeos <em>Neos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Neos</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.KnapsackLp#getNeos()
	 * @see #getKnapsackLp()
	 * @generated
	 */
	EReference getKnapsackLp_Neos();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackLp#getReader <em>Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reader</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.KnapsackLp#getReader()
	 * @see #getKnapsackLp()
	 * @generated
	 */
	EReference getKnapsackLp_Reader();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackLp#getCplex <em>Cplex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cplex</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.KnapsackLp#getCplex()
	 * @see #getKnapsackLp()
	 * @generated
	 */
	EReference getKnapsackLp_Cplex();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.solver.tousesolver.LpRoot <em>Lp Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lp Root</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.LpRoot
	 * @generated
	 */
	EClass getLpRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.solver.tousesolver.LpRoot#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.LpRoot#getItem()
	 * @see #getLpRoot()
	 * @generated
	 */
	EReference getLpRoot_Item();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.touse.moplaf.solver.tousesolver.LpRoot#getKnapsack <em>Knapsack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Knapsack</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.LpRoot#getKnapsack()
	 * @see #getLpRoot()
	 * @generated
	 */
	EReference getLpRoot_Knapsack();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.solver.tousesolver.LpKnapsack <em>Lp Knapsack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lp Knapsack</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.LpKnapsack
	 * @generated
	 */
	EClass getLpKnapsack();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.solver.tousesolver.LpKnapsack#getKnapsack <em>Knapsack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Knapsack</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.LpKnapsack#getKnapsack()
	 * @see #getLpKnapsack()
	 * @generated
	 */
	EReference getLpKnapsack_Knapsack();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.touse.moplaf.solver.tousesolver.LpKnapsack#getConsCapacity <em>Cons Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cons Capacity</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.LpKnapsack#getConsCapacity()
	 * @see #getLpKnapsack()
	 * @generated
	 */
	EReference getLpKnapsack_ConsCapacity();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.solver.tousesolver.LpItem <em>Lp Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lp Item</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.LpItem
	 * @generated
	 */
	EClass getLpItem();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.solver.tousesolver.LpItem#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.LpItem#getItem()
	 * @see #getLpItem()
	 * @generated
	 */
	EReference getLpItem_Item();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.touse.moplaf.solver.tousesolver.LpItem#getVarInKnapsack <em>Var In Knapsack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Var In Knapsack</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.LpItem#getVarInKnapsack()
	 * @see #getLpItem()
	 * @generated
	 */
	EReference getLpItem_VarInKnapsack();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.solver.tousesolver.VarItemInKnapsack <em>Var Item In Knapsack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Item In Knapsack</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.VarItemInKnapsack
	 * @generated
	 */
	EClass getVarItemInKnapsack();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.solver.tousesolver.ConsKnapsackCapacity <em>Cons Knapsack Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cons Knapsack Capacity</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.ConsKnapsackCapacity
	 * @generated
	 */
	EClass getConsKnapsackCapacity();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.solver.tousesolver.SolverToUseGLPK <em>Solver To Use GLPK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solver To Use GLPK</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.SolverToUseGLPK
	 * @generated
	 */
	EClass getSolverToUseGLPK();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.solver.tousesolver.SolverToUseJavaILP <em>Solver To Use Java ILP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solver To Use Java ILP</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.SolverToUseJavaILP
	 * @generated
	 */
	EClass getSolverToUseJavaILP();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.solver.tousesolver.SolverToUseNeos <em>Solver To Use Neos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solver To Use Neos</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.SolverToUseNeos
	 * @generated
	 */
	EClass getSolverToUseNeos();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.solver.tousesolver.SolutionReaderToUse <em>Solution Reader To Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution Reader To Use</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.SolutionReaderToUse
	 * @generated
	 */
	EClass getSolutionReaderToUse();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.solver.tousesolver.SolverToUserCplex <em>Solver To User Cplex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solver To User Cplex</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.SolverToUserCplex
	 * @generated
	 */
	EClass getSolverToUserCplex();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TousesolverFactory getTousesolverFactory();

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
		 * The meta object literal for the '{@link com.misc.touse.moplaf.solver.tousesolver.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.solver.tousesolver.impl.DomainImpl
		 * @see com.misc.touse.moplaf.solver.tousesolver.impl.TousesolverPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Root Folder</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__ROOT_FOLDER = eINSTANCE.getDomain_RootFolder();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.solver.tousesolver.impl.KnapsackImpl <em>Knapsack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.solver.tousesolver.impl.KnapsackImpl
		 * @see com.misc.touse.moplaf.solver.tousesolver.impl.TousesolverPackageImpl#getKnapsack()
		 * @generated
		 */
		EClass KNAPSACK = eINSTANCE.getKnapsack();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KNAPSACK__CAPACITY = eINSTANCE.getKnapsack_Capacity();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.solver.tousesolver.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.solver.tousesolver.impl.ItemImpl
		 * @see com.misc.touse.moplaf.solver.tousesolver.impl.TousesolverPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__WEIGHT = eINSTANCE.getItem_Weight();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__VALUE = eINSTANCE.getItem_Value();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.solver.tousesolver.impl.DomainObjectImpl <em>Domain Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.solver.tousesolver.impl.DomainObjectImpl
		 * @see com.misc.touse.moplaf.solver.tousesolver.impl.TousesolverPackageImpl#getDomainObject()
		 * @generated
		 */
		EClass DOMAIN_OBJECT = eINSTANCE.getDomainObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_OBJECT__NAME = eINSTANCE.getDomainObject_Name();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_OBJECT__SHORT_NAME = eINSTANCE.getDomainObject_ShortName();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.solver.tousesolver.impl.DomainObjectFolderImpl <em>Domain Object Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.solver.tousesolver.impl.DomainObjectFolderImpl
		 * @see com.misc.touse.moplaf.solver.tousesolver.impl.TousesolverPackageImpl#getDomainObjectFolder()
		 * @generated
		 */
		EClass DOMAIN_OBJECT_FOLDER = eINSTANCE.getDomainObjectFolder();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_OBJECT_FOLDER__OBJECT = eINSTANCE.getDomainObjectFolder_Object();

		/**
		 * The meta object literal for the '<em><b>Sub Folder</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_OBJECT_FOLDER__SUB_FOLDER = eINSTANCE.getDomainObjectFolder_SubFolder();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_OBJECT_FOLDER__SCENARIO = eINSTANCE.getDomainObjectFolder_Scenario();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_OBJECT_FOLDER__NAME = eINSTANCE.getDomainObjectFolder_Name();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.solver.tousesolver.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.solver.tousesolver.impl.ScenarioImpl
		 * @see com.misc.touse.moplaf.solver.tousesolver.impl.TousesolverPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Knapsack</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__KNAPSACK = eINSTANCE.getScenario_Knapsack();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__ITEM = eINSTANCE.getScenario_Item();

		/**
		 * The meta object literal for the '<em><b>LP</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__LP = eINSTANCE.getScenario_LP();

		/**
		 * The meta object literal for the '<em><b>Sol</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__SOL = eINSTANCE.getScenario_Sol();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__NAME = eINSTANCE.getScenario_Name();

		/**
		 * The meta object literal for the '<em><b>Remarks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__REMARKS = eINSTANCE.getScenario_Remarks();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.solver.tousesolver.impl.KnapsackSolImpl <em>Knapsack Sol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.solver.tousesolver.impl.KnapsackSolImpl
		 * @see com.misc.touse.moplaf.solver.tousesolver.impl.TousesolverPackageImpl#getKnapsackSol()
		 * @generated
		 */
		EClass KNAPSACK_SOL = eINSTANCE.getKnapsackSol();

		/**
		 * The meta object literal for the '<em><b>Total Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KNAPSACK_SOL__TOTAL_VALUE = eINSTANCE.getKnapsackSol_TotalValue();

		/**
		 * The meta object literal for the '<em><b>Total Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KNAPSACK_SOL__TOTAL_WEIGHT = eINSTANCE.getKnapsackSol_TotalWeight();

		/**
		 * The meta object literal for the '<em><b>Solver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNAPSACK_SOL__SOLVER = eINSTANCE.getKnapsackSol_Solver();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNAPSACK_SOL__ITEM = eINSTANCE.getKnapsackSol_Item();

		/**
		 * The meta object literal for the '<em><b>Lp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNAPSACK_SOL__LP = eINSTANCE.getKnapsackSol_Lp();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.solver.tousesolver.impl.KnapsackLpImpl <em>Knapsack Lp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.solver.tousesolver.impl.KnapsackLpImpl
		 * @see com.misc.touse.moplaf.solver.tousesolver.impl.TousesolverPackageImpl#getKnapsackLp()
		 * @generated
		 */
		EClass KNAPSACK_LP = eINSTANCE.getKnapsackLp();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNAPSACK_LP__ROOT = eINSTANCE.getKnapsackLp_Root();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNAPSACK_LP__SCENARIO = eINSTANCE.getKnapsackLp_Scenario();

		/**
		 * The meta object literal for the '<em><b>GLPK</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNAPSACK_LP__GLPK = eINSTANCE.getKnapsackLp_GLPK();

		/**
		 * The meta object literal for the '<em><b>Java ILP</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNAPSACK_LP__JAVA_ILP = eINSTANCE.getKnapsackLp_JavaILP();

		/**
		 * The meta object literal for the '<em><b>Neos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNAPSACK_LP__NEOS = eINSTANCE.getKnapsackLp_Neos();

		/**
		 * The meta object literal for the '<em><b>Reader</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNAPSACK_LP__READER = eINSTANCE.getKnapsackLp_Reader();

		/**
		 * The meta object literal for the '<em><b>Cplex</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNAPSACK_LP__CPLEX = eINSTANCE.getKnapsackLp_Cplex();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.solver.tousesolver.impl.LpRootImpl <em>Lp Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.solver.tousesolver.impl.LpRootImpl
		 * @see com.misc.touse.moplaf.solver.tousesolver.impl.TousesolverPackageImpl#getLpRoot()
		 * @generated
		 */
		EClass LP_ROOT = eINSTANCE.getLpRoot();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_ROOT__ITEM = eINSTANCE.getLpRoot_Item();

		/**
		 * The meta object literal for the '<em><b>Knapsack</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_ROOT__KNAPSACK = eINSTANCE.getLpRoot_Knapsack();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.solver.tousesolver.impl.LpKnapsackImpl <em>Lp Knapsack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.solver.tousesolver.impl.LpKnapsackImpl
		 * @see com.misc.touse.moplaf.solver.tousesolver.impl.TousesolverPackageImpl#getLpKnapsack()
		 * @generated
		 */
		EClass LP_KNAPSACK = eINSTANCE.getLpKnapsack();

		/**
		 * The meta object literal for the '<em><b>Knapsack</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_KNAPSACK__KNAPSACK = eINSTANCE.getLpKnapsack_Knapsack();

		/**
		 * The meta object literal for the '<em><b>Cons Capacity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_KNAPSACK__CONS_CAPACITY = eINSTANCE.getLpKnapsack_ConsCapacity();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.solver.tousesolver.impl.LpItemImpl <em>Lp Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.solver.tousesolver.impl.LpItemImpl
		 * @see com.misc.touse.moplaf.solver.tousesolver.impl.TousesolverPackageImpl#getLpItem()
		 * @generated
		 */
		EClass LP_ITEM = eINSTANCE.getLpItem();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_ITEM__ITEM = eINSTANCE.getLpItem_Item();

		/**
		 * The meta object literal for the '<em><b>Var In Knapsack</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LP_ITEM__VAR_IN_KNAPSACK = eINSTANCE.getLpItem_VarInKnapsack();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.solver.tousesolver.impl.VarItemInKnapsackImpl <em>Var Item In Knapsack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.solver.tousesolver.impl.VarItemInKnapsackImpl
		 * @see com.misc.touse.moplaf.solver.tousesolver.impl.TousesolverPackageImpl#getVarItemInKnapsack()
		 * @generated
		 */
		EClass VAR_ITEM_IN_KNAPSACK = eINSTANCE.getVarItemInKnapsack();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.solver.tousesolver.impl.ConsKnapsackCapacityImpl <em>Cons Knapsack Capacity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.solver.tousesolver.impl.ConsKnapsackCapacityImpl
		 * @see com.misc.touse.moplaf.solver.tousesolver.impl.TousesolverPackageImpl#getConsKnapsackCapacity()
		 * @generated
		 */
		EClass CONS_KNAPSACK_CAPACITY = eINSTANCE.getConsKnapsackCapacity();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.solver.tousesolver.impl.SolverToUseGLPKImpl <em>Solver To Use GLPK</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.solver.tousesolver.impl.SolverToUseGLPKImpl
		 * @see com.misc.touse.moplaf.solver.tousesolver.impl.TousesolverPackageImpl#getSolverToUseGLPK()
		 * @generated
		 */
		EClass SOLVER_TO_USE_GLPK = eINSTANCE.getSolverToUseGLPK();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.solver.tousesolver.impl.SolverToUseJavaILPImpl <em>Solver To Use Java ILP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.solver.tousesolver.impl.SolverToUseJavaILPImpl
		 * @see com.misc.touse.moplaf.solver.tousesolver.impl.TousesolverPackageImpl#getSolverToUseJavaILP()
		 * @generated
		 */
		EClass SOLVER_TO_USE_JAVA_ILP = eINSTANCE.getSolverToUseJavaILP();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.solver.tousesolver.impl.SolverToUseNeosImpl <em>Solver To Use Neos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.solver.tousesolver.impl.SolverToUseNeosImpl
		 * @see com.misc.touse.moplaf.solver.tousesolver.impl.TousesolverPackageImpl#getSolverToUseNeos()
		 * @generated
		 */
		EClass SOLVER_TO_USE_NEOS = eINSTANCE.getSolverToUseNeos();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.solver.tousesolver.impl.SolutionReaderToUseImpl <em>Solution Reader To Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.solver.tousesolver.impl.SolutionReaderToUseImpl
		 * @see com.misc.touse.moplaf.solver.tousesolver.impl.TousesolverPackageImpl#getSolutionReaderToUse()
		 * @generated
		 */
		EClass SOLUTION_READER_TO_USE = eINSTANCE.getSolutionReaderToUse();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.solver.tousesolver.impl.SolverToUserCplexImpl <em>Solver To User Cplex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.solver.tousesolver.impl.SolverToUserCplexImpl
		 * @see com.misc.touse.moplaf.solver.tousesolver.impl.TousesolverPackageImpl#getSolverToUserCplex()
		 * @generated
		 */
		EClass SOLVER_TO_USER_CPLEX = eINSTANCE.getSolverToUserCplex();

	}

} //TousesolverPackage
