/**
 */
package com.misc.touse.moplaf.tousepropagator2.calc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import com.misc.common.moplaf.propagator2.PropagatorPackage;

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
 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcFactory
 * @model kind="package"
 * @generated
 */
public interface CalcPackage extends EPackage {
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
	String eNS_URI = "http://www.misc.com/touse/moplaf/propagator2/calc/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "topc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CalcPackage eINSTANCE = com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator2.calc.impl.ToUsePropagatorFunctionImpl <em>To Use Propagator Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.ToUsePropagatorFunctionImpl
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcPackageImpl#getToUsePropagatorFunction()
	 * @generated
	 */
	int TO_USE_PROPAGATOR_FUNCTION = 13;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION__PARENT = PropagatorPackage.PROPAGATOR_FUNCTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION__ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING = PropagatorPackage.PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION__TOUCHED = PropagatorPackage.PROPAGATOR_FUNCTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION__TOUCHED_CHILDREN = PropagatorPackage.PROPAGATOR_FUNCTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION__TOUCHERS = PropagatorPackage.PROPAGATOR_FUNCTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION__ENABLED = PropagatorPackage.PROPAGATOR_FUNCTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS = PropagatorPackage.PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION__TYPE = PropagatorPackage.PROPAGATOR_FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION__OBJECT = PropagatorPackage.PROPAGATOR_FUNCTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION__INSTANCE = PropagatorPackage.PROPAGATOR_FUNCTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION__DESCRIPTION = PropagatorPackage.PROPAGATOR_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION__CALCULATED = PropagatorPackage.PROPAGATOR_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>To Use Propagator Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION___ENABLE = PropagatorPackage.PROPAGATOR_FUNCTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION___DISABLE = PropagatorPackage.PROPAGATOR_FUNCTION___DISABLE;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION___TOUCH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION___REFRESH_THIS = PropagatorPackage.PROPAGATOR_FUNCTION___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS = PropagatorPackage.PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION___REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION___DO_GET_PARENT = PropagatorPackage.PROPAGATOR_FUNCTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Get Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION___DO_GET_EXPLICIT_ANTECEDENTS = PropagatorPackage.PROPAGATOR_FUNCTION___DO_GET_EXPLICIT_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION___DO_GET_BINDINGS = PropagatorPackage.PROPAGATOR_FUNCTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION___DO_REFRESH = PropagatorPackage.PROPAGATOR_FUNCTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT = PropagatorPackage.PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT;

	/**
	 * The number of operations of the '<em>To Use Propagator Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_OPERATION_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcTaskStartImpl <em>Task Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcTaskStartImpl
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcPackageImpl#getCalcTaskStart()
	 * @generated
	 */
	int CALC_TASK_START = 10;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcTaskEndImpl <em>Task End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcTaskEndImpl
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcPackageImpl#getCalcTaskEnd()
	 * @generated
	 */
	int CALC_TASK_END = 11;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator2.calc.impl.LayerTaskTimesImpl <em>Layer Task Times</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.LayerTaskTimesImpl
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcPackageImpl#getLayerTaskTimes()
	 * @generated
	 */
	int LAYER_TASK_TIMES = 4;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcTaskHoursItemImpl <em>Task Hours Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcTaskHoursItemImpl
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcPackageImpl#getCalcTaskHoursItem()
	 * @generated
	 */
	int CALC_TASK_HOURS_ITEM = 7;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcTaskHoursVarImpl <em>Task Hours Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcTaskHoursVarImpl
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcPackageImpl#getCalcTaskHoursVar()
	 * @generated
	 */
	int CALC_TASK_HOURS_VAR = 8;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcTaskHoursImpl <em>Task Hours</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcTaskHoursImpl
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcPackageImpl#getCalcTaskHours()
	 * @generated
	 */
	int CALC_TASK_HOURS = 9;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator2.calc.impl.ScopeProjectImpl <em>Scope Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.ScopeProjectImpl
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcPackageImpl#getScopeProject()
	 * @generated
	 */
	int SCOPE_PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT__PARENT = TO_USE_PROPAGATOR_FUNCTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT__ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT__ANTECEDENTS_SIBLING = TO_USE_PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT__TOUCHED = TO_USE_PROPAGATOR_FUNCTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT__TOUCHED_CHILDREN = TO_USE_PROPAGATOR_FUNCTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT__TOUCHERS = TO_USE_PROPAGATOR_FUNCTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT__ENABLED = TO_USE_PROPAGATOR_FUNCTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TO_USE_PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT__TYPE = TO_USE_PROPAGATOR_FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT__OBJECT = TO_USE_PROPAGATOR_FUNCTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT__INSTANCE = TO_USE_PROPAGATOR_FUNCTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT__DESCRIPTION = TO_USE_PROPAGATOR_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT__CALCULATED = TO_USE_PROPAGATOR_FUNCTION__CALCULATED;

	/**
	 * The feature id for the '<em><b>Project</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT__PROJECT = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scope Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT_FEATURE_COUNT = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT___ENABLE = TO_USE_PROPAGATOR_FUNCTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT___DISABLE = TO_USE_PROPAGATOR_FUNCTION___DISABLE;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT___TOUCH__EOBJECT = TO_USE_PROPAGATOR_FUNCTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT___REFRESH_ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT___REFRESH_THIS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT___REFRESH_CHILDREN_AND_THIS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT___REFRESH = TO_USE_PROPAGATOR_FUNCTION___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT___DO_GET_PARENT = TO_USE_PROPAGATOR_FUNCTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Get Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT___DO_GET_EXPLICIT_ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION___DO_GET_EXPLICIT_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT___DO_GET_BINDINGS = TO_USE_PROPAGATOR_FUNCTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT___DO_REFRESH = TO_USE_PROPAGATOR_FUNCTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT___DO_REFRESH__EOBJECT = TO_USE_PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT;

	/**
	 * The number of operations of the '<em>Scope Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT_OPERATION_COUNT = TO_USE_PROPAGATOR_FUNCTION_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator2.calc.impl.LayerTaskHoursItemImpl <em>Layer Task Hours Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.LayerTaskHoursItemImpl
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcPackageImpl#getLayerTaskHoursItem()
	 * @generated
	 */
	int LAYER_TASK_HOURS_ITEM = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM__PARENT = TO_USE_PROPAGATOR_FUNCTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM__ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM__ANTECEDENTS_SIBLING = TO_USE_PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM__TOUCHED = TO_USE_PROPAGATOR_FUNCTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM__TOUCHED_CHILDREN = TO_USE_PROPAGATOR_FUNCTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM__TOUCHERS = TO_USE_PROPAGATOR_FUNCTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM__ENABLED = TO_USE_PROPAGATOR_FUNCTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TO_USE_PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM__TYPE = TO_USE_PROPAGATOR_FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM__OBJECT = TO_USE_PROPAGATOR_FUNCTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM__INSTANCE = TO_USE_PROPAGATOR_FUNCTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM__DESCRIPTION = TO_USE_PROPAGATOR_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM__CALCULATED = TO_USE_PROPAGATOR_FUNCTION__CALCULATED;

