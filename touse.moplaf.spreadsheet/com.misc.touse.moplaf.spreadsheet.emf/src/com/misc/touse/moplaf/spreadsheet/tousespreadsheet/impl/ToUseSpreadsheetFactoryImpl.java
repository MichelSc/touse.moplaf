/**
 */
package com.misc.touse.moplaf.spreadsheet.tousespreadsheet.impl;

import com.misc.touse.moplaf.spreadsheet.tousespreadsheet.*;

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
public class ToUseSpreadsheetFactoryImpl extends EFactoryImpl implements ToUseSpreadsheetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ToUseSpreadsheetFactory init() {
		try {
			ToUseSpreadsheetFactory theToUseSpreadsheetFactory = (ToUseSpreadsheetFactory)EPackage.Registry.INSTANCE.getEFactory(ToUseSpreadsheetPackage.eNS_URI);
			if (theToUseSpreadsheetFactory != null) {
				return theToUseSpreadsheetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ToUseSpreadsheetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseSpreadsheetFactoryImpl() {
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
			case ToUseSpreadsheetPackage.DOMAIN: return createDomain();
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
	public ToUseSpreadsheetPackage getToUseSpreadsheetPackage() {
		return (ToUseSpreadsheetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ToUseSpreadsheetPackage getPackage() {
		return ToUseSpreadsheetPackage.eINSTANCE;
	}

} //ToUseSpreadsheetFactoryImpl
