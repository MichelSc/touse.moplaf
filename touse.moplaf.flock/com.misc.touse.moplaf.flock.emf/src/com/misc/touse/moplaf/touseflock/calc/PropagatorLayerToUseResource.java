package com.misc.touse.moplaf.touseflock.calc;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;
import com.misc.touse.moplaf.touseflock.ToUseDomain;

public class PropagatorLayerToUseResource extends
		PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		ToUseDomain domain = (ToUseDomain)this.target;
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(domain, PropagatorScopeToUseDomain.class);
		return parent;
	}
	
}
