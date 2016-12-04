/**
 */
package com.misc.touse.moplaf.tousejob;

import com.misc.common.moplaf.job.jobclient.JobclientPackage;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see com.misc.touse.moplaf.tousejob.TousejobFactory
 * @model kind="package"
 * @generated
 */
public interface TousejobPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tousejob";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "//www.misc.com/touse/moplaf/job/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tuj";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TousejobPackage eINSTANCE = com.misc.touse.moplaf.tousejob.impl.TousejobPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousejob.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousejob.impl.DomainImpl
	 * @see com.misc.touse.moplaf.tousejob.impl.TousejobPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Engines</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__ENGINES = 0;

	/**
	 * The feature id for the '<em><b>Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__JOBS = 1;

	/**
	 * The feature id for the '<em><b>Proxies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__PROXIES = 2;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousejob.impl.ToUseJobImpl <em>To Use Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousejob.impl.ToUseJobImpl
	 * @see com.misc.touse.moplaf.tousejob.impl.TousejobPackageImpl#getToUseJob()
	 * @generated
	 */
	int TO_USE_JOB = 1;

	/**
	 * The feature id for the '<em><b>Run Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB__RUN_FEEDBACK = JobclientPackage.JOB_REMOTE__RUN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Cancel Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB__CANCEL_FEEDBACK = JobclientPackage.JOB_REMOTE__CANCEL_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Reset Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB__RESET_FEEDBACK = JobclientPackage.JOB_REMOTE__RESET_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Canceled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB__CANCELED = JobclientPackage.JOB_REMOTE__CANCELED;

	/**
	 * The feature id for the '<em><b>Return Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB__RETURN_SUCCESS = JobclientPackage.JOB_REMOTE__RETURN_SUCCESS;

	/**
	 * The feature id for the '<em><b>Return Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB__RETURN_FEEDBACK = JobclientPackage.JOB_REMOTE__RETURN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Return Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB__RETURN_INFORMATION = JobclientPackage.JOB_REMOTE__RETURN_INFORMATION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB__STATUS = JobclientPackage.JOB_REMOTE__STATUS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB__DESCRIPTION = JobclientPackage.JOB_REMOTE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB__START_TIME = JobclientPackage.JOB_REMOTE__START_TIME;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB__END_TIME = JobclientPackage.JOB_REMOTE__END_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB__DURATION = JobclientPackage.JOB_REMOTE__DURATION;

	/**
	 * The feature id for the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB__STARTED = JobclientPackage.JOB_REMOTE__STARTED;

	/**
	 * The feature id for the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB__FINISHED = JobclientPackage.JOB_REMOTE__FINISHED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB__NAME = JobclientPackage.JOB_REMOTE__NAME;

	/**
	 * The feature id for the '<em><b>Submission ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB__SUBMISSION_ID = JobclientPackage.JOB_REMOTE__SUBMISSION_ID;

	/**
	 * The feature id for the '<em><b>Handling Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB__HANDLING_ENGINE = JobclientPackage.JOB_REMOTE__HANDLING_ENGINE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB__RESULT = JobclientPackage.JOB_REMOTE__RESULT;

	/**
	 * The feature id for the '<em><b>Seconds Waiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB__SECONDS_WAITING = JobclientPackage.JOB_REMOTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>To Use Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_FEATURE_COUNT = JobclientPackage.JOB_REMOTE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB___RESET = JobclientPackage.JOB_REMOTE___RESET;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB___RUN = JobclientPackage.JOB_REMOTE___RUN;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB___RUN__RUNCONTEXT = JobclientPackage.JOB_REMOTE___RUN__RUNCONTEXT;

	/**
	 * The operation id for the '<em>Cancel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB___CANCEL = JobclientPackage.JOB_REMOTE___CANCEL;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB___SET_PROGRESS__STRING_FLOAT = JobclientPackage.JOB_REMOTE___SET_PROGRESS__STRING_FLOAT;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB___SET_PROGRESS__PROGRESSFEEDBACK = JobclientPackage.JOB_REMOTE___SET_PROGRESS__PROGRESSFEEDBACK;

	/**
	 * The operation id for the '<em>Get Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB___GET_RETURN = JobclientPackage.JOB_REMOTE___GET_RETURN;

	/**
	 * The operation id for the '<em>On Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB___ON_PROGRESS__PROGRESSFEEDBACK = JobclientPackage.JOB_REMOTE___ON_PROGRESS__PROGRESSFEEDBACK;

	/**
	 * The operation id for the '<em>On Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB___ON_RETURN__RETURNFEEDBACK = JobclientPackage.JOB_REMOTE___ON_RETURN__RETURNFEEDBACK;

	/**
	 * The number of operations of the '<em>To Use Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_OPERATION_COUNT = JobclientPackage.JOB_REMOTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousejob.impl.ToUseJobResultImpl <em>To Use Job Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousejob.impl.ToUseJobResultImpl
	 * @see com.misc.touse.moplaf.tousejob.impl.TousejobPackageImpl#getToUseJobResult()
	 * @generated
	 */
	int TO_USE_JOB_RESULT = 2;

	/**
	 * The feature id for the '<em><b>Ticks Waited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_RESULT__TICKS_WAITED = JobclientPackage.JOB_REMOTE_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>To Use Job Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_RESULT_FEATURE_COUNT = JobclientPackage.JOB_REMOTE_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>To Use Job Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_RESULT_OPERATION_COUNT = JobclientPackage.JOB_REMOTE_RESULT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousejob.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see com.misc.touse.moplaf.tousejob.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.touse.moplaf.tousejob.Domain#getEngines <em>Engines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Engines</em>'.
	 * @see com.misc.touse.moplaf.tousejob.Domain#getEngines()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Engines();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.tousejob.Domain#getJobs <em>Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jobs</em>'.
	 * @see com.misc.touse.moplaf.tousejob.Domain#getJobs()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Jobs();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.tousejob.Domain#getProxies <em>Proxies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Proxies</em>'.
	 * @see com.misc.touse.moplaf.tousejob.Domain#getProxies()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Proxies();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousejob.ToUseJob <em>To Use Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Use Job</em>'.
	 * @see com.misc.touse.moplaf.tousejob.ToUseJob
	 * @generated
	 */
	EClass getToUseJob();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousejob.ToUseJob#getSecondsWaiting <em>Seconds Waiting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seconds Waiting</em>'.
	 * @see com.misc.touse.moplaf.tousejob.ToUseJob#getSecondsWaiting()
	 * @see #getToUseJob()
	 * @generated
	 */
	EAttribute getToUseJob_SecondsWaiting();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousejob.ToUseJobResult <em>To Use Job Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Use Job Result</em>'.
	 * @see com.misc.touse.moplaf.tousejob.ToUseJobResult
	 * @generated
	 */
	EClass getToUseJobResult();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousejob.ToUseJobResult#getTicksWaited <em>Ticks Waited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ticks Waited</em>'.
	 * @see com.misc.touse.moplaf.tousejob.ToUseJobResult#getTicksWaited()
	 * @see #getToUseJobResult()
	 * @generated
	 */
	EAttribute getToUseJobResult_TicksWaited();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TousejobFactory getTousejobFactory();

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
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousejob.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousejob.impl.DomainImpl
		 * @see com.misc.touse.moplaf.tousejob.impl.TousejobPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Engines</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__ENGINES = eINSTANCE.getDomain_Engines();

		/**
		 * The meta object literal for the '<em><b>Jobs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__JOBS = eINSTANCE.getDomain_Jobs();

		/**
		 * The meta object literal for the '<em><b>Proxies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__PROXIES = eINSTANCE.getDomain_Proxies();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousejob.impl.ToUseJobImpl <em>To Use Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousejob.impl.ToUseJobImpl
		 * @see com.misc.touse.moplaf.tousejob.impl.TousejobPackageImpl#getToUseJob()
		 * @generated
		 */
		EClass TO_USE_JOB = eINSTANCE.getToUseJob();

		/**
		 * The meta object literal for the '<em><b>Seconds Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_USE_JOB__SECONDS_WAITING = eINSTANCE.getToUseJob_SecondsWaiting();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousejob.impl.ToUseJobResultImpl <em>To Use Job Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousejob.impl.ToUseJobResultImpl
		 * @see com.misc.touse.moplaf.tousejob.impl.TousejobPackageImpl#getToUseJobResult()
		 * @generated
		 */
		EClass TO_USE_JOB_RESULT = eINSTANCE.getToUseJobResult();

		/**
		 * The meta object literal for the '<em><b>Ticks Waited</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_USE_JOB_RESULT__TICKS_WAITED = eINSTANCE.getToUseJobResult_TicksWaited();

	}

} //TousejobPackage
