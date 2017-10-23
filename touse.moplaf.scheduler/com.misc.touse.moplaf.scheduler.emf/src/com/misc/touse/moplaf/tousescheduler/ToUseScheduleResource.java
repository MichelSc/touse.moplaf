/**
 */
package com.misc.touse.moplaf.tousescheduler;

import com.misc.common.moplaf.scheduler.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Use Schedule Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource#getVehicle <em>Vehicle</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource#getDistanceFromLast <em>Distance From Last</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource#getTotalDistance <em>Total Distance</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource#isVolumeOverload <em>Volume Overload</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseScheduleResource()
 * @model
 * @generated
 */
public interface ToUseScheduleResource extends Resource {
	/**
	 * Returns the value of the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vehicle</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle</em>' reference.
	 * @see #setVehicle(Vehicle)
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseScheduleResource_Vehicle()
	 * @model required="true"
	 * @generated
	 */
	Vehicle getVehicle();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource#getVehicle <em>Vehicle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle</em>' reference.
	 * @see #getVehicle()
	 * @generated
	 */
	void setVehicle(Vehicle value);

	/**
	 * Returns the value of the '<em><b>Distance From Last</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance From Last</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance From Last</em>' attribute.
	 * @see #setDistanceFromLast(float)
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseScheduleResource_DistanceFromLast()
	 * @model
	 * @generated
	 */
	float getDistanceFromLast();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource#getDistanceFromLast <em>Distance From Last</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance From Last</em>' attribute.
	 * @see #getDistanceFromLast()
	 * @generated
	 */
	void setDistanceFromLast(float value);

	/**
	 * Returns the value of the '<em><b>Total Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Distance</em>' attribute.
	 * @see #setTotalDistance(float)
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseScheduleResource_TotalDistance()
	 * @model
	 * @generated
	 */
	float getTotalDistance();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource#getTotalDistance <em>Total Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Distance</em>' attribute.
	 * @see #getTotalDistance()
	 * @generated
	 */
	void setTotalDistance(float value);

	/**
	 * Returns the value of the '<em><b>Volume Overload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume Overload</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume Overload</em>' attribute.
	 * @see #setVolumeOverload(boolean)
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseScheduleResource_VolumeOverload()
	 * @model
	 * @generated
	 */
	boolean isVolumeOverload();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource#isVolumeOverload <em>Volume Overload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume Overload</em>' attribute.
	 * @see #isVolumeOverload()
	 * @generated
	 */
	void setVolumeOverload(boolean value);

} // ToUseScheduleResource
