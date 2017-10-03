/**
 */
package com.misc.touse.moplaf.tousescheduler;

import com.misc.common.moplaf.propagator2.PropagatorFunctionBindings;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calc Resource Distance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.CalcResourceDistance#getResource <em>Resource</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.CalcResourceDistance#getConcreteParent <em>Concrete Parent</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getCalcResourceDistance()
 * @model
 * @generated
 */
public interface CalcResourceDistance extends PropagatorFunctionBindings {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(ToUseScheduleResource)
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getCalcResourceDistance_Resource()
	 * @model required="true"
	 * @generated
	 */
	ToUseScheduleResource getResource();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousescheduler.CalcResourceDistance#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(ToUseScheduleResource value);

	/**
	 * Returns the value of the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Parent</em>' reference.
	 * @see #setConcreteParent(LayerScheduleDistance)
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getCalcResourceDistance_ConcreteParent()
	 * @model required="true"
	 * @generated
	 */
	LayerScheduleDistance getConcreteParent();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousescheduler.CalcResourceDistance#getConcreteParent <em>Concrete Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concrete Parent</em>' reference.
	 * @see #getConcreteParent()
	 * @generated
	 */
	void setConcreteParent(LayerScheduleDistance value);

} // CalcResourceDistance
