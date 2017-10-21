/**
 */
package com.misc.touse.moplaf.tousescheduler;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage
 * @generated
 */
public interface ToUseSchedulerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToUseSchedulerFactory eINSTANCE = com.misc.touse.moplaf.tousescheduler.impl.ToUseSchedulerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain</em>'.
	 * @generated
	 */
	Domain createDomain();

	/**
	 * Returns a new object of class '<em>Vehicle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vehicle</em>'.
	 * @generated
	 */
	Vehicle createVehicle();

	/**
	 * Returns a new object of class '<em>To Use Score</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>To Use Score</em>'.
	 * @generated
	 */
	ToUseScore createToUseScore();

	/**
	 * Returns a new object of class '<em>To Use Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>To Use Scheduler</em>'.
	 * @generated
	 */
	ToUseScheduler createToUseScheduler();

	/**
	 * Returns a new object of class '<em>Shipment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shipment</em>'.
	 * @generated
	 */
	Shipment createShipment();

	/**
	 * Returns a new object of class '<em>To Use Schedule Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>To Use Schedule Task</em>'.
	 * @generated
	 */
	ToUseScheduleTask createToUseScheduleTask();

	/**
	 * Returns a new object of class '<em>To Use Schedule Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>To Use Schedule Resource</em>'.
	 * @generated
	 */
	ToUseScheduleResource createToUseScheduleResource();

	/**
	 * Returns a new object of class '<em>Scope Schedule Score</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scope Schedule Score</em>'.
	 * @generated
	 */
	ScopeScheduleScore createScopeScheduleScore();

	/**
	 * Returns a new object of class '<em>Layer Schedule Distance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layer Schedule Distance</em>'.
	 * @generated
	 */
	LayerScheduleDistance createLayerScheduleDistance();

	/**
	 * Returns a new object of class '<em>Calc Task Distance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Task Distance</em>'.
	 * @generated
	 */
	CalcTaskDistance createCalcTaskDistance();

	/**
	 * Returns a new object of class '<em>Calc Resource Distance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calc Resource Distance</em>'.
	 * @generated
	 */
	CalcResourceDistance createCalcResourceDistance();

	/**
	 * Returns a new object of class '<em>To Use Schedule Load Unload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>To Use Schedule Load Unload</em>'.
	 * @generated
	 */
	ToUseScheduleLoadUnload createToUseScheduleLoadUnload();

	/**
	 * Returns a new object of class '<em>To Use Load Shipment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>To Use Load Shipment</em>'.
	 * @generated
	 */
	ToUseLoadShipment createToUseLoadShipment();

	/**
	 * Returns a new object of class '<em>To Use Unload Shipment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>To Use Unload Shipment</em>'.
	 * @generated
	 */
	ToUseUnloadShipment createToUseUnloadShipment();

	/**
	 * Returns a new object of class '<em>To Use Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>To Use Schedule</em>'.
	 * @generated
	 */
	ToUseSchedule createToUseSchedule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ToUseSchedulerPackage getToUseSchedulerPackage();

} //ToUseSchedulerFactory
