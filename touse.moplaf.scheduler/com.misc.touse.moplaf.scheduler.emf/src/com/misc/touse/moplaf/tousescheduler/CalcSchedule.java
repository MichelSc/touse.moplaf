/**
 */
package com.misc.touse.moplaf.tousescheduler;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calc Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.CalcSchedule#getSchedule <em>Schedule</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getCalcSchedule()
 * @model abstract="true"
 * @generated
 */
public interface CalcSchedule extends CalcScheduler {
	/**
	 * Returns the value of the '<em><b>Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule</em>' reference.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getCalcSchedule_Schedule()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	ToUseSchedule getSchedule();

} // CalcSchedule
