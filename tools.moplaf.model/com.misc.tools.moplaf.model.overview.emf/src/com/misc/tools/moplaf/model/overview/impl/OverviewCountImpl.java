/**
 */
package com.misc.tools.moplaf.model.overview.impl;

import com.misc.tools.moplaf.model.overview.ModelOverviewPackage;
import com.misc.tools.moplaf.model.overview.OverviewCount;

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
 * An implementation of the model object '<em><b>Overview Count</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.tools.moplaf.model.overview.impl.OverviewCountImpl#getCount <em>Count</em>}</li>
 *   <li>{@link com.misc.tools.moplaf.model.overview.impl.OverviewCountImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link com.misc.tools.moplaf.model.overview.impl.OverviewCountImpl#getSubTypes <em>Sub Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OverviewCountImpl extends MinimalEObjectImpl.Container implements OverviewCount {
	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected int count = COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected EClass class_;

	/**
	 * The cached value of the '{@link #getSubTypes() <em>Sub Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<OverviewCount> subTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OverviewCountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelOverviewPackage.Literals.OVERVIEW_COUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(int newCount) {
		int oldCount = count;
		count = newCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelOverviewPackage.OVERVIEW_COUNT__COUNT, oldCount, count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		if (class_ != null && class_.eIsProxy()) {
			InternalEObject oldClass = (InternalEObject)class_;
			class_ = (EClass)eResolveProxy(oldClass);
			if (class_ != oldClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelOverviewPackage.OVERVIEW_COUNT__CLASS, oldClass, class_));
			}
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetClass() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(EClass newClass) {
		EClass oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelOverviewPackage.OVERVIEW_COUNT__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OverviewCount> getSubTypes() {
		if (subTypes == null) {
			subTypes = new EObjectContainmentEList<OverviewCount>(OverviewCount.class, this, ModelOverviewPackage.OVERVIEW_COUNT__SUB_TYPES);
		}
		return subTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelOverviewPackage.OVERVIEW_COUNT__SUB_TYPES:
				return ((InternalEList<?>)getSubTypes()).basicRemove(otherEnd, msgs);
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
			case ModelOverviewPackage.OVERVIEW_COUNT__COUNT:
				return getCount();
			case ModelOverviewPackage.OVERVIEW_COUNT__CLASS:
				if (resolve) return getClass_();
				return basicGetClass();
			case ModelOverviewPackage.OVERVIEW_COUNT__SUB_TYPES:
				return getSubTypes();
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
			case ModelOverviewPackage.OVERVIEW_COUNT__COUNT:
				setCount((Integer)newValue);
				return;
			case ModelOverviewPackage.OVERVIEW_COUNT__CLASS:
				setClass((EClass)newValue);
				return;
			case ModelOverviewPackage.OVERVIEW_COUNT__SUB_TYPES:
				getSubTypes().clear();
				getSubTypes().addAll((Collection<? extends OverviewCount>)newValue);
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
			case ModelOverviewPackage.OVERVIEW_COUNT__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
			case ModelOverviewPackage.OVERVIEW_COUNT__CLASS:
				setClass((EClass)null);
				return;
			case ModelOverviewPackage.OVERVIEW_COUNT__SUB_TYPES:
				getSubTypes().clear();
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
			case ModelOverviewPackage.OVERVIEW_COUNT__COUNT:
				return count != COUNT_EDEFAULT;
			case ModelOverviewPackage.OVERVIEW_COUNT__CLASS:
				return class_ != null;
			case ModelOverviewPackage.OVERVIEW_COUNT__SUB_TYPES:
				return subTypes != null && !subTypes.isEmpty();
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
		result.append(" (Count: ");
		result.append(count);
		result.append(')');
		return result.toString();
	}

} //OverviewCountImpl
