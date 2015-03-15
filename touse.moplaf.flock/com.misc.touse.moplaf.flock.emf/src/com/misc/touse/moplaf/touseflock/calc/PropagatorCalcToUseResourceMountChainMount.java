package com.misc.touse.moplaf.touseflock.calc;

import com.misc.common.moplaf.propagator.PropagatorDependencyAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapters;
import com.misc.common.moplaf.propagator.Util;
import com.misc.touse.moplaf.touseflock.ToUseResourceMount;
import com.misc.touse.moplaf.touseflock.TouseflockPackage;

public class PropagatorCalcToUseResourceMountChainMount extends
		PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		ToUseResourceMount resourceMount = (ToUseResourceMount) this.target;
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(resourceMount.eContainer(), PropagatorLayerToUseResourceTransition.class);
		return parent;
	}

	@Override
	protected PropagatorFunctionAdapters getAntecedents() {
		ToUseResourceMount resourceMount = (ToUseResourceMount) this.target;
		PropagatorFunctionAdapters antecedents = super.getAntecedents();
		PropagatorFunctionAdapter calcResource = Util.getPropagatorFunctionAdapter(resourceMount, PropagatorCalcToUseResourceTransitionResource.class);
		antecedents.add(calcResource);
		return antecedents;
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.propagator.PropagatorFunctionAdapter#calculate()
	 */
	@Override
	protected void calculate() {
		ToUseResourceMount resourceMount = (ToUseResourceMount) this.target;
		resourceMount.refreshChainMount();
	}
	
	@Override
	protected void addListeners() {
		super.addListeners();
		this.addNavigationFeatureListener(TouseflockPackage.Literals.TO_USE_RESOURCE_TRANSITION__RESOURCE, DependencyToUseResourceChain.class);
	}

	static public class DependencyToUseResourceChain extends PropagatorDependencyAdapter{
		protected void addListeners() {
			super.addListeners();
			this.addFeatureListener(TouseflockPackage.Literals.TO_USE_RESOURCE__CHAIN);
		} 
	}; 
}
