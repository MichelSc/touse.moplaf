/**
 */
package com.misc.touse.moplaf.tousereplica;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Line Bucket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousereplica.TimeLineBucket#getTimeLine <em>Time Line</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousereplica.TimeLineBucket#getPreviousBucket <em>Previous Bucket</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousereplica.TimeLineBucket#getNextBucket <em>Next Bucket</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousereplica.TimeLineBucket#getBucketNr <em>Bucket Nr</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousereplica.ToUseReplicaPackage#getTimeLineBucket()
 * @model
 * @generated
 */
public interface TimeLineBucket extends TimeLineAbstract {

	/**
	 * Returns the value of the '<em><b>Time Line</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.tousereplica.TimeLine#getBuckets <em>Buckets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Line</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Line</em>' container reference.
	 * @see #setTimeLine(TimeLine)
	 * @see com.misc.touse.moplaf.tousereplica.ToUseReplicaPackage#getTimeLineBucket_TimeLine()
	 * @see com.misc.touse.moplaf.tousereplica.TimeLine#getBuckets
	 * @model opposite="Buckets" required="true" transient="false"
	 * @generated
	 */
	TimeLine getTimeLine();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousereplica.TimeLineBucket#getTimeLine <em>Time Line</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Line</em>' container reference.
	 * @see #getTimeLine()
	 * @generated
	 */
	void setTimeLine(TimeLine value);

	/**
	 * Returns the value of the '<em><b>Previous Bucket</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.tousereplica.TimeLineBucket#getNextBucket <em>Next Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Bucket</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Bucket</em>' reference.
	 * @see #setPreviousBucket(TimeLineBucket)
	 * @see com.misc.touse.moplaf.tousereplica.ToUseReplicaPackage#getTimeLineBucket_PreviousBucket()
	 * @see com.misc.touse.moplaf.tousereplica.TimeLineBucket#getNextBucket
	 * @model opposite="NextBucket"
	 * @generated
	 */
	TimeLineBucket getPreviousBucket();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousereplica.TimeLineBucket#getPreviousBucket <em>Previous Bucket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Bucket</em>' reference.
	 * @see #getPreviousBucket()
	 * @generated
	 */
	void setPreviousBucket(TimeLineBucket value);

	/**
	 * Returns the value of the '<em><b>Next Bucket</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.tousereplica.TimeLineBucket#getPreviousBucket <em>Previous Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Bucket</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Bucket</em>' reference.
	 * @see #setNextBucket(TimeLineBucket)
	 * @see com.misc.touse.moplaf.tousereplica.ToUseReplicaPackage#getTimeLineBucket_NextBucket()
	 * @see com.misc.touse.moplaf.tousereplica.TimeLineBucket#getPreviousBucket
	 * @model opposite="PreviousBucket"
	 * @generated
	 */
	TimeLineBucket getNextBucket();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousereplica.TimeLineBucket#getNextBucket <em>Next Bucket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Bucket</em>' reference.
	 * @see #getNextBucket()
	 * @generated
	 */
	void setNextBucket(TimeLineBucket value);

	/**
	 * Returns the value of the '<em><b>Bucket Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bucket Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bucket Nr</em>' attribute.
	 * @see #setBucketNr(int)
	 * @see com.misc.touse.moplaf.tousereplica.ToUseReplicaPackage#getTimeLineBucket_BucketNr()
	 * @model
	 * @generated
	 */
	int getBucketNr();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousereplica.TimeLineBucket#getBucketNr <em>Bucket Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bucket Nr</em>' attribute.
	 * @see #getBucketNr()
	 * @generated
	 */
	void setBucketNr(int value);
} // TimeLineBucket
