/**
 */
package com.misc.touse.moplaf.gridview.tousegridview;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.gridview.tousegridview.Column#getIndex <em>Index</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.gridview.tousegridview.Column#getCells <em>Cells</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.gridview.tousegridview.Column#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.gridview.tousegridview.ToUseGridViewPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends EObject {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(long)
	 * @see com.misc.touse.moplaf.gridview.tousegridview.ToUseGridViewPackage#getColumn_Index()
	 * @model
	 * @generated
	 */
	long getIndex();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.gridview.tousegridview.Column#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(long value);

	/**
	 * Returns the value of the '<em><b>Cells</b></em>' reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.gridview.tousegridview.Cell}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cells</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cells</em>' reference list.
	 * @see com.misc.touse.moplaf.gridview.tousegridview.ToUseGridViewPackage#getColumn_Cells()
	 * @model
	 * @generated
	 */
	EList<Cell> getCells();

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(int)
	 * @see com.misc.touse.moplaf.gridview.tousegridview.ToUseGridViewPackage#getColumn_Color()
	 * @model
	 * @generated
	 */
	int getColor();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.gridview.tousegridview.Column#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(int value);

} // Column
