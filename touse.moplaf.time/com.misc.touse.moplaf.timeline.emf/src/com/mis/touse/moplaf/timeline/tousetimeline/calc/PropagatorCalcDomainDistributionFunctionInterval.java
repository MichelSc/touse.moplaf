package com.mis.touse.moplaf.timeline.tousetimeline.calc;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.touse.moplaf.timeline.tousetimeline.FunctionInterval;
import com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage;

public class PropagatorCalcDomainDistributionFunctionInterval extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		FunctionInterval function = (FunctionInterval)this.target;
		Distribution distribution = function.getDistribution();
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(distribution, PropagatorLayerDomainDistributionFunctions.class);
		return parent;
	}
	
	@Override
	protected void calculate() {
		FunctionInterval function = (FunctionInterval)this.target;
		function.refresh();
	}

	@Override
	protected void addInboundBindings() {
		super.addInboundBindings();
		this.addInboundBindingFeature(TousetimelinePackage.Literals.FUNCTION_INTERVAL__FROM);
		this.addInboundBindingFeature(TousetimelinePackage.Literals.FUNCTION_INTERVAL__TO);
	}
};
