/**
 */
package com.misc.touse.moplaf.tousereplica;

import com.misc.common.moplaf.replica.Replicator;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Line Replicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousereplica.TimeLineReplicator#getTimeLine <em>Time Line</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousereplica.TimeLineReplicator#getBuckets <em>Buckets</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousereplica.ToUseReplicaPackage#getTimeLineReplicator()
 * @model
 * @generated
 */
public interface TimeLineReplicator extends Replicator {
	/**
	 * Returns the value of the '<em><b>Time Line</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Line</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Line</em>' reference.
	 * @see #setTimeLine(TimeLine)
	 * @see com.misc.touse.moplaf.tousereplica.ToUseReplicaPackage#getTimeLineReplicator_TimeLine()
	 * @model required="true"
	 * @generated
	 */
	TimeLine getTimeLine();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousereplica.TimeLineReplicator#getTimeLine <em>Time Line</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Line</em>' reference.
	 * @see #getTimeLine()
	 * @generated
	 */
	void setTimeLine(TimeLine value);

	/**
	 * Returns the value of the '<em><b>Buckets</b></em>' reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.tousereplica.TimeLineReplicatorBucket}.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.tousereplica.TimeLineReplicatorBucket#getTimeLine <em>Time Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buckets</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buckets</em>' reference list.
	 * @see com.misc.touse.moplaf.tousereplica.ToUseReplicaPackage#getTimeLineReplicator_Buckets()
	 * @see com.misc.touse.moplaf.tousereplica.TimeLineReplicatorBucket#getTimeLine
	 * @model opposite="TimeLine"
	 * @generated
	 */
	EList<TimeLineReplicatorBucket> getBuckets();

} // TimeLineReplicator
