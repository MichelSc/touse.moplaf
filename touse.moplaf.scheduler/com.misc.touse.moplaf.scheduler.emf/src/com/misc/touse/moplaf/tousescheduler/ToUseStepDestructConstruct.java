/**
 */
package com.misc.touse.moplaf.tousescheduler;

import com.misc.common.moplaf.localsearch.Step;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Use Step Destruct Construct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.ToUseStepDestructConstruct#getDestructionChance <em>Destruction Chance</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.ToUseStepDestructConstruct#getConstructionChance <em>Construction Chance</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseStepDestructConstruct()
 * @model
 * @generated
 */
public interface ToUseStepDestructConstruct extends Step {

	/**
	 * Returns the value of the '<em><b>Destruction Chance</b></em>' attribute.
	 * The default value is <code>"0.05"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destruction Chance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destruction Chance</em>' attribute.
	 * @see #setDestructionChance(float)
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseStepDestructConstruct_DestructionChance()
	 * @model default="0.05"
	 * @generated
	 */
	float getDestructionChance();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousescheduler.ToUseStepDestructConstruct#getDestructionChance <em>Destruction Chance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destruction Chance</em>' attribute.
	 * @see #getDestructionChance()
	 * @generated
	 */
	void setDestructionChance(float value);

	/**
	 * Returns the value of the '<em><b>Construction Chance</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Construction Chance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Construction Chance</em>' attribute.
	 * @see #setConstructionChance(float)
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseStepDestructConstruct_ConstructionChance()
	 * @model default="1.0"
	 * @generated
	 */
	float getConstructionChance();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousescheduler.ToUseStepDestructConstruct#getConstructionChance <em>Construction Chance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Construction Chance</em>' attribute.
	 * @see #getConstructionChance()
	 * @generated
	 */
	void setConstructionChance(float value);
} // ToUseStepDestructConstruct
