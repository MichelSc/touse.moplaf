/**
 */
package com.misc.touse.moplaf.gistouse;

import com.misc.common.moplaf.gis.GisAddressGeocoder;
import com.misc.common.moplaf.gis.GisLocation;
import com.misc.common.moplaf.gis.GisLocationPinpointer;
import com.misc.common.moplaf.gis.GisRouteCalculator;
import com.misc.common.moplaf.gis.GisRoutesHolder;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.gistouse.Domain#getLocations <em>Locations</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.gistouse.Domain#getMatrices <em>Matrices</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.gistouse.Domain#getCalculators <em>Calculators</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.gistouse.Domain#getGeocoders <em>Geocoders</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.gistouse.Domain#getPinpointers <em>Pinpointers</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.gistouse.ToUseGisPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>Locations</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.gis.GisLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' containment reference list.
	 * @see com.misc.touse.moplaf.gistouse.ToUseGisPackage#getDomain_Locations()
	 * @model containment="true"
	 * @generated
	 */
	EList<GisLocation> getLocations();

	/**
	 * Returns the value of the '<em><b>Matrices</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.gis.GisRoutesHolder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matrices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matrices</em>' containment reference list.
	 * @see com.misc.touse.moplaf.gistouse.ToUseGisPackage#getDomain_Matrices()
	 * @model containment="true"
	 * @generated
	 */
	EList<GisRoutesHolder> getMatrices();

	/**
	 * Returns the value of the '<em><b>Calculators</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.gis.GisRouteCalculator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calculators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculators</em>' containment reference list.
	 * @see com.misc.touse.moplaf.gistouse.ToUseGisPackage#getDomain_Calculators()
	 * @model containment="true"
	 * @generated
	 */
	EList<GisRouteCalculator> getCalculators();

	/**
	 * Returns the value of the '<em><b>Geocoders</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.gis.GisAddressGeocoder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geocoders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geocoders</em>' containment reference list.
	 * @see com.misc.touse.moplaf.gistouse.ToUseGisPackage#getDomain_Geocoders()
	 * @model containment="true"
	 * @generated
	 */
	EList<GisAddressGeocoder> getGeocoders();

	/**
	 * Returns the value of the '<em><b>Pinpointers</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.gis.GisLocationPinpointer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pinpointers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pinpointers</em>' containment reference list.
	 * @see com.misc.touse.moplaf.gistouse.ToUseGisPackage#getDomain_Pinpointers()
	 * @model containment="true"
	 * @generated
	 */
	EList<GisLocationPinpointer> getPinpointers();

} // Domain
