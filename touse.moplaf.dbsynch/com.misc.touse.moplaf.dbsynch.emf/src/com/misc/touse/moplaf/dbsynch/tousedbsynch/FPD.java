/**
 */
package com.misc.touse.moplaf.dbsynch.tousedbsynch;

import com.misc.common.moplaf.dbsynch.dbsynchderby.DataSourceJdbcDerbyEmbedded;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FPD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPD#getSortingPlansSet <em>Sorting Plans Set</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.ToUseDbSynchPackage#getFPD()
 * @model
 * @generated
 */
public interface FPD extends DataSourceJdbcDerbyEmbedded {
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
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.ToUseDbSynchPackage#getFPD_SortingPlansSet()
	 * @model containment="true"
	 * @generated
	 */
	EList<FPDGroupSortingPlan> getSortingPlansSet();

} // FPD
