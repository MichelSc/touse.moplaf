/**
 */
package com.misc.touse.moplaf.tousejob;

import com.misc.common.moplaf.job.jobclient.JobRemote;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Use Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousejob.ToUseJob#getSecondsWaiting <em>Seconds Waiting</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousejob.TousejobPackage#getToUseJob()
 * @model
 * @generated
 */
public interface ToUseJob extends JobRemote {
	/**
	 * Returns the value of the '<em><b>Seconds Waiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seconds Waiting</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seconds Waiting</em>' attribute.
	 * @see #setSecondsWaiting(int)
	 * @see com.misc.touse.moplaf.tousejob.TousejobPackage#getToUseJob_SecondsWaiting()
	 * @model
	 * @generated
	 */
	int getSecondsWaiting();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousejob.ToUseJob#getSecondsWaiting <em>Seconds Waiting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seconds Waiting</em>' attribute.
	 * @see #getSecondsWaiting()
	 * @generated
	 */
	void setSecondsWaiting(int value);

} // ToUseJob
