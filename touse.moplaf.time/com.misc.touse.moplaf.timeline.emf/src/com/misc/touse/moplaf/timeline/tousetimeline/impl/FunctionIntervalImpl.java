/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline.impl;


import com.misc.common.moplaf.propagator2.impl.ObjectWithPropagatorFunctionsImpl;
import com.misc.touse.moplaf.timeline.tousetimeline.DomainDistribution;
import com.misc.touse.moplaf.timeline.tousetimeline.FunctionInterval;
import com.misc.touse.moplaf.timeline.tousetimeline.ToUseTimeLinePackage;
import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.FunctionIntervalImpl#getFrom <em>From</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.FunctionIntervalImpl#getTo <em>To</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.FunctionIntervalImpl#getDistribution <em>Distribution</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FunctionIntervalImpl extends ObjectWithPropagatorFunctionsImpl implements FunctionInterval {

	/**
	 * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Date from = FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected static final Date TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected Date to = TO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionIntervalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseTimeLinePackage.Literals.FUNCTION_INTERVAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(Date newFrom) {
		Date oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseTimeLinePackage.FUNCTION_INTERVAL__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(Date newTo) {
		Date oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseTimeLinePackage.FUNCTION_INTERVAL__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainDistribution getDistribution() {
		if (eContainerFeatureID() != ToUseTimeLinePackage.FUNCTION_INTERVAL__DISTRIBUTION) return null;
		return (DomainDistribution)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistribution(DomainDistribution newDistribution, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDistribution, ToUseTimeLinePackage.FUNCTION_INTERVAL__DISTRIBUTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistribution(DomainDistribution newDistribution) {
		if (newDistribution != eInternalContainer() || (eContainerFeatureID() != ToUseTimeLinePackage.FUNCTION_INTERVAL__DISTRIBUTION && newDistribution != null)) {
			if (EcoreUtil.isAncestor(this, newDistribution))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDistribution != null)
				msgs = ((InternalEObject)newDistribution).eInverseAdd(this, ToUseTimeLinePackage.DOMAIN_DISTRIBUTION__FUNCTIONS, DomainDistribution.class, msgs);
			msgs = basicSetDistribution(newDistribution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseTimeLinePackage.FUNCTION_INTERVAL__DISTRIBUTION, newDistribution, newDistribution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void refresh() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToUseTimeLinePackage.FUNCTION_INTERVAL__DISTRIBUTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDistribution((DomainDistribution)otherEnd, msgs);
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
			case ToUseTimeLinePackage.FUNCTION_INTERVAL__DISTRIBUTION:
				return basicSetDistribution(null, msgs);
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
			case ToUseTimeLinePackage.FUNCTION_INTERVAL__DISTRIBUTION:
				return eInternalContainer().eInverseRemove(this, ToUseTimeLinePackage.DOMAIN_DISTRIBUTION__FUNCTIONS, DomainDistribution.class, msgs);
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
			case ToUseTimeLinePackage.FUNCTION_INTERVAL__FROM:
				return getFrom();
			case ToUseTimeLinePackage.FUNCTION_INTERVAL__TO:
				return getTo();
			case ToUseTimeLinePackage.FUNCTION_INTERVAL__DISTRIBUTION:
				return getDistribution();
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
			case ToUseTimeLinePackage.FUNCTION_INTERVAL__FROM:
				setFrom((Date)newValue);
				return;
			case ToUseTimeLinePackage.FUNCTION_INTERVAL__TO:
				setTo((Date)newValue);
				return;
			case ToUseTimeLinePackage.FUNCTION_INTERVAL__DISTRIBUTION:
				setDistribution((DomainDistribution)newValue);
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
			case ToUseTimeLinePackage.FUNCTION_INTERVAL__FROM:
				setFrom(FROM_EDEFAULT);
				return;
			case ToUseTimeLinePackage.FUNCTION_INTERVAL__TO:
				setTo(TO_EDEFAULT);
				return;
			case ToUseTimeLinePackage.FUNCTION_INTERVAL__DISTRIBUTION:
				setDistribution((DomainDistribution)null);
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
			case ToUseTimeLinePackage.FUNCTION_INTERVAL__FROM:
				return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
			case ToUseTimeLinePackage.FUNCTION_INTERVAL__TO:
				return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
			case ToUseTimeLinePackage.FUNCTION_INTERVAL__DISTRIBUTION:
				return getDistribution() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ToUseTimeLinePackage.FUNCTION_INTERVAL___REFRESH:
				refresh();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (from: ");
		result.append(from);
		result.append(", to: ");
		result.append(to);
		result.append(')');
		return result.toString();
	}

} //FunctionIntervalImpl
