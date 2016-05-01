/**
 */
package com.misc.touse.moplaf.tousedatasetload;

import com.misc.common.moplaf.dbsynch.TableRow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FPD Sorting Plan Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousedatasetload.FPDSortingPlanInput#getProductID <em>Product ID</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousedatasetload.FPDSortingPlanInput#getSortingPlanID <em>Sorting Plan ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.touse.moplaf.tousedatasetload.TousedatasetloadPackage#getFPDSortingPlanInput()
 * @model
 * @generated
 */
public interface FPDSortingPlanInput extends TableRow {
	/**
	 * Returns the value of the '<em><b>Product ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product ID</em>' attribute.
	 * @see #setProductID(String)
	 * @see com.misc.touse.moplaf.tousedatasetload.TousedatasetloadPackage#getFPDSortingPlanInput_ProductID()
	 * @model
	 * @generated
	 */
	String getProductID();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousedatasetload.FPDSortingPlanInput#getProductID <em>Product ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product ID</em>' attribute.
	 * @see #getProductID()
	 * @generated
	 */
	void setProductID(String value);

	/**
	 * Returns the value of the '<em><b>Sorting Plan ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Plan ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Plan ID</em>' attribute.
	 * @see #setSortingPlanID(String)
	 * @see com.misc.touse.moplaf.tousedatasetload.TousedatasetloadPackage#getFPDSortingPlanInput_SortingPlanID()
	 * @model
	 * @generated
	 */
	String getSortingPlanID();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousedatasetload.FPDSortingPlanInput#getSortingPlanID <em>Sorting Plan ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorting Plan ID</em>' attribute.
	 * @see #getSortingPlanID()
	 * @generated
	 */
	void setSortingPlanID(String value);

} // FPDSortingPlanInput
