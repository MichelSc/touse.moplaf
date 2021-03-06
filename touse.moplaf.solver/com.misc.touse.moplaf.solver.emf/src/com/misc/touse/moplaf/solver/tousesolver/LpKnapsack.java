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
package com.misc.touse.moplaf.solver.tousesolver;

import com.misc.common.moplaf.solver.GeneratorLpCons;
import com.misc.common.moplaf.solver.GeneratorTuple;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lp Knapsack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.LpKnapsack#getKnapsack <em>Knapsack</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.LpKnapsack#getConsCapacity <em>Cons Capacity</em>}</li>
 * </ul>
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
	 * @see #setConsCapacity(GeneratorLpCons)
	 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getLpKnapsack_ConsCapacity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GeneratorLpCons getConsCapacity();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.solver.tousesolver.LpKnapsack#getConsCapacity <em>Cons Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cons Capacity</em>' containment reference.
	 * @see #getConsCapacity()
	 * @generated
	 */
	void setConsCapacity(GeneratorLpCons value);

} // LpKnapsack
