/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline.calc.impl;

import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionAmounts;
import com.misc.common.moplaf.time.continuous.impl.PropagatorFunctionDistributionImpl;

import com.misc.touse.moplaf.timeline.tousetimeline.calc.PropagatorLayerDomainDistributionFunctions;
import com.misc.touse.moplaf.timeline.tousetimeline.calc.PropagatorScopeDomainDistribution;
import com.misc.touse.moplaf.timeline.tousetimeline.calc.ToUseTimeLineCalcPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propagator Layer Domain Distribution Functions</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PropagatorLayerDomainDistributionFunctionsImpl extends PropagatorFunctionDistributionImpl implements PropagatorLayerDomainDistributionFunctions {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropagatorLayerDomainDistributionFunctionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseTimeLineCalcPackage.Literals.PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS;
	}

	@Override
	public PropagatorFunction doGetParent() {
		Distribution distribution = this.getDistribution();
		PropagatorScopeDomainDistribution scopeDomain = distribution.getPropagatorFunction(PropagatorScopeDomainDistribution.class);
		return scopeDomain;
	}

	@Override
	public void doCollectExplicitAntecedents(EList<PropagatorFunction> antecedents) {
		super.doCollectExplicitAntecedents(antecedents);
		Distribution distribution = this.getDistribution();
		PropagatorLayerDistributionAmounts calcDistributionAmounts= distribution.getPropagatorFunction(PropagatorLayerDistributionAmounts.class);
		antecedents.add(calcDistributionAmounts);
	}

} //PropagatorLayerDomainDistributionFunctionsImpl
