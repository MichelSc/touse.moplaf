package com.misc.touse.moplaf.tousepropagator.calc;


import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;
import com.misc.touse.moplaf.tousepropagator.Project;
import com.misc.touse.moplaf.tousepropagator.Task;
import com.misc.touse.moplaf.tousepropagator.ToUsePropagatorPackage;

public class PropagatorCalcTaskEnd extends PropagatorFunctionAdapter {
	
	@Override
	protected PropagatorFunctionAdapter getParent() {
		Task task = (Task)this.target;
		Project project = task.getProject();
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(project, PropagatorLayerTaskTimes.class);
		return parent;
	}

	@Override
	protected void calculate() {
		Task task = (Task)this.target;
		task.refreshEnd();
	}

	@Override
	protected void addBindings() {
		super.addBindings();
		this.addOutboundBindingFeature(ToUsePropagatorPackage.Literals.TASK__END);

		this.addInboundBindingFeature(ToUsePropagatorPackage.Literals.TASK__START);
		this.addInboundBindingFeature(ToUsePropagatorPackage.Literals.TASK__HOURS);
	}

};
