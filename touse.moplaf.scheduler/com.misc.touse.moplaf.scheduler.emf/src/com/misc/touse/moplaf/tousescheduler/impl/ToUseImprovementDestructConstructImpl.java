/**
 */
package com.misc.touse.moplaf.tousescheduler.impl;

import com.misc.common.moplaf.localsearch.impl.ImprovementImpl;
import com.misc.common.moplaf.scheduler.Task;
import com.misc.touse.moplaf.tousescheduler.ToUseImprovementDestructConstruct;
import com.misc.touse.moplaf.tousescheduler.ToUseLoadShipment;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedule;
import com.misc.touse.moplaf.tousescheduler.ToUseScheduleLoadUnload;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerFactory;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;
import com.misc.touse.moplaf.tousescheduler.ToUseUnscheduleLoadUnload;

import java.util.Random;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Use Improvement Destruct Construct</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseImprovementDestructConstructImpl#getDestructionChance <em>Destruction Chance</em>}</li>
 *   <li>{@link com.misc.touse.moplaf.tousescheduler.impl.ToUseImprovementDestructConstructImpl#getConstructionChance <em>Construction Chance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToUseImprovementDestructConstructImpl extends ImprovementImpl implements ToUseImprovementDestructConstruct {
	/**
	 * The default value of the '{@link #getDestructionChance() <em>Destruction Chance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestructionChance()
	 * @generated
	 * @ordered
	 */
	protected static final float DESTRUCTION_CHANCE_EDEFAULT = 0.05F;

	/**
	 * The cached value of the '{@link #getDestructionChance() <em>Destruction Chance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestructionChance()
	 * @generated
	 * @ordered
	 */
	protected float destructionChance = DESTRUCTION_CHANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstructionChance() <em>Construction Chance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructionChance()
	 * @generated
	 * @ordered
	 */
	protected static final float CONSTRUCTION_CHANCE_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getConstructionChance() <em>Construction Chance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructionChance()
	 * @generated
	 * @ordered
	 */
	protected float constructionChance = CONSTRUCTION_CHANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUseImprovementDestructConstructImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseSchedulerPackage.Literals.TO_USE_IMPROVEMENT_DESTRUCT_CONSTRUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDestructionChance() {
		return destructionChance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestructionChance(float newDestructionChance) {
		float oldDestructionChance = destructionChance;
		destructionChance = newDestructionChance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_IMPROVEMENT_DESTRUCT_CONSTRUCT__DESTRUCTION_CHANCE, oldDestructionChance, destructionChance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getConstructionChance() {
		return constructionChance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstructionChance(float newConstructionChance) {
		float oldConstructionChance = constructionChance;
		constructionChance = newConstructionChance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSchedulerPackage.TO_USE_IMPROVEMENT_DESTRUCT_CONSTRUCT__CONSTRUCTION_CHANCE, oldConstructionChance, constructionChance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUseSchedulerPackage.TO_USE_IMPROVEMENT_DESTRUCT_CONSTRUCT__DESTRUCTION_CHANCE:
				return getDestructionChance();
			case ToUseSchedulerPackage.TO_USE_IMPROVEMENT_DESTRUCT_CONSTRUCT__CONSTRUCTION_CHANCE:
				return getConstructionChance();
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
			case ToUseSchedulerPackage.TO_USE_IMPROVEMENT_DESTRUCT_CONSTRUCT__DESTRUCTION_CHANCE:
				setDestructionChance((Float)newValue);
				return;
			case ToUseSchedulerPackage.TO_USE_IMPROVEMENT_DESTRUCT_CONSTRUCT__CONSTRUCTION_CHANCE:
				setConstructionChance((Float)newValue);
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
			case ToUseSchedulerPackage.TO_USE_IMPROVEMENT_DESTRUCT_CONSTRUCT__DESTRUCTION_CHANCE:
				setDestructionChance(DESTRUCTION_CHANCE_EDEFAULT);
				return;
			case ToUseSchedulerPackage.TO_USE_IMPROVEMENT_DESTRUCT_CONSTRUCT__CONSTRUCTION_CHANCE:
				setConstructionChance(CONSTRUCTION_CHANCE_EDEFAULT);
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
			case ToUseSchedulerPackage.TO_USE_IMPROVEMENT_DESTRUCT_CONSTRUCT__DESTRUCTION_CHANCE:
				return destructionChance != DESTRUCTION_CHANCE_EDEFAULT;
			case ToUseSchedulerPackage.TO_USE_IMPROVEMENT_DESTRUCT_CONSTRUCT__CONSTRUCTION_CHANCE:
				return constructionChance != CONSTRUCTION_CHANCE_EDEFAULT;
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
		result.append(" (DestructionChance: ");
		result.append(destructionChance);
		result.append(", ConstructionChance: ");
		result.append(constructionChance);
		result.append(')');
		return result.toString();
	}

	private static Random random = new Random();
	

	/**
	 * 
	 */
	@Override
	protected void doIterationImpl() {
		ToUseSchedule schedule = (ToUseSchedule)this.getSolution();
		schedule.enable(); // activate propagator
		
		// destructions
		for( Task task : schedule.getTasks()) {
			if ( task.isScheduled() && task instanceof ToUseLoadShipment ){
				if ( this.getDestructionChance()>=random.nextDouble()) {
					ToUseUnscheduleLoadUnload new_action = ToUseSchedulerFactory.eINSTANCE.createToUseUnscheduleLoadUnload();
					int new_nr = this.getCurrentActionNr()+1;
					this.setCurrentActionNr(new_nr);
					new_action.setLoadTask((ToUseLoadShipment) task);
					new_action.setActionNr(new_nr);
					this.getActions().add(new_action); // owning
					new_action.setSolution(schedule);
					new_action.initialize();
					new_action.run();
					new_action.finalize();
				}
			}
		}
		
		// constructions
		for( Task task : schedule.getTasks()) {
			if ( !task.isScheduled() && task instanceof ToUseLoadShipment ){
				if ( this.getConstructionChance()>=random.nextDouble()) {
					ToUseScheduleLoadUnload new_action = ToUseSchedulerFactory.eINSTANCE.createToUseScheduleLoadUnload();
					int new_nr = this.getCurrentActionNr()+1;
					this.setCurrentActionNr(new_nr);
					new_action.setActionNr(new_nr);
					new_action.setLoadTask((ToUseLoadShipment) task);
					this.getActions().add(new_action); // owning
					new_action.setSolution(schedule);
					new_action.initialize();
					new_action.run();
					new_action.finalize();
				}
			}
		}
	}

} //ToUseImprovementDestructConstructImpl
