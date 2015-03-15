/**
 */
package com.misc.touse.moplaf.touseflock.impl;

import com.misc.common.moplaf.flock.ChainConfiguration;
import com.misc.common.moplaf.flock.FlockFactory;
import com.misc.common.moplaf.propagator.Util;
import com.misc.touse.moplaf.touseflock.ToUseResource;
import com.misc.touse.moplaf.touseflock.ToUseResourceConfiguration;
import com.misc.touse.moplaf.touseflock.TouseflockPackage;
import com.misc.touse.moplaf.touseflock.calc.PropagatorCalcToUseResourceConfigurationChainConfiguration;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Use Resource Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.touseflock.impl.ToUseResourceConfigurationImpl#getChainConfiguration <em>Chain Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ToUseResourceConfigurationImpl extends ToUseResourceTransitionImpl implements ToUseResourceConfiguration {
	/**
	 * The cached value of the '{@link #getChainConfiguration() <em>Chain Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChainConfiguration()
	 * @generated
	 * @ordered
	 */
	protected ChainConfiguration chainConfiguration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected ToUseResourceConfigurationImpl() {
		super();
		Util.adapt(this, PropagatorCalcToUseResourceConfigurationChainConfiguration.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TouseflockPackage.Literals.TO_USE_RESOURCE_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainConfiguration getChainConfiguration() {
		return chainConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChainConfiguration(ChainConfiguration newChainConfiguration, NotificationChain msgs) {
		ChainConfiguration oldChainConfiguration = chainConfiguration;
		chainConfiguration = newChainConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TouseflockPackage.TO_USE_RESOURCE_CONFIGURATION__CHAIN_CONFIGURATION, oldChainConfiguration, newChainConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChainConfiguration(ChainConfiguration newChainConfiguration) {
		if (newChainConfiguration != chainConfiguration) {
			NotificationChain msgs = null;
			if (chainConfiguration != null)
				msgs = ((InternalEObject)chainConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TouseflockPackage.TO_USE_RESOURCE_CONFIGURATION__CHAIN_CONFIGURATION, null, msgs);
			if (newChainConfiguration != null)
				msgs = ((InternalEObject)newChainConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TouseflockPackage.TO_USE_RESOURCE_CONFIGURATION__CHAIN_CONFIGURATION, null, msgs);
			msgs = basicSetChainConfiguration(newChainConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouseflockPackage.TO_USE_RESOURCE_CONFIGURATION__CHAIN_CONFIGURATION, newChainConfiguration, newChainConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshChainConfiguration() {
		ToUseResource resource = this.getResource(); // this is not null because set is guaranteed to occur before by propagator
		ChainConfiguration chainConfiguration = this.getChainConfiguration();
		boolean tobe = resource!=null && resource.getChain()!=null;
		boolean asis = chainConfiguration!=null;
		if ( asis && !tobe){
			chainConfiguration.setChain(null);
			this.setChainConfiguration(null); //owning
		}
		else if ( !asis && tobe){
			// add chain configuration
			chainConfiguration = FlockFactory.eINSTANCE.createChainConfiguration();
			this.setChainConfiguration(chainConfiguration); // owning
			chainConfiguration.setChain(resource.getChain()); 
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TouseflockPackage.TO_USE_RESOURCE_CONFIGURATION__CHAIN_CONFIGURATION:
				return basicSetChainConfiguration(null, msgs);
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
			case TouseflockPackage.TO_USE_RESOURCE_CONFIGURATION__CHAIN_CONFIGURATION:
				return getChainConfiguration();
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
			case TouseflockPackage.TO_USE_RESOURCE_CONFIGURATION__CHAIN_CONFIGURATION:
				setChainConfiguration((ChainConfiguration)newValue);
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
			case TouseflockPackage.TO_USE_RESOURCE_CONFIGURATION__CHAIN_CONFIGURATION:
				setChainConfiguration((ChainConfiguration)null);
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
			case TouseflockPackage.TO_USE_RESOURCE_CONFIGURATION__CHAIN_CONFIGURATION:
				return chainConfiguration != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TouseflockPackage.TO_USE_RESOURCE_CONFIGURATION___REFRESH_CHAIN_CONFIGURATION:
				refreshChainConfiguration();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}
	
	

} //ToUseResourceConfigurationImpl
