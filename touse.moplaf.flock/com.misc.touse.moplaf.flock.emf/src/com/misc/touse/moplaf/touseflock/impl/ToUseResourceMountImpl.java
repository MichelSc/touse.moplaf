/**
 */
package com.misc.touse.moplaf.touseflock.impl;

import com.misc.common.moplaf.flock.ChainMount;
import com.misc.common.moplaf.flock.FlockFactory;
import com.misc.common.moplaf.propagator.Util;
import com.misc.touse.moplaf.touseflock.ToUseResource;
import com.misc.touse.moplaf.touseflock.ToUseResourceMount;
import com.misc.touse.moplaf.touseflock.TouseflockPackage;
import com.misc.touse.moplaf.touseflock.calc.PropagatorCalcToUseResourceMountChainMount;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Use Resource Mount</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.touseflock.impl.ToUseResourceMountImpl#getChainMount <em>Chain Mount</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ToUseResourceMountImpl extends ToUseResourceTransitionImpl implements ToUseResourceMount {
	/**
	 * The cached value of the '{@link #getChainMount() <em>Chain Mount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChainMount()
	 * @generated
	 * @ordered
	 */
	protected ChainMount chainMount;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected ToUseResourceMountImpl() {
		super();
		Util.adapt(this, PropagatorCalcToUseResourceMountChainMount.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TouseflockPackage.Literals.TO_USE_RESOURCE_MOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainMount getChainMount() {
		return chainMount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChainMount(ChainMount newChainMount, NotificationChain msgs) {
		ChainMount oldChainMount = chainMount;
		chainMount = newChainMount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TouseflockPackage.TO_USE_RESOURCE_MOUNT__CHAIN_MOUNT, oldChainMount, newChainMount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChainMount(ChainMount newChainMount) {
		if (newChainMount != chainMount) {
			NotificationChain msgs = null;
			if (chainMount != null)
				msgs = ((InternalEObject)chainMount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TouseflockPackage.TO_USE_RESOURCE_MOUNT__CHAIN_MOUNT, null, msgs);
			if (newChainMount != null)
				msgs = ((InternalEObject)newChainMount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TouseflockPackage.TO_USE_RESOURCE_MOUNT__CHAIN_MOUNT, null, msgs);
			msgs = basicSetChainMount(newChainMount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouseflockPackage.TO_USE_RESOURCE_MOUNT__CHAIN_MOUNT, newChainMount, newChainMount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshChainMount() {
		ToUseResource resource = this.getResource(); // this is not null because set is guaranteed to occur before by propagator
        ChainMount chainMount = this.getChainMount();
		boolean tobe = resource!=null && resource.getChain()!=null;
        boolean asis = chainMount!=null;
		if ( asis && !tobe){
			chainMount.setChain(null);
			this.setChainMount(null);;
		}
		else if (  tobe && !asis ){
			// add chain configuration
			chainMount = FlockFactory.eINSTANCE.createChainMount();
			this.setChainMount(chainMount);// owning
			chainMount.setChain(resource.getChain()); 
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TouseflockPackage.TO_USE_RESOURCE_MOUNT__CHAIN_MOUNT:
				return basicSetChainMount(null, msgs);
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
			case TouseflockPackage.TO_USE_RESOURCE_MOUNT__CHAIN_MOUNT:
				return getChainMount();
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
			case TouseflockPackage.TO_USE_RESOURCE_MOUNT__CHAIN_MOUNT:
				setChainMount((ChainMount)newValue);
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
			case TouseflockPackage.TO_USE_RESOURCE_MOUNT__CHAIN_MOUNT:
				setChainMount((ChainMount)null);
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
			case TouseflockPackage.TO_USE_RESOURCE_MOUNT__CHAIN_MOUNT:
				return chainMount != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TouseflockPackage.TO_USE_RESOURCE_MOUNT___REFRESH_CHAIN_MOUNT:
				refreshChainMount();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ToUseResourceMountImpl
