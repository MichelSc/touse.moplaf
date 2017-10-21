/**
 */
package com.misc.touse.moplaf.tousescheduler.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>tousescheduler</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToUseSchedulerTests extends TestSuite {

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
		TestSuite suite = new ToUseSchedulerTests("tousescheduler Tests");
		suite.addTestSuite(ToUseSchedulerTest.class);
		suite.addTestSuite(ToUseScheduleTest.class);
		suite.addTestSuite(ToUseScoreTest.class);
		suite.addTestSuite(ToUseScheduleResourceTest.class);
		suite.addTestSuite(ToUseScheduleTaskTest.class);
		suite.addTestSuite(ToUseLoadShipmentTest.class);
		suite.addTestSuite(ToUseUnloadShipmentTest.class);
		suite.addTestSuite(ToUseScheduleLoadUnloadTest.class);
		suite.addTestSuite(ScopeScheduleScoreTest.class);
		suite.addTestSuite(LayerScheduleDistanceTest.class);
		suite.addTestSuite(CalcTaskDistanceTest.class);
		suite.addTestSuite(CalcResourceDistanceTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseSchedulerTests(String name) {
		super(name);
	}

} //ToUseSchedulerTests
