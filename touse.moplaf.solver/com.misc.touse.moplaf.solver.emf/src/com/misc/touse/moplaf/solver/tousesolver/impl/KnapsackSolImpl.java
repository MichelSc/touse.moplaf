/**
 */
package com.misc.touse.moplaf.solver.tousesolver.impl;

import com.misc.common.moplaf.solver.Solution;
import com.misc.touse.moplaf.solver.tousesolver.Item;
import com.misc.touse.moplaf.solver.tousesolver.KnapsackLp;
import com.misc.touse.moplaf.solver.tousesolver.KnapsackSol;
import com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Knapsack Sol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.impl.KnapsackSolImpl#getTotalValue <em>Total Value</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.impl.KnapsackSolImpl#getTotalWeight <em>Total Weight</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.impl.KnapsackSolImpl#getSolver <em>Solver</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.impl.KnapsackSolImpl#getItem <em>Item</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.impl.KnapsackSolImpl#getLp <em>Lp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KnapsackSolImpl extends MinimalEObjectImpl.Container implements KnapsackSol {
	/**
	 * The default value of the '{@link #getTotalValue() <em>Total Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalValue()
	 * @generated
	 * @ordered
	 */
	protected static final float TOTAL_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTotalValue() <em>Total Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalValue()
	 * @generated
	 * @ordered
	 */
	protected float totalValue = TOTAL_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalWeight() <em>Total Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalWeight()
	 * @generated
	 * @ordered
	 */
	protected static final float TOTAL_WEIGHT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTotalWeight() <em>Total Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalWeight()
	 * @generated
	 * @ordered
	 */
	protected float totalWeight = TOTAL_WEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSolver() <em>Solver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolver()
	 * @generated
	 * @ordered
	 */
	protected Solution solver;

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
	 * The cached value of the '{@link #getLp() <em>Lp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLp()
	 * @generated
	 * @ordered
	 */
	protected KnapsackLp lp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KnapsackSolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TousesolverPackage.Literals.KNAPSACK_SOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTotalValue() {
		return totalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalValue(float newTotalValue) {
		float oldTotalValue = totalValue;
		totalValue = newTotalValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TousesolverPackage.KNAPSACK_SOL__TOTAL_VALUE, oldTotalValue, totalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTotalWeight() {
		return totalWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalWeight(float newTotalWeight) {
		float oldTotalWeight = totalWeight;
		totalWeight = newTotalWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TousesolverPackage.KNAPSACK_SOL__TOTAL_WEIGHT, oldTotalWeight, totalWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution getSolver() {
		if (solver != null && solver.eIsProxy()) {
			InternalEObject oldSolver = (InternalEObject)solver;
			solver = (Solution)eResolveProxy(oldSolver);
			if (solver != oldSolver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TousesolverPackage.KNAPSACK_SOL__SOLVER, oldSolver, solver));
			}
		}
		return solver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution basicGetSolver() {
		return solver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolver(Solution newSolver) {
		Solution oldSolver = solver;
		solver = newSolver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TousesolverPackage.KNAPSACK_SOL__SOLVER, oldSolver, solver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getItem() {
		if (item == null) {
			item = new EObjectResolvingEList<Item>(Item.class, this, TousesolverPackage.KNAPSACK_SOL__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnapsackLp getLp() {
		if (lp != null && lp.eIsProxy()) {
			InternalEObject oldLp = (InternalEObject)lp;
			lp = (KnapsackLp)eResolveProxy(oldLp);
			if (lp != oldLp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TousesolverPackage.KNAPSACK_SOL__LP, oldLp, lp));
			}
		}
		return lp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnapsackLp basicGetLp() {
		return lp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLp(KnapsackLp newLp) {
		KnapsackLp oldLp = lp;
		lp = newLp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TousesolverPackage.KNAPSACK_SOL__LP, oldLp, lp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TousesolverPackage.KNAPSACK_SOL__TOTAL_VALUE:
				return getTotalValue();
			case TousesolverPackage.KNAPSACK_SOL__TOTAL_WEIGHT:
				return getTotalWeight();
			case TousesolverPackage.KNAPSACK_SOL__SOLVER:
				if (resolve) return getSolver();
				return basicGetSolver();
			case TousesolverPackage.KNAPSACK_SOL__ITEM:
				return getItem();
			case TousesolverPackage.KNAPSACK_SOL__LP:
				if (resolve) return getLp();
				return basicGetLp();
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
			case TousesolverPackage.KNAPSACK_SOL__TOTAL_VALUE:
				setTotalValue((Float)newValue);
				return;
			case TousesolverPackage.KNAPSACK_SOL__TOTAL_WEIGHT:
				setTotalWeight((Float)newValue);
				return;
			case TousesolverPackage.KNAPSACK_SOL__SOLVER:
				setSolver((Solution)newValue);
				return;
			case TousesolverPackage.KNAPSACK_SOL__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends Item>)newValue);
				return;
			case TousesolverPackage.KNAPSACK_SOL__LP:
				setLp((KnapsackLp)newValue);
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
			case TousesolverPackage.KNAPSACK_SOL__TOTAL_VALUE:
				setTotalValue(TOTAL_VALUE_EDEFAULT);
				return;
			case TousesolverPackage.KNAPSACK_SOL__TOTAL_WEIGHT:
				setTotalWeight(TOTAL_WEIGHT_EDEFAULT);
				return;
			case TousesolverPackage.KNAPSACK_SOL__SOLVER:
				setSolver((Solution)null);
				return;
			case TousesolverPackage.KNAPSACK_SOL__ITEM:
				getItem().clear();
				return;
			case TousesolverPackage.KNAPSACK_SOL__LP:
				setLp((KnapsackLp)null);
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
			case TousesolverPackage.KNAPSACK_SOL__TOTAL_VALUE:
				return totalValue != TOTAL_VALUE_EDEFAULT;
			case TousesolverPackage.KNAPSACK_SOL__TOTAL_WEIGHT:
				return totalWeight != TOTAL_WEIGHT_EDEFAULT;
			case TousesolverPackage.KNAPSACK_SOL__SOLVER:
				return solver != null;
			case TousesolverPackage.KNAPSACK_SOL__ITEM:
				return item != null && !item.isEmpty();
			case TousesolverPackage.KNAPSACK_SOL__LP:
				return lp != null;
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
		result.append(" (TotalValue: ");
		result.append(totalValue);
		result.append(", TotalWeight: ");
		result.append(totalWeight);
		result.append(')');
		return result.toString();
	}

} //KnapsackSolImpl
