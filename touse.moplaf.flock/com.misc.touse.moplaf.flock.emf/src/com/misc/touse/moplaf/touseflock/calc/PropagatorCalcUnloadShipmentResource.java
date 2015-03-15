package com.misc.touse.moplaf.touseflock.calc;

import com.misc.touse.moplaf.touseflock.TouseflockPackage;

public class PropagatorCalcUnloadShipmentResource extends
		PropagatorCalcToUseResourceTransitionResource {
	
	@Override
	protected void addListeners() {
		super.addListeners();
		this.addFeatureListener(TouseflockPackage.Literals.LOAD_SHIPMENT__SHIPMENT);
	}
}
