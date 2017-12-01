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
package com.misc.touse.moplaf.tousejob;

import com.misc.common.moplaf.job.jobclient.JobEngineProxy;
import com.misc.common.moplaf.job.jobclient.JobScheduler;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousejob.Domain#getRuns <em>Runs</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousejob.Domain#getProxies <em>Proxies</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousejob.Domain#getJobscheduler <em>Jobscheduler</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousejob.ToUseJobPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>Runs</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.tousejob.Runs}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runs</em>' containment reference list.
	 * @see com.misc.touse.moplaf.tousejob.ToUseJobPackage#getDomain_Runs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Runs> getRuns();

	/**
	 * Returns the value of the '<em><b>Proxies</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.job.jobclient.JobEngineProxy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxies</em>' containment reference list.
	 * @see com.misc.touse.moplaf.tousejob.ToUseJobPackage#getDomain_Proxies()
	 * @model containment="true"
	 * @generated
	 */
	EList<JobEngineProxy> getProxies();

	/**
	 * Returns the value of the '<em><b>Jobscheduler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jobscheduler</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobscheduler</em>' containment reference.
	 * @see #setJobscheduler(JobScheduler)
	 * @see com.misc.touse.moplaf.tousejob.ToUseJobPackage#getDomain_Jobscheduler()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JobScheduler getJobscheduler();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousejob.Domain#getJobscheduler <em>Jobscheduler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jobscheduler</em>' containment reference.
	 * @see #getJobscheduler()
	 * @generated
	 */
	void setJobscheduler(JobScheduler value);

} // Domain
