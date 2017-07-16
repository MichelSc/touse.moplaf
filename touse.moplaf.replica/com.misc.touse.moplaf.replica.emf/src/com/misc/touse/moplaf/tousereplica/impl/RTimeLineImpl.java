/**
 */
package com.misc.touse.moplaf.tousereplica.impl;

import com.misc.common.moplaf.replica.Replica;
import com.misc.touse.moplaf.tousereplica.RTimeLine;
import com.misc.touse.moplaf.tousereplica.RTimeLineBucket;
import com.misc.touse.moplaf.tousereplica.TimeLineBucket;
import com.misc.touse.moplaf.tousereplica.ToUseReplicaFactory;
import com.misc.touse.moplaf.tousereplica.ToUseReplicaPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RTime Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RTimeLineImpl extends RTimeLineAbstractImpl implements RTimeLine {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RTimeLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseReplicaPackage.Literals.RTIME_LINE;
	}

	@Override
	public Replica constructElement(EObject exemplar) {
		assert exemplar instanceof TimeLineBucket;
		RTimeLineBucket new_bucket = ToUseReplicaFactory.eINSTANCE.createRTimeLineBucket();
		return new_bucket;
	}

} //RTimeLineImpl
