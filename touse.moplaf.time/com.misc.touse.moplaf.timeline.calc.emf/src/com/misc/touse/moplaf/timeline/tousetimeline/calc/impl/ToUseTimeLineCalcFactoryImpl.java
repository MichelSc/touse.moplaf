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
			case ToUseTimeLineCalcPackage.SCOPE_DOMAIN: return createScopeDomain();
			case ToUseTimeLineCalcPackage.SCOPE_DOMAIN_DISTRIBUTION: return createScopeDomainDistribution();
			case ToUseTimeLineCalcPackage.LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS: return createLayerDomainDistributionFunctions();
			case ToUseTimeLineCalcPackage.CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL: return createCalcDomainDistributionFunctionInterval();
			case ToUseTimeLineCalcPackage.CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE: return createCalcDomainDistributionFunctionPossible();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeDomain createScopeDomain() {
		ScopeDomainImpl scopeDomain = new ScopeDomainImpl();
		return scopeDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeDomainDistribution createScopeDomainDistribution() {
		ScopeDomainDistributionImpl scopeDomainDistribution = new ScopeDomainDistributionImpl();
		return scopeDomainDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerDomainDistributionFunctions createLayerDomainDistributionFunctions() {
		LayerDomainDistributionFunctionsImpl layerDomainDistributionFunctions = new LayerDomainDistributionFunctionsImpl();
		return layerDomainDistributionFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcDomainDistributionFunctionInterval createCalcDomainDistributionFunctionInterval() {
		CalcDomainDistributionFunctionIntervalImpl calcDomainDistributionFunctionInterval = new CalcDomainDistributionFunctionIntervalImpl();
		return calcDomainDistributionFunctionInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcDomainDistributionFunctionPossible createCalcDomainDistributionFunctionPossible() {
		CalcDomainDistributionFunctionPossibleImpl calcDomainDistributionFunctionPossible = new CalcDomainDistributionFunctionPossibleImpl();
		return calcDomainDistributionFunctionPossible;
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
