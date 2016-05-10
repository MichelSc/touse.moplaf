/**
 */
package com.misc.touse.moplaf.dbsynch.tousedbsynch;

import com.misc.common.moplaf.dbsynch.dbsynchjtds.DataSourceJdbcJtds;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FPD Jtds</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDJtds#getSortingPlansSet <em>Sorting Plans Set</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.ToUseDbSynchPackage#getFPDJtds()
 * @model
 * @generated
 */
public interface FPDJtds extends DataSourceJdbcJtds {
	/**
	 * Returns the value of the '<em><b>Sorting Plans Set</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDGroupSortingPlan}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Plans Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Plans Set</em>' containment reference list.
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.ToUseDbSynchPackage#getFPDJtds_SortingPlansSet()
	 * @model containment="true"
	 * @generated
	 */
	EList<FPDGroupSortingPlan> getSortingPlansSet();

} // FPDJtds
