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
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ShipmentImpl#getUnoadLocationX <em>Unoad Location X</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ShipmentImpl#getUnoadLocationY <em>Unoad Location Y</em>}</li>
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
	 * The default value of the '{@link #getUnoadLocationX() <em>Unoad Location X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnoadLocationX()
	 * @generated
	 * @ordered
	 */
	protected static final float UNOAD_LOCATION_X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getUnoadLocationX() <em>Unoad Location X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnoadLocationX()
	 * @generated
	 * @ordered
	 */
	protected float unoadLocationX = UNOAD_LOCATION_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnoadLocationY() <em>Unoad Location Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnoadLocationY()
	 * @generated
	 * @ordered
	 */
	protected static final float UNOAD_LOCATION_Y_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getUnoadLocationY() <em>Unoad Location Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnoadLocationY()
	 * @generated
	 * @ordered
	 */
	protected float unoadLocationY = UNOAD_LOCATION_Y_EDEFAULT;

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
	public float getUnoadLocationX() {
		return unoadLocationX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnoadLocationX(float newUnoadLocationX) {
		float oldUnoadLocationX = unoadLocationX;
		unoadLocationX = newUnoadLocationX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.SHIPMENT__UNOAD_LOCATION_X, oldUnoadLocationX, unoadLocationX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getUnoadLocationY() {
		return unoadLocationY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnoadLocationY(float newUnoadLocationY) {
		float oldUnoadLocationY = unoadLocationY;
		unoadLocationY = newUnoadLocationY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.SHIPMENT__UNOAD_LOCATION_Y, oldUnoadLocationY, unoadLocationY));
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
			case ToUseSchedulerPackage.SHIPMENT__UNOAD_LOCATION_X:
				return getUnoadLocationX();
			case ToUseSchedulerPackage.SHIPMENT__UNOAD_LOCATION_Y:
				return getUnoadLocationY();
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
			case ToUseSchedulerPackage.SHIPMENT__UNOAD_LOCATION_X:
				setUnoadLocationX((Float)newValue);
				return;
			case ToUseSchedulerPackage.SHIPMENT__UNOAD_LOCATION_Y:
				setUnoadLocationY((Float)newValue);
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
			case ToUseSchedulerPackage.SHIPMENT__UNOAD_LOCATION_X:
				setUnoadLocationX(UNOAD_LOCATION_X_EDEFAULT);
				return;
			case ToUseSchedulerPackage.SHIPMENT__UNOAD_LOCATION_Y:
				setUnoadLocationY(UNOAD_LOCATION_Y_EDEFAULT);
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
			case ToUseSchedulerPackage.SHIPMENT__UNOAD_LOCATION_X:
				return unoadLocationX != UNOAD_LOCATION_X_EDEFAULT;
			case ToUseSchedulerPackage.SHIPMENT__UNOAD_LOCATION_Y:
				return unoadLocationY != UNOAD_LOCATION_Y_EDEFAULT;
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
		result.append(", UnoadLocationX: ");
		result.append(unoadLocationX);
		result.append(", UnoadLocationY: ");
		result.append(unoadLocationY);
		result.append(')');
		return result.toString();
	}

} //ShipmentImpl
