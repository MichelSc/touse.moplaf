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

import com.misc.common.moplaf.job.jobclient.impl.JobRemoteResultImpl;

import com.misc.touse.moplaf.tousejob.ToUseJobPackage;
import com.misc.touse.moplaf.tousejob.ToUseJobResult;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Use Job Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousejob.impl.ToUseJobResultImpl#getTicksWaited <em>Ticks Waited</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToUseJobResultImpl extends JobRemoteResultImpl implements ToUseJobResult {
	/**
	 * The default value of the '{@link #getTicksWaited() <em>Ticks Waited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTicksWaited()
	 * @generated
	 * @ordered
	 */
	protected static final long TICKS_WAITED_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTicksWaited() <em>Ticks Waited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTicksWaited()
	 * @generated
	 * @ordered
	 */
	protected long ticksWaited = TICKS_WAITED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUseJobResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseJobPackage.Literals.TO_USE_JOB_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTicksWaited() {
		return ticksWaited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTicksWaited(long newTicksWaited) {
		long oldTicksWaited = ticksWaited;
		ticksWaited = newTicksWaited;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseJobPackage.TO_USE_JOB_RESULT__TICKS_WAITED, oldTicksWaited, ticksWaited));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUseJobPackage.TO_USE_JOB_RESULT__TICKS_WAITED:
				return getTicksWaited();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ToUseJobPackage.TO_USE_JOB_RESULT__TICKS_WAITED:
				setTicksWaited((Long)newValue);
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
			case ToUseJobPackage.TO_USE_JOB_RESULT__TICKS_WAITED:
				setTicksWaited(TICKS_WAITED_EDEFAULT);
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
			case ToUseJobPackage.TO_USE_JOB_RESULT__TICKS_WAITED:
				return ticksWaited != TICKS_WAITED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (TicksWaited: ");
		result.append(ticksWaited);
		result.append(')');
		return result.toString();
	}

} //ToUseJobResultImpl
