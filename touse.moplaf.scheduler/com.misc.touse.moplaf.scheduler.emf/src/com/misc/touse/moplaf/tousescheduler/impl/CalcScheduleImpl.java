/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.common.moplaf.scheduler.Plugin;
import com.misc.touse.moplaf.tousescheduler.CalcSchedule;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedule;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calc Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.CalcScheduleImpl#getSchedule <em>Schedule</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CalcScheduleImpl extends CalcSchedulerImpl implements CalcSchedule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseSchedulerPackage.Literals.CALC_SCHEDULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseSchedule getSchedule() {
		ToUseSchedule schedule = basicGetSchedule();
		return schedule != null && schedule.eIsProxy() ? (ToUseSchedule)eResolveProxy((InternalEObject)schedule) : schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ToUseSchedule basicGetSchedule() {
		EObject container = this.eContainer;
		if ( container instanceof ToUseSchedule){
			return (ToUseSchedule) container;
		}

		String logMessage = String.format("The owner of the CalcSchedule %s must be a ToUseSchedule and not %s",
                this.getClass().getName(),
                container == null ? "null" : container.getClass().getName());
		Plugin.INSTANCE.logError(logMessage);

		return null;	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUseSchedulerPackage.CALC_SCHEDULE__SCHEDULE:
				if (resolve) return getSchedule();
				return basicGetSchedule();
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
			case ToUseSchedulerPackage.CALC_SCHEDULE__SCHEDULE:
				return basicGetSchedule() != null;
		}
		return super.eIsSet(featureID);
	}

} //CalcScheduleImpl
