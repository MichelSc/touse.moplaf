/**
 */
package com.misc.touse.moplaf.tousejob;

import com.misc.common.moplaf.job.jobclient.JobEngineInProcess;

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
 *   <li>{@link com.misc.touse.moplaf.tousejob.Domain#getEngines <em>Engines</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousejob.Domain#getJobs <em>Jobs</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousejob.TousejobPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>Engines</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Engines</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engines</em>' containment reference.
	 * @see #setEngines(JobEngineInProcess)
	 * @see com.misc.touse.moplaf.tousejob.TousejobPackage#getDomain_Engines()
	 * @model containment="true"
	 * @generated
	 */
	JobEngineInProcess getEngines();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousejob.Domain#getEngines <em>Engines</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engines</em>' containment reference.
	 * @see #getEngines()
	 * @generated
	 */
	void setEngines(JobEngineInProcess value);

	/**
	 * Returns the value of the '<em><b>Jobs</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.tousejob.ToUseJob}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jobs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs</em>' containment reference list.
	 * @see com.misc.touse.moplaf.tousejob.TousejobPackage#getDomain_Jobs()
	 * @model containment="true"
	 * @generated
	 */
	EList<ToUseJob> getJobs();

} // Domain
