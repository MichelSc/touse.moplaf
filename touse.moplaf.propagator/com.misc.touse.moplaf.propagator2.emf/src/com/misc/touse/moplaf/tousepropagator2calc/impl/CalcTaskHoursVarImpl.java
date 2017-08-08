/**
 */
package com.misc.touse.moplaf.tousepropagator2calc.impl;

import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.propagator2.util.Bindings;
import com.misc.touse.moplaf.tousepropagator2.Project;
import com.misc.touse.moplaf.tousepropagator2.Task;
import com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage;
import com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorFunctionTaskImpl;
import com.misc.touse.moplaf.tousepropagator2calc.CalcTaskHoursVar;
import com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHoursVar;
import com.misc.touse.moplaf.tousepropagator2calc.ToUsePropagatorCalcPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Hours Var</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2calc.impl.CalcTaskHoursVarImpl#getConcreteParent <em>Concrete Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalcTaskHoursVarImpl extends ToUsePropagatorFunctionTaskImpl implements CalcTaskHoursVar {
	/**
	 * The cached value of the '{@link #getConcreteParent() <em>Concrete Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteParent()
	 * @generated
	 * @ordered
	 */
	protected LayerTaskHoursVar concreteParent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcTaskHoursVarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUsePropagatorCalcPackage.Literals.CALC_TASK_HOURS_VAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerTaskHoursVar getConcreteParent() {
		if (concreteParent != null && concreteParent.eIsProxy()) {
			InternalEObject oldConcreteParent = (InternalEObject)concreteParent;
			concreteParent = (LayerTaskHoursVar)eResolveProxy(oldConcreteParent);
			if (concreteParent != oldConcreteParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToUsePropagatorCalcPackage.CALC_TASK_HOURS_VAR__CONCRETE_PARENT, oldConcreteParent, concreteParent));
			}
		}
		return concreteParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerTaskHoursVar basicGetConcreteParent() {
		return concreteParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcreteParent(LayerTaskHoursVar newConcreteParent) {
		LayerTaskHoursVar oldConcreteParent = concreteParent;
		concreteParent = newConcreteParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorCalcPackage.CALC_TASK_HOURS_VAR__CONCRETE_PARENT, oldConcreteParent, concreteParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUsePropagatorCalcPackage.CALC_TASK_HOURS_VAR__CONCRETE_PARENT:
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
			case ToUsePropagatorCalcPackage.CALC_TASK_HOURS_VAR__CONCRETE_PARENT:
				setConcreteParent((LayerTaskHoursVar)newValue);
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
			case ToUsePropagatorCalcPackage.CALC_TASK_HOURS_VAR__CONCRETE_PARENT:
				setConcreteParent((LayerTaskHoursVar)null);
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
			case ToUsePropagatorCalcPackage.CALC_TASK_HOURS_VAR__CONCRETE_PARENT:
				return concreteParent != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public void init() {
		super.init();
		Task task = this.getTask();
		Project project = task.getProject();
		this.setConcreteParent(project.getPropagatorFunction(LayerTaskHoursVar.class));
	}

	@Override
	public PropagatorFunction doGetParent() {
		return this.getConcreteParent();
	}

	private static Bindings projectBindings = Bindings.constructBindings()
			.addInboundBinding(ToUsePropagatorPackage.Literals.PROJECT__NOF_RES);

	protected static Bindings taskHoursVarBindings = Bindings.constructBindings()
			.addInboundBinding(ToUsePropagatorPackage.Literals.TASK__PROJECT, projectBindings)
			.addInboundBinding(ToUsePropagatorPackage.Literals.TASK__HOURS_VAR_PER_RES)
			.addOutboundBinding(ToUsePropagatorPackage.Literals.TASK__HOURS_VAR);

	@Override
	public Bindings doGetBindings() {
		return taskHoursVarBindings;
	}


	@Override
	public void doRefresh() {
		this.getTask().refreshHoursVar();

	}
} //CalcTaskHoursVarImpl
