package com.misc.touse.moplaf.touseflock.calc;

import com.misc.common.moplaf.flock.calc.PropagatorScopeFlockScope;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapters;
import com.misc.common.moplaf.propagator.Util;
import com.misc.touse.moplaf.touseflock.FlockScopeToUse;
import com.misc.touse.moplaf.touseflock.ToUseDomain;


/**
 * <!-- begin-user-doc -->
 * The scope of propagation for a set of Flocks (a FlockScope), made concrete for the ToUse project
 * <!-- end-user-doc -->
 */
public class PropagatorCalcFlockScopeToUse extends PropagatorScopeFlockScope {
	
	@Override
	protected PropagatorFunctionAdapter getParent() {
		FlockScopeToUse flockScope = (FlockScopeToUse)this.target;
		ToUseDomain domain = flockScope.getToUseDomain();
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(domain, PropagatorScopeToUseDomain.class);
		return parent;
	}

	@Override
	protected PropagatorFunctionAdapters getAntecedents() {
		FlockScopeToUse flockScope = (FlockScopeToUse)this.target;
		ToUseDomain domain = flockScope.getToUseDomain();

		PropagatorFunctionAdapters antecedents = super.getAntecedents();
		PropagatorFunctionAdapter layerResource = Util.getPropagatorFunctionAdapter(domain, PropagatorLayerToUseResource.class);
		antecedents.add(layerResource);
		return antecedents;
	}
}
