/**
 */
package com.misc.touse.moplaf.tousereplica.impl;

import com.misc.touse.moplaf.tousereplica.Domain;
import com.misc.touse.moplaf.tousereplica.RTimeLine;
import com.misc.touse.moplaf.tousereplica.TimeLine;
import com.misc.touse.moplaf.tousereplica.TimeLineReplicator;
import com.misc.touse.moplaf.tousereplica.ToUseReplicaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousereplica.impl.DomainImpl#getTimeLines <em>Time Lines</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousereplica.impl.DomainImpl#getTimeLineReplicas <em>Time Line Replicas</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousereplica.impl.DomainImpl#getTimeLineReplica2s <em>Time Line Replica2s</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainImpl extends MinimalEObjectImpl.Container implements Domain {
	/**
	 * The cached value of the '{@link #getTimeLines() <em>Time Lines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeLines()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeLine> timeLines;

	/**
	 * The cached value of the '{@link #getTimeLineReplicas() <em>Time Line Replicas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeLineReplicas()
	 * @generated
	 * @ordered
	 */
	protected EList<RTimeLine> timeLineReplicas;

	/**
	 * The cached value of the '{@link #getTimeLineReplica2s() <em>Time Line Replica2s</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeLineReplica2s()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeLineReplicator> timeLineReplica2s;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseReplicaPackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeLine> getTimeLines() {
		if (timeLines == null) {
			timeLines = new EObjectContainmentEList<TimeLine>(TimeLine.class, this,
					ToUseReplicaPackage.DOMAIN__TIME_LINES);
		}
		return timeLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RTimeLine> getTimeLineReplicas() {
		if (timeLineReplicas == null) {
			timeLineReplicas = new EObjectContainmentEList<RTimeLine>(RTimeLine.class, this,
					ToUseReplicaPackage.DOMAIN__TIME_LINE_REPLICAS);
		}
		return timeLineReplicas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeLineReplicator> getTimeLineReplica2s() {
		if (timeLineReplica2s == null) {
			timeLineReplica2s = new EObjectContainmentEList<TimeLineReplicator>(TimeLineReplicator.class, this,
					ToUseReplicaPackage.DOMAIN__TIME_LINE_REPLICA2S);
		}
		return timeLineReplica2s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ToUseReplicaPackage.DOMAIN__TIME_LINES:
			return ((InternalEList<?>) getTimeLines()).basicRemove(otherEnd, msgs);
		case ToUseReplicaPackage.DOMAIN__TIME_LINE_REPLICAS:
			return ((InternalEList<?>) getTimeLineReplicas()).basicRemove(otherEnd, msgs);
		case ToUseReplicaPackage.DOMAIN__TIME_LINE_REPLICA2S:
			return ((InternalEList<?>) getTimeLineReplica2s()).basicRemove(otherEnd, msgs);
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
		case ToUseReplicaPackage.DOMAIN__TIME_LINES:
			return getTimeLines();
		case ToUseReplicaPackage.DOMAIN__TIME_LINE_REPLICAS:
			return getTimeLineReplicas();
		case ToUseReplicaPackage.DOMAIN__TIME_LINE_REPLICA2S:
			return getTimeLineReplica2s();
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
		case ToUseReplicaPackage.DOMAIN__TIME_LINES:
			getTimeLines().clear();
			getTimeLines().addAll((Collection<? extends TimeLine>) newValue);
			return;
		case ToUseReplicaPackage.DOMAIN__TIME_LINE_REPLICAS:
			getTimeLineReplicas().clear();
			getTimeLineReplicas().addAll((Collection<? extends RTimeLine>) newValue);
			return;
		case ToUseReplicaPackage.DOMAIN__TIME_LINE_REPLICA2S:
			getTimeLineReplica2s().clear();
			getTimeLineReplica2s().addAll((Collection<? extends TimeLineReplicator>) newValue);
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
		case ToUseReplicaPackage.DOMAIN__TIME_LINES:
			getTimeLines().clear();
			return;
		case ToUseReplicaPackage.DOMAIN__TIME_LINE_REPLICAS:
			getTimeLineReplicas().clear();
			return;
		case ToUseReplicaPackage.DOMAIN__TIME_LINE_REPLICA2S:
			getTimeLineReplica2s().clear();
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
		case ToUseReplicaPackage.DOMAIN__TIME_LINES:
			return timeLines != null && !timeLines.isEmpty();
		case ToUseReplicaPackage.DOMAIN__TIME_LINE_REPLICAS:
			return timeLineReplicas != null && !timeLineReplicas.isEmpty();
		case ToUseReplicaPackage.DOMAIN__TIME_LINE_REPLICA2S:
			return timeLineReplica2s != null && !timeLineReplica2s.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainImpl
