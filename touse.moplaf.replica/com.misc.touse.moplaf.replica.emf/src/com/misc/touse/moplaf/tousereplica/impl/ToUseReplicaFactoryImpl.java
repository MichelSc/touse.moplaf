/**
 */
package com.misc.touse.moplaf.tousereplica.impl;

import com.misc.touse.moplaf.tousereplica.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToUseReplicaFactoryImpl extends EFactoryImpl implements ToUseReplicaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ToUseReplicaFactory init() {
		try {
			ToUseReplicaFactory theToUseReplicaFactory = (ToUseReplicaFactory) EPackage.Registry.INSTANCE
					.getEFactory(ToUseReplicaPackage.eNS_URI);
			if (theToUseReplicaFactory != null) {
				return theToUseReplicaFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ToUseReplicaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseReplicaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ToUseReplicaPackage.TIME_LINE_ABSTRACT:
			return createTimeLineAbstract();
		case ToUseReplicaPackage.TIME_LINE:
			return createTimeLine();
		case ToUseReplicaPackage.TIME_LINE_BUCKET:
			return createTimeLineBucket();
		case ToUseReplicaPackage.RTIME_LINE_ABSTRACT:
			return createRTimeLineAbstract();
		case ToUseReplicaPackage.DOMAIN:
			return createDomain();
		case ToUseReplicaPackage.RTIME_LINE:
			return createRTimeLine();
		case ToUseReplicaPackage.RTIME_LINE_BUCKET:
			return createRTimeLineBucket();
		case ToUseReplicaPackage.TIME_LINE_REPLICATOR:
			return createTimeLineReplicator();
		case ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET:
			return createTimeLineReplicatorBucket();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLineAbstract createTimeLineAbstract() {
		TimeLineAbstractImpl timeLineAbstract = new TimeLineAbstractImpl();
		return timeLineAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLine createTimeLine() {
		TimeLineImpl timeLine = new TimeLineImpl();
		return timeLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLineBucket createTimeLineBucket() {
		TimeLineBucketImpl timeLineBucket = new TimeLineBucketImpl();
		return timeLineBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTimeLineAbstract createRTimeLineAbstract() {
		RTimeLineAbstractImpl rTimeLineAbstract = new RTimeLineAbstractImpl();
		return rTimeLineAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain createDomain() {
		DomainImpl domain = new DomainImpl();
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTimeLine createRTimeLine() {
		RTimeLineImpl rTimeLine = new RTimeLineImpl();
		return rTimeLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTimeLineBucket createRTimeLineBucket() {
		RTimeLineBucketImpl rTimeLineBucket = new RTimeLineBucketImpl();
		return rTimeLineBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLineReplicator createTimeLineReplicator() {
		TimeLineReplicatorImpl timeLineReplicator = new TimeLineReplicatorImpl();
		return timeLineReplicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLineReplicatorBucket createTimeLineReplicatorBucket() {
		TimeLineReplicatorBucketImpl timeLineReplicatorBucket = new TimeLineReplicatorBucketImpl();
		return timeLineReplicatorBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseReplicaPackage getToUseReplicaPackage() {
		return (ToUseReplicaPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ToUseReplicaPackage getPackage() {
		return ToUseReplicaPackage.eINSTANCE;
	}

} //ToUseReplicaFactoryImpl
