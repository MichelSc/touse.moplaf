/**
 */
package com.misc.touse.moplaf.touseflock;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tractor Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.touseflock.TractorConfiguration#getTractor <em>Tractor</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.touse.moplaf.touseflock.TouseflockPackage#getTractorConfiguration()
 * @model
 * @generated
 */
public interface TractorConfiguration extends ToUseResourceConfiguration {

	/**
	 * Returns the value of the '<em><b>Tractor</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.touseflock.Tractor#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tractor</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tractor</em>' container reference.
	 * @see #setTractor(Tractor)
	 * @see com.misc.touse.moplaf.touseflock.TouseflockPackage#getTractorConfiguration_Tractor()
	 * @see com.misc.touse.moplaf.touseflock.Tractor#getConfiguration
	 * @model opposite="Configuration" required="true" transient="false"
	 * @generated
	 */
	Tractor getTractor();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.touseflock.TractorConfiguration#getTractor <em>Tractor</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tractor</em>' container reference.
	 * @see #getTractor()
	 * @generated
	 */
	void setTractor(Tractor value);
} // TractorConfiguration
