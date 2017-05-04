/**
 */
package com.misc.tools.moplaf.model.overview;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Overviews</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.tools.moplaf.model.overview.Overviews#getRootObjects <em>Root Objects</em>}</li>
 *   <li>{@link com.misc.tools.moplaf.model.overview.Overviews#getSubOverviews <em>Sub Overviews</em>}</li>
 *   <li>{@link com.misc.tools.moplaf.model.overview.Overviews#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.tools.moplaf.model.overview.Overviews#getRemarks <em>Remarks</em>}</li>
 * </ul>
 *
 * @see com.misc.tools.moplaf.model.overview.ModelOverviewPackage#getOverviews()
 * @model
 * @generated
 */
public interface Overviews extends EObject {
	/**
	 * Returns the value of the '<em><b>Root Objects</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.tools.moplaf.model.overview.OverviewObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Objects</em>' containment reference list.
	 * @see com.misc.tools.moplaf.model.overview.ModelOverviewPackage#getOverviews_RootObjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<OverviewObject> getRootObjects();

	/**
	 * Returns the value of the '<em><b>Sub Overviews</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.tools.moplaf.model.overview.Overviews}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Overviews</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Overviews</em>' containment reference list.
	 * @see com.misc.tools.moplaf.model.overview.ModelOverviewPackage#getOverviews_SubOverviews()
	 * @model containment="true"
	 * @generated
	 */
	EList<Overviews> getSubOverviews();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.misc.tools.moplaf.model.overview.ModelOverviewPackage#getOverviews_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.tools.moplaf.model.overview.Overviews#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see com.misc.tools.moplaf.model.overview.ModelOverviewPackage#getOverviews_Remarks()
	 * @model
	 * @generated
	 */
	String getRemarks();

	/**
	 * Sets the value of the '{@link com.misc.tools.moplaf.model.overview.Overviews#getRemarks <em>Remarks</em>}' attribute.
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
	void addObject(EObject root);

} // Overviews
