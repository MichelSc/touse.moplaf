/**
 */
package com.misc.touse.moplaf.tousepropagator2.calc.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.misc.touse.moplaf.tousepropagator2.calc.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CalcFactoryImpl extends EFactoryImpl implements CalcFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CalcFactory init() {
		try {
			CalcFactory theCalcFactory = (CalcFactory)EPackage.Registry.INSTANCE.getEFactory(CalcPackage.eNS_URI);
			if (theCalcFactory != null) {
				return theCalcFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CalcFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcFactoryImpl() {
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
			case CalcPackage.SCOPE_PROJECT: return createScopeProject();
			case CalcPackage.LAYER_TASK_HOURS_ITEM: return createLayerTaskHoursItem();
			case CalcPackage.LAYER_TASK_HOURS_VAR: return createLayerTaskHoursVar();
			case CalcPackage.LAYER_TASK_HOURS: return createLayerTaskHours();
			case CalcPackage.LAYER_TASK_TIMES: return createLayerTaskTimes();
			case CalcPackage.CALC_PROJECT_END: return createCalcProjectEnd();
			case CalcPackage.LAYER_TASK_RESOURCES: return createLayerTaskResources();
			case CalcPackage.CALC_TASK_HOURS_ITEM: return createCalcTaskHoursItem();
			case CalcPackage.CALC_TASK_HOURS_VAR: return createCalcTaskHoursVar();
			case CalcPackage.CALC_TASK_HOURS: return createCalcTaskHours();
			case CalcPackage.CALC_TASK_START: return createCalcTaskStart();
			case CalcPackage.CALC_TASK_END: return createCalcTaskEnd();
			case CalcPackage.CALC_TASK_RESOURCES: return createCalcTaskResources();
			case CalcPackage.TO_USE_PROPAGATOR_FUNCTION: return createToUsePropagatorFunction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcTaskStart createCalcTaskStart() {
		CalcTaskStartImpl calcTaskStart = new CalcTaskStartImpl();
		return calcTaskStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcTaskEnd createCalcTaskEnd() {
		CalcTaskEndImpl calcTaskEnd = new CalcTaskEndImpl();
		return calcTaskEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcTaskResources createCalcTaskResources() {
		CalcTaskResourcesImpl calcTaskResources = new CalcTaskResourcesImpl();
		return calcTaskResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcProjectEnd createCalcProjectEnd() {
		CalcProjectEndImpl calcProjectEnd = new CalcProjectEndImpl();
		return calcProjectEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerTaskResources createLayerTaskResources() {
		LayerTaskResourcesImpl layerTaskResources = new LayerTaskResourcesImpl();
		return layerTaskResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUsePropagatorFunction createToUsePropagatorFunction() {
		ToUsePropagatorFunctionImpl toUsePropagatorFunction = new ToUsePropagatorFunctionImpl();
		return toUsePropagatorFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerTaskTimes createLayerTaskTimes() {
		LayerTaskTimesImpl layerTaskTimes = new LayerTaskTimesImpl();
		return layerTaskTimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcTaskHoursItem createCalcTaskHoursItem() {
		CalcTaskHoursItemImpl calcTaskHoursItem = new CalcTaskHoursItemImpl();
		return calcTaskHoursItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcTaskHoursVar createCalcTaskHoursVar() {
		CalcTaskHoursVarImpl calcTaskHoursVar = new CalcTaskHoursVarImpl();
		return calcTaskHoursVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcTaskHours createCalcTaskHours() {
		CalcTaskHoursImpl calcTaskHours = new CalcTaskHoursImpl();
		return calcTaskHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeProject createScopeProject() {
		ScopeProjectImpl scopeProject = new ScopeProjectImpl();
		return scopeProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerTaskHoursItem createLayerTaskHoursItem() {
		LayerTaskHoursItemImpl layerTaskHoursItem = new LayerTaskHoursItemImpl();
		return layerTaskHoursItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerTaskHoursVar createLayerTaskHoursVar() {
		LayerTaskHoursVarImpl layerTaskHoursVar = new LayerTaskHoursVarImpl();
		return layerTaskHoursVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerTaskHours createLayerTaskHours() {
		LayerTaskHoursImpl layerTaskHours = new LayerTaskHoursImpl();
		return layerTaskHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcPackage getCalcPackage() {
		return (CalcPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CalcPackage getPackage() {
		return CalcPackage.eINSTANCE;
	}

} //CalcFactoryImpl
