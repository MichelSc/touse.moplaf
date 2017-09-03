/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline.calc.util;

import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.propagator2.PropagatorFunctionBindings;

import com.misc.common.moplaf.time.continuous.PropagatorFunctionDistribution;

import com.misc.common.moplaf.time.continuous.PropagatorFunctionDistributionAbstract;
import com.misc.common.moplaf.time.continuous.calc.PropagatorScopeDistribution;

import com.misc.touse.moplaf.timeline.tousetimeline.calc.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.ToUseTimeLineCalcPackage
 * @generated
 */
public class ToUseTimeLineCalcAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ToUseTimeLineCalcPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseTimeLineCalcAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ToUseTimeLineCalcPackage.eINSTANCE;
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
	protected ToUseTimeLineCalcSwitch<Adapter> modelSwitch =
		new ToUseTimeLineCalcSwitch<Adapter>() {
			@Override
			public Adapter casePropagatorScopeDomain(PropagatorScopeDomain object) {
				return createPropagatorScopeDomainAdapter();
			}
			@Override
			public Adapter casePropagatorScopeDomainDistribution(PropagatorScopeDomainDistribution object) {
				return createPropagatorScopeDomainDistributionAdapter();
			}
			@Override
			public Adapter casePropagatorLayerDomainDistributionFunctions(PropagatorLayerDomainDistributionFunctions object) {
				return createPropagatorLayerDomainDistributionFunctionsAdapter();
			}
			@Override
			public Adapter casePropagatorCalcDomainDistributionFunctionInterval(PropagatorCalcDomainDistributionFunctionInterval object) {
				return createPropagatorCalcDomainDistributionFunctionIntervalAdapter();
			}
			@Override
			public Adapter casePropagatorCalcDomainDistributionFunctionPossible(PropagatorCalcDomainDistributionFunctionPossible object) {
				return createPropagatorCalcDomainDistributionFunctionPossibleAdapter();
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
			public Adapter casePropagatorFunctionDistributionAbstract(PropagatorFunctionDistributionAbstract object) {
				return createPropagatorFunctionDistributionAbstractAdapter();
			}
			@Override
			public Adapter casePropagatorFunctionDistribution(PropagatorFunctionDistribution object) {
				return createPropagatorFunctionDistributionAdapter();
			}
			@Override
			public Adapter casePropagatorScopeDistribution(PropagatorScopeDistribution object) {
				return createPropagatorScopeDistributionAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.timeline.tousetimeline.calc.PropagatorScopeDomain <em>Propagator Scope Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.PropagatorScopeDomain
	 * @generated
	 */
	public Adapter createPropagatorScopeDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.timeline.tousetimeline.calc.PropagatorScopeDomainDistribution <em>Propagator Scope Domain Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.PropagatorScopeDomainDistribution
	 * @generated
	 */
	public Adapter createPropagatorScopeDomainDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.timeline.tousetimeline.calc.PropagatorLayerDomainDistributionFunctions <em>Propagator Layer Domain Distribution Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.PropagatorLayerDomainDistributionFunctions
	 * @generated
	 */
	public Adapter createPropagatorLayerDomainDistributionFunctionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.timeline.tousetimeline.calc.PropagatorCalcDomainDistributionFunctionInterval <em>Propagator Calc Domain Distribution Function Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.PropagatorCalcDomainDistributionFunctionInterval
	 * @generated
	 */
	public Adapter createPropagatorCalcDomainDistributionFunctionIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.timeline.tousetimeline.calc.PropagatorCalcDomainDistributionFunctionPossible <em>Propagator Calc Domain Distribution Function Possible</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.PropagatorCalcDomainDistributionFunctionPossible
	 * @generated
	 */
	public Adapter createPropagatorCalcDomainDistributionFunctionPossibleAdapter() {
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
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.PropagatorFunctionDistributionAbstract <em>Propagator Function Distribution Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.PropagatorFunctionDistributionAbstract
	 * @generated
	 */
	public Adapter createPropagatorFunctionDistributionAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.PropagatorFunctionDistribution <em>Propagator Function Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.PropagatorFunctionDistribution
	 * @generated
	 */
	public Adapter createPropagatorFunctionDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.PropagatorScopeDistribution <em>Propagator Scope Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.PropagatorScopeDistribution
	 * @generated
	 */
	public Adapter createPropagatorScopeDistributionAdapter() {
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

} //ToUseTimeLineCalcAdapterFactory
