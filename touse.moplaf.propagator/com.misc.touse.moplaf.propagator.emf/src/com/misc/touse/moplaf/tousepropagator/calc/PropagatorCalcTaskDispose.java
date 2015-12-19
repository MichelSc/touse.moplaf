package com.misc.touse.moplaf.tousepropagator.calc;


import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;
import com.misc.touse.moplaf.tousepropagator.Project;
import com.misc.touse.moplaf.tousepropagator.Task;

public class PropagatorCalcTaskDispose extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		Task task = (Task)this.target;
		Project project = task.getProject();
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(project, PropagatorLayerDispose.class);
		return parent;
	}

	@Override
	protected void calculate() {
		Task task = (Task)this.target;
		task.dispose();
	}
	
	@Override
	protected boolean isTouchOnDispose() {
		return true;
	}

	@Override
	protected boolean isTouchOnOwned() {
		return false;
	}
};
