/**
 */
package com.misc.touse.moplaf.tousepropagator2calc.impl;

import com.misc.touse.moplaf.tousepropagator2calc.*;

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
public class ToUsePropagatorCalcFactoryImpl extends EFactoryImpl implements ToUsePropagatorCalcFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ToUsePropagatorCalcFactory init() {
		try {
			ToUsePropagatorCalcFactory theToUsePropagatorCalcFactory = (ToUsePropagatorCalcFactory)EPackage.Registry.INSTANCE.getEFactory(ToUsePropagatorCalcPackage.eNS_URI);
			if (theToUsePropagatorCalcFactory != null) {
				return theToUsePropagatorCalcFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ToUsePropagatorCalcFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUsePropagatorCalcFactoryImpl() {
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
			case ToUsePropagatorCalcPackage.SCOPE_PROJECT: return createScopeProject();
			case ToUsePropagatorCalcPackage.LAYER_TASK_HOURS_ITEM: return createLayerTaskHoursItem();
			case ToUsePropagatorCalcPackage.LAYER_TASK_HOURS_VAR: return createLayerTaskHoursVar();
			case ToUsePropagatorCalcPackage.LAYER_TASK_HOURS: return createLayerTaskHours();
			case ToUsePropagatorCalcPackage.LAYER_TASK_TIMES: return createLayerTaskTimes();
			case ToUsePropagatorCalcPackage.LAYER_TASK_RESOURCES: return createLayerTaskResources();
			case ToUsePropagatorCalcPackage.CALC_PROJECT_END: return createCalcProjectEnd();
			case ToUsePropagatorCalcPackage.CALC_TASK_HOURS_ITEM: return createCalcTaskHoursItem();
			case ToUsePropagatorCalcPackage.CALC_TASK_HOURS_VAR: return createCalcTaskHoursVar();
			case ToUsePropagatorCalcPackage.CALC_TASK_HOURS: return createCalcTaskHours();
			case ToUsePropagatorCalcPackage.CALC_TASK_START: return createCalcTaskStart();
			case ToUsePropagatorCalcPackage.CALC_TASK_END: return createCalcTaskEnd();
			case ToUsePropagatorCalcPackage.CALC_TASK_RESOURCES: return createCalcTaskResources();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public LayerTaskTimes createLayerTaskTimes() {
		LayerTaskTimesImpl layerTaskTimes = new LayerTaskTimesImpl();
		return layerTaskTimes;
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
	public ToUsePropagatorCalcPackage getToUsePropagatorCalcPackage() {
		return (ToUsePropagatorCalcPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ToUsePropagatorCalcPackage getPackage() {
		return ToUsePropagatorCalcPackage.eINSTANCE;
	}

} //ToUsePropagatorCalcFactoryImpl
