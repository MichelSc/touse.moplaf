/**
 */
package com.misc.touse.moplaf.tousereplica;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousereplica.TimeLine#getBuckets <em>Buckets</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousereplica.TimeLine#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.tousereplica.ToUseReplicaPackage#getTimeLine()
 * @model
 * @generated
 */
public interface TimeLine extends TimeLineAbstract {

	/**
	 * Returns the value of the '<em><b>Buckets</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.tousereplica.TimeLineBucket}.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.tousereplica.TimeLineBucket#getTimeLine <em>Time Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buckets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buckets</em>' containment reference list.
	 * @see com.misc.touse.moplaf.tousereplica.ToUseReplicaPackage#getTimeLine_Buckets()
	 * @see com.misc.touse.moplaf.tousereplica.TimeLineBucket#getTimeLine
	 * @model opposite="TimeLine" containment="true"
	 * @generated
	 */
	EList<TimeLineBucket> getBuckets();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see com.misc.touse.moplaf.tousereplica.ToUseReplicaPackage#getTimeLine_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousereplica.TimeLine#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);
} // TimeLine
