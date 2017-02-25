/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline.calc.impl;

import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.time.continuous.calc.impl.PropagatorScopeDistributionImpl;
import com.misc.touse.moplaf.timeline.tousetimeline.Domain;
import com.misc.touse.moplaf.timeline.tousetimeline.DomainDistribution;
import com.misc.touse.moplaf.timeline.tousetimeline.calc.PropagatorScopeDomainDistribution;
import com.misc.touse.moplaf.timeline.tousetimeline.calc.PropagatorScopeDomain;
import com.misc.touse.moplaf.timeline.tousetimeline.calc.ToUseTimeLineCalcPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propagator Scope Domain Distribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PropagatorScopeDomainDistributionImpl extends PropagatorScopeDistributionImpl implements PropagatorScopeDomainDistribution {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropagatorScopeDomainDistributionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseTimeLineCalcPackage.Literals.PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION;
	}

	@Override
	public PropagatorFunction doGetParent() {
		DomainDistribution distribution = (DomainDistribution)this.getDistribution();
		Domain domain = (Domain)distribution.eContainer();
		PropagatorScopeDomain scope = domain.getPropagatorFunction(PropagatorScopeDomain.class);
		return scope;
	}
} //PropagatorScopeDomainDistributionImpl
