/**
 */
package com.misc.touse.moplaf.tousescheduler;

import com.misc.common.moplaf.scheduler.Task;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Use Schedule Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask#getShipment <em>Shipment</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask#getDistance <em>Distance</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask#getDistanceFromPrevious <em>Distance From Previous</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask#getStartVolumeLoaded <em>Start Volume Loaded</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask#getEndVolumeLoaded <em>End Volume Loaded</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask#getLocationX <em>Location X</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask#getLocationY <em>Location Y</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask#getLoadFactor <em>Load Factor</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask#isVolumeOverload <em>Volume Overload</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseScheduleTask()
 * @model
 * @generated
 */
public interface ToUseScheduleTask extends Task {
	/**
	 * Returns the value of the '<em><b>Shipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment</em>' reference.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseScheduleTask_Shipment()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Shipment getShipment();

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(float)
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseScheduleTask_Distance()
	 * @model
	 * @generated
	 */
	float getDistance();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(float value);

	/**
	 * Returns the value of the '<em><b>Distance From Previous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance From Previous</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance From Previous</em>' attribute.
	 * @see #setDistanceFromPrevious(float)
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseScheduleTask_DistanceFromPrevious()
	 * @model
	 * @generated
	 */
	float getDistanceFromPrevious();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask#getDistanceFromPrevious <em>Distance From Previous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance From Previous</em>' attribute.
	 * @see #getDistanceFromPrevious()
	 * @generated
	 */
	void setDistanceFromPrevious(float value);

	/**
	 * Returns the value of the '<em><b>Start Volume Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Volume Loaded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Volume Loaded</em>' attribute.
	 * @see #setStartVolumeLoaded(float)
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseScheduleTask_StartVolumeLoaded()
	 * @model
	 * @generated
	 */
	float getStartVolumeLoaded();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask#getStartVolumeLoaded <em>Start Volume Loaded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Volume Loaded</em>' attribute.
	 * @see #getStartVolumeLoaded()
	 * @generated
	 */
	void setStartVolumeLoaded(float value);

	/**
	 * Returns the value of the '<em><b>End Volume Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Volume Loaded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Volume Loaded</em>' attribute.
	 * @see #setEndVolumeLoaded(float)
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseScheduleTask_EndVolumeLoaded()
	 * @model
	 * @generated
	 */
	float getEndVolumeLoaded();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask#getEndVolumeLoaded <em>End Volume Loaded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Volume Loaded</em>' attribute.
	 * @see #getEndVolumeLoaded()
	 * @generated
	 */
	void setEndVolumeLoaded(float value);

	/**
	 * Returns the value of the '<em><b>Location X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location X</em>' attribute.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseScheduleTask_LocationX()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	float getLocationX();

	/**
	 * Returns the value of the '<em><b>Location Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Y</em>' attribute.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseScheduleTask_LocationY()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	float getLocationY();

	/**
	 * Returns the value of the '<em><b>Load Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Factor</em>' attribute.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseScheduleTask_LoadFactor()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	float getLoadFactor();

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
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getToUseScheduleTask_VolumeOverload()
	 * @model
	 * @generated
	 */
	boolean isVolumeOverload();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask#isVolumeOverload <em>Volume Overload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume Overload</em>' attribute.
	 * @see #isVolumeOverload()
	 * @generated
	 */
	void setVolumeOverload(boolean value);

} // ToUseScheduleTask
