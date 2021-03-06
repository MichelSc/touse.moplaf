/**
 */
package com.misc.touse.moplaf.report.ToUseReport;

import com.misc.common.moplaf.report.birt.BirtPackage;
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
 * @see com.misc.touse.moplaf.report.ToUseReport.ToUseReportFactory
 * @model kind="package"
 * @generated
 */
public interface ToUseReportPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ToUseReport";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common/touse/solverlp/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "trppt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToUseReportPackage eINSTANCE = com.misc.touse.moplaf.report.ToUseReport.impl.ToUseReportPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.report.ToUseReport.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.report.ToUseReport.impl.DomainImpl
	 * @see com.misc.touse.moplaf.report.ToUseReport.impl.ToUseReportPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Folders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__FOLDERS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__NAME = 1;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.report.ToUseReport.impl.FolderImpl <em>Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.report.ToUseReport.impl.FolderImpl
	 * @see com.misc.touse.moplaf.report.ToUseReport.impl.ToUseReportPackageImpl#getFolder()
	 * @generated
	 */
	int FOLDER = 1;

	/**
	 * The feature id for the '<em><b>As</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__AS = 0;

	/**
	 * The feature id for the '<em><b>Sub Folders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__SUB_FOLDERS = 1;

	/**
	 * The feature id for the '<em><b>Reporta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__REPORTA = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__NAME = 3;

	/**
	 * The number of structural features of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.report.ToUseReport.impl.AImpl <em>A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.report.ToUseReport.impl.AImpl
	 * @see com.misc.touse.moplaf.report.ToUseReport.impl.ToUseReportPackageImpl#getA()
	 * @generated
	 */
	int A = 2;

	/**
	 * The feature id for the '<em><b>Bs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__BS = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__CODE = 1;

	/**
	 * The feature id for the '<em><b>Some Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__SOME_DATE_TIME = 2;

	/**
	 * The feature id for the '<em><b>Some Real</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__SOME_REAL = 3;

	/**
	 * The number of structural features of the '<em>A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.report.ToUseReport.impl.BImpl <em>B</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.report.ToUseReport.impl.BImpl
	 * @see com.misc.touse.moplaf.report.ToUseReport.impl.ToUseReportPackageImpl#getB()
	 * @generated
	 */
	int B = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__CODE = 0;

	/**
	 * The feature id for the '<em><b>Some String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__SOME_STRING = 1;

	/**
	 * The number of structural features of the '<em>B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.report.ToUseReport.impl.ReportAImpl <em>Report A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.report.ToUseReport.impl.ReportAImpl
	 * @see com.misc.touse.moplaf.report.ToUseReport.impl.ToUseReportPackageImpl#getReportA()
	 * @generated
	 */
	int REPORT_A = 4;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_A__FORMAT = BirtPackage.REPORT_BIRT__FORMAT;

	/**
	 * The feature id for the '<em><b>Output File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_A__OUTPUT_FILE_PATH = BirtPackage.REPORT_BIRT__OUTPUT_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Last Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_A__LAST_GENERATED = BirtPackage.REPORT_BIRT__LAST_GENERATED;

	/**
	 * The feature id for the '<em><b>May Be Run</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_A__MAY_BE_RUN = BirtPackage.REPORT_BIRT__MAY_BE_RUN;

	/**
	 * The feature id for the '<em><b>May Be Run Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_A__MAY_BE_RUN_FEEDBACK = BirtPackage.REPORT_BIRT__MAY_BE_RUN_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Report Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_A__REPORT_CONTEXT = BirtPackage.REPORT_BIRT__REPORT_CONTEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_A__DESCRIPTION = BirtPackage.REPORT_BIRT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_A__CONTEXT = BirtPackage.REPORT_BIRT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Report A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_A_FEATURE_COUNT = BirtPackage.REPORT_BIRT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_A___RUN = BirtPackage.REPORT_BIRT___RUN;

	/**
	 * The operation id for the '<em>Get Report Design File URL</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_A___GET_REPORT_DESIGN_FILE_URL = BirtPackage.REPORT_BIRT___GET_REPORT_DESIGN_FILE_URL;

	/**
	 * The number of operations of the '<em>Report A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_A_OPERATION_COUNT = BirtPackage.REPORT_BIRT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.report.ToUseReport.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see com.misc.touse.moplaf.report.ToUseReport.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.report.ToUseReport.Domain#getFolders <em>Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Folders</em>'.
	 * @see com.misc.touse.moplaf.report.ToUseReport.Domain#getFolders()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Folders();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.report.ToUseReport.Domain#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.touse.moplaf.report.ToUseReport.Domain#getName()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Name();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.report.ToUseReport.Folder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder</em>'.
	 * @see com.misc.touse.moplaf.report.ToUseReport.Folder
	 * @generated
	 */
	EClass getFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.report.ToUseReport.Folder#getAs <em>As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>As</em>'.
	 * @see com.misc.touse.moplaf.report.ToUseReport.Folder#getAs()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_As();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.report.ToUseReport.Folder#getSubFolders <em>Sub Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Folders</em>'.
	 * @see com.misc.touse.moplaf.report.ToUseReport.Folder#getSubFolders()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_SubFolders();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.report.ToUseReport.Folder#getReporta <em>Reporta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reporta</em>'.
	 * @see com.misc.touse.moplaf.report.ToUseReport.Folder#getReporta()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_Reporta();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.report.ToUseReport.Folder#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.touse.moplaf.report.ToUseReport.Folder#getName()
	 * @see #getFolder()
	 * @generated
	 */
	EAttribute getFolder_Name();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.report.ToUseReport.A <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A</em>'.
	 * @see com.misc.touse.moplaf.report.ToUseReport.A
	 * @generated
	 */
	EClass getA();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.report.ToUseReport.A#getBs <em>Bs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bs</em>'.
	 * @see com.misc.touse.moplaf.report.ToUseReport.A#getBs()
	 * @see #getA()
	 * @generated
	 */
	EReference getA_Bs();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.report.ToUseReport.A#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see com.misc.touse.moplaf.report.ToUseReport.A#getCode()
	 * @see #getA()
	 * @generated
	 */
	EAttribute getA_Code();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.report.ToUseReport.A#getSomeDateTime <em>Some Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Some Date Time</em>'.
	 * @see com.misc.touse.moplaf.report.ToUseReport.A#getSomeDateTime()
	 * @see #getA()
	 * @generated
	 */
	EAttribute getA_SomeDateTime();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.report.ToUseReport.A#getSomeReal <em>Some Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Some Real</em>'.
	 * @see com.misc.touse.moplaf.report.ToUseReport.A#getSomeReal()
	 * @see #getA()
	 * @generated
	 */
	EAttribute getA_SomeReal();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.report.ToUseReport.B <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>B</em>'.
	 * @see com.misc.touse.moplaf.report.ToUseReport.B
	 * @generated
	 */
	EClass getB();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.report.ToUseReport.B#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see com.misc.touse.moplaf.report.ToUseReport.B#getCode()
	 * @see #getB()
	 * @generated
	 */
	EAttribute getB_Code();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.report.ToUseReport.B#getSomeString <em>Some String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Some String</em>'.
	 * @see com.misc.touse.moplaf.report.ToUseReport.B#getSomeString()
	 * @see #getB()
	 * @generated
	 */
	EAttribute getB_SomeString();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.report.ToUseReport.ReportA <em>Report A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Report A</em>'.
	 * @see com.misc.touse.moplaf.report.ToUseReport.ReportA
	 * @generated
	 */
	EClass getReportA();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.moplaf.report.ToUseReport.ReportA#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see com.misc.touse.moplaf.report.ToUseReport.ReportA#getContext()
	 * @see #getReportA()
	 * @generated
	 */
	EReference getReportA_Context();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ToUseReportFactory getToUseReportFactory();

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
		 * The meta object literal for the '{@link com.misc.touse.moplaf.report.ToUseReport.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.report.ToUseReport.impl.DomainImpl
		 * @see com.misc.touse.moplaf.report.ToUseReport.impl.ToUseReportPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Folders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__FOLDERS = eINSTANCE.getDomain_Folders();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__NAME = eINSTANCE.getDomain_Name();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.report.ToUseReport.impl.FolderImpl <em>Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.report.ToUseReport.impl.FolderImpl
		 * @see com.misc.touse.moplaf.report.ToUseReport.impl.ToUseReportPackageImpl#getFolder()
		 * @generated
		 */
		EClass FOLDER = eINSTANCE.getFolder();

		/**
		 * The meta object literal for the '<em><b>As</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__AS = eINSTANCE.getFolder_As();

		/**
		 * The meta object literal for the '<em><b>Sub Folders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__SUB_FOLDERS = eINSTANCE.getFolder_SubFolders();

		/**
		 * The meta object literal for the '<em><b>Reporta</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__REPORTA = eINSTANCE.getFolder_Reporta();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOLDER__NAME = eINSTANCE.getFolder_Name();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.report.ToUseReport.impl.AImpl <em>A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.report.ToUseReport.impl.AImpl
		 * @see com.misc.touse.moplaf.report.ToUseReport.impl.ToUseReportPackageImpl#getA()
		 * @generated
		 */
		EClass A = eINSTANCE.getA();

		/**
		 * The meta object literal for the '<em><b>Bs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference A__BS = eINSTANCE.getA_Bs();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A__CODE = eINSTANCE.getA_Code();

		/**
		 * The meta object literal for the '<em><b>Some Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A__SOME_DATE_TIME = eINSTANCE.getA_SomeDateTime();

		/**
		 * The meta object literal for the '<em><b>Some Real</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A__SOME_REAL = eINSTANCE.getA_SomeReal();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.report.ToUseReport.impl.BImpl <em>B</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.report.ToUseReport.impl.BImpl
		 * @see com.misc.touse.moplaf.report.ToUseReport.impl.ToUseReportPackageImpl#getB()
		 * @generated
		 */
		EClass B = eINSTANCE.getB();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute B__CODE = eINSTANCE.getB_Code();

		/**
		 * The meta object literal for the '<em><b>Some String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute B__SOME_STRING = eINSTANCE.getB_SomeString();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.report.ToUseReport.impl.ReportAImpl <em>Report A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.report.ToUseReport.impl.ReportAImpl
		 * @see com.misc.touse.moplaf.report.ToUseReport.impl.ToUseReportPackageImpl#getReportA()
		 * @generated
		 */
		EClass REPORT_A = eINSTANCE.getReportA();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT_A__CONTEXT = eINSTANCE.getReportA_Context();

	}

} //ToUseReportPackage
