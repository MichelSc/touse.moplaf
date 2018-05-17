/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.common.moplaf.common.util.Util;
import com.misc.common.moplaf.localsearch.Score;
import com.misc.common.moplaf.scheduler.impl.ScheduleImpl;
import com.misc.touse.moplaf.tousescheduler.ScopeScheduleScore;
import com.misc.touse.moplaf.tousescheduler.Shipment;
import com.misc.touse.moplaf.tousescheduler.ToUseLoadShipment;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedule;
import com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource;
import com.misc.touse.moplaf.tousescheduler.ToUseScheduler;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerFactory;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;
import com.misc.touse.moplaf.tousescheduler.ToUseUnloadShipment;
import com.misc.touse.moplaf.tousescheduler.Vehicle;
import com.misc.touse.moplaf.tousescheduler.util.ToUseSchedulerPropagatorFunctionManager;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Use Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ToUseScheduleImpl extends ScheduleImpl implements ToUseSchedule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUseScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseSchedulerPackage.Literals.TO_USE_SCHEDULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public void enable() {
		Util.adapt(this, ToUseSchedulerPropagatorFunctionManager.class, true ); // true = create
	}
	
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ToUseLoadShipment getTaskLoad(Shipment shipment) {
		ToUseLoadShipment task = this.getTasks().stream()
				                                .filter(s -> s instanceof ToUseLoadShipment)
				                                .map ( s -> (ToUseLoadShipment)s)
				                                .filter( s -> s.getShipment()==shipment)
				                                .findFirst()
				                                .orElse(null);
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ToUseUnloadShipment getTaskUnload(Shipment shipment) {
		ToUseUnloadShipment task = this.getTasks().stream()
								                .filter(s -> s instanceof ToUseUnloadShipment)
								                .map ( s -> (ToUseUnloadShipment)s)
								                .filter( s -> s.getShipment()==shipment)
								                .findFirst()
								                .orElse(null);
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ToUseScheduleResource getResourceVehicle(Vehicle vehicle) {
		ToUseScheduleResource resource = this.getResources().stream()
                .map ( s -> (ToUseScheduleResource)s)
                .filter( s -> s.getVehicle()==vehicle)
                .findFirst()
                .orElse(null);
		return resource;
	}

	@Override
	public void refresh() {
		ScopeScheduleScore scope = this.getPropagatorFunction(ScopeScheduleScore.class);
		if ( scope!=null) {
			scope.refresh();
		}
	}

	@Override
	public void initializeImpl() {
		
		ToUseScheduler scheduler = (ToUseScheduler) this.getScheduler();

		// remove everything
		this.flush();
		
		// add the Resources
		for ( Vehicle vehicle : scheduler.getSelectedVehicles()) {
			String name = vehicle.getName();
			ToUseScheduleResource resource = ToUseSchedulerFactory.eINSTANCE.createToUseScheduleResource();
			resource.setVehicle(vehicle);
			resource.setName(name);
			this.getResources().add(resource); // owning
		}
		
		// add the tasks
		for ( Shipment shipment: scheduler.getSelectedShipments()) {
			// load
			String load_name = String.format("load(%s)", shipment.getName());
			ToUseLoadShipment load= ToUseSchedulerFactory.eINSTANCE.createToUseLoadShipment();
			load.setShipmentLoaded(shipment);
			load.setName(load_name);
			this.getTasks().add(load);
			// unload
			String unload_name = String.format("unload(%s)", shipment.getName());
			ToUseUnloadShipment unload= ToUseSchedulerFactory.eINSTANCE.createToUseUnloadShipment();
			unload.setShipmentUnloaded(shipment);
			unload.setName(unload_name);
			this.getTasks().add(unload);
			// loadunload
			load.setUnloadShipment(unload);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ToUseSchedulerPackage.TO_USE_SCHEDULE___GET_TASK_LOAD__SHIPMENT:
				return getTaskLoad((Shipment)arguments.get(0));
			case ToUseSchedulerPackage.TO_USE_SCHEDULE___GET_TASK_UNLOAD__SHIPMENT:
				return getTaskUnload((Shipment)arguments.get(0));
			case ToUseSchedulerPackage.TO_USE_SCHEDULE___GET_RESOURCE_VEHICLE__VEHICLE:
				return getResourceVehicle((Vehicle)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	
	@Override
	public Score constructScore() {
		Score new_score = ToUseSchedulerFactory.eINSTANCE.createToUseScore();
		return new_score;
	}

} //ToUseScheduleImpl
