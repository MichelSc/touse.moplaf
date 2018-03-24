/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline.calc;

import com.misc.common.moplaf.time.continuous.PropagatorFunctionDistribution;

import com.misc.common.moplaf.time.continuous.calc.LayerDistributionAmounts;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer Domain Distribution Functions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.calc.LayerDomainDistributionFunctions#getConcreteParent <em>Concrete Parent</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.calc.LayerDomainDistributionFunctions#getAntecedentLayerDistributionAmounts <em>Antecedent Layer Distribution Amounts</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.ToUseTimeLineCalcPackage#getLayerDomainDistributionFunctions()
 * @model
 * @generated
 */
public interface LayerDomainDistributionFunctions extends PropagatorFunctionDistribution {
	/**
	 * Returns the value of the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Parent</em>' reference.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.ToUseTimeLineCalcPackage#getLayerDomainDistributionFunctions_ConcreteParent()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	ScopeDomainDistribution getConcreteParent();

	/**
	 * Returns the value of the '<em><b>Antecedent Layer Distribution Amounts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antecedent Layer Distribution Amounts</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antecedent Layer Distribution Amounts</em>' reference.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.ToUseTimeLineCalcPackage#getLayerDomainDistributionFunctions_AntecedentLayerDistributionAmounts()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	LayerDistributionAmounts getAntecedentLayerDistributionAmounts();

} // LayerDomainDistributionFunctions
