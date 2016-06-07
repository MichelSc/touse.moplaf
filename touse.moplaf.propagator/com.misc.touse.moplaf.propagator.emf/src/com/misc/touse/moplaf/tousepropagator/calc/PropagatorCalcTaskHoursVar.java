package com.misc.touse.moplaf.tousepropagator.calc;

import com.misc.common.moplaf.propagator.PropagatorDependencyAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;
import com.misc.touse.moplaf.tousepropagator.Project;
import com.misc.touse.moplaf.tousepropagator.Task;
import com.misc.touse.moplaf.tousepropagator.ToUsePropagatorPackage;

public class PropagatorCalcTaskHoursVar extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		Task task = (Task)this.target;
		Project project = task.getProject();
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(project, PropagatorLayerTaskHoursVar.class);
		return parent;
	}

	@Override
	protected void calculate() {
		Task task = (Task)this.target;
		task.refreshHoursVar();
	}
	
	@Override
	protected void addInboundBindings() {
		super.addInboundBindings();
		this.addInboundBindingFeature(ToUsePropagatorPackage.Literals.TASK__HOURS_VAR_PER_RES);
		this.addInboundBindingNavigationFeature(ToUsePropagatorPackage.Literals.TASK__PROJECT, DependencyProject.class);
	}

	static public class DependencyProject extends PropagatorDependencyAdapter{
		protected void addInboundBindings() {
			super.addInboundBindings();
			this.addInboundBindingFeature(ToUsePropagatorPackage.Literals.PROJECT__NOF_RES);
		} 
	}; 
};
