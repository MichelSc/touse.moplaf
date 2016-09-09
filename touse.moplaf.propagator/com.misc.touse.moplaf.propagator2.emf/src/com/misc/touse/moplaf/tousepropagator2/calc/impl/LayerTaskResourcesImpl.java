/**
 */
package com.misc.touse.moplaf.tousepropagator2.calc.impl;

import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.touse.moplaf.tousepropagator2.Project;
import com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage;
import com.misc.touse.moplaf.tousepropagator2.calc.CalcPackage;
import com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskResources;
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
 * An implementation of the model object '<em><b>Layer Task Resources</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.calc.impl.LayerTaskResourcesImpl#getProject <em>Project</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.calc.impl.LayerTaskResourcesImpl#getAntecedentLayerTaskTimes <em>Antecedent Layer Task Times</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.calc.impl.LayerTaskResourcesImpl#getConcreteParent <em>Concrete Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LayerTaskResourcesImpl extends ToUsePropagatorFunctionImpl implements LayerTaskResources {
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
		return CalcPackage.Literals.LAYER_TASK_RESOURCES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getProject() {
		if (eContainerFeatureID() != CalcPackage.LAYER_TASK_RESOURCES__PROJECT) return null;
		return (Project)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProject(Project newProject, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProject, CalcPackage.LAYER_TASK_RESOURCES__PROJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(Project newProject) {
		if (newProject != eInternalContainer() || (eContainerFeatureID() != CalcPackage.LAYER_TASK_RESOURCES__PROJECT && newProject != null)) {
			if (EcoreUtil.isAncestor(this, newProject))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProject != null)
				msgs = ((InternalEObject)newProject).eInverseAdd(this, ToUsePropagatorPackage.PROJECT__LAYER_TASK_RESOURCES, Project.class, msgs);
			msgs = basicSetProject(newProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalcPackage.LAYER_TASK_RESOURCES__PROJECT, newProject, newProject));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CalcPackage.LAYER_TASK_RESOURCES__ANTECEDENT_LAYER_TASK_TIMES, oldAntecedentLayerTaskTimes, antecedentLayerTaskTimes));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CalcPackage.LAYER_TASK_RESOURCES__ANTECEDENT_LAYER_TASK_TIMES, oldAntecedentLayerTaskTimes, antecedentLayerTaskTimes));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CalcPackage.LAYER_TASK_RESOURCES__CONCRETE_PARENT, oldConcreteParent, concreteParent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CalcPackage.LAYER_TASK_RESOURCES__CONCRETE_PARENT, oldConcreteParent, concreteParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CalcPackage.LAYER_TASK_RESOURCES__PROJECT:
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
			case CalcPackage.LAYER_TASK_RESOURCES__PROJECT:
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
			case CalcPackage.LAYER_TASK_RESOURCES__PROJECT:
				return eInternalContainer().eInverseRemove(this, ToUsePropagatorPackage.PROJECT__LAYER_TASK_RESOURCES, Project.class, msgs);
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
			case CalcPackage.LAYER_TASK_RESOURCES__PROJECT:
				return getProject();
			case CalcPackage.LAYER_TASK_RESOURCES__ANTECEDENT_LAYER_TASK_TIMES:
				if (resolve) return getAntecedentLayerTaskTimes();
				return basicGetAntecedentLayerTaskTimes();
			case CalcPackage.LAYER_TASK_RESOURCES__CONCRETE_PARENT:
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
			case CalcPackage.LAYER_TASK_RESOURCES__PROJECT:
				setProject((Project)newValue);
				return;
			case CalcPackage.LAYER_TASK_RESOURCES__ANTECEDENT_LAYER_TASK_TIMES:
				setAntecedentLayerTaskTimes((LayerTaskTimes)newValue);
				return;
			case CalcPackage.LAYER_TASK_RESOURCES__CONCRETE_PARENT:
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
			case CalcPackage.LAYER_TASK_RESOURCES__PROJECT:
				setProject((Project)null);
				return;
			case CalcPackage.LAYER_TASK_RESOURCES__ANTECEDENT_LAYER_TASK_TIMES:
				setAntecedentLayerTaskTimes((LayerTaskTimes)null);
				return;
			case CalcPackage.LAYER_TASK_RESOURCES__CONCRETE_PARENT:
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
			case CalcPackage.LAYER_TASK_RESOURCES__PROJECT:
				return getProject() != null;
			case CalcPackage.LAYER_TASK_RESOURCES__ANTECEDENT_LAYER_TASK_TIMES:
				return antecedentLayerTaskTimes != null;
			case CalcPackage.LAYER_TASK_RESOURCES__CONCRETE_PARENT:
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
