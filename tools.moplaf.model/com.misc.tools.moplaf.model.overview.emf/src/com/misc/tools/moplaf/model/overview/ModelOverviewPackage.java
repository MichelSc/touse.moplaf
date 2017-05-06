/**
 */
package com.misc.tools.moplaf.model.overview;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see com.misc.tools.moplaf.model.overview.ModelOverviewFactory
 * @model kind="package"
 * @generated
 */
public interface ModelOverviewPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "overview";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/tools/moplaf/model/overview/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mov";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelOverviewPackage eINSTANCE = com.misc.tools.moplaf.model.overview.impl.ModelOverviewPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.tools.moplaf.model.overview.impl.OverviewsImpl <em>Overviews</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.tools.moplaf.model.overview.impl.OverviewsImpl
	 * @see com.misc.tools.moplaf.model.overview.impl.ModelOverviewPackageImpl#getOverviews()
	 * @generated
	 */
	int OVERVIEWS = 0;

	/**
	 * The feature id for the '<em><b>Root Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERVIEWS__ROOT_OBJECTS = 0;

	/**
	 * The feature id for the '<em><b>Sub Overviews</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERVIEWS__SUB_OVERVIEWS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERVIEWS__NAME = 2;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERVIEWS__REMARKS = 3;

	/**
	 * The number of structural features of the '<em>Overviews</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERVIEWS_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Add Object</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERVIEWS___ADD_OBJECT__EOBJECT = 0;

	/**
	 * The number of operations of the '<em>Overviews</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERVIEWS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.misc.tools.moplaf.model.overview.impl.OverviewCountImpl <em>Overview Count</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.tools.moplaf.model.overview.impl.OverviewCountImpl
	 * @see com.misc.tools.moplaf.model.overview.impl.ModelOverviewPackageImpl#getOverviewCount()
	 * @generated
	 */
	int OVERVIEW_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.misc.tools.moplaf.model.overview.impl.OverviewObjectImpl <em>Overview Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.tools.moplaf.model.overview.impl.OverviewObjectImpl
	 * @see com.misc.tools.moplaf.model.overview.impl.ModelOverviewPackageImpl#getOverviewObject()
	 * @generated
	 */
	int OVERVIEW_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Root Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERVIEW_OBJECT__ROOT_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERVIEW_OBJECT__REMARKS = 1;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERVIEW_OBJECT__COUNT = 2;

	/**
	 * The feature id for the '<em><b>Overview Counts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERVIEW_OBJECT__OVERVIEW_COUNTS = 3;

	/**
	 * The feature id for the '<em><b>Root Overview Counts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERVIEW_OBJECT__ROOT_OVERVIEW_COUNTS = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERVIEW_OBJECT__DESCRIPTION = 5;

	/**
	 * The number of structural features of the '<em>Overview Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERVIEW_OBJECT_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERVIEW_OBJECT___REFRESH = 0;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERVIEW_OBJECT___RESET = 1;

	/**
	 * The number of operations of the '<em>Overview Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERVIEW_OBJECT_OPERATION_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Counted Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERVIEW_COUNT__COUNTED_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Sub Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERVIEW_COUNT__SUB_TYPES = 1;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERVIEW_COUNT__SUPER_TYPES = 2;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERVIEW_COUNT__COUNT = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERVIEW_COUNT__DESCRIPTION = 4;

	/**
	 * The number of structural features of the '<em>Overview Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERVIEW_COUNT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Overview Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERVIEW_COUNT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.misc.tools.moplaf.model.overview.Overviews <em>Overviews</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overviews</em>'.
	 * @see com.misc.tools.moplaf.model.overview.Overviews
	 * @generated
	 */
	EClass getOverviews();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.tools.moplaf.model.overview.Overviews#getRootObjects <em>Root Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Root Objects</em>'.
	 * @see com.misc.tools.moplaf.model.overview.Overviews#getRootObjects()
	 * @see #getOverviews()
	 * @generated
	 */
	EReference getOverviews_RootObjects();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.tools.moplaf.model.overview.Overviews#getSubOverviews <em>Sub Overviews</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Overviews</em>'.
	 * @see com.misc.tools.moplaf.model.overview.Overviews#getSubOverviews()
	 * @see #getOverviews()
	 * @generated
	 */
	EReference getOverviews_SubOverviews();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.tools.moplaf.model.overview.Overviews#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.tools.moplaf.model.overview.Overviews#getName()
	 * @see #getOverviews()
	 * @generated
	 */
	EAttribute getOverviews_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.tools.moplaf.model.overview.Overviews#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remarks</em>'.
	 * @see com.misc.tools.moplaf.model.overview.Overviews#getRemarks()
	 * @see #getOverviews()
	 * @generated
	 */
	EAttribute getOverviews_Remarks();

	/**
	 * Returns the meta object for the '{@link com.misc.tools.moplaf.model.overview.Overviews#addObject(org.eclipse.emf.ecore.EObject) <em>Add Object</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Object</em>' operation.
	 * @see com.misc.tools.moplaf.model.overview.Overviews#addObject(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getOverviews__AddObject__EObject();

	/**
	 * Returns the meta object for class '{@link com.misc.tools.moplaf.model.overview.OverviewObject <em>Overview Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overview Object</em>'.
	 * @see com.misc.tools.moplaf.model.overview.OverviewObject
	 * @generated
	 */
	EClass getOverviewObject();

	/**
	 * Returns the meta object for the reference '{@link com.misc.tools.moplaf.model.overview.OverviewObject#getRootObject <em>Root Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Object</em>'.
	 * @see com.misc.tools.moplaf.model.overview.OverviewObject#getRootObject()
	 * @see #getOverviewObject()
	 * @generated
	 */
	EReference getOverviewObject_RootObject();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.tools.moplaf.model.overview.OverviewObject#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remarks</em>'.
	 * @see com.misc.tools.moplaf.model.overview.OverviewObject#getRemarks()
	 * @see #getOverviewObject()
	 * @generated
	 */
	EAttribute getOverviewObject_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.tools.moplaf.model.overview.OverviewObject#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see com.misc.tools.moplaf.model.overview.OverviewObject#getCount()
	 * @see #getOverviewObject()
	 * @generated
	 */
	EAttribute getOverviewObject_Count();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.tools.moplaf.model.overview.OverviewObject#getOverviewCounts <em>Overview Counts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Overview Counts</em>'.
	 * @see com.misc.tools.moplaf.model.overview.OverviewObject#getOverviewCounts()
	 * @see #getOverviewObject()
	 * @generated
	 */
	EReference getOverviewObject_OverviewCounts();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.tools.moplaf.model.overview.OverviewObject#getRootOverviewCounts <em>Root Overview Counts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Root Overview Counts</em>'.
	 * @see com.misc.tools.moplaf.model.overview.OverviewObject#getRootOverviewCounts()
	 * @see #getOverviewObject()
	 * @generated
	 */
	EReference getOverviewObject_RootOverviewCounts();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.tools.moplaf.model.overview.OverviewObject#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.tools.moplaf.model.overview.OverviewObject#getDescription()
	 * @see #getOverviewObject()
	 * @generated
	 */
	EAttribute getOverviewObject_Description();

	/**
	 * Returns the meta object for the '{@link com.misc.tools.moplaf.model.overview.OverviewObject#refresh() <em>Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh</em>' operation.
	 * @see com.misc.tools.moplaf.model.overview.OverviewObject#refresh()
	 * @generated
	 */
	EOperation getOverviewObject__Refresh();

	/**
	 * Returns the meta object for the '{@link com.misc.tools.moplaf.model.overview.OverviewObject#reset() <em>Reset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset</em>' operation.
	 * @see com.misc.tools.moplaf.model.overview.OverviewObject#reset()
	 * @generated
	 */
	EOperation getOverviewObject__Reset();

	/**
	 * Returns the meta object for class '{@link com.misc.tools.moplaf.model.overview.OverviewCount <em>Overview Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overview Count</em>'.
	 * @see com.misc.tools.moplaf.model.overview.OverviewCount
	 * @generated
	 */
	EClass getOverviewCount();

	/**
	 * Returns the meta object for the reference '{@link com.misc.tools.moplaf.model.overview.OverviewCount#getCountedClass <em>Counted Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Counted Class</em>'.
	 * @see com.misc.tools.moplaf.model.overview.OverviewCount#getCountedClass()
	 * @see #getOverviewCount()
	 * @generated
	 */
	EReference getOverviewCount_CountedClass();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.tools.moplaf.model.overview.OverviewCount#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see com.misc.tools.moplaf.model.overview.OverviewCount#getCount()
	 * @see #getOverviewCount()
	 * @generated
	 */
	EAttribute getOverviewCount_Count();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.tools.moplaf.model.overview.OverviewCount#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.tools.moplaf.model.overview.OverviewCount#getDescription()
	 * @see #getOverviewCount()
	 * @generated
	 */
	EAttribute getOverviewCount_Description();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.tools.moplaf.model.overview.OverviewCount#getSubTypes <em>Sub Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Types</em>'.
	 * @see com.misc.tools.moplaf.model.overview.OverviewCount#getSubTypes()
	 * @see #getOverviewCount()
	 * @generated
	 */
	EReference getOverviewCount_SubTypes();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.tools.moplaf.model.overview.OverviewCount#getSuperTypes <em>Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Types</em>'.
	 * @see com.misc.tools.moplaf.model.overview.OverviewCount#getSuperTypes()
	 * @see #getOverviewCount()
	 * @generated
	 */
	EReference getOverviewCount_SuperTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelOverviewFactory getModelOverviewFactory();

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
		 * The meta object literal for the '{@link com.misc.tools.moplaf.model.overview.impl.OverviewsImpl <em>Overviews</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.tools.moplaf.model.overview.impl.OverviewsImpl
		 * @see com.misc.tools.moplaf.model.overview.impl.ModelOverviewPackageImpl#getOverviews()
		 * @generated
		 */
		EClass OVERVIEWS = eINSTANCE.getOverviews();

		/**
		 * The meta object literal for the '<em><b>Root Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OVERVIEWS__ROOT_OBJECTS = eINSTANCE.getOverviews_RootObjects();

		/**
		 * The meta object literal for the '<em><b>Sub Overviews</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OVERVIEWS__SUB_OVERVIEWS = eINSTANCE.getOverviews_SubOverviews();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERVIEWS__NAME = eINSTANCE.getOverviews_Name();

		/**
		 * The meta object literal for the '<em><b>Remarks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERVIEWS__REMARKS = eINSTANCE.getOverviews_Remarks();

		/**
		 * The meta object literal for the '<em><b>Add Object</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OVERVIEWS___ADD_OBJECT__EOBJECT = eINSTANCE.getOverviews__AddObject__EObject();

		/**
		 * The meta object literal for the '{@link com.misc.tools.moplaf.model.overview.impl.OverviewObjectImpl <em>Overview Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.tools.moplaf.model.overview.impl.OverviewObjectImpl
		 * @see com.misc.tools.moplaf.model.overview.impl.ModelOverviewPackageImpl#getOverviewObject()
		 * @generated
		 */
		EClass OVERVIEW_OBJECT = eINSTANCE.getOverviewObject();

		/**
		 * The meta object literal for the '<em><b>Root Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OVERVIEW_OBJECT__ROOT_OBJECT = eINSTANCE.getOverviewObject_RootObject();

		/**
		 * The meta object literal for the '<em><b>Remarks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERVIEW_OBJECT__REMARKS = eINSTANCE.getOverviewObject_Remarks();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERVIEW_OBJECT__COUNT = eINSTANCE.getOverviewObject_Count();

		/**
		 * The meta object literal for the '<em><b>Overview Counts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OVERVIEW_OBJECT__OVERVIEW_COUNTS = eINSTANCE.getOverviewObject_OverviewCounts();

		/**
		 * The meta object literal for the '<em><b>Root Overview Counts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OVERVIEW_OBJECT__ROOT_OVERVIEW_COUNTS = eINSTANCE.getOverviewObject_RootOverviewCounts();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERVIEW_OBJECT__DESCRIPTION = eINSTANCE.getOverviewObject_Description();

		/**
		 * The meta object literal for the '<em><b>Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OVERVIEW_OBJECT___REFRESH = eINSTANCE.getOverviewObject__Refresh();

		/**
		 * The meta object literal for the '<em><b>Reset</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OVERVIEW_OBJECT___RESET = eINSTANCE.getOverviewObject__Reset();

		/**
		 * The meta object literal for the '{@link com.misc.tools.moplaf.model.overview.impl.OverviewCountImpl <em>Overview Count</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.tools.moplaf.model.overview.impl.OverviewCountImpl
		 * @see com.misc.tools.moplaf.model.overview.impl.ModelOverviewPackageImpl#getOverviewCount()
		 * @generated
		 */
		EClass OVERVIEW_COUNT = eINSTANCE.getOverviewCount();

		/**
		 * The meta object literal for the '<em><b>Counted Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OVERVIEW_COUNT__COUNTED_CLASS = eINSTANCE.getOverviewCount_CountedClass();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERVIEW_COUNT__COUNT = eINSTANCE.getOverviewCount_Count();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERVIEW_COUNT__DESCRIPTION = eINSTANCE.getOverviewCount_Description();

		/**
		 * The meta object literal for the '<em><b>Sub Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OVERVIEW_COUNT__SUB_TYPES = eINSTANCE.getOverviewCount_SubTypes();

		/**
		 * The meta object literal for the '<em><b>Super Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OVERVIEW_COUNT__SUPER_TYPES = eINSTANCE.getOverviewCount_SuperTypes();

	}

} //ModelOverviewPackage
