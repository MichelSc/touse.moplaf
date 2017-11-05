/**
 */
package com.misc.touse.moplaf.tousescheduler.provider;


import com.misc.common.moplaf.localsearch.LocalSearchPackage;

import com.misc.common.moplaf.localsearch.provider.ImprovementItemProvider;

import com.misc.touse.moplaf.tousescheduler.ToUseImprovementDestructConstruct;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerFactory;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.touse.moplaf.tousescheduler.ToUseImprovementDestructConstruct} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ToUseImprovementDestructConstructItemProvider extends ImprovementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseImprovementDestructConstructItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addDestructionChancePropertyDescriptor(object);
			addConstructionChancePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Destruction Chance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDestructionChancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ToUseImprovementDestructConstruct_DestructionChance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ToUseImprovementDestructConstruct_DestructionChance_feature", "_UI_ToUseImprovementDestructConstruct_type"),
				 ToUseSchedulerPackage.Literals.TO_USE_IMPROVEMENT_DESTRUCT_CONSTRUCT__DESTRUCTION_CHANCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__20ToUseSchedulerPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Construction Chance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstructionChancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ToUseImprovementDestructConstruct_ConstructionChance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ToUseImprovementDestructConstruct_ConstructionChance_feature", "_UI_ToUseImprovementDestructConstruct_type"),
				 ToUseSchedulerPackage.Literals.TO_USE_IMPROVEMENT_DESTRUCT_CONSTRUCT__CONSTRUCTION_CHANCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__20ToUseSchedulerPropertyCategory"),
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ToUseImprovementDestructConstruct)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ToUseImprovementDestructConstruct_type") :
			getString("_UI_ToUseImprovementDestructConstruct_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ToUseImprovementDestructConstruct.class)) {
			case ToUseSchedulerPackage.TO_USE_IMPROVEMENT_DESTRUCT_CONSTRUCT__DESTRUCTION_CHANCE:
			case ToUseSchedulerPackage.TO_USE_IMPROVEMENT_DESTRUCT_CONSTRUCT__CONSTRUCTION_CHANCE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(LocalSearchPackage.Literals.IMPROVEMENT__ACTIONS,
				 ToUseSchedulerFactory.eINSTANCE.createToUseScheduleLoadUnload()));

		newChildDescriptors.add
			(createChildParameter
				(LocalSearchPackage.Literals.IMPROVEMENT__ACTIONS,
				 ToUseSchedulerFactory.eINSTANCE.createToUseUnscheduleLoadUnload()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ToUseSchedulerEditPlugin.INSTANCE;
	}

}
