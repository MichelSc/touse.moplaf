/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline.calc.impl;

import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.calc.LayerDistributionAmounts;
import com.misc.common.moplaf.time.continuous.impl.PropagatorFunctionDistributionImpl;

import com.misc.touse.moplaf.timeline.tousetimeline.calc.LayerDomainDistributionFunctions;
import com.misc.touse.moplaf.timeline.tousetimeline.calc.ScopeDomainDistribution;
import com.misc.touse.moplaf.timeline.tousetimeline.calc.ToUseTimeLineCalcPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propagator Layer Domain Distribution Functions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.calc.impl.LayerDomainDistributionFunctionsImpl#getConcreteParent <em>Concrete Parent</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.calc.impl.LayerDomainDistributionFunctionsImpl#getAntecedentLayerDistributionAmounts <em>Antecedent Layer Distribution Amounts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LayerDomainDistributionFunctionsImpl extends PropagatorFunctionDistributionImpl implements LayerDomainDistributionFunctions {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayerDomainDistributionFunctionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseTimeLineCalcPackage.Literals.LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeDomainDistribution getConcreteParent() {
		ScopeDomainDistribution concreteParent = basicGetConcreteParent();
		return concreteParent != null && concreteParent.eIsProxy() ? (ScopeDomainDistribution)eResolveProxy((InternalEObject)concreteParent) : concreteParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ScopeDomainDistribution basicGetConcreteParent() {
		Distribution distribution = this.getDistribution();
		ScopeDomainDistribution scopeDomain = distribution.getPropagatorFunction(ScopeDomainDistribution.class);
		return scopeDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerDistributionAmounts getAntecedentLayerDistributionAmounts() {
		LayerDistributionAmounts antecedentLayerDistributionAmounts = basicGetAntecedentLayerDistributionAmounts();
		return antecedentLayerDistributionAmounts != null && antecedentLayerDistributionAmounts.eIsProxy() ? (LayerDistributionAmounts)eResolveProxy((InternalEObject)antecedentLayerDistributionAmounts) : antecedentLayerDistributionAmounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public LayerDistributionAmounts basicGetAntecedentLayerDistributionAmounts() {
		Distribution distribution = this.getDistribution();
		LayerDistributionAmounts layerDistributionAmounts= distribution.getPropagatorFunction(LayerDistributionAmounts.class);
		return layerDistributionAmounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUseTimeLineCalcPackage.LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS__CONCRETE_PARENT:
				if (resolve) return getConcreteParent();
				return basicGetConcreteParent();
			case ToUseTimeLineCalcPackage.LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS__ANTECEDENT_LAYER_DISTRIBUTION_AMOUNTS:
				if (resolve) return getAntecedentLayerDistributionAmounts();
				return basicGetAntecedentLayerDistributionAmounts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ToUseTimeLineCalcPackage.LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS__CONCRETE_PARENT:
				return basicGetConcreteParent() != null;
			case ToUseTimeLineCalcPackage.LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS__ANTECEDENT_LAYER_DISTRIBUTION_AMOUNTS:
				return basicGetAntecedentLayerDistributionAmounts() != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public PropagatorFunction doGetParent() {
		return this.getConcreteParent();
	}

	@Override
	public void doCollectExplicitAntecedents(EList<PropagatorFunction> antecedents) {
		super.doCollectExplicitAntecedents(antecedents);
		antecedents.add(this.getAntecedentLayerDistributionAmounts());
	}

} //PropagatorLayerDomainDistributionFunctionsImpl
