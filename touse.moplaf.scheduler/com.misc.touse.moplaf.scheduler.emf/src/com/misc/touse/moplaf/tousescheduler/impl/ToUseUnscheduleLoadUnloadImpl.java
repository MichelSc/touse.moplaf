/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.common.moplaf.scheduler.SchedulerFactory;
import com.misc.common.moplaf.scheduler.Unschedule;
import com.misc.touse.moplaf.tousescheduler.ToUseLoadShipment;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedule;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;
import com.misc.touse.moplaf.tousescheduler.ToUseUnloadShipment;
import com.misc.touse.moplaf.tousescheduler.ToUseUnscheduleLoadUnload;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Use Unschedule Load Unload</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ToUseUnscheduleLoadUnloadImpl extends ToUseActionLoadUnloadImpl implements ToUseUnscheduleLoadUnload {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUseUnscheduleLoadUnloadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseSchedulerPackage.Literals.TO_USE_UNSCHEDULE_LOAD_UNLOAD;
	}
	
	@Override
	public String getDescription() {
		ToUseLoadShipment task = this.getLoadTask();
		String description = String.format("Unschedule(%s)", 
				                           task==null ? "null" : task.getName());
		return description;
	}

	@Override
	protected void createMovesImpl() {
		assert this.isValid() : "Action is not valid";
		
		ToUseSchedule schedule = (ToUseSchedule) this.getSolution();
		ToUseLoadShipment loadTask = this.getLoadTask();
		ToUseUnloadShipment unloadTask = loadTask.getUnloadShipment();
		
		// unschedule unload
		Unschedule unschedule_unload = SchedulerFactory.eINSTANCE.createUnschedule();
		unschedule_unload.setTaskToSchedule(unloadTask);
		this.getRootMoves().add(unschedule_unload);

		// unschedule load
		Unschedule unschedule_load= SchedulerFactory.eINSTANCE.createUnschedule();
		unschedule_load.setTaskToSchedule(loadTask);
		unschedule_unload.getNextMoves().add(unschedule_load);
	} // crerateMovesImpl


} //ToUseUnscheduleLoadUnloadImpl
