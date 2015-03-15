/**
 */
package com.misc.touse.moplaf.tousedatasetload;

import com.misc.common.moplaf.datasetload.TableGroup;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maria Db Test Group Tables</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousedatasetload.MariaDbTestGroupTables#getMariaTables <em>Maria Tables</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.touse.moplaf.tousedatasetload.TousedatasetloadPackage#getMariaDbTestGroupTables()
 * @model
 * @generated
 */
public interface MariaDbTestGroupTables extends TableGroup {
	/**
	 * Returns the value of the '<em><b>Maria Tables</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.tousedatasetload.MariaDbTestTable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maria Tables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maria Tables</em>' containment reference list.
	 * @see com.misc.touse.moplaf.tousedatasetload.TousedatasetloadPackage#getMariaDbTestGroupTables_MariaTables()
	 * @model containment="true"
	 * @generated
	 */
	EList<MariaDbTestTable> getMariaTables();

} // MariaDbTestGroupTables
