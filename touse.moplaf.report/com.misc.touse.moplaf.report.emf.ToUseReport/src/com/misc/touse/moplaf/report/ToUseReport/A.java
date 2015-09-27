/**
 */
package com.misc.touse.moplaf.report.ToUseReport;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.report.ToUseReport.A#getBs <em>Bs</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.report.ToUseReport.A#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.report.ToUseReport.ToUseReportPackage#getA()
 * @model
 * @generated
 */
public interface A extends EObject {
	/**
	 * Returns the value of the '<em><b>Bs</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.report.ToUseReport.B}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bs</em>' containment reference list.
	 * @see com.misc.touse.moplaf.report.ToUseReport.ToUseReportPackage#getA_Bs()
	 * @model containment="true"
	 * @generated
	 */
	EList<B> getBs();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see com.misc.touse.moplaf.report.ToUseReport.ToUseReportPackage#getA_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.report.ToUseReport.A#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

} // A
