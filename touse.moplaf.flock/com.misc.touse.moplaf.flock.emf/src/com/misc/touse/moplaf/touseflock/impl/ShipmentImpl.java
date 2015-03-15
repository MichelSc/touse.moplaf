/**
 */
package com.misc.touse.moplaf.touseflock.impl;

import com.misc.touse.moplaf.touseflock.LoadShipment;
import com.misc.touse.moplaf.touseflock.Shipment;
import com.misc.touse.moplaf.touseflock.TouseflockPackage;
import com.misc.touse.moplaf.touseflock.UnloadShipment;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.touseflock.impl.ShipmentImpl#getLoad <em>Load</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.touseflock.impl.ShipmentImpl#getUnload <em>Unload</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShipmentImpl extends ToUseResourceImpl implements Shipment {
	/**
	 * The cached value of the '{@link #getLoad() <em>Load</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoad()
	 * @generated
	 * @ordered
	 */
	protected EList<LoadShipment> load;

	/**
	 * The cached value of the '{@link #getUnload() <em>Unload</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnload()
	 * @generated
	 * @ordered
	 */
	protected EList<UnloadShipment> unload;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TouseflockPackage.Literals.SHIPMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LoadShipment> getLoad() {
		if (load == null) {
			load = new EObjectContainmentWithInverseEList<LoadShipment>(LoadShipment.class, this, TouseflockPackage.SHIPMENT__LOAD, TouseflockPackage.LOAD_SHIPMENT__SHIPMENT);
		}
		return load;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnloadShipment> getUnload() {
		if (unload == null) {
			unload = new EObjectContainmentWithInverseEList<UnloadShipment>(UnloadShipment.class, this, TouseflockPackage.SHIPMENT__UNLOAD, TouseflockPackage.UNLOAD_SHIPMENT__SHIPMENT);
		}
		return unload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TouseflockPackage.SHIPMENT__LOAD:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLoad()).basicAdd(otherEnd, msgs);
			case TouseflockPackage.SHIPMENT__UNLOAD:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUnload()).basicAdd(otherEnd, msgs);
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
			case TouseflockPackage.SHIPMENT__LOAD:
				return ((InternalEList<?>)getLoad()).basicRemove(otherEnd, msgs);
			case TouseflockPackage.SHIPMENT__UNLOAD:
				return ((InternalEList<?>)getUnload()).basicRemove(otherEnd, msgs);
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
			case TouseflockPackage.SHIPMENT__LOAD:
				return getLoad();
			case TouseflockPackage.SHIPMENT__UNLOAD:
				return getUnload();
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
			case TouseflockPackage.SHIPMENT__LOAD:
				getLoad().clear();
				getLoad().addAll((Collection<? extends LoadShipment>)newValue);
				return;
			case TouseflockPackage.SHIPMENT__UNLOAD:
				getUnload().clear();
				getUnload().addAll((Collection<? extends UnloadShipment>)newValue);
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
			case TouseflockPackage.SHIPMENT__LOAD:
				getLoad().clear();
				return;
			case TouseflockPackage.SHIPMENT__UNLOAD:
				getUnload().clear();
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
			case TouseflockPackage.SHIPMENT__LOAD:
				return load != null && !load.isEmpty();
			case TouseflockPackage.SHIPMENT__UNLOAD:
				return unload != null && !unload.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ShipmentImpl
