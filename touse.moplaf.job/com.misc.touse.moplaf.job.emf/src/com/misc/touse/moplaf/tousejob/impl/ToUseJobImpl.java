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

import com.misc.common.moplaf.job.Plugin;
import com.misc.common.moplaf.job.ProgressFeedback;
import com.misc.common.moplaf.job.RunContext;
import com.misc.common.moplaf.job.jobclient.impl.JobRemoteImpl;
import com.misc.common.moplaf.common.ReturnFeedback;

import com.misc.touse.moplaf.tousejob.ToUseJob;
import com.misc.touse.moplaf.tousejob.ToUseJobResult;
import com.misc.touse.moplaf.tousejob.TousejobFactory;
import com.misc.touse.moplaf.tousejob.TousejobPackage;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Use Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousejob.impl.ToUseJobImpl#getSecondsWaiting <em>Seconds Waiting</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousejob.impl.ToUseJobImpl#getIteration <em>Iteration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToUseJobImpl extends JobRemoteImpl implements ToUseJob {
	/**
	 * The default value of the '{@link #getSecondsWaiting() <em>Seconds Waiting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondsWaiting()
	 * @generated
	 * @ordered
	 */
	protected static final int SECONDS_WAITING_EDEFAULT = 2;

	/**
	 * The cached value of the '{@link #getSecondsWaiting() <em>Seconds Waiting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondsWaiting()
	 * @generated
	 * @ordered
	 */
	protected int secondsWaiting = SECONDS_WAITING_EDEFAULT;

	/**
	 * The default value of the '{@link #getIteration() <em>Iteration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIteration()
	 * @generated
	 * @ordered
	 */
	protected static final int ITERATION_EDEFAULT = 5;

	/**
	 * The cached value of the '{@link #getIteration() <em>Iteration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIteration()
	 * @generated
	 * @ordered
	 */
	protected int iteration = ITERATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUseJobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TousejobPackage.Literals.TO_USE_JOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSecondsWaiting() {
		return secondsWaiting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondsWaiting(int newSecondsWaiting) {
		int oldSecondsWaiting = secondsWaiting;
		secondsWaiting = newSecondsWaiting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TousejobPackage.TO_USE_JOB__SECONDS_WAITING, oldSecondsWaiting, secondsWaiting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIteration() {
		return iteration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIteration(int newIteration) {
		int oldIteration = iteration;
		iteration = newIteration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TousejobPackage.TO_USE_JOB__ITERATION, oldIteration, iteration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TousejobPackage.TO_USE_JOB__SECONDS_WAITING:
				return getSecondsWaiting();
			case TousejobPackage.TO_USE_JOB__ITERATION:
				return getIteration();
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
			case TousejobPackage.TO_USE_JOB__SECONDS_WAITING:
				setSecondsWaiting((Integer)newValue);
				return;
			case TousejobPackage.TO_USE_JOB__ITERATION:
				setIteration((Integer)newValue);
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
			case TousejobPackage.TO_USE_JOB__SECONDS_WAITING:
				setSecondsWaiting(SECONDS_WAITING_EDEFAULT);
				return;
			case TousejobPackage.TO_USE_JOB__ITERATION:
				setIteration(ITERATION_EDEFAULT);
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
			case TousejobPackage.TO_USE_JOB__SECONDS_WAITING:
				return secondsWaiting != SECONDS_WAITING_EDEFAULT;
			case TousejobPackage.TO_USE_JOB__ITERATION:
				return iteration != ITERATION_EDEFAULT;
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
		result.append(" (SecondsWaiting: ");
		result.append(secondsWaiting);
		result.append(", Iteration: ");
		result.append(iteration);
		result.append(')');
		return result.toString();
	}

	/**
	 * 
	 */
	//@Override
	protected ReturnFeedback jobRunImpl(RunContext runContext) {
		Plugin.INSTANCE.logInfo("ToUseJob "+this.getName()+" started");
		int seconds = this.getSecondsWaiting();
		for (int i=0; i<this.getIteration(); i++){
			try {
				TimeUnit.SECONDS.sleep(seconds);
			} catch (InterruptedException e) {
				Plugin.INSTANCE.logError("ToUseJob "+this.getName()+" interrupted");
			}
			Plugin.INSTANCE.logInfo("ToUseJob iteration "+i);
			this.setProgress(new ProgressFeedback((float)i/(float)this.getIteration(), "iterating"));
		}
		Date now = new Date();
		long ticks = now.getTime()-this.getStartTime().getTime();
		ToUseJobResult result = TousejobFactory.eINSTANCE.createToUseJobResult();
		result.setTicksWaited(ticks);
		this.setResult(result);
		Plugin.INSTANCE.logInfo("ToUseJob "+this.getName()+" finished");
		return ReturnFeedback.SUCCESS;
	}

	
} //ToUseJobImpl
