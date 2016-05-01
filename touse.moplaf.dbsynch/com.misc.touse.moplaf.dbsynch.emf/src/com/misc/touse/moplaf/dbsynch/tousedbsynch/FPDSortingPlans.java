/**
 */
package com.misc.touse.moplaf.dbsynch.tousedbsynch;

import com.misc.common.moplaf.dbsynch.Table;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FPD Sorting Plans</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlans#getSortingPlans <em>Sorting Plans</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.TousedbsynchPackage#getFPDSortingPlans()
 * @model
 * @generated
 */
public interface FPDSortingPlans extends Table {
	/**
	 * Returns the value of the '<em><b>Sorting Plans</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Plans</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Plans</em>' containment reference list.
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.TousedbsynchPackage#getFPDSortingPlans_SortingPlans()
	 * @model containment="true"
	 * @generated
	 */
	EList<FPDSortingPlan> getSortingPlans();

} // FPDSortingPlans
