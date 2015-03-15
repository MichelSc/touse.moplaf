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
 * @see com.misc.touse.moplaf.gistouse.GistouseFactory
 * @model kind="package"
 * @generated
 */
public interface GistousePackage extends EPackage {
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
	GistousePackage eINSTANCE = com.misc.touse.moplaf.gistouse.impl.GistousePackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.gistouse.impl.ToUseGisImpl <em>To Use Gis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.gistouse.impl.ToUseGisImpl
	 * @see com.misc.touse.moplaf.gistouse.impl.GistousePackageImpl#getToUseGis()
	 * @generated
	 */
	int TO_USE_GIS = 0;

	/**
	 * The feature id for the '<em><b>Calculators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GIS__CALCULATORS = 0;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GIS__LOCATIONS = 1;

	/**
	 * The number of structural features of the '<em>To Use Gis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GIS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>To Use Gis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_GIS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.gistouse.ToUseGis <em>To Use Gis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Use Gis</em>'.
	 * @see com.misc.touse.moplaf.gistouse.ToUseGis
	 * @generated
	 */
	EClass getToUseGis();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.gistouse.ToUseGis#getCalculators <em>Calculators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Calculators</em>'.
	 * @see com.misc.touse.moplaf.gistouse.ToUseGis#getCalculators()
	 * @see #getToUseGis()
	 * @generated
	 */
	EReference getToUseGis_Calculators();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.gistouse.ToUseGis#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations</em>'.
	 * @see com.misc.touse.moplaf.gistouse.ToUseGis#getLocations()
	 * @see #getToUseGis()
	 * @generated
	 */
	EReference getToUseGis_Locations();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GistouseFactory getGistouseFactory();

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
		 * The meta object literal for the '{@link com.misc.touse.moplaf.gistouse.impl.ToUseGisImpl <em>To Use Gis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.gistouse.impl.ToUseGisImpl
		 * @see com.misc.touse.moplaf.gistouse.impl.GistousePackageImpl#getToUseGis()
		 * @generated
		 */
		EClass TO_USE_GIS = eINSTANCE.getToUseGis();

		/**
		 * The meta object literal for the '<em><b>Calculators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_GIS__CALCULATORS = eINSTANCE.getToUseGis_Calculators();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_USE_GIS__LOCATIONS = eINSTANCE.getToUseGis_Locations();

	}

} //GistousePackage
