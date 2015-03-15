package com.misc.touse.moplaf.touseflock.calc;

import com.misc.touse.moplaf.touseflock.TouseflockPackage;

public class PropagatorCalcDetachTrailerResource extends
		PropagatorCalcToUseResourceTransitionResource {
	
	@Override
	protected void addListeners() {
		super.addListeners();
		this.addFeatureListener(TouseflockPackage.Literals.DETACH_TRAILER__TRAILER);
	}
}
