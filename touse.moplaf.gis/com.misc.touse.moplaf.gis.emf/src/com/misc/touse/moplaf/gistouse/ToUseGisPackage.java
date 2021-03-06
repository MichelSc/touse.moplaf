/**
 */
package com.misc.touse.moplaf.gistouse;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.misc.touse.moplaf.gistouse.ToUseGisFactory
 * @model kind="package"
 * @generated
 */
public interface ToUseGisPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gistouse";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/touse.moplaf.solver.emf";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tgis";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToUseGisPackage eINSTANCE = com.misc.touse.moplaf.gistouse.impl.ToUseGisPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.gistouse.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.gistouse.impl.DomainImpl
	 * @see com.misc.touse.moplaf.gistouse.impl.ToUseGisPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__LOCATIONS = 0;

	/**
	 * The feature id for the '<em><b>Matrices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__MATRICES = 1;

	/**
	 * The feature id for the '<em><b>Calculators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__CALCULATORS = 2;

	/**
	 * The feature id for the '<em><b>Geocoders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__GEOCODERS = 3;

	/**
	 * The feature id for the '<em><b>Pinpointers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__PINPOINTERS = 4;

	/**
	 * The feature id for the '<em><b>Kmls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__KMLS = 5;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.gistouse.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see com.misc.touse.moplaf.gistouse.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.gistouse.Domain#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations</em>'.
	 * @see com.misc.touse.moplaf.gistouse.Domain#getLocations()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Locations();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.gistouse.Domain#getMatrices <em>Matrices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matrices</em>'.
	 * @see com.misc.touse.moplaf.gistouse.Domain#getMatrices()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Matrices();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.gistouse.Domain#getCalculators <em>Calculators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Calculators</em>'.
	 * @see com.misc.touse.moplaf.gistouse.Domain#getCalculators()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Calculators();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.gistouse.Domain#getGeocoders <em>Geocoders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Geocoders</em>'.
	 * @see com.misc.touse.moplaf.gistouse.Domain#getGeocoders()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Geocoders();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.gistouse.Domain#getPinpointers <em>Pinpointers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pinpointers</em>'.
	 * @see com.misc.touse.moplaf.gistouse.Domain#getPinpointers()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Pinpointers();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.gistouse.Domain#getKmls <em>Kmls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kmls</em>'.
	 * @see com.misc.touse.moplaf.gistouse.Domain#getKmls()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Kmls();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ToUseGisFactory getToUseGisFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.gistouse.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.gistouse.impl.DomainImpl
		 * @see com.misc.touse.moplaf.gistouse.impl.ToUseGisPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__LOCATIONS = eINSTANCE.getDomain_Locations();

		/**
		 * The meta object literal for the '<em><b>Matrices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__MATRICES = eINSTANCE.getDomain_Matrices();

		/**
		 * The meta object literal for the '<em><b>Calculators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__CALCULATORS = eINSTANCE.getDomain_Calculators();

		/**
		 * The meta object literal for the '<em><b>Geocoders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__GEOCODERS = eINSTANCE.getDomain_Geocoders();

		/**
		 * The meta object literal for the '<em><b>Pinpointers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__PINPOINTERS = eINSTANCE.getDomain_Pinpointers();

		/**
		 * The meta object literal for the '<em><b>Kmls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__KMLS = eINSTANCE.getDomain_Kmls();

	}

} //ToUseGisPackage
