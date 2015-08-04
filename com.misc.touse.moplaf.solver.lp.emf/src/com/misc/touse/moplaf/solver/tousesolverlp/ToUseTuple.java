/**
 */
package com.misc.touse.moplaf.solver.tousesolverlp;

import com.misc.common.moplaf.solver.GeneratorLpCons;
import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.solver.GeneratorTuple;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Use Tuple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolverlp.ToUseTuple#getChildTuples <em>Child Tuples</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolverlp.ToUseTuple#getToUseVars <em>To Use Vars</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolverlp.ToUseTuple#getToUseCons <em>To Use Cons</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.solver.tousesolverlp.ToUseSolverLpPackage#getToUseTuple()
 * @model
 * @generated
 */
public interface ToUseTuple extends GeneratorTuple {
	/**
	 * Returns the value of the '<em><b>Child Tuples</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.solver.tousesolverlp.ToUseTuple}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Tuples</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Tuples</em>' containment reference list.
	 * @see com.misc.touse.moplaf.solver.tousesolverlp.ToUseSolverLpPackage#getToUseTuple_ChildTuples()
	 * @model containment="true"
	 * @generated
	 */
	EList<ToUseTuple> getChildTuples();

	/**
	 * Returns the value of the '<em><b>To Use Vars</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.solver.GeneratorLpVar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Use Vars</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Use Vars</em>' containment reference list.
	 * @see com.misc.touse.moplaf.solver.tousesolverlp.ToUseSolverLpPackage#getToUseTuple_ToUseVars()
	 * @model containment="true"
	 * @generated
	 */
	EList<GeneratorLpVar> getToUseVars();

	/**
	 * Returns the value of the '<em><b>To Use Cons</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.solver.GeneratorLpCons}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Use Cons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Use Cons</em>' containment reference list.
	 * @see com.misc.touse.moplaf.solver.tousesolverlp.ToUseSolverLpPackage#getToUseTuple_ToUseCons()
	 * @model containment="true"
	 * @generated
	 */
	EList<GeneratorLpCons> getToUseCons();

} // ToUseTuple
