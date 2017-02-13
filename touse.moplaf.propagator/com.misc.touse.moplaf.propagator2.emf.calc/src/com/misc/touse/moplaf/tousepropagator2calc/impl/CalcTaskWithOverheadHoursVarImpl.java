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

	private static Bindings projectBindings = Bindings.constructEClassBindings(ToUsePropagatorPackage.Literals.PROJECT)
			.addInboundBinding(ToUsePropagatorPackage.Literals.PROJECT__NOF_RES);

	private static Bindings taskHoursVarBindings = Bindings.constructEClassBindings(ToUsePropagatorPackage.Literals.TASK)
			.addInboundBinding(ToUsePropagatorPackage.Literals.TASK__PROJECT, projectBindings)
			.addInboundBinding(ToUsePropagatorPackage.Literals.TASK__HOURS_VAR_PER_RES)
			.addInboundBinding(ToUsePropagatorPackage.Literals.TASK_WITH_OVERHEAD__HOURS_OVERHEAD)
			.addOutboundBinding(ToUsePropagatorPackage.Literals.TASK__HOURS_VAR);

	@Override
	public Bindings doGetBindings() {
		return taskHoursVarBindings;
	}

} //CalcTaskWithOverheadHoursVarImpl
