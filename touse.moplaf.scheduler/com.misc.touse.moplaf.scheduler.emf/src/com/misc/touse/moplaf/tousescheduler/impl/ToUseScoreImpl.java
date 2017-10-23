/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.common.moplaf.localsearch.Score;
import com.misc.common.moplaf.localsearch.impl.ScoreImpl;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerFactory;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;
import com.misc.touse.moplaf.tousescheduler.ToUseScore;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Use Score</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseScoreImpl#getTotalDistance <em>Total Distance</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseScoreImpl#isVolumeOverload <em>Volume Overload</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToUseScoreImpl extends ScoreImpl implements ToUseScore {
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
	 * The default value of the '{@link #isVolumeOverload() <em>Volume Overload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVolumeOverload()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VOLUME_OVERLOAD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVolumeOverload() <em>Volume Overload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVolumeOverload()
	 * @generated
	 * @ordered
	 */
	protected boolean volumeOverload = VOLUME_OVERLOAD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUseScoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseSchedulerPackage.Literals.TO_USE_SCORE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_SCORE__TOTAL_DISTANCE, oldTotalDistance, totalDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVolumeOverload() {
		return volumeOverload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolumeOverload(boolean newVolumeOverload) {
		boolean oldVolumeOverload = volumeOverload;
		volumeOverload = newVolumeOverload;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_SCORE__VOLUME_OVERLOAD, oldVolumeOverload, volumeOverload));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUseSchedulerPackage.TO_USE_SCORE__TOTAL_DISTANCE:
				return getTotalDistance();
			case ToUseSchedulerPackage.TO_USE_SCORE__VOLUME_OVERLOAD:
				return isVolumeOverload();
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
			case ToUseSchedulerPackage.TO_USE_SCORE__TOTAL_DISTANCE:
				setTotalDistance((Float)newValue);
				return;
			case ToUseSchedulerPackage.TO_USE_SCORE__VOLUME_OVERLOAD:
				setVolumeOverload((Boolean)newValue);
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
			case ToUseSchedulerPackage.TO_USE_SCORE__TOTAL_DISTANCE:
				setTotalDistance(TOTAL_DISTANCE_EDEFAULT);
				return;
			case ToUseSchedulerPackage.TO_USE_SCORE__VOLUME_OVERLOAD:
				setVolumeOverload(VOLUME_OVERLOAD_EDEFAULT);
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
			case ToUseSchedulerPackage.TO_USE_SCORE__TOTAL_DISTANCE:
				return totalDistance != TOTAL_DISTANCE_EDEFAULT;
			case ToUseSchedulerPackage.TO_USE_SCORE__VOLUME_OVERLOAD:
				return volumeOverload != VOLUME_OVERLOAD_EDEFAULT;
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
		result.append(", VolumeOverload: ");
		result.append(volumeOverload);
		result.append(')');
		return result.toString();
	}

	@Override
	public Score clone() {
		ToUseScore new_score = ToUseSchedulerFactory.eINSTANCE.createToUseScore();
		new_score.copy(this);
		return new_score;
	}

	@Override
	public void copy(Score other) {
		super.copy(other);
		
		// copy the attributes in this class
		if ( other instanceof ToUseScore) {
			ToUseScore other_score = (ToUseScore)other;
			this.setTotalDistance(other_score.getTotalDistance());
		}
	}
	
	

} //ToUseScoreImpl
