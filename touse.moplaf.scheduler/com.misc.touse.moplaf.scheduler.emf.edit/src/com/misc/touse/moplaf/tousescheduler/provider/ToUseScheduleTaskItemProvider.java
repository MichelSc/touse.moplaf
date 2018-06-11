/**
 */
package com.misc.touse.moplaf.tousescheduler.provider;


import com.misc.common.moplaf.scheduler.provider.FlockTaskItemProvider;
import com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask;
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
 * This is the item provider adapter for a {@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ToUseScheduleTaskItemProvider extends FlockTaskItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseScheduleTaskItemProvider(AdapterFactory adapterFactory) {
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

			addLocationXPropertyDescriptor(object);
			addLocationYPropertyDescriptor(object);
			addLoadFactorPropertyDescriptor(object);
			addDistancePropertyDescriptor(object);
			addDistanceFromPreviousPropertyDescriptor(object);
			addStartVolumeLoadedPropertyDescriptor(object);
			addEndVolumeLoadedPropertyDescriptor(object);
			addVolumeOverloadPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Distance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDistancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ToUseScheduleTask_Distance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ToUseScheduleTask_Distance_feature", "_UI_ToUseScheduleTask_type"),
				 ToUseSchedulerPackage.Literals.TO_USE_SCHEDULE_TASK__DISTANCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__23ToUseSchedulerLocationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Distance From Previous feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDistanceFromPreviousPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ToUseScheduleTask_DistanceFromPrevious_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ToUseScheduleTask_DistanceFromPrevious_feature", "_UI_ToUseScheduleTask_type"),
				 ToUseSchedulerPackage.Literals.TO_USE_SCHEDULE_TASK__DISTANCE_FROM_PREVIOUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__23ToUseSchedulerLocationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Start Volume Loaded feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartVolumeLoadedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ToUseScheduleTask_StartVolumeLoaded_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ToUseScheduleTask_StartVolumeLoaded_feature", "_UI_ToUseScheduleTask_type"),
				 ToUseSchedulerPackage.Literals.TO_USE_SCHEDULE_TASK__START_VOLUME_LOADED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__26ToUseSchedulerVolumePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the End Volume Loaded feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndVolumeLoadedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ToUseScheduleTask_EndVolumeLoaded_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ToUseScheduleTask_EndVolumeLoaded_feature", "_UI_ToUseScheduleTask_type"),
				 ToUseSchedulerPackage.Literals.TO_USE_SCHEDULE_TASK__END_VOLUME_LOADED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__26ToUseSchedulerVolumePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Location X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocationXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ToUseScheduleTask_locationX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ToUseScheduleTask_locationX_feature", "_UI_ToUseScheduleTask_type"),
				 ToUseSchedulerPackage.Literals.TO_USE_SCHEDULE_TASK__LOCATION_X,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__23ToUseSchedulerLocationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Location Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocationYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ToUseScheduleTask_locationY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ToUseScheduleTask_locationY_feature", "_UI_ToUseScheduleTask_type"),
				 ToUseSchedulerPackage.Literals.TO_USE_SCHEDULE_TASK__LOCATION_Y,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__23ToUseSchedulerLocationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Load Factor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoadFactorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ToUseScheduleTask_LoadFactor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ToUseScheduleTask_LoadFactor_feature", "_UI_ToUseScheduleTask_type"),
				 ToUseSchedulerPackage.Literals.TO_USE_SCHEDULE_TASK__LOAD_FACTOR,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__26ToUseSchedulerVolumePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Volume Overload feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVolumeOverloadPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ToUseScheduleTask_VolumeOverload_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ToUseScheduleTask_VolumeOverload_feature", "_UI_ToUseScheduleTask_type"),
				 ToUseSchedulerPackage.Literals.TO_USE_SCHEDULE_TASK__VOLUME_OVERLOAD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__26ToUseSchedulerVolumePropertyCategory"),
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
		String label = ((ToUseScheduleTask)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ToUseScheduleTask_type") :
			getString("_UI_ToUseScheduleTask_type") + " " + label;
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

		switch (notification.getFeatureID(ToUseScheduleTask.class)) {
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__LOCATION_X:
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__LOCATION_Y:
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__LOAD_FACTOR:
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__DISTANCE:
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__DISTANCE_FROM_PREVIOUS:
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__START_VOLUME_LOADED:
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__END_VOLUME_LOADED:
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_TASK__VOLUME_OVERLOAD:
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
