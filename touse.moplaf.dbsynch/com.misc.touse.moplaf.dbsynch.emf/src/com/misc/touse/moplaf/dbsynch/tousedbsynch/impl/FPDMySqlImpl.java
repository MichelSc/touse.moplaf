/**
 */
package com.misc.touse.moplaf.dbsynch.tousedbsynch.impl;

import com.misc.common.moplaf.dbsynch.dbsynchmysql.impl.DataSourceJdbcMySqlImpl;
import com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDGroupSortingPlan;
import com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDMySql;
import com.misc.touse.moplaf.dbsynch.tousedbsynch.ToUseDbSynchPackage;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FPD My Sql</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDMySqlImpl#getSortingPlansSet <em>Sorting Plans Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FPDMySqlImpl extends DataSourceJdbcMySqlImpl implements FPDMySql {
	/**
	 * The cached value of the '{@link #getSortingPlansSet() <em>Sorting Plans Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingPlansSet()
	 * @generated
	 * @ordered
	 */
	protected EList<FPDGroupSortingPlan> sortingPlansSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FPDMySqlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseDbSynchPackage.Literals.FPD_MY_SQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FPDGroupSortingPlan> getSortingPlansSet() {
		if (sortingPlansSet == null) {
			sortingPlansSet = new EObjectContainmentEList<FPDGroupSortingPlan>(FPDGroupSortingPlan.class, this, ToUseDbSynchPackage.FPD_MY_SQL__SORTING_PLANS_SET);
		}
		return sortingPlansSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToUseDbSynchPackage.FPD_MY_SQL__SORTING_PLANS_SET:
				return ((InternalEList<?>)getSortingPlansSet()).basicRemove(otherEnd, msgs);
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
			case ToUseDbSynchPackage.FPD_MY_SQL__SORTING_PLANS_SET:
				return getSortingPlansSet();
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
			case ToUseDbSynchPackage.FPD_MY_SQL__SORTING_PLANS_SET:
				getSortingPlansSet().clear();
				getSortingPlansSet().addAll((Collection<? extends FPDGroupSortingPlan>)newValue);
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
			case ToUseDbSynchPackage.FPD_MY_SQL__SORTING_PLANS_SET:
				getSortingPlansSet().clear();
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
			case ToUseDbSynchPackage.FPD_MY_SQL__SORTING_PLANS_SET:
				return sortingPlansSet != null && !sortingPlansSet.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FPDMySqlImpl
