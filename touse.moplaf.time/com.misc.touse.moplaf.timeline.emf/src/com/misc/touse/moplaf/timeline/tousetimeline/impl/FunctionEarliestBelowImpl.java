/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline.impl;

import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.touse.moplaf.timeline.tousetimeline.FunctionEarliestBelow;
import com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Earliest Below</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.FunctionEarliestBelowImpl#getEarliestBelow <em>Earliest Below</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionEarliestBelowImpl extends FunctionPossibleImpl implements FunctionEarliestBelow {
	/**
	 * The default value of the '{@link #getEarliestBelow() <em>Earliest Below</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarliestBelow()
	 * @generated
	 * @ordered
	 */
	protected static final Date EARLIEST_BELOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEarliestBelow() <em>Earliest Below</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarliestBelow()
	 * @generated
	 * @ordered
	 */
	protected Date earliestBelow = EARLIEST_BELOW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionEarliestBelowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TousetimelinePackage.Literals.FUNCTION_EARLIEST_BELOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEarliestBelow() {
		return earliestBelow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEarliestBelow(Date newEarliestBelow) {
		Date oldEarliestBelow = earliestBelow;
		earliestBelow = newEarliestBelow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TousetimelinePackage.FUNCTION_EARLIEST_BELOW__EARLIEST_BELOW, oldEarliestBelow, earliestBelow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public void refresh() {
		Distribution distribution = this.getDistribution();
		Date moment  = distribution.getEarliestBelow(this.getLimitMoment(), 
				                                      this.getLimitDuration(),  
				                                      this.getLimitAmount());
		this.setEarliestBelow(moment);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TousetimelinePackage.FUNCTION_EARLIEST_BELOW__EARLIEST_BELOW:
				return getEarliestBelow();
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
			case TousetimelinePackage.FUNCTION_EARLIEST_BELOW__EARLIEST_BELOW:
				setEarliestBelow((Date)newValue);
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
			case TousetimelinePackage.FUNCTION_EARLIEST_BELOW__EARLIEST_BELOW:
				setEarliestBelow(EARLIEST_BELOW_EDEFAULT);
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
			case TousetimelinePackage.FUNCTION_EARLIEST_BELOW__EARLIEST_BELOW:
				return EARLIEST_BELOW_EDEFAULT == null ? earliestBelow != null : !EARLIEST_BELOW_EDEFAULT.equals(earliestBelow);
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
		result.append(" (earliestBelow: ");
		result.append(earliestBelow);
		result.append(')');
		return result.toString();
	}

} //FunctionEarliestBelowImpl
