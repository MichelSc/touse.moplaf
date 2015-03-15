package com.mis.touse.moplaf.timeline.tousetimeline.calc;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.calc.PropagatorScopeDistribution;
import com.misc.touse.moplaf.timeline.tousetimeline.Domain;
import com.misc.touse.moplaf.timeline.tousetimeline.DomainDistribution;

/**
 * <!-- begin-user-doc -->
 * The scope of propagation for a set of Distribution, made concrete for the ToUseTimeLine project
 * <!-- end-user-doc -->
 */
public class PropagatorScopeDomainDistribution extends
		PropagatorScopeDistribution {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		DomainDistribution distribution = (DomainDistribution)this.target;
		Domain domain = (Domain)distribution.eContainer();
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(domain, PropagatorScopeDomain.class);
		return parent;
	}
}
