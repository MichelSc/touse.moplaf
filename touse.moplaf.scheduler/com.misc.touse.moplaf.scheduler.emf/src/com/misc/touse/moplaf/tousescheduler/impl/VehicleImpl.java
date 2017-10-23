/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;
import com.misc.touse.moplaf.tousescheduler.Vehicle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.VehicleImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.VehicleImpl#getHomeLocationX <em>Home Location X</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.VehicleImpl#getHomeLocationY <em>Home Location Y</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.VehicleImpl#getMaxVolumeLoaded <em>Max Volume Loaded</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VehicleImpl extends MinimalEObjectImpl.Container implements Vehicle {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getHomeLocationX() <em>Home Location X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeLocationX()
	 * @generated
	 * @ordered
	 */
	protected static final float HOME_LOCATION_X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHomeLocationX() <em>Home Location X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeLocationX()
	 * @generated
	 * @ordered
	 */
	protected float homeLocationX = HOME_LOCATION_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getHomeLocationY() <em>Home Location Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeLocationY()
	 * @generated
	 * @ordered
	 */
	protected static final float HOME_LOCATION_Y_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHomeLocationY() <em>Home Location Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeLocationY()
	 * @generated
	 * @ordered
	 */
	protected float homeLocationY = HOME_LOCATION_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxVolumeLoaded() <em>Max Volume Loaded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxVolumeLoaded()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_VOLUME_LOADED_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxVolumeLoaded() <em>Max Volume Loaded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxVolumeLoaded()
	 * @generated
	 * @ordered
	 */
	protected float maxVolumeLoaded = MAX_VOLUME_LOADED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehicleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseSchedulerPackage.Literals.VEHICLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.VEHICLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHomeLocationX() {
		return homeLocationX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHomeLocationX(float newHomeLocationX) {
		float oldHomeLocationX = homeLocationX;
		homeLocationX = newHomeLocationX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.VEHICLE__HOME_LOCATION_X, oldHomeLocationX, homeLocationX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHomeLocationY() {
		return homeLocationY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHomeLocationY(float newHomeLocationY) {
		float oldHomeLocationY = homeLocationY;
		homeLocationY = newHomeLocationY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.VEHICLE__HOME_LOCATION_Y, oldHomeLocationY, homeLocationY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxVolumeLoaded() {
		return maxVolumeLoaded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxVolumeLoaded(float newMaxVolumeLoaded) {
		float oldMaxVolumeLoaded = maxVolumeLoaded;
		maxVolumeLoaded = newMaxVolumeLoaded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.VEHICLE__MAX_VOLUME_LOADED, oldMaxVolumeLoaded, maxVolumeLoaded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUseSchedulerPackage.VEHICLE__NAME:
				return getName();
			case ToUseSchedulerPackage.VEHICLE__HOME_LOCATION_X:
				return getHomeLocationX();
			case ToUseSchedulerPackage.VEHICLE__HOME_LOCATION_Y:
				return getHomeLocationY();
			case ToUseSchedulerPackage.VEHICLE__MAX_VOLUME_LOADED:
				return getMaxVolumeLoaded();
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
			case ToUseSchedulerPackage.VEHICLE__NAME:
				setName((String)newValue);
				return;
			case ToUseSchedulerPackage.VEHICLE__HOME_LOCATION_X:
				setHomeLocationX((Float)newValue);
				return;
			case ToUseSchedulerPackage.VEHICLE__HOME_LOCATION_Y:
				setHomeLocationY((Float)newValue);
				return;
			case ToUseSchedulerPackage.VEHICLE__MAX_VOLUME_LOADED:
				setMaxVolumeLoaded((Float)newValue);
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
			case ToUseSchedulerPackage.VEHICLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ToUseSchedulerPackage.VEHICLE__HOME_LOCATION_X:
				setHomeLocationX(HOME_LOCATION_X_EDEFAULT);
				return;
			case ToUseSchedulerPackage.VEHICLE__HOME_LOCATION_Y:
				setHomeLocationY(HOME_LOCATION_Y_EDEFAULT);
				return;
			case ToUseSchedulerPackage.VEHICLE__MAX_VOLUME_LOADED:
				setMaxVolumeLoaded(MAX_VOLUME_LOADED_EDEFAULT);
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
			case ToUseSchedulerPackage.VEHICLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ToUseSchedulerPackage.VEHICLE__HOME_LOCATION_X:
				return homeLocationX != HOME_LOCATION_X_EDEFAULT;
			case ToUseSchedulerPackage.VEHICLE__HOME_LOCATION_Y:
				return homeLocationY != HOME_LOCATION_Y_EDEFAULT;
			case ToUseSchedulerPackage.VEHICLE__MAX_VOLUME_LOADED:
				return maxVolumeLoaded != MAX_VOLUME_LOADED_EDEFAULT;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", HomeLocationX: ");
		result.append(homeLocationX);
		result.append(", HomeLocationY: ");
		result.append(homeLocationY);
		result.append(", MaxVolumeLoaded: ");
		result.append(maxVolumeLoaded);
		result.append(')');
		return result.toString();
	}

} //VehicleImpl
