/**
 */
package com.misc.touse.moplaf.dbsynch.tousedbsynch;

import com.misc.common.moplaf.dbsynch.dbsynchmysql.DataSourceJdbcMySql;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FPD My Sql</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDMySql#getSortingPlansSet <em>Sorting Plans Set</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.ToUseDbSynchPackage#getFPDMySql()
 * @model
 * @generated
 */
public interface FPDMySql extends DataSourceJdbcMySql {
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
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.ToUseDbSynchPackage#getFPDMySql_SortingPlansSet()
	 * @model containment="true"
	 * @generated
	 */
	EList<FPDGroupSortingPlan> getSortingPlansSet();

} // FPDMySql
