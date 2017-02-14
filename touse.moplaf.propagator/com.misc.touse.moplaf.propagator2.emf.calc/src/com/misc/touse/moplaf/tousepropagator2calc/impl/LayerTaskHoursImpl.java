/**
 */
package com.misc.touse.moplaf.tousepropagator2calc.impl;

import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorFunctionProjectImpl;
import com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHours;
import com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHoursItem;
import com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHoursVar;
import com.misc.touse.moplaf.tousepropagator2calc.ScopeProject;

import com.misc.touse.moplaf.tousepropagator2calc.ToUsePropagatorCalcPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layer Task Hours</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2calc.impl.LayerTaskHoursImpl#getConcreteParent <em>Concrete Parent</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2calc.impl.LayerTaskHoursImpl#getAntecedentLayerTaskHoursItem <em>Antecedent Layer Task Hours Item</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2calc.impl.LayerTaskHoursImpl#getAntecedentLayerTaskHoursVar <em>Antecedent Layer Task Hours Var</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LayerTaskHoursImpl extends ToUsePropagatorFunctionProjectImpl implements LayerTaskHours {
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
	 * The cached value of the '{@link #getAntecedentLayerTaskHoursItem() <em>Antecedent Layer Task Hours Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntecedentLayerTaskHoursItem()
	 * @generated
	 * @ordered
	 */
	protected LayerTaskHoursItem antecedentLayerTaskHoursItem;

	/**
	 * The cached value of the '{@link #getAntecedentLayerTaskHoursVar() <em>Antecedent Layer Task Hours Var</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntecedentLayerTaskHoursVar()
	 * @generated
	 * @ordered
	 */
	protected LayerTaskHoursVar antecedentLayerTaskHoursVar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayerTaskHoursImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUsePropagatorCalcPackage.Literals.LAYER_TASK_HOURS;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToUsePropagatorCalcPackage.LAYER_TASK_HOURS__CONCRETE_PARENT, oldConcreteParent, concreteParent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorCalcPackage.LAYER_TASK_HOURS__CONCRETE_PARENT, oldConcreteParent, concreteParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerTaskHoursItem getAntecedentLayerTaskHoursItem() {
		if (antecedentLayerTaskHoursItem != null && antecedentLayerTaskHoursItem.eIsProxy()) {
			InternalEObject oldAntecedentLayerTaskHoursItem = (InternalEObject)antecedentLayerTaskHoursItem;
			antecedentLayerTaskHoursItem = (LayerTaskHoursItem)eResolveProxy(oldAntecedentLayerTaskHoursItem);
			if (antecedentLayerTaskHoursItem != oldAntecedentLayerTaskHoursItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToUsePropagatorCalcPackage.LAYER_TASK_HOURS__ANTECEDENT_LAYER_TASK_HOURS_ITEM, oldAntecedentLayerTaskHoursItem, antecedentLayerTaskHoursItem));
			}
		}
		return antecedentLayerTaskHoursItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerTaskHoursItem basicGetAntecedentLayerTaskHoursItem() {
		return antecedentLayerTaskHoursItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAntecedentLayerTaskHoursItem(LayerTaskHoursItem newAntecedentLayerTaskHoursItem) {
		LayerTaskHoursItem oldAntecedentLayerTaskHoursItem = antecedentLayerTaskHoursItem;
		antecedentLayerTaskHoursItem = newAntecedentLayerTaskHoursItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorCalcPackage.LAYER_TASK_HOURS__ANTECEDENT_LAYER_TASK_HOURS_ITEM, oldAntecedentLayerTaskHoursItem, antecedentLayerTaskHoursItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerTaskHoursVar getAntecedentLayerTaskHoursVar() {
		if (antecedentLayerTaskHoursVar != null && antecedentLayerTaskHoursVar.eIsProxy()) {
			InternalEObject oldAntecedentLayerTaskHoursVar = (InternalEObject)antecedentLayerTaskHoursVar;
			antecedentLayerTaskHoursVar = (LayerTaskHoursVar)eResolveProxy(oldAntecedentLayerTaskHoursVar);
			if (antecedentLayerTaskHoursVar != oldAntecedentLayerTaskHoursVar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToUsePropagatorCalcPackage.LAYER_TASK_HOURS__ANTECEDENT_LAYER_TASK_HOURS_VAR, oldAntecedentLayerTaskHoursVar, antecedentLayerTaskHoursVar));
			}
		}
		return antecedentLayerTaskHoursVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerTaskHoursVar basicGetAntecedentLayerTaskHoursVar() {
		return antecedentLayerTaskHoursVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAntecedentLayerTaskHoursVar(LayerTaskHoursVar newAntecedentLayerTaskHoursVar) {
		LayerTaskHoursVar oldAntecedentLayerTaskHoursVar = antecedentLayerTaskHoursVar;
		antecedentLayerTaskHoursVar = newAntecedentLayerTaskHoursVar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorCalcPackage.LAYER_TASK_HOURS__ANTECEDENT_LAYER_TASK_HOURS_VAR, oldAntecedentLayerTaskHoursVar, antecedentLayerTaskHoursVar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUsePropagatorCalcPackage.LAYER_TASK_HOURS__CONCRETE_PARENT:
				if (resolve) return getConcreteParent();
				return basicGetConcreteParent();
			case ToUsePropagatorCalcPackage.LAYER_TASK_HOURS__ANTECEDENT_LAYER_TASK_HOURS_ITEM:
				if (resolve) return getAntecedentLayerTaskHoursItem();
				return basicGetAntecedentLayerTaskHoursItem();
			case ToUsePropagatorCalcPackage.LAYER_TASK_HOURS__ANTECEDENT_LAYER_TASK_HOURS_VAR:
				if (resolve) return getAntecedentLayerTaskHoursVar();
				return basicGetAntecedentLayerTaskHoursVar();
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
			case ToUsePropagatorCalcPackage.LAYER_TASK_HOURS__CONCRETE_PARENT:
				setConcreteParent((ScopeProject)newValue);
				return;
			case ToUsePropagatorCalcPackage.LAYER_TASK_HOURS__ANTECEDENT_LAYER_TASK_HOURS_ITEM:
				setAntecedentLayerTaskHoursItem((LayerTaskHoursItem)newValue);
				return;
			case ToUsePropagatorCalcPackage.LAYER_TASK_HOURS__ANTECEDENT_LAYER_TASK_HOURS_VAR:
				setAntecedentLayerTaskHoursVar((LayerTaskHoursVar)newValue);
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
			case ToUsePropagatorCalcPackage.LAYER_TASK_HOURS__CONCRETE_PARENT:
				setConcreteParent((ScopeProject)null);
				return;
			case ToUsePropagatorCalcPackage.LAYER_TASK_HOURS__ANTECEDENT_LAYER_TASK_HOURS_ITEM:
				setAntecedentLayerTaskHoursItem((LayerTaskHoursItem)null);
				return;
			case ToUsePropagatorCalcPackage.LAYER_TASK_HOURS__ANTECEDENT_LAYER_TASK_HOURS_VAR:
				setAntecedentLayerTaskHoursVar((LayerTaskHoursVar)null);
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
			case ToUsePropagatorCalcPackage.LAYER_TASK_HOURS__CONCRETE_PARENT:
				return concreteParent != null;
			case ToUsePropagatorCalcPackage.LAYER_TASK_HOURS__ANTECEDENT_LAYER_TASK_HOURS_ITEM:
				return antecedentLayerTaskHoursItem != null;
			case ToUsePropagatorCalcPackage.LAYER_TASK_HOURS__ANTECEDENT_LAYER_TASK_HOURS_VAR:
				return antecedentLayerTaskHoursVar != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public PropagatorFunction doGetParent() {
		return this.getConcreteParent();
	}

	@Override
	public void doCollectExplicitAntecedents(EList<PropagatorFunction> antecedents) {
		antecedents.add(this.getAntecedentLayerTaskHoursItem());
		antecedents.add(this.getAntecedentLayerTaskHoursVar());
	}
	
} //LayerTaskHoursImpl
