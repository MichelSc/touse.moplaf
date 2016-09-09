/**
 */
package com.misc.touse.moplaf.tousepropagator2.calc.impl;

import com.misc.common.moplaf.propagator2.Bindings;
import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.touse.moplaf.tousepropagator2.Project;
import com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage;
import com.misc.touse.moplaf.tousepropagator2.calc.CalcPackage;
import com.misc.touse.moplaf.tousepropagator2.calc.CalcProjectEnd;
import com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskTimes;
import com.misc.touse.moplaf.tousepropagator2.calc.ScopeProject;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcProjectEndImpl#getConcreteParent <em>Concrete Parent</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcProjectEndImpl#getProject <em>Project</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.calc.impl.CalcProjectEndImpl#getAntecedentLayerTaskTimes <em>Antecedent Layer Task Times</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalcProjectEndImpl extends ToUsePropagatorFunctionImpl implements CalcProjectEnd {
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
		return CalcPackage.Literals.CALC_PROJECT_END;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CalcPackage.CALC_PROJECT_END__CONCRETE_PARENT, oldConcreteParent, concreteParent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CalcPackage.CALC_PROJECT_END__CONCRETE_PARENT, oldConcreteParent, concreteParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getProject() {
		if (eContainerFeatureID() != CalcPackage.CALC_PROJECT_END__PROJECT) return null;
		return (Project)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProject(Project newProject, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProject, CalcPackage.CALC_PROJECT_END__PROJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(Project newProject) {
		if (newProject != eInternalContainer() || (eContainerFeatureID() != CalcPackage.CALC_PROJECT_END__PROJECT && newProject != null)) {
			if (EcoreUtil.isAncestor(this, newProject))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProject != null)
				msgs = ((InternalEObject)newProject).eInverseAdd(this, ToUsePropagatorPackage.PROJECT__CALC_PROJECT_END, Project.class, msgs);
			msgs = basicSetProject(newProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalcPackage.CALC_PROJECT_END__PROJECT, newProject, newProject));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CalcPackage.CALC_PROJECT_END__ANTECEDENT_LAYER_TASK_TIMES, oldAntecedentLayerTaskTimes, antecedentLayerTaskTimes));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CalcPackage.CALC_PROJECT_END__ANTECEDENT_LAYER_TASK_TIMES, oldAntecedentLayerTaskTimes, antecedentLayerTaskTimes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CalcPackage.CALC_PROJECT_END__PROJECT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProject((Project)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CalcPackage.CALC_PROJECT_END__PROJECT:
				return basicSetProject(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CalcPackage.CALC_PROJECT_END__PROJECT:
				return eInternalContainer().eInverseRemove(this, ToUsePropagatorPackage.PROJECT__CALC_PROJECT_END, Project.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CalcPackage.CALC_PROJECT_END__CONCRETE_PARENT:
				if (resolve) return getConcreteParent();
				return basicGetConcreteParent();
			case CalcPackage.CALC_PROJECT_END__PROJECT:
				return getProject();
			case CalcPackage.CALC_PROJECT_END__ANTECEDENT_LAYER_TASK_TIMES:
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
			case CalcPackage.CALC_PROJECT_END__CONCRETE_PARENT:
				setConcreteParent((ScopeProject)newValue);
				return;
			case CalcPackage.CALC_PROJECT_END__PROJECT:
				setProject((Project)newValue);
				return;
			case CalcPackage.CALC_PROJECT_END__ANTECEDENT_LAYER_TASK_TIMES:
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
			case CalcPackage.CALC_PROJECT_END__CONCRETE_PARENT:
				setConcreteParent((ScopeProject)null);
				return;
			case CalcPackage.CALC_PROJECT_END__PROJECT:
				setProject((Project)null);
				return;
			case CalcPackage.CALC_PROJECT_END__ANTECEDENT_LAYER_TASK_TIMES:
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
			case CalcPackage.CALC_PROJECT_END__CONCRETE_PARENT:
				return concreteParent != null;
			case CalcPackage.CALC_PROJECT_END__PROJECT:
				return getProject() != null;
			case CalcPackage.CALC_PROJECT_END__ANTECEDENT_LAYER_TASK_TIMES:
				return antecedentLayerTaskTimes != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public PropagatorFunction doGetParent() {
		return this.getConcreteParent();
	}

	private static Bindings thisClassBindings = doCreateBindings();
	
	private static Bindings doCreateBindings(){
		Bindings taskBeforeBindings = Bindings.constructEClassBindings(ToUsePropagatorPackage.Literals.TASK);
		taskBeforeBindings.addInboundBinding(ToUsePropagatorPackage.Literals.TASK__END);

		Bindings projectEndBindings = Bindings.constructEClassBindings(ToUsePropagatorPackage.Literals.PROJECT);
		projectEndBindings.addInboundBinding(ToUsePropagatorPackage.Literals.PROJECT__START);
		projectEndBindings.addInboundBinding(ToUsePropagatorPackage.Literals.PROJECT__TASKS, taskBeforeBindings);
		
		projectEndBindings.addOutboundBinding(ToUsePropagatorPackage.Literals.PROJECT__END);
		
		return projectEndBindings;
	}

	@Override
	public Bindings doGetBindings() {
		return thisClassBindings;
	}


	@Override
	public void doRefresh() {
		this.getProject().refreshEnd();

	}

	@Override
	public EList<PropagatorFunction> doGetExplicitAntecedents() {
		EList<PropagatorFunction> list = super.doGetExplicitAntecedents();
		list.add(this.getAntecedentLayerTaskTimes());
		return list;
	}
	
} //CalcProjectEndImpl
