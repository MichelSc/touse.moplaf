/**
 */
package com.misc.touse.moplaf.touseflock.util;

import com.misc.common.moplaf.flock.FlockScope;
import com.misc.common.moplaf.flock.Location;
import com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapterScope;
import com.misc.touse.moplaf.touseflock.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.misc.touse.moplaf.touseflock.TouseflockPackage
 * @generated
 */
public class TouseflockSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TouseflockPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouseflockSwitch() {
		if (modelPackage == null) {
			modelPackage = TouseflockPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TouseflockPackage.TO_USE_DOMAIN: {
				ToUseDomain toUseDomain = (ToUseDomain)theEObject;
				T result = caseToUseDomain(toUseDomain);
				if (result == null) result = caseObjectWithPropagatorFunctionAdapter(toUseDomain);
				if (result == null) result = caseObjectWithPropagatorFunctionAdapterScope(toUseDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouseflockPackage.TO_USE_RESOURCE: {
				ToUseResource toUseResource = (ToUseResource)theEObject;
				T result = caseToUseResource(toUseResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouseflockPackage.TO_USE_RESOURCE_TRANSITION: {
				ToUseResourceTransition toUseResourceTransition = (ToUseResourceTransition)theEObject;
				T result = caseToUseResourceTransition(toUseResourceTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouseflockPackage.TO_USE_RESOURCE_CONFIGURATION: {
				ToUseResourceConfiguration toUseResourceConfiguration = (ToUseResourceConfiguration)theEObject;
				T result = caseToUseResourceConfiguration(toUseResourceConfiguration);
				if (result == null) result = caseToUseResourceTransition(toUseResourceConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouseflockPackage.TO_USE_RESOURCE_MOUNT: {
				ToUseResourceMount toUseResourceMount = (ToUseResourceMount)theEObject;
				T result = caseToUseResourceMount(toUseResourceMount);
				if (result == null) result = caseToUseResourceTransition(toUseResourceMount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouseflockPackage.TRACTOR: {
				Tractor tractor = (Tractor)theEObject;
				T result = caseTractor(tractor);
				if (result == null) result = caseToUseResource(tractor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouseflockPackage.TRAILER: {
				Trailer trailer = (Trailer)theEObject;
				T result = caseTrailer(trailer);
				if (result == null) result = caseToUseResource(trailer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouseflockPackage.SHIPMENT: {
				Shipment shipment = (Shipment)theEObject;
				T result = caseShipment(shipment);
				if (result == null) result = caseToUseResource(shipment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouseflockPackage.TRACTOR_CONFIGURATION: {
				TractorConfiguration tractorConfiguration = (TractorConfiguration)theEObject;
				T result = caseTractorConfiguration(tractorConfiguration);
				if (result == null) result = caseToUseResourceConfiguration(tractorConfiguration);
				if (result == null) result = caseToUseResourceTransition(tractorConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouseflockPackage.ATTACH_TRAILER: {
				AttachTrailer attachTrailer = (AttachTrailer)theEObject;
				T result = caseAttachTrailer(attachTrailer);
				if (result == null) result = caseToUseResourceMount(attachTrailer);
				if (result == null) result = caseToUseResourceTransition(attachTrailer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouseflockPackage.DETACH_TRAILER: {
				DetachTrailer detachTrailer = (DetachTrailer)theEObject;
				T result = caseDetachTrailer(detachTrailer);
				if (result == null) result = caseToUseResourceMount(detachTrailer);
				if (result == null) result = caseToUseResourceTransition(detachTrailer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouseflockPackage.TRAILER_CONFIGURATION: {
				TrailerConfiguration trailerConfiguration = (TrailerConfiguration)theEObject;
				T result = caseTrailerConfiguration(trailerConfiguration);
				if (result == null) result = caseToUseResourceConfiguration(trailerConfiguration);
				if (result == null) result = caseToUseResourceTransition(trailerConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouseflockPackage.LOAD_SHIPMENT: {
				LoadShipment loadShipment = (LoadShipment)theEObject;
				T result = caseLoadShipment(loadShipment);
				if (result == null) result = caseToUseResourceMount(loadShipment);
				if (result == null) result = caseToUseResourceTransition(loadShipment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouseflockPackage.UNLOAD_SHIPMENT: {
				UnloadShipment unloadShipment = (UnloadShipment)theEObject;
				T result = caseUnloadShipment(unloadShipment);
				if (result == null) result = caseToUseResourceMount(unloadShipment);
				if (result == null) result = caseToUseResourceTransition(unloadShipment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouseflockPackage.TO_USE_LOCATION: {
				ToUseLocation toUseLocation = (ToUseLocation)theEObject;
				T result = caseToUseLocation(toUseLocation);
				if (result == null) result = caseLocation(toUseLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouseflockPackage.FLOCK_SCOPE_TO_USE: {
				FlockScopeToUse flockScopeToUse = (FlockScopeToUse)theEObject;
				T result = caseFlockScopeToUse(flockScopeToUse);
				if (result == null) result = caseFlockScope(flockScopeToUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To Use Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To Use Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToUseDomain(ToUseDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To Use Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To Use Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToUseResource(ToUseResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tractor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tractor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTractor(Tractor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To Use Resource Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To Use Resource Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToUseResourceTransition(ToUseResourceTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To Use Resource Mount</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To Use Resource Mount</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToUseResourceMount(ToUseResourceMount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To Use Resource Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To Use Resource Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToUseResourceConfiguration(ToUseResourceConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trailer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trailer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrailer(Trailer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shipment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shipment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShipment(Shipment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attach Trailer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attach Trailer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachTrailer(AttachTrailer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Detach Trailer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Detach Trailer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetachTrailer(DetachTrailer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Shipment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Shipment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadShipment(LoadShipment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unload Shipment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unload Shipment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnloadShipment(UnloadShipment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To Use Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To Use Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToUseLocation(ToUseLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flock Scope To Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flock Scope To Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlockScopeToUse(FlockScopeToUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object With Propagator Function Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object With Propagator Function Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectWithPropagatorFunctionAdapter(ObjectWithPropagatorFunctionAdapter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object With Propagator Function Adapter Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object With Propagator Function Adapter Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectWithPropagatorFunctionAdapterScope(ObjectWithPropagatorFunctionAdapterScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tractor Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tractor Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTractorConfiguration(TractorConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trailer Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trailer Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrailerConfiguration(TrailerConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlockScope(FlockScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TouseflockSwitch
