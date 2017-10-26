/**
 */
package com.misc.touse.moplaf.kpiview.tousekpiview.impl;

import com.misc.touse.moplaf.kpiview.tousekpiview.*;

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
public class ToUseKpiViewFactoryImpl extends EFactoryImpl implements ToUseKpiViewFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ToUseKpiViewFactory init() {
		try {
			ToUseKpiViewFactory theToUseKpiViewFactory = (ToUseKpiViewFactory)EPackage.Registry.INSTANCE.getEFactory(ToUseKpiViewPackage.eNS_URI);
			if (theToUseKpiViewFactory != null) {
				return theToUseKpiViewFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ToUseKpiViewFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseKpiViewFactoryImpl() {
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
			case ToUseKpiViewPackage.DOMAIN: return createDomain();
			case ToUseKpiViewPackage.SCENARIO: return createScenario();
			case ToUseKpiViewPackage.KPI: return createKPI();
			case ToUseKpiViewPackage.KPI_RANGE: return createKPIRange();
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
	public Scenario createScenario() {
		ScenarioImpl scenario = new ScenarioImpl();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KPI createKPI() {
		KPIImpl kpi = new KPIImpl();
		return kpi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KPIRange createKPIRange() {
		KPIRangeImpl kpiRange = new KPIRangeImpl();
		return kpiRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseKpiViewPackage getToUseKpiViewPackage() {
		return (ToUseKpiViewPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ToUseKpiViewPackage getPackage() {
		return ToUseKpiViewPackage.eINSTANCE;
	}

} //ToUseKpiViewFactoryImpl
