/**
 */
package com.misc.touse.moplaf.timeview.tousetimeview;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.timeview.tousetimeview.Object#getSubObjects <em>Sub Objects</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeview.tousetimeview.Object#getTimeLines <em>Time Lines</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeview.tousetimeview.Object#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.timeview.tousetimeview.ToUseTimeViewPackage#getObject()
 * @model
 * @generated
 */
public interface Object extends EObject {
	/**
	 * Returns the value of the '<em><b>Sub Objects</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.timeview.tousetimeview.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Objects</em>' containment reference list.
	 * @see com.misc.touse.moplaf.timeview.tousetimeview.ToUseTimeViewPackage#getObject_SubObjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<Object> getSubObjects();

	/**
	 * Returns the value of the '<em><b>Time Lines</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.timeview.tousetimeview.TimeLine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Lines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Lines</em>' containment reference list.
	 * @see com.misc.touse.moplaf.timeview.tousetimeview.ToUseTimeViewPackage#getObject_TimeLines()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimeLine> getTimeLines();

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
	 * @see com.misc.touse.moplaf.timeview.tousetimeview.ToUseTimeViewPackage#getObject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.timeview.tousetimeview.Object#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Object
