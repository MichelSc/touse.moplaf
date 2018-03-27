/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline.calc.util;

import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.propagator2.PropagatorFunctionBindings;

import com.misc.common.moplaf.time.continuous.PropagatorFunctionDistribution;

import com.misc.common.moplaf.time.continuous.PropagatorFunctionDistributionAbstract;
import com.misc.common.moplaf.time.continuous.calc.ScopeDistribution;
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
			public Adapter caseScopeDomain(ScopeDomain object) {
				return createScopeDomainAdapter();
			}
			@Override
			public Adapter caseScopeDomainDistribution(ScopeDomainDistribution object) {
				return createScopeDomainDistributionAdapter();
			}
			@Override
			public Adapter caseLayerDomainDistributionFunctions(LayerDomainDistributionFunctions object) {
				return createLayerDomainDistributionFunctionsAdapter();
			}
			@Override
			public Adapter caseCalcDomainDistributionFunctionInterval(CalcDomainDistributionFunctionInterval object) {
				return createCalcDomainDistributionFunctionIntervalAdapter();
			}
			@Override
			public Adapter caseCalcDomainDistributionFunctionPossible(CalcDomainDistributionFunctionPossible object) {
				return createCalcDomainDistributionFunctionPossibleAdapter();
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
			public Adapter caseScopeDistribution(ScopeDistribution object) {
				return createScopeDistributionAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.timeline.tousetimeline.calc.ScopeDomain <em>Scope Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.ScopeDomain
	 * @generated
	 */
	public Adapter createScopeDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.timeline.tousetimeline.calc.ScopeDomainDistribution <em>Scope Domain Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.ScopeDomainDistribution
	 * @generated
	 */
	public Adapter createScopeDomainDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.timeline.tousetimeline.calc.LayerDomainDistributionFunctions <em>Layer Domain Distribution Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.LayerDomainDistributionFunctions
	 * @generated
	 */
	public Adapter createLayerDomainDistributionFunctionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.timeline.tousetimeline.calc.CalcDomainDistributionFunctionInterval <em>Calc Domain Distribution Function Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.CalcDomainDistributionFunctionInterval
	 * @generated
	 */
	public Adapter createCalcDomainDistributionFunctionIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.timeline.tousetimeline.calc.CalcDomainDistributionFunctionPossible <em>Calc Domain Distribution Function Possible</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.CalcDomainDistributionFunctionPossible
	 * @generated
	 */
	public Adapter createCalcDomainDistributionFunctionPossibleAdapter() {
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
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.continuous.calc.ScopeDistribution <em>Scope Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.continuous.calc.ScopeDistribution
	 * @generated
	 */
	public Adapter createScopeDistributionAdapter() {
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
