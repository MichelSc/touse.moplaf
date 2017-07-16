/**
 */
package com.misc.touse.moplaf.tousereplica.impl;

import com.misc.common.moplaf.replica.ReplicaPackage;

import com.misc.touse.moplaf.tousereplica.Domain;
import com.misc.touse.moplaf.tousereplica.RTimeLine;
import com.misc.touse.moplaf.tousereplica.RTimeLineAbstract;
import com.misc.touse.moplaf.tousereplica.RTimeLineBucket;
import com.misc.touse.moplaf.tousereplica.TimeLine;
import com.misc.touse.moplaf.tousereplica.TimeLineAbstract;
import com.misc.touse.moplaf.tousereplica.TimeLineBucket;
import com.misc.touse.moplaf.tousereplica.TimeLineReplicator;
import com.misc.touse.moplaf.tousereplica.TimeLineReplicatorBucket;
import com.misc.touse.moplaf.tousereplica.ToUseReplicaFactory;
import com.misc.touse.moplaf.tousereplica.ToUseReplicaPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToUseReplicaPackageImpl extends EPackageImpl implements ToUseReplicaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeLineAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeLineBucketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rTimeLineAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rTimeLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rTimeLineBucketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeLineReplicatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeLineReplicatorBucketEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.misc.touse.moplaf.tousereplica.ToUseReplicaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ToUseReplicaPackageImpl() {
		super(eNS_URI, ToUseReplicaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ToUseReplicaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ToUseReplicaPackage init() {
		if (isInited)
			return (ToUseReplicaPackage) EPackage.Registry.INSTANCE.getEPackage(ToUseReplicaPackage.eNS_URI);

		// Obtain or create and register package
		ToUseReplicaPackageImpl theToUseReplicaPackage = (ToUseReplicaPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ToUseReplicaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new ToUseReplicaPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ReplicaPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theToUseReplicaPackage.createPackageContents();

		// Initialize created meta-data
		theToUseReplicaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theToUseReplicaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ToUseReplicaPackage.eNS_URI, theToUseReplicaPackage);
		return theToUseReplicaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeLineAbstract() {
		return timeLineAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeLineAbstract_Description() {
		return (EAttribute) timeLineAbstractEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeLine() {
		return timeLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeLine_Buckets() {
		return (EReference) timeLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeLine_Code() {
		return (EAttribute) timeLineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeLineBucket() {
		return timeLineBucketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeLineBucket_TimeLine() {
		return (EReference) timeLineBucketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeLineBucket_PreviousBucket() {
		return (EReference) timeLineBucketEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeLineBucket_NextBucket() {
		return (EReference) timeLineBucketEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeLineBucket_BucketNr() {
		return (EAttribute) timeLineBucketEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRTimeLineAbstract() {
		return rTimeLineAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_TimeLines() {
		return (EReference) domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_TimeLineReplicas() {
		return (EReference) domainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_TimeLineReplica2s() {
		return (EReference) domainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRTimeLine() {
		return rTimeLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRTimeLineBucket() {
		return rTimeLineBucketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRTimeLineBucket_NextBucket() {
		return (EReference) rTimeLineBucketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRTimeLineBucket_PreviousBucket() {
		return (EReference) rTimeLineBucketEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeLineReplicator() {
		return timeLineReplicatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeLineReplicator_TimeLine() {
		return (EReference) timeLineReplicatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeLineReplicator_Buckets() {
		return (EReference) timeLineReplicatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeLineReplicatorBucket() {
		return timeLineReplicatorBucketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeLineReplicatorBucket_Next() {
		return (EReference) timeLineReplicatorBucketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeLineReplicatorBucket_Previous() {
		return (EReference) timeLineReplicatorBucketEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeLineReplicatorBucket_Bucket() {
		return (EReference) timeLineReplicatorBucketEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeLineReplicatorBucket_TimeLine() {
		return (EReference) timeLineReplicatorBucketEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeLineReplicatorBucket_Description() {
		return (EAttribute) timeLineReplicatorBucketEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseReplicaFactory getToUseReplicaFactory() {
		return (ToUseReplicaFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		timeLineAbstractEClass = createEClass(TIME_LINE_ABSTRACT);
		createEAttribute(timeLineAbstractEClass, TIME_LINE_ABSTRACT__DESCRIPTION);

		timeLineEClass = createEClass(TIME_LINE);
		createEReference(timeLineEClass, TIME_LINE__BUCKETS);
		createEAttribute(timeLineEClass, TIME_LINE__CODE);

		timeLineBucketEClass = createEClass(TIME_LINE_BUCKET);
		createEReference(timeLineBucketEClass, TIME_LINE_BUCKET__TIME_LINE);
		createEReference(timeLineBucketEClass, TIME_LINE_BUCKET__PREVIOUS_BUCKET);
		createEReference(timeLineBucketEClass, TIME_LINE_BUCKET__NEXT_BUCKET);
		createEAttribute(timeLineBucketEClass, TIME_LINE_BUCKET__BUCKET_NR);

		rTimeLineAbstractEClass = createEClass(RTIME_LINE_ABSTRACT);

		domainEClass = createEClass(DOMAIN);
		createEReference(domainEClass, DOMAIN__TIME_LINES);
		createEReference(domainEClass, DOMAIN__TIME_LINE_REPLICAS);
		createEReference(domainEClass, DOMAIN__TIME_LINE_REPLICA2S);

		rTimeLineEClass = createEClass(RTIME_LINE);

		rTimeLineBucketEClass = createEClass(RTIME_LINE_BUCKET);
		createEReference(rTimeLineBucketEClass, RTIME_LINE_BUCKET__NEXT_BUCKET);
		createEReference(rTimeLineBucketEClass, RTIME_LINE_BUCKET__PREVIOUS_BUCKET);

		timeLineReplicatorEClass = createEClass(TIME_LINE_REPLICATOR);
		createEReference(timeLineReplicatorEClass, TIME_LINE_REPLICATOR__TIME_LINE);
		createEReference(timeLineReplicatorEClass, TIME_LINE_REPLICATOR__BUCKETS);

		timeLineReplicatorBucketEClass = createEClass(TIME_LINE_REPLICATOR_BUCKET);
		createEReference(timeLineReplicatorBucketEClass, TIME_LINE_REPLICATOR_BUCKET__NEXT);
		createEReference(timeLineReplicatorBucketEClass, TIME_LINE_REPLICATOR_BUCKET__PREVIOUS);
		createEReference(timeLineReplicatorBucketEClass, TIME_LINE_REPLICATOR_BUCKET__BUCKET);
		createEReference(timeLineReplicatorBucketEClass, TIME_LINE_REPLICATOR_BUCKET__TIME_LINE);
		createEAttribute(timeLineReplicatorBucketEClass, TIME_LINE_REPLICATOR_BUCKET__DESCRIPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ReplicaPackage theReplicaPackage = (ReplicaPackage) EPackage.Registry.INSTANCE
				.getEPackage(ReplicaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		timeLineEClass.getESuperTypes().add(this.getTimeLineAbstract());
		timeLineBucketEClass.getESuperTypes().add(this.getTimeLineAbstract());
		rTimeLineAbstractEClass.getESuperTypes().add(theReplicaPackage.getReplica());
		rTimeLineEClass.getESuperTypes().add(this.getRTimeLineAbstract());
		rTimeLineBucketEClass.getESuperTypes().add(this.getRTimeLineAbstract());
		timeLineReplicatorEClass.getESuperTypes().add(theReplicaPackage.getReplicator());
		timeLineReplicatorBucketEClass.getESuperTypes().add(theReplicaPackage.getReplicatorReplica());

		// Initialize classes, features, and operations; add parameters
		initEClass(timeLineAbstractEClass, TimeLineAbstract.class, "TimeLineAbstract", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeLineAbstract_Description(), ecorePackage.getEString(), "Description", null, 0, 1,
				TimeLineAbstract.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				IS_DERIVED, IS_ORDERED);

		initEClass(timeLineEClass, TimeLine.class, "TimeLine", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeLine_Buckets(), this.getTimeLineBucket(), this.getTimeLineBucket_TimeLine(), "Buckets",
				null, 0, -1, TimeLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeLine_Code(), ecorePackage.getEString(), "Code", null, 0, 1, TimeLine.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeLineBucketEClass, TimeLineBucket.class, "TimeLineBucket", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeLineBucket_TimeLine(), this.getTimeLine(), this.getTimeLine_Buckets(), "TimeLine", null,
				1, 1, TimeLineBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeLineBucket_PreviousBucket(), this.getTimeLineBucket(),
				this.getTimeLineBucket_NextBucket(), "PreviousBucket", null, 0, 1, TimeLineBucket.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getTimeLineBucket_NextBucket(), this.getTimeLineBucket(),
				this.getTimeLineBucket_PreviousBucket(), "NextBucket", null, 0, 1, TimeLineBucket.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTimeLineBucket_BucketNr(), ecorePackage.getEInt(), "BucketNr", null, 0, 1,
				TimeLineBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(rTimeLineAbstractEClass, RTimeLineAbstract.class, "RTimeLineAbstract", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomain_TimeLines(), this.getTimeLine(), null, "TimeLines", null, 0, -1, Domain.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_TimeLineReplicas(), this.getRTimeLine(), null, "TimeLineReplicas", null, 0, -1,
				Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_TimeLineReplica2s(), this.getTimeLineReplicator(), null, "TimeLineReplica2s", null, 0,
				-1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rTimeLineEClass, RTimeLine.class, "RTimeLine", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(rTimeLineBucketEClass, RTimeLineBucket.class, "RTimeLineBucket", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRTimeLineBucket_NextBucket(), this.getRTimeLineBucket(),
				this.getRTimeLineBucket_PreviousBucket(), "NextBucket", null, 0, 1, RTimeLineBucket.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRTimeLineBucket_PreviousBucket(), this.getRTimeLineBucket(),
				this.getRTimeLineBucket_NextBucket(), "PreviousBucket", null, 0, 1, RTimeLineBucket.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeLineReplicatorEClass, TimeLineReplicator.class, "TimeLineReplicator", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeLineReplicator_TimeLine(), this.getTimeLine(), null, "TimeLine", null, 1, 1,
				TimeLineReplicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeLineReplicator_Buckets(), this.getTimeLineReplicatorBucket(),
				this.getTimeLineReplicatorBucket_TimeLine(), "Buckets", null, 0, -1, TimeLineReplicator.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeLineReplicatorBucketEClass, TimeLineReplicatorBucket.class, "TimeLineReplicatorBucket",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeLineReplicatorBucket_Next(), this.getTimeLineReplicatorBucket(),
				this.getTimeLineReplicatorBucket_Previous(), "Next", null, 0, 1, TimeLineReplicatorBucket.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeLineReplicatorBucket_Previous(), this.getTimeLineReplicatorBucket(),
				this.getTimeLineReplicatorBucket_Next(), "Previous", null, 0, 1, TimeLineReplicatorBucket.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeLineReplicatorBucket_Bucket(), this.getTimeLineBucket(), null, "Bucket", null, 1, 1,
				TimeLineReplicatorBucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeLineReplicatorBucket_TimeLine(), this.getTimeLineReplicator(),
				this.getTimeLineReplicator_Buckets(), "TimeLine", null, 1, 1, TimeLineReplicatorBucket.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeLineReplicatorBucket_Description(), ecorePackage.getEString(), "Description", null, 0, 1,
				TimeLineReplicatorBucket.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ToUseReplicaPackageImpl
