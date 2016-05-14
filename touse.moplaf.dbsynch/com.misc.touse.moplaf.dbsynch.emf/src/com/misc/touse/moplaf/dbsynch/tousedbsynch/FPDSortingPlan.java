/**
 */
package com.misc.touse.moplaf.dbsynch.tousedbsynch;

import com.misc.common.moplaf.dbsynch.TableRow;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FPD Sorting Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan#getSortingPlanID <em>Sorting Plan ID</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan#getValidFrom <em>Valid From</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan#getValidTo <em>Valid To</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan#getSomeDateTime <em>Some Date Time</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan#getSomeTime <em>Some Time</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.ToUseDbSynchPackage#getFPDSortingPlan()
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
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.ToUseDbSynchPackage#getFPDSortingPlan_SortingPlanID()
	 * @model
	 * @generated
	 */
	String getSortingPlanID();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan#getSortingPlanID <em>Sorting Plan ID</em>}' attribute.
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
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.ToUseDbSynchPackage#getFPDSortingPlan_Name()
	 * @model unsettable="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Unsets the value of the '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

	/**
	 * Returns the value of the '<em><b>Valid From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid From</em>' attribute.
	 * @see #isSetValidFrom()
	 * @see #unsetValidFrom()
	 * @see #setValidFrom(Date)
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.ToUseDbSynchPackage#getFPDSortingPlan_ValidFrom()
	 * @model unsettable="true"
	 * @generated
	 */
	Date getValidFrom();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan#getValidFrom <em>Valid From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid From</em>' attribute.
	 * @see #isSetValidFrom()
	 * @see #unsetValidFrom()
	 * @see #getValidFrom()
	 * @generated
	 */
	void setValidFrom(Date value);

	/**
	 * Unsets the value of the '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan#getValidFrom <em>Valid From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValidFrom()
	 * @see #getValidFrom()
	 * @see #setValidFrom(Date)
	 * @generated
	 */
	void unsetValidFrom();

	/**
	 * Returns whether the value of the '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan#getValidFrom <em>Valid From</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Valid From</em>' attribute is set.
	 * @see #unsetValidFrom()
	 * @see #getValidFrom()
	 * @see #setValidFrom(Date)
	 * @generated
	 */
	boolean isSetValidFrom();

	/**
	 * Returns the value of the '<em><b>Valid To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid To</em>' attribute.
	 * @see #isSetValidTo()
	 * @see #unsetValidTo()
	 * @see #setValidTo(Date)
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.ToUseDbSynchPackage#getFPDSortingPlan_ValidTo()
	 * @model unsettable="true"
	 * @generated
	 */
	Date getValidTo();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan#getValidTo <em>Valid To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid To</em>' attribute.
	 * @see #isSetValidTo()
	 * @see #unsetValidTo()
	 * @see #getValidTo()
	 * @generated
	 */
	void setValidTo(Date value);

	/**
	 * Unsets the value of the '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan#getValidTo <em>Valid To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValidTo()
	 * @see #getValidTo()
	 * @see #setValidTo(Date)
	 * @generated
	 */
	void unsetValidTo();

	/**
	 * Returns whether the value of the '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan#getValidTo <em>Valid To</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Valid To</em>' attribute is set.
	 * @see #unsetValidTo()
	 * @see #getValidTo()
	 * @see #setValidTo(Date)
	 * @generated
	 */
	boolean isSetValidTo();

	/**
	 * Returns the value of the '<em><b>Some Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Some Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Some Date Time</em>' attribute.
	 * @see #isSetSomeDateTime()
	 * @see #unsetSomeDateTime()
	 * @see #setSomeDateTime(Date)
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.ToUseDbSynchPackage#getFPDSortingPlan_SomeDateTime()
	 * @model unsettable="true"
	 * @generated
	 */
	Date getSomeDateTime();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan#getSomeDateTime <em>Some Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Some Date Time</em>' attribute.
	 * @see #isSetSomeDateTime()
	 * @see #unsetSomeDateTime()
	 * @see #getSomeDateTime()
	 * @generated
	 */
	void setSomeDateTime(Date value);

	/**
	 * Unsets the value of the '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan#getSomeDateTime <em>Some Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSomeDateTime()
	 * @see #getSomeDateTime()
	 * @see #setSomeDateTime(Date)
	 * @generated
	 */
	void unsetSomeDateTime();

	/**
	 * Returns whether the value of the '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan#getSomeDateTime <em>Some Date Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Some Date Time</em>' attribute is set.
	 * @see #unsetSomeDateTime()
	 * @see #getSomeDateTime()
	 * @see #setSomeDateTime(Date)
	 * @generated
	 */
	boolean isSetSomeDateTime();

	/**
	 * Returns the value of the '<em><b>Some Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Some Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Some Time</em>' attribute.
	 * @see #isSetSomeTime()
	 * @see #unsetSomeTime()
	 * @see #setSomeTime(float)
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.ToUseDbSynchPackage#getFPDSortingPlan_SomeTime()
	 * @model unsettable="true"
	 * @generated
	 */
	float getSomeTime();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan#getSomeTime <em>Some Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Some Time</em>' attribute.
	 * @see #isSetSomeTime()
	 * @see #unsetSomeTime()
	 * @see #getSomeTime()
	 * @generated
	 */
	void setSomeTime(float value);

	/**
	 * Unsets the value of the '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan#getSomeTime <em>Some Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSomeTime()
	 * @see #getSomeTime()
	 * @see #setSomeTime(float)
	 * @generated
	 */
	void unsetSomeTime();

	/**
	 * Returns whether the value of the '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan#getSomeTime <em>Some Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Some Time</em>' attribute is set.
	 * @see #unsetSomeTime()
	 * @see #getSomeTime()
	 * @see #setSomeTime(float)
	 * @generated
	 */
	boolean isSetSomeTime();

} // FPDSortingPlan
