/**
 */
package com.misc.touse.moplaf.tousepropagator2calc.impl;

import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorFunctionProjectImpl;
import com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHours;
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
 * An implementation of the model object '<em><b>Layer Task Times</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2calc.impl.LayerTaskTimesImpl#getConcreteParent <em>Concrete Parent</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2calc.impl.LayerTaskTimesImpl#getAntecedentLayerTaskHours <em>Antecedent Layer Task Hours</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LayerTaskTimesImpl extends ToUsePropagatorFunctionProjectImpl implements LayerTaskTimes {
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
	 * The cached value of the '{@link #getAntecedentLayerTaskHours() <em>Antecedent Layer Task Hours</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntecedentLayerTaskHours()
	 * @generated
	 * @ordered
	 */
	protected LayerTaskHours antecedentLayerTaskHours;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayerTaskTimesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUsePropagatorCalcPackage.Literals.LAYER_TASK_TIMES;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToUsePropagatorCalcPackage.LAYER_TASK_TIMES__CONCRETE_PARENT, oldConcreteParent, concreteParent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorCalcPackage.LAYER_TASK_TIMES__CONCRETE_PARENT, oldConcreteParent, concreteParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerTaskHours getAntecedentLayerTaskHours() {
		if (antecedentLayerTaskHours != null && antecedentLayerTaskHours.eIsProxy()) {
			InternalEObject oldAntecedentLayerTaskHours = (InternalEObject)antecedentLayerTaskHours;
			antecedentLayerTaskHours = (LayerTaskHours)eResolveProxy(oldAntecedentLayerTaskHours);
			if (antecedentLayerTaskHours != oldAntecedentLayerTaskHours) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToUsePropagatorCalcPackage.LAYER_TASK_TIMES__ANTECEDENT_LAYER_TASK_HOURS, oldAntecedentLayerTaskHours, antecedentLayerTaskHours));
			}
		}
		return antecedentLayerTaskHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerTaskHours basicGetAntecedentLayerTaskHours() {
		return antecedentLayerTaskHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAntecedentLayerTaskHours(LayerTaskHours newAntecedentLayerTaskHours) {
		LayerTaskHours oldAntecedentLayerTaskHours = antecedentLayerTaskHours;
		antecedentLayerTaskHours = newAntecedentLayerTaskHours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorCalcPackage.LAYER_TASK_TIMES__ANTECEDENT_LAYER_TASK_HOURS, oldAntecedentLayerTaskHours, antecedentLayerTaskHours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUsePropagatorCalcPackage.LAYER_TASK_TIMES__CONCRETE_PARENT:
				if (resolve) return getConcreteParent();
				return basicGetConcreteParent();
			case ToUsePropagatorCalcPackage.LAYER_TASK_TIMES__ANTECEDENT_LAYER_TASK_HOURS:
				if (resolve) return getAntecedentLayerTaskHours();
				return basicGetAntecedentLayerTaskHours();
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
			case ToUsePropagatorCalcPackage.LAYER_TASK_TIMES__CONCRETE_PARENT:
				setConcreteParent((ScopeProject)newValue);
				return;
			case ToUsePropagatorCalcPackage.LAYER_TASK_TIMES__ANTECEDENT_LAYER_TASK_HOURS:
				setAntecedentLayerTaskHours((LayerTaskHours)newValue);
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
			case ToUsePropagatorCalcPackage.LAYER_TASK_TIMES__CONCRETE_PARENT:
				setConcreteParent((ScopeProject)null);
				return;
			case ToUsePropagatorCalcPackage.LAYER_TASK_TIMES__ANTECEDENT_LAYER_TASK_HOURS:
				setAntecedentLayerTaskHours((LayerTaskHours)null);
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
			case ToUsePropagatorCalcPackage.LAYER_TASK_TIMES__CONCRETE_PARENT:
				return concreteParent != null;
			case ToUsePropagatorCalcPackage.LAYER_TASK_TIMES__ANTECEDENT_LAYER_TASK_HOURS:
				return antecedentLayerTaskHours != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public PropagatorFunction doGetParent() {
		return this.getConcreteParent();
	}
	
	@Override
	public void doCollectExplicitAntecedents(EList<PropagatorFunction> antecedents) {
		antecedents.add(this.getAntecedentLayerTaskHours());
	}

} //LayerTaskTimesImpl
