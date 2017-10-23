/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.common.moplaf.scheduler.impl.TaskImpl;
import com.misc.touse.moplaf.tousescheduler.Shipment;
import com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Use Schedule Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseScheduleTaskImpl#getShipment <em>Shipment</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseScheduleTaskImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseScheduleTaskImpl#getDistanceFromPrevious <em>Distance From Previous</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseScheduleTaskImpl#getStartVolumeLoaded <em>Start Volume Loaded</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseScheduleTaskImpl#getEndVolumeLoaded <em>End Volume Loaded</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseScheduleTaskImpl#getLocationX <em>Location X</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseScheduleTaskImpl#getLocationY <em>Location Y</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseScheduleTaskImpl#getLoadFactor <em>Load Factor</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseScheduleTaskImpl#isVolumeOverload <em>Volume Overload</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToUseScheduleTaskImpl extends TaskImpl implements ToUseScheduleTask {
	/**
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final float DISTANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected float distance = DISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistanceFromPrevious() <em>Distance From Previous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceFromPrevious()
	 * @generated
	 * @ordered
	 */
	protected static final float DISTANCE_FROM_PREVIOUS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDistanceFromPrevious() <em>Distance From Previous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceFromPrevious()
	 * @generated
	 * @ordered
	 */
	protected float distanceFromPrevious = DISTANCE_FROM_PREVIOUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartVolumeLoaded() <em>Start Volume Loaded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartVolumeLoaded()
	 * @generated
	 * @ordered
	 */
	protected static final float START_VOLUME_LOADED_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getStartVolumeLoaded() <em>Start Volume Loaded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartVolumeLoaded()
	 * @generated
	 * @ordered
	 */
	protected float startVolumeLoaded = START_VOLUME_LOADED_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndVolumeLoaded() <em>End Volume Loaded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndVolumeLoaded()
	 * @generated
	 * @ordered
	 */
	protected static final float END_VOLUME_LOADED_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEndVolumeLoaded() <em>End Volume Loaded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndVolumeLoaded()
	 * @generated
	 * @ordered
	 */
	protected float endVolumeLoaded = END_VOLUME_LOADED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocationX() <em>Location X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationX()
	 * @generated
	 * @ordered
	 */
	protected static final float LOCATION_X_EDEFAULT = 0.0F;

	/**
	 * The default value of the '{@link #getLocationY() <em>Location Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationY()
	 * @generated
	 * @ordered
	 */
	protected static final float LOCATION_Y_EDEFAULT = 0.0F;

	/**
	 * The default value of the '{@link #getLoadFactor() <em>Load Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadFactor()
	 * @generated
	 * @ordered
	 */
	protected static final float LOAD_FACTOR_EDEFAULT = 0.0F;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUseScheduleTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseSchedulerPackage.Literals.TO_USE_SCHEDULE_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shipment getShipment() {
		Shipment shipment = basicGetShipment();
		return shipment != null && shipment.eIsProxy() ? (Shipment)eResolveProxy((InternalEObject)shipment) : shipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shipment basicGetShipment() {
		// TODO: implement this method to return the 'Shipment' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance(float newDistance) {
		float oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__DISTANCE, oldDistance, distance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDistanceFromPrevious() {
		return distanceFromPrevious;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistanceFromPrevious(float newDistanceFromPrevious) {
		float oldDistanceFromPrevious = distanceFromPrevious;
		distanceFromPrevious = newDistanceFromPrevious;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__DISTANCE_FROM_PREVIOUS, oldDistanceFromPrevious, distanceFromPrevious));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getStartVolumeLoaded() {
		return startVolumeLoaded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartVolumeLoaded(float newStartVolumeLoaded) {
		float oldStartVolumeLoaded = startVolumeLoaded;
		startVolumeLoaded = newStartVolumeLoaded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__START_VOLUME_LOADED, oldStartVolumeLoaded, startVolumeLoaded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getEndVolumeLoaded() {
		return endVolumeLoaded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndVolumeLoaded(float newEndVolumeLoaded) {
		float oldEndVolumeLoaded = endVolumeLoaded;
		endVolumeLoaded = newEndVolumeLoaded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__END_VOLUME_LOADED, oldEndVolumeLoaded, endVolumeLoaded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLocationX() {
		// TODO: implement this method to return the 'Location X' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLocationY() {
		// TODO: implement this method to return the 'Location Y' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLoadFactor() {
		// TODO: implement this method to return the 'Load Factor' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__VOLUME_OVERLOAD, oldVolumeOverload, volumeOverload));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__SHIPMENT:
				if (resolve) return getShipment();
				return basicGetShipment();
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__DISTANCE:
				return getDistance();
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__DISTANCE_FROM_PREVIOUS:
				return getDistanceFromPrevious();
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__START_VOLUME_LOADED:
				return getStartVolumeLoaded();
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__END_VOLUME_LOADED:
				return getEndVolumeLoaded();
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__LOCATION_X:
				return getLocationX();
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__LOCATION_Y:
				return getLocationY();
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__LOAD_FACTOR:
				return getLoadFactor();
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__VOLUME_OVERLOAD:
				return isVolumeOverload();
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
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__DISTANCE:
				setDistance((Float)newValue);
				return;
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__DISTANCE_FROM_PREVIOUS:
				setDistanceFromPrevious((Float)newValue);
				return;
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__START_VOLUME_LOADED:
				setStartVolumeLoaded((Float)newValue);
				return;
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__END_VOLUME_LOADED:
				setEndVolumeLoaded((Float)newValue);
				return;
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__VOLUME_OVERLOAD:
				setVolumeOverload((Boolean)newValue);
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
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__DISTANCE:
				setDistance(DISTANCE_EDEFAULT);
				return;
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__DISTANCE_FROM_PREVIOUS:
				setDistanceFromPrevious(DISTANCE_FROM_PREVIOUS_EDEFAULT);
				return;
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__START_VOLUME_LOADED:
				setStartVolumeLoaded(START_VOLUME_LOADED_EDEFAULT);
				return;
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__END_VOLUME_LOADED:
				setEndVolumeLoaded(END_VOLUME_LOADED_EDEFAULT);
				return;
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__VOLUME_OVERLOAD:
				setVolumeOverload(VOLUME_OVERLOAD_EDEFAULT);
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
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__SHIPMENT:
				return basicGetShipment() != null;
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__DISTANCE:
				return distance != DISTANCE_EDEFAULT;
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__DISTANCE_FROM_PREVIOUS:
				return distanceFromPrevious != DISTANCE_FROM_PREVIOUS_EDEFAULT;
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__START_VOLUME_LOADED:
				return startVolumeLoaded != START_VOLUME_LOADED_EDEFAULT;
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__END_VOLUME_LOADED:
				return endVolumeLoaded != END_VOLUME_LOADED_EDEFAULT;
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__LOCATION_X:
				return getLocationX() != LOCATION_X_EDEFAULT;
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__LOCATION_Y:
				return getLocationY() != LOCATION_Y_EDEFAULT;
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__LOAD_FACTOR:
				return getLoadFactor() != LOAD_FACTOR_EDEFAULT;
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__VOLUME_OVERLOAD:
				return volumeOverload != VOLUME_OVERLOAD_EDEFAULT;
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
		result.append(" (Distance: ");
		result.append(distance);
		result.append(", DistanceFromPrevious: ");
		result.append(distanceFromPrevious);
		result.append(", StartVolumeLoaded: ");
		result.append(startVolumeLoaded);
		result.append(", EndVolumeLoaded: ");
		result.append(endVolumeLoaded);
		result.append(", VolumeOverload: ");
		result.append(volumeOverload);
		result.append(')');
		return result.toString();
	}

} //ToUseScheduleTaskImpl
