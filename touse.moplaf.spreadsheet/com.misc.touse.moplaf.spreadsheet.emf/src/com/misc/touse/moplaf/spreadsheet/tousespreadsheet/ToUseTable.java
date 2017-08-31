/**
 */
package com.misc.touse.moplaf.spreadsheet.tousespreadsheet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Use Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseTable#getItems <em>Items</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseTable#getTableName <em>Table Name</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseSpreadsheetPackage#getToUseTable()
 * @model
 * @generated
 */
public interface ToUseTable extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseTableItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseSpreadsheetPackage#getToUseTable_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<ToUseTableItem> getItems();

	/**
	 * Returns the value of the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Name</em>' attribute.
	 * @see #setTableName(String)
	 * @see com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseSpreadsheetPackage#getToUseTable_TableName()
	 * @model
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseTable#getTableName <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' attribute.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(String value);

} // ToUseTable
