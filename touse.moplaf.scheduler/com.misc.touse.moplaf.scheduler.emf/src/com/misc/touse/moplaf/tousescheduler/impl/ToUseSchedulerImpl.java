/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.common.moplaf.localsearch.Score;
import com.misc.common.moplaf.scheduler.Schedule;
import com.misc.common.moplaf.scheduler.impl.SchedulerImpl;
import com.misc.touse.moplaf.tousescheduler.Shipment;
import com.misc.touse.moplaf.tousescheduler.ToUseLoadShipment;
import com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource;
import com.misc.touse.moplaf.tousescheduler.ToUseScheduler;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerFactory;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;
import com.misc.touse.moplaf.tousescheduler.ToUseUnloadShipment;
import com.misc.touse.moplaf.tousescheduler.Vehicle;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Use Scheduler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerImpl#getSelectedVehicles <em>Selected Vehicles</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerImpl#getSelectedShipments <em>Selected Shipments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToUseSchedulerImpl extends SchedulerImpl implements ToUseScheduler {
	/**
	 * The cached value of the '{@link #getSelectedVehicles() <em>Selected Vehicles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedVehicles()
	 * @generated
	 * @ordered
	 */
	protected EList<Vehicle> selectedVehicles;
	/**
	 * The cached value of the '{@link #getSelectedShipments() <em>Selected Shipments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedShipments()
	 * @generated
	 * @ordered
	 */
	protected EList<Shipment> selectedShipments;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUseSchedulerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseSchedulerPackage.Literals.TO_USE_SCHEDULER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vehicle> getSelectedVehicles() {
		if (selectedVehicles == null) {
			selectedVehicles = new EObjectResolvingEList<Vehicle>(Vehicle.class, this, ToUseSchedulerPackage.TO_USE_SCHEDULER__SELECTED_VEHICLES);
		}
		return selectedVehicles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Shipment> getSelectedShipments() {
		if (selectedShipments == null) {
			selectedShipments = new EObjectResolvingEList<Shipment>(Shipment.class, this, ToUseSchedulerPackage.TO_USE_SCHEDULER__SELECTED_SHIPMENTS);
		}
		return selectedShipments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUseSchedulerPackage.TO_USE_SCHEDULER__SELECTED_VEHICLES:
				return getSelectedVehicles();
			case ToUseSchedulerPackage.TO_USE_SCHEDULER__SELECTED_SHIPMENTS:
				return getSelectedShipments();
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
			case ToUseSchedulerPackage.TO_USE_SCHEDULER__SELECTED_VEHICLES:
				getSelectedVehicles().clear();
				getSelectedVehicles().addAll((Collection<? extends Vehicle>)newValue);
				return;
			case ToUseSchedulerPackage.TO_USE_SCHEDULER__SELECTED_SHIPMENTS:
				getSelectedShipments().clear();
				getSelectedShipments().addAll((Collection<? extends Shipment>)newValue);
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
			case ToUseSchedulerPackage.TO_USE_SCHEDULER__SELECTED_VEHICLES:
				getSelectedVehicles().clear();
				return;
			case ToUseSchedulerPackage.TO_USE_SCHEDULER__SELECTED_SHIPMENTS:
				getSelectedShipments().clear();
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
			case ToUseSchedulerPackage.TO_USE_SCHEDULER__SELECTED_VEHICLES:
				return selectedVehicles != null && !selectedVehicles.isEmpty();
			case ToUseSchedulerPackage.TO_USE_SCHEDULER__SELECTED_SHIPMENTS:
				return selectedShipments != null && !selectedShipments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public Score constructScore() {
		Score new_score = ToUseSchedulerFactory.eINSTANCE.createToUseScore();
		return new_score;
	}
	
	
	

} //ToUseSchedulerImpl
