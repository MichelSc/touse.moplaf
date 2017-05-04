/**
 */
package com.misc.tools.moplaf.model.overview;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Overview Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.tools.moplaf.model.overview.OverviewObject#getRootObject <em>Root Object</em>}</li>
 *   <li>{@link com.misc.tools.moplaf.model.overview.OverviewObject#getRemarks <em>Remarks</em>}</li>
 * </ul>
 *
 * @see com.misc.tools.moplaf.model.overview.ModelOverviewPackage#getOverviewObject()
 * @model
 * @generated
 */
public interface OverviewObject extends OverviewCount {
	/**
	 * Returns the value of the '<em><b>Root Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Object</em>' reference.
	 * @see #setRootObject(EObject)
	 * @see com.misc.tools.moplaf.model.overview.ModelOverviewPackage#getOverviewObject_RootObject()
	 * @model
	 * @generated
	 */
	EObject getRootObject();

	/**
	 * Sets the value of the '{@link com.misc.tools.moplaf.model.overview.OverviewObject#getRootObject <em>Root Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Object</em>' reference.
	 * @see #getRootObject()
	 * @generated
	 */
	void setRootObject(EObject value);

	/**
	 * Returns the value of the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remarks</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remarks</em>' attribute.
	 * @see #setRemarks(String)
	 * @see com.misc.tools.moplaf.model.overview.ModelOverviewPackage#getOverviewObject_Remarks()
	 * @model
	 * @generated
	 */
	String getRemarks();

	/**
	 * Sets the value of the '{@link com.misc.tools.moplaf.model.overview.OverviewObject#getRemarks <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' attribute.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refresh();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void bookInstance(EObject instance);

} // OverviewObject
