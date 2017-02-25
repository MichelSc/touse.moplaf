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
public class ToUseTimeLineFactoryImpl extends EFactoryImpl implements ToUseTimeLineFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ToUseTimeLineFactory init() {
		try {
			ToUseTimeLineFactory theToUseTimeLineFactory = (ToUseTimeLineFactory)EPackage.Registry.INSTANCE.getEFactory(ToUseTimeLinePackage.eNS_URI);
			if (theToUseTimeLineFactory != null) {
				return theToUseTimeLineFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ToUseTimeLineFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseTimeLineFactoryImpl() {
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
			case ToUseTimeLinePackage.DOMAIN: return createDomain();
			case ToUseTimeLinePackage.DOMAIN_DISTRIBUTION: return createDomainDistribution();
			case ToUseTimeLinePackage.FUNCTION_MINIMUM: return createFunctionMinimum();
			case ToUseTimeLinePackage.FUNCTION_INTERVAL: return createFunctionInterval();
			case ToUseTimeLinePackage.FUNCTION_CUMULATED: return createFunctionCumulated();
			case ToUseTimeLinePackage.FUNCTION_AVERAGE: return createFunctionAverage();
			case ToUseTimeLinePackage.FUNCTION_POSSIBLE: return createFunctionPossible();
			case ToUseTimeLinePackage.FUNCTION_EARLIEST_BELOW: return createFunctionEarliestBelow();
			case ToUseTimeLinePackage.FUNCTION_EARLIEST_OUTPUT: return createFunctionEarliestOutput();
			case ToUseTimeLinePackage.CONCRETE_OBJECT_WITH_TIME_LINE: return createConcreteObjectWithTimeLine();
			case ToUseTimeLinePackage.SOME_BASE_CLASS: return createSomeBaseClass();
			case ToUseTimeLinePackage.CONCRETE_OBJECT_TIME_BUCKET: return createConcreteObjectTimeBucket();
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
	public FunctionMinimum createFunctionMinimum() {
		FunctionMinimumImpl functionMinimum = new FunctionMinimumImpl();
		return functionMinimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionInterval createFunctionInterval() {
		FunctionIntervalImpl functionInterval = new FunctionIntervalImpl();
		return functionInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionCumulated createFunctionCumulated() {
		FunctionCumulatedImpl functionCumulated = new FunctionCumulatedImpl();
		return functionCumulated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionAverage createFunctionAverage() {
		FunctionAverageImpl functionAverage = new FunctionAverageImpl();
		return functionAverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPossible createFunctionPossible() {
		FunctionPossibleImpl functionPossible = new FunctionPossibleImpl();
		return functionPossible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionEarliestBelow createFunctionEarliestBelow() {
		FunctionEarliestBelowImpl functionEarliestBelow = new FunctionEarliestBelowImpl();
		return functionEarliestBelow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionEarliestOutput createFunctionEarliestOutput() {
		FunctionEarliestOutputImpl functionEarliestOutput = new FunctionEarliestOutputImpl();
		return functionEarliestOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteObjectWithTimeLine createConcreteObjectWithTimeLine() {
		ConcreteObjectWithTimeLineImpl concreteObjectWithTimeLine = new ConcreteObjectWithTimeLineImpl();
		return concreteObjectWithTimeLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SomeBaseClass createSomeBaseClass() {
		SomeBaseClassImpl someBaseClass = new SomeBaseClassImpl();
		return someBaseClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteObjectTimeBucket createConcreteObjectTimeBucket() {
		ConcreteObjectTimeBucketImpl concreteObjectTimeBucket = new ConcreteObjectTimeBucketImpl();
		return concreteObjectTimeBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseTimeLinePackage getToUseTimeLinePackage() {
		return (ToUseTimeLinePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ToUseTimeLinePackage getPackage() {
		return ToUseTimeLinePackage.eINSTANCE;
	}

} //ToUseTimeLineFactoryImpl
