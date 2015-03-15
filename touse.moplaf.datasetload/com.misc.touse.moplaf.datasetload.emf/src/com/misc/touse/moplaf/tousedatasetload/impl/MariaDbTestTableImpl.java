/**
 */
package com.misc.touse.moplaf.tousedatasetload.impl;

import com.misc.common.moplaf.datasetload.TableRow;
import com.misc.common.moplaf.datasetload.impl.TableImpl;
import com.misc.touse.moplaf.tousedatasetload.MariaDbTestRow;
import com.misc.touse.moplaf.tousedatasetload.MariaDbTestTable;
import com.misc.touse.moplaf.tousedatasetload.TousedatasetloadFactory;
import com.misc.touse.moplaf.tousedatasetload.TousedatasetloadPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Maria Db Test Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousedatasetload.impl.MariaDbTestTableImpl#getMariaRows <em>Maria Rows</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MariaDbTestTableImpl extends TableImpl implements MariaDbTestTable {
	/**
	 * The cached value of the '{@link #getMariaRows() <em>Maria Rows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMariaRows()
	 * @generated
	 * @ordered
	 */
	protected EList<MariaDbTestRow> mariaRows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MariaDbTestTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TousedatasetloadPackage.Literals.MARIA_DB_TEST_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MariaDbTestRow> getMariaRows() {
		if (mariaRows == null) {
			mariaRows = new EObjectContainmentEList<MariaDbTestRow>(MariaDbTestRow.class, this, TousedatasetloadPackage.MARIA_DB_TEST_TABLE__MARIA_ROWS);
		}
		return mariaRows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TousedatasetloadPackage.MARIA_DB_TEST_TABLE__MARIA_ROWS:
				return ((InternalEList<?>)getMariaRows()).basicRemove(otherEnd, msgs);
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
			case TousedatasetloadPackage.MARIA_DB_TEST_TABLE__MARIA_ROWS:
				return getMariaRows();
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
			case TousedatasetloadPackage.MARIA_DB_TEST_TABLE__MARIA_ROWS:
				getMariaRows().clear();
				getMariaRows().addAll((Collection<? extends MariaDbTestRow>)newValue);
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
			case TousedatasetloadPackage.MARIA_DB_TEST_TABLE__MARIA_ROWS:
				getMariaRows().clear();
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
			case TousedatasetloadPackage.MARIA_DB_TEST_TABLE__MARIA_ROWS:
				return mariaRows != null && !mariaRows.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.datasetload.impl.TableImpl#NewRow()
	 */
	@Override
	public TableRow newRow() {
		MariaDbTestRow newrow = TousedatasetloadFactory.eINSTANCE.createMariaDbTestRow();
		this.getMariaRows().add(newrow);
		return newrow;
	}
	
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getName() {
		return "Test";
	}


	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.datasetload.impl.TableImpl#getParamTableGroupAttributes()
	 */
	@Override
	public EList<EAttribute> getParamTableGroupAttributes() {
		EList<EAttribute> columnAttributes = new BasicEList<EAttribute>();
		return columnAttributes;
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.datasetload.impl.TableImpl#getSQLStatement()
	 */
	@Override
	public String getSQLStatement() {
		String sqlStatement = "select col1, col2 from micheltable"
			                ;
		return sqlStatement;
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.datasetload.impl.TableImpl#getColumnTableRowAttributes()
	 */
	@Override
	public EList<EAttribute> getColumnTableRowAttributes() {
		EList<EAttribute> columnAttributes = new BasicEList<EAttribute>();
		columnAttributes.add(TousedatasetloadPackage.Literals.MARIA_DB_TEST_ROW__COL1);
		columnAttributes.add(TousedatasetloadPackage.Literals.MARIA_DB_TEST_ROW__COL2);
		return columnAttributes;
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.datasetload.impl.TableImpl#getKeyColumns()
	 */
	@Override
	public EList<Integer> getKeyColumns() {
		EList<Integer> keyColumns = new BasicEList<Integer>();
		keyColumns.add(0); // zero based
		keyColumns.add(1); // zero based
		return keyColumns;
	}

} //MariaDbTestTableImpl
