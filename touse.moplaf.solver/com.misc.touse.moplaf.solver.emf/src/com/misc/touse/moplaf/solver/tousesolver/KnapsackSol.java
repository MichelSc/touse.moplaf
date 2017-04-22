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

import com.misc.common.moplaf.solver.Solution;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Knapsack Sol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackSol#getTotalValue <em>Total Value</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackSol#getTotalWeight <em>Total Weight</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackSol#getSolver <em>Solver</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackSol#getItem <em>Item</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackSol#getLp <em>Lp</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getKnapsackSol()
 * @model
 * @generated
 */
public interface KnapsackSol extends EObject {
	/**
	 * Returns the value of the '<em><b>Total Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Value</em>' attribute.
	 * @see #setTotalValue(float)
	 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getKnapsackSol_TotalValue()
	 * @model
	 * @generated
	 */
	float getTotalValue();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackSol#getTotalValue <em>Total Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Value</em>' attribute.
	 * @see #getTotalValue()
	 * @generated
	 */
	void setTotalValue(float value);

	/**
	 * Returns the value of the '<em><b>Total Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Weight</em>' attribute.
	 * @see #setTotalWeight(float)
	 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getKnapsackSol_TotalWeight()
	 * @model
	 * @generated
	 */
	float getTotalWeight();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackSol#getTotalWeight <em>Total Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Weight</em>' attribute.
	 * @see #getTotalWeight()
	 * @generated
	 */
	void setTotalWeight(float value);

	/**
	 * Returns the value of the '<em><b>Solver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solver</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solver</em>' reference.
	 * @see #setSolver(Solution)
	 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getKnapsackSol_Solver()
	 * @model
	 * @generated
	 */
	Solution getSolver();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackSol#getSolver <em>Solver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solver</em>' reference.
	 * @see #getSolver()
	 * @generated
	 */
	void setSolver(Solution value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.solver.tousesolver.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' reference list.
	 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getKnapsackSol_Item()
	 * @model
	 * @generated
	 */
	EList<Item> getItem();

	/**
	 * Returns the value of the '<em><b>Lp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lp</em>' reference.
	 * @see #setLp(KnapsackLp)
	 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getKnapsackSol_Lp()
	 * @model
	 * @generated
	 */
	KnapsackLp getLp();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackSol#getLp <em>Lp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lp</em>' reference.
	 * @see #getLp()
	 * @generated
	 */
	void setLp(KnapsackLp value);

} // KnapsackSol
