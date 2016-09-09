/**
 */
package com.misc.touse.moplaf.tousepropagator2.impl;

import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctionScope;
import com.misc.common.moplaf.propagator2.PropagatorPackage;
import com.misc.common.moplaf.propagator2.impl.ObjectWithPropagatorFunctionsImpl;
import com.misc.touse.moplaf.tousepropagator2.Dependence;
import com.misc.touse.moplaf.tousepropagator2.Project;
import com.misc.touse.moplaf.tousepropagator2.Resource;
import com.misc.touse.moplaf.tousepropagator2.Task;
import com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage;
import com.misc.touse.moplaf.tousepropagator2.calc.CalcFactory;
import com.misc.touse.moplaf.tousepropagator2.calc.CalcPackage;
import com.misc.touse.moplaf.tousepropagator2.calc.CalcProjectEnd;
import com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskHours;
import com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskHoursItem;
import com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskHoursVar;
import com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskResources;
import com.misc.touse.moplaf.tousepropagator2.calc.LayerTaskTimes;
import com.misc.touse.moplaf.tousepropagator2.calc.ScopeProject;
import com.misc.touse.moplaf.tousepropagator2.calc.ToUsePropagatorFunction;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
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
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.impl.ProjectImpl#getScopeProject <em>Scope Project</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.impl.ProjectImpl#getLayerTaskTimes <em>Layer Task Times</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.impl.ProjectImpl#getLayerTaskHours <em>Layer Task Hours</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.impl.ProjectImpl#getLayerTaskHoursItem <em>Layer Task Hours Item</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.impl.ProjectImpl#getLayerTaskHoursVar <em>Layer Task Hours Var</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.impl.ProjectImpl#getCalcProjectEnd <em>Calc Project End</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.impl.ProjectImpl#getLayerTaskResources <em>Layer Task Resources</em>}</li>
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
	 * The cached value of the '{@link #getScopeProject() <em>Scope Project</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopeProject()
	 * @generated
	 * @ordered
	 */
	protected ScopeProject scopeProject;

	/**
	 * The cached value of the '{@link #getLayerTaskTimes() <em>Layer Task Times</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayerTaskTimes()
	 * @generated
	 * @ordered
	 */
	protected LayerTaskTimes layerTaskTimes;

	/**
	 * The cached value of the '{@link #getLayerTaskHours() <em>Layer Task Hours</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayerTaskHours()
	 * @generated
	 * @ordered
	 */
	protected LayerTaskHours layerTaskHours;

	/**
	 * The cached value of the '{@link #getLayerTaskHoursItem() <em>Layer Task Hours Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayerTaskHoursItem()
	 * @generated
	 * @ordered
	 */
	protected LayerTaskHoursItem layerTaskHoursItem;

	/**
	 * The cached value of the '{@link #getLayerTaskHoursVar() <em>Layer Task Hours Var</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayerTaskHoursVar()
	 * @generated
	 * @ordered
	 */
	protected LayerTaskHoursVar layerTaskHoursVar;

	/**
	 * The cached value of the '{@link #getCalcProjectEnd() <em>Calc Project End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalcProjectEnd()
	 * @generated
	 * @ordered
	 */
	protected CalcProjectEnd calcProjectEnd;

	/**
	 * The cached value of the '{@link #getLayerTaskResources() <em>Layer Task Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayerTaskResources()
	 * @generated
	 * @ordered
	 */
	protected LayerTaskResources layerTaskResources;

	/**
	 * The default value of the '{@link #isAutomaticRefresh() <em>Automatic Refresh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutomaticRefresh()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTOMATIC_REFRESH_EDEFAULT = false;

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
	 * @generated
	 */
	public ScopeProject getScopeProject() {
		return scopeProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScopeProject(ScopeProject newScopeProject, NotificationChain msgs) {
		ScopeProject oldScopeProject = scopeProject;
		scopeProject = newScopeProject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.PROJECT__SCOPE_PROJECT, oldScopeProject, newScopeProject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScopeProject(ScopeProject newScopeProject) {
		if (newScopeProject != scopeProject) {
			NotificationChain msgs = null;
			if (scopeProject != null)
				msgs = ((InternalEObject)scopeProject).eInverseRemove(this, CalcPackage.SCOPE_PROJECT__PROJECT, ScopeProject.class, msgs);
			if (newScopeProject != null)
				msgs = ((InternalEObject)newScopeProject).eInverseAdd(this, CalcPackage.SCOPE_PROJECT__PROJECT, ScopeProject.class, msgs);
			msgs = basicSetScopeProject(newScopeProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.PROJECT__SCOPE_PROJECT, newScopeProject, newScopeProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerTaskTimes getLayerTaskTimes() {
		return layerTaskTimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayerTaskTimes(LayerTaskTimes newLayerTaskTimes, NotificationChain msgs) {
		LayerTaskTimes oldLayerTaskTimes = layerTaskTimes;
		layerTaskTimes = newLayerTaskTimes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.PROJECT__LAYER_TASK_TIMES, oldLayerTaskTimes, newLayerTaskTimes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayerTaskTimes(LayerTaskTimes newLayerTaskTimes) {
		if (newLayerTaskTimes != layerTaskTimes) {
			NotificationChain msgs = null;
			if (layerTaskTimes != null)
				msgs = ((InternalEObject)layerTaskTimes).eInverseRemove(this, CalcPackage.LAYER_TASK_TIMES__PROJECT, LayerTaskTimes.class, msgs);
			if (newLayerTaskTimes != null)
				msgs = ((InternalEObject)newLayerTaskTimes).eInverseAdd(this, CalcPackage.LAYER_TASK_TIMES__PROJECT, LayerTaskTimes.class, msgs);
			msgs = basicSetLayerTaskTimes(newLayerTaskTimes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.PROJECT__LAYER_TASK_TIMES, newLayerTaskTimes, newLayerTaskTimes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerTaskHours getLayerTaskHours() {
		return layerTaskHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayerTaskHours(LayerTaskHours newLayerTaskHours, NotificationChain msgs) {
		LayerTaskHours oldLayerTaskHours = layerTaskHours;
		layerTaskHours = newLayerTaskHours;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.PROJECT__LAYER_TASK_HOURS, oldLayerTaskHours, newLayerTaskHours);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayerTaskHours(LayerTaskHours newLayerTaskHours) {
		if (newLayerTaskHours != layerTaskHours) {
			NotificationChain msgs = null;
			if (layerTaskHours != null)
				msgs = ((InternalEObject)layerTaskHours).eInverseRemove(this, CalcPackage.LAYER_TASK_HOURS__PROJECT, LayerTaskHours.class, msgs);
			if (newLayerTaskHours != null)
				msgs = ((InternalEObject)newLayerTaskHours).eInverseAdd(this, CalcPackage.LAYER_TASK_HOURS__PROJECT, LayerTaskHours.class, msgs);
			msgs = basicSetLayerTaskHours(newLayerTaskHours, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.PROJECT__LAYER_TASK_HOURS, newLayerTaskHours, newLayerTaskHours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerTaskHoursItem getLayerTaskHoursItem() {
		return layerTaskHoursItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayerTaskHoursItem(LayerTaskHoursItem newLayerTaskHoursItem, NotificationChain msgs) {
		LayerTaskHoursItem oldLayerTaskHoursItem = layerTaskHoursItem;
		layerTaskHoursItem = newLayerTaskHoursItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.PROJECT__LAYER_TASK_HOURS_ITEM, oldLayerTaskHoursItem, newLayerTaskHoursItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayerTaskHoursItem(LayerTaskHoursItem newLayerTaskHoursItem) {
		if (newLayerTaskHoursItem != layerTaskHoursItem) {
			NotificationChain msgs = null;
			if (layerTaskHoursItem != null)
				msgs = ((InternalEObject)layerTaskHoursItem).eInverseRemove(this, CalcPackage.LAYER_TASK_HOURS_ITEM__PROJECT, LayerTaskHoursItem.class, msgs);
			if (newLayerTaskHoursItem != null)
				msgs = ((InternalEObject)newLayerTaskHoursItem).eInverseAdd(this, CalcPackage.LAYER_TASK_HOURS_ITEM__PROJECT, LayerTaskHoursItem.class, msgs);
			msgs = basicSetLayerTaskHoursItem(newLayerTaskHoursItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.PROJECT__LAYER_TASK_HOURS_ITEM, newLayerTaskHoursItem, newLayerTaskHoursItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerTaskHoursVar getLayerTaskHoursVar() {
		return layerTaskHoursVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayerTaskHoursVar(LayerTaskHoursVar newLayerTaskHoursVar, NotificationChain msgs) {
		LayerTaskHoursVar oldLayerTaskHoursVar = layerTaskHoursVar;
		layerTaskHoursVar = newLayerTaskHoursVar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.PROJECT__LAYER_TASK_HOURS_VAR, oldLayerTaskHoursVar, newLayerTaskHoursVar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayerTaskHoursVar(LayerTaskHoursVar newLayerTaskHoursVar) {
		if (newLayerTaskHoursVar != layerTaskHoursVar) {
			NotificationChain msgs = null;
			if (layerTaskHoursVar != null)
				msgs = ((InternalEObject)layerTaskHoursVar).eInverseRemove(this, CalcPackage.LAYER_TASK_HOURS_VAR__PROJECT, LayerTaskHoursVar.class, msgs);
			if (newLayerTaskHoursVar != null)
				msgs = ((InternalEObject)newLayerTaskHoursVar).eInverseAdd(this, CalcPackage.LAYER_TASK_HOURS_VAR__PROJECT, LayerTaskHoursVar.class, msgs);
			msgs = basicSetLayerTaskHoursVar(newLayerTaskHoursVar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.PROJECT__LAYER_TASK_HOURS_VAR, newLayerTaskHoursVar, newLayerTaskHoursVar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcProjectEnd getCalcProjectEnd() {
		return calcProjectEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalcProjectEnd(CalcProjectEnd newCalcProjectEnd, NotificationChain msgs) {
		CalcProjectEnd oldCalcProjectEnd = calcProjectEnd;
		calcProjectEnd = newCalcProjectEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.PROJECT__CALC_PROJECT_END, oldCalcProjectEnd, newCalcProjectEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalcProjectEnd(CalcProjectEnd newCalcProjectEnd) {
		if (newCalcProjectEnd != calcProjectEnd) {
			NotificationChain msgs = null;
			if (calcProjectEnd != null)
				msgs = ((InternalEObject)calcProjectEnd).eInverseRemove(this, CalcPackage.CALC_PROJECT_END__PROJECT, CalcProjectEnd.class, msgs);
			if (newCalcProjectEnd != null)
				msgs = ((InternalEObject)newCalcProjectEnd).eInverseAdd(this, CalcPackage.CALC_PROJECT_END__PROJECT, CalcProjectEnd.class, msgs);
			msgs = basicSetCalcProjectEnd(newCalcProjectEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.PROJECT__CALC_PROJECT_END, newCalcProjectEnd, newCalcProjectEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerTaskResources getLayerTaskResources() {
		return layerTaskResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayerTaskResources(LayerTaskResources newLayerTaskResources, NotificationChain msgs) {
		LayerTaskResources oldLayerTaskResources = layerTaskResources;
		layerTaskResources = newLayerTaskResources;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.PROJECT__LAYER_TASK_RESOURCES, oldLayerTaskResources, newLayerTaskResources);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayerTaskResources(LayerTaskResources newLayerTaskResources) {
		if (newLayerTaskResources != layerTaskResources) {
			NotificationChain msgs = null;
			if (layerTaskResources != null)
				msgs = ((InternalEObject)layerTaskResources).eInverseRemove(this, CalcPackage.LAYER_TASK_RESOURCES__PROJECT, LayerTaskResources.class, msgs);
			if (newLayerTaskResources != null)
				msgs = ((InternalEObject)newLayerTaskResources).eInverseAdd(this, CalcPackage.LAYER_TASK_RESOURCES__PROJECT, LayerTaskResources.class, msgs);
			msgs = basicSetLayerTaskResources(newLayerTaskResources, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.PROJECT__LAYER_TASK_RESOURCES, newLayerTaskResources, newLayerTaskResources));
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
	 */
	public void refresh() {
		 CommonPlugin.INSTANCE.log( "ToUsePropagator, refresh called: project "+ this.getProjectName());
		 ScopeProject scopeProject = this.getScopeProject();
//		 PropagatorFunctionAdapter propagatorScopeProject = (PropagatorFunctionAdapter)Util.getAdapter(this, PropagatorScopeProject.class);
		 if ( scopeProject !=null){
			 CommonPlugin.INSTANCE.log( "ToUsePropagator, refresh started: project "+ this.getProjectName());
			 scopeProject.refresh();
			 CommonPlugin.INSTANCE.log( "ToUsePropagator, refresh done: project "+ this.getProjectName());
		 }
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void reset() {
		TreeIterator<EObject> iterator = this.eAllContents();
		while (iterator.hasNext()){
			EObject object = iterator.next();
			 if ( object instanceof ToUsePropagatorFunction ){
				 ToUsePropagatorFunction propagator = (ToUsePropagatorFunction)object;
				 propagator.setCalculated(false);
			 }  // the object is a ToUsePropagatorFunction
		} // traverse the objects
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void newOperation2() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public void onOwned() {
		super.onOwned();
		
		ScopeProject scopeProjet = CalcFactory.eINSTANCE.createScopeProject();
		this.setScopeProject(scopeProjet);
		
		LayerTaskHoursVar layerTaskHoursVar = CalcFactory.eINSTANCE.createLayerTaskHoursVar();
		layerTaskHoursVar.setConcreteParent(scopeProject);
		this.setLayerTaskHoursVar(layerTaskHoursVar);
		
		LayerTaskHoursItem layerTaskHoursItem = CalcFactory.eINSTANCE.createLayerTaskHoursItem();
		layerTaskHoursItem.setConcreteParent(scopeProject);
		this.setLayerTaskHoursItem(layerTaskHoursItem);
		
		LayerTaskHours layerTaskHours = CalcFactory.eINSTANCE.createLayerTaskHours();
		layerTaskHours.setConcreteParent(scopeProject);
		layerTaskHours.setAntecedentLayerTaskHoursItem(layerTaskHoursItem);
		layerTaskHours.setAntecedentLayerTaskHoursVar(layerTaskHoursVar);
		this.setLayerTaskHours(layerTaskHours);
		
		LayerTaskTimes layerTaskTimes = CalcFactory.eINSTANCE.createLayerTaskTimes();
		layerTaskTimes.setConcreteParent(scopeProject);
		layerTaskTimes.setAntecedentLayerTaskHours(layerTaskHours);
		this.setLayerTaskTimes(layerTaskTimes);
			
		CalcProjectEnd calcProjectEnd = CalcFactory.eINSTANCE.createCalcProjectEnd();
		calcProjectEnd.setConcreteParent(scopeProject);
		calcProjectEnd.setAntecedentLayerTaskTimes(layerTaskTimes);
		this.setCalcProjectEnd(calcProjectEnd);
			
		LayerTaskResources layerTaskResources = CalcFactory.eINSTANCE.createLayerTaskResources();
		layerTaskResources.setConcreteParent(scopeProject);
		layerTaskResources.setAntecedentLayerTaskTimes(layerTaskTimes);
		this.setLayerTaskResources(layerTaskResources);
			
//			Util.adapt(this, PropagatorLayerDispose.class);
//			Util.adapt(this, PropagatorLayerTaskResources.class);
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
			case ToUsePropagatorPackage.PROJECT__SCOPE_PROJECT:
				if (scopeProject != null)
					msgs = ((InternalEObject)scopeProject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToUsePropagatorPackage.PROJECT__SCOPE_PROJECT, null, msgs);
				return basicSetScopeProject((ScopeProject)otherEnd, msgs);
			case ToUsePropagatorPackage.PROJECT__LAYER_TASK_TIMES:
				if (layerTaskTimes != null)
					msgs = ((InternalEObject)layerTaskTimes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToUsePropagatorPackage.PROJECT__LAYER_TASK_TIMES, null, msgs);
				return basicSetLayerTaskTimes((LayerTaskTimes)otherEnd, msgs);
			case ToUsePropagatorPackage.PROJECT__LAYER_TASK_HOURS:
				if (layerTaskHours != null)
					msgs = ((InternalEObject)layerTaskHours).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToUsePropagatorPackage.PROJECT__LAYER_TASK_HOURS, null, msgs);
				return basicSetLayerTaskHours((LayerTaskHours)otherEnd, msgs);
			case ToUsePropagatorPackage.PROJECT__LAYER_TASK_HOURS_ITEM:
				if (layerTaskHoursItem != null)
					msgs = ((InternalEObject)layerTaskHoursItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToUsePropagatorPackage.PROJECT__LAYER_TASK_HOURS_ITEM, null, msgs);
				return basicSetLayerTaskHoursItem((LayerTaskHoursItem)otherEnd, msgs);
			case ToUsePropagatorPackage.PROJECT__LAYER_TASK_HOURS_VAR:
				if (layerTaskHoursVar != null)
					msgs = ((InternalEObject)layerTaskHoursVar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToUsePropagatorPackage.PROJECT__LAYER_TASK_HOURS_VAR, null, msgs);
				return basicSetLayerTaskHoursVar((LayerTaskHoursVar)otherEnd, msgs);
			case ToUsePropagatorPackage.PROJECT__CALC_PROJECT_END:
				if (calcProjectEnd != null)
					msgs = ((InternalEObject)calcProjectEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToUsePropagatorPackage.PROJECT__CALC_PROJECT_END, null, msgs);
				return basicSetCalcProjectEnd((CalcProjectEnd)otherEnd, msgs);
			case ToUsePropagatorPackage.PROJECT__LAYER_TASK_RESOURCES:
				if (layerTaskResources != null)
					msgs = ((InternalEObject)layerTaskResources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToUsePropagatorPackage.PROJECT__LAYER_TASK_RESOURCES, null, msgs);
				return basicSetLayerTaskResources((LayerTaskResources)otherEnd, msgs);
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
			case ToUsePropagatorPackage.PROJECT__SCOPE_PROJECT:
				return basicSetScopeProject(null, msgs);
			case ToUsePropagatorPackage.PROJECT__LAYER_TASK_TIMES:
				return basicSetLayerTaskTimes(null, msgs);
			case ToUsePropagatorPackage.PROJECT__LAYER_TASK_HOURS:
				return basicSetLayerTaskHours(null, msgs);
			case ToUsePropagatorPackage.PROJECT__LAYER_TASK_HOURS_ITEM:
				return basicSetLayerTaskHoursItem(null, msgs);
			case ToUsePropagatorPackage.PROJECT__LAYER_TASK_HOURS_VAR:
				return basicSetLayerTaskHoursVar(null, msgs);
			case ToUsePropagatorPackage.PROJECT__CALC_PROJECT_END:
				return basicSetCalcProjectEnd(null, msgs);
			case ToUsePropagatorPackage.PROJECT__LAYER_TASK_RESOURCES:
				return basicSetLayerTaskResources(null, msgs);
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
			case ToUsePropagatorPackage.PROJECT__SCOPE_PROJECT:
				return getScopeProject();
			case ToUsePropagatorPackage.PROJECT__LAYER_TASK_TIMES:
				return getLayerTaskTimes();
			case ToUsePropagatorPackage.PROJECT__LAYER_TASK_HOURS:
				return getLayerTaskHours();
			case ToUsePropagatorPackage.PROJECT__LAYER_TASK_HOURS_ITEM:
				return getLayerTaskHoursItem();
			case ToUsePropagatorPackage.PROJECT__LAYER_TASK_HOURS_VAR:
				return getLayerTaskHoursVar();
			case ToUsePropagatorPackage.PROJECT__CALC_PROJECT_END:
				return getCalcProjectEnd();
			case ToUsePropagatorPackage.PROJECT__LAYER_TASK_RESOURCES:
				return getLayerTaskResources();
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
			case ToUsePropagatorPackage.PROJECT__SCOPE_PROJECT:
				setScopeProject((ScopeProject)newValue);
				return;
			case ToUsePropagatorPackage.PROJECT__LAYER_TASK_TIMES:
				setLayerTaskTimes((LayerTaskTimes)newValue);
				return;
			case ToUsePropagatorPackage.PROJECT__LAYER_TASK_HOURS:
				setLayerTaskHours((LayerTaskHours)newValue);
				return;
			case ToUsePropagatorPackage.PROJECT__LAYER_TASK_HOURS_ITEM:
				setLayerTaskHoursItem((LayerTaskHoursItem)newValue);
				return;
			case ToUsePropagatorPackage.PROJECT__LAYER_TASK_HOURS_VAR:
				setLayerTaskHoursVar((LayerTaskHoursVar)newValue);
				return;
			case ToUsePropagatorPackage.PROJECT__CALC_PROJECT_END:
				setCalcProjectEnd((CalcProjectEnd)newValue);
				return;
			case ToUsePropagatorPackage.PROJECT__LAYER_TASK_RESOURCES:
				setLayerTaskResources((LayerTaskResources)newValue);
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
			case ToUsePropagatorPackage.PROJECT__SCOPE_PROJECT:
				setScopeProject((ScopeProject)null);
				return;
			case ToUsePropagatorPackage.PROJECT__LAYER_TASK_TIMES:
				setLayerTaskTimes((LayerTaskTimes)null);
				return;
			case ToUsePropagatorPackage.PROJECT__LAYER_TASK_HOURS:
				setLayerTaskHours((LayerTaskHours)null);
				return;
			case ToUsePropagatorPackage.PROJECT__LAYER_TASK_HOURS_ITEM:
				setLayerTaskHoursItem((LayerTaskHoursItem)null);
				return;
			case ToUsePropagatorPackage.PROJECT__LAYER_TASK_HOURS_VAR:
				setLayerTaskHoursVar((LayerTaskHoursVar)null);
				return;
			case ToUsePropagatorPackage.PROJECT__CALC_PROJECT_END:
				setCalcProjectEnd((CalcProjectEnd)null);
				return;
			case ToUsePropagatorPackage.PROJECT__LAYER_TASK_RESOURCES:
				setLayerTaskResources((LayerTaskResources)null);
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
			case ToUsePropagatorPackage.PROJECT__SCOPE_PROJECT:
				return scopeProject != null;
			case ToUsePropagatorPackage.PROJECT__LAYER_TASK_TIMES:
				return layerTaskTimes != null;
			case ToUsePropagatorPackage.PROJECT__LAYER_TASK_HOURS:
				return layerTaskHours != null;
			case ToUsePropagatorPackage.PROJECT__LAYER_TASK_HOURS_ITEM:
				return layerTaskHoursItem != null;
			case ToUsePropagatorPackage.PROJECT__LAYER_TASK_HOURS_VAR:
				return layerTaskHoursVar != null;
			case ToUsePropagatorPackage.PROJECT__CALC_PROJECT_END:
				return calcProjectEnd != null;
			case ToUsePropagatorPackage.PROJECT__LAYER_TASK_RESOURCES:
				return layerTaskResources != null;
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ObjectWithPropagatorFunctionScope.class) {
			switch (baseOperationID) {
				case PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_SCOPE___REFRESH: return ToUsePropagatorPackage.PROJECT___REFRESH;
				case PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_SCOPE___NEW_OPERATION2: return ToUsePropagatorPackage.PROJECT___NEW_OPERATION2;
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
			case ToUsePropagatorPackage.PROJECT___RESET:
				reset();
				return null;
			case ToUsePropagatorPackage.PROJECT___NEW_OPERATION2:
				newOperation2();
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
