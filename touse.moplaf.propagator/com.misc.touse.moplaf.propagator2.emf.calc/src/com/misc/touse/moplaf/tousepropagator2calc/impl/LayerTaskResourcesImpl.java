/**
 */
package com.misc.touse.moplaf.tousepropagator2calc.impl;

import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorFunctionProjectImpl;
import com.misc.touse.moplaf.tousepropagator2calc.LayerTaskResources;
import com.misc.touse.moplaf.tousepropagator2calc.LayerTaskTimes;
import com.misc.touse.moplaf.tousepropagator2calc.ScopeProject;

import com.misc.touse.moplaf.tousepropagator2calc.ToUsePropagatorCalcPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layer Task Resources</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2calc.impl.LayerTaskResourcesImpl#getAntecedentLayerTaskTimes <em>Antecedent Layer Task Times</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2calc.impl.LayerTaskResourcesImpl#getConcreteParent <em>Concrete Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LayerTaskResourcesImpl extends ToUsePropagatorFunctionProjectImpl implements LayerTaskResources {
	/**
	 * The cached value of the '{@link #getAntecedentLayerTaskTimes() <em>Antecedent Layer Task Times</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntecedentLayerTaskTimes()
	 * @generated
	 * @ordered
	 */
	protected LayerTaskTimes antecedentLayerTaskTimes;

	/**
	 * The cached value of the '{@link #getConcreteParent() <em>Concrete Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteParent()
	 * @generated
	 * @ordered
	 */
	protected ScopeProject concreteParent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayerTaskResourcesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUsePropagatorCalcPackage.Literals.LAYER_TASK_RESOURCES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerTaskTimes getAntecedentLayerTaskTimes() {
		if (antecedentLayerTaskTimes != null && antecedentLayerTaskTimes.eIsProxy()) {
			InternalEObject oldAntecedentLayerTaskTimes = (InternalEObject)antecedentLayerTaskTimes;
			antecedentLayerTaskTimes = (LayerTaskTimes)eResolveProxy(oldAntecedentLayerTaskTimes);
			if (antecedentLayerTaskTimes != oldAntecedentLayerTaskTimes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToUsePropagatorCalcPackage.LAYER_TASK_RESOURCES__ANTECEDENT_LAYER_TASK_TIMES, oldAntecedentLayerTaskTimes, antecedentLayerTaskTimes));
			}
		}
		return antecedentLayerTaskTimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerTaskTimes basicGetAntecedentLayerTaskTimes() {
		return antecedentLayerTaskTimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAntecedentLayerTaskTimes(LayerTaskTimes newAntecedentLayerTaskTimes) {
		LayerTaskTimes oldAntecedentLayerTaskTimes = antecedentLayerTaskTimes;
		antecedentLayerTaskTimes = newAntecedentLayerTaskTimes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorCalcPackage.LAYER_TASK_RESOURCES__ANTECEDENT_LAYER_TASK_TIMES, oldAntecedentLayerTaskTimes, antecedentLayerTaskTimes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeProject getConcreteParent() {
		if (concreteParent != null && concreteParent.eIsProxy()) {
			InternalEObject oldConcreteParent = (InternalEObject)concreteParent;
			concreteParent = (ScopeProject)eResolveProxy(oldConcreteParent);
			if (concreteParent != oldConcreteParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToUsePropagatorCalcPackage.LAYER_TASK_RESOURCES__CONCRETE_PARENT, oldConcreteParent, concreteParent));
			}
		}
		return concreteParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeProject basicGetConcreteParent() {
		return concreteParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcreteParent(ScopeProject newConcreteParent) {
		ScopeProject oldConcreteParent = concreteParent;
		concreteParent = newConcreteParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorCalcPackage.LAYER_TASK_RESOURCES__CONCRETE_PARENT, oldConcreteParent, concreteParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUsePropagatorCalcPackage.LAYER_TASK_RESOURCES__ANTECEDENT_LAYER_TASK_TIMES:
				if (resolve) return getAntecedentLayerTaskTimes();
				return basicGetAntecedentLayerTaskTimes();
			case ToUsePropagatorCalcPackage.LAYER_TASK_RESOURCES__CONCRETE_PARENT:
				if (resolve) return getConcreteParent();
				return basicGetConcreteParent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ToUsePropagatorCalcPackage.LAYER_TASK_RESOURCES__ANTECEDENT_LAYER_TASK_TIMES:
				setAntecedentLayerTaskTimes((LayerTaskTimes)newValue);
				return;
			case ToUsePropagatorCalcPackage.LAYER_TASK_RESOURCES__CONCRETE_PARENT:
				setConcreteParent((ScopeProject)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ToUsePropagatorCalcPackage.LAYER_TASK_RESOURCES__ANTECEDENT_LAYER_TASK_TIMES:
				setAntecedentLayerTaskTimes((LayerTaskTimes)null);
				return;
			case ToUsePropagatorCalcPackage.LAYER_TASK_RESOURCES__CONCRETE_PARENT:
				setConcreteParent((ScopeProject)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ToUsePropagatorCalcPackage.LAYER_TASK_RESOURCES__ANTECEDENT_LAYER_TASK_TIMES:
				return antecedentLayerTaskTimes != null;
			case ToUsePropagatorCalcPackage.LAYER_TASK_RESOURCES__CONCRETE_PARENT:
				return concreteParent != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public PropagatorFunction doGetParent() {
		return this.getConcreteParent();
	}


	@Override
	public EList<PropagatorFunction> doGetExplicitAntecedents() {
		EList<PropagatorFunction> list = super.doGetExplicitAntecedents();
		list.add(this.getAntecedentLayerTaskTimes());
		return list;
	}
} //LayerTaskResourcesImpl
