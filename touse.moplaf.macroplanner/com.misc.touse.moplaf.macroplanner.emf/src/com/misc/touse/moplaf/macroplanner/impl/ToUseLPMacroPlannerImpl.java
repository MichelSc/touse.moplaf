/**
 */
package com.misc.touse.moplaf.macroplanner.impl;

import com.misc.common.moplaf.macroplanner.solver.impl.LPMacroPlannerImpl;

import com.misc.common.moplaf.solver.Solver;
import com.misc.touse.moplaf.macroplanner.ToUseLPMacroPlanner;
import com.misc.touse.moplaf.macroplanner.ToUseMacroPlannerPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Use LP Macro Planner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.macroplanner.impl.ToUseLPMacroPlannerImpl#getSolvers <em>Solvers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToUseLPMacroPlannerImpl extends LPMacroPlannerImpl implements ToUseLPMacroPlanner {
	/**
	 * The cached value of the '{@link #getSolvers() <em>Solvers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolvers()
	 * @generated
	 * @ordered
	 */
	protected EList<Solver> solvers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUseLPMacroPlannerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseMacroPlannerPackage.Literals.TO_USE_LP_MACRO_PLANNER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Solver> getSolvers() {
		if (solvers == null) {
			solvers = new EObjectContainmentEList<Solver>(Solver.class, this, ToUseMacroPlannerPackage.TO_USE_LP_MACRO_PLANNER__SOLVERS);
		}
		return solvers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToUseMacroPlannerPackage.TO_USE_LP_MACRO_PLANNER__SOLVERS:
				return ((InternalEList<?>)getSolvers()).basicRemove(otherEnd, msgs);
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
			case ToUseMacroPlannerPackage.TO_USE_LP_MACRO_PLANNER__SOLVERS:
				return getSolvers();
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
			case ToUseMacroPlannerPackage.TO_USE_LP_MACRO_PLANNER__SOLVERS:
				getSolvers().clear();
				getSolvers().addAll((Collection<? extends Solver>)newValue);
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
			case ToUseMacroPlannerPackage.TO_USE_LP_MACRO_PLANNER__SOLVERS:
				getSolvers().clear();
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
			case ToUseMacroPlannerPackage.TO_USE_LP_MACRO_PLANNER__SOLVERS:
				return solvers != null && !solvers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ToUseLPMacroPlannerImpl
