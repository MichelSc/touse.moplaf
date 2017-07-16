/**
 */
package com.misc.touse.moplaf.tousereplica.util;

import com.misc.common.moplaf.replica.Replica;

import com.misc.common.moplaf.replica.Replicator;
import com.misc.common.moplaf.replica.ReplicatorReplica;
import com.misc.touse.moplaf.tousereplica.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.touse.moplaf.tousereplica.ToUseReplicaPackage
 * @generated
 */
public class ToUseReplicaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ToUseReplicaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseReplicaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ToUseReplicaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUseReplicaSwitch<Adapter> modelSwitch = new ToUseReplicaSwitch<Adapter>() {
		@Override
		public Adapter caseTimeLineAbstract(TimeLineAbstract object) {
			return createTimeLineAbstractAdapter();
		}

		@Override
		public Adapter caseTimeLine(TimeLine object) {
			return createTimeLineAdapter();
		}

		@Override
		public Adapter caseTimeLineBucket(TimeLineBucket object) {
			return createTimeLineBucketAdapter();
		}

		@Override
		public Adapter caseRTimeLineAbstract(RTimeLineAbstract object) {
			return createRTimeLineAbstractAdapter();
		}

		@Override
		public Adapter caseDomain(Domain object) {
			return createDomainAdapter();
		}

		@Override
		public Adapter caseRTimeLine(RTimeLine object) {
			return createRTimeLineAdapter();
		}

		@Override
		public Adapter caseRTimeLineBucket(RTimeLineBucket object) {
			return createRTimeLineBucketAdapter();
		}

		@Override
		public Adapter caseTimeLineReplicator(TimeLineReplicator object) {
			return createTimeLineReplicatorAdapter();
		}

		@Override
		public Adapter caseTimeLineReplicatorBucket(TimeLineReplicatorBucket object) {
			return createTimeLineReplicatorBucketAdapter();
		}

		@Override
		public Adapter caseReplica(Replica object) {
			return createReplicaAdapter();
		}

		@Override
		public Adapter caseReplicator(Replicator object) {
			return createReplicatorAdapter();
		}

		@Override
		public Adapter caseReplicatorReplica(ReplicatorReplica object) {
			return createReplicatorReplicaAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousereplica.TimeLineAbstract <em>Time Line Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousereplica.TimeLineAbstract
	 * @generated
	 */
	public Adapter createTimeLineAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousereplica.TimeLine <em>Time Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousereplica.TimeLine
	 * @generated
	 */
	public Adapter createTimeLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousereplica.TimeLineBucket <em>Time Line Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousereplica.TimeLineBucket
	 * @generated
	 */
	public Adapter createTimeLineBucketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousereplica.RTimeLineAbstract <em>RTime Line Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousereplica.RTimeLineAbstract
	 * @generated
	 */
	public Adapter createRTimeLineAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousereplica.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousereplica.Domain
	 * @generated
	 */
	public Adapter createDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousereplica.RTimeLine <em>RTime Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousereplica.RTimeLine
	 * @generated
	 */
	public Adapter createRTimeLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousereplica.RTimeLineBucket <em>RTime Line Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousereplica.RTimeLineBucket
	 * @generated
	 */
	public Adapter createRTimeLineBucketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousereplica.TimeLineReplicator <em>Time Line Replicator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousereplica.TimeLineReplicator
	 * @generated
	 */
	public Adapter createTimeLineReplicatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousereplica.TimeLineReplicatorBucket <em>Time Line Replicator Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousereplica.TimeLineReplicatorBucket
	 * @generated
	 */
	public Adapter createTimeLineReplicatorBucketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.replica.Replica <em>Replica</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.replica.Replica
	 * @generated
	 */
	public Adapter createReplicaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.replica.Replicator <em>Replicator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.replica.Replicator
	 * @generated
	 */
	public Adapter createReplicatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.replica.ReplicatorReplica <em>Replicator Replica</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.replica.ReplicatorReplica
	 * @generated
	 */
	public Adapter createReplicatorReplicaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ToUseReplicaAdapterFactory
