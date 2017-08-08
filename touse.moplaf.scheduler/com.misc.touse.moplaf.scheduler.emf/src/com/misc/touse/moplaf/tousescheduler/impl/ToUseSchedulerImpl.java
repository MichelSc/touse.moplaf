/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.common.moplaf.scheduler.SolutionResource;
import com.misc.common.moplaf.scheduler.SolutionTask;
import com.misc.common.moplaf.scheduler.impl.SchedulerImpl;
import com.misc.touse.moplaf.tousescheduler.ToUseResource;
import com.misc.touse.moplaf.tousescheduler.ToUseScheduler;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerFactory;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;
import com.misc.touse.moplaf.tousescheduler.ToUseSolutionResource;
import com.misc.touse.moplaf.tousescheduler.ToUseSolutionTask;
import com.misc.touse.moplaf.tousescheduler.ToUseTask;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Use Scheduler</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ToUseSchedulerImpl extends SchedulerImpl implements ToUseScheduler {
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

	@Override
	public SolutionTask constructTask(EObject task) {
		if ( task instanceof ToUseTask) {
			ToUseTask to_use_task = (ToUseTask)task;
			ToUseSolutionTask new_solution_task = ToUseSchedulerFactory.eINSTANCE.createToUseSolutionTask();
			new_solution_task.setName(to_use_task.getName());
			new_solution_task.setTask(to_use_task);
			return new_solution_task;
		}
		return null;
	}

	@Override
	public SolutionResource constructResource(EObject resource) {
		if ( resource instanceof ToUseResource) {
			ToUseResource to_use_resource = (ToUseResource)resource;
			ToUseSolutionResource new_solution_resource = ToUseSchedulerFactory.eINSTANCE.createToUseSolutionResource();
			new_solution_resource.setName(to_use_resource.getName());
			new_solution_resource.setResource(to_use_resource);
			return new_solution_resource;
		}
		return null;
	}
	
	

} //ToUseSchedulerImpl
