package com.misc.touse.moplaf.timeline.tousetimeline.calc.util;

import org.eclipse.emf.common.CommonPlugin;

import com.misc.touse.moplaf.timeline.tousetimeline.calc.PropagatorScopeDomain;
import com.misc.common.moplaf.propagator2.util.PropagatorFunctionManagerAdapter;
import com.misc.common.moplaf.propagator2.util.PropagatorFunctionsConstructors;
import com.misc.common.moplaf.propagator2.util.PropagatorFunctionsFactory;
import com.misc.common.moplaf.time.continuous.calc.util.TimeContinuousPropagatorFunctionManager;
import com.misc.touse.moplaf.timeline.tousetimeline.Domain;
import com.misc.touse.moplaf.timeline.tousetimeline.ToUseTimeLinePackage;
import com.misc.touse.moplaf.timeline.tousetimeline.calc.ToUseTimeLineCalcPackage;

public class ToUseTimeLinePropagatorFunctionManager extends PropagatorFunctionManagerAdapter {

	/**
	 * Constructor
	 */
	public ToUseTimeLinePropagatorFunctionManager() {
		super( constructor);
	}

	/**
	 * Helper for refreshing a Distribution
	 * @param project
	 */
	public static void refreshDistribution(Domain domain){
		 CommonPlugin.INSTANCE.log( "ToUseTimeLine, refresh called: domain");
		 PropagatorScopeDomain scopeDomain = domain.getPropagatorFunction(PropagatorScopeDomain.class);
		 if ( scopeDomain !=null){
			 scopeDomain.refresh();
		 }
	}

	static PropagatorFunctionsFactory constructor = TimeContinuousPropagatorFunctionManager.constructor.copy();

	static PropagatorFunctionsConstructors domainPropagatorFunctionsConstructors = 
			constructor.constructPropagatorFunctionsConstructors(ToUseTimeLinePackage.Literals.DOMAIN)
			.addConstructor(ToUseTimeLineCalcPackage.Literals.PROPAGATOR_SCOPE_DOMAIN)
			;

	static PropagatorFunctionsConstructors domainDistributionPropagatorFunctionsConstructors = 
			constructor.constructPropagatorFunctionsConstructors(ToUseTimeLinePackage.Literals.DOMAIN_DISTRIBUTION)
			.addConstructor(ToUseTimeLineCalcPackage.Literals.PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION)
			.addConstructor(ToUseTimeLineCalcPackage.Literals.PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS)
			;

	static PropagatorFunctionsConstructors functionPossiblePropagatorFunctionsConstructors = 
			constructor.constructPropagatorFunctionsConstructors(ToUseTimeLinePackage.Literals.FUNCTION_POSSIBLE)
			.addConstructor(ToUseTimeLineCalcPackage.Literals.PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE)
			;

	static PropagatorFunctionsConstructors functionIntervalPropagatorFunctionsConstructors = 
			constructor.constructPropagatorFunctionsConstructors(ToUseTimeLinePackage.Literals.FUNCTION_INTERVAL)
			.addConstructor(ToUseTimeLineCalcPackage.Literals.PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL)
			;

}
