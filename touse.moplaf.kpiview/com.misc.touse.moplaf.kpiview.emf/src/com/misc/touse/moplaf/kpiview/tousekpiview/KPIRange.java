/**
 */
package com.misc.touse.moplaf.kpiview.tousekpiview;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KPI Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.kpiview.tousekpiview.KPIRange#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.kpiview.tousekpiview.KPIRange#getColor <em>Color</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.kpiview.tousekpiview.KPIRange#getLowValue <em>Low Value</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.kpiview.tousekpiview.KPIRange#getHighValue <em>High Value</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.kpiview.tousekpiview.ToUseKpiViewPackage#getKPIRange()
 * @model
 * @generated
 */
public interface KPIRange extends EObject {
	/**
	 * Returns the value of the '<em><b>Low Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low Value</em>' attribute.
	 * @see #setLowValue(float)
	 * @see com.misc.touse.moplaf.kpiview.tousekpiview.ToUseKpiViewPackage#getKPIRange_LowValue()
	 * @model
	 * @generated
	 */
	float getLowValue();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.kpiview.tousekpiview.KPIRange#getLowValue <em>Low Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Value</em>' attribute.
	 * @see #getLowValue()
	 * @generated
	 */
	void setLowValue(float value);

	/**
	 * Returns the value of the '<em><b>High Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High Value</em>' attribute.
	 * @see #setHighValue(float)
	 * @see com.misc.touse.moplaf.kpiview.tousekpiview.ToUseKpiViewPackage#getKPIRange_HighValue()
	 * @model
	 * @generated
	 */
	float getHighValue();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.kpiview.tousekpiview.KPIRange#getHighValue <em>High Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Value</em>' attribute.
	 * @see #getHighValue()
	 * @generated
	 */
	void setHighValue(float value);

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
	 * @see com.misc.touse.moplaf.kpiview.tousekpiview.ToUseKpiViewPackage#getKPIRange_Color()
	 * @model
	 * @generated
	 */
	int getColor();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.kpiview.tousekpiview.KPIRange#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(int value);

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
	 * @see com.misc.touse.moplaf.kpiview.tousekpiview.ToUseKpiViewPackage#getKPIRange_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.kpiview.tousekpiview.KPIRange#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // KPIRange
