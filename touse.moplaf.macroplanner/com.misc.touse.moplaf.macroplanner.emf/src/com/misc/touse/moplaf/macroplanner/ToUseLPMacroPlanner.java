/**
 */
package com.misc.touse.moplaf.macroplanner;

import com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner;
import com.misc.common.moplaf.solver.Solver;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Use LP Macro Planner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.macroplanner.ToUseLPMacroPlanner#getSolvers <em>Solvers</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.macroplanner.ToUseMacroPlannerPackage#getToUseLPMacroPlanner()
 * @model
 * @generated
 */
public interface ToUseLPMacroPlanner extends LPMacroPlanner {

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
	 * @see com.misc.touse.moplaf.macroplanner.ToUseMacroPlannerPackage#getToUseLPMacroPlanner_Solvers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Solver> getSolvers();
} // ToUseLPMacroPlanner
