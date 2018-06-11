/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

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
 * An implementation of the model object '<em><b>To Use Unload Shipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseUnloadShipmentImpl#getLoadShipment <em>Load Shipment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToUseUnloadShipmentImpl extends ToUseScheduleTaskImpl implements ToUseUnloadShipment {
	/**
	 * The cached value of the '{@link #getLoadShipment() <em>Load Shipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadShipment()
	 * @generated
	 * @ordered
	 */
	protected ToUseLoadShipment loadShipment;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUseUnloadShipmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseSchedulerPackage.Literals.TO_USE_UNLOAD_SHIPMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseLoadShipment getLoadShipment() {
		if (loadShipment != null && loadShipment.eIsProxy()) {
			InternalEObject oldLoadShipment = (InternalEObject)loadShipment;
			loadShipment = (ToUseLoadShipment)eResolveProxy(oldLoadShipment);
			if (loadShipment != oldLoadShipment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToUseSchedulerPackage.TO_USE_UNLOAD_SHIPMENT__LOAD_SHIPMENT, oldLoadShipment, loadShipment));
			}
		}
		return loadShipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseLoadShipment basicGetLoadShipment() {
		return loadShipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadShipment(ToUseLoadShipment newLoadShipment, NotificationChain msgs) {
		ToUseLoadShipment oldLoadShipment = loadShipment;
		loadShipment = newLoadShipment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_UNLOAD_SHIPMENT__LOAD_SHIPMENT, oldLoadShipment, newLoadShipment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadShipment(ToUseLoadShipment newLoadShipment) {
		if (newLoadShipment != loadShipment) {
			NotificationChain msgs = null;
			if (loadShipment != null)
				msgs = ((InternalEObject)loadShipment).eInverseRemove(this, ToUseSchedulerPackage.TO_USE_LOAD_SHIPMENT__UNLOAD_SHIPMENT, ToUseLoadShipment.class, msgs);
			if (newLoadShipment != null)
				msgs = ((InternalEObject)newLoadShipment).eInverseAdd(this, ToUseSchedulerPackage.TO_USE_LOAD_SHIPMENT__UNLOAD_SHIPMENT, ToUseLoadShipment.class, msgs);
			msgs = basicSetLoadShipment(newLoadShipment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_UNLOAD_SHIPMENT__LOAD_SHIPMENT, newLoadShipment, newLoadShipment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToUseSchedulerPackage.TO_USE_UNLOAD_SHIPMENT__LOAD_SHIPMENT:
				if (loadShipment != null)
					msgs = ((InternalEObject)loadShipment).eInverseRemove(this, ToUseSchedulerPackage.TO_USE_LOAD_SHIPMENT__UNLOAD_SHIPMENT, ToUseLoadShipment.class, msgs);
				return basicSetLoadShipment((ToUseLoadShipment)otherEnd, msgs);
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
			case ToUseSchedulerPackage.TO_USE_UNLOAD_SHIPMENT__LOAD_SHIPMENT:
				return basicSetLoadShipment(null, msgs);
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
			case ToUseSchedulerPackage.TO_USE_UNLOAD_SHIPMENT__LOAD_SHIPMENT:
				if (resolve) return getLoadShipment();
				return basicGetLoadShipment();
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
			case ToUseSchedulerPackage.TO_USE_UNLOAD_SHIPMENT__LOAD_SHIPMENT:
				setLoadShipment((ToUseLoadShipment)newValue);
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
			case ToUseSchedulerPackage.TO_USE_UNLOAD_SHIPMENT__LOAD_SHIPMENT:
				setLoadShipment((ToUseLoadShipment)null);
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
			case ToUseSchedulerPackage.TO_USE_UNLOAD_SHIPMENT__LOAD_SHIPMENT:
				return loadShipment != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public float getLocationX() {
		return this.getShipment().getShipment().getUnloadLocationX();
	}

	@Override
	public float getLocationY() {
		return this.getShipment().getShipment().getUnloadLocationY();
	}
	
	@Override
	public float getLoadFactor() {
		return -1.0f;
	}
	
} //ToUseUnloadShipmentImpl
