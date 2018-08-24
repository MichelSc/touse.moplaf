/**
 */
package com.misc.touse.moplaf.gridview.tousegridview;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.gridview.tousegridview.Document#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.gridview.tousegridview.Document#getAuthor <em>Author</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.gridview.tousegridview.Document#getSheets <em>Sheets</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.gridview.tousegridview.ToUseGridViewPackage#getDocument()
 * @model
 * @generated
 */
public interface Document extends EObject {

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.misc.touse.moplaf.gridview.tousegridview.ToUseGridViewPackage#getDocument_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.gridview.tousegridview.Document#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see com.misc.touse.moplaf.gridview.tousegridview.ToUseGridViewPackage#getDocument_Author()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.gridview.tousegridview.Document#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Sheets</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.gridview.tousegridview.Sheet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sheets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheets</em>' containment reference list.
	 * @see com.misc.touse.moplaf.gridview.tousegridview.ToUseGridViewPackage#getDocument_Sheets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sheet> getSheets();
} // Document
