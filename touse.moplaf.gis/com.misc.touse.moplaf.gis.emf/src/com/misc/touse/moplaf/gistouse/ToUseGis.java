/**
 */
package com.misc.touse.moplaf.gistouse;

import com.misc.common.moplaf.gis.GisCoordinates;
import com.misc.common.moplaf.gis.GisDistanceMatrix;
import com.misc.common.moplaf.gis.GisGoogle.GisDistanceMatrixCalculatorGoogleWS;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Use Gis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.gistouse.ToUseGis#getCalculators <em>Calculators</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.gistouse.ToUseGis#getLocations <em>Locations</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.gistouse.ToUseGis#getMatrices <em>Matrices</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.touse.moplaf.gistouse.GistousePackage#getToUseGis()
 * @model
 * @generated
 */
public interface ToUseGis extends EObject {
	/**
	 * Returns the value of the '<em><b>Calculators</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.gis.GisGoogle.GisDistanceMatrixCalculatorGoogleWS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calculators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculators</em>' containment reference list.
	 * @see com.misc.touse.moplaf.gistouse.GistousePackage#getToUseGis_Calculators()
	 * @model containment="true"
	 * @generated
	 */
	EList<GisDistanceMatrixCalculatorGoogleWS> getCalculators();

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.gis.GisCoordinates}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' containment reference list.
	 * @see com.misc.touse.moplaf.gistouse.GistousePackage#getToUseGis_Locations()
	 * @model containment="true"
	 * @generated
	 */
	EList<GisCoordinates> getLocations();

	/**
	 * Returns the value of the '<em><b>Matrices</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.gis.GisDistanceMatrix}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matrices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matrices</em>' containment reference list.
	 * @see com.misc.touse.moplaf.gistouse.GistousePackage#getToUseGis_Matrices()
	 * @model containment="true"
	 * @generated
	 */
	EList<GisDistanceMatrix> getMatrices();

} // ToUseGis
