/**
 */
package com.misc.touse.moplaf.tousedatasetload;

import org.eclipse.emf.common.util.EList;

import com.misc.common.moplaf.dbsynch.Table;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FPD Sorting Plan Inputs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousedatasetload.FPDSortingPlanInputs#getSortingPlanInputs <em>Sorting Plan Inputs</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.touse.moplaf.tousedatasetload.TousedatasetloadPackage#getFPDSortingPlanInputs()
 * @model
 * @generated
 */
public interface FPDSortingPlanInputs extends Table {

	/**
	 * Returns the value of the '<em><b>Sorting Plan Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.tousedatasetload.FPDSortingPlanInput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Plan Inputs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Plan Inputs</em>' containment reference list.
	 * @see com.misc.touse.moplaf.tousedatasetload.TousedatasetloadPackage#getFPDSortingPlanInputs_SortingPlanInputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<FPDSortingPlanInput> getSortingPlanInputs();
} // FPDSortingPlanInputs
