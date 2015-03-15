/**
 */
package com.misc.touse.moplaf.touseflock.impl;

import com.misc.touse.moplaf.touseflock.AttachTrailer;
import com.misc.touse.moplaf.touseflock.DetachTrailer;
import com.misc.touse.moplaf.touseflock.TouseflockPackage;
import com.misc.touse.moplaf.touseflock.Trailer;
import com.misc.touse.moplaf.touseflock.TrailerConfiguration;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trailer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.touseflock.impl.TrailerImpl#getDetach <em>Detach</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.touseflock.impl.TrailerImpl#getAttach <em>Attach</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.touseflock.impl.TrailerImpl#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrailerImpl extends ToUseResourceImpl implements Trailer {
	/**
	 * The cached value of the '{@link #getDetach() <em>Detach</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetach()
	 * @generated
	 * @ordered
	 */
	protected EList<DetachTrailer> detach;

	/**
	 * The cached value of the '{@link #getAttach() <em>Attach</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttach()
	 * @generated
	 * @ordered
	 */
	protected EList<AttachTrailer> attach;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<TrailerConfiguration> configuration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrailerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TouseflockPackage.Literals.TRAILER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DetachTrailer> getDetach() {
		if (detach == null) {
			detach = new EObjectContainmentWithInverseEList<DetachTrailer>(DetachTrailer.class, this, TouseflockPackage.TRAILER__DETACH, TouseflockPackage.DETACH_TRAILER__TRAILER);
		}
		return detach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttachTrailer> getAttach() {
		if (attach == null) {
			attach = new EObjectContainmentWithInverseEList<AttachTrailer>(AttachTrailer.class, this, TouseflockPackage.TRAILER__ATTACH, TouseflockPackage.ATTACH_TRAILER__TRAILER);
		}
		return attach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrailerConfiguration> getConfiguration() {
		if (configuration == null) {
			configuration = new EObjectContainmentWithInverseEList<TrailerConfiguration>(TrailerConfiguration.class, this, TouseflockPackage.TRAILER__CONFIGURATION, TouseflockPackage.TRAILER_CONFIGURATION__TRAILER);
		}
		return configuration;
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
			case TouseflockPackage.TRAILER__DETACH:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDetach()).basicAdd(otherEnd, msgs);
			case TouseflockPackage.TRAILER__ATTACH:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttach()).basicAdd(otherEnd, msgs);
			case TouseflockPackage.TRAILER__CONFIGURATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConfiguration()).basicAdd(otherEnd, msgs);
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
			case TouseflockPackage.TRAILER__DETACH:
				return ((InternalEList<?>)getDetach()).basicRemove(otherEnd, msgs);
			case TouseflockPackage.TRAILER__ATTACH:
				return ((InternalEList<?>)getAttach()).basicRemove(otherEnd, msgs);
			case TouseflockPackage.TRAILER__CONFIGURATION:
				return ((InternalEList<?>)getConfiguration()).basicRemove(otherEnd, msgs);
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
			case TouseflockPackage.TRAILER__DETACH:
				return getDetach();
			case TouseflockPackage.TRAILER__ATTACH:
				return getAttach();
			case TouseflockPackage.TRAILER__CONFIGURATION:
				return getConfiguration();
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
			case TouseflockPackage.TRAILER__DETACH:
				getDetach().clear();
				getDetach().addAll((Collection<? extends DetachTrailer>)newValue);
				return;
			case TouseflockPackage.TRAILER__ATTACH:
				getAttach().clear();
				getAttach().addAll((Collection<? extends AttachTrailer>)newValue);
				return;
			case TouseflockPackage.TRAILER__CONFIGURATION:
				getConfiguration().clear();
				getConfiguration().addAll((Collection<? extends TrailerConfiguration>)newValue);
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
			case TouseflockPackage.TRAILER__DETACH:
				getDetach().clear();
				return;
			case TouseflockPackage.TRAILER__ATTACH:
				getAttach().clear();
				return;
			case TouseflockPackage.TRAILER__CONFIGURATION:
				getConfiguration().clear();
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
			case TouseflockPackage.TRAILER__DETACH:
				return detach != null && !detach.isEmpty();
			case TouseflockPackage.TRAILER__ATTACH:
				return attach != null && !attach.isEmpty();
			case TouseflockPackage.TRAILER__CONFIGURATION:
				return configuration != null && !configuration.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TrailerImpl
