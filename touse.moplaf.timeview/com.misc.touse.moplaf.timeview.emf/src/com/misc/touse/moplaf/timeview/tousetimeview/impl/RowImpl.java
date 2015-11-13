/**
 */
package com.misc.touse.moplaf.timeview.tousetimeview.impl;

import com.misc.touse.moplaf.timeview.tousetimeview.Node;
import com.misc.touse.moplaf.timeview.tousetimeview.Row;
import com.misc.touse.moplaf.timeview.tousetimeview.TousetimeviewPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.timeview.tousetimeview.impl.RowImpl#getSubRows <em>Sub Rows</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeview.tousetimeview.impl.RowImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeview.tousetimeview.impl.RowImpl#getText <em>Text</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeview.tousetimeview.impl.RowImpl#getForeground <em>Foreground</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeview.tousetimeview.impl.RowImpl#getBackground <em>Background</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RowImpl extends MinimalEObjectImpl.Container implements Row {
	/**
	 * The cached value of the '{@link #getSubRows() <em>Sub Rows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubRows()
	 * @generated
	 * @ordered
	 */
	protected EList<Row> subRows;

	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getForeground() <em>Foreground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeground()
	 * @generated
	 * @ordered
	 */
	protected static final int FOREGROUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getForeground() <em>Foreground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeground()
	 * @generated
	 * @ordered
	 */
	protected int foreground = FOREGROUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected static final int BACKGROUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected int background = BACKGROUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TousetimeviewPackage.Literals.ROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Row> getSubRows() {
		if (subRows == null) {
			subRows = new EObjectContainmentEList<Row>(Row.class, this, TousetimeviewPackage.ROW__SUB_ROWS);
		}
		return subRows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<Node>(Node.class, this, TousetimeviewPackage.ROW__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TousetimeviewPackage.ROW__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getForeground() {
		return foreground;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeground(int newForeground) {
		int oldForeground = foreground;
		foreground = newForeground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TousetimeviewPackage.ROW__FOREGROUND, oldForeground, foreground));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBackground() {
		return background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackground(int newBackground) {
		int oldBackground = background;
		background = newBackground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TousetimeviewPackage.ROW__BACKGROUND, oldBackground, background));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TousetimeviewPackage.ROW__SUB_ROWS:
				return ((InternalEList<?>)getSubRows()).basicRemove(otherEnd, msgs);
			case TousetimeviewPackage.ROW__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
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
			case TousetimeviewPackage.ROW__SUB_ROWS:
				return getSubRows();
			case TousetimeviewPackage.ROW__NODES:
				return getNodes();
			case TousetimeviewPackage.ROW__TEXT:
				return getText();
			case TousetimeviewPackage.ROW__FOREGROUND:
				return getForeground();
			case TousetimeviewPackage.ROW__BACKGROUND:
				return getBackground();
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
			case TousetimeviewPackage.ROW__SUB_ROWS:
				getSubRows().clear();
				getSubRows().addAll((Collection<? extends Row>)newValue);
				return;
			case TousetimeviewPackage.ROW__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case TousetimeviewPackage.ROW__TEXT:
				setText((String)newValue);
				return;
			case TousetimeviewPackage.ROW__FOREGROUND:
				setForeground((Integer)newValue);
				return;
			case TousetimeviewPackage.ROW__BACKGROUND:
				setBackground((Integer)newValue);
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
			case TousetimeviewPackage.ROW__SUB_ROWS:
				getSubRows().clear();
				return;
			case TousetimeviewPackage.ROW__NODES:
				getNodes().clear();
				return;
			case TousetimeviewPackage.ROW__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case TousetimeviewPackage.ROW__FOREGROUND:
				setForeground(FOREGROUND_EDEFAULT);
				return;
			case TousetimeviewPackage.ROW__BACKGROUND:
				setBackground(BACKGROUND_EDEFAULT);
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
			case TousetimeviewPackage.ROW__SUB_ROWS:
				return subRows != null && !subRows.isEmpty();
			case TousetimeviewPackage.ROW__NODES:
				return nodes != null && !nodes.isEmpty();
			case TousetimeviewPackage.ROW__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case TousetimeviewPackage.ROW__FOREGROUND:
				return foreground != FOREGROUND_EDEFAULT;
			case TousetimeviewPackage.ROW__BACKGROUND:
				return background != BACKGROUND_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (Text: ");
		result.append(text);
		result.append(", Foreground: ");
		result.append(foreground);
		result.append(", Background: ");
		result.append(background);
		result.append(')');
		return result.toString();
	}

} //RowImpl
