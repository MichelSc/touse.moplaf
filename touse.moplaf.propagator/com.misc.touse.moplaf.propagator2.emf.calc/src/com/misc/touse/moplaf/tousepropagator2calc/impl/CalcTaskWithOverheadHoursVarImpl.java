/**
 */
package com.misc.touse.moplaf.tousepropagator2calc.impl;

import com.misc.common.moplaf.propagator2.util.Bindings;
import com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage;
import com.misc.touse.moplaf.tousepropagator2calc.CalcTaskWithOverheadHoursVar;
import com.misc.touse.moplaf.tousepropagator2calc.ToUsePropagatorCalcPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calc Task With Overhead Hours Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CalcTaskWithOverheadHoursVarImpl extends CalcTaskHoursVarImpl implements CalcTaskWithOverheadHoursVar {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcTaskWithOverheadHoursVarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUsePropagatorCalcPackage.Literals.CALC_TASK_WITH_OVERHEAD_HOURS_VAR;
	}

	private static Bindings thisClassBindings = doCreateBindings();
	
	private static Bindings doCreateBindings(){
		Bindings projectBindings = Bindings.constructEClassBindings(ToUsePropagatorPackage.Literals.PROJECT);
		projectBindings.addInboundBinding(ToUsePropagatorPackage.Literals.PROJECT__NOF_RES);

		Bindings taskHoursVarBindings = Bindings.constructEClassBindings(ToUsePropagatorPackage.Literals.TASK);
		taskHoursVarBindings.addInboundBinding(ToUsePropagatorPackage.Literals.TASK__PROJECT, projectBindings);
		taskHoursVarBindings.addInboundBinding(ToUsePropagatorPackage.Literals.TASK__HOURS_VAR_PER_RES);
		taskHoursVarBindings.addInboundBinding(ToUsePropagatorPackage.Literals.TASK_WITH_OVERHEAD__HOURS_OVERHEAD);
		
		taskHoursVarBindings.addOutboundBinding(ToUsePropagatorPackage.Literals.TASK__HOURS_VAR);

		return taskHoursVarBindings;
	}

	@Override
	public Bindings doGetBindings() {
		return thisClassBindings;
	}

} //CalcTaskWithOverheadHoursVarImpl
