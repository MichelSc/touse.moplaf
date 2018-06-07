/**
 */
package com.misc.touse.moplaf.timeview.tousetimeview.impl;

import com.misc.common.moplaf.common.Plugin;
import com.misc.touse.moplaf.timeview.tousetimeview.Node;
import com.misc.touse.moplaf.timeview.tousetimeview.ToUseTimeViewPackage;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.timeview.tousetimeview.impl.NodeImpl#getText <em>Text</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeview.tousetimeview.impl.NodeImpl#getForeground <em>Foreground</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeview.tousetimeview.impl.NodeImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeview.tousetimeview.impl.NodeImpl#getStart <em>Start</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeview.tousetimeview.impl.NodeImpl#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends MinimalEObjectImpl.Container implements Node {
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
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_EDEFAULT = null;

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
	protected static final Date END_EDEFAULT = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseTimeViewPackage.Literals.NODE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseTimeViewPackage.NODE__TEXT, oldText, text));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseTimeViewPackage.NODE__FOREGROUND, oldForeground, foreground));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseTimeViewPackage.NODE__BACKGROUND, oldBackground, background));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseTimeViewPackage.NODE__START, oldStart, start));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseTimeViewPackage.NODE__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void doTest() {
		Plugin.INSTANCE.logInfo(String.format("Node.doTest called, target=%s", this.getText()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void doDragAndDrop(Node droppedObject) {
		Plugin.INSTANCE.logInfo(String.format("Node.doDragAndDrop called, target=%s, source=%s", this.getText(), droppedObject.getText()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void doDragAndDrop(EList<Node> droppedObjects) {
		String source = droppedObjects.stream().map(o -> o.getText()).collect(Collectors.joining(", "));
		Plugin.INSTANCE.logInfo(String.format("Node.doDragAndDrop called, target=%s, source=%s", this.getText(), source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUseTimeViewPackage.NODE__TEXT:
				return getText();
			case ToUseTimeViewPackage.NODE__FOREGROUND:
				return getForeground();
			case ToUseTimeViewPackage.NODE__BACKGROUND:
				return getBackground();
			case ToUseTimeViewPackage.NODE__START:
				return getStart();
			case ToUseTimeViewPackage.NODE__END:
				return getEnd();
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
			case ToUseTimeViewPackage.NODE__TEXT:
				setText((String)newValue);
				return;
			case ToUseTimeViewPackage.NODE__FOREGROUND:
				setForeground((Integer)newValue);
				return;
			case ToUseTimeViewPackage.NODE__BACKGROUND:
				setBackground((Integer)newValue);
				return;
			case ToUseTimeViewPackage.NODE__START:
				setStart((Date)newValue);
				return;
			case ToUseTimeViewPackage.NODE__END:
				setEnd((Date)newValue);
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
			case ToUseTimeViewPackage.NODE__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case ToUseTimeViewPackage.NODE__FOREGROUND:
				setForeground(FOREGROUND_EDEFAULT);
				return;
			case ToUseTimeViewPackage.NODE__BACKGROUND:
				setBackground(BACKGROUND_EDEFAULT);
				return;
			case ToUseTimeViewPackage.NODE__START:
				setStart(START_EDEFAULT);
				return;
			case ToUseTimeViewPackage.NODE__END:
				setEnd(END_EDEFAULT);
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
			case ToUseTimeViewPackage.NODE__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case ToUseTimeViewPackage.NODE__FOREGROUND:
				return foreground != FOREGROUND_EDEFAULT;
			case ToUseTimeViewPackage.NODE__BACKGROUND:
				return background != BACKGROUND_EDEFAULT;
			case ToUseTimeViewPackage.NODE__START:
				return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
			case ToUseTimeViewPackage.NODE__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ToUseTimeViewPackage.NODE___DO_TEST:
				doTest();
				return null;
			case ToUseTimeViewPackage.NODE___DO_DRAG_AND_DROP__NODE:
				doDragAndDrop((Node)arguments.get(0));
				return null;
			case ToUseTimeViewPackage.NODE___DO_DRAG_AND_DROP__ELIST:
				doDragAndDrop((EList<Node>)arguments.get(0));
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
		result.append(" (Text: ");
		result.append(text);
		result.append(", Foreground: ");
		result.append(foreground);
		result.append(", Background: ");
		result.append(background);
		result.append(", Start: ");
		result.append(start);
		result.append(", End: ");
		result.append(end);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
