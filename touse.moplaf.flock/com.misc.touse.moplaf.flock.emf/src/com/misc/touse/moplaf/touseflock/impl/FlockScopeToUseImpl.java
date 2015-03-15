/**
 */
package com.misc.touse.moplaf.touseflock.impl;

import com.misc.common.moplaf.flock.impl.FlockScopeImpl;
import com.misc.common.moplaf.propagator.Util;
import com.misc.touse.moplaf.touseflock.FlockScopeToUse;
import com.misc.touse.moplaf.touseflock.ToUseDomain;
import com.misc.touse.moplaf.touseflock.TouseflockPackage;
import com.misc.touse.moplaf.touseflock.calc.PropagatorCalcFlockScopeToUse;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flock Scope To Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.touseflock.impl.FlockScopeToUseImpl#getToUseDomain <em>To Use Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlockScopeToUseImpl extends FlockScopeImpl implements FlockScopeToUse {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected FlockScopeToUseImpl() {
		super();
		Util.adapt(this, PropagatorCalcFlockScopeToUse.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TouseflockPackage.Literals.FLOCK_SCOPE_TO_USE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseDomain getToUseDomain() {
		if (eContainerFeatureID() != TouseflockPackage.FLOCK_SCOPE_TO_USE__TO_USE_DOMAIN) return null;
		return (ToUseDomain)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToUseDomain(ToUseDomain newToUseDomain, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newToUseDomain, TouseflockPackage.FLOCK_SCOPE_TO_USE__TO_USE_DOMAIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToUseDomain(ToUseDomain newToUseDomain) {
		if (newToUseDomain != eInternalContainer() || (eContainerFeatureID() != TouseflockPackage.FLOCK_SCOPE_TO_USE__TO_USE_DOMAIN && newToUseDomain != null)) {
			if (EcoreUtil.isAncestor(this, newToUseDomain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newToUseDomain != null)
				msgs = ((InternalEObject)newToUseDomain).eInverseAdd(this, TouseflockPackage.TO_USE_DOMAIN__FLOCK_SCOPE, ToUseDomain.class, msgs);
			msgs = basicSetToUseDomain(newToUseDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouseflockPackage.FLOCK_SCOPE_TO_USE__TO_USE_DOMAIN, newToUseDomain, newToUseDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TouseflockPackage.FLOCK_SCOPE_TO_USE__TO_USE_DOMAIN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetToUseDomain((ToUseDomain)otherEnd, msgs);
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
			case TouseflockPackage.FLOCK_SCOPE_TO_USE__TO_USE_DOMAIN:
				return basicSetToUseDomain(null, msgs);
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
			case TouseflockPackage.FLOCK_SCOPE_TO_USE__TO_USE_DOMAIN:
				return eInternalContainer().eInverseRemove(this, TouseflockPackage.TO_USE_DOMAIN__FLOCK_SCOPE, ToUseDomain.class, msgs);
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
			case TouseflockPackage.FLOCK_SCOPE_TO_USE__TO_USE_DOMAIN:
				return getToUseDomain();
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
			case TouseflockPackage.FLOCK_SCOPE_TO_USE__TO_USE_DOMAIN:
				setToUseDomain((ToUseDomain)newValue);
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
			case TouseflockPackage.FLOCK_SCOPE_TO_USE__TO_USE_DOMAIN:
				setToUseDomain((ToUseDomain)null);
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
			case TouseflockPackage.FLOCK_SCOPE_TO_USE__TO_USE_DOMAIN:
				return getToUseDomain() != null;
		}
		return super.eIsSet(featureID);
	}

} //FlockScopeToUseImpl
