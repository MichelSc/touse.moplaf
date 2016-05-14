/**
 */
package com.misc.touse.moplaf.dbsynch.tousedbsynch;

import com.misc.common.moplaf.dbsynch.DbSynchPackage;

import com.misc.common.moplaf.dbsynch.dbsynchderby.DbsynchderbyPackage;

import com.misc.common.moplaf.dbsynch.dbsynchjtds.DbsynchjtdsPackage;
import com.misc.common.moplaf.dbsynch.dbsynchmysql.DbsynchmysqlPackage;

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
 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.ToUseDbSynchFactory
 * @model kind="package"
 * @generated
 */
public interface ToUseDbSynchPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tousedbsynch";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "//www.misc.com/touse/moplaf/dbsynch/model/0.1";

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
	ToUseDbSynchPackage eINSTANCE = com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.ToUseDbSynchPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDImpl <em>FPD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDImpl
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.ToUseDbSynchPackageImpl#getFPD()
	 * @generated
	 */
	int FPD = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD__TABLES = DbsynchderbyPackage.DATA_SOURCE_JDBC_DERBY_EMBEDDED__TABLES;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD__DATA_SOURCE = DbsynchderbyPackage.DATA_SOURCE_JDBC_DERBY_EMBEDDED__DATA_SOURCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD__NAME = DbsynchderbyPackage.DATA_SOURCE_JDBC_DERBY_EMBEDDED__NAME;

	/**
	 * The feature id for the '<em><b>Child Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD__CHILD_UNITS = DbsynchderbyPackage.DATA_SOURCE_JDBC_DERBY_EMBEDDED__CHILD_UNITS;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD__CONNECTED = DbsynchderbyPackage.DATA_SOURCE_JDBC_DERBY_EMBEDDED__CONNECTED;

	/**
	 * The feature id for the '<em><b>Data Base User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD__DATA_BASE_USER = DbsynchderbyPackage.DATA_SOURCE_JDBC_DERBY_EMBEDDED__DATA_BASE_USER;

	/**
	 * The feature id for the '<em><b>Data Base User Pwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD__DATA_BASE_USER_PWD = DbsynchderbyPackage.DATA_SOURCE_JDBC_DERBY_EMBEDDED__DATA_BASE_USER_PWD;

	/**
	 * The feature id for the '<em><b>Default Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD__DEFAULT_SCHEMA = DbsynchderbyPackage.DATA_SOURCE_JDBC_DERBY_EMBEDDED__DEFAULT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Database Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD__DATABASE_PATH = DbsynchderbyPackage.DATA_SOURCE_JDBC_DERBY_EMBEDDED__DATABASE_PATH;

	/**
	 * The feature id for the '<em><b>Sorting Plans Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD__SORTING_PLANS_SET = DbsynchderbyPackage.DATA_SOURCE_JDBC_DERBY_EMBEDDED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FPD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_FEATURE_COUNT = DbsynchderbyPackage.DATA_SOURCE_JDBC_DERBY_EMBEDDED_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Refresh Meta Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD___REFRESH_META_DATA = DbsynchderbyPackage.DATA_SOURCE_JDBC_DERBY_EMBEDDED___REFRESH_META_DATA;

	/**
	 * The operation id for the '<em>Synch Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD___SYNCH_UP = DbsynchderbyPackage.DATA_SOURCE_JDBC_DERBY_EMBEDDED___SYNCH_UP;

	/**
	 * The operation id for the '<em>Synch Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD___SYNCH_DOWN = DbsynchderbyPackage.DATA_SOURCE_JDBC_DERBY_EMBEDDED___SYNCH_DOWN;

	/**
	 * The operation id for the '<em>Get Param Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD___GET_PARAM_VALUE__EATTRIBUTE = DbsynchderbyPackage.DATA_SOURCE_JDBC_DERBY_EMBEDDED___GET_PARAM_VALUE__EATTRIBUTE;

	/**
	 * The operation id for the '<em>Get Param Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD___GET_PARAM_ATTRIBUTES = DbsynchderbyPackage.DATA_SOURCE_JDBC_DERBY_EMBEDDED___GET_PARAM_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD___CONNECT = DbsynchderbyPackage.DATA_SOURCE_JDBC_DERBY_EMBEDDED___CONNECT;

	/**
	 * The operation id for the '<em>Disconnect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD___DISCONNECT = DbsynchderbyPackage.DATA_SOURCE_JDBC_DERBY_EMBEDDED___DISCONNECT;

	/**
	 * The operation id for the '<em>Synch Down Table Impl</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD___SYNCH_DOWN_TABLE_IMPL__TABLE = DbsynchderbyPackage.DATA_SOURCE_JDBC_DERBY_EMBEDDED___SYNCH_DOWN_TABLE_IMPL__TABLE;

	/**
	 * The operation id for the '<em>Synch Up Table Impl</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD___SYNCH_UP_TABLE_IMPL__TABLE = DbsynchderbyPackage.DATA_SOURCE_JDBC_DERBY_EMBEDDED___SYNCH_UP_TABLE_IMPL__TABLE;

	/**
	 * The number of operations of the '<em>FPD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_OPERATION_COUNT = DbsynchderbyPackage.DATA_SOURCE_JDBC_DERBY_EMBEDDED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDGroupSortingPlanImpl <em>FPD Group Sorting Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDGroupSortingPlanImpl
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.ToUseDbSynchPackageImpl#getFPDGroupSortingPlan()
	 * @generated
	 */
	int FPD_GROUP_SORTING_PLAN = 1;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_GROUP_SORTING_PLAN__TABLES = DbSynchPackage.DB_SYNCH_UNIT__TABLES;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_GROUP_SORTING_PLAN__DATA_SOURCE = DbSynchPackage.DB_SYNCH_UNIT__DATA_SOURCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_GROUP_SORTING_PLAN__NAME = DbSynchPackage.DB_SYNCH_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Child Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_GROUP_SORTING_PLAN__CHILD_UNITS = DbSynchPackage.DB_SYNCH_UNIT__CHILD_UNITS;

	/**
	 * The feature id for the '<em><b>Parent Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_GROUP_SORTING_PLAN__PARENT_UNIT = DbSynchPackage.DB_SYNCH_UNIT__PARENT_UNIT;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_GROUP_SORTING_PLAN__FROM_DATE = DbSynchPackage.DB_SYNCH_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_GROUP_SORTING_PLAN__TO_DATE = DbSynchPackage.DB_SYNCH_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sorting Plans Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_GROUP_SORTING_PLAN__SORTING_PLANS_TABLE = DbSynchPackage.DB_SYNCH_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sorting Plan Inputs Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_GROUP_SORTING_PLAN__SORTING_PLAN_INPUTS_TABLE = DbSynchPackage.DB_SYNCH_UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>FPD Group Sorting Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_GROUP_SORTING_PLAN_FEATURE_COUNT = DbSynchPackage.DB_SYNCH_UNIT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Refresh Meta Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_GROUP_SORTING_PLAN___REFRESH_META_DATA = DbSynchPackage.DB_SYNCH_UNIT___REFRESH_META_DATA;

	/**
	 * The operation id for the '<em>Synch Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_GROUP_SORTING_PLAN___SYNCH_UP = DbSynchPackage.DB_SYNCH_UNIT___SYNCH_UP;

	/**
	 * The operation id for the '<em>Synch Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_GROUP_SORTING_PLAN___SYNCH_DOWN = DbSynchPackage.DB_SYNCH_UNIT___SYNCH_DOWN;

	/**
	 * The operation id for the '<em>Get Param Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_GROUP_SORTING_PLAN___GET_PARAM_VALUE__EATTRIBUTE = DbSynchPackage.DB_SYNCH_UNIT___GET_PARAM_VALUE__EATTRIBUTE;

	/**
	 * The operation id for the '<em>Get Param Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_GROUP_SORTING_PLAN___GET_PARAM_ATTRIBUTES = DbSynchPackage.DB_SYNCH_UNIT___GET_PARAM_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_GROUP_SORTING_PLAN___REFRESH = DbSynchPackage.DB_SYNCH_UNIT___REFRESH;

	/**
	 * The number of operations of the '<em>FPD Group Sorting Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_GROUP_SORTING_PLAN_OPERATION_COUNT = DbSynchPackage.DB_SYNCH_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDSortingPlansImpl <em>FPD Sorting Plans</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDSortingPlansImpl
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.ToUseDbSynchPackageImpl#getFPDSortingPlans()
	 * @generated
	 */
	int FPD_SORTING_PLANS = 2;

	/**
	 * The feature id for the '<em><b>Synch Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS__SYNCH_UNIT = DbSynchPackage.TABLE__SYNCH_UNIT;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS__COLUMNS = DbSynchPackage.TABLE__COLUMNS;

	/**
	 * The feature id for the '<em><b>Key Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS__KEY_COLUMNS = DbSynchPackage.TABLE__KEY_COLUMNS;

	/**
	 * The feature id for the '<em><b>Data Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS__DATA_COLUMNS = DbSynchPackage.TABLE__DATA_COLUMNS;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS__TABLE_NAME = DbSynchPackage.TABLE__TABLE_NAME;

	/**
	 * The feature id for the '<em><b>Where Clause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS__WHERE_CLAUSE = DbSynchPackage.TABLE__WHERE_CLAUSE;

	/**
	 * The feature id for the '<em><b>Param Db Synch Unit Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS__PARAM_DB_SYNCH_UNIT_ATTRIBUTES = DbSynchPackage.TABLE__PARAM_DB_SYNCH_UNIT_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS__ROWS = DbSynchPackage.TABLE__ROWS;

	/**
	 * The feature id for the '<em><b>Select Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS__SELECT_SQL_STATEMENT = DbSynchPackage.TABLE__SELECT_SQL_STATEMENT;

	/**
	 * The feature id for the '<em><b>Insert Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS__INSERT_SQL_STATEMENT = DbSynchPackage.TABLE__INSERT_SQL_STATEMENT;

	/**
	 * The feature id for the '<em><b>Update Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS__UPDATE_SQL_STATEMENT = DbSynchPackage.TABLE__UPDATE_SQL_STATEMENT;

	/**
	 * The feature id for the '<em><b>Delete Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS__DELETE_SQL_STATEMENT = DbSynchPackage.TABLE__DELETE_SQL_STATEMENT;

	/**
	 * The feature id for the '<em><b>Number Of Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS__NUMBER_OF_ROWS = DbSynchPackage.TABLE__NUMBER_OF_ROWS;

	/**
	 * The feature id for the '<em><b>Last Synch Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS__LAST_SYNCH_DOWN = DbSynchPackage.TABLE__LAST_SYNCH_DOWN;

	/**
	 * The feature id for the '<em><b>Last Synch Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS__LAST_SYNCH_UP = DbSynchPackage.TABLE__LAST_SYNCH_UP;

	/**
	 * The feature id for the '<em><b>Sorting Plans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS__SORTING_PLANS = DbSynchPackage.TABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FPD Sorting Plans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS_FEATURE_COUNT = DbSynchPackage.TABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Column</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS___ADD_COLUMN__BOOLEAN_STRING_ENUMCOLUMNTYPE_EATTRIBUTE = DbSynchPackage.TABLE___ADD_COLUMN__BOOLEAN_STRING_ENUMCOLUMNTYPE_EATTRIBUTE;

	/**
	 * The operation id for the '<em>Add Param</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS___ADD_PARAM__EATTRIBUTE = DbSynchPackage.TABLE___ADD_PARAM__EATTRIBUTE;

	/**
	 * The operation id for the '<em>Refresh Meta Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS___REFRESH_META_DATA = DbSynchPackage.TABLE___REFRESH_META_DATA;

	/**
	 * The operation id for the '<em>Synch Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS___SYNCH_DOWN = DbSynchPackage.TABLE___SYNCH_DOWN;

	/**
	 * The operation id for the '<em>Synch Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS___SYNCH_UP = DbSynchPackage.TABLE___SYNCH_UP;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS___REFRESH = DbSynchPackage.TABLE___REFRESH;

	/**
	 * The operation id for the '<em>Get Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS___GET_ROW__TABLEROWKEYIMPL = DbSynchPackage.TABLE___GET_ROW__TABLEROWKEYIMPL;

	/**
	 * The operation id for the '<em>Construct Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS___CONSTRUCT_ROW = DbSynchPackage.TABLE___CONSTRUCT_ROW;

	/**
	 * The operation id for the '<em>Index Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS___INDEX_ROW__TABLEROW = DbSynchPackage.TABLE___INDEX_ROW__TABLEROW;

	/**
	 * The operation id for the '<em>Unindex Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS___UNINDEX_ROW__TABLEROW = DbSynchPackage.TABLE___UNINDEX_ROW__TABLEROW;

	/**
	 * The operation id for the '<em>Refresh Index</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS___REFRESH_INDEX = DbSynchPackage.TABLE___REFRESH_INDEX;

	/**
	 * The number of operations of the '<em>FPD Sorting Plans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLANS_OPERATION_COUNT = DbSynchPackage.TABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDSortingPlanInputsImpl <em>FPD Sorting Plan Inputs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDSortingPlanInputsImpl
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.ToUseDbSynchPackageImpl#getFPDSortingPlanInputs()
	 * @generated
	 */
	int FPD_SORTING_PLAN_INPUTS = 3;

	/**
	 * The feature id for the '<em><b>Synch Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS__SYNCH_UNIT = DbSynchPackage.TABLE__SYNCH_UNIT;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS__COLUMNS = DbSynchPackage.TABLE__COLUMNS;

	/**
	 * The feature id for the '<em><b>Key Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS__KEY_COLUMNS = DbSynchPackage.TABLE__KEY_COLUMNS;

	/**
	 * The feature id for the '<em><b>Data Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS__DATA_COLUMNS = DbSynchPackage.TABLE__DATA_COLUMNS;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS__TABLE_NAME = DbSynchPackage.TABLE__TABLE_NAME;

	/**
	 * The feature id for the '<em><b>Where Clause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS__WHERE_CLAUSE = DbSynchPackage.TABLE__WHERE_CLAUSE;

	/**
	 * The feature id for the '<em><b>Param Db Synch Unit Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS__PARAM_DB_SYNCH_UNIT_ATTRIBUTES = DbSynchPackage.TABLE__PARAM_DB_SYNCH_UNIT_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS__ROWS = DbSynchPackage.TABLE__ROWS;

	/**
	 * The feature id for the '<em><b>Select Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS__SELECT_SQL_STATEMENT = DbSynchPackage.TABLE__SELECT_SQL_STATEMENT;

	/**
	 * The feature id for the '<em><b>Insert Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS__INSERT_SQL_STATEMENT = DbSynchPackage.TABLE__INSERT_SQL_STATEMENT;

	/**
	 * The feature id for the '<em><b>Update Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS__UPDATE_SQL_STATEMENT = DbSynchPackage.TABLE__UPDATE_SQL_STATEMENT;

	/**
	 * The feature id for the '<em><b>Delete Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS__DELETE_SQL_STATEMENT = DbSynchPackage.TABLE__DELETE_SQL_STATEMENT;

	/**
	 * The feature id for the '<em><b>Number Of Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS__NUMBER_OF_ROWS = DbSynchPackage.TABLE__NUMBER_OF_ROWS;

	/**
	 * The feature id for the '<em><b>Last Synch Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS__LAST_SYNCH_DOWN = DbSynchPackage.TABLE__LAST_SYNCH_DOWN;

	/**
	 * The feature id for the '<em><b>Last Synch Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS__LAST_SYNCH_UP = DbSynchPackage.TABLE__LAST_SYNCH_UP;

	/**
	 * The feature id for the '<em><b>Sorting Plan Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS__SORTING_PLAN_INPUTS = DbSynchPackage.TABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FPD Sorting Plan Inputs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS_FEATURE_COUNT = DbSynchPackage.TABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Column</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS___ADD_COLUMN__BOOLEAN_STRING_ENUMCOLUMNTYPE_EATTRIBUTE = DbSynchPackage.TABLE___ADD_COLUMN__BOOLEAN_STRING_ENUMCOLUMNTYPE_EATTRIBUTE;

	/**
	 * The operation id for the '<em>Add Param</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS___ADD_PARAM__EATTRIBUTE = DbSynchPackage.TABLE___ADD_PARAM__EATTRIBUTE;

	/**
	 * The operation id for the '<em>Refresh Meta Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS___REFRESH_META_DATA = DbSynchPackage.TABLE___REFRESH_META_DATA;

	/**
	 * The operation id for the '<em>Synch Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS___SYNCH_DOWN = DbSynchPackage.TABLE___SYNCH_DOWN;

	/**
	 * The operation id for the '<em>Synch Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS___SYNCH_UP = DbSynchPackage.TABLE___SYNCH_UP;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS___REFRESH = DbSynchPackage.TABLE___REFRESH;

	/**
	 * The operation id for the '<em>Get Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS___GET_ROW__TABLEROWKEYIMPL = DbSynchPackage.TABLE___GET_ROW__TABLEROWKEYIMPL;

	/**
	 * The operation id for the '<em>Construct Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS___CONSTRUCT_ROW = DbSynchPackage.TABLE___CONSTRUCT_ROW;

	/**
	 * The operation id for the '<em>Index Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS___INDEX_ROW__TABLEROW = DbSynchPackage.TABLE___INDEX_ROW__TABLEROW;

	/**
	 * The operation id for the '<em>Unindex Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS___UNINDEX_ROW__TABLEROW = DbSynchPackage.TABLE___UNINDEX_ROW__TABLEROW;

	/**
	 * The operation id for the '<em>Refresh Index</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS___REFRESH_INDEX = DbSynchPackage.TABLE___REFRESH_INDEX;

	/**
	 * The number of operations of the '<em>FPD Sorting Plan Inputs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUTS_OPERATION_COUNT = DbSynchPackage.TABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDSortingPlanImpl <em>FPD Sorting Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDSortingPlanImpl
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.ToUseDbSynchPackageImpl#getFPDSortingPlan()
	 * @generated
	 */
	int FPD_SORTING_PLAN = 4;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN__TABLE = DbSynchPackage.TABLE_ROW__TABLE;

	/**
	 * The feature id for the '<em><b>Current Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN__CURRENT_KEY = DbSynchPackage.TABLE_ROW__CURRENT_KEY;

	/**
	 * The feature id for the '<em><b>Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN__DELETED = DbSynchPackage.TABLE_ROW__DELETED;

	/**
	 * The feature id for the '<em><b>Index Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN__INDEX_KEY = DbSynchPackage.TABLE_ROW__INDEX_KEY;

	/**
	 * The feature id for the '<em><b>Last Synch Down Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN__LAST_SYNCH_DOWN_KEY = DbSynchPackage.TABLE_ROW__LAST_SYNCH_DOWN_KEY;

	/**
	 * The feature id for the '<em><b>Last Synch Down Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN__LAST_SYNCH_DOWN_DELETED = DbSynchPackage.TABLE_ROW__LAST_SYNCH_DOWN_DELETED;

	/**
	 * The feature id for the '<em><b>Modification Last Synch Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN__MODIFICATION_LAST_SYNCH_UP = DbSynchPackage.TABLE_ROW__MODIFICATION_LAST_SYNCH_UP;

	/**
	 * The feature id for the '<em><b>Modification Next Synch Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN__MODIFICATION_NEXT_SYNCH_DOWN = DbSynchPackage.TABLE_ROW__MODIFICATION_NEXT_SYNCH_DOWN;

	/**
	 * The feature id for the '<em><b>Sorting Plan ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN__SORTING_PLAN_ID = DbSynchPackage.TABLE_ROW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN__NAME = DbSynchPackage.TABLE_ROW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Valid From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN__VALID_FROM = DbSynchPackage.TABLE_ROW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Valid To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN__VALID_TO = DbSynchPackage.TABLE_ROW_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Some Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN__SOME_DATE_TIME = DbSynchPackage.TABLE_ROW_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Some Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN__SOME_TIME = DbSynchPackage.TABLE_ROW_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>FPD Sorting Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_FEATURE_COUNT = DbSynchPackage.TABLE_ROW_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN___REFRESH = DbSynchPackage.TABLE_ROW___REFRESH;

	/**
	 * The number of operations of the '<em>FPD Sorting Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_OPERATION_COUNT = DbSynchPackage.TABLE_ROW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDSortingPlanInputImpl <em>FPD Sorting Plan Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDSortingPlanInputImpl
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.ToUseDbSynchPackageImpl#getFPDSortingPlanInput()
	 * @generated
	 */
	int FPD_SORTING_PLAN_INPUT = 5;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUT__TABLE = DbSynchPackage.TABLE_ROW__TABLE;

	/**
	 * The feature id for the '<em><b>Current Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUT__CURRENT_KEY = DbSynchPackage.TABLE_ROW__CURRENT_KEY;

	/**
	 * The feature id for the '<em><b>Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUT__DELETED = DbSynchPackage.TABLE_ROW__DELETED;

	/**
	 * The feature id for the '<em><b>Index Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUT__INDEX_KEY = DbSynchPackage.TABLE_ROW__INDEX_KEY;

	/**
	 * The feature id for the '<em><b>Last Synch Down Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUT__LAST_SYNCH_DOWN_KEY = DbSynchPackage.TABLE_ROW__LAST_SYNCH_DOWN_KEY;

	/**
	 * The feature id for the '<em><b>Last Synch Down Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUT__LAST_SYNCH_DOWN_DELETED = DbSynchPackage.TABLE_ROW__LAST_SYNCH_DOWN_DELETED;

	/**
	 * The feature id for the '<em><b>Modification Last Synch Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUT__MODIFICATION_LAST_SYNCH_UP = DbSynchPackage.TABLE_ROW__MODIFICATION_LAST_SYNCH_UP;

	/**
	 * The feature id for the '<em><b>Modification Next Synch Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUT__MODIFICATION_NEXT_SYNCH_DOWN = DbSynchPackage.TABLE_ROW__MODIFICATION_NEXT_SYNCH_DOWN;

	/**
	 * The feature id for the '<em><b>Product ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUT__PRODUCT_ID = DbSynchPackage.TABLE_ROW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sorting Plan ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUT__SORTING_PLAN_ID = DbSynchPackage.TABLE_ROW_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>FPD Sorting Plan Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUT_FEATURE_COUNT = DbSynchPackage.TABLE_ROW_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUT___REFRESH = DbSynchPackage.TABLE_ROW___REFRESH;

	/**
	 * The number of operations of the '<em>FPD Sorting Plan Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_SORTING_PLAN_INPUT_OPERATION_COUNT = DbSynchPackage.TABLE_ROW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDMySqlImpl <em>FPD My Sql</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDMySqlImpl
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.ToUseDbSynchPackageImpl#getFPDMySql()
	 * @generated
	 */
	int FPD_MY_SQL = 6;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_MY_SQL__TABLES = DbsynchmysqlPackage.DATA_SOURCE_JDBC_MY_SQL__TABLES;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_MY_SQL__DATA_SOURCE = DbsynchmysqlPackage.DATA_SOURCE_JDBC_MY_SQL__DATA_SOURCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_MY_SQL__NAME = DbsynchmysqlPackage.DATA_SOURCE_JDBC_MY_SQL__NAME;

	/**
	 * The feature id for the '<em><b>Child Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_MY_SQL__CHILD_UNITS = DbsynchmysqlPackage.DATA_SOURCE_JDBC_MY_SQL__CHILD_UNITS;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_MY_SQL__CONNECTED = DbsynchmysqlPackage.DATA_SOURCE_JDBC_MY_SQL__CONNECTED;

	/**
	 * The feature id for the '<em><b>Data Base User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_MY_SQL__DATA_BASE_USER = DbsynchmysqlPackage.DATA_SOURCE_JDBC_MY_SQL__DATA_BASE_USER;

	/**
	 * The feature id for the '<em><b>Data Base User Pwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_MY_SQL__DATA_BASE_USER_PWD = DbsynchmysqlPackage.DATA_SOURCE_JDBC_MY_SQL__DATA_BASE_USER_PWD;

	/**
	 * The feature id for the '<em><b>Default Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_MY_SQL__DEFAULT_SCHEMA = DbsynchmysqlPackage.DATA_SOURCE_JDBC_MY_SQL__DEFAULT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_MY_SQL__HOST = DbsynchmysqlPackage.DATA_SOURCE_JDBC_MY_SQL__HOST;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_MY_SQL__PORT = DbsynchmysqlPackage.DATA_SOURCE_JDBC_MY_SQL__PORT;

	/**
	 * The feature id for the '<em><b>Data Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_MY_SQL__DATA_BASE = DbsynchmysqlPackage.DATA_SOURCE_JDBC_MY_SQL__DATA_BASE;

	/**
	 * The feature id for the '<em><b>Sorting Plans Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_MY_SQL__SORTING_PLANS_SET = DbsynchmysqlPackage.DATA_SOURCE_JDBC_MY_SQL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FPD My Sql</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_MY_SQL_FEATURE_COUNT = DbsynchmysqlPackage.DATA_SOURCE_JDBC_MY_SQL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Refresh Meta Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_MY_SQL___REFRESH_META_DATA = DbsynchmysqlPackage.DATA_SOURCE_JDBC_MY_SQL___REFRESH_META_DATA;

	/**
	 * The operation id for the '<em>Synch Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_MY_SQL___SYNCH_UP = DbsynchmysqlPackage.DATA_SOURCE_JDBC_MY_SQL___SYNCH_UP;

	/**
	 * The operation id for the '<em>Synch Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_MY_SQL___SYNCH_DOWN = DbsynchmysqlPackage.DATA_SOURCE_JDBC_MY_SQL___SYNCH_DOWN;

	/**
	 * The operation id for the '<em>Get Param Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_MY_SQL___GET_PARAM_VALUE__EATTRIBUTE = DbsynchmysqlPackage.DATA_SOURCE_JDBC_MY_SQL___GET_PARAM_VALUE__EATTRIBUTE;

	/**
	 * The operation id for the '<em>Get Param Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_MY_SQL___GET_PARAM_ATTRIBUTES = DbsynchmysqlPackage.DATA_SOURCE_JDBC_MY_SQL___GET_PARAM_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_MY_SQL___CONNECT = DbsynchmysqlPackage.DATA_SOURCE_JDBC_MY_SQL___CONNECT;

	/**
	 * The operation id for the '<em>Disconnect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_MY_SQL___DISCONNECT = DbsynchmysqlPackage.DATA_SOURCE_JDBC_MY_SQL___DISCONNECT;

	/**
	 * The operation id for the '<em>Synch Down Table Impl</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_MY_SQL___SYNCH_DOWN_TABLE_IMPL__TABLE = DbsynchmysqlPackage.DATA_SOURCE_JDBC_MY_SQL___SYNCH_DOWN_TABLE_IMPL__TABLE;

	/**
	 * The operation id for the '<em>Synch Up Table Impl</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_MY_SQL___SYNCH_UP_TABLE_IMPL__TABLE = DbsynchmysqlPackage.DATA_SOURCE_JDBC_MY_SQL___SYNCH_UP_TABLE_IMPL__TABLE;

	/**
	 * The number of operations of the '<em>FPD My Sql</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_MY_SQL_OPERATION_COUNT = DbsynchmysqlPackage.DATA_SOURCE_JDBC_MY_SQL_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDJtdsImpl <em>FPD Jtds</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDJtdsImpl
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.ToUseDbSynchPackageImpl#getFPDJtds()
	 * @generated
	 */
	int FPD_JTDS = 7;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_JTDS__TABLES = DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS__TABLES;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_JTDS__DATA_SOURCE = DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS__DATA_SOURCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_JTDS__NAME = DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS__NAME;

	/**
	 * The feature id for the '<em><b>Child Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_JTDS__CHILD_UNITS = DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS__CHILD_UNITS;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_JTDS__CONNECTED = DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS__CONNECTED;

	/**
	 * The feature id for the '<em><b>Data Base User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_JTDS__DATA_BASE_USER = DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS__DATA_BASE_USER;

	/**
	 * The feature id for the '<em><b>Data Base User Pwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_JTDS__DATA_BASE_USER_PWD = DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS__DATA_BASE_USER_PWD;

	/**
	 * The feature id for the '<em><b>Default Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_JTDS__DEFAULT_SCHEMA = DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS__DEFAULT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_JTDS__HOST = DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS__HOST;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_JTDS__PORT = DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS__PORT;

	/**
	 * The feature id for the '<em><b>Data Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_JTDS__DATA_BASE = DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS__DATA_BASE;

	/**
	 * The feature id for the '<em><b>Server Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_JTDS__SERVER_TYPE = DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS__SERVER_TYPE;

	/**
	 * The feature id for the '<em><b>User Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_JTDS__USER_DOMAIN = DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS__USER_DOMAIN;

	/**
	 * The feature id for the '<em><b>Sorting Plans Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_JTDS__SORTING_PLANS_SET = DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FPD Jtds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_JTDS_FEATURE_COUNT = DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Refresh Meta Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_JTDS___REFRESH_META_DATA = DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS___REFRESH_META_DATA;

	/**
	 * The operation id for the '<em>Synch Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_JTDS___SYNCH_UP = DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS___SYNCH_UP;

	/**
	 * The operation id for the '<em>Synch Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_JTDS___SYNCH_DOWN = DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS___SYNCH_DOWN;

	/**
	 * The operation id for the '<em>Get Param Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_JTDS___GET_PARAM_VALUE__EATTRIBUTE = DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS___GET_PARAM_VALUE__EATTRIBUTE;

	/**
	 * The operation id for the '<em>Get Param Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_JTDS___GET_PARAM_ATTRIBUTES = DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS___GET_PARAM_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_JTDS___CONNECT = DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS___CONNECT;

	/**
	 * The operation id for the '<em>Disconnect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_JTDS___DISCONNECT = DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS___DISCONNECT;

	/**
	 * The operation id for the '<em>Synch Down Table Impl</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_JTDS___SYNCH_DOWN_TABLE_IMPL__TABLE = DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS___SYNCH_DOWN_TABLE_IMPL__TABLE;

	/**
	 * The operation id for the '<em>Synch Up Table Impl</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_JTDS___SYNCH_UP_TABLE_IMPL__TABLE = DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS___SYNCH_UP_TABLE_IMPL__TABLE;

	/**
	 * The number of operations of the '<em>FPD Jtds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPD_JTDS_OPERATION_COUNT = DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPD <em>FPD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FPD</em>'.
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.FPD
	 * @generated
	 */
	EClass getFPD();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPD#getSortingPlansSet <em>Sorting Plans Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sorting Plans Set</em>'.
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.FPD#getSortingPlansSet()
	 * @see #getFPD()
	 * @generated
	 */
	EReference getFPD_SortingPlansSet();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDGroupSortingPlan <em>FPD Group Sorting Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FPD Group Sorting Plan</em>'.
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDGroupSortingPlan
	 * @generated
	 */
	EClass getFPDGroupSortingPlan();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDGroupSortingPlan#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDGroupSortingPlan#getFromDate()
	 * @see #getFPDGroupSortingPlan()
	 * @generated
	 */
	EAttribute getFPDGroupSortingPlan_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDGroupSortingPlan#getToDate <em>To Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Date</em>'.
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDGroupSortingPlan#getToDate()
	 * @see #getFPDGroupSortingPlan()
	 * @generated
	 */
	EAttribute getFPDGroupSortingPlan_ToDate();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDGroupSortingPlan#getSortingPlansTable <em>Sorting Plans Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sorting Plans Table</em>'.
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDGroupSortingPlan#getSortingPlansTable()
	 * @see #getFPDGroupSortingPlan()
	 * @generated
	 */
	EReference getFPDGroupSortingPlan_SortingPlansTable();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDGroupSortingPlan#getSortingPlanInputsTable <em>Sorting Plan Inputs Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sorting Plan Inputs Table</em>'.
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDGroupSortingPlan#getSortingPlanInputsTable()
	 * @see #getFPDGroupSortingPlan()
	 * @generated
	 */
	EReference getFPDGroupSortingPlan_SortingPlanInputsTable();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlans <em>FPD Sorting Plans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FPD Sorting Plans</em>'.
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlans
	 * @generated
	 */
	EClass getFPDSortingPlans();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlans#getSortingPlans <em>Sorting Plans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sorting Plans</em>'.
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlans#getSortingPlans()
	 * @see #getFPDSortingPlans()
	 * @generated
	 */
	EReference getFPDSortingPlans_SortingPlans();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlanInputs <em>FPD Sorting Plan Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FPD Sorting Plan Inputs</em>'.
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlanInputs
	 * @generated
	 */
	EClass getFPDSortingPlanInputs();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlanInputs#getSortingPlanInputs <em>Sorting Plan Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sorting Plan Inputs</em>'.
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlanInputs#getSortingPlanInputs()
	 * @see #getFPDSortingPlanInputs()
	 * @generated
	 */
	EReference getFPDSortingPlanInputs_SortingPlanInputs();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan <em>FPD Sorting Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FPD Sorting Plan</em>'.
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan
	 * @generated
	 */
	EClass getFPDSortingPlan();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan#getSortingPlanID <em>Sorting Plan ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sorting Plan ID</em>'.
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan#getSortingPlanID()
	 * @see #getFPDSortingPlan()
	 * @generated
	 */
	EAttribute getFPDSortingPlan_SortingPlanID();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan#getName()
	 * @see #getFPDSortingPlan()
	 * @generated
	 */
	EAttribute getFPDSortingPlan_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan#getValidFrom <em>Valid From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid From</em>'.
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan#getValidFrom()
	 * @see #getFPDSortingPlan()
	 * @generated
	 */
	EAttribute getFPDSortingPlan_ValidFrom();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan#getValidTo <em>Valid To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid To</em>'.
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan#getValidTo()
	 * @see #getFPDSortingPlan()
	 * @generated
	 */
	EAttribute getFPDSortingPlan_ValidTo();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan#getSomeDateTime <em>Some Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Some Date Time</em>'.
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan#getSomeDateTime()
	 * @see #getFPDSortingPlan()
	 * @generated
	 */
	EAttribute getFPDSortingPlan_SomeDateTime();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan#getSomeTime <em>Some Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Some Time</em>'.
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan#getSomeTime()
	 * @see #getFPDSortingPlan()
	 * @generated
	 */
	EAttribute getFPDSortingPlan_SomeTime();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlanInput <em>FPD Sorting Plan Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FPD Sorting Plan Input</em>'.
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlanInput
	 * @generated
	 */
	EClass getFPDSortingPlanInput();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlanInput#getProductID <em>Product ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product ID</em>'.
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlanInput#getProductID()
	 * @see #getFPDSortingPlanInput()
	 * @generated
	 */
	EAttribute getFPDSortingPlanInput_ProductID();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlanInput#getSortingPlanID <em>Sorting Plan ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sorting Plan ID</em>'.
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlanInput#getSortingPlanID()
	 * @see #getFPDSortingPlanInput()
	 * @generated
	 */
	EAttribute getFPDSortingPlanInput_SortingPlanID();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDMySql <em>FPD My Sql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FPD My Sql</em>'.
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDMySql
	 * @generated
	 */
	EClass getFPDMySql();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDMySql#getSortingPlansSet <em>Sorting Plans Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sorting Plans Set</em>'.
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDMySql#getSortingPlansSet()
	 * @see #getFPDMySql()
	 * @generated
	 */
	EReference getFPDMySql_SortingPlansSet();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDJtds <em>FPD Jtds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FPD Jtds</em>'.
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDJtds
	 * @generated
	 */
	EClass getFPDJtds();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDJtds#getSortingPlansSet <em>Sorting Plans Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sorting Plans Set</em>'.
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDJtds#getSortingPlansSet()
	 * @see #getFPDJtds()
	 * @generated
	 */
	EReference getFPDJtds_SortingPlansSet();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ToUseDbSynchFactory getToUseDbSynchFactory();

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
		 * The meta object literal for the '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDImpl <em>FPD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDImpl
		 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.ToUseDbSynchPackageImpl#getFPD()
		 * @generated
		 */
		EClass FPD = eINSTANCE.getFPD();

		/**
		 * The meta object literal for the '<em><b>Sorting Plans Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FPD__SORTING_PLANS_SET = eINSTANCE.getFPD_SortingPlansSet();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDGroupSortingPlanImpl <em>FPD Group Sorting Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDGroupSortingPlanImpl
		 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.ToUseDbSynchPackageImpl#getFPDGroupSortingPlan()
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
		 * The meta object literal for the '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDSortingPlansImpl <em>FPD Sorting Plans</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDSortingPlansImpl
		 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.ToUseDbSynchPackageImpl#getFPDSortingPlans()
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
		 * The meta object literal for the '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDSortingPlanInputsImpl <em>FPD Sorting Plan Inputs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDSortingPlanInputsImpl
		 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.ToUseDbSynchPackageImpl#getFPDSortingPlanInputs()
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
		 * The meta object literal for the '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDSortingPlanImpl <em>FPD Sorting Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDSortingPlanImpl
		 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.ToUseDbSynchPackageImpl#getFPDSortingPlan()
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
		 * The meta object literal for the '<em><b>Some Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPD_SORTING_PLAN__SOME_DATE_TIME = eINSTANCE.getFPDSortingPlan_SomeDateTime();

		/**
		 * The meta object literal for the '<em><b>Some Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPD_SORTING_PLAN__SOME_TIME = eINSTANCE.getFPDSortingPlan_SomeTime();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDSortingPlanInputImpl <em>FPD Sorting Plan Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDSortingPlanInputImpl
		 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.ToUseDbSynchPackageImpl#getFPDSortingPlanInput()
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
		 * The meta object literal for the '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDMySqlImpl <em>FPD My Sql</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDMySqlImpl
		 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.ToUseDbSynchPackageImpl#getFPDMySql()
		 * @generated
		 */
		EClass FPD_MY_SQL = eINSTANCE.getFPDMySql();

		/**
		 * The meta object literal for the '<em><b>Sorting Plans Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FPD_MY_SQL__SORTING_PLANS_SET = eINSTANCE.getFPDMySql_SortingPlansSet();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDJtdsImpl <em>FPD Jtds</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDJtdsImpl
		 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.ToUseDbSynchPackageImpl#getFPDJtds()
		 * @generated
		 */
		EClass FPD_JTDS = eINSTANCE.getFPDJtds();

		/**
		 * The meta object literal for the '<em><b>Sorting Plans Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FPD_JTDS__SORTING_PLANS_SET = eINSTANCE.getFPDJtds_SortingPlansSet();

	}

} //ToUseDbSynchPackage
