/**
 */
package com.misc.touse.moplaf.tousedatasetload.impl;

import com.misc.common.moplaf.datasetload.impl.TableRowImpl;

import com.misc.touse.moplaf.tousedatasetload.FPDSortingPlan;
import com.misc.touse.moplaf.tousedatasetload.TousedatasetloadPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FPD Sorting Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousedatasetload.impl.FPDSortingPlanImpl#getSortingPlanID <em>Sorting Plan ID</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousedatasetload.impl.FPDSortingPlanImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousedatasetload.impl.FPDSortingPlanImpl#getValidFrom <em>Valid From</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousedatasetload.impl.FPDSortingPlanImpl#getValidTo <em>Valid To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FPDSortingPlanImpl extends TableRowImpl implements FPDSortingPlan {
	/**
	 * The default value of the '{@link #getSortingPlanID() <em>Sorting Plan ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingPlanID()
	 * @generated
	 * @ordered
	 */
	protected static final String SORTING_PLAN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSortingPlanID() <em>Sorting Plan ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingPlanID()
	 * @generated
	 * @ordered
	 */
	protected String sortingPlanID = SORTING_PLAN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidFrom() <em>Valid From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFrom()
	 * @generated
	 * @ordered
	 */
	protected static final Date VALID_FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidFrom() <em>Valid From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFrom()
	 * @generated
	 * @ordered
	 */
	protected Date validFrom = VALID_FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidTo() <em>Valid To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidTo()
	 * @generated
	 * @ordered
	 */
	protected static final Date VALID_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidTo() <em>Valid To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidTo()
	 * @generated
	 * @ordered
	 */
	protected Date validTo = VALID_TO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FPDSortingPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TousedatasetloadPackage.Literals.FPD_SORTING_PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSortingPlanID() {
		return sortingPlanID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortingPlanID(String newSortingPlanID) {
		String oldSortingPlanID = sortingPlanID;
		sortingPlanID = newSortingPlanID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TousedatasetloadPackage.FPD_SORTING_PLAN__SORTING_PLAN_ID, oldSortingPlanID, sortingPlanID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TousedatasetloadPackage.FPD_SORTING_PLAN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getValidFrom() {
		return validFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidFrom(Date newValidFrom) {
		Date oldValidFrom = validFrom;
		validFrom = newValidFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TousedatasetloadPackage.FPD_SORTING_PLAN__VALID_FROM, oldValidFrom, validFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getValidTo() {
		return validTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidTo(Date newValidTo) {
		Date oldValidTo = validTo;
		validTo = newValidTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TousedatasetloadPackage.FPD_SORTING_PLAN__VALID_TO, oldValidTo, validTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TousedatasetloadPackage.FPD_SORTING_PLAN__SORTING_PLAN_ID:
				return getSortingPlanID();
			case TousedatasetloadPackage.FPD_SORTING_PLAN__NAME:
				return getName();
			case TousedatasetloadPackage.FPD_SORTING_PLAN__VALID_FROM:
				return getValidFrom();
			case TousedatasetloadPackage.FPD_SORTING_PLAN__VALID_TO:
				return getValidTo();
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
			case TousedatasetloadPackage.FPD_SORTING_PLAN__SORTING_PLAN_ID:
				setSortingPlanID((String)newValue);
				return;
			case TousedatasetloadPackage.FPD_SORTING_PLAN__NAME:
				setName((String)newValue);
				return;
			case TousedatasetloadPackage.FPD_SORTING_PLAN__VALID_FROM:
				setValidFrom((Date)newValue);
				return;
			case TousedatasetloadPackage.FPD_SORTING_PLAN__VALID_TO:
				setValidTo((Date)newValue);
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
			case TousedatasetloadPackage.FPD_SORTING_PLAN__SORTING_PLAN_ID:
				setSortingPlanID(SORTING_PLAN_ID_EDEFAULT);
				return;
			case TousedatasetloadPackage.FPD_SORTING_PLAN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TousedatasetloadPackage.FPD_SORTING_PLAN__VALID_FROM:
				setValidFrom(VALID_FROM_EDEFAULT);
				return;
			case TousedatasetloadPackage.FPD_SORTING_PLAN__VALID_TO:
				setValidTo(VALID_TO_EDEFAULT);
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
			case TousedatasetloadPackage.FPD_SORTING_PLAN__SORTING_PLAN_ID:
				return SORTING_PLAN_ID_EDEFAULT == null ? sortingPlanID != null : !SORTING_PLAN_ID_EDEFAULT.equals(sortingPlanID);
			case TousedatasetloadPackage.FPD_SORTING_PLAN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TousedatasetloadPackage.FPD_SORTING_PLAN__VALID_FROM:
				return VALID_FROM_EDEFAULT == null ? validFrom != null : !VALID_FROM_EDEFAULT.equals(validFrom);
			case TousedatasetloadPackage.FPD_SORTING_PLAN__VALID_TO:
				return VALID_TO_EDEFAULT == null ? validTo != null : !VALID_TO_EDEFAULT.equals(validTo);
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
		result.append(" (SortingPlanID: ");
		result.append(sortingPlanID);
		result.append(", Name: ");
		result.append(name);
		result.append(", ValidFrom: ");
		result.append(validFrom);
		result.append(", ValidTo: ");
		result.append(validTo);
		result.append(')');
		return result.toString();
	}

} //FPDSortingPlanImpl
