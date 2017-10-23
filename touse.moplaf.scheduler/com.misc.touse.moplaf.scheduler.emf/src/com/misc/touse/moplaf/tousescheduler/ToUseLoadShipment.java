/**
 */
package com.misc.touse.moplaf.tousescheduler;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Use Load Shipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.ToUseLoadShipment#getShipmentLoaded <em>Shipment Loaded</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.ToUseLoadShipment#getUnloadShipment <em>Unload Shipment</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseLoadShipment()
 * @model
 * @generated
 */
public interface ToUseLoadShipment extends ToUseScheduleTask {

	/**
	 * Returns the value of the '<em><b>Shipment Loaded</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Loaded</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Loaded</em>' reference.
	 * @see #setShipmentLoaded(Shipment)
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseLoadShipment_ShipmentLoaded()
	 * @model required="true"
	 * @generated
	 */
	Shipment getShipmentLoaded();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousescheduler.ToUseLoadShipment#getShipmentLoaded <em>Shipment Loaded</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Loaded</em>' reference.
	 * @see #getShipmentLoaded()
	 * @generated
	 */
	void setShipmentLoaded(Shipment value);

	/**
	 * Returns the value of the '<em><b>Unload Shipment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.tousescheduler.ToUseUnloadShipment#getLoadShipment <em>Load Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unload Shipment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unload Shipment</em>' reference.
	 * @see #setUnloadShipment(ToUseUnloadShipment)
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseLoadShipment_UnloadShipment()
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseUnloadShipment#getLoadShipment
	 * @model opposite="LoadShipment" required="true"
	 * @generated
	 */
	ToUseUnloadShipment getUnloadShipment();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousescheduler.ToUseLoadShipment#getUnloadShipment <em>Unload Shipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unload Shipment</em>' reference.
	 * @see #getUnloadShipment()
	 * @generated
	 */
	void setUnloadShipment(ToUseUnloadShipment value);
} // ToUseLoadShipment
