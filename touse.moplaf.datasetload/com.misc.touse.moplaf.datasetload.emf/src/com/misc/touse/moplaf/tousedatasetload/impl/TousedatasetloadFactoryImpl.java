/**
 */
package com.misc.touse.moplaf.tousedatasetload.impl;

import com.misc.touse.moplaf.tousedatasetload.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TousedatasetloadFactoryImpl extends EFactoryImpl implements TousedatasetloadFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TousedatasetloadFactory init() {
		try {
			TousedatasetloadFactory theTousedatasetloadFactory = (TousedatasetloadFactory)EPackage.Registry.INSTANCE.getEFactory(TousedatasetloadPackage.eNS_URI);
			if (theTousedatasetloadFactory != null) {
				return theTousedatasetloadFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TousedatasetloadFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TousedatasetloadFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TousedatasetloadPackage.FPD: return createFPD();
			case TousedatasetloadPackage.FPD_GROUP_SORTING_PLAN: return createFPDGroupSortingPlan();
			case TousedatasetloadPackage.FPD_SORTING_PLANS: return createFPDSortingPlans();
			case TousedatasetloadPackage.FPD_SORTING_PLAN_INPUTS: return createFPDSortingPlanInputs();
			case TousedatasetloadPackage.FPD_SORTING_PLAN: return createFPDSortingPlan();
			case TousedatasetloadPackage.FPD_SORTING_PLAN_INPUT: return createFPDSortingPlanInput();
			case TousedatasetloadPackage.MARIA_DB_TEST_DATABASE: return createMariaDbTestDatabase();
			case TousedatasetloadPackage.MARIA_DB_TEST_GROUP_TABLES: return createMariaDbTestGroupTables();
			case TousedatasetloadPackage.MARIA_DB_TEST_TABLE: return createMariaDbTestTable();
			case TousedatasetloadPackage.MARIA_DB_TEST_ROW: return createMariaDbTestRow();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPD createFPD() {
		FPDImpl fpd = new FPDImpl();
		return fpd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPDGroupSortingPlan createFPDGroupSortingPlan() {
		FPDGroupSortingPlanImpl fpdGroupSortingPlan = new FPDGroupSortingPlanImpl();
		return fpdGroupSortingPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPDSortingPlans createFPDSortingPlans() {
		FPDSortingPlansImpl fpdSortingPlans = new FPDSortingPlansImpl();
		return fpdSortingPlans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPDSortingPlanInputs createFPDSortingPlanInputs() {
		FPDSortingPlanInputsImpl fpdSortingPlanInputs = new FPDSortingPlanInputsImpl();
		return fpdSortingPlanInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPDSortingPlan createFPDSortingPlan() {
		FPDSortingPlanImpl fpdSortingPlan = new FPDSortingPlanImpl();
		return fpdSortingPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPDSortingPlanInput createFPDSortingPlanInput() {
		FPDSortingPlanInputImpl fpdSortingPlanInput = new FPDSortingPlanInputImpl();
		return fpdSortingPlanInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MariaDbTestDatabase createMariaDbTestDatabase() {
		MariaDbTestDatabaseImpl mariaDbTestDatabase = new MariaDbTestDatabaseImpl();
		return mariaDbTestDatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MariaDbTestGroupTables createMariaDbTestGroupTables() {
		MariaDbTestGroupTablesImpl mariaDbTestGroupTables = new MariaDbTestGroupTablesImpl();
		return mariaDbTestGroupTables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MariaDbTestTable createMariaDbTestTable() {
		MariaDbTestTableImpl mariaDbTestTable = new MariaDbTestTableImpl();
		return mariaDbTestTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MariaDbTestRow createMariaDbTestRow() {
		MariaDbTestRowImpl mariaDbTestRow = new MariaDbTestRowImpl();
		return mariaDbTestRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TousedatasetloadPackage getTousedatasetloadPackage() {
		return (TousedatasetloadPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TousedatasetloadPackage getPackage() {
		return TousedatasetloadPackage.eINSTANCE;
	}

} //TousedatasetloadFactoryImpl
