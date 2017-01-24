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
public class TousekpiviewFactoryImpl extends EFactoryImpl implements TousekpiviewFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TousekpiviewFactory init() {
		try {
			TousekpiviewFactory theTousekpiviewFactory = (TousekpiviewFactory)EPackage.Registry.INSTANCE.getEFactory(TousekpiviewPackage.eNS_URI);
			if (theTousekpiviewFactory != null) {
				return theTousekpiviewFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TousekpiviewFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TousekpiviewFactoryImpl() {
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
			case TousekpiviewPackage.DOMAIN: return createDomain();
			case TousekpiviewPackage.SCENARIO: return createScenario();
			case TousekpiviewPackage.KPI: return createKPI();
			case TousekpiviewPackage.KPI_RANGE: return createKPIRange();
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
	public TousekpiviewPackage getTousekpiviewPackage() {
		return (TousekpiviewPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TousekpiviewPackage getPackage() {
		return TousekpiviewPackage.eINSTANCE;
	}

} //TousekpiviewFactoryImpl
