/**
 */
package com.misc.touse.moplaf.tousereplica.impl;

import com.misc.touse.moplaf.tousereplica.TimeLine;
import com.misc.touse.moplaf.tousereplica.TimeLineBucket;
import com.misc.touse.moplaf.tousereplica.ToUseReplicaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Line Bucket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousereplica.impl.TimeLineBucketImpl#getTimeLine <em>Time Line</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousereplica.impl.TimeLineBucketImpl#getPreviousBucket <em>Previous Bucket</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousereplica.impl.TimeLineBucketImpl#getNextBucket <em>Next Bucket</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousereplica.impl.TimeLineBucketImpl#getBucketNr <em>Bucket Nr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeLineBucketImpl extends TimeLineAbstractImpl implements TimeLineBucket {
	/**
	 * The cached value of the '{@link #getPreviousBucket() <em>Previous Bucket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousBucket()
	 * @generated
	 * @ordered
	 */
	protected TimeLineBucket previousBucket;
	/**
	 * The cached value of the '{@link #getNextBucket() <em>Next Bucket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextBucket()
	 * @generated
	 * @ordered
	 */
	protected TimeLineBucket nextBucket;
	/**
	 * The default value of the '{@link #getBucketNr() <em>Bucket Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketNr()
	 * @generated
	 * @ordered
	 */
	protected static final int BUCKET_NR_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getBucketNr() <em>Bucket Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketNr()
	 * @generated
	 * @ordered
	 */
	protected int bucketNr = BUCKET_NR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeLineBucketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseReplicaPackage.Literals.TIME_LINE_BUCKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLine getTimeLine() {
		if (eContainerFeatureID() != ToUseReplicaPackage.TIME_LINE_BUCKET__TIME_LINE)
			return null;
		return (TimeLine) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeLine(TimeLine newTimeLine, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newTimeLine, ToUseReplicaPackage.TIME_LINE_BUCKET__TIME_LINE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeLine(TimeLine newTimeLine) {
		if (newTimeLine != eInternalContainer()
				|| (eContainerFeatureID() != ToUseReplicaPackage.TIME_LINE_BUCKET__TIME_LINE && newTimeLine != null)) {
			if (EcoreUtil.isAncestor(this, newTimeLine))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTimeLine != null)
				msgs = ((InternalEObject) newTimeLine).eInverseAdd(this, ToUseReplicaPackage.TIME_LINE__BUCKETS,
						TimeLine.class, msgs);
			msgs = basicSetTimeLine(newTimeLine, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseReplicaPackage.TIME_LINE_BUCKET__TIME_LINE,
					newTimeLine, newTimeLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLineBucket getPreviousBucket() {
		if (previousBucket != null && previousBucket.eIsProxy()) {
			InternalEObject oldPreviousBucket = (InternalEObject) previousBucket;
			previousBucket = (TimeLineBucket) eResolveProxy(oldPreviousBucket);
			if (previousBucket != oldPreviousBucket) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ToUseReplicaPackage.TIME_LINE_BUCKET__PREVIOUS_BUCKET, oldPreviousBucket, previousBucket));
			}
		}
		return previousBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLineBucket basicGetPreviousBucket() {
		return previousBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreviousBucket(TimeLineBucket newPreviousBucket, NotificationChain msgs) {
		TimeLineBucket oldPreviousBucket = previousBucket;
		previousBucket = newPreviousBucket;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ToUseReplicaPackage.TIME_LINE_BUCKET__PREVIOUS_BUCKET, oldPreviousBucket, newPreviousBucket);
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
	public void setPreviousBucket(TimeLineBucket newPreviousBucket) {
		if (newPreviousBucket != previousBucket) {
			NotificationChain msgs = null;
			if (previousBucket != null)
				msgs = ((InternalEObject) previousBucket).eInverseRemove(this,
						ToUseReplicaPackage.TIME_LINE_BUCKET__NEXT_BUCKET, TimeLineBucket.class, msgs);
			if (newPreviousBucket != null)
				msgs = ((InternalEObject) newPreviousBucket).eInverseAdd(this,
						ToUseReplicaPackage.TIME_LINE_BUCKET__NEXT_BUCKET, TimeLineBucket.class, msgs);
			msgs = basicSetPreviousBucket(newPreviousBucket, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseReplicaPackage.TIME_LINE_BUCKET__PREVIOUS_BUCKET,
					newPreviousBucket, newPreviousBucket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLineBucket getNextBucket() {
		if (nextBucket != null && nextBucket.eIsProxy()) {
			InternalEObject oldNextBucket = (InternalEObject) nextBucket;
			nextBucket = (TimeLineBucket) eResolveProxy(oldNextBucket);
			if (nextBucket != oldNextBucket) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ToUseReplicaPackage.TIME_LINE_BUCKET__NEXT_BUCKET, oldNextBucket, nextBucket));
			}
		}
		return nextBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLineBucket basicGetNextBucket() {
		return nextBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNextBucket(TimeLineBucket newNextBucket, NotificationChain msgs) {
		TimeLineBucket oldNextBucket = nextBucket;
		nextBucket = newNextBucket;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ToUseReplicaPackage.TIME_LINE_BUCKET__NEXT_BUCKET, oldNextBucket, newNextBucket);
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
	public void setNextBucket(TimeLineBucket newNextBucket) {
		if (newNextBucket != nextBucket) {
			NotificationChain msgs = null;
			if (nextBucket != null)
				msgs = ((InternalEObject) nextBucket).eInverseRemove(this,
						ToUseReplicaPackage.TIME_LINE_BUCKET__PREVIOUS_BUCKET, TimeLineBucket.class, msgs);
			if (newNextBucket != null)
				msgs = ((InternalEObject) newNextBucket).eInverseAdd(this,
						ToUseReplicaPackage.TIME_LINE_BUCKET__PREVIOUS_BUCKET, TimeLineBucket.class, msgs);
			msgs = basicSetNextBucket(newNextBucket, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseReplicaPackage.TIME_LINE_BUCKET__NEXT_BUCKET,
					newNextBucket, newNextBucket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBucketNr() {
		return bucketNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBucketNr(int newBucketNr) {
		int oldBucketNr = bucketNr;
		bucketNr = newBucketNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseReplicaPackage.TIME_LINE_BUCKET__BUCKET_NR,
					oldBucketNr, bucketNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ToUseReplicaPackage.TIME_LINE_BUCKET__TIME_LINE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetTimeLine((TimeLine) otherEnd, msgs);
		case ToUseReplicaPackage.TIME_LINE_BUCKET__PREVIOUS_BUCKET:
			if (previousBucket != null)
				msgs = ((InternalEObject) previousBucket).eInverseRemove(this,
						ToUseReplicaPackage.TIME_LINE_BUCKET__NEXT_BUCKET, TimeLineBucket.class, msgs);
			return basicSetPreviousBucket((TimeLineBucket) otherEnd, msgs);
		case ToUseReplicaPackage.TIME_LINE_BUCKET__NEXT_BUCKET:
			if (nextBucket != null)
				msgs = ((InternalEObject) nextBucket).eInverseRemove(this,
						ToUseReplicaPackage.TIME_LINE_BUCKET__PREVIOUS_BUCKET, TimeLineBucket.class, msgs);
			return basicSetNextBucket((TimeLineBucket) otherEnd, msgs);
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
		case ToUseReplicaPackage.TIME_LINE_BUCKET__TIME_LINE:
			return basicSetTimeLine(null, msgs);
		case ToUseReplicaPackage.TIME_LINE_BUCKET__PREVIOUS_BUCKET:
			return basicSetPreviousBucket(null, msgs);
		case ToUseReplicaPackage.TIME_LINE_BUCKET__NEXT_BUCKET:
			return basicSetNextBucket(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case ToUseReplicaPackage.TIME_LINE_BUCKET__TIME_LINE:
			return eInternalContainer().eInverseRemove(this, ToUseReplicaPackage.TIME_LINE__BUCKETS, TimeLine.class,
					msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ToUseReplicaPackage.TIME_LINE_BUCKET__TIME_LINE:
			return getTimeLine();
		case ToUseReplicaPackage.TIME_LINE_BUCKET__PREVIOUS_BUCKET:
			if (resolve)
				return getPreviousBucket();
			return basicGetPreviousBucket();
		case ToUseReplicaPackage.TIME_LINE_BUCKET__NEXT_BUCKET:
			if (resolve)
				return getNextBucket();
			return basicGetNextBucket();
		case ToUseReplicaPackage.TIME_LINE_BUCKET__BUCKET_NR:
			return getBucketNr();
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
		case ToUseReplicaPackage.TIME_LINE_BUCKET__TIME_LINE:
			setTimeLine((TimeLine) newValue);
			return;
		case ToUseReplicaPackage.TIME_LINE_BUCKET__PREVIOUS_BUCKET:
			setPreviousBucket((TimeLineBucket) newValue);
			return;
		case ToUseReplicaPackage.TIME_LINE_BUCKET__NEXT_BUCKET:
			setNextBucket((TimeLineBucket) newValue);
			return;
		case ToUseReplicaPackage.TIME_LINE_BUCKET__BUCKET_NR:
			setBucketNr((Integer) newValue);
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
		case ToUseReplicaPackage.TIME_LINE_BUCKET__TIME_LINE:
			setTimeLine((TimeLine) null);
			return;
		case ToUseReplicaPackage.TIME_LINE_BUCKET__PREVIOUS_BUCKET:
			setPreviousBucket((TimeLineBucket) null);
			return;
		case ToUseReplicaPackage.TIME_LINE_BUCKET__NEXT_BUCKET:
			setNextBucket((TimeLineBucket) null);
			return;
		case ToUseReplicaPackage.TIME_LINE_BUCKET__BUCKET_NR:
			setBucketNr(BUCKET_NR_EDEFAULT);
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
		case ToUseReplicaPackage.TIME_LINE_BUCKET__TIME_LINE:
			return getTimeLine() != null;
		case ToUseReplicaPackage.TIME_LINE_BUCKET__PREVIOUS_BUCKET:
			return previousBucket != null;
		case ToUseReplicaPackage.TIME_LINE_BUCKET__NEXT_BUCKET:
			return nextBucket != null;
		case ToUseReplicaPackage.TIME_LINE_BUCKET__BUCKET_NR:
			return bucketNr != BUCKET_NR_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (BucketNr: ");
		result.append(bucketNr);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		String description = String.format("%s:%d", this.getTimeLine().getCode(), this.getBucketNr());
		return description;
	}
} //TimeLineBucketImpl
