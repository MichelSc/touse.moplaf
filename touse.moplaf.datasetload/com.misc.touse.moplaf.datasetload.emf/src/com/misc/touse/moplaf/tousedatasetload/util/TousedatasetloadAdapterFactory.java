/**
 */
package com.misc.touse.moplaf.tousedatasetload.util;

import com.misc.common.moplaf.DatasetLoadDerby.DataSourceJdbDerbyEmbedded;

import com.misc.common.moplaf.DatasetLoadMariaDb.DatasetLoadJdbcMariaDb;
import com.misc.common.moplaf.datasetload.DataSource;
import com.misc.common.moplaf.datasetload.DataSourceJdbc;
import com.misc.common.moplaf.datasetload.Table;
import com.misc.common.moplaf.datasetload.TableGroup;
import com.misc.common.moplaf.datasetload.TableRow;

import com.misc.touse.moplaf.tousedatasetload.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.touse.moplaf.tousedatasetload.TousedatasetloadPackage
 * @generated
 */
public class TousedatasetloadAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TousedatasetloadPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TousedatasetloadAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TousedatasetloadPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TousedatasetloadSwitch<Adapter> modelSwitch =
		new TousedatasetloadSwitch<Adapter>() {
			@Override
			public Adapter caseFPD(FPD object) {
				return createFPDAdapter();
			}
			@Override
			public Adapter caseFPDGroupSortingPlan(FPDGroupSortingPlan object) {
				return createFPDGroupSortingPlanAdapter();
			}
			@Override
			public Adapter caseFPDSortingPlans(FPDSortingPlans object) {
				return createFPDSortingPlansAdapter();
			}
			@Override
			public Adapter caseFPDSortingPlanInputs(FPDSortingPlanInputs object) {
				return createFPDSortingPlanInputsAdapter();
			}
			@Override
			public Adapter caseFPDSortingPlan(FPDSortingPlan object) {
				return createFPDSortingPlanAdapter();
			}
			@Override
			public Adapter caseFPDSortingPlanInput(FPDSortingPlanInput object) {
				return createFPDSortingPlanInputAdapter();
			}
			@Override
			public Adapter caseMariaDbTestDatabase(MariaDbTestDatabase object) {
				return createMariaDbTestDatabaseAdapter();
			}
			@Override
			public Adapter caseMariaDbTestGroupTables(MariaDbTestGroupTables object) {
				return createMariaDbTestGroupTablesAdapter();
			}
			@Override
			public Adapter caseMariaDbTestTable(MariaDbTestTable object) {
				return createMariaDbTestTableAdapter();
			}
			@Override
			public Adapter caseMariaDbTestRow(MariaDbTestRow object) {
				return createMariaDbTestRowAdapter();
			}
			@Override
			public Adapter caseDataSource(DataSource object) {
				return createDataSourceAdapter();
			}
			@Override
			public Adapter caseDataSourceJdbc(DataSourceJdbc object) {
				return createDataSourceJdbcAdapter();
			}
			@Override
			public Adapter caseDataSourceJdbDerbyEmbedded(DataSourceJdbDerbyEmbedded object) {
				return createDataSourceJdbDerbyEmbeddedAdapter();
			}
			@Override
			public Adapter caseTableGroup(TableGroup object) {
				return createTableGroupAdapter();
			}
			@Override
			public Adapter caseTable(Table object) {
				return createTableAdapter();
			}
			@Override
			public Adapter caseTableRow(TableRow object) {
				return createTableRowAdapter();
			}
			@Override
			public Adapter caseDatasetLoadJdbcMariaDb(DatasetLoadJdbcMariaDb object) {
				return createDatasetLoadJdbcMariaDbAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousedatasetload.FPD <em>FPD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousedatasetload.FPD
	 * @generated
	 */
	public Adapter createFPDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousedatasetload.FPDGroupSortingPlan <em>FPD Group Sorting Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousedatasetload.FPDGroupSortingPlan
	 * @generated
	 */
	public Adapter createFPDGroupSortingPlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousedatasetload.FPDSortingPlans <em>FPD Sorting Plans</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousedatasetload.FPDSortingPlans
	 * @generated
	 */
	public Adapter createFPDSortingPlansAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousedatasetload.FPDSortingPlanInputs <em>FPD Sorting Plan Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousedatasetload.FPDSortingPlanInputs
	 * @generated
	 */
	public Adapter createFPDSortingPlanInputsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousedatasetload.FPDSortingPlan <em>FPD Sorting Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousedatasetload.FPDSortingPlan
	 * @generated
	 */
	public Adapter createFPDSortingPlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousedatasetload.FPDSortingPlanInput <em>FPD Sorting Plan Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousedatasetload.FPDSortingPlanInput
	 * @generated
	 */
	public Adapter createFPDSortingPlanInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousedatasetload.MariaDbTestDatabase <em>Maria Db Test Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousedatasetload.MariaDbTestDatabase
	 * @generated
	 */
	public Adapter createMariaDbTestDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousedatasetload.MariaDbTestGroupTables <em>Maria Db Test Group Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousedatasetload.MariaDbTestGroupTables
	 * @generated
	 */
	public Adapter createMariaDbTestGroupTablesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousedatasetload.MariaDbTestTable <em>Maria Db Test Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousedatasetload.MariaDbTestTable
	 * @generated
	 */
	public Adapter createMariaDbTestTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.tousedatasetload.MariaDbTestRow <em>Maria Db Test Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.tousedatasetload.MariaDbTestRow
	 * @generated
	 */
	public Adapter createMariaDbTestRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datasetload.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datasetload.DataSource
	 * @generated
	 */
	public Adapter createDataSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datasetload.DataSourceJdbc <em>Data Source Jdbc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datasetload.DataSourceJdbc
	 * @generated
	 */
	public Adapter createDataSourceJdbcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.DatasetLoadDerby.DataSourceJdbDerbyEmbedded <em>Data Source Jdb Derby Embedded</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.DatasetLoadDerby.DataSourceJdbDerbyEmbedded
	 * @generated
	 */
	public Adapter createDataSourceJdbDerbyEmbeddedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datasetload.TableGroup <em>Table Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datasetload.TableGroup
	 * @generated
	 */
	public Adapter createTableGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datasetload.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datasetload.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.datasetload.TableRow <em>Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.datasetload.TableRow
	 * @generated
	 */
	public Adapter createTableRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.DatasetLoadMariaDb.DatasetLoadJdbcMariaDb <em>Dataset Load Jdbc Maria Db</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.DatasetLoadMariaDb.DatasetLoadJdbcMariaDb
	 * @generated
	 */
	public Adapter createDatasetLoadJdbcMariaDbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TousedatasetloadAdapterFactory
