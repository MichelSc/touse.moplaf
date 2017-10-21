/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.common.moplaf.scheduler.Resource;
import com.misc.common.moplaf.scheduler.ScheduleAfter;
import com.misc.common.moplaf.scheduler.SchedulerFactory;
import com.misc.common.moplaf.scheduler.Task;
import com.misc.touse.moplaf.tousescheduler.ToUseLoadShipment;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedule;
import com.misc.touse.moplaf.tousescheduler.ToUseScheduleLoadUnload;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;
import com.misc.touse.moplaf.tousescheduler.ToUseUnloadShipment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Use Schedule Load Unload</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseScheduleLoadUnloadImpl#getLoadTask <em>Load Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToUseScheduleLoadUnloadImpl extends ToUseActionImpl implements ToUseScheduleLoadUnload {
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
	protected ToUseScheduleLoadUnloadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseSchedulerPackage.Literals.TO_USE_SCHEDULE_LOAD_UNLOAD;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToUseSchedulerPackage.TO_USE_SCHEDULE_LOAD_UNLOAD__LOAD_TASK, oldLoadTask, loadTask));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_SCHEDULE_LOAD_UNLOAD__LOAD_TASK, oldLoadTask, loadTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_LOAD_UNLOAD__LOAD_TASK:
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
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_LOAD_UNLOAD__LOAD_TASK:
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
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_LOAD_UNLOAD__LOAD_TASK:
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
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_LOAD_UNLOAD__LOAD_TASK:
				return loadTask != null;
		}
		return super.eIsSet(featureID);
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

	@Override
	public String getDescription() {
		ToUseLoadShipment task = this.getLoadTask();
		String description = String.format("Schedule(%s)", 
				                           task==null ? "null" : task.getName());
		return description;
	}

	@Override
	protected void createMovesImpl() {
		assert this.isValid() : "Action is not valid";
		
		ToUseSchedule schedule = (ToUseSchedule) this.getSolution();
		ToUseLoadShipment loadTask = this.getLoadTask();
		ToUseUnloadShipment unloadTask = loadTask.getUnloadShipment();
		
		for (Resource resource : schedule.getResources() ) {
			Task loadInsertionPoint = null;
			do {
				// schedule load
				ScheduleAfter scheduleLoad = SchedulerFactory.eINSTANCE.createScheduleAfter();
				scheduleLoad.setInsertionPoint(loadInsertionPoint);
				scheduleLoad.setResource(resource);
				scheduleLoad.setTaskToSchedule(loadTask);
				this.getRootMoves().add(scheduleLoad);
				
				// loop control over the load insertions points
				loadInsertionPoint = loadInsertionPoint==null
						           ? resource.getFirstTask()
							       : loadInsertionPoint.getNextTask();

				// schedule unload
				Task unloadInsertionPoint = loadTask;
				do {
					ScheduleAfter scheduleUnload = SchedulerFactory.eINSTANCE.createScheduleAfter();
					scheduleUnload.setInsertionPoint(unloadInsertionPoint);
					scheduleUnload.setResource(resource);
					scheduleUnload.setTaskToSchedule(unloadTask);
					scheduleLoad.getNextMoves().add(scheduleUnload);
					// loop control over the unload insertion points
					unloadInsertionPoint = unloadInsertionPoint == loadTask
							             ? loadInsertionPoint
							             : unloadInsertionPoint.getNextTask();
				} while ( unloadInsertionPoint !=null );
				
			} while (loadInsertionPoint !=null);
		}  // traverse the Resources 
	} // crerateMovesImpl

} //ToUseScheduleLoadUnloadImpl
