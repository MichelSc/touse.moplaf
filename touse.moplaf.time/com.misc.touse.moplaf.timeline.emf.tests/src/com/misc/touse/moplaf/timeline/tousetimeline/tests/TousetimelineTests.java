/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>tousetimeline</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class TousetimelineTests extends TestSuite {

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
		TestSuite suite = new TousetimelineTests("tousetimeline Tests");
		suite.addTestSuite(DomainTest.class);
		suite.addTestSuite(DomainDistributionTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TousetimelineTests(String name) {
		super(name);
	}

} //TousetimelineTests