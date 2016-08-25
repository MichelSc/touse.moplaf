/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline.impl;

import com.misc.common.moplaf.time.discrete.DiscreteFactory;
import com.misc.common.moplaf.time.discrete.ObjectTimeBucket;

import com.misc.common.moplaf.time.discrete.impl.ObjectWithTimeLineImpl;
import com.misc.touse.moplaf.timeline.tousetimeline.ConcreteObjectWithTimeLine;
import com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
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
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.ConcreteObjectWithTimeLineImpl#getConcreteBuckets <em>Concrete Buckets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConcreteObjectWithTimeLineImpl extends ObjectWithTimeLineImpl implements ConcreteObjectWithTimeLine {
	/**
	 * The cached value of the '{@link #getConcreteBuckets() <em>Concrete Buckets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteBuckets()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectTimeBucket> concreteBuckets;
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
	public EList<ObjectTimeBucket> getConcreteBuckets() {
		if (concreteBuckets == null) {
			concreteBuckets = new EObjectContainmentEList<ObjectTimeBucket>(ObjectTimeBucket.class, this, TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__CONCRETE_BUCKETS);
		}
		return concreteBuckets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__CONCRETE_BUCKETS:
				return ((InternalEList<?>)getConcreteBuckets()).basicRemove(otherEnd, msgs);
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
			case TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__CONCRETE_BUCKETS:
				return getConcreteBuckets();
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
			case TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__CONCRETE_BUCKETS:
				getConcreteBuckets().clear();
				getConcreteBuckets().addAll((Collection<? extends ObjectTimeBucket>)newValue);
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
			case TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__CONCRETE_BUCKETS:
				getConcreteBuckets().clear();
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
			case TousetimelinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__CONCRETE_BUCKETS:
				return concreteBuckets != null && !concreteBuckets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public ObjectTimeBucket constructObjectTimeBucket() {
		ObjectTimeBucket bucket = DiscreteFactory.eINSTANCE.createObjectTimeBucket();
		this.getConcreteBuckets().add(bucket);  // owning
		return bucket;
	}

} //ConcreteObjectWithTimeLineImpl
