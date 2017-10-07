/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.common.moplaf.localsearch.Score;
import com.misc.common.moplaf.scheduler.impl.SchedulerImpl;
import com.misc.touse.moplaf.tousescheduler.ToUseResource;
import com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource;
import com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask;
import com.misc.touse.moplaf.tousescheduler.ToUseScheduler;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerFactory;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;
import com.misc.touse.moplaf.tousescheduler.ToUseTask;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Use Scheduler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerImpl#getSchedulerResources <em>Scheduler Resources</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerImpl#getSchedulerTasks <em>Scheduler Tasks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToUseSchedulerImpl extends SchedulerImpl implements ToUseScheduler {
	/**
	 * The cached value of the '{@link #getSchedulerResources() <em>Scheduler Resources</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulerResources()
	 * @generated
	 * @ordered
	 */
	protected ToUseScheduleResource schedulerResources;
	/**
	 * The cached value of the '{@link #getSchedulerTasks() <em>Scheduler Tasks</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulerTasks()
	 * @generated
	 * @ordered
	 */
	protected ToUseScheduleTask schedulerTasks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUseSchedulerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseSchedulerPackage.Literals.TO_USE_SCHEDULER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseScheduleResource getSchedulerResources() {
		if (schedulerResources != null && schedulerResources.eIsProxy()) {
			InternalEObject oldSchedulerResources = (InternalEObject)schedulerResources;
			schedulerResources = (ToUseScheduleResource)eResolveProxy(oldSchedulerResources);
			if (schedulerResources != oldSchedulerResources) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToUseSchedulerPackage.TO_USE_SCHEDULER__SCHEDULER_RESOURCES, oldSchedulerResources, schedulerResources));
			}
		}
		return schedulerResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseScheduleResource basicGetSchedulerResources() {
		return schedulerResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedulerResources(ToUseScheduleResource newSchedulerResources) {
		ToUseScheduleResource oldSchedulerResources = schedulerResources;
		schedulerResources = newSchedulerResources;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_SCHEDULER__SCHEDULER_RESOURCES, oldSchedulerResources, schedulerResources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseScheduleTask getSchedulerTasks() {
		if (schedulerTasks != null && schedulerTasks.eIsProxy()) {
			InternalEObject oldSchedulerTasks = (InternalEObject)schedulerTasks;
			schedulerTasks = (ToUseScheduleTask)eResolveProxy(oldSchedulerTasks);
			if (schedulerTasks != oldSchedulerTasks) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToUseSchedulerPackage.TO_USE_SCHEDULER__SCHEDULER_TASKS, oldSchedulerTasks, schedulerTasks));
			}
		}
		return schedulerTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseScheduleTask basicGetSchedulerTasks() {
		return schedulerTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedulerTasks(ToUseScheduleTask newSchedulerTasks) {
		ToUseScheduleTask oldSchedulerTasks = schedulerTasks;
		schedulerTasks = newSchedulerTasks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_SCHEDULER__SCHEDULER_TASKS, oldSchedulerTasks, schedulerTasks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUseSchedulerPackage.TO_USE_SCHEDULER__SCHEDULER_RESOURCES:
				if (resolve) return getSchedulerResources();
				return basicGetSchedulerResources();
			case ToUseSchedulerPackage.TO_USE_SCHEDULER__SCHEDULER_TASKS:
				if (resolve) return getSchedulerTasks();
				return basicGetSchedulerTasks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ToUseSchedulerPackage.TO_USE_SCHEDULER__SCHEDULER_RESOURCES:
				setSchedulerResources((ToUseScheduleResource)newValue);
				return;
			case ToUseSchedulerPackage.TO_USE_SCHEDULER__SCHEDULER_TASKS:
				setSchedulerTasks((ToUseScheduleTask)newValue);
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
			case ToUseSchedulerPackage.TO_USE_SCHEDULER__SCHEDULER_RESOURCES:
				setSchedulerResources((ToUseScheduleResource)null);
				return;
			case ToUseSchedulerPackage.TO_USE_SCHEDULER__SCHEDULER_TASKS:
				setSchedulerTasks((ToUseScheduleTask)null);
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
			case ToUseSchedulerPackage.TO_USE_SCHEDULER__SCHEDULER_RESOURCES:
				return schedulerResources != null;
			case ToUseSchedulerPackage.TO_USE_SCHEDULER__SCHEDULER_TASKS:
				return schedulerTasks != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public ToUseScheduleTask constructTask(EObject task) {
		if ( task instanceof ToUseTask) {
			ToUseTask to_use_task = (ToUseTask)task;
			ToUseScheduleTask new_solution_task = ToUseSchedulerFactory.eINSTANCE.createToUseScheduleTask();
			new_solution_task.setName(to_use_task.getName());
			new_solution_task.setTask(to_use_task);
			new_solution_task.setToUseTask(to_use_task);
			return new_solution_task;
		}
		return null;
	}

	@Override
	public ToUseScheduleResource constructResource(EObject resource) {
		if ( resource instanceof ToUseResource) {
			ToUseResource to_use_resource = (ToUseResource)resource;
			ToUseScheduleResource new_solution_resource = ToUseSchedulerFactory.eINSTANCE.createToUseScheduleResource();
			new_solution_resource.setName(to_use_resource.getName());
			new_solution_resource.setResource(to_use_resource);
			new_solution_resource.setToUseResource(to_use_resource);
			return new_solution_resource;
		}
		return null;
	}

	@Override
	public Score constructScore() {
		Score new_score = ToUseSchedulerFactory.eINSTANCE.createToUseScore();
		return new_score;
	}
	
	
	

} //ToUseSchedulerImpl
