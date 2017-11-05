/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.common.moplaf.job.JobPackage;
import com.misc.common.moplaf.localsearch.LocalSearchPackage;
import com.misc.common.moplaf.propagator2.PropagatorPackage;

import com.misc.common.moplaf.scheduler.SchedulerPackage;
import com.misc.touse.moplaf.tousescheduler.CalcResource;
import com.misc.touse.moplaf.tousescheduler.CalcResourceDistance;
import com.misc.touse.moplaf.tousescheduler.CalcResourceDistanceFromLast;
import com.misc.touse.moplaf.tousescheduler.CalcResourcePlannedBenefit;
import com.misc.touse.moplaf.tousescheduler.CalcResourceVolumeOverload;
import com.misc.touse.moplaf.tousescheduler.CalcSchedule;
import com.misc.touse.moplaf.tousescheduler.CalcScheduler;
import com.misc.touse.moplaf.tousescheduler.CalcTask;
import com.misc.touse.moplaf.tousescheduler.CalcTaskDistance;
import com.misc.touse.moplaf.tousescheduler.CalcTaskDistanceFromPrevious;
import com.misc.touse.moplaf.tousescheduler.CalcTaskEndVolumeLoaded;
import com.misc.touse.moplaf.tousescheduler.CalcTaskStartVolumeLoaded;
import com.misc.touse.moplaf.tousescheduler.Domain;
import com.misc.touse.moplaf.tousescheduler.LayerScheduleDistance;
import com.misc.touse.moplaf.tousescheduler.LayerSchedulePlannedBenefit;
import com.misc.touse.moplaf.tousescheduler.LayerScheduleVolumeLoaded;
import com.misc.touse.moplaf.tousescheduler.ScopeScheduleScore;
import com.misc.touse.moplaf.tousescheduler.Shipment;
import com.misc.touse.moplaf.tousescheduler.ToUseActionLoadUnload;
import com.misc.touse.moplaf.tousescheduler.ToUseImprovementDestructConstruct;
import com.misc.touse.moplaf.tousescheduler.ToUseLoadShipment;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedule;
import com.misc.touse.moplaf.tousescheduler.ToUseScheduleLoadUnload;
import com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource;
import com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask;
import com.misc.touse.moplaf.tousescheduler.ToUseScheduler;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerFactory;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;
import com.misc.touse.moplaf.tousescheduler.ToUseScore;
import com.misc.touse.moplaf.tousescheduler.ToUseUnloadShipment;
import com.misc.touse.moplaf.tousescheduler.ToUseUnscheduleLoadUnload;
import com.misc.touse.moplaf.tousescheduler.Vehicle;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToUseSchedulerPackageImpl extends EPackageImpl implements ToUseSchedulerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vehicleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toUseScoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toUseSchedulerEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toUseScheduleTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcSchedulerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toUseScheduleResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopeScheduleScoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layerScheduleDistanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcTaskDistanceFromPreviousEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcTaskDistanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcResourceDistanceFromLastEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcResourceDistanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layerScheduleVolumeLoadedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcResourceVolumeOverloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layerSchedulePlannedBenefitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcResourcePlannedBenefitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcTaskStartVolumeLoadedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calcTaskEndVolumeLoadedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toUseUnscheduleLoadUnloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toUseImprovementDestructConstructEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toUseScheduleLoadUnloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toUseLoadShipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toUseUnloadShipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toUseActionLoadUnloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toUseScheduleEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ToUseSchedulerPackageImpl() {
		super(eNS_URI, ToUseSchedulerFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ToUseSchedulerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ToUseSchedulerPackage init() {
		if (isInited) return (ToUseSchedulerPackage)EPackage.Registry.INSTANCE.getEPackage(ToUseSchedulerPackage.eNS_URI);

		// Obtain or create and register package
		ToUseSchedulerPackageImpl theToUseSchedulerPackage = (ToUseSchedulerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ToUseSchedulerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ToUseSchedulerPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PropagatorPackage.eINSTANCE.eClass();
		SchedulerPackage.eINSTANCE.eClass();
		LocalSearchPackage.eINSTANCE.eClass();
		JobPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theToUseSchedulerPackage.createPackageContents();

		// Initialize created meta-data
		theToUseSchedulerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theToUseSchedulerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ToUseSchedulerPackage.eNS_URI, theToUseSchedulerPackage);
		return theToUseSchedulerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Schedulers() {
		return (EReference)domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Vehicles() {
		return (EReference)domainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Shipments() {
		return (EReference)domainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVehicle() {
		return vehicleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicle_Name() {
		return (EAttribute)vehicleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicle_HomeLocationX() {
		return (EAttribute)vehicleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicle_HomeLocationY() {
		return (EAttribute)vehicleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicle_MaxVolumeLoaded() {
		return (EAttribute)vehicleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUseScore() {
		return toUseScoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToUseScore_TotalDistance() {
		return (EAttribute)toUseScoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToUseScore_VolumeOverload() {
		return (EAttribute)toUseScoreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToUseScore_PlannedBenefit() {
		return (EAttribute)toUseScoreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUseScheduler() {
		return toUseSchedulerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseScheduler_SelectedVehicles() {
		return (EReference)toUseSchedulerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseScheduler_SelectedShipments() {
		return (EReference)toUseSchedulerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShipment() {
		return shipmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShipment_Name() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShipment_LoadLocationX() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShipment_LoadLocationY() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShipment_UnloadLocationX() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShipment_UnloadLocationY() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShipment_Volume() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShipment_PlannedBenefit() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUseScheduleTask() {
		return toUseScheduleTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseScheduleTask_Shipment() {
		return (EReference)toUseScheduleTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToUseScheduleTask_Distance() {
		return (EAttribute)toUseScheduleTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToUseScheduleTask_DistanceFromPrevious() {
		return (EAttribute)toUseScheduleTaskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToUseScheduleTask_StartVolumeLoaded() {
		return (EAttribute)toUseScheduleTaskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToUseScheduleTask_EndVolumeLoaded() {
		return (EAttribute)toUseScheduleTaskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToUseScheduleTask_LocationX() {
		return (EAttribute)toUseScheduleTaskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToUseScheduleTask_LocationY() {
		return (EAttribute)toUseScheduleTaskEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToUseScheduleTask_LoadFactor() {
		return (EAttribute)toUseScheduleTaskEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToUseScheduleTask_VolumeOverload() {
		return (EAttribute)toUseScheduleTaskEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcScheduler() {
		return calcSchedulerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcSchedule() {
		return calcScheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcSchedule_Schedule() {
		return (EReference)calcScheduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcResource() {
		return calcResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcResource_Resource() {
		return (EReference)calcResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcTask() {
		return calcTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcTask_Task() {
		return (EReference)calcTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUseScheduleResource() {
		return toUseScheduleResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseScheduleResource_Vehicle() {
		return (EReference)toUseScheduleResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToUseScheduleResource_DistanceFromLast() {
		return (EAttribute)toUseScheduleResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToUseScheduleResource_TotalDistance() {
		return (EAttribute)toUseScheduleResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToUseScheduleResource_VolumeOverload() {
		return (EAttribute)toUseScheduleResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToUseScheduleResource_PlannedBenefit() {
		return (EAttribute)toUseScheduleResourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScopeScheduleScore() {
		return scopeScheduleScoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayerScheduleDistance() {
		return layerScheduleDistanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayerScheduleDistance_ConcreteParent() {
		return (EReference)layerScheduleDistanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcTaskDistanceFromPrevious() {
		return calcTaskDistanceFromPreviousEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcTaskDistanceFromPrevious_ConcreteParent() {
		return (EReference)calcTaskDistanceFromPreviousEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcTaskDistance() {
		return calcTaskDistanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcTaskDistance_ConcreteParent() {
		return (EReference)calcTaskDistanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcResourceDistanceFromLast() {
		return calcResourceDistanceFromLastEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcResourceDistanceFromLast_ConcreteParent() {
		return (EReference)calcResourceDistanceFromLastEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcResourceDistance() {
		return calcResourceDistanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcResourceDistance_ConcreteParent() {
		return (EReference)calcResourceDistanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayerScheduleVolumeLoaded() {
		return layerScheduleVolumeLoadedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayerScheduleVolumeLoaded_ConcreteParent() {
		return (EReference)layerScheduleVolumeLoadedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcResourceVolumeOverload() {
		return calcResourceVolumeOverloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcResourceVolumeOverload_ConcreteParent() {
		return (EReference)calcResourceVolumeOverloadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayerSchedulePlannedBenefit() {
		return layerSchedulePlannedBenefitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayerSchedulePlannedBenefit_ConcreteParent() {
		return (EReference)layerSchedulePlannedBenefitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcResourcePlannedBenefit() {
		return calcResourcePlannedBenefitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcResourcePlannedBenefit_ConcreteParent() {
		return (EReference)calcResourcePlannedBenefitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcTaskStartVolumeLoaded() {
		return calcTaskStartVolumeLoadedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcTaskStartVolumeLoaded_ConcreteParent() {
		return (EReference)calcTaskStartVolumeLoadedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcTaskEndVolumeLoaded() {
		return calcTaskEndVolumeLoadedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalcTaskEndVolumeLoaded_ConcreteParent() {
		return (EReference)calcTaskEndVolumeLoadedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUseUnscheduleLoadUnload() {
		return toUseUnscheduleLoadUnloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUseImprovementDestructConstruct() {
		return toUseImprovementDestructConstructEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToUseImprovementDestructConstruct_DestructionChance() {
		return (EAttribute)toUseImprovementDestructConstructEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToUseImprovementDestructConstruct_ConstructionChance() {
		return (EAttribute)toUseImprovementDestructConstructEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUseScheduleLoadUnload() {
		return toUseScheduleLoadUnloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUseLoadShipment() {
		return toUseLoadShipmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseLoadShipment_ShipmentLoaded() {
		return (EReference)toUseLoadShipmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseLoadShipment_UnloadShipment() {
		return (EReference)toUseLoadShipmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUseUnloadShipment() {
		return toUseUnloadShipmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseUnloadShipment_ShipmentUnloaded() {
		return (EReference)toUseUnloadShipmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseUnloadShipment_LoadShipment() {
		return (EReference)toUseUnloadShipmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUseActionLoadUnload() {
		return toUseActionLoadUnloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseActionLoadUnload_LoadTask() {
		return (EReference)toUseActionLoadUnloadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUseSchedule() {
		return toUseScheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getToUseSchedule__Enable() {
		return toUseScheduleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseSchedulerFactory getToUseSchedulerFactory() {
		return (ToUseSchedulerFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		domainEClass = createEClass(DOMAIN);
		createEReference(domainEClass, DOMAIN__SCHEDULERS);
		createEReference(domainEClass, DOMAIN__VEHICLES);
		createEReference(domainEClass, DOMAIN__SHIPMENTS);

		vehicleEClass = createEClass(VEHICLE);
		createEAttribute(vehicleEClass, VEHICLE__NAME);
		createEAttribute(vehicleEClass, VEHICLE__HOME_LOCATION_X);
		createEAttribute(vehicleEClass, VEHICLE__HOME_LOCATION_Y);
		createEAttribute(vehicleEClass, VEHICLE__MAX_VOLUME_LOADED);

		shipmentEClass = createEClass(SHIPMENT);
		createEAttribute(shipmentEClass, SHIPMENT__NAME);
		createEAttribute(shipmentEClass, SHIPMENT__LOAD_LOCATION_X);
		createEAttribute(shipmentEClass, SHIPMENT__LOAD_LOCATION_Y);
		createEAttribute(shipmentEClass, SHIPMENT__UNLOAD_LOCATION_X);
		createEAttribute(shipmentEClass, SHIPMENT__UNLOAD_LOCATION_Y);
		createEAttribute(shipmentEClass, SHIPMENT__VOLUME);
		createEAttribute(shipmentEClass, SHIPMENT__PLANNED_BENEFIT);

		toUseSchedulerEClass = createEClass(TO_USE_SCHEDULER);
		createEReference(toUseSchedulerEClass, TO_USE_SCHEDULER__SELECTED_VEHICLES);
		createEReference(toUseSchedulerEClass, TO_USE_SCHEDULER__SELECTED_SHIPMENTS);

		toUseScheduleEClass = createEClass(TO_USE_SCHEDULE);
		createEOperation(toUseScheduleEClass, TO_USE_SCHEDULE___ENABLE);

		toUseScoreEClass = createEClass(TO_USE_SCORE);
		createEAttribute(toUseScoreEClass, TO_USE_SCORE__TOTAL_DISTANCE);
		createEAttribute(toUseScoreEClass, TO_USE_SCORE__VOLUME_OVERLOAD);
		createEAttribute(toUseScoreEClass, TO_USE_SCORE__PLANNED_BENEFIT);

		toUseScheduleResourceEClass = createEClass(TO_USE_SCHEDULE_RESOURCE);
		createEReference(toUseScheduleResourceEClass, TO_USE_SCHEDULE_RESOURCE__VEHICLE);
		createEAttribute(toUseScheduleResourceEClass, TO_USE_SCHEDULE_RESOURCE__DISTANCE_FROM_LAST);
		createEAttribute(toUseScheduleResourceEClass, TO_USE_SCHEDULE_RESOURCE__TOTAL_DISTANCE);
		createEAttribute(toUseScheduleResourceEClass, TO_USE_SCHEDULE_RESOURCE__VOLUME_OVERLOAD);
		createEAttribute(toUseScheduleResourceEClass, TO_USE_SCHEDULE_RESOURCE__PLANNED_BENEFIT);

		toUseScheduleTaskEClass = createEClass(TO_USE_SCHEDULE_TASK);
		createEReference(toUseScheduleTaskEClass, TO_USE_SCHEDULE_TASK__SHIPMENT);
		createEAttribute(toUseScheduleTaskEClass, TO_USE_SCHEDULE_TASK__DISTANCE);
		createEAttribute(toUseScheduleTaskEClass, TO_USE_SCHEDULE_TASK__DISTANCE_FROM_PREVIOUS);
		createEAttribute(toUseScheduleTaskEClass, TO_USE_SCHEDULE_TASK__START_VOLUME_LOADED);
		createEAttribute(toUseScheduleTaskEClass, TO_USE_SCHEDULE_TASK__END_VOLUME_LOADED);
		createEAttribute(toUseScheduleTaskEClass, TO_USE_SCHEDULE_TASK__LOCATION_X);
		createEAttribute(toUseScheduleTaskEClass, TO_USE_SCHEDULE_TASK__LOCATION_Y);
		createEAttribute(toUseScheduleTaskEClass, TO_USE_SCHEDULE_TASK__LOAD_FACTOR);
		createEAttribute(toUseScheduleTaskEClass, TO_USE_SCHEDULE_TASK__VOLUME_OVERLOAD);

		toUseLoadShipmentEClass = createEClass(TO_USE_LOAD_SHIPMENT);
		createEReference(toUseLoadShipmentEClass, TO_USE_LOAD_SHIPMENT__SHIPMENT_LOADED);
		createEReference(toUseLoadShipmentEClass, TO_USE_LOAD_SHIPMENT__UNLOAD_SHIPMENT);

		toUseUnloadShipmentEClass = createEClass(TO_USE_UNLOAD_SHIPMENT);
		createEReference(toUseUnloadShipmentEClass, TO_USE_UNLOAD_SHIPMENT__SHIPMENT_UNLOADED);
		createEReference(toUseUnloadShipmentEClass, TO_USE_UNLOAD_SHIPMENT__LOAD_SHIPMENT);

		toUseActionLoadUnloadEClass = createEClass(TO_USE_ACTION_LOAD_UNLOAD);
		createEReference(toUseActionLoadUnloadEClass, TO_USE_ACTION_LOAD_UNLOAD__LOAD_TASK);

		toUseScheduleLoadUnloadEClass = createEClass(TO_USE_SCHEDULE_LOAD_UNLOAD);

		toUseUnscheduleLoadUnloadEClass = createEClass(TO_USE_UNSCHEDULE_LOAD_UNLOAD);

		toUseImprovementDestructConstructEClass = createEClass(TO_USE_IMPROVEMENT_DESTRUCT_CONSTRUCT);
		createEAttribute(toUseImprovementDestructConstructEClass, TO_USE_IMPROVEMENT_DESTRUCT_CONSTRUCT__DESTRUCTION_CHANCE);
		createEAttribute(toUseImprovementDestructConstructEClass, TO_USE_IMPROVEMENT_DESTRUCT_CONSTRUCT__CONSTRUCTION_CHANCE);

		calcSchedulerEClass = createEClass(CALC_SCHEDULER);

		calcScheduleEClass = createEClass(CALC_SCHEDULE);
		createEReference(calcScheduleEClass, CALC_SCHEDULE__SCHEDULE);

		calcResourceEClass = createEClass(CALC_RESOURCE);
		createEReference(calcResourceEClass, CALC_RESOURCE__RESOURCE);

		calcTaskEClass = createEClass(CALC_TASK);
		createEReference(calcTaskEClass, CALC_TASK__TASK);

		scopeScheduleScoreEClass = createEClass(SCOPE_SCHEDULE_SCORE);

		layerScheduleDistanceEClass = createEClass(LAYER_SCHEDULE_DISTANCE);
		createEReference(layerScheduleDistanceEClass, LAYER_SCHEDULE_DISTANCE__CONCRETE_PARENT);

		calcTaskDistanceFromPreviousEClass = createEClass(CALC_TASK_DISTANCE_FROM_PREVIOUS);
		createEReference(calcTaskDistanceFromPreviousEClass, CALC_TASK_DISTANCE_FROM_PREVIOUS__CONCRETE_PARENT);

		calcTaskDistanceEClass = createEClass(CALC_TASK_DISTANCE);
		createEReference(calcTaskDistanceEClass, CALC_TASK_DISTANCE__CONCRETE_PARENT);

		calcResourceDistanceFromLastEClass = createEClass(CALC_RESOURCE_DISTANCE_FROM_LAST);
		createEReference(calcResourceDistanceFromLastEClass, CALC_RESOURCE_DISTANCE_FROM_LAST__CONCRETE_PARENT);

		calcResourceDistanceEClass = createEClass(CALC_RESOURCE_DISTANCE);
		createEReference(calcResourceDistanceEClass, CALC_RESOURCE_DISTANCE__CONCRETE_PARENT);

		layerScheduleVolumeLoadedEClass = createEClass(LAYER_SCHEDULE_VOLUME_LOADED);
		createEReference(layerScheduleVolumeLoadedEClass, LAYER_SCHEDULE_VOLUME_LOADED__CONCRETE_PARENT);

		calcTaskStartVolumeLoadedEClass = createEClass(CALC_TASK_START_VOLUME_LOADED);
		createEReference(calcTaskStartVolumeLoadedEClass, CALC_TASK_START_VOLUME_LOADED__CONCRETE_PARENT);

		calcTaskEndVolumeLoadedEClass = createEClass(CALC_TASK_END_VOLUME_LOADED);
		createEReference(calcTaskEndVolumeLoadedEClass, CALC_TASK_END_VOLUME_LOADED__CONCRETE_PARENT);

		calcResourceVolumeOverloadEClass = createEClass(CALC_RESOURCE_VOLUME_OVERLOAD);
		createEReference(calcResourceVolumeOverloadEClass, CALC_RESOURCE_VOLUME_OVERLOAD__CONCRETE_PARENT);

		layerSchedulePlannedBenefitEClass = createEClass(LAYER_SCHEDULE_PLANNED_BENEFIT);
		createEReference(layerSchedulePlannedBenefitEClass, LAYER_SCHEDULE_PLANNED_BENEFIT__CONCRETE_PARENT);

		calcResourcePlannedBenefitEClass = createEClass(CALC_RESOURCE_PLANNED_BENEFIT);
		createEReference(calcResourcePlannedBenefitEClass, CALC_RESOURCE_PLANNED_BENEFIT__CONCRETE_PARENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SchedulerPackage theSchedulerPackage = (SchedulerPackage)EPackage.Registry.INSTANCE.getEPackage(SchedulerPackage.eNS_URI);
		LocalSearchPackage theLocalSearchPackage = (LocalSearchPackage)EPackage.Registry.INSTANCE.getEPackage(LocalSearchPackage.eNS_URI);
		PropagatorPackage thePropagatorPackage = (PropagatorPackage)EPackage.Registry.INSTANCE.getEPackage(PropagatorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		toUseSchedulerEClass.getESuperTypes().add(theSchedulerPackage.getScheduler());
		toUseScheduleEClass.getESuperTypes().add(theSchedulerPackage.getSchedule());
		toUseScoreEClass.getESuperTypes().add(theLocalSearchPackage.getScore());
		toUseScheduleResourceEClass.getESuperTypes().add(theSchedulerPackage.getResource());
		toUseScheduleTaskEClass.getESuperTypes().add(theSchedulerPackage.getTask());
		toUseLoadShipmentEClass.getESuperTypes().add(this.getToUseScheduleTask());
		toUseUnloadShipmentEClass.getESuperTypes().add(this.getToUseScheduleTask());
		toUseActionLoadUnloadEClass.getESuperTypes().add(theLocalSearchPackage.getAction());
		toUseScheduleLoadUnloadEClass.getESuperTypes().add(this.getToUseActionLoadUnload());
		toUseUnscheduleLoadUnloadEClass.getESuperTypes().add(this.getToUseActionLoadUnload());
		toUseImprovementDestructConstructEClass.getESuperTypes().add(theLocalSearchPackage.getImprovement());
		calcSchedulerEClass.getESuperTypes().add(thePropagatorPackage.getPropagatorFunctionBindings());
		calcScheduleEClass.getESuperTypes().add(this.getCalcScheduler());
		calcResourceEClass.getESuperTypes().add(this.getCalcScheduler());
		calcTaskEClass.getESuperTypes().add(this.getCalcScheduler());
		scopeScheduleScoreEClass.getESuperTypes().add(this.getCalcSchedule());
		layerScheduleDistanceEClass.getESuperTypes().add(this.getCalcSchedule());
		calcTaskDistanceFromPreviousEClass.getESuperTypes().add(this.getCalcTask());
		calcTaskDistanceEClass.getESuperTypes().add(this.getCalcTask());
		calcResourceDistanceFromLastEClass.getESuperTypes().add(this.getCalcResource());
		calcResourceDistanceEClass.getESuperTypes().add(this.getCalcResource());
		layerScheduleVolumeLoadedEClass.getESuperTypes().add(this.getCalcSchedule());
		calcTaskStartVolumeLoadedEClass.getESuperTypes().add(this.getCalcTask());
		calcTaskEndVolumeLoadedEClass.getESuperTypes().add(this.getCalcTask());
		calcResourceVolumeOverloadEClass.getESuperTypes().add(this.getCalcResource());
		layerSchedulePlannedBenefitEClass.getESuperTypes().add(this.getCalcSchedule());
		calcResourcePlannedBenefitEClass.getESuperTypes().add(this.getCalcResource());

		// Initialize classes, features, and operations; add parameters
		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomain_Schedulers(), this.getToUseScheduler(), null, "Schedulers", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Vehicles(), this.getVehicle(), null, "Vehicles", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Shipments(), this.getShipment(), null, "Shipments", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vehicleEClass, Vehicle.class, "Vehicle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVehicle_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicle_HomeLocationX(), ecorePackage.getEFloat(), "HomeLocationX", null, 0, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicle_HomeLocationY(), ecorePackage.getEFloat(), "HomeLocationY", null, 0, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicle_MaxVolumeLoaded(), ecorePackage.getEFloat(), "MaxVolumeLoaded", null, 0, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shipmentEClass, Shipment.class, "Shipment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShipment_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_LoadLocationX(), ecorePackage.getEFloat(), "LoadLocationX", null, 0, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_LoadLocationY(), ecorePackage.getEFloat(), "LoadLocationY", null, 0, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_UnloadLocationX(), ecorePackage.getEFloat(), "UnloadLocationX", null, 0, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_UnloadLocationY(), ecorePackage.getEFloat(), "UnloadLocationY", null, 0, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_Volume(), ecorePackage.getEFloat(), "Volume", null, 0, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_PlannedBenefit(), ecorePackage.getEFloat(), "PlannedBenefit", null, 0, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toUseSchedulerEClass, ToUseScheduler.class, "ToUseScheduler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToUseScheduler_SelectedVehicles(), this.getVehicle(), null, "SelectedVehicles", null, 0, -1, ToUseScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToUseScheduler_SelectedShipments(), this.getShipment(), null, "SelectedShipments", null, 0, -1, ToUseScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toUseScheduleEClass, ToUseSchedule.class, "ToUseSchedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getToUseSchedule__Enable(), null, "enable", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(toUseScoreEClass, ToUseScore.class, "ToUseScore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToUseScore_TotalDistance(), ecorePackage.getEFloat(), "TotalDistance", null, 0, 1, ToUseScore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToUseScore_VolumeOverload(), ecorePackage.getEBoolean(), "VolumeOverload", null, 0, 1, ToUseScore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToUseScore_PlannedBenefit(), ecorePackage.getEFloat(), "PlannedBenefit", null, 0, 1, ToUseScore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toUseScheduleResourceEClass, ToUseScheduleResource.class, "ToUseScheduleResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToUseScheduleResource_Vehicle(), this.getVehicle(), null, "Vehicle", null, 1, 1, ToUseScheduleResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToUseScheduleResource_DistanceFromLast(), ecorePackage.getEFloat(), "DistanceFromLast", null, 0, 1, ToUseScheduleResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToUseScheduleResource_TotalDistance(), ecorePackage.getEFloat(), "TotalDistance", null, 0, 1, ToUseScheduleResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToUseScheduleResource_VolumeOverload(), ecorePackage.getEBoolean(), "VolumeOverload", null, 0, 1, ToUseScheduleResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToUseScheduleResource_PlannedBenefit(), ecorePackage.getEFloat(), "PlannedBenefit", null, 0, 1, ToUseScheduleResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toUseScheduleTaskEClass, ToUseScheduleTask.class, "ToUseScheduleTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToUseScheduleTask_Shipment(), this.getShipment(), null, "Shipment", null, 1, 1, ToUseScheduleTask.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getToUseScheduleTask_Distance(), ecorePackage.getEFloat(), "Distance", null, 0, 1, ToUseScheduleTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToUseScheduleTask_DistanceFromPrevious(), ecorePackage.getEFloat(), "DistanceFromPrevious", null, 0, 1, ToUseScheduleTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToUseScheduleTask_StartVolumeLoaded(), ecorePackage.getEFloat(), "StartVolumeLoaded", null, 0, 1, ToUseScheduleTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToUseScheduleTask_EndVolumeLoaded(), ecorePackage.getEFloat(), "EndVolumeLoaded", null, 0, 1, ToUseScheduleTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToUseScheduleTask_LocationX(), ecorePackage.getEFloat(), "locationX", null, 0, 1, ToUseScheduleTask.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getToUseScheduleTask_LocationY(), ecorePackage.getEFloat(), "locationY", null, 0, 1, ToUseScheduleTask.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getToUseScheduleTask_LoadFactor(), ecorePackage.getEFloat(), "LoadFactor", null, 0, 1, ToUseScheduleTask.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getToUseScheduleTask_VolumeOverload(), ecorePackage.getEBoolean(), "VolumeOverload", null, 0, 1, ToUseScheduleTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toUseLoadShipmentEClass, ToUseLoadShipment.class, "ToUseLoadShipment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToUseLoadShipment_ShipmentLoaded(), this.getShipment(), null, "ShipmentLoaded", null, 1, 1, ToUseLoadShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToUseLoadShipment_UnloadShipment(), this.getToUseUnloadShipment(), this.getToUseUnloadShipment_LoadShipment(), "UnloadShipment", null, 1, 1, ToUseLoadShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toUseUnloadShipmentEClass, ToUseUnloadShipment.class, "ToUseUnloadShipment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToUseUnloadShipment_ShipmentUnloaded(), this.getShipment(), null, "ShipmentUnloaded", null, 1, 1, ToUseUnloadShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToUseUnloadShipment_LoadShipment(), this.getToUseLoadShipment(), this.getToUseLoadShipment_UnloadShipment(), "LoadShipment", null, 1, 1, ToUseUnloadShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toUseActionLoadUnloadEClass, ToUseActionLoadUnload.class, "ToUseActionLoadUnload", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToUseActionLoadUnload_LoadTask(), this.getToUseLoadShipment(), null, "LoadTask", null, 1, 1, ToUseActionLoadUnload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toUseScheduleLoadUnloadEClass, ToUseScheduleLoadUnload.class, "ToUseScheduleLoadUnload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(toUseUnscheduleLoadUnloadEClass, ToUseUnscheduleLoadUnload.class, "ToUseUnscheduleLoadUnload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(toUseImprovementDestructConstructEClass, ToUseImprovementDestructConstruct.class, "ToUseImprovementDestructConstruct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToUseImprovementDestructConstruct_DestructionChance(), ecorePackage.getEFloat(), "DestructionChance", "0.05", 0, 1, ToUseImprovementDestructConstruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToUseImprovementDestructConstruct_ConstructionChance(), ecorePackage.getEFloat(), "ConstructionChance", "1.0", 0, 1, ToUseImprovementDestructConstruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calcSchedulerEClass, CalcScheduler.class, "CalcScheduler", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calcScheduleEClass, CalcSchedule.class, "CalcSchedule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcSchedule_Schedule(), this.getToUseSchedule(), null, "Schedule", null, 1, 1, CalcSchedule.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(calcResourceEClass, CalcResource.class, "CalcResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcResource_Resource(), this.getToUseScheduleResource(), null, "Resource", null, 1, 1, CalcResource.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(calcTaskEClass, CalcTask.class, "CalcTask", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcTask_Task(), this.getToUseScheduleTask(), null, "Task", null, 1, 1, CalcTask.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(scopeScheduleScoreEClass, ScopeScheduleScore.class, "ScopeScheduleScore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(layerScheduleDistanceEClass, LayerScheduleDistance.class, "LayerScheduleDistance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLayerScheduleDistance_ConcreteParent(), this.getScopeScheduleScore(), null, "ConcreteParent", null, 1, 1, LayerScheduleDistance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(calcTaskDistanceFromPreviousEClass, CalcTaskDistanceFromPrevious.class, "CalcTaskDistanceFromPrevious", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcTaskDistanceFromPrevious_ConcreteParent(), this.getLayerScheduleDistance(), null, "ConcreteParent", null, 1, 1, CalcTaskDistanceFromPrevious.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(calcTaskDistanceEClass, CalcTaskDistance.class, "CalcTaskDistance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcTaskDistance_ConcreteParent(), this.getLayerScheduleDistance(), null, "ConcreteParent", null, 1, 1, CalcTaskDistance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(calcResourceDistanceFromLastEClass, CalcResourceDistanceFromLast.class, "CalcResourceDistanceFromLast", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcResourceDistanceFromLast_ConcreteParent(), this.getLayerScheduleDistance(), null, "ConcreteParent", null, 1, 1, CalcResourceDistanceFromLast.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(calcResourceDistanceEClass, CalcResourceDistance.class, "CalcResourceDistance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcResourceDistance_ConcreteParent(), this.getLayerScheduleDistance(), null, "ConcreteParent", null, 1, 1, CalcResourceDistance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(layerScheduleVolumeLoadedEClass, LayerScheduleVolumeLoaded.class, "LayerScheduleVolumeLoaded", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLayerScheduleVolumeLoaded_ConcreteParent(), this.getScopeScheduleScore(), null, "ConcreteParent", null, 1, 1, LayerScheduleVolumeLoaded.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(calcTaskStartVolumeLoadedEClass, CalcTaskStartVolumeLoaded.class, "CalcTaskStartVolumeLoaded", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcTaskStartVolumeLoaded_ConcreteParent(), this.getLayerScheduleVolumeLoaded(), null, "ConcreteParent", null, 1, 1, CalcTaskStartVolumeLoaded.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(calcTaskEndVolumeLoadedEClass, CalcTaskEndVolumeLoaded.class, "CalcTaskEndVolumeLoaded", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcTaskEndVolumeLoaded_ConcreteParent(), this.getLayerScheduleVolumeLoaded(), null, "ConcreteParent", null, 1, 1, CalcTaskEndVolumeLoaded.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(calcResourceVolumeOverloadEClass, CalcResourceVolumeOverload.class, "CalcResourceVolumeOverload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcResourceVolumeOverload_ConcreteParent(), this.getLayerScheduleVolumeLoaded(), null, "ConcreteParent", null, 1, 1, CalcResourceVolumeOverload.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(layerSchedulePlannedBenefitEClass, LayerSchedulePlannedBenefit.class, "LayerSchedulePlannedBenefit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLayerSchedulePlannedBenefit_ConcreteParent(), this.getScopeScheduleScore(), null, "ConcreteParent", null, 1, 1, LayerSchedulePlannedBenefit.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(calcResourcePlannedBenefitEClass, CalcResourcePlannedBenefit.class, "CalcResourcePlannedBenefit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcResourcePlannedBenefit_ConcreteParent(), this.getLayerSchedulePlannedBenefit(), null, "ConcreteParent", null, 1, 1, CalcResourcePlannedBenefit.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ToUseSchedulerPackageImpl
