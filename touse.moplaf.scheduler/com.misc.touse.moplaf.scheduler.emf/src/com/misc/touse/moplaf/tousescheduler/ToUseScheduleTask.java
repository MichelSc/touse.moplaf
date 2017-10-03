/**
 */
package com.misc.touse.moplaf.tousescheduler;

import com.misc.common.moplaf.scheduler.Task;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Use Schedule Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask#getToUseTask <em>To Use Task</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseScheduleTask()
 * @model
 * @generated
 */
public interface ToUseScheduleTask extends Task {
	/**
	 * Returns the value of the '<em><b>To Use Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Use Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Use Task</em>' reference.
	 * @see #setToUseTask(ToUseTask)
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseScheduleTask_ToUseTask()
	 * @model required="true"
	 * @generated
	 */
	ToUseTask getToUseTask();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask#getToUseTask <em>To Use Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Use Task</em>' reference.
	 * @see #getToUseTask()
	 * @generated
	 */
	void setToUseTask(ToUseTask value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(float)
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseScheduleTask_Distance()
	 * @model
	 * @generated
	 */
	float getDistance();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(float value);

} // ToUseScheduleTask
