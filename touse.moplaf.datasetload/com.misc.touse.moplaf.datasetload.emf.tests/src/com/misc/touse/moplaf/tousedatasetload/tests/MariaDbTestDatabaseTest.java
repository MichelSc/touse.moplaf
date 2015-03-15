/**
 */
package com.misc.touse.moplaf.tousedatasetload.tests;

import com.misc.touse.moplaf.tousedatasetload.MariaDbTestDatabase;
import com.misc.touse.moplaf.tousedatasetload.TousedatasetloadFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Maria Db Test Database</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MariaDbTestDatabaseTest extends TestCase {

	/**
	 * The fixture for this Maria Db Test Database test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MariaDbTestDatabase fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MariaDbTestDatabaseTest.class);
	}

	/**
	 * Constructs a new Maria Db Test Database test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MariaDbTestDatabaseTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Maria Db Test Database test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MariaDbTestDatabase fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Maria Db Test Database test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MariaDbTestDatabase getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TousedatasetloadFactory.eINSTANCE.createMariaDbTestDatabase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //MariaDbTestDatabaseTest
