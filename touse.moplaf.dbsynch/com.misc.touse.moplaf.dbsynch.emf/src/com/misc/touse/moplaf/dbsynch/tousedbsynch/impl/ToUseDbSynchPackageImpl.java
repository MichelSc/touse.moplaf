/**
 */
package com.misc.touse.moplaf.dbsynch.tousedbsynch.impl;

import com.misc.common.moplaf.dbsynch.DbSynchPackage;

import com.misc.common.moplaf.dbsynch.dbsynchderby.DbsynchderbyPackage;

import com.misc.common.moplaf.dbsynch.dbsynchmysql.DbsynchmysqlPackage;
import com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDGroupSortingPlan;
import com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDMySql;
import com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan;
import com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlanInput;
import com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlanInputs;
import com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlans;
import com.misc.touse.moplaf.dbsynch.tousedbsynch.ToUseDbSynchFactory;
import com.misc.touse.moplaf.dbsynch.tousedbsynch.ToUseDbSynchPackage;

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
public class ToUseDbSynchPackageImpl extends EPackageImpl implements ToUseDbSynchPackage {
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
	private EClass fpdMySqlEClass = null;

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
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.ToUseDbSynchPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ToUseDbSynchPackageImpl() {
		super(eNS_URI, ToUseDbSynchFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ToUseDbSynchPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ToUseDbSynchPackage init() {
		if (isInited) return (ToUseDbSynchPackage)EPackage.Registry.INSTANCE.getEPackage(ToUseDbSynchPackage.eNS_URI);

		// Obtain or create and register package
		ToUseDbSynchPackageImpl theToUseDbSynchPackage = (ToUseDbSynchPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ToUseDbSynchPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ToUseDbSynchPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DbsynchderbyPackage.eINSTANCE.eClass();
		DbsynchmysqlPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theToUseDbSynchPackage.createPackageContents();

		// Initialize created meta-data
		theToUseDbSynchPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theToUseDbSynchPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ToUseDbSynchPackage.eNS_URI, theToUseDbSynchPackage);
		return theToUseDbSynchPackage;
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
	public EClass getFPDMySql() {
		return fpdMySqlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFPDMySql_SortingPlansSet() {
		return (EReference)fpdMySqlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseDbSynchFactory getToUseDbSynchFactory() {
		return (ToUseDbSynchFactory)getEFactoryInstance();
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

		fpdMySqlEClass = createEClass(FPD_MY_SQL);
		createEReference(fpdMySqlEClass, FPD_MY_SQL__SORTING_PLANS_SET);
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
		DbsynchderbyPackage theDbsynchderbyPackage = (DbsynchderbyPackage)EPackage.Registry.INSTANCE.getEPackage(DbsynchderbyPackage.eNS_URI);
		DbSynchPackage theDbSynchPackage = (DbSynchPackage)EPackage.Registry.INSTANCE.getEPackage(DbSynchPackage.eNS_URI);
		DbsynchmysqlPackage theDbsynchmysqlPackage = (DbsynchmysqlPackage)EPackage.Registry.INSTANCE.getEPackage(DbsynchmysqlPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		fpdEClass.getESuperTypes().add(theDbsynchderbyPackage.getDataSourceJdbcDerbyEmbedded());
		fpdGroupSortingPlanEClass.getESuperTypes().add(theDbSynchPackage.getDbSynchUnit());
		fpdSortingPlansEClass.getESuperTypes().add(theDbSynchPackage.getTable());
		fpdSortingPlanInputsEClass.getESuperTypes().add(theDbSynchPackage.getTable());
		fpdSortingPlanEClass.getESuperTypes().add(theDbSynchPackage.getTableRow());
		fpdSortingPlanInputEClass.getESuperTypes().add(theDbSynchPackage.getTableRow());
		fpdMySqlEClass.getESuperTypes().add(theDbsynchmysqlPackage.getDataSourceJdbcMySql());

		// Initialize classes, features, and operations; add parameters
		initEClass(fpdEClass, com.misc.touse.moplaf.dbsynch.tousedbsynch.FPD.class, "FPD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFPD_SortingPlansSet(), this.getFPDGroupSortingPlan(), null, "SortingPlansSet", null, 0, -1, com.misc.touse.moplaf.dbsynch.tousedbsynch.FPD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(fpdMySqlEClass, FPDMySql.class, "FPDMySql", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFPDMySql_SortingPlansSet(), this.getFPDGroupSortingPlan(), null, "SortingPlansSet", null, 0, -1, FPDMySql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ToUseDbSynchPackageImpl
