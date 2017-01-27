/**
 */
package com.misc.touse.moplaf.kpiview.tousekpiview;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.misc.touse.moplaf.kpiview.tousekpiview.TousekpiviewFactory
 * @model kind="package"
 * @generated
 */
public interface TousekpiviewPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tousekpiview";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/touse/moplaf/kpiview/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tkv";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TousekpiviewPackage eINSTANCE = com.misc.touse.moplaf.kpiview.tousekpiview.impl.TousekpiviewPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.kpiview.tousekpiview.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.kpiview.tousekpiview.impl.DomainImpl
	 * @see com.misc.touse.moplaf.kpiview.tousekpiview.impl.TousekpiviewPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Scenarios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__SCENARIOS = 0;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.kpiview.tousekpiview.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.kpiview.tousekpiview.impl.ScenarioImpl
	 * @see com.misc.touse.moplaf.kpiview.tousekpiview.impl.TousekpiviewPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__NAME = 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__COLOR = 1;

	/**
	 * The feature id for the '<em><b>KP Is</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__KP_IS = 2;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.kpiview.tousekpiview.impl.KPIImpl <em>KPI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.kpiview.tousekpiview.impl.KPIImpl
	 * @see com.misc.touse.moplaf.kpiview.tousekpiview.impl.TousekpiviewPackageImpl#getKPI()
	 * @generated
	 */
	int KPI = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI__NAME = 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI__COLOR = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI__MIN_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI__MAX_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Ranges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI__RANGES = 5;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI__UNIT = 6;

	/**
	 * The number of structural features of the '<em>KPI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>KPI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.kpiview.tousekpiview.impl.KPIRangeImpl <em>KPI Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.kpiview.tousekpiview.impl.KPIRangeImpl
	 * @see com.misc.touse.moplaf.kpiview.tousekpiview.impl.TousekpiviewPackageImpl#getKPIRange()
	 * @generated
	 */
	int KPI_RANGE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_RANGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_RANGE__COLOR = 1;

	/**
	 * The feature id for the '<em><b>Low Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_RANGE__LOW_VALUE = 2;

	/**
	 * The feature id for the '<em><b>High Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_RANGE__HIGH_VALUE = 3;

	/**
	 * The number of structural features of the '<em>KPI Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_RANGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>KPI Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_RANGE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.kpiview.tousekpiview.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see com.misc.touse.moplaf.kpiview.tousekpiview.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.kpiview.tousekpiview.Domain#getScenarios <em>Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenarios</em>'.
	 * @see com.misc.touse.moplaf.kpiview.tousekpiview.Domain#getScenarios()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Scenarios();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.kpiview.tousekpiview.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see com.misc.touse.moplaf.kpiview.tousekpiview.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.kpiview.tousekpiview.Scenario#getKPIs <em>KP Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>KP Is</em>'.
	 * @see com.misc.touse.moplaf.kpiview.tousekpiview.Scenario#getKPIs()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_KPIs();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.kpiview.tousekpiview.Scenario#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.touse.moplaf.kpiview.tousekpiview.Scenario#getName()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.kpiview.tousekpiview.Scenario#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see com.misc.touse.moplaf.kpiview.tousekpiview.Scenario#getColor()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Color();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.kpiview.tousekpiview.KPI <em>KPI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KPI</em>'.
	 * @see com.misc.touse.moplaf.kpiview.tousekpiview.KPI
	 * @generated
	 */
	EClass getKPI();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.kpiview.tousekpiview.KPI#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.touse.moplaf.kpiview.tousekpiview.KPI#getName()
	 * @see #getKPI()
	 * @generated
	 */
	EAttribute getKPI_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.kpiview.tousekpiview.KPI#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.misc.touse.moplaf.kpiview.tousekpiview.KPI#getValue()
	 * @see #getKPI()
	 * @generated
	 */
	EAttribute getKPI_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.kpiview.tousekpiview.KPI#getRanges <em>Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ranges</em>'.
	 * @see com.misc.touse.moplaf.kpiview.tousekpiview.KPI#getRanges()
	 * @see #getKPI()
	 * @generated
	 */
	EReference getKPI_Ranges();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.kpiview.tousekpiview.KPI#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see com.misc.touse.moplaf.kpiview.tousekpiview.KPI#getUnit()
	 * @see #getKPI()
	 * @generated
	 */
	EAttribute getKPI_Unit();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.kpiview.tousekpiview.KPI#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see com.misc.touse.moplaf.kpiview.tousekpiview.KPI#getColor()
	 * @see #getKPI()
	 * @generated
	 */
	EAttribute getKPI_Color();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.kpiview.tousekpiview.KPI#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see com.misc.touse.moplaf.kpiview.tousekpiview.KPI#getMinValue()
	 * @see #getKPI()
	 * @generated
	 */
	EAttribute getKPI_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.kpiview.tousekpiview.KPI#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see com.misc.touse.moplaf.kpiview.tousekpiview.KPI#getMaxValue()
	 * @see #getKPI()
	 * @generated
	 */
	EAttribute getKPI_MaxValue();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.kpiview.tousekpiview.KPIRange <em>KPI Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KPI Range</em>'.
	 * @see com.misc.touse.moplaf.kpiview.tousekpiview.KPIRange
	 * @generated
	 */
	EClass getKPIRange();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.kpiview.tousekpiview.KPIRange#getLowValue <em>Low Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Value</em>'.
	 * @see com.misc.touse.moplaf.kpiview.tousekpiview.KPIRange#getLowValue()
	 * @see #getKPIRange()
	 * @generated
	 */
	EAttribute getKPIRange_LowValue();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.kpiview.tousekpiview.KPIRange#getHighValue <em>High Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Value</em>'.
	 * @see com.misc.touse.moplaf.kpiview.tousekpiview.KPIRange#getHighValue()
	 * @see #getKPIRange()
	 * @generated
	 */
	EAttribute getKPIRange_HighValue();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.kpiview.tousekpiview.KPIRange#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see com.misc.touse.moplaf.kpiview.tousekpiview.KPIRange#getColor()
	 * @see #getKPIRange()
	 * @generated
	 */
	EAttribute getKPIRange_Color();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.kpiview.tousekpiview.KPIRange#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.touse.moplaf.kpiview.tousekpiview.KPIRange#getName()
	 * @see #getKPIRange()
	 * @generated
	 */
	EAttribute getKPIRange_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TousekpiviewFactory getTousekpiviewFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.kpiview.tousekpiview.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.kpiview.tousekpiview.impl.DomainImpl
		 * @see com.misc.touse.moplaf.kpiview.tousekpiview.impl.TousekpiviewPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Scenarios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__SCENARIOS = eINSTANCE.getDomain_Scenarios();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.kpiview.tousekpiview.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.kpiview.tousekpiview.impl.ScenarioImpl
		 * @see com.misc.touse.moplaf.kpiview.tousekpiview.impl.TousekpiviewPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>KP Is</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__KP_IS = eINSTANCE.getScenario_KPIs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__NAME = eINSTANCE.getScenario_Name();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__COLOR = eINSTANCE.getScenario_Color();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.kpiview.tousekpiview.impl.KPIImpl <em>KPI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.kpiview.tousekpiview.impl.KPIImpl
		 * @see com.misc.touse.moplaf.kpiview.tousekpiview.impl.TousekpiviewPackageImpl#getKPI()
		 * @generated
		 */
		EClass KPI = eINSTANCE.getKPI();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KPI__NAME = eINSTANCE.getKPI_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KPI__VALUE = eINSTANCE.getKPI_Value();

		/**
		 * The meta object literal for the '<em><b>Ranges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KPI__RANGES = eINSTANCE.getKPI_Ranges();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KPI__UNIT = eINSTANCE.getKPI_Unit();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KPI__COLOR = eINSTANCE.getKPI_Color();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KPI__MIN_VALUE = eINSTANCE.getKPI_MinValue();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KPI__MAX_VALUE = eINSTANCE.getKPI_MaxValue();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.kpiview.tousekpiview.impl.KPIRangeImpl <em>KPI Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.kpiview.tousekpiview.impl.KPIRangeImpl
		 * @see com.misc.touse.moplaf.kpiview.tousekpiview.impl.TousekpiviewPackageImpl#getKPIRange()
		 * @generated
		 */
		EClass KPI_RANGE = eINSTANCE.getKPIRange();

		/**
		 * The meta object literal for the '<em><b>Low Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KPI_RANGE__LOW_VALUE = eINSTANCE.getKPIRange_LowValue();

		/**
		 * The meta object literal for the '<em><b>High Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KPI_RANGE__HIGH_VALUE = eINSTANCE.getKPIRange_HighValue();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KPI_RANGE__COLOR = eINSTANCE.getKPIRange_Color();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KPI_RANGE__NAME = eINSTANCE.getKPIRange_Name();

	}

} //TousekpiviewPackage
