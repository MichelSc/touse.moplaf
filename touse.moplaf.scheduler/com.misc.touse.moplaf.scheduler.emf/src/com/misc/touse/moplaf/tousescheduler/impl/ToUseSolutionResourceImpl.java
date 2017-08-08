/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.common.moplaf.scheduler.impl.SolutionResourceImpl;

import com.misc.touse.moplaf.tousescheduler.ToUseResource;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;
import com.misc.touse.moplaf.tousescheduler.ToUseSolutionResource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Use Solution Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseSolutionResourceImpl#getToUseResource <em>To Use Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToUseSolutionResourceImpl extends SolutionResourceImpl implements ToUseSolutionResource {
	/**
	 * The cached value of the '{@link #getToUseResource() <em>To Use Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToUseResource()
	 * @generated
	 * @ordered
	 */
	protected ToUseResource toUseResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUseSolutionResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseSchedulerPackage.Literals.TO_USE_SOLUTION_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseResource getToUseResource() {
		if (toUseResource != null && toUseResource.eIsProxy()) {
			InternalEObject oldToUseResource = (InternalEObject)toUseResource;
			toUseResource = (ToUseResource)eResolveProxy(oldToUseResource);
			if (toUseResource != oldToUseResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToUseSchedulerPackage.TO_USE_SOLUTION_RESOURCE__TO_USE_RESOURCE, oldToUseResource, toUseResource));
			}
		}
		return toUseResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseResource basicGetToUseResource() {
		return toUseResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToUseResource(ToUseResource newToUseResource) {
		ToUseResource oldToUseResource = toUseResource;
		toUseResource = newToUseResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_SOLUTION_RESOURCE__TO_USE_RESOURCE, oldToUseResource, toUseResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUseSchedulerPackage.TO_USE_SOLUTION_RESOURCE__TO_USE_RESOURCE:
				if (resolve) return getToUseResource();
				return basicGetToUseResource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ToUseSchedulerPackage.TO_USE_SOLUTION_RESOURCE__TO_USE_RESOURCE:
				setToUseResource((ToUseResource)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ToUseSchedulerPackage.TO_USE_SOLUTION_RESOURCE__TO_USE_RESOURCE:
				setToUseResource((ToUseResource)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ToUseSchedulerPackage.TO_USE_SOLUTION_RESOURCE__TO_USE_RESOURCE:
				return toUseResource != null;
		}
		return super.eIsSet(featureID);
	}

} //ToUseSolutionResourceImpl
