/**
 */
package com.misc.touse.moplaf.tousepropagator2.calc;

import com.misc.touse.moplaf.tousepropagator2.Project;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer Task Hours</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskHours#getProject <em>Project</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskHours#getConcreteParent <em>Concrete Parent</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskHours#getAntecedentLayerTaskHoursItem <em>Antecedent Layer Task Hours Item</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskHours#getAntecedentLayerTaskHoursVar <em>Antecedent Layer Task Hours Var</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcPackage#getLayerTaskHours()
 * @model
 * @generated
 */
public interface LayerTaskHours extends ToUsePropagatorFunction {
	/**
	 * Returns the value of the '<em><b>Project</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.tousepropagator2.Project#getLayerTaskHours <em>Layer Task Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' container reference.
	 * @see #setProject(Project)
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcPackage#getLayerTaskHours_Project()
	 * @see com.misc.touse.moplaf.tousepropagator2.Project#getLayerTaskHours
	 * @model opposite="LayerTaskHours" required="true" transient="false"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskHours#getProject <em>Project</em>}' container reference.
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
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcPackage#getLayerTaskHours_ConcreteParent()
	 * @model required="true"
	 * @generated
	 */
	ScopeProject getConcreteParent();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskHours#getConcreteParent <em>Concrete Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concrete Parent</em>' reference.
	 * @see #getConcreteParent()
	 * @generated
	 */
	void setConcreteParent(ScopeProject value);

	/**
	 * Returns the value of the '<em><b>Antecedent Layer Task Hours Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antecedent Layer Task Hours Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antecedent Layer Task Hours Item</em>' reference.
	 * @see #setAntecedentLayerTaskHoursItem(LayerTaskHoursItem)
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcPackage#getLayerTaskHours_AntecedentLayerTaskHoursItem()
	 * @model
	 * @generated
	 */
	LayerTaskHoursItem getAntecedentLayerTaskHoursItem();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskHours#getAntecedentLayerTaskHoursItem <em>Antecedent Layer Task Hours Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antecedent Layer Task Hours Item</em>' reference.
	 * @see #getAntecedentLayerTaskHoursItem()
	 * @generated
	 */
	void setAntecedentLayerTaskHoursItem(LayerTaskHoursItem value);

	/**
	 * Returns the value of the '<em><b>Antecedent Layer Task Hours Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antecedent Layer Task Hours Var</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antecedent Layer Task Hours Var</em>' reference.
	 * @see #setAntecedentLayerTaskHoursVar(LayerTaskHoursVar)
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcPackage#getLayerTaskHours_AntecedentLayerTaskHoursVar()
	 * @model
	 * @generated
	 */
	LayerTaskHoursVar getAntecedentLayerTaskHoursVar();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskHours#getAntecedentLayerTaskHoursVar <em>Antecedent Layer Task Hours Var</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antecedent Layer Task Hours Var</em>' reference.
	 * @see #getAntecedentLayerTaskHoursVar()
	 * @generated
	 */
	void setAntecedentLayerTaskHoursVar(LayerTaskHoursVar value);

} // LayerTaskHours
