/**
 */
package com.misc.touse.moplaf.dbsynch.tousedbsynch.impl;

import com.misc.common.moplaf.dbsynch.impl.TableRowImpl;

import com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan;
import com.misc.touse.moplaf.dbsynch.tousedbsynch.ToUseDbSynchPackage;
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
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDSortingPlanImpl#getSortingPlanID <em>Sorting Plan ID</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDSortingPlanImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDSortingPlanImpl#getValidFrom <em>Valid From</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDSortingPlanImpl#getValidTo <em>Valid To</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDSortingPlanImpl#getSomeDateTime <em>Some Date Time</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDSortingPlanImpl#getSomeTime <em>Some Time</em>}</li>
 * </ul>
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
	 * This is true if the Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameESet;

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
	 * This is true if the Valid From attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean validFromESet;

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
	 * This is true if the Valid To attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean validToESet;

	/**
	 * The default value of the '{@link #getSomeDateTime() <em>Some Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSomeDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date SOME_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSomeDateTime() <em>Some Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSomeDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date someDateTime = SOME_DATE_TIME_EDEFAULT;

	/**
	 * This is true if the Some Date Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean someDateTimeESet;

	/**
	 * The default value of the '{@link #getSomeTime() <em>Some Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSomeTime()
	 * @generated
	 * @ordered
	 */
	protected static final float SOME_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSomeTime() <em>Some Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSomeTime()
	 * @generated
	 * @ordered
	 */
	protected float someTime = SOME_TIME_EDEFAULT;

	/**
	 * This is true if the Some Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean someTimeESet;

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
		return ToUseDbSynchPackage.Literals.FPD_SORTING_PLAN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseDbSynchPackage.FPD_SORTING_PLAN__SORTING_PLAN_ID, oldSortingPlanID, sortingPlanID));
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
		boolean oldNameESet = nameESet;
		nameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseDbSynchPackage.FPD_SORTING_PLAN__NAME, oldName, name, !oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		String oldName = name;
		boolean oldNameESet = nameESet;
		name = NAME_EDEFAULT;
		nameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ToUseDbSynchPackage.FPD_SORTING_PLAN__NAME, oldName, NAME_EDEFAULT, oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return nameESet;
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
		boolean oldValidFromESet = validFromESet;
		validFromESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseDbSynchPackage.FPD_SORTING_PLAN__VALID_FROM, oldValidFrom, validFrom, !oldValidFromESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValidFrom() {
		Date oldValidFrom = validFrom;
		boolean oldValidFromESet = validFromESet;
		validFrom = VALID_FROM_EDEFAULT;
		validFromESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ToUseDbSynchPackage.FPD_SORTING_PLAN__VALID_FROM, oldValidFrom, VALID_FROM_EDEFAULT, oldValidFromESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValidFrom() {
		return validFromESet;
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
		boolean oldValidToESet = validToESet;
		validToESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseDbSynchPackage.FPD_SORTING_PLAN__VALID_TO, oldValidTo, validTo, !oldValidToESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValidTo() {
		Date oldValidTo = validTo;
		boolean oldValidToESet = validToESet;
		validTo = VALID_TO_EDEFAULT;
		validToESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ToUseDbSynchPackage.FPD_SORTING_PLAN__VALID_TO, oldValidTo, VALID_TO_EDEFAULT, oldValidToESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValidTo() {
		return validToESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getSomeDateTime() {
		return someDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSomeDateTime(Date newSomeDateTime) {
		Date oldSomeDateTime = someDateTime;
		someDateTime = newSomeDateTime;
		boolean oldSomeDateTimeESet = someDateTimeESet;
		someDateTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseDbSynchPackage.FPD_SORTING_PLAN__SOME_DATE_TIME, oldSomeDateTime, someDateTime, !oldSomeDateTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSomeDateTime() {
		Date oldSomeDateTime = someDateTime;
		boolean oldSomeDateTimeESet = someDateTimeESet;
		someDateTime = SOME_DATE_TIME_EDEFAULT;
		someDateTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ToUseDbSynchPackage.FPD_SORTING_PLAN__SOME_DATE_TIME, oldSomeDateTime, SOME_DATE_TIME_EDEFAULT, oldSomeDateTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSomeDateTime() {
		return someDateTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSomeTime() {
		return someTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSomeTime(float newSomeTime) {
		float oldSomeTime = someTime;
		someTime = newSomeTime;
		boolean oldSomeTimeESet = someTimeESet;
		someTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseDbSynchPackage.FPD_SORTING_PLAN__SOME_TIME, oldSomeTime, someTime, !oldSomeTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSomeTime() {
		float oldSomeTime = someTime;
		boolean oldSomeTimeESet = someTimeESet;
		someTime = SOME_TIME_EDEFAULT;
		someTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ToUseDbSynchPackage.FPD_SORTING_PLAN__SOME_TIME, oldSomeTime, SOME_TIME_EDEFAULT, oldSomeTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSomeTime() {
		return someTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUseDbSynchPackage.FPD_SORTING_PLAN__SORTING_PLAN_ID:
				return getSortingPlanID();
			case ToUseDbSynchPackage.FPD_SORTING_PLAN__NAME:
				return getName();
			case ToUseDbSynchPackage.FPD_SORTING_PLAN__VALID_FROM:
				return getValidFrom();
			case ToUseDbSynchPackage.FPD_SORTING_PLAN__VALID_TO:
				return getValidTo();
			case ToUseDbSynchPackage.FPD_SORTING_PLAN__SOME_DATE_TIME:
				return getSomeDateTime();
			case ToUseDbSynchPackage.FPD_SORTING_PLAN__SOME_TIME:
				return getSomeTime();
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
			case ToUseDbSynchPackage.FPD_SORTING_PLAN__SORTING_PLAN_ID:
				setSortingPlanID((String)newValue);
				return;
			case ToUseDbSynchPackage.FPD_SORTING_PLAN__NAME:
				setName((String)newValue);
				return;
			case ToUseDbSynchPackage.FPD_SORTING_PLAN__VALID_FROM:
				setValidFrom((Date)newValue);
				return;
			case ToUseDbSynchPackage.FPD_SORTING_PLAN__VALID_TO:
				setValidTo((Date)newValue);
				return;
			case ToUseDbSynchPackage.FPD_SORTING_PLAN__SOME_DATE_TIME:
				setSomeDateTime((Date)newValue);
				return;
			case ToUseDbSynchPackage.FPD_SORTING_PLAN__SOME_TIME:
				setSomeTime((Float)newValue);
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
			case ToUseDbSynchPackage.FPD_SORTING_PLAN__SORTING_PLAN_ID:
				setSortingPlanID(SORTING_PLAN_ID_EDEFAULT);
				return;
			case ToUseDbSynchPackage.FPD_SORTING_PLAN__NAME:
				unsetName();
				return;
			case ToUseDbSynchPackage.FPD_SORTING_PLAN__VALID_FROM:
				unsetValidFrom();
				return;
			case ToUseDbSynchPackage.FPD_SORTING_PLAN__VALID_TO:
				unsetValidTo();
				return;
			case ToUseDbSynchPackage.FPD_SORTING_PLAN__SOME_DATE_TIME:
				unsetSomeDateTime();
				return;
			case ToUseDbSynchPackage.FPD_SORTING_PLAN__SOME_TIME:
				unsetSomeTime();
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
			case ToUseDbSynchPackage.FPD_SORTING_PLAN__SORTING_PLAN_ID:
				return SORTING_PLAN_ID_EDEFAULT == null ? sortingPlanID != null : !SORTING_PLAN_ID_EDEFAULT.equals(sortingPlanID);
			case ToUseDbSynchPackage.FPD_SORTING_PLAN__NAME:
				return isSetName();
			case ToUseDbSynchPackage.FPD_SORTING_PLAN__VALID_FROM:
				return isSetValidFrom();
			case ToUseDbSynchPackage.FPD_SORTING_PLAN__VALID_TO:
				return isSetValidTo();
			case ToUseDbSynchPackage.FPD_SORTING_PLAN__SOME_DATE_TIME:
				return isSetSomeDateTime();
			case ToUseDbSynchPackage.FPD_SORTING_PLAN__SOME_TIME:
				return isSetSomeTime();
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
		if (nameESet) result.append(name); else result.append("<unset>");
		result.append(", ValidFrom: ");
		if (validFromESet) result.append(validFrom); else result.append("<unset>");
		result.append(", ValidTo: ");
		if (validToESet) result.append(validTo); else result.append("<unset>");
		result.append(", someDateTime: ");
		if (someDateTimeESet) result.append(someDateTime); else result.append("<unset>");
		result.append(", someTime: ");
		if (someTimeESet) result.append(someTime); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FPDSortingPlanImpl
