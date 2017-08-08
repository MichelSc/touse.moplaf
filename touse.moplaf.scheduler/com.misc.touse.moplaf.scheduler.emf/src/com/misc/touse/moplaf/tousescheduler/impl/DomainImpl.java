/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.touse.moplaf.tousescheduler.Domain;
import com.misc.touse.moplaf.tousescheduler.ToUseResource;
import com.misc.touse.moplaf.tousescheduler.ToUseScheduler;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;
import com.misc.touse.moplaf.tousescheduler.ToUseTask;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.DomainImpl#getSchedulers <em>Schedulers</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.DomainImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.DomainImpl#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainImpl extends MinimalEObjectImpl.Container implements Domain {
	/**
	 * The cached value of the '{@link #getSchedulers() <em>Schedulers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulers()
	 * @generated
	 * @ordered
	 */
	protected EList<ToUseScheduler> schedulers;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<ToUseResource> resources;
	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<ToUseTask> tasks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseSchedulerPackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ToUseScheduler> getSchedulers() {
		if (schedulers == null) {
			schedulers = new EObjectContainmentEList<ToUseScheduler>(ToUseScheduler.class, this, ToUseSchedulerPackage.DOMAIN__SCHEDULERS);
		}
		return schedulers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ToUseResource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<ToUseResource>(ToUseResource.class, this, ToUseSchedulerPackage.DOMAIN__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ToUseTask> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<ToUseTask>(ToUseTask.class, this, ToUseSchedulerPackage.DOMAIN__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToUseSchedulerPackage.DOMAIN__SCHEDULERS:
				return ((InternalEList<?>)getSchedulers()).basicRemove(otherEnd, msgs);
			case ToUseSchedulerPackage.DOMAIN__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case ToUseSchedulerPackage.DOMAIN__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
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
			case ToUseSchedulerPackage.DOMAIN__SCHEDULERS:
				return getSchedulers();
			case ToUseSchedulerPackage.DOMAIN__RESOURCES:
				return getResources();
			case ToUseSchedulerPackage.DOMAIN__TASKS:
				return getTasks();
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
			case ToUseSchedulerPackage.DOMAIN__SCHEDULERS:
				getSchedulers().clear();
				getSchedulers().addAll((Collection<? extends ToUseScheduler>)newValue);
				return;
			case ToUseSchedulerPackage.DOMAIN__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends ToUseResource>)newValue);
				return;
			case ToUseSchedulerPackage.DOMAIN__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends ToUseTask>)newValue);
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
			case ToUseSchedulerPackage.DOMAIN__SCHEDULERS:
				getSchedulers().clear();
				return;
			case ToUseSchedulerPackage.DOMAIN__RESOURCES:
				getResources().clear();
				return;
			case ToUseSchedulerPackage.DOMAIN__TASKS:
				getTasks().clear();
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
			case ToUseSchedulerPackage.DOMAIN__SCHEDULERS:
				return schedulers != null && !schedulers.isEmpty();
			case ToUseSchedulerPackage.DOMAIN__RESOURCES:
				return resources != null && !resources.isEmpty();
			case ToUseSchedulerPackage.DOMAIN__TASKS:
				return tasks != null && !tasks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainImpl
