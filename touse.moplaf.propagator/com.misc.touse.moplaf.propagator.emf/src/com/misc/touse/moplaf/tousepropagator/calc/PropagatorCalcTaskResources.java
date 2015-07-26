package com.misc.touse.moplaf.tousepropagator.calc;


import com.misc.common.moplaf.propagator.PropagatorDependencyAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapters;
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

	@Override
	protected void addListeners() {
		super.addListeners();
		this.addNavigationFeatureListener(ToUsePropagatorPackage.Literals.TASK__PROJECT, DependencyProject.class);
	}

	static public class DependencyProject extends PropagatorDependencyAdapter{
		protected void addListeners() {
			super.addListeners();
			this.addNavigationFeatureListener(ToUsePropagatorPackage.Literals.PROJECT__RESOURCES, DependencyProjectResource.class);
		}
		static public class DependencyProjectResource extends PropagatorDependencyAdapter{
			protected void addListeners() {
				super.addListeners();
				this.addFeatureListener(ToUsePropagatorPackage.Literals.RESOURCE__START);
				this.addFeatureListener(ToUsePropagatorPackage.Literals.RESOURCE__END);
			}

			@Override
			protected boolean isTrackToucher() {
				return true;
			}
			
		}
	};
 
};
