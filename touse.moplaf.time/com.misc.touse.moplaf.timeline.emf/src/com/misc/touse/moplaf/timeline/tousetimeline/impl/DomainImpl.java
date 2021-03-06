/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline.impl;

import com.misc.common.moplaf.propagator2.impl.ObjectWithPropagatorFunctionsImpl;
import com.misc.common.moplaf.time.discrete.TimeLine;
import com.misc.common.moplaf.time.discrete.TimeLineMerge;
import com.misc.touse.moplaf.timeline.tousetimeline.ConcreteObjectWithTimeLine;
import com.misc.touse.moplaf.timeline.tousetimeline.Domain;
import com.misc.touse.moplaf.timeline.tousetimeline.DomainDistribution;
import com.misc.touse.moplaf.timeline.tousetimeline.ToUseTimeLinePackage;
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
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.DomainImpl#getTimeLineMerges <em>Time Line Merges</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.DomainImpl#getDistribution <em>Distribution</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.DomainImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.DomainImpl#getTimelines <em>Timelines</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.DomainImpl#getObjectsWithTimeLine <em>Objects With Time Line</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainImpl extends ObjectWithPropagatorFunctionsImpl implements Domain {
	/**
	 * The cached value of the '{@link #getTimeLineMerges() <em>Time Line Merges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeLineMerges()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeLineMerge> timeLineMerges;

	/**
	 * The cached value of the '{@link #getDistribution() <em>Distribution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainDistribution> distribution;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTimelines() <em>Timelines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimelines()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeLine> timelines;

	/**
	 * The cached value of the '{@link #getObjectsWithTimeLine() <em>Objects With Time Line</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectsWithTimeLine()
	 * @generated
	 * @ordered
	 */
	protected EList<ConcreteObjectWithTimeLine> objectsWithTimeLine;

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
		return ToUseTimeLinePackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeLineMerge> getTimeLineMerges() {
		if (timeLineMerges == null) {
			timeLineMerges = new EObjectContainmentEList<TimeLineMerge>(TimeLineMerge.class, this, ToUseTimeLinePackage.DOMAIN__TIME_LINE_MERGES);
		}
		return timeLineMerges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainDistribution> getDistribution() {
		if (distribution == null) {
			distribution = new EObjectContainmentEList<DomainDistribution>(DomainDistribution.class, this, ToUseTimeLinePackage.DOMAIN__DISTRIBUTION);
		}
		return distribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseTimeLinePackage.DOMAIN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeLine> getTimelines() {
		if (timelines == null) {
			timelines = new EObjectContainmentEList<TimeLine>(TimeLine.class, this, ToUseTimeLinePackage.DOMAIN__TIMELINES);
		}
		return timelines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConcreteObjectWithTimeLine> getObjectsWithTimeLine() {
		if (objectsWithTimeLine == null) {
			objectsWithTimeLine = new EObjectContainmentEList<ConcreteObjectWithTimeLine>(ConcreteObjectWithTimeLine.class, this, ToUseTimeLinePackage.DOMAIN__OBJECTS_WITH_TIME_LINE);
		}
		return objectsWithTimeLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refresh() {
		this.refreshDistributions();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshDistributions() {
		// TODO implement it procedurally
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToUseTimeLinePackage.DOMAIN__TIME_LINE_MERGES:
				return ((InternalEList<?>)getTimeLineMerges()).basicRemove(otherEnd, msgs);
			case ToUseTimeLinePackage.DOMAIN__DISTRIBUTION:
				return ((InternalEList<?>)getDistribution()).basicRemove(otherEnd, msgs);
			case ToUseTimeLinePackage.DOMAIN__TIMELINES:
				return ((InternalEList<?>)getTimelines()).basicRemove(otherEnd, msgs);
			case ToUseTimeLinePackage.DOMAIN__OBJECTS_WITH_TIME_LINE:
				return ((InternalEList<?>)getObjectsWithTimeLine()).basicRemove(otherEnd, msgs);
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
			case ToUseTimeLinePackage.DOMAIN__TIME_LINE_MERGES:
				return getTimeLineMerges();
			case ToUseTimeLinePackage.DOMAIN__DISTRIBUTION:
				return getDistribution();
			case ToUseTimeLinePackage.DOMAIN__NAME:
				return getName();
			case ToUseTimeLinePackage.DOMAIN__TIMELINES:
				return getTimelines();
			case ToUseTimeLinePackage.DOMAIN__OBJECTS_WITH_TIME_LINE:
				return getObjectsWithTimeLine();
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
			case ToUseTimeLinePackage.DOMAIN__TIME_LINE_MERGES:
				getTimeLineMerges().clear();
				getTimeLineMerges().addAll((Collection<? extends TimeLineMerge>)newValue);
				return;
			case ToUseTimeLinePackage.DOMAIN__DISTRIBUTION:
				getDistribution().clear();
				getDistribution().addAll((Collection<? extends DomainDistribution>)newValue);
				return;
			case ToUseTimeLinePackage.DOMAIN__NAME:
				setName((String)newValue);
				return;
			case ToUseTimeLinePackage.DOMAIN__TIMELINES:
				getTimelines().clear();
				getTimelines().addAll((Collection<? extends TimeLine>)newValue);
				return;
			case ToUseTimeLinePackage.DOMAIN__OBJECTS_WITH_TIME_LINE:
				getObjectsWithTimeLine().clear();
				getObjectsWithTimeLine().addAll((Collection<? extends ConcreteObjectWithTimeLine>)newValue);
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
			case ToUseTimeLinePackage.DOMAIN__TIME_LINE_MERGES:
				getTimeLineMerges().clear();
				return;
			case ToUseTimeLinePackage.DOMAIN__DISTRIBUTION:
				getDistribution().clear();
				return;
			case ToUseTimeLinePackage.DOMAIN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ToUseTimeLinePackage.DOMAIN__TIMELINES:
				getTimelines().clear();
				return;
			case ToUseTimeLinePackage.DOMAIN__OBJECTS_WITH_TIME_LINE:
				getObjectsWithTimeLine().clear();
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
			case ToUseTimeLinePackage.DOMAIN__TIME_LINE_MERGES:
				return timeLineMerges != null && !timeLineMerges.isEmpty();
			case ToUseTimeLinePackage.DOMAIN__DISTRIBUTION:
				return distribution != null && !distribution.isEmpty();
			case ToUseTimeLinePackage.DOMAIN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ToUseTimeLinePackage.DOMAIN__TIMELINES:
				return timelines != null && !timelines.isEmpty();
			case ToUseTimeLinePackage.DOMAIN__OBJECTS_WITH_TIME_LINE:
				return objectsWithTimeLine != null && !objectsWithTimeLine.isEmpty();
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DomainImpl
