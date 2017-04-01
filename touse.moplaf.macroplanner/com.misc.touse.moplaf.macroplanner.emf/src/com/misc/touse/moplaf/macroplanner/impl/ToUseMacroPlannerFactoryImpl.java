/**
 */
package com.misc.touse.moplaf.macroplanner.impl;

import com.misc.touse.moplaf.macroplanner.*;

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
public class ToUseMacroPlannerFactoryImpl extends EFactoryImpl implements ToUseMacroPlannerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ToUseMacroPlannerFactory init() {
		try {
			ToUseMacroPlannerFactory theToUseMacroPlannerFactory = (ToUseMacroPlannerFactory)EPackage.Registry.INSTANCE.getEFactory(ToUseMacroPlannerPackage.eNS_URI);
			if (theToUseMacroPlannerFactory != null) {
				return theToUseMacroPlannerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ToUseMacroPlannerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseMacroPlannerFactoryImpl() {
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
			case ToUseMacroPlannerPackage.DOMAIN: return createDomain();
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
	public ToUseMacroPlannerPackage getToUseMacroPlannerPackage() {
		return (ToUseMacroPlannerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ToUseMacroPlannerPackage getPackage() {
		return ToUseMacroPlannerPackage.eINSTANCE;
	}

} //ToUseMacroPlannerFactoryImpl
