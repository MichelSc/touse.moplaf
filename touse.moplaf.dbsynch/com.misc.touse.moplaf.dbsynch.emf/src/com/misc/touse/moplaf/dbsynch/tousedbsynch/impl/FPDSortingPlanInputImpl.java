/**
 */
package com.misc.touse.moplaf.dbsynch.tousedbsynch.impl;

import com.misc.common.moplaf.dbsynch.impl.TableRowImpl;

import com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlanInput;
import com.misc.touse.moplaf.dbsynch.tousedbsynch.TousedbsynchPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FPD Sorting Plan Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDSortingPlanInputImpl#getProductID <em>Product ID</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDSortingPlanInputImpl#getSortingPlanID <em>Sorting Plan ID</em>}</li>
 * </ul>
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
		return TousedbsynchPackage.Literals.FPD_SORTING_PLAN_INPUT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TousedbsynchPackage.FPD_SORTING_PLAN_INPUT__PRODUCT_ID, oldProductID, productID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TousedbsynchPackage.FPD_SORTING_PLAN_INPUT__SORTING_PLAN_ID, oldSortingPlanID, sortingPlanID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TousedbsynchPackage.FPD_SORTING_PLAN_INPUT__PRODUCT_ID:
				return getProductID();
			case TousedbsynchPackage.FPD_SORTING_PLAN_INPUT__SORTING_PLAN_ID:
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
			case TousedbsynchPackage.FPD_SORTING_PLAN_INPUT__PRODUCT_ID:
				setProductID((String)newValue);
				return;
			case TousedbsynchPackage.FPD_SORTING_PLAN_INPUT__SORTING_PLAN_ID:
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
			case TousedbsynchPackage.FPD_SORTING_PLAN_INPUT__PRODUCT_ID:
				setProductID(PRODUCT_ID_EDEFAULT);
				return;
			case TousedbsynchPackage.FPD_SORTING_PLAN_INPUT__SORTING_PLAN_ID:
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
			case TousedbsynchPackage.FPD_SORTING_PLAN_INPUT__PRODUCT_ID:
				return PRODUCT_ID_EDEFAULT == null ? productID != null : !PRODUCT_ID_EDEFAULT.equals(productID);
			case TousedbsynchPackage.FPD_SORTING_PLAN_INPUT__SORTING_PLAN_ID:
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
