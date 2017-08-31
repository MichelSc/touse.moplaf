/**
 */
package com.misc.touse.moplaf.spreadsheet.tousespreadsheet.impl;

import com.misc.common.moplaf.spreadsheet.SpreadsheetPackage;
import com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSVPackage;
import com.misc.common.moplaf.spreadsheet.spreadsheetpoi.SpreadsheetPOIPackage;

import com.misc.touse.moplaf.spreadsheet.tousespreadsheet.Domain;
import com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseSpreadsheetFactory;
import com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseSpreadsheetPackage;

import com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseTable;
import com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseTableItem;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToUseSpreadsheetPackageImpl extends EPackageImpl implements ToUseSpreadsheetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toUseTableEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toUseTableItemEClass = null;

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
	 * @see com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseSpreadsheetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ToUseSpreadsheetPackageImpl() {
		super(eNS_URI, ToUseSpreadsheetFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ToUseSpreadsheetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ToUseSpreadsheetPackage init() {
		if (isInited) return (ToUseSpreadsheetPackage)EPackage.Registry.INSTANCE.getEPackage(ToUseSpreadsheetPackage.eNS_URI);

		// Obtain or create and register package
		ToUseSpreadsheetPackageImpl theToUseSpreadsheetPackage = (ToUseSpreadsheetPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ToUseSpreadsheetPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ToUseSpreadsheetPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SpreadsheetPackage.eINSTANCE.eClass();
		SpreadsheetCSVPackage.eINSTANCE.eClass();
		SpreadsheetPOIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theToUseSpreadsheetPackage.createPackageContents();

		// Initialize created meta-data
		theToUseSpreadsheetPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theToUseSpreadsheetPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ToUseSpreadsheetPackage.eNS_URI, theToUseSpreadsheetPackage);
		return theToUseSpreadsheetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_SpreadsheetsPOI() {
		return (EReference)domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_SpreadsheetsCSV() {
		return (EReference)domainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Tables() {
		return (EReference)domainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUseTable() {
		return toUseTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseTable_Items() {
		return (EReference)toUseTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToUseTable_TableName() {
		return (EAttribute)toUseTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUseTableItem() {
		return toUseTableItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToUseTableItem_LongAttribute() {
		return (EAttribute)toUseTableItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToUseTableItem_LongAttributeColor() {
		return (EAttribute)toUseTableItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToUseTableItem_ItemName() {
		return (EAttribute)toUseTableItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseSpreadsheetFactory getToUseSpreadsheetFactory() {
		return (ToUseSpreadsheetFactory)getEFactoryInstance();
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
		domainEClass = createEClass(DOMAIN);
		createEReference(domainEClass, DOMAIN__SPREADSHEETS_POI);
		createEReference(domainEClass, DOMAIN__SPREADSHEETS_CSV);
		createEReference(domainEClass, DOMAIN__TABLES);

		toUseTableEClass = createEClass(TO_USE_TABLE);
		createEReference(toUseTableEClass, TO_USE_TABLE__ITEMS);
		createEAttribute(toUseTableEClass, TO_USE_TABLE__TABLE_NAME);

		toUseTableItemEClass = createEClass(TO_USE_TABLE_ITEM);
		createEAttribute(toUseTableItemEClass, TO_USE_TABLE_ITEM__LONG_ATTRIBUTE);
		createEAttribute(toUseTableItemEClass, TO_USE_TABLE_ITEM__LONG_ATTRIBUTE_COLOR);
		createEAttribute(toUseTableItemEClass, TO_USE_TABLE_ITEM__ITEM_NAME);
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
		SpreadsheetPOIPackage theSpreadsheetPOIPackage = (SpreadsheetPOIPackage)EPackage.Registry.INSTANCE.getEPackage(SpreadsheetPOIPackage.eNS_URI);
		SpreadsheetCSVPackage theSpreadsheetCSVPackage = (SpreadsheetCSVPackage)EPackage.Registry.INSTANCE.getEPackage(SpreadsheetCSVPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomain_SpreadsheetsPOI(), theSpreadsheetPOIPackage.getSpreadsheetPOI(), null, "SpreadsheetsPOI", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_SpreadsheetsCSV(), theSpreadsheetCSVPackage.getSpreadsheetCSV(), null, "SpreadsheetsCSV", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Tables(), this.getToUseTable(), null, "Tables", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toUseTableEClass, ToUseTable.class, "ToUseTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToUseTable_Items(), this.getToUseTableItem(), null, "Items", null, 0, -1, ToUseTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToUseTable_TableName(), ecorePackage.getEString(), "TableName", null, 0, 1, ToUseTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toUseTableItemEClass, ToUseTableItem.class, "ToUseTableItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToUseTableItem_LongAttribute(), ecorePackage.getELong(), "LongAttribute", null, 0, 1, ToUseTableItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToUseTableItem_LongAttributeColor(), ecorePackage.getEInt(), "LongAttributeColor", null, 0, 1, ToUseTableItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToUseTableItem_ItemName(), ecorePackage.getEString(), "ItemName", null, 0, 1, ToUseTableItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ToUseSpreadsheetPackageImpl
