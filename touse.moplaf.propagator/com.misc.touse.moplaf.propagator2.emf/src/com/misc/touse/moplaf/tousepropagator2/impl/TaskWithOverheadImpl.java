/**
 */
package com.misc.touse.moplaf.tousepropagator2.impl;

import com.misc.touse.moplaf.tousepropagator2.Project;
import com.misc.touse.moplaf.tousepropagator2.TaskWithOverhead;
import com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task With Overhead</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.impl.TaskWithOverheadImpl#getHoursOverhead <em>Hours Overhead</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskWithOverheadImpl extends TaskImpl implements TaskWithOverhead {
	/**
	 * The default value of the '{@link #getHoursOverhead() <em>Hours Overhead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoursOverhead()
	 * @generated
	 * @ordered
	 */
	protected static final float HOURS_OVERHEAD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHoursOverhead() <em>Hours Overhead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoursOverhead()
	 * @generated
	 * @ordered
	 */
	protected float hoursOverhead = HOURS_OVERHEAD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskWithOverheadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUsePropagatorPackage.Literals.TASK_WITH_OVERHEAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHoursOverhead() {
		return hoursOverhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoursOverhead(float newHoursOverhead) {
		float oldHoursOverhead = hoursOverhead;
		hoursOverhead = newHoursOverhead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.TASK_WITH_OVERHEAD__HOURS_OVERHEAD, oldHoursOverhead, hoursOverhead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public void refreshHoursVar() {
		Project project = this.getProject();
		if ( project == null ) { return ; }
		float hours = project.getNofRes()*this.getHoursVarPerRes()+this.getHoursOverhead();
		this.setHoursVar(hours);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUsePropagatorPackage.TASK_WITH_OVERHEAD__HOURS_OVERHEAD:
				return getHoursOverhead();
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
			case ToUsePropagatorPackage.TASK_WITH_OVERHEAD__HOURS_OVERHEAD:
				setHoursOverhead((Float)newValue);
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
			case ToUsePropagatorPackage.TASK_WITH_OVERHEAD__HOURS_OVERHEAD:
				setHoursOverhead(HOURS_OVERHEAD_EDEFAULT);
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
			case ToUsePropagatorPackage.TASK_WITH_OVERHEAD__HOURS_OVERHEAD:
				return hoursOverhead != HOURS_OVERHEAD_EDEFAULT;
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
		result.append(" (HoursOverhead: ");
		result.append(hoursOverhead);
		result.append(')');
		return result.toString();
	}

} //TaskWithOverheadImpl
