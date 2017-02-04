/**
 */
package com.misc.touse.moplaf.tousepropagator2.impl;

import com.misc.common.moplaf.propagator2.Plugin;
import com.misc.touse.moplaf.tousepropagator2.Task;
import com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorFunctionTask;
import com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorFunctionTaskImpl#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToUsePropagatorFunctionTaskImpl extends ToUsePropagatorFunctionImpl implements ToUsePropagatorFunctionTask {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUsePropagatorFunctionTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUsePropagatorPackage.Literals.TO_USE_PROPAGATOR_FUNCTION_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getTask() {
		Task task = basicGetTask();
		return task != null && task.eIsProxy() ? (Task)eResolveProxy((InternalEObject)task) : task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Task basicGetTask() {
		EObject container = this.eContainer;
		if ( container instanceof Task){
			return (Task) container;
		}
		String logMessage = String.format("The owner of the ToUsePropagatorFunctionTask %s must be a Task and not %s",
                this.getClass().getName(),
                container == null ? "null" : container.getClass().getName());
		Plugin.INSTANCE.logError(logMessage, null);
		return null;	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__TASK:
				if (resolve) return getTask();
				return basicGetTask();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__TASK:
				return basicGetTask() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * 
	 */
	@Override
	public String getInstance() {
		return this.getTask().getTaskName();
	}
} //ToUsePropagatorFunctionTaskImpl
