/**
 */
package com.misc.touse.moplaf.tousepropagator2calc.util;

import com.misc.common.moplaf.propagator2.PropagatorFunction;

import com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorFunction;
import com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorFunctionProject;
import com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorFunctionTask;
import com.misc.touse.moplaf.tousepropagator2calc.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.touse.moplaf.tousepropagator2calc.ToUsePropagatorCalcPackage
 * @generated
 */
public class ToUsePropagatorCalcAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ToUsePropagatorCalcPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUsePropagatorCalcAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ToUsePropagatorCalcPackage.eINSTANCE;
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
	protected ToUsePropagatorCalcSwitch<Adapter> modelSwitch =
		new ToUsePropagatorCalcSwitch<Adapter>() {
			@Override
			public Adapter caseScopeProject(ScopeProject object) {
				return createScopeProjectAdapter();
			}
			@Override
			public Adapter caseLayerTaskHoursItem(LayerTaskHoursItem object) {
				return createLayerTaskHoursItemAdapter();
			}
			@Override
			public Adapter caseLayerTaskHoursVar(LayerTaskHoursVar object) {
				return createLayerTaskHoursVarAdapter();
			}
			@Override
			public Adapter caseLayerTaskHours(LayerTaskHours object) {
				return createLayerTaskHoursAdapter();
			}
			@Override
			public Adapter caseLayerTaskTimes(LayerTaskTimes object) {
				return createLayerTaskTimesAdapter();
			}
			@Override
			public Adapter caseLayerTaskResources(LayerTaskResources object) {
				return createLayerTaskResourcesAdapter();
			}
			@Override
			public Adapter caseCalcProjectEnd(CalcProjectEnd object) {
				return createCalcProjectEndAdapter();
			}
			@Override
			public Adapter caseCalcTaskHoursItem(CalcTaskHoursItem object) {
				return createCalcTaskHoursItemAdapter();
			}
			@Override
			public Adapter caseCalcTaskHoursVar(CalcTaskHoursVar object) {
				return createCalcTaskHoursVarAdapter();
			}
			@Override
			public Adapter caseCalcTaskHours(CalcTaskHours object) {
				return createCalcTaskHoursAdapter();
			}
			@Override
			public Adapter caseCalcTaskStart(CalcTaskStart object) {
				return createCalcTaskStartAdapter();
			}
			@Override
			public Adapter caseCalcTaskEnd(CalcTaskEnd object) {
				return createCalcTaskEndAdapter();
			}
			@Override
			public Adapter caseCalcTaskResources(CalcTaskResources object) {
				return createCalcTaskResourcesAdapter();
			}
			@Override
			public Adapter casePropagatorFunction(PropagatorFunction object) {
				return createPropagatorFunctionAdapter();
			}
			@Override
			public Adapter caseToUsePropagatorFunction(ToUsePropagatorFunction object) {
				return createToUsePropagatorFunctionAdapter();
			}
			@Override
			public Adapter caseToUsePropagatorFunctionProject(ToUsePropagatorFunctionProject object) {
				return createToUsePropagatorFunctionProjectAdapter();
			}
			@Override
			public Adapter caseToUsePropagatorFunctionTask(ToUsePropagatorFunctionTask object) {
				return createToUsePropagatorFunctionTaskAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousepropagator2calc.ScopeProject <em>Scope Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.ScopeProject
	 * @generated
	 */
	public Adapter createScopeProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHoursItem <em>Layer Task Hours Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHoursItem
	 * @generated
	 */
	public Adapter createLayerTaskHoursItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHoursVar <em>Layer Task Hours Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHoursVar
	 * @generated
	 */
	public Adapter createLayerTaskHoursVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHours <em>Layer Task Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHours
	 * @generated
	 */
	public Adapter createLayerTaskHoursAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousepropagator2calc.LayerTaskTimes <em>Layer Task Times</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.LayerTaskTimes
	 * @generated
	 */
	public Adapter createLayerTaskTimesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousepropagator2calc.CalcProjectEnd <em>Calc Project End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.CalcProjectEnd
	 * @generated
	 */
	public Adapter createCalcProjectEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousepropagator2calc.LayerTaskResources <em>Layer Task Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.LayerTaskResources
	 * @generated
	 */
	public Adapter createLayerTaskResourcesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousepropagator2calc.CalcTaskHoursItem <em>Calc Task Hours Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.CalcTaskHoursItem
	 * @generated
	 */
	public Adapter createCalcTaskHoursItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousepropagator2calc.CalcTaskHoursVar <em>Calc Task Hours Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.CalcTaskHoursVar
	 * @generated
	 */
	public Adapter createCalcTaskHoursVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousepropagator2calc.CalcTaskHours <em>Calc Task Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.CalcTaskHours
	 * @generated
	 */
	public Adapter createCalcTaskHoursAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousepropagator2calc.CalcTaskStart <em>Calc Task Start</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.CalcTaskStart
	 * @generated
	 */
	public Adapter createCalcTaskStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousepropagator2calc.CalcTaskEnd <em>Calc Task End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.CalcTaskEnd
	 * @generated
	 */
	public Adapter createCalcTaskEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousepropagator2calc.CalcTaskResources <em>Calc Task Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.CalcTaskResources
	 * @generated
	 */
	public Adapter createCalcTaskResourcesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorFunction
	 * @generated
	 */
	public Adapter createToUsePropagatorFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorFunctionProject <em>Function Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorFunctionProject
	 * @generated
	 */
	public Adapter createToUsePropagatorFunctionProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorFunctionTask <em>Function Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorFunctionTask
	 * @generated
	 */
	public Adapter createToUsePropagatorFunctionTaskAdapter() {
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

} //ToUsePropagatorCalcAdapterFactory
