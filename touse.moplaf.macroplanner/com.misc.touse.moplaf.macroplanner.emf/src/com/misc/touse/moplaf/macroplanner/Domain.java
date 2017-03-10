/**
 */
package com.misc.touse.moplaf.macroplanner;

import com.misc.common.moplaf.macroplanner.SupplyChainData;
import com.misc.common.moplaf.macroplanner.SupplyChainMasterData;
import com.misc.common.moplaf.macroplanner.SupplyChainRoutings;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.macroplanner.Domain#getMasterData <em>Master Data</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.macroplanner.Domain#getData <em>Data</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.macroplanner.Domain#getChains <em>Chains</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.macroplanner.Domain#getScenarios <em>Scenarios</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.macroplanner.ToUseMacroPlannerPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>Master Data</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.SupplyChainMasterData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Master Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Data</em>' containment reference list.
	 * @see com.misc.touse.moplaf.macroplanner.ToUseMacroPlannerPackage#getDomain_MasterData()
	 * @model containment="true"
	 * @generated
	 */
	EList<SupplyChainMasterData> getMasterData();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.SupplyChainData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see com.misc.touse.moplaf.macroplanner.ToUseMacroPlannerPackage#getDomain_Data()
	 * @model containment="true"
	 * @generated
	 */
	EList<SupplyChainData> getData();

	/**
	 * Returns the value of the '<em><b>Chains</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.SupplyChainRoutings}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chains</em>' containment reference list.
	 * @see com.misc.touse.moplaf.macroplanner.ToUseMacroPlannerPackage#getDomain_Chains()
	 * @model containment="true"
	 * @generated
	 */
	EList<SupplyChainRoutings> getChains();

	/**
	 * Returns the value of the '<em><b>Scenarios</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.macroplanner.ToUseScenario}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenarios</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenarios</em>' containment reference list.
	 * @see com.misc.touse.moplaf.macroplanner.ToUseMacroPlannerPackage#getDomain_Scenarios()
	 * @model containment="true"
	 * @generated
	 */
	EList<ToUseScenario> getScenarios();

} // Domain
