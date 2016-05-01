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
public class TousedbsynchFactoryImpl extends EFactoryImpl implements TousedbsynchFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TousedbsynchFactory init() {
		try {
			TousedbsynchFactory theTousedbsynchFactory = (TousedbsynchFactory)EPackage.Registry.INSTANCE.getEFactory(TousedbsynchPackage.eNS_URI);
			if (theTousedbsynchFactory != null) {
				return theTousedbsynchFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TousedbsynchFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TousedbsynchFactoryImpl() {
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
			case TousedbsynchPackage.FPD: return createFPD();
			case TousedbsynchPackage.FPD_GROUP_SORTING_PLAN: return createFPDGroupSortingPlan();
			case TousedbsynchPackage.FPD_SORTING_PLANS: return createFPDSortingPlans();
			case TousedbsynchPackage.FPD_SORTING_PLAN_INPUTS: return createFPDSortingPlanInputs();
			case TousedbsynchPackage.FPD_SORTING_PLAN: return createFPDSortingPlan();
			case TousedbsynchPackage.FPD_SORTING_PLAN_INPUT: return createFPDSortingPlanInput();
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
	public TousedbsynchPackage getTousedbsynchPackage() {
		return (TousedbsynchPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TousedbsynchPackage getPackage() {
		return TousedbsynchPackage.eINSTANCE;
	}

} //TousedbsynchFactoryImpl
