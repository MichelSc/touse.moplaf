/**
 */
package tousesolvercp.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>tousesolvercp</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class TousesolvercpTests extends TestSuite {

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
		TestSuite suite = new TousesolvercpTests("tousesolvercp Tests");
		suite.addTestSuite(ToUseSolverCpGeneratorTest.class);
		suite.addTestSuite(ToUseSolverCpTupleTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TousesolvercpTests(String name) {
		super(name);
	}

} //TousesolvercpTests
