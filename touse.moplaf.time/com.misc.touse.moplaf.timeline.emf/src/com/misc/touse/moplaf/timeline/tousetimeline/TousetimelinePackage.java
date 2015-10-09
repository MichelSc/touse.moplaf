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
	 * The feature id for the '<em><b>Amount Impulsion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__AMOUNT_IMPULSION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_SCOPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Amount Absolute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__AMOUNT_ABSOLUTE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_SCOPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Slope Absolute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__SLOPE_ABSOLUTE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_SCOPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Slope Impulsion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__SLOPE_IMPULSION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_SCOPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Capacity Change</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__CAPACITY_CHANGE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_SCOPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Stock Change</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__STOCK_CHANGE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_SCOPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__DISTRIBUTION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_SCOPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__NAME = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_SCOPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Timelines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__TIMELINES = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_SCOPE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_SCOPE_FEATURE_COUNT + 10;

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
	 * The meta object id for the '{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.ToUseAmountImpulsionImpl <em>To Use Amount Impulsion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.ToUseAmountImpulsionImpl
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.TousetimelinePackageImpl#getToUseAmountImpulsion()
	 * @generated
	 */
	int TO_USE_AMOUNT_IMPULSION = 1;

	/**
	 * The feature id for the '<em><b>Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_IMPULSION__MOMENT = ContinuousPackage.AMOUNT_IMPULSION__MOMENT;

	/**
	 * The feature id for the '<em><b>Event Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_IMPULSION__EVENT_NR = ContinuousPackage.AMOUNT_IMPULSION__EVENT_NR;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_IMPULSION__NEXT = ContinuousPackage.AMOUNT_IMPULSION__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_IMPULSION__PREVIOUS = ContinuousPackage.AMOUNT_IMPULSION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Amount Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_IMPULSION__AMOUNT_BEFORE = ContinuousPackage.AMOUNT_IMPULSION__AMOUNT_BEFORE;

	/**
	 * The feature id for the '<em><b>Amount After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_IMPULSION__AMOUNT_AFTER = ContinuousPackage.AMOUNT_IMPULSION__AMOUNT_AFTER;

	/**
	 * The feature id for the '<em><b>Slope Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_IMPULSION__SLOPE_BEFORE = ContinuousPackage.AMOUNT_IMPULSION__SLOPE_BEFORE;

	/**
	 * The feature id for the '<em><b>Slope After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_IMPULSION__SLOPE_AFTER = ContinuousPackage.AMOUNT_IMPULSION__SLOPE_AFTER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_IMPULSION__DESCRIPTION = ContinuousPackage.AMOUNT_IMPULSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_IMPULSION__DISTRIBUTION = ContinuousPackage.AMOUNT_IMPULSION__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Amount Impulsion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_IMPULSION__AMOUNT_IMPULSION = ContinuousPackage.AMOUNT_IMPULSION__AMOUNT_IMPULSION;

	/**
	 * The number of structural features of the '<em>To Use Amount Impulsion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_IMPULSION_FEATURE_COUNT = ContinuousPackage.AMOUNT_IMPULSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Propagator Function Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_IMPULSION___ADD_PROPAGATOR_FUNCTION_ADAPTER = ContinuousPackage.AMOUNT_IMPULSION___ADD_PROPAGATOR_FUNCTION_ADAPTER;

	/**
	 * The operation id for the '<em>Refresh Slope Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_IMPULSION___REFRESH_SLOPE_BEFORE = ContinuousPackage.AMOUNT_IMPULSION___REFRESH_SLOPE_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_IMPULSION___REFRESH_AMOUNT_BEFORE = ContinuousPackage.AMOUNT_IMPULSION___REFRESH_AMOUNT_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_IMPULSION___REFRESH_AMOUNT_AFTER = ContinuousPackage.AMOUNT_IMPULSION___REFRESH_AMOUNT_AFTER;

	/**
	 * The operation id for the '<em>Refresh Slope After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_IMPULSION___REFRESH_SLOPE_AFTER = ContinuousPackage.AMOUNT_IMPULSION___REFRESH_SLOPE_AFTER;

	/**
	 * The operation id for the '<em>Refresh Moment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_IMPULSION___REFRESH_MOMENT = ContinuousPackage.AMOUNT_IMPULSION___REFRESH_MOMENT;

	/**
	 * The operation id for the '<em>Refresh Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_IMPULSION___REFRESH_DESCRIPTION = ContinuousPackage.AMOUNT_IMPULSION___REFRESH_DESCRIPTION;

	/**
	 * The operation id for the '<em>Refresh Amount Impulsion</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_IMPULSION___REFRESH_AMOUNT_IMPULSION = ContinuousPackage.AMOUNT_IMPULSION___REFRESH_AMOUNT_IMPULSION;

	/**
	 * The number of operations of the '<em>To Use Amount Impulsion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_IMPULSION_OPERATION_COUNT = ContinuousPackage.AMOUNT_IMPULSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.ToUseAmountAbsoluteImpl <em>To Use Amount Absolute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.ToUseAmountAbsoluteImpl
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.TousetimelinePackageImpl#getToUseAmountAbsolute()
	 * @generated
	 */
	int TO_USE_AMOUNT_ABSOLUTE = 2;

	/**
	 * The feature id for the '<em><b>Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_ABSOLUTE__MOMENT = ContinuousPackage.AMOUNT_ABSOLUTE__MOMENT;

	/**
	 * The feature id for the '<em><b>Event Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_ABSOLUTE__EVENT_NR = ContinuousPackage.AMOUNT_ABSOLUTE__EVENT_NR;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_ABSOLUTE__NEXT = ContinuousPackage.AMOUNT_ABSOLUTE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_ABSOLUTE__PREVIOUS = ContinuousPackage.AMOUNT_ABSOLUTE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Amount Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_ABSOLUTE__AMOUNT_BEFORE = ContinuousPackage.AMOUNT_ABSOLUTE__AMOUNT_BEFORE;

	/**
	 * The feature id for the '<em><b>Amount After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_ABSOLUTE__AMOUNT_AFTER = ContinuousPackage.AMOUNT_ABSOLUTE__AMOUNT_AFTER;

	/**
	 * The feature id for the '<em><b>Slope Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_ABSOLUTE__SLOPE_BEFORE = ContinuousPackage.AMOUNT_ABSOLUTE__SLOPE_BEFORE;

	/**
	 * The feature id for the '<em><b>Slope After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_ABSOLUTE__SLOPE_AFTER = ContinuousPackage.AMOUNT_ABSOLUTE__SLOPE_AFTER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_ABSOLUTE__DESCRIPTION = ContinuousPackage.AMOUNT_ABSOLUTE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_ABSOLUTE__DISTRIBUTION = ContinuousPackage.AMOUNT_ABSOLUTE__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Amount Absolute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_ABSOLUTE__AMOUNT_ABSOLUTE = ContinuousPackage.AMOUNT_ABSOLUTE__AMOUNT_ABSOLUTE;

	/**
	 * The number of structural features of the '<em>To Use Amount Absolute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_ABSOLUTE_FEATURE_COUNT = ContinuousPackage.AMOUNT_ABSOLUTE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Propagator Function Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_ABSOLUTE___ADD_PROPAGATOR_FUNCTION_ADAPTER = ContinuousPackage.AMOUNT_ABSOLUTE___ADD_PROPAGATOR_FUNCTION_ADAPTER;

	/**
	 * The operation id for the '<em>Refresh Slope Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_ABSOLUTE___REFRESH_SLOPE_BEFORE = ContinuousPackage.AMOUNT_ABSOLUTE___REFRESH_SLOPE_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_ABSOLUTE___REFRESH_AMOUNT_BEFORE = ContinuousPackage.AMOUNT_ABSOLUTE___REFRESH_AMOUNT_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_ABSOLUTE___REFRESH_AMOUNT_AFTER = ContinuousPackage.AMOUNT_ABSOLUTE___REFRESH_AMOUNT_AFTER;

	/**
	 * The operation id for the '<em>Refresh Slope After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_ABSOLUTE___REFRESH_SLOPE_AFTER = ContinuousPackage.AMOUNT_ABSOLUTE___REFRESH_SLOPE_AFTER;

	/**
	 * The operation id for the '<em>Refresh Moment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_ABSOLUTE___REFRESH_MOMENT = ContinuousPackage.AMOUNT_ABSOLUTE___REFRESH_MOMENT;

	/**
	 * The operation id for the '<em>Refresh Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_ABSOLUTE___REFRESH_DESCRIPTION = ContinuousPackage.AMOUNT_ABSOLUTE___REFRESH_DESCRIPTION;

	/**
	 * The number of operations of the '<em>To Use Amount Absolute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_AMOUNT_ABSOLUTE_OPERATION_COUNT = ContinuousPackage.AMOUNT_ABSOLUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.ToUseSlopeAbsoluteImpl <em>To Use Slope Absolute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.ToUseSlopeAbsoluteImpl
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.TousetimelinePackageImpl#getToUseSlopeAbsolute()
	 * @generated
	 */
	int TO_USE_SLOPE_ABSOLUTE = 3;

	/**
	 * The feature id for the '<em><b>Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_ABSOLUTE__MOMENT = ContinuousPackage.SLOPE_ABSOLUTE__MOMENT;

	/**
	 * The feature id for the '<em><b>Event Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_ABSOLUTE__EVENT_NR = ContinuousPackage.SLOPE_ABSOLUTE__EVENT_NR;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_ABSOLUTE__NEXT = ContinuousPackage.SLOPE_ABSOLUTE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_ABSOLUTE__PREVIOUS = ContinuousPackage.SLOPE_ABSOLUTE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Amount Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_ABSOLUTE__AMOUNT_BEFORE = ContinuousPackage.SLOPE_ABSOLUTE__AMOUNT_BEFORE;

	/**
	 * The feature id for the '<em><b>Amount After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_ABSOLUTE__AMOUNT_AFTER = ContinuousPackage.SLOPE_ABSOLUTE__AMOUNT_AFTER;

	/**
	 * The feature id for the '<em><b>Slope Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_ABSOLUTE__SLOPE_BEFORE = ContinuousPackage.SLOPE_ABSOLUTE__SLOPE_BEFORE;

	/**
	 * The feature id for the '<em><b>Slope After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_ABSOLUTE__SLOPE_AFTER = ContinuousPackage.SLOPE_ABSOLUTE__SLOPE_AFTER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_ABSOLUTE__DESCRIPTION = ContinuousPackage.SLOPE_ABSOLUTE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_ABSOLUTE__DISTRIBUTION = ContinuousPackage.SLOPE_ABSOLUTE__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Slope Absolute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_ABSOLUTE__SLOPE_ABSOLUTE = ContinuousPackage.SLOPE_ABSOLUTE__SLOPE_ABSOLUTE;

	/**
	 * The number of structural features of the '<em>To Use Slope Absolute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_ABSOLUTE_FEATURE_COUNT = ContinuousPackage.SLOPE_ABSOLUTE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Propagator Function Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_ABSOLUTE___ADD_PROPAGATOR_FUNCTION_ADAPTER = ContinuousPackage.SLOPE_ABSOLUTE___ADD_PROPAGATOR_FUNCTION_ADAPTER;

	/**
	 * The operation id for the '<em>Refresh Slope Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_ABSOLUTE___REFRESH_SLOPE_BEFORE = ContinuousPackage.SLOPE_ABSOLUTE___REFRESH_SLOPE_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_ABSOLUTE___REFRESH_AMOUNT_BEFORE = ContinuousPackage.SLOPE_ABSOLUTE___REFRESH_AMOUNT_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_ABSOLUTE___REFRESH_AMOUNT_AFTER = ContinuousPackage.SLOPE_ABSOLUTE___REFRESH_AMOUNT_AFTER;

	/**
	 * The operation id for the '<em>Refresh Slope After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_ABSOLUTE___REFRESH_SLOPE_AFTER = ContinuousPackage.SLOPE_ABSOLUTE___REFRESH_SLOPE_AFTER;

	/**
	 * The operation id for the '<em>Refresh Moment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_ABSOLUTE___REFRESH_MOMENT = ContinuousPackage.SLOPE_ABSOLUTE___REFRESH_MOMENT;

	/**
	 * The operation id for the '<em>Refresh Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_ABSOLUTE___REFRESH_DESCRIPTION = ContinuousPackage.SLOPE_ABSOLUTE___REFRESH_DESCRIPTION;

	/**
	 * The number of operations of the '<em>To Use Slope Absolute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_ABSOLUTE_OPERATION_COUNT = ContinuousPackage.SLOPE_ABSOLUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.ToUseSlopeImpulsionImpl <em>To Use Slope Impulsion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.ToUseSlopeImpulsionImpl
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.TousetimelinePackageImpl#getToUseSlopeImpulsion()
	 * @generated
	 */
	int TO_USE_SLOPE_IMPULSION = 4;

	/**
	 * The feature id for the '<em><b>Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_IMPULSION__MOMENT = ContinuousPackage.SLOPE_IMPULSION__MOMENT;

	/**
	 * The feature id for the '<em><b>Event Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_IMPULSION__EVENT_NR = ContinuousPackage.SLOPE_IMPULSION__EVENT_NR;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_IMPULSION__NEXT = ContinuousPackage.SLOPE_IMPULSION__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_IMPULSION__PREVIOUS = ContinuousPackage.SLOPE_IMPULSION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Amount Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_IMPULSION__AMOUNT_BEFORE = ContinuousPackage.SLOPE_IMPULSION__AMOUNT_BEFORE;

	/**
	 * The feature id for the '<em><b>Amount After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_IMPULSION__AMOUNT_AFTER = ContinuousPackage.SLOPE_IMPULSION__AMOUNT_AFTER;

	/**
	 * The feature id for the '<em><b>Slope Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_IMPULSION__SLOPE_BEFORE = ContinuousPackage.SLOPE_IMPULSION__SLOPE_BEFORE;

	/**
	 * The feature id for the '<em><b>Slope After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_IMPULSION__SLOPE_AFTER = ContinuousPackage.SLOPE_IMPULSION__SLOPE_AFTER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_IMPULSION__DESCRIPTION = ContinuousPackage.SLOPE_IMPULSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_IMPULSION__DISTRIBUTION = ContinuousPackage.SLOPE_IMPULSION__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Slope Impulsion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_IMPULSION__SLOPE_IMPULSION = ContinuousPackage.SLOPE_IMPULSION__SLOPE_IMPULSION;

	/**
	 * The number of structural features of the '<em>To Use Slope Impulsion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_IMPULSION_FEATURE_COUNT = ContinuousPackage.SLOPE_IMPULSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Propagator Function Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_IMPULSION___ADD_PROPAGATOR_FUNCTION_ADAPTER = ContinuousPackage.SLOPE_IMPULSION___ADD_PROPAGATOR_FUNCTION_ADAPTER;

	/**
	 * The operation id for the '<em>Refresh Slope Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_IMPULSION___REFRESH_SLOPE_BEFORE = ContinuousPackage.SLOPE_IMPULSION___REFRESH_SLOPE_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_IMPULSION___REFRESH_AMOUNT_BEFORE = ContinuousPackage.SLOPE_IMPULSION___REFRESH_AMOUNT_BEFORE;

	/**
	 * The operation id for the '<em>Refresh Amount After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_IMPULSION___REFRESH_AMOUNT_AFTER = ContinuousPackage.SLOPE_IMPULSION___REFRESH_AMOUNT_AFTER;

	/**
	 * The operation id for the '<em>Refresh Slope After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_IMPULSION___REFRESH_SLOPE_AFTER = ContinuousPackage.SLOPE_IMPULSION___REFRESH_SLOPE_AFTER;

	/**
	 * The operation id for the '<em>Refresh Moment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_IMPULSION___REFRESH_MOMENT = ContinuousPackage.SLOPE_IMPULSION___REFRESH_MOMENT;

	/**
	 * The operation id for the '<em>Refresh Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_IMPULSION___REFRESH_DESCRIPTION = ContinuousPackage.SLOPE_IMPULSION___REFRESH_DESCRIPTION;

	/**
	 * The operation id for the '<em>Refresh Slope Impulsion</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_IMPULSION___REFRESH_SLOPE_IMPULSION = ContinuousPackage.SLOPE_IMPULSION___REFRESH_SLOPE_IMPULSION;

	/**
	 * The number of operations of the '<em>To Use Slope Impulsion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_SLOPE_IMPULSION_OPERATION_COUNT = ContinuousPackage.SLOPE_IMPULSION_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.DomainDistributionImpl <em>Domain Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.DomainDistributionImpl
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.TousetimelinePackageImpl#getDomainDistribution()
	 * @generated
	 */
	int DOMAIN_DISTRIBUTION = 5;

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
	 * The feature id for the '<em><b>Atomic Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION__ATOMIC_EVENT = ContinuousPackage.DISTRIBUTION__ATOMIC_EVENT;

	/**
	 * The feature id for the '<em><b>Child Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION__CHILD_EVENT = ContinuousPackage.DISTRIBUTION__CHILD_EVENT;

	/**
	 * The feature id for the '<em><b>Sequence Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION__SEQUENCE_EVENT = ContinuousPackage.DISTRIBUTION__SEQUENCE_EVENT;

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
	 * The feature id for the '<em><b>Composite Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION__COMPOSITE_EVENT = ContinuousPackage.DISTRIBUTION__COMPOSITE_EVENT;

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
	 * The number of structural features of the '<em>Domain Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DISTRIBUTION_FEATURE_COUNT = ContinuousPackage.DISTRIBUTION_FEATURE_COUNT + 1;

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
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.timeline.tousetimeline.Domain#getAmountImpulsion <em>Amount Impulsion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Amount Impulsion</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.Domain#getAmountImpulsion()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_AmountImpulsion();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.timeline.tousetimeline.Domain#getAmountAbsolute <em>Amount Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Amount Absolute</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.Domain#getAmountAbsolute()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_AmountAbsolute();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.timeline.tousetimeline.Domain#getSlopeAbsolute <em>Slope Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slope Absolute</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.Domain#getSlopeAbsolute()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_SlopeAbsolute();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.timeline.tousetimeline.Domain#getSlopeImpulsion <em>Slope Impulsion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slope Impulsion</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.Domain#getSlopeImpulsion()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_SlopeImpulsion();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.timeline.tousetimeline.Domain#getCapacityChange <em>Capacity Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capacity Change</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.Domain#getCapacityChange()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_CapacityChange();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.timeline.tousetimeline.Domain#getStockChange <em>Stock Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stock Change</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.Domain#getStockChange()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_StockChange();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.timeline.tousetimeline.ToUseAmountImpulsion <em>To Use Amount Impulsion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Use Amount Impulsion</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.ToUseAmountImpulsion
	 * @generated
	 */
	EClass getToUseAmountImpulsion();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.timeline.tousetimeline.ToUseAmountAbsolute <em>To Use Amount Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Use Amount Absolute</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.ToUseAmountAbsolute
	 * @generated
	 */
	EClass getToUseAmountAbsolute();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.timeline.tousetimeline.ToUseSlopeAbsolute <em>To Use Slope Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Use Slope Absolute</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.ToUseSlopeAbsolute
	 * @generated
	 */
	EClass getToUseSlopeAbsolute();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.timeline.tousetimeline.ToUseSlopeImpulsion <em>To Use Slope Impulsion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Use Slope Impulsion</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.ToUseSlopeImpulsion
	 * @generated
	 */
	EClass getToUseSlopeImpulsion();

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
		 * The meta object literal for the '<em><b>Amount Impulsion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__AMOUNT_IMPULSION = eINSTANCE.getDomain_AmountImpulsion();

		/**
		 * The meta object literal for the '<em><b>Amount Absolute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__AMOUNT_ABSOLUTE = eINSTANCE.getDomain_AmountAbsolute();

		/**
		 * The meta object literal for the '<em><b>Slope Absolute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__SLOPE_ABSOLUTE = eINSTANCE.getDomain_SlopeAbsolute();

		/**
		 * The meta object literal for the '<em><b>Slope Impulsion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__SLOPE_IMPULSION = eINSTANCE.getDomain_SlopeImpulsion();

		/**
		 * The meta object literal for the '<em><b>Capacity Change</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__CAPACITY_CHANGE = eINSTANCE.getDomain_CapacityChange();

		/**
		 * The meta object literal for the '<em><b>Stock Change</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__STOCK_CHANGE = eINSTANCE.getDomain_StockChange();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.ToUseAmountImpulsionImpl <em>To Use Amount Impulsion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.ToUseAmountImpulsionImpl
		 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.TousetimelinePackageImpl#getToUseAmountImpulsion()
		 * @generated
		 */
		EClass TO_USE_AMOUNT_IMPULSION = eINSTANCE.getToUseAmountImpulsion();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.ToUseAmountAbsoluteImpl <em>To Use Amount Absolute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.ToUseAmountAbsoluteImpl
		 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.TousetimelinePackageImpl#getToUseAmountAbsolute()
		 * @generated
		 */
		EClass TO_USE_AMOUNT_ABSOLUTE = eINSTANCE.getToUseAmountAbsolute();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.ToUseSlopeAbsoluteImpl <em>To Use Slope Absolute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.ToUseSlopeAbsoluteImpl
		 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.TousetimelinePackageImpl#getToUseSlopeAbsolute()
		 * @generated
		 */
		EClass TO_USE_SLOPE_ABSOLUTE = eINSTANCE.getToUseSlopeAbsolute();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.ToUseSlopeImpulsionImpl <em>To Use Slope Impulsion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.ToUseSlopeImpulsionImpl
		 * @see com.misc.touse.moplaf.timeline.tousetimeline.impl.TousetimelinePackageImpl#getToUseSlopeImpulsion()
		 * @generated
		 */
		EClass TO_USE_SLOPE_IMPULSION = eINSTANCE.getToUseSlopeImpulsion();

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

	}

} //TousetimelinePackage