	/**
	 * The feature id for the '<em><b>Project</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM__PROJECT = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM__CONCRETE_PARENT = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Layer Task Hours Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM_FEATURE_COUNT = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM___ENABLE = TO_USE_PROPAGATOR_FUNCTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM___DISABLE = TO_USE_PROPAGATOR_FUNCTION___DISABLE;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM___TOUCH__EOBJECT = TO_USE_PROPAGATOR_FUNCTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM___REFRESH_ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM___REFRESH_THIS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM___REFRESH_CHILDREN_AND_THIS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM___REFRESH = TO_USE_PROPAGATOR_FUNCTION___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM___DO_GET_PARENT = TO_USE_PROPAGATOR_FUNCTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Get Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM___DO_GET_EXPLICIT_ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION___DO_GET_EXPLICIT_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM___DO_GET_BINDINGS = TO_USE_PROPAGATOR_FUNCTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM___DO_REFRESH = TO_USE_PROPAGATOR_FUNCTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM___DO_REFRESH__EOBJECT = TO_USE_PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT;

	/**
	 * The number of operations of the '<em>Layer Task Hours Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM_OPERATION_COUNT = TO_USE_PROPAGATOR_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator2.calc.impl.LayerTaskHoursVarImpl <em>Layer Task Hours Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.LayerTaskHoursVarImpl
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcPackageImpl#getLayerTaskHoursVar()
	 * @generated
	 */
	int LAYER_TASK_HOURS_VAR = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR__PARENT = TO_USE_PROPAGATOR_FUNCTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR__ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR__ANTECEDENTS_SIBLING = TO_USE_PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR__TOUCHED = TO_USE_PROPAGATOR_FUNCTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR__TOUCHED_CHILDREN = TO_USE_PROPAGATOR_FUNCTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR__TOUCHERS = TO_USE_PROPAGATOR_FUNCTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR__ENABLED = TO_USE_PROPAGATOR_FUNCTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TO_USE_PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR__TYPE = TO_USE_PROPAGATOR_FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR__OBJECT = TO_USE_PROPAGATOR_FUNCTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR__INSTANCE = TO_USE_PROPAGATOR_FUNCTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR__DESCRIPTION = TO_USE_PROPAGATOR_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR__CALCULATED = TO_USE_PROPAGATOR_FUNCTION__CALCULATED;

	/**
	 * The feature id for the '<em><b>Project</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR__PROJECT = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR__CONCRETE_PARENT = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Layer Task Hours Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR_FEATURE_COUNT = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR___ENABLE = TO_USE_PROPAGATOR_FUNCTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR___DISABLE = TO_USE_PROPAGATOR_FUNCTION___DISABLE;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR___TOUCH__EOBJECT = TO_USE_PROPAGATOR_FUNCTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR___REFRESH_ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR___REFRESH_THIS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR___REFRESH_CHILDREN_AND_THIS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR___REFRESH = TO_USE_PROPAGATOR_FUNCTION___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR___DO_GET_PARENT = TO_USE_PROPAGATOR_FUNCTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Get Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR___DO_GET_EXPLICIT_ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION___DO_GET_EXPLICIT_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR___DO_GET_BINDINGS = TO_USE_PROPAGATOR_FUNCTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR___DO_REFRESH = TO_USE_PROPAGATOR_FUNCTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR___DO_REFRESH__EOBJECT = TO_USE_PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT;

	/**
	 * The number of operations of the '<em>Layer Task Hours Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR_OPERATION_COUNT = TO_USE_PROPAGATOR_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator2.calc.impl.LayerTaskHoursImpl <em>Layer Task Hours</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.LayerTaskHoursImpl
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcPackageImpl#getLayerTaskHours()
	 * @generated
	 */
	int LAYER_TASK_HOURS = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS__PARENT = TO_USE_PROPAGATOR_FUNCTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS__ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS__ANTECEDENTS_SIBLING = TO_USE_PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS__TOUCHED = TO_USE_PROPAGATOR_FUNCTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS__TOUCHED_CHILDREN = TO_USE_PROPAGATOR_FUNCTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS__TOUCHERS = TO_USE_PROPAGATOR_FUNCTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS__ENABLED = TO_USE_PROPAGATOR_FUNCTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TO_USE_PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS__TYPE = TO_USE_PROPAGATOR_FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS__OBJECT = TO_USE_PROPAGATOR_FUNCTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS__INSTANCE = TO_USE_PROPAGATOR_FUNCTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS__DESCRIPTION = TO_USE_PROPAGATOR_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS__CALCULATED = TO_USE_PROPAGATOR_FUNCTION__CALCULATED;

