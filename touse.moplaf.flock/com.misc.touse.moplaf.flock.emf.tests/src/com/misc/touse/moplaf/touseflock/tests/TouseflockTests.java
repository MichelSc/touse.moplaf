/**
 */
package com.misc.touse.moplaf.touseflock.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>touseflock</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class TouseflockTests extends TestSuite {

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
		TestSuite suite = new TouseflockTests("touseflock Tests");
		suite.addTestSuite(ToUseDomainTest.class);
		suite.addTestSuite(ToUseResourceTransitionTest.class);
		suite.addTestSuite(ToUseResourceConfigurationTest.class);
		suite.addTestSuite(ToUseResourceMountTest.class);
		suite.addTestSuite(TractorTest.class);
		suite.addTestSuite(TrailerTest.class);
		suite.addTestSuite(ShipmentTest.class);
		suite.addTestSuite(TractorConfigurationTest.class);
		suite.addTestSuite(AttachTrailerTest.class);
		suite.addTestSuite(DetachTrailerTest.class);
		suite.addTestSuite(TrailerConfigurationTest.class);
		suite.addTestSuite(LoadShipmentTest.class);
		suite.addTestSuite(UnloadShipmentTest.class);
		suite.addTestSuite(FlockScopeToUseTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouseflockTests(String name) {
		super(name);
	}

} //TouseflockTests
