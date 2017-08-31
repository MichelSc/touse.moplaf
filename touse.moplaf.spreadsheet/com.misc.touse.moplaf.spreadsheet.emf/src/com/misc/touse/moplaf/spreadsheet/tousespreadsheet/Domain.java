/**
 */
package com.misc.touse.moplaf.spreadsheet.tousespreadsheet;

import com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV;
import com.misc.common.moplaf.spreadsheet.spreadsheetpoi.SpreadsheetPOI;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.spreadsheet.tousespreadsheet.Domain#getSpreadsheetsPOI <em>Spreadsheets POI</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.spreadsheet.tousespreadsheet.Domain#getSpreadsheetsCSV <em>Spreadsheets CSV</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.spreadsheet.tousespreadsheet.Domain#getTables <em>Tables</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseSpreadsheetPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>Spreadsheets POI</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.spreadsheet.spreadsheetpoi.SpreadsheetPOI}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spreadsheets POI</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spreadsheets POI</em>' containment reference list.
	 * @see com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseSpreadsheetPackage#getDomain_SpreadsheetsPOI()
	 * @model containment="true"
	 * @generated
	 */
	EList<SpreadsheetPOI> getSpreadsheetsPOI();

	/**
	 * Returns the value of the '<em><b>Spreadsheets CSV</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spreadsheets CSV</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spreadsheets CSV</em>' containment reference list.
	 * @see com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseSpreadsheetPackage#getDomain_SpreadsheetsCSV()
	 * @model containment="true"
	 * @generated
	 */
	EList<SpreadsheetCSV> getSpreadsheetsCSV();

	/**
	 * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseTable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' containment reference list.
	 * @see com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseSpreadsheetPackage#getDomain_Tables()
	 * @model containment="true"
	 * @generated
	 */
	EList<ToUseTable> getTables();

} // Domain
