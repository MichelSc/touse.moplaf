/**
 */
package com.misc.touse.moplaf.spreadsheet.tousespreadsheet.impl;

import com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV;
import com.misc.common.moplaf.spreadsheet.spreadsheetpoi.SpreadsheetPOI;

import com.misc.touse.moplaf.spreadsheet.tousespreadsheet.Domain;
import com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseSpreadsheetPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.spreadsheet.tousespreadsheet.impl.DomainImpl#getSpreadsheetsPOI <em>Spreadsheets POI</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.spreadsheet.tousespreadsheet.impl.DomainImpl#getSpreadsheetsCSV <em>Spreadsheets CSV</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainImpl extends MinimalEObjectImpl.Container implements Domain {
	/**
	 * The cached value of the '{@link #getSpreadsheetsPOI() <em>Spreadsheets POI</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpreadsheetsPOI()
	 * @generated
	 * @ordered
	 */
	protected EList<SpreadsheetPOI> spreadsheetsPOI;

	/**
	 * The cached value of the '{@link #getSpreadsheetsCSV() <em>Spreadsheets CSV</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpreadsheetsCSV()
	 * @generated
	 * @ordered
	 */
	protected EList<SpreadsheetCSV> spreadsheetsCSV;

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
	public EList<SpreadsheetPOI> getSpreadsheetsPOI() {
		if (spreadsheetsPOI == null) {
			spreadsheetsPOI = new EObjectContainmentEList<SpreadsheetPOI>(SpreadsheetPOI.class, this, ToUseSpreadsheetPackage.DOMAIN__SPREADSHEETS_POI);
		}
		return spreadsheetsPOI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpreadsheetCSV> getSpreadsheetsCSV() {
		if (spreadsheetsCSV == null) {
			spreadsheetsCSV = new EObjectContainmentEList<SpreadsheetCSV>(SpreadsheetCSV.class, this, ToUseSpreadsheetPackage.DOMAIN__SPREADSHEETS_CSV);
		}
		return spreadsheetsCSV;
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
				return ((InternalEList<?>)getSpreadsheetsPOI()).basicRemove(otherEnd, msgs);
			case ToUseSpreadsheetPackage.DOMAIN__SPREADSHEETS_CSV:
				return ((InternalEList<?>)getSpreadsheetsCSV()).basicRemove(otherEnd, msgs);
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
			case ToUseSpreadsheetPackage.DOMAIN__SPREADSHEETS_CSV:
				return getSpreadsheetsCSV();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ToUseSpreadsheetPackage.DOMAIN__SPREADSHEETS_POI:
				getSpreadsheetsPOI().clear();
				getSpreadsheetsPOI().addAll((Collection<? extends SpreadsheetPOI>)newValue);
				return;
			case ToUseSpreadsheetPackage.DOMAIN__SPREADSHEETS_CSV:
				getSpreadsheetsCSV().clear();
				getSpreadsheetsCSV().addAll((Collection<? extends SpreadsheetCSV>)newValue);
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
				getSpreadsheetsPOI().clear();
				return;
			case ToUseSpreadsheetPackage.DOMAIN__SPREADSHEETS_CSV:
				getSpreadsheetsCSV().clear();
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
				return spreadsheetsPOI != null && !spreadsheetsPOI.isEmpty();
			case ToUseSpreadsheetPackage.DOMAIN__SPREADSHEETS_CSV:
				return spreadsheetsCSV != null && !spreadsheetsCSV.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainImpl
