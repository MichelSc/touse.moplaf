/**
 */
package com.misc.touse.moplaf.tousedatasetload;

import com.misc.common.moplaf.datasetload.TableRow;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FPD Sorting Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousedatasetload.FPDSortingPlan#getSortingPlanID <em>Sorting Plan ID</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousedatasetload.FPDSortingPlan#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousedatasetload.FPDSortingPlan#getValidFrom <em>Valid From</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousedatasetload.FPDSortingPlan#getValidTo <em>Valid To</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.touse.moplaf.tousedatasetload.TousedatasetloadPackage#getFPDSortingPlan()
 * @model
 * @generated
 */
public interface FPDSortingPlan extends TableRow {
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
	 * @see com.misc.touse.moplaf.tousedatasetload.TousedatasetloadPackage#getFPDSortingPlan_SortingPlanID()
	 * @model
	 * @generated
	 */
	String getSortingPlanID();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousedatasetload.FPDSortingPlan#getSortingPlanID <em>Sorting Plan ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorting Plan ID</em>' attribute.
	 * @see #getSortingPlanID()
	 * @generated
	 */
	void setSortingPlanID(String value);

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
	 * @see com.misc.touse.moplaf.tousedatasetload.TousedatasetloadPackage#getFPDSortingPlan_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousedatasetload.FPDSortingPlan#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Valid From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid From</em>' attribute.
	 * @see #setValidFrom(Date)
	 * @see com.misc.touse.moplaf.tousedatasetload.TousedatasetloadPackage#getFPDSortingPlan_ValidFrom()
	 * @model
	 * @generated
	 */
	Date getValidFrom();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousedatasetload.FPDSortingPlan#getValidFrom <em>Valid From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid From</em>' attribute.
	 * @see #getValidFrom()
	 * @generated
	 */
	void setValidFrom(Date value);

	/**
	 * Returns the value of the '<em><b>Valid To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid To</em>' attribute.
	 * @see #setValidTo(Date)
	 * @see com.misc.touse.moplaf.tousedatasetload.TousedatasetloadPackage#getFPDSortingPlan_ValidTo()
	 * @model
	 * @generated
	 */
	Date getValidTo();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.tousedatasetload.FPDSortingPlan#getValidTo <em>Valid To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid To</em>' attribute.
	 * @see #getValidTo()
	 * @generated
	 */
	void setValidTo(Date value);

} // FPDSortingPlan
