/**
 */
package com.misc.touse.moplaf.tousedatasetload.impl;

import com.misc.common.moplaf.datasetload.TableRow;
import com.misc.common.moplaf.datasetload.impl.TableImpl;
import com.misc.touse.moplaf.tousedatasetload.FPDSortingPlan;
import com.misc.touse.moplaf.tousedatasetload.FPDSortingPlans;
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
 * An implementation of the model object '<em><b>FPD Sorting Plans</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousedatasetload.impl.FPDSortingPlansImpl#getSortingPlans <em>Sorting Plans</em>}</li>
 * </ul>
 * </p>
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
		return TousedatasetloadPackage.Literals.FPD_SORTING_PLANS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FPDSortingPlan> getSortingPlans() {
		if (sortingPlans == null) {
			sortingPlans = new EObjectContainmentEList<FPDSortingPlan>(FPDSortingPlan.class, this, TousedatasetloadPackage.FPD_SORTING_PLANS__SORTING_PLANS);
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
			case TousedatasetloadPackage.FPD_SORTING_PLANS__SORTING_PLANS:
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
			case TousedatasetloadPackage.FPD_SORTING_PLANS__SORTING_PLANS:
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
			case TousedatasetloadPackage.FPD_SORTING_PLANS__SORTING_PLANS:
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
			case TousedatasetloadPackage.FPD_SORTING_PLANS__SORTING_PLANS:
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
			case TousedatasetloadPackage.FPD_SORTING_PLANS__SORTING_PLANS:
				return sortingPlans != null && !sortingPlans.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	
	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.datasetload.impl.TableImpl#NewRow()
	 */
	@Override
	public TableRow newRow() {
		FPDSortingPlan newSortingPlan = TousedatasetloadFactory.eINSTANCE.createFPDSortingPlan();
		this.getSortingPlans().add(newSortingPlan);
		return newSortingPlan;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getName() {
		return "SortingPlan";
	}


	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.datasetload.impl.TableImpl#getParamTableGroupAttributes()
	 */
	@Override
	public EList<EAttribute> getParamTableGroupAttributes() {
		EList<EAttribute> columnAttributes = new BasicEList<EAttribute>();
		columnAttributes.add(TousedatasetloadPackage.Literals.FPD_GROUP_SORTING_PLAN__FROM_DATE);
		columnAttributes.add(TousedatasetloadPackage.Literals.FPD_GROUP_SORTING_PLAN__TO_DATE);
		return columnAttributes;
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.datasetload.impl.TableImpl#getSQLStatement()
	 */
	@Override
	public String getSQLStatement() {
		String sqlStatement = "select sp.id "
			                + "     , sp.name "
			                + "     , sp.validfrom "
			                + "     , sp.validto "
			                + "from SortingPlan as sp "
			                + "where validto   > ? "
			                + "  and validfrom < ? "
			                ;
		return sqlStatement;
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.datasetload.impl.TableImpl#getColumnTableRowAttributes()
	 */
	@Override
	public EList<EAttribute> getColumnTableRowAttributes() {
		EList<EAttribute> columnAttributes = new BasicEList<EAttribute>();
		columnAttributes.add(TousedatasetloadPackage.Literals.FPD_SORTING_PLAN__SORTING_PLAN_ID);
		columnAttributes.add(TousedatasetloadPackage.Literals.FPD_SORTING_PLAN__NAME);
		columnAttributes.add(TousedatasetloadPackage.Literals.FPD_SORTING_PLAN__VALID_FROM);
		columnAttributes.add(TousedatasetloadPackage.Literals.FPD_SORTING_PLAN__VALID_TO);
		return columnAttributes;
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.datasetload.impl.TableImpl#getKeyColumns()
	 */
	@Override
	public EList<Integer> getKeyColumns() {
		EList<Integer> keyColumns = new BasicEList<Integer>();
		keyColumns.add(0); // zero based
		return keyColumns;
	}


} //FPDSortingPlansImpl
