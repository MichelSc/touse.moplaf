/**
 */
package com.misc.touse.moplaf.tousejob.impl;

import com.misc.common.moplaf.file.FilePackage;
import com.misc.common.moplaf.job.JobPackage;

import com.misc.common.moplaf.job.jobclient.JobClientPackage;
import com.misc.common.moplaf.serialize.SerializePackage;
import com.misc.touse.moplaf.tousejob.Domain;
import com.misc.touse.moplaf.tousejob.ToUseJob;
import com.misc.touse.moplaf.tousejob.ToUseJobConsole;
import com.misc.touse.moplaf.tousejob.ToUseJobFactory;
import com.misc.touse.moplaf.tousejob.ToUseJobPackage;
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
public class ToUseJobPackageImpl extends EPackageImpl implements ToUseJobPackage {
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
	private EClass toUseJobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toUseJobConsoleEClass = null;

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
	 * @see com.misc.touse.moplaf.tousejob.ToUseJobPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ToUseJobPackageImpl() {
		super(eNS_URI, ToUseJobFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ToUseJobPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ToUseJobPackage init() {
		if (isInited) return (ToUseJobPackage)EPackage.Registry.INSTANCE.getEPackage(ToUseJobPackage.eNS_URI);

		// Obtain or create and register package
		ToUseJobPackageImpl theToUseJobPackage = (ToUseJobPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ToUseJobPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ToUseJobPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FilePackage.eINSTANCE.eClass();
		JobPackage.eINSTANCE.eClass();
		JobClientPackage.eINSTANCE.eClass();
		SerializePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theToUseJobPackage.createPackageContents();

		// Initialize created meta-data
		theToUseJobPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theToUseJobPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ToUseJobPackage.eNS_URI, theToUseJobPackage);
		return theToUseJobPackage;
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
	public EReference getDomain_Runs() {
		return (EReference)domainEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Schedulers() {
		return (EReference)domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Deserializables() {
		return (EReference)domainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Serializables() {
		return (EReference)domainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Files() {
		return (EReference)domainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUseJob() {
		return toUseJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToUseJob_SecondsWaiting() {
		return (EAttribute)toUseJobEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToUseJob_Iteration() {
		return (EAttribute)toUseJobEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToUseJobConsole() {
		return toUseJobConsoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToUseJobConsole_CallerName() {
		return (EAttribute)toUseJobConsoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseJobFactory getToUseJobFactory() {
		return (ToUseJobFactory)getEFactoryInstance();
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
		createEReference(domainEClass, DOMAIN__SCHEDULERS);
		createEReference(domainEClass, DOMAIN__DESERIALIZABLES);
		createEReference(domainEClass, DOMAIN__SERIALIZABLES);
		createEReference(domainEClass, DOMAIN__FILES);
		createEReference(domainEClass, DOMAIN__RUNS);

		toUseJobEClass = createEClass(TO_USE_JOB);
		createEAttribute(toUseJobEClass, TO_USE_JOB__SECONDS_WAITING);
		createEAttribute(toUseJobEClass, TO_USE_JOB__ITERATION);

		toUseJobConsoleEClass = createEClass(TO_USE_JOB_CONSOLE);
		createEAttribute(toUseJobConsoleEClass, TO_USE_JOB_CONSOLE__CALLER_NAME);
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
		JobClientPackage theJobClientPackage = (JobClientPackage)EPackage.Registry.INSTANCE.getEPackage(JobClientPackage.eNS_URI);
		SerializePackage theSerializePackage = (SerializePackage)EPackage.Registry.INSTANCE.getEPackage(SerializePackage.eNS_URI);
		FilePackage theFilePackage = (FilePackage)EPackage.Registry.INSTANCE.getEPackage(FilePackage.eNS_URI);
		JobPackage theJobPackage = (JobPackage)EPackage.Registry.INSTANCE.getEPackage(JobPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		toUseJobEClass.getESuperTypes().add(theJobPackage.getJob());
		toUseJobConsoleEClass.getESuperTypes().add(theJobPackage.getJobConsole());

		// Initialize classes, features, and operations; add parameters
		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomain_Schedulers(), theJobClientPackage.getJobScheduler(), null, "Schedulers", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Deserializables(), theSerializePackage.getDeserializable(), null, "Deserializables", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Serializables(), theSerializePackage.getSerializable(), null, "Serializables", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Files(), theFilePackage.getFiles(), null, "Files", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Runs(), theJobPackage.getRuns(), null, "Runs", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toUseJobEClass, ToUseJob.class, "ToUseJob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToUseJob_SecondsWaiting(), ecorePackage.getEInt(), "SecondsWaiting", "2", 0, 1, ToUseJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToUseJob_Iteration(), ecorePackage.getEInt(), "Iteration", "5", 0, 1, ToUseJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toUseJobConsoleEClass, ToUseJobConsole.class, "ToUseJobConsole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToUseJobConsole_CallerName(), ecorePackage.getEString(), "CallerName", null, 0, 1, ToUseJobConsole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ToUseJobPackageImpl
