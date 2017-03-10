/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline.impl;

import com.misc.common.moplaf.propagator2.impl.ObjectWithPropagatorFunctionsImpl;
import com.misc.touse.moplaf.timeline.tousetimeline.DomainDistribution;
import com.misc.touse.moplaf.timeline.tousetimeline.FunctionPossible;
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
 * An implementation of the model object '<em><b>Function Possible</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.FunctionPossibleImpl#getLimitMoment <em>Limit Moment</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.FunctionPossibleImpl#getLimitDuration <em>Limit Duration</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.FunctionPossibleImpl#getLimitAmount <em>Limit Amount</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.FunctionPossibleImpl#getDistribution <em>Distribution</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FunctionPossibleImpl extends ObjectWithPropagatorFunctionsImpl implements FunctionPossible {
	/**
	 * The default value of the '{@link #getLimitMoment() <em>Limit Moment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitMoment()
	 * @generated
	 * @ordered
	 */
	protected static final Date LIMIT_MOMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLimitMoment() <em>Limit Moment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitMoment()
	 * @generated
	 * @ordered
	 */
	protected Date limitMoment = LIMIT_MOMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLimitDuration() <em>Limit Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitDuration()
	 * @generated
	 * @ordered
	 */
	protected static final float LIMIT_DURATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLimitDuration() <em>Limit Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitDuration()
	 * @generated
	 * @ordered
	 */
	protected float limitDuration = LIMIT_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLimitAmount() <em>Limit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float LIMIT_AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLimitAmount() <em>Limit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitAmount()
	 * @generated
	 * @ordered
	 */
	protected float limitAmount = LIMIT_AMOUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionPossibleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseTimeLinePackage.Literals.FUNCTION_POSSIBLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLimitMoment() {
		return limitMoment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimitMoment(Date newLimitMoment) {
		Date oldLimitMoment = limitMoment;
		limitMoment = newLimitMoment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseTimeLinePackage.FUNCTION_POSSIBLE__LIMIT_MOMENT, oldLimitMoment, limitMoment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLimitDuration() {
		return limitDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimitDuration(float newLimitDuration) {
		float oldLimitDuration = limitDuration;
		limitDuration = newLimitDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseTimeLinePackage.FUNCTION_POSSIBLE__LIMIT_DURATION, oldLimitDuration, limitDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLimitAmount() {
		return limitAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimitAmount(float newLimitAmount) {
		float oldLimitAmount = limitAmount;
		limitAmount = newLimitAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseTimeLinePackage.FUNCTION_POSSIBLE__LIMIT_AMOUNT, oldLimitAmount, limitAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainDistribution getDistribution() {
		if (eContainerFeatureID() != ToUseTimeLinePackage.FUNCTION_POSSIBLE__DISTRIBUTION) return null;
		return (DomainDistribution)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistribution(DomainDistribution newDistribution, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDistribution, ToUseTimeLinePackage.FUNCTION_POSSIBLE__DISTRIBUTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistribution(DomainDistribution newDistribution) {
		if (newDistribution != eInternalContainer() || (eContainerFeatureID() != ToUseTimeLinePackage.FUNCTION_POSSIBLE__DISTRIBUTION && newDistribution != null)) {
			if (EcoreUtil.isAncestor(this, newDistribution))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDistribution != null)
				msgs = ((InternalEObject)newDistribution).eInverseAdd(this, ToUseTimeLinePackage.DOMAIN_DISTRIBUTION__POSSIBLES, DomainDistribution.class, msgs);
			msgs = basicSetDistribution(newDistribution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseTimeLinePackage.FUNCTION_POSSIBLE__DISTRIBUTION, newDistribution, newDistribution));
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
			case ToUseTimeLinePackage.FUNCTION_POSSIBLE__DISTRIBUTION:
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
			case ToUseTimeLinePackage.FUNCTION_POSSIBLE__DISTRIBUTION:
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
			case ToUseTimeLinePackage.FUNCTION_POSSIBLE__DISTRIBUTION:
				return eInternalContainer().eInverseRemove(this, ToUseTimeLinePackage.DOMAIN_DISTRIBUTION__POSSIBLES, DomainDistribution.class, msgs);
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
			case ToUseTimeLinePackage.FUNCTION_POSSIBLE__LIMIT_MOMENT:
				return getLimitMoment();
			case ToUseTimeLinePackage.FUNCTION_POSSIBLE__LIMIT_DURATION:
				return getLimitDuration();
			case ToUseTimeLinePackage.FUNCTION_POSSIBLE__LIMIT_AMOUNT:
				return getLimitAmount();
			case ToUseTimeLinePackage.FUNCTION_POSSIBLE__DISTRIBUTION:
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
			case ToUseTimeLinePackage.FUNCTION_POSSIBLE__LIMIT_MOMENT:
				setLimitMoment((Date)newValue);
				return;
			case ToUseTimeLinePackage.FUNCTION_POSSIBLE__LIMIT_DURATION:
				setLimitDuration((Float)newValue);
				return;
			case ToUseTimeLinePackage.FUNCTION_POSSIBLE__LIMIT_AMOUNT:
				setLimitAmount((Float)newValue);
				return;
			case ToUseTimeLinePackage.FUNCTION_POSSIBLE__DISTRIBUTION:
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
			case ToUseTimeLinePackage.FUNCTION_POSSIBLE__LIMIT_MOMENT:
				setLimitMoment(LIMIT_MOMENT_EDEFAULT);
				return;
			case ToUseTimeLinePackage.FUNCTION_POSSIBLE__LIMIT_DURATION:
				setLimitDuration(LIMIT_DURATION_EDEFAULT);
				return;
			case ToUseTimeLinePackage.FUNCTION_POSSIBLE__LIMIT_AMOUNT:
				setLimitAmount(LIMIT_AMOUNT_EDEFAULT);
				return;
			case ToUseTimeLinePackage.FUNCTION_POSSIBLE__DISTRIBUTION:
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
			case ToUseTimeLinePackage.FUNCTION_POSSIBLE__LIMIT_MOMENT:
				return LIMIT_MOMENT_EDEFAULT == null ? limitMoment != null : !LIMIT_MOMENT_EDEFAULT.equals(limitMoment);
			case ToUseTimeLinePackage.FUNCTION_POSSIBLE__LIMIT_DURATION:
				return limitDuration != LIMIT_DURATION_EDEFAULT;
			case ToUseTimeLinePackage.FUNCTION_POSSIBLE__LIMIT_AMOUNT:
				return limitAmount != LIMIT_AMOUNT_EDEFAULT;
			case ToUseTimeLinePackage.FUNCTION_POSSIBLE__DISTRIBUTION:
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
			case ToUseTimeLinePackage.FUNCTION_POSSIBLE___REFRESH:
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
		result.append(" (limitMoment: ");
		result.append(limitMoment);
		result.append(", limitDuration: ");
		result.append(limitDuration);
		result.append(", limitAmount: ");
		result.append(limitAmount);
		result.append(')');
		return result.toString();
	}

} //FunctionPossibleImpl
