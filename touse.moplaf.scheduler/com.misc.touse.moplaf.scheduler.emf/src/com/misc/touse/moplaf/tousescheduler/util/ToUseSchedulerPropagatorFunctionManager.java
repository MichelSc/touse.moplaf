package com.misc.touse.moplaf.tousescheduler.util;

import com.misc.common.moplaf.propagator2.util.PropagatorFunctionManagerAdapter;
import com.misc.common.moplaf.propagator2.util.PropagatorFunctionsConstructors;
import com.misc.common.moplaf.propagator2.util.PropagatorFunctionsFactory;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;

public class ToUseSchedulerPropagatorFunctionManager extends PropagatorFunctionManagerAdapter {

	/**
	 * Constructor
	 */
	public ToUseSchedulerPropagatorFunctionManager() {
		super( ToUseSchedulerPropagatorFunctionManager.propagatorFunctionFactory);
	}
	
	static public String FACTORY_ID = "com.misc.touse.moplaf.tousescheduler.propagator.factory_id";

	static PropagatorFunctionsFactory propagatorFunctionFactory = PropagatorFunctionsFactory.constructPropagatorFunctionsFactory(FACTORY_ID)
			;
	
	static PropagatorFunctionsConstructors schedulePropagatorFunctionsConstructors =  
			propagatorFunctionFactory.constructPropagatorFunctionsConstructors(ToUseSchedulerPackage.Literals.TO_USE_SCHEDULE)
			.addConstructor(ToUseSchedulerPackage.Literals.SCOPE_SCHEDULE_SCORE)
			.addConstructor(ToUseSchedulerPackage.Literals.LAYER_SCHEDULE_DISTANCE)
			.addConstructor(ToUseSchedulerPackage.Literals.LAYER_SCHEDULE_VOLUME_LOADED)
			.addConstructor(ToUseSchedulerPackage.Literals.LAYER_SCHEDULE_PLANNED_BENEFIT)
			;

	static PropagatorFunctionsConstructors ResourcePropagatorFunctionsConstructors =  
			propagatorFunctionFactory.constructPropagatorFunctionsConstructors(ToUseSchedulerPackage.Literals.TO_USE_SCHEDULE_RESOURCE)
			.addConstructor(ToUseSchedulerPackage.Literals.CALC_RESOURCE_DISTANCE)
			.addConstructor(ToUseSchedulerPackage.Literals.CALC_RESOURCE_DISTANCE_FROM_LAST)
			.addConstructor(ToUseSchedulerPackage.Literals.CALC_RESOURCE_VOLUME_OVERLOAD)
			.addConstructor(ToUseSchedulerPackage.Literals.CALC_RESOURCE_PLANNED_BENEFIT)
			;

	static PropagatorFunctionsConstructors TaskPropagatorFunctionsConstructors =  
			propagatorFunctionFactory.constructPropagatorFunctionsConstructors(ToUseSchedulerPackage.Literals.TO_USE_SCHEDULE_TASK)
			.addConstructor(ToUseSchedulerPackage.Literals.CALC_TASK_DISTANCE)
			.addConstructor(ToUseSchedulerPackage.Literals.CALC_TASK_DISTANCE_FROM_PREVIOUS)
			.addConstructor(ToUseSchedulerPackage.Literals.CALC_TASK_START_VOLUME_LOADED)
			.addConstructor(ToUseSchedulerPackage.Literals.CALC_TASK_END_VOLUME_LOADED)
			;

}
