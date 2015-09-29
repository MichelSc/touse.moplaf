/**
 */
package com.misc.touse.moplaf.report.ToUseReport.impl;

import com.misc.common.moplaf.Report.impl.ReportAbstractImpl;

import com.misc.touse.moplaf.report.ToUseReport.A;
import com.misc.touse.moplaf.report.ToUseReport.ReportA;
import com.misc.touse.moplaf.report.ToUseReport.ToUseReportPackage;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.osgi.framework.Bundle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Report A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.report.ToUseReport.impl.ReportAImpl#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReportAImpl extends ReportAbstractImpl implements ReportA {
	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected A context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseReportPackage.Literals.REPORT_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (A)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToUseReportPackage.REPORT_A__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(A newContext) {
		A oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseReportPackage.REPORT_A__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUseReportPackage.REPORT_A__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
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
			case ToUseReportPackage.REPORT_A__CONTEXT:
				setContext((A)newValue);
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
			case ToUseReportPackage.REPORT_A__CONTEXT:
				setContext((A)null);
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
			case ToUseReportPackage.REPORT_A__CONTEXT:
				return context != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String getReportDesignFilePath() {
		return "model/toUse.rptdesign";
	}

	@Override
	public String getReportBundleID() {
		return "com.misc.touse.moplaf.report.emf.ToUseReport";
	}
	
	
	

} //ReportAImpl
