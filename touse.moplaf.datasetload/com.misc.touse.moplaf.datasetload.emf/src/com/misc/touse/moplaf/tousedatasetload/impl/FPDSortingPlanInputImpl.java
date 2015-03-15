/**
 */
package com.misc.touse.moplaf.tousedatasetload.impl;

import com.misc.common.moplaf.datasetload.impl.TableRowImpl;

import com.misc.touse.moplaf.tousedatasetload.FPDSortingPlanInput;
import com.misc.touse.moplaf.tousedatasetload.TousedatasetloadPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FPD Sorting Plan Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousedatasetload.impl.FPDSortingPlanInputImpl#getProductID <em>Product ID</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousedatasetload.impl.FPDSortingPlanInputImpl#getSortingPlanID <em>Sorting Plan ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FPDSortingPlanInputImpl extends TableRowImpl implements FPDSortingPlanInput {
	/**
	 * The default value of the '{@link #getProductID() <em>Product ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductID()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductID() <em>Product ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductID()
	 * @generated
	 * @ordered
	 */
	protected String productID = PRODUCT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSortingPlanID() <em>Sorting Plan ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingPlanID()
	 * @generated
	 * @ordered
	 */
	protected static final String SORTING_PLAN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSortingPlanID() <em>Sorting Plan ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingPlanID()
	 * @generated
	 * @ordered
	 */
	protected String sortingPlanID = SORTING_PLAN_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FPDSortingPlanInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TousedatasetloadPackage.Literals.FPD_SORTING_PLAN_INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductID() {
		return productID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductID(String newProductID) {
		String oldProductID = productID;
		productID = newProductID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TousedatasetloadPackage.FPD_SORTING_PLAN_INPUT__PRODUCT_ID, oldProductID, productID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSortingPlanID() {
		return sortingPlanID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortingPlanID(String newSortingPlanID) {
		String oldSortingPlanID = sortingPlanID;
		sortingPlanID = newSortingPlanID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TousedatasetloadPackage.FPD_SORTING_PLAN_INPUT__SORTING_PLAN_ID, oldSortingPlanID, sortingPlanID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TousedatasetloadPackage.FPD_SORTING_PLAN_INPUT__PRODUCT_ID:
				return getProductID();
			case TousedatasetloadPackage.FPD_SORTING_PLAN_INPUT__SORTING_PLAN_ID:
				return getSortingPlanID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TousedatasetloadPackage.FPD_SORTING_PLAN_INPUT__PRODUCT_ID:
				setProductID((String)newValue);
				return;
			case TousedatasetloadPackage.FPD_SORTING_PLAN_INPUT__SORTING_PLAN_ID:
				setSortingPlanID((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TousedatasetloadPackage.FPD_SORTING_PLAN_INPUT__PRODUCT_ID:
				setProductID(PRODUCT_ID_EDEFAULT);
				return;
			case TousedatasetloadPackage.FPD_SORTING_PLAN_INPUT__SORTING_PLAN_ID:
				setSortingPlanID(SORTING_PLAN_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TousedatasetloadPackage.FPD_SORTING_PLAN_INPUT__PRODUCT_ID:
				return PRODUCT_ID_EDEFAULT == null ? productID != null : !PRODUCT_ID_EDEFAULT.equals(productID);
			case TousedatasetloadPackage.FPD_SORTING_PLAN_INPUT__SORTING_PLAN_ID:
				return SORTING_PLAN_ID_EDEFAULT == null ? sortingPlanID != null : !SORTING_PLAN_ID_EDEFAULT.equals(sortingPlanID);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ProductID: ");
		result.append(productID);
		result.append(", SortingPlanID: ");
		result.append(sortingPlanID);
		result.append(')');
		return result.toString();
	}

} //FPDSortingPlanInputImpl
