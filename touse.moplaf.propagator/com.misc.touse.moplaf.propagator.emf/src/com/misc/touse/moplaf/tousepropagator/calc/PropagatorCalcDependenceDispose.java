package com.misc.touse.moplaf.tousepropagator.calc;


import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;
import com.misc.touse.moplaf.tousepropagator.Dependence;
import com.misc.touse.moplaf.tousepropagator.Project;

public class PropagatorCalcDependenceDispose extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		Dependence dependence = (Dependence)this.target;
		Project project = dependence.getProject();
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(project, PropagatorLayerDispose.class);
		return parent;
	}

	@Override
	protected void calculate() {
		Dependence dependence = (Dependence)this.target;
		dependence.dispose();
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
