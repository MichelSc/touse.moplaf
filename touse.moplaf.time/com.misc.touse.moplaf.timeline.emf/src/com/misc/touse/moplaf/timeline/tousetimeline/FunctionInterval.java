/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline;

import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;
import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionInterval#getFrom <em>From</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionInterval#getTo <em>To</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionInterval#getDistribution <em>Distribution</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage#getFunctionInterval()
 * @model
 * @generated
 */
public interface FunctionInterval extends ObjectWithPropagatorFunctions {
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
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage#getFunctionInterval_From()
	 * @model
	 * @generated
	 */
	Date getFrom();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionInterval#getFrom <em>From</em>}' attribute.
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
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage#getFunctionInterval_To()
	 * @model
	 * @generated
	 */
	Date getTo();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionInterval#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Date value);

	/**
	 * Returns the value of the '<em><b>Distribution</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.timeline.tousetimeline.DomainDistribution#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribution</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution</em>' container reference.
	 * @see #setDistribution(DomainDistribution)
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage#getFunctionInterval_Distribution()
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.DomainDistribution#getFunctions
	 * @model opposite="Functions" transient="false"
	 * @generated
	 */
	DomainDistribution getDistribution();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionInterval#getDistribution <em>Distribution</em>}' container reference.
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
	void refresh();

} // FunctionInterval
