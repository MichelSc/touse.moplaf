/**
 */
package com.misc.touse.moplaf.tousepropagator.util;

import com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapterScope;
import com.misc.touse.moplaf.tousepropagator.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.touse.moplaf.tousepropagator.ToUsePropagatorPackage
 * @generated
 */
public class ToUsePropagatorAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ToUsePropagatorPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUsePropagatorAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ToUsePropagatorPackage.eINSTANCE;
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
	protected ToUsePropagatorSwitch<Adapter> modelSwitch =
		new ToUsePropagatorSwitch<Adapter>() {
			@Override
			public Adapter caseProject(Project object) {
				return createProjectAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseDependence(Dependence object) {
				return createDependenceAdapter();
			}
			@Override
			public Adapter caseTaskItem(TaskItem object) {
				return createTaskItemAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseResourceCandidate(ResourceCandidate object) {
				return createResourceCandidateAdapter();
			}
			@Override
			public Adapter caseObjectWithPropagatorFunctionAdapter(ObjectWithPropagatorFunctionAdapter object) {
				return createObjectWithPropagatorFunctionAdapterAdapter();
			}
			@Override
			public Adapter caseObjectWithPropagatorFunctionAdapterScope(ObjectWithPropagatorFunctionAdapterScope object) {
				return createObjectWithPropagatorFunctionAdapterScopeAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousepropagator.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousepropagator.Project
	 * @generated
	 */
	public Adapter createProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousepropagator.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousepropagator.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousepropagator.Dependence <em>Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousepropagator.Dependence
	 * @generated
	 */
	public Adapter createDependenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousepropagator.TaskItem <em>Task Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousepropagator.TaskItem
	 * @generated
	 */
	public Adapter createTaskItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousepropagator.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousepropagator.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousepropagator.ResourceCandidate <em>Resource Candidate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousepropagator.ResourceCandidate
	 * @generated
	 */
	public Adapter createResourceCandidateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapter <em>Object With Propagator Function Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapter
	 * @generated
	 */
	public Adapter createObjectWithPropagatorFunctionAdapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapterScope <em>Object With Propagator Function Adapter Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapterScope
	 * @generated
	 */
	public Adapter createObjectWithPropagatorFunctionAdapterScopeAdapter() {
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

} //ToUsePropagatorAdapterFactory
