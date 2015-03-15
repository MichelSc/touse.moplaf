package com.misc.touse.moplaf.tousepropagator.calc;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;
import com.misc.touse.moplaf.tousepropagator.Project;

public class PropagatorLayerTaskHoursVar extends PropagatorFunctionAdapter {


	@Override
	protected PropagatorFunctionAdapter getParent() {
		Project project = (Project)this.target;
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(project, PropagatorScopeProject.class);
		return parent;
	}
}
