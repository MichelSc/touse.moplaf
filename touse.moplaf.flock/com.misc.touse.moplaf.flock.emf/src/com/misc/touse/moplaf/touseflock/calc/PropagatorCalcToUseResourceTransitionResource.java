package com.misc.touse.moplaf.touseflock.calc;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;
import com.misc.touse.moplaf.touseflock.ToUseResourceTransition;

public class PropagatorCalcToUseResourceTransitionResource extends
		PropagatorFunctionAdapter{

	@Override
	protected PropagatorFunctionAdapter getParent() {
		ToUseResourceTransition resourceTransition = (ToUseResourceTransition) this.target;
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(resourceTransition.eContainer(), 
				                                                             PropagatorLayerToUseResourceTransition.class);
		return parent;
	}

	
	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.propagator.PropagatorFunctionAdapter#isTouchOnOwned()
	 */
	@Override
	protected boolean isTouchOnOwned() {
		return true;
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.propagator.PropagatorFunctionAdapter#calculate()
	 */
	@Override
	protected void calculate() {
		ToUseResourceTransition resourceTransition = (ToUseResourceTransition) this.target;
		resourceTransition.refreshResource();
	}
	
}
