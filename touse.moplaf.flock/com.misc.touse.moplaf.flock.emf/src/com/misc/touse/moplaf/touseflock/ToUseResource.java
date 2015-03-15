/**
 */
package com.misc.touse.moplaf.touseflock;

import com.misc.common.moplaf.flock.Chain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Use Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.touseflock.ToUseResource#getDomain <em>Domain</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.touseflock.ToUseResource#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.touseflock.ToUseResource#getChain <em>Chain</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.touse.moplaf.touseflock.TouseflockPackage#getToUseResource()
 * @model abstract="true"
 * @generated
 */
public interface ToUseResource extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.touseflock.ToUseDomain#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' container reference.
	 * @see #setDomain(ToUseDomain)
	 * @see com.misc.touse.moplaf.touseflock.TouseflockPackage#getToUseResource_Domain()
	 * @see com.misc.touse.moplaf.touseflock.ToUseDomain#getResource
	 * @model opposite="Resource" required="true" transient="false"
	 * @generated
	 */
	ToUseDomain getDomain();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.touseflock.ToUseResource#getDomain <em>Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' container reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(ToUseDomain value);

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
	 * @see com.misc.touse.moplaf.touseflock.TouseflockPackage#getToUseResource_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.touseflock.ToUseResource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Chain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chain</em>' containment reference.
	 * @see #setChain(Chain)
	 * @see com.misc.touse.moplaf.touseflock.TouseflockPackage#getToUseResource_Chain()
	 * @model containment="true"
	 * @generated
	 */
	Chain getChain();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.touseflock.ToUseResource#getChain <em>Chain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chain</em>' containment reference.
	 * @see #getChain()
	 * @generated
	 */
	void setChain(Chain value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshChain();

} // ToUseResource
