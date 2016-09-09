/**
 */
package com.misc.touse.moplaf.tousepropagator2;

import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.Dependence#getTaskBefore <em>Task Before</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.Dependence#getTaskAfter <em>Task After</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.Dependence#getHours <em>Hours</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.Dependence#getProject <em>Project</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.Dependence#getNotes <em>Notes</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.Dependence#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage#getDependence()
 * @model
 * @generated
 */
public interface Dependence extends ObjectWithPropagatorFunctions {
	/**
	 * Returns the value of the '<em><b>Task Before</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.tousepropagator2.Task#getDependencesAfter <em>Dependences After</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Before</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Before</em>' reference.
	 * @see #setTaskBefore(Task)
	 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage#getDependence_TaskBefore()
	 * @see com.misc.touse.moplaf.tousepropagator2.Task#getDependencesAfter
	 * @model opposite="DependencesAfter" required="true"
	 * @generated
	 */
	Task getTaskBefore();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousepropagator2.Dependence#getTaskBefore <em>Task Before</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Before</em>' reference.
	 * @see #getTaskBefore()
	 * @generated
	 */
	void setTaskBefore(Task value);

	/**
	 * Returns the value of the '<em><b>Task After</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.tousepropagator2.Task#getDependencesBefore <em>Dependences Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task After</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task After</em>' reference.
	 * @see #setTaskAfter(Task)
	 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage#getDependence_TaskAfter()
	 * @see com.misc.touse.moplaf.tousepropagator2.Task#getDependencesBefore
	 * @model opposite="DependencesBefore" required="true"
	 * @generated
	 */
	Task getTaskAfter();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousepropagator2.Dependence#getTaskAfter <em>Task After</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task After</em>' reference.
	 * @see #getTaskAfter()
	 * @generated
	 */
	void setTaskAfter(Task value);

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
	 * @see #setHours(float)
	 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage#getDependence_Hours()
	 * @model default="1.0"
	 * @generated
	 */
	float getHours();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousepropagator2.Dependence#getHours <em>Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hours</em>' attribute.
	 * @see #getHours()
	 * @generated
	 */
	void setHours(float value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.tousepropagator2.Project#getDependences <em>Dependences</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' container reference.
	 * @see #setProject(Project)
	 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage#getDependence_Project()
	 * @see com.misc.touse.moplaf.tousepropagator2.Project#getDependences
	 * @model opposite="Dependences" required="true" transient="false"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousepropagator2.Dependence#getProject <em>Project</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' container reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' attribute.
	 * @see #setNotes(String)
	 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage#getDependence_Notes()
	 * @model
	 * @generated
	 */
	String getNotes();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousepropagator2.Dependence#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage#getDependence_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void dispose();

} // Dependence
