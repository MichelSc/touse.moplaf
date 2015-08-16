/**
 */
package com.misc.touse.moplaf.solver.tousesolver;

import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.solver.GeneratorTuple;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lp Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.LpItem#getItem <em>Item</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.LpItem#getVarInKnapsack <em>Var In Knapsack</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getLpItem()
 * @model
 * @generated
 */
public interface LpItem extends GeneratorTuple {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' reference.
	 * @see #setItem(Item)
	 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getLpItem_Item()
	 * @model required="true"
	 * @generated
	 */
	Item getItem();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.solver.tousesolver.LpItem#getItem <em>Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(Item value);

	/**
	 * Returns the value of the '<em><b>Var In Knapsack</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var In Knapsack</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var In Knapsack</em>' containment reference.
	 * @see #setVarInKnapsack(GeneratorLpVar)
	 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getLpItem_VarInKnapsack()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GeneratorLpVar getVarInKnapsack();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.solver.tousesolver.LpItem#getVarInKnapsack <em>Var In Knapsack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var In Knapsack</em>' containment reference.
	 * @see #getVarInKnapsack()
	 * @generated
	 */
	void setVarInKnapsack(GeneratorLpVar value);

} // LpItem
