/**
 */
package com.misc.touse.moplaf.tousepropagator2.impl;

import com.misc.common.moplaf.propagator2.impl.ObjectWithPropagatorFunctionsImpl;
import com.misc.touse.moplaf.tousepropagator2.Dependence;
import com.misc.touse.moplaf.tousepropagator2.Project;
import com.misc.touse.moplaf.tousepropagator2.Resource;
import com.misc.touse.moplaf.tousepropagator2.ResourceCandidate;
import com.misc.touse.moplaf.tousepropagator2.Task;
import com.misc.touse.moplaf.tousepropagator2.TaskItem;
import com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorFactory;
import com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage;
import com.misc.touse.moplaf.tousepropagator2.calc.CalcFactory;
import com.misc.touse.moplaf.tousepropagator2.calc.CalcPackage;
import com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskEnd;
import com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskHours;
import com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskHoursItem;
import com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskHoursVar;
import com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskResources;
import com.misc.touse.moplaf.tousepropagator2.calc.CalcTaskStart;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.impl.TaskImpl#getStart <em>Start</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.impl.TaskImpl#getEnd <em>End</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.impl.TaskImpl#getHours <em>Hours</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.impl.TaskImpl#getHoursItems <em>Hours Items</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.impl.TaskImpl#getHoursVar <em>Hours Var</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.impl.TaskImpl#getHoursVarPerRes <em>Hours Var Per Res</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.impl.TaskImpl#getDependencesAfter <em>Dependences After</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.impl.TaskImpl#getDependencesBefore <em>Dependences Before</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.impl.TaskImpl#getTaskName <em>Task Name</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.impl.TaskImpl#getItems <em>Items</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.impl.TaskImpl#getProject <em>Project</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.impl.TaskImpl#getResourceCandidates <em>Resource Candidates</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.impl.TaskImpl#getCalcTaskStart <em>Calc Task Start</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.impl.TaskImpl#getCalcTaskEnd <em>Calc Task End</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.impl.TaskImpl#getCalcTaskHours <em>Calc Task Hours</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.impl.TaskImpl#getCalcTaskHoursVar <em>Calc Task Hours Var</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.impl.TaskImpl#getCalcTaskHoursItem <em>Calc Task Hours Item</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator2.impl.TaskImpl#getCalcTaskResources <em>Calc Task Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends ObjectWithPropagatorFunctionsImpl implements Task {
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
	 * The default value of the '{@link #getHoursItems() <em>Hours Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoursItems()
	 * @generated
	 * @ordered
	 */
	protected static final float HOURS_ITEMS_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getHoursItems() <em>Hours Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoursItems()
	 * @generated
	 * @ordered
	 */
	protected float hoursItems = HOURS_ITEMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHoursVar() <em>Hours Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoursVar()
	 * @generated
	 * @ordered
	 */
	protected static final float HOURS_VAR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHoursVar() <em>Hours Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoursVar()
	 * @generated
	 * @ordered
	 */
	protected float hoursVar = HOURS_VAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getHoursVarPerRes() <em>Hours Var Per Res</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoursVarPerRes()
	 * @generated
	 * @ordered
	 */
	protected static final float HOURS_VAR_PER_RES_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHoursVarPerRes() <em>Hours Var Per Res</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoursVarPerRes()
	 * @generated
	 * @ordered
	 */
	protected float hoursVarPerRes = HOURS_VAR_PER_RES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDependencesAfter() <em>Dependences After</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencesAfter()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependence> dependencesAfter;

	/**
	 * The cached value of the '{@link #getDependencesBefore() <em>Dependences Before</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencesBefore()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependence> dependencesBefore;

	/**
	 * The default value of the '{@link #getTaskName() <em>Task Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskName()
	 * @generated
	 * @ordered
	 */
	protected static final String TASK_NAME_EDEFAULT = "new task";

	/**
	 * The cached value of the '{@link #getTaskName() <em>Task Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskName()
	 * @generated
	 * @ordered
	 */
	protected String taskName = TASK_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskItem> items;

	/**
	 * The cached value of the '{@link #getResourceCandidates() <em>Resource Candidates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceCandidates()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceCandidate> resourceCandidates;

	/**
	 * The cached value of the '{@link #getCalcTaskStart() <em>Calc Task Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalcTaskStart()
	 * @generated
	 * @ordered
	 */
	protected CalcTaskStart calcTaskStart;

	/**
	 * The cached value of the '{@link #getCalcTaskEnd() <em>Calc Task End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalcTaskEnd()
	 * @generated
	 * @ordered
	 */
	protected CalcTaskEnd calcTaskEnd;

	/**
	 * The cached value of the '{@link #getCalcTaskHours() <em>Calc Task Hours</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalcTaskHours()
	 * @generated
	 * @ordered
	 */
	protected CalcTaskHours calcTaskHours;

	/**
	 * The cached value of the '{@link #getCalcTaskHoursVar() <em>Calc Task Hours Var</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalcTaskHoursVar()
	 * @generated
	 * @ordered
	 */
	protected CalcTaskHoursVar calcTaskHoursVar;

	/**
	 * The cached value of the '{@link #getCalcTaskHoursItem() <em>Calc Task Hours Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalcTaskHoursItem()
	 * @generated
	 * @ordered
	 */
	protected CalcTaskHoursItem calcTaskHoursItem;

	/**
	 * The cached value of the '{@link #getCalcTaskResources() <em>Calc Task Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalcTaskResources()
	 * @generated
	 * @ordered
	 */
	protected CalcTaskResources calcTaskResources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUsePropagatorPackage.Literals.TASK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.TASK__START, oldStart, start));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.TASK__END, oldEnd, end));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.TASK__HOURS, oldHours, hours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHoursItems() {
		return hoursItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoursItems(float newHoursItems) {
		float oldHoursItems = hoursItems;
		hoursItems = newHoursItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.TASK__HOURS_ITEMS, oldHoursItems, hoursItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHoursVar() {
		return hoursVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoursVar(float newHoursVar) {
		float oldHoursVar = hoursVar;
		hoursVar = newHoursVar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.TASK__HOURS_VAR, oldHoursVar, hoursVar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHoursVarPerRes() {
		return hoursVarPerRes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoursVarPerRes(float newHoursVarPerRes) {
		float oldHoursVarPerRes = hoursVarPerRes;
		hoursVarPerRes = newHoursVarPerRes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.TASK__HOURS_VAR_PER_RES, oldHoursVarPerRes, hoursVarPerRes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependence> getDependencesAfter() {
		if (dependencesAfter == null) {
			dependencesAfter = new EObjectWithInverseResolvingEList<Dependence>(Dependence.class, this, ToUsePropagatorPackage.TASK__DEPENDENCES_AFTER, ToUsePropagatorPackage.DEPENDENCE__TASK_BEFORE);
		}
		return dependencesAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependence> getDependencesBefore() {
		if (dependencesBefore == null) {
			dependencesBefore = new EObjectWithInverseResolvingEList<Dependence>(Dependence.class, this, ToUsePropagatorPackage.TASK__DEPENDENCES_BEFORE, ToUsePropagatorPackage.DEPENDENCE__TASK_AFTER);
		}
		return dependencesBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTaskName() {
		return taskName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskName(String newTaskName) {
		String oldTaskName = taskName;
		taskName = newTaskName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.TASK__TASK_NAME, oldTaskName, taskName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskItem> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<TaskItem>(TaskItem.class, this, ToUsePropagatorPackage.TASK__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getProject() {
		if (eContainerFeatureID() != ToUsePropagatorPackage.TASK__PROJECT) return null;
		return (Project)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProject(Project newProject, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProject, ToUsePropagatorPackage.TASK__PROJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(Project newProject) {
		if (newProject != eInternalContainer() || (eContainerFeatureID() != ToUsePropagatorPackage.TASK__PROJECT && newProject != null)) {
			if (EcoreUtil.isAncestor(this, newProject))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProject != null)
				msgs = ((InternalEObject)newProject).eInverseAdd(this, ToUsePropagatorPackage.PROJECT__TASKS, Project.class, msgs);
			msgs = basicSetProject(newProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.TASK__PROJECT, newProject, newProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceCandidate> getResourceCandidates() {
		if (resourceCandidates == null) {
			resourceCandidates = new EObjectContainmentWithInverseEList<ResourceCandidate>(ResourceCandidate.class, this, ToUsePropagatorPackage.TASK__RESOURCE_CANDIDATES, ToUsePropagatorPackage.RESOURCE_CANDIDATE__TASK);
		}
		return resourceCandidates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcTaskStart getCalcTaskStart() {
		return calcTaskStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalcTaskStart(CalcTaskStart newCalcTaskStart, NotificationChain msgs) {
		CalcTaskStart oldCalcTaskStart = calcTaskStart;
		calcTaskStart = newCalcTaskStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.TASK__CALC_TASK_START, oldCalcTaskStart, newCalcTaskStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalcTaskStart(CalcTaskStart newCalcTaskStart) {
		if (newCalcTaskStart != calcTaskStart) {
			NotificationChain msgs = null;
			if (calcTaskStart != null)
				msgs = ((InternalEObject)calcTaskStart).eInverseRemove(this, CalcPackage.CALC_TASK_START__TASK, CalcTaskStart.class, msgs);
			if (newCalcTaskStart != null)
				msgs = ((InternalEObject)newCalcTaskStart).eInverseAdd(this, CalcPackage.CALC_TASK_START__TASK, CalcTaskStart.class, msgs);
			msgs = basicSetCalcTaskStart(newCalcTaskStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.TASK__CALC_TASK_START, newCalcTaskStart, newCalcTaskStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcTaskEnd getCalcTaskEnd() {
		return calcTaskEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalcTaskEnd(CalcTaskEnd newCalcTaskEnd, NotificationChain msgs) {
		CalcTaskEnd oldCalcTaskEnd = calcTaskEnd;
		calcTaskEnd = newCalcTaskEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.TASK__CALC_TASK_END, oldCalcTaskEnd, newCalcTaskEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalcTaskEnd(CalcTaskEnd newCalcTaskEnd) {
		if (newCalcTaskEnd != calcTaskEnd) {
			NotificationChain msgs = null;
			if (calcTaskEnd != null)
				msgs = ((InternalEObject)calcTaskEnd).eInverseRemove(this, CalcPackage.CALC_TASK_END__TASK, CalcTaskEnd.class, msgs);
			if (newCalcTaskEnd != null)
				msgs = ((InternalEObject)newCalcTaskEnd).eInverseAdd(this, CalcPackage.CALC_TASK_END__TASK, CalcTaskEnd.class, msgs);
			msgs = basicSetCalcTaskEnd(newCalcTaskEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.TASK__CALC_TASK_END, newCalcTaskEnd, newCalcTaskEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcTaskHours getCalcTaskHours() {
		return calcTaskHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalcTaskHours(CalcTaskHours newCalcTaskHours, NotificationChain msgs) {
		CalcTaskHours oldCalcTaskHours = calcTaskHours;
		calcTaskHours = newCalcTaskHours;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.TASK__CALC_TASK_HOURS, oldCalcTaskHours, newCalcTaskHours);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalcTaskHours(CalcTaskHours newCalcTaskHours) {
		if (newCalcTaskHours != calcTaskHours) {
			NotificationChain msgs = null;
			if (calcTaskHours != null)
				msgs = ((InternalEObject)calcTaskHours).eInverseRemove(this, CalcPackage.CALC_TASK_HOURS__TASK, CalcTaskHours.class, msgs);
			if (newCalcTaskHours != null)
				msgs = ((InternalEObject)newCalcTaskHours).eInverseAdd(this, CalcPackage.CALC_TASK_HOURS__TASK, CalcTaskHours.class, msgs);
			msgs = basicSetCalcTaskHours(newCalcTaskHours, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.TASK__CALC_TASK_HOURS, newCalcTaskHours, newCalcTaskHours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcTaskHoursVar getCalcTaskHoursVar() {
		return calcTaskHoursVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalcTaskHoursVar(CalcTaskHoursVar newCalcTaskHoursVar, NotificationChain msgs) {
		CalcTaskHoursVar oldCalcTaskHoursVar = calcTaskHoursVar;
		calcTaskHoursVar = newCalcTaskHoursVar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.TASK__CALC_TASK_HOURS_VAR, oldCalcTaskHoursVar, newCalcTaskHoursVar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalcTaskHoursVar(CalcTaskHoursVar newCalcTaskHoursVar) {
		if (newCalcTaskHoursVar != calcTaskHoursVar) {
			NotificationChain msgs = null;
			if (calcTaskHoursVar != null)
				msgs = ((InternalEObject)calcTaskHoursVar).eInverseRemove(this, CalcPackage.CALC_TASK_HOURS_VAR__TASK, CalcTaskHoursVar.class, msgs);
			if (newCalcTaskHoursVar != null)
				msgs = ((InternalEObject)newCalcTaskHoursVar).eInverseAdd(this, CalcPackage.CALC_TASK_HOURS_VAR__TASK, CalcTaskHoursVar.class, msgs);
			msgs = basicSetCalcTaskHoursVar(newCalcTaskHoursVar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.TASK__CALC_TASK_HOURS_VAR, newCalcTaskHoursVar, newCalcTaskHoursVar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcTaskHoursItem getCalcTaskHoursItem() {
		return calcTaskHoursItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalcTaskHoursItem(CalcTaskHoursItem newCalcTaskHoursItem, NotificationChain msgs) {
		CalcTaskHoursItem oldCalcTaskHoursItem = calcTaskHoursItem;
		calcTaskHoursItem = newCalcTaskHoursItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.TASK__CALC_TASK_HOURS_ITEM, oldCalcTaskHoursItem, newCalcTaskHoursItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalcTaskHoursItem(CalcTaskHoursItem newCalcTaskHoursItem) {
		if (newCalcTaskHoursItem != calcTaskHoursItem) {
			NotificationChain msgs = null;
			if (calcTaskHoursItem != null)
				msgs = ((InternalEObject)calcTaskHoursItem).eInverseRemove(this, CalcPackage.CALC_TASK_HOURS_ITEM__TASK, CalcTaskHoursItem.class, msgs);
			if (newCalcTaskHoursItem != null)
				msgs = ((InternalEObject)newCalcTaskHoursItem).eInverseAdd(this, CalcPackage.CALC_TASK_HOURS_ITEM__TASK, CalcTaskHoursItem.class, msgs);
			msgs = basicSetCalcTaskHoursItem(newCalcTaskHoursItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.TASK__CALC_TASK_HOURS_ITEM, newCalcTaskHoursItem, newCalcTaskHoursItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcTaskResources getCalcTaskResources() {
		return calcTaskResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalcTaskResources(CalcTaskResources newCalcTaskResources, NotificationChain msgs) {
		CalcTaskResources oldCalcTaskResources = calcTaskResources;
		calcTaskResources = newCalcTaskResources;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.TASK__CALC_TASK_RESOURCES, oldCalcTaskResources, newCalcTaskResources);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalcTaskResources(CalcTaskResources newCalcTaskResources) {
		if (newCalcTaskResources != calcTaskResources) {
			NotificationChain msgs = null;
			if (calcTaskResources != null)
				msgs = ((InternalEObject)calcTaskResources).eInverseRemove(this, CalcPackage.CALC_TASK_RESOURCES__TASK, CalcTaskResources.class, msgs);
			if (newCalcTaskResources != null)
				msgs = ((InternalEObject)newCalcTaskResources).eInverseAdd(this, CalcPackage.CALC_TASK_RESOURCES__TASK, CalcTaskResources.class, msgs);
			msgs = basicSetCalcTaskResources(newCalcTaskResources, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUsePropagatorPackage.TASK__CALC_TASK_RESOURCES, newCalcTaskResources, newCalcTaskResources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshStart() {
		Project project = this.getProject();
		if ( project == null ) { return ; }
		Date start = project.getStart();
		for ( Dependence dependencebefore : this.getDependencesBefore()){
			Task taskbefore = dependencebefore.getTaskBefore();
			if ( taskbefore != null ) {
				Date timebefore = new Date(taskbefore.getEnd().getTime()+(long)(dependencebefore.getHours()*60*60*1000));
				if ( timebefore.after(start)){			
					start = timebefore;
				}
			}
		}  // traverse the dependencies
		this.setStart(start);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshEnd() {
		Date start = this.getStart();
		float hours = this.getHours();
		Date end = new Date(start.getTime()+(long)(hours*60*60*1000));
		this.setEnd(end);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshHours() {
		float hoursvars = this.getHoursVar();
		float hourstimes = this.getHoursItems();
		float hours = hoursvars+hourstimes;
		this.setHours(hours);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshHoursItem() {
		float hours = 0.0f;
		for (TaskItem taskitem : this.getItems()){
			hours += taskitem.getHours();
		}
		this.setHoursItems(hours);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshHoursVar() {
		Project project = this.getProject();
		if ( project == null ) { return ; }
		float hours = project.getNofRes()*this.getHoursVarPerRes();
		this.setHoursVar(hours);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public boolean isCandidate(Resource resource){
		if ( resource.eContainer()==null) { return false; }
		if ( resource.getStart() == null ) { return false; }
		if ( resource.getEnd() == null ) { return false; }
		if ( this.getStart() == null ) { return false; }
		if ( this.getEnd() == null ) { return false; }
		if ( resource.getStart().after(this.getEnd() )){ return false; }
		if ( resource.getEnd().before(this.getStart() )){ return false; }
		return true;
	}
	
	private float getCandidateMatch(Resource resource) {
		Date overlapStart = this.getStart(); 
		if ( resource.getStart().after(overlapStart)){
			overlapStart = resource.getStart();
		}
		Date overlapEnd = this.getEnd();
		if ( resource.getEnd().before(overlapEnd)){
			overlapEnd = resource.getEnd();
		}
		float overlapDuration = (float)(overlapEnd.getTime()-overlapStart.getTime());
		float taskDuration = (float)(this.getEnd().getTime()-this.getStart().getTime());
		float match = overlapDuration/taskDuration;
		return match;
	}

	private ResourceCandidate refreshResourceCandidatesImplCreate(Resource resource) {
		CommonPlugin.INSTANCE.log("refreshResourceCandidates, create resource "+resource.getResourceName());
		ResourceCandidate toBe = ToUsePropagatorFactory.eINSTANCE.createResourceCandidate();
		toBe.setResource(resource);
		return toBe;
	}
	
	private void refreshResourceCandidatesImplUpdate(ResourceCandidate candidate) {
		Resource resource = candidate.getResource();
		CommonPlugin.INSTANCE.log("refreshResourceCandidates, update resource "+resource.getResourceName());
		float match = this.getCandidateMatch(resource);
		candidate.setMatch(match);
	}
	
	private void refreshResourceCandidatesImplDelete(ResourceCandidate candidate) {
		Resource resource = candidate.getResource();
		CommonPlugin.INSTANCE.log("refreshResourceCandidates, delete resource "+resource.getResourceName());
		candidate.setResource(null);
	}

	
	private ResourceCandidate refreshResourceCandidatesImpl(ResourceCandidate asIs, Resource resource) {
		ResourceCandidate toBe = null;
		if ( this.isCandidate(resource) ){
			if ( asIs == null ){
				// create
				toBe = this.refreshResourceCandidatesImplCreate(resource);
			} else {
				// update
				toBe = asIs;
			}
			this.refreshResourceCandidatesImplUpdate(toBe);
		} else if (asIs!=null){
			// not tobe but asis: delete asis
			this.refreshResourceCandidatesImplDelete(asIs);
		}
		return toBe;
	}
	
	public void refreshResourceCandidates() {
		CommonPlugin.INSTANCE.log("refreshResourceCandidates, " + this.getTaskName() + ", all resources ");
		HashMap<Resource, ResourceCandidate> candidatesAsIs = new HashMap<Resource, ResourceCandidate>();
		for ( ResourceCandidate candidateAsIs : this.getResourceCandidates()){
			Resource resource = candidateAsIs.getResource();
			if ( resource !=null){
				candidatesAsIs.put(resource, candidateAsIs);
			}
		}

		Project project = this.getProject();
		if ( project != null ) {
			for ( Resource resource : this.getProject().getResources()){
				ResourceCandidate candidateAsIs = candidatesAsIs.remove(resource);
				ResourceCandidate candidateToBe = this.refreshResourceCandidatesImpl(candidateAsIs, resource);
				if ( candidateToBe!=null  && candidateToBe!=candidateAsIs){
					this.getResourceCandidates().add(candidateToBe);
				}
			}
		}
		
		for ( ResourceCandidate candidateAsIs : candidatesAsIs.values()){
			this.refreshResourceCandidatesImplDelete(candidateAsIs);
		}
		
		for (  Iterator<ResourceCandidate> iterator = this.getResourceCandidates().iterator(); iterator.hasNext();){
			ResourceCandidate resourceCandidate = iterator.next();
			Resource resource = resourceCandidate.getResource();
			if ( resource == null){
				iterator.remove();
			} 
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshResourceCandidates(Resource resourceToRefresh) {
		CommonPlugin.INSTANCE.log("refreshResourceCandidates, " + this.getTaskName() + ", resource "+resourceToRefresh.getResourceName());
		ResourceCandidate candidateAsIs = null;
		for ( ResourceCandidate candidateAsIsTmp : this.getResourceCandidates()){
			Resource resource = candidateAsIsTmp.getResource();
			if ( resource ==resourceToRefresh){
				candidateAsIs = candidateAsIsTmp;
				break;
			}
		}

		ResourceCandidate candidateToBe = this.refreshResourceCandidatesImpl(candidateAsIs, resourceToRefresh);
		if ( candidateToBe!=null  && candidateToBe!=candidateAsIs){
			this.getResourceCandidates().add(candidateToBe);
		}
		
		for (  Iterator<ResourceCandidate> iterator = this.getResourceCandidates().iterator(); iterator.hasNext();){
			ResourceCandidate resourceCandidate = iterator.next();
			Resource resource = resourceCandidate.getResource();
			if ( resource == null){
				iterator.remove();
			} 
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void dispose() {
		CommonPlugin.INSTANCE.log("Task.dispose, " + this.getTaskName() + "");
		this.getDependencesAfter().clear();
		this.getDependencesBefore().clear();
	}


	
	@Override
	public void onOwned() {
		
		Project project = this.getProject();
		
		CalcTaskHoursVar calcTaskHoursVar = CalcFactory.eINSTANCE.createCalcTaskHoursVar();
		calcTaskHoursVar.setConcreteParent(project.getLayerTaskHoursVar());
		this.setCalcTaskHoursVar(calcTaskHoursVar);
		calcTaskHoursVar.touch(null);
		
		CalcTaskHoursItem calcTaskHoursItem = CalcFactory.eINSTANCE.createCalcTaskHoursItem();
		calcTaskHoursItem.setConcreteParent(project.getLayerTaskHoursItem());
		this.setCalcTaskHoursItem(calcTaskHoursItem);
		calcTaskHoursItem.touch(null);
		
		CalcTaskHours calcTaskHours = CalcFactory.eINSTANCE.createCalcTaskHours();
		calcTaskHours.setConcreteParent(project.getLayerTaskHours());
		this.setCalcTaskHours(calcTaskHours);
		calcTaskHours.touch(null);

		CalcTaskStart calcTaskStart = CalcFactory.eINSTANCE.createCalcTaskStart();
		calcTaskStart.setConcreteParent(project.getLayerTaskTimes());
		this.setCalcTaskStart(calcTaskStart);
		calcTaskStart.touch(null);

		CalcTaskEnd calcTaskEnd = CalcFactory.eINSTANCE.createCalcTaskEnd();
		calcTaskEnd.setConcreteParent(project.getLayerTaskTimes());
		this.setCalcTaskEnd(calcTaskEnd);
		calcTaskEnd.touch(null);
		
		CalcTaskResources calcTaskResources = CalcFactory.eINSTANCE.createCalcTaskResources();
		calcTaskResources.setConcreteParent(project.getLayerTaskResources());
		this.setCalcTaskResources(calcTaskResources);
		calcTaskResources.touch(null);

		
//		Util.adapt(this, PropagatorCalcTaskDispose.class);
//		Util.adapt(this, PropagatorCalcTaskResources.class);
	}
	
	

	@Override
	public void onNotOwned() {
		this.dispose();
		super.onNotOwned();
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
			case ToUsePropagatorPackage.TASK__DEPENDENCES_AFTER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDependencesAfter()).basicAdd(otherEnd, msgs);
			case ToUsePropagatorPackage.TASK__DEPENDENCES_BEFORE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDependencesBefore()).basicAdd(otherEnd, msgs);
			case ToUsePropagatorPackage.TASK__PROJECT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProject((Project)otherEnd, msgs);
			case ToUsePropagatorPackage.TASK__RESOURCE_CANDIDATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResourceCandidates()).basicAdd(otherEnd, msgs);
			case ToUsePropagatorPackage.TASK__CALC_TASK_START:
				if (calcTaskStart != null)
					msgs = ((InternalEObject)calcTaskStart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToUsePropagatorPackage.TASK__CALC_TASK_START, null, msgs);
				return basicSetCalcTaskStart((CalcTaskStart)otherEnd, msgs);
			case ToUsePropagatorPackage.TASK__CALC_TASK_END:
				if (calcTaskEnd != null)
					msgs = ((InternalEObject)calcTaskEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToUsePropagatorPackage.TASK__CALC_TASK_END, null, msgs);
				return basicSetCalcTaskEnd((CalcTaskEnd)otherEnd, msgs);
			case ToUsePropagatorPackage.TASK__CALC_TASK_HOURS:
				if (calcTaskHours != null)
					msgs = ((InternalEObject)calcTaskHours).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToUsePropagatorPackage.TASK__CALC_TASK_HOURS, null, msgs);
				return basicSetCalcTaskHours((CalcTaskHours)otherEnd, msgs);
			case ToUsePropagatorPackage.TASK__CALC_TASK_HOURS_VAR:
				if (calcTaskHoursVar != null)
					msgs = ((InternalEObject)calcTaskHoursVar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToUsePropagatorPackage.TASK__CALC_TASK_HOURS_VAR, null, msgs);
				return basicSetCalcTaskHoursVar((CalcTaskHoursVar)otherEnd, msgs);
			case ToUsePropagatorPackage.TASK__CALC_TASK_HOURS_ITEM:
				if (calcTaskHoursItem != null)
					msgs = ((InternalEObject)calcTaskHoursItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToUsePropagatorPackage.TASK__CALC_TASK_HOURS_ITEM, null, msgs);
				return basicSetCalcTaskHoursItem((CalcTaskHoursItem)otherEnd, msgs);
			case ToUsePropagatorPackage.TASK__CALC_TASK_RESOURCES:
				if (calcTaskResources != null)
					msgs = ((InternalEObject)calcTaskResources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToUsePropagatorPackage.TASK__CALC_TASK_RESOURCES, null, msgs);
				return basicSetCalcTaskResources((CalcTaskResources)otherEnd, msgs);
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
			case ToUsePropagatorPackage.TASK__DEPENDENCES_AFTER:
				return ((InternalEList<?>)getDependencesAfter()).basicRemove(otherEnd, msgs);
			case ToUsePropagatorPackage.TASK__DEPENDENCES_BEFORE:
				return ((InternalEList<?>)getDependencesBefore()).basicRemove(otherEnd, msgs);
			case ToUsePropagatorPackage.TASK__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
			case ToUsePropagatorPackage.TASK__PROJECT:
				return basicSetProject(null, msgs);
			case ToUsePropagatorPackage.TASK__RESOURCE_CANDIDATES:
				return ((InternalEList<?>)getResourceCandidates()).basicRemove(otherEnd, msgs);
			case ToUsePropagatorPackage.TASK__CALC_TASK_START:
				return basicSetCalcTaskStart(null, msgs);
			case ToUsePropagatorPackage.TASK__CALC_TASK_END:
				return basicSetCalcTaskEnd(null, msgs);
			case ToUsePropagatorPackage.TASK__CALC_TASK_HOURS:
				return basicSetCalcTaskHours(null, msgs);
			case ToUsePropagatorPackage.TASK__CALC_TASK_HOURS_VAR:
				return basicSetCalcTaskHoursVar(null, msgs);
			case ToUsePropagatorPackage.TASK__CALC_TASK_HOURS_ITEM:
				return basicSetCalcTaskHoursItem(null, msgs);
			case ToUsePropagatorPackage.TASK__CALC_TASK_RESOURCES:
				return basicSetCalcTaskResources(null, msgs);
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
			case ToUsePropagatorPackage.TASK__PROJECT:
				return eInternalContainer().eInverseRemove(this, ToUsePropagatorPackage.PROJECT__TASKS, Project.class, msgs);
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
			case ToUsePropagatorPackage.TASK__START:
				return getStart();
			case ToUsePropagatorPackage.TASK__END:
				return getEnd();
			case ToUsePropagatorPackage.TASK__HOURS:
				return getHours();
			case ToUsePropagatorPackage.TASK__HOURS_ITEMS:
				return getHoursItems();
			case ToUsePropagatorPackage.TASK__HOURS_VAR:
				return getHoursVar();
			case ToUsePropagatorPackage.TASK__HOURS_VAR_PER_RES:
				return getHoursVarPerRes();
			case ToUsePropagatorPackage.TASK__DEPENDENCES_AFTER:
				return getDependencesAfter();
			case ToUsePropagatorPackage.TASK__DEPENDENCES_BEFORE:
				return getDependencesBefore();
			case ToUsePropagatorPackage.TASK__TASK_NAME:
				return getTaskName();
			case ToUsePropagatorPackage.TASK__ITEMS:
				return getItems();
			case ToUsePropagatorPackage.TASK__PROJECT:
				return getProject();
			case ToUsePropagatorPackage.TASK__RESOURCE_CANDIDATES:
				return getResourceCandidates();
			case ToUsePropagatorPackage.TASK__CALC_TASK_START:
				return getCalcTaskStart();
			case ToUsePropagatorPackage.TASK__CALC_TASK_END:
				return getCalcTaskEnd();
			case ToUsePropagatorPackage.TASK__CALC_TASK_HOURS:
				return getCalcTaskHours();
			case ToUsePropagatorPackage.TASK__CALC_TASK_HOURS_VAR:
				return getCalcTaskHoursVar();
			case ToUsePropagatorPackage.TASK__CALC_TASK_HOURS_ITEM:
				return getCalcTaskHoursItem();
			case ToUsePropagatorPackage.TASK__CALC_TASK_RESOURCES:
				return getCalcTaskResources();
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
			case ToUsePropagatorPackage.TASK__START:
				setStart((Date)newValue);
				return;
			case ToUsePropagatorPackage.TASK__END:
				setEnd((Date)newValue);
				return;
			case ToUsePropagatorPackage.TASK__HOURS:
				setHours((Float)newValue);
				return;
			case ToUsePropagatorPackage.TASK__HOURS_ITEMS:
				setHoursItems((Float)newValue);
				return;
			case ToUsePropagatorPackage.TASK__HOURS_VAR:
				setHoursVar((Float)newValue);
				return;
			case ToUsePropagatorPackage.TASK__HOURS_VAR_PER_RES:
				setHoursVarPerRes((Float)newValue);
				return;
			case ToUsePropagatorPackage.TASK__DEPENDENCES_AFTER:
				getDependencesAfter().clear();
				getDependencesAfter().addAll((Collection<? extends Dependence>)newValue);
				return;
			case ToUsePropagatorPackage.TASK__DEPENDENCES_BEFORE:
				getDependencesBefore().clear();
				getDependencesBefore().addAll((Collection<? extends Dependence>)newValue);
				return;
			case ToUsePropagatorPackage.TASK__TASK_NAME:
				setTaskName((String)newValue);
				return;
			case ToUsePropagatorPackage.TASK__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends TaskItem>)newValue);
				return;
			case ToUsePropagatorPackage.TASK__PROJECT:
				setProject((Project)newValue);
				return;
			case ToUsePropagatorPackage.TASK__RESOURCE_CANDIDATES:
				getResourceCandidates().clear();
				getResourceCandidates().addAll((Collection<? extends ResourceCandidate>)newValue);
				return;
			case ToUsePropagatorPackage.TASK__CALC_TASK_START:
				setCalcTaskStart((CalcTaskStart)newValue);
				return;
			case ToUsePropagatorPackage.TASK__CALC_TASK_END:
				setCalcTaskEnd((CalcTaskEnd)newValue);
				return;
			case ToUsePropagatorPackage.TASK__CALC_TASK_HOURS:
				setCalcTaskHours((CalcTaskHours)newValue);
				return;
			case ToUsePropagatorPackage.TASK__CALC_TASK_HOURS_VAR:
				setCalcTaskHoursVar((CalcTaskHoursVar)newValue);
				return;
			case ToUsePropagatorPackage.TASK__CALC_TASK_HOURS_ITEM:
				setCalcTaskHoursItem((CalcTaskHoursItem)newValue);
				return;
			case ToUsePropagatorPackage.TASK__CALC_TASK_RESOURCES:
				setCalcTaskResources((CalcTaskResources)newValue);
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
			case ToUsePropagatorPackage.TASK__START:
				setStart(START_EDEFAULT);
				return;
			case ToUsePropagatorPackage.TASK__END:
				setEnd(END_EDEFAULT);
				return;
			case ToUsePropagatorPackage.TASK__HOURS:
				setHours(HOURS_EDEFAULT);
				return;
			case ToUsePropagatorPackage.TASK__HOURS_ITEMS:
				setHoursItems(HOURS_ITEMS_EDEFAULT);
				return;
			case ToUsePropagatorPackage.TASK__HOURS_VAR:
				setHoursVar(HOURS_VAR_EDEFAULT);
				return;
			case ToUsePropagatorPackage.TASK__HOURS_VAR_PER_RES:
				setHoursVarPerRes(HOURS_VAR_PER_RES_EDEFAULT);
				return;
			case ToUsePropagatorPackage.TASK__DEPENDENCES_AFTER:
				getDependencesAfter().clear();
				return;
			case ToUsePropagatorPackage.TASK__DEPENDENCES_BEFORE:
				getDependencesBefore().clear();
				return;
			case ToUsePropagatorPackage.TASK__TASK_NAME:
				setTaskName(TASK_NAME_EDEFAULT);
				return;
			case ToUsePropagatorPackage.TASK__ITEMS:
				getItems().clear();
				return;
			case ToUsePropagatorPackage.TASK__PROJECT:
				setProject((Project)null);
				return;
			case ToUsePropagatorPackage.TASK__RESOURCE_CANDIDATES:
				getResourceCandidates().clear();
				return;
			case ToUsePropagatorPackage.TASK__CALC_TASK_START:
				setCalcTaskStart((CalcTaskStart)null);
				return;
			case ToUsePropagatorPackage.TASK__CALC_TASK_END:
				setCalcTaskEnd((CalcTaskEnd)null);
				return;
			case ToUsePropagatorPackage.TASK__CALC_TASK_HOURS:
				setCalcTaskHours((CalcTaskHours)null);
				return;
			case ToUsePropagatorPackage.TASK__CALC_TASK_HOURS_VAR:
				setCalcTaskHoursVar((CalcTaskHoursVar)null);
				return;
			case ToUsePropagatorPackage.TASK__CALC_TASK_HOURS_ITEM:
				setCalcTaskHoursItem((CalcTaskHoursItem)null);
				return;
			case ToUsePropagatorPackage.TASK__CALC_TASK_RESOURCES:
				setCalcTaskResources((CalcTaskResources)null);
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
			case ToUsePropagatorPackage.TASK__START:
				return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
			case ToUsePropagatorPackage.TASK__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
			case ToUsePropagatorPackage.TASK__HOURS:
				return hours != HOURS_EDEFAULT;
			case ToUsePropagatorPackage.TASK__HOURS_ITEMS:
				return hoursItems != HOURS_ITEMS_EDEFAULT;
			case ToUsePropagatorPackage.TASK__HOURS_VAR:
				return hoursVar != HOURS_VAR_EDEFAULT;
			case ToUsePropagatorPackage.TASK__HOURS_VAR_PER_RES:
				return hoursVarPerRes != HOURS_VAR_PER_RES_EDEFAULT;
			case ToUsePropagatorPackage.TASK__DEPENDENCES_AFTER:
				return dependencesAfter != null && !dependencesAfter.isEmpty();
			case ToUsePropagatorPackage.TASK__DEPENDENCES_BEFORE:
				return dependencesBefore != null && !dependencesBefore.isEmpty();
			case ToUsePropagatorPackage.TASK__TASK_NAME:
				return TASK_NAME_EDEFAULT == null ? taskName != null : !TASK_NAME_EDEFAULT.equals(taskName);
			case ToUsePropagatorPackage.TASK__ITEMS:
				return items != null && !items.isEmpty();
			case ToUsePropagatorPackage.TASK__PROJECT:
				return getProject() != null;
			case ToUsePropagatorPackage.TASK__RESOURCE_CANDIDATES:
				return resourceCandidates != null && !resourceCandidates.isEmpty();
			case ToUsePropagatorPackage.TASK__CALC_TASK_START:
				return calcTaskStart != null;
			case ToUsePropagatorPackage.TASK__CALC_TASK_END:
				return calcTaskEnd != null;
			case ToUsePropagatorPackage.TASK__CALC_TASK_HOURS:
				return calcTaskHours != null;
			case ToUsePropagatorPackage.TASK__CALC_TASK_HOURS_VAR:
				return calcTaskHoursVar != null;
			case ToUsePropagatorPackage.TASK__CALC_TASK_HOURS_ITEM:
				return calcTaskHoursItem != null;
			case ToUsePropagatorPackage.TASK__CALC_TASK_RESOURCES:
				return calcTaskResources != null;
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
			case ToUsePropagatorPackage.TASK___REFRESH_START:
				refreshStart();
				return null;
			case ToUsePropagatorPackage.TASK___REFRESH_END:
				refreshEnd();
				return null;
			case ToUsePropagatorPackage.TASK___REFRESH_HOURS:
				refreshHours();
				return null;
			case ToUsePropagatorPackage.TASK___REFRESH_HOURS_ITEM:
				refreshHoursItem();
				return null;
			case ToUsePropagatorPackage.TASK___REFRESH_HOURS_VAR:
				refreshHoursVar();
				return null;
			case ToUsePropagatorPackage.TASK___REFRESH_RESOURCE_CANDIDATES__RESOURCE:
				refreshResourceCandidates((Resource)arguments.get(0));
				return null;
			case ToUsePropagatorPackage.TASK___REFRESH_RESOURCE_CANDIDATES:
				refreshResourceCandidates();
				return null;
			case ToUsePropagatorPackage.TASK___DISPOSE:
				dispose();
				return null;
			case ToUsePropagatorPackage.TASK___IS_CANDIDATE__RESOURCE:
				return isCandidate((Resource)arguments.get(0));
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
		result.append(" (Start: ");
		result.append(start);
		result.append(", End: ");
		result.append(end);
		result.append(", Hours: ");
		result.append(hours);
		result.append(", HoursItems: ");
		result.append(hoursItems);
		result.append(", HoursVar: ");
		result.append(hoursVar);
		result.append(", HoursVarPerRes: ");
		result.append(hoursVarPerRes);
		result.append(", TaskName: ");
		result.append(taskName);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
