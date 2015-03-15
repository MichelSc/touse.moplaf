/**
 */
package com.misc.touse.moplaf.solver.tousesolver;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage
 * @generated
 */
public interface TousesolverFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TousesolverFactory eINSTANCE = com.misc.touse.moplaf.solver.tousesolver.impl.TousesolverFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain</em>'.
	 * @generated
	 */
	Domain createDomain();

	/**
	 * Returns a new object of class '<em>Knapsack</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Knapsack</em>'.
	 * @generated
	 */
	Knapsack createKnapsack();

	/**
	 * Returns a new object of class '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item</em>'.
	 * @generated
	 */
	Item createItem();

	/**
	 * Returns a new object of class '<em>Domain Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Object</em>'.
	 * @generated
	 */
	DomainObject createDomainObject();

	/**
	 * Returns a new object of class '<em>Domain Object Folder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Object Folder</em>'.
	 * @generated
	 */
	DomainObjectFolder createDomainObjectFolder();

	/**
	 * Returns a new object of class '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario</em>'.
	 * @generated
	 */
	Scenario createScenario();

	/**
	 * Returns a new object of class '<em>Knapsack Sol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Knapsack Sol</em>'.
	 * @generated
	 */
	KnapsackSol createKnapsackSol();

	/**
	 * Returns a new object of class '<em>Knapsack Lp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Knapsack Lp</em>'.
	 * @generated
	 */
	KnapsackLp createKnapsackLp();

	/**
	 * Returns a new object of class '<em>Lp Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lp Root</em>'.
	 * @generated
	 */
	LpRoot createLpRoot();

	/**
	 * Returns a new object of class '<em>Lp Knapsack</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lp Knapsack</em>'.
	 * @generated
	 */
	LpKnapsack createLpKnapsack();

	/**
	 * Returns a new object of class '<em>Lp Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lp Item</em>'.
	 * @generated
	 */
	LpItem createLpItem();

	/**
	 * Returns a new object of class '<em>Var Item In Knapsack</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Var Item In Knapsack</em>'.
	 * @generated
	 */
	VarItemInKnapsack createVarItemInKnapsack();

	/**
	 * Returns a new object of class '<em>Cons Knapsack Capacity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cons Knapsack Capacity</em>'.
	 * @generated
	 */
	ConsKnapsackCapacity createConsKnapsackCapacity();

	/**
	 * Returns a new object of class '<em>Solver To Use GLPK</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solver To Use GLPK</em>'.
	 * @generated
	 */
	SolverToUseGLPK createSolverToUseGLPK();

	/**
	 * Returns a new object of class '<em>Solver To Use Java ILP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solver To Use Java ILP</em>'.
	 * @generated
	 */
	SolverToUseJavaILP createSolverToUseJavaILP();

	/**
	 * Returns a new object of class '<em>Solver To Use Neos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solver To Use Neos</em>'.
	 * @generated
	 */
	SolverToUseNeos createSolverToUseNeos();

	/**
	 * Returns a new object of class '<em>Solution Reader To Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solution Reader To Use</em>'.
	 * @generated
	 */
	SolutionReaderToUse createSolutionReaderToUse();

	/**
	 * Returns a new object of class '<em>Solver To User Cplex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solver To User Cplex</em>'.
	 * @generated
	 */
	SolverToUserCplex createSolverToUserCplex();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TousesolverPackage getTousesolverPackage();

} //TousesolverFactory
