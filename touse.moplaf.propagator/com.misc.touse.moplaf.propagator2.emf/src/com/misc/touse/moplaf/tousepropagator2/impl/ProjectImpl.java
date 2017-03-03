/**
 */
package com.misc.touse.moplaf.tousepropagator2.impl;

import com.misc.common.moplaf.common.util.EContainmentListenerAdapter;
import com.misc.common.moplaf.common.util.Util;
import com.misc.common.moplaf.propagator2.impl.ObjectWithPropagatorFunctionsImpl;
import com.misc.touse.moplaf.tousepropagator2.Dependence;
import com.misc.touse.moplaf.tousepropagator2.Project;
import com.misc.touse.moplaf.tousepropagator2.Resource;
import com.misc.touse.moplaf.tousepropagator2.Task;
import com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.impl.ProjectImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.impl.ProjectImpl#getDependences <em>Dependences</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.impl.ProjectImpl#getNofRes <em>Nof Res</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.impl.ProjectImpl#getStart <em>Start</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.impl.ProjectImpl#getEnd <em>End</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.impl.ProjectImpl#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.impl.ProjectImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.impl.ProjectImpl#isAutomaticRefresh <em>Automatic Refresh</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends ObjectWithPropagatorFunctionsImpl implements Project {
	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * The cached value of the '{@link #getDependences() <em>Dependences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependences()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependence> dependences;

	/**
	 * The default value of the '{@link #getNofRes() <em>Nof Res</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNofRes()
	 * @generated
	 * @ordered
	 */
	protected static final int NOF_RES_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getNofRes() <em>Nof Res</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNofRes()
	 * @generated
	 * @ordered
	 */
	protected int nofRes = NOF_RES_EDEFAULT;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2001-01-01");

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Date start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2001-01-01");

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Date end = END_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected String projectName = PROJECT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resources;

	/**
	 * The default value of the '{@link #isAutomaticRefresh() <em>Automatic Refresh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutomaticRefresh()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTOMATIC_REFRESH_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAutomaticRefresh() <em>Automatic Refresh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutomaticRefresh()
	 * @generated
	 * @ordered
	 */
	protected boolean automaticRefresh = AUTOMATIC_REFRESH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected ProjectImpl() {
		super();
		Util.adapt(this,  EContainmentListenerAdapter.class, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUsePropagatorPackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentWithInverseEList<Task>(Task.class, this, ToUsePropagatorPackage.PROJECT__TASKS, ToUsePropagatorPackage.TASK__PROJECT);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependence> getDependences() {
		if (dependences == null) {
			dependences = new EObjectContainmentWithInverseEList<Dependence>(Dependence.class, this, ToUsePropagatorPackage.PROJECT__DEPENDENCES, ToUsePropagatorPackage.DEPENDENCE__PROJECT);
		}
		return dependences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNofRes() {
		return nofRes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNofRes(int newNofRes) {
		int oldNofRes = nofRes;
		nofRes = newNofRes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.PROJECT__NOF_RES, oldNofRes, nofRes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Date newStart) {
		Date oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.PROJECT__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Date newEnd) {
		Date oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.PROJECT__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectName(String newProjectName) {
		String oldProjectName = projectName;
		projectName = newProjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.PROJECT__PROJECT_NAME, oldProjectName, projectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentWithInverseEList<Resource>(Resource.class, this, ToUsePropagatorPackage.PROJECT__RESOURCES, ToUsePropagatorPackage.RESOURCE__PROJECT);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutomaticRefresh() {
		return automaticRefresh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutomaticRefresh(boolean newAutomaticRefresh) {
		boolean oldAutomaticRefresh = automaticRefresh;
		automaticRefresh = newAutomaticRefresh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.PROJECT__AUTOMATIC_REFRESH, oldAutomaticRefresh, automaticRefresh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshEnd() {
		Date end = this.getStart();
		for ( Task task : this.getTasks()){
			Date timebefore = task.getEnd();
			if ( timebefore != null && timebefore.after(end)) {
				end = timebefore;
			}
		}  // traverse the dependences
		this.setEnd(end);
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToUsePropagatorPackage.PROJECT__TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTasks()).basicAdd(otherEnd, msgs);
			case ToUsePropagatorPackage.PROJECT__DEPENDENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDependences()).basicAdd(otherEnd, msgs);
			case ToUsePropagatorPackage.PROJECT__RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResources()).basicAdd(otherEnd, msgs);
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
			case ToUsePropagatorPackage.PROJECT__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
			case ToUsePropagatorPackage.PROJECT__DEPENDENCES:
				return ((InternalEList<?>)getDependences()).basicRemove(otherEnd, msgs);
			case ToUsePropagatorPackage.PROJECT__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUsePropagatorPackage.PROJECT__TASKS:
				return getTasks();
			case ToUsePropagatorPackage.PROJECT__DEPENDENCES:
				return getDependences();
			case ToUsePropagatorPackage.PROJECT__NOF_RES:
				return getNofRes();
			case ToUsePropagatorPackage.PROJECT__START:
				return getStart();
			case ToUsePropagatorPackage.PROJECT__END:
				return getEnd();
			case ToUsePropagatorPackage.PROJECT__PROJECT_NAME:
				return getProjectName();
			case ToUsePropagatorPackage.PROJECT__RESOURCES:
				return getResources();
			case ToUsePropagatorPackage.PROJECT__AUTOMATIC_REFRESH:
				return isAutomaticRefresh();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ToUsePropagatorPackage.PROJECT__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case ToUsePropagatorPackage.PROJECT__DEPENDENCES:
				getDependences().clear();
				getDependences().addAll((Collection<? extends Dependence>)newValue);
				return;
			case ToUsePropagatorPackage.PROJECT__NOF_RES:
				setNofRes((Integer)newValue);
				return;
			case ToUsePropagatorPackage.PROJECT__START:
				setStart((Date)newValue);
				return;
			case ToUsePropagatorPackage.PROJECT__END:
				setEnd((Date)newValue);
				return;
			case ToUsePropagatorPackage.PROJECT__PROJECT_NAME:
				setProjectName((String)newValue);
				return;
			case ToUsePropagatorPackage.PROJECT__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case ToUsePropagatorPackage.PROJECT__AUTOMATIC_REFRESH:
				setAutomaticRefresh((Boolean)newValue);
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
			case ToUsePropagatorPackage.PROJECT__TASKS:
				getTasks().clear();
				return;
			case ToUsePropagatorPackage.PROJECT__DEPENDENCES:
				getDependences().clear();
				return;
			case ToUsePropagatorPackage.PROJECT__NOF_RES:
				setNofRes(NOF_RES_EDEFAULT);
				return;
			case ToUsePropagatorPackage.PROJECT__START:
				setStart(START_EDEFAULT);
				return;
			case ToUsePropagatorPackage.PROJECT__END:
				setEnd(END_EDEFAULT);
				return;
			case ToUsePropagatorPackage.PROJECT__PROJECT_NAME:
				setProjectName(PROJECT_NAME_EDEFAULT);
				return;
			case ToUsePropagatorPackage.PROJECT__RESOURCES:
				getResources().clear();
				return;
			case ToUsePropagatorPackage.PROJECT__AUTOMATIC_REFRESH:
				setAutomaticRefresh(AUTOMATIC_REFRESH_EDEFAULT);
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
			case ToUsePropagatorPackage.PROJECT__TASKS:
				return tasks != null && !tasks.isEmpty();
			case ToUsePropagatorPackage.PROJECT__DEPENDENCES:
				return dependences != null && !dependences.isEmpty();
			case ToUsePropagatorPackage.PROJECT__NOF_RES:
				return nofRes != NOF_RES_EDEFAULT;
			case ToUsePropagatorPackage.PROJECT__START:
				return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
			case ToUsePropagatorPackage.PROJECT__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
			case ToUsePropagatorPackage.PROJECT__PROJECT_NAME:
				return PROJECT_NAME_EDEFAULT == null ? projectName != null : !PROJECT_NAME_EDEFAULT.equals(projectName);
			case ToUsePropagatorPackage.PROJECT__RESOURCES:
				return resources != null && !resources.isEmpty();
			case ToUsePropagatorPackage.PROJECT__AUTOMATIC_REFRESH:
				return automaticRefresh != AUTOMATIC_REFRESH_EDEFAULT;
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
			case ToUsePropagatorPackage.PROJECT___REFRESH_END:
				refreshEnd();
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
		result.append(" (NofRes: ");
		result.append(nofRes);
		result.append(", Start: ");
		result.append(start);
		result.append(", End: ");
		result.append(end);
		result.append(", ProjectName: ");
		result.append(projectName);
		result.append(", AutomaticRefresh: ");
		result.append(automaticRefresh);
		result.append(')');
		return result.toString();
	}


} //ProjectImpl
