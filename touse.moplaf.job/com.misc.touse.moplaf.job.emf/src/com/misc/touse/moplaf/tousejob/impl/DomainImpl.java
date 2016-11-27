/**
 */
package com.misc.touse.moplaf.tousejob.impl;

import com.misc.common.moplaf.job.jobclient.JobEngineInProcess;

import com.misc.touse.moplaf.tousejob.Domain;
import com.misc.touse.moplaf.tousejob.ToUseJob;
import com.misc.touse.moplaf.tousejob.TousejobPackage;

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
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousejob.impl.DomainImpl#getEngines <em>Engines</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousejob.impl.DomainImpl#getJobs <em>Jobs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainImpl extends MinimalEObjectImpl.Container implements Domain {
	/**
	 * The cached value of the '{@link #getEngines() <em>Engines</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngines()
	 * @generated
	 * @ordered
	 */
	protected JobEngineInProcess engines;

	/**
	 * The cached value of the '{@link #getJobs() <em>Jobs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobs()
	 * @generated
	 * @ordered
	 */
	protected EList<ToUseJob> jobs;

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
		return TousejobPackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobEngineInProcess getEngines() {
		return engines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEngines(JobEngineInProcess newEngines, NotificationChain msgs) {
		JobEngineInProcess oldEngines = engines;
		engines = newEngines;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TousejobPackage.DOMAIN__ENGINES, oldEngines, newEngines);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEngines(JobEngineInProcess newEngines) {
		if (newEngines != engines) {
			NotificationChain msgs = null;
			if (engines != null)
				msgs = ((InternalEObject)engines).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TousejobPackage.DOMAIN__ENGINES, null, msgs);
			if (newEngines != null)
				msgs = ((InternalEObject)newEngines).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TousejobPackage.DOMAIN__ENGINES, null, msgs);
			msgs = basicSetEngines(newEngines, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TousejobPackage.DOMAIN__ENGINES, newEngines, newEngines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ToUseJob> getJobs() {
		if (jobs == null) {
			jobs = new EObjectContainmentEList<ToUseJob>(ToUseJob.class, this, TousejobPackage.DOMAIN__JOBS);
		}
		return jobs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TousejobPackage.DOMAIN__ENGINES:
				return basicSetEngines(null, msgs);
			case TousejobPackage.DOMAIN__JOBS:
				return ((InternalEList<?>)getJobs()).basicRemove(otherEnd, msgs);
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
			case TousejobPackage.DOMAIN__ENGINES:
				return getEngines();
			case TousejobPackage.DOMAIN__JOBS:
				return getJobs();
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
			case TousejobPackage.DOMAIN__ENGINES:
				setEngines((JobEngineInProcess)newValue);
				return;
			case TousejobPackage.DOMAIN__JOBS:
				getJobs().clear();
				getJobs().addAll((Collection<? extends ToUseJob>)newValue);
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
			case TousejobPackage.DOMAIN__ENGINES:
				setEngines((JobEngineInProcess)null);
				return;
			case TousejobPackage.DOMAIN__JOBS:
				getJobs().clear();
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
			case TousejobPackage.DOMAIN__ENGINES:
				return engines != null;
			case TousejobPackage.DOMAIN__JOBS:
				return jobs != null && !jobs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainImpl
