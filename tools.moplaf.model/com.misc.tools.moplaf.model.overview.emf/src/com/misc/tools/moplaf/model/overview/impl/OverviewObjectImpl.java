/**
 */
package com.misc.tools.moplaf.model.overview.impl;

import com.misc.tools.moplaf.model.overview.ModelOverviewFactory;
import com.misc.tools.moplaf.model.overview.ModelOverviewPackage;
import com.misc.tools.moplaf.model.overview.OverviewCount;
import com.misc.tools.moplaf.model.overview.OverviewObject;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Overview Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.tools.moplaf.model.overview.impl.OverviewObjectImpl#getRootObject <em>Root Object</em>}</li>
 *   <li>{@link com.misc.tools.moplaf.model.overview.impl.OverviewObjectImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link com.misc.tools.moplaf.model.overview.impl.OverviewObjectImpl#getCount <em>Count</em>}</li>
 *   <li>{@link com.misc.tools.moplaf.model.overview.impl.OverviewObjectImpl#getOverviewCounts <em>Overview Counts</em>}</li>
 *   <li>{@link com.misc.tools.moplaf.model.overview.impl.OverviewObjectImpl#getRootOverviewCounts <em>Root Overview Counts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OverviewObjectImpl extends MinimalEObjectImpl.Container implements OverviewObject {
	/**
	 * The cached value of the '{@link #getRootObject() <em>Root Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootObject()
	 * @generated
	 * @ordered
	 */
	protected EObject rootObject;

	/**
	 * The default value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected static final String REMARKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected String remarks = REMARKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected int count = COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOverviewCounts() <em>Overview Counts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverviewCounts()
	 * @generated
	 * @ordered
	 */
	protected EList<OverviewCount> overviewCounts;

	/**
	 * The cached value of the '{@link #getRootOverviewCounts() <em>Root Overview Counts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootOverviewCounts()
	 * @generated
	 * @ordered
	 */
	protected EList<OverviewCount> rootOverviewCounts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OverviewObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelOverviewPackage.Literals.OVERVIEW_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getRootObject() {
		if (rootObject != null && rootObject.eIsProxy()) {
			InternalEObject oldRootObject = (InternalEObject)rootObject;
			rootObject = eResolveProxy(oldRootObject);
			if (rootObject != oldRootObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelOverviewPackage.OVERVIEW_OBJECT__ROOT_OBJECT, oldRootObject, rootObject));
			}
		}
		return rootObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetRootObject() {
		return rootObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootObject(EObject newRootObject) {
		EObject oldRootObject = rootObject;
		rootObject = newRootObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelOverviewPackage.OVERVIEW_OBJECT__ROOT_OBJECT, oldRootObject, rootObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemarks(String newRemarks) {
		String oldRemarks = remarks;
		remarks = newRemarks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelOverviewPackage.OVERVIEW_OBJECT__REMARKS, oldRemarks, remarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(int newCount) {
		int oldCount = count;
		count = newCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelOverviewPackage.OVERVIEW_OBJECT__COUNT, oldCount, count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OverviewCount> getOverviewCounts() {
		if (overviewCounts == null) {
			overviewCounts = new EObjectContainmentEList<OverviewCount>(OverviewCount.class, this, ModelOverviewPackage.OVERVIEW_OBJECT__OVERVIEW_COUNTS);
		}
		return overviewCounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OverviewCount> getRootOverviewCounts() {
		if (rootOverviewCounts == null) {
			rootOverviewCounts = new EObjectResolvingEList<OverviewCount>(OverviewCount.class, this, ModelOverviewPackage.OVERVIEW_OBJECT__ROOT_OVERVIEW_COUNTS);
		}
		return rootOverviewCounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refresh() {
		// flush
		this.getOverviewCounts().clear();
		this.getRootOverviewCounts().clear();
		this.setCount(0);
		// fill
		EObject rootObject = this.getRootObject();
		if ( rootObject == null ) { return; }
		TreeIterator<EObject> tree_iterator = rootObject.eAllContents();
		// and it is gone
		RefreshContext context = new RefreshContext(); 
		while ( tree_iterator.hasNext()){
			this.bookInstance(context, tree_iterator.next());
		}
	}
	
	private class RefreshContext{
		private HashMap<EClass, OverviewCount> classes = new HashMap<EClass, OverviewCount>(); 
	}
	
	/**
	 * 
	 * @param context
	 * @param anEClass
	 * @return
	 */
	private OverviewCount getOrCreateOverviewCount(RefreshContext context, EClass anEClass){
		OverviewCount count = context.classes.get(anEClass);
		if ( count == null){
			count = ModelOverviewFactory.eINSTANCE.createOverviewCount();
			this.getOverviewCounts().add(count);
			count.setClass(anEClass); //owning
			context.classes.put(anEClass, count);
			for (EClass superType : anEClass.getESuperTypes()){
				OverviewCount supercount = this.getOrCreateOverviewCount(context, superType);
				count.getSuperTypes().add(supercount);
			}
		}
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	private void bookInstance(RefreshContext context, EObject instance) {
		EClass instace_class = instance.eClass();
		EList<EClass> all_super_types = instace_class.getEAllSuperTypes();
		for ( EClass super_type : all_super_types){
			OverviewCount count = this.getOrCreateOverviewCount(context, super_type);
			count.setCount(count.getCount()+1);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelOverviewPackage.OVERVIEW_OBJECT__OVERVIEW_COUNTS:
				return ((InternalEList<?>)getOverviewCounts()).basicRemove(otherEnd, msgs);
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
			case ModelOverviewPackage.OVERVIEW_OBJECT__ROOT_OBJECT:
				if (resolve) return getRootObject();
				return basicGetRootObject();
			case ModelOverviewPackage.OVERVIEW_OBJECT__REMARKS:
				return getRemarks();
			case ModelOverviewPackage.OVERVIEW_OBJECT__COUNT:
				return getCount();
			case ModelOverviewPackage.OVERVIEW_OBJECT__OVERVIEW_COUNTS:
				return getOverviewCounts();
			case ModelOverviewPackage.OVERVIEW_OBJECT__ROOT_OVERVIEW_COUNTS:
				return getRootOverviewCounts();
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
			case ModelOverviewPackage.OVERVIEW_OBJECT__ROOT_OBJECT:
				setRootObject((EObject)newValue);
				return;
			case ModelOverviewPackage.OVERVIEW_OBJECT__REMARKS:
				setRemarks((String)newValue);
				return;
			case ModelOverviewPackage.OVERVIEW_OBJECT__COUNT:
				setCount((Integer)newValue);
				return;
			case ModelOverviewPackage.OVERVIEW_OBJECT__OVERVIEW_COUNTS:
				getOverviewCounts().clear();
				getOverviewCounts().addAll((Collection<? extends OverviewCount>)newValue);
				return;
			case ModelOverviewPackage.OVERVIEW_OBJECT__ROOT_OVERVIEW_COUNTS:
				getRootOverviewCounts().clear();
				getRootOverviewCounts().addAll((Collection<? extends OverviewCount>)newValue);
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
			case ModelOverviewPackage.OVERVIEW_OBJECT__ROOT_OBJECT:
				setRootObject((EObject)null);
				return;
			case ModelOverviewPackage.OVERVIEW_OBJECT__REMARKS:
				setRemarks(REMARKS_EDEFAULT);
				return;
			case ModelOverviewPackage.OVERVIEW_OBJECT__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
			case ModelOverviewPackage.OVERVIEW_OBJECT__OVERVIEW_COUNTS:
				getOverviewCounts().clear();
				return;
			case ModelOverviewPackage.OVERVIEW_OBJECT__ROOT_OVERVIEW_COUNTS:
				getRootOverviewCounts().clear();
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
			case ModelOverviewPackage.OVERVIEW_OBJECT__ROOT_OBJECT:
				return rootObject != null;
			case ModelOverviewPackage.OVERVIEW_OBJECT__REMARKS:
				return REMARKS_EDEFAULT == null ? remarks != null : !REMARKS_EDEFAULT.equals(remarks);
			case ModelOverviewPackage.OVERVIEW_OBJECT__COUNT:
				return count != COUNT_EDEFAULT;
			case ModelOverviewPackage.OVERVIEW_OBJECT__OVERVIEW_COUNTS:
				return overviewCounts != null && !overviewCounts.isEmpty();
			case ModelOverviewPackage.OVERVIEW_OBJECT__ROOT_OVERVIEW_COUNTS:
				return rootOverviewCounts != null && !rootOverviewCounts.isEmpty();
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
			case ModelOverviewPackage.OVERVIEW_OBJECT___REFRESH:
				refresh();
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
		result.append(" (Remarks: ");
		result.append(remarks);
		result.append(", Count: ");
		result.append(count);
		result.append(')');
		return result.toString();
	}

} //OverviewObjectImpl
