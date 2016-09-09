/**
 */
package com.misc.touse.moplaf.tousepropagator2.calc;

import com.misc.touse.moplaf.tousepropagator2.Project;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer Task Times</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskTimes#getProject <em>Project</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskTimes#getConcreteParent <em>Concrete Parent</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskTimes#getAntecedentLayerTaskHours <em>Antecedent Layer Task Hours</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcPackage#getLayerTaskTimes()
 * @model
 * @generated
 */
public interface LayerTaskTimes extends ToUsePropagatorFunction {

	/**
	 * Returns the value of the '<em><b>Project</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.tousepropagator2.Project#getLayerTaskTimes <em>Layer Task Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' container reference.
	 * @see #setProject(Project)
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcPackage#getLayerTaskTimes_Project()
	 * @see com.misc.touse.moplaf.tousepropagator2.Project#getLayerTaskTimes
	 * @model opposite="LayerTaskTimes" required="true" transient="false"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskTimes#getProject <em>Project</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' container reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

	/**
	 * Returns the value of the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Parent</em>' reference.
	 * @see #setConcreteParent(ScopeProject)
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcPackage#getLayerTaskTimes_ConcreteParent()
	 * @model required="true"
	 * @generated
	 */
	ScopeProject getConcreteParent();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskTimes#getConcreteParent <em>Concrete Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concrete Parent</em>' reference.
	 * @see #getConcreteParent()
	 * @generated
	 */
	void setConcreteParent(ScopeProject value);

	/**
	 * Returns the value of the '<em><b>Antecedent Layer Task Hours</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antecedent Layer Task Hours</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antecedent Layer Task Hours</em>' reference.
	 * @see #setAntecedentLayerTaskHours(LayerTaskHours)
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcPackage#getLayerTaskTimes_AntecedentLayerTaskHours()
	 * @model
	 * @generated
	 */
	LayerTaskHours getAntecedentLayerTaskHours();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskTimes#getAntecedentLayerTaskHours <em>Antecedent Layer Task Hours</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antecedent Layer Task Hours</em>' reference.
	 * @see #getAntecedentLayerTaskHours()
	 * @generated
	 */
	void setAntecedentLayerTaskHours(LayerTaskHours value);
} // LayerTaskTimes
