/**
 */
package com.misc.tools.moplaf.model.overview.impl;

import com.misc.tools.moplaf.model.overview.ModelOverviewFactory;
import com.misc.tools.moplaf.model.overview.ModelOverviewPackage;
import com.misc.tools.moplaf.model.overview.OverviewObject;
import com.misc.tools.moplaf.model.overview.Overviews;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Overviews</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.tools.moplaf.model.overview.impl.OverviewsImpl#getRootObjects <em>Root Objects</em>}</li>
 *   <li>{@link com.misc.tools.moplaf.model.overview.impl.OverviewsImpl#getSubOverviews <em>Sub Overviews</em>}</li>
 *   <li>{@link com.misc.tools.moplaf.model.overview.impl.OverviewsImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.tools.moplaf.model.overview.impl.OverviewsImpl#getRemarks <em>Remarks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OverviewsImpl extends MinimalEObjectImpl.Container implements Overviews {
	/**
	 * The cached value of the '{@link #getRootObjects() <em>Root Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<OverviewObject> rootObjects;

	/**
	 * The cached value of the '{@link #getSubOverviews() <em>Sub Overviews</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubOverviews()
	 * @generated
	 * @ordered
	 */
	protected EList<Overviews> subOverviews;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	protected OverviewsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelOverviewPackage.Literals.OVERVIEWS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OverviewObject> getRootObjects() {
		if (rootObjects == null) {
			rootObjects = new EObjectContainmentEList<OverviewObject>(OverviewObject.class, this, ModelOverviewPackage.OVERVIEWS__ROOT_OBJECTS);
		}
		return rootObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Overviews> getSubOverviews() {
		if (subOverviews == null) {
			subOverviews = new EObjectContainmentEList<Overviews>(Overviews.class, this, ModelOverviewPackage.OVERVIEWS__SUB_OVERVIEWS);
		}
		return subOverviews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelOverviewPackage.OVERVIEWS__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelOverviewPackage.OVERVIEWS__REMARKS, oldRemarks, remarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addObject(EObject root) {
		OverviewObject overview = ModelOverviewFactory.eINSTANCE.createOverviewObject();
		this.getRootObjects().add(overview); // owning
		overview.setRootObject(root);;
		overview.refresh();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelOverviewPackage.OVERVIEWS__ROOT_OBJECTS:
				return ((InternalEList<?>)getRootObjects()).basicRemove(otherEnd, msgs);
			case ModelOverviewPackage.OVERVIEWS__SUB_OVERVIEWS:
				return ((InternalEList<?>)getSubOverviews()).basicRemove(otherEnd, msgs);
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
			case ModelOverviewPackage.OVERVIEWS__ROOT_OBJECTS:
				return getRootObjects();
			case ModelOverviewPackage.OVERVIEWS__SUB_OVERVIEWS:
				return getSubOverviews();
			case ModelOverviewPackage.OVERVIEWS__NAME:
				return getName();
			case ModelOverviewPackage.OVERVIEWS__REMARKS:
				return getRemarks();
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
			case ModelOverviewPackage.OVERVIEWS__ROOT_OBJECTS:
				getRootObjects().clear();
				getRootObjects().addAll((Collection<? extends OverviewObject>)newValue);
				return;
			case ModelOverviewPackage.OVERVIEWS__SUB_OVERVIEWS:
				getSubOverviews().clear();
				getSubOverviews().addAll((Collection<? extends Overviews>)newValue);
				return;
			case ModelOverviewPackage.OVERVIEWS__NAME:
				setName((String)newValue);
				return;
			case ModelOverviewPackage.OVERVIEWS__REMARKS:
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
			case ModelOverviewPackage.OVERVIEWS__ROOT_OBJECTS:
				getRootObjects().clear();
				return;
			case ModelOverviewPackage.OVERVIEWS__SUB_OVERVIEWS:
				getSubOverviews().clear();
				return;
			case ModelOverviewPackage.OVERVIEWS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelOverviewPackage.OVERVIEWS__REMARKS:
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
			case ModelOverviewPackage.OVERVIEWS__ROOT_OBJECTS:
				return rootObjects != null && !rootObjects.isEmpty();
			case ModelOverviewPackage.OVERVIEWS__SUB_OVERVIEWS:
				return subOverviews != null && !subOverviews.isEmpty();
			case ModelOverviewPackage.OVERVIEWS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelOverviewPackage.OVERVIEWS__REMARKS:
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
			case ModelOverviewPackage.OVERVIEWS___ADD_OBJECT__EOBJECT:
				addObject((EObject)arguments.get(0));
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", Remarks: ");
		result.append(remarks);
		result.append(')');
		return result.toString();
	}

} //OverviewsImpl
