/**
 */
package com.misc.touse.moplaf.tousepropagator2calc.impl;

import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.propagator2.util.Bindings;
import com.misc.touse.moplaf.tousepropagator2.Project;
import com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage;
import com.misc.touse.moplaf.tousepropagator2.impl.ToUsePropagatorFunctionProjectImpl;
import com.misc.touse.moplaf.tousepropagator2calc.CalcProjectEnd;
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
 * An implementation of the model object '<em><b>Project End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2calc.impl.CalcProjectEndImpl#getConcreteParent <em>Concrete Parent</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2calc.impl.CalcProjectEndImpl#getAntecedentLayerTaskTimes <em>Antecedent Layer Task Times</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalcProjectEndImpl extends ToUsePropagatorFunctionProjectImpl implements CalcProjectEnd {
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
	 * The cached value of the '{@link #getAntecedentLayerTaskTimes() <em>Antecedent Layer Task Times</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntecedentLayerTaskTimes()
	 * @generated
	 * @ordered
	 */
	protected LayerTaskTimes antecedentLayerTaskTimes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcProjectEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUsePropagatorCalcPackage.Literals.CALC_PROJECT_END;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToUsePropagatorCalcPackage.CALC_PROJECT_END__CONCRETE_PARENT, oldConcreteParent, concreteParent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorCalcPackage.CALC_PROJECT_END__CONCRETE_PARENT, oldConcreteParent, concreteParent));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToUsePropagatorCalcPackage.CALC_PROJECT_END__ANTECEDENT_LAYER_TASK_TIMES, oldAntecedentLayerTaskTimes, antecedentLayerTaskTimes));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorCalcPackage.CALC_PROJECT_END__ANTECEDENT_LAYER_TASK_TIMES, oldAntecedentLayerTaskTimes, antecedentLayerTaskTimes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUsePropagatorCalcPackage.CALC_PROJECT_END__CONCRETE_PARENT:
				if (resolve) return getConcreteParent();
				return basicGetConcreteParent();
			case ToUsePropagatorCalcPackage.CALC_PROJECT_END__ANTECEDENT_LAYER_TASK_TIMES:
				if (resolve) return getAntecedentLayerTaskTimes();
				return basicGetAntecedentLayerTaskTimes();
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
			case ToUsePropagatorCalcPackage.CALC_PROJECT_END__CONCRETE_PARENT:
				setConcreteParent((ScopeProject)newValue);
				return;
			case ToUsePropagatorCalcPackage.CALC_PROJECT_END__ANTECEDENT_LAYER_TASK_TIMES:
				setAntecedentLayerTaskTimes((LayerTaskTimes)newValue);
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
			case ToUsePropagatorCalcPackage.CALC_PROJECT_END__CONCRETE_PARENT:
				setConcreteParent((ScopeProject)null);
				return;
			case ToUsePropagatorCalcPackage.CALC_PROJECT_END__ANTECEDENT_LAYER_TASK_TIMES:
				setAntecedentLayerTaskTimes((LayerTaskTimes)null);
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
			case ToUsePropagatorCalcPackage.CALC_PROJECT_END__CONCRETE_PARENT:
				return concreteParent != null;
			case ToUsePropagatorCalcPackage.CALC_PROJECT_END__ANTECEDENT_LAYER_TASK_TIMES:
				return antecedentLayerTaskTimes != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public void init() {
		super.init();
		Project project = this.getProject();
		this.setConcreteParent(project.getPropagatorFunction(ScopeProject.class));
		this.setAntecedentLayerTaskTimes(project.getPropagatorFunction(LayerTaskTimes.class));
	}

	@Override
	public PropagatorFunction doGetParent() {
		return this.getConcreteParent();
	}

	@Override
	public void doCollectExplicitAntecedents(EList<PropagatorFunction> antecedents) {
		antecedents.add(this.getAntecedentLayerTaskTimes());
	}

	private static Bindings taskBeforeBindings = Bindings.constructBindings()
			.addInboundBinding(ToUsePropagatorPackage.Literals.TASK__END);

	private static Bindings projectEndBindings = Bindings.constructBindings()
			.addInboundBinding(ToUsePropagatorPackage.Literals.PROJECT__START)
			.addInboundBinding(ToUsePropagatorPackage.Literals.PROJECT__TASKS, taskBeforeBindings)
			.addOutboundBinding(ToUsePropagatorPackage.Literals.PROJECT__END);

	@Override
	public Bindings doGetBindings() {
		return projectEndBindings;
	}

	@Override
	public void doRefresh() {
		this.getProject().refreshEnd();

	}
	
} //CalcProjectEndImpl
