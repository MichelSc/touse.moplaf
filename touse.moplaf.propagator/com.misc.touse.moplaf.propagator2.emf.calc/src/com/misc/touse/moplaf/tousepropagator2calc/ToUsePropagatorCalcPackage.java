/**
 */
package com.misc.touse.moplaf.tousepropagator2calc;

import com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage;
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
 * @see com.misc.touse.moplaf.tousepropagator2calc.ToUsePropagatorCalcFactory
 * @model kind="package"
 * @generated
 */
public interface ToUsePropagatorCalcPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tousepropagator2calc";

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
	ToUsePropagatorCalcPackage eINSTANCE = com.misc.touse.moplaf.tousepropagator2calc.impl.ToUsePropagatorCalcPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator2calc.impl.ScopeProjectImpl <em>Scope Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.ScopeProjectImpl
	 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.ToUsePropagatorCalcPackageImpl#getScopeProject()
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
	int SCOPE_PROJECT__PARENT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT__ANTECEDENTS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT__ANTECEDENTS_SIBLING = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT__TOUCHED = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT__TOUCHED_CHILDREN = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT__TOUCHERS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT__ENABLED = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT__OBJECT_WITH_PROPAGATOR_FUNCTIONS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT__TYPE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT__OBJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT__INSTANCE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT__DESCRIPTION = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT__CALCULATED = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__CALCULATED;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT__PROJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__PROJECT;

	/**
	 * The number of structural features of the '<em>Scope Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT_FEATURE_COUNT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT___ENABLE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT___DISABLE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DISABLE;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT___TOUCH__EOBJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT___UNTOUCH = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT___REFRESH_ANTECEDENTS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT___REFRESH_THIS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT___REFRESH_CHILDREN_AND_THIS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT___REFRESH = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT___DO_GET_PARENT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Get Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT___DO_GET_EXPLICIT_ANTECEDENTS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DO_GET_EXPLICIT_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT___DO_GET_BINDINGS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT___DO_REFRESH = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT___DO_REFRESH__EOBJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT___GET_SCOPE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___GET_SCOPE;

	/**
	 * The number of operations of the '<em>Scope Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_PROJECT_OPERATION_COUNT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator2calc.impl.LayerTaskHoursItemImpl <em>Layer Task Hours Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.LayerTaskHoursItemImpl
	 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.ToUsePropagatorCalcPackageImpl#getLayerTaskHoursItem()
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
	int LAYER_TASK_HOURS_ITEM__PARENT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM__ANTECEDENTS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM__ANTECEDENTS_SIBLING = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM__TOUCHED = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM__TOUCHED_CHILDREN = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM__TOUCHERS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM__ENABLED = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM__OBJECT_WITH_PROPAGATOR_FUNCTIONS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM__TYPE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM__OBJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM__INSTANCE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM__DESCRIPTION = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM__CALCULATED = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__CALCULATED;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM__PROJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM__CONCRETE_PARENT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Layer Task Hours Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM_FEATURE_COUNT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM___ENABLE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM___DISABLE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DISABLE;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM___TOUCH__EOBJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM___UNTOUCH = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM___REFRESH_ANTECEDENTS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM___REFRESH_THIS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM___REFRESH_CHILDREN_AND_THIS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM___REFRESH = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM___DO_GET_PARENT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Get Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM___DO_GET_EXPLICIT_ANTECEDENTS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DO_GET_EXPLICIT_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM___DO_GET_BINDINGS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM___DO_REFRESH = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM___DO_REFRESH__EOBJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM___GET_SCOPE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___GET_SCOPE;

	/**
	 * The number of operations of the '<em>Layer Task Hours Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_ITEM_OPERATION_COUNT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator2calc.impl.LayerTaskHoursVarImpl <em>Layer Task Hours Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.LayerTaskHoursVarImpl
	 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.ToUsePropagatorCalcPackageImpl#getLayerTaskHoursVar()
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
	int LAYER_TASK_HOURS_VAR__PARENT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR__ANTECEDENTS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR__ANTECEDENTS_SIBLING = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR__TOUCHED = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR__TOUCHED_CHILDREN = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR__TOUCHERS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR__ENABLED = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR__OBJECT_WITH_PROPAGATOR_FUNCTIONS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR__TYPE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR__OBJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR__INSTANCE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR__DESCRIPTION = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR__CALCULATED = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__CALCULATED;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR__PROJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR__CONCRETE_PARENT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Layer Task Hours Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR_FEATURE_COUNT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR___ENABLE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR___DISABLE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DISABLE;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR___TOUCH__EOBJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR___UNTOUCH = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR___REFRESH_ANTECEDENTS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR___REFRESH_THIS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR___REFRESH_CHILDREN_AND_THIS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR___REFRESH = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR___DO_GET_PARENT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Get Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR___DO_GET_EXPLICIT_ANTECEDENTS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DO_GET_EXPLICIT_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR___DO_GET_BINDINGS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR___DO_REFRESH = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR___DO_REFRESH__EOBJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR___GET_SCOPE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___GET_SCOPE;

	/**
	 * The number of operations of the '<em>Layer Task Hours Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_VAR_OPERATION_COUNT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator2calc.impl.LayerTaskHoursImpl <em>Layer Task Hours</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.LayerTaskHoursImpl
	 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.ToUsePropagatorCalcPackageImpl#getLayerTaskHours()
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
	int LAYER_TASK_HOURS__PARENT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS__ANTECEDENTS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS__ANTECEDENTS_SIBLING = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS__TOUCHED = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS__TOUCHED_CHILDREN = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS__TOUCHERS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS__ENABLED = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS__OBJECT_WITH_PROPAGATOR_FUNCTIONS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS__TYPE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS__OBJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS__INSTANCE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS__DESCRIPTION = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS__CALCULATED = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__CALCULATED;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS__PROJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS__CONCRETE_PARENT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Antecedent Layer Task Hours Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS__ANTECEDENT_LAYER_TASK_HOURS_ITEM = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Antecedent Layer Task Hours Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS__ANTECEDENT_LAYER_TASK_HOURS_VAR = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Layer Task Hours</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_FEATURE_COUNT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS___ENABLE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS___DISABLE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DISABLE;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS___TOUCH__EOBJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS___UNTOUCH = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS___REFRESH_ANTECEDENTS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS___REFRESH_THIS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS___REFRESH_CHILDREN_AND_THIS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS___REFRESH = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS___DO_GET_PARENT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Get Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS___DO_GET_EXPLICIT_ANTECEDENTS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DO_GET_EXPLICIT_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS___DO_GET_BINDINGS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS___DO_REFRESH = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS___DO_REFRESH__EOBJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS___GET_SCOPE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___GET_SCOPE;

	/**
	 * The number of operations of the '<em>Layer Task Hours</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_HOURS_OPERATION_COUNT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator2calc.impl.LayerTaskTimesImpl <em>Layer Task Times</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.LayerTaskTimesImpl
	 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.ToUsePropagatorCalcPackageImpl#getLayerTaskTimes()
	 * @generated
	 */
	int LAYER_TASK_TIMES = 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES__PARENT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES__ANTECEDENTS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES__ANTECEDENTS_SIBLING = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES__TOUCHED = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES__TOUCHED_CHILDREN = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES__TOUCHERS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES__ENABLED = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES__OBJECT_WITH_PROPAGATOR_FUNCTIONS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES__TYPE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES__OBJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES__INSTANCE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES__DESCRIPTION = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES__CALCULATED = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__CALCULATED;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES__PROJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES__CONCRETE_PARENT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Antecedent Layer Task Hours</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES__ANTECEDENT_LAYER_TASK_HOURS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Layer Task Times</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES_FEATURE_COUNT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES___ENABLE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES___DISABLE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DISABLE;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES___TOUCH__EOBJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES___UNTOUCH = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES___REFRESH_ANTECEDENTS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES___REFRESH_THIS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES___REFRESH_CHILDREN_AND_THIS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES___REFRESH = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES___DO_GET_PARENT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Get Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES___DO_GET_EXPLICIT_ANTECEDENTS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DO_GET_EXPLICIT_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES___DO_GET_BINDINGS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES___DO_REFRESH = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES___DO_REFRESH__EOBJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES___GET_SCOPE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___GET_SCOPE;

	/**
	 * The number of operations of the '<em>Layer Task Times</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_TIMES_OPERATION_COUNT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator2calc.impl.CalcProjectEndImpl <em>Calc Project End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.CalcProjectEndImpl
	 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.ToUsePropagatorCalcPackageImpl#getCalcProjectEnd()
	 * @generated
	 */
	int CALC_PROJECT_END = 6;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator2calc.impl.LayerTaskResourcesImpl <em>Layer Task Resources</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.LayerTaskResourcesImpl
	 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.ToUsePropagatorCalcPackageImpl#getLayerTaskResources()
	 * @generated
	 */
	int LAYER_TASK_RESOURCES = 5;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES__PARENT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES__ANTECEDENTS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES__ANTECEDENTS_SIBLING = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES__TOUCHED = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES__TOUCHED_CHILDREN = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES__TOUCHERS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES__ENABLED = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES__OBJECT_WITH_PROPAGATOR_FUNCTIONS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES__TYPE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES__OBJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES__INSTANCE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES__DESCRIPTION = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES__CALCULATED = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__CALCULATED;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES__PROJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Antecedent Layer Task Times</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES__ANTECEDENT_LAYER_TASK_TIMES = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES__CONCRETE_PARENT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Layer Task Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES_FEATURE_COUNT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES___ENABLE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES___DISABLE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DISABLE;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES___TOUCH__EOBJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES___UNTOUCH = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES___REFRESH_ANTECEDENTS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES___REFRESH_THIS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES___REFRESH_CHILDREN_AND_THIS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES___REFRESH = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES___DO_GET_PARENT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Get Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES___DO_GET_EXPLICIT_ANTECEDENTS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DO_GET_EXPLICIT_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES___DO_GET_BINDINGS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES___DO_REFRESH = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES___DO_REFRESH__EOBJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES___GET_SCOPE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___GET_SCOPE;

	/**
	 * The number of operations of the '<em>Layer Task Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TASK_RESOURCES_OPERATION_COUNT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END__PARENT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END__ANTECEDENTS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END__ANTECEDENTS_SIBLING = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END__TOUCHED = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END__TOUCHED_CHILDREN = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END__TOUCHERS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END__ENABLED = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END__OBJECT_WITH_PROPAGATOR_FUNCTIONS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END__TYPE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END__OBJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END__INSTANCE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END__DESCRIPTION = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END__CALCULATED = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__CALCULATED;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END__PROJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END__CONCRETE_PARENT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Antecedent Layer Task Times</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END__ANTECEDENT_LAYER_TASK_TIMES = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Calc Project End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END_FEATURE_COUNT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END___ENABLE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END___DISABLE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DISABLE;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END___TOUCH__EOBJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END___UNTOUCH = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END___REFRESH_ANTECEDENTS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END___REFRESH_THIS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END___REFRESH_CHILDREN_AND_THIS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END___REFRESH = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END___DO_GET_PARENT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Get Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END___DO_GET_EXPLICIT_ANTECEDENTS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DO_GET_EXPLICIT_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END___DO_GET_BINDINGS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END___DO_REFRESH = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END___DO_REFRESH__EOBJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END___GET_SCOPE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT___GET_SCOPE;

	/**
	 * The number of operations of the '<em>Calc Project End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_PROJECT_END_OPERATION_COUNT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_PROJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator2calc.impl.CalcTaskHoursItemImpl <em>Calc Task Hours Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.CalcTaskHoursItemImpl
	 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.ToUsePropagatorCalcPackageImpl#getCalcTaskHoursItem()
	 * @generated
	 */
	int CALC_TASK_HOURS_ITEM = 7;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM__PARENT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM__ANTECEDENTS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM__ANTECEDENTS_SIBLING = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM__TOUCHED = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM__TOUCHED_CHILDREN = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM__TOUCHERS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM__ENABLED = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM__OBJECT_WITH_PROPAGATOR_FUNCTIONS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM__TYPE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM__OBJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM__INSTANCE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM__DESCRIPTION = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM__CALCULATED = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__CALCULATED;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM__TASK = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__TASK;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM__CONCRETE_PARENT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Calc Task Hours Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM_FEATURE_COUNT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM___ENABLE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM___DISABLE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___DISABLE;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM___TOUCH__EOBJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM___UNTOUCH = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM___REFRESH_ANTECEDENTS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM___REFRESH_THIS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM___REFRESH_CHILDREN_AND_THIS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM___REFRESH = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM___DO_GET_PARENT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Get Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM___DO_GET_EXPLICIT_ANTECEDENTS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___DO_GET_EXPLICIT_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM___DO_GET_BINDINGS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM___DO_REFRESH = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM___DO_REFRESH__EOBJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM___GET_SCOPE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___GET_SCOPE;

	/**
	 * The number of operations of the '<em>Calc Task Hours Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_ITEM_OPERATION_COUNT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator2calc.impl.CalcTaskHoursVarImpl <em>Calc Task Hours Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.CalcTaskHoursVarImpl
	 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.ToUsePropagatorCalcPackageImpl#getCalcTaskHoursVar()
	 * @generated
	 */
	int CALC_TASK_HOURS_VAR = 8;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR__PARENT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR__ANTECEDENTS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR__ANTECEDENTS_SIBLING = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR__TOUCHED = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR__TOUCHED_CHILDREN = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR__TOUCHERS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR__ENABLED = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR__OBJECT_WITH_PROPAGATOR_FUNCTIONS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR__TYPE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR__OBJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR__INSTANCE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR__DESCRIPTION = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR__CALCULATED = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__CALCULATED;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR__TASK = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__TASK;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR__CONCRETE_PARENT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Calc Task Hours Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR_FEATURE_COUNT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR___ENABLE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR___DISABLE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___DISABLE;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR___TOUCH__EOBJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR___UNTOUCH = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR___REFRESH_ANTECEDENTS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR___REFRESH_THIS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR___REFRESH_CHILDREN_AND_THIS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR___REFRESH = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR___DO_GET_PARENT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Get Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR___DO_GET_EXPLICIT_ANTECEDENTS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___DO_GET_EXPLICIT_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR___DO_GET_BINDINGS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR___DO_REFRESH = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR___DO_REFRESH__EOBJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR___GET_SCOPE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___GET_SCOPE;

	/**
	 * The number of operations of the '<em>Calc Task Hours Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_VAR_OPERATION_COUNT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator2calc.impl.CalcTaskHoursImpl <em>Calc Task Hours</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.CalcTaskHoursImpl
	 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.ToUsePropagatorCalcPackageImpl#getCalcTaskHours()
	 * @generated
	 */
	int CALC_TASK_HOURS = 9;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS__PARENT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS__ANTECEDENTS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS__ANTECEDENTS_SIBLING = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS__TOUCHED = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS__TOUCHED_CHILDREN = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS__TOUCHERS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS__ENABLED = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS__OBJECT_WITH_PROPAGATOR_FUNCTIONS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS__TYPE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS__OBJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS__INSTANCE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS__DESCRIPTION = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS__CALCULATED = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__CALCULATED;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS__TASK = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__TASK;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS__CONCRETE_PARENT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Calc Task Hours</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_FEATURE_COUNT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS___ENABLE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS___DISABLE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___DISABLE;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS___TOUCH__EOBJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS___UNTOUCH = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS___REFRESH_ANTECEDENTS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS___REFRESH_THIS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS___REFRESH_CHILDREN_AND_THIS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS___REFRESH = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS___DO_GET_PARENT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Get Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS___DO_GET_EXPLICIT_ANTECEDENTS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___DO_GET_EXPLICIT_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS___DO_GET_BINDINGS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS___DO_REFRESH = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS___DO_REFRESH__EOBJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS___GET_SCOPE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___GET_SCOPE;

	/**
	 * The number of operations of the '<em>Calc Task Hours</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_HOURS_OPERATION_COUNT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator2calc.impl.CalcTaskStartImpl <em>Calc Task Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.CalcTaskStartImpl
	 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.ToUsePropagatorCalcPackageImpl#getCalcTaskStart()
	 * @generated
	 */
	int CALC_TASK_START = 10;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START__PARENT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START__ANTECEDENTS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START__ANTECEDENTS_SIBLING = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START__TOUCHED = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START__TOUCHED_CHILDREN = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START__TOUCHERS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START__ENABLED = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START__OBJECT_WITH_PROPAGATOR_FUNCTIONS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START__TYPE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START__OBJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START__INSTANCE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START__DESCRIPTION = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START__CALCULATED = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__CALCULATED;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START__TASK = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__TASK;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START__CONCRETE_PARENT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Calc Task Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START_FEATURE_COUNT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START___ENABLE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START___DISABLE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___DISABLE;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START___TOUCH__EOBJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START___UNTOUCH = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START___REFRESH_ANTECEDENTS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START___REFRESH_THIS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START___REFRESH_CHILDREN_AND_THIS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START___REFRESH = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START___DO_GET_PARENT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Get Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START___DO_GET_EXPLICIT_ANTECEDENTS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___DO_GET_EXPLICIT_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START___DO_GET_BINDINGS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START___DO_REFRESH = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START___DO_REFRESH__EOBJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START___GET_SCOPE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___GET_SCOPE;

	/**
	 * The number of operations of the '<em>Calc Task Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_START_OPERATION_COUNT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator2calc.impl.CalcTaskEndImpl <em>Calc Task End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.CalcTaskEndImpl
	 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.ToUsePropagatorCalcPackageImpl#getCalcTaskEnd()
	 * @generated
	 */
	int CALC_TASK_END = 11;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END__PARENT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END__ANTECEDENTS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END__ANTECEDENTS_SIBLING = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END__TOUCHED = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END__TOUCHED_CHILDREN = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END__TOUCHERS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END__ENABLED = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END__OBJECT_WITH_PROPAGATOR_FUNCTIONS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END__TYPE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END__OBJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END__INSTANCE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END__DESCRIPTION = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END__CALCULATED = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__CALCULATED;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END__TASK = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__TASK;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END__CONCRETE_PARENT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Calc Task End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END_FEATURE_COUNT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END___ENABLE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END___DISABLE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___DISABLE;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END___TOUCH__EOBJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END___UNTOUCH = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END___REFRESH_ANTECEDENTS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END___REFRESH_THIS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END___REFRESH_CHILDREN_AND_THIS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END___REFRESH = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END___DO_GET_PARENT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Get Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END___DO_GET_EXPLICIT_ANTECEDENTS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___DO_GET_EXPLICIT_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END___DO_GET_BINDINGS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END___DO_REFRESH = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END___DO_REFRESH__EOBJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END___GET_SCOPE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___GET_SCOPE;

	/**
	 * The number of operations of the '<em>Calc Task End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_END_OPERATION_COUNT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator2calc.impl.CalcTaskResourcesImpl <em>Calc Task Resources</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.CalcTaskResourcesImpl
	 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.ToUsePropagatorCalcPackageImpl#getCalcTaskResources()
	 * @generated
	 */
	int CALC_TASK_RESOURCES = 12;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES__PARENT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES__ANTECEDENTS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES__ANTECEDENTS_SIBLING = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES__TOUCHED = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES__TOUCHED_CHILDREN = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES__TOUCHERS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES__ENABLED = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES__OBJECT_WITH_PROPAGATOR_FUNCTIONS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES__TYPE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES__OBJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES__INSTANCE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES__DESCRIPTION = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES__CALCULATED = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__CALCULATED;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES__TASK = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK__TASK;

	/**
	 * The feature id for the '<em><b>Concrete Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES__CONCRETE_PARENT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Calc Task Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES_FEATURE_COUNT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES___ENABLE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES___DISABLE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___DISABLE;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES___TOUCH__EOBJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Untouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES___UNTOUCH = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___UNTOUCH;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES___REFRESH_ANTECEDENTS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES___REFRESH_THIS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES___REFRESH_CHILDREN_AND_THIS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES___REFRESH = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES___DO_GET_PARENT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Get Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES___DO_GET_EXPLICIT_ANTECEDENTS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___DO_GET_EXPLICIT_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES___DO_GET_BINDINGS = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES___DO_REFRESH = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES___DO_REFRESH__EOBJECT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES___GET_SCOPE = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK___GET_SCOPE;

	/**
	 * The number of operations of the '<em>Calc Task Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALC_TASK_RESOURCES_OPERATION_COUNT = ToUsePropagatorPackage.TO_USE_PROPAGATOR_FUNCTION_TASK_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator2calc.ScopeProject <em>Scope Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope Project</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.ScopeProject
	 * @generated
	 */
	EClass getScopeProject();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHoursItem <em>Layer Task Hours Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer Task Hours Item</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHoursItem
	 * @generated
	 */
	EClass getLayerTaskHoursItem();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHoursItem#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHoursItem#getConcreteParent()
	 * @see #getLayerTaskHoursItem()
	 * @generated
	 */
	EReference getLayerTaskHoursItem_ConcreteParent();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHoursVar <em>Layer Task Hours Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer Task Hours Var</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHoursVar
	 * @generated
	 */
	EClass getLayerTaskHoursVar();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHoursVar#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHoursVar#getConcreteParent()
	 * @see #getLayerTaskHoursVar()
	 * @generated
	 */
	EReference getLayerTaskHoursVar_ConcreteParent();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHours <em>Layer Task Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer Task Hours</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHours
	 * @generated
	 */
	EClass getLayerTaskHours();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHours#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHours#getConcreteParent()
	 * @see #getLayerTaskHours()
	 * @generated
	 */
	EReference getLayerTaskHours_ConcreteParent();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHours#getAntecedentLayerTaskHoursItem <em>Antecedent Layer Task Hours Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Antecedent Layer Task Hours Item</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHours#getAntecedentLayerTaskHoursItem()
	 * @see #getLayerTaskHours()
	 * @generated
	 */
	EReference getLayerTaskHours_AntecedentLayerTaskHoursItem();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHours#getAntecedentLayerTaskHoursVar <em>Antecedent Layer Task Hours Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Antecedent Layer Task Hours Var</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHours#getAntecedentLayerTaskHoursVar()
	 * @see #getLayerTaskHours()
	 * @generated
	 */
	EReference getLayerTaskHours_AntecedentLayerTaskHoursVar();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator2calc.LayerTaskTimes <em>Layer Task Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer Task Times</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.LayerTaskTimes
	 * @generated
	 */
	EClass getLayerTaskTimes();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator2calc.LayerTaskTimes#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.LayerTaskTimes#getConcreteParent()
	 * @see #getLayerTaskTimes()
	 * @generated
	 */
	EReference getLayerTaskTimes_ConcreteParent();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator2calc.LayerTaskTimes#getAntecedentLayerTaskHours <em>Antecedent Layer Task Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Antecedent Layer Task Hours</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.LayerTaskTimes#getAntecedentLayerTaskHours()
	 * @see #getLayerTaskTimes()
	 * @generated
	 */
	EReference getLayerTaskTimes_AntecedentLayerTaskHours();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator2calc.CalcProjectEnd <em>Calc Project End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Project End</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.CalcProjectEnd
	 * @generated
	 */
	EClass getCalcProjectEnd();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator2calc.CalcProjectEnd#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.CalcProjectEnd#getConcreteParent()
	 * @see #getCalcProjectEnd()
	 * @generated
	 */
	EReference getCalcProjectEnd_ConcreteParent();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator2calc.CalcProjectEnd#getAntecedentLayerTaskTimes <em>Antecedent Layer Task Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Antecedent Layer Task Times</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.CalcProjectEnd#getAntecedentLayerTaskTimes()
	 * @see #getCalcProjectEnd()
	 * @generated
	 */
	EReference getCalcProjectEnd_AntecedentLayerTaskTimes();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator2calc.LayerTaskResources <em>Layer Task Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer Task Resources</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.LayerTaskResources
	 * @generated
	 */
	EClass getLayerTaskResources();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator2calc.LayerTaskResources#getAntecedentLayerTaskTimes <em>Antecedent Layer Task Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Antecedent Layer Task Times</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.LayerTaskResources#getAntecedentLayerTaskTimes()
	 * @see #getLayerTaskResources()
	 * @generated
	 */
	EReference getLayerTaskResources_AntecedentLayerTaskTimes();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator2calc.LayerTaskResources#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.LayerTaskResources#getConcreteParent()
	 * @see #getLayerTaskResources()
	 * @generated
	 */
	EReference getLayerTaskResources_ConcreteParent();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator2calc.CalcTaskHoursItem <em>Calc Task Hours Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Task Hours Item</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.CalcTaskHoursItem
	 * @generated
	 */
	EClass getCalcTaskHoursItem();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator2calc.CalcTaskHoursItem#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.CalcTaskHoursItem#getConcreteParent()
	 * @see #getCalcTaskHoursItem()
	 * @generated
	 */
	EReference getCalcTaskHoursItem_ConcreteParent();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator2calc.CalcTaskHoursVar <em>Calc Task Hours Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Task Hours Var</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.CalcTaskHoursVar
	 * @generated
	 */
	EClass getCalcTaskHoursVar();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator2calc.CalcTaskHoursVar#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.CalcTaskHoursVar#getConcreteParent()
	 * @see #getCalcTaskHoursVar()
	 * @generated
	 */
	EReference getCalcTaskHoursVar_ConcreteParent();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator2calc.CalcTaskHours <em>Calc Task Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Task Hours</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.CalcTaskHours
	 * @generated
	 */
	EClass getCalcTaskHours();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator2calc.CalcTaskHours#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.CalcTaskHours#getConcreteParent()
	 * @see #getCalcTaskHours()
	 * @generated
	 */
	EReference getCalcTaskHours_ConcreteParent();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator2calc.CalcTaskStart <em>Calc Task Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Task Start</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.CalcTaskStart
	 * @generated
	 */
	EClass getCalcTaskStart();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator2calc.CalcTaskStart#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.CalcTaskStart#getConcreteParent()
	 * @see #getCalcTaskStart()
	 * @generated
	 */
	EReference getCalcTaskStart_ConcreteParent();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator2calc.CalcTaskEnd <em>Calc Task End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Task End</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.CalcTaskEnd
	 * @generated
	 */
	EClass getCalcTaskEnd();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator2calc.CalcTaskEnd#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.CalcTaskEnd#getConcreteParent()
	 * @see #getCalcTaskEnd()
	 * @generated
	 */
	EReference getCalcTaskEnd_ConcreteParent();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator2calc.CalcTaskResources <em>Calc Task Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calc Task Resources</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.CalcTaskResources
	 * @generated
	 */
	EClass getCalcTaskResources();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator2calc.CalcTaskResources#getConcreteParent <em>Concrete Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Parent</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2calc.CalcTaskResources#getConcreteParent()
	 * @see #getCalcTaskResources()
	 * @generated
	 */
	EReference getCalcTaskResources_ConcreteParent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ToUsePropagatorCalcFactory getToUsePropagatorCalcFactory();

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
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator2calc.impl.ScopeProjectImpl <em>Scope Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.ScopeProjectImpl
		 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.ToUsePropagatorCalcPackageImpl#getScopeProject()
		 * @generated
		 */
		EClass SCOPE_PROJECT = eINSTANCE.getScopeProject();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator2calc.impl.LayerTaskHoursItemImpl <em>Layer Task Hours Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.LayerTaskHoursItemImpl
		 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.ToUsePropagatorCalcPackageImpl#getLayerTaskHoursItem()
		 * @generated
		 */
		EClass LAYER_TASK_HOURS_ITEM = eINSTANCE.getLayerTaskHoursItem();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_TASK_HOURS_ITEM__CONCRETE_PARENT = eINSTANCE.getLayerTaskHoursItem_ConcreteParent();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator2calc.impl.LayerTaskHoursVarImpl <em>Layer Task Hours Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.LayerTaskHoursVarImpl
		 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.ToUsePropagatorCalcPackageImpl#getLayerTaskHoursVar()
		 * @generated
		 */
		EClass LAYER_TASK_HOURS_VAR = eINSTANCE.getLayerTaskHoursVar();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_TASK_HOURS_VAR__CONCRETE_PARENT = eINSTANCE.getLayerTaskHoursVar_ConcreteParent();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator2calc.impl.LayerTaskHoursImpl <em>Layer Task Hours</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.LayerTaskHoursImpl
		 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.ToUsePropagatorCalcPackageImpl#getLayerTaskHours()
		 * @generated
		 */
		EClass LAYER_TASK_HOURS = eINSTANCE.getLayerTaskHours();

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

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator2calc.impl.LayerTaskTimesImpl <em>Layer Task Times</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.LayerTaskTimesImpl
		 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.ToUsePropagatorCalcPackageImpl#getLayerTaskTimes()
		 * @generated
		 */
		EClass LAYER_TASK_TIMES = eINSTANCE.getLayerTaskTimes();

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
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator2calc.impl.CalcProjectEndImpl <em>Calc Project End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.CalcProjectEndImpl
		 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.ToUsePropagatorCalcPackageImpl#getCalcProjectEnd()
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
		 * The meta object literal for the '<em><b>Antecedent Layer Task Times</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_PROJECT_END__ANTECEDENT_LAYER_TASK_TIMES = eINSTANCE.getCalcProjectEnd_AntecedentLayerTaskTimes();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator2calc.impl.LayerTaskResourcesImpl <em>Layer Task Resources</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.LayerTaskResourcesImpl
		 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.ToUsePropagatorCalcPackageImpl#getLayerTaskResources()
		 * @generated
		 */
		EClass LAYER_TASK_RESOURCES = eINSTANCE.getLayerTaskResources();

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
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator2calc.impl.CalcTaskHoursItemImpl <em>Calc Task Hours Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.CalcTaskHoursItemImpl
		 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.ToUsePropagatorCalcPackageImpl#getCalcTaskHoursItem()
		 * @generated
		 */
		EClass CALC_TASK_HOURS_ITEM = eINSTANCE.getCalcTaskHoursItem();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_TASK_HOURS_ITEM__CONCRETE_PARENT = eINSTANCE.getCalcTaskHoursItem_ConcreteParent();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator2calc.impl.CalcTaskHoursVarImpl <em>Calc Task Hours Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.CalcTaskHoursVarImpl
		 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.ToUsePropagatorCalcPackageImpl#getCalcTaskHoursVar()
		 * @generated
		 */
		EClass CALC_TASK_HOURS_VAR = eINSTANCE.getCalcTaskHoursVar();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_TASK_HOURS_VAR__CONCRETE_PARENT = eINSTANCE.getCalcTaskHoursVar_ConcreteParent();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator2calc.impl.CalcTaskHoursImpl <em>Calc Task Hours</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.CalcTaskHoursImpl
		 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.ToUsePropagatorCalcPackageImpl#getCalcTaskHours()
		 * @generated
		 */
		EClass CALC_TASK_HOURS = eINSTANCE.getCalcTaskHours();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_TASK_HOURS__CONCRETE_PARENT = eINSTANCE.getCalcTaskHours_ConcreteParent();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator2calc.impl.CalcTaskStartImpl <em>Calc Task Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.CalcTaskStartImpl
		 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.ToUsePropagatorCalcPackageImpl#getCalcTaskStart()
		 * @generated
		 */
		EClass CALC_TASK_START = eINSTANCE.getCalcTaskStart();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_TASK_START__CONCRETE_PARENT = eINSTANCE.getCalcTaskStart_ConcreteParent();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator2calc.impl.CalcTaskEndImpl <em>Calc Task End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.CalcTaskEndImpl
		 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.ToUsePropagatorCalcPackageImpl#getCalcTaskEnd()
		 * @generated
		 */
		EClass CALC_TASK_END = eINSTANCE.getCalcTaskEnd();

		/**
		 * The meta object literal for the '<em><b>Concrete Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALC_TASK_END__CONCRETE_PARENT = eINSTANCE.getCalcTaskEnd_ConcreteParent();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator2calc.impl.CalcTaskResourcesImpl <em>Calc Task Resources</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.CalcTaskResourcesImpl
		 * @see com.misc.touse.moplaf.tousepropagator2calc.impl.ToUsePropagatorCalcPackageImpl#getCalcTaskResources()
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

	}

} //ToUsePropagatorCalcPackage
