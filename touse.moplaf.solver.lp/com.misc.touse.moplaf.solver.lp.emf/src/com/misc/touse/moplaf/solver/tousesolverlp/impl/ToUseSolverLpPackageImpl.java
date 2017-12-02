/**
 */
package com.misc.touse.moplaf.solver.tousesolverlp.impl;

import com.misc.common.moplaf.job.JobPackage;
import com.misc.common.moplaf.solver.SolverPackage;

import com.misc.touse.moplaf.solver.tousesolverlp.Folder;
import com.misc.touse.moplaf.solver.tousesolverlp.ToUseGenerator;
import com.misc.touse.moplaf.solver.tousesolverlp.ToUseSolverLpFactory;
import com.misc.touse.moplaf.solver.tousesolverlp.ToUseSolverLpPackage;
import com.misc.touse.moplaf.solver.tousesolverlp.ToUseTuple;

import org.eclipse.emf.ecore.EAttribute;
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
public class ToUseSolverLpPackageImpl extends EPackageImpl implements ToUseSolverLpPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass folderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toUseGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toUseTupleEClass = null;

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
	 * @see com.misc.touse.moplaf.solver.tousesolverlp.ToUseSolverLpPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ToUseSolverLpPackageImpl() {
		super(eNS_URI, ToUseSolverLpFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ToUseSolverLpPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ToUseSolverLpPackage init() {
		if (isInited) return (ToUseSolverLpPackage)EPackage.Registry.INSTANCE.getEPackage(ToUseSolverLpPackage.eNS_URI);

		// Obtain or create and register package
		ToUseSolverLpPackageImpl theToUseSolverLpPackage = (ToUseSolverLpPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ToUseSolverLpPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ToUseSolverLpPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SolverPackage.eINSTANCE.eClass();
		JobPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theToUseSolverLpPackage.createPackageContents();

		// Initialize created meta-data
		theToUseSolverLpPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theToUseSolverLpPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ToUseSolverLpPackage.eNS_URI, theToUseSolverLpPackage);
		return theToUseSolverLpPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFolder() {
		return folderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFolder_SubFolders() {
		return (EReference)folderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFolder_Generators() {
		return (EReference)folderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFolder_Name() {
		return (EAttribute)folderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUseGenerator() {
		return toUseGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseGenerator_RootTuples() {
		return (EReference)toUseGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseGenerator_Solvers() {
		return (EReference)toUseGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUseTuple() {
		return toUseTupleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseTuple_ChildTuples() {
		return (EReference)toUseTupleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseTuple_ToUseVars() {
		return (EReference)toUseTupleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseTuple_ToUseCons() {
		return (EReference)toUseTupleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseSolverLpFactory getToUseSolverLpFactory() {
		return (ToUseSolverLpFactory)getEFactoryInstance();
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
		folderEClass = createEClass(FOLDER);
		createEReference(folderEClass, FOLDER__SUB_FOLDERS);
		createEReference(folderEClass, FOLDER__GENERATORS);
		createEAttribute(folderEClass, FOLDER__NAME);

		toUseGeneratorEClass = createEClass(TO_USE_GENERATOR);
		createEReference(toUseGeneratorEClass, TO_USE_GENERATOR__ROOT_TUPLES);
		createEReference(toUseGeneratorEClass, TO_USE_GENERATOR__SOLVERS);

		toUseTupleEClass = createEClass(TO_USE_TUPLE);
		createEReference(toUseTupleEClass, TO_USE_TUPLE__CHILD_TUPLES);
		createEReference(toUseTupleEClass, TO_USE_TUPLE__TO_USE_VARS);
		createEReference(toUseTupleEClass, TO_USE_TUPLE__TO_USE_CONS);
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
		SolverPackage theSolverPackage = (SolverPackage)EPackage.Registry.INSTANCE.getEPackage(SolverPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		toUseGeneratorEClass.getESuperTypes().add(theSolverPackage.getGenerator());
		toUseTupleEClass.getESuperTypes().add(theSolverPackage.getGeneratorTuple());

		// Initialize classes, features, and operations; add parameters
		initEClass(folderEClass, Folder.class, "Folder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFolder_SubFolders(), this.getFolder(), null, "SubFolders", null, 0, -1, Folder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFolder_Generators(), this.getToUseGenerator(), null, "Generators", null, 0, -1, Folder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFolder_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Folder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toUseGeneratorEClass, ToUseGenerator.class, "ToUseGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToUseGenerator_RootTuples(), this.getToUseTuple(), null, "RootTuples", null, 0, -1, ToUseGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToUseGenerator_Solvers(), theSolverPackage.getSolver(), null, "Solvers", null, 0, -1, ToUseGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toUseTupleEClass, ToUseTuple.class, "ToUseTuple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToUseTuple_ChildTuples(), this.getToUseTuple(), null, "ChildTuples", null, 0, -1, ToUseTuple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToUseTuple_ToUseVars(), theSolverPackage.getGeneratorLpVar(), null, "ToUseVars", null, 0, -1, ToUseTuple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToUseTuple_ToUseCons(), theSolverPackage.getGeneratorLpCons(), null, "ToUseCons", null, 0, -1, ToUseTuple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ToUseSolverLpPackageImpl
