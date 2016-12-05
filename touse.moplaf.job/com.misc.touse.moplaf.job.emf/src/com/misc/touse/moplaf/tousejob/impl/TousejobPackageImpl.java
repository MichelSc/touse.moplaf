/**
 */
package com.misc.touse.moplaf.tousejob.impl;

import com.misc.common.moplaf.job.jobclient.JobclientPackage;

import com.misc.common.moplaf.job.jobxmlrpc.JobxmlrpcPackage;
import com.misc.touse.moplaf.tousejob.Domain;
import com.misc.touse.moplaf.tousejob.DummyToHoldRefToModel;
import com.misc.touse.moplaf.tousejob.ToUseJob;
import com.misc.touse.moplaf.tousejob.ToUseJobResult;
import com.misc.touse.moplaf.tousejob.TousejobFactory;
import com.misc.touse.moplaf.tousejob.TousejobPackage;

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
public class TousejobPackageImpl extends EPackageImpl implements TousejobPackage {
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
	 * @see com.misc.touse.moplaf.tousejob.TousejobPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TousejobPackageImpl() {
		super(eNS_URI, TousejobFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TousejobPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TousejobPackage init() {
		if (isInited) return (TousejobPackage)EPackage.Registry.INSTANCE.getEPackage(TousejobPackage.eNS_URI);

		// Obtain or create and register package
		TousejobPackageImpl theTousejobPackage = (TousejobPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TousejobPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TousejobPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		JobxmlrpcPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTousejobPackage.createPackageContents();

		// Initialize created meta-data
		theTousejobPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTousejobPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TousejobPackage.eNS_URI, theTousejobPackage);
		return theTousejobPackage;
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
	public EReference getDomain_Engines() {
		return (EReference)domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Jobs() {
		return (EReference)domainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Proxies() {
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
	public TousejobFactory getTousejobFactory() {
		return (TousejobFactory)getEFactoryInstance();
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
		createEReference(domainEClass, DOMAIN__ENGINES);
		createEReference(domainEClass, DOMAIN__JOBS);
		createEReference(domainEClass, DOMAIN__PROXIES);

		toUseJobEClass = createEClass(TO_USE_JOB);
		createEAttribute(toUseJobEClass, TO_USE_JOB__SECONDS_WAITING);

		toUseJobResultEClass = createEClass(TO_USE_JOB_RESULT);
		createEAttribute(toUseJobResultEClass, TO_USE_JOB_RESULT__TICKS_WAITED);

		dummyToHoldRefToModelEClass = createEClass(DUMMY_TO_HOLD_REF_TO_MODEL);
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
		JobclientPackage theJobclientPackage = (JobclientPackage)EPackage.Registry.INSTANCE.getEPackage(JobclientPackage.eNS_URI);
		JobxmlrpcPackage theJobxmlrpcPackage = (JobxmlrpcPackage)EPackage.Registry.INSTANCE.getEPackage(JobxmlrpcPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		toUseJobEClass.getESuperTypes().add(theJobclientPackage.getJobRemote());
		toUseJobResultEClass.getESuperTypes().add(theJobclientPackage.getJobRemoteResult());
		dummyToHoldRefToModelEClass.getESuperTypes().add(theJobxmlrpcPackage.getJobEngineServer());

		// Initialize classes, features, and operations; add parameters
		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomain_Engines(), theJobclientPackage.getJobEngine(), null, "Engines", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Jobs(), this.getToUseJob(), null, "Jobs", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Proxies(), theJobclientPackage.getJobEngineProxy(), null, "Proxies", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toUseJobEClass, ToUseJob.class, "ToUseJob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToUseJob_SecondsWaiting(), ecorePackage.getEInt(), "SecondsWaiting", "5", 0, 1, ToUseJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toUseJobResultEClass, ToUseJobResult.class, "ToUseJobResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToUseJobResult_TicksWaited(), ecorePackage.getELong(), "TicksWaited", null, 0, 1, ToUseJobResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dummyToHoldRefToModelEClass, DummyToHoldRefToModel.class, "DummyToHoldRefToModel", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //TousejobPackageImpl
