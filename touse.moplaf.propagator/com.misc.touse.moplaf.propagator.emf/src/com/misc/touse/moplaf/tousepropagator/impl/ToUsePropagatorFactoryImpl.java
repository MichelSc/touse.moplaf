/**
 */
package com.misc.touse.moplaf.tousepropagator.impl;

import com.misc.touse.moplaf.tousepropagator.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
			case ToUsePropagatorPackage.PROJECT: return createProject();
			case ToUsePropagatorPackage.TASK: return createTask();
			case ToUsePropagatorPackage.DEPENDENCE: return createDependence();
			case ToUsePropagatorPackage.TASK_ITEM: return createTaskItem();
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
