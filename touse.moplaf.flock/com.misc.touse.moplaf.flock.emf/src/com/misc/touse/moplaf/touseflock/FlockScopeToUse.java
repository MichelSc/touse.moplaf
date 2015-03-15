/**
 */
package com.misc.touse.moplaf.touseflock;

import com.misc.common.moplaf.flock.FlockScope;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flock Scope To Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.touseflock.FlockScopeToUse#getToUseDomain <em>To Use Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.touse.moplaf.touseflock.TouseflockPackage#getFlockScopeToUse()
 * @model
 * @generated
 */
public interface FlockScopeToUse extends FlockScope {

	/**
	 * Returns the value of the '<em><b>To Use Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.touseflock.ToUseDomain#getFlockScope <em>Flock Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Use Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Use Domain</em>' container reference.
	 * @see #setToUseDomain(ToUseDomain)
	 * @see com.misc.touse.moplaf.touseflock.TouseflockPackage#getFlockScopeToUse_ToUseDomain()
	 * @see com.misc.touse.moplaf.touseflock.ToUseDomain#getFlockScope
	 * @model opposite="FlockScope" transient="false"
	 * @generated
	 */
	ToUseDomain getToUseDomain();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.touseflock.FlockScopeToUse#getToUseDomain <em>To Use Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Use Domain</em>' container reference.
	 * @see #getToUseDomain()
	 * @generated
	 */
	void setToUseDomain(ToUseDomain value);
} // FlockScopeToUse
