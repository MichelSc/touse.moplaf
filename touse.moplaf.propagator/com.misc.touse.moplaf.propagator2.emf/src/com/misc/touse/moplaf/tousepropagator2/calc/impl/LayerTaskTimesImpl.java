/**
 */
package com.misc.touse.moplaf.tousepropagator2.calc.impl;

import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.touse.moplaf.tousepropagator2.Project;
import com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage;
import com.misc.touse.moplaf.tousepropagator2.calc.CalcPackage;
import com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskHours;
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
 * An implementation of the model object '<em><b>Layer Task Times</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.calc.impl.LayerTaskTimesImpl#getProject <em>Project</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.calc.impl.LayerTaskTimesImpl#getConcreteParent <em>Concrete Parent</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.calc.impl.LayerTaskTimesImpl#getAntecedentLayerTaskHours <em>Antecedent Layer Task Hours</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LayerTaskTimesImpl extends ToUsePropagatorFunctionImpl implements LayerTaskTimes {
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
		return CalcPackage.Literals.LAYER_TASK_TIMES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getProject() {
		if (eContainerFeatureID() != CalcPackage.LAYER_TASK_TIMES__PROJECT) return null;
		return (Project)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProject(Project newProject, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProject, CalcPackage.LAYER_TASK_TIMES__PROJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(Project newProject) {
		if (newProject != eInternalContainer() || (eContainerFeatureID() != CalcPackage.LAYER_TASK_TIMES__PROJECT && newProject != null)) {
			if (EcoreUtil.isAncestor(this, newProject))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProject != null)
				msgs = ((InternalEObject)newProject).eInverseAdd(this, ToUsePropagatorPackage.PROJECT__LAYER_TASK_TIMES, Project.class, msgs);
			msgs = basicSetProject(newProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalcPackage.LAYER_TASK_TIMES__PROJECT, newProject, newProject));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CalcPackage.LAYER_TASK_TIMES__CONCRETE_PARENT, oldConcreteParent, concreteParent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CalcPackage.LAYER_TASK_TIMES__CONCRETE_PARENT, oldConcreteParent, concreteParent));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CalcPackage.LAYER_TASK_TIMES__ANTECEDENT_LAYER_TASK_HOURS, oldAntecedentLayerTaskHours, antecedentLayerTaskHours));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CalcPackage.LAYER_TASK_TIMES__ANTECEDENT_LAYER_TASK_HOURS, oldAntecedentLayerTaskHours, antecedentLayerTaskHours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CalcPackage.LAYER_TASK_TIMES__PROJECT:
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
			case CalcPackage.LAYER_TASK_TIMES__PROJECT:
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
			case CalcPackage.LAYER_TASK_TIMES__PROJECT:
				return eInternalContainer().eInverseRemove(this, ToUsePropagatorPackage.PROJECT__LAYER_TASK_TIMES, Project.class, msgs);
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
			case CalcPackage.LAYER_TASK_TIMES__PROJECT:
				return getProject();
			case CalcPackage.LAYER_TASK_TIMES__CONCRETE_PARENT:
				if (resolve) return getConcreteParent();
				return basicGetConcreteParent();
			case CalcPackage.LAYER_TASK_TIMES__ANTECEDENT_LAYER_TASK_HOURS:
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
			case CalcPackage.LAYER_TASK_TIMES__PROJECT:
				setProject((Project)newValue);
				return;
			case CalcPackage.LAYER_TASK_TIMES__CONCRETE_PARENT:
				setConcreteParent((ScopeProject)newValue);
				return;
			case CalcPackage.LAYER_TASK_TIMES__ANTECEDENT_LAYER_TASK_HOURS:
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
			case CalcPackage.LAYER_TASK_TIMES__PROJECT:
				setProject((Project)null);
				return;
			case CalcPackage.LAYER_TASK_TIMES__CONCRETE_PARENT:
				setConcreteParent((ScopeProject)null);
				return;
			case CalcPackage.LAYER_TASK_TIMES__ANTECEDENT_LAYER_TASK_HOURS:
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
			case CalcPackage.LAYER_TASK_TIMES__PROJECT:
				return getProject() != null;
			case CalcPackage.LAYER_TASK_TIMES__CONCRETE_PARENT:
				return concreteParent != null;
			case CalcPackage.LAYER_TASK_TIMES__ANTECEDENT_LAYER_TASK_HOURS:
				return antecedentLayerTaskHours != null;
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
		list.add(this.getAntecedentLayerTaskHours());
		return list;
	}

} //LayerTaskTimesImpl