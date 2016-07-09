/**
 */
package com.misc.touse.moplaf.solver.tousesolver.util;

import com.misc.common.moplaf.common.Job;
import com.misc.common.moplaf.solver.Generator;
import com.misc.common.moplaf.solver.GeneratorElement;
import com.misc.common.moplaf.solver.GeneratorTuple;
import com.misc.touse.moplaf.solver.tousesolver.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage
 * @generated
 */
public class TousesolverAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TousesolverPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TousesolverAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TousesolverPackage.eINSTANCE;
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
	protected TousesolverSwitch<Adapter> modelSwitch =
		new TousesolverSwitch<Adapter>() {
			@Override
			public Adapter caseDomain(Domain object) {
				return createDomainAdapter();
			}
			@Override
			public Adapter caseKnapsack(Knapsack object) {
				return createKnapsackAdapter();
			}
			@Override
			public Adapter caseItem(Item object) {
				return createItemAdapter();
			}
			@Override
			public Adapter caseDomainObject(DomainObject object) {
				return createDomainObjectAdapter();
			}
			@Override
			public Adapter caseDomainObjectFolder(DomainObjectFolder object) {
				return createDomainObjectFolderAdapter();
			}
			@Override
			public Adapter caseScenario(Scenario object) {
				return createScenarioAdapter();
			}
			@Override
			public Adapter caseKnapsackSol(KnapsackSol object) {
				return createKnapsackSolAdapter();
			}
			@Override
			public Adapter caseKnapsackLp(KnapsackLp object) {
				return createKnapsackLpAdapter();
			}
			@Override
			public Adapter caseLpRoot(LpRoot object) {
				return createLpRootAdapter();
			}
			@Override
			public Adapter caseLpKnapsack(LpKnapsack object) {
				return createLpKnapsackAdapter();
			}
			@Override
			public Adapter caseLpItem(LpItem object) {
				return createLpItemAdapter();
			}
			@Override
			public Adapter caseSolveKnapsack(SolveKnapsack object) {
				return createSolveKnapsackAdapter();
			}
			@Override
			public Adapter caseGenerator(Generator object) {
				return createGeneratorAdapter();
			}
			@Override
			public Adapter caseGeneratorElement(GeneratorElement object) {
				return createGeneratorElementAdapter();
			}
			@Override
			public Adapter caseGeneratorTuple(GeneratorTuple object) {
				return createGeneratorTupleAdapter();
			}
			@Override
			public Adapter caseJob(Job object) {
				return createJobAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.solver.tousesolver.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.solver.tousesolver.Domain
	 * @generated
	 */
	public Adapter createDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.solver.tousesolver.Knapsack <em>Knapsack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.solver.tousesolver.Knapsack
	 * @generated
	 */
	public Adapter createKnapsackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.solver.tousesolver.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.solver.tousesolver.Item
	 * @generated
	 */
	public Adapter createItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.solver.tousesolver.DomainObject <em>Domain Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.solver.tousesolver.DomainObject
	 * @generated
	 */
	public Adapter createDomainObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.solver.tousesolver.DomainObjectFolder <em>Domain Object Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.solver.tousesolver.DomainObjectFolder
	 * @generated
	 */
	public Adapter createDomainObjectFolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.solver.tousesolver.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.solver.tousesolver.Scenario
	 * @generated
	 */
	public Adapter createScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackSol <em>Knapsack Sol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.solver.tousesolver.KnapsackSol
	 * @generated
	 */
	public Adapter createKnapsackSolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.solver.tousesolver.KnapsackLp <em>Knapsack Lp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.solver.tousesolver.KnapsackLp
	 * @generated
	 */
	public Adapter createKnapsackLpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.solver.tousesolver.LpRoot <em>Lp Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.solver.tousesolver.LpRoot
	 * @generated
	 */
	public Adapter createLpRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.solver.tousesolver.LpKnapsack <em>Lp Knapsack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.solver.tousesolver.LpKnapsack
	 * @generated
	 */
	public Adapter createLpKnapsackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.solver.tousesolver.LpItem <em>Lp Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.solver.tousesolver.LpItem
	 * @generated
	 */
	public Adapter createLpItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.solver.tousesolver.SolveKnapsack <em>Solve Knapsack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.solver.tousesolver.SolveKnapsack
	 * @generated
	 */
	public Adapter createSolveKnapsackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.Generator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.Generator
	 * @generated
	 */
	public Adapter createGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.GeneratorTuple <em>Generator Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.GeneratorTuple
	 * @generated
	 */
	public Adapter createGeneratorTupleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.common.Job <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.common.Job
	 * @generated
	 */
	public Adapter createJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.GeneratorElement <em>Generator Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.GeneratorElement
	 * @generated
	 */
	public Adapter createGeneratorElementAdapter() {
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

} //TousesolverAdapterFactory
