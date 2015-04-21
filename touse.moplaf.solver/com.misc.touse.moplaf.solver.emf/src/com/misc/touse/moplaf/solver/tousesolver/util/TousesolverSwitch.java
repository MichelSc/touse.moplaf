/**
 */
package com.misc.touse.moplaf.solver.tousesolver.util;

import com.misc.common.moplaf.solver.Generator;
import com.misc.common.moplaf.solver.GeneratorCons;
import com.misc.common.moplaf.solver.GeneratorElement;
import com.misc.common.moplaf.solver.GeneratorLpCons;
import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.solver.GeneratorTuple;
import com.misc.common.moplaf.solver.GeneratorTupleElement;
import com.misc.common.moplaf.solver.GeneratorVar;
import com.misc.common.moplaf.solver.IGeneratorTool;
import com.misc.common.moplaf.solver.SolutionProvider;
import com.misc.common.moplaf.solver.SolutionReader;
import com.misc.touse.moplaf.solver.tousesolver.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage
 * @generated
 */
public class TousesolverSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TousesolverPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TousesolverSwitch() {
		if (modelPackage == null) {
			modelPackage = TousesolverPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TousesolverPackage.DOMAIN: {
				Domain domain = (Domain)theEObject;
				T result = caseDomain(domain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TousesolverPackage.KNAPSACK: {
				Knapsack knapsack = (Knapsack)theEObject;
				T result = caseKnapsack(knapsack);
				if (result == null) result = caseDomainObject(knapsack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TousesolverPackage.ITEM: {
				Item item = (Item)theEObject;
				T result = caseItem(item);
				if (result == null) result = caseDomainObject(item);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TousesolverPackage.DOMAIN_OBJECT: {
				DomainObject domainObject = (DomainObject)theEObject;
				T result = caseDomainObject(domainObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TousesolverPackage.DOMAIN_OBJECT_FOLDER: {
				DomainObjectFolder domainObjectFolder = (DomainObjectFolder)theEObject;
				T result = caseDomainObjectFolder(domainObjectFolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TousesolverPackage.SCENARIO: {
				Scenario scenario = (Scenario)theEObject;
				T result = caseScenario(scenario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TousesolverPackage.KNAPSACK_SOL: {
				KnapsackSol knapsackSol = (KnapsackSol)theEObject;
				T result = caseKnapsackSol(knapsackSol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TousesolverPackage.KNAPSACK_LP: {
				KnapsackLp knapsackLp = (KnapsackLp)theEObject;
				T result = caseKnapsackLp(knapsackLp);
				if (result == null) result = caseGenerator(knapsackLp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TousesolverPackage.LP_ROOT: {
				LpRoot lpRoot = (LpRoot)theEObject;
				T result = caseLpRoot(lpRoot);
				if (result == null) result = caseGeneratorTuple(lpRoot);
				if (result == null) result = caseGeneratorElement(lpRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TousesolverPackage.LP_KNAPSACK: {
				LpKnapsack lpKnapsack = (LpKnapsack)theEObject;
				T result = caseLpKnapsack(lpKnapsack);
				if (result == null) result = caseGeneratorTuple(lpKnapsack);
				if (result == null) result = caseGeneratorElement(lpKnapsack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TousesolverPackage.LP_ITEM: {
				LpItem lpItem = (LpItem)theEObject;
				T result = caseLpItem(lpItem);
				if (result == null) result = caseGeneratorTuple(lpItem);
				if (result == null) result = caseGeneratorElement(lpItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TousesolverPackage.VAR_ITEM_IN_KNAPSACK: {
				VarItemInKnapsack varItemInKnapsack = (VarItemInKnapsack)theEObject;
				T result = caseVarItemInKnapsack(varItemInKnapsack);
				if (result == null) result = caseGeneratorLpVar(varItemInKnapsack);
				if (result == null) result = caseGeneratorVar(varItemInKnapsack);
				if (result == null) result = caseGeneratorTupleElement(varItemInKnapsack);
				if (result == null) result = caseGeneratorElement(varItemInKnapsack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TousesolverPackage.CONS_KNAPSACK_CAPACITY: {
				ConsKnapsackCapacity consKnapsackCapacity = (ConsKnapsackCapacity)theEObject;
				T result = caseConsKnapsackCapacity(consKnapsackCapacity);
				if (result == null) result = caseGeneratorLpCons(consKnapsackCapacity);
				if (result == null) result = caseGeneratorCons(consKnapsackCapacity);
				if (result == null) result = caseGeneratorTupleElement(consKnapsackCapacity);
				if (result == null) result = caseGeneratorElement(consKnapsackCapacity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TousesolverPackage.SOLUTION_READER_TO_USE: {
				SolutionReaderToUse solutionReaderToUse = (SolutionReaderToUse)theEObject;
				T result = caseSolutionReaderToUse(solutionReaderToUse);
				if (result == null) result = caseSolutionReader(solutionReaderToUse);
				if (result == null) result = caseSolutionProvider(solutionReaderToUse);
				if (result == null) result = caseIGeneratorTool(solutionReaderToUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomain(Domain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Knapsack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Knapsack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKnapsack(Knapsack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItem(Item object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainObject(DomainObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Object Folder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Object Folder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainObjectFolder(DomainObjectFolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenario(Scenario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Knapsack Sol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Knapsack Sol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKnapsackSol(KnapsackSol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Knapsack Lp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Knapsack Lp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKnapsackLp(KnapsackLp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lp Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lp Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLpRoot(LpRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lp Knapsack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lp Knapsack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLpKnapsack(LpKnapsack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lp Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lp Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLpItem(LpItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var Item In Knapsack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var Item In Knapsack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarItemInKnapsack(VarItemInKnapsack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cons Knapsack Capacity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cons Knapsack Capacity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsKnapsackCapacity(ConsKnapsackCapacity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solution Reader To Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solution Reader To Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolutionReaderToUse(SolutionReaderToUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenerator(Generator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Tuple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Tuple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorTuple(GeneratorTuple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Tuple Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Tuple Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorTupleElement(GeneratorTupleElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorElement(GeneratorElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorVar(GeneratorVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Lp Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Lp Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorLpVar(GeneratorLpVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Cons</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Cons</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorCons(GeneratorCons object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Lp Cons</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Lp Cons</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorLpCons(GeneratorLpCons object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IGenerator Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IGenerator Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIGeneratorTool(IGeneratorTool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solution Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solution Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolutionProvider(SolutionProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solution Reader</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solution Reader</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolutionReader(SolutionReader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TousesolverSwitch
