/**
 */
package com.misc.touse.moplaf.tousedatasetload.impl;

import com.misc.common.moplaf.DatasetLoadMariaDb.impl.DatasetLoadJdbcMariaDbImpl;

import com.misc.touse.moplaf.tousedatasetload.MariaDbTestDatabase;
import com.misc.touse.moplaf.tousedatasetload.MariaDbTestGroupTables;
import com.misc.touse.moplaf.tousedatasetload.TousedatasetloadPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Maria Db Test Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousedatasetload.impl.MariaDbTestDatabaseImpl#getTableSets <em>Table Sets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MariaDbTestDatabaseImpl extends DatasetLoadJdbcMariaDbImpl implements MariaDbTestDatabase {
	/**
	 * The cached value of the '{@link #getTableSets() <em>Table Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableSets()
	 * @generated
	 * @ordered
	 */
	protected EList<MariaDbTestGroupTables> tableSets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MariaDbTestDatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TousedatasetloadPackage.Literals.MARIA_DB_TEST_DATABASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MariaDbTestGroupTables> getTableSets() {
		if (tableSets == null) {
			tableSets = new EObjectContainmentEList<MariaDbTestGroupTables>(MariaDbTestGroupTables.class, this, TousedatasetloadPackage.MARIA_DB_TEST_DATABASE__TABLE_SETS);
		}
		return tableSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TousedatasetloadPackage.MARIA_DB_TEST_DATABASE__TABLE_SETS:
				return ((InternalEList<?>)getTableSets()).basicRemove(otherEnd, msgs);
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
			case TousedatasetloadPackage.MARIA_DB_TEST_DATABASE__TABLE_SETS:
				return getTableSets();
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
			case TousedatasetloadPackage.MARIA_DB_TEST_DATABASE__TABLE_SETS:
				getTableSets().clear();
				getTableSets().addAll((Collection<? extends MariaDbTestGroupTables>)newValue);
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
			case TousedatasetloadPackage.MARIA_DB_TEST_DATABASE__TABLE_SETS:
				getTableSets().clear();
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
			case TousedatasetloadPackage.MARIA_DB_TEST_DATABASE__TABLE_SETS:
				return tableSets != null && !tableSets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MariaDbTestDatabaseImpl
