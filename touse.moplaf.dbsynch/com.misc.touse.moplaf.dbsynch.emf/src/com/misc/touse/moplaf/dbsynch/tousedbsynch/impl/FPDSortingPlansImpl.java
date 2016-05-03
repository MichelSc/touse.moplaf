/**
 */
package com.misc.touse.moplaf.dbsynch.tousedbsynch.impl;

import com.misc.common.moplaf.dbsynch.DbSynchFactory;
import com.misc.common.moplaf.dbsynch.TableColumn;
import com.misc.common.moplaf.dbsynch.impl.TableImpl;

import com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan;
import com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlans;
import com.misc.touse.moplaf.dbsynch.tousedbsynch.ToUseDbSynchPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FPD Sorting Plans</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.impl.FPDSortingPlansImpl#getSortingPlans <em>Sorting Plans</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FPDSortingPlansImpl extends TableImpl implements FPDSortingPlans {
	/**
	 * The cached value of the '{@link #getSortingPlans() <em>Sorting Plans</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingPlans()
	 * @generated
	 * @ordered
	 */
	protected EList<FPDSortingPlan> sortingPlans;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FPDSortingPlansImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseDbSynchPackage.Literals.FPD_SORTING_PLANS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FPDSortingPlan> getSortingPlans() {
		if (sortingPlans == null) {
			sortingPlans = new EObjectContainmentEList<FPDSortingPlan>(FPDSortingPlan.class, this, ToUseDbSynchPackage.FPD_SORTING_PLANS__SORTING_PLANS);
		}
		return sortingPlans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToUseDbSynchPackage.FPD_SORTING_PLANS__SORTING_PLANS:
				return ((InternalEList<?>)getSortingPlans()).basicRemove(otherEnd, msgs);
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
			case ToUseDbSynchPackage.FPD_SORTING_PLANS__SORTING_PLANS:
				return getSortingPlans();
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
			case ToUseDbSynchPackage.FPD_SORTING_PLANS__SORTING_PLANS:
				getSortingPlans().clear();
				getSortingPlans().addAll((Collection<? extends FPDSortingPlan>)newValue);
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
			case ToUseDbSynchPackage.FPD_SORTING_PLANS__SORTING_PLANS:
				getSortingPlans().clear();
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
			case ToUseDbSynchPackage.FPD_SORTING_PLANS__SORTING_PLANS:
				return sortingPlans != null && !sortingPlans.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	protected void refreshMetaDataImpl() {
		this.setTableName("SortingPlan");
		TableColumn idColumn = DbSynchFactory.eINSTANCE.createTableColumn();
		idColumn.setColumnName("id");
		idColumn.setRowAttribute(ToUseDbSynchPackage.Literals.FPD_SORTING_PLAN__SORTING_PLAN_ID);
		idColumn.setVolatile(true);
		
		TableColumn nameColumn = DbSynchFactory.eINSTANCE.createTableColumn();
		nameColumn.setColumnName("name");
		nameColumn.setRowAttribute(ToUseDbSynchPackage.Literals.FPD_SORTING_PLAN__NAME);
		nameColumn.setVolatile(true);
		
		TableColumn validFromColumn = DbSynchFactory.eINSTANCE.createTableColumn();
		validFromColumn.setColumnName("validfrom");
		validFromColumn.setRowAttribute(ToUseDbSynchPackage.Literals.FPD_SORTING_PLAN__VALID_FROM);
		validFromColumn.setVolatile(true);
		
		TableColumn validToColumn = DbSynchFactory.eINSTANCE.createTableColumn();
		validToColumn.setColumnName("validto");
		validToColumn.setRowAttribute(ToUseDbSynchPackage.Literals.FPD_SORTING_PLAN__VALID_TO);
		validToColumn.setVolatile(true);
		
		this.getKeyColumns().add(idColumn);
		this.getDataColumns().add(nameColumn);
		this.getDataColumns().add(validFromColumn);
		this.getDataColumns().add(validToColumn);
		
	}
	
	

} //FPDSortingPlansImpl
