/**
 */
package com.misc.touse.moplaf.tousepropagator;

import com.misc.common.moplaf.propagator.PropagatorPackage;
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
 * @see com.misc.touse.moplaf.tousepropagator.ToUsePropagatorFactory
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
	String eNAME = "tousepropagator";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.misc.touse.moplaf.propagator.emf";

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
	ToUsePropagatorPackage eINSTANCE = com.misc.touse.moplaf.tousepropagator.impl.ToUsePropagatorPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator.impl.ProjectImpl
	 * @see com.misc.touse.moplaf.tousepropagator.impl.ToUsePropagatorPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__TASKS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dependences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DEPENDENCES = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nof Res</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NOF_RES = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__START = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__END = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROJECT_NAME = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Add Propagator Function Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT___ADD_PROPAGATOR_FUNCTION_ADAPTER = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER___ADD_PROPAGATOR_FUNCTION_ADAPTER;

	/**
	 * The operation id for the '<em>Refresh End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT___REFRESH_END = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT___REFRESH = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator.impl.TaskImpl
	 * @see com.misc.touse.moplaf.tousepropagator.impl.ToUsePropagatorPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__START = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__END = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__HOURS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hours Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__HOURS_ITEMS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Hours Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__HOURS_VAR = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Hours Var Per Res</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__HOURS_VAR_PER_RES = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Dependences After</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DEPENDENCES_AFTER = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Dependences Before</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DEPENDENCES_BEFORE = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Task Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TASK_NAME = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ITEMS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Project</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PROJECT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Add Propagator Function Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___ADD_PROPAGATOR_FUNCTION_ADAPTER = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER___ADD_PROPAGATOR_FUNCTION_ADAPTER;

	/**
	 * The operation id for the '<em>Refresh Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___REFRESH_START = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Refresh End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___REFRESH_END = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Refresh Hours</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___REFRESH_HOURS = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Refresh Hours Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___REFRESH_HOURS_ITEM = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Refresh Hours Var</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___REFRESH_HOURS_VAR = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator.impl.DependenceImpl <em>Dependence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator.impl.DependenceImpl
	 * @see com.misc.touse.moplaf.tousepropagator.impl.ToUsePropagatorPackageImpl#getDependence()
	 * @generated
	 */
	int DEPENDENCE = 2;

	/**
	 * The feature id for the '<em><b>Task Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE__TASK_BEFORE = 0;

	/**
	 * The feature id for the '<em><b>Task After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE__TASK_AFTER = 1;

	/**
	 * The feature id for the '<em><b>Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE__HOURS = 2;

	/**
	 * The feature id for the '<em><b>Project</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE__PROJECT = 3;

	/**
	 * The number of structural features of the '<em>Dependence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Dependence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousepropagator.impl.TaskItemImpl <em>Task Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousepropagator.impl.TaskItemImpl
	 * @see com.misc.touse.moplaf.tousepropagator.impl.ToUsePropagatorPackageImpl#getTaskItem()
	 * @generated
	 */
	int TASK_ITEM = 3;

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
	 * The number of structural features of the '<em>Task Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ITEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Task Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ITEM_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.tousepropagator.Project#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator.Project#getTasks()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Tasks();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.tousepropagator.Project#getDependences <em>Dependences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependences</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator.Project#getDependences()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Dependences();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousepropagator.Project#getNofRes <em>Nof Res</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nof Res</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator.Project#getNofRes()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_NofRes();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousepropagator.Project#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator.Project#getStart()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Start();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousepropagator.Project#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator.Project#getEnd()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_End();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousepropagator.Project#getProjectName <em>Project Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Name</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator.Project#getProjectName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_ProjectName();

	/**
	 * Returns the meta object for the '{@link com.misc.touse.moplaf.tousepropagator.Project#refreshEnd() <em>Refresh End</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh End</em>' operation.
	 * @see com.misc.touse.moplaf.tousepropagator.Project#refreshEnd()
	 * @generated
	 */
	EOperation getProject__RefreshEnd();

	/**
	 * Returns the meta object for the '{@link com.misc.touse.moplaf.tousepropagator.Project#refresh() <em>Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh</em>' operation.
	 * @see com.misc.touse.moplaf.tousepropagator.Project#refresh()
	 * @generated
	 */
	EOperation getProject__Refresh();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousepropagator.Task#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator.Task#getStart()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Start();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousepropagator.Task#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator.Task#getEnd()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_End();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousepropagator.Task#getHours <em>Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hours</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator.Task#getHours()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Hours();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousepropagator.Task#getHoursItems <em>Hours Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hours Items</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator.Task#getHoursItems()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_HoursItems();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousepropagator.Task#getHoursVar <em>Hours Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hours Var</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator.Task#getHoursVar()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_HoursVar();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousepropagator.Task#getHoursVarPerRes <em>Hours Var Per Res</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hours Var Per Res</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator.Task#getHoursVarPerRes()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_HoursVarPerRes();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.touse.moplaf.tousepropagator.Task#getDependencesAfter <em>Dependences After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependences After</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator.Task#getDependencesAfter()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_DependencesAfter();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.touse.moplaf.tousepropagator.Task#getDependencesBefore <em>Dependences Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependences Before</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator.Task#getDependencesBefore()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_DependencesBefore();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousepropagator.Task#getTaskName <em>Task Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task Name</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator.Task#getTaskName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_TaskName();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.tousepropagator.Task#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator.Task#getItems()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Items();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.touse.moplaf.tousepropagator.Task#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Project</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator.Task#getProject()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Project();

	/**
	 * Returns the meta object for the '{@link com.misc.touse.moplaf.tousepropagator.Task#refreshStart() <em>Refresh Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Start</em>' operation.
	 * @see com.misc.touse.moplaf.tousepropagator.Task#refreshStart()
	 * @generated
	 */
	EOperation getTask__RefreshStart();

	/**
	 * Returns the meta object for the '{@link com.misc.touse.moplaf.tousepropagator.Task#refreshEnd() <em>Refresh End</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh End</em>' operation.
	 * @see com.misc.touse.moplaf.tousepropagator.Task#refreshEnd()
	 * @generated
	 */
	EOperation getTask__RefreshEnd();

	/**
	 * Returns the meta object for the '{@link com.misc.touse.moplaf.tousepropagator.Task#refreshHours() <em>Refresh Hours</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Hours</em>' operation.
	 * @see com.misc.touse.moplaf.tousepropagator.Task#refreshHours()
	 * @generated
	 */
	EOperation getTask__RefreshHours();

	/**
	 * Returns the meta object for the '{@link com.misc.touse.moplaf.tousepropagator.Task#refreshHoursItem() <em>Refresh Hours Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Hours Item</em>' operation.
	 * @see com.misc.touse.moplaf.tousepropagator.Task#refreshHoursItem()
	 * @generated
	 */
	EOperation getTask__RefreshHoursItem();

	/**
	 * Returns the meta object for the '{@link com.misc.touse.moplaf.tousepropagator.Task#refreshHoursVar() <em>Refresh Hours Var</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Hours Var</em>' operation.
	 * @see com.misc.touse.moplaf.tousepropagator.Task#refreshHoursVar()
	 * @generated
	 */
	EOperation getTask__RefreshHoursVar();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator.Dependence <em>Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependence</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator.Dependence
	 * @generated
	 */
	EClass getDependence();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator.Dependence#getTaskBefore <em>Task Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task Before</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator.Dependence#getTaskBefore()
	 * @see #getDependence()
	 * @generated
	 */
	EReference getDependence_TaskBefore();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousepropagator.Dependence#getTaskAfter <em>Task After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task After</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator.Dependence#getTaskAfter()
	 * @see #getDependence()
	 * @generated
	 */
	EReference getDependence_TaskAfter();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousepropagator.Dependence#getHours <em>Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hours</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator.Dependence#getHours()
	 * @see #getDependence()
	 * @generated
	 */
	EAttribute getDependence_Hours();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.touse.moplaf.tousepropagator.Dependence#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Project</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator.Dependence#getProject()
	 * @see #getDependence()
	 * @generated
	 */
	EReference getDependence_Project();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousepropagator.TaskItem <em>Task Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Item</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator.TaskItem
	 * @generated
	 */
	EClass getTaskItem();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousepropagator.TaskItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator.TaskItem#getName()
	 * @see #getTaskItem()
	 * @generated
	 */
	EAttribute getTaskItem_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousepropagator.TaskItem#getHours <em>Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hours</em>'.
	 * @see com.misc.touse.moplaf.tousepropagator.TaskItem#getHours()
	 * @see #getTaskItem()
	 * @generated
	 */
	EAttribute getTaskItem_Hours();

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
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator.impl.ProjectImpl
		 * @see com.misc.touse.moplaf.tousepropagator.impl.ToUsePropagatorPackageImpl#getProject()
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
		 * The meta object literal for the '<em><b>Refresh End</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROJECT___REFRESH_END = eINSTANCE.getProject__RefreshEnd();

		/**
		 * The meta object literal for the '<em><b>Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROJECT___REFRESH = eINSTANCE.getProject__Refresh();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator.impl.TaskImpl
		 * @see com.misc.touse.moplaf.tousepropagator.impl.ToUsePropagatorPackageImpl#getTask()
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
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator.impl.DependenceImpl <em>Dependence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator.impl.DependenceImpl
		 * @see com.misc.touse.moplaf.tousepropagator.impl.ToUsePropagatorPackageImpl#getDependence()
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
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousepropagator.impl.TaskItemImpl <em>Task Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousepropagator.impl.TaskItemImpl
		 * @see com.misc.touse.moplaf.tousepropagator.impl.ToUsePropagatorPackageImpl#getTaskItem()
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

	}

} //ToUsePropagatorPackage
