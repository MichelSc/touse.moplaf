/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline.impl;


import com.misc.common.moplaf.time.continuous.impl.DistributionImpl;
import com.misc.touse.moplaf.timeline.tousetimeline.DomainDistribution;
import com.misc.touse.moplaf.timeline.tousetimeline.FunctionInterval;
import com.misc.touse.moplaf.timeline.tousetimeline.FunctionPossible;
import com.misc.touse.moplaf.timeline.tousetimeline.ToUseTimeLinePackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Distribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.DomainDistributionImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.DomainDistributionImpl#getColor <em>Color</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.DomainDistributionImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.DomainDistributionImpl#getPossibles <em>Possibles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainDistributionImpl extends DistributionImpl implements DomainDistribution {
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
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final int COLOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected int color = COLOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionInterval> functions;

	/**
	 * The cached value of the '{@link #getPossibles() <em>Possibles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibles()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionPossible> possibles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainDistributionImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseTimeLinePackage.Literals.DOMAIN_DISTRIBUTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseTimeLinePackage.DOMAIN_DISTRIBUTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColor() {
		return color;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(int newColor) {
		int oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseTimeLinePackage.DOMAIN_DISTRIBUTION__COLOR, oldColor, color));
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionInterval> getFunctions() {
		if (functions == null) {
			functions = new EObjectContainmentWithInverseEList<FunctionInterval>(FunctionInterval.class, this, ToUseTimeLinePackage.DOMAIN_DISTRIBUTION__FUNCTIONS, ToUseTimeLinePackage.FUNCTION_INTERVAL__DISTRIBUTION);
		}
		return functions;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionPossible> getPossibles() {
		if (possibles == null) {
			possibles = new EObjectContainmentWithInverseEList<FunctionPossible>(FunctionPossible.class, this, ToUseTimeLinePackage.DOMAIN_DISTRIBUTION__POSSIBLES, ToUseTimeLinePackage.FUNCTION_POSSIBLE__DISTRIBUTION);
		}
		return possibles;
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
			case ToUseTimeLinePackage.DOMAIN_DISTRIBUTION__FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFunctions()).basicAdd(otherEnd, msgs);
			case ToUseTimeLinePackage.DOMAIN_DISTRIBUTION__POSSIBLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPossibles()).basicAdd(otherEnd, msgs);
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
			case ToUseTimeLinePackage.DOMAIN_DISTRIBUTION__FUNCTIONS:
				return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
			case ToUseTimeLinePackage.DOMAIN_DISTRIBUTION__POSSIBLES:
				return ((InternalEList<?>)getPossibles()).basicRemove(otherEnd, msgs);
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
			case ToUseTimeLinePackage.DOMAIN_DISTRIBUTION__NAME:
				return getName();
			case ToUseTimeLinePackage.DOMAIN_DISTRIBUTION__COLOR:
				return getColor();
			case ToUseTimeLinePackage.DOMAIN_DISTRIBUTION__FUNCTIONS:
				return getFunctions();
			case ToUseTimeLinePackage.DOMAIN_DISTRIBUTION__POSSIBLES:
				return getPossibles();
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
			case ToUseTimeLinePackage.DOMAIN_DISTRIBUTION__NAME:
				setName((String)newValue);
				return;
			case ToUseTimeLinePackage.DOMAIN_DISTRIBUTION__COLOR:
				setColor((Integer)newValue);
				return;
			case ToUseTimeLinePackage.DOMAIN_DISTRIBUTION__FUNCTIONS:
				getFunctions().clear();
				getFunctions().addAll((Collection<? extends FunctionInterval>)newValue);
				return;
			case ToUseTimeLinePackage.DOMAIN_DISTRIBUTION__POSSIBLES:
				getPossibles().clear();
				getPossibles().addAll((Collection<? extends FunctionPossible>)newValue);
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
			case ToUseTimeLinePackage.DOMAIN_DISTRIBUTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ToUseTimeLinePackage.DOMAIN_DISTRIBUTION__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case ToUseTimeLinePackage.DOMAIN_DISTRIBUTION__FUNCTIONS:
				getFunctions().clear();
				return;
			case ToUseTimeLinePackage.DOMAIN_DISTRIBUTION__POSSIBLES:
				getPossibles().clear();
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
			case ToUseTimeLinePackage.DOMAIN_DISTRIBUTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ToUseTimeLinePackage.DOMAIN_DISTRIBUTION__COLOR:
				return color != COLOR_EDEFAULT;
			case ToUseTimeLinePackage.DOMAIN_DISTRIBUTION__FUNCTIONS:
				return functions != null && !functions.isEmpty();
			case ToUseTimeLinePackage.DOMAIN_DISTRIBUTION__POSSIBLES:
				return possibles != null && !possibles.isEmpty();
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", Color: ");
		result.append(color);
		result.append(')');
		return result.toString();
	}

} //DomainDistributionImpl
