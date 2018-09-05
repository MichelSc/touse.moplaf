/**
 */
package com.misc.touse.moplaf.gridview.tousegridview;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see com.misc.touse.moplaf.gridview.tousegridview.ToUseGridViewFactory
 * @model kind="package"
 * @generated
 */
public interface ToUseGridViewPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tousegridview";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/touse/moplaf/gridview/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tgv";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToUseGridViewPackage eINSTANCE = com.misc.touse.moplaf.gridview.tousegridview.impl.ToUseGridViewPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.gridview.tousegridview.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.gridview.tousegridview.impl.DomainImpl
	 * @see com.misc.touse.moplaf.gridview.tousegridview.impl.ToUseGridViewPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__DOCUMENTS = 0;

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
	 * The meta object id for the '{@link com.misc.touse.moplaf.gridview.tousegridview.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.gridview.tousegridview.impl.DocumentImpl
	 * @see com.misc.touse.moplaf.gridview.tousegridview.impl.ToUseGridViewPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__AUTHOR = 1;

	/**
	 * The feature id for the '<em><b>Sheets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__SHEETS = 2;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.gridview.tousegridview.impl.SheetImpl <em>Sheet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.gridview.tousegridview.impl.SheetImpl
	 * @see com.misc.touse.moplaf.gridview.tousegridview.impl.ToUseGridViewPackageImpl#getSheet()
	 * @generated
	 */
	int SHEET = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET__COLUMNS = 1;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET__ROWS = 2;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET__TRAIT = 3;

	/**
	 * The number of structural features of the '<em>Sheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Sheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.gridview.tousegridview.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.gridview.tousegridview.impl.ColumnImpl
	 * @see com.misc.touse.moplaf.gridview.tousegridview.impl.ToUseGridViewPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 3;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__INDEX = 0;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__CELLS = 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__COLOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = 3;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__SHEET = 4;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Get Cell</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN___GET_CELL__ROW = 0;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.gridview.tousegridview.impl.RowImpl <em>Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.gridview.tousegridview.impl.RowImpl
	 * @see com.misc.touse.moplaf.gridview.tousegridview.impl.ToUseGridViewPackageImpl#getRow()
	 * @generated
	 */
	int ROW = 4;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__INDEX = 0;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__CELLS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__NAME = 2;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__SHEET = 3;

	/**
	 * The number of structural features of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Get Cell</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW___GET_CELL__COLUMN = 0;

	/**
	 * The number of operations of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.gridview.tousegridview.impl.CellImpl <em>Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.gridview.tousegridview.impl.CellImpl
	 * @see com.misc.touse.moplaf.gridview.tousegridview.impl.ToUseGridViewPackageImpl#getCell()
	 * @generated
	 */
	int CELL = 5;

	/**
	 * The number of structural features of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Cell Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL___GET_CELL_VALUE = 0;

	/**
	 * The number of operations of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_OPERATION_COUNT = 1;


	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.gridview.tousegridview.impl.CellIntImpl <em>Cell Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.gridview.tousegridview.impl.CellIntImpl
	 * @see com.misc.touse.moplaf.gridview.tousegridview.impl.ToUseGridViewPackageImpl#getCellInt()
	 * @generated
	 */
	int CELL_INT = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_INT__VALUE = CELL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cell Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_INT_FEATURE_COUNT = CELL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Cell Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_INT___GET_CELL_VALUE = CELL___GET_CELL_VALUE;

	/**
	 * The number of operations of the '<em>Cell Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_INT_OPERATION_COUNT = CELL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.gridview.tousegridview.impl.CellFloatImpl <em>Cell Float</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.gridview.tousegridview.impl.CellFloatImpl
	 * @see com.misc.touse.moplaf.gridview.tousegridview.impl.ToUseGridViewPackageImpl#getCellFloat()
	 * @generated
	 */
	int CELL_FLOAT = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_FLOAT__VALUE = CELL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cell Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_FLOAT_FEATURE_COUNT = CELL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Cell Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_FLOAT___GET_CELL_VALUE = CELL___GET_CELL_VALUE;

	/**
	 * The number of operations of the '<em>Cell Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_FLOAT_OPERATION_COUNT = CELL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.gridview.tousegridview.impl.CellStringImpl <em>Cell String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.gridview.tousegridview.impl.CellStringImpl
	 * @see com.misc.touse.moplaf.gridview.tousegridview.impl.ToUseGridViewPackageImpl#getCellString()
	 * @generated
	 */
	int CELL_STRING = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_STRING__VALUE = CELL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cell String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_STRING_FEATURE_COUNT = CELL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Cell Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_STRING___GET_CELL_VALUE = CELL___GET_CELL_VALUE;

	/**
	 * The number of operations of the '<em>Cell String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_STRING_OPERATION_COUNT = CELL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.gridview.tousegridview.SheetTraitEnum <em>Sheet Trait Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.gridview.tousegridview.SheetTraitEnum
	 * @see com.misc.touse.moplaf.gridview.tousegridview.impl.ToUseGridViewPackageImpl#getSheetTraitEnum()
	 * @generated
	 */
	int SHEET_TRAIT_ENUM = 9;


	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.gridview.tousegridview.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see com.misc.touse.moplaf.gridview.tousegridview.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.gridview.tousegridview.Domain#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documents</em>'.
	 * @see com.misc.touse.moplaf.gridview.tousegridview.Domain#getDocuments()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Documents();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.gridview.tousegridview.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see com.misc.touse.moplaf.gridview.tousegridview.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.gridview.tousegridview.Document#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.touse.moplaf.gridview.tousegridview.Document#getName()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.gridview.tousegridview.Document#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see com.misc.touse.moplaf.gridview.tousegridview.Document#getAuthor()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Author();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.gridview.tousegridview.Document#getSheets <em>Sheets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sheets</em>'.
	 * @see com.misc.touse.moplaf.gridview.tousegridview.Document#getSheets()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Sheets();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.gridview.tousegridview.Sheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sheet</em>'.
	 * @see com.misc.touse.moplaf.gridview.tousegridview.Sheet
	 * @generated
	 */
	EClass getSheet();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.gridview.tousegridview.Sheet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.touse.moplaf.gridview.tousegridview.Sheet#getName()
	 * @see #getSheet()
	 * @generated
	 */
	EAttribute getSheet_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.gridview.tousegridview.Sheet#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see com.misc.touse.moplaf.gridview.tousegridview.Sheet#getColumns()
	 * @see #getSheet()
	 * @generated
	 */
	EReference getSheet_Columns();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.gridview.tousegridview.Sheet#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see com.misc.touse.moplaf.gridview.tousegridview.Sheet#getRows()
	 * @see #getSheet()
	 * @generated
	 */
	EReference getSheet_Rows();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.gridview.tousegridview.Sheet#getTrait <em>Trait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trait</em>'.
	 * @see com.misc.touse.moplaf.gridview.tousegridview.Sheet#getTrait()
	 * @see #getSheet()
	 * @generated
	 */
	EAttribute getSheet_Trait();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.gridview.tousegridview.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see com.misc.touse.moplaf.gridview.tousegridview.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.gridview.tousegridview.Column#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see com.misc.touse.moplaf.gridview.tousegridview.Column#getIndex()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Index();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.touse.moplaf.gridview.tousegridview.Column#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cells</em>'.
	 * @see com.misc.touse.moplaf.gridview.tousegridview.Column#getCells()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Cells();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.gridview.tousegridview.Column#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see com.misc.touse.moplaf.gridview.tousegridview.Column#getColor()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Color();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.gridview.tousegridview.Column#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.touse.moplaf.gridview.tousegridview.Column#getName()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Name();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.touse.moplaf.gridview.tousegridview.Column#getSheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sheet</em>'.
	 * @see com.misc.touse.moplaf.gridview.tousegridview.Column#getSheet()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Sheet();

	/**
	 * Returns the meta object for the '{@link com.misc.touse.moplaf.gridview.tousegridview.Column#getCell(com.misc.touse.moplaf.gridview.tousegridview.Row) <em>Get Cell</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cell</em>' operation.
	 * @see com.misc.touse.moplaf.gridview.tousegridview.Column#getCell(com.misc.touse.moplaf.gridview.tousegridview.Row)
	 * @generated
	 */
	EOperation getColumn__GetCell__Row();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.gridview.tousegridview.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row</em>'.
	 * @see com.misc.touse.moplaf.gridview.tousegridview.Row
	 * @generated
	 */
	EClass getRow();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.gridview.tousegridview.Row#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see com.misc.touse.moplaf.gridview.tousegridview.Row#getIndex()
	 * @see #getRow()
	 * @generated
	 */
	EAttribute getRow_Index();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.gridview.tousegridview.Row#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see com.misc.touse.moplaf.gridview.tousegridview.Row#getCells()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_Cells();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.gridview.tousegridview.Row#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.touse.moplaf.gridview.tousegridview.Row#getName()
	 * @see #getRow()
	 * @generated
	 */
	EAttribute getRow_Name();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.touse.moplaf.gridview.tousegridview.Row#getSheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sheet</em>'.
	 * @see com.misc.touse.moplaf.gridview.tousegridview.Row#getSheet()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_Sheet();

	/**
	 * Returns the meta object for the '{@link com.misc.touse.moplaf.gridview.tousegridview.Row#getCell(com.misc.touse.moplaf.gridview.tousegridview.Column) <em>Get Cell</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cell</em>' operation.
	 * @see com.misc.touse.moplaf.gridview.tousegridview.Row#getCell(com.misc.touse.moplaf.gridview.tousegridview.Column)
	 * @generated
	 */
	EOperation getRow__GetCell__Column();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.gridview.tousegridview.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell</em>'.
	 * @see com.misc.touse.moplaf.gridview.tousegridview.Cell
	 * @generated
	 */
	EClass getCell();

	/**
	 * Returns the meta object for the '{@link com.misc.touse.moplaf.gridview.tousegridview.Cell#getCellValue() <em>Get Cell Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cell Value</em>' operation.
	 * @see com.misc.touse.moplaf.gridview.tousegridview.Cell#getCellValue()
	 * @generated
	 */
	EOperation getCell__GetCellValue();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.gridview.tousegridview.CellInt <em>Cell Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell Int</em>'.
	 * @see com.misc.touse.moplaf.gridview.tousegridview.CellInt
	 * @generated
	 */
	EClass getCellInt();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.gridview.tousegridview.CellInt#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.misc.touse.moplaf.gridview.tousegridview.CellInt#getValue()
	 * @see #getCellInt()
	 * @generated
	 */
	EAttribute getCellInt_Value();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.gridview.tousegridview.CellFloat <em>Cell Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell Float</em>'.
	 * @see com.misc.touse.moplaf.gridview.tousegridview.CellFloat
	 * @generated
	 */
	EClass getCellFloat();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.gridview.tousegridview.CellFloat#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.misc.touse.moplaf.gridview.tousegridview.CellFloat#getValue()
	 * @see #getCellFloat()
	 * @generated
	 */
	EAttribute getCellFloat_Value();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.gridview.tousegridview.CellString <em>Cell String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell String</em>'.
	 * @see com.misc.touse.moplaf.gridview.tousegridview.CellString
	 * @generated
	 */
	EClass getCellString();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.gridview.tousegridview.CellString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.misc.touse.moplaf.gridview.tousegridview.CellString#getValue()
	 * @see #getCellString()
	 * @generated
	 */
	EAttribute getCellString_Value();

	/**
	 * Returns the meta object for enum '{@link com.misc.touse.moplaf.gridview.tousegridview.SheetTraitEnum <em>Sheet Trait Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sheet Trait Enum</em>'.
	 * @see com.misc.touse.moplaf.gridview.tousegridview.SheetTraitEnum
	 * @generated
	 */
	EEnum getSheetTraitEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ToUseGridViewFactory getToUseGridViewFactory();

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
		 * The meta object literal for the '{@link com.misc.touse.moplaf.gridview.tousegridview.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.gridview.tousegridview.impl.DomainImpl
		 * @see com.misc.touse.moplaf.gridview.tousegridview.impl.ToUseGridViewPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Documents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__DOCUMENTS = eINSTANCE.getDomain_Documents();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.gridview.tousegridview.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.gridview.tousegridview.impl.DocumentImpl
		 * @see com.misc.touse.moplaf.gridview.tousegridview.impl.ToUseGridViewPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__NAME = eINSTANCE.getDocument_Name();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__AUTHOR = eINSTANCE.getDocument_Author();

		/**
		 * The meta object literal for the '<em><b>Sheets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__SHEETS = eINSTANCE.getDocument_Sheets();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.gridview.tousegridview.impl.SheetImpl <em>Sheet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.gridview.tousegridview.impl.SheetImpl
		 * @see com.misc.touse.moplaf.gridview.tousegridview.impl.ToUseGridViewPackageImpl#getSheet()
		 * @generated
		 */
		EClass SHEET = eINSTANCE.getSheet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHEET__NAME = eINSTANCE.getSheet_Name();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHEET__COLUMNS = eINSTANCE.getSheet_Columns();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHEET__ROWS = eINSTANCE.getSheet_Rows();

		/**
		 * The meta object literal for the '<em><b>Trait</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHEET__TRAIT = eINSTANCE.getSheet_Trait();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.gridview.tousegridview.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.gridview.tousegridview.impl.ColumnImpl
		 * @see com.misc.touse.moplaf.gridview.tousegridview.impl.ToUseGridViewPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__INDEX = eINSTANCE.getColumn_Index();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__CELLS = eINSTANCE.getColumn_Cells();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__COLOR = eINSTANCE.getColumn_Color();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__NAME = eINSTANCE.getColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Sheet</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__SHEET = eINSTANCE.getColumn_Sheet();

		/**
		 * The meta object literal for the '<em><b>Get Cell</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLUMN___GET_CELL__ROW = eINSTANCE.getColumn__GetCell__Row();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.gridview.tousegridview.impl.RowImpl <em>Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.gridview.tousegridview.impl.RowImpl
		 * @see com.misc.touse.moplaf.gridview.tousegridview.impl.ToUseGridViewPackageImpl#getRow()
		 * @generated
		 */
		EClass ROW = eINSTANCE.getRow();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW__INDEX = eINSTANCE.getRow_Index();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__CELLS = eINSTANCE.getRow_Cells();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW__NAME = eINSTANCE.getRow_Name();

		/**
		 * The meta object literal for the '<em><b>Sheet</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__SHEET = eINSTANCE.getRow_Sheet();

		/**
		 * The meta object literal for the '<em><b>Get Cell</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROW___GET_CELL__COLUMN = eINSTANCE.getRow__GetCell__Column();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.gridview.tousegridview.impl.CellImpl <em>Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.gridview.tousegridview.impl.CellImpl
		 * @see com.misc.touse.moplaf.gridview.tousegridview.impl.ToUseGridViewPackageImpl#getCell()
		 * @generated
		 */
		EClass CELL = eINSTANCE.getCell();

		/**
		 * The meta object literal for the '<em><b>Get Cell Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CELL___GET_CELL_VALUE = eINSTANCE.getCell__GetCellValue();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.gridview.tousegridview.impl.CellIntImpl <em>Cell Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.gridview.tousegridview.impl.CellIntImpl
		 * @see com.misc.touse.moplaf.gridview.tousegridview.impl.ToUseGridViewPackageImpl#getCellInt()
		 * @generated
		 */
		EClass CELL_INT = eINSTANCE.getCellInt();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL_INT__VALUE = eINSTANCE.getCellInt_Value();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.gridview.tousegridview.impl.CellFloatImpl <em>Cell Float</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.gridview.tousegridview.impl.CellFloatImpl
		 * @see com.misc.touse.moplaf.gridview.tousegridview.impl.ToUseGridViewPackageImpl#getCellFloat()
		 * @generated
		 */
		EClass CELL_FLOAT = eINSTANCE.getCellFloat();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL_FLOAT__VALUE = eINSTANCE.getCellFloat_Value();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.gridview.tousegridview.impl.CellStringImpl <em>Cell String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.gridview.tousegridview.impl.CellStringImpl
		 * @see com.misc.touse.moplaf.gridview.tousegridview.impl.ToUseGridViewPackageImpl#getCellString()
		 * @generated
		 */
		EClass CELL_STRING = eINSTANCE.getCellString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL_STRING__VALUE = eINSTANCE.getCellString_Value();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.gridview.tousegridview.SheetTraitEnum <em>Sheet Trait Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.gridview.tousegridview.SheetTraitEnum
		 * @see com.misc.touse.moplaf.gridview.tousegridview.impl.ToUseGridViewPackageImpl#getSheetTraitEnum()
		 * @generated
		 */
		EEnum SHEET_TRAIT_ENUM = eINSTANCE.getSheetTraitEnum();

	}

} //ToUseGridViewPackage
