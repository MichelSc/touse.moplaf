/**
 */
package tousesolvercp.impl;

import com.misc.common.moplaf.solver.GeneratorCpLinear;
import com.misc.common.moplaf.solver.GeneratorCpLogical;
import com.misc.common.moplaf.solver.GeneratorCpVarAtomic;
import com.misc.common.moplaf.solver.impl.GeneratorTupleImpl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import tousesolvercp.ToUseSolverCpTuple;
import tousesolvercp.TousesolvercpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Use Solver Cp Tuple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tousesolvercp.impl.ToUseSolverCpTupleImpl#getToUseLinears <em>To Use Linears</em>}</li>
 *   <li>{@link tousesolvercp.impl.ToUseSolverCpTupleImpl#getToUseVars <em>To Use Vars</em>}</li>
 *   <li>{@link tousesolvercp.impl.ToUseSolverCpTupleImpl#getToUseLogicals <em>To Use Logicals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToUseSolverCpTupleImpl extends GeneratorTupleImpl implements ToUseSolverCpTuple {
	/**
	 * The cached value of the '{@link #getToUseLinears() <em>To Use Linears</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToUseLinears()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneratorCpLinear> toUseLinears;
	/**
	 * The cached value of the '{@link #getToUseVars() <em>To Use Vars</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToUseVars()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneratorCpVarAtomic> toUseVars;

	/**
	 * The cached value of the '{@link #getToUseLogicals() <em>To Use Logicals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToUseLogicals()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneratorCpLogical> toUseLogicals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUseSolverCpTupleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TousesolvercpPackage.Literals.TO_USE_SOLVER_CP_TUPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneratorCpLinear> getToUseLinears() {
		if (toUseLinears == null) {
			toUseLinears = new EObjectContainmentEList<GeneratorCpLinear>(GeneratorCpLinear.class, this, TousesolvercpPackage.TO_USE_SOLVER_CP_TUPLE__TO_USE_LINEARS);
		}
		return toUseLinears;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneratorCpVarAtomic> getToUseVars() {
		if (toUseVars == null) {
			toUseVars = new EObjectContainmentEList<GeneratorCpVarAtomic>(GeneratorCpVarAtomic.class, this, TousesolvercpPackage.TO_USE_SOLVER_CP_TUPLE__TO_USE_VARS);
		}
		return toUseVars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneratorCpLogical> getToUseLogicals() {
		if (toUseLogicals == null) {
			toUseLogicals = new EObjectContainmentEList<GeneratorCpLogical>(GeneratorCpLogical.class, this, TousesolvercpPackage.TO_USE_SOLVER_CP_TUPLE__TO_USE_LOGICALS);
		}
		return toUseLogicals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TousesolvercpPackage.TO_USE_SOLVER_CP_TUPLE__TO_USE_LINEARS:
				return ((InternalEList<?>)getToUseLinears()).basicRemove(otherEnd, msgs);
			case TousesolvercpPackage.TO_USE_SOLVER_CP_TUPLE__TO_USE_VARS:
				return ((InternalEList<?>)getToUseVars()).basicRemove(otherEnd, msgs);
			case TousesolvercpPackage.TO_USE_SOLVER_CP_TUPLE__TO_USE_LOGICALS:
				return ((InternalEList<?>)getToUseLogicals()).basicRemove(otherEnd, msgs);
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
			case TousesolvercpPackage.TO_USE_SOLVER_CP_TUPLE__TO_USE_LINEARS:
				return getToUseLinears();
			case TousesolvercpPackage.TO_USE_SOLVER_CP_TUPLE__TO_USE_VARS:
				return getToUseVars();
			case TousesolvercpPackage.TO_USE_SOLVER_CP_TUPLE__TO_USE_LOGICALS:
				return getToUseLogicals();
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
			case TousesolvercpPackage.TO_USE_SOLVER_CP_TUPLE__TO_USE_LINEARS:
				getToUseLinears().clear();
				getToUseLinears().addAll((Collection<? extends GeneratorCpLinear>)newValue);
				return;
			case TousesolvercpPackage.TO_USE_SOLVER_CP_TUPLE__TO_USE_VARS:
				getToUseVars().clear();
				getToUseVars().addAll((Collection<? extends GeneratorCpVarAtomic>)newValue);
				return;
			case TousesolvercpPackage.TO_USE_SOLVER_CP_TUPLE__TO_USE_LOGICALS:
				getToUseLogicals().clear();
				getToUseLogicals().addAll((Collection<? extends GeneratorCpLogical>)newValue);
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
			case TousesolvercpPackage.TO_USE_SOLVER_CP_TUPLE__TO_USE_LINEARS:
				getToUseLinears().clear();
				return;
			case TousesolvercpPackage.TO_USE_SOLVER_CP_TUPLE__TO_USE_VARS:
				getToUseVars().clear();
				return;
			case TousesolvercpPackage.TO_USE_SOLVER_CP_TUPLE__TO_USE_LOGICALS:
				getToUseLogicals().clear();
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
			case TousesolvercpPackage.TO_USE_SOLVER_CP_TUPLE__TO_USE_LINEARS:
				return toUseLinears != null && !toUseLinears.isEmpty();
			case TousesolvercpPackage.TO_USE_SOLVER_CP_TUPLE__TO_USE_VARS:
				return toUseVars != null && !toUseVars.isEmpty();
			case TousesolvercpPackage.TO_USE_SOLVER_CP_TUPLE__TO_USE_LOGICALS:
				return toUseLogicals != null && !toUseLogicals.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ToUseSolverCpTupleImpl
