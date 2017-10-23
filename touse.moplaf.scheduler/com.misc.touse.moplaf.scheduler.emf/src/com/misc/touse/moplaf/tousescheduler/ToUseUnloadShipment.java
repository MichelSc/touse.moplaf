/**
 */
package com.misc.touse.moplaf.tousescheduler;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Use Unload Shipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.ToUseUnloadShipment#getShipmentUnloaded <em>Shipment Unloaded</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.ToUseUnloadShipment#getLoadShipment <em>Load Shipment</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseUnloadShipment()
 * @model
 * @generated
 */
public interface ToUseUnloadShipment extends ToUseScheduleTask {
	/**
	 * Returns the value of the '<em><b>Shipment Unloaded</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Unloaded</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Unloaded</em>' reference.
	 * @see #setShipmentUnloaded(Shipment)
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseUnloadShipment_ShipmentUnloaded()
	 * @model required="true"
	 * @generated
	 */
	Shipment getShipmentUnloaded();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousescheduler.ToUseUnloadShipment#getShipmentUnloaded <em>Shipment Unloaded</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Unloaded</em>' reference.
	 * @see #getShipmentUnloaded()
	 * @generated
	 */
	void setShipmentUnloaded(Shipment value);

	/**
	 * Returns the value of the '<em><b>Load Shipment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.tousescheduler.ToUseLoadShipment#getUnloadShipment <em>Unload Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Shipment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Shipment</em>' reference.
	 * @see #setLoadShipment(ToUseLoadShipment)
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseUnloadShipment_LoadShipment()
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseLoadShipment#getUnloadShipment
	 * @model opposite="UnloadShipment" required="true"
	 * @generated
	 */
	ToUseLoadShipment getLoadShipment();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousescheduler.ToUseUnloadShipment#getLoadShipment <em>Load Shipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Shipment</em>' reference.
	 * @see #getLoadShipment()
	 * @generated
	 */
	void setLoadShipment(ToUseLoadShipment value);

} // ToUseUnloadShipment
