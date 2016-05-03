/**
 */
package com.misc.touse.moplaf.dbsynch.tousedbsynch.impl;

import com.misc.common.moplaf.dbsynch.impl.TableImpl;

import com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlanInput;
import com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlanInputs;
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
 * An implementation of the model object '<em><b>FPD Sorting Plan Inputs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDSortingPlanInputsImpl#getSortingPlanInputs <em>Sorting Plan Inputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FPDSortingPlanInputsImpl extends TableImpl implements FPDSortingPlanInputs {
	/**
	 * The cached value of the '{@link #getSortingPlanInputs() <em>Sorting Plan Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingPlanInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<FPDSortingPlanInput> sortingPlanInputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FPDSortingPlanInputsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseDbSynchPackage.Literals.FPD_SORTING_PLAN_INPUTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FPDSortingPlanInput> getSortingPlanInputs() {
		if (sortingPlanInputs == null) {
			sortingPlanInputs = new EObjectContainmentEList<FPDSortingPlanInput>(FPDSortingPlanInput.class, this, ToUseDbSynchPackage.FPD_SORTING_PLAN_INPUTS__SORTING_PLAN_INPUTS);
		}
		return sortingPlanInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToUseDbSynchPackage.FPD_SORTING_PLAN_INPUTS__SORTING_PLAN_INPUTS:
				return ((InternalEList<?>)getSortingPlanInputs()).basicRemove(otherEnd, msgs);
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
			case ToUseDbSynchPackage.FPD_SORTING_PLAN_INPUTS__SORTING_PLAN_INPUTS:
				return getSortingPlanInputs();
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
			case ToUseDbSynchPackage.FPD_SORTING_PLAN_INPUTS__SORTING_PLAN_INPUTS:
				getSortingPlanInputs().clear();
				getSortingPlanInputs().addAll((Collection<? extends FPDSortingPlanInput>)newValue);
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
			case ToUseDbSynchPackage.FPD_SORTING_PLAN_INPUTS__SORTING_PLAN_INPUTS:
				getSortingPlanInputs().clear();
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
			case ToUseDbSynchPackage.FPD_SORTING_PLAN_INPUTS__SORTING_PLAN_INPUTS:
				return sortingPlanInputs != null && !sortingPlanInputs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FPDSortingPlanInputsImpl
