/**
 */
package com.misc.touse.moplaf.macroplanner.impl;

import com.misc.common.moplaf.macroplanner.SupplyChainData;
import com.misc.common.moplaf.macroplanner.SupplyChainLimits;
import com.misc.common.moplaf.macroplanner.SupplyChainMasterData;
import com.misc.common.moplaf.macroplanner.SupplyChainRoutings;
import com.misc.touse.moplaf.macroplanner.Domain;
import com.misc.touse.moplaf.macroplanner.ToUseMacroPlannerPackage;

import com.misc.touse.moplaf.macroplanner.ToUseScenario;
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
 *   <li>{@link com.misc.touse.moplaf.macroplanner.impl.DomainImpl#getLimits <em>Limits</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.macroplanner.impl.DomainImpl#getRoutings <em>Routings</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.macroplanner.impl.DomainImpl#getData <em>Data</em>}</li>
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
	 * The cached value of the '{@link #getLimits() <em>Limits</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimits()
	 * @generated
	 * @ordered
	 */
	protected EList<SupplyChainLimits> limits;

	/**
	 * The cached value of the '{@link #getRoutings() <em>Routings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutings()
	 * @generated
	 * @ordered
	 */
	protected EList<SupplyChainRoutings> routings;

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
	 * The cached value of the '{@link #getScenarios() <em>Scenarios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarios()
	 * @generated
	 * @ordered
	 */
	protected EList<ToUseScenario> scenarios;

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
	public EList<SupplyChainRoutings> getRoutings() {
		if (routings == null) {
			routings = new EObjectContainmentEList<SupplyChainRoutings>(SupplyChainRoutings.class, this, ToUseMacroPlannerPackage.DOMAIN__ROUTINGS);
		}
		return routings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ToUseScenario> getScenarios() {
		if (scenarios == null) {
			scenarios = new EObjectContainmentEList<ToUseScenario>(ToUseScenario.class, this, ToUseMacroPlannerPackage.DOMAIN__SCENARIOS);
		}
		return scenarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupplyChainLimits> getLimits() {
		if (limits == null) {
			limits = new EObjectContainmentEList<SupplyChainLimits>(SupplyChainLimits.class, this, ToUseMacroPlannerPackage.DOMAIN__LIMITS);
		}
		return limits;
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
			case ToUseMacroPlannerPackage.DOMAIN__LIMITS:
				return ((InternalEList<?>)getLimits()).basicRemove(otherEnd, msgs);
			case ToUseMacroPlannerPackage.DOMAIN__ROUTINGS:
				return ((InternalEList<?>)getRoutings()).basicRemove(otherEnd, msgs);
			case ToUseMacroPlannerPackage.DOMAIN__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
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
			case ToUseMacroPlannerPackage.DOMAIN__LIMITS:
				return getLimits();
			case ToUseMacroPlannerPackage.DOMAIN__ROUTINGS:
				return getRoutings();
			case ToUseMacroPlannerPackage.DOMAIN__DATA:
				return getData();
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
			case ToUseMacroPlannerPackage.DOMAIN__LIMITS:
				getLimits().clear();
				getLimits().addAll((Collection<? extends SupplyChainLimits>)newValue);
				return;
			case ToUseMacroPlannerPackage.DOMAIN__ROUTINGS:
				getRoutings().clear();
				getRoutings().addAll((Collection<? extends SupplyChainRoutings>)newValue);
				return;
			case ToUseMacroPlannerPackage.DOMAIN__DATA:
				getData().clear();
				getData().addAll((Collection<? extends SupplyChainData>)newValue);
				return;
			case ToUseMacroPlannerPackage.DOMAIN__SCENARIOS:
				getScenarios().clear();
				getScenarios().addAll((Collection<? extends ToUseScenario>)newValue);
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
			case ToUseMacroPlannerPackage.DOMAIN__LIMITS:
				getLimits().clear();
				return;
			case ToUseMacroPlannerPackage.DOMAIN__ROUTINGS:
				getRoutings().clear();
				return;
			case ToUseMacroPlannerPackage.DOMAIN__DATA:
				getData().clear();
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
			case ToUseMacroPlannerPackage.DOMAIN__LIMITS:
				return limits != null && !limits.isEmpty();
			case ToUseMacroPlannerPackage.DOMAIN__ROUTINGS:
				return routings != null && !routings.isEmpty();
			case ToUseMacroPlannerPackage.DOMAIN__DATA:
				return data != null && !data.isEmpty();
			case ToUseMacroPlannerPackage.DOMAIN__SCENARIOS:
				return scenarios != null && !scenarios.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainImpl
