/**
 */
package com.misc.touse.moplaf.solver.tousesolver.impl;

import com.misc.common.moplaf.solver.EnumLpConsType;
import com.misc.common.moplaf.solver.GeneratorLpCons;
import com.misc.common.moplaf.solver.SolverFactory;
import com.misc.common.moplaf.solver.impl.GeneratorTupleImpl;
import com.misc.touse.moplaf.solver.tousesolver.Knapsack;
import com.misc.touse.moplaf.solver.tousesolver.LpItem;
import com.misc.touse.moplaf.solver.tousesolver.LpKnapsack;
import com.misc.touse.moplaf.solver.tousesolver.LpRoot;
import com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lp Knapsack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.impl.LpKnapsackImpl#getKnapsack <em>Knapsack</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.solver.tousesolver.impl.LpKnapsackImpl#getConsCapacity <em>Cons Capacity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LpKnapsackImpl extends GeneratorTupleImpl implements LpKnapsack {
	/**
	 * The cached value of the '{@link #getKnapsack() <em>Knapsack</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnapsack()
	 * @generated
	 * @ordered
	 */
	protected Knapsack knapsack;

	/**
	 * The cached value of the '{@link #getConsCapacity() <em>Cons Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsCapacity()
	 * @generated
	 * @ordered
	 */
	protected GeneratorLpCons consCapacity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LpKnapsackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TousesolverPackage.Literals.LP_KNAPSACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Knapsack getKnapsack() {
		if (knapsack != null && knapsack.eIsProxy()) {
			InternalEObject oldKnapsack = (InternalEObject)knapsack;
			knapsack = (Knapsack)eResolveProxy(oldKnapsack);
			if (knapsack != oldKnapsack) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TousesolverPackage.LP_KNAPSACK__KNAPSACK, oldKnapsack, knapsack));
			}
		}
		return knapsack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Knapsack basicGetKnapsack() {
		return knapsack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKnapsack(Knapsack newKnapsack) {
		Knapsack oldKnapsack = knapsack;
		knapsack = newKnapsack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TousesolverPackage.LP_KNAPSACK__KNAPSACK, oldKnapsack, knapsack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpCons getConsCapacity() {
		return consCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConsCapacity(GeneratorLpCons newConsCapacity, NotificationChain msgs) {
		GeneratorLpCons oldConsCapacity = consCapacity;
		consCapacity = newConsCapacity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TousesolverPackage.LP_KNAPSACK__CONS_CAPACITY, oldConsCapacity, newConsCapacity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsCapacity(GeneratorLpCons newConsCapacity) {
		if (newConsCapacity != consCapacity) {
			NotificationChain msgs = null;
			if (consCapacity != null)
				msgs = ((InternalEObject)consCapacity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TousesolverPackage.LP_KNAPSACK__CONS_CAPACITY, null, msgs);
			if (newConsCapacity != null)
				msgs = ((InternalEObject)newConsCapacity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TousesolverPackage.LP_KNAPSACK__CONS_CAPACITY, null, msgs);
			msgs = basicSetConsCapacity(newConsCapacity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TousesolverPackage.LP_KNAPSACK__CONS_CAPACITY, newConsCapacity, newConsCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TousesolverPackage.LP_KNAPSACK__CONS_CAPACITY:
				return basicSetConsCapacity(null, msgs);
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
			case TousesolverPackage.LP_KNAPSACK__KNAPSACK:
				if (resolve) return getKnapsack();
				return basicGetKnapsack();
			case TousesolverPackage.LP_KNAPSACK__CONS_CAPACITY:
				return getConsCapacity();
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
			case TousesolverPackage.LP_KNAPSACK__KNAPSACK:
				setKnapsack((Knapsack)newValue);
				return;
			case TousesolverPackage.LP_KNAPSACK__CONS_CAPACITY:
				setConsCapacity((GeneratorLpCons)newValue);
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
			case TousesolverPackage.LP_KNAPSACK__KNAPSACK:
				setKnapsack((Knapsack)null);
				return;
			case TousesolverPackage.LP_KNAPSACK__CONS_CAPACITY:
				setConsCapacity((GeneratorLpCons)null);
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
			case TousesolverPackage.LP_KNAPSACK__KNAPSACK:
				return knapsack != null;
			case TousesolverPackage.LP_KNAPSACK__CONS_CAPACITY:
				return consCapacity != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public void generateCons() {
		super.generateCons();
		this.generateLpConsCapacity();

	}
	
	public void generateLpConsCapacity(){
		Knapsack knapsack = this.getKnapsack();
		GeneratorLpCons cons = SolverFactory.eINSTANCE.createGeneratorLpCons();
		cons.setType(EnumLpConsType.ENUM_LITERAL_LP_CONS_SMALLER_OR_EQUAL);
		cons.setRighHandSide(knapsack.getCapacity());
		cons.setName("capac");
		this.setConsCapacity(cons); //owning
		LpRoot lproot = (LpRoot)this.getTupleContainer();
		for (LpItem lpitem : lproot.getItem()){
			cons.constructTerm(lpitem.getVarInKnapsack(), lpitem.getItem().getWeight());
		}
	}


} //LpKnapsackImpl
