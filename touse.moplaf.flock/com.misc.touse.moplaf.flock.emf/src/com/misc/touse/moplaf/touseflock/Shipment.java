/**
 */
package com.misc.touse.moplaf.touseflock;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.touseflock.Shipment#getLoad <em>Load</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.touseflock.Shipment#getUnload <em>Unload</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.touse.moplaf.touseflock.TouseflockPackage#getShipment()
 * @model
 * @generated
 */
public interface Shipment extends ToUseResource {
	/**
	 * Returns the value of the '<em><b>Load</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.touseflock.LoadShipment}.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.touseflock.LoadShipment#getShipment <em>Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load</em>' containment reference list.
	 * @see com.misc.touse.moplaf.touseflock.TouseflockPackage#getShipment_Load()
	 * @see com.misc.touse.moplaf.touseflock.LoadShipment#getShipment
	 * @model opposite="Shipment" containment="true"
	 * @generated
	 */
	EList<LoadShipment> getLoad();

	/**
	 * Returns the value of the '<em><b>Unload</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.touseflock.UnloadShipment}.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.touseflock.UnloadShipment#getShipment <em>Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unload</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unload</em>' containment reference list.
	 * @see com.misc.touse.moplaf.touseflock.TouseflockPackage#getShipment_Unload()
	 * @see com.misc.touse.moplaf.touseflock.UnloadShipment#getShipment
	 * @model opposite="Shipment" containment="true"
	 * @generated
	 */
	EList<UnloadShipment> getUnload();

} // Shipment
