/**
 */
package com.misc.touse.moplaf.solver.tousesolverlp.impl;

import com.misc.common.moplaf.solver.Solver;

import com.misc.common.moplaf.solver.impl.GeneratorImpl;

import com.misc.touse.moplaf.solver.tousesolverlp.ToUseGenerator;
import com.misc.touse.moplaf.solver.tousesolverlp.ToUseSolverLpPackage;
import com.misc.touse.moplaf.solver.tousesolverlp.ToUseTuple;

import java.util.Collection;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Use Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolverlp.impl.ToUseGeneratorImpl#getRootTuples <em>Root Tuples</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolverlp.impl.ToUseGeneratorImpl#getSolvers <em>Solvers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToUseGeneratorImpl extends GeneratorImpl implements ToUseGenerator {
	/**
	 * The cached value of the '{@link #getRootTuples() <em>Root Tuples</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootTuples()
	 * @generated
	 * @ordered
	 */
	protected EList<ToUseTuple> rootTuples;

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
	protected ToUseGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseSolverLpPackage.Literals.TO_USE_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ToUseTuple> getRootTuples() {
		if (rootTuples == null) {
			rootTuples = new EObjectContainmentEList<ToUseTuple>(ToUseTuple.class, this, ToUseSolverLpPackage.TO_USE_GENERATOR__ROOT_TUPLES);
		}
		return rootTuples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Solver> getSolvers() {
		if (solvers == null) {
			solvers = new EObjectContainmentEList<Solver>(Solver.class, this, ToUseSolverLpPackage.TO_USE_GENERATOR__SOLVERS);
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
			case ToUseSolverLpPackage.TO_USE_GENERATOR__ROOT_TUPLES:
				return ((InternalEList<?>)getRootTuples()).basicRemove(otherEnd, msgs);
			case ToUseSolverLpPackage.TO_USE_GENERATOR__SOLVERS:
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
			case ToUseSolverLpPackage.TO_USE_GENERATOR__ROOT_TUPLES:
				return getRootTuples();
			case ToUseSolverLpPackage.TO_USE_GENERATOR__SOLVERS:
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
			case ToUseSolverLpPackage.TO_USE_GENERATOR__ROOT_TUPLES:
				getRootTuples().clear();
				getRootTuples().addAll((Collection<? extends ToUseTuple>)newValue);
				return;
			case ToUseSolverLpPackage.TO_USE_GENERATOR__SOLVERS:
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
			case ToUseSolverLpPackage.TO_USE_GENERATOR__ROOT_TUPLES:
				getRootTuples().clear();
				return;
			case ToUseSolverLpPackage.TO_USE_GENERATOR__SOLVERS:
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
			case ToUseSolverLpPackage.TO_USE_GENERATOR__ROOT_TUPLES:
				return rootTuples != null && !rootTuples.isEmpty();
			case ToUseSolverLpPackage.TO_USE_GENERATOR__SOLVERS:
				return solvers != null && !solvers.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	/**
	 */
	@Override
	public void generate() {
		CommonPlugin.INSTANCE.log("ToUseGenerator.generate: called");
		this.generateTuples();
		CommonPlugin.INSTANCE.log("TouseGenerator.generate: tuples generated");
		this.generateVars();
		CommonPlugin.INSTANCE.log("ToUseGenerator.generate: vars generated");
		this.generateCons();
		CommonPlugin.INSTANCE.log("ToUseGenerator.generate: cons generated");
	}
} //ToUseGeneratorImpl
