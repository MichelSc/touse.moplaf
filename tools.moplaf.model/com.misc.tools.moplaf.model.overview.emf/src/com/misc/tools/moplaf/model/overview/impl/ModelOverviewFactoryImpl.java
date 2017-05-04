/**
 */
package com.misc.tools.moplaf.model.overview.impl;

import com.misc.tools.moplaf.model.overview.*;

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
public class ModelOverviewFactoryImpl extends EFactoryImpl implements ModelOverviewFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelOverviewFactory init() {
		try {
			ModelOverviewFactory theModelOverviewFactory = (ModelOverviewFactory)EPackage.Registry.INSTANCE.getEFactory(ModelOverviewPackage.eNS_URI);
			if (theModelOverviewFactory != null) {
				return theModelOverviewFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelOverviewFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelOverviewFactoryImpl() {
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
			case ModelOverviewPackage.OVERVIEWS: return createOverviews();
			case ModelOverviewPackage.OVERVIEW_OBJECT: return createOverviewObject();
			case ModelOverviewPackage.OVERVIEW_COUNT: return createOverviewCount();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Overviews createOverviews() {
		OverviewsImpl overviews = new OverviewsImpl();
		return overviews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverviewObject createOverviewObject() {
		OverviewObjectImpl overviewObject = new OverviewObjectImpl();
		return overviewObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverviewCount createOverviewCount() {
		OverviewCountImpl overviewCount = new OverviewCountImpl();
		return overviewCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelOverviewPackage getModelOverviewPackage() {
		return (ModelOverviewPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelOverviewPackage getPackage() {
		return ModelOverviewPackage.eINSTANCE;
	}

} //ModelOverviewFactoryImpl
