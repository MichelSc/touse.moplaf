/**
 */
package com.misc.touse.moplaf.tousescheduler;

import com.misc.common.moplaf.scheduler.Schedule;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Use Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.ToUseSchedule#getToUseScore <em>To Use Score</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseSchedule()
 * @model
 * @generated
 */
public interface ToUseSchedule extends Schedule {

	/**
	 * Returns the value of the '<em><b>To Use Score</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Use Score</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Use Score</em>' reference.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseSchedule_ToUseScore()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	ToUseScore getToUseScore();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ToUseLoadShipment getTaskLoad(Shipment shipment);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ToUseUnloadShipment getTaskUnload(Shipment shipment);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ToUseScheduleResource getResourceVehicle(Vehicle vehicle);
} // ToUseSchedule
