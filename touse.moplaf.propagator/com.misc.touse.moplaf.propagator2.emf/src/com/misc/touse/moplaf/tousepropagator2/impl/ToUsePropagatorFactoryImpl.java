/**
 */
package com.misc.touse.moplaf.tousepropagator2.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.misc.touse.moplaf.tousepropagator2.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToUsePropagatorFactoryImpl extends EFactoryImpl implements ToUsePropagatorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ToUsePropagatorFactory init() {
		try {
			ToUsePropagatorFactory theToUsePropagatorFactory = (ToUsePropagatorFactory)EPackage.Registry.INSTANCE.getEFactory(ToUsePropagatorPackage.eNS_URI);
			if (theToUsePropagatorFactory != null) {
				return theToUsePropagatorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ToUsePropagatorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUsePropagatorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ToUsePropagatorPackage.DOMAIN: return createDomain();
			case ToUsePropagatorPackage.PROJECT: return createProject();
			case ToUsePropagatorPackage.TASK: return createTask();
			case ToUsePropagatorPackage.DEPENDENCE: return createDependence();
			case ToUsePropagatorPackage.TASK_ITEM: return createTaskItem();
			case ToUsePropagatorPackage.RESOURCE: return createResource();
			case ToUsePropagatorPackage.RESOURCE_CANDIDATE: return createResourceCandidate();
			case ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION: return createToUsePropagatorFunction();
			case ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK: return createToUsePropagatorFunctionTask();
			case ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT: return createToUsePropagatorFunctionProject();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependence createDependence() {
		DependenceImpl dependence = new DependenceImpl();
		return dependence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskItem createTaskItem() {
		TaskItemImpl taskItem = new TaskItemImpl();
		return taskItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceCandidate createResourceCandidate() {
		ResourceCandidateImpl resourceCandidate = new ResourceCandidateImpl();
		return resourceCandidate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUsePropagatorFunction createToUsePropagatorFunction() {
		ToUsePropagatorFunctionImpl toUsePropagatorFunction = new ToUsePropagatorFunctionImpl();
		return toUsePropagatorFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUsePropagatorFunctionTask createToUsePropagatorFunctionTask() {
		ToUsePropagatorFunctionTaskImpl toUsePropagatorFunctionTask = new ToUsePropagatorFunctionTaskImpl();
		return toUsePropagatorFunctionTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUsePropagatorFunctionProject createToUsePropagatorFunctionProject() {
		ToUsePropagatorFunctionProjectImpl toUsePropagatorFunctionProject = new ToUsePropagatorFunctionProjectImpl();
		return toUsePropagatorFunctionProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain createDomain() {
		DomainImpl domain = new DomainImpl();
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUsePropagatorPackage getToUsePropagatorPackage() {
		return (ToUsePropagatorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ToUsePropagatorPackage getPackage() {
		return ToUsePropagatorPackage.eINSTANCE;
	}

} //ToUsePropagatorFactoryImpl
