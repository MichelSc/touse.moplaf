/**
 */
package com.misc.touse.moplaf.touseflock;

import com.misc.common.moplaf.flock.ChainConfiguration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Use Resource Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.touseflock.ToUseResourceConfiguration#getChainConfiguration <em>Chain Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.touse.moplaf.touseflock.TouseflockPackage#getToUseResourceConfiguration()
 * @model
 * @generated
 */
public interface ToUseResourceConfiguration extends ToUseResourceTransition {
	/**
	 * Returns the value of the '<em><b>Chain Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chain Configuration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chain Configuration</em>' containment reference.
	 * @see #setChainConfiguration(ChainConfiguration)
	 * @see com.misc.touse.moplaf.touseflock.TouseflockPackage#getToUseResourceConfiguration_ChainConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	ChainConfiguration getChainConfiguration();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.touseflock.ToUseResourceConfiguration#getChainConfiguration <em>Chain Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chain Configuration</em>' containment reference.
	 * @see #getChainConfiguration()
	 * @generated
	 */
	void setChainConfiguration(ChainConfiguration value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshChainConfiguration();

} // ToUseResourceConfiguration
