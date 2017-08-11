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

import org.eclipse.emf.common.notify.NotificationChain;
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
	 * The cached value of the '{@link #getTotalDistance() <em>Total Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalDistance()
	 * @generated
	 * @ordered
	 */
	protected ResourceCandidateFloatExpression totalDistance;
	/**
	 * The cached value of the '{@link #getEndTime() <em>End Time</em>}' containment reference.
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
		return totalDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTotalDistance(ResourceCandidateFloatExpression newTotalDistance, NotificationChain msgs) {
		ResourceCandidateFloatExpression oldTotalDistance = totalDistance;
		totalDistance = newTotalDistance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_SOLUTION_RESOURCE__TOTAL_DISTANCE, oldTotalDistance, newTotalDistance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalDistance(ResourceCandidateFloatExpression newTotalDistance) {
		if (newTotalDistance != totalDistance) {
			NotificationChain msgs = null;
			if (totalDistance != null)
				msgs = ((InternalEObject)totalDistance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToUseSchedulerPackage.TO_USE_SOLUTION_RESOURCE__TOTAL_DISTANCE, null, msgs);
			if (newTotalDistance != null)
				msgs = ((InternalEObject)newTotalDistance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToUseSchedulerPackage.TO_USE_SOLUTION_RESOURCE__TOTAL_DISTANCE, null, msgs);
			msgs = basicSetTotalDistance(newTotalDistance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_SOLUTION_RESOURCE__TOTAL_DISTANCE, newTotalDistance, newTotalDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceCandidateDateExpression getEndTime() {
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndTime(ResourceCandidateDateExpression newEndTime, NotificationChain msgs) {
		ResourceCandidateDateExpression oldEndTime = endTime;
		endTime = newEndTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_SOLUTION_RESOURCE__END_TIME, oldEndTime, newEndTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTime(ResourceCandidateDateExpression newEndTime) {
		if (newEndTime != endTime) {
			NotificationChain msgs = null;
			if (endTime != null)
				msgs = ((InternalEObject)endTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToUseSchedulerPackage.TO_USE_SOLUTION_RESOURCE__END_TIME, null, msgs);
			if (newEndTime != null)
				msgs = ((InternalEObject)newEndTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToUseSchedulerPackage.TO_USE_SOLUTION_RESOURCE__END_TIME, null, msgs);
			msgs = basicSetEndTime(newEndTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_SOLUTION_RESOURCE__END_TIME, newEndTime, newEndTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToUseSchedulerPackage.TO_USE_SOLUTION_RESOURCE__TOTAL_DISTANCE:
				return basicSetTotalDistance(null, msgs);
			case ToUseSchedulerPackage.TO_USE_SOLUTION_RESOURCE__END_TIME:
				return basicSetEndTime(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
				return getTotalDistance();
			case ToUseSchedulerPackage.TO_USE_SOLUTION_RESOURCE__END_TIME:
				return getEndTime();
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
