/**
 */
package com.misc.touse.moplaf.tousejob;

import com.misc.common.moplaf.job.jobclient.JobRemoteResult;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Use Job Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousejob.ToUseJobResult#getTicksWaited <em>Ticks Waited</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousejob.TousejobPackage#getToUseJobResult()
 * @model
 * @generated
 */
public interface ToUseJobResult extends JobRemoteResult {
	/**
	 * Returns the value of the '<em><b>Ticks Waited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ticks Waited</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ticks Waited</em>' attribute.
	 * @see #setTicksWaited(long)
	 * @see com.misc.touse.moplaf.tousejob.TousejobPackage#getToUseJobResult_TicksWaited()
	 * @model
	 * @generated
	 */
	long getTicksWaited();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousejob.ToUseJobResult#getTicksWaited <em>Ticks Waited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ticks Waited</em>' attribute.
	 * @see #getTicksWaited()
	 * @generated
	 */
	void setTicksWaited(long value);

} // ToUseJobResult