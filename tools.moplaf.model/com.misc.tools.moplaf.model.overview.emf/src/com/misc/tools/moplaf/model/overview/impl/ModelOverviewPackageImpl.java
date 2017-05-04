/**
 */
package com.misc.tools.moplaf.model.overview.impl;

import com.misc.tools.moplaf.model.overview.ModelOverviewFactory;
import com.misc.tools.moplaf.model.overview.ModelOverviewPackage;
import com.misc.tools.moplaf.model.overview.OverviewCount;
import com.misc.tools.moplaf.model.overview.OverviewObject;
import com.misc.tools.moplaf.model.overview.Overviews;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelOverviewPackageImpl extends EPackageImpl implements ModelOverviewPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass overviewsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass overviewObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass overviewCountEClass = null;

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
	 * @see com.misc.tools.moplaf.model.overview.ModelOverviewPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelOverviewPackageImpl() {
		super(eNS_URI, ModelOverviewFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ModelOverviewPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelOverviewPackage init() {
		if (isInited) return (ModelOverviewPackage)EPackage.Registry.INSTANCE.getEPackage(ModelOverviewPackage.eNS_URI);

		// Obtain or create and register package
		ModelOverviewPackageImpl theModelOverviewPackage = (ModelOverviewPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelOverviewPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelOverviewPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theModelOverviewPackage.createPackageContents();

		// Initialize created meta-data
		theModelOverviewPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelOverviewPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelOverviewPackage.eNS_URI, theModelOverviewPackage);
		return theModelOverviewPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOverviews() {
		return overviewsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOverviews_RootObjects() {
		return (EReference)overviewsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOverviews_SubOverviews() {
		return (EReference)overviewsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOverviews_Name() {
		return (EAttribute)overviewsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOverviews_Remarks() {
		return (EAttribute)overviewsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOverviews__AddObject__EObject() {
		return overviewsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOverviewObject() {
		return overviewObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOverviewObject_RootObject() {
		return (EReference)overviewObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOverviewObject_Remarks() {
		return (EAttribute)overviewObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOverviewObject__Refresh() {
		return overviewObjectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOverviewObject__BookInstance__EObject() {
		return overviewObjectEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOverviewCount() {
		return overviewCountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOverviewCount_Count() {
		return (EAttribute)overviewCountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOverviewCount_Class() {
		return (EReference)overviewCountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOverviewCount_SubTypes() {
		return (EReference)overviewCountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelOverviewFactory getModelOverviewFactory() {
		return (ModelOverviewFactory)getEFactoryInstance();
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
		overviewsEClass = createEClass(OVERVIEWS);
		createEReference(overviewsEClass, OVERVIEWS__ROOT_OBJECTS);
		createEReference(overviewsEClass, OVERVIEWS__SUB_OVERVIEWS);
		createEAttribute(overviewsEClass, OVERVIEWS__NAME);
		createEAttribute(overviewsEClass, OVERVIEWS__REMARKS);
		createEOperation(overviewsEClass, OVERVIEWS___ADD_OBJECT__EOBJECT);

		overviewObjectEClass = createEClass(OVERVIEW_OBJECT);
		createEReference(overviewObjectEClass, OVERVIEW_OBJECT__ROOT_OBJECT);
		createEAttribute(overviewObjectEClass, OVERVIEW_OBJECT__REMARKS);
		createEOperation(overviewObjectEClass, OVERVIEW_OBJECT___REFRESH);
		createEOperation(overviewObjectEClass, OVERVIEW_OBJECT___BOOK_INSTANCE__EOBJECT);

		overviewCountEClass = createEClass(OVERVIEW_COUNT);
		createEAttribute(overviewCountEClass, OVERVIEW_COUNT__COUNT);
		createEReference(overviewCountEClass, OVERVIEW_COUNT__CLASS);
		createEReference(overviewCountEClass, OVERVIEW_COUNT__SUB_TYPES);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		overviewObjectEClass.getESuperTypes().add(this.getOverviewCount());

		// Initialize classes, features, and operations; add parameters
		initEClass(overviewsEClass, Overviews.class, "Overviews", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOverviews_RootObjects(), this.getOverviewObject(), null, "RootObjects", null, 0, -1, Overviews.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOverviews_SubOverviews(), this.getOverviews(), null, "SubOverviews", null, 0, -1, Overviews.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOverviews_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Overviews.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOverviews_Remarks(), ecorePackage.getEString(), "Remarks", null, 0, 1, Overviews.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getOverviews__AddObject__EObject(), null, "addObject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(overviewObjectEClass, OverviewObject.class, "OverviewObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOverviewObject_RootObject(), ecorePackage.getEObject(), null, "RootObject", null, 0, 1, OverviewObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOverviewObject_Remarks(), ecorePackage.getEString(), "Remarks", null, 0, 1, OverviewObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOverviewObject__Refresh(), null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOverviewObject__BookInstance__EObject(), null, "bookInstance", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "instance", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(overviewCountEClass, OverviewCount.class, "OverviewCount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOverviewCount_Count(), ecorePackage.getEInt(), "Count", null, 0, 1, OverviewCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOverviewCount_Class(), ecorePackage.getEClass(), null, "Class", null, 0, 1, OverviewCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOverviewCount_SubTypes(), this.getOverviewCount(), null, "SubTypes", null, 0, -1, OverviewCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelOverviewPackageImpl
