/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline.calc.impl;

import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.propagator2.impl.PropagatorFunctionBindingsImpl;
import com.misc.common.moplaf.propagator2.util.Bindings;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.touse.moplaf.timeline.tousetimeline.FunctionInterval;
import com.misc.touse.moplaf.timeline.tousetimeline.ToUseTimeLinePackage;
import com.misc.touse.moplaf.timeline.tousetimeline.calc.PropagatorCalcDomainDistributionFunctionInterval;
import com.misc.touse.moplaf.timeline.tousetimeline.calc.PropagatorLayerDomainDistributionFunctions;
import com.misc.touse.moplaf.timeline.tousetimeline.calc.ToUseTimeLineCalcPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propagator Calc Domain Distribution Function Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PropagatorCalcDomainDistributionFunctionIntervalImpl extends PropagatorFunctionBindingsImpl implements PropagatorCalcDomainDistributionFunctionInterval {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropagatorCalcDomainDistributionFunctionIntervalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseTimeLineCalcPackage.Literals.PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL;
	}

	@Override
	public PropagatorFunction doGetParent() {
		FunctionInterval function = (FunctionInterval)this.getObjectWithPropagatorFunctions();
		Distribution distribution = function.getDistribution();
		PropagatorLayerDomainDistributionFunctions layer = distribution.getPropagatorFunction(PropagatorLayerDomainDistributionFunctions.class);
		return layer;
	}

	private static Bindings functionIntervalBindings = Bindings.constructBindings()
			.addInboundBinding(ToUseTimeLinePackage.Literals.FUNCTION_INTERVAL__FROM)
			.addInboundBinding(ToUseTimeLinePackage.Literals.FUNCTION_INTERVAL__TO)
			;
		

	@Override
	public Bindings doGetBindings() {
		return functionIntervalBindings;
	}

	@Override
	public void doRefresh() {
		FunctionInterval function = (FunctionInterval)this.getObjectWithPropagatorFunctions();
		function.refresh();
	}

	
	
} //PropagatorCalcDomainDistributionFunctionIntervalImpl
