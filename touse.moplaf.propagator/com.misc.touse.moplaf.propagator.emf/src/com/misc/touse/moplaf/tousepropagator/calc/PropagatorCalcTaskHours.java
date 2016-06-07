package com.misc.touse.moplaf.tousepropagator.calc;

import org.eclipse.emf.common.notify.Notifier;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;
import com.misc.touse.moplaf.tousepropagator.Project;
import com.misc.touse.moplaf.tousepropagator.Task;
import com.misc.touse.moplaf.tousepropagator.ToUsePropagatorPackage;

public class PropagatorCalcTaskHours extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		Task task = (Task)this.target;
		Project project = task.getProject();
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(project, PropagatorLayerTaskHoursVar.class);
		return parent;
	}

	@Override
	protected void calculate() {
		Notifier target = this.target;
		Task task = (Task)target;
		task.refreshHours();
	}

	@Override
	protected void addInboundBindings() {
		super.addInboundBindings();
		this.addInboundBindingFeature(ToUsePropagatorPackage.Literals.TASK__HOURS_ITEMS);
		this.addInboundBindingFeature(ToUsePropagatorPackage.Literals.TASK__HOURS_VAR);
	}
	
};
