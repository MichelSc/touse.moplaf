/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.scheduler.Resource;
import com.misc.common.moplaf.scheduler.ScheduleAfter;
import com.misc.common.moplaf.scheduler.SchedulerFactory;
import com.misc.common.moplaf.scheduler.Task;
import com.misc.touse.moplaf.tousescheduler.Shipment;
import com.misc.touse.moplaf.tousescheduler.ToUseLoadShipment;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedule;
import com.misc.touse.moplaf.tousescheduler.ToUseScheduleLoadUnload;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;
import com.misc.touse.moplaf.tousescheduler.ToUseUnloadShipment;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Use Schedule Load Unload</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ToUseScheduleLoadUnloadImpl extends ToUseActionLoadUnloadImpl implements ToUseScheduleLoadUnload {
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

	@Override
	public String getDescription() {
		Shipment shipment = this.getShipment();
		String description = String.format("Schedule(%s)", 
				                           shipment==null ? "null" : shipment.getName() );
		return description;
	}
	
	@Override
	public EnabledFeedback getValidFeedback() {
		EnabledFeedback super_enabled = super.getValidFeedback();
		if ( !super_enabled.isEnabled() ) {
			return super_enabled;
		}
		
		Shipment shipment = this.getShipment();
		if ( shipment==null) {
			return new EnabledFeedback(false, "No Shipment selected");
		}
		
		return EnabledFeedback.NOFEEDBACK;
	}
	

	@Override
	protected void initializeImpl() {
		assert this.getValidFeedback().isEnabled() : "Action is not valid";
		
		ToUseSchedule schedule = (ToUseSchedule) this.getCurrentSolution().getSolution();
		Shipment shipment = this.getShipment();
		ToUseLoadShipment loadTask = schedule.getTaskLoad(shipment);
		ToUseUnloadShipment unloadTask = loadTask.getUnloadShipment();
		
		if ( loadTask.isScheduled() ) {
			if ( unloadTask.isScheduled() ) {
				// nothing to do
			} else {
				// schedule the unload on the same resource as the load, and after this latter
				// TODO
			}
		} else {
			if ( unloadTask.isScheduled() ) {
				// schedule the load on the same resource as the unload, but before
				// TODO
			} else {
				// both are not scheduled, schedule both on some resource
				for (Resource resource : schedule.getResources() ) {
					Task loadInsertionPoint = null;
					do {
						// schedule load
						ScheduleAfter scheduleLoad = SchedulerFactory.eINSTANCE.createScheduleAfter();
						scheduleLoad.setInsertionPoint(loadInsertionPoint);
						scheduleLoad.setResource(resource);
						scheduleLoad.setTaskToSchedule(loadTask);
						scheduleLoad.setSolution(false);
						this.getStartDeltas().add(scheduleLoad);
						
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
							scheduleUnload.setSolution(true);
							scheduleLoad.getNextDeltas().add(scheduleUnload);
							// loop control over the unload insertion points
							unloadInsertionPoint = unloadInsertionPoint == loadTask
									             ? loadInsertionPoint
									             : unloadInsertionPoint.getNextTask();
						} while ( unloadInsertionPoint !=null );
						
					} while (loadInsertionPoint !=null);
				}  // traverse the Resources
			}
		}
		
	} // crerateDeltasImpl

} //ToUseScheduleLoadUnloadImpl
