package com.mis.touse.moplaf.timeline.tousetimeline.calc;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.touse.moplaf.timeline.tousetimeline.FunctionPossible;
import com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage;

public class PropagatorCalcDomainDistributionFunctionPossible extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		FunctionPossible function = (FunctionPossible)this.target;
		Distribution distribution = function.getDistribution();
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(distribution, PropagatorLayerDomainDistributionFunctions.class);
		return parent;
	}
	
	@Override
	protected void calculate() {
		FunctionPossible function = (FunctionPossible)this.target;
		function.refresh();
	}

	@Override
	protected void addListeners() {
		super.addListeners();
		this.addFeatureListener(TousetimelinePackage.Literals.FUNCTION_POSSIBLE__LIMIT_MOMENT);
		this.addFeatureListener(TousetimelinePackage.Literals.FUNCTION_POSSIBLE__LIMIT_DURATION);
		this.addFeatureListener(TousetimelinePackage.Literals.FUNCTION_POSSIBLE__LIMIT_AMOUNT);
	}
};
