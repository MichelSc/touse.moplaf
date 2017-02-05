/**
 */
package com.misc.touse.moplaf.tousepropagator2.impl;

import com.misc.common.moplaf.propagator2.impl.PropagatorFunctionImpl;

import com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorFunction;
import com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorFunctionImpl#isCalculated <em>Calculated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToUsePropagatorFunctionImpl extends PropagatorFunctionImpl implements ToUsePropagatorFunction {
	/**
	 * The default value of the '{@link #isCalculated() <em>Calculated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCalculated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CALCULATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCalculated() <em>Calculated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCalculated()
	 * @generated
	 * @ordered
	 */
	protected boolean calculated = CALCULATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUsePropagatorFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUsePropagatorPackage.Literals.TO_USE_PROPAGATOR_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCalculated() {
		return calculated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalculated(boolean newCalculated) {
		boolean oldCalculated = calculated;
		calculated = newCalculated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION__CALCULATED, oldCalculated, calculated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION__CALCULATED:
				return isCalculated();
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
			case ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION__CALCULATED:
				setCalculated((Boolean)newValue);
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
			case ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION__CALCULATED:
				setCalculated(CALCULATED_EDEFAULT);
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
			case ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION__CALCULATED:
				return calculated != CALCULATED_EDEFAULT;
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
		result.append(" (Calculated: ");
		result.append(calculated);
		result.append(')');
		return result.toString();
	}

	/**
	 * This will be called by the framework every time so function must be calculated
	 */
	@Override
	protected void doRefreshImpl() {
		// TODO Auto-generated method stub
		super.doRefreshImpl();
		this.setCalculated(true); 
	}
	
	
	
	

} //ToUsePropagatorFunctionImpl
