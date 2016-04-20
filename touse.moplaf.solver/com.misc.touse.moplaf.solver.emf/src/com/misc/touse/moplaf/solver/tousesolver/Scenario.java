/**
 */
package com.misc.touse.moplaf.solver.tousesolver;

import com.misc.common.moplaf.solver.SolutionReader;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.Scenario#getKnapsack <em>Knapsack</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.Scenario#getItem <em>Item</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.Scenario#getLP <em>LP</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.Scenario#getSol <em>Sol</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.Scenario#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.Scenario#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.Scenario#getSolutionReader <em>Solution Reader</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject {
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
	 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getScenario_Knapsack()
	 * @model required="true"
	 * @generated
	 */
	Knapsack getKnapsack();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.solver.tousesolver.Scenario#getKnapsack <em>Knapsack</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Knapsack</em>' reference.
	 * @see #getKnapsack()
	 * @generated
	 */
	void setKnapsack(Knapsack value);

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
	 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getScenario_Item()
	 * @model required="true"
	 * @generated
	 */
	EList<Item> getItem();

	/**
	 * Returns the value of the '<em><b>LP</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.solver.tousesolver.KnapsackLp}.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackLp#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LP</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LP</em>' containment reference list.
	 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getScenario_LP()
	 * @see com.misc.touse.moplaf.solver.tousesolver.KnapsackLp#getScenario
	 * @model opposite="Scenario" containment="true"
	 * @generated
	 */
	EList<KnapsackLp> getLP();

	/**
	 * Returns the value of the '<em><b>Sol</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.solver.tousesolver.KnapsackSol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sol</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sol</em>' containment reference list.
	 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getScenario_Sol()
	 * @model containment="true"
	 * @generated
	 */
	EList<KnapsackSol> getSol();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getScenario_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.solver.tousesolver.Scenario#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remarks</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remarks</em>' attribute.
	 * @see #setRemarks(String)
	 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getScenario_Remarks()
	 * @model
	 * @generated
	 */
	String getRemarks();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.solver.tousesolver.Scenario#getRemarks <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' attribute.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(String value);

	/**
	 * Returns the value of the '<em><b>Solution Reader</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.solver.SolutionReader}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution Reader</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution Reader</em>' containment reference list.
	 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getScenario_SolutionReader()
	 * @model containment="true"
	 * @generated
	 */
	EList<SolutionReader> getSolutionReader();

} // Scenario
