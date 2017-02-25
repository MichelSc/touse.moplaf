/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline.calc.util;

import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.propagator2.PropagatorFunctionBindings;

import com.misc.common.moplaf.time.continuous.PropagatorFunctionDistribution;

import com.misc.common.moplaf.time.continuous.calc.PropagatorScopeDistribution;

import com.misc.touse.moplaf.timeline.tousetimeline.calc.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.ToUseTimeLineCalcPackage
 * @generated
 */
public class ToUseTimeLineCalcSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ToUseTimeLineCalcPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseTimeLineCalcSwitch() {
		if (modelPackage == null) {
			modelPackage = ToUseTimeLineCalcPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ToUseTimeLineCalcPackage.PROPAGATOR_SCOPE_DOMAIN: {
				PropagatorScopeDomain propagatorScopeDomain = (PropagatorScopeDomain)theEObject;
				T result = casePropagatorScopeDomain(propagatorScopeDomain);
				if (result == null) result = casePropagatorFunctionBindings(propagatorScopeDomain);
				if (result == null) result = casePropagatorFunction(propagatorScopeDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToUseTimeLineCalcPackage.PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION: {
				PropagatorScopeDomainDistribution propagatorScopeDomainDistribution = (PropagatorScopeDomainDistribution)theEObject;
				T result = casePropagatorScopeDomainDistribution(propagatorScopeDomainDistribution);
				if (result == null) result = casePropagatorScopeDistribution(propagatorScopeDomainDistribution);
				if (result == null) result = casePropagatorFunctionDistribution(propagatorScopeDomainDistribution);
				if (result == null) result = casePropagatorFunctionBindings(propagatorScopeDomainDistribution);
				if (result == null) result = casePropagatorFunction(propagatorScopeDomainDistribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToUseTimeLineCalcPackage.PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS: {
				PropagatorLayerDomainDistributionFunctions propagatorLayerDomainDistributionFunctions = (PropagatorLayerDomainDistributionFunctions)theEObject;
				T result = casePropagatorLayerDomainDistributionFunctions(propagatorLayerDomainDistributionFunctions);
				if (result == null) result = casePropagatorFunctionDistribution(propagatorLayerDomainDistributionFunctions);
				if (result == null) result = casePropagatorFunctionBindings(propagatorLayerDomainDistributionFunctions);
				if (result == null) result = casePropagatorFunction(propagatorLayerDomainDistributionFunctions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToUseTimeLineCalcPackage.PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL: {
				PropagatorCalcDomainDistributionFunctionInterval propagatorCalcDomainDistributionFunctionInterval = (PropagatorCalcDomainDistributionFunctionInterval)theEObject;
				T result = casePropagatorCalcDomainDistributionFunctionInterval(propagatorCalcDomainDistributionFunctionInterval);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcDomainDistributionFunctionInterval);
				if (result == null) result = casePropagatorFunction(propagatorCalcDomainDistributionFunctionInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToUseTimeLineCalcPackage.PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE: {
				PropagatorCalcDomainDistributionFunctionPossible propagatorCalcDomainDistributionFunctionPossible = (PropagatorCalcDomainDistributionFunctionPossible)theEObject;
				T result = casePropagatorCalcDomainDistributionFunctionPossible(propagatorCalcDomainDistributionFunctionPossible);
				if (result == null) result = casePropagatorFunctionBindings(propagatorCalcDomainDistributionFunctionPossible);
				if (result == null) result = casePropagatorFunction(propagatorCalcDomainDistributionFunctionPossible);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Scope Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Scope Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorScopeDomain(PropagatorScopeDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Scope Domain Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Scope Domain Distribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorScopeDomainDistribution(PropagatorScopeDomainDistribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Layer Domain Distribution Functions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Layer Domain Distribution Functions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorLayerDomainDistributionFunctions(PropagatorLayerDomainDistributionFunctions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Domain Distribution Function Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Domain Distribution Function Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcDomainDistributionFunctionInterval(PropagatorCalcDomainDistributionFunctionInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Calc Domain Distribution Function Possible</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Calc Domain Distribution Function Possible</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorCalcDomainDistributionFunctionPossible(PropagatorCalcDomainDistributionFunctionPossible object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorFunction(PropagatorFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Bindings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Bindings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorFunctionBindings(PropagatorFunctionBindings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Function Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Function Distribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorFunctionDistribution(PropagatorFunctionDistribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propagator Scope Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propagator Scope Distribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropagatorScopeDistribution(PropagatorScopeDistribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ToUseTimeLineCalcSwitch
