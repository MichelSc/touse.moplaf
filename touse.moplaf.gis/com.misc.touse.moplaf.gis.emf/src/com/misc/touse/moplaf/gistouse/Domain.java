/**
 */
package com.misc.touse.moplaf.gistouse;

import com.misc.common.moplaf.gis.GisLocation;
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
 * </ul>
 *
 * @see com.misc.touse.moplaf.gistouse.GistousePackage#getDomain()
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
	 * @see com.misc.touse.moplaf.gistouse.GistousePackage#getDomain_Locations()
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
	 * @see com.misc.touse.moplaf.gistouse.GistousePackage#getDomain_Matrices()
	 * @model containment="true"
	 * @generated
	 */
	EList<GisRoutesHolder> getMatrices();

} // Domain
