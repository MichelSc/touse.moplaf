/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.touse.moplaf.tousescheduler.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToUseSchedulerFactoryImpl extends EFactoryImpl implements ToUseSchedulerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ToUseSchedulerFactory init() {
		try {
			ToUseSchedulerFactory theToUseSchedulerFactory = (ToUseSchedulerFactory)EPackage.Registry.INSTANCE.getEFactory(ToUseSchedulerPackage.eNS_URI);
			if (theToUseSchedulerFactory != null) {
				return theToUseSchedulerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ToUseSchedulerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseSchedulerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ToUseSchedulerPackage.DOMAIN: return createDomain();
			case ToUseSchedulerPackage.VEHICLE: return createVehicle();
			case ToUseSchedulerPackage.SHIPMENT: return createShipment();
			case ToUseSchedulerPackage.TO_USE_SCHEDULER: return createToUseScheduler();
			case ToUseSchedulerPackage.TO_USE_SCHEDULE: return createToUseSchedule();
			case ToUseSchedulerPackage.TO_USE_SCORE: return createToUseScore();
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_RESOURCE: return createToUseScheduleResource();
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK: return createToUseScheduleTask();
			case ToUseSchedulerPackage.TO_USE_LOAD_SHIPMENT: return createToUseLoadShipment();
			case ToUseSchedulerPackage.TO_USE_UNLOAD_SHIPMENT: return createToUseUnloadShipment();
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_LOAD_UNLOAD: return createToUseScheduleLoadUnload();
			case ToUseSchedulerPackage.SCOPE_SCHEDULE_SCORE: return createScopeScheduleScore();
			case ToUseSchedulerPackage.LAYER_SCHEDULE_DISTANCE: return createLayerScheduleDistance();
			case ToUseSchedulerPackage.CALC_TASK_DISTANCE: return createCalcTaskDistance();
			case ToUseSchedulerPackage.CALC_RESOURCE_DISTANCE: return createCalcResourceDistance();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain createDomain() {
		DomainImpl domain = new DomainImpl();
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vehicle createVehicle() {
		VehicleImpl vehicle = new VehicleImpl();
		return vehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseScore createToUseScore() {
		ToUseScoreImpl toUseScore = new ToUseScoreImpl();
		return toUseScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseScheduler createToUseScheduler() {
		ToUseSchedulerImpl toUseScheduler = new ToUseSchedulerImpl();
		return toUseScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shipment createShipment() {
		ShipmentImpl shipment = new ShipmentImpl();
		return shipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseScheduleTask createToUseScheduleTask() {
		ToUseScheduleTaskImpl toUseScheduleTask = new ToUseScheduleTaskImpl();
		return toUseScheduleTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseScheduleResource createToUseScheduleResource() {
		ToUseScheduleResourceImpl toUseScheduleResource = new ToUseScheduleResourceImpl();
		return toUseScheduleResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeScheduleScore createScopeScheduleScore() {
		ScopeScheduleScoreImpl scopeScheduleScore = new ScopeScheduleScoreImpl();
		return scopeScheduleScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerScheduleDistance createLayerScheduleDistance() {
		LayerScheduleDistanceImpl layerScheduleDistance = new LayerScheduleDistanceImpl();
		return layerScheduleDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcTaskDistance createCalcTaskDistance() {
		CalcTaskDistanceImpl calcTaskDistance = new CalcTaskDistanceImpl();
		return calcTaskDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcResourceDistance createCalcResourceDistance() {
		CalcResourceDistanceImpl calcResourceDistance = new CalcResourceDistanceImpl();
		return calcResourceDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseScheduleLoadUnload createToUseScheduleLoadUnload() {
		ToUseScheduleLoadUnloadImpl toUseScheduleLoadUnload = new ToUseScheduleLoadUnloadImpl();
		return toUseScheduleLoadUnload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseLoadShipment createToUseLoadShipment() {
		ToUseLoadShipmentImpl toUseLoadShipment = new ToUseLoadShipmentImpl();
		return toUseLoadShipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseUnloadShipment createToUseUnloadShipment() {
		ToUseUnloadShipmentImpl toUseUnloadShipment = new ToUseUnloadShipmentImpl();
		return toUseUnloadShipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseSchedule createToUseSchedule() {
		ToUseScheduleImpl toUseSchedule = new ToUseScheduleImpl();
		return toUseSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseSchedulerPackage getToUseSchedulerPackage() {
		return (ToUseSchedulerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ToUseSchedulerPackage getPackage() {
		return ToUseSchedulerPackage.eINSTANCE;
	}

} //ToUseSchedulerFactoryImpl
