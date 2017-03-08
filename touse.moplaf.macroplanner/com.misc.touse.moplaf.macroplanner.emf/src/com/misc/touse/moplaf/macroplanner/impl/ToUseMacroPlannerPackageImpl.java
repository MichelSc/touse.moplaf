/**
 */
package com.misc.touse.moplaf.macroplanner.impl;

import com.misc.common.moplaf.macroplanner.MacroPlannerPackage;

import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage;

import com.misc.touse.moplaf.macroplanner.Domain;
import com.misc.touse.moplaf.macroplanner.ToUseMacroPlannerFactory;
import com.misc.touse.moplaf.macroplanner.ToUseMacroPlannerPackage;

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
public class ToUseMacroPlannerPackageImpl extends EPackageImpl implements ToUseMacroPlannerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

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
	 * @see com.misc.touse.moplaf.macroplanner.ToUseMacroPlannerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ToUseMacroPlannerPackageImpl() {
		super(eNS_URI, ToUseMacroPlannerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ToUseMacroPlannerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ToUseMacroPlannerPackage init() {
		if (isInited) return (ToUseMacroPlannerPackage)EPackage.Registry.INSTANCE.getEPackage(ToUseMacroPlannerPackage.eNS_URI);

		// Obtain or create and register package
		ToUseMacroPlannerPackageImpl theToUseMacroPlannerPackage = (ToUseMacroPlannerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ToUseMacroPlannerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ToUseMacroPlannerPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MacroPlannerSolverPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theToUseMacroPlannerPackage.createPackageContents();

		// Initialize created meta-data
		theToUseMacroPlannerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theToUseMacroPlannerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ToUseMacroPlannerPackage.eNS_URI, theToUseMacroPlannerPackage);
		return theToUseMacroPlannerPackage;
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
	public EReference getDomain_MasterData() {
		return (EReference)domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Data() {
		return (EReference)domainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Chains() {
		return (EReference)domainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Scenarios() {
		return (EReference)domainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseMacroPlannerFactory getToUseMacroPlannerFactory() {
		return (ToUseMacroPlannerFactory)getEFactoryInstance();
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
		createEReference(domainEClass, DOMAIN__MASTER_DATA);
		createEReference(domainEClass, DOMAIN__DATA);
		createEReference(domainEClass, DOMAIN__CHAINS);
		createEReference(domainEClass, DOMAIN__SCENARIOS);
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
		MacroPlannerPackage theMacroPlannerPackage = (MacroPlannerPackage)EPackage.Registry.INSTANCE.getEPackage(MacroPlannerPackage.eNS_URI);
		MacroPlannerSolverPackage theMacroPlannerSolverPackage = (MacroPlannerSolverPackage)EPackage.Registry.INSTANCE.getEPackage(MacroPlannerSolverPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomain_MasterData(), theMacroPlannerPackage.getSupplyChainMasterData(), null, "MasterData", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Data(), theMacroPlannerPackage.getSupplyChainData(), null, "Data", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Chains(), theMacroPlannerPackage.getSupplyChainRoutings(), null, "Chains", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Scenarios(), theMacroPlannerSolverPackage.getScenario(), null, "Scenarios", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ToUseMacroPlannerPackageImpl
