/**
 */
package com.misc.touse.moplaf.spreadsheet.tousespreadsheet.impl;

import com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseSpreadsheetPackage;
import com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseTableItem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Use Table Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.spreadsheet.tousespreadsheet.impl.ToUseTableItemImpl#getLongAttribute <em>Long Attribute</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.spreadsheet.tousespreadsheet.impl.ToUseTableItemImpl#getLongAttributeColor <em>Long Attribute Color</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.spreadsheet.tousespreadsheet.impl.ToUseTableItemImpl#getItemName <em>Item Name</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.spreadsheet.tousespreadsheet.impl.ToUseTableItemImpl#getLongAttributeTextColor <em>Long Attribute Text Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToUseTableItemImpl extends MinimalEObjectImpl.Container implements ToUseTableItem {
	/**
	 * The default value of the '{@link #getLongAttribute() <em>Long Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final long LONG_ATTRIBUTE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLongAttribute() <em>Long Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongAttribute()
	 * @generated
	 * @ordered
	 */
	protected long longAttribute = LONG_ATTRIBUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongAttributeColor() <em>Long Attribute Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongAttributeColor()
	 * @generated
	 * @ordered
	 */
	protected static final int LONG_ATTRIBUTE_COLOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLongAttributeColor() <em>Long Attribute Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongAttributeColor()
	 * @generated
	 * @ordered
	 */
	protected int longAttributeColor = LONG_ATTRIBUTE_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getItemName() <em>Item Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemName()
	 * @generated
	 * @ordered
	 */
	protected static final String ITEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItemName() <em>Item Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemName()
	 * @generated
	 * @ordered
	 */
	protected String itemName = ITEM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongAttributeTextColor() <em>Long Attribute Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongAttributeTextColor()
	 * @generated
	 * @ordered
	 */
	protected static final int LONG_ATTRIBUTE_TEXT_COLOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLongAttributeTextColor() <em>Long Attribute Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongAttributeTextColor()
	 * @generated
	 * @ordered
	 */
	protected int longAttributeTextColor = LONG_ATTRIBUTE_TEXT_COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUseTableItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseSpreadsheetPackage.Literals.TO_USE_TABLE_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLongAttribute() {
		return longAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongAttribute(long newLongAttribute) {
		long oldLongAttribute = longAttribute;
		longAttribute = newLongAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSpreadsheetPackage.TO_USE_TABLE_ITEM__LONG_ATTRIBUTE, oldLongAttribute, longAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLongAttributeColor() {
		return longAttributeColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongAttributeColor(int newLongAttributeColor) {
		int oldLongAttributeColor = longAttributeColor;
		longAttributeColor = newLongAttributeColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSpreadsheetPackage.TO_USE_TABLE_ITEM__LONG_ATTRIBUTE_COLOR, oldLongAttributeColor, longAttributeColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemName(String newItemName) {
		String oldItemName = itemName;
		itemName = newItemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSpreadsheetPackage.TO_USE_TABLE_ITEM__ITEM_NAME, oldItemName, itemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLongAttributeTextColor() {
		return longAttributeTextColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongAttributeTextColor(int newLongAttributeTextColor) {
		int oldLongAttributeTextColor = longAttributeTextColor;
		longAttributeTextColor = newLongAttributeTextColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSpreadsheetPackage.TO_USE_TABLE_ITEM__LONG_ATTRIBUTE_TEXT_COLOR, oldLongAttributeTextColor, longAttributeTextColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUseSpreadsheetPackage.TO_USE_TABLE_ITEM__LONG_ATTRIBUTE:
				return getLongAttribute();
			case ToUseSpreadsheetPackage.TO_USE_TABLE_ITEM__LONG_ATTRIBUTE_COLOR:
				return getLongAttributeColor();
			case ToUseSpreadsheetPackage.TO_USE_TABLE_ITEM__ITEM_NAME:
				return getItemName();
			case ToUseSpreadsheetPackage.TO_USE_TABLE_ITEM__LONG_ATTRIBUTE_TEXT_COLOR:
				return getLongAttributeTextColor();
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
			case ToUseSpreadsheetPackage.TO_USE_TABLE_ITEM__LONG_ATTRIBUTE:
				setLongAttribute((Long)newValue);
				return;
			case ToUseSpreadsheetPackage.TO_USE_TABLE_ITEM__LONG_ATTRIBUTE_COLOR:
				setLongAttributeColor((Integer)newValue);
				return;
			case ToUseSpreadsheetPackage.TO_USE_TABLE_ITEM__ITEM_NAME:
				setItemName((String)newValue);
				return;
			case ToUseSpreadsheetPackage.TO_USE_TABLE_ITEM__LONG_ATTRIBUTE_TEXT_COLOR:
				setLongAttributeTextColor((Integer)newValue);
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
			case ToUseSpreadsheetPackage.TO_USE_TABLE_ITEM__LONG_ATTRIBUTE:
				setLongAttribute(LONG_ATTRIBUTE_EDEFAULT);
				return;
			case ToUseSpreadsheetPackage.TO_USE_TABLE_ITEM__LONG_ATTRIBUTE_COLOR:
				setLongAttributeColor(LONG_ATTRIBUTE_COLOR_EDEFAULT);
				return;
			case ToUseSpreadsheetPackage.TO_USE_TABLE_ITEM__ITEM_NAME:
				setItemName(ITEM_NAME_EDEFAULT);
				return;
			case ToUseSpreadsheetPackage.TO_USE_TABLE_ITEM__LONG_ATTRIBUTE_TEXT_COLOR:
				setLongAttributeTextColor(LONG_ATTRIBUTE_TEXT_COLOR_EDEFAULT);
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
			case ToUseSpreadsheetPackage.TO_USE_TABLE_ITEM__LONG_ATTRIBUTE:
				return longAttribute != LONG_ATTRIBUTE_EDEFAULT;
			case ToUseSpreadsheetPackage.TO_USE_TABLE_ITEM__LONG_ATTRIBUTE_COLOR:
				return longAttributeColor != LONG_ATTRIBUTE_COLOR_EDEFAULT;
			case ToUseSpreadsheetPackage.TO_USE_TABLE_ITEM__ITEM_NAME:
				return ITEM_NAME_EDEFAULT == null ? itemName != null : !ITEM_NAME_EDEFAULT.equals(itemName);
			case ToUseSpreadsheetPackage.TO_USE_TABLE_ITEM__LONG_ATTRIBUTE_TEXT_COLOR:
				return longAttributeTextColor != LONG_ATTRIBUTE_TEXT_COLOR_EDEFAULT;
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
		result.append(" (LongAttribute: ");
		result.append(longAttribute);
		result.append(", LongAttributeColor: ");
		result.append(longAttributeColor);
		result.append(", ItemName: ");
		result.append(itemName);
		result.append(", LongAttributeTextColor: ");
		result.append(longAttributeTextColor);
		result.append(')');
		return result.toString();
	}

} //ToUseTableItemImpl
