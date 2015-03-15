package com.misc.touse.moplaf.touseflock.calc;

import com.misc.common.moplaf.propagator.PropagatorDependencyAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;
import com.misc.touse.moplaf.touseflock.ToUseDomain;
import com.misc.touse.moplaf.touseflock.ToUseResource;
import com.misc.touse.moplaf.touseflock.TouseflockPackage;

public class PropagatorCalcToUseResourceChain extends
		PropagatorFunctionAdapter{

	@Override
	protected PropagatorFunctionAdapter getParent() {
		ToUseResource resource = (ToUseResource) this.target;
		ToUseDomain domain = resource.getDomain();
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(domain, PropagatorLayerToUseResource.class);
		return parent;
	}
	
	

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.propagator.PropagatorFunctionAdapter#isTouchOnOnwed()
	 */
	@Override
	protected boolean isTouchOnOwned() {
		return true;
	}



	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.propagator.PropagatorFunctionAdapter#isTouchOnDispose()
	 */
	@Override
	protected boolean isTouchOnDispose() {
		return true;
	}



	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.propagator.PropagatorFunctionAdapter#calculate()
	 */
	@Override
	protected void calculate() {
		ToUseResource resource = (ToUseResource) this.target;
		resource.refreshChain();
	}

	@Override
	protected void addListeners() {
		super.addListeners();
		this.addNavigationFeatureListener(TouseflockPackage.Literals.TO_USE_RESOURCE__DOMAIN, DependencyToUseDomainFlockScope.class);
	}

	static public class DependencyToUseDomainFlockScope extends PropagatorDependencyAdapter{
		protected void addListeners() {
			super.addListeners();
			this.addFeatureListener(TouseflockPackage.Literals.TO_USE_DOMAIN__FLOCK_SCOPE);
		} 
	}; 
}
