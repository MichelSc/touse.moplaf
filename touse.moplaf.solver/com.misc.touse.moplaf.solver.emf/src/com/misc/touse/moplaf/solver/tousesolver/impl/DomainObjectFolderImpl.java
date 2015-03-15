/**
 */
package com.misc.touse.moplaf.solver.tousesolver.impl;

import com.misc.touse.moplaf.solver.tousesolver.DomainObject;
import com.misc.touse.moplaf.solver.tousesolver.DomainObjectFolder;
import com.misc.touse.moplaf.solver.tousesolver.Scenario;
import com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Object Folder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.impl.DomainObjectFolderImpl#getObject <em>Object</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.impl.DomainObjectFolderImpl#getSubFolder <em>Sub Folder</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.impl.DomainObjectFolderImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.impl.DomainObjectFolderImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainObjectFolderImpl extends MinimalEObjectImpl.Container implements DomainObjectFolder {
	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainObject> object;

	/**
	 * The cached value of the '{@link #getSubFolder() <em>Sub Folder</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubFolder()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainObjectFolder> subFolder;

	/**
	 * The cached value of the '{@link #getScenario() <em>Scenario</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenario()
	 * @generated
	 * @ordered
	 */
	protected EList<Scenario> scenario;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainObjectFolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TousesolverPackage.Literals.DOMAIN_OBJECT_FOLDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainObject> getObject() {
		if (object == null) {
			object = new EObjectContainmentEList<DomainObject>(DomainObject.class, this, TousesolverPackage.DOMAIN_OBJECT_FOLDER__OBJECT);
		}
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainObjectFolder> getSubFolder() {
		if (subFolder == null) {
			subFolder = new EObjectContainmentEList<DomainObjectFolder>(DomainObjectFolder.class, this, TousesolverPackage.DOMAIN_OBJECT_FOLDER__SUB_FOLDER);
		}
		return subFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scenario> getScenario() {
		if (scenario == null) {
			scenario = new EObjectContainmentEList<Scenario>(Scenario.class, this, TousesolverPackage.DOMAIN_OBJECT_FOLDER__SCENARIO);
		}
		return scenario;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TousesolverPackage.DOMAIN_OBJECT_FOLDER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TousesolverPackage.DOMAIN_OBJECT_FOLDER__OBJECT:
				return ((InternalEList<?>)getObject()).basicRemove(otherEnd, msgs);
			case TousesolverPackage.DOMAIN_OBJECT_FOLDER__SUB_FOLDER:
				return ((InternalEList<?>)getSubFolder()).basicRemove(otherEnd, msgs);
			case TousesolverPackage.DOMAIN_OBJECT_FOLDER__SCENARIO:
				return ((InternalEList<?>)getScenario()).basicRemove(otherEnd, msgs);
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
			case TousesolverPackage.DOMAIN_OBJECT_FOLDER__OBJECT:
				return getObject();
			case TousesolverPackage.DOMAIN_OBJECT_FOLDER__SUB_FOLDER:
				return getSubFolder();
			case TousesolverPackage.DOMAIN_OBJECT_FOLDER__SCENARIO:
				return getScenario();
			case TousesolverPackage.DOMAIN_OBJECT_FOLDER__NAME:
				return getName();
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
			case TousesolverPackage.DOMAIN_OBJECT_FOLDER__OBJECT:
				getObject().clear();
				getObject().addAll((Collection<? extends DomainObject>)newValue);
				return;
			case TousesolverPackage.DOMAIN_OBJECT_FOLDER__SUB_FOLDER:
				getSubFolder().clear();
				getSubFolder().addAll((Collection<? extends DomainObjectFolder>)newValue);
				return;
			case TousesolverPackage.DOMAIN_OBJECT_FOLDER__SCENARIO:
				getScenario().clear();
				getScenario().addAll((Collection<? extends Scenario>)newValue);
				return;
			case TousesolverPackage.DOMAIN_OBJECT_FOLDER__NAME:
				setName((String)newValue);
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
			case TousesolverPackage.DOMAIN_OBJECT_FOLDER__OBJECT:
				getObject().clear();
				return;
			case TousesolverPackage.DOMAIN_OBJECT_FOLDER__SUB_FOLDER:
				getSubFolder().clear();
				return;
			case TousesolverPackage.DOMAIN_OBJECT_FOLDER__SCENARIO:
				getScenario().clear();
				return;
			case TousesolverPackage.DOMAIN_OBJECT_FOLDER__NAME:
				setName(NAME_EDEFAULT);
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
			case TousesolverPackage.DOMAIN_OBJECT_FOLDER__OBJECT:
				return object != null && !object.isEmpty();
			case TousesolverPackage.DOMAIN_OBJECT_FOLDER__SUB_FOLDER:
				return subFolder != null && !subFolder.isEmpty();
			case TousesolverPackage.DOMAIN_OBJECT_FOLDER__SCENARIO:
				return scenario != null && !scenario.isEmpty();
			case TousesolverPackage.DOMAIN_OBJECT_FOLDER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DomainObjectFolderImpl
