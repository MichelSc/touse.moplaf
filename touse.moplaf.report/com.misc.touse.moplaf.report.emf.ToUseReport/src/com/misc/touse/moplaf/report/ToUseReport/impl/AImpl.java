/**
 */
package com.misc.touse.moplaf.report.ToUseReport.impl;

import com.misc.touse.moplaf.report.ToUseReport.A;
import com.misc.touse.moplaf.report.ToUseReport.B;
import com.misc.touse.moplaf.report.ToUseReport.ToUseReportPackage;

import java.util.Collection;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.report.ToUseReport.impl.AImpl#getBs <em>Bs</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.report.ToUseReport.impl.AImpl#getCode <em>Code</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.report.ToUseReport.impl.AImpl#getFragment <em>Fragment</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.report.ToUseReport.impl.AImpl#getSomeDateTime <em>Some Date Time</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.report.ToUseReport.impl.AImpl#getSomeReal <em>Some Real</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AImpl extends MinimalEObjectImpl.Container implements A {
	/**
	 * The cached value of the '{@link #getBs() <em>Bs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBs()
	 * @generated
	 * @ordered
	 */
	protected EList<B> bs;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFragment() <em>Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragment()
	 * @generated
	 * @ordered
	 */
	protected static final String FRAGMENT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSomeDateTime() <em>Some Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSomeDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date SOME_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSomeDateTime() <em>Some Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSomeDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date someDateTime = SOME_DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSomeReal() <em>Some Real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSomeReal()
	 * @generated
	 * @ordered
	 */
	protected static final float SOME_REAL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSomeReal() <em>Some Real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSomeReal()
	 * @generated
	 * @ordered
	 */
	protected float someReal = SOME_REAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseReportPackage.Literals.A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<B> getBs() {
		if (bs == null) {
			bs = new EObjectContainmentEList<B>(B.class, this, ToUseReportPackage.A__BS);
		}
		return bs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseReportPackage.A__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getFragment() {
		Resource resource = this.eResource();
		String fragment = resource.getURIFragment(this);
		return fragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getSomeDateTime() {
		return someDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSomeDateTime(Date newSomeDateTime) {
		Date oldSomeDateTime = someDateTime;
		someDateTime = newSomeDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseReportPackage.A__SOME_DATE_TIME, oldSomeDateTime, someDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSomeReal() {
		return someReal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSomeReal(float newSomeReal) {
		float oldSomeReal = someReal;
		someReal = newSomeReal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseReportPackage.A__SOME_REAL, oldSomeReal, someReal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToUseReportPackage.A__BS:
				return ((InternalEList<?>)getBs()).basicRemove(otherEnd, msgs);
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
			case ToUseReportPackage.A__BS:
				return getBs();
			case ToUseReportPackage.A__CODE:
				return getCode();
			case ToUseReportPackage.A__FRAGMENT:
				return getFragment();
			case ToUseReportPackage.A__SOME_DATE_TIME:
				return getSomeDateTime();
			case ToUseReportPackage.A__SOME_REAL:
				return getSomeReal();
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
			case ToUseReportPackage.A__BS:
				getBs().clear();
				getBs().addAll((Collection<? extends B>)newValue);
				return;
			case ToUseReportPackage.A__CODE:
				setCode((String)newValue);
				return;
			case ToUseReportPackage.A__SOME_DATE_TIME:
				setSomeDateTime((Date)newValue);
				return;
			case ToUseReportPackage.A__SOME_REAL:
				setSomeReal((Float)newValue);
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
			case ToUseReportPackage.A__BS:
				getBs().clear();
				return;
			case ToUseReportPackage.A__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case ToUseReportPackage.A__SOME_DATE_TIME:
				setSomeDateTime(SOME_DATE_TIME_EDEFAULT);
				return;
			case ToUseReportPackage.A__SOME_REAL:
				setSomeReal(SOME_REAL_EDEFAULT);
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
			case ToUseReportPackage.A__BS:
				return bs != null && !bs.isEmpty();
			case ToUseReportPackage.A__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case ToUseReportPackage.A__FRAGMENT:
				return FRAGMENT_EDEFAULT == null ? getFragment() != null : !FRAGMENT_EDEFAULT.equals(getFragment());
			case ToUseReportPackage.A__SOME_DATE_TIME:
				return SOME_DATE_TIME_EDEFAULT == null ? someDateTime != null : !SOME_DATE_TIME_EDEFAULT.equals(someDateTime);
			case ToUseReportPackage.A__SOME_REAL:
				return someReal != SOME_REAL_EDEFAULT;
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
		result.append(" (Code: ");
		result.append(code);
		result.append(", SomeDateTime: ");
		result.append(someDateTime);
		result.append(", SomeReal: ");
		result.append(someReal);
		result.append(')');
		return result.toString();
	}

} //AImpl
