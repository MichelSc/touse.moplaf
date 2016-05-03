/**
 */
package com.misc.touse.moplaf.dbsynch.tousedbsynch.impl;

import com.misc.touse.moplaf.dbsynch.tousedbsynch.*;

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
public class ToUseDbSynchFactoryImpl extends EFactoryImpl implements ToUseDbSynchFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ToUseDbSynchFactory init() {
		try {
			ToUseDbSynchFactory theToUseDbSynchFactory = (ToUseDbSynchFactory)EPackage.Registry.INSTANCE.getEFactory(ToUseDbSynchPackage.eNS_URI);
			if (theToUseDbSynchFactory != null) {
				return theToUseDbSynchFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ToUseDbSynchFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseDbSynchFactoryImpl() {
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
			case ToUseDbSynchPackage.FPD: return createFPD();
			case ToUseDbSynchPackage.FPD_GROUP_SORTING_PLAN: return createFPDGroupSortingPlan();
			case ToUseDbSynchPackage.FPD_SORTING_PLANS: return createFPDSortingPlans();
			case ToUseDbSynchPackage.FPD_SORTING_PLAN_INPUTS: return createFPDSortingPlanInputs();
			case ToUseDbSynchPackage.FPD_SORTING_PLAN: return createFPDSortingPlan();
			case ToUseDbSynchPackage.FPD_SORTING_PLAN_INPUT: return createFPDSortingPlanInput();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPD createFPD() {
		FPDImpl fpd = new FPDImpl();
		return fpd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPDGroupSortingPlan createFPDGroupSortingPlan() {
		FPDGroupSortingPlanImpl fpdGroupSortingPlan = new FPDGroupSortingPlanImpl();
		return fpdGroupSortingPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPDSortingPlans createFPDSortingPlans() {
		FPDSortingPlansImpl fpdSortingPlans = new FPDSortingPlansImpl();
		return fpdSortingPlans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPDSortingPlanInputs createFPDSortingPlanInputs() {
		FPDSortingPlanInputsImpl fpdSortingPlanInputs = new FPDSortingPlanInputsImpl();
		return fpdSortingPlanInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPDSortingPlan createFPDSortingPlan() {
		FPDSortingPlanImpl fpdSortingPlan = new FPDSortingPlanImpl();
		return fpdSortingPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPDSortingPlanInput createFPDSortingPlanInput() {
		FPDSortingPlanInputImpl fpdSortingPlanInput = new FPDSortingPlanInputImpl();
		return fpdSortingPlanInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseDbSynchPackage getToUseDbSynchPackage() {
		return (ToUseDbSynchPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ToUseDbSynchPackage getPackage() {
		return ToUseDbSynchPackage.eINSTANCE;
	}

} //ToUseDbSynchFactoryImpl
