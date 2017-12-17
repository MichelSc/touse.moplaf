/*******************************************************************************
 * Copyright (c) 2017 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
/**
 */
package com.misc.touse.moplaf.tousejob.impl;

import com.misc.common.moplaf.job.jobclient.JobEngineProxy;
import com.misc.common.moplaf.job.jobclient.JobScheduler;
import com.misc.touse.moplaf.tousejob.Domain;
import com.misc.touse.moplaf.tousejob.Runs;
import com.misc.touse.moplaf.tousejob.ToUseJobPackage;
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
 *   <li>{@link com.misc.touse.moplaf.tousejob.impl.DomainImpl#getRuns <em>Runs</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousejob.impl.DomainImpl#getProxies <em>Proxies</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousejob.impl.DomainImpl#getJobscheduler <em>Jobscheduler</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainImpl extends MinimalEObjectImpl.Container implements Domain {
	/**
	 * The cached value of the '{@link #getRuns() <em>Runs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuns()
	 * @generated
	 * @ordered
	 */
	protected EList<Runs> runs;

	/**
	 * The cached value of the '{@link #getProxies() <em>Proxies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxies()
	 * @generated
	 * @ordered
	 */
	protected EList<JobEngineProxy> proxies;

	/**
	 * The cached value of the '{@link #getJobscheduler() <em>Jobscheduler</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobscheduler()
	 * @generated
	 * @ordered
	 */
	protected EList<JobScheduler> jobscheduler;

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
		return ToUseJobPackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Runs> getRuns() {
		if (runs == null) {
			runs = new EObjectContainmentEList<Runs>(Runs.class, this, ToUseJobPackage.DOMAIN__RUNS);
		}
		return runs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JobEngineProxy> getProxies() {
		if (proxies == null) {
			proxies = new EObjectContainmentEList<JobEngineProxy>(JobEngineProxy.class, this, ToUseJobPackage.DOMAIN__PROXIES);
		}
		return proxies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JobScheduler> getJobscheduler() {
		if (jobscheduler == null) {
			jobscheduler = new EObjectContainmentEList<JobScheduler>(JobScheduler.class, this, ToUseJobPackage.DOMAIN__JOBSCHEDULER);
		}
		return jobscheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToUseJobPackage.DOMAIN__RUNS:
				return ((InternalEList<?>)getRuns()).basicRemove(otherEnd, msgs);
			case ToUseJobPackage.DOMAIN__PROXIES:
				return ((InternalEList<?>)getProxies()).basicRemove(otherEnd, msgs);
			case ToUseJobPackage.DOMAIN__JOBSCHEDULER:
				return ((InternalEList<?>)getJobscheduler()).basicRemove(otherEnd, msgs);
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
			case ToUseJobPackage.DOMAIN__RUNS:
				return getRuns();
			case ToUseJobPackage.DOMAIN__PROXIES:
				return getProxies();
			case ToUseJobPackage.DOMAIN__JOBSCHEDULER:
				return getJobscheduler();
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
			case ToUseJobPackage.DOMAIN__RUNS:
				getRuns().clear();
				getRuns().addAll((Collection<? extends Runs>)newValue);
				return;
			case ToUseJobPackage.DOMAIN__PROXIES:
				getProxies().clear();
				getProxies().addAll((Collection<? extends JobEngineProxy>)newValue);
				return;
			case ToUseJobPackage.DOMAIN__JOBSCHEDULER:
				getJobscheduler().clear();
				getJobscheduler().addAll((Collection<? extends JobScheduler>)newValue);
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
			case ToUseJobPackage.DOMAIN__RUNS:
				getRuns().clear();
				return;
			case ToUseJobPackage.DOMAIN__PROXIES:
				getProxies().clear();
				return;
			case ToUseJobPackage.DOMAIN__JOBSCHEDULER:
				getJobscheduler().clear();
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
			case ToUseJobPackage.DOMAIN__RUNS:
				return runs != null && !runs.isEmpty();
			case ToUseJobPackage.DOMAIN__PROXIES:
				return proxies != null && !proxies.isEmpty();
			case ToUseJobPackage.DOMAIN__JOBSCHEDULER:
				return jobscheduler != null && !jobscheduler.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainImpl
