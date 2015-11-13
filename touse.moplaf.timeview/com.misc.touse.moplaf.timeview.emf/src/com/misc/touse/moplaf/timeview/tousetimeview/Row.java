/**
 */
package com.misc.touse.moplaf.timeview.tousetimeview;

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
 *   <li>{@link com.misc.touse.moplaf.timeview.tousetimeview.Row#getSubRows <em>Sub Rows</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeview.tousetimeview.Row#getNodes <em>Nodes</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeview.tousetimeview.Row#getText <em>Text</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeview.tousetimeview.Row#getForeground <em>Foreground</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeview.tousetimeview.Row#getBackground <em>Background</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.timeview.tousetimeview.TousetimeviewPackage#getRow()
 * @model
 * @generated
 */
public interface Row extends EObject {
	/**
	 * Returns the value of the '<em><b>Sub Rows</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.timeview.tousetimeview.Row}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Rows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Rows</em>' containment reference list.
	 * @see com.misc.touse.moplaf.timeview.tousetimeview.TousetimeviewPackage#getRow_SubRows()
	 * @model containment="true"
	 * @generated
	 */
	EList<Row> getSubRows();

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.timeview.tousetimeview.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see com.misc.touse.moplaf.timeview.tousetimeview.TousetimeviewPackage#getRow_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see com.misc.touse.moplaf.timeview.tousetimeview.TousetimeviewPackage#getRow_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.timeview.tousetimeview.Row#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Foreground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreground</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreground</em>' attribute.
	 * @see #setForeground(int)
	 * @see com.misc.touse.moplaf.timeview.tousetimeview.TousetimeviewPackage#getRow_Foreground()
	 * @model
	 * @generated
	 */
	int getForeground();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.timeview.tousetimeview.Row#getForeground <em>Foreground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreground</em>' attribute.
	 * @see #getForeground()
	 * @generated
	 */
	void setForeground(int value);

	/**
	 * Returns the value of the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background</em>' attribute.
	 * @see #setBackground(int)
	 * @see com.misc.touse.moplaf.timeview.tousetimeview.TousetimeviewPackage#getRow_Background()
	 * @model
	 * @generated
	 */
	int getBackground();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.timeview.tousetimeview.Row#getBackground <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background</em>' attribute.
	 * @see #getBackground()
	 * @generated
	 */
	void setBackground(int value);

} // Row
