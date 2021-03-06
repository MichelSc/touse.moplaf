/**
 */
package com.misc.touse.moplaf.gridview.tousegridview;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.gridview.tousegridview.Row#getIndex <em>Index</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.gridview.tousegridview.Row#getCells <em>Cells</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.gridview.tousegridview.Row#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.gridview.tousegridview.Row#getSheet <em>Sheet</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.gridview.tousegridview.ToUseGridViewPackage#getRow()
 * @model
 * @generated
 */
public interface Row extends EObject {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see com.misc.touse.moplaf.gridview.tousegridview.ToUseGridViewPackage#getRow_Index()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	long getIndex();

	/**
	 * Returns the value of the '<em><b>Cells</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.gridview.tousegridview.Cell}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cells</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cells</em>' containment reference list.
	 * @see com.misc.touse.moplaf.gridview.tousegridview.ToUseGridViewPackage#getRow_Cells()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cell> getCells();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.misc.touse.moplaf.gridview.tousegridview.ToUseGridViewPackage#getRow_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.gridview.tousegridview.Row#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sheet</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.gridview.tousegridview.Sheet#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sheet</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheet</em>' container reference.
	 * @see #setSheet(Sheet)
	 * @see com.misc.touse.moplaf.gridview.tousegridview.ToUseGridViewPackage#getRow_Sheet()
	 * @see com.misc.touse.moplaf.gridview.tousegridview.Sheet#getRows
	 * @model opposite="Rows" required="true" transient="false"
	 * @generated
	 */
	Sheet getSheet();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.gridview.tousegridview.Row#getSheet <em>Sheet</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet</em>' container reference.
	 * @see #getSheet()
	 * @generated
	 */
	void setSheet(Sheet value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Cell getCell(Column column);

} // Row
