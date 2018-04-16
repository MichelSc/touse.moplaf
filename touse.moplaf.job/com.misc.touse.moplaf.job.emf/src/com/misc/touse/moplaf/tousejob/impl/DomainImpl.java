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

import com.misc.common.moplaf.file.Files;
import com.misc.common.moplaf.job.Runs;
import com.misc.common.moplaf.job.jobclient.JobScheduler;
import com.misc.common.moplaf.serialize.Deserializable;
import com.misc.common.moplaf.serialize.Serializable;
import com.misc.touse.moplaf.tousejob.Domain;
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
 *   <li>{@link com.misc.touse.moplaf.tousejob.impl.DomainImpl#getSchedulers <em>Schedulers</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousejob.impl.DomainImpl#getDeserializables <em>Deserializables</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousejob.impl.DomainImpl#getSerializables <em>Serializables</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousejob.impl.DomainImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousejob.impl.DomainImpl#getRuns <em>Runs</em>}</li>
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
	protected EList<JobScheduler> schedulers;

	/**
	 * The cached value of the '{@link #getDeserializables() <em>Deserializables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeserializables()
	 * @generated
	 * @ordered
	 */
	protected EList<Deserializable> deserializables;

	/**
	 * The cached value of the '{@link #getSerializables() <em>Serializables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerializables()
	 * @generated
	 * @ordered
	 */
	protected EList<Serializable> serializables;

	/**
	 * The cached value of the '{@link #getFiles() <em>Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<Files> files;

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
	public EList<JobScheduler> getSchedulers() {
		if (schedulers == null) {
			schedulers = new EObjectContainmentEList<JobScheduler>(JobScheduler.class, this, ToUseJobPackage.DOMAIN__SCHEDULERS);
		}
		return schedulers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Deserializable> getDeserializables() {
		if (deserializables == null) {
			deserializables = new EObjectContainmentEList<Deserializable>(Deserializable.class, this, ToUseJobPackage.DOMAIN__DESERIALIZABLES);
		}
		return deserializables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Serializable> getSerializables() {
		if (serializables == null) {
			serializables = new EObjectContainmentEList<Serializable>(Serializable.class, this, ToUseJobPackage.DOMAIN__SERIALIZABLES);
		}
		return serializables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Files> getFiles() {
		if (files == null) {
			files = new EObjectContainmentEList<Files>(Files.class, this, ToUseJobPackage.DOMAIN__FILES);
		}
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToUseJobPackage.DOMAIN__SCHEDULERS:
				return ((InternalEList<?>)getSchedulers()).basicRemove(otherEnd, msgs);
			case ToUseJobPackage.DOMAIN__DESERIALIZABLES:
				return ((InternalEList<?>)getDeserializables()).basicRemove(otherEnd, msgs);
			case ToUseJobPackage.DOMAIN__SERIALIZABLES:
				return ((InternalEList<?>)getSerializables()).basicRemove(otherEnd, msgs);
			case ToUseJobPackage.DOMAIN__FILES:
				return ((InternalEList<?>)getFiles()).basicRemove(otherEnd, msgs);
			case ToUseJobPackage.DOMAIN__RUNS:
				return ((InternalEList<?>)getRuns()).basicRemove(otherEnd, msgs);
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
			case ToUseJobPackage.DOMAIN__SCHEDULERS:
				return getSchedulers();
			case ToUseJobPackage.DOMAIN__DESERIALIZABLES:
				return getDeserializables();
			case ToUseJobPackage.DOMAIN__SERIALIZABLES:
				return getSerializables();
			case ToUseJobPackage.DOMAIN__FILES:
				return getFiles();
			case ToUseJobPackage.DOMAIN__RUNS:
				return getRuns();
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
			case ToUseJobPackage.DOMAIN__SCHEDULERS:
				getSchedulers().clear();
				getSchedulers().addAll((Collection<? extends JobScheduler>)newValue);
				return;
			case ToUseJobPackage.DOMAIN__DESERIALIZABLES:
				getDeserializables().clear();
				getDeserializables().addAll((Collection<? extends Deserializable>)newValue);
				return;
			case ToUseJobPackage.DOMAIN__SERIALIZABLES:
				getSerializables().clear();
				getSerializables().addAll((Collection<? extends Serializable>)newValue);
				return;
			case ToUseJobPackage.DOMAIN__FILES:
				getFiles().clear();
				getFiles().addAll((Collection<? extends Files>)newValue);
				return;
			case ToUseJobPackage.DOMAIN__RUNS:
				getRuns().clear();
				getRuns().addAll((Collection<? extends Runs>)newValue);
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
			case ToUseJobPackage.DOMAIN__SCHEDULERS:
				getSchedulers().clear();
				return;
			case ToUseJobPackage.DOMAIN__DESERIALIZABLES:
				getDeserializables().clear();
				return;
			case ToUseJobPackage.DOMAIN__SERIALIZABLES:
				getSerializables().clear();
				return;
			case ToUseJobPackage.DOMAIN__FILES:
				getFiles().clear();
				return;
			case ToUseJobPackage.DOMAIN__RUNS:
				getRuns().clear();
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
			case ToUseJobPackage.DOMAIN__SCHEDULERS:
				return schedulers != null && !schedulers.isEmpty();
			case ToUseJobPackage.DOMAIN__DESERIALIZABLES:
				return deserializables != null && !deserializables.isEmpty();
			case ToUseJobPackage.DOMAIN__SERIALIZABLES:
				return serializables != null && !serializables.isEmpty();
			case ToUseJobPackage.DOMAIN__FILES:
				return files != null && !files.isEmpty();
			case ToUseJobPackage.DOMAIN__RUNS:
				return runs != null && !runs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainImpl
