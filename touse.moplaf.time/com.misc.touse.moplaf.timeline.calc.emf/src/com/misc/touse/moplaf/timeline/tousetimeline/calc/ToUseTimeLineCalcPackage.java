/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline.calc;

import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;

import com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage;

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
 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.ToUseTimeLineCalcFactory
 * @model kind="package"
 * @generated
 */
public interface ToUseTimeLineCalcPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "calc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/touse/moplaf/timeline/calc/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ttmc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToUseTimeLineCalcPackage eINSTANCE = com.misc.touse.moplaf.timeline.tousetimeline.calc.impl.ToUseTimeLineCalcPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.timeline.tousetimeline.calc.impl.PropagatorScopeDomainImpl <em>Propagator Scope Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.impl.PropagatorScopeDomainImpl
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.impl.ToUseTimeLineCalcPackageImpl#getPropagatorScopeDomain()
	 * @generated
	 */
	int PROPAGATOR_SCOPE_DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN__PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN__ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN__ANTECEDENTS_SIBLING = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN__TOUCHED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN__TOUCHED_CHILDREN = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN__TOUCHERS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN__ENABLED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN__TYPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN__OBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN__INSTANCE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN__DESCRIPTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN__TOUCHED_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT__TOUCHED_PARENT;

	/**
	 * The number of structural features of the '<em>Propagator Scope Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN_FEATURE_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN___INIT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN___ENABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN___DISABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN___RESET = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN___TOUCH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN___UNTOUCH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN___REFRESH_ANTECEDENTS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN___REFRESH_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN___REFRESH_CHILDREN_AND_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN___REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN___REFRESH__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN___DO_GET_ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN___DO_GET_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN___DO_REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN___DO_REFRESH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN___GET_SCOPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN___GET_FACTORY_ID = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN___DO_GET_BINDINGS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Scope Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN_OPERATION_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.timeline.tousetimeline.calc.impl.PropagatorScopeDomainDistributionImpl <em>Propagator Scope Domain Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.impl.PropagatorScopeDomainDistributionImpl
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.impl.ToUseTimeLineCalcPackageImpl#getPropagatorScopeDomainDistribution()
	 * @generated
	 */
	int PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION__PARENT = TimeContinuousCalcPackage.PROPAGATOR_SCOPE_DISTRIBUTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION__ANTECEDENTS = TimeContinuousCalcPackage.PROPAGATOR_SCOPE_DISTRIBUTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION__ANTECEDENTS_SIBLING = TimeContinuousCalcPackage.PROPAGATOR_SCOPE_DISTRIBUTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION__TOUCHED = TimeContinuousCalcPackage.PROPAGATOR_SCOPE_DISTRIBUTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION__TOUCHED_CHILDREN = TimeContinuousCalcPackage.PROPAGATOR_SCOPE_DISTRIBUTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION__TOUCHERS = TimeContinuousCalcPackage.PROPAGATOR_SCOPE_DISTRIBUTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION__ENABLED = TimeContinuousCalcPackage.PROPAGATOR_SCOPE_DISTRIBUTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TimeContinuousCalcPackage.PROPAGATOR_SCOPE_DISTRIBUTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION__TYPE = TimeContinuousCalcPackage.PROPAGATOR_SCOPE_DISTRIBUTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION__OBJECT = TimeContinuousCalcPackage.PROPAGATOR_SCOPE_DISTRIBUTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION__INSTANCE = TimeContinuousCalcPackage.PROPAGATOR_SCOPE_DISTRIBUTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION__DESCRIPTION = TimeContinuousCalcPackage.PROPAGATOR_SCOPE_DISTRIBUTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION__TOUCHED_PARENT = TimeContinuousCalcPackage.PROPAGATOR_SCOPE_DISTRIBUTION__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION__DISTRIBUTION = TimeContinuousCalcPackage.PROPAGATOR_SCOPE_DISTRIBUTION__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION__CONCRETE_PARENT = TimeContinuousCalcPackage.PROPAGATOR_SCOPE_DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Propagator Scope Domain Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION_FEATURE_COUNT = TimeContinuousCalcPackage.PROPAGATOR_SCOPE_DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION___INIT = TimeContinuousCalcPackage.PROPAGATOR_SCOPE_DISTRIBUTION___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION___ENABLE = TimeContinuousCalcPackage.PROPAGATOR_SCOPE_DISTRIBUTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION___DISABLE = TimeContinuousCalcPackage.PROPAGATOR_SCOPE_DISTRIBUTION___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION___RESET = TimeContinuousCalcPackage.PROPAGATOR_SCOPE_DISTRIBUTION___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION___TOUCH__EOBJECT = TimeContinuousCalcPackage.PROPAGATOR_SCOPE_DISTRIBUTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION___UNTOUCH = TimeContinuousCalcPackage.PROPAGATOR_SCOPE_DISTRIBUTION___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION___REFRESH_ANTECEDENTS__REFRESHER = TimeContinuousCalcPackage.PROPAGATOR_SCOPE_DISTRIBUTION___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION___REFRESH_THIS__REFRESHER = TimeContinuousCalcPackage.PROPAGATOR_SCOPE_DISTRIBUTION___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION___REFRESH_CHILDREN_AND_THIS__REFRESHER = TimeContinuousCalcPackage.PROPAGATOR_SCOPE_DISTRIBUTION___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION___REFRESH = TimeContinuousCalcPackage.PROPAGATOR_SCOPE_DISTRIBUTION___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION___REFRESH__REFRESHER = TimeContinuousCalcPackage.PROPAGATOR_SCOPE_DISTRIBUTION___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION___DO_GET_ANTECEDENTS = TimeContinuousCalcPackage.PROPAGATOR_SCOPE_DISTRIBUTION___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION___DO_GET_PARENT = TimeContinuousCalcPackage.PROPAGATOR_SCOPE_DISTRIBUTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION___DO_REFRESH = TimeContinuousCalcPackage.PROPAGATOR_SCOPE_DISTRIBUTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION___DO_REFRESH__EOBJECT = TimeContinuousCalcPackage.PROPAGATOR_SCOPE_DISTRIBUTION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION___GET_SCOPE = TimeContinuousCalcPackage.PROPAGATOR_SCOPE_DISTRIBUTION___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION___GET_FACTORY_ID = TimeContinuousCalcPackage.PROPAGATOR_SCOPE_DISTRIBUTION___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION___DO_GET_BINDINGS = TimeContinuousCalcPackage.PROPAGATOR_SCOPE_DISTRIBUTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = TimeContinuousCalcPackage.PROPAGATOR_SCOPE_DISTRIBUTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Scope Domain Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION_OPERATION_COUNT = TimeContinuousCalcPackage.PROPAGATOR_SCOPE_DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.timeline.tousetimeline.calc.impl.PropagatorLayerDomainDistributionFunctionsImpl <em>Propagator Layer Domain Distribution Functions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.impl.PropagatorLayerDomainDistributionFunctionsImpl
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.impl.ToUseTimeLineCalcPackageImpl#getPropagatorLayerDomainDistributionFunctions()
	 * @generated
	 */
	int PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS__PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS__ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS__ANTECEDENTS_SIBLING = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS__TOUCHED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS__TOUCHED_CHILDREN = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS__TOUCHERS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS__ENABLED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS__TYPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS__OBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS__INSTANCE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS__DESCRIPTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS__TOUCHED_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__TOUCHED_PARENT;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS__DISTRIBUTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__DISTRIBUTION;

	/**
	 * The number of structural features of the '<em>Propagator Layer Domain Distribution Functions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS_FEATURE_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS___INIT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS___ENABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS___DISABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS___RESET = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS___TOUCH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS___UNTOUCH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS___REFRESH_ANTECEDENTS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS___REFRESH_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS___REFRESH_CHILDREN_AND_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS___REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS___REFRESH__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS___DO_GET_ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS___DO_GET_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS___DO_REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS___DO_REFRESH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS___GET_SCOPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS___GET_FACTORY_ID = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS___DO_GET_BINDINGS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Layer Domain Distribution Functions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS_OPERATION_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.timeline.tousetimeline.calc.impl.PropagatorCalcDomainDistributionFunctionIntervalImpl <em>Propagator Calc Domain Distribution Function Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.impl.PropagatorCalcDomainDistributionFunctionIntervalImpl
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.impl.ToUseTimeLineCalcPackageImpl#getPropagatorCalcDomainDistributionFunctionInterval()
	 * @generated
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL__PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL__ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL__ANTECEDENTS_SIBLING = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL__TOUCHED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL__TOUCHED_CHILDREN = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL__TOUCHERS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL__ENABLED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL__TYPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL__OBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL__INSTANCE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL__DESCRIPTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL__TOUCHED_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT__TOUCHED_PARENT;

	/**
	 * The number of structural features of the '<em>Propagator Calc Domain Distribution Function Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL_FEATURE_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL___INIT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL___ENABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL___DISABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL___RESET = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL___TOUCH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL___UNTOUCH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL___REFRESH_ANTECEDENTS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL___REFRESH_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL___REFRESH_CHILDREN_AND_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL___REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL___REFRESH__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL___DO_GET_ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL___DO_GET_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL___DO_REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL___DO_REFRESH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL___GET_SCOPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL___GET_FACTORY_ID = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL___DO_GET_BINDINGS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Domain Distribution Function Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL_OPERATION_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.timeline.tousetimeline.calc.impl.PropagatorCalcDomainDistributionFunctionPossibleImpl <em>Propagator Calc Domain Distribution Function Possible</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.impl.PropagatorCalcDomainDistributionFunctionPossibleImpl
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.impl.ToUseTimeLineCalcPackageImpl#getPropagatorCalcDomainDistributionFunctionPossible()
	 * @generated
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE = 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE__PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE__ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE__ANTECEDENTS_SIBLING = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE__TOUCHED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE__TOUCHED_CHILDREN = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE__TOUCHERS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE__ENABLED = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE__TYPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE__OBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE__INSTANCE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE__DESCRIPTION = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Touched Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE__TOUCHED_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT__TOUCHED_PARENT;

	/**
	 * The number of structural features of the '<em>Propagator Calc Domain Distribution Function Possible</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE_FEATURE_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE___INIT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___INIT;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE___ENABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE___DISABLE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___DISABLE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE___RESET = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___RESET;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE___TOUCH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE___UNTOUCH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE___REFRESH_ANTECEDENTS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___REFRESH_ANTECEDENTS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE___REFRESH_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___REFRESH_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE___REFRESH_CHILDREN_AND_THIS__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___REFRESH_CHILDREN_AND_THIS__REFRESHER;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE___REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___REFRESH;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE___REFRESH__REFRESHER = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___REFRESH__REFRESHER;

	/**
	 * The operation id for the '<em>Do Get Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE___DO_GET_ANTECEDENTS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___DO_GET_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE___DO_GET_PARENT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE___DO_REFRESH = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE___DO_REFRESH__EOBJECT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE___GET_SCOPE = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___GET_SCOPE;

	/**
	 * The operation id for the '<em>Get Factory ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE___GET_FACTORY_ID = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___GET_FACTORY_ID;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE___DO_GET_BINDINGS = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Collect Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST;

	/**
	 * The number of operations of the '<em>Propagator Calc Domain Distribution Function Possible</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE_OPERATION_COUNT = TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.timeline.tousetimeline.calc.PropagatorScopeDomain <em>Propagator Scope Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Scope Domain</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.PropagatorScopeDomain
	 * @generated
	 */
	EClass getPropagatorScopeDomain();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.timeline.tousetimeline.calc.PropagatorScopeDomainDistribution <em>Propagator Scope Domain Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Scope Domain Distribution</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.PropagatorScopeDomainDistribution
	 * @generated
	 */
	EClass getPropagatorScopeDomainDistribution();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.timeline.tousetimeline.calc.PropagatorScopeDomainDistribution#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.PropagatorScopeDomainDistribution#getConcreteParent()
	 * @see #getPropagatorScopeDomainDistribution()
	 * @generated
	 */
	EReference getPropagatorScopeDomainDistribution_ConcreteParent();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.timeline.tousetimeline.calc.PropagatorLayerDomainDistributionFunctions <em>Propagator Layer Domain Distribution Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Layer Domain Distribution Functions</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.PropagatorLayerDomainDistributionFunctions
	 * @generated
	 */
	EClass getPropagatorLayerDomainDistributionFunctions();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.timeline.tousetimeline.calc.PropagatorCalcDomainDistributionFunctionInterval <em>Propagator Calc Domain Distribution Function Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Domain Distribution Function Interval</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.PropagatorCalcDomainDistributionFunctionInterval
	 * @generated
	 */
	EClass getPropagatorCalcDomainDistributionFunctionInterval();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.timeline.tousetimeline.calc.PropagatorCalcDomainDistributionFunctionPossible <em>Propagator Calc Domain Distribution Function Possible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagator Calc Domain Distribution Function Possible</em>'.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.PropagatorCalcDomainDistributionFunctionPossible
	 * @generated
	 */
	EClass getPropagatorCalcDomainDistributionFunctionPossible();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ToUseTimeLineCalcFactory getToUseTimeLineCalcFactory();

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
		 * The meta object literal for the '{@link com.misc.touse.moplaf.timeline.tousetimeline.calc.impl.PropagatorScopeDomainImpl <em>Propagator Scope Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.impl.PropagatorScopeDomainImpl
		 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.impl.ToUseTimeLineCalcPackageImpl#getPropagatorScopeDomain()
		 * @generated
		 */
		EClass PROPAGATOR_SCOPE_DOMAIN = eINSTANCE.getPropagatorScopeDomain();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.timeline.tousetimeline.calc.impl.PropagatorScopeDomainDistributionImpl <em>Propagator Scope Domain Distribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.impl.PropagatorScopeDomainDistributionImpl
		 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.impl.ToUseTimeLineCalcPackageImpl#getPropagatorScopeDomainDistribution()
		 * @generated
		 */
		EClass PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION = eINSTANCE.getPropagatorScopeDomainDistribution();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATOR_SCOPE_DOMAIN_DISTRIBUTION__CONCRETE_PARENT = eINSTANCE.getPropagatorScopeDomainDistribution_ConcreteParent();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.timeline.tousetimeline.calc.impl.PropagatorLayerDomainDistributionFunctionsImpl <em>Propagator Layer Domain Distribution Functions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.impl.PropagatorLayerDomainDistributionFunctionsImpl
		 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.impl.ToUseTimeLineCalcPackageImpl#getPropagatorLayerDomainDistributionFunctions()
		 * @generated
		 */
		EClass PROPAGATOR_LAYER_DOMAIN_DISTRIBUTION_FUNCTIONS = eINSTANCE.getPropagatorLayerDomainDistributionFunctions();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.timeline.tousetimeline.calc.impl.PropagatorCalcDomainDistributionFunctionIntervalImpl <em>Propagator Calc Domain Distribution Function Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.impl.PropagatorCalcDomainDistributionFunctionIntervalImpl
		 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.impl.ToUseTimeLineCalcPackageImpl#getPropagatorCalcDomainDistributionFunctionInterval()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_INTERVAL = eINSTANCE.getPropagatorCalcDomainDistributionFunctionInterval();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.timeline.tousetimeline.calc.impl.PropagatorCalcDomainDistributionFunctionPossibleImpl <em>Propagator Calc Domain Distribution Function Possible</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.impl.PropagatorCalcDomainDistributionFunctionPossibleImpl
		 * @see com.misc.touse.moplaf.timeline.tousetimeline.calc.impl.ToUseTimeLineCalcPackageImpl#getPropagatorCalcDomainDistributionFunctionPossible()
		 * @generated
		 */
		EClass PROPAGATOR_CALC_DOMAIN_DISTRIBUTION_FUNCTION_POSSIBLE = eINSTANCE.getPropagatorCalcDomainDistributionFunctionPossible();

	}

} //ToUseTimeLineCalcPackage
