package com.misc.touse.moplaf.touseflock.calc;

import com.misc.touse.moplaf.touseflock.TouseflockPackage;

public class PropagatorCalcAttachTrailerResource extends
		PropagatorCalcToUseResourceTransitionResource {
	
	@Override
	protected void addListeners() {
		super.addListeners();
		this.addFeatureListener(TouseflockPackage.Literals.ATTACH_TRAILER__TRAILER);
	}
}
