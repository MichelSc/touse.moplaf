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

import com.misc.common.moplaf.file.Files;
import com.misc.common.moplaf.job.Runs;
import com.misc.common.moplaf.job.jobclient.JobScheduler;
import com.misc.common.moplaf.serialize.Deserializable;
import com.misc.common.moplaf.serialize.Serializable;
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
 *   <li>{@link com.misc.touse.moplaf.tousejob.Domain#getSchedulers <em>Schedulers</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousejob.Domain#getDeserializables <em>Deserializables</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousejob.Domain#getSerializables <em>Serializables</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousejob.Domain#getFiles <em>Files</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousejob.Domain#getRuns <em>Runs</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousejob.ToUseJobPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>Runs</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.job.Runs}.
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
	 * Returns the value of the '<em><b>Schedulers</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.job.jobclient.JobScheduler}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedulers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedulers</em>' containment reference list.
	 * @see com.misc.touse.moplaf.tousejob.ToUseJobPackage#getDomain_Schedulers()
	 * @model containment="true"
	 * @generated
	 */
	EList<JobScheduler> getSchedulers();

	/**
	 * Returns the value of the '<em><b>Deserializables</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.serialize.Deserializable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deserializables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deserializables</em>' containment reference list.
	 * @see com.misc.touse.moplaf.tousejob.ToUseJobPackage#getDomain_Deserializables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Deserializable> getDeserializables();

	/**
	 * Returns the value of the '<em><b>Serializables</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.serialize.Serializable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serializables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serializables</em>' containment reference list.
	 * @see com.misc.touse.moplaf.tousejob.ToUseJobPackage#getDomain_Serializables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Serializable> getSerializables();

	/**
	 * Returns the value of the '<em><b>Files</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.file.Files}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' containment reference list.
	 * @see com.misc.touse.moplaf.tousejob.ToUseJobPackage#getDomain_Files()
	 * @model containment="true"
	 * @generated
	 */
	EList<Files> getFiles();

} // Domain
