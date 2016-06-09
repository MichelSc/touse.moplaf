package com.misc.touse.moplaf.tousepropagator.calc;


import com.misc.common.moplaf.propagator.PropagatorDependencyAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapters;
import com.misc.common.moplaf.propagator.Util;
import com.misc.touse.moplaf.tousepropagator.Project;
import com.misc.touse.moplaf.tousepropagator.ToUsePropagatorPackage;

public class PropagatorLayerProjectEnd extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		Project project = (Project)this.target;
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(project, PropagatorScopeProject.class);
		return parent;
	}
	
	@Override
	protected PropagatorFunctionAdapters getAntecedents() {
		Project project = (Project)this.target;
		PropagatorFunctionAdapter layerhours = Util.getPropagatorFunctionAdapter(project, PropagatorLayerTaskTimes.class);
		
		PropagatorFunctionAdapters antecedents = super.getAntecedents();
		antecedents.add(layerhours);
		return antecedents;
	}

	@Override
	protected void calculate() {
		Project project = (Project)this.target;
		project.refreshEnd();
	}

	protected void addBindings() {
		super.addBindings();
		this.addInboundBindingNavigationFeature(ToUsePropagatorPackage.Literals.PROJECT__TASKS, DependencyTaskEnd.class);
	}

	static public class DependencyTaskEnd extends PropagatorDependencyAdapter{
		protected void addBindings() {
			super.addBindings();
			this.addInboundBindingFeature(ToUsePropagatorPackage.Literals.TASK__END);
		}
	}; 
}  
