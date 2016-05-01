/**
 */
package com.misc.touse.moplaf.dbsynch.tousedbsynch;

import com.misc.common.moplaf.dbsynch.Table;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FPD Sorting Plan Inputs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlanInputs#getSortingPlanInputs <em>Sorting Plan Inputs</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.TousedbsynchPackage#getFPDSortingPlanInputs()
 * @model
 * @generated
 */
public interface FPDSortingPlanInputs extends Table {
	/**
	 * Returns the value of the '<em><b>Sorting Plan Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlanInput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Plan Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Plan Inputs</em>' containment reference list.
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.TousedbsynchPackage#getFPDSortingPlanInputs_SortingPlanInputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<FPDSortingPlanInput> getSortingPlanInputs();

} // FPDSortingPlanInputs
