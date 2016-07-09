/**
 */
package com.misc.touse.moplaf.solver.tousesolver.impl;

import com.misc.touse.moplaf.solver.tousesolver.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TousesolverFactoryImpl extends EFactoryImpl implements TousesolverFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TousesolverFactory init() {
		try {
			TousesolverFactory theTousesolverFactory = (TousesolverFactory)EPackage.Registry.INSTANCE.getEFactory(TousesolverPackage.eNS_URI);
			if (theTousesolverFactory != null) {
				return theTousesolverFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TousesolverFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TousesolverFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TousesolverPackage.DOMAIN: return createDomain();
			case TousesolverPackage.KNAPSACK: return createKnapsack();
			case TousesolverPackage.ITEM: return createItem();
			case TousesolverPackage.DOMAIN_OBJECT_FOLDER: return createDomainObjectFolder();
			case TousesolverPackage.SCENARIO: return createScenario();
			case TousesolverPackage.KNAPSACK_SOL: return createKnapsackSol();
			case TousesolverPackage.KNAPSACK_LP: return createKnapsackLp();
			case TousesolverPackage.LP_ROOT: return createLpRoot();
			case TousesolverPackage.LP_KNAPSACK: return createLpKnapsack();
			case TousesolverPackage.LP_ITEM: return createLpItem();
			case TousesolverPackage.SOLVE_KNAPSACK: return createSolveKnapsack();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain createDomain() {
		DomainImpl domain = new DomainImpl();
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Knapsack createKnapsack() {
		KnapsackImpl knapsack = new KnapsackImpl();
		return knapsack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item createItem() {
		ItemImpl item = new ItemImpl();
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainObjectFolder createDomainObjectFolder() {
		DomainObjectFolderImpl domainObjectFolder = new DomainObjectFolderImpl();
		return domainObjectFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario createScenario() {
		ScenarioImpl scenario = new ScenarioImpl();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnapsackSol createKnapsackSol() {
		KnapsackSolImpl knapsackSol = new KnapsackSolImpl();
		return knapsackSol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnapsackLp createKnapsackLp() {
		KnapsackLpImpl knapsackLp = new KnapsackLpImpl();
		return knapsackLp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LpRoot createLpRoot() {
		LpRootImpl lpRoot = new LpRootImpl();
		return lpRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LpKnapsack createLpKnapsack() {
		LpKnapsackImpl lpKnapsack = new LpKnapsackImpl();
		return lpKnapsack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LpItem createLpItem() {
		LpItemImpl lpItem = new LpItemImpl();
		return lpItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolveKnapsack createSolveKnapsack() {
		SolveKnapsackImpl solveKnapsack = new SolveKnapsackImpl();
		return solveKnapsack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TousesolverPackage getTousesolverPackage() {
		return (TousesolverPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TousesolverPackage getPackage() {
		return TousesolverPackage.eINSTANCE;
	}

} //TousesolverFactoryImpl
