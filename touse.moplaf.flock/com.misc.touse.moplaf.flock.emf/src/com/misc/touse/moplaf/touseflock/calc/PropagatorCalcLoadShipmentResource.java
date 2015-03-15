package com.misc.touse.moplaf.touseflock.calc;

import com.misc.touse.moplaf.touseflock.TouseflockPackage;

public class PropagatorCalcLoadShipmentResource extends
		PropagatorCalcToUseResourceTransitionResource {
	
	@Override
	protected void addListeners() {
		super.addListeners();
		this.addFeatureListener(TouseflockPackage.Literals.UNLOAD_SHIPMENT__SHIPMENT);
	}
}
