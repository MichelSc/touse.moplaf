/*******************************************************************************
 * Copyright (c) 2017 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
/**
 */
package com.misc.touse.moplaf.solver.tousesolver.impl;

import com.misc.common.moplaf.solver.SolutionReader;
import com.misc.touse.moplaf.solver.tousesolver.Item;
import com.misc.touse.moplaf.solver.tousesolver.Knapsack;
import com.misc.touse.moplaf.solver.tousesolver.KnapsackLp;
import com.misc.touse.moplaf.solver.tousesolver.KnapsackSol;
import com.misc.touse.moplaf.solver.tousesolver.Scenario;
import com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.impl.ScenarioImpl#getKnapsack <em>Knapsack</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.impl.ScenarioImpl#getItem <em>Item</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.impl.ScenarioImpl#getLP <em>LP</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.impl.ScenarioImpl#getSol <em>Sol</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.impl.ScenarioImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.impl.ScenarioImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.impl.ScenarioImpl#getSolutionReader <em>Solution Reader</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioImpl extends MinimalEObjectImpl.Container implements Scenario {
	/**
	 * The cached value of the '{@link #getKnapsack() <em>Knapsack</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnapsack()
	 * @generated
	 * @ordered
	 */
	protected Knapsack knapsack;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> item;

	/**
	 * The cached value of the '{@link #getLP() <em>LP</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLP()
	 * @generated
	 * @ordered
	 */
	protected EList<KnapsackLp> lp;

	/**
	 * The cached value of the '{@link #getSol() <em>Sol</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSol()
	 * @generated
	 * @ordered
	 */
	protected EList<KnapsackSol> sol;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected static final String REMARKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected String remarks = REMARKS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSolutionReader() <em>Solution Reader</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutionReader()
	 * @generated
	 * @ordered
	 */
	protected EList<SolutionReader> solutionReader;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TousesolverPackage.Literals.SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Knapsack getKnapsack() {
		if (knapsack != null && knapsack.eIsProxy()) {
			InternalEObject oldKnapsack = (InternalEObject)knapsack;
			knapsack = (Knapsack)eResolveProxy(oldKnapsack);
			if (knapsack != oldKnapsack) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TousesolverPackage.SCENARIO__KNAPSACK, oldKnapsack, knapsack));
			}
		}
		return knapsack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Knapsack basicGetKnapsack() {
		return knapsack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKnapsack(Knapsack newKnapsack) {
		Knapsack oldKnapsack = knapsack;
		knapsack = newKnapsack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TousesolverPackage.SCENARIO__KNAPSACK, oldKnapsack, knapsack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getItem() {
		if (item == null) {
			item = new EObjectResolvingEList<Item>(Item.class, this, TousesolverPackage.SCENARIO__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KnapsackLp> getLP() {
		if (lp == null) {
			lp = new EObjectContainmentWithInverseEList<KnapsackLp>(KnapsackLp.class, this, TousesolverPackage.SCENARIO__LP, TousesolverPackage.KNAPSACK_LP__SCENARIO);
		}
		return lp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KnapsackSol> getSol() {
		if (sol == null) {
			sol = new EObjectContainmentEList<KnapsackSol>(KnapsackSol.class, this, TousesolverPackage.SCENARIO__SOL);
		}
		return sol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TousesolverPackage.SCENARIO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemarks(String newRemarks) {
		String oldRemarks = remarks;
		remarks = newRemarks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TousesolverPackage.SCENARIO__REMARKS, oldRemarks, remarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SolutionReader> getSolutionReader() {
		if (solutionReader == null) {
			solutionReader = new EObjectContainmentEList<SolutionReader>(SolutionReader.class, this, TousesolverPackage.SCENARIO__SOLUTION_READER);
		}
		return solutionReader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TousesolverPackage.SCENARIO__LP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLP()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TousesolverPackage.SCENARIO__LP:
				return ((InternalEList<?>)getLP()).basicRemove(otherEnd, msgs);
			case TousesolverPackage.SCENARIO__SOL:
				return ((InternalEList<?>)getSol()).basicRemove(otherEnd, msgs);
			case TousesolverPackage.SCENARIO__SOLUTION_READER:
				return ((InternalEList<?>)getSolutionReader()).basicRemove(otherEnd, msgs);
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
			case TousesolverPackage.SCENARIO__KNAPSACK:
				if (resolve) return getKnapsack();
				return basicGetKnapsack();
			case TousesolverPackage.SCENARIO__ITEM:
				return getItem();
			case TousesolverPackage.SCENARIO__LP:
				return getLP();
			case TousesolverPackage.SCENARIO__SOL:
				return getSol();
			case TousesolverPackage.SCENARIO__NAME:
				return getName();
			case TousesolverPackage.SCENARIO__REMARKS:
				return getRemarks();
			case TousesolverPackage.SCENARIO__SOLUTION_READER:
				return getSolutionReader();
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
			case TousesolverPackage.SCENARIO__KNAPSACK:
				setKnapsack((Knapsack)newValue);
				return;
			case TousesolverPackage.SCENARIO__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends Item>)newValue);
				return;
			case TousesolverPackage.SCENARIO__LP:
				getLP().clear();
				getLP().addAll((Collection<? extends KnapsackLp>)newValue);
				return;
			case TousesolverPackage.SCENARIO__SOL:
				getSol().clear();
				getSol().addAll((Collection<? extends KnapsackSol>)newValue);
				return;
			case TousesolverPackage.SCENARIO__NAME:
				setName((String)newValue);
				return;
			case TousesolverPackage.SCENARIO__REMARKS:
				setRemarks((String)newValue);
				return;
			case TousesolverPackage.SCENARIO__SOLUTION_READER:
				getSolutionReader().clear();
				getSolutionReader().addAll((Collection<? extends SolutionReader>)newValue);
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
			case TousesolverPackage.SCENARIO__KNAPSACK:
				setKnapsack((Knapsack)null);
				return;
			case TousesolverPackage.SCENARIO__ITEM:
				getItem().clear();
				return;
			case TousesolverPackage.SCENARIO__LP:
				getLP().clear();
				return;
			case TousesolverPackage.SCENARIO__SOL:
				getSol().clear();
				return;
			case TousesolverPackage.SCENARIO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TousesolverPackage.SCENARIO__REMARKS:
				setRemarks(REMARKS_EDEFAULT);
				return;
			case TousesolverPackage.SCENARIO__SOLUTION_READER:
				getSolutionReader().clear();
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
			case TousesolverPackage.SCENARIO__KNAPSACK:
				return knapsack != null;
			case TousesolverPackage.SCENARIO__ITEM:
				return item != null && !item.isEmpty();
			case TousesolverPackage.SCENARIO__LP:
				return lp != null && !lp.isEmpty();
			case TousesolverPackage.SCENARIO__SOL:
				return sol != null && !sol.isEmpty();
			case TousesolverPackage.SCENARIO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TousesolverPackage.SCENARIO__REMARKS:
				return REMARKS_EDEFAULT == null ? remarks != null : !REMARKS_EDEFAULT.equals(remarks);
			case TousesolverPackage.SCENARIO__SOLUTION_READER:
				return solutionReader != null && !solutionReader.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(", Remarks: ");
		result.append(remarks);
		result.append(')');
		return result.toString();
	}

} //ScenarioImpl
