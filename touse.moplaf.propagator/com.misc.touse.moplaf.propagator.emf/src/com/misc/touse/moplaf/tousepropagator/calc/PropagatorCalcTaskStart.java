package com.misc.touse.moplaf.tousepropagator.calc;


import com.misc.common.moplaf.propagator.PropagatorDependencyAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;
import com.misc.touse.moplaf.tousepropagator.Project;
import com.misc.touse.moplaf.tousepropagator.Task;
import com.misc.touse.moplaf.tousepropagator.ToUsePropagatorPackage;

public class PropagatorCalcTaskStart extends PropagatorFunctionAdapter {

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
		task.refreshStart();
	}

	@Override
	protected void addBindings() {
		super.addBindings();
		this.addOutboundBindingFeature(ToUsePropagatorPackage.Literals.TASK__START);

		this.addInboundBindingNavigationFeature(ToUsePropagatorPackage.Literals.TASK__DEPENDENCES_BEFORE, DependencyDependenceBefore.class);
		this.addInboundBindingNavigationFeature(ToUsePropagatorPackage.Literals.TASK__PROJECT, DependencyProject.class);
	}

	static public class DependencyDependenceBefore extends PropagatorDependencyAdapter{
		protected void addBindings() {
			super.addBindings();
			this.addInboundBindingNavigationFeature(ToUsePropagatorPackage.Literals.DEPENDENCE__TASK_BEFORE, DependencyTaskBefore.class);
			this.addInboundBindingFeature(ToUsePropagatorPackage.Literals.DEPENDENCE__HOURS);
		}

		static public class DependencyTaskBefore extends PropagatorDependencyAdapter{
			protected void addBindings() {
				super.addBindings();
				this.addInboundBindingFeature(ToUsePropagatorPackage.Literals.TASK__END);
			}
		}; // nested class DependencyDependenceBefore
	}; 
	
	static public class DependencyProject extends PropagatorDependencyAdapter{
		protected void addBindings() {
			super.addBindings();
			this.addInboundBindingFeature(ToUsePropagatorPackage.Literals.PROJECT__START);
		}
	}; 
};
