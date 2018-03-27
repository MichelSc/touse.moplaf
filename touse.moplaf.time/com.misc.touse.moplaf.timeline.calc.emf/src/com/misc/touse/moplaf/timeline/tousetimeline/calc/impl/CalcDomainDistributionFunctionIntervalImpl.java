/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline.calc.impl;

import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.propagator2.util.Bindings;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.impl.PropagatorFunctionDistributionAbstractImpl;
import com.misc.touse.moplaf.timeline.tousetimeline.FunctionInterval;
import com.misc.touse.moplaf.timeline.tousetimeline.ToUseTimeLinePackage;
import com.misc.touse.moplaf.timeline.tousetimeline.calc.CalcDomainDistributionFunctionInterval;
import com.misc.touse.moplaf.timeline.tousetimeline.calc.LayerDomainDistributionFunctions;
import com.misc.touse.moplaf.timeline.tousetimeline.calc.ToUseTimeLineCalcPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propagator Calc Domain Distribution Function Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.calc.impl.CalcDomainDistributionFunctionIntervalImpl#getConcreteParent <em>Concrete Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalcDomainDistributionFunctionIntervalImpl extends PropagatorFunctionDistributionAbstractImpl implements CalcDomainDistributionFunctionInterval {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcDomainDistributionFunctionIntervalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseTimeLineCalcPackage.Literals.CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerDomainDistributionFunctions getConcreteParent() {
		LayerDomainDistributionFunctions concreteParent = basicGetConcreteParent();
		return concreteParent != null && concreteParent.eIsProxy() ? (LayerDomainDistributionFunctions)eResolveProxy((InternalEObject)concreteParent) : concreteParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public LayerDomainDistributionFunctions basicGetConcreteParent() {
		FunctionInterval function = (FunctionInterval)this.getObjectWithPropagatorFunctions();
		Distribution distribution = function.getDistribution();
		LayerDomainDistributionFunctions layer = distribution.getPropagatorFunction(LayerDomainDistributionFunctions.class);
		return layer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUseTimeLineCalcPackage.CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL__CONCRETE_PARENT:
				if (resolve) return getConcreteParent();
				return basicGetConcreteParent();
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
			case ToUseTimeLineCalcPackage.CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL__CONCRETE_PARENT:
				return basicGetConcreteParent() != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public PropagatorFunction doGetParent() {
		return this.getConcreteParent();
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
