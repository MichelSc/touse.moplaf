/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline.impl;

import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.touse.moplaf.timeline.tousetimeline.FunctionEarliestOutput;
import com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Earliest Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.FunctionEarliestOutputImpl#getEarliestOutput <em>Earliest Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionEarliestOutputImpl extends FunctionPossibleImpl implements FunctionEarliestOutput {
	/**
	 * The default value of the '{@link #getEarliestOutput() <em>Earliest Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarliestOutput()
	 * @generated
	 * @ordered
	 */
	protected static final Date EARLIEST_OUTPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEarliestOutput() <em>Earliest Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarliestOutput()
	 * @generated
	 * @ordered
	 */
	protected Date earliestOutput = EARLIEST_OUTPUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionEarliestOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TousetimelinePackage.Literals.FUNCTION_EARLIEST_OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEarliestOutput() {
		return earliestOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEarliestOutput(Date newEarliestOutput) {
		Date oldEarliestOutput = earliestOutput;
		earliestOutput = newEarliestOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TousetimelinePackage.FUNCTION_EARLIEST_OUTPUT__EARLIEST_OUTPUT, oldEarliestOutput, earliestOutput));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public void refresh() {
		Distribution distribution = this.getDistribution();
		Date earliestPossible  = distribution.getEarliestOutputPossible( 0.0f, // above
				                                                         this.getLimitMoment(), // after 
				                                                         this.getLimitDuration(),
				                                                         this.getLimitAmount());
		this.setEarliestOutput(earliestPossible);
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TousetimelinePackage.FUNCTION_EARLIEST_OUTPUT__EARLIEST_OUTPUT:
				return getEarliestOutput();
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
			case TousetimelinePackage.FUNCTION_EARLIEST_OUTPUT__EARLIEST_OUTPUT:
				setEarliestOutput((Date)newValue);
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
			case TousetimelinePackage.FUNCTION_EARLIEST_OUTPUT__EARLIEST_OUTPUT:
				setEarliestOutput(EARLIEST_OUTPUT_EDEFAULT);
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
			case TousetimelinePackage.FUNCTION_EARLIEST_OUTPUT__EARLIEST_OUTPUT:
				return EARLIEST_OUTPUT_EDEFAULT == null ? earliestOutput != null : !EARLIEST_OUTPUT_EDEFAULT.equals(earliestOutput);
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
		result.append(" (earliestOutput: ");
		result.append(earliestOutput);
		result.append(')');
		return result.toString();
	}

} //FunctionEarliestOutputImpl
