package com.mis.touse.moplaf.timeline.tousetimeline.calc;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.touse.moplaf.timeline.tousetimeline.FunctionMinimum;
import com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage;

// this means that the object is touched upon containment
//   as a consequence, it will be refreshed
//   should this not be the rule rather than the exception?
public class PropagatorCalcDomainDistributionMinimum extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		FunctionMinimum function = (FunctionMinimum)this.target;
		Distribution distribution = function.getDistribution();
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(distribution, PropagatorLayerDomainDistributionFunctions.class);
		return parent;
	}
	
	@Override
	protected void calculate() {
		FunctionMinimum function = (FunctionMinimum)this.target;
		function.refreshMinimum();
	}

	@Override
	protected void addListeners() {
		super.addListeners();
		this.addFeatureListener(TousetimelinePackage.Literals.FUNCTION_MINIMUM__FROM);
		this.addFeatureListener(TousetimelinePackage.Literals.FUNCTION_MINIMUM__TO);
	}
};
