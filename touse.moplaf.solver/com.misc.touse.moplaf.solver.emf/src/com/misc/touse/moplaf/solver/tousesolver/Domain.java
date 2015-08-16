/**
 */
package com.misc.touse.moplaf.solver.tousesolver;

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
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.Domain#getRootFolder <em>Root Folder</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>Root Folder</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.solver.tousesolver.DomainObjectFolder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Folder</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Folder</em>' containment reference list.
	 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getDomain_RootFolder()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainObjectFolder> getRootFolder();

} // Domain
