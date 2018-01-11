/**
 */
package com.misc.touse.moplaf.spreadsheet.tousespreadsheet;

import com.misc.common.moplaf.spreadsheet.Spreadsheet;
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
 *   <li>{@link com.misc.touse.moplaf.spreadsheet.tousespreadsheet.Domain#getSpreadsheets <em>Spreadsheets</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.spreadsheet.tousespreadsheet.Domain#getTables <em>Tables</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseSpreadsheetPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>Spreadsheets</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.spreadsheet.Spreadsheet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spreadsheets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spreadsheets</em>' containment reference list.
	 * @see com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseSpreadsheetPackage#getDomain_Spreadsheets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Spreadsheet> getSpreadsheets();

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
