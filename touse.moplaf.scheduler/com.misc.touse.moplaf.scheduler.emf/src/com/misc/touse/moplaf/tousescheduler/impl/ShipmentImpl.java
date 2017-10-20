/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.touse.moplaf.tousescheduler.Shipment;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ShipmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ShipmentImpl#getLoadLocationX <em>Load Location X</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ShipmentImpl#getLoadLocationY <em>Load Location Y</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ShipmentImpl#getUnloadLocationX <em>Unload Location X</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ShipmentImpl#getUnloadLocationY <em>Unload Location Y</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShipmentImpl extends MinimalEObjectImpl.Container implements Shipment {
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
	 * The default value of the '{@link #getLoadLocationX() <em>Load Location X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadLocationX()
	 * @generated
	 * @ordered
	 */
	protected static final float LOAD_LOCATION_X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLoadLocationX() <em>Load Location X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadLocationX()
	 * @generated
	 * @ordered
	 */
	protected float loadLocationX = LOAD_LOCATION_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoadLocationY() <em>Load Location Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadLocationY()
	 * @generated
	 * @ordered
	 */
	protected static final float LOAD_LOCATION_Y_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLoadLocationY() <em>Load Location Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadLocationY()
	 * @generated
	 * @ordered
	 */
	protected float loadLocationY = LOAD_LOCATION_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnloadLocationX() <em>Unload Location X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnloadLocationX()
	 * @generated
	 * @ordered
	 */
	protected static final float UNLOAD_LOCATION_X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getUnloadLocationX() <em>Unload Location X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnloadLocationX()
	 * @generated
	 * @ordered
	 */
	protected float unloadLocationX = UNLOAD_LOCATION_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnloadLocationY() <em>Unload Location Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnloadLocationY()
	 * @generated
	 * @ordered
	 */
	protected static final float UNLOAD_LOCATION_Y_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getUnloadLocationY() <em>Unload Location Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnloadLocationY()
	 * @generated
	 * @ordered
	 */
	protected float unloadLocationY = UNLOAD_LOCATION_Y_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseSchedulerPackage.Literals.SHIPMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.SHIPMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLoadLocationX() {
		return loadLocationX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadLocationX(float newLoadLocationX) {
		float oldLoadLocationX = loadLocationX;
		loadLocationX = newLoadLocationX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.SHIPMENT__LOAD_LOCATION_X, oldLoadLocationX, loadLocationX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLoadLocationY() {
		return loadLocationY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadLocationY(float newLoadLocationY) {
		float oldLoadLocationY = loadLocationY;
		loadLocationY = newLoadLocationY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.SHIPMENT__LOAD_LOCATION_Y, oldLoadLocationY, loadLocationY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getUnloadLocationX() {
		return unloadLocationX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnloadLocationX(float newUnloadLocationX) {
		float oldUnloadLocationX = unloadLocationX;
		unloadLocationX = newUnloadLocationX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.SHIPMENT__UNLOAD_LOCATION_X, oldUnloadLocationX, unloadLocationX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getUnloadLocationY() {
		return unloadLocationY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnloadLocationY(float newUnloadLocationY) {
		float oldUnloadLocationY = unloadLocationY;
		unloadLocationY = newUnloadLocationY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.SHIPMENT__UNLOAD_LOCATION_Y, oldUnloadLocationY, unloadLocationY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUseSchedulerPackage.SHIPMENT__NAME:
				return getName();
			case ToUseSchedulerPackage.SHIPMENT__LOAD_LOCATION_X:
				return getLoadLocationX();
			case ToUseSchedulerPackage.SHIPMENT__LOAD_LOCATION_Y:
				return getLoadLocationY();
			case ToUseSchedulerPackage.SHIPMENT__UNLOAD_LOCATION_X:
				return getUnloadLocationX();
			case ToUseSchedulerPackage.SHIPMENT__UNLOAD_LOCATION_Y:
				return getUnloadLocationY();
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
			case ToUseSchedulerPackage.SHIPMENT__NAME:
				setName((String)newValue);
				return;
			case ToUseSchedulerPackage.SHIPMENT__LOAD_LOCATION_X:
				setLoadLocationX((Float)newValue);
				return;
			case ToUseSchedulerPackage.SHIPMENT__LOAD_LOCATION_Y:
				setLoadLocationY((Float)newValue);
				return;
			case ToUseSchedulerPackage.SHIPMENT__UNLOAD_LOCATION_X:
				setUnloadLocationX((Float)newValue);
				return;
			case ToUseSchedulerPackage.SHIPMENT__UNLOAD_LOCATION_Y:
				setUnloadLocationY((Float)newValue);
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
			case ToUseSchedulerPackage.SHIPMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ToUseSchedulerPackage.SHIPMENT__LOAD_LOCATION_X:
				setLoadLocationX(LOAD_LOCATION_X_EDEFAULT);
				return;
			case ToUseSchedulerPackage.SHIPMENT__LOAD_LOCATION_Y:
				setLoadLocationY(LOAD_LOCATION_Y_EDEFAULT);
				return;
			case ToUseSchedulerPackage.SHIPMENT__UNLOAD_LOCATION_X:
				setUnloadLocationX(UNLOAD_LOCATION_X_EDEFAULT);
				return;
			case ToUseSchedulerPackage.SHIPMENT__UNLOAD_LOCATION_Y:
				setUnloadLocationY(UNLOAD_LOCATION_Y_EDEFAULT);
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
			case ToUseSchedulerPackage.SHIPMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ToUseSchedulerPackage.SHIPMENT__LOAD_LOCATION_X:
				return loadLocationX != LOAD_LOCATION_X_EDEFAULT;
			case ToUseSchedulerPackage.SHIPMENT__LOAD_LOCATION_Y:
				return loadLocationY != LOAD_LOCATION_Y_EDEFAULT;
			case ToUseSchedulerPackage.SHIPMENT__UNLOAD_LOCATION_X:
				return unloadLocationX != UNLOAD_LOCATION_X_EDEFAULT;
			case ToUseSchedulerPackage.SHIPMENT__UNLOAD_LOCATION_Y:
				return unloadLocationY != UNLOAD_LOCATION_Y_EDEFAULT;
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
		result.append(", LoadLocationX: ");
		result.append(loadLocationX);
		result.append(", LoadLocationY: ");
		result.append(loadLocationY);
		result.append(", UnloadLocationX: ");
		result.append(unloadLocationX);
		result.append(", UnloadLocationY: ");
		result.append(unloadLocationY);
		result.append(')');
		return result.toString();
	}

} //ShipmentImpl
