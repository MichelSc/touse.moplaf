/**
 */
package com.misc.touse.moplaf.touseflock;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Detach Trailer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.touseflock.DetachTrailer#getTrailer <em>Trailer</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.touse.moplaf.touseflock.TouseflockPackage#getDetachTrailer()
 * @model
 * @generated
 */
public interface DetachTrailer extends ToUseResourceMount {

	/**
	 * Returns the value of the '<em><b>Trailer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.touseflock.Trailer#getDetach <em>Detach</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trailer</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trailer</em>' container reference.
	 * @see #setTrailer(Trailer)
	 * @see com.misc.touse.moplaf.touseflock.TouseflockPackage#getDetachTrailer_Trailer()
	 * @see com.misc.touse.moplaf.touseflock.Trailer#getDetach
	 * @model opposite="Detach" required="true" transient="false"
	 * @generated
	 */
	Trailer getTrailer();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.touseflock.DetachTrailer#getTrailer <em>Trailer</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trailer</em>' container reference.
	 * @see #getTrailer()
	 * @generated
	 */
	void setTrailer(Trailer value);
} // DetachTrailer
