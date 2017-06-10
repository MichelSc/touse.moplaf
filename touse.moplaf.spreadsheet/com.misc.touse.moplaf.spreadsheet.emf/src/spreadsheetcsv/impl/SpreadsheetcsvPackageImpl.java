/**
 */
package spreadsheetcsv.impl;

import com.misc.common.moplaf.spreadsheet.SpreadsheetPackage;

import com.misc.common.moplaf.spreadsheet.spreadsheetpoi.SpreadsheetPOIPackage;

import com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseSpreadsheetPackage;

import com.misc.touse.moplaf.spreadsheet.tousespreadsheet.impl.ToUseSpreadsheetPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import spreadsheetcsv.CSVFormat;
import spreadsheetcsv.SpreadsheetCSV;
import spreadsheetcsv.SpreadsheetcsvFactory;
import spreadsheetcsv.SpreadsheetcsvPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpreadsheetcsvPackageImpl extends EPackageImpl implements SpreadsheetcsvPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spreadsheetCSVEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum csvFormatEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see spreadsheetcsv.SpreadsheetcsvPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SpreadsheetcsvPackageImpl() {
		super(eNS_URI, SpreadsheetcsvFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SpreadsheetcsvPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SpreadsheetcsvPackage init() {
		if (isInited) return (SpreadsheetcsvPackage)EPackage.Registry.INSTANCE.getEPackage(SpreadsheetcsvPackage.eNS_URI);

		// Obtain or create and register package
		SpreadsheetcsvPackageImpl theSpreadsheetcsvPackage = (SpreadsheetcsvPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SpreadsheetcsvPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SpreadsheetcsvPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SpreadsheetPOIPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ToUseSpreadsheetPackageImpl theToUseSpreadsheetPackage = (ToUseSpreadsheetPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ToUseSpreadsheetPackage.eNS_URI) instanceof ToUseSpreadsheetPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ToUseSpreadsheetPackage.eNS_URI) : ToUseSpreadsheetPackage.eINSTANCE);

		// Create package meta-data objects
		theSpreadsheetcsvPackage.createPackageContents();
		theToUseSpreadsheetPackage.createPackageContents();

		// Initialize created meta-data
		theSpreadsheetcsvPackage.initializePackageContents();
		theToUseSpreadsheetPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSpreadsheetcsvPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SpreadsheetcsvPackage.eNS_URI, theSpreadsheetcsvPackage);
		return theSpreadsheetcsvPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpreadsheetCSV() {
		return spreadsheetCSVEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpreadsheetCSV_Format() {
		return (EAttribute)spreadsheetCSVEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCSVFormat() {
		return csvFormatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetcsvFactory getSpreadsheetcsvFactory() {
		return (SpreadsheetcsvFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		spreadsheetCSVEClass = createEClass(SPREADSHEET_CSV);
		createEAttribute(spreadsheetCSVEClass, SPREADSHEET_CSV__FORMAT);

		// Create enums
		csvFormatEEnum = createEEnum(CSV_FORMAT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SpreadsheetPackage theSpreadsheetPackage = (SpreadsheetPackage)EPackage.Registry.INSTANCE.getEPackage(SpreadsheetPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		spreadsheetCSVEClass.getESuperTypes().add(theSpreadsheetPackage.getSpreadsheet());

		// Initialize classes, features, and operations; add parameters
		initEClass(spreadsheetCSVEClass, SpreadsheetCSV.class, "SpreadsheetCSV", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpreadsheetCSV_Format(), this.getCSVFormat(), "Format", null, 0, 1, SpreadsheetCSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(csvFormatEEnum, CSVFormat.class, "CSVFormat");
		addEEnumLiteral(csvFormatEEnum, CSVFormat.ENUM_LITERAL_CSV_FORMAT_DEFAULT);

		// Create resource
		createResource(eNS_URI);
	}

} //SpreadsheetcsvPackageImpl
