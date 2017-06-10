/**
 */
package spreadsheetcsv;

import com.misc.common.moplaf.spreadsheet.SpreadsheetPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see spreadsheetcsv.SpreadsheetcsvFactory
 * @model kind="package"
 * @generated
 */
public interface SpreadsheetcsvPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "spreadsheetcsv";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common/moplaf/spreadsheet/csv/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "spshcsv";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpreadsheetcsvPackage eINSTANCE = spreadsheetcsv.impl.SpreadsheetcsvPackageImpl.init();

	/**
	 * The meta object id for the '{@link spreadsheetcsv.impl.SpreadsheetCSVImpl <em>Spreadsheet CSV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spreadsheetcsv.impl.SpreadsheetCSVImpl
	 * @see spreadsheetcsv.impl.SpreadsheetcsvPackageImpl#getSpreadsheetCSV()
	 * @generated
	 */
	int SPREADSHEET_CSV = 0;

	/**
	 * The feature id for the '<em><b>Sheets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_CSV__SHEETS = SpreadsheetPackage.SPREADSHEET__SHEETS;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_CSV__FILE_PATH = SpreadsheetPackage.SPREADSHEET__FILE_PATH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_CSV__NAME = SpreadsheetPackage.SPREADSHEET__NAME;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_CSV__FORMAT = SpreadsheetPackage.SPREADSHEET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Spreadsheet CSV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_CSV_FEATURE_COUNT = SpreadsheetPackage.SPREADSHEET_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Sheet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_CSV___GET_SHEET__STRING = SpreadsheetPackage.SPREADSHEET___GET_SHEET__STRING;

	/**
	 * The operation id for the '<em>Get Sheet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_CSV___GET_SHEET__INT = SpreadsheetPackage.SPREADSHEET___GET_SHEET__INT;

	/**
	 * The operation id for the '<em>Read File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_CSV___READ_FILE = SpreadsheetPackage.SPREADSHEET___READ_FILE;

	/**
	 * The operation id for the '<em>Write File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_CSV___WRITE_FILE = SpreadsheetPackage.SPREADSHEET___WRITE_FILE;

	/**
	 * The number of operations of the '<em>Spreadsheet CSV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPREADSHEET_CSV_OPERATION_COUNT = SpreadsheetPackage.SPREADSHEET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spreadsheetcsv.CSVFormat <em>CSV Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spreadsheetcsv.CSVFormat
	 * @see spreadsheetcsv.impl.SpreadsheetcsvPackageImpl#getCSVFormat()
	 * @generated
	 */
	int CSV_FORMAT = 1;


	/**
	 * Returns the meta object for class '{@link spreadsheetcsv.SpreadsheetCSV <em>Spreadsheet CSV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spreadsheet CSV</em>'.
	 * @see spreadsheetcsv.SpreadsheetCSV
	 * @generated
	 */
	EClass getSpreadsheetCSV();

	/**
	 * Returns the meta object for the attribute '{@link spreadsheetcsv.SpreadsheetCSV#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see spreadsheetcsv.SpreadsheetCSV#getFormat()
	 * @see #getSpreadsheetCSV()
	 * @generated
	 */
	EAttribute getSpreadsheetCSV_Format();

	/**
	 * Returns the meta object for enum '{@link spreadsheetcsv.CSVFormat <em>CSV Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CSV Format</em>'.
	 * @see spreadsheetcsv.CSVFormat
	 * @generated
	 */
	EEnum getCSVFormat();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpreadsheetcsvFactory getSpreadsheetcsvFactory();

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
		 * The meta object literal for the '{@link spreadsheetcsv.impl.SpreadsheetCSVImpl <em>Spreadsheet CSV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spreadsheetcsv.impl.SpreadsheetCSVImpl
		 * @see spreadsheetcsv.impl.SpreadsheetcsvPackageImpl#getSpreadsheetCSV()
		 * @generated
		 */
		EClass SPREADSHEET_CSV = eINSTANCE.getSpreadsheetCSV();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPREADSHEET_CSV__FORMAT = eINSTANCE.getSpreadsheetCSV_Format();

		/**
		 * The meta object literal for the '{@link spreadsheetcsv.CSVFormat <em>CSV Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spreadsheetcsv.CSVFormat
		 * @see spreadsheetcsv.impl.SpreadsheetcsvPackageImpl#getCSVFormat()
		 * @generated
		 */
		EEnum CSV_FORMAT = eINSTANCE.getCSVFormat();

	}

} //SpreadsheetcsvPackage
