/**
 */
package spreadsheetcsv;

import com.misc.common.moplaf.spreadsheet.Spreadsheet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spreadsheet CSV</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spreadsheetcsv.SpreadsheetCSV#getFormat <em>Format</em>}</li>
 * </ul>
 *
 * @see spreadsheetcsv.SpreadsheetcsvPackage#getSpreadsheetCSV()
 * @model
 * @generated
 */
public interface SpreadsheetCSV extends Spreadsheet {

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * The literals are from the enumeration {@link spreadsheetcsv.CSVFormat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see spreadsheetcsv.CSVFormat
	 * @see #setFormat(CSVFormat)
	 * @see spreadsheetcsv.SpreadsheetcsvPackage#getSpreadsheetCSV_Format()
	 * @model
	 * @generated
	 */
	CSVFormat getFormat();

	/**
	 * Sets the value of the '{@link spreadsheetcsv.SpreadsheetCSV#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see spreadsheetcsv.CSVFormat
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(CSVFormat value);
} // SpreadsheetCSV
