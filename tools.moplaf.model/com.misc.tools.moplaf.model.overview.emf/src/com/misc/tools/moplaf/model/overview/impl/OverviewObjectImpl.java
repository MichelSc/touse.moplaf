/**
 */
package com.misc.tools.moplaf.model.overview.impl;

import com.misc.tools.moplaf.model.overview.ModelOverviewFactory;
import com.misc.tools.moplaf.model.overview.ModelOverviewPackage;
import com.misc.tools.moplaf.model.overview.OverviewCount;
import com.misc.tools.moplaf.model.overview.OverviewObject;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 * </ul>
 *
 * @generated
 */
public class OverviewObjectImpl extends OverviewCountImpl implements OverviewObject {
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
	 */
	public void refresh() {
		// flush
		this.getSubTypes().clear();
		this.setCount(0);
		this.setClass(null);
		// fill
		EObject rootObject = this.getRootObject();
		if ( rootObject == null ) { return; }
		TreeIterator<EObject> tree_iterator = rootObject.eAllContents();
		while ( tree_iterator.hasNext()){
			this.bookInstance(tree_iterator.next());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void bookInstance(EObject instance) {
		// gather the class hierarchy
		EClass current_class = instance.eClass();
		LinkedList<EClass> hierarchy = new LinkedList<EClass>();
		while  ( current_class != null){
			hierarchy.addFirst(current_class);
			current_class = current_class.getESuperTypes().size()>0
					      ? current_class.getESuperTypes().get(0)
					      : null;
		} 
		OverviewCount current_count = this;
		current_count.setCount(current_count.getCount()+1);
		Iterator<EClass> iterator = hierarchy.iterator();
		while ( iterator.hasNext()){
			// get or create count
			EClass currentClass = iterator.next();
			OverviewCount subcount = null;
			for( OverviewCount current_subcount : this.getSubTypes()){
				if ( current_subcount.eClass()==currentClass){ 
					subcount = current_subcount;
					break; 
				}
			}
			if ( subcount == null ){
				subcount = ModelOverviewFactory.eINSTANCE.createOverviewCount();
				subcount.setClass(currentClass);
			}
			// update the subcount
			subcount.setCount(subcount.getCount()+1);
			// loop control
			current_count = subcount;
		}
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
			case ModelOverviewPackage.OVERVIEW_OBJECT__ROOT_OBJECT:
				setRootObject((EObject)newValue);
				return;
			case ModelOverviewPackage.OVERVIEW_OBJECT__REMARKS:
				setRemarks((String)newValue);
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
			case ModelOverviewPackage.OVERVIEW_OBJECT___BOOK_INSTANCE__EOBJECT:
				bookInstance((EObject)arguments.get(0));
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
		result.append(')');
		return result.toString();
	}

} //OverviewObjectImpl