	/**
	 * The feature id for the '<em><b>Project</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS__PROJECT = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS__CONCRETE_PARENT = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Antecedent Layer Task Hours Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS__ANTECEDENT_LAYER_TASK_HOURS_ITEM = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Antecedent Layer Task Hours Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS__ANTECEDENT_LAYER_TASK_HOURS_VAR = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Layer Task Hours</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_FEATURE_COUNT = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS___ENABLE = TO_USE_PROPAGATOR_FUNCTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS___DISABLE = TO_USE_PROPAGATOR_FUNCTION___DISABLE;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS___TOUCH__EOBJECT = TO_USE_PROPAGATOR_FUNCTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS___REFRESH_ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS___REFRESH_THIS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS___REFRESH_CHILDREN_AND_THIS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS___REFRESH = TO_USE_PROPAGATOR_FUNCTION___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS___DO_GET_PARENT = TO_USE_PROPAGATOR_FUNCTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Get Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS___DO_GET_EXPLICIT_ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION___DO_GET_EXPLICIT_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS___DO_GET_BINDINGS = TO_USE_PROPAGATOR_FUNCTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS___DO_REFRESH = TO_USE_PROPAGATOR_FUNCTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS___DO_REFRESH__EOBJECT = TO_USE_PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT;

	/**
	 * The number of operations of the '<em>Layer Task Hours</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_OPERATION_COUNT = TO_USE_PROPAGATOR_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES__PARENT = TO_USE_PROPAGATOR_FUNCTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES__ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES__ANTECEDENTS_SIBLING = TO_USE_PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES__TOUCHED = TO_USE_PROPAGATOR_FUNCTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES__TOUCHED_CHILDREN = TO_USE_PROPAGATOR_FUNCTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES__TOUCHERS = TO_USE_PROPAGATOR_FUNCTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES__ENABLED = TO_USE_PROPAGATOR_FUNCTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TO_USE_PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES__TYPE = TO_USE_PROPAGATOR_FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES__OBJECT = TO_USE_PROPAGATOR_FUNCTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES__INSTANCE = TO_USE_PROPAGATOR_FUNCTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES__DESCRIPTION = TO_USE_PROPAGATOR_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES__CALCULATED = TO_USE_PROPAGATOR_FUNCTION__CALCULATED;

	/**
	 * The feature id for the '<em><b>Project</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES__PROJECT = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES__CONCRETE_PARENT = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Antecedent Layer Task Hours</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES__ANTECEDENT_LAYER_TASK_HOURS = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Layer Task Times</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES_FEATURE_COUNT = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES___ENABLE = TO_USE_PROPAGATOR_FUNCTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES___DISABLE = TO_USE_PROPAGATOR_FUNCTION___DISABLE;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES___TOUCH__EOBJECT = TO_USE_PROPAGATOR_FUNCTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES___REFRESH_ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES___REFRESH_THIS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES___REFRESH_CHILDREN_AND_THIS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES___REFRESH = TO_USE_PROPAGATOR_FUNCTION___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES___DO_GET_PARENT = TO_USE_PROPAGATOR_FUNCTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Get Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES___DO_GET_EXPLICIT_ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION___DO_GET_EXPLICIT_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES___DO_GET_BINDINGS = TO_USE_PROPAGATOR_FUNCTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES___DO_REFRESH = TO_USE_PROPAGATOR_FUNCTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES___DO_REFRESH__EOBJECT = TO_USE_PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT;

	/**
	 * The number of operations of the '<em>Layer Task Times</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES_OPERATION_COUNT = TO_USE_PROPAGATOR_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcTaskResourcesImpl <em>Task Resources</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcTaskResourcesImpl
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcPackageImpl#getCalcTaskResources()
	 * @generated
	 */
	int CALC_TASK_RESOURCES = 12;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcProjectEndImpl <em>Project End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcProjectEndImpl
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcPackageImpl#getCalcProjectEnd()
	 * @generated
	 */
	int CALC_PROJECT_END = 5;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END__PARENT = TO_USE_PROPAGATOR_FUNCTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END__ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END__ANTECEDENTS_SIBLING = TO_USE_PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END__TOUCHED = TO_USE_PROPAGATOR_FUNCTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END__TOUCHED_CHILDREN = TO_USE_PROPAGATOR_FUNCTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END__TOUCHERS = TO_USE_PROPAGATOR_FUNCTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END__ENABLED = TO_USE_PROPAGATOR_FUNCTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TO_USE_PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END__TYPE = TO_USE_PROPAGATOR_FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END__OBJECT = TO_USE_PROPAGATOR_FUNCTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END__INSTANCE = TO_USE_PROPAGATOR_FUNCTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END__DESCRIPTION = TO_USE_PROPAGATOR_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END__CALCULATED = TO_USE_PROPAGATOR_FUNCTION__CALCULATED;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END__CONCRETE_PARENT = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Project</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END__PROJECT = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Antecedent Layer Task Times</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END__ANTECEDENT_LAYER_TASK_TIMES = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Project End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END_FEATURE_COUNT = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END___ENABLE = TO_USE_PROPAGATOR_FUNCTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END___DISABLE = TO_USE_PROPAGATOR_FUNCTION___DISABLE;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END___TOUCH__EOBJECT = TO_USE_PROPAGATOR_FUNCTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END___REFRESH_ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END___REFRESH_THIS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END___REFRESH_CHILDREN_AND_THIS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END___REFRESH = TO_USE_PROPAGATOR_FUNCTION___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END___DO_GET_PARENT = TO_USE_PROPAGATOR_FUNCTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Get Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END___DO_GET_EXPLICIT_ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION___DO_GET_EXPLICIT_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END___DO_GET_BINDINGS = TO_USE_PROPAGATOR_FUNCTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END___DO_REFRESH = TO_USE_PROPAGATOR_FUNCTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END___DO_REFRESH__EOBJECT = TO_USE_PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT;

	/**
	 * The number of operations of the '<em>Project End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END_OPERATION_COUNT = TO_USE_PROPAGATOR_FUNCTION_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator2.calc.impl.LayerTaskResourcesImpl <em>Layer Task Resources</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.LayerTaskResourcesImpl
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcPackageImpl#getLayerTaskResources()
	 * @generated
	 */
	int LAYER_TASK_RESOURCES = 6;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES__PARENT = TO_USE_PROPAGATOR_FUNCTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES__ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES__ANTECEDENTS_SIBLING = TO_USE_PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES__TOUCHED = TO_USE_PROPAGATOR_FUNCTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES__TOUCHED_CHILDREN = TO_USE_PROPAGATOR_FUNCTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES__TOUCHERS = TO_USE_PROPAGATOR_FUNCTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES__ENABLED = TO_USE_PROPAGATOR_FUNCTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TO_USE_PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES__TYPE = TO_USE_PROPAGATOR_FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES__OBJECT = TO_USE_PROPAGATOR_FUNCTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES__INSTANCE = TO_USE_PROPAGATOR_FUNCTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES__DESCRIPTION = TO_USE_PROPAGATOR_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES__CALCULATED = TO_USE_PROPAGATOR_FUNCTION__CALCULATED;

	/**
	 * The feature id for the '<em><b>Project</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES__PROJECT = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Antecedent Layer Task Times</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES__ANTECEDENT_LAYER_TASK_TIMES = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES__CONCRETE_PARENT = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Layer Task Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES_FEATURE_COUNT = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES___ENABLE = TO_USE_PROPAGATOR_FUNCTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES___DISABLE = TO_USE_PROPAGATOR_FUNCTION___DISABLE;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES___TOUCH__EOBJECT = TO_USE_PROPAGATOR_FUNCTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES___REFRESH_ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES___REFRESH_THIS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES___REFRESH_CHILDREN_AND_THIS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES___REFRESH = TO_USE_PROPAGATOR_FUNCTION___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES___DO_GET_PARENT = TO_USE_PROPAGATOR_FUNCTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Get Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES___DO_GET_EXPLICIT_ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION___DO_GET_EXPLICIT_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES___DO_GET_BINDINGS = TO_USE_PROPAGATOR_FUNCTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES___DO_REFRESH = TO_USE_PROPAGATOR_FUNCTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES___DO_REFRESH__EOBJECT = TO_USE_PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT;

	/**
	 * The number of operations of the '<em>Layer Task Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES_OPERATION_COUNT = TO_USE_PROPAGATOR_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM__PARENT = TO_USE_PROPAGATOR_FUNCTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM__ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM__ANTECEDENTS_SIBLING = TO_USE_PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM__TOUCHED = TO_USE_PROPAGATOR_FUNCTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM__TOUCHED_CHILDREN = TO_USE_PROPAGATOR_FUNCTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM__TOUCHERS = TO_USE_PROPAGATOR_FUNCTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM__ENABLED = TO_USE_PROPAGATOR_FUNCTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TO_USE_PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM__TYPE = TO_USE_PROPAGATOR_FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM__OBJECT = TO_USE_PROPAGATOR_FUNCTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM__INSTANCE = TO_USE_PROPAGATOR_FUNCTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM__DESCRIPTION = TO_USE_PROPAGATOR_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM__CALCULATED = TO_USE_PROPAGATOR_FUNCTION__CALCULATED;

	/**
	 * The feature id for the '<em><b>Task</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM__TASK = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM__CONCRETE_PARENT = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Task Hours Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM_FEATURE_COUNT = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM___ENABLE = TO_USE_PROPAGATOR_FUNCTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM___DISABLE = TO_USE_PROPAGATOR_FUNCTION___DISABLE;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM___TOUCH__EOBJECT = TO_USE_PROPAGATOR_FUNCTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM___REFRESH_ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM___REFRESH_THIS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM___REFRESH_CHILDREN_AND_THIS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM___REFRESH = TO_USE_PROPAGATOR_FUNCTION___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM___DO_GET_PARENT = TO_USE_PROPAGATOR_FUNCTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Get Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM___DO_GET_EXPLICIT_ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION___DO_GET_EXPLICIT_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM___DO_GET_BINDINGS = TO_USE_PROPAGATOR_FUNCTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM___DO_REFRESH = TO_USE_PROPAGATOR_FUNCTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM___DO_REFRESH__EOBJECT = TO_USE_PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT;

	/**
	 * The number of operations of the '<em>Task Hours Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM_OPERATION_COUNT = TO_USE_PROPAGATOR_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR__PARENT = TO_USE_PROPAGATOR_FUNCTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR__ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR__ANTECEDENTS_SIBLING = TO_USE_PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR__TOUCHED = TO_USE_PROPAGATOR_FUNCTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR__TOUCHED_CHILDREN = TO_USE_PROPAGATOR_FUNCTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR__TOUCHERS = TO_USE_PROPAGATOR_FUNCTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR__ENABLED = TO_USE_PROPAGATOR_FUNCTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TO_USE_PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR__TYPE = TO_USE_PROPAGATOR_FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR__OBJECT = TO_USE_PROPAGATOR_FUNCTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR__INSTANCE = TO_USE_PROPAGATOR_FUNCTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR__DESCRIPTION = TO_USE_PROPAGATOR_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR__CALCULATED = TO_USE_PROPAGATOR_FUNCTION__CALCULATED;

	/**
	 * The feature id for the '<em><b>Task</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR__TASK = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR__CONCRETE_PARENT = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Task Hours Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR_FEATURE_COUNT = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR___ENABLE = TO_USE_PROPAGATOR_FUNCTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR___DISABLE = TO_USE_PROPAGATOR_FUNCTION___DISABLE;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR___TOUCH__EOBJECT = TO_USE_PROPAGATOR_FUNCTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR___REFRESH_ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR___REFRESH_THIS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR___REFRESH_CHILDREN_AND_THIS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR___REFRESH = TO_USE_PROPAGATOR_FUNCTION___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR___DO_GET_PARENT = TO_USE_PROPAGATOR_FUNCTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Get Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR___DO_GET_EXPLICIT_ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION___DO_GET_EXPLICIT_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR___DO_GET_BINDINGS = TO_USE_PROPAGATOR_FUNCTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR___DO_REFRESH = TO_USE_PROPAGATOR_FUNCTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR___DO_REFRESH__EOBJECT = TO_USE_PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT;

	/**
	 * The number of operations of the '<em>Task Hours Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR_OPERATION_COUNT = TO_USE_PROPAGATOR_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS__PARENT = TO_USE_PROPAGATOR_FUNCTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS__ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS__ANTECEDENTS_SIBLING = TO_USE_PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS__TOUCHED = TO_USE_PROPAGATOR_FUNCTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS__TOUCHED_CHILDREN = TO_USE_PROPAGATOR_FUNCTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS__TOUCHERS = TO_USE_PROPAGATOR_FUNCTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS__ENABLED = TO_USE_PROPAGATOR_FUNCTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TO_USE_PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS__TYPE = TO_USE_PROPAGATOR_FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS__OBJECT = TO_USE_PROPAGATOR_FUNCTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS__INSTANCE = TO_USE_PROPAGATOR_FUNCTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS__DESCRIPTION = TO_USE_PROPAGATOR_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS__CALCULATED = TO_USE_PROPAGATOR_FUNCTION__CALCULATED;

	/**
	 * The feature id for the '<em><b>Task</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS__TASK = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS__CONCRETE_PARENT = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Task Hours</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_FEATURE_COUNT = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS___ENABLE = TO_USE_PROPAGATOR_FUNCTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS___DISABLE = TO_USE_PROPAGATOR_FUNCTION___DISABLE;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS___TOUCH__EOBJECT = TO_USE_PROPAGATOR_FUNCTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS___REFRESH_ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS___REFRESH_THIS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS___REFRESH_CHILDREN_AND_THIS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS___REFRESH = TO_USE_PROPAGATOR_FUNCTION___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS___DO_GET_PARENT = TO_USE_PROPAGATOR_FUNCTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Get Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS___DO_GET_EXPLICIT_ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION___DO_GET_EXPLICIT_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS___DO_GET_BINDINGS = TO_USE_PROPAGATOR_FUNCTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS___DO_REFRESH = TO_USE_PROPAGATOR_FUNCTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS___DO_REFRESH__EOBJECT = TO_USE_PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT;

	/**
	 * The number of operations of the '<em>Task Hours</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_OPERATION_COUNT = TO_USE_PROPAGATOR_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START__PARENT = TO_USE_PROPAGATOR_FUNCTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START__ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START__ANTECEDENTS_SIBLING = TO_USE_PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START__TOUCHED = TO_USE_PROPAGATOR_FUNCTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START__TOUCHED_CHILDREN = TO_USE_PROPAGATOR_FUNCTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START__TOUCHERS = TO_USE_PROPAGATOR_FUNCTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START__ENABLED = TO_USE_PROPAGATOR_FUNCTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TO_USE_PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START__TYPE = TO_USE_PROPAGATOR_FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START__OBJECT = TO_USE_PROPAGATOR_FUNCTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START__INSTANCE = TO_USE_PROPAGATOR_FUNCTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START__DESCRIPTION = TO_USE_PROPAGATOR_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START__CALCULATED = TO_USE_PROPAGATOR_FUNCTION__CALCULATED;

	/**
	 * The feature id for the '<em><b>Task</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START__TASK = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START__CONCRETE_PARENT = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Task Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START_FEATURE_COUNT = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START___ENABLE = TO_USE_PROPAGATOR_FUNCTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START___DISABLE = TO_USE_PROPAGATOR_FUNCTION___DISABLE;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START___TOUCH__EOBJECT = TO_USE_PROPAGATOR_FUNCTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START___REFRESH_ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START___REFRESH_THIS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START___REFRESH_CHILDREN_AND_THIS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START___REFRESH = TO_USE_PROPAGATOR_FUNCTION___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START___DO_GET_PARENT = TO_USE_PROPAGATOR_FUNCTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Get Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START___DO_GET_EXPLICIT_ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION___DO_GET_EXPLICIT_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START___DO_GET_BINDINGS = TO_USE_PROPAGATOR_FUNCTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START___DO_REFRESH = TO_USE_PROPAGATOR_FUNCTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START___DO_REFRESH__EOBJECT = TO_USE_PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT;

	/**
	 * The number of operations of the '<em>Task Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START_OPERATION_COUNT = TO_USE_PROPAGATOR_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END__PARENT = TO_USE_PROPAGATOR_FUNCTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END__ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END__ANTECEDENTS_SIBLING = TO_USE_PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END__TOUCHED = TO_USE_PROPAGATOR_FUNCTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END__TOUCHED_CHILDREN = TO_USE_PROPAGATOR_FUNCTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END__TOUCHERS = TO_USE_PROPAGATOR_FUNCTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END__ENABLED = TO_USE_PROPAGATOR_FUNCTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TO_USE_PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END__TYPE = TO_USE_PROPAGATOR_FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END__OBJECT = TO_USE_PROPAGATOR_FUNCTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END__INSTANCE = TO_USE_PROPAGATOR_FUNCTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END__DESCRIPTION = TO_USE_PROPAGATOR_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END__CALCULATED = TO_USE_PROPAGATOR_FUNCTION__CALCULATED;

	/**
	 * The feature id for the '<em><b>Task</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END__TASK = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END__CONCRETE_PARENT = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Task End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END_FEATURE_COUNT = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END___ENABLE = TO_USE_PROPAGATOR_FUNCTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END___DISABLE = TO_USE_PROPAGATOR_FUNCTION___DISABLE;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END___TOUCH__EOBJECT = TO_USE_PROPAGATOR_FUNCTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END___REFRESH_ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END___REFRESH_THIS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END___REFRESH_CHILDREN_AND_THIS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END___REFRESH = TO_USE_PROPAGATOR_FUNCTION___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END___DO_GET_PARENT = TO_USE_PROPAGATOR_FUNCTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Get Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END___DO_GET_EXPLICIT_ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION___DO_GET_EXPLICIT_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END___DO_GET_BINDINGS = TO_USE_PROPAGATOR_FUNCTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END___DO_REFRESH = TO_USE_PROPAGATOR_FUNCTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END___DO_REFRESH__EOBJECT = TO_USE_PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT;

	/**
	 * The number of operations of the '<em>Task End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END_OPERATION_COUNT = TO_USE_PROPAGATOR_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES__PARENT = TO_USE_PROPAGATOR_FUNCTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES__ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES__ANTECEDENTS_SIBLING = TO_USE_PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES__TOUCHED = TO_USE_PROPAGATOR_FUNCTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES__TOUCHED_CHILDREN = TO_USE_PROPAGATOR_FUNCTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES__TOUCHERS = TO_USE_PROPAGATOR_FUNCTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES__ENABLED = TO_USE_PROPAGATOR_FUNCTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TO_USE_PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES__TYPE = TO_USE_PROPAGATOR_FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES__OBJECT = TO_USE_PROPAGATOR_FUNCTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES__INSTANCE = TO_USE_PROPAGATOR_FUNCTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES__DESCRIPTION = TO_USE_PROPAGATOR_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES__CALCULATED = TO_USE_PROPAGATOR_FUNCTION__CALCULATED;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES__CONCRETE_PARENT = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Task</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES__TASK = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Task Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES_FEATURE_COUNT = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES___ENABLE = TO_USE_PROPAGATOR_FUNCTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES___DISABLE = TO_USE_PROPAGATOR_FUNCTION___DISABLE;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES___TOUCH__EOBJECT = TO_USE_PROPAGATOR_FUNCTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES___REFRESH_ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES___REFRESH_THIS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES___REFRESH_CHILDREN_AND_THIS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES___REFRESH = TO_USE_PROPAGATOR_FUNCTION___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES___DO_GET_PARENT = TO_USE_PROPAGATOR_FUNCTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Get Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES___DO_GET_EXPLICIT_ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION___DO_GET_EXPLICIT_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES___DO_GET_BINDINGS = TO_USE_PROPAGATOR_FUNCTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES___DO_REFRESH = TO_USE_PROPAGATOR_FUNCTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES___DO_REFRESH__EOBJECT = TO_USE_PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT;

	/**
	 * The number of operations of the '<em>Task Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES_OPERATION_COUNT = TO_USE_PROPAGATOR_FUNCTION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskStart <em>Task Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Start</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskStart
	 * @generated
	 */
	EClass getCalcTaskStart();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskStart#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Task</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskStart#getTask()
	 * @see #getCalcTaskStart()
	 * @generated
	 */
	EReference getCalcTaskStart_Task();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskStart#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskStart#getConcreteParent()
	 * @see #getCalcTaskStart()
	 * @generated
	 */
	EReference getCalcTaskStart_ConcreteParent();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskEnd <em>Task End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task End</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskEnd
	 * @generated
	 */
	EClass getCalcTaskEnd();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskEnd#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Task</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskEnd#getTask()
	 * @see #getCalcTaskEnd()
	 * @generated
	 */
	EReference getCalcTaskEnd_Task();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskEnd#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskEnd#getConcreteParent()
	 * @see #getCalcTaskEnd()
	 * @generated
	 */
	EReference getCalcTaskEnd_ConcreteParent();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskResources <em>Task Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Resources</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskResources
	 * @generated
	 */
	EClass getCalcTaskResources();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskResources#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskResources#getConcreteParent()
	 * @see #getCalcTaskResources()
	 * @generated
	 */
	EReference getCalcTaskResources_ConcreteParent();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskResources#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Task</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskResources#getTask()
	 * @see #getCalcTaskResources()
	 * @generated
	 */
	EReference getCalcTaskResources_Task();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator2.calc.CalcProjectEnd <em>Project End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project End</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcProjectEnd
	 * @generated
	 */
	EClass getCalcProjectEnd();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator2.calc.CalcProjectEnd#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcProjectEnd#getConcreteParent()
	 * @see #getCalcProjectEnd()
	 * @generated
	 */
	EReference getCalcProjectEnd_ConcreteParent();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.touse.moplaf.tousepropagator2.calc.CalcProjectEnd#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Project</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcProjectEnd#getProject()
	 * @see #getCalcProjectEnd()
	 * @generated
	 */
	EReference getCalcProjectEnd_Project();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator2.calc.CalcProjectEnd#getAntecedentLayerTaskTimes <em>Antecedent Layer Task Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Antecedent Layer Task Times</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcProjectEnd#getAntecedentLayerTaskTimes()
	 * @see #getCalcProjectEnd()
	 * @generated
	 */
	EReference getCalcProjectEnd_AntecedentLayerTaskTimes();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskResources <em>Layer Task Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer Task Resources</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskResources
	 * @generated
	 */
	EClass getLayerTaskResources();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskResources#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Project</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskResources#getProject()
	 * @see #getLayerTaskResources()
	 * @generated
	 */
	EReference getLayerTaskResources_Project();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskResources#getAntecedentLayerTaskTimes <em>Antecedent Layer Task Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Antecedent Layer Task Times</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskResources#getAntecedentLayerTaskTimes()
	 * @see #getLayerTaskResources()
	 * @generated
	 */
	EReference getLayerTaskResources_AntecedentLayerTaskTimes();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskResources#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskResources#getConcreteParent()
	 * @see #getLayerTaskResources()
	 * @generated
	 */
	EReference getLayerTaskResources_ConcreteParent();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator2.calc.ToUsePropagatorFunction <em>To Use Propagator Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Use Propagator Function</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.ToUsePropagatorFunction
	 * @generated
	 */
	EClass getToUsePropagatorFunction();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousepropagator2.calc.ToUsePropagatorFunction#isCalculated <em>Calculated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calculated</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.ToUsePropagatorFunction#isCalculated()
	 * @see #getToUsePropagatorFunction()
	 * @generated
	 */
	EAttribute getToUsePropagatorFunction_Calculated();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskTimes <em>Layer Task Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer Task Times</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskTimes
	 * @generated
	 */
	EClass getLayerTaskTimes();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskTimes#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Project</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskTimes#getProject()
	 * @see #getLayerTaskTimes()
	 * @generated
	 */
	EReference getLayerTaskTimes_Project();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskTimes#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskTimes#getConcreteParent()
	 * @see #getLayerTaskTimes()
	 * @generated
	 */
	EReference getLayerTaskTimes_ConcreteParent();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskTimes#getAntecedentLayerTaskHours <em>Antecedent Layer Task Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Antecedent Layer Task Hours</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskTimes#getAntecedentLayerTaskHours()
	 * @see #getLayerTaskTimes()
	 * @generated
	 */
	EReference getLayerTaskTimes_AntecedentLayerTaskHours();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskHoursItem <em>Task Hours Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Hours Item</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskHoursItem
	 * @generated
	 */
	EClass getCalcTaskHoursItem();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskHoursItem#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Task</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskHoursItem#getTask()
	 * @see #getCalcTaskHoursItem()
	 * @generated
	 */
	EReference getCalcTaskHoursItem_Task();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskHoursItem#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskHoursItem#getConcreteParent()
	 * @see #getCalcTaskHoursItem()
	 * @generated
	 */
	EReference getCalcTaskHoursItem_ConcreteParent();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskHoursVar <em>Task Hours Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Hours Var</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskHoursVar
	 * @generated
	 */
	EClass getCalcTaskHoursVar();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskHoursVar#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Task</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskHoursVar#getTask()
	 * @see #getCalcTaskHoursVar()
	 * @generated
	 */
	EReference getCalcTaskHoursVar_Task();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskHoursVar#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskHoursVar#getConcreteParent()
	 * @see #getCalcTaskHoursVar()
	 * @generated
	 */
	EReference getCalcTaskHoursVar_ConcreteParent();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskHours <em>Task Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Hours</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskHours
	 * @generated
	 */
	EClass getCalcTaskHours();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskHours#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Task</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskHours#getTask()
	 * @see #getCalcTaskHours()
	 * @generated
	 */
	EReference getCalcTaskHours_Task();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskHours#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskHours#getConcreteParent()
	 * @see #getCalcTaskHours()
	 * @generated
	 */
	EReference getCalcTaskHours_ConcreteParent();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator2.calc.ScopeProject <em>Scope Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope Project</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.ScopeProject
	 * @generated
	 */
	EClass getScopeProject();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.touse.moplaf.tousepropagator2.calc.ScopeProject#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Project</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.ScopeProject#getProject()
	 * @see #getScopeProject()
	 * @generated
	 */
	EReference getScopeProject_Project();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskHoursItem <em>Layer Task Hours Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer Task Hours Item</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskHoursItem
	 * @generated
	 */
	EClass getLayerTaskHoursItem();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskHoursItem#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Project</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskHoursItem#getProject()
	 * @see #getLayerTaskHoursItem()
	 * @generated
	 */
	EReference getLayerTaskHoursItem_Project();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskHoursItem#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskHoursItem#getConcreteParent()
	 * @see #getLayerTaskHoursItem()
	 * @generated
	 */
	EReference getLayerTaskHoursItem_ConcreteParent();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskHoursVar <em>Layer Task Hours Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer Task Hours Var</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskHoursVar
	 * @generated
	 */
	EClass getLayerTaskHoursVar();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskHoursVar#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Project</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskHoursVar#getProject()
	 * @see #getLayerTaskHoursVar()
	 * @generated
	 */
	EReference getLayerTaskHoursVar_Project();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskHoursVar#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskHoursVar#getConcreteParent()
	 * @see #getLayerTaskHoursVar()
	 * @generated
	 */
	EReference getLayerTaskHoursVar_ConcreteParent();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskHours <em>Layer Task Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer Task Hours</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskHours
	 * @generated
	 */
	EClass getLayerTaskHours();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskHours#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Project</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskHours#getProject()
	 * @see #getLayerTaskHours()
	 * @generated
	 */
	EReference getLayerTaskHours_Project();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskHours#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskHours#getConcreteParent()
	 * @see #getLayerTaskHours()
	 * @generated
	 */
	EReference getLayerTaskHours_ConcreteParent();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskHours#getAntecedentLayerTaskHoursItem <em>Antecedent Layer Task Hours Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Antecedent Layer Task Hours Item</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskHours#getAntecedentLayerTaskHoursItem()
	 * @see #getLayerTaskHours()
	 * @generated
	 */
	EReference getLayerTaskHours_AntecedentLayerTaskHoursItem();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskHours#getAntecedentLayerTaskHoursVar <em>Antecedent Layer Task Hours Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Antecedent Layer Task Hours Var</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskHours#getAntecedentLayerTaskHoursVar()
	 * @see #getLayerTaskHours()
	 * @generated
	 */
	EReference getLayerTaskHours_AntecedentLayerTaskHoursVar();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CalcFactory getCalcFactory();

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
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcTaskStartImpl <em>Task Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcTaskStartImpl
		 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcPackageImpl#getCalcTaskStart()
		 * @generated
		 */
		EClass CALC_TASK_START = eINSTANCE.getCalcTaskStart();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_TASK_START__TASK = eINSTANCE.getCalcTaskStart_Task();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_TASK_START__CONCRETE_PARENT = eINSTANCE.getCalcTaskStart_ConcreteParent();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcTaskEndImpl <em>Task End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcTaskEndImpl
		 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcPackageImpl#getCalcTaskEnd()
		 * @generated
		 */
		EClass CALC_TASK_END = eINSTANCE.getCalcTaskEnd();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_TASK_END__TASK = eINSTANCE.getCalcTaskEnd_Task();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_TASK_END__CONCRETE_PARENT = eINSTANCE.getCalcTaskEnd_ConcreteParent();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcTaskResourcesImpl <em>Task Resources</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcTaskResourcesImpl
		 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcPackageImpl#getCalcTaskResources()
		 * @generated
		 */
		EClass CALC_TASK_RESOURCES = eINSTANCE.getCalcTaskResources();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_TASK_RESOURCES__CONCRETE_PARENT = eINSTANCE.getCalcTaskResources_ConcreteParent();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_TASK_RESOURCES__TASK = eINSTANCE.getCalcTaskResources_Task();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcProjectEndImpl <em>Project End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcProjectEndImpl
		 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcPackageImpl#getCalcProjectEnd()
		 * @generated
		 */
		EClass CALC_PROJECT_END = eINSTANCE.getCalcProjectEnd();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_PROJECT_END__CONCRETE_PARENT = eINSTANCE.getCalcProjectEnd_ConcreteParent();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_PROJECT_END__PROJECT = eINSTANCE.getCalcProjectEnd_Project();

