/**
 */
package com.misc.touse.moplaf.gistouse.impl;

import com.misc.common.moplaf.gis.GisAddressGeocoder;
import com.misc.common.moplaf.gis.GisLocation;
import com.misc.common.moplaf.gis.GisLocationPinpointer;
import com.misc.common.moplaf.gis.GisRouteCalculator;
import com.misc.common.moplaf.gis.GisRoutesHolder;

import com.misc.common.moplaf.gis.kml.Kml;
import com.misc.touse.moplaf.gistouse.Domain;
import com.misc.touse.moplaf.gistouse.ToUseGisPackage;
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
 *   <li>{@link com.misc.touse.moplaf.gistouse.impl.DomainImpl#getCalculators <em>Calculators</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.gistouse.impl.DomainImpl#getGeocoders <em>Geocoders</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.gistouse.impl.DomainImpl#getPinpointers <em>Pinpointers</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.gistouse.impl.DomainImpl#getKmls <em>Kmls</em>}</li>
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
	 * The cached value of the '{@link #getCalculators() <em>Calculators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculators()
	 * @generated
	 * @ordered
	 */
	protected EList<GisRouteCalculator> calculators;

	/**
	 * The cached value of the '{@link #getGeocoders() <em>Geocoders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeocoders()
	 * @generated
	 * @ordered
	 */
	protected EList<GisAddressGeocoder> geocoders;

	/**
	 * The cached value of the '{@link #getPinpointers() <em>Pinpointers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinpointers()
	 * @generated
	 * @ordered
	 */
	protected EList<GisLocationPinpointer> pinpointers;

	/**
	 * The cached value of the '{@link #getKmls() <em>Kmls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKmls()
	 * @generated
	 * @ordered
	 */
	protected EList<Kml> kmls;

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
		return ToUseGisPackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GisLocation> getLocations() {
		if (locations == null) {
			locations = new EObjectContainmentEList<GisLocation>(GisLocation.class, this, ToUseGisPackage.DOMAIN__LOCATIONS);
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
			matrices = new EObjectContainmentEList<GisRoutesHolder>(GisRoutesHolder.class, this, ToUseGisPackage.DOMAIN__MATRICES);
		}
		return matrices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GisRouteCalculator> getCalculators() {
		if (calculators == null) {
			calculators = new EObjectContainmentEList<GisRouteCalculator>(GisRouteCalculator.class, this, ToUseGisPackage.DOMAIN__CALCULATORS);
		}
		return calculators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GisAddressGeocoder> getGeocoders() {
		if (geocoders == null) {
			geocoders = new EObjectContainmentEList<GisAddressGeocoder>(GisAddressGeocoder.class, this, ToUseGisPackage.DOMAIN__GEOCODERS);
		}
		return geocoders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GisLocationPinpointer> getPinpointers() {
		if (pinpointers == null) {
			pinpointers = new EObjectContainmentEList<GisLocationPinpointer>(GisLocationPinpointer.class, this, ToUseGisPackage.DOMAIN__PINPOINTERS);
		}
		return pinpointers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Kml> getKmls() {
		if (kmls == null) {
			kmls = new EObjectContainmentEList<Kml>(Kml.class, this, ToUseGisPackage.DOMAIN__KMLS);
		}
		return kmls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToUseGisPackage.DOMAIN__LOCATIONS:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
			case ToUseGisPackage.DOMAIN__MATRICES:
				return ((InternalEList<?>)getMatrices()).basicRemove(otherEnd, msgs);
			case ToUseGisPackage.DOMAIN__CALCULATORS:
				return ((InternalEList<?>)getCalculators()).basicRemove(otherEnd, msgs);
			case ToUseGisPackage.DOMAIN__GEOCODERS:
				return ((InternalEList<?>)getGeocoders()).basicRemove(otherEnd, msgs);
			case ToUseGisPackage.DOMAIN__PINPOINTERS:
				return ((InternalEList<?>)getPinpointers()).basicRemove(otherEnd, msgs);
			case ToUseGisPackage.DOMAIN__KMLS:
				return ((InternalEList<?>)getKmls()).basicRemove(otherEnd, msgs);
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
			case ToUseGisPackage.DOMAIN__LOCATIONS:
				return getLocations();
			case ToUseGisPackage.DOMAIN__MATRICES:
				return getMatrices();
			case ToUseGisPackage.DOMAIN__CALCULATORS:
				return getCalculators();
			case ToUseGisPackage.DOMAIN__GEOCODERS:
				return getGeocoders();
			case ToUseGisPackage.DOMAIN__PINPOINTERS:
				return getPinpointers();
			case ToUseGisPackage.DOMAIN__KMLS:
				return getKmls();
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
			case ToUseGisPackage.DOMAIN__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends GisLocation>)newValue);
				return;
			case ToUseGisPackage.DOMAIN__MATRICES:
				getMatrices().clear();
				getMatrices().addAll((Collection<? extends GisRoutesHolder>)newValue);
				return;
			case ToUseGisPackage.DOMAIN__CALCULATORS:
				getCalculators().clear();
				getCalculators().addAll((Collection<? extends GisRouteCalculator>)newValue);
				return;
			case ToUseGisPackage.DOMAIN__GEOCODERS:
				getGeocoders().clear();
				getGeocoders().addAll((Collection<? extends GisAddressGeocoder>)newValue);
				return;
			case ToUseGisPackage.DOMAIN__PINPOINTERS:
				getPinpointers().clear();
				getPinpointers().addAll((Collection<? extends GisLocationPinpointer>)newValue);
				return;
			case ToUseGisPackage.DOMAIN__KMLS:
				getKmls().clear();
				getKmls().addAll((Collection<? extends Kml>)newValue);
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
			case ToUseGisPackage.DOMAIN__LOCATIONS:
				getLocations().clear();
				return;
			case ToUseGisPackage.DOMAIN__MATRICES:
				getMatrices().clear();
				return;
			case ToUseGisPackage.DOMAIN__CALCULATORS:
				getCalculators().clear();
				return;
			case ToUseGisPackage.DOMAIN__GEOCODERS:
				getGeocoders().clear();
				return;
			case ToUseGisPackage.DOMAIN__PINPOINTERS:
				getPinpointers().clear();
				return;
			case ToUseGisPackage.DOMAIN__KMLS:
				getKmls().clear();
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
			case ToUseGisPackage.DOMAIN__LOCATIONS:
				return locations != null && !locations.isEmpty();
			case ToUseGisPackage.DOMAIN__MATRICES:
				return matrices != null && !matrices.isEmpty();
			case ToUseGisPackage.DOMAIN__CALCULATORS:
				return calculators != null && !calculators.isEmpty();
			case ToUseGisPackage.DOMAIN__GEOCODERS:
				return geocoders != null && !geocoders.isEmpty();
			case ToUseGisPackage.DOMAIN__PINPOINTERS:
				return pinpointers != null && !pinpointers.isEmpty();
			case ToUseGisPackage.DOMAIN__KMLS:
				return kmls != null && !kmls.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainImpl
