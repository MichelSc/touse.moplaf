/**
 */
package com.misc.touse.moplaf.dbsynch.tousedbsynch;

import com.misc.common.moplaf.dbsynch.TableGroup;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FPD Group Sorting Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDGroupSortingPlan#getFromDate <em>From Date</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDGroupSortingPlan#getToDate <em>To Date</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDGroupSortingPlan#getSortingPlansTable <em>Sorting Plans Table</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDGroupSortingPlan#getSortingPlanInputsTable <em>Sorting Plan Inputs Table</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.TousedbsynchPackage#getFPDGroupSortingPlan()
 * @model
 * @generated
 */
public interface FPDGroupSortingPlan extends TableGroup {
	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.TousedbsynchPackage#getFPDGroupSortingPlan_FromDate()
	 * @model
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDGroupSortingPlan#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>To Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Date</em>' attribute.
	 * @see #setToDate(Date)
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.TousedbsynchPackage#getFPDGroupSortingPlan_ToDate()
	 * @model
	 * @generated
	 */
	Date getToDate();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDGroupSortingPlan#getToDate <em>To Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Date</em>' attribute.
	 * @see #getToDate()
	 * @generated
	 */
	void setToDate(Date value);

	/**
	 * Returns the value of the '<em><b>Sorting Plans Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Plans Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Plans Table</em>' containment reference.
	 * @see #setSortingPlansTable(FPDSortingPlans)
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.TousedbsynchPackage#getFPDGroupSortingPlan_SortingPlansTable()
	 * @model containment="true"
	 * @generated
	 */
	FPDSortingPlans getSortingPlansTable();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDGroupSortingPlan#getSortingPlansTable <em>Sorting Plans Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorting Plans Table</em>' containment reference.
	 * @see #getSortingPlansTable()
	 * @generated
	 */
	void setSortingPlansTable(FPDSortingPlans value);

	/**
	 * Returns the value of the '<em><b>Sorting Plan Inputs Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Plan Inputs Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Plan Inputs Table</em>' containment reference.
	 * @see #setSortingPlanInputsTable(FPDSortingPlanInputs)
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.TousedbsynchPackage#getFPDGroupSortingPlan_SortingPlanInputsTable()
	 * @model containment="true"
	 * @generated
	 */
	FPDSortingPlanInputs getSortingPlanInputsTable();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDGroupSortingPlan#getSortingPlanInputsTable <em>Sorting Plan Inputs Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorting Plan Inputs Table</em>' containment reference.
	 * @see #getSortingPlanInputsTable()
	 * @generated
	 */
	void setSortingPlanInputsTable(FPDSortingPlanInputs value);

} // FPDGroupSortingPlan
