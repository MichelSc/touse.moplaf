/**
 */
package com.misc.touse.moplaf.tousescheduler;

import com.misc.common.moplaf.scheduler.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Use Schedule Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource#getToUseResource <em>To Use Resource</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource#getTotalDistance <em>Total Distance</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseScheduleResource()
 * @model
 * @generated
 */
public interface ToUseScheduleResource extends Resource {
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
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseScheduleResource_ToUseResource()
	 * @model required="true"
	 * @generated
	 */
	ToUseResource getToUseResource();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource#getToUseResource <em>To Use Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Use Resource</em>' reference.
	 * @see #getToUseResource()
	 * @generated
	 */
	void setToUseResource(ToUseResource value);

	/**
	 * Returns the value of the '<em><b>Total Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Distance</em>' attribute.
	 * @see #setTotalDistance(float)
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseScheduleResource_TotalDistance()
	 * @model
	 * @generated
	 */
	float getTotalDistance();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource#getTotalDistance <em>Total Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Distance</em>' attribute.
	 * @see #getTotalDistance()
	 * @generated
	 */
	void setTotalDistance(float value);

} // ToUseScheduleResource
