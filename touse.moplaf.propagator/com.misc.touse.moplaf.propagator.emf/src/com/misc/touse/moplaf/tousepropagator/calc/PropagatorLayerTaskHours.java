package com.misc.touse.moplaf.tousepropagator.calc;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapters;
import com.misc.common.moplaf.propagator.Util;
import com.misc.touse.moplaf.tousepropagator.Project;

public class PropagatorLayerTaskHours extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		Project project = (Project)this.target;
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(project, PropagatorScopeProject.class);
		return parent;
	}
	
	@Override
	protected PropagatorFunctionAdapters getAntecedents() {
		Project project = (Project)this.target;
		PropagatorFunctionAdapter layerhoursvar  = Util.getPropagatorFunctionAdapter(project, PropagatorLayerTaskHoursVar.class);
		PropagatorFunctionAdapter layerhoursitem = Util.getPropagatorFunctionAdapter(project, PropagatorLayerTaskHoursItems.class);
		
		PropagatorFunctionAdapters antecedents = super.getAntecedents();
		antecedents.add(layerhoursitem);
		antecedents.add(layerhoursvar);
		return antecedents;
	}
}
