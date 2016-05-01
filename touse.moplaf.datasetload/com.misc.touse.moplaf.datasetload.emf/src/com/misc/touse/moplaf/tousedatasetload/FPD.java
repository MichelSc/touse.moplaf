/**
 */
package com.misc.touse.moplaf.tousedatasetload;

import com.misc.common.moplaf.dbsynch.derby.DataSourceJdbDerbyEmbedded;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FPD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousedatasetload.FPD#getSortingPlansSet <em>Sorting Plans Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.touse.moplaf.tousedatasetload.TousedatasetloadPackage#getFPD()
 * @model
 * @generated
 */
public interface FPD extends DataSourceJdbDerbyEmbedded {

	/**
	 * Returns the value of the '<em><b>Sorting Plans Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Plans Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Plans Set</em>' containment reference.
	 * @see #setSortingPlansSet(FPDGroupSortingPlan)
	 * @see com.misc.touse.moplaf.tousedatasetload.TousedatasetloadPackage#getFPD_SortingPlansSet()
	 * @model containment="true"
	 * @generated
	 */
	FPDGroupSortingPlan getSortingPlansSet();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousedatasetload.FPD#getSortingPlansSet <em>Sorting Plans Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorting Plans Set</em>' containment reference.
	 * @see #getSortingPlansSet()
	 * @generated
	 */
	void setSortingPlansSet(FPDGroupSortingPlan value);
} // FPD
