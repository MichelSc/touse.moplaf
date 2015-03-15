/**
 */
package com.misc.touse.moplaf.tousedatasetload.impl;

import com.misc.common.moplaf.datasetload.impl.TableRowImpl;
import com.misc.touse.moplaf.tousedatasetload.MariaDbTestRow;
import com.misc.touse.moplaf.tousedatasetload.TousedatasetloadPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Maria Db Test Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousedatasetload.impl.MariaDbTestRowImpl#getCol1 <em>Col1</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousedatasetload.impl.MariaDbTestRowImpl#getCol2 <em>Col2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MariaDbTestRowImpl extends TableRowImpl implements MariaDbTestRow {
	/**
	 * The default value of the '{@link #getCol1() <em>Col1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCol1()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COL1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCol1() <em>Col1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCol1()
	 * @generated
	 * @ordered
	 */
	protected Integer col1 = COL1_EDEFAULT;

	/**
	 * The default value of the '{@link #getCol2() <em>Col2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCol2()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COL2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCol2() <em>Col2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCol2()
	 * @generated
	 * @ordered
	 */
	protected Integer col2 = COL2_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MariaDbTestRowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TousedatasetloadPackage.Literals.MARIA_DB_TEST_ROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCol1() {
		return col1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCol1(Integer newCol1) {
		Integer oldCol1 = col1;
		col1 = newCol1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TousedatasetloadPackage.MARIA_DB_TEST_ROW__COL1, oldCol1, col1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCol2() {
		return col2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCol2(Integer newCol2) {
		Integer oldCol2 = col2;
		col2 = newCol2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TousedatasetloadPackage.MARIA_DB_TEST_ROW__COL2, oldCol2, col2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TousedatasetloadPackage.MARIA_DB_TEST_ROW__COL1:
				return getCol1();
			case TousedatasetloadPackage.MARIA_DB_TEST_ROW__COL2:
				return getCol2();
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
			case TousedatasetloadPackage.MARIA_DB_TEST_ROW__COL1:
				setCol1((Integer)newValue);
				return;
			case TousedatasetloadPackage.MARIA_DB_TEST_ROW__COL2:
				setCol2((Integer)newValue);
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
			case TousedatasetloadPackage.MARIA_DB_TEST_ROW__COL1:
				setCol1(COL1_EDEFAULT);
				return;
			case TousedatasetloadPackage.MARIA_DB_TEST_ROW__COL2:
				setCol2(COL2_EDEFAULT);
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
			case TousedatasetloadPackage.MARIA_DB_TEST_ROW__COL1:
				return COL1_EDEFAULT == null ? col1 != null : !COL1_EDEFAULT.equals(col1);
			case TousedatasetloadPackage.MARIA_DB_TEST_ROW__COL2:
				return COL2_EDEFAULT == null ? col2 != null : !COL2_EDEFAULT.equals(col2);
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
		result.append(" (Col1: ");
		result.append(col1);
		result.append(", Col2: ");
		result.append(col2);
		result.append(')');
		return result.toString();
	}

} //MariaDbTestRowImpl
