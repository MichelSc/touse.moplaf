/**
 */
package com.misc.touse.moplaf.tousereplica;

import com.misc.common.moplaf.replica.ReplicaPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.misc.touse.moplaf.tousereplica.ToUseReplicaFactory
 * @model kind="package"
 * @generated
 */
public interface ToUseReplicaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tousereplica";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/touse/moplaf/replica/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tousereplica";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToUseReplicaPackage eINSTANCE = com.misc.touse.moplaf.tousereplica.impl.ToUseReplicaPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousereplica.impl.TimeLineAbstractImpl <em>Time Line Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousereplica.impl.TimeLineAbstractImpl
	 * @see com.misc.touse.moplaf.tousereplica.impl.ToUseReplicaPackageImpl#getTimeLineAbstract()
	 * @generated
	 */
	int TIME_LINE_ABSTRACT = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_ABSTRACT__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Time Line Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_ABSTRACT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Time Line Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousereplica.impl.TimeLineImpl <em>Time Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousereplica.impl.TimeLineImpl
	 * @see com.misc.touse.moplaf.tousereplica.impl.ToUseReplicaPackageImpl#getTimeLine()
	 * @generated
	 */
	int TIME_LINE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE__DESCRIPTION = TIME_LINE_ABSTRACT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Buckets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE__BUCKETS = TIME_LINE_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE__CODE = TIME_LINE_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Time Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_FEATURE_COUNT = TIME_LINE_ABSTRACT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Time Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_OPERATION_COUNT = TIME_LINE_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousereplica.impl.TimeLineBucketImpl <em>Time Line Bucket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousereplica.impl.TimeLineBucketImpl
	 * @see com.misc.touse.moplaf.tousereplica.impl.ToUseReplicaPackageImpl#getTimeLineBucket()
	 * @generated
	 */
	int TIME_LINE_BUCKET = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_BUCKET__DESCRIPTION = TIME_LINE_ABSTRACT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Time Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_BUCKET__TIME_LINE = TIME_LINE_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Previous Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_BUCKET__PREVIOUS_BUCKET = TIME_LINE_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Next Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_BUCKET__NEXT_BUCKET = TIME_LINE_ABSTRACT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bucket Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_BUCKET__BUCKET_NR = TIME_LINE_ABSTRACT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Time Line Bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_BUCKET_FEATURE_COUNT = TIME_LINE_ABSTRACT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Time Line Bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_BUCKET_OPERATION_COUNT = TIME_LINE_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousereplica.impl.RTimeLineAbstractImpl <em>RTime Line Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousereplica.impl.RTimeLineAbstractImpl
	 * @see com.misc.touse.moplaf.tousereplica.impl.ToUseReplicaPackageImpl#getRTimeLineAbstract()
	 * @generated
	 */
	int RTIME_LINE_ABSTRACT = 3;

	/**
	 * The feature id for the '<em><b>Exemplar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTIME_LINE_ABSTRACT__EXEMPLAR = ReplicaPackage.REPLICA__EXEMPLAR;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTIME_LINE_ABSTRACT__ELEMENTS = ReplicaPackage.REPLICA__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTIME_LINE_ABSTRACT__CONTAINER = ReplicaPackage.REPLICA__CONTAINER;

	/**
	 * The number of structural features of the '<em>RTime Line Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTIME_LINE_ABSTRACT_FEATURE_COUNT = ReplicaPackage.REPLICA_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Exemplar Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTIME_LINE_ABSTRACT___GET_EXEMPLAR_ELEMENTS = ReplicaPackage.REPLICA___GET_EXEMPLAR_ELEMENTS;

	/**
	 * The operation id for the '<em>Construct Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTIME_LINE_ABSTRACT___CONSTRUCT_ELEMENT__EOBJECT = ReplicaPackage.REPLICA___CONSTRUCT_ELEMENT__EOBJECT;

	/**
	 * The operation id for the '<em>Refresh Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTIME_LINE_ABSTRACT___REFRESH_ELEMENTS = ReplicaPackage.REPLICA___REFRESH_ELEMENTS;

	/**
	 * The operation id for the '<em>Refresh XRefs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTIME_LINE_ABSTRACT___REFRESH_XREFS = ReplicaPackage.REPLICA___REFRESH_XREFS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTIME_LINE_ABSTRACT___REFRESH = ReplicaPackage.REPLICA___REFRESH;

	/**
	 * The operation id for the '<em>Remove</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTIME_LINE_ABSTRACT___REMOVE = ReplicaPackage.REPLICA___REMOVE;

	/**
	 * The operation id for the '<em>Get Replica</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTIME_LINE_ABSTRACT___GET_REPLICA__EOBJECT = ReplicaPackage.REPLICA___GET_REPLICA__EOBJECT;

	/**
	 * The number of operations of the '<em>RTime Line Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTIME_LINE_ABSTRACT_OPERATION_COUNT = ReplicaPackage.REPLICA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousereplica.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousereplica.impl.DomainImpl
	 * @see com.misc.touse.moplaf.tousereplica.impl.ToUseReplicaPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 4;

	/**
	 * The feature id for the '<em><b>Time Lines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__TIME_LINES = 0;

	/**
	 * The feature id for the '<em><b>Time Line Replicas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__TIME_LINE_REPLICAS = 1;

	/**
	 * The feature id for the '<em><b>Time Line Replica2s</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__TIME_LINE_REPLICA2S = 2;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousereplica.impl.RTimeLineImpl <em>RTime Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousereplica.impl.RTimeLineImpl
	 * @see com.misc.touse.moplaf.tousereplica.impl.ToUseReplicaPackageImpl#getRTimeLine()
	 * @generated
	 */
	int RTIME_LINE = 5;

	/**
	 * The feature id for the '<em><b>Exemplar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTIME_LINE__EXEMPLAR = RTIME_LINE_ABSTRACT__EXEMPLAR;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTIME_LINE__ELEMENTS = RTIME_LINE_ABSTRACT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTIME_LINE__CONTAINER = RTIME_LINE_ABSTRACT__CONTAINER;

	/**
	 * The number of structural features of the '<em>RTime Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTIME_LINE_FEATURE_COUNT = RTIME_LINE_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Exemplar Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTIME_LINE___GET_EXEMPLAR_ELEMENTS = RTIME_LINE_ABSTRACT___GET_EXEMPLAR_ELEMENTS;

	/**
	 * The operation id for the '<em>Construct Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTIME_LINE___CONSTRUCT_ELEMENT__EOBJECT = RTIME_LINE_ABSTRACT___CONSTRUCT_ELEMENT__EOBJECT;

	/**
	 * The operation id for the '<em>Refresh Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTIME_LINE___REFRESH_ELEMENTS = RTIME_LINE_ABSTRACT___REFRESH_ELEMENTS;

	/**
	 * The operation id for the '<em>Refresh XRefs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTIME_LINE___REFRESH_XREFS = RTIME_LINE_ABSTRACT___REFRESH_XREFS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTIME_LINE___REFRESH = RTIME_LINE_ABSTRACT___REFRESH;

	/**
	 * The operation id for the '<em>Remove</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTIME_LINE___REMOVE = RTIME_LINE_ABSTRACT___REMOVE;

	/**
	 * The operation id for the '<em>Get Replica</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTIME_LINE___GET_REPLICA__EOBJECT = RTIME_LINE_ABSTRACT___GET_REPLICA__EOBJECT;

	/**
	 * The number of operations of the '<em>RTime Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTIME_LINE_OPERATION_COUNT = RTIME_LINE_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousereplica.impl.RTimeLineBucketImpl <em>RTime Line Bucket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousereplica.impl.RTimeLineBucketImpl
	 * @see com.misc.touse.moplaf.tousereplica.impl.ToUseReplicaPackageImpl#getRTimeLineBucket()
	 * @generated
	 */
	int RTIME_LINE_BUCKET = 6;

	/**
	 * The feature id for the '<em><b>Exemplar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTIME_LINE_BUCKET__EXEMPLAR = RTIME_LINE_ABSTRACT__EXEMPLAR;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTIME_LINE_BUCKET__ELEMENTS = RTIME_LINE_ABSTRACT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTIME_LINE_BUCKET__CONTAINER = RTIME_LINE_ABSTRACT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Next Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTIME_LINE_BUCKET__NEXT_BUCKET = RTIME_LINE_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Previous Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTIME_LINE_BUCKET__PREVIOUS_BUCKET = RTIME_LINE_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RTime Line Bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTIME_LINE_BUCKET_FEATURE_COUNT = RTIME_LINE_ABSTRACT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Exemplar Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTIME_LINE_BUCKET___GET_EXEMPLAR_ELEMENTS = RTIME_LINE_ABSTRACT___GET_EXEMPLAR_ELEMENTS;

	/**
	 * The operation id for the '<em>Construct Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTIME_LINE_BUCKET___CONSTRUCT_ELEMENT__EOBJECT = RTIME_LINE_ABSTRACT___CONSTRUCT_ELEMENT__EOBJECT;

	/**
	 * The operation id for the '<em>Refresh Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTIME_LINE_BUCKET___REFRESH_ELEMENTS = RTIME_LINE_ABSTRACT___REFRESH_ELEMENTS;

	/**
	 * The operation id for the '<em>Refresh XRefs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTIME_LINE_BUCKET___REFRESH_XREFS = RTIME_LINE_ABSTRACT___REFRESH_XREFS;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTIME_LINE_BUCKET___REFRESH = RTIME_LINE_ABSTRACT___REFRESH;

	/**
	 * The operation id for the '<em>Remove</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTIME_LINE_BUCKET___REMOVE = RTIME_LINE_ABSTRACT___REMOVE;

	/**
	 * The operation id for the '<em>Get Replica</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTIME_LINE_BUCKET___GET_REPLICA__EOBJECT = RTIME_LINE_ABSTRACT___GET_REPLICA__EOBJECT;

	/**
	 * The number of operations of the '<em>RTime Line Bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTIME_LINE_BUCKET_OPERATION_COUNT = RTIME_LINE_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousereplica.impl.TimeLineReplicatorImpl <em>Time Line Replicator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousereplica.impl.TimeLineReplicatorImpl
	 * @see com.misc.touse.moplaf.tousereplica.impl.ToUseReplicaPackageImpl#getTimeLineReplicator()
	 * @generated
	 */
	int TIME_LINE_REPLICATOR = 7;

	/**
	 * The feature id for the '<em><b>Root Replicas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_REPLICATOR__ROOT_REPLICAS = ReplicaPackage.REPLICATOR__ROOT_REPLICAS;

	/**
	 * The feature id for the '<em><b>Time Line</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_REPLICATOR__TIME_LINE = ReplicaPackage.REPLICATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Buckets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_REPLICATOR__BUCKETS = ReplicaPackage.REPLICATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Time Line Replicator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_REPLICATOR_FEATURE_COUNT = ReplicaPackage.REPLICATOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Replica</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_REPLICATOR___GET_REPLICA__EOBJECT = ReplicaPackage.REPLICATOR___GET_REPLICA__EOBJECT;

	/**
	 * The operation id for the '<em>Get Exemplar Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_REPLICATOR___GET_EXEMPLAR_ELEMENTS__REPLICATORREPLICA = ReplicaPackage.REPLICATOR___GET_EXEMPLAR_ELEMENTS__REPLICATORREPLICA;

	/**
	 * The operation id for the '<em>Get Root Exemplar Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_REPLICATOR___GET_ROOT_EXEMPLAR_ELEMENTS = ReplicaPackage.REPLICATOR___GET_ROOT_EXEMPLAR_ELEMENTS;

	/**
	 * The operation id for the '<em>Construct Replica</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_REPLICATOR___CONSTRUCT_REPLICA__EOBJECT = ReplicaPackage.REPLICATOR___CONSTRUCT_REPLICA__EOBJECT;

	/**
	 * The operation id for the '<em>Refresh Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_REPLICATOR___REFRESH_ELEMENTS__ELIST_ELIST = ReplicaPackage.REPLICATOR___REFRESH_ELEMENTS__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_REPLICATOR___REFRESH = ReplicaPackage.REPLICATOR___REFRESH;

	/**
	 * The number of operations of the '<em>Time Line Replicator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_REPLICATOR_OPERATION_COUNT = ReplicaPackage.REPLICATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousereplica.impl.TimeLineReplicatorBucketImpl <em>Time Line Replicator Bucket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousereplica.impl.TimeLineReplicatorBucketImpl
	 * @see com.misc.touse.moplaf.tousereplica.impl.ToUseReplicaPackageImpl#getTimeLineReplicatorBucket()
	 * @generated
	 */
	int TIME_LINE_REPLICATOR_BUCKET = 8;

	/**
	 * The feature id for the '<em><b>Exemplar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_REPLICATOR_BUCKET__EXEMPLAR = ReplicaPackage.REPLICATOR_REPLICA__EXEMPLAR;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_REPLICATOR_BUCKET__ELEMENTS = ReplicaPackage.REPLICATOR_REPLICA__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_REPLICATOR_BUCKET__CONTAINER = ReplicaPackage.REPLICATOR_REPLICA__CONTAINER;

	/**
	 * The feature id for the '<em><b>Replicator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_REPLICATOR_BUCKET__REPLICATOR = ReplicaPackage.REPLICATOR_REPLICA__REPLICATOR;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_REPLICATOR_BUCKET__NEXT = ReplicaPackage.REPLICATOR_REPLICA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_REPLICATOR_BUCKET__PREVIOUS = ReplicaPackage.REPLICATOR_REPLICA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bucket</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_REPLICATOR_BUCKET__BUCKET = ReplicaPackage.REPLICATOR_REPLICA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Time Line</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_REPLICATOR_BUCKET__TIME_LINE = ReplicaPackage.REPLICATOR_REPLICA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_REPLICATOR_BUCKET__DESCRIPTION = ReplicaPackage.REPLICATOR_REPLICA_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Time Line Replicator Bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_REPLICATOR_BUCKET_FEATURE_COUNT = ReplicaPackage.REPLICATOR_REPLICA_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>On Construct</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_REPLICATOR_BUCKET___ON_CONSTRUCT = ReplicaPackage.REPLICATOR_REPLICA___ON_CONSTRUCT;

	/**
	 * The operation id for the '<em>On Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_REPLICATOR_BUCKET___ON_REFRESH = ReplicaPackage.REPLICATOR_REPLICA___ON_REFRESH;

	/**
	 * The operation id for the '<em>On Remove</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_REPLICATOR_BUCKET___ON_REMOVE = ReplicaPackage.REPLICATOR_REPLICA___ON_REMOVE;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_REPLICATOR_BUCKET___REFRESH = ReplicaPackage.REPLICATOR_REPLICA___REFRESH;

	/**
	 * The number of operations of the '<em>Time Line Replicator Bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LINE_REPLICATOR_BUCKET_OPERATION_COUNT = ReplicaPackage.REPLICATOR_REPLICA_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousereplica.TimeLineAbstract <em>Time Line Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Line Abstract</em>'.
	 * @see com.misc.touse.moplaf.tousereplica.TimeLineAbstract
	 * @generated
	 */
	EClass getTimeLineAbstract();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousereplica.TimeLineAbstract#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.touse.moplaf.tousereplica.TimeLineAbstract#getDescription()
	 * @see #getTimeLineAbstract()
	 * @generated
	 */
	EAttribute getTimeLineAbstract_Description();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousereplica.TimeLine <em>Time Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Line</em>'.
	 * @see com.misc.touse.moplaf.tousereplica.TimeLine
	 * @generated
	 */
	EClass getTimeLine();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.tousereplica.TimeLine#getBuckets <em>Buckets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buckets</em>'.
	 * @see com.misc.touse.moplaf.tousereplica.TimeLine#getBuckets()
	 * @see #getTimeLine()
	 * @generated
	 */
	EReference getTimeLine_Buckets();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousereplica.TimeLine#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see com.misc.touse.moplaf.tousereplica.TimeLine#getCode()
	 * @see #getTimeLine()
	 * @generated
	 */
	EAttribute getTimeLine_Code();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousereplica.TimeLineBucket <em>Time Line Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Line Bucket</em>'.
	 * @see com.misc.touse.moplaf.tousereplica.TimeLineBucket
	 * @generated
	 */
	EClass getTimeLineBucket();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.touse.moplaf.tousereplica.TimeLineBucket#getTimeLine <em>Time Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Time Line</em>'.
	 * @see com.misc.touse.moplaf.tousereplica.TimeLineBucket#getTimeLine()
	 * @see #getTimeLineBucket()
	 * @generated
	 */
	EReference getTimeLineBucket_TimeLine();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousereplica.TimeLineBucket#getPreviousBucket <em>Previous Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous Bucket</em>'.
	 * @see com.misc.touse.moplaf.tousereplica.TimeLineBucket#getPreviousBucket()
	 * @see #getTimeLineBucket()
	 * @generated
	 */
	EReference getTimeLineBucket_PreviousBucket();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousereplica.TimeLineBucket#getNextBucket <em>Next Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Bucket</em>'.
	 * @see com.misc.touse.moplaf.tousereplica.TimeLineBucket#getNextBucket()
	 * @see #getTimeLineBucket()
	 * @generated
	 */
	EReference getTimeLineBucket_NextBucket();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousereplica.TimeLineBucket#getBucketNr <em>Bucket Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bucket Nr</em>'.
	 * @see com.misc.touse.moplaf.tousereplica.TimeLineBucket#getBucketNr()
	 * @see #getTimeLineBucket()
	 * @generated
	 */
	EAttribute getTimeLineBucket_BucketNr();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousereplica.RTimeLineAbstract <em>RTime Line Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RTime Line Abstract</em>'.
	 * @see com.misc.touse.moplaf.tousereplica.RTimeLineAbstract
	 * @generated
	 */
	EClass getRTimeLineAbstract();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousereplica.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see com.misc.touse.moplaf.tousereplica.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.tousereplica.Domain#getTimeLines <em>Time Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Lines</em>'.
	 * @see com.misc.touse.moplaf.tousereplica.Domain#getTimeLines()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TimeLines();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.tousereplica.Domain#getTimeLineReplicas <em>Time Line Replicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Line Replicas</em>'.
	 * @see com.misc.touse.moplaf.tousereplica.Domain#getTimeLineReplicas()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TimeLineReplicas();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.tousereplica.Domain#getTimeLineReplica2s <em>Time Line Replica2s</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Line Replica2s</em>'.
	 * @see com.misc.touse.moplaf.tousereplica.Domain#getTimeLineReplica2s()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TimeLineReplica2s();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousereplica.RTimeLine <em>RTime Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RTime Line</em>'.
	 * @see com.misc.touse.moplaf.tousereplica.RTimeLine
	 * @generated
	 */
	EClass getRTimeLine();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousereplica.RTimeLineBucket <em>RTime Line Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RTime Line Bucket</em>'.
	 * @see com.misc.touse.moplaf.tousereplica.RTimeLineBucket
	 * @generated
	 */
	EClass getRTimeLineBucket();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousereplica.RTimeLineBucket#getNextBucket <em>Next Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Bucket</em>'.
	 * @see com.misc.touse.moplaf.tousereplica.RTimeLineBucket#getNextBucket()
	 * @see #getRTimeLineBucket()
	 * @generated
	 */
	EReference getRTimeLineBucket_NextBucket();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousereplica.RTimeLineBucket#getPreviousBucket <em>Previous Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous Bucket</em>'.
	 * @see com.misc.touse.moplaf.tousereplica.RTimeLineBucket#getPreviousBucket()
	 * @see #getRTimeLineBucket()
	 * @generated
	 */
	EReference getRTimeLineBucket_PreviousBucket();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousereplica.TimeLineReplicator <em>Time Line Replicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Line Replicator</em>'.
	 * @see com.misc.touse.moplaf.tousereplica.TimeLineReplicator
	 * @generated
	 */
	EClass getTimeLineReplicator();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousereplica.TimeLineReplicator#getTimeLine <em>Time Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Time Line</em>'.
	 * @see com.misc.touse.moplaf.tousereplica.TimeLineReplicator#getTimeLine()
	 * @see #getTimeLineReplicator()
	 * @generated
	 */
	EReference getTimeLineReplicator_TimeLine();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.touse.moplaf.tousereplica.TimeLineReplicator#getBuckets <em>Buckets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Buckets</em>'.
	 * @see com.misc.touse.moplaf.tousereplica.TimeLineReplicator#getBuckets()
	 * @see #getTimeLineReplicator()
	 * @generated
	 */
	EReference getTimeLineReplicator_Buckets();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousereplica.TimeLineReplicatorBucket <em>Time Line Replicator Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Line Replicator Bucket</em>'.
	 * @see com.misc.touse.moplaf.tousereplica.TimeLineReplicatorBucket
	 * @generated
	 */
	EClass getTimeLineReplicatorBucket();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousereplica.TimeLineReplicatorBucket#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see com.misc.touse.moplaf.tousereplica.TimeLineReplicatorBucket#getNext()
	 * @see #getTimeLineReplicatorBucket()
	 * @generated
	 */
	EReference getTimeLineReplicatorBucket_Next();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousereplica.TimeLineReplicatorBucket#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see com.misc.touse.moplaf.tousereplica.TimeLineReplicatorBucket#getPrevious()
	 * @see #getTimeLineReplicatorBucket()
	 * @generated
	 */
	EReference getTimeLineReplicatorBucket_Previous();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousereplica.TimeLineReplicatorBucket#getBucket <em>Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bucket</em>'.
	 * @see com.misc.touse.moplaf.tousereplica.TimeLineReplicatorBucket#getBucket()
	 * @see #getTimeLineReplicatorBucket()
	 * @generated
	 */
	EReference getTimeLineReplicatorBucket_Bucket();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.tousereplica.TimeLineReplicatorBucket#getTimeLine <em>Time Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Time Line</em>'.
	 * @see com.misc.touse.moplaf.tousereplica.TimeLineReplicatorBucket#getTimeLine()
	 * @see #getTimeLineReplicatorBucket()
	 * @generated
	 */
	EReference getTimeLineReplicatorBucket_TimeLine();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousereplica.TimeLineReplicatorBucket#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.touse.moplaf.tousereplica.TimeLineReplicatorBucket#getDescription()
	 * @see #getTimeLineReplicatorBucket()
	 * @generated
	 */
	EAttribute getTimeLineReplicatorBucket_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ToUseReplicaFactory getToUseReplicaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousereplica.impl.TimeLineAbstractImpl <em>Time Line Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousereplica.impl.TimeLineAbstractImpl
		 * @see com.misc.touse.moplaf.tousereplica.impl.ToUseReplicaPackageImpl#getTimeLineAbstract()
		 * @generated
		 */
		EClass TIME_LINE_ABSTRACT = eINSTANCE.getTimeLineAbstract();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_LINE_ABSTRACT__DESCRIPTION = eINSTANCE.getTimeLineAbstract_Description();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousereplica.impl.TimeLineImpl <em>Time Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousereplica.impl.TimeLineImpl
		 * @see com.misc.touse.moplaf.tousereplica.impl.ToUseReplicaPackageImpl#getTimeLine()
		 * @generated
		 */
		EClass TIME_LINE = eINSTANCE.getTimeLine();

		/**
		 * The meta object literal for the '<em><b>Buckets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_LINE__BUCKETS = eINSTANCE.getTimeLine_Buckets();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_LINE__CODE = eINSTANCE.getTimeLine_Code();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousereplica.impl.TimeLineBucketImpl <em>Time Line Bucket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousereplica.impl.TimeLineBucketImpl
		 * @see com.misc.touse.moplaf.tousereplica.impl.ToUseReplicaPackageImpl#getTimeLineBucket()
		 * @generated
		 */
		EClass TIME_LINE_BUCKET = eINSTANCE.getTimeLineBucket();

		/**
		 * The meta object literal for the '<em><b>Time Line</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_LINE_BUCKET__TIME_LINE = eINSTANCE.getTimeLineBucket_TimeLine();

		/**
		 * The meta object literal for the '<em><b>Previous Bucket</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_LINE_BUCKET__PREVIOUS_BUCKET = eINSTANCE.getTimeLineBucket_PreviousBucket();

		/**
		 * The meta object literal for the '<em><b>Next Bucket</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_LINE_BUCKET__NEXT_BUCKET = eINSTANCE.getTimeLineBucket_NextBucket();

		/**
		 * The meta object literal for the '<em><b>Bucket Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_LINE_BUCKET__BUCKET_NR = eINSTANCE.getTimeLineBucket_BucketNr();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousereplica.impl.RTimeLineAbstractImpl <em>RTime Line Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousereplica.impl.RTimeLineAbstractImpl
		 * @see com.misc.touse.moplaf.tousereplica.impl.ToUseReplicaPackageImpl#getRTimeLineAbstract()
		 * @generated
		 */
		EClass RTIME_LINE_ABSTRACT = eINSTANCE.getRTimeLineAbstract();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousereplica.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousereplica.impl.DomainImpl
		 * @see com.misc.touse.moplaf.tousereplica.impl.ToUseReplicaPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Time Lines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__TIME_LINES = eINSTANCE.getDomain_TimeLines();

		/**
		 * The meta object literal for the '<em><b>Time Line Replicas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__TIME_LINE_REPLICAS = eINSTANCE.getDomain_TimeLineReplicas();

		/**
		 * The meta object literal for the '<em><b>Time Line Replica2s</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__TIME_LINE_REPLICA2S = eINSTANCE.getDomain_TimeLineReplica2s();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousereplica.impl.RTimeLineImpl <em>RTime Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousereplica.impl.RTimeLineImpl
		 * @see com.misc.touse.moplaf.tousereplica.impl.ToUseReplicaPackageImpl#getRTimeLine()
		 * @generated
		 */
		EClass RTIME_LINE = eINSTANCE.getRTimeLine();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousereplica.impl.RTimeLineBucketImpl <em>RTime Line Bucket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousereplica.impl.RTimeLineBucketImpl
		 * @see com.misc.touse.moplaf.tousereplica.impl.ToUseReplicaPackageImpl#getRTimeLineBucket()
		 * @generated
		 */
		EClass RTIME_LINE_BUCKET = eINSTANCE.getRTimeLineBucket();

		/**
		 * The meta object literal for the '<em><b>Next Bucket</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTIME_LINE_BUCKET__NEXT_BUCKET = eINSTANCE.getRTimeLineBucket_NextBucket();

		/**
		 * The meta object literal for the '<em><b>Previous Bucket</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTIME_LINE_BUCKET__PREVIOUS_BUCKET = eINSTANCE.getRTimeLineBucket_PreviousBucket();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousereplica.impl.TimeLineReplicatorImpl <em>Time Line Replicator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousereplica.impl.TimeLineReplicatorImpl
		 * @see com.misc.touse.moplaf.tousereplica.impl.ToUseReplicaPackageImpl#getTimeLineReplicator()
		 * @generated
		 */
		EClass TIME_LINE_REPLICATOR = eINSTANCE.getTimeLineReplicator();

		/**
		 * The meta object literal for the '<em><b>Time Line</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_LINE_REPLICATOR__TIME_LINE = eINSTANCE.getTimeLineReplicator_TimeLine();

		/**
		 * The meta object literal for the '<em><b>Buckets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_LINE_REPLICATOR__BUCKETS = eINSTANCE.getTimeLineReplicator_Buckets();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousereplica.impl.TimeLineReplicatorBucketImpl <em>Time Line Replicator Bucket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousereplica.impl.TimeLineReplicatorBucketImpl
		 * @see com.misc.touse.moplaf.tousereplica.impl.ToUseReplicaPackageImpl#getTimeLineReplicatorBucket()
		 * @generated
		 */
		EClass TIME_LINE_REPLICATOR_BUCKET = eINSTANCE.getTimeLineReplicatorBucket();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_LINE_REPLICATOR_BUCKET__NEXT = eINSTANCE.getTimeLineReplicatorBucket_Next();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_LINE_REPLICATOR_BUCKET__PREVIOUS = eINSTANCE.getTimeLineReplicatorBucket_Previous();

		/**
		 * The meta object literal for the '<em><b>Bucket</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_LINE_REPLICATOR_BUCKET__BUCKET = eINSTANCE.getTimeLineReplicatorBucket_Bucket();

		/**
		 * The meta object literal for the '<em><b>Time Line</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_LINE_REPLICATOR_BUCKET__TIME_LINE = eINSTANCE.getTimeLineReplicatorBucket_TimeLine();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_LINE_REPLICATOR_BUCKET__DESCRIPTION = eINSTANCE.getTimeLineReplicatorBucket_Description();

	}

} //ToUseReplicaPackage
