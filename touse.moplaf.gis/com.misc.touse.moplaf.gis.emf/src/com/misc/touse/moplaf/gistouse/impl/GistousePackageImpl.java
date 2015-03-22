/**
 */
package com.misc.touse.moplaf.gistouse.impl;

import com.misc.common.moplaf.gis.GisGoogle.GisGooglePackage;
import com.misc.common.moplaf.gis.GisPackage;
import com.misc.common.moplaf.gis.gisgisgraphy.GisgisgraphyPackage;
import com.misc.touse.moplaf.gistouse.GistouseFactory;
import com.misc.touse.moplaf.gistouse.GistousePackage;
import com.misc.touse.moplaf.gistouse.ToUseGis;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GistousePackageImpl extends EPackageImpl implements GistousePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toUseGisEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.misc.touse.moplaf.gistouse.GistousePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GistousePackageImpl() {
		super(eNS_URI, GistouseFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GistousePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GistousePackage init() {
		if (isInited) return (GistousePackage)EPackage.Registry.INSTANCE.getEPackage(GistousePackage.eNS_URI);

		// Obtain or create and register package
		GistousePackageImpl theGistousePackage = (GistousePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GistousePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GistousePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		GisgisgraphyPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGistousePackage.createPackageContents();

		// Initialize created meta-data
		theGistousePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGistousePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GistousePackage.eNS_URI, theGistousePackage);
		return theGistousePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUseGis() {
		return toUseGisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseGis_Calculators() {
		return (EReference)toUseGisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseGis_Locations() {
		return (EReference)toUseGisEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseGis_GeocodersG() {
		return (EReference)toUseGisEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseGis_GeocodersGG() {
		return (EReference)toUseGisEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseGis_Matrices() {
		return (EReference)toUseGisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GistouseFactory getGistouseFactory() {
		return (GistouseFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		toUseGisEClass = createEClass(TO_USE_GIS);
		createEReference(toUseGisEClass, TO_USE_GIS__CALCULATORS);
		createEReference(toUseGisEClass, TO_USE_GIS__MATRICES);
		createEReference(toUseGisEClass, TO_USE_GIS__LOCATIONS);
		createEReference(toUseGisEClass, TO_USE_GIS__GEOCODERS_G);
		createEReference(toUseGisEClass, TO_USE_GIS__GEOCODERS_GG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GisGooglePackage theGisGooglePackage = (GisGooglePackage)EPackage.Registry.INSTANCE.getEPackage(GisGooglePackage.eNS_URI);
		GisPackage theGisPackage = (GisPackage)EPackage.Registry.INSTANCE.getEPackage(GisPackage.eNS_URI);
		GisgisgraphyPackage theGisgisgraphyPackage = (GisgisgraphyPackage)EPackage.Registry.INSTANCE.getEPackage(GisgisgraphyPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(toUseGisEClass, ToUseGis.class, "ToUseGis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToUseGis_Calculators(), theGisGooglePackage.getGisDistanceMatrixCalculatorGoogleWS(), null, "calculators", null, 0, -1, ToUseGis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToUseGis_Matrices(), theGisPackage.getGisDistanceMatrix(), null, "matrices", null, 0, -1, ToUseGis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToUseGis_Locations(), theGisPackage.getGisLocation(), null, "locations", null, 0, -1, ToUseGis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToUseGis_GeocodersG(), theGisGooglePackage.getGisAddressGeocoderGoogleWS(), null, "geocodersG", null, 0, -1, ToUseGis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToUseGis_GeocodersGG(), theGisgisgraphyPackage.getGisAddressGeocoderGisgraphy(), null, "geocodersGG", null, 0, -1, ToUseGis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //GistousePackageImpl
