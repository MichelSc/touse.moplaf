/**
 */
package com.misc.touse.moplaf.spreadsheet.tousespreadsheet;

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
 * @see com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseSpreadsheetFactory
 * @model kind="package"
 * @generated
 */
public interface ToUseSpreadsheetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tousespreadsheet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/touse/moplaf/spreadsheet/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tusp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToUseSpreadsheetPackage eINSTANCE = com.misc.touse.moplaf.spreadsheet.tousespreadsheet.impl.ToUseSpreadsheetPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.spreadsheet.tousespreadsheet.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.spreadsheet.tousespreadsheet.impl.DomainImpl
	 * @see com.misc.touse.moplaf.spreadsheet.tousespreadsheet.impl.ToUseSpreadsheetPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Spreadsheets POI</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__SPREADSHEETS_POI = 0;

	/**
	 * The feature id for the '<em><b>Spreadsheets CSV</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__SPREADSHEETS_CSV = 1;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__TABLES = 2;

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
	 * The meta object id for the '{@link com.misc.touse.moplaf.spreadsheet.tousespreadsheet.impl.ToUseTableImpl <em>To Use Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.spreadsheet.tousespreadsheet.impl.ToUseTableImpl
	 * @see com.misc.touse.moplaf.spreadsheet.tousespreadsheet.impl.ToUseSpreadsheetPackageImpl#getToUseTable()
	 * @generated
	 */
	int TO_USE_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_TABLE__ITEMS = 0;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_TABLE__TABLE_NAME = 1;

	/**
	 * The number of structural features of the '<em>To Use Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_TABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>To Use Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.spreadsheet.tousespreadsheet.impl.ToUseTableItemImpl <em>To Use Table Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.spreadsheet.tousespreadsheet.impl.ToUseTableItemImpl
	 * @see com.misc.touse.moplaf.spreadsheet.tousespreadsheet.impl.ToUseSpreadsheetPackageImpl#getToUseTableItem()
	 * @generated
	 */
	int TO_USE_TABLE_ITEM = 2;

	/**
	 * The feature id for the '<em><b>Long Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_TABLE_ITEM__LONG_ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Long Attribute Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_TABLE_ITEM__LONG_ATTRIBUTE_COLOR = 1;

	/**
	 * The feature id for the '<em><b>Item Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_TABLE_ITEM__ITEM_NAME = 2;

	/**
	 * The feature id for the '<em><b>Long Attribute Text Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_TABLE_ITEM__LONG_ATTRIBUTE_TEXT_COLOR = 3;

	/**
	 * The number of structural features of the '<em>To Use Table Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_TABLE_ITEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>To Use Table Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_TABLE_ITEM_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.spreadsheet.tousespreadsheet.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see com.misc.touse.moplaf.spreadsheet.tousespreadsheet.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.spreadsheet.tousespreadsheet.Domain#getSpreadsheetsPOI <em>Spreadsheets POI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spreadsheets POI</em>'.
	 * @see com.misc.touse.moplaf.spreadsheet.tousespreadsheet.Domain#getSpreadsheetsPOI()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_SpreadsheetsPOI();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.spreadsheet.tousespreadsheet.Domain#getSpreadsheetsCSV <em>Spreadsheets CSV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spreadsheets CSV</em>'.
	 * @see com.misc.touse.moplaf.spreadsheet.tousespreadsheet.Domain#getSpreadsheetsCSV()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_SpreadsheetsCSV();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.spreadsheet.tousespreadsheet.Domain#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see com.misc.touse.moplaf.spreadsheet.tousespreadsheet.Domain#getTables()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Tables();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseTable <em>To Use Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Use Table</em>'.
	 * @see com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseTable
	 * @generated
	 */
	EClass getToUseTable();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseTable#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseTable#getItems()
	 * @see #getToUseTable()
	 * @generated
	 */
	EReference getToUseTable_Items();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseTable#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseTable#getTableName()
	 * @see #getToUseTable()
	 * @generated
	 */
	EAttribute getToUseTable_TableName();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseTableItem <em>To Use Table Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Use Table Item</em>'.
	 * @see com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseTableItem
	 * @generated
	 */
	EClass getToUseTableItem();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseTableItem#getLongAttribute <em>Long Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long Attribute</em>'.
	 * @see com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseTableItem#getLongAttribute()
	 * @see #getToUseTableItem()
	 * @generated
	 */
	EAttribute getToUseTableItem_LongAttribute();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseTableItem#getLongAttributeColor <em>Long Attribute Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long Attribute Color</em>'.
	 * @see com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseTableItem#getLongAttributeColor()
	 * @see #getToUseTableItem()
	 * @generated
	 */
	EAttribute getToUseTableItem_LongAttributeColor();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseTableItem#getItemName <em>Item Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Name</em>'.
	 * @see com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseTableItem#getItemName()
	 * @see #getToUseTableItem()
	 * @generated
	 */
	EAttribute getToUseTableItem_ItemName();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseTableItem#getLongAttributeTextColor <em>Long Attribute Text Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long Attribute Text Color</em>'.
	 * @see com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseTableItem#getLongAttributeTextColor()
	 * @see #getToUseTableItem()
	 * @generated
	 */
	EAttribute getToUseTableItem_LongAttributeTextColor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ToUseSpreadsheetFactory getToUseSpreadsheetFactory();

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
		 * The meta object literal for the '{@link com.misc.touse.moplaf.spreadsheet.tousespreadsheet.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.spreadsheet.tousespreadsheet.impl.DomainImpl
		 * @see com.misc.touse.moplaf.spreadsheet.tousespreadsheet.impl.ToUseSpreadsheetPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Spreadsheets POI</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__SPREADSHEETS_POI = eINSTANCE.getDomain_SpreadsheetsPOI();

		/**
		 * The meta object literal for the '<em><b>Spreadsheets CSV</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__SPREADSHEETS_CSV = eINSTANCE.getDomain_SpreadsheetsCSV();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__TABLES = eINSTANCE.getDomain_Tables();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.spreadsheet.tousespreadsheet.impl.ToUseTableImpl <em>To Use Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.spreadsheet.tousespreadsheet.impl.ToUseTableImpl
		 * @see com.misc.touse.moplaf.spreadsheet.tousespreadsheet.impl.ToUseSpreadsheetPackageImpl#getToUseTable()
		 * @generated
		 */
		EClass TO_USE_TABLE = eINSTANCE.getToUseTable();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_TABLE__ITEMS = eINSTANCE.getToUseTable_Items();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_USE_TABLE__TABLE_NAME = eINSTANCE.getToUseTable_TableName();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.spreadsheet.tousespreadsheet.impl.ToUseTableItemImpl <em>To Use Table Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.spreadsheet.tousespreadsheet.impl.ToUseTableItemImpl
		 * @see com.misc.touse.moplaf.spreadsheet.tousespreadsheet.impl.ToUseSpreadsheetPackageImpl#getToUseTableItem()
		 * @generated
		 */
		EClass TO_USE_TABLE_ITEM = eINSTANCE.getToUseTableItem();

		/**
		 * The meta object literal for the '<em><b>Long Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_USE_TABLE_ITEM__LONG_ATTRIBUTE = eINSTANCE.getToUseTableItem_LongAttribute();

		/**
		 * The meta object literal for the '<em><b>Long Attribute Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_USE_TABLE_ITEM__LONG_ATTRIBUTE_COLOR = eINSTANCE.getToUseTableItem_LongAttributeColor();

		/**
		 * The meta object literal for the '<em><b>Item Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_USE_TABLE_ITEM__ITEM_NAME = eINSTANCE.getToUseTableItem_ItemName();

		/**
		 * The meta object literal for the '<em><b>Long Attribute Text Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_USE_TABLE_ITEM__LONG_ATTRIBUTE_TEXT_COLOR = eINSTANCE.getToUseTableItem_LongAttributeTextColor();

	}

} //ToUseSpreadsheetPackage
