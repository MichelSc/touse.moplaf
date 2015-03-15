/**
 */
package com.misc.touse.moplaf.touseflock;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trailer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.touseflock.Trailer#getDetach <em>Detach</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.touseflock.Trailer#getAttach <em>Attach</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.touseflock.Trailer#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.touse.moplaf.touseflock.TouseflockPackage#getTrailer()
 * @model
 * @generated
 */
public interface Trailer extends ToUseResource {
	/**
	 * Returns the value of the '<em><b>Detach</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.touseflock.DetachTrailer}.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.touseflock.DetachTrailer#getTrailer <em>Trailer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detach</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detach</em>' containment reference list.
	 * @see com.misc.touse.moplaf.touseflock.TouseflockPackage#getTrailer_Detach()
	 * @see com.misc.touse.moplaf.touseflock.DetachTrailer#getTrailer
	 * @model opposite="Trailer" containment="true"
	 * @generated
	 */
	EList<DetachTrailer> getDetach();

	/**
	 * Returns the value of the '<em><b>Attach</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.touseflock.AttachTrailer}.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.touseflock.AttachTrailer#getTrailer <em>Trailer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attach</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attach</em>' containment reference list.
	 * @see com.misc.touse.moplaf.touseflock.TouseflockPackage#getTrailer_Attach()
	 * @see com.misc.touse.moplaf.touseflock.AttachTrailer#getTrailer
	 * @model opposite="Trailer" containment="true"
	 * @generated
	 */
	EList<AttachTrailer> getAttach();

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.touseflock.TrailerConfiguration}.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.touseflock.TrailerConfiguration#getTrailer <em>Trailer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference list.
	 * @see com.misc.touse.moplaf.touseflock.TouseflockPackage#getTrailer_Configuration()
	 * @see com.misc.touse.moplaf.touseflock.TrailerConfiguration#getTrailer
	 * @model opposite="Trailer" containment="true"
	 * @generated
	 */
	EList<TrailerConfiguration> getConfiguration();

} // Trailer
