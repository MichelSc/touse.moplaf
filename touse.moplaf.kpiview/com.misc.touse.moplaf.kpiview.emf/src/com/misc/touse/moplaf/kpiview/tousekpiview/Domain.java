/**
 */
package com.misc.touse.moplaf.kpiview.tousekpiview;

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
 *   <li>{@link com.misc.touse.moplaf.kpiview.tousekpiview.Domain#getScenarios <em>Scenarios</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.kpiview.tousekpiview.TousekpiviewPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>Scenarios</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.kpiview.tousekpiview.Scenario}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenarios</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenarios</em>' containment reference list.
	 * @see com.misc.touse.moplaf.kpiview.tousekpiview.TousekpiviewPackage#getDomain_Scenarios()
	 * @model containment="true"
	 * @generated
	 */
	EList<Scenario> getScenarios();

} // Domain
