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
package com.misc.touse.moplaf.macroplanner;

import com.misc.common.moplaf.job.ParamsHolder;
import com.misc.common.moplaf.macroplanner.MacroPlannerData;
import com.misc.common.moplaf.macroplanner.MacroPlannerStaticData;
import com.misc.common.moplaf.macroplanner.solver.Scenario;
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
 *   <li>{@link com.misc.touse.moplaf.macroplanner.Domain#getStaticData <em>Static Data</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.macroplanner.Domain#getData <em>Data</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.macroplanner.Domain#getScenarios <em>Scenarios</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.macroplanner.Domain#getParmamsHolders <em>Parmams Holders</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.macroplanner.ToUseMacroPlannerPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.MacroPlannerData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see com.misc.touse.moplaf.macroplanner.ToUseMacroPlannerPackage#getDomain_Data()
	 * @model containment="true"
	 * @generated
	 */
	EList<MacroPlannerData> getData();

	/**
	 * Returns the value of the '<em><b>Scenarios</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.solver.Scenario}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenarios</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenarios</em>' containment reference list.
	 * @see com.misc.touse.moplaf.macroplanner.ToUseMacroPlannerPackage#getDomain_Scenarios()
	 * @model containment="true"
	 * @generated
	 */
	EList<Scenario> getScenarios();

	/**
	 * Returns the value of the '<em><b>Parmams Holders</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.job.ParamsHolder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parmams Holders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parmams Holders</em>' containment reference list.
	 * @see com.misc.touse.moplaf.macroplanner.ToUseMacroPlannerPackage#getDomain_ParmamsHolders()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParamsHolder> getParmamsHolders();

	/**
	 * Returns the value of the '<em><b>Static Data</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.MacroPlannerStaticData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Data</em>' containment reference list.
	 * @see com.misc.touse.moplaf.macroplanner.ToUseMacroPlannerPackage#getDomain_StaticData()
	 * @model containment="true"
	 * @generated
	 */
	EList<MacroPlannerStaticData> getStaticData();

} // Domain
