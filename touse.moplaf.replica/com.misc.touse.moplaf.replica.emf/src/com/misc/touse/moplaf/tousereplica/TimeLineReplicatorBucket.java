/**
 */
package com.misc.touse.moplaf.tousereplica;

import com.misc.common.moplaf.replica.ReplicatorReplica;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Line Replicator Bucket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousereplica.TimeLineReplicatorBucket#getNext <em>Next</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousereplica.TimeLineReplicatorBucket#getPrevious <em>Previous</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousereplica.TimeLineReplicatorBucket#getBucket <em>Bucket</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousereplica.TimeLineReplicatorBucket#getTimeLine <em>Time Line</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousereplica.TimeLineReplicatorBucket#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousereplica.ToUseReplicaPackage#getTimeLineReplicatorBucket()
 * @model
 * @generated
 */
public interface TimeLineReplicatorBucket extends ReplicatorReplica {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.tousereplica.TimeLineReplicatorBucket#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(TimeLineReplicatorBucket)
	 * @see com.misc.touse.moplaf.tousereplica.ToUseReplicaPackage#getTimeLineReplicatorBucket_Next()
	 * @see com.misc.touse.moplaf.tousereplica.TimeLineReplicatorBucket#getPrevious
	 * @model opposite="Previous"
	 * @generated
	 */
	TimeLineReplicatorBucket getNext();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousereplica.TimeLineReplicatorBucket#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(TimeLineReplicatorBucket value);

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.tousereplica.TimeLineReplicatorBucket#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference.
	 * @see #setPrevious(TimeLineReplicatorBucket)
	 * @see com.misc.touse.moplaf.tousereplica.ToUseReplicaPackage#getTimeLineReplicatorBucket_Previous()
	 * @see com.misc.touse.moplaf.tousereplica.TimeLineReplicatorBucket#getNext
	 * @model opposite="Next"
	 * @generated
	 */
	TimeLineReplicatorBucket getPrevious();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousereplica.TimeLineReplicatorBucket#getPrevious <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(TimeLineReplicatorBucket value);

	/**
	 * Returns the value of the '<em><b>Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bucket</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bucket</em>' reference.
	 * @see #setBucket(TimeLineBucket)
	 * @see com.misc.touse.moplaf.tousereplica.ToUseReplicaPackage#getTimeLineReplicatorBucket_Bucket()
	 * @model required="true"
	 * @generated
	 */
	TimeLineBucket getBucket();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousereplica.TimeLineReplicatorBucket#getBucket <em>Bucket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bucket</em>' reference.
	 * @see #getBucket()
	 * @generated
	 */
	void setBucket(TimeLineBucket value);

	/**
	 * Returns the value of the '<em><b>Time Line</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.tousereplica.TimeLineReplicator#getBuckets <em>Buckets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Line</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Line</em>' reference.
	 * @see #setTimeLine(TimeLineReplicator)
	 * @see com.misc.touse.moplaf.tousereplica.ToUseReplicaPackage#getTimeLineReplicatorBucket_TimeLine()
	 * @see com.misc.touse.moplaf.tousereplica.TimeLineReplicator#getBuckets
	 * @model opposite="Buckets" required="true"
	 * @generated
	 */
	TimeLineReplicator getTimeLine();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousereplica.TimeLineReplicatorBucket#getTimeLine <em>Time Line</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Line</em>' reference.
	 * @see #getTimeLine()
	 * @generated
	 */
	void setTimeLine(TimeLineReplicator value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.touse.moplaf.tousereplica.ToUseReplicaPackage#getTimeLineReplicatorBucket_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

} // TimeLineReplicatorBucket
