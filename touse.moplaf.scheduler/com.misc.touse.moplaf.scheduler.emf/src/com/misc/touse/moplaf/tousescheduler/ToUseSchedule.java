/**
 */
package com.misc.touse.moplaf.tousescheduler;

import com.misc.common.moplaf.scheduler.Schedule;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Use Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseSchedule()
 * @model
 * @generated
 */
public interface ToUseSchedule extends Schedule {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void enable();

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
