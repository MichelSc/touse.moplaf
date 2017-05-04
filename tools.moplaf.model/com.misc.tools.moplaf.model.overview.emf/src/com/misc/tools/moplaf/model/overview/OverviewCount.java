/**
 */
package com.misc.tools.moplaf.model.overview;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Overview Count</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.tools.moplaf.model.overview.OverviewCount#getCount <em>Count</em>}</li>
 *   <li>{@link com.misc.tools.moplaf.model.overview.OverviewCount#getClass_ <em>Class</em>}</li>
 *   <li>{@link com.misc.tools.moplaf.model.overview.OverviewCount#getSubTypes <em>Sub Types</em>}</li>
 * </ul>
 *
 * @see com.misc.tools.moplaf.model.overview.ModelOverviewPackage#getOverviewCount()
 * @model
 * @generated
 */
public interface OverviewCount extends EObject {
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
	 * @see com.misc.tools.moplaf.model.overview.ModelOverviewPackage#getOverviewCount_Count()
	 * @model
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link com.misc.tools.moplaf.model.overview.OverviewCount#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' reference.
	 * @see #setClass(EClass)
	 * @see com.misc.tools.moplaf.model.overview.ModelOverviewPackage#getOverviewCount_Class()
	 * @model
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Sets the value of the '{@link com.misc.tools.moplaf.model.overview.OverviewCount#getClass_ <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Sub Types</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.tools.moplaf.model.overview.OverviewCount}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Types</em>' containment reference list.
	 * @see com.misc.tools.moplaf.model.overview.ModelOverviewPackage#getOverviewCount_SubTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<OverviewCount> getSubTypes();

} // OverviewCount
