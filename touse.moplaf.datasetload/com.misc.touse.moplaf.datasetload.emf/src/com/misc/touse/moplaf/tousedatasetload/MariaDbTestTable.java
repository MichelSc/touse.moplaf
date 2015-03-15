/**
 */
package com.misc.touse.moplaf.tousedatasetload;

import com.misc.common.moplaf.datasetload.Table;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maria Db Test Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousedatasetload.MariaDbTestTable#getMariaRows <em>Maria Rows</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.touse.moplaf.tousedatasetload.TousedatasetloadPackage#getMariaDbTestTable()
 * @model
 * @generated
 */
public interface MariaDbTestTable extends Table {
	/**
	 * Returns the value of the '<em><b>Maria Rows</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.tousedatasetload.MariaDbTestRow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maria Rows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maria Rows</em>' containment reference list.
	 * @see com.misc.touse.moplaf.tousedatasetload.TousedatasetloadPackage#getMariaDbTestTable_MariaRows()
	 * @model containment="true"
	 * @generated
	 */
	EList<MariaDbTestRow> getMariaRows();

} // MariaDbTestTable
