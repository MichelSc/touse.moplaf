/**
 */
package com.misc.touse.moplaf.tousejob.impl;

import com.misc.common.moplaf.common.ReturnFeedback;
import com.misc.common.moplaf.job.RunContext;
import com.misc.common.moplaf.job.jobclient.impl.JobRemoteImpl;

import com.misc.touse.moplaf.tousejob.ToUseJob;
import com.misc.touse.moplaf.tousejob.ToUseJobResult;
import com.misc.touse.moplaf.tousejob.TousejobFactory;
import com.misc.touse.moplaf.tousejob.TousejobPackage;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.common.CommonPlugin;
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
	protected static final int SECONDS_WAITING_EDEFAULT = 5;

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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TousejobPackage.TO_USE_JOB__SECONDS_WAITING:
				return getSecondsWaiting();
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
		result.append(')');
		return result.toString();
	}

	/**
	 * 
	 */
	@Override
	protected ReturnFeedback jobRunImpl(RunContext runContext) {
		int seconds = this.getSecondsWaiting();
		CommonPlugin.INSTANCE.log("ToUseJob "+this.getName()+" started");
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			CommonPlugin.INSTANCE.log("ToUseJob "+this.getName()+" interrupted");
		}
		Date now = new Date();
		long ticks = now.getTime()-this.getStartTime().getTime();
		ToUseJobResult result = TousejobFactory.eINSTANCE.createToUseJobResult();
		result.setTicksWaited(ticks);
		this.setResult(result);
		CommonPlugin.INSTANCE.log("ToUseJob "+this.getName()+" finished");
		return ReturnFeedback.SUCCESS;
	}

	
} //ToUseJobImpl
