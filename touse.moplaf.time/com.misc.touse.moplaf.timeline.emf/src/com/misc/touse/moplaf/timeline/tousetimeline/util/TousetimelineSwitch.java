/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline.util;

import com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapterScope;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.touse.moplaf.timeline.tousetimeline.*;

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
 * @see com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage
 * @generated
 */
public class TousetimelineSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TousetimelinePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TousetimelineSwitch() {
		if (modelPackage == null) {
			modelPackage = TousetimelinePackage.eINSTANCE;
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
			case TousetimelinePackage.DOMAIN: {
				Domain domain = (Domain)theEObject;
				T result = caseDomain(domain);
				if (result == null) result = caseObjectWithPropagatorFunctionAdapterScope(domain);
				if (result == null) result = caseObjectWithPropagatorFunctionAdapter(domain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TousetimelinePackage.DOMAIN_DISTRIBUTION: {
				DomainDistribution domainDistribution = (DomainDistribution)theEObject;
				T result = caseDomainDistribution(domainDistribution);
				if (result == null) result = caseDistribution(domainDistribution);
				if (result == null) result = caseObjectWithPropagatorFunctionAdapter(domainDistribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TousetimelinePackage.FUNCTION_MINIMUM: {
				FunctionMinimum functionMinimum = (FunctionMinimum)theEObject;
				T result = caseFunctionMinimum(functionMinimum);
				if (result == null) result = caseFunctionInterval(functionMinimum);
				if (result == null) result = caseObjectWithPropagatorFunctionAdapter(functionMinimum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TousetimelinePackage.FUNCTION_INTERVAL: {
				FunctionInterval functionInterval = (FunctionInterval)theEObject;
				T result = caseFunctionInterval(functionInterval);
				if (result == null) result = caseObjectWithPropagatorFunctionAdapter(functionInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TousetimelinePackage.FUNCTION_CUMULATED: {
				FunctionCumulated functionCumulated = (FunctionCumulated)theEObject;
				T result = caseFunctionCumulated(functionCumulated);
				if (result == null) result = caseFunctionInterval(functionCumulated);
				if (result == null) result = caseObjectWithPropagatorFunctionAdapter(functionCumulated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TousetimelinePackage.FUNCTION_AVERAGE: {
				FunctionAverage functionAverage = (FunctionAverage)theEObject;
				T result = caseFunctionAverage(functionAverage);
				if (result == null) result = caseFunctionInterval(functionAverage);
				if (result == null) result = caseObjectWithPropagatorFunctionAdapter(functionAverage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TousetimelinePackage.FUNCTION_POSSIBLE: {
				FunctionPossible functionPossible = (FunctionPossible)theEObject;
				T result = caseFunctionPossible(functionPossible);
				if (result == null) result = caseObjectWithPropagatorFunctionAdapter(functionPossible);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TousetimelinePackage.FUNCTION_EARLIEST_BELOW: {
				FunctionEarliestBelow functionEarliestBelow = (FunctionEarliestBelow)theEObject;
				T result = caseFunctionEarliestBelow(functionEarliestBelow);
				if (result == null) result = caseFunctionPossible(functionEarliestBelow);
				if (result == null) result = caseObjectWithPropagatorFunctionAdapter(functionEarliestBelow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TousetimelinePackage.FUNCTION_EARLIEST_OUTPUT: {
				FunctionEarliestOutput functionEarliestOutput = (FunctionEarliestOutput)theEObject;
				T result = caseFunctionEarliestOutput(functionEarliestOutput);
				if (result == null) result = caseFunctionPossible(functionEarliestOutput);
				if (result == null) result = caseObjectWithPropagatorFunctionAdapter(functionEarliestOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomain(Domain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Distribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainDistribution(DomainDistribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Minimum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Minimum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionMinimum(FunctionMinimum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionInterval(FunctionInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Cumulated</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Cumulated</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionCumulated(FunctionCumulated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Average</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Average</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionAverage(FunctionAverage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Possible</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Possible</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionPossible(FunctionPossible object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Earliest Below</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Earliest Below</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionEarliestBelow(FunctionEarliestBelow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Earliest Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Earliest Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionEarliestOutput(FunctionEarliestOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object With Propagator Function Adapter Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object With Propagator Function Adapter Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectWithPropagatorFunctionAdapterScope(ObjectWithPropagatorFunctionAdapterScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object With Propagator Function Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object With Propagator Function Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectWithPropagatorFunctionAdapter(ObjectWithPropagatorFunctionAdapter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistribution(Distribution object) {
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

} //TousetimelineSwitch
