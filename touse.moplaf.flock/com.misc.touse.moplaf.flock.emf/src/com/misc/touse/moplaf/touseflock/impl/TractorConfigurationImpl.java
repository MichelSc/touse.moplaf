/**
 */
package com.misc.touse.moplaf.touseflock.impl;

import com.misc.common.moplaf.propagator.Util;
import com.misc.touse.moplaf.touseflock.ToUseResource;
import com.misc.touse.moplaf.touseflock.TouseflockPackage;
import com.misc.touse.moplaf.touseflock.Tractor;
import com.misc.touse.moplaf.touseflock.TractorConfiguration;
import com.misc.touse.moplaf.touseflock.calc.PropagatorCalcTractorConfigurationResource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tractor Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.touseflock.impl.TractorConfigurationImpl#getTractor <em>Tractor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TractorConfigurationImpl extends ToUseResourceConfigurationImpl implements TractorConfiguration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected TractorConfigurationImpl() {
		super();
		Util.adapt(this, PropagatorCalcTractorConfigurationResource.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TouseflockPackage.Literals.TRACTOR_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tractor getTractor() {
		if (eContainerFeatureID() != TouseflockPackage.TRACTOR_CONFIGURATION__TRACTOR) return null;
		return (Tractor)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTractor(Tractor newTractor, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTractor, TouseflockPackage.TRACTOR_CONFIGURATION__TRACTOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTractor(Tractor newTractor) {
		if (newTractor != eInternalContainer() || (eContainerFeatureID() != TouseflockPackage.TRACTOR_CONFIGURATION__TRACTOR && newTractor != null)) {
			if (EcoreUtil.isAncestor(this, newTractor))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTractor != null)
				msgs = ((InternalEObject)newTractor).eInverseAdd(this, TouseflockPackage.TRACTOR__CONFIGURATION, Tractor.class, msgs);
			msgs = basicSetTractor(newTractor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouseflockPackage.TRACTOR_CONFIGURATION__TRACTOR, newTractor, newTractor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TouseflockPackage.TRACTOR_CONFIGURATION__TRACTOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTractor((Tractor)otherEnd, msgs);
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
			case TouseflockPackage.TRACTOR_CONFIGURATION__TRACTOR:
				return basicSetTractor(null, msgs);
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
			case TouseflockPackage.TRACTOR_CONFIGURATION__TRACTOR:
				return eInternalContainer().eInverseRemove(this, TouseflockPackage.TRACTOR__CONFIGURATION, Tractor.class, msgs);
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
			case TouseflockPackage.TRACTOR_CONFIGURATION__TRACTOR:
				return getTractor();
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
			case TouseflockPackage.TRACTOR_CONFIGURATION__TRACTOR:
				setTractor((Tractor)newValue);
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
			case TouseflockPackage.TRACTOR_CONFIGURATION__TRACTOR:
				setTractor((Tractor)null);
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
			case TouseflockPackage.TRACTOR_CONFIGURATION__TRACTOR:
				return getTractor() != null;
		}
		return super.eIsSet(featureID);
	}

	/* (non-Javadoc)
	 * @see com.misc.touse.moplaf.touseflock.impl.ToUseResourceTransitionImpl#refreshResource()
	 */
	@Override
	public void refreshResource() {
		super.refreshResource();
		ToUseResource resource = this.getTractor();
		this.setResource(resource);
	}

} //TractorConfigurationImpl
