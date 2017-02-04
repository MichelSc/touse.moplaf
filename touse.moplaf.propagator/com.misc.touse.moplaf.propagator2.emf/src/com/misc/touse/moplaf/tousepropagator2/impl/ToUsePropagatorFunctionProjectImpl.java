/**
 */
package com.misc.touse.moplaf.tousepropagator2.impl;

import com.misc.common.moplaf.propagator2.Plugin;
import com.misc.touse.moplaf.tousepropagator2.Project;
import com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorFunctionProject;
import com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorFunctionProjectImpl#getProject <em>Project</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToUsePropagatorFunctionProjectImpl extends ToUsePropagatorFunctionImpl implements ToUsePropagatorFunctionProject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUsePropagatorFunctionProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUsePropagatorPackage.Literals.TO_USE_PROPAGATOR_FUNCTION_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getProject() {
		Project project = basicGetProject();
		return project != null && project.eIsProxy() ? (Project)eResolveProxy((InternalEObject)project) : project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Project basicGetProject() {
		EObject container = this.eContainer;
		if ( container instanceof Project){
			return (Project) container;
		}
		String logMessage = String.format("The owner of the ToUsePropagatorFunctionProject %s must be a Project and not %s",
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
			case ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__PROJECT:
				if (resolve) return getProject();
				return basicGetProject();
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
			case ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__PROJECT:
				return basicGetProject() != null;
		}
		return super.eIsSet(featureID);
	}

} //ToUsePropagatorFunctionProjectImpl
