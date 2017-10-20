/**
 */
package com.misc.touse.moplaf.tousescheduler;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.Vehicle#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.Vehicle#getHomeLocationX <em>Home Location X</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.Vehicle#getHomeLocationY <em>Home Location Y</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getVehicle()
 * @model
 * @generated
 */
public interface Vehicle extends EObject {
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
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getVehicle_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousescheduler.Vehicle#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Home Location X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Home Location X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home Location X</em>' attribute.
	 * @see #setHomeLocationX(float)
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getVehicle_HomeLocationX()
	 * @model
	 * @generated
	 */
	float getHomeLocationX();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousescheduler.Vehicle#getHomeLocationX <em>Home Location X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home Location X</em>' attribute.
	 * @see #getHomeLocationX()
	 * @generated
	 */
	void setHomeLocationX(float value);

	/**
	 * Returns the value of the '<em><b>Home Location Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Home Location Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home Location Y</em>' attribute.
	 * @see #setHomeLocationY(float)
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getVehicle_HomeLocationY()
	 * @model
	 * @generated
	 */
	float getHomeLocationY();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousescheduler.Vehicle#getHomeLocationY <em>Home Location Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home Location Y</em>' attribute.
	 * @see #getHomeLocationY()
	 * @generated
	 */
	void setHomeLocationY(float value);

} // Vehicle
