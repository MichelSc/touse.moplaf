/**
 */
package com.misc.touse.moplaf.tousereplica.util;

import com.misc.common.moplaf.replica.Replica;

import com.misc.common.moplaf.replica.Replicator;
import com.misc.common.moplaf.replica.ReplicatorReplica;
import com.misc.touse.moplaf.tousereplica.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.misc.touse.moplaf.tousereplica.ToUseReplicaPackage
 * @generated
 */
public class ToUseReplicaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ToUseReplicaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseReplicaSwitch() {
		if (modelPackage == null) {
			modelPackage = ToUseReplicaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ToUseReplicaPackage.TIME_LINE_ABSTRACT: {
			TimeLineAbstract timeLineAbstract = (TimeLineAbstract) theEObject;
			T result = caseTimeLineAbstract(timeLineAbstract);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ToUseReplicaPackage.TIME_LINE: {
			TimeLine timeLine = (TimeLine) theEObject;
			T result = caseTimeLine(timeLine);
			if (result == null)
				result = caseTimeLineAbstract(timeLine);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ToUseReplicaPackage.TIME_LINE_BUCKET: {
			TimeLineBucket timeLineBucket = (TimeLineBucket) theEObject;
			T result = caseTimeLineBucket(timeLineBucket);
			if (result == null)
				result = caseTimeLineAbstract(timeLineBucket);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ToUseReplicaPackage.RTIME_LINE_ABSTRACT: {
			RTimeLineAbstract rTimeLineAbstract = (RTimeLineAbstract) theEObject;
			T result = caseRTimeLineAbstract(rTimeLineAbstract);
			if (result == null)
				result = caseReplica(rTimeLineAbstract);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ToUseReplicaPackage.DOMAIN: {
			Domain domain = (Domain) theEObject;
			T result = caseDomain(domain);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ToUseReplicaPackage.RTIME_LINE: {
			RTimeLine rTimeLine = (RTimeLine) theEObject;
			T result = caseRTimeLine(rTimeLine);
			if (result == null)
				result = caseRTimeLineAbstract(rTimeLine);
			if (result == null)
				result = caseReplica(rTimeLine);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ToUseReplicaPackage.RTIME_LINE_BUCKET: {
			RTimeLineBucket rTimeLineBucket = (RTimeLineBucket) theEObject;
			T result = caseRTimeLineBucket(rTimeLineBucket);
			if (result == null)
				result = caseRTimeLineAbstract(rTimeLineBucket);
			if (result == null)
				result = caseReplica(rTimeLineBucket);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ToUseReplicaPackage.TIME_LINE_REPLICATOR: {
			TimeLineReplicator timeLineReplicator = (TimeLineReplicator) theEObject;
			T result = caseTimeLineReplicator(timeLineReplicator);
			if (result == null)
				result = caseReplicator(timeLineReplicator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ToUseReplicaPackage.TIME_LINE_REPLICATOR_BUCKET: {
			TimeLineReplicatorBucket timeLineReplicatorBucket = (TimeLineReplicatorBucket) theEObject;
			T result = caseTimeLineReplicatorBucket(timeLineReplicatorBucket);
			if (result == null)
				result = caseReplicatorReplica(timeLineReplicatorBucket);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Line Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Line Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeLineAbstract(TimeLineAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeLine(TimeLine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Line Bucket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Line Bucket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeLineBucket(TimeLineBucket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RTime Line Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RTime Line Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRTimeLineAbstract(RTimeLineAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomain(Domain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RTime Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RTime Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRTimeLine(RTimeLine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RTime Line Bucket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RTime Line Bucket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRTimeLineBucket(RTimeLineBucket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Line Replicator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Line Replicator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeLineReplicator(TimeLineReplicator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Line Replicator Bucket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Line Replicator Bucket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeLineReplicatorBucket(TimeLineReplicatorBucket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Replica</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Replica</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplica(Replica object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Replicator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Replicator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplicator(Replicator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Replicator Replica</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Replicator Replica</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplicatorReplica(ReplicatorReplica object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ToUseReplicaSwitch
