package com.misc.touse.moplaf.touseflock.calc;

import com.misc.touse.moplaf.touseflock.TouseflockPackage;

public class PropagatorCalcTrailerConfigurationResource extends
		PropagatorCalcToUseResourceTransitionResource {
	
	@Override
	protected void addListeners() {
		super.addListeners();
		this.addFeatureListener(TouseflockPackage.Literals.TRAILER_CONFIGURATION__TRAILER);
	}
}
