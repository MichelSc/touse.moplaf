/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.propagator2.util.Bindings;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.Task;
import com.misc.touse.moplaf.tousescheduler.CalcResourcePlannedBenefit;
import com.misc.touse.moplaf.tousescheduler.LayerSchedulePlannedBenefit;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedule;
import com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;
import com.misc.touse.moplaf.tousescheduler.ToUseUnloadShipment;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calc Resource Planned Benefit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.CalcResourcePlannedBenefitImpl#getConcreteParent <em>Concrete Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalcResourcePlannedBenefitImpl extends CalcResourceImpl implements CalcResourcePlannedBenefit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcResourcePlannedBenefitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseSchedulerPackage.Literals.CALC_RESOURCE_PLANNED_BENEFIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerSchedulePlannedBenefit getConcreteParent() {
		LayerSchedulePlannedBenefit concreteParent = basicGetConcreteParent();
		return concreteParent != null && concreteParent.eIsProxy() ? (LayerSchedulePlannedBenefit)eResolveProxy((InternalEObject)concreteParent) : concreteParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public LayerSchedulePlannedBenefit basicGetConcreteParent() {
		ToUseScheduleResource resource = this.getResource();
		ToUseSchedule schedule = (ToUseSchedule) resource.getSchedule();
		LayerSchedulePlannedBenefit parent = schedule.getPropagatorFunction(LayerSchedulePlannedBenefit.class);
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
			case ToUseSchedulerPackage.CALC_RESOURCE_PLANNED_BENEFIT__CONCRETE_PARENT:
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
			case ToUseSchedulerPackage.CALC_RESOURCE_PLANNED_BENEFIT__CONCRETE_PARENT:
				return basicGetConcreteParent() != null;
		}
		return super.eIsSet(featureID);
	}
	
	private static Bindings thisResourceBindings = Bindings.constructBindings()
			.addInboundBinding(SchedulerPackage.Literals.RESOURCE__SCHEDULED_TASKS)	
			.addOutboundBinding(ToUseSchedulerPackage.Literals.TO_USE_SCHEDULE_RESOURCE__PLANNED_BENEFIT)
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
		float benefit = 0.0f;
		for ( Task t : resource.getScheduledTasks()) {
			if ( t instanceof ToUseUnloadShipmentImpl) {
				ToUseUnloadShipment task = (ToUseUnloadShipment)t;
				benefit += task.getShipment().getShipment().getPlannedBenefit();
			}
		}
		resource.setPlannedBenefit(benefit);
	}
	
	@Override
	public PropagatorFunction doGetParent() {
		return this.getConcreteParent();
	}
	


} //CalcResourcePlannedBenefitImpl
