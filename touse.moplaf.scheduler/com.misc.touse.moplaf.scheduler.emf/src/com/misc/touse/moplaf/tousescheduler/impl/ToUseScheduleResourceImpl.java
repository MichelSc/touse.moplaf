/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.common.moplaf.scheduler.impl.ResourceImpl;

import com.misc.touse.moplaf.tousescheduler.ToUseResource;
import com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Use Schedule Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseScheduleResourceImpl#getToUseResource <em>To Use Resource</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseScheduleResourceImpl#getTotalDistance <em>Total Distance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToUseScheduleResourceImpl extends ResourceImpl implements ToUseScheduleResource {
	/**
	 * The default value of the '{@link #getTotalDistance() <em>Total Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalDistance()
	 * @generated
	 * @ordered
	 */
	protected static final float TOTAL_DISTANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTotalDistance() <em>Total Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalDistance()
	 * @generated
	 * @ordered
	 */
	protected float totalDistance = TOTAL_DISTANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUseScheduleResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseSchedulerPackage.Literals.TO_USE_SCHEDULE_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseResource getToUseResource() {
		ToUseResource toUseResource = basicGetToUseResource();
		return toUseResource != null && toUseResource.eIsProxy() ? (ToUseResource)eResolveProxy((InternalEObject)toUseResource) : toUseResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ToUseResource basicGetToUseResource() {
		ToUseResource toUseScheduleResource = (ToUseResource)this.getResource();
		return toUseScheduleResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTotalDistance() {
		return totalDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalDistance(float newTotalDistance) {
		float oldTotalDistance = totalDistance;
		totalDistance = newTotalDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_SCHEDULE_RESOURCE__TOTAL_DISTANCE, oldTotalDistance, totalDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_RESOURCE__TO_USE_RESOURCE:
				if (resolve) return getToUseResource();
				return basicGetToUseResource();
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_RESOURCE__TOTAL_DISTANCE:
				return getTotalDistance();
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
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_RESOURCE__TOTAL_DISTANCE:
				setTotalDistance((Float)newValue);
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
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_RESOURCE__TOTAL_DISTANCE:
				setTotalDistance(TOTAL_DISTANCE_EDEFAULT);
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
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_RESOURCE__TO_USE_RESOURCE:
				return basicGetToUseResource() != null;
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_RESOURCE__TOTAL_DISTANCE:
				return totalDistance != TOTAL_DISTANCE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (TotalDistance: ");
		result.append(totalDistance);
		result.append(')');
		return result.toString();
	}

} //ToUseScheduleResourceImpl
