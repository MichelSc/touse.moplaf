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
public class TousejobFactoryImpl extends EFactoryImpl implements TousejobFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TousejobFactory init() {
		try {
			TousejobFactory theTousejobFactory = (TousejobFactory)EPackage.Registry.INSTANCE.getEFactory(TousejobPackage.eNS_URI);
			if (theTousejobFactory != null) {
				return theTousejobFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TousejobFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TousejobFactoryImpl() {
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
			case TousejobPackage.DOMAIN: return createDomain();
			case TousejobPackage.TO_USE_JOB: return createToUseJob();
			case TousejobPackage.TO_USE_JOB_RESULT: return createToUseJobResult();
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
	public ToUseJobResult createToUseJobResult() {
		ToUseJobResultImpl toUseJobResult = new ToUseJobResultImpl();
		return toUseJobResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TousejobPackage getTousejobPackage() {
		return (TousejobPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TousejobPackage getPackage() {
		return TousejobPackage.eINSTANCE;
	}

} //TousejobFactoryImpl