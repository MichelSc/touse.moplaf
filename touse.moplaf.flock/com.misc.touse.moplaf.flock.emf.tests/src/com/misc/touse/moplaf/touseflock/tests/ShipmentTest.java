/**
 */
package com.misc.touse.moplaf.touseflock.tests;

import com.misc.touse.moplaf.touseflock.Shipment;
import com.misc.touse.moplaf.touseflock.TouseflockFactory;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Shipment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShipmentTest extends ToUseResourceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ShipmentTest.class);
	}

	/**
	 * Constructs a new Shipment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipmentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Shipment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Shipment getFixture() {
		return (Shipment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TouseflockFactory.eINSTANCE.createShipment());
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

} //ShipmentTest
