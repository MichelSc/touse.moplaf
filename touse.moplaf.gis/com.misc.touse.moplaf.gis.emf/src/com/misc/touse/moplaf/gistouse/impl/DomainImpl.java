/**
 */
package com.misc.touse.moplaf.gistouse.impl;

import com.misc.common.moplaf.gis.GisLocation;
import com.misc.common.moplaf.gis.GisRoutesHolder;

import com.misc.touse.moplaf.gistouse.Domain;
import com.misc.touse.moplaf.gistouse.GistousePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.gistouse.impl.DomainImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.gistouse.impl.DomainImpl#getMatrices <em>Matrices</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainImpl extends MinimalEObjectImpl.Container implements Domain {
	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<GisLocation> locations;

	/**
	 * The cached value of the '{@link #getMatrices() <em>Matrices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatrices()
	 * @generated
	 * @ordered
	 */
	protected EList<GisRoutesHolder> matrices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GistousePackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GisLocation> getLocations() {
		if (locations == null) {
			locations = new EObjectContainmentEList<GisLocation>(GisLocation.class, this, GistousePackage.DOMAIN__LOCATIONS);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GisRoutesHolder> getMatrices() {
		if (matrices == null) {
			matrices = new EObjectContainmentEList<GisRoutesHolder>(GisRoutesHolder.class, this, GistousePackage.DOMAIN__MATRICES);
		}
		return matrices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GistousePackage.DOMAIN__LOCATIONS:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
			case GistousePackage.DOMAIN__MATRICES:
				return ((InternalEList<?>)getMatrices()).basicRemove(otherEnd, msgs);
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
			case GistousePackage.DOMAIN__LOCATIONS:
				return getLocations();
			case GistousePackage.DOMAIN__MATRICES:
				return getMatrices();
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
			case GistousePackage.DOMAIN__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends GisLocation>)newValue);
				return;
			case GistousePackage.DOMAIN__MATRICES:
				getMatrices().clear();
				getMatrices().addAll((Collection<? extends GisRoutesHolder>)newValue);
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
			case GistousePackage.DOMAIN__LOCATIONS:
				getLocations().clear();
				return;
			case GistousePackage.DOMAIN__MATRICES:
				getMatrices().clear();
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
			case GistousePackage.DOMAIN__LOCATIONS:
				return locations != null && !locations.isEmpty();
			case GistousePackage.DOMAIN__MATRICES:
				return matrices != null && !matrices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainImpl
