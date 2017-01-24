/**
 */
package com.misc.touse.moplaf.kpiview.tousekpiview;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KPI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.kpiview.tousekpiview.KPI#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.kpiview.tousekpiview.KPI#getValue <em>Value</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.kpiview.tousekpiview.KPI#getRanges <em>Ranges</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.kpiview.tousekpiview.KPI#getColor <em>Color</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.kpiview.tousekpiview.KPI#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.kpiview.tousekpiview.KPI#getMaxValue <em>Max Value</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.kpiview.tousekpiview.TousekpiviewPackage#getKPI()
 * @model
 * @generated
 */
public interface KPI extends EObject {
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
	 * @see com.misc.touse.moplaf.kpiview.tousekpiview.TousekpiviewPackage#getKPI_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.kpiview.tousekpiview.KPI#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see com.misc.touse.moplaf.kpiview.tousekpiview.TousekpiviewPackage#getKPI_Value()
	 * @model
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.kpiview.tousekpiview.KPI#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

	/**
	 * Returns the value of the '<em><b>Ranges</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.kpiview.tousekpiview.KPIRange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ranges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ranges</em>' containment reference list.
	 * @see com.misc.touse.moplaf.kpiview.tousekpiview.TousekpiviewPackage#getKPI_Ranges()
	 * @model containment="true"
	 * @generated
	 */
	EList<KPIRange> getRanges();

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(int)
	 * @see com.misc.touse.moplaf.kpiview.tousekpiview.TousekpiviewPackage#getKPI_Color()
	 * @model
	 * @generated
	 */
	int getColor();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.kpiview.tousekpiview.KPI#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(int value);

	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #setMinValue(float)
	 * @see com.misc.touse.moplaf.kpiview.tousekpiview.TousekpiviewPackage#getKPI_MinValue()
	 * @model
	 * @generated
	 */
	float getMinValue();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.kpiview.tousekpiview.KPI#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #getMinValue()
	 * @generated
	 */
	void setMinValue(float value);

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #setMaxValue(float)
	 * @see com.misc.touse.moplaf.kpiview.tousekpiview.TousekpiviewPackage#getKPI_MaxValue()
	 * @model
	 * @generated
	 */
	float getMaxValue();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.kpiview.tousekpiview.KPI#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(float value);

} // KPI
