/**
 */
package com.misc.touse.moplaf.tousescheduler;

import com.misc.common.moplaf.propagator2.PropagatorFunctionBindings;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer Schedule Distance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.LayerScheduleDistance#getConcreteParent <em>Concrete Parent</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getLayerScheduleDistance()
 * @model
 * @generated
 */
public interface LayerScheduleDistance extends PropagatorFunctionBindings {
	/**
	 * Returns the value of the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Parent</em>' reference.
	 * @see #setConcreteParent(ScopeScheduleScore)
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getLayerScheduleDistance_ConcreteParent()
	 * @model required="true"
	 * @generated
	 */
	ScopeScheduleScore getConcreteParent();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousescheduler.LayerScheduleDistance#getConcreteParent <em>Concrete Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concrete Parent</em>' reference.
	 * @see #getConcreteParent()
	 * @generated
	 */
	void setConcreteParent(ScopeScheduleScore value);

} // LayerScheduleDistance
