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

import com.misc.common.moplaf.solver.GeneratorLpGoal;
import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.solver.Solution;
import com.misc.common.moplaf.solver.Solver;
import com.misc.common.moplaf.solver.SolverFactory;
import com.misc.common.moplaf.solver.impl.GeneratorImpl;
import com.misc.touse.moplaf.solver.tousesolver.Item;
import com.misc.touse.moplaf.solver.tousesolver.KnapsackLp;
import com.misc.touse.moplaf.solver.tousesolver.KnapsackSol;
import com.misc.touse.moplaf.solver.tousesolver.LpItem;
import com.misc.touse.moplaf.solver.tousesolver.LpRoot;
import com.misc.touse.moplaf.solver.tousesolver.Scenario;
import com.misc.touse.moplaf.solver.tousesolver.TousesolverFactory;
import com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Knapsack Lp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.impl.KnapsackLpImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.impl.KnapsackLpImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.impl.KnapsackLpImpl#getValue <em>Value</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.impl.KnapsackLpImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.impl.KnapsackLpImpl#getSolver <em>Solver</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KnapsackLpImpl extends GeneratorImpl implements KnapsackLp {
	/**
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected LpRoot root;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected GeneratorLpGoal value;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected GeneratorLpGoal cardinality;

	/**
	 * The cached value of the '{@link #getSolver() <em>Solver</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolver()
	 * @generated
	 * @ordered
	 */
	protected EList<Solver> solver;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KnapsackLpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TousesolverPackage.Literals.KNAPSACK_LP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LpRoot getRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoot(LpRoot newRoot, NotificationChain msgs) {
		LpRoot oldRoot = root;
		root = newRoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TousesolverPackage.KNAPSACK_LP__ROOT, oldRoot, newRoot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(LpRoot newRoot) {
		if (newRoot != root) {
			NotificationChain msgs = null;
			if (root != null)
				msgs = ((InternalEObject)root).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TousesolverPackage.KNAPSACK_LP__ROOT, null, msgs);
			if (newRoot != null)
				msgs = ((InternalEObject)newRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TousesolverPackage.KNAPSACK_LP__ROOT, null, msgs);
			msgs = basicSetRoot(newRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TousesolverPackage.KNAPSACK_LP__ROOT, newRoot, newRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario getScenario() {
		if (eContainerFeatureID() != TousesolverPackage.KNAPSACK_LP__SCENARIO) return null;
		return (Scenario)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScenario(Scenario newScenario, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newScenario, TousesolverPackage.KNAPSACK_LP__SCENARIO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenario(Scenario newScenario) {
		if (newScenario != eInternalContainer() || (eContainerFeatureID() != TousesolverPackage.KNAPSACK_LP__SCENARIO && newScenario != null)) {
			if (EcoreUtil.isAncestor(this, newScenario))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newScenario != null)
				msgs = ((InternalEObject)newScenario).eInverseAdd(this, TousesolverPackage.SCENARIO__LP, Scenario.class, msgs);
			msgs = basicSetScenario(newScenario, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TousesolverPackage.KNAPSACK_LP__SCENARIO, newScenario, newScenario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpGoal getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(GeneratorLpGoal newValue, NotificationChain msgs) {
		GeneratorLpGoal oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TousesolverPackage.KNAPSACK_LP__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(GeneratorLpGoal newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TousesolverPackage.KNAPSACK_LP__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TousesolverPackage.KNAPSACK_LP__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TousesolverPackage.KNAPSACK_LP__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Solver> getSolver() {
		if (solver == null) {
			solver = new EObjectContainmentEList<Solver>(Solver.class, this, TousesolverPackage.KNAPSACK_LP__SOLVER);
		}
		return solver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpGoal getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardinality(GeneratorLpGoal newCardinality, NotificationChain msgs) {
		GeneratorLpGoal oldCardinality = cardinality;
		cardinality = newCardinality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TousesolverPackage.KNAPSACK_LP__CARDINALITY, oldCardinality, newCardinality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(GeneratorLpGoal newCardinality) {
		if (newCardinality != cardinality) {
			NotificationChain msgs = null;
			if (cardinality != null)
				msgs = ((InternalEObject)cardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TousesolverPackage.KNAPSACK_LP__CARDINALITY, null, msgs);
			if (newCardinality != null)
				msgs = ((InternalEObject)newCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TousesolverPackage.KNAPSACK_LP__CARDINALITY, null, msgs);
			msgs = basicSetCardinality(newCardinality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TousesolverPackage.KNAPSACK_LP__CARDINALITY, newCardinality, newCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TousesolverPackage.KNAPSACK_LP__SCENARIO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetScenario((Scenario)otherEnd, msgs);
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
			case TousesolverPackage.KNAPSACK_LP__ROOT:
				return basicSetRoot(null, msgs);
			case TousesolverPackage.KNAPSACK_LP__SCENARIO:
				return basicSetScenario(null, msgs);
			case TousesolverPackage.KNAPSACK_LP__VALUE:
				return basicSetValue(null, msgs);
			case TousesolverPackage.KNAPSACK_LP__CARDINALITY:
				return basicSetCardinality(null, msgs);
			case TousesolverPackage.KNAPSACK_LP__SOLVER:
				return ((InternalEList<?>)getSolver()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case TousesolverPackage.KNAPSACK_LP__SCENARIO:
				return eInternalContainer().eInverseRemove(this, TousesolverPackage.SCENARIO__LP, Scenario.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TousesolverPackage.KNAPSACK_LP__ROOT:
				return getRoot();
			case TousesolverPackage.KNAPSACK_LP__SCENARIO:
				return getScenario();
			case TousesolverPackage.KNAPSACK_LP__VALUE:
				return getValue();
			case TousesolverPackage.KNAPSACK_LP__CARDINALITY:
				return getCardinality();
			case TousesolverPackage.KNAPSACK_LP__SOLVER:
				return getSolver();
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
			case TousesolverPackage.KNAPSACK_LP__ROOT:
				setRoot((LpRoot)newValue);
				return;
			case TousesolverPackage.KNAPSACK_LP__SCENARIO:
				setScenario((Scenario)newValue);
				return;
			case TousesolverPackage.KNAPSACK_LP__VALUE:
				setValue((GeneratorLpGoal)newValue);
				return;
			case TousesolverPackage.KNAPSACK_LP__CARDINALITY:
				setCardinality((GeneratorLpGoal)newValue);
				return;
			case TousesolverPackage.KNAPSACK_LP__SOLVER:
				getSolver().clear();
				getSolver().addAll((Collection<? extends Solver>)newValue);
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
			case TousesolverPackage.KNAPSACK_LP__ROOT:
				setRoot((LpRoot)null);
				return;
			case TousesolverPackage.KNAPSACK_LP__SCENARIO:
				setScenario((Scenario)null);
				return;
			case TousesolverPackage.KNAPSACK_LP__VALUE:
				setValue((GeneratorLpGoal)null);
				return;
			case TousesolverPackage.KNAPSACK_LP__CARDINALITY:
				setCardinality((GeneratorLpGoal)null);
				return;
			case TousesolverPackage.KNAPSACK_LP__SOLVER:
				getSolver().clear();
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
			case TousesolverPackage.KNAPSACK_LP__ROOT:
				return root != null;
			case TousesolverPackage.KNAPSACK_LP__SCENARIO:
				return getScenario() != null;
			case TousesolverPackage.KNAPSACK_LP__VALUE:
				return value != null;
			case TousesolverPackage.KNAPSACK_LP__CARDINALITY:
				return cardinality != null;
			case TousesolverPackage.KNAPSACK_LP__SOLVER:
				return solver != null && !solver.isEmpty();
		}
		return super.eIsSet(featureID);
	}


	@Override
	public void generateRootTuples() {
		LpRoot tupleroot = TousesolverFactory.eINSTANCE.createLpRoot();
		tupleroot.setName("root");
		this.setRoot(tupleroot); // owning
	}

	@Override
	public void generateGoals() {
		this.generateGoalValue();
		this.generateGoalCardinality();
	}

	private void generateGoalValue() {
		GeneratorLpGoal goal = SolverFactory.eINSTANCE.createGeneratorLpGoal();
		goal.setName("value");
		this.setValue(goal); // owning
		LpRoot root = this.getRoot();
		for ( LpItem item : root.getItem()){
			goal.constructTerm(item.getVarInKnapsack(), item.getItem().getValue());
		}
	}

	private void generateGoalCardinality() {
		GeneratorLpGoal goal = SolverFactory.eINSTANCE.createGeneratorLpGoal();
		goal.setName("cardinality");
		this.setCardinality(goal); // owning
		LpRoot root = this.getRoot();
		for ( LpItem item : root.getItem()){
			goal.constructTerm(item.getVarInKnapsack(), 1.0f);
		}
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.solver.impl.GeneratorImpl#acceptSolution(com.misc.common.moplaf.solver.SolutionProvider)
	 */
	@Override
	public void acceptSolution(Solution solution) {
		Scenario scenario = this.getScenario();
		KnapsackSol sol = TousesolverFactory.eINSTANCE.createKnapsackSol();
		scenario.getSol().add(sol);
		sol.setSolver(solution);
		sol.setLp(this);
		float totalvalue = 0.0f;
		float totalweight = 0.0f;
		for ( LpItem lpitem : this.getRoot().getItem()){
			GeneratorLpVar var = lpitem.getVarInKnapsack();
			if ( var.isSolutionOne(solution)){
				Item item = lpitem.getItem();
				sol.getItem().add(item);
				totalvalue += item.getValue();
				totalweight += item.getWeight();
			}
		}
		sol.setTotalValue(totalvalue);
		sol.setTotalWeight(totalweight);
	}


} //KnapsackLpImpl
