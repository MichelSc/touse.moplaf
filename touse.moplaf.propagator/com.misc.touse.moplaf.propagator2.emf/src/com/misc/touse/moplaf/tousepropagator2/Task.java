/**
 */
package com.misc.touse.moplaf.tousepropagator2;

import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;
import java.util.Date;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.Task#getStart <em>Start</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.Task#getEnd <em>End</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.Task#getHours <em>Hours</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.Task#getHoursItems <em>Hours Items</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.Task#getHoursVar <em>Hours Var</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.Task#getHoursVarPerRes <em>Hours Var Per Res</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.Task#getDependencesAfter <em>Dependences After</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.Task#getDependencesBefore <em>Dependences Before</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.Task#getTaskName <em>Task Name</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.Task#getItems <em>Items</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.Task#getProject <em>Project</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.Task#getResourceCandidates <em>Resource Candidates</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage#getTask()
 * @model
 * @generated
 */                           
public interface Task extends ObjectWithPropagatorFunctions {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * The default value is <code>"2001-01-01"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage#getTask_Start()
	 * @model default="2001-01-01" suppressedSetVisibility="true"
	 * @generated
	 */
	Date getStart();

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * The default value is <code>"2001-01-01"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage#getTask_End()
	 * @model default="2001-01-01" suppressedSetVisibility="true"
	 * @generated
	 */
	Date getEnd();

	/**
	 * Returns the value of the '<em><b>Hours</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hours</em>' attribute.
	 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage#getTask_Hours()
	 * @model default="1.0" suppressedSetVisibility="true"
	 * @generated
	 */
	float getHours();

	/**
	 * Returns the value of the '<em><b>Hours Items</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hours Items</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hours Items</em>' attribute.
	 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage#getTask_HoursItems()
	 * @model default="1.0" suppressedSetVisibility="true"
	 * @generated
	 */
	float getHoursItems();

	/**
	 * Returns the value of the '<em><b>Hours Var</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hours Var</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hours Var</em>' attribute.
	 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage#getTask_HoursVar()
	 * @model default="0.0" suppressedSetVisibility="true"
	 * @generated
	 */
	float getHoursVar();

	/**
	 * Returns the value of the '<em><b>Hours Var Per Res</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hours Var Per Res</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hours Var Per Res</em>' attribute.
	 * @see #setHoursVarPerRes(float)
	 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage#getTask_HoursVarPerRes()
	 * @model default="0.0"
	 * @generated
	 */
	float getHoursVarPerRes();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousepropagator2.Task#getHoursVarPerRes <em>Hours Var Per Res</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hours Var Per Res</em>' attribute.
	 * @see #getHoursVarPerRes()
	 * @generated
	 */
	void setHoursVarPerRes(float value);

	/**
	 * Returns the value of the '<em><b>Dependences After</b></em>' reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.tousepropagator2.Dependence}.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.tousepropagator2.Dependence#getTaskBefore <em>Task Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependences After</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependences After</em>' reference list.
	 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage#getTask_DependencesAfter()
	 * @see com.misc.touse.moplaf.tousepropagator2.Dependence#getTaskBefore
	 * @model opposite="TaskBefore"
	 * @generated
	 */
	EList<Dependence> getDependencesAfter();

	/**
	 * Returns the value of the '<em><b>Dependences Before</b></em>' reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.tousepropagator2.Dependence}.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.tousepropagator2.Dependence#getTaskAfter <em>Task After</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependences Before</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependences Before</em>' reference list.
	 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage#getTask_DependencesBefore()
	 * @see com.misc.touse.moplaf.tousepropagator2.Dependence#getTaskAfter
	 * @model opposite="TaskAfter"
	 * @generated
	 */
	EList<Dependence> getDependencesBefore();

	/**
	 * Returns the value of the '<em><b>Task Name</b></em>' attribute.
	 * The default value is <code>"new task"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Name</em>' attribute.
	 * @see #setTaskName(String)
	 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage#getTask_TaskName()
	 * @model default="new task"
	 * @generated
	 */
	String getTaskName();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousepropagator2.Task#getTaskName <em>Task Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Name</em>' attribute.
	 * @see #getTaskName()
	 * @generated
	 */
	void setTaskName(String value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.tousepropagator2.TaskItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage#getTask_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskItem> getItems();

	/**
	 * Returns the value of the '<em><b>Project</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.tousepropagator2.Project#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' container reference.
	 * @see #setProject(Project)
	 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage#getTask_Project()
	 * @see com.misc.touse.moplaf.tousepropagator2.Project#getTasks
	 * @model opposite="Tasks" required="true" transient="false"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousepropagator2.Task#getProject <em>Project</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' container reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

	/**
	 * Returns the value of the '<em><b>Resource Candidates</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.tousepropagator2.ResourceCandidate}.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.tousepropagator2.ResourceCandidate#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Candidates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Candidates</em>' containment reference list.
	 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage#getTask_ResourceCandidates()
	 * @see com.misc.touse.moplaf.tousepropagator2.ResourceCandidate#getTask
	 * @model opposite="Task" containment="true"
	 * @generated
	 */
	EList<ResourceCandidate> getResourceCandidates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshStart();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshEnd();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshHours();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshHoursItem();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshHoursVar();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshResourceCandidates(Resource resource);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshResourceCandidates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void dispose();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isCandidate(Resource resource);

} // Task
