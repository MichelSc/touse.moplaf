/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline.impl;

import com.misc.common.moplaf.time.discrete.DiscretePackage;
import com.misc.common.moplaf.time.discrete.ObjectTimeBucket;

import com.misc.common.moplaf.time.discrete.ObjectWithTimeLine;
import com.misc.common.moplaf.time.discrete.TimeBucket;
import com.misc.common.moplaf.time.discrete.impl.ObjectWithTimeLineImpl;
import com.misc.touse.moplaf.timeline.tousetimeline.ConcreteObjectWithTimeLine;
import com.misc.touse.moplaf.timeline.tousetimeline.TousetimelineFactory;
import com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concrete Object With Time Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.ConcreteObjectWithTimeLineImpl#getBuckets <em>Buckets</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.ConcreteObjectWithTimeLineImpl#getLastBucket <em>Last Bucket</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.ConcreteObjectWithTimeLineImpl#getFirstBucket <em>First Bucket</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.ConcreteObjectWithTimeLineImpl#getStartBucket <em>Start Bucket</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.ConcreteObjectWithTimeLineImpl#getEndBucket <em>End Bucket</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConcreteObjectWithTimeLineImpl extends SomeBaseClassImpl implements ConcreteObjectWithTimeLine {
	/**
	 * The cached value of the '{@link #getBuckets() <em>Buckets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuckets()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectTimeBucket> buckets;
	/**
	 * The cached value of the '{@link #getLastBucket() <em>Last Bucket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastBucket()
	 * @generated
	 * @ordered
	 */
	protected ObjectTimeBucket lastBucket;
	/**
	 * The cached value of the '{@link #getFirstBucket() <em>First Bucket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstBucket()
	 * @generated
	 * @ordered
	 */
	protected ObjectTimeBucket firstBucket;
	/**
	 * The cached value of the '{@link #getStartBucket() <em>Start Bucket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartBucket()
	 * @generated
	 * @ordered
	 */
	protected TimeBucket startBucket;
	/**
	 * The cached value of the '{@link #getEndBucket() <em>End Bucket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndBucket()
	 * @generated
	 * @ordered
	 */
	protected TimeBucket endBucket;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcreteObjectWithTimeLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TousetimelinePackage.Literals.CONCRETE_OBJECT_WITH_TIME_LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectTimeBucket> getBuckets() {
		if (buckets == null) {
			buckets = new EObjectContainmentEList<ObjectTimeBucket>(ObjectTimeBucket.class, this, TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__BUCKETS);
		}
		return buckets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTimeBucket getLastBucket() {
		if (lastBucket != null && lastBucket.eIsProxy()) {
			InternalEObject oldLastBucket = (InternalEObject)lastBucket;
			lastBucket = (ObjectTimeBucket)eResolveProxy(oldLastBucket);
			if (lastBucket != oldLastBucket) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__LAST_BUCKET, oldLastBucket, lastBucket));
			}
		}
		return lastBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTimeBucket basicGetLastBucket() {
		return lastBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastBucket(ObjectTimeBucket newLastBucket) {
		ObjectTimeBucket oldLastBucket = lastBucket;
		lastBucket = newLastBucket;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__LAST_BUCKET, oldLastBucket, lastBucket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTimeBucket getFirstBucket() {
		if (firstBucket != null && firstBucket.eIsProxy()) {
			InternalEObject oldFirstBucket = (InternalEObject)firstBucket;
			firstBucket = (ObjectTimeBucket)eResolveProxy(oldFirstBucket);
			if (firstBucket != oldFirstBucket) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__FIRST_BUCKET, oldFirstBucket, firstBucket));
			}
		}
		return firstBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTimeBucket basicGetFirstBucket() {
		return firstBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstBucket(ObjectTimeBucket newFirstBucket) {
		ObjectTimeBucket oldFirstBucket = firstBucket;
		firstBucket = newFirstBucket;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__FIRST_BUCKET, oldFirstBucket, firstBucket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeBucket getStartBucket() {
		if (startBucket != null && startBucket.eIsProxy()) {
			InternalEObject oldStartBucket = (InternalEObject)startBucket;
			startBucket = (TimeBucket)eResolveProxy(oldStartBucket);
			if (startBucket != oldStartBucket) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__START_BUCKET, oldStartBucket, startBucket));
			}
		}
		return startBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeBucket basicGetStartBucket() {
		return startBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartBucket(TimeBucket newStartBucket) {
		TimeBucket oldStartBucket = startBucket;
		startBucket = newStartBucket;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__START_BUCKET, oldStartBucket, startBucket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeBucket getEndBucket() {
		if (endBucket != null && endBucket.eIsProxy()) {
			InternalEObject oldEndBucket = (InternalEObject)endBucket;
			endBucket = (TimeBucket)eResolveProxy(oldEndBucket);
			if (endBucket != oldEndBucket) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__END_BUCKET, oldEndBucket, endBucket));
			}
		}
		return endBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeBucket basicGetEndBucket() {
		return endBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndBucket(TimeBucket newEndBucket) {
		TimeBucket oldEndBucket = endBucket;
		endBucket = newEndBucket;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__END_BUCKET, oldEndBucket, endBucket));
	}

	private ObjectTimeBucket currentObjectTimeBucket = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ObjectTimeBucket getBucket(TimeBucket bucket) {
		this.currentObjectTimeBucket = ObjectWithTimeLineImpl.getBucket(this, bucket, this.currentObjectTimeBucket);
		return this.currentObjectTimeBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__BUCKETS:
				return ((InternalEList<?>)getBuckets()).basicRemove(otherEnd, msgs);
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
			case TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__BUCKETS:
				return getBuckets();
			case TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__LAST_BUCKET:
				if (resolve) return getLastBucket();
				return basicGetLastBucket();
			case TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__FIRST_BUCKET:
				if (resolve) return getFirstBucket();
				return basicGetFirstBucket();
			case TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__START_BUCKET:
				if (resolve) return getStartBucket();
				return basicGetStartBucket();
			case TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__END_BUCKET:
				if (resolve) return getEndBucket();
				return basicGetEndBucket();
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
			case TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__BUCKETS:
				getBuckets().clear();
				getBuckets().addAll((Collection<? extends ObjectTimeBucket>)newValue);
				return;
			case TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__LAST_BUCKET:
				setLastBucket((ObjectTimeBucket)newValue);
				return;
			case TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__FIRST_BUCKET:
				setFirstBucket((ObjectTimeBucket)newValue);
				return;
			case TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__START_BUCKET:
				setStartBucket((TimeBucket)newValue);
				return;
			case TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__END_BUCKET:
				setEndBucket((TimeBucket)newValue);
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
			case TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__BUCKETS:
				getBuckets().clear();
				return;
			case TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__LAST_BUCKET:
				setLastBucket((ObjectTimeBucket)null);
				return;
			case TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__FIRST_BUCKET:
				setFirstBucket((ObjectTimeBucket)null);
				return;
			case TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__START_BUCKET:
				setStartBucket((TimeBucket)null);
				return;
			case TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__END_BUCKET:
				setEndBucket((TimeBucket)null);
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
			case TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__BUCKETS:
				return buckets != null && !buckets.isEmpty();
			case TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__LAST_BUCKET:
				return lastBucket != null;
			case TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__FIRST_BUCKET:
				return firstBucket != null;
			case TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__START_BUCKET:
				return startBucket != null;
			case TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__END_BUCKET:
				return endBucket != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ObjectWithTimeLine.class) {
			switch (derivedFeatureID) {
				case TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__BUCKETS: return DiscretePackage.OBJECT_WITH_TIME_LINE__BUCKETS;
				case TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__LAST_BUCKET: return DiscretePackage.OBJECT_WITH_TIME_LINE__LAST_BUCKET;
				case TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__FIRST_BUCKET: return DiscretePackage.OBJECT_WITH_TIME_LINE__FIRST_BUCKET;
				case TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__START_BUCKET: return DiscretePackage.OBJECT_WITH_TIME_LINE__START_BUCKET;
				case TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__END_BUCKET: return DiscretePackage.OBJECT_WITH_TIME_LINE__END_BUCKET;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ObjectWithTimeLine.class) {
			switch (baseFeatureID) {
				case DiscretePackage.OBJECT_WITH_TIME_LINE__BUCKETS: return TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__BUCKETS;
				case DiscretePackage.OBJECT_WITH_TIME_LINE__LAST_BUCKET: return TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__LAST_BUCKET;
				case DiscretePackage.OBJECT_WITH_TIME_LINE__FIRST_BUCKET: return TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__FIRST_BUCKET;
				case DiscretePackage.OBJECT_WITH_TIME_LINE__START_BUCKET: return TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__START_BUCKET;
				case DiscretePackage.OBJECT_WITH_TIME_LINE__END_BUCKET: return TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__END_BUCKET;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ObjectWithTimeLine.class) {
			switch (baseOperationID) {
				case DiscretePackage.OBJECT_WITH_TIME_LINE___GET_BUCKET__TIMEBUCKET: return TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE___GET_BUCKET__TIMEBUCKET;
				case DiscretePackage.OBJECT_WITH_TIME_LINE___CONSTRUCT_OBJECT_TIME_BUCKET: return TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE___CONSTRUCT_OBJECT_TIME_BUCKET;
				case DiscretePackage.OBJECT_WITH_TIME_LINE___REFRESH: return TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE___REFRESH;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE___GET_BUCKET__TIMEBUCKET:
				return getBucket((TimeBucket)arguments.get(0));
			case TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE___CONSTRUCT_OBJECT_TIME_BUCKET:
				return constructObjectTimeBucket();
			case TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE___REFRESH:
				refresh();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public ObjectTimeBucket constructObjectTimeBucket() {
		ObjectTimeBucket bucket = TousetimelineFactory.eINSTANCE.createConcreteObjectTimeBucket();
		return bucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refresh() {
		ObjectWithTimeLineImpl.refresh(this);
	}

} //ConcreteObjectWithTimeLineImpl
