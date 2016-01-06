/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline.impl;

import com.misc.touse.moplaf.timeline.tousetimeline.*;

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
public class TousetimelineFactoryImpl extends EFactoryImpl implements TousetimelineFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TousetimelineFactory init() {
		try {
			TousetimelineFactory theTousetimelineFactory = (TousetimelineFactory)EPackage.Registry.INSTANCE.getEFactory(TousetimelinePackage.eNS_URI);
			if (theTousetimelineFactory != null) {
				return theTousetimelineFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TousetimelineFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TousetimelineFactoryImpl() {
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
			case TousetimelinePackage.DOMAIN: return createDomain();
			case TousetimelinePackage.DOMAIN_DISTRIBUTION: return createDomainDistribution();
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
	public DomainDistribution createDomainDistribution() {
		DomainDistributionImpl domainDistribution = new DomainDistributionImpl();
		return domainDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TousetimelinePackage getTousetimelinePackage() {
		return (TousetimelinePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TousetimelinePackage getPackage() {
		return TousetimelinePackage.eINSTANCE;
	}

} //TousetimelineFactoryImpl
