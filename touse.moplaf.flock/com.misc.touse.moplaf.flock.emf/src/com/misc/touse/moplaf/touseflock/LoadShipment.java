/**
 */
package com.misc.touse.moplaf.touseflock;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Shipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.touseflock.LoadShipment#getShipment <em>Shipment</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.touse.moplaf.touseflock.TouseflockPackage#getLoadShipment()
 * @model
 * @generated
 */
public interface LoadShipment extends ToUseResourceMount {

	/**
	 * Returns the value of the '<em><b>Shipment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.touseflock.Shipment#getLoad <em>Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment</em>' container reference.
	 * @see #setShipment(Shipment)
	 * @see com.misc.touse.moplaf.touseflock.TouseflockPackage#getLoadShipment_Shipment()
	 * @see com.misc.touse.moplaf.touseflock.Shipment#getLoad
	 * @model opposite="Load" required="true" transient="false"
	 * @generated
	 */
	Shipment getShipment();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.touseflock.LoadShipment#getShipment <em>Shipment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment</em>' container reference.
	 * @see #getShipment()
	 * @generated
	 */
	void setShipment(Shipment value);
} // LoadShipment
