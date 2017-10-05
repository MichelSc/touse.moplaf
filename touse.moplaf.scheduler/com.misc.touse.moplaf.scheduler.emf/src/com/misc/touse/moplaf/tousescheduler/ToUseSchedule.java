/**
 */
package com.misc.touse.moplaf.tousescheduler;

import com.misc.common.moplaf.scheduler.Schedule;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Use Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.ToUseSchedule#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseSchedule()
 * @model
 * @generated
 */
public interface ToUseSchedule extends Schedule {

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.tousescheduler.ToUseAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseSchedule_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ToUseAction> getActions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void enable();
} // ToUseSchedule
