/**
 */
package com.misc.touse.moplaf.touseflock.impl;

import com.misc.common.moplaf.propagator.Util;
import com.misc.touse.moplaf.touseflock.AttachTrailer;
import com.misc.touse.moplaf.touseflock.ToUseResource;
import com.misc.touse.moplaf.touseflock.TouseflockPackage;
import com.misc.touse.moplaf.touseflock.Trailer;
import com.misc.touse.moplaf.touseflock.calc.PropagatorCalcAttachTrailerResource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attach Trailer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.touseflock.impl.AttachTrailerImpl#getTrailer <em>Trailer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttachTrailerImpl extends ToUseResourceMountImpl implements AttachTrailer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected AttachTrailerImpl() {
		super();
		Util.adapt(this, PropagatorCalcAttachTrailerResource.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TouseflockPackage.Literals.ATTACH_TRAILER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trailer getTrailer() {
		if (eContainerFeatureID() != TouseflockPackage.ATTACH_TRAILER__TRAILER) return null;
		return (Trailer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrailer(Trailer newTrailer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTrailer, TouseflockPackage.ATTACH_TRAILER__TRAILER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrailer(Trailer newTrailer) {
		if (newTrailer != eInternalContainer() || (eContainerFeatureID() != TouseflockPackage.ATTACH_TRAILER__TRAILER && newTrailer != null)) {
			if (EcoreUtil.isAncestor(this, newTrailer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTrailer != null)
				msgs = ((InternalEObject)newTrailer).eInverseAdd(this, TouseflockPackage.TRAILER__ATTACH, Trailer.class, msgs);
			msgs = basicSetTrailer(newTrailer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouseflockPackage.ATTACH_TRAILER__TRAILER, newTrailer, newTrailer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TouseflockPackage.ATTACH_TRAILER__TRAILER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTrailer((Trailer)otherEnd, msgs);
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
			case TouseflockPackage.ATTACH_TRAILER__TRAILER:
				return basicSetTrailer(null, msgs);
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
			case TouseflockPackage.ATTACH_TRAILER__TRAILER:
				return eInternalContainer().eInverseRemove(this, TouseflockPackage.TRAILER__ATTACH, Trailer.class, msgs);
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
			case TouseflockPackage.ATTACH_TRAILER__TRAILER:
				return getTrailer();
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
			case TouseflockPackage.ATTACH_TRAILER__TRAILER:
				setTrailer((Trailer)newValue);
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
			case TouseflockPackage.ATTACH_TRAILER__TRAILER:
				setTrailer((Trailer)null);
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
			case TouseflockPackage.ATTACH_TRAILER__TRAILER:
				return getTrailer() != null;
		}
		return super.eIsSet(featureID);
	}

	/* (non-Javadoc)
	 * @see com.misc.touse.moplaf.touseflock.impl.ToUseResourceTransitionImpl#refreshResource()
	 */
	@Override
	public void refreshResource() {
		super.refreshResource();
		ToUseResource resource = this.getTrailer();
		this.setResource(resource);
	}
} //AttachTrailerImpl
