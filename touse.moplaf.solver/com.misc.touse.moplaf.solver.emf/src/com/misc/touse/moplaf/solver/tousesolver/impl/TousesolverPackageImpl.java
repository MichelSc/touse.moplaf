/**
 */
package com.misc.touse.moplaf.solver.tousesolver.impl;

import com.misc.common.moplaf.solver.SolverPackage;
import com.misc.touse.moplaf.solver.tousesolver.Domain;
import com.misc.touse.moplaf.solver.tousesolver.DomainObject;
import com.misc.touse.moplaf.solver.tousesolver.DomainObjectFolder;
import com.misc.touse.moplaf.solver.tousesolver.Item;
import com.misc.touse.moplaf.solver.tousesolver.Knapsack;
import com.misc.touse.moplaf.solver.tousesolver.KnapsackLp;
import com.misc.touse.moplaf.solver.tousesolver.KnapsackSol;
import com.misc.touse.moplaf.solver.tousesolver.LpItem;
import com.misc.touse.moplaf.solver.tousesolver.LpKnapsack;
import com.misc.touse.moplaf.solver.tousesolver.LpRoot;
import com.misc.touse.moplaf.solver.tousesolver.Scenario;
import com.misc.touse.moplaf.solver.tousesolver.TousesolverFactory;
import com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage;
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
public class TousesolverPackageImpl extends EPackageImpl implements TousesolverPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knapsackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainObjectFolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knapsackSolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knapsackLpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lpRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lpKnapsackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lpItemEClass = null;

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
	 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TousesolverPackageImpl() {
		super(eNS_URI, TousesolverFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TousesolverPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TousesolverPackage init() {
		if (isInited) return (TousesolverPackage)EPackage.Registry.INSTANCE.getEPackage(TousesolverPackage.eNS_URI);

		// Obtain or create and register package
		TousesolverPackageImpl theTousesolverPackage = (TousesolverPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TousesolverPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TousesolverPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SolverPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTousesolverPackage.createPackageContents();

		// Initialize created meta-data
		theTousesolverPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTousesolverPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TousesolverPackage.eNS_URI, theTousesolverPackage);
		return theTousesolverPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_RootFolder() {
		return (EReference)domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKnapsack() {
		return knapsackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKnapsack_Capacity() {
		return (EAttribute)knapsackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItem() {
		return itemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Weight() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Value() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainObject() {
		return domainObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainObject_Name() {
		return (EAttribute)domainObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainObject_ShortName() {
		return (EAttribute)domainObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainObjectFolder() {
		return domainObjectFolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainObjectFolder_Object() {
		return (EReference)domainObjectFolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainObjectFolder_SubFolder() {
		return (EReference)domainObjectFolderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainObjectFolder_Scenario() {
		return (EReference)domainObjectFolderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainObjectFolder_Name() {
		return (EAttribute)domainObjectFolderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScenario() {
		return scenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_Knapsack() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_Item() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_LP() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_Sol() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenario_Name() {
		return (EAttribute)scenarioEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenario_Remarks() {
		return (EAttribute)scenarioEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_SolutionReader() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKnapsackSol() {
		return knapsackSolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKnapsackSol_TotalValue() {
		return (EAttribute)knapsackSolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKnapsackSol_TotalWeight() {
		return (EAttribute)knapsackSolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnapsackSol_Solver() {
		return (EReference)knapsackSolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnapsackSol_Item() {
		return (EReference)knapsackSolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnapsackSol_Lp() {
		return (EReference)knapsackSolEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKnapsackLp() {
		return knapsackLpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnapsackLp_Root() {
		return (EReference)knapsackLpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnapsackLp_Scenario() {
		return (EReference)knapsackLpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnapsackLp_Value() {
		return (EReference)knapsackLpEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnapsackLp_Solver() {
		return (EReference)knapsackLpEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnapsackLp_Cardinality() {
		return (EReference)knapsackLpEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLpRoot() {
		return lpRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLpRoot_Item() {
		return (EReference)lpRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLpRoot_Knapsack() {
		return (EReference)lpRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLpKnapsack() {
		return lpKnapsackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLpKnapsack_Knapsack() {
		return (EReference)lpKnapsackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLpKnapsack_ConsCapacity() {
		return (EReference)lpKnapsackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLpItem() {
		return lpItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLpItem_Item() {
		return (EReference)lpItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLpItem_VarInKnapsack() {
		return (EReference)lpItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TousesolverFactory getTousesolverFactory() {
		return (TousesolverFactory)getEFactoryInstance();
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
		domainEClass = createEClass(DOMAIN);
		createEReference(domainEClass, DOMAIN__ROOT_FOLDER);

		knapsackEClass = createEClass(KNAPSACK);
		createEAttribute(knapsackEClass, KNAPSACK__CAPACITY);

		itemEClass = createEClass(ITEM);
		createEAttribute(itemEClass, ITEM__WEIGHT);
		createEAttribute(itemEClass, ITEM__VALUE);

		domainObjectEClass = createEClass(DOMAIN_OBJECT);
		createEAttribute(domainObjectEClass, DOMAIN_OBJECT__NAME);
		createEAttribute(domainObjectEClass, DOMAIN_OBJECT__SHORT_NAME);

		domainObjectFolderEClass = createEClass(DOMAIN_OBJECT_FOLDER);
		createEReference(domainObjectFolderEClass, DOMAIN_OBJECT_FOLDER__OBJECT);
		createEReference(domainObjectFolderEClass, DOMAIN_OBJECT_FOLDER__SUB_FOLDER);
		createEReference(domainObjectFolderEClass, DOMAIN_OBJECT_FOLDER__SCENARIO);
		createEAttribute(domainObjectFolderEClass, DOMAIN_OBJECT_FOLDER__NAME);

		scenarioEClass = createEClass(SCENARIO);
		createEReference(scenarioEClass, SCENARIO__KNAPSACK);
		createEReference(scenarioEClass, SCENARIO__ITEM);
		createEReference(scenarioEClass, SCENARIO__LP);
		createEReference(scenarioEClass, SCENARIO__SOL);
		createEAttribute(scenarioEClass, SCENARIO__NAME);
		createEAttribute(scenarioEClass, SCENARIO__REMARKS);
		createEReference(scenarioEClass, SCENARIO__SOLUTION_READER);

		knapsackSolEClass = createEClass(KNAPSACK_SOL);
		createEAttribute(knapsackSolEClass, KNAPSACK_SOL__TOTAL_VALUE);
		createEAttribute(knapsackSolEClass, KNAPSACK_SOL__TOTAL_WEIGHT);
		createEReference(knapsackSolEClass, KNAPSACK_SOL__SOLVER);
		createEReference(knapsackSolEClass, KNAPSACK_SOL__ITEM);
		createEReference(knapsackSolEClass, KNAPSACK_SOL__LP);

		knapsackLpEClass = createEClass(KNAPSACK_LP);
		createEReference(knapsackLpEClass, KNAPSACK_LP__ROOT);
		createEReference(knapsackLpEClass, KNAPSACK_LP__SCENARIO);
		createEReference(knapsackLpEClass, KNAPSACK_LP__VALUE);
		createEReference(knapsackLpEClass, KNAPSACK_LP__SOLVER);
		createEReference(knapsackLpEClass, KNAPSACK_LP__CARDINALITY);

		lpRootEClass = createEClass(LP_ROOT);
		createEReference(lpRootEClass, LP_ROOT__ITEM);
		createEReference(lpRootEClass, LP_ROOT__KNAPSACK);

		lpKnapsackEClass = createEClass(LP_KNAPSACK);
		createEReference(lpKnapsackEClass, LP_KNAPSACK__KNAPSACK);
		createEReference(lpKnapsackEClass, LP_KNAPSACK__CONS_CAPACITY);

		lpItemEClass = createEClass(LP_ITEM);
		createEReference(lpItemEClass, LP_ITEM__ITEM);
		createEReference(lpItemEClass, LP_ITEM__VAR_IN_KNAPSACK);
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
		knapsackEClass.getESuperTypes().add(this.getDomainObject());
		itemEClass.getESuperTypes().add(this.getDomainObject());
		knapsackLpEClass.getESuperTypes().add(theSolverPackage.getGenerator());
		lpRootEClass.getESuperTypes().add(theSolverPackage.getGeneratorTuple());
		lpKnapsackEClass.getESuperTypes().add(theSolverPackage.getGeneratorTuple());
		lpItemEClass.getESuperTypes().add(theSolverPackage.getGeneratorTuple());

		// Initialize classes, features, and operations; add parameters
		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomain_RootFolder(), this.getDomainObjectFolder(), null, "RootFolder", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(knapsackEClass, Knapsack.class, "Knapsack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKnapsack_Capacity(), ecorePackage.getEFloat(), "Capacity", null, 0, 1, Knapsack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItem_Weight(), ecorePackage.getEFloat(), "Weight", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Value(), ecorePackage.getEFloat(), "Value", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainObjectEClass, DomainObject.class, "DomainObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainObject_Name(), ecorePackage.getEString(), "Name", null, 0, 1, DomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainObject_ShortName(), ecorePackage.getEString(), "ShortName", null, 0, 1, DomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainObjectFolderEClass, DomainObjectFolder.class, "DomainObjectFolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainObjectFolder_Object(), this.getDomainObject(), null, "Object", null, 0, -1, DomainObjectFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainObjectFolder_SubFolder(), this.getDomainObjectFolder(), null, "SubFolder", null, 0, -1, DomainObjectFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainObjectFolder_Scenario(), this.getScenario(), null, "Scenario", null, 0, -1, DomainObjectFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainObjectFolder_Name(), ecorePackage.getEString(), "Name", null, 0, 1, DomainObjectFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scenarioEClass, Scenario.class, "Scenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScenario_Knapsack(), this.getKnapsack(), null, "Knapsack", null, 1, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_Item(), this.getItem(), null, "Item", null, 1, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_LP(), this.getKnapsackLp(), this.getKnapsackLp_Scenario(), "LP", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_Sol(), this.getKnapsackSol(), null, "Sol", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenario_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenario_Remarks(), ecorePackage.getEString(), "Remarks", null, 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_SolutionReader(), theSolverPackage.getSolutionReader(), null, "SolutionReader", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(knapsackSolEClass, KnapsackSol.class, "KnapsackSol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKnapsackSol_TotalValue(), ecorePackage.getEFloat(), "TotalValue", null, 0, 1, KnapsackSol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKnapsackSol_TotalWeight(), ecorePackage.getEFloat(), "TotalWeight", null, 0, 1, KnapsackSol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKnapsackSol_Solver(), theSolverPackage.getSolution(), null, "Solver", null, 0, 1, KnapsackSol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKnapsackSol_Item(), this.getItem(), null, "Item", null, 0, -1, KnapsackSol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKnapsackSol_Lp(), this.getKnapsackLp(), null, "Lp", null, 0, 1, KnapsackSol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(knapsackLpEClass, KnapsackLp.class, "KnapsackLp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKnapsackLp_Root(), this.getLpRoot(), null, "Root", null, 1, 1, KnapsackLp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKnapsackLp_Scenario(), this.getScenario(), this.getScenario_LP(), "Scenario", null, 1, 1, KnapsackLp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKnapsackLp_Value(), theSolverPackage.getGeneratorLpGoal(), null, "Value", null, 1, 1, KnapsackLp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKnapsackLp_Solver(), theSolverPackage.getSolver(), null, "Solver", null, 0, -1, KnapsackLp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKnapsackLp_Cardinality(), theSolverPackage.getGeneratorLpGoal(), null, "Cardinality", null, 1, 1, KnapsackLp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lpRootEClass, LpRoot.class, "LpRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLpRoot_Item(), this.getLpItem(), null, "Item", null, 0, -1, LpRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLpRoot_Knapsack(), this.getLpKnapsack(), null, "Knapsack", null, 1, 1, LpRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lpKnapsackEClass, LpKnapsack.class, "LpKnapsack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLpKnapsack_Knapsack(), this.getKnapsack(), null, "Knapsack", null, 1, 1, LpKnapsack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLpKnapsack_ConsCapacity(), theSolverPackage.getGeneratorLpCons(), null, "ConsCapacity", null, 1, 1, LpKnapsack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lpItemEClass, LpItem.class, "LpItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLpItem_Item(), this.getItem(), null, "Item", null, 1, 1, LpItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLpItem_VarInKnapsack(), theSolverPackage.getGeneratorLpVar(), null, "VarInKnapsack", null, 1, 1, LpItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TousesolverPackageImpl
