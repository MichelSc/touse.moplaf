/**
 */
package com.misc.touse.moplaf.tousescheduler.util;

import com.misc.common.moplaf.localsearch.Action;
import com.misc.common.moplaf.localsearch.Score;
import com.misc.common.moplaf.localsearch.Solution;
import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;
import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.propagator2.PropagatorFunctionBindings;
import com.misc.common.moplaf.scheduler.Resource;
import com.misc.common.moplaf.scheduler.Schedule;
import com.misc.common.moplaf.scheduler.Scheduler;
import com.misc.common.moplaf.scheduler.Task;
import com.misc.touse.moplaf.tousescheduler.*;

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
 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage
 * @generated
 */
public class ToUseSchedulerSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ToUseSchedulerPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseSchedulerSwitch() {
		if (modelPackage == null) {
			modelPackage = ToUseSchedulerPackage.eINSTANCE;
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
			case ToUseSchedulerPackage.DOMAIN: {
				Domain domain = (Domain)theEObject;
				T result = caseDomain(domain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToUseSchedulerPackage.TO_USE_RESOURCE: {
				ToUseResource toUseResource = (ToUseResource)theEObject;
				T result = caseToUseResource(toUseResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToUseSchedulerPackage.TO_USE_TASK: {
				ToUseTask toUseTask = (ToUseTask)theEObject;
				T result = caseToUseTask(toUseTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToUseSchedulerPackage.TO_USE_SCHEDULER: {
				ToUseScheduler toUseScheduler = (ToUseScheduler)theEObject;
				T result = caseToUseScheduler(toUseScheduler);
				if (result == null) result = caseScheduler(toUseScheduler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToUseSchedulerPackage.TO_USE_SCHEDULE: {
				ToUseSchedule toUseSchedule = (ToUseSchedule)theEObject;
				T result = caseToUseSchedule(toUseSchedule);
				if (result == null) result = caseSchedule(toUseSchedule);
				if (result == null) result = caseSolution(toUseSchedule);
				if (result == null) result = caseObjectWithPropagatorFunctions(toUseSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToUseSchedulerPackage.TO_USE_SCORE: {
				ToUseScore toUseScore = (ToUseScore)theEObject;
				T result = caseToUseScore(toUseScore);
				if (result == null) result = caseScore(toUseScore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_RESOURCE: {
				ToUseScheduleResource toUseScheduleResource = (ToUseScheduleResource)theEObject;
				T result = caseToUseScheduleResource(toUseScheduleResource);
				if (result == null) result = caseResource(toUseScheduleResource);
				if (result == null) result = caseObjectWithPropagatorFunctions(toUseScheduleResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK: {
				ToUseScheduleTask toUseScheduleTask = (ToUseScheduleTask)theEObject;
				T result = caseToUseScheduleTask(toUseScheduleTask);
				if (result == null) result = caseTask(toUseScheduleTask);
				if (result == null) result = caseObjectWithPropagatorFunctions(toUseScheduleTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToUseSchedulerPackage.CALC_SCHEDULER: {
				CalcScheduler calcScheduler = (CalcScheduler)theEObject;
				T result = caseCalcScheduler(calcScheduler);
				if (result == null) result = casePropagatorFunctionBindings(calcScheduler);
				if (result == null) result = casePropagatorFunction(calcScheduler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToUseSchedulerPackage.CALC_SCHEDULE: {
				CalcSchedule calcSchedule = (CalcSchedule)theEObject;
				T result = caseCalcSchedule(calcSchedule);
				if (result == null) result = caseCalcScheduler(calcSchedule);
				if (result == null) result = casePropagatorFunctionBindings(calcSchedule);
				if (result == null) result = casePropagatorFunction(calcSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToUseSchedulerPackage.CALC_RESOURCE: {
				CalcResource calcResource = (CalcResource)theEObject;
				T result = caseCalcResource(calcResource);
				if (result == null) result = caseCalcScheduler(calcResource);
				if (result == null) result = casePropagatorFunctionBindings(calcResource);
				if (result == null) result = casePropagatorFunction(calcResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToUseSchedulerPackage.CALC_TASK: {
				CalcTask calcTask = (CalcTask)theEObject;
				T result = caseCalcTask(calcTask);
				if (result == null) result = caseCalcScheduler(calcTask);
				if (result == null) result = casePropagatorFunctionBindings(calcTask);
				if (result == null) result = casePropagatorFunction(calcTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToUseSchedulerPackage.SCOPE_SCHEDULE_SCORE: {
				ScopeScheduleScore scopeScheduleScore = (ScopeScheduleScore)theEObject;
				T result = caseScopeScheduleScore(scopeScheduleScore);
				if (result == null) result = caseCalcSchedule(scopeScheduleScore);
				if (result == null) result = caseCalcScheduler(scopeScheduleScore);
				if (result == null) result = casePropagatorFunctionBindings(scopeScheduleScore);
				if (result == null) result = casePropagatorFunction(scopeScheduleScore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToUseSchedulerPackage.LAYER_SCHEDULE_DISTANCE: {
				LayerScheduleDistance layerScheduleDistance = (LayerScheduleDistance)theEObject;
				T result = caseLayerScheduleDistance(layerScheduleDistance);
				if (result == null) result = caseCalcSchedule(layerScheduleDistance);
				if (result == null) result = caseCalcScheduler(layerScheduleDistance);
				if (result == null) result = casePropagatorFunctionBindings(layerScheduleDistance);
				if (result == null) result = casePropagatorFunction(layerScheduleDistance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToUseSchedulerPackage.CALC_TASK_DISTANCE: {
				CalcTaskDistance calcTaskDistance = (CalcTaskDistance)theEObject;
				T result = caseCalcTaskDistance(calcTaskDistance);
				if (result == null) result = caseCalcTask(calcTaskDistance);
				if (result == null) result = caseCalcScheduler(calcTaskDistance);
				if (result == null) result = casePropagatorFunctionBindings(calcTaskDistance);
				if (result == null) result = casePropagatorFunction(calcTaskDistance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToUseSchedulerPackage.CALC_RESOURCE_DISTANCE: {
				CalcResourceDistance calcResourceDistance = (CalcResourceDistance)theEObject;
				T result = caseCalcResourceDistance(calcResourceDistance);
				if (result == null) result = caseCalcResource(calcResourceDistance);
				if (result == null) result = caseCalcScheduler(calcResourceDistance);
				if (result == null) result = casePropagatorFunctionBindings(calcResourceDistance);
				if (result == null) result = casePropagatorFunction(calcResourceDistance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToUseSchedulerPackage.TO_USE_ACTION: {
				ToUseAction toUseAction = (ToUseAction)theEObject;
				T result = caseToUseAction(toUseAction);
				if (result == null) result = caseAction(toUseAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_LOAD_UNLOAD: {
				ToUseScheduleLoadUnload toUseScheduleLoadUnload = (ToUseScheduleLoadUnload)theEObject;
				T result = caseToUseScheduleLoadUnload(toUseScheduleLoadUnload);
				if (result == null) result = caseToUseAction(toUseScheduleLoadUnload);
				if (result == null) result = caseAction(toUseScheduleLoadUnload);
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
	 * Returns the result of interpreting the object as an instance of '<em>To Use Score</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To Use Score</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToUseScore(ToUseScore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To Use Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To Use Scheduler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToUseScheduler(ToUseScheduler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To Use Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To Use Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToUseTask(ToUseTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To Use Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To Use Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToUseResource(ToUseResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To Use Schedule Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To Use Schedule Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToUseScheduleTask(ToUseScheduleTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Scheduler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcScheduler(CalcScheduler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcSchedule(CalcSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcResource(CalcResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcTask(CalcTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To Use Schedule Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To Use Schedule Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToUseScheduleResource(ToUseScheduleResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scope Schedule Score</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scope Schedule Score</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScopeScheduleScore(ScopeScheduleScore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layer Schedule Distance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer Schedule Distance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayerScheduleDistance(LayerScheduleDistance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Task Distance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Task Distance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcTaskDistance(CalcTaskDistance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calc Resource Distance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calc Resource Distance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalcResourceDistance(CalcResourceDistance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To Use Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To Use Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToUseAction(ToUseAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To Use Schedule Load Unload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To Use Schedule Load Unload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToUseScheduleLoadUnload(ToUseScheduleLoadUnload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To Use Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To Use Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToUseSchedule(ToUseSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Score</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Score</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScore(Score object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheduler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScheduler(Scheduler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object With Propagator Functions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object With Propagator Functions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectWithPropagatorFunctions(ObjectWithPropagatorFunctions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolution(Solution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchedule(Schedule object) {
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

} //ToUseSchedulerSwitch