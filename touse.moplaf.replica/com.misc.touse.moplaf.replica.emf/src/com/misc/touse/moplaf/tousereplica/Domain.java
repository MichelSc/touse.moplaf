/**
 */
package com.misc.touse.moplaf.tousereplica;

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
 *   <li>{@link com.misc.touse.moplaf.tousereplica.Domain#getTimeLines <em>Time Lines</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousereplica.Domain#getTimeLineReplicas <em>Time Line Replicas</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousereplica.Domain#getTimeLineReplica2s <em>Time Line Replica2s</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousereplica.ToUseReplicaPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Lines</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.tousereplica.TimeLine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Lines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Lines</em>' containment reference list.
	 * @see com.misc.touse.moplaf.tousereplica.ToUseReplicaPackage#getDomain_TimeLines()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimeLine> getTimeLines();

	/**
	 * Returns the value of the '<em><b>Time Line Replicas</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.tousereplica.RTimeLine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Line Replicas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Line Replicas</em>' containment reference list.
	 * @see com.misc.touse.moplaf.tousereplica.ToUseReplicaPackage#getDomain_TimeLineReplicas()
	 * @model containment="true"
	 * @generated
	 */
	EList<RTimeLine> getTimeLineReplicas();

	/**
	 * Returns the value of the '<em><b>Time Line Replica2s</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.tousereplica.TimeLineReplicator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Line Replica2s</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Line Replica2s</em>' containment reference list.
	 * @see com.misc.touse.moplaf.tousereplica.ToUseReplicaPackage#getDomain_TimeLineReplica2s()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimeLineReplicator> getTimeLineReplica2s();

} // Domain
