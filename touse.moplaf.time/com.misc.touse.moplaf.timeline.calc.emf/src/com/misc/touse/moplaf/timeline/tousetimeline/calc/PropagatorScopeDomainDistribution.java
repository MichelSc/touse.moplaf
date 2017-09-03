/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline.calc;

import com.misc.common.moplaf.time.continuous.calc.PropagatorScopeDistribution;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Propagator Scope Domain Distribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.calc.PropagatorScopeDomainDistribution#getConcreteParent <em>Concrete Parent</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.ToUseTimeLineCalcPackage#getPropagatorScopeDomainDistribution()
 * @model
 * @generated
 */
public interface PropagatorScopeDomainDistribution extends PropagatorScopeDistribution {

	/**
	 * Returns the value of the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Parent</em>' reference.
	 * @see #setConcreteParent(PropagatorScopeDomain)
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.ToUseTimeLineCalcPackage#getPropagatorScopeDomainDistribution_ConcreteParent()
	 * @model required="true"
	 * @generated
	 */
	PropagatorScopeDomain getConcreteParent();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.timeline.tousetimeline.calc.PropagatorScopeDomainDistribution#getConcreteParent <em>Concrete Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concrete Parent</em>' reference.
	 * @see #getConcreteParent()
	 * @generated
	 */
	void setConcreteParent(PropagatorScopeDomain value);
} // PropagatorScopeDomainDistribution
