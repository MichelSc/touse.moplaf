/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.propagator2.util.Bindings;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.Task;
import com.misc.touse.moplaf.tousescheduler.CalcResourceVolumeOverload;
import com.misc.touse.moplaf.tousescheduler.LayerScheduleVolumeLoaded;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedule;
import com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource;
import com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calc Resource Volume Overload</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.CalcResourceVolumeOverloadImpl#getConcreteParent <em>Concrete Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalcResourceVolumeOverloadImpl extends CalcResourceImpl implements CalcResourceVolumeOverload {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcResourceVolumeOverloadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseSchedulerPackage.Literals.CALC_RESOURCE_VOLUME_OVERLOAD;
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
		ToUseScheduleResource resource = this.getResource();
		ToUseSchedule schedule = (ToUseSchedule) resource.getSchedule();
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
			case ToUseSchedulerPackage.CALC_RESOURCE_VOLUME_OVERLOAD__CONCRETE_PARENT:
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
			case ToUseSchedulerPackage.CALC_RESOURCE_VOLUME_OVERLOAD__CONCRETE_PARENT:
				return basicGetConcreteParent() != null;
		}
		return super.eIsSet(featureID);
	}
	
	private static Bindings taskBindings = Bindings.constructBindings()
			.addInboundBinding(ToUseSchedulerPackage.Literals.TO_USE_SCHEDULE_TASK__VOLUME_OVERLOAD)
			;
		
	private static Bindings thisResourceBindings = Bindings.constructBindings()
			.addInboundBinding(SchedulerPackage.Literals.RESOURCE__SCHEDULED_TASKS, taskBindings)	
			.addOutboundBinding(ToUseSchedulerPackage.Literals.TO_USE_SCHEDULE_RESOURCE__VOLUME_OVERLOAD)
			;
		
	/**
	 * 
	 */
	@Override
	public Bindings doGetBindings() {
		return thisResourceBindings;
	}

	/**
	 * 
	 */
	@Override
	public void doRefresh() {
		ToUseScheduleResource resource = this.getResource();
		boolean overload = false;
		for ( Task t : resource.getScheduledTasks()) {
			ToUseScheduleTask task = (ToUseScheduleTask)t;
			if ( task.isVolumeOverload() ) {
				overload = true;
				break;
			}
		}
		resource.setVolumeOverload(overload);
	}
	
	@Override
	public PropagatorFunction doGetParent() {
		return this.getConcreteParent();
	}
	

} //CalcResourceVolumeOverloadImpl
