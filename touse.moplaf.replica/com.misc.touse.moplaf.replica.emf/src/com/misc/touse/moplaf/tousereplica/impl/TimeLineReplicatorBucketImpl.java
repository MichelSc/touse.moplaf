/**
 */
package com.misc.touse.moplaf.tousereplica.impl;

import com.misc.common.moplaf.replica.Replicator;
import com.misc.common.moplaf.replica.ReplicatorReplica;
import com.misc.common.moplaf.replica.impl.ReplicatorReplicaImpl;

import com.misc.touse.moplaf.tousereplica.TimeLineBucket;
import com.misc.touse.moplaf.tousereplica.TimeLineReplicator;
import com.misc.touse.moplaf.tousereplica.TimeLineReplicatorBucket;
import com.misc.touse.moplaf.tousereplica.ToUseReplicaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Line Replicator Bucket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousereplica.impl.TimeLineReplicatorBucketImpl#getNext <em>Next</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousereplica.impl.TimeLineReplicatorBucketImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousereplica.impl.TimeLineReplicatorBucketImpl#getBucket <em>Bucket</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousereplica.impl.TimeLineReplicatorBucketImpl#getTimeLine <em>Time Line</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousereplica.impl.TimeLineReplicatorBucketImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeLineReplicatorBucketImpl extends ReplicatorReplicaImpl implements TimeLineReplicatorBucket {
	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected TimeLineReplicatorBucket next;

	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected TimeLineReplicatorBucket previous;

	/**
	 * The cached value of the '{@link #getBucket() <em>Bucket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucket()
	 * @generated
	 * @ordered
	 */
	protected TimeLineBucket bucket;

	/**
	 * The cached value of the '{@link #getTimeLine() <em>Time Line</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeLine()
	 * @generated
	 * @ordered
	 */
	protected TimeLineReplicator timeLine;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeLineReplicatorBucketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseReplicaPackage.Literals.TIME_LINE_REPLICATOR_BUCKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLineReplicatorBucket getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject) next;
			next = (TimeLineReplicatorBucket) eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__NEXT, oldNext, next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLineReplicatorBucket basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNext(TimeLineReplicatorBucket newNext, NotificationChain msgs) {
		TimeLineReplicatorBucket oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__NEXT, oldNext, newNext);
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
	public void setNext(TimeLineReplicatorBucket newNext) {
		if (newNext != next) {
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject) next).eInverseRemove(this,
						ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__PREVIOUS, TimeLineReplicatorBucket.class,
						msgs);
			if (newNext != null)
				msgs = ((InternalEObject) newNext).eInverseAdd(this,
						ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__PREVIOUS, TimeLineReplicatorBucket.class,
						msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__NEXT,
					newNext, newNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLineReplicatorBucket getPrevious() {
		if (previous != null && previous.eIsProxy()) {
			InternalEObject oldPrevious = (InternalEObject) previous;
			previous = (TimeLineReplicatorBucket) eResolveProxy(oldPrevious);
			if (previous != oldPrevious) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__PREVIOUS, oldPrevious, previous));
			}
		}
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLineReplicatorBucket basicGetPrevious() {
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrevious(TimeLineReplicatorBucket newPrevious, NotificationChain msgs) {
		TimeLineReplicatorBucket oldPrevious = previous;
		previous = newPrevious;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__PREVIOUS, oldPrevious, newPrevious);
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
	public void setPrevious(TimeLineReplicatorBucket newPrevious) {
		if (newPrevious != previous) {
			NotificationChain msgs = null;
			if (previous != null)
				msgs = ((InternalEObject) previous).eInverseRemove(this,
						ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__NEXT, TimeLineReplicatorBucket.class, msgs);
			if (newPrevious != null)
				msgs = ((InternalEObject) newPrevious).eInverseAdd(this,
						ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__NEXT, TimeLineReplicatorBucket.class, msgs);
			msgs = basicSetPrevious(newPrevious, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__PREVIOUS, newPrevious, newPrevious));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLineBucket getBucket() {
		if (bucket != null && bucket.eIsProxy()) {
			InternalEObject oldBucket = (InternalEObject) bucket;
			bucket = (TimeLineBucket) eResolveProxy(oldBucket);
			if (bucket != oldBucket) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__BUCKET, oldBucket, bucket));
			}
		}
		return bucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLineBucket basicGetBucket() {
		return bucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBucket(TimeLineBucket newBucket) {
		TimeLineBucket oldBucket = bucket;
		bucket = newBucket;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__BUCKET, oldBucket, bucket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLineReplicator getTimeLine() {
		if (timeLine != null && timeLine.eIsProxy()) {
			InternalEObject oldTimeLine = (InternalEObject) timeLine;
			timeLine = (TimeLineReplicator) eResolveProxy(oldTimeLine);
			if (timeLine != oldTimeLine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__TIME_LINE, oldTimeLine, timeLine));
			}
		}
		return timeLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLineReplicator basicGetTimeLine() {
		return timeLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeLine(TimeLineReplicator newTimeLine, NotificationChain msgs) {
		TimeLineReplicator oldTimeLine = timeLine;
		timeLine = newTimeLine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__TIME_LINE, oldTimeLine, newTimeLine);
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
	public void setTimeLine(TimeLineReplicator newTimeLine) {
		if (newTimeLine != timeLine) {
			NotificationChain msgs = null;
			if (timeLine != null)
				msgs = ((InternalEObject) timeLine).eInverseRemove(this,
						ToUseReplicaPackage.TIME_LINE_REPLICATOR__BUCKETS, TimeLineReplicator.class, msgs);
			if (newTimeLine != null)
				msgs = ((InternalEObject) newTimeLine).eInverseAdd(this,
						ToUseReplicaPackage.TIME_LINE_REPLICATOR__BUCKETS, TimeLineReplicator.class, msgs);
			msgs = basicSetTimeLine(newTimeLine, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__TIME_LINE, newTimeLine, newTimeLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		TimeLineBucket bucket = this.getBucket();
		String description = bucket ==null ? "null" : bucket.getDescription();
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__NEXT:
			if (next != null)
				msgs = ((InternalEObject) next).eInverseRemove(this,
						ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__PREVIOUS, TimeLineReplicatorBucket.class,
						msgs);
			return basicSetNext((TimeLineReplicatorBucket) otherEnd, msgs);
		case ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__PREVIOUS:
			if (previous != null)
				msgs = ((InternalEObject) previous).eInverseRemove(this,
						ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__NEXT, TimeLineReplicatorBucket.class, msgs);
			return basicSetPrevious((TimeLineReplicatorBucket) otherEnd, msgs);
		case ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__TIME_LINE:
			if (timeLine != null)
				msgs = ((InternalEObject) timeLine).eInverseRemove(this,
						ToUseReplicaPackage.TIME_LINE_REPLICATOR__BUCKETS, TimeLineReplicator.class, msgs);
			return basicSetTimeLine((TimeLineReplicator) otherEnd, msgs);
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
		case ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__NEXT:
			return basicSetNext(null, msgs);
		case ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__PREVIOUS:
			return basicSetPrevious(null, msgs);
		case ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__TIME_LINE:
			return basicSetTimeLine(null, msgs);
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
		case ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__NEXT:
			if (resolve)
				return getNext();
			return basicGetNext();
		case ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__PREVIOUS:
			if (resolve)
				return getPrevious();
			return basicGetPrevious();
		case ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__BUCKET:
			if (resolve)
				return getBucket();
			return basicGetBucket();
		case ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__TIME_LINE:
			if (resolve)
				return getTimeLine();
			return basicGetTimeLine();
		case ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__DESCRIPTION:
			return getDescription();
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
		case ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__NEXT:
			setNext((TimeLineReplicatorBucket) newValue);
			return;
		case ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__PREVIOUS:
			setPrevious((TimeLineReplicatorBucket) newValue);
			return;
		case ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__BUCKET:
			setBucket((TimeLineBucket) newValue);
			return;
		case ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__TIME_LINE:
			setTimeLine((TimeLineReplicator) newValue);
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
		case ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__NEXT:
			setNext((TimeLineReplicatorBucket) null);
			return;
		case ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__PREVIOUS:
			setPrevious((TimeLineReplicatorBucket) null);
			return;
		case ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__BUCKET:
			setBucket((TimeLineBucket) null);
			return;
		case ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__TIME_LINE:
			setTimeLine((TimeLineReplicator) null);
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
		case ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__NEXT:
			return next != null;
		case ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__PREVIOUS:
			return previous != null;
		case ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__BUCKET:
			return bucket != null;
		case ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__TIME_LINE:
			return timeLine != null;
		case ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? getDescription() != null
					: !DESCRIPTION_EDEFAULT.equals(getDescription());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * 
	 */
	@Override
	public void onRemove() {
		super.onRemove();

		this.setNext(null);
		this.setTimeLine(null);
	}

	/**
	 * 
	 */
	@Override
	public void onRefresh() {
		super.onRefresh();
		TimeLineBucket bucket = this.getBucket();
		Replicator replicator = this.getReplicator();

		// next bucket
		TimeLineBucket next_bucket = bucket.getNextBucket();
		ReplicatorReplica next_replica = replicator.getReplica(next_bucket);
		this.setNext((TimeLineReplicatorBucket) next_replica);
	}

} //TimeLineReplicatorBucketImpl
