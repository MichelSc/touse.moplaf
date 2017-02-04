package com.misc.touse.moplaf.tousepropagator2.util;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorFunction;

public class Util {

	/**
	 * Helper for reset the PropagatorFunctions
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	static public void reset(EObject root) {
		TreeIterator<EObject> iterator = root.eAllContents();
		while (iterator.hasNext()){
			EObject object = iterator.next();
			 if ( object instanceof ToUsePropagatorFunction ){
				 ToUsePropagatorFunction propagator = (ToUsePropagatorFunction)object;
				 propagator.setCalculated(false);
			 }  // the object is a ToUsePropagatorFunction
		} // traverse the objects
	}
}
