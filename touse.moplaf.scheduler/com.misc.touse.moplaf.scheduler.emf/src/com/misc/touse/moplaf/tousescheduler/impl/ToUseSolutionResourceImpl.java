/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.common.moplaf.scheduler.ResourceCandidateDateExpression;
import com.misc.common.moplaf.scheduler.ResourceCandidateFloatExpression;
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
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseSolutionResourceImpl#getTotalDistance <em>Total Distance</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseSolutionResourceImpl#getEndTime <em>End Time</em>}</li>
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
	 * The cached value of the '{@link #getTotalDistance() <em>Total Distance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalDistance()
	 * @generated
	 * @ordered
	 */
	protected ResourceCandidateFloatExpression totalDistance;
	/**
	 * The cached value of the '{@link #getEndTime() <em>End Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected ResourceCandidateDateExpression endTime;

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
	public ResourceCandidateFloatExpression getTotalDistance() {
		if (totalDistance != null && totalDistance.eIsProxy()) {
			InternalEObject oldTotalDistance = (InternalEObject)totalDistance;
			totalDistance = (ResourceCandidateFloatExpression)eResolveProxy(oldTotalDistance);
			if (totalDistance != oldTotalDistance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToUseSchedulerPackage.TO_USE_SOLUTION_RESOURCE__TOTAL_DISTANCE, oldTotalDistance, totalDistance));
			}
		}
		return totalDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceCandidateFloatExpression basicGetTotalDistance() {
		return totalDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalDistance(ResourceCandidateFloatExpression newTotalDistance) {
		ResourceCandidateFloatExpression oldTotalDistance = totalDistance;
		totalDistance = newTotalDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_SOLUTION_RESOURCE__TOTAL_DISTANCE, oldTotalDistance, totalDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceCandidateDateExpression getEndTime() {
		if (endTime != null && endTime.eIsProxy()) {
			InternalEObject oldEndTime = (InternalEObject)endTime;
			endTime = (ResourceCandidateDateExpression)eResolveProxy(oldEndTime);
			if (endTime != oldEndTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToUseSchedulerPackage.TO_USE_SOLUTION_RESOURCE__END_TIME, oldEndTime, endTime));
			}
		}
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceCandidateDateExpression basicGetEndTime() {
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTime(ResourceCandidateDateExpression newEndTime) {
		ResourceCandidateDateExpression oldEndTime = endTime;
		endTime = newEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_SOLUTION_RESOURCE__END_TIME, oldEndTime, endTime));
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
			case ToUseSchedulerPackage.TO_USE_SOLUTION_RESOURCE__TOTAL_DISTANCE:
				if (resolve) return getTotalDistance();
				return basicGetTotalDistance();
			case ToUseSchedulerPackage.TO_USE_SOLUTION_RESOURCE__END_TIME:
				if (resolve) return getEndTime();
				return basicGetEndTime();
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
			case ToUseSchedulerPackage.TO_USE_SOLUTION_RESOURCE__TOTAL_DISTANCE:
				setTotalDistance((ResourceCandidateFloatExpression)newValue);
				return;
			case ToUseSchedulerPackage.TO_USE_SOLUTION_RESOURCE__END_TIME:
				setEndTime((ResourceCandidateDateExpression)newValue);
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
			case ToUseSchedulerPackage.TO_USE_SOLUTION_RESOURCE__TOTAL_DISTANCE:
				setTotalDistance((ResourceCandidateFloatExpression)null);
				return;
			case ToUseSchedulerPackage.TO_USE_SOLUTION_RESOURCE__END_TIME:
				setEndTime((ResourceCandidateDateExpression)null);
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
			case ToUseSchedulerPackage.TO_USE_SOLUTION_RESOURCE__TOTAL_DISTANCE:
				return totalDistance != null;
			case ToUseSchedulerPackage.TO_USE_SOLUTION_RESOURCE__END_TIME:
				return endTime != null;
		}
		return super.eIsSet(featureID);
	}

} //ToUseSolutionResourceImpl
