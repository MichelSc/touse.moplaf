/**
 */
package com.misc.touse.moplaf.solver.tousesolver.impl;

import com.misc.touse.moplaf.solver.tousesolver.Domain;
import com.misc.touse.moplaf.solver.tousesolver.DomainObjectFolder;
import com.misc.touse.moplaf.solver.tousesolver.SolveKnapsack;
import com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage;

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
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.impl.DomainImpl#getRootFolder <em>Root Folder</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.impl.DomainImpl#getJobs <em>Jobs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainImpl extends MinimalEObjectImpl.Container implements Domain {
	/**
	 * The cached value of the '{@link #getRootFolder() <em>Root Folder</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootFolder()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainObjectFolder> rootFolder;
	/**
	 * The cached value of the '{@link #getJobs() <em>Jobs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobs()
	 * @generated
	 * @ordered
	 */
	protected EList<SolveKnapsack> jobs;
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
		return TousesolverPackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainObjectFolder> getRootFolder() {
		if (rootFolder == null) {
			rootFolder = new EObjectContainmentEList<DomainObjectFolder>(DomainObjectFolder.class, this, TousesolverPackage.DOMAIN__ROOT_FOLDER);
		}
		return rootFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SolveKnapsack> getJobs() {
		if (jobs == null) {
			jobs = new EObjectContainmentEList<SolveKnapsack>(SolveKnapsack.class, this, TousesolverPackage.DOMAIN__JOBS);
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
			case TousesolverPackage.DOMAIN__ROOT_FOLDER:
				return ((InternalEList<?>)getRootFolder()).basicRemove(otherEnd, msgs);
			case TousesolverPackage.DOMAIN__JOBS:
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
			case TousesolverPackage.DOMAIN__ROOT_FOLDER:
				return getRootFolder();
			case TousesolverPackage.DOMAIN__JOBS:
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
			case TousesolverPackage.DOMAIN__ROOT_FOLDER:
				getRootFolder().clear();
				getRootFolder().addAll((Collection<? extends DomainObjectFolder>)newValue);
				return;
			case TousesolverPackage.DOMAIN__JOBS:
				getJobs().clear();
				getJobs().addAll((Collection<? extends SolveKnapsack>)newValue);
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
			case TousesolverPackage.DOMAIN__ROOT_FOLDER:
				getRootFolder().clear();
				return;
			case TousesolverPackage.DOMAIN__JOBS:
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
			case TousesolverPackage.DOMAIN__ROOT_FOLDER:
				return rootFolder != null && !rootFolder.isEmpty();
			case TousesolverPackage.DOMAIN__JOBS:
				return jobs != null && !jobs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainImpl
