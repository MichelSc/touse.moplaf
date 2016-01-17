/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline.impl;

import com.mis.touse.moplaf.timeline.tousetimeline.calc.PropagatorLayerDomainDistributionFunctions;
import com.mis.touse.moplaf.timeline.tousetimeline.calc.PropagatorScopeDomainDistribution;
import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.impl.DistributionImpl;
import com.misc.touse.moplaf.timeline.tousetimeline.DomainDistribution;
import com.misc.touse.moplaf.timeline.tousetimeline.FunctionMinimum;
import com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage;

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
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.DomainDistributionImpl#getCalcs <em>Calcs</em>}</li>
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
	 * The cached value of the '{@link #getCalcs() <em>Calcs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalcs()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionMinimum> calcs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainDistributionImpl() {
		super();
	}
	
	

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.time.continuous.impl.DistributionImpl#addPropagatorFunctionAdapter()
	 */
	@Override
	public void addPropagatorFunctionAdapter() {
		super.addPropagatorFunctionAdapter();
		Util.adapt(this, PropagatorScopeDomainDistribution.class);
		Util.adapt(this, PropagatorLayerDomainDistributionFunctions.class);
		
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TousetimelinePackage.Literals.DOMAIN_DISTRIBUTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TousetimelinePackage.DOMAIN_DISTRIBUTION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TousetimelinePackage.DOMAIN_DISTRIBUTION__COLOR, oldColor, color));
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionMinimum> getCalcs() {
		if (calcs == null) {
			calcs = new EObjectContainmentWithInverseEList<FunctionMinimum>(FunctionMinimum.class, this, TousetimelinePackage.DOMAIN_DISTRIBUTION__CALCS, TousetimelinePackage.FUNCTION_MINIMUM__DISTRIBUTION);
		}
		return calcs;
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
			case TousetimelinePackage.DOMAIN_DISTRIBUTION__CALCS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCalcs()).basicAdd(otherEnd, msgs);
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
			case TousetimelinePackage.DOMAIN_DISTRIBUTION__CALCS:
				return ((InternalEList<?>)getCalcs()).basicRemove(otherEnd, msgs);
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
			case TousetimelinePackage.DOMAIN_DISTRIBUTION__NAME:
				return getName();
			case TousetimelinePackage.DOMAIN_DISTRIBUTION__COLOR:
				return getColor();
			case TousetimelinePackage.DOMAIN_DISTRIBUTION__CALCS:
				return getCalcs();
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
			case TousetimelinePackage.DOMAIN_DISTRIBUTION__NAME:
				setName((String)newValue);
				return;
			case TousetimelinePackage.DOMAIN_DISTRIBUTION__COLOR:
				setColor((Integer)newValue);
				return;
			case TousetimelinePackage.DOMAIN_DISTRIBUTION__CALCS:
				getCalcs().clear();
				getCalcs().addAll((Collection<? extends FunctionMinimum>)newValue);
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
			case TousetimelinePackage.DOMAIN_DISTRIBUTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TousetimelinePackage.DOMAIN_DISTRIBUTION__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case TousetimelinePackage.DOMAIN_DISTRIBUTION__CALCS:
				getCalcs().clear();
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
			case TousetimelinePackage.DOMAIN_DISTRIBUTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TousetimelinePackage.DOMAIN_DISTRIBUTION__COLOR:
				return color != COLOR_EDEFAULT;
			case TousetimelinePackage.DOMAIN_DISTRIBUTION__CALCS:
				return calcs != null && !calcs.isEmpty();
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
