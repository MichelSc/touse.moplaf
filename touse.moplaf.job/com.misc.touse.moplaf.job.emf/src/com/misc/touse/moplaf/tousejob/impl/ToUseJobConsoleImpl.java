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

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.common.ReturnFeedback;
import com.misc.common.moplaf.job.JobParameterType;
import com.misc.common.moplaf.job.RunContext;
import com.misc.common.moplaf.job.impl.JobConsoleImpl;

import com.misc.touse.moplaf.tousejob.ToUseJobConsole;
import com.misc.touse.moplaf.tousejob.TousejobPackage;

import java.util.Date;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Use Job Console</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousejob.impl.ToUseJobConsoleImpl#getCallerName <em>Caller Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToUseJobConsoleImpl extends JobConsoleImpl implements ToUseJobConsole {
	/**
	 * The default value of the '{@link #getCallerName() <em>Caller Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallerName()
	 * @generated
	 * @ordered
	 */
	protected static final String CALLER_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCallerName() <em>Caller Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallerName()
	 * @generated
	 * @ordered
	 */
	protected String callerName = CALLER_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUseJobConsoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TousejobPackage.Literals.TO_USE_JOB_CONSOLE;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCallerName() {
		return callerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallerName(String newCallerName) {
		String oldCallerName = callerName;
		callerName = newCallerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TousejobPackage.TO_USE_JOB_CONSOLE__CALLER_NAME, oldCallerName, callerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TousejobPackage.TO_USE_JOB_CONSOLE__CALLER_NAME:
				return getCallerName();
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
			case TousejobPackage.TO_USE_JOB_CONSOLE__CALLER_NAME:
				setCallerName((String)newValue);
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
			case TousejobPackage.TO_USE_JOB_CONSOLE__CALLER_NAME:
				setCallerName(CALLER_NAME_EDEFAULT);
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
			case TousejobPackage.TO_USE_JOB_CONSOLE__CALLER_NAME:
				return CALLER_NAME_EDEFAULT == null ? callerName != null : !CALLER_NAME_EDEFAULT.equals(callerName);
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
		result.append(" (CallerName: ");
		result.append(callerName);
		result.append(')');
		return result.toString();
	}

	/**
	 * 
	 */
	@Override
	protected void refreshParametersImpl() {
		this.addParameter("CallerName",    
				           JobParameterType.JOB_PARAMETER_TYPE_STRING, 
				           TousejobPackage.Literals.TO_USE_JOB_CONSOLE__CALLER_NAME,      
				           "Name of the Caller");
	}
	
	/**
	 * 
	 */
	@Override
	public EnabledFeedback getRunFeedback() {
//		return new EnabledFeedback(false, "Not Reset");
		return EnabledFeedback.NOFEEDBACK;
	}

	
	/**
	 * 
	 */
	@Override
	public EnabledFeedback getResetFeedback() {
		//return new EnabledFeedback(false, "Not Started");
		return EnabledFeedback.NOFEEDBACK;
	}


	/**
	 * 
	 */
	@Override
	protected void jobResetImpl() {
	}

	/**
	 * Implement all the actions for a solving run
	 */
	@Override
	protected ReturnFeedback jobRunImpl(RunContext runContext) {
		CommonPlugin.INSTANCE.log("ToUseJobConsole: called");
		
		this.refreshParameters();
		
		// job name
		Date currentTime = new Date();
		String jobName = this.getName();
		if ( jobName==null || jobName.length()==0 ){
			jobName = String.format("ToUseJobConsole Run %1$tF %1$tT ", currentTime);
			this.setName(jobName);
		}
		
		// read the params
		try {
			this.setArgs();
		} catch(Exception e){
			CommonPlugin.INSTANCE.log("ToUseJobConsole: parameters not loaded, reason "+e.getMessage());
			String helpText = this.getHelpText();
			CommonPlugin.INSTANCE.log(helpText);
			return new ReturnFeedback("ToUseJobConsole.run", e);
		}
		
		CommonPlugin.INSTANCE.log("ToUseJobConsole: called by "+this.getCallerName());
		
		return ReturnFeedback.SUCCESS;
	}	

} //ToUseJobConsoleImpl
