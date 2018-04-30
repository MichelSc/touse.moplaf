/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.common.moplaf.scheduler.SchedulerFactory;
import com.misc.common.moplaf.scheduler.Unschedule;
import com.misc.touse.moplaf.tousescheduler.Shipment;
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
		Shipment shipment = this.getShipment();
		String description = String.format("Unschedule(%s)", 
				                           shipment==null ? "null" : shipment.getName() );
		return description;
	}

	@Override
	protected void initializeImpl() {
		assert this.getValidFeedback().isEnabled() : "Action is not valid";
		
		ToUseSchedule schedule = (ToUseSchedule) this.getCurrentSolution();
		Shipment shipment = this.getShipment();
		ToUseLoadShipment loadTask = schedule.getTaskLoad(shipment);
		ToUseUnloadShipment unloadTask = loadTask.getUnloadShipment();
		
		// unschedule unload
		Unschedule unschedule_unload = SchedulerFactory.eINSTANCE.createUnschedule();
		unschedule_unload.setTaskToSchedule(unloadTask);
		unschedule_unload.setSolution(false);
		this.getStartDeltas().add(unschedule_unload);

		// unschedule load
		Unschedule unschedule_load= SchedulerFactory.eINSTANCE.createUnschedule();
		unschedule_load.setTaskToSchedule(loadTask);
		unschedule_load.setSolution(true);
		unschedule_unload.getNextDeltas().add(unschedule_load);
		
		// make the solution ready for calculating scores
		schedule.enable();
	} // crerateMovesImpl


} //ToUseUnscheduleLoadUnloadImpl
