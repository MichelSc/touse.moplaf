/**
 */
package tousesolvercp.impl;

import com.misc.common.moplaf.solver.impl.GeneratorImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import solverjacop.SolverJacop;

import tousesolvercp.ToUseSolverCpGenerator;
import tousesolvercp.ToUseSolverCpTuple;
import tousesolvercp.TousesolvercpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Use Solver Cp Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tousesolvercp.impl.ToUseSolverCpGeneratorImpl#getSolver <em>Solver</em>}</li>
 *   <li>{@link tousesolvercp.impl.ToUseSolverCpGeneratorImpl#getToUseTuples <em>To Use Tuples</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToUseSolverCpGeneratorImpl extends GeneratorImpl implements ToUseSolverCpGenerator {
	/**
	 * The cached value of the '{@link #getSolver() <em>Solver</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolver()
	 * @generated
	 * @ordered
	 */
	protected EList<SolverJacop> solver;

	/**
	 * The cached value of the '{@link #getToUseTuples() <em>To Use Tuples</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToUseTuples()
	 * @generated
	 * @ordered
	 */
	protected EList<ToUseSolverCpTuple> toUseTuples;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUseSolverCpGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TousesolvercpPackage.Literals.TO_USE_SOLVER_CP_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SolverJacop> getSolver() {
		if (solver == null) {
			solver = new EObjectContainmentEList<SolverJacop>(SolverJacop.class, this, TousesolvercpPackage.TO_USE_SOLVER_CP_GENERATOR__SOLVER);
		}
		return solver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ToUseSolverCpTuple> getToUseTuples() {
		if (toUseTuples == null) {
			toUseTuples = new EObjectContainmentEList<ToUseSolverCpTuple>(ToUseSolverCpTuple.class, this, TousesolvercpPackage.TO_USE_SOLVER_CP_GENERATOR__TO_USE_TUPLES);
		}
		return toUseTuples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TousesolvercpPackage.TO_USE_SOLVER_CP_GENERATOR__SOLVER:
				return ((InternalEList<?>)getSolver()).basicRemove(otherEnd, msgs);
			case TousesolvercpPackage.TO_USE_SOLVER_CP_GENERATOR__TO_USE_TUPLES:
				return ((InternalEList<?>)getToUseTuples()).basicRemove(otherEnd, msgs);
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
			case TousesolvercpPackage.TO_USE_SOLVER_CP_GENERATOR__SOLVER:
				return getSolver();
			case TousesolvercpPackage.TO_USE_SOLVER_CP_GENERATOR__TO_USE_TUPLES:
				return getToUseTuples();
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
			case TousesolvercpPackage.TO_USE_SOLVER_CP_GENERATOR__SOLVER:
				getSolver().clear();
				getSolver().addAll((Collection<? extends SolverJacop>)newValue);
				return;
			case TousesolvercpPackage.TO_USE_SOLVER_CP_GENERATOR__TO_USE_TUPLES:
				getToUseTuples().clear();
				getToUseTuples().addAll((Collection<? extends ToUseSolverCpTuple>)newValue);
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
			case TousesolvercpPackage.TO_USE_SOLVER_CP_GENERATOR__SOLVER:
				getSolver().clear();
				return;
			case TousesolvercpPackage.TO_USE_SOLVER_CP_GENERATOR__TO_USE_TUPLES:
				getToUseTuples().clear();
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
			case TousesolvercpPackage.TO_USE_SOLVER_CP_GENERATOR__SOLVER:
				return solver != null && !solver.isEmpty();
			case TousesolvercpPackage.TO_USE_SOLVER_CP_GENERATOR__TO_USE_TUPLES:
				return toUseTuples != null && !toUseTuples.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ToUseSolverCpGeneratorImpl
