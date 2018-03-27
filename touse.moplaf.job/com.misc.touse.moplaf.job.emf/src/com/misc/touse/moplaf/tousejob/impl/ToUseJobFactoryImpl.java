/**
 */
package com.misc.touse.moplaf.tousejob.impl;

import com.misc.touse.moplaf.tousejob.*;

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
public class ToUseJobFactoryImpl extends EFactoryImpl implements ToUseJobFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ToUseJobFactory init() {
		try {
			ToUseJobFactory theToUseJobFactory = (ToUseJobFactory)EPackage.Registry.INSTANCE.getEFactory(ToUseJobPackage.eNS_URI);
			if (theToUseJobFactory != null) {
				return theToUseJobFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ToUseJobFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseJobFactoryImpl() {
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
			case ToUseJobPackage.DOMAIN: return createDomain();
			case ToUseJobPackage.TO_USE_JOB: return createToUseJob();
			case ToUseJobPackage.TO_USE_JOB_CONSOLE: return createToUseJobConsole();
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
	public ToUseJob createToUseJob() {
		ToUseJobImpl toUseJob = new ToUseJobImpl();
		return toUseJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseJobConsole createToUseJobConsole() {
		ToUseJobConsoleImpl toUseJobConsole = new ToUseJobConsoleImpl();
		return toUseJobConsole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseJobPackage getToUseJobPackage() {
		return (ToUseJobPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ToUseJobPackage getPackage() {
		return ToUseJobPackage.eINSTANCE;
	}

} //ToUseJobFactoryImpl
