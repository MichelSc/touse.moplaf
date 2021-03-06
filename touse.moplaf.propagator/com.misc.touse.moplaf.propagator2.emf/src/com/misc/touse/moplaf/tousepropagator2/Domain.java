/**
 */
package com.misc.touse.moplaf.tousepropagator2;

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
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.Domain#getProjects <em>Projects</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>Projects</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.tousepropagator2.Project}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' containment reference list.
	 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage#getDomain_Projects()
	 * @model containment="true"
	 * @generated
	 */
	EList<Project> getProjects();

} // Domain
