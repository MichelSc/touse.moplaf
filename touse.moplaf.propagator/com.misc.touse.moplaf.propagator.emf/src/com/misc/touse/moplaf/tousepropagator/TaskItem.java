/**
 */
package com.misc.touse.moplaf.tousepropagator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator.TaskItem#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator.TaskItem#getHours <em>Hours</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousepropagator.ToUsePropagatorPackage#getTaskItem()
 * @model
 * @generated
 */
public interface TaskItem extends EObject {
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
	 * @see com.misc.touse.moplaf.tousepropagator.ToUsePropagatorPackage#getTaskItem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousepropagator.TaskItem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hours</em>' attribute.
	 * @see #setHours(float)
	 * @see com.misc.touse.moplaf.tousepropagator.ToUsePropagatorPackage#getTaskItem_Hours()
	 * @model
	 * @generated
	 */
	float getHours();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousepropagator.TaskItem#getHours <em>Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hours</em>' attribute.
	 * @see #getHours()
	 * @generated
	 */
	void setHours(float value);

} // TaskItem
