/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.common.moplaf.localsearch.impl.ActionImpl;

import com.misc.touse.moplaf.tousescheduler.ToUseActionLoadUnload;
import com.misc.touse.moplaf.tousescheduler.ToUseLoadShipment;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Use Action Load Unload</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseActionLoadUnloadImpl#getLoadTask <em>Load Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ToUseActionLoadUnloadImpl extends ActionImpl implements ToUseActionLoadUnload {
	/**
	 * The cached value of the '{@link #getLoadTask() <em>Load Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadTask()
	 * @generated
	 * @ordered
	 */
	protected ToUseLoadShipment loadTask;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUseActionLoadUnloadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseSchedulerPackage.Literals.TO_USE_ACTION_LOAD_UNLOAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseLoadShipment getLoadTask() {
		if (loadTask != null && loadTask.eIsProxy()) {
			InternalEObject oldLoadTask = (InternalEObject)loadTask;
			loadTask = (ToUseLoadShipment)eResolveProxy(oldLoadTask);
			if (loadTask != oldLoadTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToUseSchedulerPackage.TO_USE_ACTION_LOAD_UNLOAD__LOAD_TASK, oldLoadTask, loadTask));
			}
		}
		return loadTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseLoadShipment basicGetLoadTask() {
		return loadTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadTask(ToUseLoadShipment newLoadTask) {
		ToUseLoadShipment oldLoadTask = loadTask;
		loadTask = newLoadTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_ACTION_LOAD_UNLOAD__LOAD_TASK, oldLoadTask, loadTask));
	}

	@Override
	public String getValidFeedback() {
		String superFeedback = super.getValidFeedback();
		if ( superFeedback!=null) {
			return superFeedback;
		}
		if ( this.getLoadTask()==null) {
			return "No load task";
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUseSchedulerPackage.TO_USE_ACTION_LOAD_UNLOAD__LOAD_TASK:
				if (resolve) return getLoadTask();
				return basicGetLoadTask();
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
			case ToUseSchedulerPackage.TO_USE_ACTION_LOAD_UNLOAD__LOAD_TASK:
				setLoadTask((ToUseLoadShipment)newValue);
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
			case ToUseSchedulerPackage.TO_USE_ACTION_LOAD_UNLOAD__LOAD_TASK:
				setLoadTask((ToUseLoadShipment)null);
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
			case ToUseSchedulerPackage.TO_USE_ACTION_LOAD_UNLOAD__LOAD_TASK:
				return loadTask != null;
		}
		return super.eIsSet(featureID);
	}

} //ToUseActionLoadUnloadImpl
