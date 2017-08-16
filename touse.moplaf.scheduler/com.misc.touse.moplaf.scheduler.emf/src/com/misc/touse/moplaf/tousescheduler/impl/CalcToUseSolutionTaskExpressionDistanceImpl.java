/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.common.moplaf.propagator2.util.Bindings;
import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.common.moplaf.scheduler.SolutionTask;
import com.misc.common.moplaf.scheduler.TaskCandidateFloatExpression;
import com.misc.common.moplaf.schedulercalc.impl.SetTaskExpressionCandidateValueImpl;
import com.misc.touse.moplaf.tousescheduler.CalcToUseSolutionTaskExpressionDistance;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;
import com.misc.touse.moplaf.tousescheduler.ToUseSolutionTask;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calc To Use Solution Task Expression Distance</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CalcToUseSolutionTaskExpressionDistanceImpl extends SetTaskExpressionCandidateValueImpl implements CalcToUseSolutionTaskExpressionDistance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcToUseSolutionTaskExpressionDistanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseSchedulerPackage.Literals.CALC_TO_USE_SOLUTION_TASK_EXPRESSION_DISTANCE;
	}
	
	private static Bindings taskBeforeExpressionDistance = Bindings.constructBindings()
			.addInboundBinding(SchedulerPackage.Literals.CANDIDATE_FLOAT_EXPRESSION__CANDIDATE_VALUE)
			;
		
	private static Bindings taskBeforeBindings = Bindings.constructBindings()
			.addInboundBinding(ToUseSchedulerPackage.Literals.TO_USE_SOLUTION_TASK__DISTANCE, taskBeforeExpressionDistance)
			;
		
	private static Bindings thisTaskBindings = Bindings.constructBindings()
			.addInboundBinding(SchedulerPackage.Literals.SOLUTION_TASK__CANDIDATE_PREVIOUS_TASK, taskBeforeBindings)	
			.addInboundBinding(SchedulerPackage.Literals.SOLUTION_TASK__CANDIDATE_SCHEDULED_RESOURCE)	
			;

	private static Bindings thisTaskExpressionDistanceBindings = Bindings.constructBindings()
			.addInboundBinding(SchedulerPackage.Literals.TASK_EXPRESSION__TASK, thisTaskBindings)	
			.addOutboundBinding(SchedulerPackage.Literals.CANDIDATE_FLOAT_EXPRESSION__CANDIDATE_VALUE)
			;
		
	/**
	 * 
	 */
	@Override
	public Bindings doGetBindings() {
		return thisTaskExpressionDistanceBindings;
	}

	/**
	 * 
	 */
	@Override
	public void doRefresh() {
		TaskCandidateFloatExpression task_expression = (TaskCandidateFloatExpression)this.getTaskExpression();
		SolutionTask task = task_expression.getTask();
		ToUseSolutionTask previous_task = (ToUseSolutionTask) task.getCandidatePreviousTask();
		float distance = 0.0f; 
		if ( previous_task != null) {
			TaskCandidateFloatExpression previous_task_expression = previous_task.getDistance();
			distance = previous_task_expression.getCandidateValue()+1.5f; 
		}
		task_expression.setCandidateValue(distance);
	}
	
	


} //CalcToUseSolutionTaskExpressionDistanceImpl
