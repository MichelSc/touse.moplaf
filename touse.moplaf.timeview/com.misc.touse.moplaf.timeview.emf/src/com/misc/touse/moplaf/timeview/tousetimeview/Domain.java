/**
 */
package com.misc.touse.moplaf.timeview.tousetimeview;

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
 *   <li>{@link com.misc.touse.moplaf.timeview.tousetimeview.Domain#getRootFolders <em>Root Folders</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.timeview.tousetimeview.TousetimeviewPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>Root Folders</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.timeview.tousetimeview.Folder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Folders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Folders</em>' containment reference list.
	 * @see com.misc.touse.moplaf.timeview.tousetimeview.TousetimeviewPackage#getDomain_RootFolders()
	 * @model containment="true"
	 * @generated
	 */
	EList<Folder> getRootFolders();

} // Domain
