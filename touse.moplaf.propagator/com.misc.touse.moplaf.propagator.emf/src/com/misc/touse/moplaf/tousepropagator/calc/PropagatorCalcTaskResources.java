package com.misc.touse.moplaf.tousepropagator.calc;


import com.misc.common.moplaf.propagator.PropagatorDependencyAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;
import com.misc.touse.moplaf.tousepropagator.Project;
import com.misc.touse.moplaf.tousepropagator.Resource;
import com.misc.touse.moplaf.tousepropagator.Task;
import com.misc.touse.moplaf.tousepropagator.ToUsePropagatorPackage;

public class PropagatorCalcTaskResources extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		Task task = (Task)this.target;
		Project project = task.getProject();
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(project, PropagatorLayerTaskResources.class);
		return parent;
	}

	//@Override
	protected void calculate(Object context) {
		Task task = (Task)this.target;
		Resource resource = (Resource)context;
		task.refreshResourceCandidates(resource);
	}

	//@Override
	protected void calculate() {
		Task task = (Task)this.target;
		task.refreshResourceCandidates();
	}

	@Override
	protected void addBindings() {
		super.addBindings();
		this.addInboundBindingNavigationFeature(ToUsePropagatorPackage.Literals.TASK__PROJECT, DependencyProject.class);
		this.addInboundBindingFeature(ToUsePropagatorPackage.Literals.TASK__START);
		this.addInboundBindingFeature(ToUsePropagatorPackage.Literals.TASK__END);
	}

	static public class DependencyProject extends PropagatorDependencyAdapter{
		protected void addBindings() {
			super.addBindings();
			this.addInboundBindingNavigationFeature(ToUsePropagatorPackage.Literals.PROJECT__RESOURCES, DependencyProjectResource.class);
		}
		static public class DependencyProjectResource extends PropagatorDependencyAdapter{
			protected void addBindings() {
				super.addBindings();
				this.addInboundBindingFeature(ToUsePropagatorPackage.Literals.RESOURCE__START);
				this.addInboundBindingFeature(ToUsePropagatorPackage.Literals.RESOURCE__END);
			}

			@Override
			protected boolean isTrackToucher() {
				return true;
			}
		}
	};
};
