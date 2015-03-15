/**
 */
package com.misc.touse.moplaf.touseflock.util;

import com.misc.common.moplaf.flock.FlockScope;
import com.misc.common.moplaf.flock.Location;
import com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapterScope;
import com.misc.touse.moplaf.touseflock.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.touse.moplaf.touseflock.TouseflockPackage
 * @generated
 */
public class TouseflockAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TouseflockPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouseflockAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TouseflockPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TouseflockSwitch<Adapter> modelSwitch =
		new TouseflockSwitch<Adapter>() {
			@Override
			public Adapter caseToUseDomain(ToUseDomain object) {
				return createToUseDomainAdapter();
			}
			@Override
			public Adapter caseToUseResource(ToUseResource object) {
				return createToUseResourceAdapter();
			}
			@Override
			public Adapter caseToUseResourceTransition(ToUseResourceTransition object) {
				return createToUseResourceTransitionAdapter();
			}
			@Override
			public Adapter caseToUseResourceConfiguration(ToUseResourceConfiguration object) {
				return createToUseResourceConfigurationAdapter();
			}
			@Override
			public Adapter caseToUseResourceMount(ToUseResourceMount object) {
				return createToUseResourceMountAdapter();
			}
			@Override
			public Adapter caseTractor(Tractor object) {
				return createTractorAdapter();
			}
			@Override
			public Adapter caseTrailer(Trailer object) {
				return createTrailerAdapter();
			}
			@Override
			public Adapter caseShipment(Shipment object) {
				return createShipmentAdapter();
			}
			@Override
			public Adapter caseTractorConfiguration(TractorConfiguration object) {
				return createTractorConfigurationAdapter();
			}
			@Override
			public Adapter caseAttachTrailer(AttachTrailer object) {
				return createAttachTrailerAdapter();
			}
			@Override
			public Adapter caseDetachTrailer(DetachTrailer object) {
				return createDetachTrailerAdapter();
			}
			@Override
			public Adapter caseTrailerConfiguration(TrailerConfiguration object) {
				return createTrailerConfigurationAdapter();
			}
			@Override
			public Adapter caseLoadShipment(LoadShipment object) {
				return createLoadShipmentAdapter();
			}
			@Override
			public Adapter caseUnloadShipment(UnloadShipment object) {
				return createUnloadShipmentAdapter();
			}
			@Override
			public Adapter caseToUseLocation(ToUseLocation object) {
				return createToUseLocationAdapter();
			}
			@Override
			public Adapter caseFlockScopeToUse(FlockScopeToUse object) {
				return createFlockScopeToUseAdapter();
			}
			@Override
			public Adapter caseObjectWithPropagatorFunctionAdapter(ObjectWithPropagatorFunctionAdapter object) {
				return createObjectWithPropagatorFunctionAdapterAdapter();
			}
			@Override
			public Adapter caseObjectWithPropagatorFunctionAdapterScope(ObjectWithPropagatorFunctionAdapterScope object) {
				return createObjectWithPropagatorFunctionAdapterScopeAdapter();
			}
			@Override
			public Adapter caseLocation(Location object) {
				return createLocationAdapter();
			}
			@Override
			public Adapter caseFlockScope(FlockScope object) {
				return createFlockScopeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.touseflock.ToUseDomain <em>To Use Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.touseflock.ToUseDomain
	 * @generated
	 */
	public Adapter createToUseDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.touseflock.ToUseResource <em>To Use Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.touseflock.ToUseResource
	 * @generated
	 */
	public Adapter createToUseResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.touseflock.Tractor <em>Tractor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.touseflock.Tractor
	 * @generated
	 */
	public Adapter createTractorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.touseflock.ToUseResourceTransition <em>To Use Resource Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.touseflock.ToUseResourceTransition
	 * @generated
	 */
	public Adapter createToUseResourceTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.touseflock.ToUseResourceMount <em>To Use Resource Mount</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.touseflock.ToUseResourceMount
	 * @generated
	 */
	public Adapter createToUseResourceMountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.touseflock.ToUseResourceConfiguration <em>To Use Resource Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.touseflock.ToUseResourceConfiguration
	 * @generated
	 */
	public Adapter createToUseResourceConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.touseflock.Trailer <em>Trailer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.touseflock.Trailer
	 * @generated
	 */
	public Adapter createTrailerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.touseflock.Shipment <em>Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.touseflock.Shipment
	 * @generated
	 */
	public Adapter createShipmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.touseflock.AttachTrailer <em>Attach Trailer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.touseflock.AttachTrailer
	 * @generated
	 */
	public Adapter createAttachTrailerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.touseflock.DetachTrailer <em>Detach Trailer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.touseflock.DetachTrailer
	 * @generated
	 */
	public Adapter createDetachTrailerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.touseflock.LoadShipment <em>Load Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.touseflock.LoadShipment
	 * @generated
	 */
	public Adapter createLoadShipmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.touseflock.UnloadShipment <em>Unload Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.touseflock.UnloadShipment
	 * @generated
	 */
	public Adapter createUnloadShipmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.touseflock.ToUseLocation <em>To Use Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.touseflock.ToUseLocation
	 * @generated
	 */
	public Adapter createToUseLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.touseflock.FlockScopeToUse <em>Flock Scope To Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.touseflock.FlockScopeToUse
	 * @generated
	 */
	public Adapter createFlockScopeToUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapter <em>Object With Propagator Function Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapter
	 * @generated
	 */
	public Adapter createObjectWithPropagatorFunctionAdapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapterScope <em>Object With Propagator Function Adapter Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapterScope
	 * @generated
	 */
	public Adapter createObjectWithPropagatorFunctionAdapterScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.touseflock.TractorConfiguration <em>Tractor Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.touseflock.TractorConfiguration
	 * @generated
	 */
	public Adapter createTractorConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.touse.moplaf.touseflock.TrailerConfiguration <em>Trailer Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.touse.moplaf.touseflock.TrailerConfiguration
	 * @generated
	 */
	public Adapter createTrailerConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.flock.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.flock.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.flock.FlockScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.flock.FlockScope
	 * @generated
	 */
	public Adapter createFlockScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TouseflockAdapterFactory
