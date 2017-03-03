/**
 */
package com.misc.touse.moplaf.tousepropagator2;

import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;
import java.util.Date;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.Project#getTasks <em>Tasks</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.Project#getDependences <em>Dependences</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.Project#getNofRes <em>Nof Res</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.Project#getStart <em>Start</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.Project#getEnd <em>End</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.Project#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.Project#getResources <em>Resources</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.Project#isAutomaticRefresh <em>Automatic Refresh</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage#getProject()
 * @model annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Thing'"
 * @generated
 */
public interface Project extends ObjectWithPropagatorFunctions {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.tousepropagator2.Task}.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.tousepropagator2.Task#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage#getProject_Tasks()
	 * @see com.misc.touse.moplaf.tousepropagator2.Task#getProject
	 * @model opposite="Project" containment="true"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Dependences</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.tousepropagator2.Dependence}.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.tousepropagator2.Dependence#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependences</em>' containment reference list.
	 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage#getProject_Dependences()
	 * @see com.misc.touse.moplaf.tousepropagator2.Dependence#getProject
	 * @model opposite="Project" containment="true"
	 * @generated
	 */
	EList<Dependence> getDependences();

	/**
	 * Returns the value of the '<em><b>Nof Res</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nof Res</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nof Res</em>' attribute.
	 * @see #setNofRes(int)
	 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage#getProject_NofRes()
	 * @model default="1" transient="true"
	 * @generated
	 */
	int getNofRes();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousepropagator2.Project#getNofRes <em>Nof Res</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nof Res</em>' attribute.
	 * @see #getNofRes()
	 * @generated
	 */
	void setNofRes(int value);

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
	 * @see #setStart(Date)
	 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage#getProject_Start()
	 * @model default="2001-01-01"
	 * @generated
	 */
	Date getStart();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousepropagator2.Project#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Date value);

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
	 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage#getProject_End()
	 * @model default="2001-01-01" suppressedSetVisibility="true"
	 * @generated
	 */
	Date getEnd();

	/**
	 * Returns the value of the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Name</em>' attribute.
	 * @see #setProjectName(String)
	 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage#getProject_ProjectName()
	 * @model
	 * @generated
	 */
	String getProjectName();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousepropagator2.Project#getProjectName <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Name</em>' attribute.
	 * @see #getProjectName()
	 * @generated
	 */
	void setProjectName(String value);

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.tousepropagator2.Resource}.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.tousepropagator2.Resource#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage#getProject_Resources()
	 * @see com.misc.touse.moplaf.tousepropagator2.Resource#getProject
	 * @model opposite="Project" containment="true"
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * Returns the value of the '<em><b>Automatic Refresh</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Automatic Refresh</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automatic Refresh</em>' attribute.
	 * @see #setAutomaticRefresh(boolean)
	 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage#getProject_AutomaticRefresh()
	 * @model default="true"
	 * @generated
	 */
	boolean isAutomaticRefresh();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousepropagator2.Project#isAutomaticRefresh <em>Automatic Refresh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automatic Refresh</em>' attribute.
	 * @see #isAutomaticRefresh()
	 * @generated
	 */
	void setAutomaticRefresh(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshEnd();

} // Project
