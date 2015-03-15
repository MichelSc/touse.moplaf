/**
 */
package com.misc.touse.moplaf.touseflock.tests;

import com.misc.touse.moplaf.touseflock.TouseflockFactory;
import com.misc.touse.moplaf.touseflock.Tractor;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tractor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TractorTest extends ToUseResourceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TractorTest.class);
	}

	/**
	 * Constructs a new Tractor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TractorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Tractor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Tractor getFixture() {
		return (Tractor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TouseflockFactory.eINSTANCE.createTractor());
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

} //TractorTest
