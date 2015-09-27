/**
 */
package com.misc.touse.moplaf.report.ToUseReport;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Folder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.report.ToUseReport.Folder#getAs <em>As</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.report.ToUseReport.Folder#getSubFolders <em>Sub Folders</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.report.ToUseReport.Folder#getReporta <em>Reporta</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.report.ToUseReport.Folder#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf.report.ToUseReport.ToUseReportPackage#getFolder()
 * @model
 * @generated
 */
public interface Folder extends EObject {
	/**
	 * Returns the value of the '<em><b>As</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.report.ToUseReport.A}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>As</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>As</em>' containment reference list.
	 * @see com.misc.touse.moplaf.report.ToUseReport.ToUseReportPackage#getFolder_As()
	 * @model containment="true"
	 * @generated
	 */
	EList<A> getAs();

	/**
	 * Returns the value of the '<em><b>Sub Folders</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.report.ToUseReport.Folder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Folders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Folders</em>' containment reference list.
	 * @see com.misc.touse.moplaf.report.ToUseReport.ToUseReportPackage#getFolder_SubFolders()
	 * @model containment="true"
	 * @generated
	 */
	EList<Folder> getSubFolders();

	/**
	 * Returns the value of the '<em><b>Reporta</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf.report.ToUseReport.ReportA}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reporta</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reporta</em>' containment reference list.
	 * @see com.misc.touse.moplaf.report.ToUseReport.ToUseReportPackage#getFolder_Reporta()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReportA> getReporta();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.misc.touse.moplaf.report.ToUseReport.ToUseReportPackage#getFolder_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf.report.ToUseReport.Folder#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Folder
