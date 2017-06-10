/**
 */
package com.misc.touse.moplaf.spreadsheet.tousespreadsheet;

import com.misc.common.moplaf.spreadsheet.spreadsheetpoi.SpreadsheetPOI;

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
 * </ul>
 *
 * @see com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseSpreadsheetPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>Spreadsheets POI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spreadsheets POI</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spreadsheets POI</em>' containment reference.
	 * @see #setSpreadsheetsPOI(SpreadsheetPOI)
	 * @see com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseSpreadsheetPackage#getDomain_SpreadsheetsPOI()
	 * @model containment="true"
	 * @generated
	 */
	SpreadsheetPOI getSpreadsheetsPOI();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.spreadsheet.tousespreadsheet.Domain#getSpreadsheetsPOI <em>Spreadsheets POI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spreadsheets POI</em>' containment reference.
	 * @see #getSpreadsheetsPOI()
	 * @generated
	 */
	void setSpreadsheetsPOI(SpreadsheetPOI value);

} // Domain
