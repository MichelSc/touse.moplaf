/**
 */
package com.misc.touse.moplaf.tousepropagator2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorFactory
 * @model kind="package"
 * @generated
 */
public interface ToUsePropagatorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tousepropagator2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/touse/moplaf/propagator2/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "top";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToUsePropagatorPackage eINSTANCE = com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator2.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator2.impl.ProjectImpl
	 * @see com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 1;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator2.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator2.impl.TaskImpl
	 * @see com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 2;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator2.impl.DependenceImpl <em>Dependence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator2.impl.DependenceImpl
	 * @see com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorPackageImpl#getDependence()
	 * @generated
	 */
	int DEPENDENCE = 3;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator2.impl.TaskItemImpl <em>Task Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator2.impl.TaskItemImpl
	 * @see com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorPackageImpl#getTaskItem()
	 * @generated
	 */
	int TASK_ITEM = 4;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator2.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator2.impl.ResourceImpl
	 * @see com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 5;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator2.impl.ResourceCandidateImpl <em>Resource Candidate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator2.impl.ResourceCandidateImpl
	 * @see com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorPackageImpl#getResourceCandidate()
	 * @generated
	 */
	int RESOURCE_CANDIDATE = 6;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorFunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorFunctionImpl
	 * @see com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorPackageImpl#getToUsePropagatorFunction()
	 * @generated
	 */
	int TO_USE_PROPAGATOR_FUNCTION = 7;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator2.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator2.impl.DomainImpl
	 * @see com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__PROJECTS = 0;

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
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROPAGATOR_FUNCTIONS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__TASKS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dependences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DEPENDENCES = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nof Res</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NOF_RES = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__START = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__END = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROJECT_NAME = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__RESOURCES = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Automatic Refresh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__AUTOMATIC_REFRESH = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>On Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT___ON_OWNED = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS___ON_OWNED;

	/**
	 * The operation id for the '<em>On Not Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT___ON_NOT_OWNED = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS___ON_NOT_OWNED;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT___GET_PROPAGATOR_FUNCTION__OBJECT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS___GET_PROPAGATOR_FUNCTION__OBJECT;

	/**
	 * The operation id for the '<em>Refresh End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT___REFRESH_END = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PROPAGATOR_FUNCTIONS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__START = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__END = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__HOURS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hours Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__HOURS_ITEMS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Hours Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__HOURS_VAR = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Hours Var Per Res</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__HOURS_VAR_PER_RES = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Dependences After</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DEPENDENCES_AFTER = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Dependences Before</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DEPENDENCES_BEFORE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Task Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TASK_NAME = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ITEMS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Project</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PROJECT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Resource Candidates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__RESOURCE_CANDIDATES = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 12;

	/**
	 * The operation id for the '<em>On Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___ON_OWNED = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS___ON_OWNED;

	/**
	 * The operation id for the '<em>On Not Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___ON_NOT_OWNED = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS___ON_NOT_OWNED;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GET_PROPAGATOR_FUNCTION__OBJECT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS___GET_PROPAGATOR_FUNCTION__OBJECT;

	/**
	 * The operation id for the '<em>Refresh Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___REFRESH_START = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Refresh End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___REFRESH_END = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Refresh Hours</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___REFRESH_HOURS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Refresh Hours Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___REFRESH_HOURS_ITEM = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Refresh Hours Var</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___REFRESH_HOURS_VAR = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Refresh Resource Candidates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___REFRESH_RESOURCE_CANDIDATES__RESOURCE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Refresh Resource Candidates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___REFRESH_RESOURCE_CANDIDATES = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___DISPOSE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Is Candidate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___IS_CANDIDATE__RESOURCE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 8;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE__PROPAGATOR_FUNCTIONS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Task Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE__TASK_BEFORE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Task After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE__TASK_AFTER = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE__HOURS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Project</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE__PROJECT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE__NOTES = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE__DESCRIPTION = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Dependence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE_FEATURE_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>On Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE___ON_OWNED = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS___ON_OWNED;

	/**
	 * The operation id for the '<em>On Not Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE___ON_NOT_OWNED = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS___ON_NOT_OWNED;

	/**
	 * The operation id for the '<em>Get Propagator Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE___GET_PROPAGATOR_FUNCTION__OBJECT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS___GET_PROPAGATOR_FUNCTION__OBJECT;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE___DISPOSE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dependence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE_OPERATION_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ITEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ITEM__HOURS = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ITEM__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Task Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ITEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Task Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ITEM_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__START = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__END = 1;

	/**
	 * The feature id for the '<em><b>Project</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__PROJECT = 2;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__RESOURCE_NAME = 3;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CANDIDATE__RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CANDIDATE__MATCH = 1;

	/**
	 * The feature id for the '<em><b>Task</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CANDIDATE__TASK = 2;

	/**
	 * The number of structural features of the '<em>Resource Candidate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CANDIDATE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Resource Candidate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CANDIDATE_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
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
	 * The number of structural features of the '<em>Function</em>' class.
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
	 * The operation id for the '<em>Is Propagator Function Of Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION___IS_PROPAGATOR_FUNCTION_OF_TYPE__OBJECT = PropagatorPackage.PROPAGATOR_FUNCTION___IS_PROPAGATOR_FUNCTION_OF_TYPE__OBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION___GET_SCOPE = PropagatorPackage.PROPAGATOR_FUNCTION___GET_SCOPE;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_OPERATION_COUNT = PropagatorPackage.PROPAGATOR_FUNCTION_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorFunctionTaskImpl <em>Function Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorFunctionTaskImpl
	 * @see com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorPackageImpl#getToUsePropagatorFunctionTask()
	 * @generated
	 */
	int TO_USE_PROPAGATOR_FUNCTION_TASK = 8;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_TASK__PARENT = TO_USE_PROPAGATOR_FUNCTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_TASK__ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_TASK__ANTECEDENTS_SIBLING = TO_USE_PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_TASK__TOUCHED = TO_USE_PROPAGATOR_FUNCTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_TASK__TOUCHED_CHILDREN = TO_USE_PROPAGATOR_FUNCTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_TASK__TOUCHERS = TO_USE_PROPAGATOR_FUNCTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_TASK__ENABLED = TO_USE_PROPAGATOR_FUNCTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_TASK__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TO_USE_PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_TASK__TYPE = TO_USE_PROPAGATOR_FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_TASK__OBJECT = TO_USE_PROPAGATOR_FUNCTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_TASK__INSTANCE = TO_USE_PROPAGATOR_FUNCTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_TASK__DESCRIPTION = TO_USE_PROPAGATOR_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_TASK__CALCULATED = TO_USE_PROPAGATOR_FUNCTION__CALCULATED;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_TASK__TASK = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_TASK_FEATURE_COUNT = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_TASK___ENABLE = TO_USE_PROPAGATOR_FUNCTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_TASK___DISABLE = TO_USE_PROPAGATOR_FUNCTION___DISABLE;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_TASK___TOUCH__EOBJECT = TO_USE_PROPAGATOR_FUNCTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_TASK___REFRESH_ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_TASK___REFRESH_THIS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_TASK___REFRESH_CHILDREN_AND_THIS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_TASK___REFRESH = TO_USE_PROPAGATOR_FUNCTION___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_TASK___DO_GET_PARENT = TO_USE_PROPAGATOR_FUNCTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Get Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_TASK___DO_GET_EXPLICIT_ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION___DO_GET_EXPLICIT_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_TASK___DO_GET_BINDINGS = TO_USE_PROPAGATOR_FUNCTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_TASK___DO_REFRESH = TO_USE_PROPAGATOR_FUNCTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_TASK___DO_REFRESH__EOBJECT = TO_USE_PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Is Propagator Function Of Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_TASK___IS_PROPAGATOR_FUNCTION_OF_TYPE__OBJECT = TO_USE_PROPAGATOR_FUNCTION___IS_PROPAGATOR_FUNCTION_OF_TYPE__OBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_TASK___GET_SCOPE = TO_USE_PROPAGATOR_FUNCTION___GET_SCOPE;

	/**
	 * The number of operations of the '<em>Function Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_TASK_OPERATION_COUNT = TO_USE_PROPAGATOR_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorFunctionProjectImpl <em>Function Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorFunctionProjectImpl
	 * @see com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorPackageImpl#getToUsePropagatorFunctionProject()
	 * @generated
	 */
	int TO_USE_PROPAGATOR_FUNCTION_PROJECT = 9;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_PROJECT__PARENT = TO_USE_PROPAGATOR_FUNCTION__PARENT;

	/**
	 * The feature id for the '<em><b>Antecedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_PROJECT__ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION__ANTECEDENTS;

	/**
	 * The feature id for the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_PROJECT__ANTECEDENTS_SIBLING = TO_USE_PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING;

	/**
	 * The feature id for the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_PROJECT__TOUCHED = TO_USE_PROPAGATOR_FUNCTION__TOUCHED;

	/**
	 * The feature id for the '<em><b>Touched Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_PROJECT__TOUCHED_CHILDREN = TO_USE_PROPAGATOR_FUNCTION__TOUCHED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Touchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_PROJECT__TOUCHERS = TO_USE_PROPAGATOR_FUNCTION__TOUCHERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_PROJECT__ENABLED = TO_USE_PROPAGATOR_FUNCTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_PROJECT__OBJECT_WITH_PROPAGATOR_FUNCTIONS = TO_USE_PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_PROJECT__TYPE = TO_USE_PROPAGATOR_FUNCTION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_PROJECT__OBJECT = TO_USE_PROPAGATOR_FUNCTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_PROJECT__INSTANCE = TO_USE_PROPAGATOR_FUNCTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_PROJECT__DESCRIPTION = TO_USE_PROPAGATOR_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_PROJECT__CALCULATED = TO_USE_PROPAGATOR_FUNCTION__CALCULATED;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_PROJECT__PROJECT = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_PROJECT_FEATURE_COUNT = TO_USE_PROPAGATOR_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_PROJECT___ENABLE = TO_USE_PROPAGATOR_FUNCTION___ENABLE;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_PROJECT___DISABLE = TO_USE_PROPAGATOR_FUNCTION___DISABLE;

	/**
	 * The operation id for the '<em>Touch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_PROJECT___TOUCH__EOBJECT = TO_USE_PROPAGATOR_FUNCTION___TOUCH__EOBJECT;

	/**
	 * The operation id for the '<em>Refresh Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_PROJECT___REFRESH_ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Refresh This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_PROJECT___REFRESH_THIS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_THIS;

	/**
	 * The operation id for the '<em>Refresh Children And This</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_PROJECT___REFRESH_CHILDREN_AND_THIS = TO_USE_PROPAGATOR_FUNCTION___REFRESH_CHILDREN_AND_THIS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_PROJECT___REFRESH = TO_USE_PROPAGATOR_FUNCTION___REFRESH;

	/**
	 * The operation id for the '<em>Do Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_PROJECT___DO_GET_PARENT = TO_USE_PROPAGATOR_FUNCTION___DO_GET_PARENT;

	/**
	 * The operation id for the '<em>Do Get Explicit Antecedents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_PROJECT___DO_GET_EXPLICIT_ANTECEDENTS = TO_USE_PROPAGATOR_FUNCTION___DO_GET_EXPLICIT_ANTECEDENTS;

	/**
	 * The operation id for the '<em>Do Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_PROJECT___DO_GET_BINDINGS = TO_USE_PROPAGATOR_FUNCTION___DO_GET_BINDINGS;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_PROJECT___DO_REFRESH = TO_USE_PROPAGATOR_FUNCTION___DO_REFRESH;

	/**
	 * The operation id for the '<em>Do Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_PROJECT___DO_REFRESH__EOBJECT = TO_USE_PROPAGATOR_FUNCTION___DO_REFRESH__EOBJECT;

	/**
	 * The operation id for the '<em>Is Propagator Function Of Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_PROJECT___IS_PROPAGATOR_FUNCTION_OF_TYPE__OBJECT = TO_USE_PROPAGATOR_FUNCTION___IS_PROPAGATOR_FUNCTION_OF_TYPE__OBJECT;

	/**
	 * The operation id for the '<em>Get Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_PROJECT___GET_SCOPE = TO_USE_PROPAGATOR_FUNCTION___GET_SCOPE;

	/**
	 * The number of operations of the '<em>Function Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_PROPAGATOR_FUNCTION_PROJECT_OPERATION_COUNT = TO_USE_PROPAGATOR_FUNCTION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator2.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.tousepropagator2.Project#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.Project#getTasks()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Tasks();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.tousepropagator2.Project#getDependences <em>Dependences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependences</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.Project#getDependences()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Dependences();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousepropagator2.Project#getNofRes <em>Nof Res</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nof Res</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.Project#getNofRes()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_NofRes();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousepropagator2.Project#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.Project#getStart()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Start();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousepropagator2.Project#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.Project#getEnd()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_End();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousepropagator2.Project#getProjectName <em>Project Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Name</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.Project#getProjectName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_ProjectName();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.tousepropagator2.Project#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.Project#getResources()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Resources();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousepropagator2.Project#isAutomaticRefresh <em>Automatic Refresh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Automatic Refresh</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.Project#isAutomaticRefresh()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_AutomaticRefresh();

	/**
	 * Returns the meta object for the '{@link com.misc.touse.moplaf.tousepropagator2.Project#refreshEnd() <em>Refresh End</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh End</em>' operation.
	 * @see com.misc.touse.moplaf.tousepropagator2.Project#refreshEnd()
	 * @generated
	 */
	EOperation getProject__RefreshEnd();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator2.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousepropagator2.Task#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.Task#getStart()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Start();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousepropagator2.Task#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.Task#getEnd()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_End();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousepropagator2.Task#getHours <em>Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hours</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.Task#getHours()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Hours();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousepropagator2.Task#getHoursItems <em>Hours Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hours Items</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.Task#getHoursItems()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_HoursItems();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousepropagator2.Task#getHoursVar <em>Hours Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hours Var</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.Task#getHoursVar()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_HoursVar();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousepropagator2.Task#getHoursVarPerRes <em>Hours Var Per Res</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hours Var Per Res</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.Task#getHoursVarPerRes()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_HoursVarPerRes();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.touse.moplaf.tousepropagator2.Task#getDependencesAfter <em>Dependences After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependences After</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.Task#getDependencesAfter()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_DependencesAfter();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.touse.moplaf.tousepropagator2.Task#getDependencesBefore <em>Dependences Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependences Before</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.Task#getDependencesBefore()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_DependencesBefore();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousepropagator2.Task#getTaskName <em>Task Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task Name</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.Task#getTaskName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_TaskName();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.tousepropagator2.Task#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.Task#getItems()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Items();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.touse.moplaf.tousepropagator2.Task#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Project</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.Task#getProject()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Project();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.tousepropagator2.Task#getResourceCandidates <em>Resource Candidates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Candidates</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.Task#getResourceCandidates()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_ResourceCandidates();

	/**
	 * Returns the meta object for the '{@link com.misc.touse.moplaf.tousepropagator2.Task#refreshStart() <em>Refresh Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Start</em>' operation.
	 * @see com.misc.touse.moplaf.tousepropagator2.Task#refreshStart()
	 * @generated
	 */
	EOperation getTask__RefreshStart();

	/**
	 * Returns the meta object for the '{@link com.misc.touse.moplaf.tousepropagator2.Task#refreshEnd() <em>Refresh End</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh End</em>' operation.
	 * @see com.misc.touse.moplaf.tousepropagator2.Task#refreshEnd()
	 * @generated
	 */
	EOperation getTask__RefreshEnd();

	/**
	 * Returns the meta object for the '{@link com.misc.touse.moplaf.tousepropagator2.Task#refreshHours() <em>Refresh Hours</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Hours</em>' operation.
	 * @see com.misc.touse.moplaf.tousepropagator2.Task#refreshHours()
	 * @generated
	 */
	EOperation getTask__RefreshHours();

	/**
	 * Returns the meta object for the '{@link com.misc.touse.moplaf.tousepropagator2.Task#refreshHoursItem() <em>Refresh Hours Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Hours Item</em>' operation.
	 * @see com.misc.touse.moplaf.tousepropagator2.Task#refreshHoursItem()
	 * @generated
	 */
	EOperation getTask__RefreshHoursItem();

	/**
	 * Returns the meta object for the '{@link com.misc.touse.moplaf.tousepropagator2.Task#refreshHoursVar() <em>Refresh Hours Var</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Hours Var</em>' operation.
	 * @see com.misc.touse.moplaf.tousepropagator2.Task#refreshHoursVar()
	 * @generated
	 */
	EOperation getTask__RefreshHoursVar();

	/**
	 * Returns the meta object for the '{@link com.misc.touse.moplaf.tousepropagator2.Task#refreshResourceCandidates(com.misc.touse.moplaf.tousepropagator2.Resource) <em>Refresh Resource Candidates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Resource Candidates</em>' operation.
	 * @see com.misc.touse.moplaf.tousepropagator2.Task#refreshResourceCandidates(com.misc.touse.moplaf.tousepropagator2.Resource)
	 * @generated
	 */
	EOperation getTask__RefreshResourceCandidates__Resource();

	/**
	 * Returns the meta object for the '{@link com.misc.touse.moplaf.tousepropagator2.Task#refreshResourceCandidates() <em>Refresh Resource Candidates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Resource Candidates</em>' operation.
	 * @see com.misc.touse.moplaf.tousepropagator2.Task#refreshResourceCandidates()
	 * @generated
	 */
	EOperation getTask__RefreshResourceCandidates();

	/**
	 * Returns the meta object for the '{@link com.misc.touse.moplaf.tousepropagator2.Task#dispose() <em>Dispose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dispose</em>' operation.
	 * @see com.misc.touse.moplaf.tousepropagator2.Task#dispose()
	 * @generated
	 */
	EOperation getTask__Dispose();

	/**
	 * Returns the meta object for the '{@link com.misc.touse.moplaf.tousepropagator2.Task#isCandidate(com.misc.touse.moplaf.tousepropagator2.Resource) <em>Is Candidate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Candidate</em>' operation.
	 * @see com.misc.touse.moplaf.tousepropagator2.Task#isCandidate(com.misc.touse.moplaf.tousepropagator2.Resource)
	 * @generated
	 */
	EOperation getTask__IsCandidate__Resource();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator2.Dependence <em>Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependence</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.Dependence
	 * @generated
	 */
	EClass getDependence();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator2.Dependence#getTaskBefore <em>Task Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task Before</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.Dependence#getTaskBefore()
	 * @see #getDependence()
	 * @generated
	 */
	EReference getDependence_TaskBefore();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator2.Dependence#getTaskAfter <em>Task After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task After</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.Dependence#getTaskAfter()
	 * @see #getDependence()
	 * @generated
	 */
	EReference getDependence_TaskAfter();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousepropagator2.Dependence#getHours <em>Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hours</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.Dependence#getHours()
	 * @see #getDependence()
	 * @generated
	 */
	EAttribute getDependence_Hours();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.touse.moplaf.tousepropagator2.Dependence#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Project</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.Dependence#getProject()
	 * @see #getDependence()
	 * @generated
	 */
	EReference getDependence_Project();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousepropagator2.Dependence#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.Dependence#getNotes()
	 * @see #getDependence()
	 * @generated
	 */
	EAttribute getDependence_Notes();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousepropagator2.Dependence#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.Dependence#getDescription()
	 * @see #getDependence()
	 * @generated
	 */
	EAttribute getDependence_Description();

	/**
	 * Returns the meta object for the '{@link com.misc.touse.moplaf.tousepropagator2.Dependence#dispose() <em>Dispose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dispose</em>' operation.
	 * @see com.misc.touse.moplaf.tousepropagator2.Dependence#dispose()
	 * @generated
	 */
	EOperation getDependence__Dispose();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator2.TaskItem <em>Task Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Item</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.TaskItem
	 * @generated
	 */
	EClass getTaskItem();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousepropagator2.TaskItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.TaskItem#getName()
	 * @see #getTaskItem()
	 * @generated
	 */
	EAttribute getTaskItem_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousepropagator2.TaskItem#getHours <em>Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hours</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.TaskItem#getHours()
	 * @see #getTaskItem()
	 * @generated
	 */
	EAttribute getTaskItem_Hours();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousepropagator2.TaskItem#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.TaskItem#getDescription()
	 * @see #getTaskItem()
	 * @generated
	 */
	EAttribute getTaskItem_Description();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator2.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousepropagator2.Resource#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.Resource#getStart()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Start();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousepropagator2.Resource#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.Resource#getEnd()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_End();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.touse.moplaf.tousepropagator2.Resource#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Project</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.Resource#getProject()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Project();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousepropagator2.Resource#getResourceName <em>Resource Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Name</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.Resource#getResourceName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_ResourceName();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator2.ResourceCandidate <em>Resource Candidate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Candidate</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.ResourceCandidate
	 * @generated
	 */
	EClass getResourceCandidate();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator2.ResourceCandidate#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.ResourceCandidate#getResource()
	 * @see #getResourceCandidate()
	 * @generated
	 */
	EReference getResourceCandidate_Resource();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousepropagator2.ResourceCandidate#getMatch <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Match</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.ResourceCandidate#getMatch()
	 * @see #getResourceCandidate()
	 * @generated
	 */
	EAttribute getResourceCandidate_Match();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.touse.moplaf.tousepropagator2.ResourceCandidate#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Task</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.ResourceCandidate#getTask()
	 * @see #getResourceCandidate()
	 * @generated
	 */
	EReference getResourceCandidate_Task();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorFunction
	 * @generated
	 */
	EClass getToUsePropagatorFunction();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorFunction#isCalculated <em>Calculated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calculated</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorFunction#isCalculated()
	 * @see #getToUsePropagatorFunction()
	 * @generated
	 */
	EAttribute getToUsePropagatorFunction_Calculated();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorFunctionTask <em>Function Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Task</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorFunctionTask
	 * @generated
	 */
	EClass getToUsePropagatorFunctionTask();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorFunctionTask#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorFunctionTask#getTask()
	 * @see #getToUsePropagatorFunctionTask()
	 * @generated
	 */
	EReference getToUsePropagatorFunctionTask_Task();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorFunctionProject <em>Function Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Project</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorFunctionProject
	 * @generated
	 */
	EClass getToUsePropagatorFunctionProject();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorFunctionProject#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Project</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorFunctionProject#getProject()
	 * @see #getToUsePropagatorFunctionProject()
	 * @generated
	 */
	EReference getToUsePropagatorFunctionProject_Project();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator2.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.tousepropagator2.Domain#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Projects</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator2.Domain#getProjects()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Projects();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ToUsePropagatorFactory getToUsePropagatorFactory();

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
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator2.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator2.impl.ProjectImpl
		 * @see com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__TASKS = eINSTANCE.getProject_Tasks();

		/**
		 * The meta object literal for the '<em><b>Dependences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__DEPENDENCES = eINSTANCE.getProject_Dependences();

		/**
		 * The meta object literal for the '<em><b>Nof Res</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NOF_RES = eINSTANCE.getProject_NofRes();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__START = eINSTANCE.getProject_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__END = eINSTANCE.getProject_End();

		/**
		 * The meta object literal for the '<em><b>Project Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__PROJECT_NAME = eINSTANCE.getProject_ProjectName();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__RESOURCES = eINSTANCE.getProject_Resources();

		/**
		 * The meta object literal for the '<em><b>Automatic Refresh</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__AUTOMATIC_REFRESH = eINSTANCE.getProject_AutomaticRefresh();

		/**
		 * The meta object literal for the '<em><b>Refresh End</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROJECT___REFRESH_END = eINSTANCE.getProject__RefreshEnd();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator2.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator2.impl.TaskImpl
		 * @see com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__START = eINSTANCE.getTask_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__END = eINSTANCE.getTask_End();

		/**
		 * The meta object literal for the '<em><b>Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__HOURS = eINSTANCE.getTask_Hours();

		/**
		 * The meta object literal for the '<em><b>Hours Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__HOURS_ITEMS = eINSTANCE.getTask_HoursItems();

		/**
		 * The meta object literal for the '<em><b>Hours Var</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__HOURS_VAR = eINSTANCE.getTask_HoursVar();

		/**
		 * The meta object literal for the '<em><b>Hours Var Per Res</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__HOURS_VAR_PER_RES = eINSTANCE.getTask_HoursVarPerRes();

		/**
		 * The meta object literal for the '<em><b>Dependences After</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__DEPENDENCES_AFTER = eINSTANCE.getTask_DependencesAfter();

		/**
		 * The meta object literal for the '<em><b>Dependences Before</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__DEPENDENCES_BEFORE = eINSTANCE.getTask_DependencesBefore();

		/**
		 * The meta object literal for the '<em><b>Task Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__TASK_NAME = eINSTANCE.getTask_TaskName();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__ITEMS = eINSTANCE.getTask_Items();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__PROJECT = eINSTANCE.getTask_Project();

		/**
		 * The meta object literal for the '<em><b>Resource Candidates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__RESOURCE_CANDIDATES = eINSTANCE.getTask_ResourceCandidates();

		/**
		 * The meta object literal for the '<em><b>Refresh Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___REFRESH_START = eINSTANCE.getTask__RefreshStart();

		/**
		 * The meta object literal for the '<em><b>Refresh End</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___REFRESH_END = eINSTANCE.getTask__RefreshEnd();

		/**
		 * The meta object literal for the '<em><b>Refresh Hours</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___REFRESH_HOURS = eINSTANCE.getTask__RefreshHours();

		/**
		 * The meta object literal for the '<em><b>Refresh Hours Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___REFRESH_HOURS_ITEM = eINSTANCE.getTask__RefreshHoursItem();

		/**
		 * The meta object literal for the '<em><b>Refresh Hours Var</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___REFRESH_HOURS_VAR = eINSTANCE.getTask__RefreshHoursVar();

		/**
		 * The meta object literal for the '<em><b>Refresh Resource Candidates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___REFRESH_RESOURCE_CANDIDATES__RESOURCE = eINSTANCE.getTask__RefreshResourceCandidates__Resource();

		/**
		 * The meta object literal for the '<em><b>Refresh Resource Candidates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___REFRESH_RESOURCE_CANDIDATES = eINSTANCE.getTask__RefreshResourceCandidates();

		/**
		 * The meta object literal for the '<em><b>Dispose</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___DISPOSE = eINSTANCE.getTask__Dispose();

		/**
		 * The meta object literal for the '<em><b>Is Candidate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___IS_CANDIDATE__RESOURCE = eINSTANCE.getTask__IsCandidate__Resource();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator2.impl.DependenceImpl <em>Dependence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator2.impl.DependenceImpl
		 * @see com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorPackageImpl#getDependence()
		 * @generated
		 */
		EClass DEPENDENCE = eINSTANCE.getDependence();

		/**
		 * The meta object literal for the '<em><b>Task Before</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCE__TASK_BEFORE = eINSTANCE.getDependence_TaskBefore();

		/**
		 * The meta object literal for the '<em><b>Task After</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCE__TASK_AFTER = eINSTANCE.getDependence_TaskAfter();

		/**
		 * The meta object literal for the '<em><b>Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCE__HOURS = eINSTANCE.getDependence_Hours();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCE__PROJECT = eINSTANCE.getDependence_Project();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCE__NOTES = eINSTANCE.getDependence_Notes();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCE__DESCRIPTION = eINSTANCE.getDependence_Description();

		/**
		 * The meta object literal for the '<em><b>Dispose</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEPENDENCE___DISPOSE = eINSTANCE.getDependence__Dispose();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator2.impl.TaskItemImpl <em>Task Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator2.impl.TaskItemImpl
		 * @see com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorPackageImpl#getTaskItem()
		 * @generated
		 */
		EClass TASK_ITEM = eINSTANCE.getTaskItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_ITEM__NAME = eINSTANCE.getTaskItem_Name();

		/**
		 * The meta object literal for the '<em><b>Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_ITEM__HOURS = eINSTANCE.getTaskItem_Hours();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_ITEM__DESCRIPTION = eINSTANCE.getTaskItem_Description();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator2.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator2.impl.ResourceImpl
		 * @see com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__START = eINSTANCE.getResource_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__END = eINSTANCE.getResource_End();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__PROJECT = eINSTANCE.getResource_Project();

		/**
		 * The meta object literal for the '<em><b>Resource Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__RESOURCE_NAME = eINSTANCE.getResource_ResourceName();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator2.impl.ResourceCandidateImpl <em>Resource Candidate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator2.impl.ResourceCandidateImpl
		 * @see com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorPackageImpl#getResourceCandidate()
		 * @generated
		 */
		EClass RESOURCE_CANDIDATE = eINSTANCE.getResourceCandidate();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CANDIDATE__RESOURCE = eINSTANCE.getResourceCandidate_Resource();

		/**
		 * The meta object literal for the '<em><b>Match</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_CANDIDATE__MATCH = eINSTANCE.getResourceCandidate_Match();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CANDIDATE__TASK = eINSTANCE.getResourceCandidate_Task();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorFunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorFunctionImpl
		 * @see com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorPackageImpl#getToUsePropagatorFunction()
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
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorFunctionTaskImpl <em>Function Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorFunctionTaskImpl
		 * @see com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorPackageImpl#getToUsePropagatorFunctionTask()
		 * @generated
		 */
		EClass TO_USE_PROPAGATOR_FUNCTION_TASK = eINSTANCE.getToUsePropagatorFunctionTask();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_PROPAGATOR_FUNCTION_TASK__TASK = eINSTANCE.getToUsePropagatorFunctionTask_Task();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorFunctionProjectImpl <em>Function Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorFunctionProjectImpl
		 * @see com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorPackageImpl#getToUsePropagatorFunctionProject()
		 * @generated
		 */
		EClass TO_USE_PROPAGATOR_FUNCTION_PROJECT = eINSTANCE.getToUsePropagatorFunctionProject();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_PROPAGATOR_FUNCTION_PROJECT__PROJECT = eINSTANCE.getToUsePropagatorFunctionProject_Project();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator2.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator2.impl.DomainImpl
		 * @see com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__PROJECTS = eINSTANCE.getDomain_Projects();

	}

} //ToUsePropagatorPackage
