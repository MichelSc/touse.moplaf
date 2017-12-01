/**
 */
package com.misc.touse.moplaf.tousejob.impl;

import com.misc.common.moplaf.job.JobPackage;

import com.misc.common.moplaf.job.jobclient.JobClientPackage;

import com.misc.common.moplaf.job.jobxmlrpc.JobXmlRpcPackage;

import com.misc.touse.moplaf.tousejob.Domain;
import com.misc.touse.moplaf.tousejob.DummyToHoldRefToModel;
import com.misc.touse.moplaf.tousejob.Runs;
import com.misc.touse.moplaf.tousejob.ToUseJob;
import com.misc.touse.moplaf.tousejob.ToUseJobConsole;
import com.misc.touse.moplaf.tousejob.ToUseJobFactory;
import com.misc.touse.moplaf.tousejob.ToUseJobPackage;
import com.misc.touse.moplaf.tousejob.ToUseJobResult;

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
	private EClass toUseJobResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dummyToHoldRefToModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toUseJobConsoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runsEClass = null;

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
		JobPackage.eINSTANCE.eClass();
		JobClientPackage.eINSTANCE.eClass();
		JobXmlRpcPackage.eINSTANCE.eClass();

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
		return (EReference)domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Proxies() {
		return (EReference)domainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Jobscheduler() {
		return (EReference)domainEClass.getEStructuralFeatures().get(2);
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
	public EClass getToUseJobResult() {
		return toUseJobResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToUseJobResult_TicksWaited() {
		return (EAttribute)toUseJobResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDummyToHoldRefToModel() {
		return dummyToHoldRefToModelEClass;
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
	public EClass getRuns() {
		return runsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuns_Runs() {
		return (EReference)runsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuns_Name() {
		return (EAttribute)runsEClass.getEStructuralFeatures().get(1);
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
		createEReference(domainEClass, DOMAIN__RUNS);
		createEReference(domainEClass, DOMAIN__PROXIES);
		createEReference(domainEClass, DOMAIN__JOBSCHEDULER);

		toUseJobEClass = createEClass(TO_USE_JOB);
		createEAttribute(toUseJobEClass, TO_USE_JOB__SECONDS_WAITING);
		createEAttribute(toUseJobEClass, TO_USE_JOB__ITERATION);

		toUseJobResultEClass = createEClass(TO_USE_JOB_RESULT);
		createEAttribute(toUseJobResultEClass, TO_USE_JOB_RESULT__TICKS_WAITED);

		dummyToHoldRefToModelEClass = createEClass(DUMMY_TO_HOLD_REF_TO_MODEL);

		toUseJobConsoleEClass = createEClass(TO_USE_JOB_CONSOLE);
		createEAttribute(toUseJobConsoleEClass, TO_USE_JOB_CONSOLE__CALLER_NAME);

		runsEClass = createEClass(RUNS);
		createEReference(runsEClass, RUNS__RUNS);
		createEAttribute(runsEClass, RUNS__NAME);
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
		JobPackage theJobPackage = (JobPackage)EPackage.Registry.INSTANCE.getEPackage(JobPackage.eNS_URI);
		JobXmlRpcPackage theJobXmlRpcPackage = (JobXmlRpcPackage)EPackage.Registry.INSTANCE.getEPackage(JobXmlRpcPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		toUseJobEClass.getESuperTypes().add(theJobPackage.getJob());
		toUseJobResultEClass.getESuperTypes().add(theJobClientPackage.getJobRemoteResult());
		dummyToHoldRefToModelEClass.getESuperTypes().add(theJobXmlRpcPackage.getJobEngineServer());
		toUseJobConsoleEClass.getESuperTypes().add(theJobPackage.getJobConsole());

		// Initialize classes, features, and operations; add parameters
		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomain_Runs(), this.getRuns(), null, "Runs", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Proxies(), theJobClientPackage.getJobEngineProxy(), null, "Proxies", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Jobscheduler(), theJobClientPackage.getJobScheduler(), null, "jobscheduler", null, 1, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toUseJobEClass, ToUseJob.class, "ToUseJob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToUseJob_SecondsWaiting(), ecorePackage.getEInt(), "SecondsWaiting", "2", 0, 1, ToUseJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToUseJob_Iteration(), ecorePackage.getEInt(), "Iteration", "5", 0, 1, ToUseJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toUseJobResultEClass, ToUseJobResult.class, "ToUseJobResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToUseJobResult_TicksWaited(), ecorePackage.getELong(), "TicksWaited", null, 0, 1, ToUseJobResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dummyToHoldRefToModelEClass, DummyToHoldRefToModel.class, "DummyToHoldRefToModel", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(toUseJobConsoleEClass, ToUseJobConsole.class, "ToUseJobConsole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToUseJobConsole_CallerName(), ecorePackage.getEString(), "CallerName", null, 0, 1, ToUseJobConsole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runsEClass, Runs.class, "Runs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuns_Runs(), theJobPackage.getRun(), null, "Runs", null, 0, -1, Runs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuns_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Runs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ToUseJobPackageImpl
