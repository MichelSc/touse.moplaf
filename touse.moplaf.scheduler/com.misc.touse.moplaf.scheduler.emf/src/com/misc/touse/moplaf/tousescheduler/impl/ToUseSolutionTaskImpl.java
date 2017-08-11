/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.common.moplaf.scheduler.TaskCandidateDateExpression;
import com.misc.common.moplaf.scheduler.TaskCandidateFloatExpression;
import com.misc.common.moplaf.scheduler.impl.SolutionTaskImpl;
import com.misc.common.moplaf.scheduler.util.Util;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;
import com.misc.touse.moplaf.tousescheduler.ToUseSolutionTask;
import com.misc.touse.moplaf.tousescheduler.ToUseTask;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
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
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected TaskCandidateFloatExpression distance;
	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' containment reference.
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
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistance(TaskCandidateFloatExpression newDistance, NotificationChain msgs) {
		TaskCandidateFloatExpression oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_SOLUTION_TASK__DISTANCE, oldDistance, newDistance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance(TaskCandidateFloatExpression newDistance) {
		if (newDistance != distance) {
			NotificationChain msgs = null;
			if (distance != null)
				msgs = ((InternalEObject)distance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToUseSchedulerPackage.TO_USE_SOLUTION_TASK__DISTANCE, null, msgs);
			if (newDistance != null)
				msgs = ((InternalEObject)newDistance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToUseSchedulerPackage.TO_USE_SOLUTION_TASK__DISTANCE, null, msgs);
			msgs = basicSetDistance(newDistance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_SOLUTION_TASK__DISTANCE, newDistance, newDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskCandidateDateExpression getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTime(TaskCandidateDateExpression newTime, NotificationChain msgs) {
		TaskCandidateDateExpression oldTime = time;
		time = newTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_SOLUTION_TASK__TIME, oldTime, newTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(TaskCandidateDateExpression newTime) {
		if (newTime != time) {
			NotificationChain msgs = null;
			if (time != null)
				msgs = ((InternalEObject)time).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToUseSchedulerPackage.TO_USE_SOLUTION_TASK__TIME, null, msgs);
			if (newTime != null)
				msgs = ((InternalEObject)newTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToUseSchedulerPackage.TO_USE_SOLUTION_TASK__TIME, null, msgs);
			msgs = basicSetTime(newTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_SOLUTION_TASK__TIME, newTime, newTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToUseSchedulerPackage.TO_USE_SOLUTION_TASK__DISTANCE:
				return basicSetDistance(null, msgs);
			case ToUseSchedulerPackage.TO_USE_SOLUTION_TASK__TIME:
				return basicSetTime(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
				return getDistance();
			case ToUseSchedulerPackage.TO_USE_SOLUTION_TASK__TIME:
				return getTime();
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
		this.setTime(Util.addDateExpression(this, "time"));
	}
	
	

} //ToUseSolutionTaskImpl
