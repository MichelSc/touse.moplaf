/**
 */
package com.misc.touse.moplaf.tousepropagator2calc.impl;

import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.propagator2.util.Bindings;
import com.misc.touse.moplaf.tousepropagator2.Project;
import com.misc.touse.moplaf.tousepropagator2.Task;
import com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage;
import com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorFunctionTaskImpl;
import com.misc.touse.moplaf.tousepropagator2calc.CalcTaskHoursItem;
import com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHoursItem;
import com.misc.touse.moplaf.tousepropagator2calc.ToUsePropagatorCalcPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Hours Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2calc.impl.CalcTaskHoursItemImpl#getConcreteParent <em>Concrete Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalcTaskHoursItemImpl extends ToUsePropagatorFunctionTaskImpl implements CalcTaskHoursItem {
	/**
	 * The cached value of the '{@link #getConcreteParent() <em>Concrete Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteParent()
	 * @generated
	 * @ordered
	 */
	protected LayerTaskHoursItem concreteParent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcTaskHoursItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUsePropagatorCalcPackage.Literals.CALC_TASK_HOURS_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerTaskHoursItem getConcreteParent() {
		if (concreteParent != null && concreteParent.eIsProxy()) {
			InternalEObject oldConcreteParent = (InternalEObject)concreteParent;
			concreteParent = (LayerTaskHoursItem)eResolveProxy(oldConcreteParent);
			if (concreteParent != oldConcreteParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToUsePropagatorCalcPackage.CALC_TASK_HOURS_ITEM__CONCRETE_PARENT, oldConcreteParent, concreteParent));
			}
		}
		return concreteParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerTaskHoursItem basicGetConcreteParent() {
		return concreteParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcreteParent(LayerTaskHoursItem newConcreteParent) {
		LayerTaskHoursItem oldConcreteParent = concreteParent;
		concreteParent = newConcreteParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorCalcPackage.CALC_TASK_HOURS_ITEM__CONCRETE_PARENT, oldConcreteParent, concreteParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUsePropagatorCalcPackage.CALC_TASK_HOURS_ITEM__CONCRETE_PARENT:
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
			case ToUsePropagatorCalcPackage.CALC_TASK_HOURS_ITEM__CONCRETE_PARENT:
				setConcreteParent((LayerTaskHoursItem)newValue);
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
			case ToUsePropagatorCalcPackage.CALC_TASK_HOURS_ITEM__CONCRETE_PARENT:
				setConcreteParent((LayerTaskHoursItem)null);
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
			case ToUsePropagatorCalcPackage.CALC_TASK_HOURS_ITEM__CONCRETE_PARENT:
				return concreteParent != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public void init() {
		super.init();
		Task task = this.getTask();
		Project project = task.getProject();
		this.setConcreteParent(project.getPropagatorFunction(LayerTaskHoursItem.class));
	}


	@Override
	public PropagatorFunction doGetParent() {
		return this.getConcreteParent();
	}

	private static Bindings taskItemBindings = Bindings.constructBindings()
			.addInboundBinding(ToUsePropagatorPackage.Literals.TASK_ITEM__HOURS);

	private static Bindings taskHoursItemBindings = Bindings.constructBindings()
			.addInboundBinding(ToUsePropagatorPackage.Literals.TASK__ITEMS, taskItemBindings)
			.addOutboundBinding(ToUsePropagatorPackage.Literals.TASK__HOURS_ITEMS);

	@Override
	public Bindings doGetBindings() {
		return taskHoursItemBindings;
	}


	@Override
	public void doRefresh() {
		this.getTask().refreshHoursItem();

	}
} //CalcTaskHoursItemImpl
