/**
 */
package com.misc.touse.moplaf.touseflock;

import com.misc.common.moplaf.flock.ChainMount;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Use Resource Mount</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.touseflock.ToUseResourceMount#getChainMount <em>Chain Mount</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.touse.moplaf.touseflock.TouseflockPackage#getToUseResourceMount()
 * @model
 * @generated
 */
public interface ToUseResourceMount extends ToUseResourceTransition {
	/**
	 * Returns the value of the '<em><b>Chain Mount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chain Mount</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chain Mount</em>' containment reference.
	 * @see #setChainMount(ChainMount)
	 * @see com.misc.touse.moplaf.touseflock.TouseflockPackage#getToUseResourceMount_ChainMount()
	 * @model containment="true"
	 * @generated
	 */
	ChainMount getChainMount();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.touseflock.ToUseResourceMount#getChainMount <em>Chain Mount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chain Mount</em>' containment reference.
	 * @see #getChainMount()
	 * @generated
	 */
	void setChainMount(ChainMount value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshChainMount();

} // ToUseResourceMount
