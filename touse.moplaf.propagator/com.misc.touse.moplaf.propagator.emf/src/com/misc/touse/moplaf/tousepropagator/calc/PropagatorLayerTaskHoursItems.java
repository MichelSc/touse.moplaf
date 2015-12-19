package com.misc.touse.moplaf.tousepropagator.calc;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapters;
import com.misc.common.moplaf.propagator.Util;
import com.misc.touse.moplaf.tousepropagator.Project;

public class PropagatorLayerTaskHoursItems extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		Project project = (Project)this.target;
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(project, PropagatorScopeProject.class);
		return parent;
	}
	
	@Override
	protected PropagatorFunctionAdapters getAntecedents() {
		Project project = (Project)this.target;
		PropagatorFunctionAdapter layerDispose= Util.getPropagatorFunctionAdapter(project, PropagatorLayerDispose.class);
		
		PropagatorFunctionAdapters antecedents = super.getAntecedents();
		antecedents.add(layerDispose);
		return antecedents;
	}
}
