/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.propagator2.util.Bindings;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.touse.moplaf.tousescheduler.CalcTaskDistance;
import com.misc.touse.moplaf.tousescheduler.LayerScheduleDistance;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedule;
import com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calc Task Distance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.CalcTaskDistanceImpl#getConcreteParent <em>Concrete Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalcTaskDistanceImpl extends CalcTaskImpl implements CalcTaskDistance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcTaskDistanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseSchedulerPackage.Literals.CALC_TASK_DISTANCE;
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
			case ToUseSchedulerPackage.CALC_TASK_DISTANCE__CONCRETE_PARENT:
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
			case ToUseSchedulerPackage.CALC_TASK_DISTANCE__CONCRETE_PARENT:
				return basicGetConcreteParent() != null;
		}
		return super.eIsSet(featureID);
	}

	private static Bindings taskBeforeBindings = Bindings.constructBindings()
			.addInboundBinding(ToUseSchedulerPackage.Literals.TO_USE_SCHEDULE_TASK__DISTANCE)
			;
		
	private static Bindings thisTaskBindings = Bindings.constructBindings()
			.addInboundBinding(SchedulerPackage.Literals.TASK__PREVIOUS_TASK, taskBeforeBindings)	
			.addInboundBinding(ToUseSchedulerPackage.Literals.TO_USE_SCHEDULE_TASK__DISTANCE_FROM_PREVIOUS)	
			.addOutboundBinding(ToUseSchedulerPackage.Literals.TO_USE_SCHEDULE_TASK__DISTANCE)
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
		float distance = task.getDistanceFromPrevious(); 
		if ( previous_task != null) {
			distance += previous_task.getDistance(); 
		}
		task.setDistance((float)distance);
	}
	
	@Override
	public PropagatorFunction doGetParent() {
		return this.getConcreteParent();
	}
} //CalcTaskDistanceImpl
