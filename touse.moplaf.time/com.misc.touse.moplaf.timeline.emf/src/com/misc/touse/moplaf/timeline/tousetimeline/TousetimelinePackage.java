/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline;

import com.misc.common.moplaf.propagator.PropagatorPackage;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
	 * The feature id for the '<em><b>Child Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION__CHILD_EVENTS = ContinuousPackage.DISTRIBUTION__CHILD_EVENTS;

	/**
	 * The feature id for the '<em><b>Sequence Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION__SEQUENCE_EVENTS = ContinuousPackage.DISTRIBUTION__SEQUENCE_EVENTS;

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
	 * The feature id for the '<em><b>Provided Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION__PROVIDED_EVENTS = ContinuousPackage.DISTRIBUTION__PROVIDED_EVENTS;

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
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION__FUNCTIONS = ContinuousPackage.DISTRIBUTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Possibles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION__POSSIBLES = ContinuousPackage.DISTRIBUTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Domain Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION_FEATURE_COUNT = ContinuousPackage.DISTRIBUTION_FEATURE_COUNT + 4;

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
	 * The operation id for the '<em>Get Moment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION___GET_MOMENT__DATE_FLOAT = ContinuousPackage.DISTRIBUTION___GET_MOMENT__DATE_FLOAT;

	/**
	 * The operation id for the '<em>Get Event Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION___GET_EVENT_BEFORE__DATE = ContinuousPackage.DISTRIBUTION___GET_EVENT_BEFORE__DATE;

	/**
	 * The operation id for the '<em>Get Event Strict Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION___GET_EVENT_STRICT_BEFORE__DATE = ContinuousPackage.DISTRIBUTION___GET_EVENT_STRICT_BEFORE__DATE;

	/**
	 * The operation id for the '<em>Get Event After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION___GET_EVENT_AFTER__DATE = ContinuousPackage.DISTRIBUTION___GET_EVENT_AFTER__DATE;

	/**
	 * The operation id for the '<em>Get Event Strict After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION___GET_EVENT_STRICT_AFTER__DATE = ContinuousPackage.DISTRIBUTION___GET_EVENT_STRICT_AFTER__DATE;

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
	 * The operation id for the '<em>Get Cumulated Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION___GET_CUMULATED_AMOUNT__DATE_DATE = ContinuousPackage.DISTRIBUTION___GET_CUMULATED_AMOUNT__DATE_DATE;

	/**
	 * The operation id for the '<em>Get Earliest Below</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION___GET_EARLIEST_BELOW__DATE_FLOAT_FLOAT = ContinuousPackage.DISTRIBUTION___GET_EARLIEST_BELOW__DATE_FLOAT_FLOAT;

	/**
	 * The operation id for the '<em>Get Latest Below</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION___GET_LATEST_BELOW__DATE_FLOAT_FLOAT = ContinuousPackage.DISTRIBUTION___GET_LATEST_BELOW__DATE_FLOAT_FLOAT;

	/**
	 * The operation id for the '<em>Get Earliest Above</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION___GET_EARLIEST_ABOVE__DATE_FLOAT_FLOAT = ContinuousPackage.DISTRIBUTION___GET_EARLIEST_ABOVE__DATE_FLOAT_FLOAT;

	/**
	 * The operation id for the '<em>Get Latest Above</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION___GET_LATEST_ABOVE__DATE_FLOAT_FLOAT = ContinuousPackage.DISTRIBUTION___GET_LATEST_ABOVE__DATE_FLOAT_FLOAT;

	/**
	 * The operation id for the '<em>Get Earliest Output Possible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION___GET_EARLIEST_OUTPUT_POSSIBLE__FLOAT_DATE_FLOAT_FLOAT = ContinuousPackage.DISTRIBUTION___GET_EARLIEST_OUTPUT_POSSIBLE__FLOAT_DATE_FLOAT_FLOAT;

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
	 * The operation id for the '<em>Refresh Provided Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION___REFRESH_PROVIDED_EVENTS = ContinuousPackage.DISTRIBUTION___REFRESH_PROVIDED_EVENTS;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION___ACCEPT__DATE_DATE_DISTRIBUTIONVISITOR = ContinuousPackage.DISTRIBUTION___ACCEPT__DATE_DATE_DISTRIBUTIONVISITOR;

	/**
	 * The number of operations of the '<em>Domain Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION_OPERATION_COUNT = ContinuousPackage.DISTRIBUTION_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.FunctionMinimumImpl <em>Function Minimum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.FunctionMinimumImpl
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.TousetimelinePackageImpl#getFunctionMinimum()
	 * @generated
	 */
	int FUNCTION_MINIMUM = 2;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.FunctionIntervalImpl <em>Function Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.FunctionIntervalImpl
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.TousetimelinePackageImpl#getFunctionInterval()
	 * @generated
	 */
	int FUNCTION_INTERVAL = 3;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INTERVAL__FROM = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INTERVAL__TO = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INTERVAL__DISTRIBUTION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Function Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INTERVAL_FEATURE_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Add Propagator Function Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INTERVAL___ADD_PROPAGATOR_FUNCTION_ADAPTER = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER___ADD_PROPAGATOR_FUNCTION_ADAPTER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INTERVAL___REFRESH = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Function Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INTERVAL_OPERATION_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MINIMUM__FROM = FUNCTION_INTERVAL__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MINIMUM__TO = FUNCTION_INTERVAL__TO;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MINIMUM__DISTRIBUTION = FUNCTION_INTERVAL__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MINIMUM__MINIMUM = FUNCTION_INTERVAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function Minimum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MINIMUM_FEATURE_COUNT = FUNCTION_INTERVAL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Propagator Function Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MINIMUM___ADD_PROPAGATOR_FUNCTION_ADAPTER = FUNCTION_INTERVAL___ADD_PROPAGATOR_FUNCTION_ADAPTER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MINIMUM___REFRESH = FUNCTION_INTERVAL___REFRESH;

	/**
	 * The number of operations of the '<em>Function Minimum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MINIMUM_OPERATION_COUNT = FUNCTION_INTERVAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.FunctionCumulatedImpl <em>Function Cumulated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.FunctionCumulatedImpl
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.TousetimelinePackageImpl#getFunctionCumulated()
	 * @generated
	 */
	int FUNCTION_CUMULATED = 4;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CUMULATED__FROM = FUNCTION_INTERVAL__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CUMULATED__TO = FUNCTION_INTERVAL__TO;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CUMULATED__DISTRIBUTION = FUNCTION_INTERVAL__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Cumulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CUMULATED__CUMULATED = FUNCTION_INTERVAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function Cumulated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CUMULATED_FEATURE_COUNT = FUNCTION_INTERVAL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Propagator Function Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CUMULATED___ADD_PROPAGATOR_FUNCTION_ADAPTER = FUNCTION_INTERVAL___ADD_PROPAGATOR_FUNCTION_ADAPTER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CUMULATED___REFRESH = FUNCTION_INTERVAL___REFRESH;

	/**
	 * The number of operations of the '<em>Function Cumulated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CUMULATED_OPERATION_COUNT = FUNCTION_INTERVAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.FunctionAverageImpl <em>Function Average</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.FunctionAverageImpl
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.TousetimelinePackageImpl#getFunctionAverage()
	 * @generated
	 */
	int FUNCTION_AVERAGE = 5;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_AVERAGE__FROM = FUNCTION_INTERVAL__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_AVERAGE__TO = FUNCTION_INTERVAL__TO;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_AVERAGE__DISTRIBUTION = FUNCTION_INTERVAL__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Average</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_AVERAGE__AVERAGE = FUNCTION_INTERVAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function Average</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_AVERAGE_FEATURE_COUNT = FUNCTION_INTERVAL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Propagator Function Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_AVERAGE___ADD_PROPAGATOR_FUNCTION_ADAPTER = FUNCTION_INTERVAL___ADD_PROPAGATOR_FUNCTION_ADAPTER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_AVERAGE___REFRESH = FUNCTION_INTERVAL___REFRESH;

	/**
	 * The number of operations of the '<em>Function Average</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_AVERAGE_OPERATION_COUNT = FUNCTION_INTERVAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.FunctionPossibleImpl <em>Function Possible</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.FunctionPossibleImpl
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.TousetimelinePackageImpl#getFunctionPossible()
	 * @generated
	 */
	int FUNCTION_POSSIBLE = 6;

	/**
	 * The feature id for the '<em><b>Limit Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_POSSIBLE__LIMIT_MOMENT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Limit Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_POSSIBLE__LIMIT_DURATION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Limit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_POSSIBLE__LIMIT_AMOUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_POSSIBLE__DISTRIBUTION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Function Possible</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_POSSIBLE_FEATURE_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Add Propagator Function Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_POSSIBLE___ADD_PROPAGATOR_FUNCTION_ADAPTER = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER___ADD_PROPAGATOR_FUNCTION_ADAPTER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_POSSIBLE___REFRESH = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Function Possible</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_POSSIBLE_OPERATION_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.FunctionEarliestBelowImpl <em>Function Earliest Below</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.FunctionEarliestBelowImpl
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.TousetimelinePackageImpl#getFunctionEarliestBelow()
	 * @generated
	 */
	int FUNCTION_EARLIEST_BELOW = 7;

	/**
	 * The feature id for the '<em><b>Limit Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_EARLIEST_BELOW__LIMIT_MOMENT = FUNCTION_POSSIBLE__LIMIT_MOMENT;

	/**
	 * The feature id for the '<em><b>Limit Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_EARLIEST_BELOW__LIMIT_DURATION = FUNCTION_POSSIBLE__LIMIT_DURATION;

	/**
	 * The feature id for the '<em><b>Limit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_EARLIEST_BELOW__LIMIT_AMOUNT = FUNCTION_POSSIBLE__LIMIT_AMOUNT;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_EARLIEST_BELOW__DISTRIBUTION = FUNCTION_POSSIBLE__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Earliest Below</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_EARLIEST_BELOW__EARLIEST_BELOW = FUNCTION_POSSIBLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function Earliest Below</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_EARLIEST_BELOW_FEATURE_COUNT = FUNCTION_POSSIBLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Propagator Function Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_EARLIEST_BELOW___ADD_PROPAGATOR_FUNCTION_ADAPTER = FUNCTION_POSSIBLE___ADD_PROPAGATOR_FUNCTION_ADAPTER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_EARLIEST_BELOW___REFRESH = FUNCTION_POSSIBLE___REFRESH;

	/**
	 * The number of operations of the '<em>Function Earliest Below</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_EARLIEST_BELOW_OPERATION_COUNT = FUNCTION_POSSIBLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.FunctionEarliestOutputImpl <em>Function Earliest Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.FunctionEarliestOutputImpl
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.TousetimelinePackageImpl#getFunctionEarliestOutput()
	 * @generated
	 */
	int FUNCTION_EARLIEST_OUTPUT = 8;

	/**
	 * The feature id for the '<em><b>Limit Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_EARLIEST_OUTPUT__LIMIT_MOMENT = FUNCTION_POSSIBLE__LIMIT_MOMENT;

	/**
	 * The feature id for the '<em><b>Limit Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_EARLIEST_OUTPUT__LIMIT_DURATION = FUNCTION_POSSIBLE__LIMIT_DURATION;

	/**
	 * The feature id for the '<em><b>Limit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_EARLIEST_OUTPUT__LIMIT_AMOUNT = FUNCTION_POSSIBLE__LIMIT_AMOUNT;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_EARLIEST_OUTPUT__DISTRIBUTION = FUNCTION_POSSIBLE__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Earliest Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_EARLIEST_OUTPUT__EARLIEST_OUTPUT = FUNCTION_POSSIBLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function Earliest Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_EARLIEST_OUTPUT_FEATURE_COUNT = FUNCTION_POSSIBLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Propagator Function Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_EARLIEST_OUTPUT___ADD_PROPAGATOR_FUNCTION_ADAPTER = FUNCTION_POSSIBLE___ADD_PROPAGATOR_FUNCTION_ADAPTER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_EARLIEST_OUTPUT___REFRESH = FUNCTION_POSSIBLE___REFRESH;

	/**
	 * The number of operations of the '<em>Function Earliest Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_EARLIEST_OUTPUT_OPERATION_COUNT = FUNCTION_POSSIBLE_OPERATION_COUNT + 0;

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
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.timeline.tousetimeline.DomainDistribution#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.DomainDistribution#getFunctions()
	 * @see #getDomainDistribution()
	 * @generated
	 */
	EReference getDomainDistribution_Functions();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.timeline.tousetimeline.DomainDistribution#getPossibles <em>Possibles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Possibles</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.DomainDistribution#getPossibles()
	 * @see #getDomainDistribution()
	 * @generated
	 */
	EReference getDomainDistribution_Possibles();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionMinimum <em>Function Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Minimum</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.FunctionMinimum
	 * @generated
	 */
	EClass getFunctionMinimum();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionMinimum#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.FunctionMinimum#getMinimum()
	 * @see #getFunctionMinimum()
	 * @generated
	 */
	EAttribute getFunctionMinimum_Minimum();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionInterval <em>Function Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Interval</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.FunctionInterval
	 * @generated
	 */
	EClass getFunctionInterval();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionInterval#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.FunctionInterval#getFrom()
	 * @see #getFunctionInterval()
	 * @generated
	 */
	EAttribute getFunctionInterval_From();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionInterval#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.FunctionInterval#getTo()
	 * @see #getFunctionInterval()
	 * @generated
	 */
	EAttribute getFunctionInterval_To();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionInterval#getDistribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Distribution</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.FunctionInterval#getDistribution()
	 * @see #getFunctionInterval()
	 * @generated
	 */
	EReference getFunctionInterval_Distribution();

	/**
	 * Returns the meta object for the '{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionInterval#refresh() <em>Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh</em>' operation.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.FunctionInterval#refresh()
	 * @generated
	 */
	EOperation getFunctionInterval__Refresh();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionCumulated <em>Function Cumulated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Cumulated</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.FunctionCumulated
	 * @generated
	 */
	EClass getFunctionCumulated();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionCumulated#getCumulated <em>Cumulated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cumulated</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.FunctionCumulated#getCumulated()
	 * @see #getFunctionCumulated()
	 * @generated
	 */
	EAttribute getFunctionCumulated_Cumulated();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionAverage <em>Function Average</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Average</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.FunctionAverage
	 * @generated
	 */
	EClass getFunctionAverage();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionAverage#getAverage <em>Average</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.FunctionAverage#getAverage()
	 * @see #getFunctionAverage()
	 * @generated
	 */
	EAttribute getFunctionAverage_Average();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionPossible <em>Function Possible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Possible</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.FunctionPossible
	 * @generated
	 */
	EClass getFunctionPossible();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionPossible#getLimitMoment <em>Limit Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limit Moment</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.FunctionPossible#getLimitMoment()
	 * @see #getFunctionPossible()
	 * @generated
	 */
	EAttribute getFunctionPossible_LimitMoment();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionPossible#getLimitDuration <em>Limit Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limit Duration</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.FunctionPossible#getLimitDuration()
	 * @see #getFunctionPossible()
	 * @generated
	 */
	EAttribute getFunctionPossible_LimitDuration();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionPossible#getLimitAmount <em>Limit Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limit Amount</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.FunctionPossible#getLimitAmount()
	 * @see #getFunctionPossible()
	 * @generated
	 */
	EAttribute getFunctionPossible_LimitAmount();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionPossible#getDistribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Distribution</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.FunctionPossible#getDistribution()
	 * @see #getFunctionPossible()
	 * @generated
	 */
	EReference getFunctionPossible_Distribution();

	/**
	 * Returns the meta object for the '{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionPossible#refresh() <em>Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh</em>' operation.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.FunctionPossible#refresh()
	 * @generated
	 */
	EOperation getFunctionPossible__Refresh();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionEarliestBelow <em>Function Earliest Below</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Earliest Below</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.FunctionEarliestBelow
	 * @generated
	 */
	EClass getFunctionEarliestBelow();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionEarliestBelow#getEarliestBelow <em>Earliest Below</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Earliest Below</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.FunctionEarliestBelow#getEarliestBelow()
	 * @see #getFunctionEarliestBelow()
	 * @generated
	 */
	EAttribute getFunctionEarliestBelow_EarliestBelow();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionEarliestOutput <em>Function Earliest Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Earliest Output</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.FunctionEarliestOutput
	 * @generated
	 */
	EClass getFunctionEarliestOutput();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionEarliestOutput#getEarliestOutput <em>Earliest Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Earliest Output</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.FunctionEarliestOutput#getEarliestOutput()
	 * @see #getFunctionEarliestOutput()
	 * @generated
	 */
	EAttribute getFunctionEarliestOutput_EarliestOutput();

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

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_DISTRIBUTION__FUNCTIONS = eINSTANCE.getDomainDistribution_Functions();

		/**
		 * The meta object literal for the '<em><b>Possibles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_DISTRIBUTION__POSSIBLES = eINSTANCE.getDomainDistribution_Possibles();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.FunctionMinimumImpl <em>Function Minimum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.FunctionMinimumImpl
		 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.TousetimelinePackageImpl#getFunctionMinimum()
		 * @generated
		 */
		EClass FUNCTION_MINIMUM = eINSTANCE.getFunctionMinimum();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_MINIMUM__MINIMUM = eINSTANCE.getFunctionMinimum_Minimum();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.FunctionIntervalImpl <em>Function Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.FunctionIntervalImpl
		 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.TousetimelinePackageImpl#getFunctionInterval()
		 * @generated
		 */
		EClass FUNCTION_INTERVAL = eINSTANCE.getFunctionInterval();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_INTERVAL__FROM = eINSTANCE.getFunctionInterval_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_INTERVAL__TO = eINSTANCE.getFunctionInterval_To();

		/**
		 * The meta object literal for the '<em><b>Distribution</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_INTERVAL__DISTRIBUTION = eINSTANCE.getFunctionInterval_Distribution();

		/**
		 * The meta object literal for the '<em><b>Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FUNCTION_INTERVAL___REFRESH = eINSTANCE.getFunctionInterval__Refresh();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.FunctionCumulatedImpl <em>Function Cumulated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.FunctionCumulatedImpl
		 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.TousetimelinePackageImpl#getFunctionCumulated()
		 * @generated
		 */
		EClass FUNCTION_CUMULATED = eINSTANCE.getFunctionCumulated();

		/**
		 * The meta object literal for the '<em><b>Cumulated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_CUMULATED__CUMULATED = eINSTANCE.getFunctionCumulated_Cumulated();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.FunctionAverageImpl <em>Function Average</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.FunctionAverageImpl
		 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.TousetimelinePackageImpl#getFunctionAverage()
		 * @generated
		 */
		EClass FUNCTION_AVERAGE = eINSTANCE.getFunctionAverage();

		/**
		 * The meta object literal for the '<em><b>Average</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_AVERAGE__AVERAGE = eINSTANCE.getFunctionAverage_Average();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.FunctionPossibleImpl <em>Function Possible</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.FunctionPossibleImpl
		 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.TousetimelinePackageImpl#getFunctionPossible()
		 * @generated
		 */
		EClass FUNCTION_POSSIBLE = eINSTANCE.getFunctionPossible();

		/**
		 * The meta object literal for the '<em><b>Limit Moment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_POSSIBLE__LIMIT_MOMENT = eINSTANCE.getFunctionPossible_LimitMoment();

		/**
		 * The meta object literal for the '<em><b>Limit Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_POSSIBLE__LIMIT_DURATION = eINSTANCE.getFunctionPossible_LimitDuration();

		/**
		 * The meta object literal for the '<em><b>Limit Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_POSSIBLE__LIMIT_AMOUNT = eINSTANCE.getFunctionPossible_LimitAmount();

		/**
		 * The meta object literal for the '<em><b>Distribution</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_POSSIBLE__DISTRIBUTION = eINSTANCE.getFunctionPossible_Distribution();

		/**
		 * The meta object literal for the '<em><b>Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FUNCTION_POSSIBLE___REFRESH = eINSTANCE.getFunctionPossible__Refresh();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.FunctionEarliestBelowImpl <em>Function Earliest Below</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.FunctionEarliestBelowImpl
		 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.TousetimelinePackageImpl#getFunctionEarliestBelow()
		 * @generated
		 */
		EClass FUNCTION_EARLIEST_BELOW = eINSTANCE.getFunctionEarliestBelow();

		/**
		 * The meta object literal for the '<em><b>Earliest Below</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_EARLIEST_BELOW__EARLIEST_BELOW = eINSTANCE.getFunctionEarliestBelow_EarliestBelow();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.FunctionEarliestOutputImpl <em>Function Earliest Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.FunctionEarliestOutputImpl
		 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.TousetimelinePackageImpl#getFunctionEarliestOutput()
		 * @generated
		 */
		EClass FUNCTION_EARLIEST_OUTPUT = eINSTANCE.getFunctionEarliestOutput();

		/**
		 * The meta object literal for the '<em><b>Earliest Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_EARLIEST_OUTPUT__EARLIEST_OUTPUT = eINSTANCE.getFunctionEarliestOutput_EarliestOutput();

	}

} //TousetimelinePackage
