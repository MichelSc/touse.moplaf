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
 *   <li>{@link com.misc.tools.moplaf.model.overview.OverviewCount#getCountedClass <em>Counted Class</em>}</li>
 *   <li>{@link com.misc.tools.moplaf.model.overview.OverviewCount#getSubTypes <em>Sub Types</em>}</li>
 *   <li>{@link com.misc.tools.moplaf.model.overview.OverviewCount#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link com.misc.tools.moplaf.model.overview.OverviewCount#getCount <em>Count</em>}</li>
 *   <li>{@link com.misc.tools.moplaf.model.overview.OverviewCount#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see com.misc.tools.moplaf.model.overview.ModelOverviewPackage#getOverviewCount()
 * @model
 * @generated
 */
public interface OverviewCount extends EObject {
	/**
	 * Returns the value of the '<em><b>Counted Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Counted Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counted Class</em>' reference.
	 * @see #setCountedClass(EClass)
	 * @see com.misc.tools.moplaf.model.overview.ModelOverviewPackage#getOverviewCount_CountedClass()
	 * @model
	 * @generated
	 */
	EClass getCountedClass();

	/**
	 * Sets the value of the '{@link com.misc.tools.moplaf.model.overview.OverviewCount#getCountedClass <em>Counted Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counted Class</em>' reference.
	 * @see #getCountedClass()
	 * @generated
	 */
	void setCountedClass(EClass value);

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
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.tools.moplaf.model.overview.ModelOverviewPackage#getOverviewCount_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Returns the value of the '<em><b>Sub Types</b></em>' reference list.
	 * The list contents are of type {@link com.misc.tools.moplaf.model.overview.OverviewCount}.
	 * It is bidirectional and its opposite is '{@link com.misc.tools.moplaf.model.overview.OverviewCount#getSuperTypes <em>Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Types</em>' reference list.
	 * @see com.misc.tools.moplaf.model.overview.ModelOverviewPackage#getOverviewCount_SubTypes()
	 * @see com.misc.tools.moplaf.model.overview.OverviewCount#getSuperTypes
	 * @model opposite="SuperTypes"
	 * @generated
	 */
	EList<OverviewCount> getSubTypes();

	/**
	 * Returns the value of the '<em><b>Super Types</b></em>' reference list.
	 * The list contents are of type {@link com.misc.tools.moplaf.model.overview.OverviewCount}.
	 * It is bidirectional and its opposite is '{@link com.misc.tools.moplaf.model.overview.OverviewCount#getSubTypes <em>Sub Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Types</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Types</em>' reference list.
	 * @see com.misc.tools.moplaf.model.overview.ModelOverviewPackage#getOverviewCount_SuperTypes()
	 * @see com.misc.tools.moplaf.model.overview.OverviewCount#getSubTypes
	 * @model opposite="SubTypes"
	 * @generated
	 */
	EList<OverviewCount> getSuperTypes();

} // OverviewCount
