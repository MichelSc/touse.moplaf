package com.misc.touse.moplaf.touseflock.calc;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapters;
import com.misc.common.moplaf.propagator.Util;
import com.misc.touse.moplaf.touseflock.ToUseDomain;
import com.misc.touse.moplaf.touseflock.ToUseResource;

public class PropagatorLayerToUseResourceTransition extends
		PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		ToUseResource resource = (ToUseResource) this.target;
		ToUseDomain domain = resource.getDomain();
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(domain, PropagatorLayerToUseResource.class);
		return parent;
	}

	@Override
	protected PropagatorFunctionAdapters getAntecedents() {
		ToUseResource resource = (ToUseResource) this.target;
		PropagatorFunctionAdapters antecedents = super.getAntecedents();
		PropagatorFunctionAdapter calcChain = Util.getPropagatorFunctionAdapter(resource, PropagatorCalcToUseResourceChain.class);
		antecedents.add(calcChain);
		return antecedents;
	}

}
