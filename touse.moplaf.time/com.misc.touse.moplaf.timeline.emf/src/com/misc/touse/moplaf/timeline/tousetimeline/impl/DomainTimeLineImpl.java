/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline.impl;

import com.misc.common.moplaf.time.discrete.TimeBucket;
import com.misc.common.moplaf.time.discrete.impl.TimeLineImpl;
import com.misc.touse.moplaf.timeline.tousetimeline.DomainTimeLine;
import com.misc.touse.moplaf.timeline.tousetimeline.TousetimelineFactory;
import com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Time Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DomainTimeLineImpl extends TimeLineImpl implements DomainTimeLine {
	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.time.discrete.impl.TimeLineImpl#createBucket()
	 */
	@Override
	public TimeBucket createBucket() {
		return TousetimelineFactory.eINSTANCE.createDomainTimeBucket();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainTimeLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TousetimelinePackage.Literals.DOMAIN_TIME_LINE;
	}

} //DomainTimeLineImpl
