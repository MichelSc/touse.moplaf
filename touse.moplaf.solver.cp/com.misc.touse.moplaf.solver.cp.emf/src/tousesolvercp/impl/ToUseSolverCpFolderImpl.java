/**
 */
package tousesolvercp.impl;

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

import tousesolvercp.ToUseSolverCpFolder;
import tousesolvercp.ToUseSolverCpGenerator;
import tousesolvercp.TousesolvercpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Use Solver Cp Folder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tousesolvercp.impl.ToUseSolverCpFolderImpl#getSubFolders <em>Sub Folders</em>}</li>
 *   <li>{@link tousesolvercp.impl.ToUseSolverCpFolderImpl#getName <em>Name</em>}</li>
 *   <li>{@link tousesolvercp.impl.ToUseSolverCpFolderImpl#getToUseGenerators <em>To Use Generators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToUseSolverCpFolderImpl extends MinimalEObjectImpl.Container implements ToUseSolverCpFolder {
	/**
	 * The cached value of the '{@link #getSubFolders() <em>Sub Folders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubFolders()
	 * @generated
	 * @ordered
	 */
	protected EList<ToUseSolverCpFolder> subFolders;

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
	 * The cached value of the '{@link #getToUseGenerators() <em>To Use Generators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToUseGenerators()
	 * @generated
	 * @ordered
	 */
	protected EList<ToUseSolverCpGenerator> toUseGenerators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUseSolverCpFolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TousesolvercpPackage.Literals.TO_USE_SOLVER_CP_FOLDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ToUseSolverCpFolder> getSubFolders() {
		if (subFolders == null) {
			subFolders = new EObjectContainmentEList<ToUseSolverCpFolder>(ToUseSolverCpFolder.class, this, TousesolvercpPackage.TO_USE_SOLVER_CP_FOLDER__SUB_FOLDERS);
		}
		return subFolders;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TousesolvercpPackage.TO_USE_SOLVER_CP_FOLDER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ToUseSolverCpGenerator> getToUseGenerators() {
		if (toUseGenerators == null) {
			toUseGenerators = new EObjectContainmentEList<ToUseSolverCpGenerator>(ToUseSolverCpGenerator.class, this, TousesolvercpPackage.TO_USE_SOLVER_CP_FOLDER__TO_USE_GENERATORS);
		}
		return toUseGenerators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TousesolvercpPackage.TO_USE_SOLVER_CP_FOLDER__SUB_FOLDERS:
				return ((InternalEList<?>)getSubFolders()).basicRemove(otherEnd, msgs);
			case TousesolvercpPackage.TO_USE_SOLVER_CP_FOLDER__TO_USE_GENERATORS:
				return ((InternalEList<?>)getToUseGenerators()).basicRemove(otherEnd, msgs);
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
			case TousesolvercpPackage.TO_USE_SOLVER_CP_FOLDER__SUB_FOLDERS:
				return getSubFolders();
			case TousesolvercpPackage.TO_USE_SOLVER_CP_FOLDER__NAME:
				return getName();
			case TousesolvercpPackage.TO_USE_SOLVER_CP_FOLDER__TO_USE_GENERATORS:
				return getToUseGenerators();
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
			case TousesolvercpPackage.TO_USE_SOLVER_CP_FOLDER__SUB_FOLDERS:
				getSubFolders().clear();
				getSubFolders().addAll((Collection<? extends ToUseSolverCpFolder>)newValue);
				return;
			case TousesolvercpPackage.TO_USE_SOLVER_CP_FOLDER__NAME:
				setName((String)newValue);
				return;
			case TousesolvercpPackage.TO_USE_SOLVER_CP_FOLDER__TO_USE_GENERATORS:
				getToUseGenerators().clear();
				getToUseGenerators().addAll((Collection<? extends ToUseSolverCpGenerator>)newValue);
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
			case TousesolvercpPackage.TO_USE_SOLVER_CP_FOLDER__SUB_FOLDERS:
				getSubFolders().clear();
				return;
			case TousesolvercpPackage.TO_USE_SOLVER_CP_FOLDER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TousesolvercpPackage.TO_USE_SOLVER_CP_FOLDER__TO_USE_GENERATORS:
				getToUseGenerators().clear();
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
			case TousesolvercpPackage.TO_USE_SOLVER_CP_FOLDER__SUB_FOLDERS:
				return subFolders != null && !subFolders.isEmpty();
			case TousesolvercpPackage.TO_USE_SOLVER_CP_FOLDER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TousesolvercpPackage.TO_USE_SOLVER_CP_FOLDER__TO_USE_GENERATORS:
				return toUseGenerators != null && !toUseGenerators.isEmpty();
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

} //ToUseSolverCpFolderImpl
