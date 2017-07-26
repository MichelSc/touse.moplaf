/**
 */
package com.misc.touse.moplaf.tousereplica;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.touse.moplaf.tousereplica.ToUseReplicaPackage
 * @generated
 */
public interface ToUseReplicaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToUseReplicaFactory eINSTANCE = com.misc.touse.moplaf.tousereplica.impl.ToUseReplicaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Time Line Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Line Abstract</em>'.
	 * @generated
	 */
	TimeLineAbstract createTimeLineAbstract();

	/**
	 * Returns a new object of class '<em>Time Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Line</em>'.
	 * @generated
	 */
	TimeLine createTimeLine();

	/**
	 * Returns a new object of class '<em>Time Line Bucket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Line Bucket</em>'.
	 * @generated
	 */
	TimeLineBucket createTimeLineBucket();

	/**
	 * Returns a new object of class '<em>RTime Line Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RTime Line Abstract</em>'.
	 * @generated
	 */
	RTimeLineAbstract createRTimeLineAbstract();

	/**
	 * Returns a new object of class '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain</em>'.
	 * @generated
	 */
	Domain createDomain();

	/**
	 * Returns a new object of class '<em>RTime Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RTime Line</em>'.
	 * @generated
	 */
	RTimeLine createRTimeLine();

	/**
	 * Returns a new object of class '<em>RTime Line Bucket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RTime Line Bucket</em>'.
	 * @generated
	 */
	RTimeLineBucket createRTimeLineBucket();

	/**
	 * Returns a new object of class '<em>Time Line Replicator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Line Replicator</em>'.
	 * @generated
	 */
	TimeLineReplicator createTimeLineReplicator();

	/**
	 * Returns a new object of class '<em>Time Line Replicator Bucket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Line Replicator Bucket</em>'.
	 * @generated
	 */
	TimeLineReplicatorBucket createTimeLineReplicatorBucket();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ToUseReplicaPackage getToUseReplicaPackage();

} //ToUseReplicaFactory
