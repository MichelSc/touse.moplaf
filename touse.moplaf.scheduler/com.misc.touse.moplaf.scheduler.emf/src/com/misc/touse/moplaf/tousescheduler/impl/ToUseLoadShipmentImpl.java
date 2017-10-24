/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.touse.moplaf.tousescheduler.Shipment;
import com.misc.touse.moplaf.tousescheduler.ToUseLoadShipment;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;

import com.misc.touse.moplaf.tousescheduler.ToUseUnloadShipment;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Use Load Shipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseLoadShipmentImpl#getShipmentLoaded <em>Shipment Loaded</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseLoadShipmentImpl#getUnloadShipment <em>Unload Shipment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToUseLoadShipmentImpl extends ToUseScheduleTaskImpl implements ToUseLoadShipment {
	/**
	 * The cached value of the '{@link #getShipmentLoaded() <em>Shipment Loaded</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentLoaded()
	 * @generated
	 * @ordered
	 */
	protected Shipment shipmentLoaded;
	/**
	 * The cached value of the '{@link #getUnloadShipment() <em>Unload Shipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnloadShipment()
	 * @generated
	 * @ordered
	 */
	protected ToUseUnloadShipment unloadShipment;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUseLoadShipmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseSchedulerPackage.Literals.TO_USE_LOAD_SHIPMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shipment getShipmentLoaded() {
		if (shipmentLoaded != null && shipmentLoaded.eIsProxy()) {
			InternalEObject oldShipmentLoaded = (InternalEObject)shipmentLoaded;
			shipmentLoaded = (Shipment)eResolveProxy(oldShipmentLoaded);
			if (shipmentLoaded != oldShipmentLoaded) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToUseSchedulerPackage.TO_USE_LOAD_SHIPMENT__SHIPMENT_LOADED, oldShipmentLoaded, shipmentLoaded));
			}
		}
		return shipmentLoaded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shipment basicGetShipmentLoaded() {
		return shipmentLoaded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShipmentLoaded(Shipment newShipmentLoaded) {
		Shipment oldShipmentLoaded = shipmentLoaded;
		shipmentLoaded = newShipmentLoaded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_LOAD_SHIPMENT__SHIPMENT_LOADED, oldShipmentLoaded, shipmentLoaded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseUnloadShipment getUnloadShipment() {
		if (unloadShipment != null && unloadShipment.eIsProxy()) {
			InternalEObject oldUnloadShipment = (InternalEObject)unloadShipment;
			unloadShipment = (ToUseUnloadShipment)eResolveProxy(oldUnloadShipment);
			if (unloadShipment != oldUnloadShipment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToUseSchedulerPackage.TO_USE_LOAD_SHIPMENT__UNLOAD_SHIPMENT, oldUnloadShipment, unloadShipment));
			}
		}
		return unloadShipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseUnloadShipment basicGetUnloadShipment() {
		return unloadShipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnloadShipment(ToUseUnloadShipment newUnloadShipment, NotificationChain msgs) {
		ToUseUnloadShipment oldUnloadShipment = unloadShipment;
		unloadShipment = newUnloadShipment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_LOAD_SHIPMENT__UNLOAD_SHIPMENT, oldUnloadShipment, newUnloadShipment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnloadShipment(ToUseUnloadShipment newUnloadShipment) {
		if (newUnloadShipment != unloadShipment) {
			NotificationChain msgs = null;
			if (unloadShipment != null)
				msgs = ((InternalEObject)unloadShipment).eInverseRemove(this, ToUseSchedulerPackage.TO_USE_UNLOAD_SHIPMENT__LOAD_SHIPMENT, ToUseUnloadShipment.class, msgs);
			if (newUnloadShipment != null)
				msgs = ((InternalEObject)newUnloadShipment).eInverseAdd(this, ToUseSchedulerPackage.TO_USE_UNLOAD_SHIPMENT__LOAD_SHIPMENT, ToUseUnloadShipment.class, msgs);
			msgs = basicSetUnloadShipment(newUnloadShipment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_LOAD_SHIPMENT__UNLOAD_SHIPMENT, newUnloadShipment, newUnloadShipment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToUseSchedulerPackage.TO_USE_LOAD_SHIPMENT__UNLOAD_SHIPMENT:
				if (unloadShipment != null)
					msgs = ((InternalEObject)unloadShipment).eInverseRemove(this, ToUseSchedulerPackage.TO_USE_UNLOAD_SHIPMENT__LOAD_SHIPMENT, ToUseUnloadShipment.class, msgs);
				return basicSetUnloadShipment((ToUseUnloadShipment)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToUseSchedulerPackage.TO_USE_LOAD_SHIPMENT__UNLOAD_SHIPMENT:
				return basicSetUnloadShipment(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUseSchedulerPackage.TO_USE_LOAD_SHIPMENT__SHIPMENT_LOADED:
				if (resolve) return getShipmentLoaded();
				return basicGetShipmentLoaded();
			case ToUseSchedulerPackage.TO_USE_LOAD_SHIPMENT__UNLOAD_SHIPMENT:
				if (resolve) return getUnloadShipment();
				return basicGetUnloadShipment();
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
			case ToUseSchedulerPackage.TO_USE_LOAD_SHIPMENT__SHIPMENT_LOADED:
				setShipmentLoaded((Shipment)newValue);
				return;
			case ToUseSchedulerPackage.TO_USE_LOAD_SHIPMENT__UNLOAD_SHIPMENT:
				setUnloadShipment((ToUseUnloadShipment)newValue);
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
			case ToUseSchedulerPackage.TO_USE_LOAD_SHIPMENT__SHIPMENT_LOADED:
				setShipmentLoaded((Shipment)null);
				return;
			case ToUseSchedulerPackage.TO_USE_LOAD_SHIPMENT__UNLOAD_SHIPMENT:
				setUnloadShipment((ToUseUnloadShipment)null);
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
			case ToUseSchedulerPackage.TO_USE_LOAD_SHIPMENT__SHIPMENT_LOADED:
				return shipmentLoaded != null;
			case ToUseSchedulerPackage.TO_USE_LOAD_SHIPMENT__UNLOAD_SHIPMENT:
				return unloadShipment != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Shipment basicGetShipment() {
		return this.getShipmentLoaded();
	}

	@Override
	public float getLocationX() {
		return this.getShipmentLoaded().getLoadLocationX();
	}

	@Override
	public float getLocationY() {
		return this.getShipmentLoaded().getLoadLocationY();
	}

	@Override
	public float getLoadFactor() {
		return 1.0f;
	}
} //ToUseLoadShipmentImpl
