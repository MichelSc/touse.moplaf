/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline;

import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;
import com.misc.common.moplaf.time.discrete.TimeLine;
import com.misc.common.moplaf.time.discrete.TimeLineMerge;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.Domain#getTimeLineMerges <em>Time Line Merges</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.Domain#getDistribution <em>Distribution</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.Domain#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.Domain#getTimelines <em>Timelines</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.Domain#getObjectsWithTimeLine <em>Objects With Time Line</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends ObjectWithPropagatorFunctions {
	/**
	 * Returns the value of the '<em><b>Time Line Merges</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.time.discrete.TimeLineMerge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Line Merges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Line Merges</em>' containment reference list.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage#getDomain_TimeLineMerges()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimeLineMerge> getTimeLineMerges();

	/**
	 * Returns the value of the '<em><b>Distribution</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.timeline.tousetimeline.DomainDistribution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribution</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution</em>' containment reference list.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage#getDomain_Distribution()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainDistribution> getDistribution();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage#getDomain_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.timeline.tousetimeline.Domain#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Timelines</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.time.discrete.TimeLine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timelines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timelines</em>' containment reference list.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage#getDomain_Timelines()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimeLine> getTimelines();

	/**
	 * Returns the value of the '<em><b>Objects With Time Line</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.timeline.tousetimeline.ConcreteObjectWithTimeLine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objects With Time Line</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects With Time Line</em>' containment reference list.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage#getDomain_ObjectsWithTimeLine()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConcreteObjectWithTimeLine> getObjectsWithTimeLine();

} // Domain
