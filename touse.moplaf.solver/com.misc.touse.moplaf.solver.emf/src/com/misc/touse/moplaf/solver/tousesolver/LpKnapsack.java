/**
 */
package com.misc.touse.moplaf.solver.tousesolver;

import com.misc.common.moplaf.solver.GeneratorTuple;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lp Knapsack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.LpKnapsack#getKnapsack <em>Knapsack</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.LpKnapsack#getConsCapacity <em>Cons Capacity</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getLpKnapsack()
 * @model
 * @generated
 */
public interface LpKnapsack extends GeneratorTuple {
	/**
	 * Returns the value of the '<em><b>Knapsack</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Knapsack</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knapsack</em>' reference.
	 * @see #setKnapsack(Knapsack)
	 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getLpKnapsack_Knapsack()
	 * @model required="true"
	 * @generated
	 */
	Knapsack getKnapsack();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.solver.tousesolver.LpKnapsack#getKnapsack <em>Knapsack</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Knapsack</em>' reference.
	 * @see #getKnapsack()
	 * @generated
	 */
	void setKnapsack(Knapsack value);

	/**
	 * Returns the value of the '<em><b>Cons Capacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cons Capacity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cons Capacity</em>' containment reference.
	 * @see #setConsCapacity(ConsKnapsackCapacity)
	 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getLpKnapsack_ConsCapacity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConsKnapsackCapacity getConsCapacity();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.solver.tousesolver.LpKnapsack#getConsCapacity <em>Cons Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cons Capacity</em>' containment reference.
	 * @see #getConsCapacity()
	 * @generated
	 */
	void setConsCapacity(ConsKnapsackCapacity value);

} // LpKnapsack
