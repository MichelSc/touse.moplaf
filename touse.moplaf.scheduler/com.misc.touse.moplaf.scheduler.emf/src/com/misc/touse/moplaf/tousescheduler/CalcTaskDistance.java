/**
 */
package com.misc.touse.moplaf.tousescheduler;

import com.misc.common.moplaf.propagator2.PropagatorFunctionBindings;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calc Task Distance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.CalcTaskDistance#getTask <em>Task</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.CalcTaskDistance#getConcreteParent <em>Concrete Parent</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getCalcTaskDistance()
 * @model
 * @generated
 */
public interface CalcTaskDistance extends PropagatorFunctionBindings {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(ToUseScheduleTask)
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getCalcTaskDistance_Task()
	 * @model required="true"
	 * @generated
	 */
	ToUseScheduleTask getTask();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousescheduler.CalcTaskDistance#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(ToUseScheduleTask value);

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
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getCalcTaskDistance_ConcreteParent()
	 * @model required="true"
	 * @generated
	 */
	LayerScheduleDistance getConcreteParent();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousescheduler.CalcTaskDistance#getConcreteParent <em>Concrete Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concrete Parent</em>' reference.
	 * @see #getConcreteParent()
	 * @generated
	 */
	void setConcreteParent(LayerScheduleDistance value);

} // CalcTaskDistance
