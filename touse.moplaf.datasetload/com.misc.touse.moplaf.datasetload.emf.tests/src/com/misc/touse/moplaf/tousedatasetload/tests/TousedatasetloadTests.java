/**
 */
package com.misc.touse.moplaf.tousedatasetload.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>tousedatasetload</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class TousedatasetloadTests extends TestSuite {

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
		TestSuite suite = new TousedatasetloadTests("tousedatasetload Tests");
		suite.addTestSuite(FPDTest.class);
		suite.addTestSuite(FPDGroupSortingPlanTest.class);
		suite.addTestSuite(FPDSortingPlansTest.class);
		suite.addTestSuite(FPDSortingPlanInputsTest.class);
		suite.addTestSuite(FPDSortingPlanTest.class);
		suite.addTestSuite(FPDSortingPlanInputTest.class);
		suite.addTestSuite(MariaDbTestDatabaseTest.class);
		suite.addTestSuite(MariaDbTestGroupTablesTest.class);
		suite.addTestSuite(MariaDbTestTableTest.class);
		suite.addTestSuite(MariaDbTestRowTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TousedatasetloadTests(String name) {
		super(name);
	}

} //TousedatasetloadTests
