/**
 */
package com.misc.touse.moplaf.spreadsheet.tousespreadsheet.impl;

import com.misc.common.moplaf.spreadsheet.spreadsheetpoi.SpreadsheetPOI;

import com.misc.touse.moplaf.spreadsheet.tousespreadsheet.Domain;
import com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseSpreadsheetPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.spreadsheet.tousespreadsheet.impl.DomainImpl#getSpreadsheetsPOI <em>Spreadsheets POI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainImpl extends MinimalEObjectImpl.Container implements Domain {
	/**
	 * The cached value of the '{@link #getSpreadsheetsPOI() <em>Spreadsheets POI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpreadsheetsPOI()
	 * @generated
	 * @ordered
	 */
	protected SpreadsheetPOI spreadsheetsPOI;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseSpreadsheetPackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetPOI getSpreadsheetsPOI() {
		return spreadsheetsPOI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpreadsheetsPOI(SpreadsheetPOI newSpreadsheetsPOI, NotificationChain msgs) {
		SpreadsheetPOI oldSpreadsheetsPOI = spreadsheetsPOI;
		spreadsheetsPOI = newSpreadsheetsPOI;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToUseSpreadsheetPackage.DOMAIN__SPREADSHEETS_POI, oldSpreadsheetsPOI, newSpreadsheetsPOI);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpreadsheetsPOI(SpreadsheetPOI newSpreadsheetsPOI) {
		if (newSpreadsheetsPOI != spreadsheetsPOI) {
			NotificationChain msgs = null;
			if (spreadsheetsPOI != null)
				msgs = ((InternalEObject)spreadsheetsPOI).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToUseSpreadsheetPackage.DOMAIN__SPREADSHEETS_POI, null, msgs);
			if (newSpreadsheetsPOI != null)
				msgs = ((InternalEObject)newSpreadsheetsPOI).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToUseSpreadsheetPackage.DOMAIN__SPREADSHEETS_POI, null, msgs);
			msgs = basicSetSpreadsheetsPOI(newSpreadsheetsPOI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSpreadsheetPackage.DOMAIN__SPREADSHEETS_POI, newSpreadsheetsPOI, newSpreadsheetsPOI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToUseSpreadsheetPackage.DOMAIN__SPREADSHEETS_POI:
				return basicSetSpreadsheetsPOI(null, msgs);
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
			case ToUseSpreadsheetPackage.DOMAIN__SPREADSHEETS_POI:
				return getSpreadsheetsPOI();
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
			case ToUseSpreadsheetPackage.DOMAIN__SPREADSHEETS_POI:
				setSpreadsheetsPOI((SpreadsheetPOI)newValue);
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
			case ToUseSpreadsheetPackage.DOMAIN__SPREADSHEETS_POI:
				setSpreadsheetsPOI((SpreadsheetPOI)null);
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
			case ToUseSpreadsheetPackage.DOMAIN__SPREADSHEETS_POI:
				return spreadsheetsPOI != null;
		}
		return super.eIsSet(featureID);
	}

} //DomainImpl
