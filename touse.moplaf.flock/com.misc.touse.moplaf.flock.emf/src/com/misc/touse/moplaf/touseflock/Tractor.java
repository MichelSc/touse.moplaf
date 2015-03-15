/**
 */
package com.misc.touse.moplaf.touseflock;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tractor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.touseflock.Tractor#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.touse.moplaf.touseflock.TouseflockPackage#getTractor()
 * @model
 * @generated
 */
public interface Tractor extends ToUseResource {
	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.touseflock.TractorConfiguration}.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.touseflock.TractorConfiguration#getTractor <em>Tractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference list.
	 * @see com.misc.touse.moplaf.touseflock.TouseflockPackage#getTractor_Configuration()
	 * @see com.misc.touse.moplaf.touseflock.TractorConfiguration#getTractor
	 * @model opposite="Tractor" containment="true"
	 * @generated
	 */
	EList<TractorConfiguration> getConfiguration();

} // Tractor
