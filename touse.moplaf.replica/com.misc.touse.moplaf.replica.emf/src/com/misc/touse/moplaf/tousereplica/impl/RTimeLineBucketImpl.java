/**
 */
package com.misc.touse.moplaf.tousereplica.impl;

import com.misc.touse.moplaf.tousereplica.RTimeLineBucket;
import com.misc.touse.moplaf.tousereplica.TimeLineBucket;
import com.misc.touse.moplaf.tousereplica.ToUseReplicaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RTime Line Bucket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousereplica.impl.RTimeLineBucketImpl#getNextBucket <em>Next Bucket</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousereplica.impl.RTimeLineBucketImpl#getPreviousBucket <em>Previous Bucket</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RTimeLineBucketImpl extends RTimeLineAbstractImpl implements RTimeLineBucket {
	/**
	 * The cached value of the '{@link #getNextBucket() <em>Next Bucket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextBucket()
	 * @generated
	 * @ordered
	 */
	protected RTimeLineBucket nextBucket;

	/**
	 * The cached value of the '{@link #getPreviousBucket() <em>Previous Bucket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousBucket()
	 * @generated
	 * @ordered
	 */
	protected RTimeLineBucket previousBucket;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RTimeLineBucketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseReplicaPackage.Literals.RTIME_LINE_BUCKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTimeLineBucket getNextBucket() {
		if (nextBucket != null && nextBucket.eIsProxy()) {
			InternalEObject oldNextBucket = (InternalEObject) nextBucket;
			nextBucket = (RTimeLineBucket) eResolveProxy(oldNextBucket);
			if (nextBucket != oldNextBucket) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ToUseReplicaPackage.RTIME_LINE_BUCKET__NEXT_BUCKET, oldNextBucket, nextBucket));
			}
		}
		return nextBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTimeLineBucket basicGetNextBucket() {
		return nextBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNextBucket(RTimeLineBucket newNextBucket, NotificationChain msgs) {
		RTimeLineBucket oldNextBucket = nextBucket;
		nextBucket = newNextBucket;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ToUseReplicaPackage.RTIME_LINE_BUCKET__NEXT_BUCKET, oldNextBucket, newNextBucket);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextBucket(RTimeLineBucket newNextBucket) {
		if (newNextBucket != nextBucket) {
			NotificationChain msgs = null;
			if (nextBucket != null)
				msgs = ((InternalEObject) nextBucket).eInverseRemove(this,
						ToUseReplicaPackage.RTIME_LINE_BUCKET__PREVIOUS_BUCKET, RTimeLineBucket.class, msgs);
			if (newNextBucket != null)
				msgs = ((InternalEObject) newNextBucket).eInverseAdd(this,
						ToUseReplicaPackage.RTIME_LINE_BUCKET__PREVIOUS_BUCKET, RTimeLineBucket.class, msgs);
			msgs = basicSetNextBucket(newNextBucket, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseReplicaPackage.RTIME_LINE_BUCKET__NEXT_BUCKET,
					newNextBucket, newNextBucket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTimeLineBucket getPreviousBucket() {
		if (previousBucket != null && previousBucket.eIsProxy()) {
			InternalEObject oldPreviousBucket = (InternalEObject) previousBucket;
			previousBucket = (RTimeLineBucket) eResolveProxy(oldPreviousBucket);
			if (previousBucket != oldPreviousBucket) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ToUseReplicaPackage.RTIME_LINE_BUCKET__PREVIOUS_BUCKET, oldPreviousBucket, previousBucket));
			}
		}
		return previousBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTimeLineBucket basicGetPreviousBucket() {
		return previousBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreviousBucket(RTimeLineBucket newPreviousBucket, NotificationChain msgs) {
		RTimeLineBucket oldPreviousBucket = previousBucket;
		previousBucket = newPreviousBucket;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ToUseReplicaPackage.RTIME_LINE_BUCKET__PREVIOUS_BUCKET, oldPreviousBucket, newPreviousBucket);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousBucket(RTimeLineBucket newPreviousBucket) {
		if (newPreviousBucket != previousBucket) {
			NotificationChain msgs = null;
			if (previousBucket != null)
				msgs = ((InternalEObject) previousBucket).eInverseRemove(this,
						ToUseReplicaPackage.RTIME_LINE_BUCKET__NEXT_BUCKET, RTimeLineBucket.class, msgs);
			if (newPreviousBucket != null)
				msgs = ((InternalEObject) newPreviousBucket).eInverseAdd(this,
						ToUseReplicaPackage.RTIME_LINE_BUCKET__NEXT_BUCKET, RTimeLineBucket.class, msgs);
			msgs = basicSetPreviousBucket(newPreviousBucket, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ToUseReplicaPackage.RTIME_LINE_BUCKET__PREVIOUS_BUCKET, newPreviousBucket, newPreviousBucket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ToUseReplicaPackage.RTIME_LINE_BUCKET__NEXT_BUCKET:
			if (nextBucket != null)
				msgs = ((InternalEObject) nextBucket).eInverseRemove(this,
						ToUseReplicaPackage.RTIME_LINE_BUCKET__PREVIOUS_BUCKET, RTimeLineBucket.class, msgs);
			return basicSetNextBucket((RTimeLineBucket) otherEnd, msgs);
		case ToUseReplicaPackage.RTIME_LINE_BUCKET__PREVIOUS_BUCKET:
			if (previousBucket != null)
				msgs = ((InternalEObject) previousBucket).eInverseRemove(this,
						ToUseReplicaPackage.RTIME_LINE_BUCKET__NEXT_BUCKET, RTimeLineBucket.class, msgs);
			return basicSetPreviousBucket((RTimeLineBucket) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ToUseReplicaPackage.RTIME_LINE_BUCKET__NEXT_BUCKET:
			return basicSetNextBucket(null, msgs);
		case ToUseReplicaPackage.RTIME_LINE_BUCKET__PREVIOUS_BUCKET:
			return basicSetPreviousBucket(null, msgs);
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
		case ToUseReplicaPackage.RTIME_LINE_BUCKET__NEXT_BUCKET:
			if (resolve)
				return getNextBucket();
			return basicGetNextBucket();
		case ToUseReplicaPackage.RTIME_LINE_BUCKET__PREVIOUS_BUCKET:
			if (resolve)
				return getPreviousBucket();
			return basicGetPreviousBucket();
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
		case ToUseReplicaPackage.RTIME_LINE_BUCKET__NEXT_BUCKET:
			setNextBucket((RTimeLineBucket) newValue);
			return;
		case ToUseReplicaPackage.RTIME_LINE_BUCKET__PREVIOUS_BUCKET:
			setPreviousBucket((RTimeLineBucket) newValue);
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
		case ToUseReplicaPackage.RTIME_LINE_BUCKET__NEXT_BUCKET:
			setNextBucket((RTimeLineBucket) null);
			return;
		case ToUseReplicaPackage.RTIME_LINE_BUCKET__PREVIOUS_BUCKET:
			setPreviousBucket((RTimeLineBucket) null);
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
		case ToUseReplicaPackage.RTIME_LINE_BUCKET__NEXT_BUCKET:
			return nextBucket != null;
		case ToUseReplicaPackage.RTIME_LINE_BUCKET__PREVIOUS_BUCKET:
			return previousBucket != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * 
	 */
	@Override
	public void refreshXRefs() {
		super.refreshXRefs();

		// next bucket 
		TimeLineBucket bucket = (TimeLineBucket) this.basicGetExemplar();
		TimeLineBucket next_bucket = bucket.getNextBucket();
		RTimeLineBucket next_replica = null;
		if (next_bucket != null) {
			next_replica = (RTimeLineBucket) this.getReplica(next_bucket);
		}
		this.setNextBucket(next_replica);
	}

} //RTimeLineBucketImpl
