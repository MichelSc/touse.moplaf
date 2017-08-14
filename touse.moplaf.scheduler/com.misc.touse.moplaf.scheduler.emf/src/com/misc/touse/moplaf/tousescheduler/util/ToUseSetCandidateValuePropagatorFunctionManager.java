package com.misc.touse.moplaf.tousescheduler.util;


import com.misc.common.moplaf.propagator2.util.PropagatorFunctionManagerAdapter;
import com.misc.common.moplaf.propagator2.util.PropagatorFunctionsConstructors;
import com.misc.common.moplaf.propagator2.util.PropagatorFunctionsFactory;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.schedulercalc.util.SetCandidateValuePropagatorFunctionManager;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;

public class ToUseSetCandidateValuePropagatorFunctionManager extends PropagatorFunctionManagerAdapter {

	/**
	 * Constructor
	 */
	public ToUseSetCandidateValuePropagatorFunctionManager() {
		super( ToUseSetCandidateValuePropagatorFunctionManager.propagatorFunctionFactory);
	}

	static PropagatorFunctionsFactory propagatorFunctionFactory = SetCandidateValuePropagatorFunctionManager.propagatorFunctionFactory.copy();
	
	static PropagatorFunctionsConstructors solutionPropagatorFunctionsConstructors =  
			propagatorFunctionFactory.constructPropagatorFunctionsConstructors(SchedulerPackage.Literals.SOLUTION);
			;

	static PropagatorFunctionsConstructors TaskPropagatorFunctionsConstructors =  
			propagatorFunctionFactory.constructPropagatorFunctionsConstructors(ToUseSchedulerPackage.Literals.TO_USE_SOLUTION_TASK__DISTANCE)
			.addConstructor(ToUseSchedulerPackage.Literals.CALC_TO_USE_SOLUTION_TASK_EXPRESSION_DISTANCE);
			;

}