		/**
		 * The meta object literal for the '<em><b>Antecedent Layer Task Times</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_PROJECT_END__ANTECEDENT_LAYER_TASK_TIMES = eINSTANCE.getCalcProjectEnd_AntecedentLayerTaskTimes();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator2.calc.impl.LayerTaskResourcesImpl <em>Layer Task Resources</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.LayerTaskResourcesImpl
		 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcPackageImpl#getLayerTaskResources()
		 * @generated
		 */
		EClass LAYER_TASK_RESOURCES = eINSTANCE.getLayerTaskResources();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_TASK_RESOURCES__PROJECT = eINSTANCE.getLayerTaskResources_Project();

		/**
		 * The meta object literal for the '<em><b>Antecedent Layer Task Times</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_TASK_RESOURCES__ANTECEDENT_LAYER_TASK_TIMES = eINSTANCE.getLayerTaskResources_AntecedentLayerTaskTimes();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_TASK_RESOURCES__CONCRETE_PARENT = eINSTANCE.getLayerTaskResources_ConcreteParent();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator2.calc.impl.ToUsePropagatorFunctionImpl <em>To Use Propagator Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.ToUsePropagatorFunctionImpl
		 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcPackageImpl#getToUsePropagatorFunction()
		 * @generated
		 */
		EClass TO_USE_PROPAGATOR_FUNCTION = eINSTANCE.getToUsePropagatorFunction();

