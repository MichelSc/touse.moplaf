/**
 */
package com.misc.touse.moplaf.tousereplica.impl;

import com.misc.common.moplaf.replica.ReplicatorReplica;
import com.misc.common.moplaf.replica.impl.ReplicatorImpl;

import com.misc.touse.moplaf.tousereplica.TimeLine;
import com.misc.touse.moplaf.tousereplica.TimeLineBucket;
import com.misc.touse.moplaf.tousereplica.TimeLineReplicator;
import com.misc.touse.moplaf.tousereplica.TimeLineReplicatorBucket;
import com.misc.touse.moplaf.tousereplica.ToUseReplicaFactory;
import com.misc.touse.moplaf.tousereplica.ToUseReplicaPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Line Replicator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousereplica.impl.TimeLineReplicatorImpl#getTimeLine <em>Time Line</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousereplica.impl.TimeLineReplicatorImpl#getBuckets <em>Buckets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeLineReplicatorImpl extends ReplicatorImpl implements TimeLineReplicator {
	/**
	 * The cached value of the '{@link #getTimeLine() <em>Time Line</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeLine()
	 * @generated
	 * @ordered
	 */
	protected TimeLine timeLine;

	/**
	 * The cached value of the '{@link #getBuckets() <em>Buckets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuckets()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeLineReplicatorBucket> buckets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeLineReplicatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseReplicaPackage.Literals.TIME_LINE_REPLICATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLine getTimeLine() {
		if (timeLine != null && timeLine.eIsProxy()) {
			InternalEObject oldTimeLine = (InternalEObject) timeLine;
			timeLine = (TimeLine) eResolveProxy(oldTimeLine);
			if (timeLine != oldTimeLine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ToUseReplicaPackage.TIME_LINE_REPLICATOR__TIME_LINE, oldTimeLine, timeLine));
			}
		}
		return timeLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLine basicGetTimeLine() {
		return timeLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeLine(TimeLine newTimeLine) {
		TimeLine oldTimeLine = timeLine;
		timeLine = newTimeLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseReplicaPackage.TIME_LINE_REPLICATOR__TIME_LINE,
					oldTimeLine, timeLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeLineReplicatorBucket> getBuckets() {
		if (buckets == null) {
			buckets = new EObjectWithInverseResolvingEList<TimeLineReplicatorBucket>(TimeLineReplicatorBucket.class,
					this, ToUseReplicaPackage.TIME_LINE_REPLICATOR__BUCKETS,
					ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET__TIME_LINE);
		}
		return buckets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ToUseReplicaPackage.TIME_LINE_REPLICATOR__BUCKETS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getBuckets()).basicAdd(otherEnd, msgs);
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
		case ToUseReplicaPackage.TIME_LINE_REPLICATOR__BUCKETS:
			return ((InternalEList<?>) getBuckets()).basicRemove(otherEnd, msgs);
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
		case ToUseReplicaPackage.TIME_LINE_REPLICATOR__TIME_LINE:
			if (resolve)
				return getTimeLine();
			return basicGetTimeLine();
		case ToUseReplicaPackage.TIME_LINE_REPLICATOR__BUCKETS:
			return getBuckets();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ToUseReplicaPackage.TIME_LINE_REPLICATOR__TIME_LINE:
			setTimeLine((TimeLine) newValue);
			return;
		case ToUseReplicaPackage.TIME_LINE_REPLICATOR__BUCKETS:
			getBuckets().clear();
			getBuckets().addAll((Collection<? extends TimeLineReplicatorBucket>) newValue);
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
		case ToUseReplicaPackage.TIME_LINE_REPLICATOR__TIME_LINE:
			setTimeLine((TimeLine) null);
			return;
		case ToUseReplicaPackage.TIME_LINE_REPLICATOR__BUCKETS:
			getBuckets().clear();
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
		case ToUseReplicaPackage.TIME_LINE_REPLICATOR__TIME_LINE:
			return timeLine != null;
		case ToUseReplicaPackage.TIME_LINE_REPLICATOR__BUCKETS:
			return buckets != null && !buckets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * 
	 */
	@Override
	public EList<EObject> getRootExemplarElements() {
		TimeLine exemplar = this.getTimeLine();
		return new BasicEList<EObject>(exemplar.getBuckets());
	}

	@Override
	public ReplicatorReplica constructReplica(EObject exemplar) {
		if (exemplar instanceof TimeLineBucket) {
			TimeLineReplicatorBucket replica = ToUseReplicaFactory.eINSTANCE.createTimeLineReplicatorBucket();
			replica.setTimeLine(this);
			replica.setBucket((TimeLineBucket) exemplar);
			return replica;
		}
		return super.constructReplica(exemplar);
	}

} //TimeLineReplicatorImpl
