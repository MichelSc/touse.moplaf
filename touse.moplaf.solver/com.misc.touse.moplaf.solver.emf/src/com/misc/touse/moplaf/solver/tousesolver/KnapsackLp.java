/**
 */
package com.misc.touse.moplaf.solver.tousesolver;

import com.misc.common.moplaf.solver.Generator;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Knapsack Lp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackLp#getRoot <em>Root</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackLp#getScenario <em>Scenario</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackLp#getGLPK <em>GLPK</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackLp#getJavaILP <em>Java ILP</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackLp#getNeos <em>Neos</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackLp#getReader <em>Reader</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackLp#getCplex <em>Cplex</em>}</li>
 * </ul>
 * </p>
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
	 * Returns the value of the '<em><b>GLPK</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.solver.tousesolver.SolverToUseGLPK}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GLPK</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GLPK</em>' containment reference list.
	 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getKnapsackLp_GLPK()
	 * @model containment="true"
	 * @generated
	 */
	EList<SolverToUseGLPK> getGLPK();

	/**
	 * Returns the value of the '<em><b>Java ILP</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.solver.tousesolver.SolverToUseJavaILP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java ILP</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java ILP</em>' containment reference list.
	 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getKnapsackLp_JavaILP()
	 * @model containment="true"
	 * @generated
	 */
	EList<SolverToUseJavaILP> getJavaILP();

	/**
	 * Returns the value of the '<em><b>Neos</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.solver.tousesolver.SolverToUseNeos}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Neos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neos</em>' containment reference list.
	 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getKnapsackLp_Neos()
	 * @model containment="true"
	 * @generated
	 */
	EList<SolverToUseNeos> getNeos();

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
	 * Returns the value of the '<em><b>Cplex</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.solver.tousesolver.SolverToUserCplex}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cplex</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cplex</em>' containment reference list.
	 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getKnapsackLp_Cplex()
	 * @model containment="true"
	 * @generated
	 */
	EList<SolverToUserCplex> getCplex();
} // KnapsackLp
