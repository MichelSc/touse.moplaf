/**
 */
package com.misc.touse.moplaf.solver.tousesolver.impl;

import com.misc.common.moplaf.solver.EnumLpVarType;
import com.misc.common.moplaf.solver.impl.GeneratorTupleImpl;
import com.misc.touse.moplaf.solver.tousesolver.Item;
import com.misc.touse.moplaf.solver.tousesolver.LpItem;
import com.misc.touse.moplaf.solver.tousesolver.TousesolverFactory;
import com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage;
import com.misc.touse.moplaf.solver.tousesolver.VarItemInKnapsack;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lp Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.impl.LpItemImpl#getItem <em>Item</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.impl.LpItemImpl#getVarInKnapsack <em>Var In Knapsack</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LpItemImpl extends GeneratorTupleImpl implements LpItem {
	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected Item item;

	/**
	 * The cached value of the '{@link #getVarInKnapsack() <em>Var In Knapsack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarInKnapsack()
	 * @generated
	 * @ordered
	 */
	protected VarItemInKnapsack varInKnapsack;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LpItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TousesolverPackage.Literals.LP_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item getItem() {
		if (item != null && item.eIsProxy()) {
			InternalEObject oldItem = (InternalEObject)item;
			item = (Item)eResolveProxy(oldItem);
			if (item != oldItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TousesolverPackage.LP_ITEM__ITEM, oldItem, item));
			}
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item basicGetItem() {
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItem(Item newItem) {
		Item oldItem = item;
		item = newItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TousesolverPackage.LP_ITEM__ITEM, oldItem, item));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarItemInKnapsack getVarInKnapsack() {
		return varInKnapsack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVarInKnapsack(VarItemInKnapsack newVarInKnapsack, NotificationChain msgs) {
		VarItemInKnapsack oldVarInKnapsack = varInKnapsack;
		varInKnapsack = newVarInKnapsack;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TousesolverPackage.LP_ITEM__VAR_IN_KNAPSACK, oldVarInKnapsack, newVarInKnapsack);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarInKnapsack(VarItemInKnapsack newVarInKnapsack) {
		if (newVarInKnapsack != varInKnapsack) {
			NotificationChain msgs = null;
			if (varInKnapsack != null)
				msgs = ((InternalEObject)varInKnapsack).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TousesolverPackage.LP_ITEM__VAR_IN_KNAPSACK, null, msgs);
			if (newVarInKnapsack != null)
				msgs = ((InternalEObject)newVarInKnapsack).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TousesolverPackage.LP_ITEM__VAR_IN_KNAPSACK, null, msgs);
			msgs = basicSetVarInKnapsack(newVarInKnapsack, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TousesolverPackage.LP_ITEM__VAR_IN_KNAPSACK, newVarInKnapsack, newVarInKnapsack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TousesolverPackage.LP_ITEM__VAR_IN_KNAPSACK:
				return basicSetVarInKnapsack(null, msgs);
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
			case TousesolverPackage.LP_ITEM__ITEM:
				if (resolve) return getItem();
				return basicGetItem();
			case TousesolverPackage.LP_ITEM__VAR_IN_KNAPSACK:
				return getVarInKnapsack();
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
			case TousesolverPackage.LP_ITEM__ITEM:
				setItem((Item)newValue);
				return;
			case TousesolverPackage.LP_ITEM__VAR_IN_KNAPSACK:
				setVarInKnapsack((VarItemInKnapsack)newValue);
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
			case TousesolverPackage.LP_ITEM__ITEM:
				setItem((Item)null);
				return;
			case TousesolverPackage.LP_ITEM__VAR_IN_KNAPSACK:
				setVarInKnapsack((VarItemInKnapsack)null);
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
			case TousesolverPackage.LP_ITEM__ITEM:
				return item != null;
			case TousesolverPackage.LP_ITEM__VAR_IN_KNAPSACK:
				return varInKnapsack != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public void generateVars() {
		super.generateVars();
		
		Item lpitem = this.getItem();
		VarItemInKnapsack var = TousesolverFactory.eINSTANCE.createVarItemInKnapsack();
    	var.setType(EnumLpVarType.ENUM_LITERAL_LP_VAR_INTEGER);;
    	var.setLowerBound(0.0f);
    	var.setUpperBound(1.0f);
    	var.setName("itemin");
    	var.setObjectiveCoeff(lpitem.getValue());
    	this.setVarInKnapsack(var);  // owning
	}
	
	

} //LpItemImpl
