/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline;

import com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapter;
import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Minimum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionMinimum#getFrom <em>From</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionMinimum#getTo <em>To</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionMinimum#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionMinimum#getDistribution <em>Distribution</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage#getFunctionMinimum()
 * @model
 * @generated
 */
public interface FunctionMinimum extends ObjectWithPropagatorFunctionAdapter {
	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(Date)
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage#getFunctionMinimum_From()
	 * @model
	 * @generated
	 */
	Date getFrom();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionMinimum#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Date value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(Date)
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage#getFunctionMinimum_To()
	 * @model
	 * @generated
	 */
	Date getTo();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionMinimum#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Date value);

	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum</em>' attribute.
	 * @see #setMinimum(float)
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage#getFunctionMinimum_Minimum()
	 * @model
	 * @generated
	 */
	float getMinimum();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionMinimum#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' attribute.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(float value);

	/**
	 * Returns the value of the '<em><b>Distribution</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.timeline.tousetimeline.DomainDistribution#getCalcs <em>Calcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribution</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution</em>' container reference.
	 * @see #setDistribution(DomainDistribution)
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage#getFunctionMinimum_Distribution()
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.DomainDistribution#getCalcs
	 * @model opposite="Calcs" required="true" transient="false"
	 * @generated
	 */
	DomainDistribution getDistribution();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionMinimum#getDistribution <em>Distribution</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution</em>' container reference.
	 * @see #getDistribution()
	 * @generated
	 */
	void setDistribution(DomainDistribution value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshMinimum();

} // FunctionMinimum
