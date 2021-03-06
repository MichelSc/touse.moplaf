/**
 */
package com.misc.touse.moplaf.tousepropagator2calc.impl;


import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.propagator2.util.Bindings;
import com.misc.touse.moplaf.tousepropagator2.Project;
import com.misc.touse.moplaf.tousepropagator2.Task;
import com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage;
import com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorFunctionTaskImpl;
import com.misc.touse.moplaf.tousepropagator2calc.CalcTaskStart;
import com.misc.touse.moplaf.tousepropagator2calc.LayerTaskTimes;

import com.misc.touse.moplaf.tousepropagator2calc.ToUsePropagatorCalcPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Start</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2calc.impl.CalcTaskStartImpl#getConcreteParent <em>Concrete Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalcTaskStartImpl extends ToUsePropagatorFunctionTaskImpl implements CalcTaskStart {
	/**
	 * The cached value of the '{@link #getConcreteParent() <em>Concrete Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteParent()
	 * @generated
	 * @ordered
	 */
	protected LayerTaskTimes concreteParent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcTaskStartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUsePropagatorCalcPackage.Literals.CALC_TASK_START;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerTaskTimes getConcreteParent() {
		if (concreteParent != null && concreteParent.eIsProxy()) {
			InternalEObject oldConcreteParent = (InternalEObject)concreteParent;
			concreteParent = (LayerTaskTimes)eResolveProxy(oldConcreteParent);
			if (concreteParent != oldConcreteParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToUsePropagatorCalcPackage.CALC_TASK_START__CONCRETE_PARENT, oldConcreteParent, concreteParent));
			}
		}
		return concreteParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerTaskTimes basicGetConcreteParent() {
		return concreteParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcreteParent(LayerTaskTimes newConcreteParent) {
		LayerTaskTimes oldConcreteParent = concreteParent;
		concreteParent = newConcreteParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorCalcPackage.CALC_TASK_START__CONCRETE_PARENT, oldConcreteParent, concreteParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUsePropagatorCalcPackage.CALC_TASK_START__CONCRETE_PARENT:
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
			case ToUsePropagatorCalcPackage.CALC_TASK_START__CONCRETE_PARENT:
				setConcreteParent((LayerTaskTimes)newValue);
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
			case ToUsePropagatorCalcPackage.CALC_TASK_START__CONCRETE_PARENT:
				setConcreteParent((LayerTaskTimes)null);
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
			case ToUsePropagatorCalcPackage.CALC_TASK_START__CONCRETE_PARENT:
				return concreteParent != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public void init() {
		super.init();
		Task task = this.getTask();
		Project project = task.getProject();
		this.setConcreteParent(project.getPropagatorFunction(LayerTaskTimes.class));
	}


	@Override
	public PropagatorFunction doGetParent() {
		return this.getConcreteParent();
	}
	
	private static Bindings projectBindings = Bindings.constructBindings()
			.addInboundBinding(ToUsePropagatorPackage.Literals.PROJECT__START);
		
	private static Bindings taskBeforeBindings = Bindings.constructBindings()
			.addInboundBinding(ToUsePropagatorPackage.Literals.TASK__END);
		
	private static Bindings dependenceBeforeBindings = Bindings.constructBindings()
			.addInboundBinding(ToUsePropagatorPackage.Literals.DEPENDENCE__HOURS)
			.addInboundBinding(ToUsePropagatorPackage.Literals.DEPENDENCE__TASK_BEFORE, taskBeforeBindings);

	private static Bindings thisTaskBindings = Bindings.constructBindings()
			.addInboundBinding(ToUsePropagatorPackage.Literals.TASK__PROJECT, projectBindings)		
			.addInboundBinding(ToUsePropagatorPackage.Literals.TASK__DEPENDENCES_BEFORE, dependenceBeforeBindings)	
			.addOutboundBinding(ToUsePropagatorPackage.Literals.TASK__START);
		
	@Override
	public Bindings doGetBindings() {
		return thisTaskBindings;
	}

	@Override
	public void doRefresh() {
		this.getTask().refreshStart();
	}

} //CalcTaskStartImpl
