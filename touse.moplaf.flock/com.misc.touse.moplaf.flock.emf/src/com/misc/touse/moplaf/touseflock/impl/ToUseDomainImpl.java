/**
 */
package com.misc.touse.moplaf.touseflock.impl;


import com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapterScope;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorPackage;
import com.misc.common.moplaf.propagator.Util;
import com.misc.touse.moplaf.touseflock.FlockScopeToUse;
import com.misc.touse.moplaf.touseflock.ToUseDomain;
import com.misc.touse.moplaf.touseflock.ToUseLocation;
import com.misc.touse.moplaf.touseflock.ToUseResource;
import com.misc.touse.moplaf.touseflock.TouseflockPackage;
import com.misc.touse.moplaf.touseflock.calc.PropagatorScopeToUseDomain;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Use Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.touseflock.impl.ToUseDomainImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.touseflock.impl.ToUseDomainImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.touseflock.impl.ToUseDomainImpl#getFlockScope <em>Flock Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ToUseDomainImpl extends MinimalEObjectImpl.Container implements ToUseDomain {
	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<ToUseLocation> location;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected EList<ToUseResource> resource;

	/**
	 * The cached value of the '{@link #getFlockScope() <em>Flock Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlockScope()
	 * @generated
	 * @ordered
	 */
	protected FlockScopeToUse flockScope;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUseDomainImpl() {
		super();
	}
	
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TouseflockPackage.Literals.TO_USE_DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ToUseLocation> getLocation() {
		if (location == null) {
			location = new EObjectContainmentEList<ToUseLocation>(ToUseLocation.class, this, TouseflockPackage.TO_USE_DOMAIN__LOCATION);
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ToUseResource> getResource() {
		if (resource == null) {
			resource = new EObjectContainmentWithInverseEList<ToUseResource>(ToUseResource.class, this, TouseflockPackage.TO_USE_DOMAIN__RESOURCE, TouseflockPackage.TO_USE_RESOURCE__DOMAIN);
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlockScopeToUse getFlockScope() {
		return flockScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlockScope(FlockScopeToUse newFlockScope, NotificationChain msgs) {
		FlockScopeToUse oldFlockScope = flockScope;
		flockScope = newFlockScope;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TouseflockPackage.TO_USE_DOMAIN__FLOCK_SCOPE, oldFlockScope, newFlockScope);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlockScope(FlockScopeToUse newFlockScope) {
		if (newFlockScope != flockScope) {
			NotificationChain msgs = null;
			if (flockScope != null)
				msgs = ((InternalEObject)flockScope).eInverseRemove(this, TouseflockPackage.FLOCK_SCOPE_TO_USE__TO_USE_DOMAIN, FlockScopeToUse.class, msgs);
			if (newFlockScope != null)
				msgs = ((InternalEObject)newFlockScope).eInverseAdd(this, TouseflockPackage.FLOCK_SCOPE_TO_USE__TO_USE_DOMAIN, FlockScopeToUse.class, msgs);
			msgs = basicSetFlockScope(newFlockScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouseflockPackage.TO_USE_DOMAIN__FLOCK_SCOPE, newFlockScope, newFlockScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refresh() {
		PropagatorFunctionAdapter scope = Util.getPropagatorFunctionAdapter(this, PropagatorScopeToUseDomain.class);
		scope.refresh();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addPropagatorFunctionAdapter() {
		Util.getPropagatorFunctionAdapter(this, PropagatorScopeToUseDomain.class);
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
			case TouseflockPackage.TO_USE_DOMAIN__RESOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResource()).basicAdd(otherEnd, msgs);
			case TouseflockPackage.TO_USE_DOMAIN__FLOCK_SCOPE:
				if (flockScope != null)
					msgs = ((InternalEObject)flockScope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TouseflockPackage.TO_USE_DOMAIN__FLOCK_SCOPE, null, msgs);
				return basicSetFlockScope((FlockScopeToUse)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TouseflockPackage.TO_USE_DOMAIN__LOCATION:
				return ((InternalEList<?>)getLocation()).basicRemove(otherEnd, msgs);
			case TouseflockPackage.TO_USE_DOMAIN__RESOURCE:
				return ((InternalEList<?>)getResource()).basicRemove(otherEnd, msgs);
			case TouseflockPackage.TO_USE_DOMAIN__FLOCK_SCOPE:
				return basicSetFlockScope(null, msgs);
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
			case TouseflockPackage.TO_USE_DOMAIN__LOCATION:
				return getLocation();
			case TouseflockPackage.TO_USE_DOMAIN__RESOURCE:
				return getResource();
			case TouseflockPackage.TO_USE_DOMAIN__FLOCK_SCOPE:
				return getFlockScope();
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
			case TouseflockPackage.TO_USE_DOMAIN__LOCATION:
				getLocation().clear();
				getLocation().addAll((Collection<? extends ToUseLocation>)newValue);
				return;
			case TouseflockPackage.TO_USE_DOMAIN__RESOURCE:
				getResource().clear();
				getResource().addAll((Collection<? extends ToUseResource>)newValue);
				return;
			case TouseflockPackage.TO_USE_DOMAIN__FLOCK_SCOPE:
				setFlockScope((FlockScopeToUse)newValue);
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
			case TouseflockPackage.TO_USE_DOMAIN__LOCATION:
				getLocation().clear();
				return;
			case TouseflockPackage.TO_USE_DOMAIN__RESOURCE:
				getResource().clear();
				return;
			case TouseflockPackage.TO_USE_DOMAIN__FLOCK_SCOPE:
				setFlockScope((FlockScopeToUse)null);
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
			case TouseflockPackage.TO_USE_DOMAIN__LOCATION:
				return location != null && !location.isEmpty();
			case TouseflockPackage.TO_USE_DOMAIN__RESOURCE:
				return resource != null && !resource.isEmpty();
			case TouseflockPackage.TO_USE_DOMAIN__FLOCK_SCOPE:
				return flockScope != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ObjectWithPropagatorFunctionAdapterScope.class) {
			switch (baseOperationID) {
				case PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_SCOPE___REFRESH: return TouseflockPackage.TO_USE_DOMAIN___REFRESH;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TouseflockPackage.TO_USE_DOMAIN___REFRESH:
				refresh();
				return null;
			case TouseflockPackage.TO_USE_DOMAIN___ADD_PROPAGATOR_FUNCTION_ADAPTER:
				addPropagatorFunctionAdapter();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ToUseDomainImpl
