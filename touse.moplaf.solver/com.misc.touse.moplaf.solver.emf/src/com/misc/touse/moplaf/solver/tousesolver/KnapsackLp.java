/**
 */
package com.misc.touse.moplaf.solver.tousesolver;

import com.misc.common.moplaf.solver.Generator;
import com.misc.common.moplaf.solver.GeneratorLpGoal;
import com.misc.common.moplaf.solver.Solver;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Knapsack Lp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackLp#getRoot <em>Root</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackLp#getScenario <em>Scenario</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackLp#getReader <em>Reader</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackLp#getSolver <em>Solver</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackLp#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getKnapsackLp()
 * @model
 * @generated
 */
public interface KnapsackLp extends Generator {

	/**
	 * Returns the value of the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' containment reference.
	 * @see #setRoot(LpRoot)
	 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getKnapsackLp_Root()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LpRoot getRoot();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackLp#getRoot <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' containment reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(LpRoot value);

	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.solver.tousesolver.Scenario#getLP <em>LP</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' container reference.
	 * @see #setScenario(Scenario)
	 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getKnapsackLp_Scenario()
	 * @see com.misc.touse.moplaf.solver.tousesolver.Scenario#getLP
	 * @model opposite="LP" required="true" transient="false"
	 * @generated
	 */
	Scenario getScenario();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackLp#getScenario <em>Scenario</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario</em>' container reference.
	 * @see #getScenario()
	 * @generated
	 */
	void setScenario(Scenario value);

	/**
	 * Returns the value of the '<em><b>Reader</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.solver.tousesolver.SolutionReaderToUse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reader</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reader</em>' containment reference list.
	 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getKnapsackLp_Reader()
	 * @model containment="true"
	 * @generated
	 */
	EList<SolutionReaderToUse> getReader();

	/**
	 * Returns the value of the '<em><b>Solver</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.solver.Solver}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solver</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solver</em>' containment reference list.
	 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getKnapsackLp_Solver()
	 * @model containment="true"
	 * @generated
	 */
	EList<Solver> getSolver();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(GeneratorLpGoal)
	 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getKnapsackLp_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GeneratorLpGoal getValue();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackLp#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(GeneratorLpGoal value);
} // KnapsackLp
