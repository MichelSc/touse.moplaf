/**
 */
package com.misc.touse.moplaf.gridview.tousegridview.impl;

import com.misc.touse.moplaf.gridview.tousegridview.Column;
import com.misc.touse.moplaf.gridview.tousegridview.Row;
import com.misc.touse.moplaf.gridview.tousegridview.Sheet;
import com.misc.touse.moplaf.gridview.tousegridview.SheetTraitEnum;
import com.misc.touse.moplaf.gridview.tousegridview.ToUseGridViewPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sheet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.gridview.tousegridview.impl.SheetImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.gridview.tousegridview.impl.SheetImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.gridview.tousegridview.impl.SheetImpl#getRows <em>Rows</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.gridview.tousegridview.impl.SheetImpl#getTrait <em>Trait</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SheetImpl extends MinimalEObjectImpl.Container implements Sheet {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> columns;

	/**
	 * The cached value of the '{@link #getRows() <em>Rows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected EList<Row> rows;

	/**
	 * The default value of the '{@link #getTrait() <em>Trait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrait()
	 * @generated
	 * @ordered
	 */
	protected static final SheetTraitEnum TRAIT_EDEFAULT = SheetTraitEnum.SHEET_TRAITS_NONE;

	/**
	 * The cached value of the '{@link #getTrait() <em>Trait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrait()
	 * @generated
	 * @ordered
	 */
	protected SheetTraitEnum trait = TRAIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SheetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseGridViewPackage.Literals.SHEET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseGridViewPackage.SHEET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentWithInverseEList<Column>(Column.class, this, ToUseGridViewPackage.SHEET__COLUMNS, ToUseGridViewPackage.COLUMN__SHEET);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Row> getRows() {
		if (rows == null) {
			rows = new EObjectContainmentWithInverseEList<Row>(Row.class, this, ToUseGridViewPackage.SHEET__ROWS, ToUseGridViewPackage.ROW__SHEET);
		}
		return rows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SheetTraitEnum getTrait() {
		return trait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrait(SheetTraitEnum newTrait) {
		SheetTraitEnum oldTrait = trait;
		trait = newTrait == null ? TRAIT_EDEFAULT : newTrait;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseGridViewPackage.SHEET__TRAIT, oldTrait, trait));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToUseGridViewPackage.SHEET__COLUMNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getColumns()).basicAdd(otherEnd, msgs);
			case ToUseGridViewPackage.SHEET__ROWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRows()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToUseGridViewPackage.SHEET__COLUMNS:
				return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
			case ToUseGridViewPackage.SHEET__ROWS:
				return ((InternalEList<?>)getRows()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUseGridViewPackage.SHEET__NAME:
				return getName();
			case ToUseGridViewPackage.SHEET__COLUMNS:
				return getColumns();
			case ToUseGridViewPackage.SHEET__ROWS:
				return getRows();
			case ToUseGridViewPackage.SHEET__TRAIT:
				return getTrait();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ToUseGridViewPackage.SHEET__NAME:
				setName((String)newValue);
				return;
			case ToUseGridViewPackage.SHEET__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends Column>)newValue);
				return;
			case ToUseGridViewPackage.SHEET__ROWS:
				getRows().clear();
				getRows().addAll((Collection<? extends Row>)newValue);
				return;
			case ToUseGridViewPackage.SHEET__TRAIT:
				setTrait((SheetTraitEnum)newValue);
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
			case ToUseGridViewPackage.SHEET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ToUseGridViewPackage.SHEET__COLUMNS:
				getColumns().clear();
				return;
			case ToUseGridViewPackage.SHEET__ROWS:
				getRows().clear();
				return;
			case ToUseGridViewPackage.SHEET__TRAIT:
				setTrait(TRAIT_EDEFAULT);
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
			case ToUseGridViewPackage.SHEET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ToUseGridViewPackage.SHEET__COLUMNS:
				return columns != null && !columns.isEmpty();
			case ToUseGridViewPackage.SHEET__ROWS:
				return rows != null && !rows.isEmpty();
			case ToUseGridViewPackage.SHEET__TRAIT:
				return trait != TRAIT_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(", Trait: ");
		result.append(trait);
		result.append(')');
		return result.toString();
	}

} //SheetImpl
