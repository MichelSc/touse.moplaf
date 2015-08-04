/**
 */
package com.misc.touse.moplaf.solver.tousesolverlp;

import com.misc.common.moplaf.solver.Generator;
import com.misc.common.moplaf.solver.Solver;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Use Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolverlp.ToUseGenerator#getRootTuples <em>Root Tuples</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolverlp.ToUseGenerator#getSolvers <em>Solvers</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.solver.tousesolverlp.ToUseSolverLpPackage#getToUseGenerator()
 * @model
 * @generated
 */
public interface ToUseGenerator extends Generator {
	/**
	 * Returns the value of the '<em><b>Root Tuples</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.solver.tousesolverlp.ToUseTuple}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Tuples</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Tuples</em>' containment reference list.
	 * @see com.misc.touse.moplaf.solver.tousesolverlp.ToUseSolverLpPackage#getToUseGenerator_RootTuples()
	 * @model containment="true"
	 * @generated
	 */
	EList<ToUseTuple> getRootTuples();

	/**
	 * Returns the value of the '<em><b>Solvers</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.solver.Solver}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solvers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solvers</em>' containment reference list.
	 * @see com.misc.touse.moplaf.solver.tousesolverlp.ToUseSolverLpPackage#getToUseGenerator_Solvers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Solver> getSolvers();

} // ToUseGenerator
