/**
 */
package com.misc.touse.moplaf.tousedatasetload.impl;

import com.misc.common.moplaf.datasetload.impl.TableGroupImpl;

import com.misc.touse.moplaf.tousedatasetload.MariaDbTestGroupTables;
import com.misc.touse.moplaf.tousedatasetload.MariaDbTestTable;
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
 * An implementation of the model object '<em><b>Maria Db Test Group Tables</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousedatasetload.impl.MariaDbTestGroupTablesImpl#getMariaTables <em>Maria Tables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MariaDbTestGroupTablesImpl extends TableGroupImpl implements MariaDbTestGroupTables {
	/**
	 * The cached value of the '{@link #getMariaTables() <em>Maria Tables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMariaTables()
	 * @generated
	 * @ordered
	 */
	protected EList<MariaDbTestTable> mariaTables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MariaDbTestGroupTablesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TousedatasetloadPackage.Literals.MARIA_DB_TEST_GROUP_TABLES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MariaDbTestTable> getMariaTables() {
		if (mariaTables == null) {
			mariaTables = new EObjectContainmentEList<MariaDbTestTable>(MariaDbTestTable.class, this, TousedatasetloadPackage.MARIA_DB_TEST_GROUP_TABLES__MARIA_TABLES);
		}
		return mariaTables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TousedatasetloadPackage.MARIA_DB_TEST_GROUP_TABLES__MARIA_TABLES:
				return ((InternalEList<?>)getMariaTables()).basicRemove(otherEnd, msgs);
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
			case TousedatasetloadPackage.MARIA_DB_TEST_GROUP_TABLES__MARIA_TABLES:
				return getMariaTables();
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
			case TousedatasetloadPackage.MARIA_DB_TEST_GROUP_TABLES__MARIA_TABLES:
				getMariaTables().clear();
				getMariaTables().addAll((Collection<? extends MariaDbTestTable>)newValue);
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
			case TousedatasetloadPackage.MARIA_DB_TEST_GROUP_TABLES__MARIA_TABLES:
				getMariaTables().clear();
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
			case TousedatasetloadPackage.MARIA_DB_TEST_GROUP_TABLES__MARIA_TABLES:
				return mariaTables != null && !mariaTables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MariaDbTestGroupTablesImpl
