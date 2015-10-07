/**
 */
package com.misc.touse.moplaf.report.ToUseReport;

import java.util.Date;
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
 *   <li>{@link com.misc.touse.moplaf.report.ToUseReport.A#getSomeDateTime <em>Some Date Time</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.report.ToUseReport.A#getSomeReal <em>Some Real</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Some Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Some Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Some Date Time</em>' attribute.
	 * @see #setSomeDateTime(Date)
	 * @see com.misc.touse.moplaf.report.ToUseReport.ToUseReportPackage#getA_SomeDateTime()
	 * @model
	 * @generated
	 */
	Date getSomeDateTime();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.report.ToUseReport.A#getSomeDateTime <em>Some Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Some Date Time</em>' attribute.
	 * @see #getSomeDateTime()
	 * @generated
	 */
	void setSomeDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Some Real</b></em>' attribute.
	 * The default value is <code>"0.0f"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Some Real</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Some Real</em>' attribute.
	 * @see #setSomeReal(float)
	 * @see com.misc.touse.moplaf.report.ToUseReport.ToUseReportPackage#getA_SomeReal()
	 * @model default="0.0f"
	 * @generated
	 */
	float getSomeReal();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.report.ToUseReport.A#getSomeReal <em>Some Real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Some Real</em>' attribute.
	 * @see #getSomeReal()
	 * @generated
	 */
	void setSomeReal(float value);

} // A
