/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.common.moplaf.common.util.GisUtil;
import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.propagator2.util.Bindings;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.touse.moplaf.tousescheduler.CalcResourceDistanceFromLast;
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
 * An implementation of the model object '<em><b>Calc Resource Distance From Last</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.CalcResourceDistanceFromLastImpl#getConcreteParent <em>Concrete Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalcResourceDistanceFromLastImpl extends CalcResourceImpl implements CalcResourceDistanceFromLast {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcResourceDistanceFromLastImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseSchedulerPackage.Literals.CALC_RESOURCE_DISTANCE_FROM_LAST;
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
		ToUseScheduleResource resource = this.getResource();
		ToUseSchedule schedule = (ToUseSchedule) resource.getSchedule();
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
			case ToUseSchedulerPackage.CALC_RESOURCE_DISTANCE_FROM_LAST__CONCRETE_PARENT:
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
			case ToUseSchedulerPackage.CALC_RESOURCE_DISTANCE_FROM_LAST__CONCRETE_PARENT:
				return basicGetConcreteParent() != null;
		}
		return super.eIsSet(featureID);
	}

	private static Bindings thisResourceBindings = Bindings.constructBindings()
			.addInboundBinding(SchedulerPackage.Literals.RESOURCE__LAST_TASK)	
			.addOutboundBinding(ToUseSchedulerPackage.Literals.TO_USE_SCHEDULE_RESOURCE__DISTANCE_FROM_LAST)
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
		ToUseScheduleTask last_task = (ToUseScheduleTask) resource.getLastTask();
		float distance = 0.0f; 
		if ( last_task != null) {
			// distance last leg: from this task to vehicle home location 
			Vehicle vehicle = resource.getVehicle();
			distance = (float) GisUtil.getDistance(
					last_task.getLocationX(),
					last_task.getLocationY(),
					vehicle.getHomeLocationX(), 
					vehicle.getHomeLocationY());
		}
		resource.setDistanceFromLast(distance);
	}
	
	@Override
	public PropagatorFunction doGetParent() {
		return this.getConcreteParent();
	}
} //CalcResourceDistanceFromLastImpl
