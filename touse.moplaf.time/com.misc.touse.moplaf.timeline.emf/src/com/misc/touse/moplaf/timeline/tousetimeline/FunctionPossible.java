/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline;

import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;
import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Possible</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionPossible#getLimitMoment <em>Limit Moment</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionPossible#getLimitDuration <em>Limit Duration</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionPossible#getLimitAmount <em>Limit Amount</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionPossible#getDistribution <em>Distribution</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.timeline.tousetimeline.ToUseTimeLinePackage#getFunctionPossible()
 * @model
 * @generated
 */
public interface FunctionPossible extends ObjectWithPropagatorFunctions {
	/**
	 * Returns the value of the '<em><b>Limit Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limit Moment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit Moment</em>' attribute.
	 * @see #setLimitMoment(Date)
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.ToUseTimeLinePackage#getFunctionPossible_LimitMoment()
	 * @model
	 * @generated
	 */
	Date getLimitMoment();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionPossible#getLimitMoment <em>Limit Moment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit Moment</em>' attribute.
	 * @see #getLimitMoment()
	 * @generated
	 */
	void setLimitMoment(Date value);

	/**
	 * Returns the value of the '<em><b>Limit Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limit Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit Duration</em>' attribute.
	 * @see #setLimitDuration(float)
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.ToUseTimeLinePackage#getFunctionPossible_LimitDuration()
	 * @model
	 * @generated
	 */
	float getLimitDuration();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionPossible#getLimitDuration <em>Limit Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit Duration</em>' attribute.
	 * @see #getLimitDuration()
	 * @generated
	 */
	void setLimitDuration(float value);

	/**
	 * Returns the value of the '<em><b>Limit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limit Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit Amount</em>' attribute.
	 * @see #setLimitAmount(float)
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.ToUseTimeLinePackage#getFunctionPossible_LimitAmount()
	 * @model
	 * @generated
	 */
	float getLimitAmount();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionPossible#getLimitAmount <em>Limit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit Amount</em>' attribute.
	 * @see #getLimitAmount()
	 * @generated
	 */
	void setLimitAmount(float value);

	/**
	 * Returns the value of the '<em><b>Distribution</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.timeline.tousetimeline.DomainDistribution#getPossibles <em>Possibles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribution</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution</em>' container reference.
	 * @see #setDistribution(DomainDistribution)
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.ToUseTimeLinePackage#getFunctionPossible_Distribution()
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.DomainDistribution#getPossibles
	 * @model opposite="Possibles" transient="false"
	 * @generated
	 */
	DomainDistribution getDistribution();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionPossible#getDistribution <em>Distribution</em>}' container reference.
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

} // FunctionPossible
