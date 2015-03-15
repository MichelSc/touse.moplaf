/**
 */
package com.misc.touse.moplaf.solver.tousesolver.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>tousesolver</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class TousesolverTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new TousesolverTests("tousesolver Tests");
		suite.addTestSuite(KnapsackLpTest.class);
		suite.addTestSuite(LpRootTest.class);
		suite.addTestSuite(LpKnapsackTest.class);
		suite.addTestSuite(LpItemTest.class);
		suite.addTestSuite(VarItemInKnapsackTest.class);
		suite.addTestSuite(ConsKnapsackCapacityTest.class);
		suite.addTestSuite(SolverToUseGLPKTest.class);
		suite.addTestSuite(SolverToUseJavaILPTest.class);
		suite.addTestSuite(SolverToUseNeosTest.class);
		suite.addTestSuite(SolutionReaderToUseTest.class);
		suite.addTestSuite(SolverToUserCplexTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TousesolverTests(String name) {
		super(name);
	}

} //TousesolverTests
