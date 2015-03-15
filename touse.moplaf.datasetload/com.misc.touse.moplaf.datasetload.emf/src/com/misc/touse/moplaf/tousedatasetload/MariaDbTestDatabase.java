/**
 */
package com.misc.touse.moplaf.tousedatasetload;

import com.misc.common.moplaf.DatasetLoadMariaDb.DatasetLoadJdbcMariaDb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maria Db Test Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousedatasetload.MariaDbTestDatabase#getTableSets <em>Table Sets</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.touse.moplaf.tousedatasetload.TousedatasetloadPackage#getMariaDbTestDatabase()
 * @model
 * @generated
 */
public interface MariaDbTestDatabase extends DatasetLoadJdbcMariaDb {
	/**
	 * Returns the value of the '<em><b>Table Sets</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.tousedatasetload.MariaDbTestGroupTables}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Sets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Sets</em>' containment reference list.
	 * @see com.misc.touse.moplaf.tousedatasetload.TousedatasetloadPackage#getMariaDbTestDatabase_TableSets()
	 * @model containment="true"
	 * @generated
	 */
	EList<MariaDbTestGroupTables> getTableSets();

} // MariaDbTestDatabase
