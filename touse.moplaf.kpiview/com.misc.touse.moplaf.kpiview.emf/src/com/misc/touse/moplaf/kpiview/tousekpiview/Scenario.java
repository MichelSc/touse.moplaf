/**
 */
package com.misc.touse.moplaf.kpiview.tousekpiview;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.kpiview.tousekpiview.Scenario#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.kpiview.tousekpiview.Scenario#getKPIs <em>KP Is</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.kpiview.tousekpiview.TousekpiviewPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject {
	/**
	 * Returns the value of the '<em><b>KP Is</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.kpiview.tousekpiview.KPI}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>KP Is</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>KP Is</em>' containment reference list.
	 * @see com.misc.touse.moplaf.kpiview.tousekpiview.TousekpiviewPackage#getScenario_KPIs()
	 * @model containment="true"
	 * @generated
	 */
	EList<KPI> getKPIs();

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
	 * @see com.misc.touse.moplaf.kpiview.tousekpiview.TousekpiviewPackage#getScenario_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.kpiview.tousekpiview.Scenario#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Scenario
