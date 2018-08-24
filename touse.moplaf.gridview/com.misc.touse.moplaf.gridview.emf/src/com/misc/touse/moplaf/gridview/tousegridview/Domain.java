/**
 */
package com.misc.touse.moplaf.gridview.tousegridview;

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
 *   <li>{@link com.misc.touse.moplaf.gridview.tousegridview.Domain#getDocuments <em>Documents</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.gridview.tousegridview.ToUseGridViewPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>Documents</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.gridview.tousegridview.Document}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documents</em>' containment reference list.
	 * @see com.misc.touse.moplaf.gridview.tousegridview.ToUseGridViewPackage#getDomain_Documents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Document> getDocuments();

} // Domain
