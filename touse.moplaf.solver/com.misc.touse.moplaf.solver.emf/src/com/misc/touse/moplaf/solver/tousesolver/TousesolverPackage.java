/*******************************************************************************
 * Copyright (c) 2017 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
/**
 */
package com.misc.touse.moplaf.solver.tousesolver;

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
	String eNS_URI = "http://www.misc.com/touse/moplaf/solver/model/0.1";

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
	 * The feature id for the '<em><b>Solution Reader</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__SOLUTION_READER = 6;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = 7;

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
	 * The feature id for the '<em><b>Run Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP__RUN_FEEDBACK = SolverPackage.GENERATOR__RUN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Cancel Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP__CANCEL_FEEDBACK = SolverPackage.GENERATOR__CANCEL_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Reset Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP__RESET_FEEDBACK = SolverPackage.GENERATOR__RESET_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP__LABEL = SolverPackage.GENERATOR__LABEL;

	/**
	 * The feature id for the '<em><b>Cancelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP__CANCELLED = SolverPackage.GENERATOR__CANCELLED;

	/**
	 * The feature id for the '<em><b>Returned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP__RETURNED = SolverPackage.GENERATOR__RETURNED;

	/**
	 * The feature id for the '<em><b>Return Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP__RETURN_SUCCESS = SolverPackage.GENERATOR__RETURN_SUCCESS;

	/**
	 * The feature id for the '<em><b>Return Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP__RETURN_FEEDBACK = SolverPackage.GENERATOR__RETURN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Return Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP__RETURN_INFORMATION = SolverPackage.GENERATOR__RETURN_INFORMATION;

	/**
	 * The feature id for the '<em><b>Tuple Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP__TUPLE_ROOT = SolverPackage.GENERATOR__TUPLE_ROOT;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP__GOALS = SolverPackage.GENERATOR__GOALS;

	/**
	 * The feature id for the '<em><b>Var Binders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP__VAR_BINDERS = SolverPackage.GENERATOR__VAR_BINDERS;

	/**
	 * The feature id for the '<em><b>Solution Provider</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP__SOLUTION_PROVIDER = SolverPackage.GENERATOR__SOLUTION_PROVIDER;

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
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP__CODE = SolverPackage.GENERATOR__CODE;

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
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP__VALUE = SolverPackage.GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP__CARDINALITY = SolverPackage.GENERATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Solver</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP__SOLVER = SolverPackage.GENERATOR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Knapsack Lp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP_FEATURE_COUNT = SolverPackage.GENERATOR_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Copy Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP___COPY_PARAMS__RUNPARAMS = SolverPackage.GENERATOR___COPY_PARAMS__RUNPARAMS;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP___RESET = SolverPackage.GENERATOR___RESET;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP___RUN = SolverPackage.GENERATOR___RUN;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP___RUN__RUNCONTEXT = SolverPackage.GENERATOR___RUN__RUNCONTEXT;

	/**
	 * The operation id for the '<em>Run Asynch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP___RUN_ASYNCH__RUNCONTEXT = SolverPackage.GENERATOR___RUN_ASYNCH__RUNCONTEXT;

	/**
	 * The operation id for the '<em>Run Asynch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP___RUN_ASYNCH__RUNCONTEXT_BOOLEAN = SolverPackage.GENERATOR___RUN_ASYNCH__RUNCONTEXT_BOOLEAN;

	/**
	 * The operation id for the '<em>Cancel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP___CANCEL = SolverPackage.GENERATOR___CANCEL;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP___SET_PROGRESS__STRING_FLOAT = SolverPackage.GENERATOR___SET_PROGRESS__STRING_FLOAT;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP___SET_PROGRESS__PROGRESSFEEDBACK = SolverPackage.GENERATOR___SET_PROGRESS__PROGRESSFEEDBACK;

	/**
	 * The operation id for the '<em>Set Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP___SET_RETURN__RETURNFEEDBACK = SolverPackage.GENERATOR___SET_RETURN__RETURNFEEDBACK;

	/**
	 * The operation id for the '<em>Get Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP___GET_RETURN = SolverPackage.GENERATOR___GET_RETURN;

	/**
	 * The operation id for the '<em>Construct Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP___CONSTRUCT_PARAMS = SolverPackage.GENERATOR___CONSTRUCT_PARAMS;

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
	 * The operation id for the '<em>Generate Tuple XReferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP___GENERATE_TUPLE_XREFERENCES = SolverPackage.GENERATOR___GENERATE_TUPLE_XREFERENCES;

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
	 * The operation id for the '<em>Generate Goals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP___GENERATE_GOALS = SolverPackage.GENERATOR___GENERATE_GOALS;

	/**
	 * The operation id for the '<em>Accept Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP___ACCEPT_SOLUTION__SOLUTION = SolverPackage.GENERATOR___ACCEPT_SOLUTION__SOLUTION;

	/**
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP___VISIT_TUPLES__ITUPLEVISITOR = SolverPackage.GENERATOR___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNAPSACK_LP___REFRESH_SELECTED_SOLUTION = SolverPackage.GENERATOR___REFRESH_SELECTED_SOLUTION;

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
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROOT__CODE = SolverPackage.GENERATOR_TUPLE__CODE;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROOT__NAME = SolverPackage.GENERATOR_TUPLE__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROOT__MEMBERS = SolverPackage.GENERATOR_TUPLE__MEMBERS;

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
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROOT___GET_GENERATOR = SolverPackage.GENERATOR_TUPLE___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROOT___REFRESH_SELECTED_SOLUTION = SolverPackage.GENERATOR_TUPLE___REFRESH_SELECTED_SOLUTION;

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
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROOT___VISIT_TUPLES__ITUPLEVISITOR = SolverPackage.GENERATOR_TUPLE___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The operation id for the '<em>Generate XReferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ROOT___GENERATE_XREFERENCES = SolverPackage.GENERATOR_TUPLE___GENERATE_XREFERENCES;

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
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_KNAPSACK__CODE = SolverPackage.GENERATOR_TUPLE__CODE;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_KNAPSACK__NAME = SolverPackage.GENERATOR_TUPLE__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_KNAPSACK__MEMBERS = SolverPackage.GENERATOR_TUPLE__MEMBERS;

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
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_KNAPSACK___GET_GENERATOR = SolverPackage.GENERATOR_TUPLE___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_KNAPSACK___REFRESH_SELECTED_SOLUTION = SolverPackage.GENERATOR_TUPLE___REFRESH_SELECTED_SOLUTION;

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
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_KNAPSACK___VISIT_TUPLES__ITUPLEVISITOR = SolverPackage.GENERATOR_TUPLE___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The operation id for the '<em>Generate XReferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_KNAPSACK___GENERATE_XREFERENCES = SolverPackage.GENERATOR_TUPLE___GENERATE_XREFERENCES;

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
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ITEM__CODE = SolverPackage.GENERATOR_TUPLE__CODE;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ITEM__NAME = SolverPackage.GENERATOR_TUPLE__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ITEM__MEMBERS = SolverPackage.GENERATOR_TUPLE__MEMBERS;

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
	 * The operation id for the '<em>Get Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ITEM___GET_GENERATOR = SolverPackage.GENERATOR_TUPLE___GET_GENERATOR;

	/**
	 * The operation id for the '<em>Refresh Selected Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ITEM___REFRESH_SELECTED_SOLUTION = SolverPackage.GENERATOR_TUPLE___REFRESH_SELECTED_SOLUTION;

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
	 * The operation id for the '<em>Visit Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ITEM___VISIT_TUPLES__ITUPLEVISITOR = SolverPackage.GENERATOR_TUPLE___VISIT_TUPLES__ITUPLEVISITOR;

	/**
	 * The operation id for the '<em>Generate XReferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ITEM___GENERATE_XREFERENCES = SolverPackage.GENERATOR_TUPLE___GENERATE_XREFERENCES;

	/**
	 * The number of operations of the '<em>Lp Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LP_ITEM_OPERATION_COUNT = SolverPackage.GENERATOR_TUPLE_OPERATION_COUNT + 0;

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
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.solver.tousesolver.Scenario#getSolutionReader <em>Solution Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Solution Reader</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.Scenario#getSolutionReader()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_SolutionReader();

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
	 * Returns the meta object for the containment reference '{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackLp#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.KnapsackLp#getValue()
	 * @see #getKnapsackLp()
	 * @generated
	 */
	EReference getKnapsackLp_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackLp#getSolver <em>Solver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Solver</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.KnapsackLp#getSolver()
	 * @see #getKnapsackLp()
	 * @generated
	 */
	EReference getKnapsackLp_Solver();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackLp#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cardinality</em>'.
	 * @see com.misc.touse.moplaf.solver.tousesolver.KnapsackLp#getCardinality()
	 * @see #getKnapsackLp()
	 * @generated
	 */
	EReference getKnapsackLp_Cardinality();

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
		 * The meta object literal for the '<em><b>Solution Reader</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__SOLUTION_READER = eINSTANCE.getScenario_SolutionReader();

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
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNAPSACK_LP__VALUE = eINSTANCE.getKnapsackLp_Value();

		/**
		 * The meta object literal for the '<em><b>Solver</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNAPSACK_LP__SOLVER = eINSTANCE.getKnapsackLp_Solver();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNAPSACK_LP__CARDINALITY = eINSTANCE.getKnapsackLp_Cardinality();

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

	}

} //TousesolverPackage
