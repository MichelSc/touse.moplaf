package com.misc.touse.moplaf.touseflock.calc;

import com.misc.touse.moplaf.touseflock.TouseflockPackage;

public class PropagatorCalcTractorConfigurationResource extends
		PropagatorCalcToUseResourceTransitionResource {
	
		@Override
	protected void addListeners() {
		super.addListeners();
		this.addFeatureListener(TouseflockPackage.Literals.TRACTOR_CONFIGURATION__TRACTOR);
	}
}
