/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline;

import com.misc.common.moplaf.propagator.PropagatorPackage;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;
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
 * @see com.misc.touse.moplaf.timeline.tousetimeline.TousetimelineFactory
 * @model kind="package"
 * @generated
 */
public interface TousetimelinePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tousetimeline";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.misc.touse.moplaf.timeline.emf";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ttm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TousetimelinePackage eINSTANCE = com.misc.touse.moplaf.timeline.tousetimeline.impl.TousetimelinePackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.DomainImpl
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.TousetimelinePackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Time Line Merges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__TIME_LINE_MERGES = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_SCOPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__DISTRIBUTION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_SCOPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__NAME = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_SCOPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Timelines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__TIMELINES = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_SCOPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_SCOPE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN___REFRESH = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_SCOPE___REFRESH;

	/**
	 * The operation id for the '<em>Add Propagator Function Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN___ADD_PROPAGATOR_FUNCTION_ADAPTER = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_SCOPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OPERATION_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_SCOPE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.DomainDistributionImpl <em>Domain Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.DomainDistributionImpl
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.TousetimelinePackageImpl#getDomainDistribution()
	 * @generated
	 */
	int DOMAIN_DISTRIBUTION = 1;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION__TIME_UNIT = ContinuousPackage.DISTRIBUTION__TIME_UNIT;

	/**
	 * The feature id for the '<em><b>Horizon Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION__HORIZON_START = ContinuousPackage.DISTRIBUTION__HORIZON_START;

	/**
	 * The feature id for the '<em><b>Horizon End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION__HORIZON_END = ContinuousPackage.DISTRIBUTION__HORIZON_END;

	/**
	 * The feature id for the '<em><b>Child Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION__CHILD_EVENT = ContinuousPackage.DISTRIBUTION__CHILD_EVENTS;

	/**
	 * The feature id for the '<em><b>Sequence Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION__SEQUENCE_EVENT = ContinuousPackage.DISTRIBUTION__SEQUENCE_EVENTS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION__START = ContinuousPackage.DISTRIBUTION__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION__END = ContinuousPackage.DISTRIBUTION__END;

	/**
	 * The feature id for the '<em><b>Events Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION__EVENTS_PROVIDERS = ContinuousPackage.DISTRIBUTION__EVENTS_PROVIDERS;

	/**
	 * The feature id for the '<em><b>Parent Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION__PARENT_DISTRIBUTION = ContinuousPackage.DISTRIBUTION__PARENT_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Child Distribution</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION__CHILD_DISTRIBUTION = ContinuousPackage.DISTRIBUTION__CHILD_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION__NAME = ContinuousPackage.DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION__COLOR = ContinuousPackage.DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Domain Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION_FEATURE_COUNT = ContinuousPackage.DISTRIBUTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Propagator Function Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION___ADD_PROPAGATOR_FUNCTION_ADAPTER = ContinuousPackage.DISTRIBUTION___ADD_PROPAGATOR_FUNCTION_ADAPTER;

	/**
	 * The operation id for the '<em>Get Duration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION___GET_DURATION__DATE_DATE = ContinuousPackage.DISTRIBUTION___GET_DURATION__DATE_DATE;

	/**
	 * The operation id for the '<em>Get Event Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION___GET_EVENT_BEFORE__DATE = ContinuousPackage.DISTRIBUTION___GET_EVENT_BEFORE__DATE;

	/**
	 * The operation id for the '<em>Get Event After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION___GET_EVENT_AFTER__DATE = ContinuousPackage.DISTRIBUTION___GET_EVENT_AFTER__DATE;

	/**
	 * The operation id for the '<em>Get Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION___GET_AMOUNT_BEFORE__DATE = ContinuousPackage.DISTRIBUTION___GET_AMOUNT_BEFORE__DATE;

	/**
	 * The operation id for the '<em>Get Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION___GET_AMOUNT_AFTER__DATE = ContinuousPackage.DISTRIBUTION___GET_AMOUNT_AFTER__DATE;

	/**
	 * The operation id for the '<em>Get Slope Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION___GET_SLOPE_BEFORE__DATE = ContinuousPackage.DISTRIBUTION___GET_SLOPE_BEFORE__DATE;

	/**
	 * The operation id for the '<em>Get Slope After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION___GET_SLOPE_AFTER__DATE = ContinuousPackage.DISTRIBUTION___GET_SLOPE_AFTER__DATE;

	/**
	 * The operation id for the '<em>Get Min Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION___GET_MIN_AMOUNT__DATE_DATE = ContinuousPackage.DISTRIBUTION___GET_MIN_AMOUNT__DATE_DATE;

	/**
	 * The operation id for the '<em>Get Max Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION___GET_MAX_AMOUNT__DATE_DATE = ContinuousPackage.DISTRIBUTION___GET_MAX_AMOUNT__DATE_DATE;

	/**
	 * The operation id for the '<em>Get Average Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION___GET_AVERAGE_AMOUNT__DATE_DATE = ContinuousPackage.DISTRIBUTION___GET_AVERAGE_AMOUNT__DATE_DATE;

	/**
	 * The operation id for the '<em>Get Integral Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION___GET_INTEGRAL_AMOUNT__DATE_DATE = ContinuousPackage.DISTRIBUTION___GET_INTEGRAL_AMOUNT__DATE_DATE;

	/**
	 * The operation id for the '<em>Refresh Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION___REFRESH_INIT = ContinuousPackage.DISTRIBUTION___REFRESH_INIT;

	/**
	 * The operation id for the '<em>Refresh Sequence</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION___REFRESH_SEQUENCE = ContinuousPackage.DISTRIBUTION___REFRESH_SEQUENCE;

	/**
	 * The operation id for the '<em>Refresh Child Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION___REFRESH_CHILD_EVENT = ContinuousPackage.DISTRIBUTION___REFRESH_CHILD_EVENT;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION___REFRESH = ContinuousPackage.DISTRIBUTION___REFRESH;

	/**
	 * The number of operations of the '<em>Domain Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION_OPERATION_COUNT = ContinuousPackage.DISTRIBUTION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.timeline.tousetimeline.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.timeline.tousetimeline.Domain#getTimeLineMerges <em>Time Line Merges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Line Merges</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.Domain#getTimeLineMerges()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TimeLineMerges();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.timeline.tousetimeline.Domain#getDistribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Distribution</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.Domain#getDistribution()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Distribution();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.timeline.tousetimeline.Domain#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.Domain#getName()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.timeline.tousetimeline.Domain#getTimelines <em>Timelines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timelines</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.Domain#getTimelines()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Timelines();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.timeline.tousetimeline.DomainDistribution <em>Domain Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Distribution</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.DomainDistribution
	 * @generated
	 */
	EClass getDomainDistribution();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.timeline.tousetimeline.DomainDistribution#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.DomainDistribution#getName()
	 * @see #getDomainDistribution()
	 * @generated
	 */
	EAttribute getDomainDistribution_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.timeline.tousetimeline.DomainDistribution#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.DomainDistribution#getColor()
	 * @see #getDomainDistribution()
	 * @generated
	 */
	EAttribute getDomainDistribution_Color();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TousetimelineFactory getTousetimelineFactory();

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
		 * The meta object literal for the '{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.DomainImpl
		 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.TousetimelinePackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Time Line Merges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__TIME_LINE_MERGES = eINSTANCE.getDomain_TimeLineMerges();

		/**
		 * The meta object literal for the '<em><b>Distribution</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__DISTRIBUTION = eINSTANCE.getDomain_Distribution();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__NAME = eINSTANCE.getDomain_Name();

		/**
		 * The meta object literal for the '<em><b>Timelines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__TIMELINES = eINSTANCE.getDomain_Timelines();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.DomainDistributionImpl <em>Domain Distribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.DomainDistributionImpl
		 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.TousetimelinePackageImpl#getDomainDistribution()
		 * @generated
		 */
		EClass DOMAIN_DISTRIBUTION = eINSTANCE.getDomainDistribution();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_DISTRIBUTION__NAME = eINSTANCE.getDomainDistribution_Name();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_DISTRIBUTION__COLOR = eINSTANCE.getDomainDistribution_Color();

	}

} //TousetimelinePackage
