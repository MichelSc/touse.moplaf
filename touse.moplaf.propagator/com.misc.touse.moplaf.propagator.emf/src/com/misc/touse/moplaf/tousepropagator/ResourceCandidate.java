/**
 */
package com.misc.touse.moplaf.tousepropagator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Candidate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator.ResourceCandidate#getResource <em>Resource</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator.ResourceCandidate#getMatch <em>Match</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousepropagator.ToUsePropagatorPackage#getResourceCandidate()
 * @model
 * @generated
 */
public interface ResourceCandidate extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(Resource)
	 * @see com.misc.touse.moplaf.tousepropagator.ToUsePropagatorPackage#getResourceCandidate_Resource()
	 * @model
	 * @generated
	 */
	Resource getResource();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousepropagator.ResourceCandidate#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Resource value);

	/**
	 * Returns the value of the '<em><b>Match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Match</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match</em>' attribute.
	 * @see #setMatch(float)
	 * @see com.misc.touse.moplaf.tousepropagator.ToUsePropagatorPackage#getResourceCandidate_Match()
	 * @model
	 * @generated
	 */
	float getMatch();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousepropagator.ResourceCandidate#getMatch <em>Match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match</em>' attribute.
	 * @see #getMatch()
	 * @generated
	 */
	void setMatch(float value);

} // ResourceCandidate
