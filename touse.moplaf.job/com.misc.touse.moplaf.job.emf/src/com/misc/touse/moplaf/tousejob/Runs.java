/**
 */
package com.misc.touse.moplaf.tousejob;

import com.misc.common.moplaf.job.Run;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousejob.Runs#getRuns <em>Runs</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousejob.Runs#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousejob.ToUseJobPackage#getRuns()
 * @model
 * @generated
 */
public interface Runs extends EObject {
	/**
	 * Returns the value of the '<em><b>Runs</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.job.Run}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runs</em>' containment reference list.
	 * @see com.misc.touse.moplaf.tousejob.ToUseJobPackage#getRuns_Runs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Run> getRuns();

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
	 * @see com.misc.touse.moplaf.tousejob.ToUseJobPackage#getRuns_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousejob.Runs#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Runs
