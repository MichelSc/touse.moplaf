/**
 */
package com.misc.touse.moplaf.solver.tousesolverlp.impl;

import com.misc.touse.moplaf.solver.tousesolverlp.Folder;
import com.misc.touse.moplaf.solver.tousesolverlp.ToUseGenerator;
import com.misc.touse.moplaf.solver.tousesolverlp.ToUseSolverLpPackage;

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
 * An implementation of the model object '<em><b>Folder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolverlp.impl.FolderImpl#getSubFolders <em>Sub Folders</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolverlp.impl.FolderImpl#getGenerators <em>Generators</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolverlp.impl.FolderImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FolderImpl extends MinimalEObjectImpl.Container implements Folder {
	/**
	 * The cached value of the '{@link #getSubFolders() <em>Sub Folders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubFolders()
	 * @generated
	 * @ordered
	 */
	protected EList<Folder> subFolders;

	/**
	 * The cached value of the '{@link #getGenerators() <em>Generators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerators()
	 * @generated
	 * @ordered
	 */
	protected EList<ToUseGenerator> generators;

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
	protected FolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseSolverLpPackage.Literals.FOLDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Folder> getSubFolders() {
		if (subFolders == null) {
			subFolders = new EObjectContainmentEList<Folder>(Folder.class, this, ToUseSolverLpPackage.FOLDER__SUB_FOLDERS);
		}
		return subFolders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ToUseGenerator> getGenerators() {
		if (generators == null) {
			generators = new EObjectContainmentEList<ToUseGenerator>(ToUseGenerator.class, this, ToUseSolverLpPackage.FOLDER__GENERATORS);
		}
		return generators;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSolverLpPackage.FOLDER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToUseSolverLpPackage.FOLDER__SUB_FOLDERS:
				return ((InternalEList<?>)getSubFolders()).basicRemove(otherEnd, msgs);
			case ToUseSolverLpPackage.FOLDER__GENERATORS:
				return ((InternalEList<?>)getGenerators()).basicRemove(otherEnd, msgs);
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
			case ToUseSolverLpPackage.FOLDER__SUB_FOLDERS:
				return getSubFolders();
			case ToUseSolverLpPackage.FOLDER__GENERATORS:
				return getGenerators();
			case ToUseSolverLpPackage.FOLDER__NAME:
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
			case ToUseSolverLpPackage.FOLDER__SUB_FOLDERS:
				getSubFolders().clear();
				getSubFolders().addAll((Collection<? extends Folder>)newValue);
				return;
			case ToUseSolverLpPackage.FOLDER__GENERATORS:
				getGenerators().clear();
				getGenerators().addAll((Collection<? extends ToUseGenerator>)newValue);
				return;
			case ToUseSolverLpPackage.FOLDER__NAME:
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
			case ToUseSolverLpPackage.FOLDER__SUB_FOLDERS:
				getSubFolders().clear();
				return;
			case ToUseSolverLpPackage.FOLDER__GENERATORS:
				getGenerators().clear();
				return;
			case ToUseSolverLpPackage.FOLDER__NAME:
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
			case ToUseSolverLpPackage.FOLDER__SUB_FOLDERS:
				return subFolders != null && !subFolders.isEmpty();
			case ToUseSolverLpPackage.FOLDER__GENERATORS:
				return generators != null && !generators.isEmpty();
			case ToUseSolverLpPackage.FOLDER__NAME:
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

} //FolderImpl
