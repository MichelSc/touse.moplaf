/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline;

import com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapterScope;
import com.misc.common.moplaf.time.continuous.CapacityChange;
import com.misc.common.moplaf.time.continuous.StockChange;
import com.misc.common.moplaf.time.discrete.TimeLineMerge;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.Domain#getTimeLine <em>Time Line</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.Domain#getTimeLineMerge <em>Time Line Merge</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.Domain#getAmountImpulsion <em>Amount Impulsion</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.Domain#getAmountAbsolute <em>Amount Absolute</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.Domain#getSlopeAbsolute <em>Slope Absolute</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.Domain#getSlopeImpulsion <em>Slope Impulsion</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.Domain#getCapacityChange <em>Capacity Change</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.Domain#getStockChange <em>Stock Change</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.Domain#getDistribution <em>Distribution</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.Domain#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends ObjectWithPropagatorFunctionAdapterScope, ObjectWithPropagatorFunctionAdapter {
	/**
	 * Returns the value of the '<em><b>Time Line</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.timeline.tousetimeline.DomainTimeLine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Line</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Line</em>' containment reference list.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage#getDomain_TimeLine()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainTimeLine> getTimeLine();

	/**
	 * Returns the value of the '<em><b>Time Line Merge</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.time.discrete.TimeLineMerge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Line Merge</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Line Merge</em>' containment reference list.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage#getDomain_TimeLineMerge()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimeLineMerge> getTimeLineMerge();

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
	 * Returns the value of the '<em><b>Amount Impulsion</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.timeline.tousetimeline.ToUseAmountImpulsion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Impulsion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Impulsion</em>' containment reference list.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage#getDomain_AmountImpulsion()
	 * @model containment="true"
	 * @generated
	 */
	EList<ToUseAmountImpulsion> getAmountImpulsion();

	/**
	 * Returns the value of the '<em><b>Amount Absolute</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.timeline.tousetimeline.ToUseAmountAbsolute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Absolute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Absolute</em>' containment reference list.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage#getDomain_AmountAbsolute()
	 * @model containment="true"
	 * @generated
	 */
	EList<ToUseAmountAbsolute> getAmountAbsolute();

	/**
	 * Returns the value of the '<em><b>Slope Absolute</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.timeline.tousetimeline.ToUseSlopeAbsolute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slope Absolute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slope Absolute</em>' containment reference list.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage#getDomain_SlopeAbsolute()
	 * @model containment="true"
	 * @generated
	 */
	EList<ToUseSlopeAbsolute> getSlopeAbsolute();

	/**
	 * Returns the value of the '<em><b>Slope Impulsion</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.timeline.tousetimeline.ToUseSlopeImpulsion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ämount Impulsion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slope Impulsion</em>' containment reference list.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage#getDomain_SlopeImpulsion()
	 * @model containment="true"
	 * @generated
	 */
	EList<ToUseSlopeImpulsion> getSlopeImpulsion();

	/**
	 * Returns the value of the '<em><b>Capacity Change</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.time.continuous.CapacityChange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity Change</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity Change</em>' containment reference list.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage#getDomain_CapacityChange()
	 * @model containment="true"
	 * @generated
	 */
	EList<CapacityChange> getCapacityChange();

	/**
	 * Returns the value of the '<em><b>Stock Change</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.time.continuous.StockChange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stock Change</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stock Change</em>' containment reference list.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage#getDomain_StockChange()
	 * @model containment="true"
	 * @generated
	 */
	EList<StockChange> getStockChange();

} // Domain
