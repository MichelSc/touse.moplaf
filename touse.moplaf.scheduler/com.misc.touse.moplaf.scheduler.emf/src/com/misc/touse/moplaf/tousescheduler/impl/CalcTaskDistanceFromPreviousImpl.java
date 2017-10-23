/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.common.moplaf.common.util.GisUtil;
import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.propagator2.util.Bindings;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.touse.moplaf.tousescheduler.CalcTaskDistanceFromPrevious;
import com.misc.touse.moplaf.tousescheduler.LayerScheduleDistance;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedule;
import com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource;
import com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;
import com.misc.touse.moplaf.tousescheduler.Vehicle;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calc Task Distance From Previous</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.CalcTaskDistanceFromPreviousImpl#getConcreteParent <em>Concrete Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalcTaskDistanceFromPreviousImpl extends CalcTaskImpl implements CalcTaskDistanceFromPrevious {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcTaskDistanceFromPreviousImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseSchedulerPackage.Literals.CALC_TASK_DISTANCE_FROM_PREVIOUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerScheduleDistance getConcreteParent() {
		LayerScheduleDistance concreteParent = basicGetConcreteParent();
		return concreteParent != null && concreteParent.eIsProxy() ? (LayerScheduleDistance)eResolveProxy((InternalEObject)concreteParent) : concreteParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public LayerScheduleDistance basicGetConcreteParent() {
		ToUseScheduleTask task = this.getTask();
		ToUseSchedule schedule = (ToUseSchedule) task.getSchedule();
		LayerScheduleDistance  parent = schedule.getPropagatorFunction(LayerScheduleDistance.class);
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
			case ToUseSchedulerPackage.CALC_TASK_DISTANCE_FROM_PREVIOUS__CONCRETE_PARENT:
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
			case ToUseSchedulerPackage.CALC_TASK_DISTANCE_FROM_PREVIOUS__CONCRETE_PARENT:
				return basicGetConcreteParent() != null;
		}
		return super.eIsSet(featureID);
	}

	private static Bindings thisTaskBindings = Bindings.constructBindings()
			.addInboundBinding(SchedulerPackage.Literals.TASK__PREVIOUS_TASK)	
			.addInboundBinding(SchedulerPackage.Literals.TASK__SCHEDULED_RESOURCE)	
			.addOutboundBinding(ToUseSchedulerPackage.Literals.TO_USE_SCHEDULE_TASK__DISTANCE_FROM_PREVIOUS)
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
		double distance_from_previous= 0.0f;
		if ( previous_task != null) {
			// distance some normal leg: from previous task to this task
			distance_from_previous= GisUtil.getDistance(
					previous_task.getLocationX(), 
					previous_task.getLocationY(),
					task.getLocationX(),
					task.getLocationY());
		} else {
			// distance first leg: from vehicle home location to this task
			ToUseScheduleResource resource = (ToUseScheduleResource) task.getScheduledResource();
			if ( resource!=null) {
				Vehicle vehicle = resource.getVehicle();
				distance_from_previous= GisUtil.getDistance(
						vehicle.getHomeLocationX(), 
						vehicle.getHomeLocationY(),
						task.getLocationX(),
						task.getLocationY());
			}
		}
		task.setDistanceFromPrevious((float)distance_from_previous);
	}
	
	@Override
	public PropagatorFunction doGetParent() {
		return this.getConcreteParent();
	}
} //CalcTaskDistanceFromPreviousImpl
