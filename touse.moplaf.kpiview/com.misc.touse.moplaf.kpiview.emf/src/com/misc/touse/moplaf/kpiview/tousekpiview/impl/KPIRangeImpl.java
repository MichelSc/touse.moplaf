/**
 */
package com.misc.touse.moplaf.kpiview.tousekpiview.impl;

import com.misc.touse.moplaf.kpiview.tousekpiview.KPIRange;
import com.misc.touse.moplaf.kpiview.tousekpiview.ToUseKpiViewPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KPI Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.kpiview.tousekpiview.impl.KPIRangeImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.kpiview.tousekpiview.impl.KPIRangeImpl#getColor <em>Color</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.kpiview.tousekpiview.impl.KPIRangeImpl#getLowValue <em>Low Value</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.kpiview.tousekpiview.impl.KPIRangeImpl#getHighValue <em>High Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KPIRangeImpl extends MinimalEObjectImpl.Container implements KPIRange {
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
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final int COLOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected int color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowValue() <em>Low Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowValue()
	 * @generated
	 * @ordered
	 */
	protected static final float LOW_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLowValue() <em>Low Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowValue()
	 * @generated
	 * @ordered
	 */
	protected float lowValue = LOW_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHighValue() <em>High Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighValue()
	 * @generated
	 * @ordered
	 */
	protected static final float HIGH_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHighValue() <em>High Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighValue()
	 * @generated
	 * @ordered
	 */
	protected float highValue = HIGH_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KPIRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseKpiViewPackage.Literals.KPI_RANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLowValue() {
		return lowValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowValue(float newLowValue) {
		float oldLowValue = lowValue;
		lowValue = newLowValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseKpiViewPackage.KPI_RANGE__LOW_VALUE, oldLowValue, lowValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHighValue() {
		return highValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHighValue(float newHighValue) {
		float oldHighValue = highValue;
		highValue = newHighValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseKpiViewPackage.KPI_RANGE__HIGH_VALUE, oldHighValue, highValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(int newColor) {
		int oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseKpiViewPackage.KPI_RANGE__COLOR, oldColor, color));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseKpiViewPackage.KPI_RANGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUseKpiViewPackage.KPI_RANGE__NAME:
				return getName();
			case ToUseKpiViewPackage.KPI_RANGE__COLOR:
				return getColor();
			case ToUseKpiViewPackage.KPI_RANGE__LOW_VALUE:
				return getLowValue();
			case ToUseKpiViewPackage.KPI_RANGE__HIGH_VALUE:
				return getHighValue();
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
			case ToUseKpiViewPackage.KPI_RANGE__NAME:
				setName((String)newValue);
				return;
			case ToUseKpiViewPackage.KPI_RANGE__COLOR:
				setColor((Integer)newValue);
				return;
			case ToUseKpiViewPackage.KPI_RANGE__LOW_VALUE:
				setLowValue((Float)newValue);
				return;
			case ToUseKpiViewPackage.KPI_RANGE__HIGH_VALUE:
				setHighValue((Float)newValue);
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
			case ToUseKpiViewPackage.KPI_RANGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ToUseKpiViewPackage.KPI_RANGE__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case ToUseKpiViewPackage.KPI_RANGE__LOW_VALUE:
				setLowValue(LOW_VALUE_EDEFAULT);
				return;
			case ToUseKpiViewPackage.KPI_RANGE__HIGH_VALUE:
				setHighValue(HIGH_VALUE_EDEFAULT);
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
			case ToUseKpiViewPackage.KPI_RANGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ToUseKpiViewPackage.KPI_RANGE__COLOR:
				return color != COLOR_EDEFAULT;
			case ToUseKpiViewPackage.KPI_RANGE__LOW_VALUE:
				return lowValue != LOW_VALUE_EDEFAULT;
			case ToUseKpiViewPackage.KPI_RANGE__HIGH_VALUE:
				return highValue != HIGH_VALUE_EDEFAULT;
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
		result.append(", Color: ");
		result.append(color);
		result.append(", LowValue: ");
		result.append(lowValue);
		result.append(", HighValue: ");
		result.append(highValue);
		result.append(')');
		return result.toString();
	}

} //KPIRangeImpl
