/**
 */
package com.misc.touse.moplaf.tousedatasetload.util;

import com.misc.common.moplaf.DatasetLoadMariaDb.DatasetLoadJdbcMariaDb;
import com.misc.common.moplaf.dbsynch.DataSource;
import com.misc.common.moplaf.dbsynch.DataSourceJdbc;
import com.misc.common.moplaf.dbsynch.Table;
import com.misc.common.moplaf.dbsynch.TableGroup;
import com.misc.common.moplaf.dbsynch.TableRow;
import com.misc.common.moplaf.dbsynch.derby.DataSourceJdbDerbyEmbedded;
import com.misc.touse.moplaf.tousedatasetload.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.misc.touse.moplaf.tousedatasetload.TousedatasetloadPackage
 * @generated
 */
public class TousedatasetloadSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TousedatasetloadPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TousedatasetloadSwitch() {
		if (modelPackage == null) {
			modelPackage = TousedatasetloadPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TousedatasetloadPackage.FPD: {
				FPD fpd = (FPD)theEObject;
				T result = caseFPD(fpd);
				if (result == null) result = caseDataSourceJdbDerbyEmbedded(fpd);
				if (result == null) result = caseDataSourceJdbc(fpd);
				if (result == null) result = caseDataSource(fpd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TousedatasetloadPackage.FPD_GROUP_SORTING_PLAN: {
				FPDGroupSortingPlan fpdGroupSortingPlan = (FPDGroupSortingPlan)theEObject;
				T result = caseFPDGroupSortingPlan(fpdGroupSortingPlan);
				if (result == null) result = caseTableGroup(fpdGroupSortingPlan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TousedatasetloadPackage.FPD_SORTING_PLANS: {
				FPDSortingPlans fpdSortingPlans = (FPDSortingPlans)theEObject;
				T result = caseFPDSortingPlans(fpdSortingPlans);
				if (result == null) result = caseTable(fpdSortingPlans);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TousedatasetloadPackage.FPD_SORTING_PLAN_INPUTS: {
				FPDSortingPlanInputs fpdSortingPlanInputs = (FPDSortingPlanInputs)theEObject;
				T result = caseFPDSortingPlanInputs(fpdSortingPlanInputs);
				if (result == null) result = caseTable(fpdSortingPlanInputs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TousedatasetloadPackage.FPD_SORTING_PLAN: {
				FPDSortingPlan fpdSortingPlan = (FPDSortingPlan)theEObject;
				T result = caseFPDSortingPlan(fpdSortingPlan);
				if (result == null) result = caseTableRow(fpdSortingPlan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TousedatasetloadPackage.FPD_SORTING_PLAN_INPUT: {
				FPDSortingPlanInput fpdSortingPlanInput = (FPDSortingPlanInput)theEObject;
				T result = caseFPDSortingPlanInput(fpdSortingPlanInput);
				if (result == null) result = caseTableRow(fpdSortingPlanInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TousedatasetloadPackage.MARIA_DB_TEST_DATABASE: {
				MariaDbTestDatabase mariaDbTestDatabase = (MariaDbTestDatabase)theEObject;
				T result = caseMariaDbTestDatabase(mariaDbTestDatabase);
				if (result == null) result = caseDatasetLoadJdbcMariaDb(mariaDbTestDatabase);
				if (result == null) result = caseDataSourceJdbc(mariaDbTestDatabase);
				if (result == null) result = caseDataSource(mariaDbTestDatabase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TousedatasetloadPackage.MARIA_DB_TEST_GROUP_TABLES: {
				MariaDbTestGroupTables mariaDbTestGroupTables = (MariaDbTestGroupTables)theEObject;
				T result = caseMariaDbTestGroupTables(mariaDbTestGroupTables);
				if (result == null) result = caseTableGroup(mariaDbTestGroupTables);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TousedatasetloadPackage.MARIA_DB_TEST_TABLE: {
				MariaDbTestTable mariaDbTestTable = (MariaDbTestTable)theEObject;
				T result = caseMariaDbTestTable(mariaDbTestTable);
				if (result == null) result = caseTable(mariaDbTestTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TousedatasetloadPackage.MARIA_DB_TEST_ROW: {
				MariaDbTestRow mariaDbTestRow = (MariaDbTestRow)theEObject;
				T result = caseMariaDbTestRow(mariaDbTestRow);
				if (result == null) result = caseTableRow(mariaDbTestRow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FPD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FPD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFPD(FPD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FPD Group Sorting Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FPD Group Sorting Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFPDGroupSortingPlan(FPDGroupSortingPlan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FPD Sorting Plans</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FPD Sorting Plans</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFPDSortingPlans(FPDSortingPlans object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FPD Sorting Plan Inputs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FPD Sorting Plan Inputs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFPDSortingPlanInputs(FPDSortingPlanInputs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FPD Sorting Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FPD Sorting Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFPDSortingPlan(FPDSortingPlan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FPD Sorting Plan Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FPD Sorting Plan Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFPDSortingPlanInput(FPDSortingPlanInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maria Db Test Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maria Db Test Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMariaDbTestDatabase(MariaDbTestDatabase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maria Db Test Group Tables</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maria Db Test Group Tables</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMariaDbTestGroupTables(MariaDbTestGroupTables object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maria Db Test Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maria Db Test Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMariaDbTestTable(MariaDbTestTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maria Db Test Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maria Db Test Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMariaDbTestRow(MariaDbTestRow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSource(DataSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Source Jdbc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Source Jdbc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSourceJdbc(DataSourceJdbc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Source Jdb Derby Embedded</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Source Jdb Derby Embedded</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSourceJdbDerbyEmbedded(DataSourceJdbDerbyEmbedded object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableGroup(TableGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTable(Table object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableRow(TableRow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dataset Load Jdbc Maria Db</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dataset Load Jdbc Maria Db</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatasetLoadJdbcMariaDb(DatasetLoadJdbcMariaDb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TousedatasetloadSwitch
