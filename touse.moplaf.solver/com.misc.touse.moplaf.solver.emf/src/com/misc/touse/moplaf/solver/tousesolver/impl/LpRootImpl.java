/**
 */
package com.misc.touse.moplaf.solver.tousesolver.impl;

import com.misc.common.moplaf.solver.impl.GeneratorTupleImpl;
import com.misc.touse.moplaf.solver.tousesolver.Item;
import com.misc.touse.moplaf.solver.tousesolver.Knapsack;
import com.misc.touse.moplaf.solver.tousesolver.KnapsackLp;
import com.misc.touse.moplaf.solver.tousesolver.LpItem;
import com.misc.touse.moplaf.solver.tousesolver.LpKnapsack;
import com.misc.touse.moplaf.solver.tousesolver.LpRoot;
import com.misc.touse.moplaf.solver.tousesolver.Scenario;
import com.misc.touse.moplaf.solver.tousesolver.TousesolverFactory;
import com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lp Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.impl.LpRootImpl#getItem <em>Item</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.impl.LpRootImpl#getKnapsack <em>Knapsack</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LpRootImpl extends GeneratorTupleImpl implements LpRoot {
	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<LpItem> item;

	/**
	 * The cached value of the '{@link #getKnapsack() <em>Knapsack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnapsack()
	 * @generated
	 * @ordered
	 */
	protected LpKnapsack knapsack;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LpRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TousesolverPackage.Literals.LP_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LpItem> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<LpItem>(LpItem.class, this, TousesolverPackage.LP_ROOT__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LpKnapsack getKnapsack() {
		return knapsack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKnapsack(LpKnapsack newKnapsack, NotificationChain msgs) {
		LpKnapsack oldKnapsack = knapsack;
		knapsack = newKnapsack;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TousesolverPackage.LP_ROOT__KNAPSACK, oldKnapsack, newKnapsack);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKnapsack(LpKnapsack newKnapsack) {
		if (newKnapsack != knapsack) {
			NotificationChain msgs = null;
			if (knapsack != null)
				msgs = ((InternalEObject)knapsack).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TousesolverPackage.LP_ROOT__KNAPSACK, null, msgs);
			if (newKnapsack != null)
				msgs = ((InternalEObject)newKnapsack).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TousesolverPackage.LP_ROOT__KNAPSACK, null, msgs);
			msgs = basicSetKnapsack(newKnapsack, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TousesolverPackage.LP_ROOT__KNAPSACK, newKnapsack, newKnapsack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TousesolverPackage.LP_ROOT__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
			case TousesolverPackage.LP_ROOT__KNAPSACK:
				return basicSetKnapsack(null, msgs);
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
			case TousesolverPackage.LP_ROOT__ITEM:
				return getItem();
			case TousesolverPackage.LP_ROOT__KNAPSACK:
				return getKnapsack();
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
			case TousesolverPackage.LP_ROOT__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends LpItem>)newValue);
				return;
			case TousesolverPackage.LP_ROOT__KNAPSACK:
				setKnapsack((LpKnapsack)newValue);
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
			case TousesolverPackage.LP_ROOT__ITEM:
				getItem().clear();
				return;
			case TousesolverPackage.LP_ROOT__KNAPSACK:
				setKnapsack((LpKnapsack)null);
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
			case TousesolverPackage.LP_ROOT__ITEM:
				return item != null && !item.isEmpty();
			case TousesolverPackage.LP_ROOT__KNAPSACK:
				return knapsack != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public void generateTuples() {
		super.generateTuples();
		// knapsack
		LpRoot root = this;
		KnapsackLp generator = (KnapsackLp)root.getGenerator();
		Scenario scenario = generator.getScenario();
        Knapsack knapsack = scenario.getKnapsack();
        
        if ( knapsack != null){
        	LpKnapsack lpknapsack = TousesolverFactory.eINSTANCE.createLpKnapsack();
        	lpknapsack.setKnapsack(knapsack);
        	lpknapsack.setCode(knapsack.getShortName());
        	this.setKnapsack(lpknapsack); // owning
        }
        // item
        for (Item item : scenario.getItem()){
        	LpItem lpitem = TousesolverFactory.eINSTANCE.createLpItem();
        	lpitem.setItem(item);
        	lpitem.setCode(item.getShortName());
        	this.getItem().add(lpitem);  // owning
        }
	}
	
	

} //LpRootImpl
