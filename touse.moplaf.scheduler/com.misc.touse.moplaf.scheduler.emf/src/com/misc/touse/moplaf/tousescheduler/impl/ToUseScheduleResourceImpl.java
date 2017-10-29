/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.common.moplaf.scheduler.impl.ResourceImpl;

import com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;

import com.misc.touse.moplaf.tousescheduler.Vehicle;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Use Schedule Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseScheduleResourceImpl#getVehicle <em>Vehicle</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseScheduleResourceImpl#getDistanceFromLast <em>Distance From Last</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseScheduleResourceImpl#getTotalDistance <em>Total Distance</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseScheduleResourceImpl#isVolumeOverload <em>Volume Overload</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseScheduleResourceImpl#getPlannedBenefit <em>Planned Benefit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToUseScheduleResourceImpl extends ResourceImpl implements ToUseScheduleResource {
	/**
	 * The cached value of the '{@link #getVehicle() <em>Vehicle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicle()
	 * @generated
	 * @ordered
	 */
	protected Vehicle vehicle;

	/**
	 * The default value of the '{@link #getDistanceFromLast() <em>Distance From Last</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceFromLast()
	 * @generated
	 * @ordered
	 */
	protected static final float DISTANCE_FROM_LAST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDistanceFromLast() <em>Distance From Last</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceFromLast()
	 * @generated
	 * @ordered
	 */
	protected float distanceFromLast = DISTANCE_FROM_LAST_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalDistance() <em>Total Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalDistance()
	 * @generated
	 * @ordered
	 */
	protected static final float TOTAL_DISTANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTotalDistance() <em>Total Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalDistance()
	 * @generated
	 * @ordered
	 */
	protected float totalDistance = TOTAL_DISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #isVolumeOverload() <em>Volume Overload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVolumeOverload()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VOLUME_OVERLOAD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVolumeOverload() <em>Volume Overload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVolumeOverload()
	 * @generated
	 * @ordered
	 */
	protected boolean volumeOverload = VOLUME_OVERLOAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlannedBenefit() <em>Planned Benefit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedBenefit()
	 * @generated
	 * @ordered
	 */
	protected static final float PLANNED_BENEFIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPlannedBenefit() <em>Planned Benefit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedBenefit()
	 * @generated
	 * @ordered
	 */
	protected float plannedBenefit = PLANNED_BENEFIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUseScheduleResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseSchedulerPackage.Literals.TO_USE_SCHEDULE_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vehicle getVehicle() {
		if (vehicle != null && vehicle.eIsProxy()) {
			InternalEObject oldVehicle = (InternalEObject)vehicle;
			vehicle = (Vehicle)eResolveProxy(oldVehicle);
			if (vehicle != oldVehicle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToUseSchedulerPackage.TO_USE_SCHEDULE_RESOURCE__VEHICLE, oldVehicle, vehicle));
			}
		}
		return vehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vehicle basicGetVehicle() {
		return vehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVehicle(Vehicle newVehicle) {
		Vehicle oldVehicle = vehicle;
		vehicle = newVehicle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_SCHEDULE_RESOURCE__VEHICLE, oldVehicle, vehicle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDistanceFromLast() {
		return distanceFromLast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistanceFromLast(float newDistanceFromLast) {
		float oldDistanceFromLast = distanceFromLast;
		distanceFromLast = newDistanceFromLast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_SCHEDULE_RESOURCE__DISTANCE_FROM_LAST, oldDistanceFromLast, distanceFromLast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTotalDistance() {
		return totalDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalDistance(float newTotalDistance) {
		float oldTotalDistance = totalDistance;
		totalDistance = newTotalDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_SCHEDULE_RESOURCE__TOTAL_DISTANCE, oldTotalDistance, totalDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVolumeOverload() {
		return volumeOverload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolumeOverload(boolean newVolumeOverload) {
		boolean oldVolumeOverload = volumeOverload;
		volumeOverload = newVolumeOverload;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_SCHEDULE_RESOURCE__VOLUME_OVERLOAD, oldVolumeOverload, volumeOverload));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPlannedBenefit() {
		return plannedBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlannedBenefit(float newPlannedBenefit) {
		float oldPlannedBenefit = plannedBenefit;
		plannedBenefit = newPlannedBenefit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_SCHEDULE_RESOURCE__PLANNED_BENEFIT, oldPlannedBenefit, plannedBenefit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_RESOURCE__VEHICLE:
				if (resolve) return getVehicle();
				return basicGetVehicle();
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_RESOURCE__DISTANCE_FROM_LAST:
				return getDistanceFromLast();
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_RESOURCE__TOTAL_DISTANCE:
				return getTotalDistance();
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_RESOURCE__VOLUME_OVERLOAD:
				return isVolumeOverload();
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_RESOURCE__PLANNED_BENEFIT:
				return getPlannedBenefit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_RESOURCE__VEHICLE:
				setVehicle((Vehicle)newValue);
				return;
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_RESOURCE__DISTANCE_FROM_LAST:
				setDistanceFromLast((Float)newValue);
				return;
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_RESOURCE__TOTAL_DISTANCE:
				setTotalDistance((Float)newValue);
				return;
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_RESOURCE__VOLUME_OVERLOAD:
				setVolumeOverload((Boolean)newValue);
				return;
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_RESOURCE__PLANNED_BENEFIT:
				setPlannedBenefit((Float)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_RESOURCE__VEHICLE:
				setVehicle((Vehicle)null);
				return;
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_RESOURCE__DISTANCE_FROM_LAST:
				setDistanceFromLast(DISTANCE_FROM_LAST_EDEFAULT);
				return;
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_RESOURCE__TOTAL_DISTANCE:
				setTotalDistance(TOTAL_DISTANCE_EDEFAULT);
				return;
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_RESOURCE__VOLUME_OVERLOAD:
				setVolumeOverload(VOLUME_OVERLOAD_EDEFAULT);
				return;
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_RESOURCE__PLANNED_BENEFIT:
				setPlannedBenefit(PLANNED_BENEFIT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_RESOURCE__VEHICLE:
				return vehicle != null;
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_RESOURCE__DISTANCE_FROM_LAST:
				return distanceFromLast != DISTANCE_FROM_LAST_EDEFAULT;
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_RESOURCE__TOTAL_DISTANCE:
				return totalDistance != TOTAL_DISTANCE_EDEFAULT;
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_RESOURCE__VOLUME_OVERLOAD:
				return volumeOverload != VOLUME_OVERLOAD_EDEFAULT;
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_RESOURCE__PLANNED_BENEFIT:
				return plannedBenefit != PLANNED_BENEFIT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (DistanceFromLast: ");
		result.append(distanceFromLast);
		result.append(", TotalDistance: ");
		result.append(totalDistance);
		result.append(", VolumeOverload: ");
		result.append(volumeOverload);
		result.append(", PlannedBenefit: ");
		result.append(plannedBenefit);
		result.append(')');
		return result.toString();
	}

} //ToUseScheduleResourceImpl
