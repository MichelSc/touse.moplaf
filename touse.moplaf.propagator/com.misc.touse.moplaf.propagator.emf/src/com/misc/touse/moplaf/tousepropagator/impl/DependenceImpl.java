/**
 */
package com.misc.touse.moplaf.tousepropagator.impl;

import com.misc.common.moplaf.propagator.Util;
import com.misc.touse.moplaf.tousepropagator.Dependence;
import com.misc.touse.moplaf.tousepropagator.Project;
import com.misc.touse.moplaf.tousepropagator.Task;
import com.misc.touse.moplaf.tousepropagator.ToUsePropagatorPackage;
import com.misc.touse.moplaf.tousepropagator.calc.PropagatorCalcDependenceDispose;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator.impl.DependenceImpl#getTaskBefore <em>Task Before</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator.impl.DependenceImpl#getTaskAfter <em>Task After</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator.impl.DependenceImpl#getHours <em>Hours</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator.impl.DependenceImpl#getProject <em>Project</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator.impl.DependenceImpl#getNotes <em>Notes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependenceImpl extends MinimalEObjectImpl.Container implements Dependence {
	/**
	 * The cached value of the '{@link #getTaskBefore() <em>Task Before</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskBefore()
	 * @generated
	 * @ordered
	 */
	protected Task taskBefore;

	/**
	 * The cached value of the '{@link #getTaskAfter() <em>Task After</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskAfter()
	 * @generated
	 * @ordered
	 */
	protected Task taskAfter;

	/**
	 * The default value of the '{@link #getHours() <em>Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHours()
	 * @generated
	 * @ordered
	 */
	protected static final float HOURS_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getHours() <em>Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHours()
	 * @generated
	 * @ordered
	 */
	protected float hours = HOURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected String notes = NOTES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUsePropagatorPackage.Literals.DEPENDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getTaskBefore() {
		if (taskBefore != null && taskBefore.eIsProxy()) {
			InternalEObject oldTaskBefore = (InternalEObject)taskBefore;
			taskBefore = (Task)eResolveProxy(oldTaskBefore);
			if (taskBefore != oldTaskBefore) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToUsePropagatorPackage.DEPENDENCE__TASK_BEFORE, oldTaskBefore, taskBefore));
			}
		}
		return taskBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetTaskBefore() {
		return taskBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaskBefore(Task newTaskBefore, NotificationChain msgs) {
		Task oldTaskBefore = taskBefore;
		taskBefore = newTaskBefore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.DEPENDENCE__TASK_BEFORE, oldTaskBefore, newTaskBefore);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskBefore(Task newTaskBefore) {
		if (newTaskBefore != taskBefore) {
			NotificationChain msgs = null;
			if (taskBefore != null)
				msgs = ((InternalEObject)taskBefore).eInverseRemove(this, ToUsePropagatorPackage.TASK__DEPENDENCES_AFTER, Task.class, msgs);
			if (newTaskBefore != null)
				msgs = ((InternalEObject)newTaskBefore).eInverseAdd(this, ToUsePropagatorPackage.TASK__DEPENDENCES_AFTER, Task.class, msgs);
			msgs = basicSetTaskBefore(newTaskBefore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.DEPENDENCE__TASK_BEFORE, newTaskBefore, newTaskBefore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getTaskAfter() {
		if (taskAfter != null && taskAfter.eIsProxy()) {
			InternalEObject oldTaskAfter = (InternalEObject)taskAfter;
			taskAfter = (Task)eResolveProxy(oldTaskAfter);
			if (taskAfter != oldTaskAfter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToUsePropagatorPackage.DEPENDENCE__TASK_AFTER, oldTaskAfter, taskAfter));
			}
		}
		return taskAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetTaskAfter() {
		return taskAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaskAfter(Task newTaskAfter, NotificationChain msgs) {
		Task oldTaskAfter = taskAfter;
		taskAfter = newTaskAfter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.DEPENDENCE__TASK_AFTER, oldTaskAfter, newTaskAfter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskAfter(Task newTaskAfter) {
		if (newTaskAfter != taskAfter) {
			NotificationChain msgs = null;
			if (taskAfter != null)
				msgs = ((InternalEObject)taskAfter).eInverseRemove(this, ToUsePropagatorPackage.TASK__DEPENDENCES_BEFORE, Task.class, msgs);
			if (newTaskAfter != null)
				msgs = ((InternalEObject)newTaskAfter).eInverseAdd(this, ToUsePropagatorPackage.TASK__DEPENDENCES_BEFORE, Task.class, msgs);
			msgs = basicSetTaskAfter(newTaskAfter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.DEPENDENCE__TASK_AFTER, newTaskAfter, newTaskAfter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHours() {
		return hours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHours(float newHours) {
		float oldHours = hours;
		hours = newHours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.DEPENDENCE__HOURS, oldHours, hours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getProject() {
		if (eContainerFeatureID() != ToUsePropagatorPackage.DEPENDENCE__PROJECT) return null;
		return (Project)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProject(Project newProject, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProject, ToUsePropagatorPackage.DEPENDENCE__PROJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(Project newProject) {
		if (newProject != eInternalContainer() || (eContainerFeatureID() != ToUsePropagatorPackage.DEPENDENCE__PROJECT && newProject != null)) {
			if (EcoreUtil.isAncestor(this, newProject))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProject != null)
				msgs = ((InternalEObject)newProject).eInverseAdd(this, ToUsePropagatorPackage.PROJECT__DEPENDENCES, Project.class, msgs);
			msgs = basicSetProject(newProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.DEPENDENCE__PROJECT, newProject, newProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(String newNotes) {
		String oldNotes = notes;
		notes = newNotes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.DEPENDENCE__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void dispose() {
		CommonPlugin.INSTANCE.log("Dependence.dispose");
		this.setTaskAfter(null);
		this.setTaskBefore(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addPropagatorFunctionAdapter() {
		Util.adapt(this, PropagatorCalcDependenceDispose.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToUsePropagatorPackage.DEPENDENCE__TASK_BEFORE:
				if (taskBefore != null)
					msgs = ((InternalEObject)taskBefore).eInverseRemove(this, ToUsePropagatorPackage.TASK__DEPENDENCES_AFTER, Task.class, msgs);
				return basicSetTaskBefore((Task)otherEnd, msgs);
			case ToUsePropagatorPackage.DEPENDENCE__TASK_AFTER:
				if (taskAfter != null)
					msgs = ((InternalEObject)taskAfter).eInverseRemove(this, ToUsePropagatorPackage.TASK__DEPENDENCES_BEFORE, Task.class, msgs);
				return basicSetTaskAfter((Task)otherEnd, msgs);
			case ToUsePropagatorPackage.DEPENDENCE__PROJECT:
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
			case ToUsePropagatorPackage.DEPENDENCE__TASK_BEFORE:
				return basicSetTaskBefore(null, msgs);
			case ToUsePropagatorPackage.DEPENDENCE__TASK_AFTER:
				return basicSetTaskAfter(null, msgs);
			case ToUsePropagatorPackage.DEPENDENCE__PROJECT:
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
			case ToUsePropagatorPackage.DEPENDENCE__PROJECT:
				return eInternalContainer().eInverseRemove(this, ToUsePropagatorPackage.PROJECT__DEPENDENCES, Project.class, msgs);
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
			case ToUsePropagatorPackage.DEPENDENCE__TASK_BEFORE:
				if (resolve) return getTaskBefore();
				return basicGetTaskBefore();
			case ToUsePropagatorPackage.DEPENDENCE__TASK_AFTER:
				if (resolve) return getTaskAfter();
				return basicGetTaskAfter();
			case ToUsePropagatorPackage.DEPENDENCE__HOURS:
				return getHours();
			case ToUsePropagatorPackage.DEPENDENCE__PROJECT:
				return getProject();
			case ToUsePropagatorPackage.DEPENDENCE__NOTES:
				return getNotes();
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
			case ToUsePropagatorPackage.DEPENDENCE__TASK_BEFORE:
				setTaskBefore((Task)newValue);
				return;
			case ToUsePropagatorPackage.DEPENDENCE__TASK_AFTER:
				setTaskAfter((Task)newValue);
				return;
			case ToUsePropagatorPackage.DEPENDENCE__HOURS:
				setHours((Float)newValue);
				return;
			case ToUsePropagatorPackage.DEPENDENCE__PROJECT:
				setProject((Project)newValue);
				return;
			case ToUsePropagatorPackage.DEPENDENCE__NOTES:
				setNotes((String)newValue);
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
			case ToUsePropagatorPackage.DEPENDENCE__TASK_BEFORE:
				setTaskBefore((Task)null);
				return;
			case ToUsePropagatorPackage.DEPENDENCE__TASK_AFTER:
				setTaskAfter((Task)null);
				return;
			case ToUsePropagatorPackage.DEPENDENCE__HOURS:
				setHours(HOURS_EDEFAULT);
				return;
			case ToUsePropagatorPackage.DEPENDENCE__PROJECT:
				setProject((Project)null);
				return;
			case ToUsePropagatorPackage.DEPENDENCE__NOTES:
				setNotes(NOTES_EDEFAULT);
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
			case ToUsePropagatorPackage.DEPENDENCE__TASK_BEFORE:
				return taskBefore != null;
			case ToUsePropagatorPackage.DEPENDENCE__TASK_AFTER:
				return taskAfter != null;
			case ToUsePropagatorPackage.DEPENDENCE__HOURS:
				return hours != HOURS_EDEFAULT;
			case ToUsePropagatorPackage.DEPENDENCE__PROJECT:
				return getProject() != null;
			case ToUsePropagatorPackage.DEPENDENCE__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ToUsePropagatorPackage.DEPENDENCE___DISPOSE:
				dispose();
				return null;
			case ToUsePropagatorPackage.DEPENDENCE___ADD_PROPAGATOR_FUNCTION_ADAPTER:
				addPropagatorFunctionAdapter();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Hours: ");
		result.append(hours);
		result.append(", Notes: ");
		result.append(notes);
		result.append(')');
		return result.toString();
	}

} //DependenceImpl
