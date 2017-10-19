/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.touse.moplaf.tousescheduler.Domain;
import com.misc.touse.moplaf.tousescheduler.Shipment;
import com.misc.touse.moplaf.tousescheduler.ToUseScheduler;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;
import com.misc.touse.moplaf.tousescheduler.Vehicle;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.DomainImpl#getSchedulers <em>Schedulers</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.DomainImpl#getVehicles <em>Vehicles</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.DomainImpl#getShipments <em>Shipments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainImpl extends MinimalEObjectImpl.Container implements Domain {
	/**
	 * The cached value of the '{@link #getSchedulers() <em>Schedulers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulers()
	 * @generated
	 * @ordered
	 */
	protected EList<ToUseScheduler> schedulers;

	/**
	 * The cached value of the '{@link #getVehicles() <em>Vehicles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicles()
	 * @generated
	 * @ordered
	 */
	protected EList<Vehicle> vehicles;

	/**
	 * The cached value of the '{@link #getShipments() <em>Shipments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipments()
	 * @generated
	 * @ordered
	 */
	protected EList<Shipment> shipments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseSchedulerPackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ToUseScheduler> getSchedulers() {
		if (schedulers == null) {
			schedulers = new EObjectContainmentEList<ToUseScheduler>(ToUseScheduler.class, this, ToUseSchedulerPackage.DOMAIN__SCHEDULERS);
		}
		return schedulers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vehicle> getVehicles() {
		if (vehicles == null) {
			vehicles = new EObjectContainmentEList<Vehicle>(Vehicle.class, this, ToUseSchedulerPackage.DOMAIN__VEHICLES);
		}
		return vehicles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Shipment> getShipments() {
		if (shipments == null) {
			shipments = new EObjectContainmentEList<Shipment>(Shipment.class, this, ToUseSchedulerPackage.DOMAIN__SHIPMENTS);
		}
		return shipments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToUseSchedulerPackage.DOMAIN__SCHEDULERS:
				return ((InternalEList<?>)getSchedulers()).basicRemove(otherEnd, msgs);
			case ToUseSchedulerPackage.DOMAIN__VEHICLES:
				return ((InternalEList<?>)getVehicles()).basicRemove(otherEnd, msgs);
			case ToUseSchedulerPackage.DOMAIN__SHIPMENTS:
				return ((InternalEList<?>)getShipments()).basicRemove(otherEnd, msgs);
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
			case ToUseSchedulerPackage.DOMAIN__SCHEDULERS:
				return getSchedulers();
			case ToUseSchedulerPackage.DOMAIN__VEHICLES:
				return getVehicles();
			case ToUseSchedulerPackage.DOMAIN__SHIPMENTS:
				return getShipments();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ToUseSchedulerPackage.DOMAIN__SCHEDULERS:
				getSchedulers().clear();
				getSchedulers().addAll((Collection<? extends ToUseScheduler>)newValue);
				return;
			case ToUseSchedulerPackage.DOMAIN__VEHICLES:
				getVehicles().clear();
				getVehicles().addAll((Collection<? extends Vehicle>)newValue);
				return;
			case ToUseSchedulerPackage.DOMAIN__SHIPMENTS:
				getShipments().clear();
				getShipments().addAll((Collection<? extends Shipment>)newValue);
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
			case ToUseSchedulerPackage.DOMAIN__SCHEDULERS:
				getSchedulers().clear();
				return;
			case ToUseSchedulerPackage.DOMAIN__VEHICLES:
				getVehicles().clear();
				return;
			case ToUseSchedulerPackage.DOMAIN__SHIPMENTS:
				getShipments().clear();
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
			case ToUseSchedulerPackage.DOMAIN__SCHEDULERS:
				return schedulers != null && !schedulers.isEmpty();
			case ToUseSchedulerPackage.DOMAIN__VEHICLES:
				return vehicles != null && !vehicles.isEmpty();
			case ToUseSchedulerPackage.DOMAIN__SHIPMENTS:
				return shipments != null && !shipments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainImpl
