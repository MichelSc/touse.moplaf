/**
 */
package com.misc.tools.moplaf.model.overview;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link com.misc.tools.moplaf.model.overview.OverviewObject#getCount <em>Count</em>}</li>
 *   <li>{@link com.misc.tools.moplaf.model.overview.OverviewObject#getOverviewCounts <em>Overview Counts</em>}</li>
 *   <li>{@link com.misc.tools.moplaf.model.overview.OverviewObject#getRootOverviewCounts <em>Root Overview Counts</em>}</li>
 *   <li>{@link com.misc.tools.moplaf.model.overview.OverviewObject#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see com.misc.tools.moplaf.model.overview.ModelOverviewPackage#getOverviewObject()
 * @model
 * @generated
 */
public interface OverviewObject extends EObject {
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
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(int)
	 * @see com.misc.tools.moplaf.model.overview.ModelOverviewPackage#getOverviewObject_Count()
	 * @model
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link com.misc.tools.moplaf.model.overview.OverviewObject#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int value);

	/**
	 * Returns the value of the '<em><b>Overview Counts</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.tools.moplaf.model.overview.OverviewCount}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overview Counts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overview Counts</em>' containment reference list.
	 * @see com.misc.tools.moplaf.model.overview.ModelOverviewPackage#getOverviewObject_OverviewCounts()
	 * @model containment="true"
	 * @generated
	 */
	EList<OverviewCount> getOverviewCounts();

	/**
	 * Returns the value of the '<em><b>Root Overview Counts</b></em>' reference list.
	 * The list contents are of type {@link com.misc.tools.moplaf.model.overview.OverviewCount}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Overview Counts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Overview Counts</em>' reference list.
	 * @see com.misc.tools.moplaf.model.overview.ModelOverviewPackage#getOverviewObject_RootOverviewCounts()
	 * @model
	 * @generated
	 */
	EList<OverviewCount> getRootOverviewCounts();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.tools.moplaf.model.overview.ModelOverviewPackage#getOverviewObject_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

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
	void reset();

} // OverviewObject
