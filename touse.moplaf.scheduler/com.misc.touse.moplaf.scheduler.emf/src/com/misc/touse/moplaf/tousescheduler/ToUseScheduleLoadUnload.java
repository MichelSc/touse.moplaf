/**
 */
package com.misc.touse.moplaf.tousescheduler;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Use Schedule Load Unload</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleLoadUnload#getLoadTask <em>Load Task</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseScheduleLoadUnload()
 * @model
 * @generated
 */
public interface ToUseScheduleLoadUnload extends ToUseAction {
	/**
	 * Returns the value of the '<em><b>Load Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Task</em>' reference.
	 * @see #setLoadTask(ToUseLoadShipment)
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseScheduleLoadUnload_LoadTask()
	 * @model required="true"
	 * @generated
	 */
	ToUseLoadShipment getLoadTask();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleLoadUnload#getLoadTask <em>Load Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Task</em>' reference.
	 * @see #getLoadTask()
	 * @generated
	 */
	void setLoadTask(ToUseLoadShipment value);

} // ToUseScheduleLoadUnload
