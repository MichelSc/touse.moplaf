/**
 */
package com.misc.touse.moplaf.tousedatasetload;

import com.misc.common.moplaf.DatasetLoadDerby.DatasetLoadDerbyPackage;

import com.misc.common.moplaf.DatasetLoadMariaDb.DatasetLoadMariaDbPackage;
import com.misc.common.moplaf.datasetload.DatasetloadPackage;

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
 * @see com.misc.touse.moplaf.tousedatasetload.TousedatasetloadFactory
 * @model kind="package"
 * @generated
 */
public interface TousedatasetloadPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tousedatasetload";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.misc.touse.moplaf.datasetload.emf";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tuload";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TousedatasetloadPackage eINSTANCE = com.misc.touse.moplaf.tousedatasetload.impl.TousedatasetloadPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousedatasetload.impl.FPDImpl <em>FPD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousedatasetload.impl.FPDImpl
	 * @see com.misc.touse.moplaf.tousedatasetload.impl.TousedatasetloadPackageImpl#getFPD()
	 * @generated
	 */
	int FPD = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD__NAME = DatasetLoadDerbyPackage.DATA_SOURCE_JDB_DERBY_EMBEDDED__NAME;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD__CONNECTED = DatasetLoadDerbyPackage.DATA_SOURCE_JDB_DERBY_EMBEDDED__CONNECTED;

	/**
	 * The feature id for the '<em><b>Data Base User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD__DATA_BASE_USER = DatasetLoadDerbyPackage.DATA_SOURCE_JDB_DERBY_EMBEDDED__DATA_BASE_USER;

	/**
	 * The feature id for the '<em><b>Data Base User Pwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD__DATA_BASE_USER_PWD = DatasetLoadDerbyPackage.DATA_SOURCE_JDB_DERBY_EMBEDDED__DATA_BASE_USER_PWD;

	/**
	 * The feature id for the '<em><b>Default Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD__DEFAULT_SCHEMA = DatasetLoadDerbyPackage.DATA_SOURCE_JDB_DERBY_EMBEDDED__DEFAULT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Database Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD__DATABASE_PATH = DatasetLoadDerbyPackage.DATA_SOURCE_JDB_DERBY_EMBEDDED__DATABASE_PATH;

	/**
	 * The feature id for the '<em><b>Sorting Plans Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD__SORTING_PLANS_SET = DatasetLoadDerbyPackage.DATA_SOURCE_JDB_DERBY_EMBEDDED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FPD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_FEATURE_COUNT = DatasetLoadDerbyPackage.DATA_SOURCE_JDB_DERBY_EMBEDDED_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD___CONNECT = DatasetLoadDerbyPackage.DATA_SOURCE_JDB_DERBY_EMBEDDED___CONNECT;

	/**
	 * The operation id for the '<em>Disconnect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD___DISCONNECT = DatasetLoadDerbyPackage.DATA_SOURCE_JDB_DERBY_EMBEDDED___DISCONNECT;

	/**
	 * The operation id for the '<em>Load Table Impl</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD___LOAD_TABLE_IMPL__TABLE = DatasetLoadDerbyPackage.DATA_SOURCE_JDB_DERBY_EMBEDDED___LOAD_TABLE_IMPL__TABLE;

	/**
	 * The number of operations of the '<em>FPD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_OPERATION_COUNT = DatasetLoadDerbyPackage.DATA_SOURCE_JDB_DERBY_EMBEDDED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousedatasetload.impl.FPDGroupSortingPlanImpl <em>FPD Group Sorting Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousedatasetload.impl.FPDGroupSortingPlanImpl
	 * @see com.misc.touse.moplaf.tousedatasetload.impl.TousedatasetloadPackageImpl#getFPDGroupSortingPlan()
	 * @generated
	 */
	int FPD_GROUP_SORTING_PLAN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_GROUP_SORTING_PLAN__NAME = DatasetloadPackage.TABLE_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_GROUP_SORTING_PLAN__TABLES = DatasetloadPackage.TABLE_GROUP__TABLES;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_GROUP_SORTING_PLAN__DATA_SOURCE = DatasetloadPackage.TABLE_GROUP__DATA_SOURCE;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_GROUP_SORTING_PLAN__FROM_DATE = DatasetloadPackage.TABLE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_GROUP_SORTING_PLAN__TO_DATE = DatasetloadPackage.TABLE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sorting Plans Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_GROUP_SORTING_PLAN__SORTING_PLANS_TABLE = DatasetloadPackage.TABLE_GROUP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sorting Plan Inputs Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_GROUP_SORTING_PLAN__SORTING_PLAN_INPUTS_TABLE = DatasetloadPackage.TABLE_GROUP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>FPD Group Sorting Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_GROUP_SORTING_PLAN_FEATURE_COUNT = DatasetloadPackage.TABLE_GROUP_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_GROUP_SORTING_PLAN___LOAD = DatasetloadPackage.TABLE_GROUP___LOAD;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_GROUP_SORTING_PLAN___REFRESH = DatasetloadPackage.TABLE_GROUP___REFRESH;

	/**
	 * The number of operations of the '<em>FPD Group Sorting Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_GROUP_SORTING_PLAN_OPERATION_COUNT = DatasetloadPackage.TABLE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousedatasetload.impl.FPDSortingPlansImpl <em>FPD Sorting Plans</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousedatasetload.impl.FPDSortingPlansImpl
	 * @see com.misc.touse.moplaf.tousedatasetload.impl.TousedatasetloadPackageImpl#getFPDSortingPlans()
	 * @generated
	 */
	int FPD_SORTING_PLANS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS__NAME = DatasetloadPackage.TABLE__NAME;

	/**
	 * The feature id for the '<em><b>Table Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS__TABLE_GROUP = DatasetloadPackage.TABLE__TABLE_GROUP;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS__ROWS = DatasetloadPackage.TABLE__ROWS;

	/**
	 * The feature id for the '<em><b>Param Table Group Attributes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS__PARAM_TABLE_GROUP_ATTRIBUTES = DatasetloadPackage.TABLE__PARAM_TABLE_GROUP_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>SQL Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS__SQL_STATEMENT = DatasetloadPackage.TABLE__SQL_STATEMENT;

	/**
	 * The feature id for the '<em><b>Column Table Row Attributes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS__COLUMN_TABLE_ROW_ATTRIBUTES = DatasetloadPackage.TABLE__COLUMN_TABLE_ROW_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Key Columns</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS__KEY_COLUMNS = DatasetloadPackage.TABLE__KEY_COLUMNS;

	/**
	 * The feature id for the '<em><b>Last Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS__LAST_LOAD = DatasetloadPackage.TABLE__LAST_LOAD;

	/**
	 * The feature id for the '<em><b>Number Of Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS__NUMBER_OF_ROWS = DatasetloadPackage.TABLE__NUMBER_OF_ROWS;

	/**
	 * The feature id for the '<em><b>Sorting Plans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS__SORTING_PLANS = DatasetloadPackage.TABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FPD Sorting Plans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS_FEATURE_COUNT = DatasetloadPackage.TABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS___LOAD = DatasetloadPackage.TABLE___LOAD;

	/**
	 * The operation id for the '<em>New Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS___NEW_ROW = DatasetloadPackage.TABLE___NEW_ROW;

	/**
	 * The operation id for the '<em>Add Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS___ADD_ROW__TABLEROW = DatasetloadPackage.TABLE___ADD_ROW__TABLEROW;

	/**
	 * The operation id for the '<em>Get Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS___GET_ROW__TABLEROWKEYIMPL = DatasetloadPackage.TABLE___GET_ROW__TABLEROWKEYIMPL;

	/**
	 * The operation id for the '<em>Remove Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS___REMOVE_ROW__TABLEROW = DatasetloadPackage.TABLE___REMOVE_ROW__TABLEROW;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS___REFRESH = DatasetloadPackage.TABLE___REFRESH;

	/**
	 * The number of operations of the '<em>FPD Sorting Plans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS_OPERATION_COUNT = DatasetloadPackage.TABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousedatasetload.impl.FPDSortingPlanInputsImpl <em>FPD Sorting Plan Inputs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousedatasetload.impl.FPDSortingPlanInputsImpl
	 * @see com.misc.touse.moplaf.tousedatasetload.impl.TousedatasetloadPackageImpl#getFPDSortingPlanInputs()
	 * @generated
	 */
	int FPD_SORTING_PLAN_INPUTS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS__NAME = DatasetloadPackage.TABLE__NAME;

	/**
	 * The feature id for the '<em><b>Table Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS__TABLE_GROUP = DatasetloadPackage.TABLE__TABLE_GROUP;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS__ROWS = DatasetloadPackage.TABLE__ROWS;

	/**
	 * The feature id for the '<em><b>Param Table Group Attributes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS__PARAM_TABLE_GROUP_ATTRIBUTES = DatasetloadPackage.TABLE__PARAM_TABLE_GROUP_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>SQL Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS__SQL_STATEMENT = DatasetloadPackage.TABLE__SQL_STATEMENT;

	/**
	 * The feature id for the '<em><b>Column Table Row Attributes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS__COLUMN_TABLE_ROW_ATTRIBUTES = DatasetloadPackage.TABLE__COLUMN_TABLE_ROW_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Key Columns</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS__KEY_COLUMNS = DatasetloadPackage.TABLE__KEY_COLUMNS;

	/**
	 * The feature id for the '<em><b>Last Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS__LAST_LOAD = DatasetloadPackage.TABLE__LAST_LOAD;

	/**
	 * The feature id for the '<em><b>Number Of Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS__NUMBER_OF_ROWS = DatasetloadPackage.TABLE__NUMBER_OF_ROWS;

	/**
	 * The feature id for the '<em><b>Sorting Plan Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS__SORTING_PLAN_INPUTS = DatasetloadPackage.TABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FPD Sorting Plan Inputs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS_FEATURE_COUNT = DatasetloadPackage.TABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS___LOAD = DatasetloadPackage.TABLE___LOAD;

	/**
	 * The operation id for the '<em>New Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS___NEW_ROW = DatasetloadPackage.TABLE___NEW_ROW;

	/**
	 * The operation id for the '<em>Add Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS___ADD_ROW__TABLEROW = DatasetloadPackage.TABLE___ADD_ROW__TABLEROW;

	/**
	 * The operation id for the '<em>Get Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS___GET_ROW__TABLEROWKEYIMPL = DatasetloadPackage.TABLE___GET_ROW__TABLEROWKEYIMPL;

	/**
	 * The operation id for the '<em>Remove Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS___REMOVE_ROW__TABLEROW = DatasetloadPackage.TABLE___REMOVE_ROW__TABLEROW;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS___REFRESH = DatasetloadPackage.TABLE___REFRESH;

	/**
	 * The number of operations of the '<em>FPD Sorting Plan Inputs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS_OPERATION_COUNT = DatasetloadPackage.TABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousedatasetload.impl.FPDSortingPlanImpl <em>FPD Sorting Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousedatasetload.impl.FPDSortingPlanImpl
	 * @see com.misc.touse.moplaf.tousedatasetload.impl.TousedatasetloadPackageImpl#getFPDSortingPlan()
	 * @generated
	 */
	int FPD_SORTING_PLAN = 4;

	/**
	 * The feature id for the '<em><b>Row Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN__ROW_NUMBER = DatasetloadPackage.TABLE_ROW__ROW_NUMBER;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN__TABLE = DatasetloadPackage.TABLE_ROW__TABLE;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN__KEY = DatasetloadPackage.TABLE_ROW__KEY;

	/**
	 * The feature id for the '<em><b>New Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN__NEW_ROW = DatasetloadPackage.TABLE_ROW__NEW_ROW;

	/**
	 * The feature id for the '<em><b>Sorting Plan ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN__SORTING_PLAN_ID = DatasetloadPackage.TABLE_ROW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN__NAME = DatasetloadPackage.TABLE_ROW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Valid From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN__VALID_FROM = DatasetloadPackage.TABLE_ROW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Valid To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN__VALID_TO = DatasetloadPackage.TABLE_ROW_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>FPD Sorting Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_FEATURE_COUNT = DatasetloadPackage.TABLE_ROW_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN___REFRESH = DatasetloadPackage.TABLE_ROW___REFRESH;

	/**
	 * The number of operations of the '<em>FPD Sorting Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_OPERATION_COUNT = DatasetloadPackage.TABLE_ROW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousedatasetload.impl.FPDSortingPlanInputImpl <em>FPD Sorting Plan Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousedatasetload.impl.FPDSortingPlanInputImpl
	 * @see com.misc.touse.moplaf.tousedatasetload.impl.TousedatasetloadPackageImpl#getFPDSortingPlanInput()
	 * @generated
	 */
	int FPD_SORTING_PLAN_INPUT = 5;

	/**
	 * The feature id for the '<em><b>Row Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUT__ROW_NUMBER = DatasetloadPackage.TABLE_ROW__ROW_NUMBER;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUT__TABLE = DatasetloadPackage.TABLE_ROW__TABLE;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUT__KEY = DatasetloadPackage.TABLE_ROW__KEY;

	/**
	 * The feature id for the '<em><b>New Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUT__NEW_ROW = DatasetloadPackage.TABLE_ROW__NEW_ROW;

	/**
	 * The feature id for the '<em><b>Product ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUT__PRODUCT_ID = DatasetloadPackage.TABLE_ROW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sorting Plan ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUT__SORTING_PLAN_ID = DatasetloadPackage.TABLE_ROW_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>FPD Sorting Plan Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUT_FEATURE_COUNT = DatasetloadPackage.TABLE_ROW_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUT___REFRESH = DatasetloadPackage.TABLE_ROW___REFRESH;

	/**
	 * The number of operations of the '<em>FPD Sorting Plan Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUT_OPERATION_COUNT = DatasetloadPackage.TABLE_ROW_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousedatasetload.impl.MariaDbTestDatabaseImpl <em>Maria Db Test Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousedatasetload.impl.MariaDbTestDatabaseImpl
	 * @see com.misc.touse.moplaf.tousedatasetload.impl.TousedatasetloadPackageImpl#getMariaDbTestDatabase()
	 * @generated
	 */
	int MARIA_DB_TEST_DATABASE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_DATABASE__NAME = DatasetLoadMariaDbPackage.DATASET_LOAD_JDBC_MARIA_DB__NAME;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_DATABASE__CONNECTED = DatasetLoadMariaDbPackage.DATASET_LOAD_JDBC_MARIA_DB__CONNECTED;

	/**
	 * The feature id for the '<em><b>Data Base User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_DATABASE__DATA_BASE_USER = DatasetLoadMariaDbPackage.DATASET_LOAD_JDBC_MARIA_DB__DATA_BASE_USER;

	/**
	 * The feature id for the '<em><b>Data Base User Pwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_DATABASE__DATA_BASE_USER_PWD = DatasetLoadMariaDbPackage.DATASET_LOAD_JDBC_MARIA_DB__DATA_BASE_USER_PWD;

	/**
	 * The feature id for the '<em><b>Default Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_DATABASE__DEFAULT_SCHEMA = DatasetLoadMariaDbPackage.DATASET_LOAD_JDBC_MARIA_DB__DEFAULT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_DATABASE__HOST = DatasetLoadMariaDbPackage.DATASET_LOAD_JDBC_MARIA_DB__HOST;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_DATABASE__PORT = DatasetLoadMariaDbPackage.DATASET_LOAD_JDBC_MARIA_DB__PORT;

	/**
	 * The feature id for the '<em><b>Data Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_DATABASE__DATA_BASE = DatasetLoadMariaDbPackage.DATASET_LOAD_JDBC_MARIA_DB__DATA_BASE;

	/**
	 * The feature id for the '<em><b>Table Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_DATABASE__TABLE_SETS = DatasetLoadMariaDbPackage.DATASET_LOAD_JDBC_MARIA_DB_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Maria Db Test Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_DATABASE_FEATURE_COUNT = DatasetLoadMariaDbPackage.DATASET_LOAD_JDBC_MARIA_DB_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_DATABASE___CONNECT = DatasetLoadMariaDbPackage.DATASET_LOAD_JDBC_MARIA_DB___CONNECT;

	/**
	 * The operation id for the '<em>Disconnect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_DATABASE___DISCONNECT = DatasetLoadMariaDbPackage.DATASET_LOAD_JDBC_MARIA_DB___DISCONNECT;

	/**
	 * The operation id for the '<em>Load Table Impl</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_DATABASE___LOAD_TABLE_IMPL__TABLE = DatasetLoadMariaDbPackage.DATASET_LOAD_JDBC_MARIA_DB___LOAD_TABLE_IMPL__TABLE;

	/**
	 * The number of operations of the '<em>Maria Db Test Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_DATABASE_OPERATION_COUNT = DatasetLoadMariaDbPackage.DATASET_LOAD_JDBC_MARIA_DB_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousedatasetload.impl.MariaDbTestGroupTablesImpl <em>Maria Db Test Group Tables</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousedatasetload.impl.MariaDbTestGroupTablesImpl
	 * @see com.misc.touse.moplaf.tousedatasetload.impl.TousedatasetloadPackageImpl#getMariaDbTestGroupTables()
	 * @generated
	 */
	int MARIA_DB_TEST_GROUP_TABLES = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_GROUP_TABLES__NAME = DatasetloadPackage.TABLE_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_GROUP_TABLES__TABLES = DatasetloadPackage.TABLE_GROUP__TABLES;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_GROUP_TABLES__DATA_SOURCE = DatasetloadPackage.TABLE_GROUP__DATA_SOURCE;

	/**
	 * The feature id for the '<em><b>Maria Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_GROUP_TABLES__MARIA_TABLES = DatasetloadPackage.TABLE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Maria Db Test Group Tables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_GROUP_TABLES_FEATURE_COUNT = DatasetloadPackage.TABLE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_GROUP_TABLES___LOAD = DatasetloadPackage.TABLE_GROUP___LOAD;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_GROUP_TABLES___REFRESH = DatasetloadPackage.TABLE_GROUP___REFRESH;

	/**
	 * The number of operations of the '<em>Maria Db Test Group Tables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_GROUP_TABLES_OPERATION_COUNT = DatasetloadPackage.TABLE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousedatasetload.impl.MariaDbTestTableImpl <em>Maria Db Test Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousedatasetload.impl.MariaDbTestTableImpl
	 * @see com.misc.touse.moplaf.tousedatasetload.impl.TousedatasetloadPackageImpl#getMariaDbTestTable()
	 * @generated
	 */
	int MARIA_DB_TEST_TABLE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_TABLE__NAME = DatasetloadPackage.TABLE__NAME;

	/**
	 * The feature id for the '<em><b>Table Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_TABLE__TABLE_GROUP = DatasetloadPackage.TABLE__TABLE_GROUP;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_TABLE__ROWS = DatasetloadPackage.TABLE__ROWS;

	/**
	 * The feature id for the '<em><b>Param Table Group Attributes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_TABLE__PARAM_TABLE_GROUP_ATTRIBUTES = DatasetloadPackage.TABLE__PARAM_TABLE_GROUP_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>SQL Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_TABLE__SQL_STATEMENT = DatasetloadPackage.TABLE__SQL_STATEMENT;

	/**
	 * The feature id for the '<em><b>Column Table Row Attributes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_TABLE__COLUMN_TABLE_ROW_ATTRIBUTES = DatasetloadPackage.TABLE__COLUMN_TABLE_ROW_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Key Columns</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_TABLE__KEY_COLUMNS = DatasetloadPackage.TABLE__KEY_COLUMNS;

	/**
	 * The feature id for the '<em><b>Last Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_TABLE__LAST_LOAD = DatasetloadPackage.TABLE__LAST_LOAD;

	/**
	 * The feature id for the '<em><b>Number Of Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_TABLE__NUMBER_OF_ROWS = DatasetloadPackage.TABLE__NUMBER_OF_ROWS;

	/**
	 * The feature id for the '<em><b>Maria Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_TABLE__MARIA_ROWS = DatasetloadPackage.TABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Maria Db Test Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_TABLE_FEATURE_COUNT = DatasetloadPackage.TABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_TABLE___LOAD = DatasetloadPackage.TABLE___LOAD;

	/**
	 * The operation id for the '<em>New Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_TABLE___NEW_ROW = DatasetloadPackage.TABLE___NEW_ROW;

	/**
	 * The operation id for the '<em>Add Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_TABLE___ADD_ROW__TABLEROW = DatasetloadPackage.TABLE___ADD_ROW__TABLEROW;

	/**
	 * The operation id for the '<em>Get Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_TABLE___GET_ROW__TABLEROWKEYIMPL = DatasetloadPackage.TABLE___GET_ROW__TABLEROWKEYIMPL;

	/**
	 * The operation id for the '<em>Remove Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_TABLE___REMOVE_ROW__TABLEROW = DatasetloadPackage.TABLE___REMOVE_ROW__TABLEROW;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_TABLE___REFRESH = DatasetloadPackage.TABLE___REFRESH;

	/**
	 * The number of operations of the '<em>Maria Db Test Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_TABLE_OPERATION_COUNT = DatasetloadPackage.TABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousedatasetload.impl.MariaDbTestRowImpl <em>Maria Db Test Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousedatasetload.impl.MariaDbTestRowImpl
	 * @see com.misc.touse.moplaf.tousedatasetload.impl.TousedatasetloadPackageImpl#getMariaDbTestRow()
	 * @generated
	 */
	int MARIA_DB_TEST_ROW = 9;

	/**
	 * The feature id for the '<em><b>Row Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_ROW__ROW_NUMBER = DatasetloadPackage.TABLE_ROW__ROW_NUMBER;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_ROW__TABLE = DatasetloadPackage.TABLE_ROW__TABLE;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_ROW__KEY = DatasetloadPackage.TABLE_ROW__KEY;

	/**
	 * The feature id for the '<em><b>New Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_ROW__NEW_ROW = DatasetloadPackage.TABLE_ROW__NEW_ROW;

	/**
	 * The feature id for the '<em><b>Col1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_ROW__COL1 = DatasetloadPackage.TABLE_ROW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Col2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_ROW__COL2 = DatasetloadPackage.TABLE_ROW_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Maria Db Test Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_ROW_FEATURE_COUNT = DatasetloadPackage.TABLE_ROW_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_ROW___REFRESH = DatasetloadPackage.TABLE_ROW___REFRESH;

	/**
	 * The number of operations of the '<em>Maria Db Test Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARIA_DB_TEST_ROW_OPERATION_COUNT = DatasetloadPackage.TABLE_ROW_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousedatasetload.FPD <em>FPD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FPD</em>'.
	 * @see com.misc.touse.moplaf.tousedatasetload.FPD
	 * @generated
	 */
	EClass getFPD();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.touse.moplaf.tousedatasetload.FPD#getSortingPlansSet <em>Sorting Plans Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sorting Plans Set</em>'.
	 * @see com.misc.touse.moplaf.tousedatasetload.FPD#getSortingPlansSet()
	 * @see #getFPD()
	 * @generated
	 */
	EReference getFPD_SortingPlansSet();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousedatasetload.FPDGroupSortingPlan <em>FPD Group Sorting Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FPD Group Sorting Plan</em>'.
	 * @see com.misc.touse.moplaf.tousedatasetload.FPDGroupSortingPlan
	 * @generated
	 */
	EClass getFPDGroupSortingPlan();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousedatasetload.FPDGroupSortingPlan#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see com.misc.touse.moplaf.tousedatasetload.FPDGroupSortingPlan#getFromDate()
	 * @see #getFPDGroupSortingPlan()
	 * @generated
	 */
	EAttribute getFPDGroupSortingPlan_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousedatasetload.FPDGroupSortingPlan#getToDate <em>To Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Date</em>'.
	 * @see com.misc.touse.moplaf.tousedatasetload.FPDGroupSortingPlan#getToDate()
	 * @see #getFPDGroupSortingPlan()
	 * @generated
	 */
	EAttribute getFPDGroupSortingPlan_ToDate();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.touse.moplaf.tousedatasetload.FPDGroupSortingPlan#getSortingPlansTable <em>Sorting Plans Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sorting Plans Table</em>'.
	 * @see com.misc.touse.moplaf.tousedatasetload.FPDGroupSortingPlan#getSortingPlansTable()
	 * @see #getFPDGroupSortingPlan()
	 * @generated
	 */
	EReference getFPDGroupSortingPlan_SortingPlansTable();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.touse.moplaf.tousedatasetload.FPDGroupSortingPlan#getSortingPlanInputsTable <em>Sorting Plan Inputs Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sorting Plan Inputs Table</em>'.
	 * @see com.misc.touse.moplaf.tousedatasetload.FPDGroupSortingPlan#getSortingPlanInputsTable()
	 * @see #getFPDGroupSortingPlan()
	 * @generated
	 */
	EReference getFPDGroupSortingPlan_SortingPlanInputsTable();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousedatasetload.FPDSortingPlans <em>FPD Sorting Plans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FPD Sorting Plans</em>'.
	 * @see com.misc.touse.moplaf.tousedatasetload.FPDSortingPlans
	 * @generated
	 */
	EClass getFPDSortingPlans();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.tousedatasetload.FPDSortingPlans#getSortingPlans <em>Sorting Plans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sorting Plans</em>'.
	 * @see com.misc.touse.moplaf.tousedatasetload.FPDSortingPlans#getSortingPlans()
	 * @see #getFPDSortingPlans()
	 * @generated
	 */
	EReference getFPDSortingPlans_SortingPlans();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousedatasetload.FPDSortingPlanInputs <em>FPD Sorting Plan Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FPD Sorting Plan Inputs</em>'.
	 * @see com.misc.touse.moplaf.tousedatasetload.FPDSortingPlanInputs
	 * @generated
	 */
	EClass getFPDSortingPlanInputs();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.tousedatasetload.FPDSortingPlanInputs#getSortingPlanInputs <em>Sorting Plan Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sorting Plan Inputs</em>'.
	 * @see com.misc.touse.moplaf.tousedatasetload.FPDSortingPlanInputs#getSortingPlanInputs()
	 * @see #getFPDSortingPlanInputs()
	 * @generated
	 */
	EReference getFPDSortingPlanInputs_SortingPlanInputs();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousedatasetload.FPDSortingPlan <em>FPD Sorting Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FPD Sorting Plan</em>'.
	 * @see com.misc.touse.moplaf.tousedatasetload.FPDSortingPlan
	 * @generated
	 */
	EClass getFPDSortingPlan();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousedatasetload.FPDSortingPlan#getSortingPlanID <em>Sorting Plan ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sorting Plan ID</em>'.
	 * @see com.misc.touse.moplaf.tousedatasetload.FPDSortingPlan#getSortingPlanID()
	 * @see #getFPDSortingPlan()
	 * @generated
	 */
	EAttribute getFPDSortingPlan_SortingPlanID();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousedatasetload.FPDSortingPlan#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.touse.moplaf.tousedatasetload.FPDSortingPlan#getName()
	 * @see #getFPDSortingPlan()
	 * @generated
	 */
	EAttribute getFPDSortingPlan_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousedatasetload.FPDSortingPlan#getValidFrom <em>Valid From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid From</em>'.
	 * @see com.misc.touse.moplaf.tousedatasetload.FPDSortingPlan#getValidFrom()
	 * @see #getFPDSortingPlan()
	 * @generated
	 */
	EAttribute getFPDSortingPlan_ValidFrom();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousedatasetload.FPDSortingPlan#getValidTo <em>Valid To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid To</em>'.
	 * @see com.misc.touse.moplaf.tousedatasetload.FPDSortingPlan#getValidTo()
	 * @see #getFPDSortingPlan()
	 * @generated
	 */
	EAttribute getFPDSortingPlan_ValidTo();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousedatasetload.FPDSortingPlanInput <em>FPD Sorting Plan Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FPD Sorting Plan Input</em>'.
	 * @see com.misc.touse.moplaf.tousedatasetload.FPDSortingPlanInput
	 * @generated
	 */
	EClass getFPDSortingPlanInput();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousedatasetload.FPDSortingPlanInput#getProductID <em>Product ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product ID</em>'.
	 * @see com.misc.touse.moplaf.tousedatasetload.FPDSortingPlanInput#getProductID()
	 * @see #getFPDSortingPlanInput()
	 * @generated
	 */
	EAttribute getFPDSortingPlanInput_ProductID();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousedatasetload.FPDSortingPlanInput#getSortingPlanID <em>Sorting Plan ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sorting Plan ID</em>'.
	 * @see com.misc.touse.moplaf.tousedatasetload.FPDSortingPlanInput#getSortingPlanID()
	 * @see #getFPDSortingPlanInput()
	 * @generated
	 */
	EAttribute getFPDSortingPlanInput_SortingPlanID();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousedatasetload.MariaDbTestDatabase <em>Maria Db Test Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maria Db Test Database</em>'.
	 * @see com.misc.touse.moplaf.tousedatasetload.MariaDbTestDatabase
	 * @generated
	 */
	EClass getMariaDbTestDatabase();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.tousedatasetload.MariaDbTestDatabase#getTableSets <em>Table Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Sets</em>'.
	 * @see com.misc.touse.moplaf.tousedatasetload.MariaDbTestDatabase#getTableSets()
	 * @see #getMariaDbTestDatabase()
	 * @generated
	 */
	EReference getMariaDbTestDatabase_TableSets();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousedatasetload.MariaDbTestGroupTables <em>Maria Db Test Group Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maria Db Test Group Tables</em>'.
	 * @see com.misc.touse.moplaf.tousedatasetload.MariaDbTestGroupTables
	 * @generated
	 */
	EClass getMariaDbTestGroupTables();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.tousedatasetload.MariaDbTestGroupTables#getMariaTables <em>Maria Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Maria Tables</em>'.
	 * @see com.misc.touse.moplaf.tousedatasetload.MariaDbTestGroupTables#getMariaTables()
	 * @see #getMariaDbTestGroupTables()
	 * @generated
	 */
	EReference getMariaDbTestGroupTables_MariaTables();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousedatasetload.MariaDbTestTable <em>Maria Db Test Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maria Db Test Table</em>'.
	 * @see com.misc.touse.moplaf.tousedatasetload.MariaDbTestTable
	 * @generated
	 */
	EClass getMariaDbTestTable();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.tousedatasetload.MariaDbTestTable#getMariaRows <em>Maria Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Maria Rows</em>'.
	 * @see com.misc.touse.moplaf.tousedatasetload.MariaDbTestTable#getMariaRows()
	 * @see #getMariaDbTestTable()
	 * @generated
	 */
	EReference getMariaDbTestTable_MariaRows();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousedatasetload.MariaDbTestRow <em>Maria Db Test Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maria Db Test Row</em>'.
	 * @see com.misc.touse.moplaf.tousedatasetload.MariaDbTestRow
	 * @generated
	 */
	EClass getMariaDbTestRow();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousedatasetload.MariaDbTestRow#getCol1 <em>Col1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Col1</em>'.
	 * @see com.misc.touse.moplaf.tousedatasetload.MariaDbTestRow#getCol1()
	 * @see #getMariaDbTestRow()
	 * @generated
	 */
	EAttribute getMariaDbTestRow_Col1();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousedatasetload.MariaDbTestRow#getCol2 <em>Col2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Col2</em>'.
	 * @see com.misc.touse.moplaf.tousedatasetload.MariaDbTestRow#getCol2()
	 * @see #getMariaDbTestRow()
	 * @generated
	 */
	EAttribute getMariaDbTestRow_Col2();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TousedatasetloadFactory getTousedatasetloadFactory();

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
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousedatasetload.impl.FPDImpl <em>FPD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousedatasetload.impl.FPDImpl
		 * @see com.misc.touse.moplaf.tousedatasetload.impl.TousedatasetloadPackageImpl#getFPD()
		 * @generated
		 */
		EClass FPD = eINSTANCE.getFPD();

		/**
		 * The meta object literal for the '<em><b>Sorting Plans Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FPD__SORTING_PLANS_SET = eINSTANCE.getFPD_SortingPlansSet();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousedatasetload.impl.FPDGroupSortingPlanImpl <em>FPD Group Sorting Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousedatasetload.impl.FPDGroupSortingPlanImpl
		 * @see com.misc.touse.moplaf.tousedatasetload.impl.TousedatasetloadPackageImpl#getFPDGroupSortingPlan()
		 * @generated
		 */
		EClass FPD_GROUP_SORTING_PLAN = eINSTANCE.getFPDGroupSortingPlan();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPD_GROUP_SORTING_PLAN__FROM_DATE = eINSTANCE.getFPDGroupSortingPlan_FromDate();

		/**
		 * The meta object literal for the '<em><b>To Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPD_GROUP_SORTING_PLAN__TO_DATE = eINSTANCE.getFPDGroupSortingPlan_ToDate();

		/**
		 * The meta object literal for the '<em><b>Sorting Plans Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FPD_GROUP_SORTING_PLAN__SORTING_PLANS_TABLE = eINSTANCE.getFPDGroupSortingPlan_SortingPlansTable();

		/**
		 * The meta object literal for the '<em><b>Sorting Plan Inputs Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FPD_GROUP_SORTING_PLAN__SORTING_PLAN_INPUTS_TABLE = eINSTANCE.getFPDGroupSortingPlan_SortingPlanInputsTable();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousedatasetload.impl.FPDSortingPlansImpl <em>FPD Sorting Plans</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousedatasetload.impl.FPDSortingPlansImpl
		 * @see com.misc.touse.moplaf.tousedatasetload.impl.TousedatasetloadPackageImpl#getFPDSortingPlans()
		 * @generated
		 */
		EClass FPD_SORTING_PLANS = eINSTANCE.getFPDSortingPlans();

		/**
		 * The meta object literal for the '<em><b>Sorting Plans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FPD_SORTING_PLANS__SORTING_PLANS = eINSTANCE.getFPDSortingPlans_SortingPlans();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousedatasetload.impl.FPDSortingPlanInputsImpl <em>FPD Sorting Plan Inputs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousedatasetload.impl.FPDSortingPlanInputsImpl
		 * @see com.misc.touse.moplaf.tousedatasetload.impl.TousedatasetloadPackageImpl#getFPDSortingPlanInputs()
		 * @generated
		 */
		EClass FPD_SORTING_PLAN_INPUTS = eINSTANCE.getFPDSortingPlanInputs();

		/**
		 * The meta object literal for the '<em><b>Sorting Plan Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FPD_SORTING_PLAN_INPUTS__SORTING_PLAN_INPUTS = eINSTANCE.getFPDSortingPlanInputs_SortingPlanInputs();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousedatasetload.impl.FPDSortingPlanImpl <em>FPD Sorting Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousedatasetload.impl.FPDSortingPlanImpl
		 * @see com.misc.touse.moplaf.tousedatasetload.impl.TousedatasetloadPackageImpl#getFPDSortingPlan()
		 * @generated
		 */
		EClass FPD_SORTING_PLAN = eINSTANCE.getFPDSortingPlan();

		/**
		 * The meta object literal for the '<em><b>Sorting Plan ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPD_SORTING_PLAN__SORTING_PLAN_ID = eINSTANCE.getFPDSortingPlan_SortingPlanID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPD_SORTING_PLAN__NAME = eINSTANCE.getFPDSortingPlan_Name();

		/**
		 * The meta object literal for the '<em><b>Valid From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPD_SORTING_PLAN__VALID_FROM = eINSTANCE.getFPDSortingPlan_ValidFrom();

		/**
		 * The meta object literal for the '<em><b>Valid To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPD_SORTING_PLAN__VALID_TO = eINSTANCE.getFPDSortingPlan_ValidTo();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousedatasetload.impl.FPDSortingPlanInputImpl <em>FPD Sorting Plan Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousedatasetload.impl.FPDSortingPlanInputImpl
		 * @see com.misc.touse.moplaf.tousedatasetload.impl.TousedatasetloadPackageImpl#getFPDSortingPlanInput()
		 * @generated
		 */
		EClass FPD_SORTING_PLAN_INPUT = eINSTANCE.getFPDSortingPlanInput();

		/**
		 * The meta object literal for the '<em><b>Product ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPD_SORTING_PLAN_INPUT__PRODUCT_ID = eINSTANCE.getFPDSortingPlanInput_ProductID();

		/**
		 * The meta object literal for the '<em><b>Sorting Plan ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPD_SORTING_PLAN_INPUT__SORTING_PLAN_ID = eINSTANCE.getFPDSortingPlanInput_SortingPlanID();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousedatasetload.impl.MariaDbTestDatabaseImpl <em>Maria Db Test Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousedatasetload.impl.MariaDbTestDatabaseImpl
		 * @see com.misc.touse.moplaf.tousedatasetload.impl.TousedatasetloadPackageImpl#getMariaDbTestDatabase()
		 * @generated
		 */
		EClass MARIA_DB_TEST_DATABASE = eINSTANCE.getMariaDbTestDatabase();

		/**
		 * The meta object literal for the '<em><b>Table Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARIA_DB_TEST_DATABASE__TABLE_SETS = eINSTANCE.getMariaDbTestDatabase_TableSets();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousedatasetload.impl.MariaDbTestGroupTablesImpl <em>Maria Db Test Group Tables</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousedatasetload.impl.MariaDbTestGroupTablesImpl
		 * @see com.misc.touse.moplaf.tousedatasetload.impl.TousedatasetloadPackageImpl#getMariaDbTestGroupTables()
		 * @generated
		 */
		EClass MARIA_DB_TEST_GROUP_TABLES = eINSTANCE.getMariaDbTestGroupTables();

		/**
		 * The meta object literal for the '<em><b>Maria Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARIA_DB_TEST_GROUP_TABLES__MARIA_TABLES = eINSTANCE.getMariaDbTestGroupTables_MariaTables();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousedatasetload.impl.MariaDbTestTableImpl <em>Maria Db Test Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousedatasetload.impl.MariaDbTestTableImpl
		 * @see com.misc.touse.moplaf.tousedatasetload.impl.TousedatasetloadPackageImpl#getMariaDbTestTable()
		 * @generated
		 */
		EClass MARIA_DB_TEST_TABLE = eINSTANCE.getMariaDbTestTable();

		/**
		 * The meta object literal for the '<em><b>Maria Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARIA_DB_TEST_TABLE__MARIA_ROWS = eINSTANCE.getMariaDbTestTable_MariaRows();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousedatasetload.impl.MariaDbTestRowImpl <em>Maria Db Test Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousedatasetload.impl.MariaDbTestRowImpl
		 * @see com.misc.touse.moplaf.tousedatasetload.impl.TousedatasetloadPackageImpl#getMariaDbTestRow()
		 * @generated
		 */
		EClass MARIA_DB_TEST_ROW = eINSTANCE.getMariaDbTestRow();

		/**
		 * The meta object literal for the '<em><b>Col1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARIA_DB_TEST_ROW__COL1 = eINSTANCE.getMariaDbTestRow_Col1();

		/**
		 * The meta object literal for the '<em><b>Col2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARIA_DB_TEST_ROW__COL2 = eINSTANCE.getMariaDbTestRow_Col2();

	}

} //TousedatasetloadPackage
