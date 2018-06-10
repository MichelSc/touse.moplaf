/**
 */
package com.misc.touse.moplaf.tousescheduler.provider;


import com.misc.common.moplaf.scheduler.provider.ResourceItemProvider;

import com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource;
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
 * This is the item provider adapter for a {@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ToUseScheduleResourceItemProvider extends ResourceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseScheduleResourceItemProvider(AdapterFactory adapterFactory) {
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

			addVehiclePropertyDescriptor(object);
			addDistanceFromLastPropertyDescriptor(object);
			addTotalDistancePropertyDescriptor(object);
			addVolumeOverloadPropertyDescriptor(object);
			addPlannedBenefitPropertyDescriptor(object);
			addToUseScheduledTasksPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Vehicle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVehiclePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ToUseScheduleResource_Vehicle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ToUseScheduleResource_Vehicle_feature", "_UI_ToUseScheduleResource_type"),
				 ToUseSchedulerPackage.Literals.TO_USE_SCHEDULE_RESOURCE__VEHICLE,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__20SchedulePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Distance From Last feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDistanceFromLastPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ToUseScheduleResource_DistanceFromLast_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ToUseScheduleResource_DistanceFromLast_feature", "_UI_ToUseScheduleResource_type"),
				 ToUseSchedulerPackage.Literals.TO_USE_SCHEDULE_RESOURCE__DISTANCE_FROM_LAST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__23ToUseSchedulerLocationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Total Distance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalDistancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ToUseScheduleResource_TotalDistance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ToUseScheduleResource_TotalDistance_feature", "_UI_ToUseScheduleResource_type"),
				 ToUseSchedulerPackage.Literals.TO_USE_SCHEDULE_RESOURCE__TOTAL_DISTANCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__23ToUseSchedulerLocationPropertyCategory"),
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
				 getString("_UI_ToUseScheduleResource_VolumeOverload_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ToUseScheduleResource_VolumeOverload_feature", "_UI_ToUseScheduleResource_type"),
				 ToUseSchedulerPackage.Literals.TO_USE_SCHEDULE_RESOURCE__VOLUME_OVERLOAD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__26ToUseSchedulerVolumePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Planned Benefit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlannedBenefitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ToUseScheduleResource_PlannedBenefit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ToUseScheduleResource_PlannedBenefit_feature", "_UI_ToUseScheduleResource_type"),
				 ToUseSchedulerPackage.Literals.TO_USE_SCHEDULE_RESOURCE__PLANNED_BENEFIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__20SchedulePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the To Use Scheduled Tasks feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToUseScheduledTasksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ToUseScheduleResource_ToUseScheduledTasks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ToUseScheduleResource_ToUseScheduledTasks_feature", "_UI_ToUseScheduleResource_type"),
				 ToUseSchedulerPackage.Literals.TO_USE_SCHEDULE_RESOURCE__TO_USE_SCHEDULED_TASKS,
				 false,
				 false,
				 false,
				 null,
				 null,
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
		String label = ((ToUseScheduleResource)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ToUseScheduleResource_type") :
			getString("_UI_ToUseScheduleResource_type") + " " + label;
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

		switch (notification.getFeatureID(ToUseScheduleResource.class)) {
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_RESOURCE__DISTANCE_FROM_LAST:
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_RESOURCE__TOTAL_DISTANCE:
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_RESOURCE__VOLUME_OVERLOAD:
			case ToUseSchedulerPackage.TO_USE_SCHEDULE_RESOURCE__PLANNED_BENEFIT:
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