		/**
		 * The meta object literal for the '<em><b>Calculated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_USE_PROPAGATOR_FUNCTION__CALCULATED = eINSTANCE.getToUsePropagatorFunction_Calculated();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator2.calc.impl.LayerTaskTimesImpl <em>Layer Task Times</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.LayerTaskTimesImpl
		 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcPackageImpl#getLayerTaskTimes()
		 * @generated
		 */
		EClass LAYER_TASK_TIMES = eINSTANCE.getLayerTaskTimes();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_TASK_TIMES__PROJECT = eINSTANCE.getLayerTaskTimes_Project();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_TASK_TIMES__CONCRETE_PARENT = eINSTANCE.getLayerTaskTimes_ConcreteParent();

		/**
		 * The meta object literal for the '<em><b>Antecedent Layer Task Hours</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_TASK_TIMES__ANTECEDENT_LAYER_TASK_HOURS = eINSTANCE.getLayerTaskTimes_AntecedentLayerTaskHours();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcTaskHoursItemImpl <em>Task Hours Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcTaskHoursItemImpl
		 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcPackageImpl#getCalcTaskHoursItem()
		 * @generated
		 */
		EClass CALC_TASK_HOURS_ITEM = eINSTANCE.getCalcTaskHoursItem();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_TASK_HOURS_ITEM__TASK = eINSTANCE.getCalcTaskHoursItem_Task();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_TASK_HOURS_ITEM__CONCRETE_PARENT = eINSTANCE.getCalcTaskHoursItem_ConcreteParent();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcTaskHoursVarImpl <em>Task Hours Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcTaskHoursVarImpl
		 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcPackageImpl#getCalcTaskHoursVar()
		 * @generated
		 */
		EClass CALC_TASK_HOURS_VAR = eINSTANCE.getCalcTaskHoursVar();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_TASK_HOURS_VAR__TASK = eINSTANCE.getCalcTaskHoursVar_Task();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_TASK_HOURS_VAR__CONCRETE_PARENT = eINSTANCE.getCalcTaskHoursVar_ConcreteParent();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcTaskHoursImpl <em>Task Hours</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcTaskHoursImpl
		 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcPackageImpl#getCalcTaskHours()
		 * @generated
		 */
		EClass CALC_TASK_HOURS = eINSTANCE.getCalcTaskHours();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_TASK_HOURS__TASK = eINSTANCE.getCalcTaskHours_Task();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_TASK_HOURS__CONCRETE_PARENT = eINSTANCE.getCalcTaskHours_ConcreteParent();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator2.calc.impl.ScopeProjectImpl <em>Scope Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.ScopeProjectImpl
		 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcPackageImpl#getScopeProject()
		 * @generated
		 */
		EClass SCOPE_PROJECT = eINSTANCE.getScopeProject();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE_PROJECT__PROJECT = eINSTANCE.getScopeProject_Project();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator2.calc.impl.LayerTaskHoursItemImpl <em>Layer Task Hours Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.LayerTaskHoursItemImpl
		 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcPackageImpl#getLayerTaskHoursItem()
		 * @generated
		 */
		EClass LAYER_TASK_HOURS_ITEM = eINSTANCE.getLayerTaskHoursItem();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_TASK_HOURS_ITEM__PROJECT = eINSTANCE.getLayerTaskHoursItem_Project();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_TASK_HOURS_ITEM__CONCRETE_PARENT = eINSTANCE.getLayerTaskHoursItem_ConcreteParent();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator2.calc.impl.LayerTaskHoursVarImpl <em>Layer Task Hours Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.LayerTaskHoursVarImpl
		 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcPackageImpl#getLayerTaskHoursVar()
		 * @generated
		 */
		EClass LAYER_TASK_HOURS_VAR = eINSTANCE.getLayerTaskHoursVar();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_TASK_HOURS_VAR__PROJECT = eINSTANCE.getLayerTaskHoursVar_Project();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_TASK_HOURS_VAR__CONCRETE_PARENT = eINSTANCE.getLayerTaskHoursVar_ConcreteParent();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator2.calc.impl.LayerTaskHoursImpl <em>Layer Task Hours</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.LayerTaskHoursImpl
		 * @see com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcPackageImpl#getLayerTaskHours()
		 * @generated
		 */
		EClass LAYER_TASK_HOURS = eINSTANCE.getLayerTaskHours();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_TASK_HOURS__PROJECT = eINSTANCE.getLayerTaskHours_Project();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_TASK_HOURS__CONCRETE_PARENT = eINSTANCE.getLayerTaskHours_ConcreteParent();

		/**
		 * The meta object literal for the '<em><b>Antecedent Layer Task Hours Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_TASK_HOURS__ANTECEDENT_LAYER_TASK_HOURS_ITEM = eINSTANCE.getLayerTaskHours_AntecedentLayerTaskHoursItem();

		/**
		 * The meta object literal for the '<em><b>Antecedent Layer Task Hours Var</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_TASK_HOURS__ANTECEDENT_LAYER_TASK_HOURS_VAR = eINSTANCE.getLayerTaskHours_AntecedentLayerTaskHoursVar();

	}

} //CalcPackage
