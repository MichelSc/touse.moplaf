/**
 */
package com.misc.touse.moplaf.solver.tousesolverlp.impl;

import com.misc.common.moplaf.solver.GeneratorLpCons;
import com.misc.common.moplaf.solver.GeneratorLpVar;

import com.misc.common.moplaf.solver.impl.GeneratorTupleImpl;

import com.misc.touse.moplaf.solver.tousesolverlp.ToUseSolverLpPackage;
import com.misc.touse.moplaf.solver.tousesolverlp.ToUseTuple;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Use Tuple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolverlp.impl.ToUseTupleImpl#getChildTuples <em>Child Tuples</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolverlp.impl.ToUseTupleImpl#getToUseVars <em>To Use Vars</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolverlp.impl.ToUseTupleImpl#getToUseCons <em>To Use Cons</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToUseTupleImpl extends GeneratorTupleImpl implements ToUseTuple {
	/**
	 * The cached value of the '{@link #getChildTuples() <em>Child Tuples</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildTuples()
	 * @generated
	 * @ordered
	 */
	protected EList<ToUseTuple> childTuples;

	/**
	 * The cached value of the '{@link #getToUseVars() <em>To Use Vars</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToUseVars()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneratorLpVar> toUseVars;

	/**
	 * The cached value of the '{@link #getToUseCons() <em>To Use Cons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToUseCons()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneratorLpCons> toUseCons;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUseTupleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseSolverLpPackage.Literals.TO_USE_TUPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ToUseTuple> getChildTuples() {
		if (childTuples == null) {
			childTuples = new EObjectContainmentEList<ToUseTuple>(ToUseTuple.class, this, ToUseSolverLpPackage.TO_USE_TUPLE__CHILD_TUPLES);
		}
		return childTuples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneratorLpVar> getToUseVars() {
		if (toUseVars == null) {
			toUseVars = new EObjectContainmentEList<GeneratorLpVar>(GeneratorLpVar.class, this, ToUseSolverLpPackage.TO_USE_TUPLE__TO_USE_VARS);
		}
		return toUseVars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneratorLpCons> getToUseCons() {
		if (toUseCons == null) {
			toUseCons = new EObjectContainmentEList<GeneratorLpCons>(GeneratorLpCons.class, this, ToUseSolverLpPackage.TO_USE_TUPLE__TO_USE_CONS);
		}
		return toUseCons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToUseSolverLpPackage.TO_USE_TUPLE__CHILD_TUPLES:
				return ((InternalEList<?>)getChildTuples()).basicRemove(otherEnd, msgs);
			case ToUseSolverLpPackage.TO_USE_TUPLE__TO_USE_VARS:
				return ((InternalEList<?>)getToUseVars()).basicRemove(otherEnd, msgs);
			case ToUseSolverLpPackage.TO_USE_TUPLE__TO_USE_CONS:
				return ((InternalEList<?>)getToUseCons()).basicRemove(otherEnd, msgs);
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
			case ToUseSolverLpPackage.TO_USE_TUPLE__CHILD_TUPLES:
				return getChildTuples();
			case ToUseSolverLpPackage.TO_USE_TUPLE__TO_USE_VARS:
				return getToUseVars();
			case ToUseSolverLpPackage.TO_USE_TUPLE__TO_USE_CONS:
				return getToUseCons();
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
			case ToUseSolverLpPackage.TO_USE_TUPLE__CHILD_TUPLES:
				getChildTuples().clear();
				getChildTuples().addAll((Collection<? extends ToUseTuple>)newValue);
				return;
			case ToUseSolverLpPackage.TO_USE_TUPLE__TO_USE_VARS:
				getToUseVars().clear();
				getToUseVars().addAll((Collection<? extends GeneratorLpVar>)newValue);
				return;
			case ToUseSolverLpPackage.TO_USE_TUPLE__TO_USE_CONS:
				getToUseCons().clear();
				getToUseCons().addAll((Collection<? extends GeneratorLpCons>)newValue);
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
			case ToUseSolverLpPackage.TO_USE_TUPLE__CHILD_TUPLES:
				getChildTuples().clear();
				return;
			case ToUseSolverLpPackage.TO_USE_TUPLE__TO_USE_VARS:
				getToUseVars().clear();
				return;
			case ToUseSolverLpPackage.TO_USE_TUPLE__TO_USE_CONS:
				getToUseCons().clear();
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
			case ToUseSolverLpPackage.TO_USE_TUPLE__CHILD_TUPLES:
				return childTuples != null && !childTuples.isEmpty();
			case ToUseSolverLpPackage.TO_USE_TUPLE__TO_USE_VARS:
				return toUseVars != null && !toUseVars.isEmpty();
			case ToUseSolverLpPackage.TO_USE_TUPLE__TO_USE_CONS:
				return toUseCons != null && !toUseCons.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ToUseTupleImpl
