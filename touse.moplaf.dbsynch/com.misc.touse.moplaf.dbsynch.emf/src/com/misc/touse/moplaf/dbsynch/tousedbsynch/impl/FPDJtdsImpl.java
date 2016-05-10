/**
 */
package com.misc.touse.moplaf.dbsynch.tousedbsynch.impl;

import com.misc.common.moplaf.dbsynch.dbsynchjtds.impl.DataSourceJdbcJtdsImpl;

import com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDGroupSortingPlan;
import com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDJtds;
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
 * An implementation of the model object '<em><b>FPD Jtds</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDJtdsImpl#getSortingPlansSet <em>Sorting Plans Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FPDJtdsImpl extends DataSourceJdbcJtdsImpl implements FPDJtds {
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
	protected FPDJtdsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseDbSynchPackage.Literals.FPD_JTDS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FPDGroupSortingPlan> getSortingPlansSet() {
		if (sortingPlansSet == null) {
			sortingPlansSet = new EObjectContainmentEList<FPDGroupSortingPlan>(FPDGroupSortingPlan.class, this, ToUseDbSynchPackage.FPD_JTDS__SORTING_PLANS_SET);
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
			case ToUseDbSynchPackage.FPD_JTDS__SORTING_PLANS_SET:
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
			case ToUseDbSynchPackage.FPD_JTDS__SORTING_PLANS_SET:
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
			case ToUseDbSynchPackage.FPD_JTDS__SORTING_PLANS_SET:
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
			case ToUseDbSynchPackage.FPD_JTDS__SORTING_PLANS_SET:
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
			case ToUseDbSynchPackage.FPD_JTDS__SORTING_PLANS_SET:
				return sortingPlansSet != null && !sortingPlansSet.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FPDJtdsImpl
