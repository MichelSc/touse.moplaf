/**
 */
package com.misc.touse.moplaf.tousescheduler;

import com.misc.common.moplaf.scheduler.SolutionTask;
import com.misc.common.moplaf.scheduler.TaskCandidateDateExpression;
import com.misc.common.moplaf.scheduler.TaskCandidateFloatExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Use Solution Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.ToUseSolutionTask#getToUseTask <em>To Use Task</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.ToUseSolutionTask#getDistance <em>Distance</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.ToUseSolutionTask#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseSolutionTask()
 * @model
 * @generated
 */
public interface ToUseSolutionTask extends SolutionTask {
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
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseSolutionTask_ToUseTask()
	 * @model required="true"
	 * @generated
	 */
	ToUseTask getToUseTask();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousescheduler.ToUseSolutionTask#getToUseTask <em>To Use Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Use Task</em>' reference.
	 * @see #getToUseTask()
	 * @generated
	 */
	void setToUseTask(ToUseTask value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' reference.
	 * @see #setDistance(TaskCandidateFloatExpression)
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseSolutionTask_Distance()
	 * @model
	 * @generated
	 */
	TaskCandidateFloatExpression getDistance();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousescheduler.ToUseSolutionTask#getDistance <em>Distance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' reference.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(TaskCandidateFloatExpression value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' reference.
	 * @see #setTime(TaskCandidateDateExpression)
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseSolutionTask_Time()
	 * @model
	 * @generated
	 */
	TaskCandidateDateExpression getTime();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousescheduler.ToUseSolutionTask#getTime <em>Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(TaskCandidateDateExpression value);

} // ToUseSolutionTask
