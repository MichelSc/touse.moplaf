/**
 */
package com.misc.touse.moplaf.tousescheduler;

import com.misc.common.moplaf.scheduler.Scheduler;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Use Scheduler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduler#getSelectedVehicles <em>Selected Vehicles</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduler#getSelectedShipments <em>Selected Shipments</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduler#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseScheduler()
 * @model
 * @generated
 */
public interface ToUseScheduler extends Scheduler {

	/**
	 * Returns the value of the '<em><b>Selected Vehicles</b></em>' reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.tousescheduler.Vehicle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Vehicles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Vehicles</em>' reference list.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseScheduler_SelectedVehicles()
	 * @model
	 * @generated
	 */
	EList<Vehicle> getSelectedVehicles();

	/**
	 * Returns the value of the '<em><b>Selected Shipments</b></em>' reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.tousescheduler.Shipment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Shipments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Shipments</em>' reference list.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseScheduler_SelectedShipments()
	 * @model
	 * @generated
	 */
	EList<Shipment> getSelectedShipments();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.tousescheduler.ToUseAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseScheduler_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ToUseAction> getActions();
} // ToUseScheduler
