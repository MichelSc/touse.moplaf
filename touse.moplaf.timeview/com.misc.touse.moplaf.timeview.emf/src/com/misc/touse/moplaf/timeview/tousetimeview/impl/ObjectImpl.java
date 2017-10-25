/**
 */
package com.misc.touse.moplaf.timeview.tousetimeview.impl;

import com.misc.touse.moplaf.timeview.tousetimeview.TimeLine;
import com.misc.touse.moplaf.timeview.tousetimeview.ToUseTimeViewPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.timeview.tousetimeview.impl.ObjectImpl#getSubObjects <em>Sub Objects</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeview.tousetimeview.impl.ObjectImpl#getTimeLines <em>Time Lines</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeview.tousetimeview.impl.ObjectImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectImpl extends MinimalEObjectImpl.Container implements com.misc.touse.moplaf.timeview.tousetimeview.Object {
	/**
	 * The cached value of the '{@link #getSubObjects() <em>Sub Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<com.misc.touse.moplaf.timeview.tousetimeview.Object> subObjects;

	/**
	 * The cached value of the '{@link #getTimeLines() <em>Time Lines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeLines()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeLine> timeLines;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseTimeViewPackage.Literals.OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<com.misc.touse.moplaf.timeview.tousetimeview.Object> getSubObjects() {
		if (subObjects == null) {
			subObjects = new EObjectContainmentEList<com.misc.touse.moplaf.timeview.tousetimeview.Object>(com.misc.touse.moplaf.timeview.tousetimeview.Object.class, this, ToUseTimeViewPackage.OBJECT__SUB_OBJECTS);
		}
		return subObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeLine> getTimeLines() {
		if (timeLines == null) {
			timeLines = new EObjectContainmentEList<TimeLine>(TimeLine.class, this, ToUseTimeViewPackage.OBJECT__TIME_LINES);
		}
		return timeLines;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseTimeViewPackage.OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToUseTimeViewPackage.OBJECT__SUB_OBJECTS:
				return ((InternalEList<?>)getSubObjects()).basicRemove(otherEnd, msgs);
			case ToUseTimeViewPackage.OBJECT__TIME_LINES:
				return ((InternalEList<?>)getTimeLines()).basicRemove(otherEnd, msgs);
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
			case ToUseTimeViewPackage.OBJECT__SUB_OBJECTS:
				return getSubObjects();
			case ToUseTimeViewPackage.OBJECT__TIME_LINES:
				return getTimeLines();
			case ToUseTimeViewPackage.OBJECT__NAME:
				return getName();
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
			case ToUseTimeViewPackage.OBJECT__SUB_OBJECTS:
				getSubObjects().clear();
				getSubObjects().addAll((Collection<? extends com.misc.touse.moplaf.timeview.tousetimeview.Object>)newValue);
				return;
			case ToUseTimeViewPackage.OBJECT__TIME_LINES:
				getTimeLines().clear();
				getTimeLines().addAll((Collection<? extends TimeLine>)newValue);
				return;
			case ToUseTimeViewPackage.OBJECT__NAME:
				setName((String)newValue);
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
			case ToUseTimeViewPackage.OBJECT__SUB_OBJECTS:
				getSubObjects().clear();
				return;
			case ToUseTimeViewPackage.OBJECT__TIME_LINES:
				getTimeLines().clear();
				return;
			case ToUseTimeViewPackage.OBJECT__NAME:
				setName(NAME_EDEFAULT);
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
			case ToUseTimeViewPackage.OBJECT__SUB_OBJECTS:
				return subObjects != null && !subObjects.isEmpty();
			case ToUseTimeViewPackage.OBJECT__TIME_LINES:
				return timeLines != null && !timeLines.isEmpty();
			case ToUseTimeViewPackage.OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //ObjectImpl
