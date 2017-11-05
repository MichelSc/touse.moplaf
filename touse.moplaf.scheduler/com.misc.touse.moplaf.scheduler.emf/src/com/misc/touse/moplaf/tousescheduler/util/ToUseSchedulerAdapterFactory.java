/**
 */
package com.misc.touse.moplaf.tousescheduler.util;

import com.misc.common.moplaf.job.Run;
import com.misc.common.moplaf.job.RunParams;
import com.misc.common.moplaf.localsearch.Action;
import com.misc.common.moplaf.localsearch.Improvment;
import com.misc.common.moplaf.localsearch.Score;
import com.misc.common.moplaf.localsearch.Solution;
import com.misc.common.moplaf.localsearch.Strategy;
import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;
import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.propagator2.PropagatorFunctionBindings;
import com.misc.common.moplaf.scheduler.Resource;
import com.misc.common.moplaf.scheduler.Schedule;
import com.misc.common.moplaf.scheduler.Scheduler;
import com.misc.common.moplaf.scheduler.Task;
import com.misc.touse.moplaf.tousescheduler.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage
 * @generated
 */
public class ToUseSchedulerAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ToUseSchedulerPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseSchedulerAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ToUseSchedulerPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUseSchedulerSwitch<Adapter> modelSwitch =
		new ToUseSchedulerSwitch<Adapter>() {
			@Override
			public Adapter caseDomain(Domain object) {
				return createDomainAdapter();
			}
			@Override
			public Adapter caseVehicle(Vehicle object) {
				return createVehicleAdapter();
			}
			@Override
			public Adapter caseShipment(Shipment object) {
				return createShipmentAdapter();
			}
			@Override
			public Adapter caseToUseScheduler(ToUseScheduler object) {
				return createToUseSchedulerAdapter();
			}
			@Override
			public Adapter caseToUseSchedule(ToUseSchedule object) {
				return createToUseScheduleAdapter();
			}
			@Override
			public Adapter caseToUseScore(ToUseScore object) {
				return createToUseScoreAdapter();
			}
			@Override
			public Adapter caseToUseScheduleResource(ToUseScheduleResource object) {
				return createToUseScheduleResourceAdapter();
			}
			@Override
			public Adapter caseToUseScheduleTask(ToUseScheduleTask object) {
				return createToUseScheduleTaskAdapter();
			}
			@Override
			public Adapter caseToUseLoadShipment(ToUseLoadShipment object) {
				return createToUseLoadShipmentAdapter();
			}
			@Override
			public Adapter caseToUseUnloadShipment(ToUseUnloadShipment object) {
				return createToUseUnloadShipmentAdapter();
			}
			@Override
			public Adapter caseToUseActionLoadUnload(ToUseActionLoadUnload object) {
				return createToUseActionLoadUnloadAdapter();
			}
			@Override
			public Adapter caseToUseScheduleLoadUnload(ToUseScheduleLoadUnload object) {
				return createToUseScheduleLoadUnloadAdapter();
			}
			@Override
			public Adapter caseToUseUnscheduleLoadUnload(ToUseUnscheduleLoadUnload object) {
				return createToUseUnscheduleLoadUnloadAdapter();
			}
			@Override
			public Adapter caseCalcScheduler(CalcScheduler object) {
				return createCalcSchedulerAdapter();
			}
			@Override
			public Adapter caseCalcSchedule(CalcSchedule object) {
				return createCalcScheduleAdapter();
			}
			@Override
			public Adapter caseCalcResource(CalcResource object) {
				return createCalcResourceAdapter();
			}
			@Override
			public Adapter caseCalcTask(CalcTask object) {
				return createCalcTaskAdapter();
			}
			@Override
			public Adapter caseScopeScheduleScore(ScopeScheduleScore object) {
				return createScopeScheduleScoreAdapter();
			}
			@Override
			public Adapter caseLayerScheduleDistance(LayerScheduleDistance object) {
				return createLayerScheduleDistanceAdapter();
			}
			@Override
			public Adapter caseCalcTaskDistanceFromPrevious(CalcTaskDistanceFromPrevious object) {
				return createCalcTaskDistanceFromPreviousAdapter();
			}
			@Override
			public Adapter caseCalcTaskDistance(CalcTaskDistance object) {
				return createCalcTaskDistanceAdapter();
			}
			@Override
			public Adapter caseCalcResourceDistanceFromLast(CalcResourceDistanceFromLast object) {
				return createCalcResourceDistanceFromLastAdapter();
			}
			@Override
			public Adapter caseCalcResourceDistance(CalcResourceDistance object) {
				return createCalcResourceDistanceAdapter();
			}
			@Override
			public Adapter caseLayerScheduleVolumeLoaded(LayerScheduleVolumeLoaded object) {
				return createLayerScheduleVolumeLoadedAdapter();
			}
			@Override
			public Adapter caseCalcTaskStartVolumeLoaded(CalcTaskStartVolumeLoaded object) {
				return createCalcTaskStartVolumeLoadedAdapter();
			}
			@Override
			public Adapter caseCalcTaskEndVolumeLoaded(CalcTaskEndVolumeLoaded object) {
				return createCalcTaskEndVolumeLoadedAdapter();
			}
			@Override
			public Adapter caseCalcResourceVolumeOverload(CalcResourceVolumeOverload object) {
				return createCalcResourceVolumeOverloadAdapter();
			}
			@Override
			public Adapter caseLayerSchedulePlannedBenefit(LayerSchedulePlannedBenefit object) {
				return createLayerSchedulePlannedBenefitAdapter();
			}
			@Override
			public Adapter caseCalcResourcePlannedBenefit(CalcResourcePlannedBenefit object) {
				return createCalcResourcePlannedBenefitAdapter();
			}
			@Override
			public Adapter caseToUseImprovmentDestructConstruct(ToUseImprovmentDestructConstruct object) {
				return createToUseImprovmentDestructConstructAdapter();
			}
			@Override
			public Adapter caseRunParams(RunParams object) {
				return createRunParamsAdapter();
			}
			@Override
			public Adapter caseRun(Run object) {
				return createRunAdapter();
			}
			@Override
			public Adapter caseStrategy(Strategy object) {
				return createStrategyAdapter();
			}
			@Override
			public Adapter caseScheduler(Scheduler object) {
				return createSchedulerAdapter();
			}
			@Override
			public Adapter caseObjectWithPropagatorFunctions(ObjectWithPropagatorFunctions object) {
				return createObjectWithPropagatorFunctionsAdapter();
			}
			@Override
			public Adapter caseSolution(Solution object) {
				return createSolutionAdapter();
			}
			@Override
			public Adapter caseSchedule(Schedule object) {
				return createScheduleAdapter();
			}
			@Override
			public Adapter caseScore(Score object) {
				return createScoreAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter casePropagatorFunction(PropagatorFunction object) {
				return createPropagatorFunctionAdapter();
			}
			@Override
			public Adapter casePropagatorFunctionBindings(PropagatorFunctionBindings object) {
				return createPropagatorFunctionBindingsAdapter();
			}
			@Override
			public Adapter caseImprovment(Improvment object) {
				return createImprovmentAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousescheduler.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousescheduler.Domain
	 * @generated
	 */
	public Adapter createDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousescheduler.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousescheduler.Vehicle
	 * @generated
	 */
	public Adapter createVehicleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousescheduler.ToUseScore <em>To Use Score</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseScore
	 * @generated
	 */
	public Adapter createToUseScoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduler <em>To Use Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseScheduler
	 * @generated
	 */
	public Adapter createToUseSchedulerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousescheduler.Shipment <em>Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousescheduler.Shipment
	 * @generated
	 */
	public Adapter createShipmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask <em>To Use Schedule Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask
	 * @generated
	 */
	public Adapter createToUseScheduleTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousescheduler.CalcScheduler <em>Calc Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousescheduler.CalcScheduler
	 * @generated
	 */
	public Adapter createCalcSchedulerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousescheduler.CalcSchedule <em>Calc Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousescheduler.CalcSchedule
	 * @generated
	 */
	public Adapter createCalcScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousescheduler.CalcResource <em>Calc Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousescheduler.CalcResource
	 * @generated
	 */
	public Adapter createCalcResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousescheduler.CalcTask <em>Calc Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousescheduler.CalcTask
	 * @generated
	 */
	public Adapter createCalcTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource <em>To Use Schedule Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource
	 * @generated
	 */
	public Adapter createToUseScheduleResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousescheduler.ScopeScheduleScore <em>Scope Schedule Score</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousescheduler.ScopeScheduleScore
	 * @generated
	 */
	public Adapter createScopeScheduleScoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousescheduler.LayerScheduleDistance <em>Layer Schedule Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousescheduler.LayerScheduleDistance
	 * @generated
	 */
	public Adapter createLayerScheduleDistanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousescheduler.CalcTaskDistanceFromPrevious <em>Calc Task Distance From Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousescheduler.CalcTaskDistanceFromPrevious
	 * @generated
	 */
	public Adapter createCalcTaskDistanceFromPreviousAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousescheduler.CalcTaskDistance <em>Calc Task Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousescheduler.CalcTaskDistance
	 * @generated
	 */
	public Adapter createCalcTaskDistanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousescheduler.CalcResourceDistanceFromLast <em>Calc Resource Distance From Last</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousescheduler.CalcResourceDistanceFromLast
	 * @generated
	 */
	public Adapter createCalcResourceDistanceFromLastAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousescheduler.CalcResourceDistance <em>Calc Resource Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousescheduler.CalcResourceDistance
	 * @generated
	 */
	public Adapter createCalcResourceDistanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousescheduler.LayerScheduleVolumeLoaded <em>Layer Schedule Volume Loaded</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousescheduler.LayerScheduleVolumeLoaded
	 * @generated
	 */
	public Adapter createLayerScheduleVolumeLoadedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousescheduler.CalcResourceVolumeOverload <em>Calc Resource Volume Overload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousescheduler.CalcResourceVolumeOverload
	 * @generated
	 */
	public Adapter createCalcResourceVolumeOverloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousescheduler.LayerSchedulePlannedBenefit <em>Layer Schedule Planned Benefit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousescheduler.LayerSchedulePlannedBenefit
	 * @generated
	 */
	public Adapter createLayerSchedulePlannedBenefitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousescheduler.CalcResourcePlannedBenefit <em>Calc Resource Planned Benefit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousescheduler.CalcResourcePlannedBenefit
	 * @generated
	 */
	public Adapter createCalcResourcePlannedBenefitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousescheduler.ToUseImprovmentDestructConstruct <em>To Use Improvment Destruct Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseImprovmentDestructConstruct
	 * @generated
	 */
	public Adapter createToUseImprovmentDestructConstructAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.job.RunParams <em>Run Params</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.job.RunParams
	 * @generated
	 */
	public Adapter createRunParamsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.job.Run <em>Run</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.job.Run
	 * @generated
	 */
	public Adapter createRunAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousescheduler.CalcTaskStartVolumeLoaded <em>Calc Task Start Volume Loaded</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousescheduler.CalcTaskStartVolumeLoaded
	 * @generated
	 */
	public Adapter createCalcTaskStartVolumeLoadedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousescheduler.CalcTaskEndVolumeLoaded <em>Calc Task End Volume Loaded</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousescheduler.CalcTaskEndVolumeLoaded
	 * @generated
	 */
	public Adapter createCalcTaskEndVolumeLoadedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousescheduler.ToUseUnscheduleLoadUnload <em>To Use Unschedule Load Unload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseUnscheduleLoadUnload
	 * @generated
	 */
	public Adapter createToUseUnscheduleLoadUnloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.localsearch.Strategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.localsearch.Strategy
	 * @generated
	 */
	public Adapter createStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleLoadUnload <em>To Use Schedule Load Unload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseScheduleLoadUnload
	 * @generated
	 */
	public Adapter createToUseScheduleLoadUnloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousescheduler.ToUseLoadShipment <em>To Use Load Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseLoadShipment
	 * @generated
	 */
	public Adapter createToUseLoadShipmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousescheduler.ToUseUnloadShipment <em>To Use Unload Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseUnloadShipment
	 * @generated
	 */
	public Adapter createToUseUnloadShipmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousescheduler.ToUseActionLoadUnload <em>To Use Action Load Unload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseActionLoadUnload
	 * @generated
	 */
	public Adapter createToUseActionLoadUnloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousescheduler.ToUseSchedule <em>To Use Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedule
	 * @generated
	 */
	public Adapter createToUseScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.localsearch.Score <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.localsearch.Score
	 * @generated
	 */
	public Adapter createScoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.scheduler.Scheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.scheduler.Scheduler
	 * @generated
	 */
	public Adapter createSchedulerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions <em>Object With Propagator Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions
	 * @generated
	 */
	public Adapter createObjectWithPropagatorFunctionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.scheduler.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.scheduler.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.scheduler.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.scheduler.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.propagator2.PropagatorFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.propagator2.PropagatorFunction
	 * @generated
	 */
	public Adapter createPropagatorFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.propagator2.PropagatorFunctionBindings <em>Function Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.propagator2.PropagatorFunctionBindings
	 * @generated
	 */
	public Adapter createPropagatorFunctionBindingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.localsearch.Improvment <em>Improvment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.localsearch.Improvment
	 * @generated
	 */
	public Adapter createImprovmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.localsearch.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.localsearch.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.localsearch.Solution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.localsearch.Solution
	 * @generated
	 */
	public Adapter createSolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.scheduler.Schedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.scheduler.Schedule
	 * @generated
	 */
	public Adapter createScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ToUseSchedulerAdapterFactory
