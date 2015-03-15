/**
 */
package com.misc.touse.moplaf.tousedatasetload;

import com.misc.common.moplaf.datasetload.Table;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FPD Sorting Plans</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousedatasetload.FPDSortingPlans#getSortingPlans <em>Sorting Plans</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.touse.moplaf.tousedatasetload.TousedatasetloadPackage#getFPDSortingPlans()
 * @model
 * @generated
 */
public interface FPDSortingPlans extends Table {

	/**
	 * Returns the value of the '<em><b>Sorting Plans</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.tousedatasetload.FPDSortingPlan}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Plans</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Plans</em>' containment reference list.
	 * @see com.misc.touse.moplaf.tousedatasetload.TousedatasetloadPackage#getFPDSortingPlans_SortingPlans()
	 * @model containment="true"
	 * @generated
	 */
	EList<FPDSortingPlan> getSortingPlans();
} // FPDSortingPlans
