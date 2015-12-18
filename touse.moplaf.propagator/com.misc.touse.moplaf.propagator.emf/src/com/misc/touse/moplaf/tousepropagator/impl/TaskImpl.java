/**
 */
package com.misc.touse.moplaf.tousepropagator.impl;

import com.misc.common.moplaf.propagator.Util;
import com.misc.touse.moplaf.tousepropagator.Dependence;
import com.misc.touse.moplaf.tousepropagator.Project;
import com.misc.touse.moplaf.tousepropagator.Resource;
import com.misc.touse.moplaf.tousepropagator.ResourceCandidate;
import com.misc.touse.moplaf.tousepropagator.Task;
import com.misc.touse.moplaf.tousepropagator.TaskItem;
import com.misc.touse.moplaf.tousepropagator.ToUsePropagatorFactory;
import com.misc.touse.moplaf.tousepropagator.ToUsePropagatorPackage;
import com.misc.touse.moplaf.tousepropagator.calc.PropagatorCalcTaskEnd;
import com.misc.touse.moplaf.tousepropagator.calc.PropagatorCalcTaskHours;
import com.misc.touse.moplaf.tousepropagator.calc.PropagatorCalcTaskHoursItems;
import com.misc.touse.moplaf.tousepropagator.calc.PropagatorCalcTaskHoursVar;
import com.misc.touse.moplaf.tousepropagator.calc.PropagatorCalcTaskResources;
import com.misc.touse.moplaf.tousepropagator.calc.PropagatorCalcTaskStart;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
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
 *   <li>{@link com.misc.touse.moplaf.tousepropagator.impl.TaskImpl#getStart <em>Start</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator.impl.TaskImpl#getEnd <em>End</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator.impl.TaskImpl#getHours <em>Hours</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator.impl.TaskImpl#getHoursItems <em>Hours Items</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator.impl.TaskImpl#getHoursVar <em>Hours Var</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator.impl.TaskImpl#getHoursVarPerRes <em>Hours Var Per Res</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator.impl.TaskImpl#getDependencesAfter <em>Dependences After</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator.impl.TaskImpl#getDependencesBefore <em>Dependences Before</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator.impl.TaskImpl#getTaskName <em>Task Name</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator.impl.TaskImpl#getItems <em>Items</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator.impl.TaskImpl#getProject <em>Project</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousepropagator.impl.TaskImpl#getResourcecandidate <em>Resourcecandidate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends MinimalEObjectImpl.Container implements Task {
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
	protected static final String TASK_NAME_EDEFAULT = null;

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
	 * The cached value of the '{@link #getResourcecandidate() <em>Resourcecandidate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourcecandidate()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceCandidate> resourcecandidate;

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
	public EList<ResourceCandidate> getResourcecandidate() {
		if (resourcecandidate == null) {
			resourcecandidate = new EObjectContainmentEList<ResourceCandidate>(ResourceCandidate.class, this, ToUsePropagatorPackage.TASK__RESOURCECANDIDATE);
		}
		return resourcecandidate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshStart() {
		Date start = new Date(Long.MAX_VALUE);
		if ( this.getProject() != null ){
			start = this.getProject().getStart();
		}
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
		float hours = project.getNofRes()*this.getHoursVarPerRes();
		this.setHoursVar(hours);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	
	private boolean isCandidate(Resource resource){
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
		ResourceCandidate toBe = ToUsePropagatorFactory.eINSTANCE.createResourceCandidate();
		toBe.setResource(resource);
		return toBe;
	}
	
	private void refreshResourceCandidatesImplUpdate(ResourceCandidate candidate) {
		float match = this.getCandidateMatch(candidate.getResource());
		candidate.setMatch(match);
	}
	
	private void refreshResourceCandidatesImplDelete(ResourceCandidate candidate) {
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
		HashMap<Resource, ResourceCandidate> candidatesAsIs = new HashMap<Resource, ResourceCandidate>();
		for ( ResourceCandidate candidateAsIs : this.getResourcecandidate()){
			Resource resource = candidateAsIs.getResource();
			if ( resource !=null){
				candidatesAsIs.put(resource, candidateAsIs);
			}
		}

		for ( Resource resource : this.getProject().getResources()){
			ResourceCandidate candidateAsIs = candidatesAsIs.remove(resource);
			ResourceCandidate candidateToBe = this.refreshResourceCandidatesImpl(candidateAsIs, resource);
			if ( candidateToBe!=null  && candidateToBe!=candidateAsIs){
				this.getResourcecandidate().add(candidateToBe);
			}
		}
		
		for ( ResourceCandidate candidateAsIs : candidatesAsIs.values()){
			this.refreshResourceCandidatesImplDelete(candidateAsIs);
		}
		
		for (  Iterator<ResourceCandidate> iterator = this.getResourcecandidate().iterator(); iterator.hasNext();){
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
		ResourceCandidate candidateAsIs = null;
		for ( ResourceCandidate candidateAsIsTmp : this.getResourcecandidate()){
			Resource resource = candidateAsIsTmp.getResource();
			if ( resource ==resourceToRefresh){
				candidateAsIs = candidateAsIsTmp;
			}
		}

		ResourceCandidate candidateToBe = this.refreshResourceCandidatesImpl(candidateAsIs, resourceToRefresh);
		if ( candidateToBe!=null  && candidateToBe!=candidateAsIs){
			this.getResourcecandidate().add(candidateToBe);
		}
		
		for (  Iterator<ResourceCandidate> iterator = this.getResourcecandidate().iterator(); iterator.hasNext();){
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
	public void addPropagatorFunctionAdapter() {
		Util.adapt(this, PropagatorCalcTaskHoursItems.class);
		Util.adapt(this, PropagatorCalcTaskHoursVar.class);
		Util.adapt(this, PropagatorCalcTaskHours.class);
		Util.adapt(this, PropagatorCalcTaskStart.class);
		Util.adapt(this, PropagatorCalcTaskResources.class);
		Util.adapt(this, PropagatorCalcTaskEnd.class);
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
			case ToUsePropagatorPackage.TASK__RESOURCECANDIDATE:
				return ((InternalEList<?>)getResourcecandidate()).basicRemove(otherEnd, msgs);
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
			case ToUsePropagatorPackage.TASK__RESOURCECANDIDATE:
				return getResourcecandidate();
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
			case ToUsePropagatorPackage.TASK__RESOURCECANDIDATE:
				getResourcecandidate().clear();
				getResourcecandidate().addAll((Collection<? extends ResourceCandidate>)newValue);
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
			case ToUsePropagatorPackage.TASK__RESOURCECANDIDATE:
				getResourcecandidate().clear();
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
			case ToUsePropagatorPackage.TASK__RESOURCECANDIDATE:
				return resourcecandidate != null && !resourcecandidate.isEmpty();
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
			case ToUsePropagatorPackage.TASK___ADD_PROPAGATOR_FUNCTION_ADAPTER:
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
