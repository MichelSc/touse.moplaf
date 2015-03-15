/**
 */
package tousesolvercp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Use Solver Cp Folder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tousesolvercp.ToUseSolverCpFolder#getSubFolders <em>Sub Folders</em>}</li>
 *   <li>{@link tousesolvercp.ToUseSolverCpFolder#getName <em>Name</em>}</li>
 *   <li>{@link tousesolvercp.ToUseSolverCpFolder#getToUseGenerators <em>To Use Generators</em>}</li>
 * </ul>
 * </p>
 *
 * @see tousesolvercp.TousesolvercpPackage#getToUseSolverCpFolder()
 * @model
 * @generated
 */
public interface ToUseSolverCpFolder extends EObject {
	/**
	 * Returns the value of the '<em><b>Sub Folders</b></em>' containment reference list.
	 * The list contents are of type {@link tousesolvercp.ToUseSolverCpFolder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Folders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Folders</em>' containment reference list.
	 * @see tousesolvercp.TousesolvercpPackage#getToUseSolverCpFolder_SubFolders()
	 * @model containment="true"
	 * @generated
	 */
	EList<ToUseSolverCpFolder> getSubFolders();

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
	 * @see tousesolvercp.TousesolvercpPackage#getToUseSolverCpFolder_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tousesolvercp.ToUseSolverCpFolder#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>To Use Generators</b></em>' containment reference list.
	 * The list contents are of type {@link tousesolvercp.ToUseSolverCpGenerator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Use Generators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Use Generators</em>' containment reference list.
	 * @see tousesolvercp.TousesolvercpPackage#getToUseSolverCpFolder_ToUseGenerators()
	 * @model containment="true"
	 * @generated
	 */
	EList<ToUseSolverCpGenerator> getToUseGenerators();

} // ToUseSolverCpFolder
