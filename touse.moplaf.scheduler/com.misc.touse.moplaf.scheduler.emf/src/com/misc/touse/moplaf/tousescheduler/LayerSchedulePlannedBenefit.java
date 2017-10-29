/**
 */
package com.misc.touse.moplaf.tousescheduler;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer Schedule Planned Benefit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.LayerSchedulePlannedBenefit#getConcreteParent <em>Concrete Parent</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getLayerSchedulePlannedBenefit()
 * @model
 * @generated
 */
public interface LayerSchedulePlannedBenefit extends CalcSchedule {
	/**
	 * Returns the value of the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Parent</em>' reference.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getLayerSchedulePlannedBenefit_ConcreteParent()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	ScopeScheduleScore getConcreteParent();

} // LayerSchedulePlannedBenefit
