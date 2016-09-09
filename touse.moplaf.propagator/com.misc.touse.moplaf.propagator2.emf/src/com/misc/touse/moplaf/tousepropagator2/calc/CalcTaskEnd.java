/**
 */
package com.misc.touse.moplaf.tousepropagator2.calc;

import com.misc.touse.moplaf.tousepropagator2.Task;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskEnd#getTask <em>Task</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskEnd#getConcreteParent <em>Concrete Parent</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcPackage#getCalcTaskEnd()
 * @model
 * @generated
 */
public interface CalcTaskEnd extends ToUsePropagatorFunction {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.tousepropagator2.Task#getCalcTaskEnd <em>Calc Task End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' container reference.
	 * @see #setTask(Task)
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcPackage#getCalcTaskEnd_Task()
	 * @see com.misc.touse.moplaf.tousepropagator2.Task#getCalcTaskEnd
	 * @model opposite="CalcTaskEnd" required="true" transient="false"
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskEnd#getTask <em>Task</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' container reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

	/**
	 * Returns the value of the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Parent</em>' reference.
	 * @see #setConcreteParent(LayerTaskTimes)
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcPackage#getCalcTaskEnd_ConcreteParent()
	 * @model required="true"
	 * @generated
	 */
	LayerTaskTimes getConcreteParent();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskEnd#getConcreteParent <em>Concrete Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concrete Parent</em>' reference.
	 * @see #getConcreteParent()
	 * @generated
	 */
	void setConcreteParent(LayerTaskTimes value);

} // CalcTaskEnd
