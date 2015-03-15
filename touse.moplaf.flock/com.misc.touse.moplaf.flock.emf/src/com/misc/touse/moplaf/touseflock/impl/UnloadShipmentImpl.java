/**
 */
package com.misc.touse.moplaf.touseflock.impl;

import com.misc.common.moplaf.propagator.Util;
import com.misc.touse.moplaf.touseflock.Shipment;
import com.misc.touse.moplaf.touseflock.ToUseResource;
import com.misc.touse.moplaf.touseflock.TouseflockPackage;
import com.misc.touse.moplaf.touseflock.UnloadShipment;
import com.misc.touse.moplaf.touseflock.calc.PropagatorCalcUnloadShipmentResource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unload Shipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.touseflock.impl.UnloadShipmentImpl#getShipment <em>Shipment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnloadShipmentImpl extends ToUseResourceMountImpl implements UnloadShipment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected UnloadShipmentImpl() {
		super();
		Util.adapt(this, PropagatorCalcUnloadShipmentResource.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TouseflockPackage.Literals.UNLOAD_SHIPMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shipment getShipment() {
		if (eContainerFeatureID() != TouseflockPackage.UNLOAD_SHIPMENT__SHIPMENT) return null;
		return (Shipment)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShipment(Shipment newShipment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newShipment, TouseflockPackage.UNLOAD_SHIPMENT__SHIPMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShipment(Shipment newShipment) {
		if (newShipment != eInternalContainer() || (eContainerFeatureID() != TouseflockPackage.UNLOAD_SHIPMENT__SHIPMENT && newShipment != null)) {
			if (EcoreUtil.isAncestor(this, newShipment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newShipment != null)
				msgs = ((InternalEObject)newShipment).eInverseAdd(this, TouseflockPackage.SHIPMENT__UNLOAD, Shipment.class, msgs);
			msgs = basicSetShipment(newShipment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouseflockPackage.UNLOAD_SHIPMENT__SHIPMENT, newShipment, newShipment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TouseflockPackage.UNLOAD_SHIPMENT__SHIPMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetShipment((Shipment)otherEnd, msgs);
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
			case TouseflockPackage.UNLOAD_SHIPMENT__SHIPMENT:
				return basicSetShipment(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case TouseflockPackage.UNLOAD_SHIPMENT__SHIPMENT:
				return eInternalContainer().eInverseRemove(this, TouseflockPackage.SHIPMENT__UNLOAD, Shipment.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TouseflockPackage.UNLOAD_SHIPMENT__SHIPMENT:
				return getShipment();
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
			case TouseflockPackage.UNLOAD_SHIPMENT__SHIPMENT:
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
			case TouseflockPackage.UNLOAD_SHIPMENT__SHIPMENT:
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
			case TouseflockPackage.UNLOAD_SHIPMENT__SHIPMENT:
				return getShipment() != null;
		}
		return super.eIsSet(featureID);
	}

	/* (non-Javadoc)
	 * @see com.misc.touse.moplaf.touseflock.impl.ToUseResourceTransitionImpl#refreshResource()
	 */
	@Override
	public void refreshResource() {
		super.refreshResource();
		ToUseResource resource = this.getShipment();
		this.setResource(resource);
	}
} //UnloadShipmentImpl
