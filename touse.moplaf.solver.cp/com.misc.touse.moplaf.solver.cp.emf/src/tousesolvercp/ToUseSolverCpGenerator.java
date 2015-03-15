/**
 */
package tousesolvercp;

import com.misc.common.moplaf.solver.Generator;

import org.eclipse.emf.common.util.EList;

import solverjacop.SolverJacop;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Use Solver Cp Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tousesolvercp.ToUseSolverCpGenerator#getSolver <em>Solver</em>}</li>
 *   <li>{@link tousesolvercp.ToUseSolverCpGenerator#getToUseTuples <em>To Use Tuples</em>}</li>
 * </ul>
 * </p>
 *
 * @see tousesolvercp.TousesolvercpPackage#getToUseSolverCpGenerator()
 * @model
 * @generated
 */
public interface ToUseSolverCpGenerator extends Generator {
	/**
	 * Returns the value of the '<em><b>Solver</b></em>' containment reference list.
	 * The list contents are of type {@link solverjacop.SolverJacop}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solver</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solver</em>' containment reference list.
	 * @see tousesolvercp.TousesolvercpPackage#getToUseSolverCpGenerator_Solver()
	 * @model containment="true"
	 * @generated
	 */
	EList<SolverJacop> getSolver();

	/**
	 * Returns the value of the '<em><b>To Use Tuples</b></em>' containment reference list.
	 * The list contents are of type {@link tousesolvercp.ToUseSolverCpTuple}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Use Tuples</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Use Tuples</em>' containment reference list.
	 * @see tousesolvercp.TousesolvercpPackage#getToUseSolverCpGenerator_ToUseTuples()
	 * @model containment="true"
	 * @generated
	 */
	EList<ToUseSolverCpTuple> getToUseTuples();

} // ToUseSolverCpGenerator
