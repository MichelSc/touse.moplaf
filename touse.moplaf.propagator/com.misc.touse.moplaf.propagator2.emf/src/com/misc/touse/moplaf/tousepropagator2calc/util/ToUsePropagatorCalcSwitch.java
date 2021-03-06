/**
 */
package com.misc.touse.moplaf.tousepropagator2calc.util;

import com.misc.common.moplaf.propagator2.PropagatorFunction;

import com.misc.common.moplaf.propagator2.PropagatorFunctionBindings;
import com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorFunction;
import com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorFunctionProject;
import com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorFunctionTask;
import com.misc.touse.moplaf.tousepropagator2calc.*;

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
 * @see com.misc.touse.moplaf.tousepropagator2calc.ToUsePropagatorCalcPackage
 * @generated
 */
public class ToUsePropagatorCalcSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ToUsePropagatorCalcPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUsePropagatorCalcSwitch() {
		if (modelPackage == null) {
			modelPackage = ToUsePropagatorCalcPackage.eINSTANCE;
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
			case ToUsePropagatorCalcPackage.SCOPE_PROJECT: {
				ScopeProject scopeProject = (ScopeProject)theEObject;
				T result = caseScopeProject(scopeProject);
				if (result == null) result = caseToUsePropagatorFunctionProject(scopeProject);
				if (result == null) result = caseToUsePropagatorFunction(scopeProject);
				if (result == null) result = casePropagatorFunctionBindings(scopeProject);
				if (result == null) result = casePropagatorFunction(scopeProject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToUsePropagatorCalcPackage.LAYER_TASK_HOURS_ITEM: {
				LayerTaskHoursItem layerTaskHoursItem = (LayerTaskHoursItem)theEObject;
				T result = caseLayerTaskHoursItem(layerTaskHoursItem);
				if (result == null) result = caseToUsePropagatorFunctionProject(layerTaskHoursItem);
				if (result == null) result = caseToUsePropagatorFunction(layerTaskHoursItem);
				if (result == null) result = casePropagatorFunctionBindings(layerTaskHoursItem);
				if (result == null) result = casePropagatorFunction(layerTaskHoursItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToUsePropagatorCalcPackage.LAYER_TASK_HOURS_VAR: {
				LayerTaskHoursVar layerTaskHoursVar = (LayerTaskHoursVar)theEObject;
				T result = caseLayerTaskHoursVar(layerTaskHoursVar);
				if (result == null) result = caseToUsePropagatorFunctionProject(layerTaskHoursVar);
				if (result == null) result = caseToUsePropagatorFunction(layerTaskHoursVar);
				if (result == null) result = casePropagatorFunctionBindings(layerTaskHoursVar);
				if (result == null) result = casePropagatorFunction(layerTaskHoursVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToUsePropagatorCalcPackage.LAYER_TASK_HOURS: {
				LayerTaskHours layerTaskHours = (LayerTaskHours)theEObject;
				T result = caseLayerTaskHours(layerTaskHours);
				if (result == null) result = caseToUsePropagatorFunctionProject(layerTaskHours);
				if (result == null) result = caseToUsePropagatorFunction(layerTaskHours);
				if (result == null) result = casePropagatorFunctionBindings(layerTaskHours);
				if (result == null) result = casePropagatorFunction(layerTaskHours);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToUsePropagatorCalcPackage.LAYER_TASK_TIMES: {
				LayerTaskTimes layerTaskTimes = (LayerTaskTimes)theEObject;
				T result = caseLayerTaskTimes(layerTaskTimes);
				if (result == null) result = caseToUsePropagatorFunctionProject(layerTaskTimes);
				if (result == null) result = caseToUsePropagatorFunction(layerTaskTimes);
				if (result == null) result = casePropagatorFunctionBindings(layerTaskTimes);
				if (result == null) result = casePropagatorFunction(layerTaskTimes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToUsePropagatorCalcPackage.LAYER_TASK_RESOURCES: {
				LayerTaskResources layerTaskResources = (LayerTaskResources)theEObject;
				T result = caseLayerTaskResources(layerTaskResources);
				if (result == null) result = caseToUsePropagatorFunctionProject(layerTaskResources);
				if (result == null) result = caseToUsePropagatorFunction(layerTaskResources);
				if (result == null) result = casePropagatorFunctionBindings(layerTaskResources);
				if (result == null) result = casePropagatorFunction(layerTaskResources);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToUsePropagatorCalcPackage.CALC_PROJECT_END: {
				CalcProjectEnd calcProjectEnd = (CalcProjectEnd)theEObject;
				T result = caseCalcProjectEnd(calcProjectEnd);
				if (result == null) result = caseToUsePropagatorFunctionProject(calcProjectEnd);
				if (result == null) result = caseToUsePropagatorFunction(calcProjectEnd);
				if (result == null) result = casePropagatorFunctionBindings(calcProjectEnd);
				if (result == null) result = casePropagatorFunction(calcProjectEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToUsePropagatorCalcPackage.CALC_TASK_HOURS_ITEM: {
				CalcTaskHoursItem calcTaskHoursItem = (CalcTaskHoursItem)theEObject;
				T result = caseCalcTaskHoursItem(calcTaskHoursItem);
				if (result == null) result = caseToUsePropagatorFunctionTask(calcTaskHoursItem);
				if (result == null) result = caseToUsePropagatorFunction(calcTaskHoursItem);
				if (result == null) result = casePropagatorFunctionBindings(calcTaskHoursItem);
				if (result == null) result = casePropagatorFunction(calcTaskHoursItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToUsePropagatorCalcPackage.CALC_TASK_HOURS_VAR: {
				CalcTaskHoursVar calcTaskHoursVar = (CalcTaskHoursVar)theEObject;
				T result = caseCalcTaskHoursVar(calcTaskHoursVar);
				if (result == null) result = caseToUsePropagatorFunctionTask(calcTaskHoursVar);
				if (result == null) result = caseToUsePropagatorFunction(calcTaskHoursVar);
				if (result == null) result = casePropagatorFunctionBindings(calcTaskHoursVar);
				if (result == null) result = casePropagatorFunction(calcTaskHoursVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToUsePropagatorCalcPackage.CALC_TASK_WITH_OVERHEAD_HOURS_VAR: {
				CalcTaskWithOverheadHoursVar calcTaskWithOverheadHoursVar = (CalcTaskWithOverheadHoursVar)theEObject;
				T result = caseCalcTaskWithOverheadHoursVar(calcTaskWithOverheadHoursVar);
				if (result == null) result = caseCalcTaskHoursVar(calcTaskWithOverheadHoursVar);
				if (result == null) result = caseToUsePropagatorFunctionTask(calcTaskWithOverheadHoursVar);
				if (result == null) result = caseToUsePropagatorFunction(calcTaskWithOverheadHoursVar);
				if (result == null) result = casePropagatorFunctionBindings(calcTaskWithOverheadHoursVar);
				if (result == null) result = casePropagatorFunction(calcTaskWithOverheadHoursVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToUsePropagatorCalcPackage.CALC_TASK_HOURS: {
				CalcTaskHours calcTaskHours = (CalcTaskHours)theEObject;
				T result = caseCalcTaskHours(calcTaskHours);
				if (result == null) result = caseToUsePropagatorFunctionTask(calcTaskHours);
				if (result == null) result = caseToUsePropagatorFunction(calcTaskHours);
				if (result == null) result = casePropagatorFunctionBindings(calcTaskHours);
				if (result == null) result = casePropagatorFunction(calcTaskHours);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToUsePropagatorCalcPackage.CALC_TASK_START: {
				CalcTaskStart calcTaskStart = (CalcTaskStart)theEObject;
				T result = caseCalcTaskStart(calcTaskStart);
				if (result == null) result = caseToUsePropagatorFunctionTask(calcTaskStart);
				if (result == null) result = caseToUsePropagatorFunction(calcTaskStart);
				if (result == null) result = casePropagatorFunctionBindings(calcTaskStart);
				if (result == null) result = casePropagatorFunction(calcTaskStart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToUsePropagatorCalcPackage.CALC_TASK_END: {
				CalcTaskEnd calcTaskEnd = (CalcTaskEnd)theEObject;
				T result = caseCalcTaskEnd(calcTaskEnd);
				if (result == null) result = caseToUsePropagatorFunctionTask(calcTaskEnd);
				if (result == null) result = caseToUsePropagatorFunction(calcTaskEnd);
				if (result == null) result = casePropagatorFunctionBindings(calcTaskEnd);
				if (result == null) result = casePropagatorFunction(calcTaskEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToUsePropagatorCalcPackage.CALC_TASK_RESOURCES: {
				CalcTaskResources calcTaskResources = (CalcTaskResources)theEObject;
				T result = caseCalcTaskResources(calcTaskResources);
				if (result == null) result = caseToUsePropagatorFunctionTask(calcTaskResources);
				if (result == null) result = caseToUsePropagatorFunction(calcTaskResources);
				if (result == null) result = casePropagatorFunctionBindings(calcTaskResources);
				if (result == null) result = casePropagatorFunction(calcTaskResources);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Calc Project End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Project End</em>'.
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
	 * Returns the result of interpreting the object as an instance of '<em>Calc Task Hours Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Task Hours Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcTaskHoursItem(CalcTaskHoursItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Task Hours Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Task Hours Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcTaskHoursVar(CalcTaskHoursVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Task With Overhead Hours Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Task With Overhead Hours Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcTaskWithOverheadHoursVar(CalcTaskWithOverheadHoursVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Task Hours</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Task Hours</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcTaskHours(CalcTaskHours object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Task Start</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Task Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcTaskStart(CalcTaskStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Task End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Task End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcTaskEnd(CalcTaskEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Task Resources</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Task Resources</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcTaskResources(CalcTaskResources object) {
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
	public T caseToUsePropagatorFunction(ToUsePropagatorFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToUsePropagatorFunctionProject(ToUsePropagatorFunctionProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToUsePropagatorFunctionTask(ToUsePropagatorFunctionTask object) {
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

} //ToUsePropagatorCalcSwitch
