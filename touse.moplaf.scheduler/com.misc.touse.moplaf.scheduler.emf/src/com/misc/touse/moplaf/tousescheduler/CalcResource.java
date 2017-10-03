/**
 */
package com.misc.touse.moplaf.tousescheduler;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calc Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.CalcResource#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getCalcResource()
 * @model abstract="true"
 * @generated
 */
public interface CalcResource extends CalcScheduler {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getCalcResource_Resource()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	ToUseScheduleResource getResource();

} // CalcResource
