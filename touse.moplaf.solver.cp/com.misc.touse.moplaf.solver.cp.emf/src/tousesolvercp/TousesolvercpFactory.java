/**
 */
package tousesolvercp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tousesolvercp.TousesolvercpPackage
 * @generated
 */
public interface TousesolvercpFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TousesolvercpFactory eINSTANCE = tousesolvercp.impl.TousesolvercpFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>To Use Solver Cp Folder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>To Use Solver Cp Folder</em>'.
	 * @generated
	 */
	ToUseSolverCpFolder createToUseSolverCpFolder();

	/**
	 * Returns a new object of class '<em>To Use Solver Cp Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>To Use Solver Cp Generator</em>'.
	 * @generated
	 */
	ToUseSolverCpGenerator createToUseSolverCpGenerator();

	/**
	 * Returns a new object of class '<em>To Use Solver Cp Tuple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>To Use Solver Cp Tuple</em>'.
	 * @generated
	 */
	ToUseSolverCpTuple createToUseSolverCpTuple();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TousesolvercpPackage getTousesolvercpPackage();

} //TousesolvercpFactory
