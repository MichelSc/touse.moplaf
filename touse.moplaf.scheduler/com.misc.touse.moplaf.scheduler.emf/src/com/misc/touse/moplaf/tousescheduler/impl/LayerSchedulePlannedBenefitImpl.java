/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.scheduler.Resource;
import com.misc.touse.moplaf.tousescheduler.LayerSchedulePlannedBenefit;
import com.misc.touse.moplaf.tousescheduler.ScopeScheduleScore;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedule;
import com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;
import com.misc.touse.moplaf.tousescheduler.ToUseScore;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layer Schedule Planned Benefit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.LayerSchedulePlannedBenefitImpl#getConcreteParent <em>Concrete Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LayerSchedulePlannedBenefitImpl extends CalcScheduleImpl implements LayerSchedulePlannedBenefit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayerSchedulePlannedBenefitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseSchedulerPackage.Literals.LAYER_SCHEDULE_PLANNED_BENEFIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeScheduleScore getConcreteParent() {
		ScopeScheduleScore concreteParent = basicGetConcreteParent();
		return concreteParent != null && concreteParent.eIsProxy() ? (ScopeScheduleScore)eResolveProxy((InternalEObject)concreteParent) : concreteParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ScopeScheduleScore basicGetConcreteParent() {
		ToUseSchedule schedule = this.getSchedule();
		ScopeScheduleScore  parent = schedule.getPropagatorFunction(ScopeScheduleScore.class);
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
			case ToUseSchedulerPackage.LAYER_SCHEDULE_PLANNED_BENEFIT__CONCRETE_PARENT:
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
			case ToUseSchedulerPackage.LAYER_SCHEDULE_PLANNED_BENEFIT__CONCRETE_PARENT:
				return basicGetConcreteParent() != null;
		}
		return super.eIsSet(featureID);
	}
	@Override
	public PropagatorFunction doGetParent() {
		return this.getConcreteParent();
	}
	
	/**
	 * 
	 */
	@Override
	public void doRefresh() {
		ToUseSchedule schedule= this.getSchedule();
		float benefit = 0.0f;
		for ( Resource resource : schedule.getResources()) {
			ToUseScheduleResource scheduler_resource =  (ToUseScheduleResource)resource;
			benefit += scheduler_resource.getPlannedBenefit();
		}
		ToUseScore score = (ToUseScore)schedule.getScore();
		score.setPlannedBenefit(benefit);
	}

} //LayerSchedulePlannedBenefitImpl
