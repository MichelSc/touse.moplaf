/**
 */
package com.misc.touse.moplaf.solver.tousesolver;

import com.misc.common.moplaf.solver.GeneratorTuple;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lp Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.LpRoot#getItem <em>Item</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.LpRoot#getKnapsack <em>Knapsack</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getLpRoot()
 * @model
 * @generated
 */
public interface LpRoot extends GeneratorTuple {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.solver.tousesolver.LpItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getLpRoot_Item()
	 * @model containment="true"
	 * @generated
	 */
	EList<LpItem> getItem();

	/**
	 * Returns the value of the '<em><b>Knapsack</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Knapsack</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knapsack</em>' containment reference.
	 * @see #setKnapsack(LpKnapsack)
	 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getLpRoot_Knapsack()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LpKnapsack getKnapsack();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.solver.tousesolver.LpRoot#getKnapsack <em>Knapsack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Knapsack</em>' containment reference.
	 * @see #getKnapsack()
	 * @generated
	 */
	void setKnapsack(LpKnapsack value);

} // LpRoot
