/**
 */
package com.misc.touse.moplaf.touseflock.impl;

import com.misc.common.moplaf.flock.Chain;
import com.misc.common.moplaf.flock.FlockFactory;
import com.misc.common.moplaf.propagator.Util;
import com.misc.touse.moplaf.touseflock.ToUseDomain;
import com.misc.touse.moplaf.touseflock.ToUseResource;
import com.misc.touse.moplaf.touseflock.TouseflockPackage;
import com.misc.touse.moplaf.touseflock.calc.PropagatorCalcToUseResourceChain;
import com.misc.touse.moplaf.touseflock.calc.PropagatorLayerToUseResourceTransition;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Use Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.touseflock.impl.ToUseResourceImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.touseflock.impl.ToUseResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.touseflock.impl.ToUseResourceImpl#getChain <em>Chain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ToUseResourceImpl extends MinimalEObjectImpl.Container implements ToUseResource {
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
	 * The cached value of the '{@link #getChain() <em>Chain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChain()
	 * @generated
	 * @ordered
	 */
	protected Chain chain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected ToUseResourceImpl() {
		super();
		Util.adapt(this, PropagatorCalcToUseResourceChain.class);
		Util.adapt(this, PropagatorLayerToUseResourceTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TouseflockPackage.Literals.TO_USE_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseDomain getDomain() {
		if (eContainerFeatureID() != TouseflockPackage.TO_USE_RESOURCE__DOMAIN) return null;
		return (ToUseDomain)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomain(ToUseDomain newDomain, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDomain, TouseflockPackage.TO_USE_RESOURCE__DOMAIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(ToUseDomain newDomain) {
		if (newDomain != eInternalContainer() || (eContainerFeatureID() != TouseflockPackage.TO_USE_RESOURCE__DOMAIN && newDomain != null)) {
			if (EcoreUtil.isAncestor(this, newDomain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDomain != null)
				msgs = ((InternalEObject)newDomain).eInverseAdd(this, TouseflockPackage.TO_USE_DOMAIN__RESOURCE, ToUseDomain.class, msgs);
			msgs = basicSetDomain(newDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouseflockPackage.TO_USE_RESOURCE__DOMAIN, newDomain, newDomain));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouseflockPackage.TO_USE_RESOURCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chain getChain() {
		return chain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChain(Chain newChain, NotificationChain msgs) {
		Chain oldChain = chain;
		chain = newChain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TouseflockPackage.TO_USE_RESOURCE__CHAIN, oldChain, newChain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChain(Chain newChain) {
		if (newChain != chain) {
			NotificationChain msgs = null;
			if (chain != null)
				msgs = ((InternalEObject)chain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TouseflockPackage.TO_USE_RESOURCE__CHAIN, null, msgs);
			if (newChain != null)
				msgs = ((InternalEObject)newChain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TouseflockPackage.TO_USE_RESOURCE__CHAIN, null, msgs);
			msgs = basicSetChain(newChain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouseflockPackage.TO_USE_RESOURCE__CHAIN, newChain, newChain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshChain() {
		ToUseDomain domain = this.getDomain();
		boolean tobe = domain != null && domain.getFlockScope()!=null;
		Chain thisChain = this.getChain();
		boolean asis = thisChain!=null;
		if ( !asis  && tobe){
			// create Chain
			Chain newChain = FlockFactory.eINSTANCE.createChain();
			this.setChain(newChain);
			newChain.setFlockScope(domain.getFlockScope());
		} 
		else if ( asis && !tobe){
			// remove Chain
			this.setChain(null);
			thisChain.setFlockScope(null);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TouseflockPackage.TO_USE_RESOURCE__DOMAIN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDomain((ToUseDomain)otherEnd, msgs);
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
			case TouseflockPackage.TO_USE_RESOURCE__DOMAIN:
				return basicSetDomain(null, msgs);
			case TouseflockPackage.TO_USE_RESOURCE__CHAIN:
				return basicSetChain(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case TouseflockPackage.TO_USE_RESOURCE__DOMAIN:
				return eInternalContainer().eInverseRemove(this, TouseflockPackage.TO_USE_DOMAIN__RESOURCE, ToUseDomain.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TouseflockPackage.TO_USE_RESOURCE__DOMAIN:
				return getDomain();
			case TouseflockPackage.TO_USE_RESOURCE__NAME:
				return getName();
			case TouseflockPackage.TO_USE_RESOURCE__CHAIN:
				return getChain();
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
			case TouseflockPackage.TO_USE_RESOURCE__DOMAIN:
				setDomain((ToUseDomain)newValue);
				return;
			case TouseflockPackage.TO_USE_RESOURCE__NAME:
				setName((String)newValue);
				return;
			case TouseflockPackage.TO_USE_RESOURCE__CHAIN:
				setChain((Chain)newValue);
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
			case TouseflockPackage.TO_USE_RESOURCE__DOMAIN:
				setDomain((ToUseDomain)null);
				return;
			case TouseflockPackage.TO_USE_RESOURCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TouseflockPackage.TO_USE_RESOURCE__CHAIN:
				setChain((Chain)null);
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
			case TouseflockPackage.TO_USE_RESOURCE__DOMAIN:
				return getDomain() != null;
			case TouseflockPackage.TO_USE_RESOURCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TouseflockPackage.TO_USE_RESOURCE__CHAIN:
				return chain != null;
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
			case TouseflockPackage.TO_USE_RESOURCE___REFRESH_CHAIN:
				refreshChain();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ToUseResourceImpl
