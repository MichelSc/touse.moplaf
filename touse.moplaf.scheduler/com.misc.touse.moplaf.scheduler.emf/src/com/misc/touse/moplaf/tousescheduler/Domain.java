/**
 */
package com.misc.touse.moplaf.tousescheduler;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.Domain#getSchedulers <em>Schedulers</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.Domain#getResources <em>Resources</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.Domain#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>Schedulers</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.tousescheduler.ToUseScheduler}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedulers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedulers</em>' containment reference list.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getDomain_Schedulers()
	 * @model containment="true"
	 * @generated
	 */
	EList<ToUseScheduler> getSchedulers();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.tousescheduler.ToUseResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getDomain_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<ToUseResource> getResources();

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.tousescheduler.ToUseTask}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage#getDomain_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<ToUseTask> getTasks();

} // Domain
