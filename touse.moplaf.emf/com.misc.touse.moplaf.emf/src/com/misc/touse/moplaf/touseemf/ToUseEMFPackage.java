/**
 */
package com.misc.touse.moplaf.touseemf;

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
 * @see com.misc.touse.moplaf.touseemf.ToUseEMFFactory
 * @model kind="package"
 * @generated
 */
public interface ToUseEMFPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "touseemf";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/touse/moplaf/emf/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "toe";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToUseEMFPackage eINSTANCE = com.misc.touse.moplaf.touseemf.impl.ToUseEMFPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.touseemf.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.touseemf.impl.DomainImpl
	 * @see com.misc.touse.moplaf.touseemf.impl.ToUseEMFPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Folders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__FOLDERS = 1;

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
	 * The meta object id for the '{@link com.misc.touse.moplaf.touseemf.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.touseemf.impl.DocumentImpl
	 * @see com.misc.touse.moplaf.touseemf.impl.ToUseEMFPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf.touseemf.impl.FolderImpl <em>Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf.touseemf.impl.FolderImpl
	 * @see com.misc.touse.moplaf.touseemf.impl.ToUseEMFPackageImpl#getFolder()
	 * @generated
	 */
	int FOLDER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__DOCUMENTS = 1;

	/**
	 * The feature id for the '<em><b>Sub Folders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__SUB_FOLDERS = 2;

	/**
	 * The number of structural features of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.touseemf.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see com.misc.touse.moplaf.touseemf.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.touseemf.Domain#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.touse.moplaf.touseemf.Domain#getName()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.touseemf.Domain#getFolders <em>Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Folders</em>'.
	 * @see com.misc.touse.moplaf.touseemf.Domain#getFolders()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Folders();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.touseemf.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see com.misc.touse.moplaf.touseemf.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.touseemf.Document#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.touse.moplaf.touseemf.Document#getName()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Name();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf.touseemf.Folder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder</em>'.
	 * @see com.misc.touse.moplaf.touseemf.Folder
	 * @generated
	 */
	EClass getFolder();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf.touseemf.Folder#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.touse.moplaf.touseemf.Folder#getName()
	 * @see #getFolder()
	 * @generated
	 */
	EAttribute getFolder_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.touseemf.Folder#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documents</em>'.
	 * @see com.misc.touse.moplaf.touseemf.Folder#getDocuments()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_Documents();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf.touseemf.Folder#getSubFolders <em>Sub Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Folders</em>'.
	 * @see com.misc.touse.moplaf.touseemf.Folder#getSubFolders()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_SubFolders();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ToUseEMFFactory getToUseEMFFactory();

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
		 * The meta object literal for the '{@link com.misc.touse.moplaf.touseemf.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.touseemf.impl.DomainImpl
		 * @see com.misc.touse.moplaf.touseemf.impl.ToUseEMFPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__NAME = eINSTANCE.getDomain_Name();

		/**
		 * The meta object literal for the '<em><b>Folders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__FOLDERS = eINSTANCE.getDomain_Folders();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.touseemf.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.touseemf.impl.DocumentImpl
		 * @see com.misc.touse.moplaf.touseemf.impl.ToUseEMFPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__NAME = eINSTANCE.getDocument_Name();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf.touseemf.impl.FolderImpl <em>Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf.touseemf.impl.FolderImpl
		 * @see com.misc.touse.moplaf.touseemf.impl.ToUseEMFPackageImpl#getFolder()
		 * @generated
		 */
		EClass FOLDER = eINSTANCE.getFolder();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOLDER__NAME = eINSTANCE.getFolder_Name();

		/**
		 * The meta object literal for the '<em><b>Documents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__DOCUMENTS = eINSTANCE.getFolder_Documents();

		/**
		 * The meta object literal for the '<em><b>Sub Folders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__SUB_FOLDERS = eINSTANCE.getFolder_SubFolders();

	}

} //ToUseEMFPackage
