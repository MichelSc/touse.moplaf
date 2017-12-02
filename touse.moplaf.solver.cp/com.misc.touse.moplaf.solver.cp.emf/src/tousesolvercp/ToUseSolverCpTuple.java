/**
 */
package tousesolvercp;

import com.misc.common.moplaf.solver.GeneratorCpLinear;
import com.misc.common.moplaf.solver.GeneratorCpLogical;
import com.misc.common.moplaf.solver.GeneratorCpVarAtomic;
import com.misc.common.moplaf.solver.GeneratorTuple;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Use Solver Cp Tuple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tousesolvercp.ToUseSolverCpTuple#getToUseLinears <em>To Use Linears</em>}</li>
 *   <li>{@link tousesolvercp.ToUseSolverCpTuple#getToUseVars <em>To Use Vars</em>}</li>
 *   <li>{@link tousesolvercp.ToUseSolverCpTuple#getToUseLogicals <em>To Use Logicals</em>}</li>
 * </ul>
 *
 * @see tousesolvercp.TousesolvercpPackage#getToUseSolverCpTuple()
 * @model
 * @generated
 */
public interface ToUseSolverCpTuple extends GeneratorTuple {

	/**
	 * Returns the value of the '<em><b>To Use Linears</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.solver.GeneratorCpLinear}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Use Linears</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Use Linears</em>' containment reference list.
	 * @see tousesolvercp.TousesolvercpPackage#getToUseSolverCpTuple_ToUseLinears()
	 * @model containment="true"
	 * @generated
	 */
	EList<GeneratorCpLinear> getToUseLinears();

	/**
	 * Returns the value of the '<em><b>To Use Vars</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.solver.GeneratorCpVarAtomic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Use Vars</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Use Vars</em>' containment reference list.
	 * @see tousesolvercp.TousesolvercpPackage#getToUseSolverCpTuple_ToUseVars()
	 * @model containment="true"
	 * @generated
	 */
	EList<GeneratorCpVarAtomic> getToUseVars();

	/**
	 * Returns the value of the '<em><b>To Use Logicals</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.solver.GeneratorCpLogical}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Use Logicals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Use Logicals</em>' containment reference list.
	 * @see tousesolvercp.TousesolvercpPackage#getToUseSolverCpTuple_ToUseLogicals()
	 * @model containment="true"
	 * @generated
	 */
	EList<GeneratorCpLogical> getToUseLogicals();
} // ToUseSolverCpTuple
