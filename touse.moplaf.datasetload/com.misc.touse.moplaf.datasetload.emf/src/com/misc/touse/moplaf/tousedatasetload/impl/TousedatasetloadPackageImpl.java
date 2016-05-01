/**
 */
package com.misc.touse.moplaf.tousedatasetload.impl;

import com.misc.common.moplaf.DatasetLoadMariaDb.DatasetLoadMariaDbPackage;
import com.misc.common.moplaf.dbsynch.DatasetloadPackage;
import com.misc.common.moplaf.dbsynch.derby.DatasetLoadDerbyPackage;
import com.misc.touse.moplaf.tousedatasetload.FPDGroupSortingPlan;
import com.misc.touse.moplaf.tousedatasetload.FPDSortingPlan;
import com.misc.touse.moplaf.tousedatasetload.FPDSortingPlanInput;
import com.misc.touse.moplaf.tousedatasetload.FPDSortingPlanInputs;
import com.misc.touse.moplaf.tousedatasetload.FPDSortingPlans;
import com.misc.touse.moplaf.tousedatasetload.MariaDbTestDatabase;
import com.misc.touse.moplaf.tousedatasetload.MariaDbTestGroupTables;
import com.misc.touse.moplaf.tousedatasetload.MariaDbTestRow;
import com.misc.touse.moplaf.tousedatasetload.MariaDbTestTable;
import com.misc.touse.moplaf.tousedatasetload.TousedatasetloadFactory;
import com.misc.touse.moplaf.tousedatasetload.TousedatasetloadPackage;
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
public class TousedatasetloadPackageImpl extends EPackageImpl implements TousedatasetloadPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fpdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fpdGroupSortingPlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fpdSortingPlansEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fpdSortingPlanInputsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fpdSortingPlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fpdSortingPlanInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mariaDbTestDatabaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mariaDbTestGroupTablesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mariaDbTestTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mariaDbTestRowEClass = null;

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
	 * @see com.misc.touse.moplaf.tousedatasetload.TousedatasetloadPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TousedatasetloadPackageImpl() {
		super(eNS_URI, TousedatasetloadFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TousedatasetloadPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TousedatasetloadPackage init() {
		if (isInited) return (TousedatasetloadPackage)EPackage.Registry.INSTANCE.getEPackage(TousedatasetloadPackage.eNS_URI);

		// Obtain or create and register package
		TousedatasetloadPackageImpl theTousedatasetloadPackage = (TousedatasetloadPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TousedatasetloadPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TousedatasetloadPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DatasetLoadDerbyPackage.eINSTANCE.eClass();
		DatasetLoadMariaDbPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTousedatasetloadPackage.createPackageContents();

		// Initialize created meta-data
		theTousedatasetloadPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTousedatasetloadPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TousedatasetloadPackage.eNS_URI, theTousedatasetloadPackage);
		return theTousedatasetloadPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFPD() {
		return fpdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFPD_SortingPlansSet() {
		return (EReference)fpdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFPDGroupSortingPlan() {
		return fpdGroupSortingPlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFPDGroupSortingPlan_FromDate() {
		return (EAttribute)fpdGroupSortingPlanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFPDGroupSortingPlan_ToDate() {
		return (EAttribute)fpdGroupSortingPlanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFPDGroupSortingPlan_SortingPlansTable() {
		return (EReference)fpdGroupSortingPlanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFPDGroupSortingPlan_SortingPlanInputsTable() {
		return (EReference)fpdGroupSortingPlanEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFPDSortingPlans() {
		return fpdSortingPlansEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFPDSortingPlans_SortingPlans() {
		return (EReference)fpdSortingPlansEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFPDSortingPlanInputs() {
		return fpdSortingPlanInputsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFPDSortingPlanInputs_SortingPlanInputs() {
		return (EReference)fpdSortingPlanInputsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFPDSortingPlan() {
		return fpdSortingPlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFPDSortingPlan_SortingPlanID() {
		return (EAttribute)fpdSortingPlanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFPDSortingPlan_Name() {
		return (EAttribute)fpdSortingPlanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFPDSortingPlan_ValidFrom() {
		return (EAttribute)fpdSortingPlanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFPDSortingPlan_ValidTo() {
		return (EAttribute)fpdSortingPlanEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFPDSortingPlanInput() {
		return fpdSortingPlanInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFPDSortingPlanInput_ProductID() {
		return (EAttribute)fpdSortingPlanInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFPDSortingPlanInput_SortingPlanID() {
		return (EAttribute)fpdSortingPlanInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMariaDbTestDatabase() {
		return mariaDbTestDatabaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMariaDbTestDatabase_TableSets() {
		return (EReference)mariaDbTestDatabaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMariaDbTestGroupTables() {
		return mariaDbTestGroupTablesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMariaDbTestGroupTables_MariaTables() {
		return (EReference)mariaDbTestGroupTablesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMariaDbTestTable() {
		return mariaDbTestTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMariaDbTestTable_MariaRows() {
		return (EReference)mariaDbTestTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMariaDbTestRow() {
		return mariaDbTestRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMariaDbTestRow_Col1() {
		return (EAttribute)mariaDbTestRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMariaDbTestRow_Col2() {
		return (EAttribute)mariaDbTestRowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TousedatasetloadFactory getTousedatasetloadFactory() {
		return (TousedatasetloadFactory)getEFactoryInstance();
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
		fpdEClass = createEClass(FPD);
		createEReference(fpdEClass, FPD__SORTING_PLANS_SET);

		fpdGroupSortingPlanEClass = createEClass(FPD_GROUP_SORTING_PLAN);
		createEAttribute(fpdGroupSortingPlanEClass, FPD_GROUP_SORTING_PLAN__FROM_DATE);
		createEAttribute(fpdGroupSortingPlanEClass, FPD_GROUP_SORTING_PLAN__TO_DATE);
		createEReference(fpdGroupSortingPlanEClass, FPD_GROUP_SORTING_PLAN__SORTING_PLANS_TABLE);
		createEReference(fpdGroupSortingPlanEClass, FPD_GROUP_SORTING_PLAN__SORTING_PLAN_INPUTS_TABLE);

		fpdSortingPlansEClass = createEClass(FPD_SORTING_PLANS);
		createEReference(fpdSortingPlansEClass, FPD_SORTING_PLANS__SORTING_PLANS);

		fpdSortingPlanInputsEClass = createEClass(FPD_SORTING_PLAN_INPUTS);
		createEReference(fpdSortingPlanInputsEClass, FPD_SORTING_PLAN_INPUTS__SORTING_PLAN_INPUTS);

		fpdSortingPlanEClass = createEClass(FPD_SORTING_PLAN);
		createEAttribute(fpdSortingPlanEClass, FPD_SORTING_PLAN__SORTING_PLAN_ID);
		createEAttribute(fpdSortingPlanEClass, FPD_SORTING_PLAN__NAME);
		createEAttribute(fpdSortingPlanEClass, FPD_SORTING_PLAN__VALID_FROM);
		createEAttribute(fpdSortingPlanEClass, FPD_SORTING_PLAN__VALID_TO);

		fpdSortingPlanInputEClass = createEClass(FPD_SORTING_PLAN_INPUT);
		createEAttribute(fpdSortingPlanInputEClass, FPD_SORTING_PLAN_INPUT__PRODUCT_ID);
		createEAttribute(fpdSortingPlanInputEClass, FPD_SORTING_PLAN_INPUT__SORTING_PLAN_ID);

		mariaDbTestDatabaseEClass = createEClass(MARIA_DB_TEST_DATABASE);
		createEReference(mariaDbTestDatabaseEClass, MARIA_DB_TEST_DATABASE__TABLE_SETS);

		mariaDbTestGroupTablesEClass = createEClass(MARIA_DB_TEST_GROUP_TABLES);
		createEReference(mariaDbTestGroupTablesEClass, MARIA_DB_TEST_GROUP_TABLES__MARIA_TABLES);

		mariaDbTestTableEClass = createEClass(MARIA_DB_TEST_TABLE);
		createEReference(mariaDbTestTableEClass, MARIA_DB_TEST_TABLE__MARIA_ROWS);

		mariaDbTestRowEClass = createEClass(MARIA_DB_TEST_ROW);
		createEAttribute(mariaDbTestRowEClass, MARIA_DB_TEST_ROW__COL1);
		createEAttribute(mariaDbTestRowEClass, MARIA_DB_TEST_ROW__COL2);
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
		DatasetLoadDerbyPackage theDatasetLoadDerbyPackage = (DatasetLoadDerbyPackage)EPackage.Registry.INSTANCE.getEPackage(DatasetLoadDerbyPackage.eNS_URI);
		DatasetloadPackage theDatasetloadPackage = (DatasetloadPackage)EPackage.Registry.INSTANCE.getEPackage(DatasetloadPackage.eNS_URI);
		DatasetLoadMariaDbPackage theDatasetLoadMariaDbPackage = (DatasetLoadMariaDbPackage)EPackage.Registry.INSTANCE.getEPackage(DatasetLoadMariaDbPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		fpdEClass.getESuperTypes().add(theDatasetLoadDerbyPackage.getDataSourceJdbDerbyEmbedded());
		fpdGroupSortingPlanEClass.getESuperTypes().add(theDatasetloadPackage.getTableGroup());
		fpdSortingPlansEClass.getESuperTypes().add(theDatasetloadPackage.getTable());
		fpdSortingPlanInputsEClass.getESuperTypes().add(theDatasetloadPackage.getTable());
		fpdSortingPlanEClass.getESuperTypes().add(theDatasetloadPackage.getTableRow());
		fpdSortingPlanInputEClass.getESuperTypes().add(theDatasetloadPackage.getTableRow());
		mariaDbTestDatabaseEClass.getESuperTypes().add(theDatasetLoadMariaDbPackage.getDatasetLoadJdbcMariaDb());
		mariaDbTestGroupTablesEClass.getESuperTypes().add(theDatasetloadPackage.getTableGroup());
		mariaDbTestTableEClass.getESuperTypes().add(theDatasetloadPackage.getTable());
		mariaDbTestRowEClass.getESuperTypes().add(theDatasetloadPackage.getTableRow());

		// Initialize classes, features, and operations; add parameters
		initEClass(fpdEClass, com.misc.touse.moplaf.tousedatasetload.FPD.class, "FPD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFPD_SortingPlansSet(), this.getFPDGroupSortingPlan(), null, "SortingPlansSet", null, 0, 1, com.misc.touse.moplaf.tousedatasetload.FPD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fpdGroupSortingPlanEClass, FPDGroupSortingPlan.class, "FPDGroupSortingPlan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFPDGroupSortingPlan_FromDate(), ecorePackage.getEDate(), "FromDate", null, 0, 1, FPDGroupSortingPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFPDGroupSortingPlan_ToDate(), ecorePackage.getEDate(), "ToDate", null, 0, 1, FPDGroupSortingPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFPDGroupSortingPlan_SortingPlansTable(), this.getFPDSortingPlans(), null, "SortingPlansTable", null, 0, 1, FPDGroupSortingPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFPDGroupSortingPlan_SortingPlanInputsTable(), this.getFPDSortingPlanInputs(), null, "SortingPlanInputsTable", null, 0, 1, FPDGroupSortingPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fpdSortingPlansEClass, FPDSortingPlans.class, "FPDSortingPlans", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFPDSortingPlans_SortingPlans(), this.getFPDSortingPlan(), null, "SortingPlans", null, 0, -1, FPDSortingPlans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fpdSortingPlanInputsEClass, FPDSortingPlanInputs.class, "FPDSortingPlanInputs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFPDSortingPlanInputs_SortingPlanInputs(), this.getFPDSortingPlanInput(), null, "SortingPlanInputs", null, 0, -1, FPDSortingPlanInputs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fpdSortingPlanEClass, FPDSortingPlan.class, "FPDSortingPlan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFPDSortingPlan_SortingPlanID(), ecorePackage.getEString(), "SortingPlanID", null, 0, 1, FPDSortingPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFPDSortingPlan_Name(), ecorePackage.getEString(), "Name", null, 0, 1, FPDSortingPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFPDSortingPlan_ValidFrom(), ecorePackage.getEDate(), "ValidFrom", null, 0, 1, FPDSortingPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFPDSortingPlan_ValidTo(), ecorePackage.getEDate(), "ValidTo", null, 0, 1, FPDSortingPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fpdSortingPlanInputEClass, FPDSortingPlanInput.class, "FPDSortingPlanInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFPDSortingPlanInput_ProductID(), ecorePackage.getEString(), "ProductID", null, 0, 1, FPDSortingPlanInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFPDSortingPlanInput_SortingPlanID(), ecorePackage.getEString(), "SortingPlanID", null, 0, 1, FPDSortingPlanInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mariaDbTestDatabaseEClass, MariaDbTestDatabase.class, "MariaDbTestDatabase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMariaDbTestDatabase_TableSets(), this.getMariaDbTestGroupTables(), null, "TableSets", null, 0, -1, MariaDbTestDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mariaDbTestGroupTablesEClass, MariaDbTestGroupTables.class, "MariaDbTestGroupTables", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMariaDbTestGroupTables_MariaTables(), this.getMariaDbTestTable(), null, "MariaTables", null, 0, -1, MariaDbTestGroupTables.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mariaDbTestTableEClass, MariaDbTestTable.class, "MariaDbTestTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMariaDbTestTable_MariaRows(), this.getMariaDbTestRow(), null, "MariaRows", null, 0, -1, MariaDbTestTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mariaDbTestRowEClass, MariaDbTestRow.class, "MariaDbTestRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMariaDbTestRow_Col1(), ecorePackage.getEIntegerObject(), "Col1", null, 0, 1, MariaDbTestRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMariaDbTestRow_Col2(), ecorePackage.getEIntegerObject(), "Col2", null, 0, 1, MariaDbTestRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TousedatasetloadPackageImpl
