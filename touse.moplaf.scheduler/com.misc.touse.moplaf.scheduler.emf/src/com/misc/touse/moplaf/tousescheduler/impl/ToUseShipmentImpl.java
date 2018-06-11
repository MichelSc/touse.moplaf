/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.common.moplaf.scheduler.impl.FlockResourceImpl;

import com.misc.touse.moplaf.tousescheduler.Shipment;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;
import com.misc.touse.moplaf.tousescheduler.ToUseShipment;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Use Shipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseShipmentImpl#getShipment <em>Shipment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToUseShipmentImpl extends FlockResourceImpl implements ToUseShipment {
	/**
	 * The cached value of the '{@link #getShipment() <em>Shipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipment()
	 * @generated
	 * @ordered
	 */
	protected Shipment shipment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUseShipmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseSchedulerPackage.Literals.TO_USE_SHIPMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shipment getShipment() {
		if (shipment != null && shipment.eIsProxy()) {
			InternalEObject oldShipment = (InternalEObject)shipment;
			shipment = (Shipment)eResolveProxy(oldShipment);
			if (shipment != oldShipment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToUseSchedulerPackage.TO_USE_SHIPMENT__SHIPMENT, oldShipment, shipment));
			}
		}
		return shipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shipment basicGetShipment() {
		return shipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShipment(Shipment newShipment) {
		Shipment oldShipment = shipment;
		shipment = newShipment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_SHIPMENT__SHIPMENT, oldShipment, shipment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUseSchedulerPackage.TO_USE_SHIPMENT__SHIPMENT:
				if (resolve) return getShipment();
				return basicGetShipment();
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
			case ToUseSchedulerPackage.TO_USE_SHIPMENT__SHIPMENT:
				setShipment((Shipment)newValue);
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
			case ToUseSchedulerPackage.TO_USE_SHIPMENT__SHIPMENT:
				setShipment((Shipment)null);
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
			case ToUseSchedulerPackage.TO_USE_SHIPMENT__SHIPMENT:
				return shipment != null;
		}
		return super.eIsSet(featureID);
	}

} //ToUseShipmentImpl
