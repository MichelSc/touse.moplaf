/**
 */
package com.misc.touse.moplaf.solver.tousesolver.impl;

import com.misc.common.moplaf.solver.impl.GeneratorLpConsImpl;
import com.misc.touse.moplaf.solver.tousesolver.ConsKnapsackCapacity;
import com.misc.touse.moplaf.solver.tousesolver.LpItem;
import com.misc.touse.moplaf.solver.tousesolver.LpRoot;
import com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage;
import com.misc.touse.moplaf.solver.tousesolver.LpKnapsack;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cons Knapsack Capacity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ConsKnapsackCapacityImpl extends GeneratorLpConsImpl implements ConsKnapsackCapacity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsKnapsackCapacityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TousesolverPackage.Literals.CONS_KNAPSACK_CAPACITY;
	}

	@Override
	public void generate() {
		LpKnapsack lpknapsack = (LpKnapsack)this.getTuple();
		LpRoot lproot = (LpRoot)lpknapsack.getTupleContainer();
		for (LpItem lpitem : lproot.getItem()){
			this.constructTerm(lpitem.getVarInKnapsack(), lpitem.getItem().getWeight());
		}
	}
	
	

} //ConsKnapsackCapacityImpl
