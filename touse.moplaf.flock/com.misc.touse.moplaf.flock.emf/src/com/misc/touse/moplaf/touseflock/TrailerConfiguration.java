/**
 */
package com.misc.touse.moplaf.touseflock;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trailer Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.touseflock.TrailerConfiguration#getTrailer <em>Trailer</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.touse.moplaf.touseflock.TouseflockPackage#getTrailerConfiguration()
 * @model
 * @generated
 */
public interface TrailerConfiguration extends ToUseResourceConfiguration {

	/**
	 * Returns the value of the '<em><b>Trailer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.touseflock.Trailer#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trailer</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trailer</em>' container reference.
	 * @see #setTrailer(Trailer)
	 * @see com.misc.touse.moplaf.touseflock.TouseflockPackage#getTrailerConfiguration_Trailer()
	 * @see com.misc.touse.moplaf.touseflock.Trailer#getConfiguration
	 * @model opposite="Configuration" required="true" transient="false"
	 * @generated
	 */
	Trailer getTrailer();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.touseflock.TrailerConfiguration#getTrailer <em>Trailer</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trailer</em>' container reference.
	 * @see #getTrailer()
	 * @generated
	 */
	void setTrailer(Trailer value);
} // TrailerConfiguration
