/**
 */
package com.misc.touse.moplaf.tousepropagator.impl;

import com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapterScope;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorPackage;
import com.misc.common.moplaf.propagator.Util;
import com.misc.touse.moplaf.tousepropagator.Dependence;
import com.misc.touse.moplaf.tousepropagator.Project;
import com.misc.touse.moplaf.tousepropagator.Resource;
import com.misc.touse.moplaf.tousepropagator.Task;
import com.misc.touse.moplaf.tousepropagator.ToUsePropagatorPackage;
import com.misc.touse.moplaf.tousepropagator.calc.PropagatorLayerProjectEnd;
import com.misc.touse.moplaf.tousepropagator.calc.PropagatorLayerTaskHours;
import com.misc.touse.moplaf.tousepropagator.calc.PropagatorLayerTaskHoursItems;
import com.misc.touse.moplaf.tousepropagator.calc.PropagatorLayerTaskHoursVar;
import com.misc.touse.moplaf.tousepropagator.calc.PropagatorLayerTaskResources;
import com.misc.touse.moplaf.tousepropagator.calc.PropagatorLayerTaskTimes;
import com.misc.touse.moplaf.tousepropagator.calc.PropagatorScopeProject;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
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
 *   <li>{@link com.misc.touse.moplaf.tousepropagator.impl.ProjectImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator.impl.ProjectImpl#getDependences <em>Dependences</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator.impl.ProjectImpl#getNofRes <em>Nof Res</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator.impl.ProjectImpl#getStart <em>Start</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator.impl.ProjectImpl#getEnd <em>End</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator.impl.ProjectImpl#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator.impl.ProjectImpl#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends MinimalEObjectImpl.Container implements Project {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
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
	 */
	public void refreshEnd() {
		Date end = new Date(Long.MIN_VALUE);
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
	 */
	public void refresh() {
		 CommonPlugin.INSTANCE.log( "project "+ this.toString());
		 PropagatorFunctionAdapter propagatorScopeProject = (PropagatorFunctionAdapter)Util.getAdapter(this, PropagatorScopeProject.class);
		 if ( propagatorScopeProject !=null){
			 CommonPlugin.INSTANCE.log( "..: refresh");
			 propagatorScopeProject.refresh();
			 CommonPlugin.INSTANCE.log( "..: refresh done");
		 }
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addPropagatorFunctionAdapter() {
		Util.adapt(this, PropagatorLayerTaskHoursItems.class);
		Util.adapt(this, PropagatorLayerTaskHoursVar.class);
		Util.adapt(this, PropagatorLayerTaskHours.class);
		Util.adapt(this, PropagatorLayerTaskTimes.class);
		Util.adapt(this, PropagatorLayerTaskResources.class);
		Util.adapt(this, PropagatorLayerProjectEnd.class);
		Util.adapt(this, PropagatorScopeProject.class);
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
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ObjectWithPropagatorFunctionAdapterScope.class) {
			switch (baseOperationID) {
				case PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_SCOPE___REFRESH: return ToUsePropagatorPackage.PROJECT___REFRESH;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case ToUsePropagatorPackage.PROJECT___REFRESH:
				refresh();
				return null;
			case ToUsePropagatorPackage.PROJECT___ADD_PROPAGATOR_FUNCTION_ADAPTER:
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
		result.append(" (NofRes: ");
		result.append(nofRes);
		result.append(", Start: ");
		result.append(start);
		result.append(", End: ");
		result.append(end);
		result.append(", ProjectName: ");
		result.append(projectName);
		result.append(')');
		return result.toString();
	}


} //ProjectImpl
