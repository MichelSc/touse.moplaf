/**
 */
package com.misc.touse.moplaf.spreadsheet.tousespreadsheet.impl;

import com.misc.common.moplaf.spreadsheet.Spreadsheet;
import com.misc.touse.moplaf.spreadsheet.tousespreadsheet.Domain;
import com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseSpreadsheetPackage;

import com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseTable;
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
 *   <li>{@link com.misc.touse.moplaf.spreadsheet.tousespreadsheet.impl.DomainImpl#getSpreadsheets <em>Spreadsheets</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.spreadsheet.tousespreadsheet.impl.DomainImpl#getTables <em>Tables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainImpl extends MinimalEObjectImpl.Container implements Domain {
	/**
	 * The cached value of the '{@link #getSpreadsheets() <em>Spreadsheets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpreadsheets()
	 * @generated
	 * @ordered
	 */
	protected EList<Spreadsheet> spreadsheets;

	/**
	 * The cached value of the '{@link #getTables() <em>Tables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTables()
	 * @generated
	 * @ordered
	 */
	protected EList<ToUseTable> tables;

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
	public EList<Spreadsheet> getSpreadsheets() {
		if (spreadsheets == null) {
			spreadsheets = new EObjectContainmentEList<Spreadsheet>(Spreadsheet.class, this, ToUseSpreadsheetPackage.DOMAIN__SPREADSHEETS);
		}
		return spreadsheets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ToUseTable> getTables() {
		if (tables == null) {
			tables = new EObjectContainmentEList<ToUseTable>(ToUseTable.class, this, ToUseSpreadsheetPackage.DOMAIN__TABLES);
		}
		return tables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToUseSpreadsheetPackage.DOMAIN__SPREADSHEETS:
				return ((InternalEList<?>)getSpreadsheets()).basicRemove(otherEnd, msgs);
			case ToUseSpreadsheetPackage.DOMAIN__TABLES:
				return ((InternalEList<?>)getTables()).basicRemove(otherEnd, msgs);
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
			case ToUseSpreadsheetPackage.DOMAIN__SPREADSHEETS:
				return getSpreadsheets();
			case ToUseSpreadsheetPackage.DOMAIN__TABLES:
				return getTables();
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
			case ToUseSpreadsheetPackage.DOMAIN__SPREADSHEETS:
				getSpreadsheets().clear();
				getSpreadsheets().addAll((Collection<? extends Spreadsheet>)newValue);
				return;
			case ToUseSpreadsheetPackage.DOMAIN__TABLES:
				getTables().clear();
				getTables().addAll((Collection<? extends ToUseTable>)newValue);
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
			case ToUseSpreadsheetPackage.DOMAIN__SPREADSHEETS:
				getSpreadsheets().clear();
				return;
			case ToUseSpreadsheetPackage.DOMAIN__TABLES:
				getTables().clear();
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
			case ToUseSpreadsheetPackage.DOMAIN__SPREADSHEETS:
				return spreadsheets != null && !spreadsheets.isEmpty();
			case ToUseSpreadsheetPackage.DOMAIN__TABLES:
				return tables != null && !tables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainImpl
