/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.common.moplaf.scheduler.Resource;
import com.misc.common.moplaf.scheduler.ScheduleAfter;
import com.misc.common.moplaf.scheduler.ScheduleFirst;
import com.misc.common.moplaf.scheduler.SchedulerFactory;
import com.misc.common.moplaf.scheduler.Task;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedule;
import com.misc.touse.moplaf.tousescheduler.ToUseScheduleLoadUnload;
import com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;

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
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseScheduleLoadUnloadImpl#getUnloadTask <em>Unload Task</em>}</li>
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
	protected ToUseScheduleTask loadTask;

	/**
	 * The cached value of the '{@link #getUnloadTask() <em>Unload Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnloadTask()
	 * @generated
	 * @ordered
	 */
	protected ToUseScheduleTask unloadTask;

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
	public ToUseScheduleTask getLoadTask() {
		if (loadTask != null && loadTask.eIsProxy()) {
			InternalEObject oldLoadTask = (InternalEObject)loadTask;
			loadTask = (ToUseScheduleTask)eResolveProxy(oldLoadTask);
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
	public ToUseScheduleTask basicGetLoadTask() {
		return loadTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadTask(ToUseScheduleTask newLoadTask) {
		ToUseScheduleTask oldLoadTask = loadTask;
		loadTask = newLoadTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_SCHEDULE_LOAD_UNLOAD__LOAD_TASK, oldLoadTask, loadTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseScheduleTask getUnloadTask() {
		if (unloadTask != null && unloadTask.eIsProxy()) {
			InternalEObject oldUnloadTask = (InternalEObject)unloadTask;
			unloadTask = (ToUseScheduleTask)eResolveProxy(oldUnloadTask);
			if (unloadTask != oldUnloadTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToUseSchedulerPackage.TO_USE_SCHEDULE_LOAD_UNLOAD__UNLOAD_TASK, oldUnloadTask, unloadTask));
			}
		}
		return unloadTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseScheduleTask basicGetUnloadTask() {
		return unloadTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnloadTask(ToUseScheduleTask newUnloadTask) {
		ToUseScheduleTask oldUnloadTask = unloadTask;
		unloadTask = newUnloadTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_SCHEDULE_LOAD_UNLOAD__UNLOAD_TASK, oldUnloadTask, unloadTask));
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
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_LOAD_UNLOAD__UNLOAD_TASK:
				if (resolve) return getUnloadTask();
				return basicGetUnloadTask();
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
				setLoadTask((ToUseScheduleTask)newValue);
				return;
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_LOAD_UNLOAD__UNLOAD_TASK:
				setUnloadTask((ToUseScheduleTask)newValue);
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
				setLoadTask((ToUseScheduleTask)null);
				return;
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_LOAD_UNLOAD__UNLOAD_TASK:
				setUnloadTask((ToUseScheduleTask)null);
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
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_LOAD_UNLOAD__UNLOAD_TASK:
				return unloadTask != null;
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
		if ( this.getUnloadTask()==null) {
			return "No unload task";
		}
		return null;
	}

	@Override
	public String getDescription() {
		String description = "Schedule load/unload";
		return description;
	}

	@Override
	protected void createMovesImpl() {
		assert this.isValid() : "Action is not valid";
		
		ToUseSchedule schedule = (ToUseSchedule) this.getCurrentSolution();
		ToUseScheduleTask loadTask= this.getLoadTask();
		ToUseScheduleTask unloadTask= this.getUnloadTask();
		
		for (Resource resource : schedule.getResources() ) {
			
			ScheduleFirst scheduleLoad = SchedulerFactory.eINSTANCE.createScheduleFirst();
			scheduleLoad.setInsertionPoint(resource);
			scheduleLoad.setTaskToSchedule(loadTask);
			this.getRootMoves().add(scheduleLoad);
			
			ScheduleAfter scheduleUnload = SchedulerFactory.eINSTANCE.createScheduleAfter();
			scheduleUnload.setInsertionPoint(loadTask);
			scheduleUnload.setTaskToSchedule(unloadTask);
			scheduleLoad.getNextMoves().add(scheduleUnload);
			
			current_before = 
		}
		
	}
	
	
	
	
	

} //ToUseScheduleLoadUnloadImpl
