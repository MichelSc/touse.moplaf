/**
 */
package com.misc.touse.moplaf.tousescheduler.provider;


import com.misc.touse.moplaf.tousescheduler.Shipment;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.touse.moplaf.tousescheduler.Shipment} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ShipmentItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipmentItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addLoadLocationXPropertyDescriptor(object);
			addLoadLocationYPropertyDescriptor(object);
			addUnloadLocationXPropertyDescriptor(object);
			addUnloadLocationYPropertyDescriptor(object);
			addVolumePropertyDescriptor(object);
			addPlannedBenefitPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Shipment_Name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Shipment_Name_feature", "_UI_Shipment_type"),
				 ToUseSchedulerPackage.Literals.SHIPMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__20ToUseSchedulerPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Load Location X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoadLocationXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Shipment_LoadLocationX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Shipment_LoadLocationX_feature", "_UI_Shipment_type"),
				 ToUseSchedulerPackage.Literals.SHIPMENT__LOAD_LOCATION_X,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__20ToUseSchedulerPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Load Location Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoadLocationYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Shipment_LoadLocationY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Shipment_LoadLocationY_feature", "_UI_Shipment_type"),
				 ToUseSchedulerPackage.Literals.SHIPMENT__LOAD_LOCATION_Y,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__20ToUseSchedulerPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Unload Location X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnloadLocationXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Shipment_UnloadLocationX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Shipment_UnloadLocationX_feature", "_UI_Shipment_type"),
				 ToUseSchedulerPackage.Literals.SHIPMENT__UNLOAD_LOCATION_X,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__20ToUseSchedulerPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Unload Location Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnloadLocationYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Shipment_UnloadLocationY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Shipment_UnloadLocationY_feature", "_UI_Shipment_type"),
				 ToUseSchedulerPackage.Literals.SHIPMENT__UNLOAD_LOCATION_Y,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__20ToUseSchedulerPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Volume feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVolumePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Shipment_Volume_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Shipment_Volume_feature", "_UI_Shipment_type"),
				 ToUseSchedulerPackage.Literals.SHIPMENT__VOLUME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__20ToUseSchedulerPropertyCategory"),
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
				 getString("_UI_Shipment_PlannedBenefit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Shipment_PlannedBenefit_feature", "_UI_Shipment_type"),
				 ToUseSchedulerPackage.Literals.SHIPMENT__PLANNED_BENEFIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__20ToUseSchedulerPropertyCategory"),
				 null));
	}

	/**
	 * This returns Shipment.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/shipment.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Shipment)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Shipment_type") :
			getString("_UI_Shipment_type") + " " + label;
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

		switch (notification.getFeatureID(Shipment.class)) {
			case ToUseSchedulerPackage.SHIPMENT__NAME:
			case ToUseSchedulerPackage.SHIPMENT__LOAD_LOCATION_X:
			case ToUseSchedulerPackage.SHIPMENT__LOAD_LOCATION_Y:
			case ToUseSchedulerPackage.SHIPMENT__UNLOAD_LOCATION_X:
			case ToUseSchedulerPackage.SHIPMENT__UNLOAD_LOCATION_Y:
			case ToUseSchedulerPackage.SHIPMENT__VOLUME:
			case ToUseSchedulerPackage.SHIPMENT__PLANNED_BENEFIT:
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
