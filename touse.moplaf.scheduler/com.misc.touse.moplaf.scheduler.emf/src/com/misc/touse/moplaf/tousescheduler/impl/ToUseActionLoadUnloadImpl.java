/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.common.moplaf.localsearch.impl.ActionImpl;

import com.misc.touse.moplaf.tousescheduler.Shipment;
import com.misc.touse.moplaf.tousescheduler.ToUseActionLoadUnload;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Use Action Load Unload</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseActionLoadUnloadImpl#getShipment <em>Shipment</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ToUseActionLoadUnloadImpl extends ActionImpl implements ToUseActionLoadUnload {
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
	protected ToUseActionLoadUnloadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseSchedulerPackage.Literals.TO_USE_ACTION_LOAD_UNLOAD;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToUseSchedulerPackage.TO_USE_ACTION_LOAD_UNLOAD__SHIPMENT, oldShipment, shipment));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_ACTION_LOAD_UNLOAD__SHIPMENT, oldShipment, shipment));
	}

	@Override
	public String getValidFeedback() {
		String superFeedback = super.getValidFeedback();
		if ( superFeedback!=null) {
			return superFeedback;
		}
		if ( this.getShipment()==null) {
			return "No Shipment";
		}
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
			case ToUseSchedulerPackage.TO_USE_ACTION_LOAD_UNLOAD__SHIPMENT:
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
			case ToUseSchedulerPackage.TO_USE_ACTION_LOAD_UNLOAD__SHIPMENT:
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
			case ToUseSchedulerPackage.TO_USE_ACTION_LOAD_UNLOAD__SHIPMENT:
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
			case ToUseSchedulerPackage.TO_USE_ACTION_LOAD_UNLOAD__SHIPMENT:
				return shipment != null;
		}
		return super.eIsSet(featureID);
	}

} //ToUseActionLoadUnloadImpl
