package com.misc.touse.moplaf.tousepropagator.calc;


import com.misc.common.moplaf.propagator.PropagatorDependencyAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;
import com.misc.touse.moplaf.tousepropagator.Project;
import com.misc.touse.moplaf.tousepropagator.Task;
import com.misc.touse.moplaf.tousepropagator.ToUsePropagatorPackage;

public class PropagatorCalcTaskHoursItems extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		Task task = (Task)this.target;
		Project project = task.getProject();
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(project, PropagatorLayerTaskHoursItems.class);
		return parent;
	}

	@Override
	protected void calculate() {
		Task task = (Task)this.target;
		task.refreshHoursItem();
	}

	
	@Override
	protected void addBindings() {
		super.addBindings();
		this.addInboundBindingNavigationFeature(ToUsePropagatorPackage.Literals.TASK__ITEMS, DependencyTaskItem.class);
	}

	
	static public class DependencyTaskItem extends PropagatorDependencyAdapter{
		protected void addBindings() {
			super.addBindings();
			this.addInboundBindingFeature(ToUsePropagatorPackage.Literals.TASK_ITEM__HOURS);
		} 
	}; // nested class DependencyTaskItem
};
