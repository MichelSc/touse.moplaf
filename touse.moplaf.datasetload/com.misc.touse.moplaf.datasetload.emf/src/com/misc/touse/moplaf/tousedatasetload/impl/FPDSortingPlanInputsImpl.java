/**
 */
package com.misc.touse.moplaf.tousedatasetload.impl;

import com.misc.common.moplaf.dbsynch.TableRow;
import com.misc.common.moplaf.dbsynch.impl.TableImpl;
import com.misc.touse.moplaf.tousedatasetload.FPDSortingPlanInput;
import com.misc.touse.moplaf.tousedatasetload.FPDSortingPlanInputs;
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
 * An implementation of the model object '<em><b>FPD Sorting Plan Inputs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousedatasetload.impl.FPDSortingPlanInputsImpl#getSortingPlanInputs <em>Sorting Plan Inputs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FPDSortingPlanInputsImpl extends TableImpl implements FPDSortingPlanInputs {
	/**
	 * The cached value of the '{@link #getSortingPlanInputs() <em>Sorting Plan Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingPlanInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<FPDSortingPlanInput> sortingPlanInputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FPDSortingPlanInputsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TousedatasetloadPackage.Literals.FPD_SORTING_PLAN_INPUTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FPDSortingPlanInput> getSortingPlanInputs() {
		if (sortingPlanInputs == null) {
			sortingPlanInputs = new EObjectContainmentEList<FPDSortingPlanInput>(FPDSortingPlanInput.class, this, TousedatasetloadPackage.FPD_SORTING_PLAN_INPUTS__SORTING_PLAN_INPUTS);
		}
		return sortingPlanInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TousedatasetloadPackage.FPD_SORTING_PLAN_INPUTS__SORTING_PLAN_INPUTS:
				return ((InternalEList<?>)getSortingPlanInputs()).basicRemove(otherEnd, msgs);
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
			case TousedatasetloadPackage.FPD_SORTING_PLAN_INPUTS__SORTING_PLAN_INPUTS:
				return getSortingPlanInputs();
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
			case TousedatasetloadPackage.FPD_SORTING_PLAN_INPUTS__SORTING_PLAN_INPUTS:
				getSortingPlanInputs().clear();
				getSortingPlanInputs().addAll((Collection<? extends FPDSortingPlanInput>)newValue);
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
			case TousedatasetloadPackage.FPD_SORTING_PLAN_INPUTS__SORTING_PLAN_INPUTS:
				getSortingPlanInputs().clear();
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
			case TousedatasetloadPackage.FPD_SORTING_PLAN_INPUTS__SORTING_PLAN_INPUTS:
				return sortingPlanInputs != null && !sortingPlanInputs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.datasetload.impl.TableImpl#NewRow()
	 */
	@Override
	public TableRow newRow() {
		FPDSortingPlanInput newSortingPlanInput = TousedatasetloadFactory.eINSTANCE.createFPDSortingPlanInput();
		this.getSortingPlanInputs().add(newSortingPlanInput);
		return newSortingPlanInput;
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.datasetload.impl.TableImpl#getColumnTableRowAttributes()
	 */
	@Override
	public EList<EAttribute> getColumnTableRowAttributes() {
		EList<EAttribute> columnAttributes = new BasicEList<EAttribute>();
		columnAttributes.add(TousedatasetloadPackage.Literals.FPD_SORTING_PLAN_INPUT__SORTING_PLAN_ID);
		columnAttributes.add(TousedatasetloadPackage.Literals.FPD_SORTING_PLAN_INPUT__PRODUCT_ID);
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getName() {
		return "SortingPlanInput";
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

	@Override
	public String getSQLStatement() {
		String sqlStatement = "select si.sortingplanid "
                            + "     , si.productid "
                            + "     , sp.validfrom "
                            + "     , sp.validto "
                            + "from SortingPlan      as sp "
                            + "   , SortingPlanInput as si "
                            + "where sp.id= si.sortingplanid "
                            + "  and sp.validto   > ? "
                            + "  and sp.validfrom < ? "
                            ;
		return sqlStatement;
	}

} //FPDSortingPlanInputsImpl
