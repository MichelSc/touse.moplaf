/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline;

import com.misc.common.moplaf.time.continuous.Distribution;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Distribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.DomainDistribution#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.DomainDistribution#getColor <em>Color</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.DomainDistribution#getFunctions <em>Functions</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.DomainDistribution#getPossibles <em>Possibles</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage#getDomainDistribution()
 * @model
 * @generated
 */
public interface DomainDistribution extends Distribution {
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
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage#getDomainDistribution_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.timeline.tousetimeline.DomainDistribution#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(int)
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage#getDomainDistribution_Color()
	 * @model
	 * @generated
	 */
	int getColor();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.timeline.tousetimeline.DomainDistribution#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(int value);

	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionInterval}.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionInterval#getDistribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' containment reference list.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage#getDomainDistribution_Functions()
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.FunctionInterval#getDistribution
	 * @model opposite="Distribution" containment="true"
	 * @generated
	 */
	EList<FunctionInterval> getFunctions();

	/**
	 * Returns the value of the '<em><b>Possibles</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionPossible}.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf.timeline.tousetimeline.FunctionPossible#getDistribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Possibles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possibles</em>' containment reference list.
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage#getDomainDistribution_Possibles()
	 * @see com.misc.touse.moplaf.timeline.tousetimeline.FunctionPossible#getDistribution
	 * @model opposite="Distribution" containment="true"
	 * @generated
	 */
	EList<FunctionPossible> getPossibles();

} // DomainDistribution
