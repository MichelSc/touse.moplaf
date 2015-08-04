/**
 */
package com.misc.touse.moplaf.solver.tousesolverlp.impl;

import com.misc.touse.moplaf.solver.tousesolverlp.*;

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
public class ToUseSolverLpFactoryImpl extends EFactoryImpl implements ToUseSolverLpFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ToUseSolverLpFactory init() {
		try {
			ToUseSolverLpFactory theToUseSolverLpFactory = (ToUseSolverLpFactory)EPackage.Registry.INSTANCE.getEFactory(ToUseSolverLpPackage.eNS_URI);
			if (theToUseSolverLpFactory != null) {
				return theToUseSolverLpFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ToUseSolverLpFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseSolverLpFactoryImpl() {
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
			case ToUseSolverLpPackage.FOLDER: return createFolder();
			case ToUseSolverLpPackage.TO_USE_GENERATOR: return createToUseGenerator();
			case ToUseSolverLpPackage.TO_USE_TUPLE: return createToUseTuple();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Folder createFolder() {
		FolderImpl folder = new FolderImpl();
		return folder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseGenerator createToUseGenerator() {
		ToUseGeneratorImpl toUseGenerator = new ToUseGeneratorImpl();
		return toUseGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseTuple createToUseTuple() {
		ToUseTupleImpl toUseTuple = new ToUseTupleImpl();
		return toUseTuple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseSolverLpPackage getToUseSolverLpPackage() {
		return (ToUseSolverLpPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ToUseSolverLpPackage getPackage() {
		return ToUseSolverLpPackage.eINSTANCE;
	}

} //ToUseSolverLpFactoryImpl
