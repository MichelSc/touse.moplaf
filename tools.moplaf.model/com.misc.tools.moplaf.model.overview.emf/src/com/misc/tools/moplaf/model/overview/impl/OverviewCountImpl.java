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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Overview Count</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.tools.moplaf.model.overview.impl.OverviewCountImpl#getCountedClass <em>Counted Class</em>}</li>
 *   <li>{@link com.misc.tools.moplaf.model.overview.impl.OverviewCountImpl#getSubTypes <em>Sub Types</em>}</li>
 *   <li>{@link com.misc.tools.moplaf.model.overview.impl.OverviewCountImpl#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link com.misc.tools.moplaf.model.overview.impl.OverviewCountImpl#getCount <em>Count</em>}</li>
 *   <li>{@link com.misc.tools.moplaf.model.overview.impl.OverviewCountImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OverviewCountImpl extends MinimalEObjectImpl.Container implements OverviewCount {
	/**
	 * The cached value of the '{@link #getCountedClass() <em>Counted Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountedClass()
	 * @generated
	 * @ordered
	 */
	protected EClass countedClass;

	/**
	 * The cached value of the '{@link #getSubTypes() <em>Sub Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<OverviewCount> subTypes;

	/**
	 * The cached value of the '{@link #getSuperTypes() <em>Super Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<OverviewCount> superTypes;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

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
	public EClass getCountedClass() {
		if (countedClass != null && countedClass.eIsProxy()) {
			InternalEObject oldCountedClass = (InternalEObject)countedClass;
			countedClass = (EClass)eResolveProxy(oldCountedClass);
			if (countedClass != oldCountedClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelOverviewPackage.OVERVIEW_COUNT__COUNTED_CLASS, oldCountedClass, countedClass));
			}
		}
		return countedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetCountedClass() {
		return countedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountedClass(EClass newCountedClass) {
		EClass oldCountedClass = countedClass;
		countedClass = newCountedClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelOverviewPackage.OVERVIEW_COUNT__COUNTED_CLASS, oldCountedClass, countedClass));
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
	 */
	public String getDescription() {
		String description = String.format("%s: %,d", this.getCountedClass().getName(), this.getCount());
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelOverviewPackage.OVERVIEW_COUNT__SUB_TYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubTypes()).basicAdd(otherEnd, msgs);
			case ModelOverviewPackage.OVERVIEW_COUNT__SUPER_TYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSuperTypes()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OverviewCount> getSubTypes() {
		if (subTypes == null) {
			subTypes = new EObjectWithInverseResolvingEList.ManyInverse<OverviewCount>(OverviewCount.class, this, ModelOverviewPackage.OVERVIEW_COUNT__SUB_TYPES, ModelOverviewPackage.OVERVIEW_COUNT__SUPER_TYPES);
		}
		return subTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OverviewCount> getSuperTypes() {
		if (superTypes == null) {
			superTypes = new EObjectWithInverseResolvingEList.ManyInverse<OverviewCount>(OverviewCount.class, this, ModelOverviewPackage.OVERVIEW_COUNT__SUPER_TYPES, ModelOverviewPackage.OVERVIEW_COUNT__SUB_TYPES);
		}
		return superTypes;
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
			case ModelOverviewPackage.OVERVIEW_COUNT__SUPER_TYPES:
				return ((InternalEList<?>)getSuperTypes()).basicRemove(otherEnd, msgs);
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
			case ModelOverviewPackage.OVERVIEW_COUNT__COUNTED_CLASS:
				if (resolve) return getCountedClass();
				return basicGetCountedClass();
			case ModelOverviewPackage.OVERVIEW_COUNT__SUB_TYPES:
				return getSubTypes();
			case ModelOverviewPackage.OVERVIEW_COUNT__SUPER_TYPES:
				return getSuperTypes();
			case ModelOverviewPackage.OVERVIEW_COUNT__COUNT:
				return getCount();
			case ModelOverviewPackage.OVERVIEW_COUNT__DESCRIPTION:
				return getDescription();
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
			case ModelOverviewPackage.OVERVIEW_COUNT__COUNTED_CLASS:
				setCountedClass((EClass)newValue);
				return;
			case ModelOverviewPackage.OVERVIEW_COUNT__SUB_TYPES:
				getSubTypes().clear();
				getSubTypes().addAll((Collection<? extends OverviewCount>)newValue);
				return;
			case ModelOverviewPackage.OVERVIEW_COUNT__SUPER_TYPES:
				getSuperTypes().clear();
				getSuperTypes().addAll((Collection<? extends OverviewCount>)newValue);
				return;
			case ModelOverviewPackage.OVERVIEW_COUNT__COUNT:
				setCount((Integer)newValue);
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
			case ModelOverviewPackage.OVERVIEW_COUNT__COUNTED_CLASS:
				setCountedClass((EClass)null);
				return;
			case ModelOverviewPackage.OVERVIEW_COUNT__SUB_TYPES:
				getSubTypes().clear();
				return;
			case ModelOverviewPackage.OVERVIEW_COUNT__SUPER_TYPES:
				getSuperTypes().clear();
				return;
			case ModelOverviewPackage.OVERVIEW_COUNT__COUNT:
				setCount(COUNT_EDEFAULT);
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
			case ModelOverviewPackage.OVERVIEW_COUNT__COUNTED_CLASS:
				return countedClass != null;
			case ModelOverviewPackage.OVERVIEW_COUNT__SUB_TYPES:
				return subTypes != null && !subTypes.isEmpty();
			case ModelOverviewPackage.OVERVIEW_COUNT__SUPER_TYPES:
				return superTypes != null && !superTypes.isEmpty();
			case ModelOverviewPackage.OVERVIEW_COUNT__COUNT:
				return count != COUNT_EDEFAULT;
			case ModelOverviewPackage.OVERVIEW_COUNT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
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
