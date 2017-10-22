/**
 */
package com.misc.touse.moplaf.tousescheduler.provider;


import com.misc.touse.moplaf.tousescheduler.ToUseLoadShipment;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link com.misc.touse.moplaf.tousescheduler.ToUseLoadShipment} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ToUseLoadShipmentItemProvider 
	extends ToUseScheduleTaskItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseLoadShipmentItemProvider(AdapterFactory adapterFactory) {
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

			addShipmentLoadedPropertyDescriptor(object);
			addUnloadShipmentPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Shipment Loaded feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShipmentLoadedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ToUseLoadShipment_ShipmentLoaded_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ToUseLoadShipment_ShipmentLoaded_feature", "_UI_ToUseLoadShipment_type"),
				 ToUseSchedulerPackage.Literals.TO_USE_LOAD_SHIPMENT__SHIPMENT_LOADED,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__20ToUseSchedulerPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Unload Shipment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnloadShipmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ToUseLoadShipment_UnloadShipment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ToUseLoadShipment_UnloadShipment_feature", "_UI_ToUseLoadShipment_type"),
				 ToUseSchedulerPackage.Literals.TO_USE_LOAD_SHIPMENT__UNLOAD_SHIPMENT,
				 true,
				 false,
				 true,
				 null,
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
		String label = ((ToUseLoadShipment)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ToUseLoadShipment_type") :
			getString("_UI_ToUseLoadShipment_type") + " " + label;
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

}
