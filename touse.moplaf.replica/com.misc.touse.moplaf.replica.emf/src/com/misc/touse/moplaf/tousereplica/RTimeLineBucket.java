/**
 */
package com.misc.touse.moplaf.tousereplica;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RTime Line Bucket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousereplica.RTimeLineBucket#getNextBucket <em>Next Bucket</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousereplica.RTimeLineBucket#getPreviousBucket <em>Previous Bucket</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousereplica.ToUseReplicaPackage#getRTimeLineBucket()
 * @model
 * @generated
 */
public interface RTimeLineBucket extends RTimeLineAbstract {
	/**
	 * Returns the value of the '<em><b>Next Bucket</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.tousereplica.RTimeLineBucket#getPreviousBucket <em>Previous Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Bucket</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Bucket</em>' reference.
	 * @see #setNextBucket(RTimeLineBucket)
	 * @see com.misc.touse.moplaf.tousereplica.ToUseReplicaPackage#getRTimeLineBucket_NextBucket()
	 * @see com.misc.touse.moplaf.tousereplica.RTimeLineBucket#getPreviousBucket
	 * @model opposite="PreviousBucket"
	 * @generated
	 */
	RTimeLineBucket getNextBucket();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousereplica.RTimeLineBucket#getNextBucket <em>Next Bucket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Bucket</em>' reference.
	 * @see #getNextBucket()
	 * @generated
	 */
	void setNextBucket(RTimeLineBucket value);

	/**
	 * Returns the value of the '<em><b>Previous Bucket</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.tousereplica.RTimeLineBucket#getNextBucket <em>Next Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Bucket</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Bucket</em>' reference.
	 * @see #setPreviousBucket(RTimeLineBucket)
	 * @see com.misc.touse.moplaf.tousereplica.ToUseReplicaPackage#getRTimeLineBucket_PreviousBucket()
	 * @see com.misc.touse.moplaf.tousereplica.RTimeLineBucket#getNextBucket
	 * @model opposite="NextBucket"
	 * @generated
	 */
	RTimeLineBucket getPreviousBucket();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousereplica.RTimeLineBucket#getPreviousBucket <em>Previous Bucket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Bucket</em>' reference.
	 * @see #getPreviousBucket()
	 * @generated
	 */
	void setPreviousBucket(RTimeLineBucket value);

} // RTimeLineBucket
