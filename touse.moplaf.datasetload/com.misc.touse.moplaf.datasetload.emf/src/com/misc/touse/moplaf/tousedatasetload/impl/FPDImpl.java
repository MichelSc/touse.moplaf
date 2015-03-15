/**
 */
package com.misc.touse.moplaf.tousedatasetload.impl;

import com.misc.common.moplaf.DatasetLoadDerby.impl.DataSourceJdbDerbyEmbeddedImpl;
import com.misc.touse.moplaf.tousedatasetload.FPD;
import com.misc.touse.moplaf.tousedatasetload.FPDGroupSortingPlan;
import com.misc.touse.moplaf.tousedatasetload.TousedatasetloadPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FPD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousedatasetload.impl.FPDImpl#getSortingPlansSet <em>Sorting Plans Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FPDImpl extends DataSourceJdbDerbyEmbeddedImpl implements FPD {
	/**
	 * The cached value of the '{@link #getSortingPlansSet() <em>Sorting Plans Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingPlansSet()
	 * @generated
	 * @ordered
	 */
	protected FPDGroupSortingPlan sortingPlansSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FPDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TousedatasetloadPackage.Literals.FPD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPDGroupSortingPlan getSortingPlansSet() {
		return sortingPlansSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSortingPlansSet(FPDGroupSortingPlan newSortingPlansSet, NotificationChain msgs) {
		FPDGroupSortingPlan oldSortingPlansSet = sortingPlansSet;
		sortingPlansSet = newSortingPlansSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TousedatasetloadPackage.FPD__SORTING_PLANS_SET, oldSortingPlansSet, newSortingPlansSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortingPlansSet(FPDGroupSortingPlan newSortingPlansSet) {
		if (newSortingPlansSet != sortingPlansSet) {
			NotificationChain msgs = null;
			if (sortingPlansSet != null)
				msgs = ((InternalEObject)sortingPlansSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TousedatasetloadPackage.FPD__SORTING_PLANS_SET, null, msgs);
			if (newSortingPlansSet != null)
				msgs = ((InternalEObject)newSortingPlansSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TousedatasetloadPackage.FPD__SORTING_PLANS_SET, null, msgs);
			msgs = basicSetSortingPlansSet(newSortingPlansSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TousedatasetloadPackage.FPD__SORTING_PLANS_SET, newSortingPlansSet, newSortingPlansSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TousedatasetloadPackage.FPD__SORTING_PLANS_SET:
				return basicSetSortingPlansSet(null, msgs);
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
			case TousedatasetloadPackage.FPD__SORTING_PLANS_SET:
				return getSortingPlansSet();
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
			case TousedatasetloadPackage.FPD__SORTING_PLANS_SET:
				setSortingPlansSet((FPDGroupSortingPlan)newValue);
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
			case TousedatasetloadPackage.FPD__SORTING_PLANS_SET:
				setSortingPlansSet((FPDGroupSortingPlan)null);
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
			case TousedatasetloadPackage.FPD__SORTING_PLANS_SET:
				return sortingPlansSet != null;
		}
		return super.eIsSet(featureID);
	}

} //FPDImpl
