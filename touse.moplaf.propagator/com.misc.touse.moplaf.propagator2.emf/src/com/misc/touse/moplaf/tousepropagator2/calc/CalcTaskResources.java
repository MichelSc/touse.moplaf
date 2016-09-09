/**
 */
package com.misc.touse.moplaf.tousepropagator2.calc;

import com.misc.touse.moplaf.tousepropagator2.Task;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Resources</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskResources#getConcreteParent <em>Concrete Parent</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskResources#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcPackage#getCalcTaskResources()
 * @model
 * @generated
 */
public interface CalcTaskResources extends ToUsePropagatorFunction {
	/**
	 * Returns the value of the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Parent</em>' reference.
	 * @see #setConcreteParent(LayerTaskResources)
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcPackage#getCalcTaskResources_ConcreteParent()
	 * @model
	 * @generated
	 */
	LayerTaskResources getConcreteParent();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskResources#getConcreteParent <em>Concrete Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concrete Parent</em>' reference.
	 * @see #getConcreteParent()
	 * @generated
	 */
	void setConcreteParent(LayerTaskResources value);

	/**
	 * Returns the value of the '<em><b>Task</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.tousepropagator2.Task#getCalcTaskResources <em>Calc Task Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' container reference.
	 * @see #setTask(Task)
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcPackage#getCalcTaskResources_Task()
	 * @see com.misc.touse.moplaf.tousepropagator2.Task#getCalcTaskResources
	 * @model opposite="CalcTaskResources" required="true" transient="false"
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskResources#getTask <em>Task</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' container reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

} // CalcTaskResources
