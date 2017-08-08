/**
 */
package com.misc.touse.moplaf.tousepropagator2calc.provider;


import com.misc.touse.moplaf.tousepropagator2.provider.ToUsePropagatorEditPlugin;
import com.misc.touse.moplaf.tousepropagator2.provider.ToUsePropagatorFunctionProjectItemProvider;

import com.misc.touse.moplaf.tousepropagator2calc.LayerTaskTimes;
import com.misc.touse.moplaf.tousepropagator2calc.ToUsePropagatorCalcPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link com.misc.touse.moplaf.tousepropagator2calc.LayerTaskTimes} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LayerTaskTimesItemProvider extends ToUsePropagatorFunctionProjectItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerTaskTimesItemProvider(AdapterFactory adapterFactory) {
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

			addConcreteParentPropertyDescriptor(object);
			addAntecedentLayerTaskHoursPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Concrete Parent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConcreteParentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LayerTaskTimes_ConcreteParent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LayerTaskTimes_ConcreteParent_feature", "_UI_LayerTaskTimes_type"),
				 ToUsePropagatorCalcPackage.Literals.LAYER_TASK_TIMES__CONCRETE_PARENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Antecedent Layer Task Hours feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAntecedentLayerTaskHoursPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LayerTaskTimes_AntecedentLayerTaskHours_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LayerTaskTimes_AntecedentLayerTaskHours_feature", "_UI_LayerTaskTimes_type"),
				 ToUsePropagatorCalcPackage.Literals.LAYER_TASK_TIMES__ANTECEDENT_LAYER_TASK_HOURS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns LayerTaskTimes.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LayerTaskTimes"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		LayerTaskTimes layerTaskTimes = (LayerTaskTimes)object;
		return getString("_UI_LayerTaskTimes_type") + " " + layerTaskTimes.isTouched();
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

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ToUsePropagatorEditPlugin.INSTANCE;
	}

}
