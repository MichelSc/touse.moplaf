/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline.calc.impl;

import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.propagator2.impl.PropagatorFunctionBindingsImpl;
import com.misc.common.moplaf.propagator2.util.Bindings;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.touse.moplaf.timeline.tousetimeline.FunctionPossible;
import com.misc.touse.moplaf.timeline.tousetimeline.ToUseTimeLinePackage;
import com.misc.touse.moplaf.timeline.tousetimeline.calc.PropagatorCalcDomainDistributionFunctionPossible;
import com.misc.touse.moplaf.timeline.tousetimeline.calc.PropagatorLayerDomainDistributionFunctions;
import com.misc.touse.moplaf.timeline.tousetimeline.calc.ToUseTimeLineCalcPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propagator Calc Domain Distribution Function Possible</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PropagatorCalcDomainDistributionFunctionPossibleImpl extends PropagatorFunctionBindingsImpl implements PropagatorCalcDomainDistributionFunctionPossible {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropagatorCalcDomainDistributionFunctionPossibleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseTimeLineCalcPackage.Literals.PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE;
	}

	@Override
	public PropagatorFunction doGetParent() {
		FunctionPossible function = (FunctionPossible)this.getObjectWithPropagatorFunctions();
		Distribution distribution = function.getDistribution();
		PropagatorLayerDomainDistributionFunctions layer = distribution.getPropagatorFunction(PropagatorLayerDomainDistributionFunctions.class);
		return layer;
	}

	private static Bindings functionPossibleBindings = Bindings.constructBindings()
			.addInboundBinding(ToUseTimeLinePackage.Literals.FUNCTION_POSSIBLE__LIMIT_MOMENT)
			.addInboundBinding(ToUseTimeLinePackage.Literals.FUNCTION_POSSIBLE__LIMIT_DURATION)
			.addInboundBinding(ToUseTimeLinePackage.Literals.FUNCTION_POSSIBLE__LIMIT_AMOUNT)
			;
		

	@Override
	public Bindings doGetBindings() {
		return functionPossibleBindings;
	}

	@Override
	public void doRefresh() {
		FunctionPossible function = (FunctionPossible)this.getObjectWithPropagatorFunctions();
		function.refresh();
	}

	
} //PropagatorCalcDomainDistributionFunctionPossibleImpl
