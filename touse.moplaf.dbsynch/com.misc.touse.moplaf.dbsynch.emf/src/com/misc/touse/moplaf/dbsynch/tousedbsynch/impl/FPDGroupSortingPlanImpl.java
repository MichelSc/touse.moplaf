/**
 */
package com.misc.touse.moplaf.dbsynch.tousedbsynch.impl;

import com.misc.common.moplaf.dbsynch.impl.TableGroupImpl;

import com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDGroupSortingPlan;
import com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlanInputs;
import com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlans;
import com.misc.touse.moplaf.dbsynch.tousedbsynch.ToUseDbSynchPackage;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FPD Group Sorting Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDGroupSortingPlanImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDGroupSortingPlanImpl#getToDate <em>To Date</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDGroupSortingPlanImpl#getSortingPlansTable <em>Sorting Plans Table</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDGroupSortingPlanImpl#getSortingPlanInputsTable <em>Sorting Plan Inputs Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FPDGroupSortingPlanImpl extends TableGroupImpl implements FPDGroupSortingPlan {
	/**
	 * The default value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date fromDate = FROM_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getToDate() <em>To Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date TO_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToDate() <em>To Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToDate()
	 * @generated
	 * @ordered
	 */
	protected Date toDate = TO_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSortingPlansTable() <em>Sorting Plans Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingPlansTable()
	 * @generated
	 * @ordered
	 */
	protected FPDSortingPlans sortingPlansTable;

	/**
	 * The cached value of the '{@link #getSortingPlanInputsTable() <em>Sorting Plan Inputs Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingPlanInputsTable()
	 * @generated
	 * @ordered
	 */
	protected FPDSortingPlanInputs sortingPlanInputsTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FPDGroupSortingPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseDbSynchPackage.Literals.FPD_GROUP_SORTING_PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromDate(Date newFromDate) {
		Date oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseDbSynchPackage.FPD_GROUP_SORTING_PLAN__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getToDate() {
		return toDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToDate(Date newToDate) {
		Date oldToDate = toDate;
		toDate = newToDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseDbSynchPackage.FPD_GROUP_SORTING_PLAN__TO_DATE, oldToDate, toDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPDSortingPlans getSortingPlansTable() {
		return sortingPlansTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSortingPlansTable(FPDSortingPlans newSortingPlansTable, NotificationChain msgs) {
		FPDSortingPlans oldSortingPlansTable = sortingPlansTable;
		sortingPlansTable = newSortingPlansTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToUseDbSynchPackage.FPD_GROUP_SORTING_PLAN__SORTING_PLANS_TABLE, oldSortingPlansTable, newSortingPlansTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortingPlansTable(FPDSortingPlans newSortingPlansTable) {
		if (newSortingPlansTable != sortingPlansTable) {
			NotificationChain msgs = null;
			if (sortingPlansTable != null)
				msgs = ((InternalEObject)sortingPlansTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToUseDbSynchPackage.FPD_GROUP_SORTING_PLAN__SORTING_PLANS_TABLE, null, msgs);
			if (newSortingPlansTable != null)
				msgs = ((InternalEObject)newSortingPlansTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToUseDbSynchPackage.FPD_GROUP_SORTING_PLAN__SORTING_PLANS_TABLE, null, msgs);
			msgs = basicSetSortingPlansTable(newSortingPlansTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseDbSynchPackage.FPD_GROUP_SORTING_PLAN__SORTING_PLANS_TABLE, newSortingPlansTable, newSortingPlansTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPDSortingPlanInputs getSortingPlanInputsTable() {
		return sortingPlanInputsTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSortingPlanInputsTable(FPDSortingPlanInputs newSortingPlanInputsTable, NotificationChain msgs) {
		FPDSortingPlanInputs oldSortingPlanInputsTable = sortingPlanInputsTable;
		sortingPlanInputsTable = newSortingPlanInputsTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToUseDbSynchPackage.FPD_GROUP_SORTING_PLAN__SORTING_PLAN_INPUTS_TABLE, oldSortingPlanInputsTable, newSortingPlanInputsTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortingPlanInputsTable(FPDSortingPlanInputs newSortingPlanInputsTable) {
		if (newSortingPlanInputsTable != sortingPlanInputsTable) {
			NotificationChain msgs = null;
			if (sortingPlanInputsTable != null)
				msgs = ((InternalEObject)sortingPlanInputsTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToUseDbSynchPackage.FPD_GROUP_SORTING_PLAN__SORTING_PLAN_INPUTS_TABLE, null, msgs);
			if (newSortingPlanInputsTable != null)
				msgs = ((InternalEObject)newSortingPlanInputsTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToUseDbSynchPackage.FPD_GROUP_SORTING_PLAN__SORTING_PLAN_INPUTS_TABLE, null, msgs);
			msgs = basicSetSortingPlanInputsTable(newSortingPlanInputsTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseDbSynchPackage.FPD_GROUP_SORTING_PLAN__SORTING_PLAN_INPUTS_TABLE, newSortingPlanInputsTable, newSortingPlanInputsTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToUseDbSynchPackage.FPD_GROUP_SORTING_PLAN__SORTING_PLANS_TABLE:
				return basicSetSortingPlansTable(null, msgs);
			case ToUseDbSynchPackage.FPD_GROUP_SORTING_PLAN__SORTING_PLAN_INPUTS_TABLE:
				return basicSetSortingPlanInputsTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUseDbSynchPackage.FPD_GROUP_SORTING_PLAN__FROM_DATE:
				return getFromDate();
			case ToUseDbSynchPackage.FPD_GROUP_SORTING_PLAN__TO_DATE:
				return getToDate();
			case ToUseDbSynchPackage.FPD_GROUP_SORTING_PLAN__SORTING_PLANS_TABLE:
				return getSortingPlansTable();
			case ToUseDbSynchPackage.FPD_GROUP_SORTING_PLAN__SORTING_PLAN_INPUTS_TABLE:
				return getSortingPlanInputsTable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ToUseDbSynchPackage.FPD_GROUP_SORTING_PLAN__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case ToUseDbSynchPackage.FPD_GROUP_SORTING_PLAN__TO_DATE:
				setToDate((Date)newValue);
				return;
			case ToUseDbSynchPackage.FPD_GROUP_SORTING_PLAN__SORTING_PLANS_TABLE:
				setSortingPlansTable((FPDSortingPlans)newValue);
				return;
			case ToUseDbSynchPackage.FPD_GROUP_SORTING_PLAN__SORTING_PLAN_INPUTS_TABLE:
				setSortingPlanInputsTable((FPDSortingPlanInputs)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ToUseDbSynchPackage.FPD_GROUP_SORTING_PLAN__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case ToUseDbSynchPackage.FPD_GROUP_SORTING_PLAN__TO_DATE:
				setToDate(TO_DATE_EDEFAULT);
				return;
			case ToUseDbSynchPackage.FPD_GROUP_SORTING_PLAN__SORTING_PLANS_TABLE:
				setSortingPlansTable((FPDSortingPlans)null);
				return;
			case ToUseDbSynchPackage.FPD_GROUP_SORTING_PLAN__SORTING_PLAN_INPUTS_TABLE:
				setSortingPlanInputsTable((FPDSortingPlanInputs)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ToUseDbSynchPackage.FPD_GROUP_SORTING_PLAN__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case ToUseDbSynchPackage.FPD_GROUP_SORTING_PLAN__TO_DATE:
				return TO_DATE_EDEFAULT == null ? toDate != null : !TO_DATE_EDEFAULT.equals(toDate);
			case ToUseDbSynchPackage.FPD_GROUP_SORTING_PLAN__SORTING_PLANS_TABLE:
				return sortingPlansTable != null;
			case ToUseDbSynchPackage.FPD_GROUP_SORTING_PLAN__SORTING_PLAN_INPUTS_TABLE:
				return sortingPlanInputsTable != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (FromDate: ");
		result.append(fromDate);
		result.append(", ToDate: ");
		result.append(toDate);
		result.append(')');
		return result.toString();
	}

} //FPDGroupSortingPlanImpl
