/**
 */
package com.misc.touse.moplaf.tousepropagator2.calc.util;

import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.touse.moplaf.tousepropagator2.calc.*;

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
 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcPackage
 * @generated
 */
public class CalcSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CalcPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcSwitch() {
		if (modelPackage == null) {
			modelPackage = CalcPackage.eINSTANCE;
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
			case CalcPackage.SCOPE_PROJECT: {
				ScopeProject scopeProject = (ScopeProject)theEObject;
				T result = caseScopeProject(scopeProject);
				if (result == null) result = caseToUsePropagatorFunction(scopeProject);
				if (result == null) result = casePropagatorFunction(scopeProject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CalcPackage.LAYER_TASK_HOURS_ITEM: {
				LayerTaskHoursItem layerTaskHoursItem = (LayerTaskHoursItem)theEObject;
				T result = caseLayerTaskHoursItem(layerTaskHoursItem);
				if (result == null) result = caseToUsePropagatorFunction(layerTaskHoursItem);
				if (result == null) result = casePropagatorFunction(layerTaskHoursItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CalcPackage.LAYER_TASK_HOURS_VAR: {
				LayerTaskHoursVar layerTaskHoursVar = (LayerTaskHoursVar)theEObject;
				T result = caseLayerTaskHoursVar(layerTaskHoursVar);
				if (result == null) result = caseToUsePropagatorFunction(layerTaskHoursVar);
				if (result == null) result = casePropagatorFunction(layerTaskHoursVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CalcPackage.LAYER_TASK_HOURS: {
				LayerTaskHours layerTaskHours = (LayerTaskHours)theEObject;
				T result = caseLayerTaskHours(layerTaskHours);
				if (result == null) result = caseToUsePropagatorFunction(layerTaskHours);
				if (result == null) result = casePropagatorFunction(layerTaskHours);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CalcPackage.LAYER_TASK_TIMES: {
				LayerTaskTimes layerTaskTimes = (LayerTaskTimes)theEObject;
				T result = caseLayerTaskTimes(layerTaskTimes);
				if (result == null) result = caseToUsePropagatorFunction(layerTaskTimes);
				if (result == null) result = casePropagatorFunction(layerTaskTimes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CalcPackage.CALC_PROJECT_END: {
				CalcProjectEnd calcProjectEnd = (CalcProjectEnd)theEObject;
				T result = caseCalcProjectEnd(calcProjectEnd);
				if (result == null) result = caseToUsePropagatorFunction(calcProjectEnd);
				if (result == null) result = casePropagatorFunction(calcProjectEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CalcPackage.LAYER_TASK_RESOURCES: {
				LayerTaskResources layerTaskResources = (LayerTaskResources)theEObject;
				T result = caseLayerTaskResources(layerTaskResources);
				if (result == null) result = caseToUsePropagatorFunction(layerTaskResources);
				if (result == null) result = casePropagatorFunction(layerTaskResources);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CalcPackage.CALC_TASK_HOURS_ITEM: {
				CalcTaskHoursItem calcTaskHoursItem = (CalcTaskHoursItem)theEObject;
				T result = caseCalcTaskHoursItem(calcTaskHoursItem);
				if (result == null) result = caseToUsePropagatorFunction(calcTaskHoursItem);
				if (result == null) result = casePropagatorFunction(calcTaskHoursItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CalcPackage.CALC_TASK_HOURS_VAR: {
				CalcTaskHoursVar calcTaskHoursVar = (CalcTaskHoursVar)theEObject;
				T result = caseCalcTaskHoursVar(calcTaskHoursVar);
				if (result == null) result = caseToUsePropagatorFunction(calcTaskHoursVar);
				if (result == null) result = casePropagatorFunction(calcTaskHoursVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CalcPackage.CALC_TASK_HOURS: {
				CalcTaskHours calcTaskHours = (CalcTaskHours)theEObject;
				T result = caseCalcTaskHours(calcTaskHours);
				if (result == null) result = caseToUsePropagatorFunction(calcTaskHours);
				if (result == null) result = casePropagatorFunction(calcTaskHours);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CalcPackage.CALC_TASK_START: {
				CalcTaskStart calcTaskStart = (CalcTaskStart)theEObject;
				T result = caseCalcTaskStart(calcTaskStart);
				if (result == null) result = caseToUsePropagatorFunction(calcTaskStart);
				if (result == null) result = casePropagatorFunction(calcTaskStart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CalcPackage.CALC_TASK_END: {
				CalcTaskEnd calcTaskEnd = (CalcTaskEnd)theEObject;
				T result = caseCalcTaskEnd(calcTaskEnd);
				if (result == null) result = caseToUsePropagatorFunction(calcTaskEnd);
				if (result == null) result = casePropagatorFunction(calcTaskEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CalcPackage.CALC_TASK_RESOURCES: {
				CalcTaskResources calcTaskResources = (CalcTaskResources)theEObject;
				T result = caseCalcTaskResources(calcTaskResources);
				if (result == null) result = caseToUsePropagatorFunction(calcTaskResources);
				if (result == null) result = casePropagatorFunction(calcTaskResources);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CalcPackage.TO_USE_PROPAGATOR_FUNCTION: {
				ToUsePropagatorFunction toUsePropagatorFunction = (ToUsePropagatorFunction)theEObject;
				T result = caseToUsePropagatorFunction(toUsePropagatorFunction);
				if (result == null) result = casePropagatorFunction(toUsePropagatorFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Start</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcTaskStart(CalcTaskStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcTaskEnd(CalcTaskEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Resources</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Resources</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcTaskResources(CalcTaskResources object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcProjectEnd(CalcProjectEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layer Task Resources</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer Task Resources</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayerTaskResources(LayerTaskResources object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To Use Propagator Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To Use Propagator Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToUsePropagatorFunction(ToUsePropagatorFunction object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Layer Task Times</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer Task Times</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayerTaskTimes(LayerTaskTimes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Hours Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Hours Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcTaskHoursItem(CalcTaskHoursItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Hours Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Hours Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcTaskHoursVar(CalcTaskHoursVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Hours</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Hours</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcTaskHours(CalcTaskHours object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scope Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scope Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScopeProject(ScopeProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layer Task Hours Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer Task Hours Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayerTaskHoursItem(LayerTaskHoursItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layer Task Hours Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer Task Hours Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayerTaskHoursVar(LayerTaskHoursVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layer Task Hours</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer Task Hours</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayerTaskHours(LayerTaskHours object) {
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

} //CalcSwitch
