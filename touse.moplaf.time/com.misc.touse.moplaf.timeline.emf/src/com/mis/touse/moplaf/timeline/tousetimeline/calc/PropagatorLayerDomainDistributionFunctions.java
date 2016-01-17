package com.mis.touse.moplaf.timeline.tousetimeline.calc;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapters;
import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionAmounts;


public class PropagatorLayerDomainDistributionFunctions extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		Distribution distribution = (Distribution)this.target;
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(distribution, PropagatorScopeDomainDistribution.class);
		return parent;
	}
	
	@Override
	protected PropagatorFunctionAdapters getAntecedents() {
		Distribution distribution = (Distribution)this.target;
		PropagatorFunctionAdapters antecedents = super.getAntecedents();
		PropagatorFunctionAdapter calcDistributionAmounts= Util.getPropagatorFunctionAdapter(distribution, PropagatorLayerDistributionAmounts.class);
		antecedents.add(calcDistributionAmounts);
		return antecedents;
	}
	
};
