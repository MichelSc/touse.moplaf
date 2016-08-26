/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline.impl;

import com.misc.touse.moplaf.timeline.tousetimeline.SomeBaseClass;
import com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Some Base Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.SomeBaseClassImpl#getSomeAttribute <em>Some Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SomeBaseClassImpl extends MinimalEObjectImpl.Container implements SomeBaseClass {
	/**
	 * The default value of the '{@link #getSomeAttribute() <em>Some Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSomeAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final String SOME_ATTRIBUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSomeAttribute() <em>Some Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSomeAttribute()
	 * @generated
	 * @ordered
	 */
	protected String someAttribute = SOME_ATTRIBUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SomeBaseClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TousetimelinePackage.Literals.SOME_BASE_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSomeAttribute() {
		return someAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSomeAttribute(String newSomeAttribute) {
		String oldSomeAttribute = someAttribute;
		someAttribute = newSomeAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TousetimelinePackage.SOME_BASE_CLASS__SOME_ATTRIBUTE, oldSomeAttribute, someAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void someOperation() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TousetimelinePackage.SOME_BASE_CLASS__SOME_ATTRIBUTE:
				return getSomeAttribute();
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
			case TousetimelinePackage.SOME_BASE_CLASS__SOME_ATTRIBUTE:
				setSomeAttribute((String)newValue);
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
			case TousetimelinePackage.SOME_BASE_CLASS__SOME_ATTRIBUTE:
				setSomeAttribute(SOME_ATTRIBUTE_EDEFAULT);
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
			case TousetimelinePackage.SOME_BASE_CLASS__SOME_ATTRIBUTE:
				return SOME_ATTRIBUTE_EDEFAULT == null ? someAttribute != null : !SOME_ATTRIBUTE_EDEFAULT.equals(someAttribute);
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
			case TousetimelinePackage.SOME_BASE_CLASS___SOME_OPERATION:
				someOperation();
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
		result.append(" (someAttribute: ");
		result.append(someAttribute);
		result.append(')');
		return result.toString();
	}

} //SomeBaseClassImpl
