/**
 */
package com.misc.touse.moplaf.dbsynch.tousedbsynch.util;

import com.misc.common.moplaf.dbsynch.DataSource;
import com.misc.common.moplaf.dbsynch.DataSourceJdbc;
import com.misc.common.moplaf.dbsynch.DbSynchUnit;
import com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract;
import com.misc.common.moplaf.dbsynch.Table;
import com.misc.common.moplaf.dbsynch.TableRow;

import com.misc.common.moplaf.dbsynch.dbsynchderby.DataSourceJdbcDerbyEmbedded;

import com.misc.common.moplaf.dbsynch.dbsynchmysql.DataSourceJdbcMySql;

import com.misc.touse.moplaf.dbsynch.tousedbsynch.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.TousedbsynchPackage
 * @generated
 */
public class TousedbsynchAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TousedbsynchPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TousedbsynchAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TousedbsynchPackage.eINSTANCE;
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
	protected TousedbsynchSwitch<Adapter> modelSwitch =
		new TousedbsynchSwitch<Adapter>() {
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
			public Adapter caseFPDMySql(FPDMySql object) {
				return createFPDMySqlAdapter();
			}
			@Override
			public Adapter caseDbSynchUnitAbstract(DbSynchUnitAbstract object) {
				return createDbSynchUnitAbstractAdapter();
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
			public Adapter caseDataSourceJdbcDerbyEmbedded(DataSourceJdbcDerbyEmbedded object) {
				return createDataSourceJdbcDerbyEmbeddedAdapter();
			}
			@Override
			public Adapter caseDbSynchUnit(DbSynchUnit object) {
				return createDbSynchUnitAdapter();
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
			public Adapter caseDataSourceJdbcMySql(DataSourceJdbcMySql object) {
				return createDataSourceJdbcMySqlAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPD <em>FPD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.FPD
	 * @generated
	 */
	public Adapter createFPDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDGroupSortingPlan <em>FPD Group Sorting Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDGroupSortingPlan
	 * @generated
	 */
	public Adapter createFPDGroupSortingPlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlans <em>FPD Sorting Plans</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlans
	 * @generated
	 */
	public Adapter createFPDSortingPlansAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlanInputs <em>FPD Sorting Plan Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlanInputs
	 * @generated
	 */
	public Adapter createFPDSortingPlanInputsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan <em>FPD Sorting Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan
	 * @generated
	 */
	public Adapter createFPDSortingPlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlanInput <em>FPD Sorting Plan Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlanInput
	 * @generated
	 */
	public Adapter createFPDSortingPlanInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDMySql <em>FPD My Sql</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDMySql
	 * @generated
	 */
	public Adapter createFPDMySqlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract <em>Unit Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract
	 * @generated
	 */
	public Adapter createDbSynchUnitAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.dbsynch.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.dbsynch.DataSource
	 * @generated
	 */
	public Adapter createDataSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.dbsynch.DataSourceJdbc <em>Data Source Jdbc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.dbsynch.DataSourceJdbc
	 * @generated
	 */
	public Adapter createDataSourceJdbcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.dbsynch.dbsynchderby.DataSourceJdbcDerbyEmbedded <em>Data Source Jdbc Derby Embedded</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.dbsynch.dbsynchderby.DataSourceJdbcDerbyEmbedded
	 * @generated
	 */
	public Adapter createDataSourceJdbcDerbyEmbeddedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.dbsynch.DbSynchUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.dbsynch.DbSynchUnit
	 * @generated
	 */
	public Adapter createDbSynchUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.dbsynch.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.dbsynch.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.dbsynch.TableRow <em>Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.dbsynch.TableRow
	 * @generated
	 */
	public Adapter createTableRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.dbsynch.dbsynchmysql.DataSourceJdbcMySql <em>Data Source Jdbc My Sql</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.dbsynch.dbsynchmysql.DataSourceJdbcMySql
	 * @generated
	 */
	public Adapter createDataSourceJdbcMySqlAdapter() {
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

} //TousedbsynchAdapterFactory
