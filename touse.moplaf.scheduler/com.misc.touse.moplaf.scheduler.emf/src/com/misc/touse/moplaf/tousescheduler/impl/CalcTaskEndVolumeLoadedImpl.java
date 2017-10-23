/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.propagator2.util.Bindings;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.touse.moplaf.tousescheduler.CalcTaskEndVolumeLoaded;
import com.misc.touse.moplaf.tousescheduler.LayerScheduleVolumeLoaded;
import com.misc.touse.moplaf.tousescheduler.Shipment;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedule;
import com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource;
import com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;
import com.misc.touse.moplaf.tousescheduler.Vehicle;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calc Task End Volume Loaded</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.CalcTaskEndVolumeLoadedImpl#getConcreteParent <em>Concrete Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalcTaskEndVolumeLoadedImpl extends CalcTaskImpl implements CalcTaskEndVolumeLoaded {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcTaskEndVolumeLoadedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseSchedulerPackage.Literals.CALC_TASK_END_VOLUME_LOADED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerScheduleVolumeLoaded getConcreteParent() {
		LayerScheduleVolumeLoaded concreteParent = basicGetConcreteParent();
		return concreteParent != null && concreteParent.eIsProxy() ? (LayerScheduleVolumeLoaded)eResolveProxy((InternalEObject)concreteParent) : concreteParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public LayerScheduleVolumeLoaded basicGetConcreteParent() {
		ToUseScheduleTask task = this.getTask();
		ToUseSchedule schedule = (ToUseSchedule) task.getSchedule();
		LayerScheduleVolumeLoaded  parent = schedule.getPropagatorFunction(LayerScheduleVolumeLoaded.class);
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUseSchedulerPackage.CALC_TASK_END_VOLUME_LOADED__CONCRETE_PARENT:
				if (resolve) return getConcreteParent();
				return basicGetConcreteParent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ToUseSchedulerPackage.CALC_TASK_END_VOLUME_LOADED__CONCRETE_PARENT:
				return basicGetConcreteParent() != null;
		}
		return super.eIsSet(featureID);
	}

	private static Bindings thisTaskBindings = Bindings.constructBindings()
			.addInboundBinding(SchedulerPackage.Literals.TASK__SCHEDULED_RESOURCE)	
			.addInboundBinding(ToUseSchedulerPackage.Literals.TO_USE_SCHEDULE_TASK__END_VOLUME_LOADED)	
			.addOutboundBinding(ToUseSchedulerPackage.Literals.TO_USE_SCHEDULE_TASK__START_VOLUME_LOADED)
			.addOutboundBinding(ToUseSchedulerPackage.Literals.TO_USE_SCHEDULE_TASK__VOLUME_OVERLOAD)
			;
		
	/**
	 * 
	 */
	@Override
	public Bindings doGetBindings() {
		return thisTaskBindings;
	}

	/**
	 * 
	 */
	@Override
	public void doRefresh() {
		ToUseScheduleTask task = this.getTask();
		
		// end volume loaded
		float loadFactor = task.getLoadFactor();
		Shipment shipment = task.getShipment();
		float volume = loadFactor*shipment.getVolume();
		float endVolume = task.getStartVolumeLoaded()+volume;
		task.setEndVolumeLoaded(endVolume);
		
		// task overload
		ToUseScheduleResource resource = (ToUseScheduleResource) task.getScheduledResource();
		boolean overload = false;
		if ( resource!=null) {
			Vehicle vehicle = resource.getVehicle();
			overload = endVolume > vehicle.getMaxVolumeLoaded();
		}
		task.setVolumeOverload(overload);
	}
	
	@Override
	public PropagatorFunction doGetParent() {
		return this.getConcreteParent();
	}
} //CalcTaskEndVolumeLoadedImpl
