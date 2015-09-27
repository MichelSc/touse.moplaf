/**
 */
package com.misc.touse.moplaf.report.ToUseReport.impl;

import com.misc.touse.moplaf.report.ToUseReport.A;
import com.misc.touse.moplaf.report.ToUseReport.Folder;
import com.misc.touse.moplaf.report.ToUseReport.ReportA;
import com.misc.touse.moplaf.report.ToUseReport.ToUseReportPackage;

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
 *   <li>{@link com.misc.touse.moplaf.report.ToUseReport.impl.FolderImpl#getAs <em>As</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.report.ToUseReport.impl.FolderImpl#getSubFolders <em>Sub Folders</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.report.ToUseReport.impl.FolderImpl#getReporta <em>Reporta</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.report.ToUseReport.impl.FolderImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FolderImpl extends MinimalEObjectImpl.Container implements Folder {
	/**
	 * The cached value of the '{@link #getAs() <em>As</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAs()
	 * @generated
	 * @ordered
	 */
	protected EList<A> as;

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
	 * The cached value of the '{@link #getReporta() <em>Reporta</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReporta()
	 * @generated
	 * @ordered
	 */
	protected EList<ReportA> reporta;

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
		return ToUseReportPackage.Literals.FOLDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<A> getAs() {
		if (as == null) {
			as = new EObjectContainmentEList<A>(A.class, this, ToUseReportPackage.FOLDER__AS);
		}
		return as;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Folder> getSubFolders() {
		if (subFolders == null) {
			subFolders = new EObjectContainmentEList<Folder>(Folder.class, this, ToUseReportPackage.FOLDER__SUB_FOLDERS);
		}
		return subFolders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReportA> getReporta() {
		if (reporta == null) {
			reporta = new EObjectContainmentEList<ReportA>(ReportA.class, this, ToUseReportPackage.FOLDER__REPORTA);
		}
		return reporta;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseReportPackage.FOLDER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToUseReportPackage.FOLDER__AS:
				return ((InternalEList<?>)getAs()).basicRemove(otherEnd, msgs);
			case ToUseReportPackage.FOLDER__SUB_FOLDERS:
				return ((InternalEList<?>)getSubFolders()).basicRemove(otherEnd, msgs);
			case ToUseReportPackage.FOLDER__REPORTA:
				return ((InternalEList<?>)getReporta()).basicRemove(otherEnd, msgs);
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
			case ToUseReportPackage.FOLDER__AS:
				return getAs();
			case ToUseReportPackage.FOLDER__SUB_FOLDERS:
				return getSubFolders();
			case ToUseReportPackage.FOLDER__REPORTA:
				return getReporta();
			case ToUseReportPackage.FOLDER__NAME:
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
			case ToUseReportPackage.FOLDER__AS:
				getAs().clear();
				getAs().addAll((Collection<? extends A>)newValue);
				return;
			case ToUseReportPackage.FOLDER__SUB_FOLDERS:
				getSubFolders().clear();
				getSubFolders().addAll((Collection<? extends Folder>)newValue);
				return;
			case ToUseReportPackage.FOLDER__REPORTA:
				getReporta().clear();
				getReporta().addAll((Collection<? extends ReportA>)newValue);
				return;
			case ToUseReportPackage.FOLDER__NAME:
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
			case ToUseReportPackage.FOLDER__AS:
				getAs().clear();
				return;
			case ToUseReportPackage.FOLDER__SUB_FOLDERS:
				getSubFolders().clear();
				return;
			case ToUseReportPackage.FOLDER__REPORTA:
				getReporta().clear();
				return;
			case ToUseReportPackage.FOLDER__NAME:
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
			case ToUseReportPackage.FOLDER__AS:
				return as != null && !as.isEmpty();
			case ToUseReportPackage.FOLDER__SUB_FOLDERS:
				return subFolders != null && !subFolders.isEmpty();
			case ToUseReportPackage.FOLDER__REPORTA:
				return reporta != null && !reporta.isEmpty();
			case ToUseReportPackage.FOLDER__NAME:
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
