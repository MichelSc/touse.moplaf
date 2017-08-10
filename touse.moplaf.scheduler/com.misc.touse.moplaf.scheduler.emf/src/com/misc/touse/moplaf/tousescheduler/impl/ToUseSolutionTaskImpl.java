/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.common.moplaf.scheduler.SchedulerFactory;
import com.misc.common.moplaf.scheduler.TaskCandidateDateExpression;
import com.misc.common.moplaf.scheduler.TaskCandidateFloatExpression;
import com.misc.common.moplaf.scheduler.impl.SolutionTaskImpl;
import com.misc.common.moplaf.scheduler.util.Util;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;
import com.misc.touse.moplaf.tousescheduler.ToUseSolutionTask;
import com.misc.touse.moplaf.tousescheduler.ToUseTask;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Use Solution Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseSolutionTaskImpl#getToUseTask <em>To Use Task</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseSolutionTaskImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseSolutionTaskImpl#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToUseSolutionTaskImpl extends SolutionTaskImpl implements ToUseSolutionTask {
	/**
	 * The cached value of the '{@link #getToUseTask() <em>To Use Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToUseTask()
	 * @generated
	 * @ordered
	 */
	protected ToUseTask toUseTask;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected TaskCandidateFloatExpression distance;
	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected TaskCandidateDateExpression time;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUseSolutionTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseSchedulerPackage.Literals.TO_USE_SOLUTION_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseTask getToUseTask() {
		if (toUseTask != null && toUseTask.eIsProxy()) {
			InternalEObject oldToUseTask = (InternalEObject)toUseTask;
			toUseTask = (ToUseTask)eResolveProxy(oldToUseTask);
			if (toUseTask != oldToUseTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToUseSchedulerPackage.TO_USE_SOLUTION_TASK__TO_USE_TASK, oldToUseTask, toUseTask));
			}
		}
		return toUseTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseTask basicGetToUseTask() {
		return toUseTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToUseTask(ToUseTask newToUseTask) {
		ToUseTask oldToUseTask = toUseTask;
		toUseTask = newToUseTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_SOLUTION_TASK__TO_USE_TASK, oldToUseTask, toUseTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskCandidateFloatExpression getDistance() {
		if (distance != null && distance.eIsProxy()) {
			InternalEObject oldDistance = (InternalEObject)distance;
			distance = (TaskCandidateFloatExpression)eResolveProxy(oldDistance);
			if (distance != oldDistance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToUseSchedulerPackage.TO_USE_SOLUTION_TASK__DISTANCE, oldDistance, distance));
			}
		}
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskCandidateFloatExpression basicGetDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance(TaskCandidateFloatExpression newDistance) {
		TaskCandidateFloatExpression oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_SOLUTION_TASK__DISTANCE, oldDistance, distance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskCandidateDateExpression getTime() {
		if (time != null && time.eIsProxy()) {
			InternalEObject oldTime = (InternalEObject)time;
			time = (TaskCandidateDateExpression)eResolveProxy(oldTime);
			if (time != oldTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToUseSchedulerPackage.TO_USE_SOLUTION_TASK__TIME, oldTime, time));
			}
		}
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskCandidateDateExpression basicGetTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(TaskCandidateDateExpression newTime) {
		TaskCandidateDateExpression oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_SOLUTION_TASK__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUseSchedulerPackage.TO_USE_SOLUTION_TASK__TO_USE_TASK:
				if (resolve) return getToUseTask();
				return basicGetToUseTask();
			case ToUseSchedulerPackage.TO_USE_SOLUTION_TASK__DISTANCE:
				if (resolve) return getDistance();
				return basicGetDistance();
			case ToUseSchedulerPackage.TO_USE_SOLUTION_TASK__TIME:
				if (resolve) return getTime();
				return basicGetTime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ToUseSchedulerPackage.TO_USE_SOLUTION_TASK__TO_USE_TASK:
				setToUseTask((ToUseTask)newValue);
				return;
			case ToUseSchedulerPackage.TO_USE_SOLUTION_TASK__DISTANCE:
				setDistance((TaskCandidateFloatExpression)newValue);
				return;
			case ToUseSchedulerPackage.TO_USE_SOLUTION_TASK__TIME:
				setTime((TaskCandidateDateExpression)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ToUseSchedulerPackage.TO_USE_SOLUTION_TASK__TO_USE_TASK:
				setToUseTask((ToUseTask)null);
				return;
			case ToUseSchedulerPackage.TO_USE_SOLUTION_TASK__DISTANCE:
				setDistance((TaskCandidateFloatExpression)null);
				return;
			case ToUseSchedulerPackage.TO_USE_SOLUTION_TASK__TIME:
				setTime((TaskCandidateDateExpression)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ToUseSchedulerPackage.TO_USE_SOLUTION_TASK__TO_USE_TASK:
				return toUseTask != null;
			case ToUseSchedulerPackage.TO_USE_SOLUTION_TASK__DISTANCE:
				return distance != null;
			case ToUseSchedulerPackage.TO_USE_SOLUTION_TASK__TIME:
				return time != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * 
	 */
	@Override
	public void constructExpressions() {
		super.constructExpressions();

		this.setDistance(Util.addFloatExpression(this, "distance"));
	}
	
	

} //ToUseSolutionTaskImpl
