/**
 */
package com.misc.touse.moplaf.solver.tousesolver.impl;

import com.misc.common.moplaf.common.ReturnFeedback;
import com.misc.common.moplaf.job.RunContext;
import com.misc.common.moplaf.job.impl.JobConsoleImpl;
import com.misc.common.moplaf.solver.GeneratorLpGoal;
import com.misc.common.moplaf.solver.solvercplex.SolverCplex;
import com.misc.common.moplaf.solver.solvercplex.SolvercplexFactory;
import com.misc.touse.moplaf.solver.tousesolver.Domain;
import com.misc.touse.moplaf.solver.tousesolver.Knapsack;
import com.misc.touse.moplaf.solver.tousesolver.KnapsackLp;
import com.misc.touse.moplaf.solver.tousesolver.Scenario;
import com.misc.touse.moplaf.solver.tousesolver.DomainObjectFolder;
import com.misc.touse.moplaf.solver.tousesolver.Item;
import com.misc.touse.moplaf.solver.tousesolver.SolveKnapsack;
import com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solve Knapsack</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SolveKnapsackImpl extends JobConsoleImpl implements SolveKnapsack {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolveKnapsackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TousesolverPackage.Literals.SOLVE_KNAPSACK;
	}

	/*
	 * Implement a solve as stand alone
	 * (non-Javadoc)
	 * @see com.misc.common.moplaf.common.impl.JobImpl#runImpl()
	 */
	@Override
	public ReturnFeedback jobRunImpl(RunContext runContext) {
		float maxSeconds;
		try {
			maxSeconds = this.getArgAsFloat(0);
		} catch (Exception e) {
			return new ReturnFeedback("Parameters not parsed", e);
		}
		// get the domain
		Domain domain = (Domain)this.eContainer();
		
		// make the data folder
		DomainObjectFolder folder = TousesolverFactoryImpl.eINSTANCE.createDomainObjectFolder();
		folder.setName("Data job "+this.getName());
		domain.getRootFolder().add(folder);
		
		// make the knapsack
		Knapsack knapsack = TousesolverFactoryImpl.eINSTANCE.createKnapsack();
		knapsack.setName("demo Knapsack1");
		knapsack.setShortName("K1");
		knapsack.setCapacity(10.0f);
		folder.getObject().add(knapsack);
		
		// make the first item
		Item item1 = TousesolverFactoryImpl.eINSTANCE.createItem();
		item1.setName("demo Item1");
		item1.setShortName("I1");
		item1.setWeight(7.0f);
		item1.setValue(11.0f);
		folder.getObject().add(item1);
		
		// make the first item
		Item item2 = TousesolverFactoryImpl.eINSTANCE.createItem();
		item2.setName("demo Item2");
		item2.setShortName("I2");
		item2.setWeight(2.0f);
		item2.setValue(13.0f);
		folder.getObject().add(item2);
		
		// make the scenario
		Scenario scenario = TousesolverFactoryImpl.eINSTANCE.createScenario();
		scenario.setName("Scenario job "+this.getName());
		scenario.setKnapsack(knapsack);
		scenario.getItem().add(item1);
		scenario.getItem().add(item2);
		folder.getScenario().add(scenario);
		
		// make the linear formulation
		KnapsackLp lp = TousesolverFactoryImpl.eINSTANCE.createKnapsackLp();
		lp.setCode("demo lp job "+this.getName());
		scenario.getLP().add(lp);
		ReturnFeedback feedback = lp.run(runContext);
		if ( feedback.isFailure() ) { return feedback; }
		GeneratorLpGoal goal = lp.getValue();
		
		// make the solver
		SolverCplex solver = SolvercplexFactory.eINSTANCE.createSolverCplex();
		solver.setCode("demo run job "+this.getName());
		lp.getSolver().add(solver);
		solver.constructSolverGoal(goal);
		solver.setSolverMaxDuration(maxSeconds);
		
		// run the solver
		return solver.run(runContext);
		
	}

} //SolveKnapsackImpl
