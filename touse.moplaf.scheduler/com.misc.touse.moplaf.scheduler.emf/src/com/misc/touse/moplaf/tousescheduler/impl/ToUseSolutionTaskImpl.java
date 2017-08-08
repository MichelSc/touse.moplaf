/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.common.moplaf.scheduler.impl.SolutionTaskImpl;

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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUseSchedulerPackage.TO_USE_SOLUTION_TASK__TO_USE_TASK:
				if (resolve) return getToUseTask();
				return basicGetToUseTask();
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
		}
		return super.eIsSet(featureID);
	}

} //ToUseSolutionTaskImpl
