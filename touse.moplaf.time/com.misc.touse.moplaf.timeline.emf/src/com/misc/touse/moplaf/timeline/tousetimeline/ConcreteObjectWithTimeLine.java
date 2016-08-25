/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline;

import com.misc.common.moplaf.time.discrete.ObjectTimeBucket;

import com.misc.common.moplaf.time.discrete.ObjectWithTimeLine;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concrete Object With Time Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.ConcreteObjectWithTimeLine#getConcreteBuckets <em>Concrete Buckets</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage#getConcreteObjectWithTimeLine()
 * @model
 * @generated
 */
public interface ConcreteObjectWithTimeLine extends ObjectWithTimeLine {
	/**
	 * Returns the value of the '<em><b>Concrete Buckets</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.time.discrete.ObjectTimeBucket}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Buckets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Buckets</em>' containment reference list.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage#getConcreteObjectWithTimeLine_ConcreteBuckets()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObjectTimeBucket> getConcreteBuckets();

} // ConcreteObjectWithTimeLine
