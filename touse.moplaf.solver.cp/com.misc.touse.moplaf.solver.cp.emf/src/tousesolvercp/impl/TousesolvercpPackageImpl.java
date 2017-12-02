/**
 */
package tousesolvercp.impl;

import com.misc.common.moplaf.job.JobPackage;
import com.misc.common.moplaf.solver.SolverPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import solverjacop.SolverjacopPackage;
import tousesolvercp.ToUseSolverCpFolder;
import tousesolvercp.ToUseSolverCpGenerator;
import tousesolvercp.ToUseSolverCpTuple;
import tousesolvercp.TousesolvercpFactory;
import tousesolvercp.TousesolvercpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TousesolvercpPackageImpl extends EPackageImpl implements TousesolvercpPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toUseSolverCpFolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toUseSolverCpGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toUseSolverCpTupleEClass = null;

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
	 * @see tousesolvercp.TousesolvercpPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TousesolvercpPackageImpl() {
		super(eNS_URI, TousesolvercpFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TousesolvercpPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TousesolvercpPackage init() {
		if (isInited) return (TousesolvercpPackage)EPackage.Registry.INSTANCE.getEPackage(TousesolvercpPackage.eNS_URI);

		// Obtain or create and register package
		TousesolvercpPackageImpl theTousesolvercpPackage = (TousesolvercpPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TousesolvercpPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TousesolvercpPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SolverPackage.eINSTANCE.eClass();
		SolverjacopPackage.eINSTANCE.eClass();
		JobPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTousesolvercpPackage.createPackageContents();

		// Initialize created meta-data
		theTousesolvercpPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTousesolvercpPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TousesolvercpPackage.eNS_URI, theTousesolvercpPackage);
		return theTousesolvercpPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUseSolverCpFolder() {
		return toUseSolverCpFolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseSolverCpFolder_SubFolders() {
		return (EReference)toUseSolverCpFolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToUseSolverCpFolder_Name() {
		return (EAttribute)toUseSolverCpFolderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseSolverCpFolder_ToUseGenerators() {
		return (EReference)toUseSolverCpFolderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUseSolverCpGenerator() {
		return toUseSolverCpGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseSolverCpGenerator_Solver() {
		return (EReference)toUseSolverCpGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseSolverCpGenerator_ToUseTuples() {
		return (EReference)toUseSolverCpGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUseSolverCpTuple() {
		return toUseSolverCpTupleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseSolverCpTuple_ToUseLinears() {
		return (EReference)toUseSolverCpTupleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseSolverCpTuple_ToUseVars() {
		return (EReference)toUseSolverCpTupleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToUseSolverCpTuple_ToUseLogicals() {
		return (EReference)toUseSolverCpTupleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TousesolvercpFactory getTousesolvercpFactory() {
		return (TousesolvercpFactory)getEFactoryInstance();
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
		toUseSolverCpFolderEClass = createEClass(TO_USE_SOLVER_CP_FOLDER);
		createEReference(toUseSolverCpFolderEClass, TO_USE_SOLVER_CP_FOLDER__SUB_FOLDERS);
		createEAttribute(toUseSolverCpFolderEClass, TO_USE_SOLVER_CP_FOLDER__NAME);
		createEReference(toUseSolverCpFolderEClass, TO_USE_SOLVER_CP_FOLDER__TO_USE_GENERATORS);

		toUseSolverCpGeneratorEClass = createEClass(TO_USE_SOLVER_CP_GENERATOR);
		createEReference(toUseSolverCpGeneratorEClass, TO_USE_SOLVER_CP_GENERATOR__SOLVER);
		createEReference(toUseSolverCpGeneratorEClass, TO_USE_SOLVER_CP_GENERATOR__TO_USE_TUPLES);

		toUseSolverCpTupleEClass = createEClass(TO_USE_SOLVER_CP_TUPLE);
		createEReference(toUseSolverCpTupleEClass, TO_USE_SOLVER_CP_TUPLE__TO_USE_LINEARS);
		createEReference(toUseSolverCpTupleEClass, TO_USE_SOLVER_CP_TUPLE__TO_USE_VARS);
		createEReference(toUseSolverCpTupleEClass, TO_USE_SOLVER_CP_TUPLE__TO_USE_LOGICALS);
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
		SolverjacopPackage theSolverjacopPackage = (SolverjacopPackage)EPackage.Registry.INSTANCE.getEPackage(SolverjacopPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		toUseSolverCpGeneratorEClass.getESuperTypes().add(theSolverPackage.getGenerator());
		toUseSolverCpTupleEClass.getESuperTypes().add(theSolverPackage.getGeneratorTuple());

		// Initialize classes, features, and operations; add parameters
		initEClass(toUseSolverCpFolderEClass, ToUseSolverCpFolder.class, "ToUseSolverCpFolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToUseSolverCpFolder_SubFolders(), this.getToUseSolverCpFolder(), null, "SubFolders", null, 0, -1, ToUseSolverCpFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToUseSolverCpFolder_Name(), ecorePackage.getEString(), "Name", null, 0, 1, ToUseSolverCpFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToUseSolverCpFolder_ToUseGenerators(), this.getToUseSolverCpGenerator(), null, "ToUseGenerators", null, 0, -1, ToUseSolverCpFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toUseSolverCpGeneratorEClass, ToUseSolverCpGenerator.class, "ToUseSolverCpGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToUseSolverCpGenerator_Solver(), theSolverjacopPackage.getSolverJacop(), null, "Solver", null, 0, -1, ToUseSolverCpGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToUseSolverCpGenerator_ToUseTuples(), this.getToUseSolverCpTuple(), null, "ToUseTuples", null, 0, -1, ToUseSolverCpGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toUseSolverCpTupleEClass, ToUseSolverCpTuple.class, "ToUseSolverCpTuple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToUseSolverCpTuple_ToUseLinears(), theSolverPackage.getGeneratorCpLinear(), null, "ToUseLinears", null, 0, -1, ToUseSolverCpTuple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToUseSolverCpTuple_ToUseVars(), theSolverPackage.getGeneratorCpVarAtomic(), null, "ToUseVars", null, 0, -1, ToUseSolverCpTuple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToUseSolverCpTuple_ToUseLogicals(), theSolverPackage.getGeneratorCpLogical(), null, "ToUseLogicals", null, 0, -1, ToUseSolverCpTuple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TousesolvercpPackageImpl
