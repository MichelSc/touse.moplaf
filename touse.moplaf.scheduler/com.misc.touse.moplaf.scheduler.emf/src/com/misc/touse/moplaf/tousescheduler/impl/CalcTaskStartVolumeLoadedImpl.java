/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.propagator2.util.Bindings;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.touse.moplaf.tousescheduler.CalcTaskStartVolumeLoaded;
import com.misc.touse.moplaf.tousescheduler.LayerScheduleVolumeLoaded;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedule;
import com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calc Task Start Volume Loaded</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.CalcTaskStartVolumeLoadedImpl#getConcreteParent <em>Concrete Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalcTaskStartVolumeLoadedImpl extends CalcTaskImpl implements CalcTaskStartVolumeLoaded {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcTaskStartVolumeLoadedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseSchedulerPackage.Literals.CALC_TASK_START_VOLUME_LOADED;
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
			case ToUseSchedulerPackage.CALC_TASK_START_VOLUME_LOADED__CONCRETE_PARENT:
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
			case ToUseSchedulerPackage.CALC_TASK_START_VOLUME_LOADED__CONCRETE_PARENT:
				return basicGetConcreteParent() != null;
		}
		return super.eIsSet(featureID);
	}

	private static Bindings taskBeforeBindings = Bindings.constructBindings()
			.addInboundBinding(ToUseSchedulerPackage.Literals.TO_USE_SCHEDULE_TASK__END_VOLUME_LOADED)	
			;
		
	private static Bindings thisTaskBindings = Bindings.constructBindings()
			.addInboundBinding(SchedulerPackage.Literals.TASK__PREVIOUS_TASK, taskBeforeBindings)	
			.addOutboundBinding(ToUseSchedulerPackage.Literals.TO_USE_SCHEDULE_TASK__START_VOLUME_LOADED)
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
		ToUseScheduleTask previous_task = (ToUseScheduleTask) task.getPreviousTask();
		float loaded= 0.0f;
		if ( previous_task != null) {
			loaded = previous_task.getEndVolumeLoaded();
		} 
		task.setStartVolumeLoaded(loaded);
	}
	
	@Override
	public PropagatorFunction doGetParent() {
		return this.getConcreteParent();
	}
} //CalcTaskStartVolumeLoadedImpl
