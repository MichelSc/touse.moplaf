/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline.impl;

import com.mis.touse.moplaf.timeline.tousetimeline.calc.PropagatorScopeDomain;
import com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorPackage;
import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.CapacityChange;
import com.misc.common.moplaf.time.continuous.StockChange;
import com.misc.common.moplaf.time.discrete.TimeLineMerge;
import com.misc.touse.moplaf.timeline.tousetimeline.Domain;
import com.misc.touse.moplaf.timeline.tousetimeline.DomainDistribution;
import com.misc.touse.moplaf.timeline.tousetimeline.DomainTimeLine;
import com.misc.touse.moplaf.timeline.tousetimeline.ToUseAmountAbsolute;
import com.misc.touse.moplaf.timeline.tousetimeline.ToUseAmountImpulsion;
import com.misc.touse.moplaf.timeline.tousetimeline.ToUseSlopeAbsolute;
import com.misc.touse.moplaf.timeline.tousetimeline.ToUseSlopeImpulsion;
import com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage;

import java.lang.reflect.InvocationTargetException;
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
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.DomainImpl#getTimeLine <em>Time Line</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.DomainImpl#getTimeLineMerge <em>Time Line Merge</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.DomainImpl#getAmountImpulsion <em>Amount Impulsion</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.DomainImpl#getAmountAbsolute <em>Amount Absolute</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.DomainImpl#getSlopeAbsolute <em>Slope Absolute</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.DomainImpl#getSlopeImpulsion <em>Slope Impulsion</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.DomainImpl#getCapacityChange <em>Capacity Change</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.DomainImpl#getStockChange <em>Stock Change</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.DomainImpl#getDistribution <em>Distribution</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.timeline.tousetimeline.impl.DomainImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainImpl extends MinimalEObjectImpl.Container implements Domain {
	/**
	 * The cached value of the '{@link #getTimeLine() <em>Time Line</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeLine()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainTimeLine> timeLine;

	/**
	 * The cached value of the '{@link #getTimeLineMerge() <em>Time Line Merge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeLineMerge()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeLineMerge> timeLineMerge;

	/**
	 * The cached value of the '{@link #getAmountImpulsion() <em>Amount Impulsion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountImpulsion()
	 * @generated
	 * @ordered
	 */
	protected EList<ToUseAmountImpulsion> amountImpulsion;

	/**
	 * The cached value of the '{@link #getAmountAbsolute() <em>Amount Absolute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountAbsolute()
	 * @generated
	 * @ordered
	 */
	protected EList<ToUseAmountAbsolute> amountAbsolute;

	/**
	 * The cached value of the '{@link #getSlopeAbsolute() <em>Slope Absolute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlopeAbsolute()
	 * @generated
	 * @ordered
	 */
	protected EList<ToUseSlopeAbsolute> slopeAbsolute;

	/**
	 * The cached value of the '{@link #getSlopeImpulsion() <em>Slope Impulsion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlopeImpulsion()
	 * @generated
	 * @ordered
	 */
	protected EList<ToUseSlopeImpulsion> slopeImpulsion;

	/**
	 * The cached value of the '{@link #getCapacityChange() <em>Capacity Change</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityChange()
	 * @generated
	 * @ordered
	 */
	protected EList<CapacityChange> capacityChange;

	/**
	 * The cached value of the '{@link #getStockChange() <em>Stock Change</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStockChange()
	 * @generated
	 * @ordered
	 */
	protected EList<StockChange> stockChange;

	/**
	 * The cached value of the '{@link #getDistribution() <em>Distribution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainDistribution> distribution;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TousetimelinePackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainTimeLine> getTimeLine() {
		if (timeLine == null) {
			timeLine = new EObjectContainmentEList<DomainTimeLine>(DomainTimeLine.class, this, TousetimelinePackage.DOMAIN__TIME_LINE);
		}
		return timeLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeLineMerge> getTimeLineMerge() {
		if (timeLineMerge == null) {
			timeLineMerge = new EObjectContainmentEList<TimeLineMerge>(TimeLineMerge.class, this, TousetimelinePackage.DOMAIN__TIME_LINE_MERGE);
		}
		return timeLineMerge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ToUseAmountImpulsion> getAmountImpulsion() {
		if (amountImpulsion == null) {
			amountImpulsion = new EObjectContainmentEList<ToUseAmountImpulsion>(ToUseAmountImpulsion.class, this, TousetimelinePackage.DOMAIN__AMOUNT_IMPULSION);
		}
		return amountImpulsion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ToUseAmountAbsolute> getAmountAbsolute() {
		if (amountAbsolute == null) {
			amountAbsolute = new EObjectContainmentEList<ToUseAmountAbsolute>(ToUseAmountAbsolute.class, this, TousetimelinePackage.DOMAIN__AMOUNT_ABSOLUTE);
		}
		return amountAbsolute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ToUseSlopeAbsolute> getSlopeAbsolute() {
		if (slopeAbsolute == null) {
			slopeAbsolute = new EObjectContainmentEList<ToUseSlopeAbsolute>(ToUseSlopeAbsolute.class, this, TousetimelinePackage.DOMAIN__SLOPE_ABSOLUTE);
		}
		return slopeAbsolute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ToUseSlopeImpulsion> getSlopeImpulsion() {
		if (slopeImpulsion == null) {
			slopeImpulsion = new EObjectContainmentEList<ToUseSlopeImpulsion>(ToUseSlopeImpulsion.class, this, TousetimelinePackage.DOMAIN__SLOPE_IMPULSION);
		}
		return slopeImpulsion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapacityChange> getCapacityChange() {
		if (capacityChange == null) {
			capacityChange = new EObjectContainmentEList<CapacityChange>(CapacityChange.class, this, TousetimelinePackage.DOMAIN__CAPACITY_CHANGE);
		}
		return capacityChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StockChange> getStockChange() {
		if (stockChange == null) {
			stockChange = new EObjectContainmentEList<StockChange>(StockChange.class, this, TousetimelinePackage.DOMAIN__STOCK_CHANGE);
		}
		return stockChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainDistribution> getDistribution() {
		if (distribution == null) {
			distribution = new EObjectContainmentEList<DomainDistribution>(DomainDistribution.class, this, TousetimelinePackage.DOMAIN__DISTRIBUTION);
		}
		return distribution;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TousetimelinePackage.DOMAIN__NAME, oldName, name));
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.time.continuous.impl.DistributionImpl#addPropagatorFunctionAdapter()
	 */
	@Override
	public void addPropagatorFunctionAdapter() {
		Util.adapt(this, PropagatorScopeDomain.class);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refresh() {
		this.refreshDistributions();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshDistributions() {
		PropagatorFunctionAdapter scope = Util.getPropagatorFunctionAdapter(this, PropagatorScopeDomain.class);
		scope.refresh();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TousetimelinePackage.DOMAIN__TIME_LINE:
				return ((InternalEList<?>)getTimeLine()).basicRemove(otherEnd, msgs);
			case TousetimelinePackage.DOMAIN__TIME_LINE_MERGE:
				return ((InternalEList<?>)getTimeLineMerge()).basicRemove(otherEnd, msgs);
			case TousetimelinePackage.DOMAIN__AMOUNT_IMPULSION:
				return ((InternalEList<?>)getAmountImpulsion()).basicRemove(otherEnd, msgs);
			case TousetimelinePackage.DOMAIN__AMOUNT_ABSOLUTE:
				return ((InternalEList<?>)getAmountAbsolute()).basicRemove(otherEnd, msgs);
			case TousetimelinePackage.DOMAIN__SLOPE_ABSOLUTE:
				return ((InternalEList<?>)getSlopeAbsolute()).basicRemove(otherEnd, msgs);
			case TousetimelinePackage.DOMAIN__SLOPE_IMPULSION:
				return ((InternalEList<?>)getSlopeImpulsion()).basicRemove(otherEnd, msgs);
			case TousetimelinePackage.DOMAIN__CAPACITY_CHANGE:
				return ((InternalEList<?>)getCapacityChange()).basicRemove(otherEnd, msgs);
			case TousetimelinePackage.DOMAIN__STOCK_CHANGE:
				return ((InternalEList<?>)getStockChange()).basicRemove(otherEnd, msgs);
			case TousetimelinePackage.DOMAIN__DISTRIBUTION:
				return ((InternalEList<?>)getDistribution()).basicRemove(otherEnd, msgs);
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
			case TousetimelinePackage.DOMAIN__TIME_LINE:
				return getTimeLine();
			case TousetimelinePackage.DOMAIN__TIME_LINE_MERGE:
				return getTimeLineMerge();
			case TousetimelinePackage.DOMAIN__AMOUNT_IMPULSION:
				return getAmountImpulsion();
			case TousetimelinePackage.DOMAIN__AMOUNT_ABSOLUTE:
				return getAmountAbsolute();
			case TousetimelinePackage.DOMAIN__SLOPE_ABSOLUTE:
				return getSlopeAbsolute();
			case TousetimelinePackage.DOMAIN__SLOPE_IMPULSION:
				return getSlopeImpulsion();
			case TousetimelinePackage.DOMAIN__CAPACITY_CHANGE:
				return getCapacityChange();
			case TousetimelinePackage.DOMAIN__STOCK_CHANGE:
				return getStockChange();
			case TousetimelinePackage.DOMAIN__DISTRIBUTION:
				return getDistribution();
			case TousetimelinePackage.DOMAIN__NAME:
				return getName();
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
			case TousetimelinePackage.DOMAIN__TIME_LINE:
				getTimeLine().clear();
				getTimeLine().addAll((Collection<? extends DomainTimeLine>)newValue);
				return;
			case TousetimelinePackage.DOMAIN__TIME_LINE_MERGE:
				getTimeLineMerge().clear();
				getTimeLineMerge().addAll((Collection<? extends TimeLineMerge>)newValue);
				return;
			case TousetimelinePackage.DOMAIN__AMOUNT_IMPULSION:
				getAmountImpulsion().clear();
				getAmountImpulsion().addAll((Collection<? extends ToUseAmountImpulsion>)newValue);
				return;
			case TousetimelinePackage.DOMAIN__AMOUNT_ABSOLUTE:
				getAmountAbsolute().clear();
				getAmountAbsolute().addAll((Collection<? extends ToUseAmountAbsolute>)newValue);
				return;
			case TousetimelinePackage.DOMAIN__SLOPE_ABSOLUTE:
				getSlopeAbsolute().clear();
				getSlopeAbsolute().addAll((Collection<? extends ToUseSlopeAbsolute>)newValue);
				return;
			case TousetimelinePackage.DOMAIN__SLOPE_IMPULSION:
				getSlopeImpulsion().clear();
				getSlopeImpulsion().addAll((Collection<? extends ToUseSlopeImpulsion>)newValue);
				return;
			case TousetimelinePackage.DOMAIN__CAPACITY_CHANGE:
				getCapacityChange().clear();
				getCapacityChange().addAll((Collection<? extends CapacityChange>)newValue);
				return;
			case TousetimelinePackage.DOMAIN__STOCK_CHANGE:
				getStockChange().clear();
				getStockChange().addAll((Collection<? extends StockChange>)newValue);
				return;
			case TousetimelinePackage.DOMAIN__DISTRIBUTION:
				getDistribution().clear();
				getDistribution().addAll((Collection<? extends DomainDistribution>)newValue);
				return;
			case TousetimelinePackage.DOMAIN__NAME:
				setName((String)newValue);
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
			case TousetimelinePackage.DOMAIN__TIME_LINE:
				getTimeLine().clear();
				return;
			case TousetimelinePackage.DOMAIN__TIME_LINE_MERGE:
				getTimeLineMerge().clear();
				return;
			case TousetimelinePackage.DOMAIN__AMOUNT_IMPULSION:
				getAmountImpulsion().clear();
				return;
			case TousetimelinePackage.DOMAIN__AMOUNT_ABSOLUTE:
				getAmountAbsolute().clear();
				return;
			case TousetimelinePackage.DOMAIN__SLOPE_ABSOLUTE:
				getSlopeAbsolute().clear();
				return;
			case TousetimelinePackage.DOMAIN__SLOPE_IMPULSION:
				getSlopeImpulsion().clear();
				return;
			case TousetimelinePackage.DOMAIN__CAPACITY_CHANGE:
				getCapacityChange().clear();
				return;
			case TousetimelinePackage.DOMAIN__STOCK_CHANGE:
				getStockChange().clear();
				return;
			case TousetimelinePackage.DOMAIN__DISTRIBUTION:
				getDistribution().clear();
				return;
			case TousetimelinePackage.DOMAIN__NAME:
				setName(NAME_EDEFAULT);
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
			case TousetimelinePackage.DOMAIN__TIME_LINE:
				return timeLine != null && !timeLine.isEmpty();
			case TousetimelinePackage.DOMAIN__TIME_LINE_MERGE:
				return timeLineMerge != null && !timeLineMerge.isEmpty();
			case TousetimelinePackage.DOMAIN__AMOUNT_IMPULSION:
				return amountImpulsion != null && !amountImpulsion.isEmpty();
			case TousetimelinePackage.DOMAIN__AMOUNT_ABSOLUTE:
				return amountAbsolute != null && !amountAbsolute.isEmpty();
			case TousetimelinePackage.DOMAIN__SLOPE_ABSOLUTE:
				return slopeAbsolute != null && !slopeAbsolute.isEmpty();
			case TousetimelinePackage.DOMAIN__SLOPE_IMPULSION:
				return slopeImpulsion != null && !slopeImpulsion.isEmpty();
			case TousetimelinePackage.DOMAIN__CAPACITY_CHANGE:
				return capacityChange != null && !capacityChange.isEmpty();
			case TousetimelinePackage.DOMAIN__STOCK_CHANGE:
				return stockChange != null && !stockChange.isEmpty();
			case TousetimelinePackage.DOMAIN__DISTRIBUTION:
				return distribution != null && !distribution.isEmpty();
			case TousetimelinePackage.DOMAIN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		if (baseClass == ObjectWithPropagatorFunctionAdapter.class) {
			switch (baseOperationID) {
				case PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER___ADD_PROPAGATOR_FUNCTION_ADAPTER: return TousetimelinePackage.DOMAIN___ADD_PROPAGATOR_FUNCTION_ADAPTER;
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
			case TousetimelinePackage.DOMAIN___ADD_PROPAGATOR_FUNCTION_ADAPTER:
				addPropagatorFunctionAdapter();
				return null;
			case TousetimelinePackage.DOMAIN___REFRESH:
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DomainImpl
