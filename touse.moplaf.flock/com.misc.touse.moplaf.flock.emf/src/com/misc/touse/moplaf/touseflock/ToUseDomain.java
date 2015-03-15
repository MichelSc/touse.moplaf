/**
 */
package com.misc.touse.moplaf.touseflock;

import com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapterScope;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Use Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.touseflock.ToUseDomain#getLocation <em>Location</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.touseflock.ToUseDomain#getResource <em>Resource</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.touseflock.ToUseDomain#getFlockScope <em>Flock Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.touse.moplaf.touseflock.TouseflockPackage#getToUseDomain()
 * @model
 * @generated
 */
public interface ToUseDomain extends ObjectWithPropagatorFunctionAdapter, ObjectWithPropagatorFunctionAdapterScope {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.touseflock.ToUseLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference list.
	 * @see com.misc.touse.moplaf.touseflock.TouseflockPackage#getToUseDomain_Location()
	 * @model containment="true"
	 * @generated
	 */
	EList<ToUseLocation> getLocation();

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.touseflock.ToUseResource}.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.touseflock.ToUseResource#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference list.
	 * @see com.misc.touse.moplaf.touseflock.TouseflockPackage#getToUseDomain_Resource()
	 * @see com.misc.touse.moplaf.touseflock.ToUseResource#getDomain
	 * @model opposite="Domain" containment="true"
	 * @generated
	 */
	EList<ToUseResource> getResource();

	/**
	 * Returns the value of the '<em><b>Flock Scope</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.touseflock.FlockScopeToUse#getToUseDomain <em>To Use Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flock Scope</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flock Scope</em>' containment reference.
	 * @see #setFlockScope(FlockScopeToUse)
	 * @see com.misc.touse.moplaf.touseflock.TouseflockPackage#getToUseDomain_FlockScope()
	 * @see com.misc.touse.moplaf.touseflock.FlockScopeToUse#getToUseDomain
	 * @model opposite="ToUseDomain" containment="true"
	 * @generated
	 */
	FlockScopeToUse getFlockScope();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.touseflock.ToUseDomain#getFlockScope <em>Flock Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flock Scope</em>' containment reference.
	 * @see #getFlockScope()
	 * @generated
	 */
	void setFlockScope(FlockScopeToUse value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refresh();

} // ToUseDomain
