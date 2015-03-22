/**
 */
package com.misc.touse.moplaf.gistouse.impl;

import com.misc.common.moplaf.gis.GisDistanceMatrix;
import com.misc.common.moplaf.gis.GisGoogle.GisAddressGeocoderGoogleWS;
import com.misc.common.moplaf.gis.GisGoogle.GisDistanceMatrixCalculatorGoogleWS;
import com.misc.common.moplaf.gis.GisLocation;
import com.misc.common.moplaf.gis.gisgisgraphy.GisAddressGeocoderGisgraphy;
import com.misc.touse.moplaf.gistouse.GistousePackage;
import com.misc.touse.moplaf.gistouse.ToUseGis;
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
 * An implementation of the model object '<em><b>To Use Gis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.gistouse.impl.ToUseGisImpl#getCalculators <em>Calculators</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.gistouse.impl.ToUseGisImpl#getMatrices <em>Matrices</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.gistouse.impl.ToUseGisImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.gistouse.impl.ToUseGisImpl#getGeocodersG <em>Geocoders G</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.gistouse.impl.ToUseGisImpl#getGeocodersGG <em>Geocoders GG</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ToUseGisImpl extends MinimalEObjectImpl.Container implements ToUseGis {
	/**
	 * The cached value of the '{@link #getCalculators() <em>Calculators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculators()
	 * @generated
	 * @ordered
	 */
	protected EList<GisDistanceMatrixCalculatorGoogleWS> calculators;

	/**
	 * The cached value of the '{@link #getMatrices() <em>Matrices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatrices()
	 * @generated
	 * @ordered
	 */
	protected EList<GisDistanceMatrix> matrices;

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
	 * The cached value of the '{@link #getGeocodersG() <em>Geocoders G</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeocodersG()
	 * @generated
	 * @ordered
	 */
	protected EList<GisAddressGeocoderGoogleWS> geocodersG;

	/**
	 * The cached value of the '{@link #getGeocodersGG() <em>Geocoders GG</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeocodersGG()
	 * @generated
	 * @ordered
	 */
	protected EList<GisAddressGeocoderGisgraphy> geocodersGG;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUseGisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GistousePackage.Literals.TO_USE_GIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GisDistanceMatrixCalculatorGoogleWS> getCalculators() {
		if (calculators == null) {
			calculators = new EObjectContainmentEList<GisDistanceMatrixCalculatorGoogleWS>(GisDistanceMatrixCalculatorGoogleWS.class, this, GistousePackage.TO_USE_GIS__CALCULATORS);
		}
		return calculators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GisLocation> getLocations() {
		if (locations == null) {
			locations = new EObjectContainmentEList<GisLocation>(GisLocation.class, this, GistousePackage.TO_USE_GIS__LOCATIONS);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GisAddressGeocoderGoogleWS> getGeocodersG() {
		if (geocodersG == null) {
			geocodersG = new EObjectContainmentEList<GisAddressGeocoderGoogleWS>(GisAddressGeocoderGoogleWS.class, this, GistousePackage.TO_USE_GIS__GEOCODERS_G);
		}
		return geocodersG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GisAddressGeocoderGisgraphy> getGeocodersGG() {
		if (geocodersGG == null) {
			geocodersGG = new EObjectContainmentEList<GisAddressGeocoderGisgraphy>(GisAddressGeocoderGisgraphy.class, this, GistousePackage.TO_USE_GIS__GEOCODERS_GG);
		}
		return geocodersGG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GisDistanceMatrix> getMatrices() {
		if (matrices == null) {
			matrices = new EObjectContainmentEList<GisDistanceMatrix>(GisDistanceMatrix.class, this, GistousePackage.TO_USE_GIS__MATRICES);
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
			case GistousePackage.TO_USE_GIS__CALCULATORS:
				return ((InternalEList<?>)getCalculators()).basicRemove(otherEnd, msgs);
			case GistousePackage.TO_USE_GIS__MATRICES:
				return ((InternalEList<?>)getMatrices()).basicRemove(otherEnd, msgs);
			case GistousePackage.TO_USE_GIS__LOCATIONS:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
			case GistousePackage.TO_USE_GIS__GEOCODERS_G:
				return ((InternalEList<?>)getGeocodersG()).basicRemove(otherEnd, msgs);
			case GistousePackage.TO_USE_GIS__GEOCODERS_GG:
				return ((InternalEList<?>)getGeocodersGG()).basicRemove(otherEnd, msgs);
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
			case GistousePackage.TO_USE_GIS__CALCULATORS:
				return getCalculators();
			case GistousePackage.TO_USE_GIS__MATRICES:
				return getMatrices();
			case GistousePackage.TO_USE_GIS__LOCATIONS:
				return getLocations();
			case GistousePackage.TO_USE_GIS__GEOCODERS_G:
				return getGeocodersG();
			case GistousePackage.TO_USE_GIS__GEOCODERS_GG:
				return getGeocodersGG();
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
			case GistousePackage.TO_USE_GIS__CALCULATORS:
				getCalculators().clear();
				getCalculators().addAll((Collection<? extends GisDistanceMatrixCalculatorGoogleWS>)newValue);
				return;
			case GistousePackage.TO_USE_GIS__MATRICES:
				getMatrices().clear();
				getMatrices().addAll((Collection<? extends GisDistanceMatrix>)newValue);
				return;
			case GistousePackage.TO_USE_GIS__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends GisLocation>)newValue);
				return;
			case GistousePackage.TO_USE_GIS__GEOCODERS_G:
				getGeocodersG().clear();
				getGeocodersG().addAll((Collection<? extends GisAddressGeocoderGoogleWS>)newValue);
				return;
			case GistousePackage.TO_USE_GIS__GEOCODERS_GG:
				getGeocodersGG().clear();
				getGeocodersGG().addAll((Collection<? extends GisAddressGeocoderGisgraphy>)newValue);
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
			case GistousePackage.TO_USE_GIS__CALCULATORS:
				getCalculators().clear();
				return;
			case GistousePackage.TO_USE_GIS__MATRICES:
				getMatrices().clear();
				return;
			case GistousePackage.TO_USE_GIS__LOCATIONS:
				getLocations().clear();
				return;
			case GistousePackage.TO_USE_GIS__GEOCODERS_G:
				getGeocodersG().clear();
				return;
			case GistousePackage.TO_USE_GIS__GEOCODERS_GG:
				getGeocodersGG().clear();
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
			case GistousePackage.TO_USE_GIS__CALCULATORS:
				return calculators != null && !calculators.isEmpty();
			case GistousePackage.TO_USE_GIS__MATRICES:
				return matrices != null && !matrices.isEmpty();
			case GistousePackage.TO_USE_GIS__LOCATIONS:
				return locations != null && !locations.isEmpty();
			case GistousePackage.TO_USE_GIS__GEOCODERS_G:
				return geocodersG != null && !geocodersG.isEmpty();
			case GistousePackage.TO_USE_GIS__GEOCODERS_GG:
				return geocodersGG != null && !geocodersGG.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ToUseGisImpl
