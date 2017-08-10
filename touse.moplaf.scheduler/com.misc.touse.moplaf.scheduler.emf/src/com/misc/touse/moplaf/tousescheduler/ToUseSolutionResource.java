/**
 */
package com.misc.touse.moplaf.tousescheduler;

import com.misc.common.moplaf.scheduler.ResourceCandidateDateExpression;
import com.misc.common.moplaf.scheduler.ResourceCandidateFloatExpression;
import com.misc.common.moplaf.scheduler.SolutionResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Use Solution Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.ToUseSolutionResource#getToUseResource <em>To Use Resource</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.ToUseSolutionResource#getTotalDistance <em>Total Distance</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.ToUseSolutionResource#getEndTime <em>End Time</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseSolutionResource()
 * @model
 * @generated
 */
public interface ToUseSolutionResource extends SolutionResource {
	/**
	 * Returns the value of the '<em><b>To Use Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Use Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Use Resource</em>' reference.
	 * @see #setToUseResource(ToUseResource)
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseSolutionResource_ToUseResource()
	 * @model required="true"
	 * @generated
	 */
	ToUseResource getToUseResource();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousescheduler.ToUseSolutionResource#getToUseResource <em>To Use Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Use Resource</em>' reference.
	 * @see #getToUseResource()
	 * @generated
	 */
	void setToUseResource(ToUseResource value);

	/**
	 * Returns the value of the '<em><b>Total Distance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Distance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Distance</em>' reference.
	 * @see #setTotalDistance(ResourceCandidateFloatExpression)
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseSolutionResource_TotalDistance()
	 * @model
	 * @generated
	 */
	ResourceCandidateFloatExpression getTotalDistance();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousescheduler.ToUseSolutionResource#getTotalDistance <em>Total Distance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Distance</em>' reference.
	 * @see #getTotalDistance()
	 * @generated
	 */
	void setTotalDistance(ResourceCandidateFloatExpression value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time</em>' reference.
	 * @see #setEndTime(ResourceCandidateDateExpression)
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseSolutionResource_EndTime()
	 * @model
	 * @generated
	 */
	ResourceCandidateDateExpression getEndTime();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousescheduler.ToUseSolutionResource#getEndTime <em>End Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' reference.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(ResourceCandidateDateExpression value);

} // ToUseSolutionResource
