/**
 */
package com.misc.touse.moplaf.tousescheduler;

import com.misc.common.moplaf.scheduler.Scheduler;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Use Scheduler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduler#getSchedulerResources <em>Scheduler Resources</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduler#getSchedulerTasks <em>Scheduler Tasks</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseScheduler()
 * @model
 * @generated
 */
public interface ToUseScheduler extends Scheduler {

	/**
	 * Returns the value of the '<em><b>Scheduler Resources</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduler Resources</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduler Resources</em>' reference.
	 * @see #setSchedulerResources(ToUseScheduleResource)
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseScheduler_SchedulerResources()
	 * @model
	 * @generated
	 */
	ToUseScheduleResource getSchedulerResources();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduler#getSchedulerResources <em>Scheduler Resources</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduler Resources</em>' reference.
	 * @see #getSchedulerResources()
	 * @generated
	 */
	void setSchedulerResources(ToUseScheduleResource value);

	/**
	 * Returns the value of the '<em><b>Scheduler Tasks</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduler Tasks</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduler Tasks</em>' reference.
	 * @see #setSchedulerTasks(ToUseScheduleTask)
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseScheduler_SchedulerTasks()
	 * @model
	 * @generated
	 */
	ToUseScheduleTask getSchedulerTasks();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduler#getSchedulerTasks <em>Scheduler Tasks</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduler Tasks</em>' reference.
	 * @see #getSchedulerTasks()
	 * @generated
	 */
	void setSchedulerTasks(ToUseScheduleTask value);
} // ToUseScheduler
