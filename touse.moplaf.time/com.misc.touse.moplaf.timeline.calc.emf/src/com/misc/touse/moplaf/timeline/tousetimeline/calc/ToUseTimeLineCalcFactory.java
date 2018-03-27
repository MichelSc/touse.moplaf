/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline.calc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.ToUseTimeLineCalcPackage
 * @generated
 */
public interface ToUseTimeLineCalcFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToUseTimeLineCalcFactory eINSTANCE = com.misc.touse.moplaf.timeline.tousetimeline.calc.impl.ToUseTimeLineCalcFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Scope Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scope Domain</em>'.
	 * @generated
	 */
	ScopeDomain createScopeDomain();

	/**
	 * Returns a new object of class '<em>Scope Domain Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scope Domain Distribution</em>'.
	 * @generated
	 */
	ScopeDomainDistribution createScopeDomainDistribution();

	/**
	 * Returns a new object of class '<em>Layer Domain Distribution Functions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layer Domain Distribution Functions</em>'.
	 * @generated
	 */
	LayerDomainDistributionFunctions createLayerDomainDistributionFunctions();

	/**
	 * Returns a new object of class '<em>Calc Domain Distribution Function Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Domain Distribution Function Interval</em>'.
	 * @generated
	 */
	CalcDomainDistributionFunctionInterval createCalcDomainDistributionFunctionInterval();

	/**
	 * Returns a new object of class '<em>Calc Domain Distribution Function Possible</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Domain Distribution Function Possible</em>'.
	 * @generated
	 */
	CalcDomainDistributionFunctionPossible createCalcDomainDistributionFunctionPossible();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ToUseTimeLineCalcPackage getToUseTimeLineCalcPackage();

} //ToUseTimeLineCalcFactory
