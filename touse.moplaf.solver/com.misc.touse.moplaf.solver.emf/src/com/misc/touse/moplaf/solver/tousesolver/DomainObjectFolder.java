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
package com.misc.touse.moplaf.solver.tousesolver;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Object Folder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.DomainObjectFolder#getObject <em>Object</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.DomainObjectFolder#getSubFolder <em>Sub Folder</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.DomainObjectFolder#getScenario <em>Scenario</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.DomainObjectFolder#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getDomainObjectFolder()
 * @model
 * @generated
 */
public interface DomainObjectFolder extends EObject {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.solver.tousesolver.DomainObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference list.
	 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getDomainObjectFolder_Object()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainObject> getObject();

	/**
	 * Returns the value of the '<em><b>Sub Folder</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.solver.tousesolver.DomainObjectFolder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Folder</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Folder</em>' containment reference list.
	 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getDomainObjectFolder_SubFolder()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainObjectFolder> getSubFolder();

	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.solver.tousesolver.Scenario}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' containment reference list.
	 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getDomainObjectFolder_Scenario()
	 * @model containment="true"
	 * @generated
	 */
	EList<Scenario> getScenario();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#getDomainObjectFolder_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.solver.tousesolver.DomainObjectFolder#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DomainObjectFolder
