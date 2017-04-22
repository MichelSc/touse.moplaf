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

import com.misc.common.moplaf.job.JobConsole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Use Job Console</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousejob.ToUseJobConsole#getCallerName <em>Caller Name</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousejob.TousejobPackage#getToUseJobConsole()
 * @model
 * @generated
 */
public interface ToUseJobConsole extends JobConsole {

	/**
	 * Returns the value of the '<em><b>Caller Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caller Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caller Name</em>' attribute.
	 * @see #setCallerName(String)
	 * @see com.misc.touse.moplaf.tousejob.TousejobPackage#getToUseJobConsole_CallerName()
	 * @model
	 * @generated
	 */
	String getCallerName();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousejob.ToUseJobConsole#getCallerName <em>Caller Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caller Name</em>' attribute.
	 * @see #getCallerName()
	 * @generated
	 */
	void setCallerName(String value);
} // ToUseJobConsole
