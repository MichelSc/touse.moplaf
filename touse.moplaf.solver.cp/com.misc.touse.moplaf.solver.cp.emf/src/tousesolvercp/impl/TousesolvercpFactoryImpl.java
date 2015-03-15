/**
 */
package tousesolvercp.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tousesolvercp.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TousesolvercpFactoryImpl extends EFactoryImpl implements TousesolvercpFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TousesolvercpFactory init() {
		try {
			TousesolvercpFactory theTousesolvercpFactory = (TousesolvercpFactory)EPackage.Registry.INSTANCE.getEFactory(TousesolvercpPackage.eNS_URI);
			if (theTousesolvercpFactory != null) {
				return theTousesolvercpFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TousesolvercpFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TousesolvercpFactoryImpl() {
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
			case TousesolvercpPackage.TO_USE_SOLVER_CP_FOLDER: return createToUseSolverCpFolder();
			case TousesolvercpPackage.TO_USE_SOLVER_CP_GENERATOR: return createToUseSolverCpGenerator();
			case TousesolvercpPackage.TO_USE_SOLVER_CP_TUPLE: return createToUseSolverCpTuple();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseSolverCpFolder createToUseSolverCpFolder() {
		ToUseSolverCpFolderImpl toUseSolverCpFolder = new ToUseSolverCpFolderImpl();
		return toUseSolverCpFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseSolverCpGenerator createToUseSolverCpGenerator() {
		ToUseSolverCpGeneratorImpl toUseSolverCpGenerator = new ToUseSolverCpGeneratorImpl();
		return toUseSolverCpGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseSolverCpTuple createToUseSolverCpTuple() {
		ToUseSolverCpTupleImpl toUseSolverCpTuple = new ToUseSolverCpTupleImpl();
		return toUseSolverCpTuple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TousesolvercpPackage getTousesolvercpPackage() {
		return (TousesolvercpPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TousesolvercpPackage getPackage() {
		return TousesolvercpPackage.eINSTANCE;
	}

} //TousesolvercpFactoryImpl
