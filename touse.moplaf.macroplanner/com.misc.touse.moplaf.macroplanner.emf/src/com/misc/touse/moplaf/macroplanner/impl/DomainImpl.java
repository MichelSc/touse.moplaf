/**
 */
package com.misc.touse.moplaf.macroplanner.impl;

import com.misc.common.moplaf.macroplanner.SupplyChainData;
import com.misc.common.moplaf.macroplanner.SupplyChainMasterData;
import com.misc.common.moplaf.macroplanner.SupplyChainRoutings;

import com.misc.common.moplaf.macroplanner.solver.Scenario;

import com.misc.touse.moplaf.macroplanner.Domain;
import com.misc.touse.moplaf.macroplanner.ToUseMacroPlannerPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.macroplanner.impl.DomainImpl#getMasterData <em>Master Data</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.macroplanner.impl.DomainImpl#getData <em>Data</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.macroplanner.impl.DomainImpl#getChains <em>Chains</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.macroplanner.impl.DomainImpl#getScenarios <em>Scenarios</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainImpl extends MinimalEObjectImpl.Container implements Domain {
	/**
	 * The cached value of the '{@link #getMasterData() <em>Master Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterData()
	 * @generated
	 * @ordered
	 */
	protected EList<SupplyChainMasterData> masterData;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<SupplyChainData> data;

	/**
	 * The cached value of the '{@link #getChains() <em>Chains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChains()
	 * @generated
	 * @ordered
	 */
	protected EList<SupplyChainRoutings> chains;

	/**
	 * The cached value of the '{@link #getScenarios() <em>Scenarios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarios()
	 * @generated
	 * @ordered
	 */
	protected EList<Scenario> scenarios;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseMacroPlannerPackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupplyChainMasterData> getMasterData() {
		if (masterData == null) {
			masterData = new EObjectContainmentEList<SupplyChainMasterData>(SupplyChainMasterData.class, this, ToUseMacroPlannerPackage.DOMAIN__MASTER_DATA);
		}
		return masterData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupplyChainData> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<SupplyChainData>(SupplyChainData.class, this, ToUseMacroPlannerPackage.DOMAIN__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupplyChainRoutings> getChains() {
		if (chains == null) {
			chains = new EObjectContainmentEList<SupplyChainRoutings>(SupplyChainRoutings.class, this, ToUseMacroPlannerPackage.DOMAIN__CHAINS);
		}
		return chains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scenario> getScenarios() {
		if (scenarios == null) {
			scenarios = new EObjectContainmentEList<Scenario>(Scenario.class, this, ToUseMacroPlannerPackage.DOMAIN__SCENARIOS);
		}
		return scenarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToUseMacroPlannerPackage.DOMAIN__MASTER_DATA:
				return ((InternalEList<?>)getMasterData()).basicRemove(otherEnd, msgs);
			case ToUseMacroPlannerPackage.DOMAIN__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
			case ToUseMacroPlannerPackage.DOMAIN__CHAINS:
				return ((InternalEList<?>)getChains()).basicRemove(otherEnd, msgs);
			case ToUseMacroPlannerPackage.DOMAIN__SCENARIOS:
				return ((InternalEList<?>)getScenarios()).basicRemove(otherEnd, msgs);
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
			case ToUseMacroPlannerPackage.DOMAIN__MASTER_DATA:
				return getMasterData();
			case ToUseMacroPlannerPackage.DOMAIN__DATA:
				return getData();
			case ToUseMacroPlannerPackage.DOMAIN__CHAINS:
				return getChains();
			case ToUseMacroPlannerPackage.DOMAIN__SCENARIOS:
				return getScenarios();
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
			case ToUseMacroPlannerPackage.DOMAIN__MASTER_DATA:
				getMasterData().clear();
				getMasterData().addAll((Collection<? extends SupplyChainMasterData>)newValue);
				return;
			case ToUseMacroPlannerPackage.DOMAIN__DATA:
				getData().clear();
				getData().addAll((Collection<? extends SupplyChainData>)newValue);
				return;
			case ToUseMacroPlannerPackage.DOMAIN__CHAINS:
				getChains().clear();
				getChains().addAll((Collection<? extends SupplyChainRoutings>)newValue);
				return;
			case ToUseMacroPlannerPackage.DOMAIN__SCENARIOS:
				getScenarios().clear();
				getScenarios().addAll((Collection<? extends Scenario>)newValue);
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
			case ToUseMacroPlannerPackage.DOMAIN__MASTER_DATA:
				getMasterData().clear();
				return;
			case ToUseMacroPlannerPackage.DOMAIN__DATA:
				getData().clear();
				return;
			case ToUseMacroPlannerPackage.DOMAIN__CHAINS:
				getChains().clear();
				return;
			case ToUseMacroPlannerPackage.DOMAIN__SCENARIOS:
				getScenarios().clear();
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
			case ToUseMacroPlannerPackage.DOMAIN__MASTER_DATA:
				return masterData != null && !masterData.isEmpty();
			case ToUseMacroPlannerPackage.DOMAIN__DATA:
				return data != null && !data.isEmpty();
			case ToUseMacroPlannerPackage.DOMAIN__CHAINS:
				return chains != null && !chains.isEmpty();
			case ToUseMacroPlannerPackage.DOMAIN__SCENARIOS:
				return scenarios != null && !scenarios.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainImpl
