/**
 */
package com.misc.touse.moplaf.tousepropagator2calc.impl;

import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.propagator2.util.Bindings;
import com.misc.touse.moplaf.tousepropagator2.Resource;
import com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage;
import com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorFunctionTaskImpl;
import com.misc.touse.moplaf.tousepropagator2calc.CalcTaskResources;
import com.misc.touse.moplaf.tousepropagator2calc.LayerTaskResources;

import com.misc.touse.moplaf.tousepropagator2calc.ToUsePropagatorCalcPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Resources</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2calc.impl.CalcTaskResourcesImpl#getConcreteParent <em>Concrete Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalcTaskResourcesImpl extends ToUsePropagatorFunctionTaskImpl implements CalcTaskResources {
	/**
	 * The cached value of the '{@link #getConcreteParent() <em>Concrete Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteParent()
	 * @generated
	 * @ordered
	 */
	protected LayerTaskResources concreteParent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcTaskResourcesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUsePropagatorCalcPackage.Literals.CALC_TASK_RESOURCES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerTaskResources getConcreteParent() {
		if (concreteParent != null && concreteParent.eIsProxy()) {
			InternalEObject oldConcreteParent = (InternalEObject)concreteParent;
			concreteParent = (LayerTaskResources)eResolveProxy(oldConcreteParent);
			if (concreteParent != oldConcreteParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToUsePropagatorCalcPackage.CALC_TASK_RESOURCES__CONCRETE_PARENT, oldConcreteParent, concreteParent));
			}
		}
		return concreteParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerTaskResources basicGetConcreteParent() {
		return concreteParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcreteParent(LayerTaskResources newConcreteParent) {
		LayerTaskResources oldConcreteParent = concreteParent;
		concreteParent = newConcreteParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorCalcPackage.CALC_TASK_RESOURCES__CONCRETE_PARENT, oldConcreteParent, concreteParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUsePropagatorCalcPackage.CALC_TASK_RESOURCES__CONCRETE_PARENT:
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
			case ToUsePropagatorCalcPackage.CALC_TASK_RESOURCES__CONCRETE_PARENT:
				setConcreteParent((LayerTaskResources)newValue);
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
			case ToUsePropagatorCalcPackage.CALC_TASK_RESOURCES__CONCRETE_PARENT:
				setConcreteParent((LayerTaskResources)null);
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
			case ToUsePropagatorCalcPackage.CALC_TASK_RESOURCES__CONCRETE_PARENT:
				return concreteParent != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public PropagatorFunction doGetParent() {
		return this.getConcreteParent();
	}


	private static Bindings thisClassBindings = doCreateBindings();
	
	private static Bindings doCreateBindings(){
		Bindings resourceBindings = Bindings.constructEClassBindings(ToUsePropagatorPackage.Literals.RESOURCE, true);  // track toucher
		resourceBindings.addInboundBinding(ToUsePropagatorPackage.Literals.RESOURCE__START);
		resourceBindings.addInboundBinding(ToUsePropagatorPackage.Literals.RESOURCE__END);
		
		Bindings projectBindings = Bindings.constructEClassBindings(ToUsePropagatorPackage.Literals.PROJECT);
		projectBindings.addInboundBinding(ToUsePropagatorPackage.Literals.PROJECT__RESOURCES, resourceBindings);

		Bindings taskBindings = Bindings.constructEClassBindings(ToUsePropagatorPackage.Literals.TASK);
		taskBindings.addInboundBinding(ToUsePropagatorPackage.Literals.TASK__START);
		taskBindings.addInboundBinding(ToUsePropagatorPackage.Literals.TASK__END);
		taskBindings.addInboundBinding(ToUsePropagatorPackage.Literals.TASK__PROJECT, projectBindings);
		
		return taskBindings;
	}

	@Override
	public Bindings doGetBindings() {
		return thisClassBindings;
	}

	@Override
	public void doRefresh(EObject toucher) {
		this.getTask().refreshResourceCandidates((Resource) toucher);
	}

	@Override
	public void doRefresh() {
		this.getTask().refreshResourceCandidates();
	}
	
} //CalcTaskResourcesImpl
