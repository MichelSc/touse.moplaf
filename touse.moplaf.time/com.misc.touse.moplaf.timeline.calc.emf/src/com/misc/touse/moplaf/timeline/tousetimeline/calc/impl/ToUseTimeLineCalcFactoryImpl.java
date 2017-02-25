/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline.calc.impl;

import com.misc.touse.moplaf.timeline.tousetimeline.calc.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToUseTimeLineCalcFactoryImpl extends EFactoryImpl implements ToUseTimeLineCalcFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ToUseTimeLineCalcFactory init() {
		try {
			ToUseTimeLineCalcFactory theToUseTimeLineCalcFactory = (ToUseTimeLineCalcFactory)EPackage.Registry.INSTANCE.getEFactory(ToUseTimeLineCalcPackage.eNS_URI);
			if (theToUseTimeLineCalcFactory != null) {
				return theToUseTimeLineCalcFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ToUseTimeLineCalcFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseTimeLineCalcFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ToUseTimeLineCalcPackage.PROPAGATOR_SCOPE_DOMAIN: return createPropagatorScopeDomain();
			case ToUseTimeLineCalcPackage.PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION: return createPropagatorScopeDomainDistribution();
			case ToUseTimeLineCalcPackage.PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS: return createPropagatorLayerDomainDistributionFunctions();
			case ToUseTimeLineCalcPackage.PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL: return createPropagatorCalcDomainDistributionFunctionInterval();
			case ToUseTimeLineCalcPackage.PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE: return createPropagatorCalcDomainDistributionFunctionPossible();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorScopeDomain createPropagatorScopeDomain() {
		PropagatorScopeDomainImpl propagatorScopeDomain = new PropagatorScopeDomainImpl();
		return propagatorScopeDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorScopeDomainDistribution createPropagatorScopeDomainDistribution() {
		PropagatorScopeDomainDistributionImpl propagatorScopeDomainDistribution = new PropagatorScopeDomainDistributionImpl();
		return propagatorScopeDomainDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorLayerDomainDistributionFunctions createPropagatorLayerDomainDistributionFunctions() {
		PropagatorLayerDomainDistributionFunctionsImpl propagatorLayerDomainDistributionFunctions = new PropagatorLayerDomainDistributionFunctionsImpl();
		return propagatorLayerDomainDistributionFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcDomainDistributionFunctionInterval createPropagatorCalcDomainDistributionFunctionInterval() {
		PropagatorCalcDomainDistributionFunctionIntervalImpl propagatorCalcDomainDistributionFunctionInterval = new PropagatorCalcDomainDistributionFunctionIntervalImpl();
		return propagatorCalcDomainDistributionFunctionInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcDomainDistributionFunctionPossible createPropagatorCalcDomainDistributionFunctionPossible() {
		PropagatorCalcDomainDistributionFunctionPossibleImpl propagatorCalcDomainDistributionFunctionPossible = new PropagatorCalcDomainDistributionFunctionPossibleImpl();
		return propagatorCalcDomainDistributionFunctionPossible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseTimeLineCalcPackage getToUseTimeLineCalcPackage() {
		return (ToUseTimeLineCalcPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ToUseTimeLineCalcPackage getPackage() {
		return ToUseTimeLineCalcPackage.eINSTANCE;
	}

} //ToUseTimeLineCalcFactoryImpl
