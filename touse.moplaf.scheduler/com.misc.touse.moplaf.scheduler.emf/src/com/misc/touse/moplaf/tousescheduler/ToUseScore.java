/**
 */
package com.misc.touse.moplaf.tousescheduler;

import com.misc.common.moplaf.localsearch.Score;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Use Score</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.ToUseScore#getTotalDistance <em>Total Distance</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.ToUseScore#isVolumeOverload <em>Volume Overload</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.ToUseScore#getPlannedBenefit <em>Planned Benefit</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseScore()
 * @model
 * @generated
 */
public interface ToUseScore extends Score {
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
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseScore_TotalDistance()
	 * @model
	 * @generated
	 */
	float getTotalDistance();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousescheduler.ToUseScore#getTotalDistance <em>Total Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Distance</em>' attribute.
	 * @see #getTotalDistance()
	 * @generated
	 */
	void setTotalDistance(float value);

	/**
	 * Returns the value of the '<em><b>Volume Overload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume Overload</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume Overload</em>' attribute.
	 * @see #setVolumeOverload(boolean)
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseScore_VolumeOverload()
	 * @model
	 * @generated
	 */
	boolean isVolumeOverload();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousescheduler.ToUseScore#isVolumeOverload <em>Volume Overload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume Overload</em>' attribute.
	 * @see #isVolumeOverload()
	 * @generated
	 */
	void setVolumeOverload(boolean value);

	/**
	 * Returns the value of the '<em><b>Planned Benefit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planned Benefit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planned Benefit</em>' attribute.
	 * @see #setPlannedBenefit(float)
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseScore_PlannedBenefit()
	 * @model
	 * @generated
	 */
	float getPlannedBenefit();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousescheduler.ToUseScore#getPlannedBenefit <em>Planned Benefit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planned Benefit</em>' attribute.
	 * @see #getPlannedBenefit()
	 * @generated
	 */
	void setPlannedBenefit(float value);

} // ToUseScore
