/*******************************************************************************
 * Copyright (c) 2017 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
/**
 */
package com.misc.touse.moplaf.tousejob;

import com.misc.common.moplaf.job.JobPackage;
import com.misc.common.moplaf.job.jobclient.JobclientPackage;

import com.misc.common.moplaf.job.jobxmlrpc.JobxmlrpcPackage;
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
	 * The feature id for the '<em><b>Jobscheduler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__JOBSCHEDULER = 3;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 4;

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
	 * The feature id for the '<em><b>Submission ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB__SUBMISSION_ID = JobclientPackage.JOB_REMOTE__SUBMISSION_ID;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB__RESULT = JobclientPackage.JOB_REMOTE__RESULT;

	/**
	 * The feature id for the '<em><b>Last Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB__LAST_PROGRESS = JobclientPackage.JOB_REMOTE__LAST_PROGRESS;

	/**
	 * The feature id for the '<em><b>Last Progress Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB__LAST_PROGRESS_WORK = JobclientPackage.JOB_REMOTE__LAST_PROGRESS_WORK;

	/**
	 * The feature id for the '<em><b>Last Progress Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB__LAST_PROGRESS_TASK = JobclientPackage.JOB_REMOTE__LAST_PROGRESS_TASK;

	/**
	 * The feature id for the '<em><b>Job</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB__JOB = JobclientPackage.JOB_REMOTE__JOB;

	/**
	 * The feature id for the '<em><b>Jobremote</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB__JOBREMOTE = JobclientPackage.JOB_REMOTE__JOBREMOTE;

	/**
	 * The feature id for the '<em><b>Jobremotee Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB__JOBREMOTEE_OPPOSITE = JobclientPackage.JOB_REMOTE__JOBREMOTEE_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB__NAME = JobclientPackage.JOB_REMOTE__NAME;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB__PROGRESS = JobclientPackage.JOB_REMOTE__PROGRESS;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB__START_TIME = JobclientPackage.JOB_REMOTE__START_TIME;

	/**
	 * The feature id for the '<em><b>Seconds Waiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB__SECONDS_WAITING = JobclientPackage.JOB_REMOTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Iteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB__ITERATION = JobclientPackage.JOB_REMOTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>To Use Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_FEATURE_COUNT = JobclientPackage.JOB_REMOTE_FEATURE_COUNT + 2;

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
	 * The operation id for the '<em>Refresh Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB___REFRESH_PROGRESS = JobclientPackage.JOB_REMOTE___REFRESH_PROGRESS;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB___RUN__SUBMITTEDJOB = JobclientPackage.JOB_REMOTE___RUN__SUBMITTEDJOB;

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
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousejob.DummyToHoldRefToModel <em>Dummy To Hold Ref To Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousejob.DummyToHoldRefToModel
	 * @see com.misc.touse.moplaf.tousejob.impl.TousejobPackageImpl#getDummyToHoldRefToModel()
	 * @generated
	 */
	int DUMMY_TO_HOLD_REF_TO_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Submitted Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_TO_HOLD_REF_TO_MODEL__SUBMITTED_JOBS = JobxmlrpcPackage.JOB_ENGINE_SERVER__SUBMITTED_JOBS;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_TO_HOLD_REF_TO_MODEL__RUNNING = JobxmlrpcPackage.JOB_ENGINE_SERVER__RUNNING;

	/**
	 * The feature id for the '<em><b>Start Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_TO_HOLD_REF_TO_MODEL__START_FEEDBACK = JobxmlrpcPackage.JOB_ENGINE_SERVER__START_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Stop Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_TO_HOLD_REF_TO_MODEL__STOP_FEEDBACK = JobxmlrpcPackage.JOB_ENGINE_SERVER__STOP_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_TO_HOLD_REF_TO_MODEL__NAME = JobxmlrpcPackage.JOB_ENGINE_SERVER__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_TO_HOLD_REF_TO_MODEL__LABEL = JobxmlrpcPackage.JOB_ENGINE_SERVER__LABEL;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_TO_HOLD_REF_TO_MODEL__PORT = JobxmlrpcPackage.JOB_ENGINE_SERVER__PORT;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_TO_HOLD_REF_TO_MODEL__PATH = JobxmlrpcPackage.JOB_ENGINE_SERVER__PATH;

	/**
	 * The number of structural features of the '<em>Dummy To Hold Ref To Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_TO_HOLD_REF_TO_MODEL_FEATURE_COUNT = JobxmlrpcPackage.JOB_ENGINE_SERVER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_TO_HOLD_REF_TO_MODEL___START = JobxmlrpcPackage.JOB_ENGINE_SERVER___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_TO_HOLD_REF_TO_MODEL___STOP = JobxmlrpcPackage.JOB_ENGINE_SERVER___STOP;

	/**
	 * The operation id for the '<em>On Job Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_TO_HOLD_REF_TO_MODEL___ON_JOB_PROGRESS__SUBMITTEDJOB_PROGRESSFEEDBACK = JobxmlrpcPackage.JOB_ENGINE_SERVER___ON_JOB_PROGRESS__SUBMITTEDJOB_PROGRESSFEEDBACK;

	/**
	 * The number of operations of the '<em>Dummy To Hold Ref To Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_TO_HOLD_REF_TO_MODEL_OPERATION_COUNT = JobxmlrpcPackage.JOB_ENGINE_SERVER_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.tousejob.impl.ToUseJobConsoleImpl <em>To Use Job Console</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.tousejob.impl.ToUseJobConsoleImpl
	 * @see com.misc.touse.moplaf.tousejob.impl.TousejobPackageImpl#getToUseJobConsole()
	 * @generated
	 */
	int TO_USE_JOB_CONSOLE = 4;

	/**
	 * The feature id for the '<em><b>Run Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_CONSOLE__RUN_FEEDBACK = JobPackage.JOB_CONSOLE__RUN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Cancel Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_CONSOLE__CANCEL_FEEDBACK = JobPackage.JOB_CONSOLE__CANCEL_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Reset Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_CONSOLE__RESET_FEEDBACK = JobPackage.JOB_CONSOLE__RESET_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Canceled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_CONSOLE__CANCELED = JobPackage.JOB_CONSOLE__CANCELED;

	/**
	 * The feature id for the '<em><b>Return Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_CONSOLE__RETURN_SUCCESS = JobPackage.JOB_CONSOLE__RETURN_SUCCESS;

	/**
	 * The feature id for the '<em><b>Return Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_CONSOLE__RETURN_FEEDBACK = JobPackage.JOB_CONSOLE__RETURN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Return Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_CONSOLE__RETURN_INFORMATION = JobPackage.JOB_CONSOLE__RETURN_INFORMATION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_CONSOLE__STATUS = JobPackage.JOB_CONSOLE__STATUS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_CONSOLE__DESCRIPTION = JobPackage.JOB_CONSOLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_CONSOLE__START_TIME = JobPackage.JOB_CONSOLE__START_TIME;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_CONSOLE__END_TIME = JobPackage.JOB_CONSOLE__END_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_CONSOLE__DURATION = JobPackage.JOB_CONSOLE__DURATION;

	/**
	 * The feature id for the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_CONSOLE__STARTED = JobPackage.JOB_CONSOLE__STARTED;

	/**
	 * The feature id for the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_CONSOLE__FINISHED = JobPackage.JOB_CONSOLE__FINISHED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_CONSOLE__NAME = JobPackage.JOB_CONSOLE__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_CONSOLE__PARAMETERS = JobPackage.JOB_CONSOLE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Help Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_CONSOLE__HELP_TEXT = JobPackage.JOB_CONSOLE__HELP_TEXT;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_CONSOLE__ARGS = JobPackage.JOB_CONSOLE__ARGS;

	/**
	 * The feature id for the '<em><b>Caller Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_CONSOLE__CALLER_NAME = JobPackage.JOB_CONSOLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>To Use Job Console</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_CONSOLE_FEATURE_COUNT = JobPackage.JOB_CONSOLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Copy Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_CONSOLE___COPY_PARAMS__RUNPARAMS = JobPackage.JOB_CONSOLE___COPY_PARAMS__RUNPARAMS;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_CONSOLE___RESET = JobPackage.JOB_CONSOLE___RESET;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_CONSOLE___RUN = JobPackage.JOB_CONSOLE___RUN;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_CONSOLE___RUN__RUNCONTEXT = JobPackage.JOB_CONSOLE___RUN__RUNCONTEXT;

	/**
	 * The operation id for the '<em>Cancel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_CONSOLE___CANCEL = JobPackage.JOB_CONSOLE___CANCEL;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_CONSOLE___SET_PROGRESS__STRING_FLOAT = JobPackage.JOB_CONSOLE___SET_PROGRESS__STRING_FLOAT;

	/**
	 * The operation id for the '<em>Set Progress</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_CONSOLE___SET_PROGRESS__PROGRESSFEEDBACK = JobPackage.JOB_CONSOLE___SET_PROGRESS__PROGRESSFEEDBACK;

	/**
	 * The operation id for the '<em>Get Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_CONSOLE___GET_RETURN = JobPackage.JOB_CONSOLE___GET_RETURN;

	/**
	 * The operation id for the '<em>Set Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_CONSOLE___SET_RETURN__RETURNFEEDBACK = JobPackage.JOB_CONSOLE___SET_RETURN__RETURNFEEDBACK;

	/**
	 * The operation id for the '<em>Construct Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_CONSOLE___CONSTRUCT_PARAMS = JobPackage.JOB_CONSOLE___CONSTRUCT_PARAMS;

	/**
	 * The operation id for the '<em>Add Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_CONSOLE___ADD_PARAMETER__STRING_JOBPARAMETERTYPE_EATTRIBUTE_STRING = JobPackage.JOB_CONSOLE___ADD_PARAMETER__STRING_JOBPARAMETERTYPE_EATTRIBUTE_STRING;

	/**
	 * The operation id for the '<em>Refresh Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_CONSOLE___REFRESH_PARAMETERS = JobPackage.JOB_CONSOLE___REFRESH_PARAMETERS;

	/**
	 * The operation id for the '<em>Get Arg As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_CONSOLE___GET_ARG_AS_STRING__INT = JobPackage.JOB_CONSOLE___GET_ARG_AS_STRING__INT;

	/**
	 * The operation id for the '<em>Get Arg As Int</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_CONSOLE___GET_ARG_AS_INT__INT = JobPackage.JOB_CONSOLE___GET_ARG_AS_INT__INT;

	/**
	 * The operation id for the '<em>Get Arg As Float</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_CONSOLE___GET_ARG_AS_FLOAT__INT = JobPackage.JOB_CONSOLE___GET_ARG_AS_FLOAT__INT;

	/**
	 * The operation id for the '<em>Get Arg As Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_CONSOLE___GET_ARG_AS_DATE__INT = JobPackage.JOB_CONSOLE___GET_ARG_AS_DATE__INT;

	/**
	 * The operation id for the '<em>Get Arg As Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_CONSOLE___GET_ARG_AS_DATE__INT_STRING = JobPackage.JOB_CONSOLE___GET_ARG_AS_DATE__INT_STRING;

	/**
	 * The operation id for the '<em>Set Args</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_CONSOLE___SET_ARGS = JobPackage.JOB_CONSOLE___SET_ARGS;

	/**
	 * The number of operations of the '<em>To Use Job Console</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_USE_JOB_CONSOLE_OPERATION_COUNT = JobPackage.JOB_CONSOLE_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the containment reference '{@link com.misc.touse.moplaf.tousejob.Domain#getJobscheduler <em>Jobscheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jobscheduler</em>'.
	 * @see com.misc.touse.moplaf.tousejob.Domain#getJobscheduler()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Jobscheduler();

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
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousejob.ToUseJob#getIteration <em>Iteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iteration</em>'.
	 * @see com.misc.touse.moplaf.tousejob.ToUseJob#getIteration()
	 * @see #getToUseJob()
	 * @generated
	 */
	EAttribute getToUseJob_Iteration();

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
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousejob.DummyToHoldRefToModel <em>Dummy To Hold Ref To Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dummy To Hold Ref To Model</em>'.
	 * @see com.misc.touse.moplaf.tousejob.DummyToHoldRefToModel
	 * @generated
	 */
	EClass getDummyToHoldRefToModel();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.tousejob.ToUseJobConsole <em>To Use Job Console</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Use Job Console</em>'.
	 * @see com.misc.touse.moplaf.tousejob.ToUseJobConsole
	 * @generated
	 */
	EClass getToUseJobConsole();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.tousejob.ToUseJobConsole#getCallerName <em>Caller Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caller Name</em>'.
	 * @see com.misc.touse.moplaf.tousejob.ToUseJobConsole#getCallerName()
	 * @see #getToUseJobConsole()
	 * @generated
	 */
	EAttribute getToUseJobConsole_CallerName();

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
		 * The meta object literal for the '<em><b>Jobscheduler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__JOBSCHEDULER = eINSTANCE.getDomain_Jobscheduler();

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
		 * The meta object literal for the '<em><b>Iteration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_USE_JOB__ITERATION = eINSTANCE.getToUseJob_Iteration();

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

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousejob.DummyToHoldRefToModel <em>Dummy To Hold Ref To Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousejob.DummyToHoldRefToModel
		 * @see com.misc.touse.moplaf.tousejob.impl.TousejobPackageImpl#getDummyToHoldRefToModel()
		 * @generated
		 */
		EClass DUMMY_TO_HOLD_REF_TO_MODEL = eINSTANCE.getDummyToHoldRefToModel();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.tousejob.impl.ToUseJobConsoleImpl <em>To Use Job Console</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.tousejob.impl.ToUseJobConsoleImpl
		 * @see com.misc.touse.moplaf.tousejob.impl.TousejobPackageImpl#getToUseJobConsole()
		 * @generated
		 */
		EClass TO_USE_JOB_CONSOLE = eINSTANCE.getToUseJobConsole();

		/**
		 * The meta object literal for the '<em><b>Caller Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_USE_JOB_CONSOLE__CALLER_NAME = eINSTANCE.getToUseJobConsole_CallerName();

	}

} //TousejobPackage
