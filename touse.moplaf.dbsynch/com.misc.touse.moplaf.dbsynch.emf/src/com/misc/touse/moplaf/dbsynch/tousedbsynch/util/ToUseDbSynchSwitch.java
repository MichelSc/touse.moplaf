/**
 */
package com.misc.touse.moplaf.dbsynch.tousedbsynch.util;

import com.misc.common.moplaf.dbsynch.DataSource;
import com.misc.common.moplaf.dbsynch.DataSourceJdbc;
import com.misc.common.moplaf.dbsynch.DbSynchUnit;
import com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract;
import com.misc.common.moplaf.dbsynch.Table;
import com.misc.common.moplaf.dbsynch.TableRow;

import com.misc.common.moplaf.dbsynch.dbsynchderby.DataSourceJdbcDerbyEmbedded;

import com.misc.touse.moplaf.dbsynch.tousedbsynch.*;

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
 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.ToUseDbSynchPackage
 * @generated
 */
public class ToUseDbSynchSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ToUseDbSynchPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseDbSynchSwitch() {
		if (modelPackage == null) {
			modelPackage = ToUseDbSynchPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
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
			case ToUseDbSynchPackage.FPD: {
				FPD fpd = (FPD)theEObject;
				T result = caseFPD(fpd);
				if (result == null) result = caseDataSourceJdbcDerbyEmbedded(fpd);
				if (result == null) result = caseDataSourceJdbc(fpd);
				if (result == null) result = caseDataSource(fpd);
				if (result == null) result = caseDbSynchUnitAbstract(fpd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToUseDbSynchPackage.FPD_GROUP_SORTING_PLAN: {
				FPDGroupSortingPlan fpdGroupSortingPlan = (FPDGroupSortingPlan)theEObject;
				T result = caseFPDGroupSortingPlan(fpdGroupSortingPlan);
				if (result == null) result = caseDbSynchUnit(fpdGroupSortingPlan);
				if (result == null) result = caseDbSynchUnitAbstract(fpdGroupSortingPlan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToUseDbSynchPackage.FPD_SORTING_PLANS: {
				FPDSortingPlans fpdSortingPlans = (FPDSortingPlans)theEObject;
				T result = caseFPDSortingPlans(fpdSortingPlans);
				if (result == null) result = caseTable(fpdSortingPlans);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToUseDbSynchPackage.FPD_SORTING_PLAN_INPUTS: {
				FPDSortingPlanInputs fpdSortingPlanInputs = (FPDSortingPlanInputs)theEObject;
				T result = caseFPDSortingPlanInputs(fpdSortingPlanInputs);
				if (result == null) result = caseTable(fpdSortingPlanInputs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToUseDbSynchPackage.FPD_SORTING_PLAN: {
				FPDSortingPlan fpdSortingPlan = (FPDSortingPlan)theEObject;
				T result = caseFPDSortingPlan(fpdSortingPlan);
				if (result == null) result = caseTableRow(fpdSortingPlan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToUseDbSynchPackage.FPD_SORTING_PLAN_INPUT: {
				FPDSortingPlanInput fpdSortingPlanInput = (FPDSortingPlanInput)theEObject;
				T result = caseFPDSortingPlanInput(fpdSortingPlanInput);
				if (result == null) result = caseTableRow(fpdSortingPlanInput);
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
	 * Returns the result of interpreting the object as an instance of '<em>Unit Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDbSynchUnitAbstract(DbSynchUnitAbstract object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Data Source Jdbc Derby Embedded</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Source Jdbc Derby Embedded</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSourceJdbcDerbyEmbedded(DataSourceJdbcDerbyEmbedded object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDbSynchUnit(DbSynchUnit object) {
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

} //ToUseDbSynchSwitch
