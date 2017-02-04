/**
 */
package com.misc.touse.moplaf.tousepropagator2calc.provider;


import com.misc.touse.moplaf.tousepropagator2.provider.ToUsePropagatorFunctionProjectItemProvider;
import com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHours;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import com.misc.touse.moplaf.tousepropagator2calc.ToUsePropagatorCalcPackage;

/**
 * This is the item provider adapter for a {@link com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHours} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LayerTaskHoursItemProvider extends ToUsePropagatorFunctionProjectItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerTaskHoursItemProvider(AdapterFactory adapterFactory) {
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
			addAntecedentLayerTaskHoursItemPropertyDescriptor(object);
			addAntecedentLayerTaskHoursVarPropertyDescriptor(object);
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
				 getString("_UI_LayerTaskHours_ConcreteParent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LayerTaskHours_ConcreteParent_feature", "_UI_LayerTaskHours_type"),
				 ToUsePropagatorCalcPackage.Literals.LAYER_TASK_HOURS__CONCRETE_PARENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Antecedent Layer Task Hours Item feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAntecedentLayerTaskHoursItemPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LayerTaskHours_AntecedentLayerTaskHoursItem_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LayerTaskHours_AntecedentLayerTaskHoursItem_feature", "_UI_LayerTaskHours_type"),
				 ToUsePropagatorCalcPackage.Literals.LAYER_TASK_HOURS__ANTECEDENT_LAYER_TASK_HOURS_ITEM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Antecedent Layer Task Hours Var feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAntecedentLayerTaskHoursVarPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LayerTaskHours_AntecedentLayerTaskHoursVar_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LayerTaskHours_AntecedentLayerTaskHoursVar_feature", "_UI_LayerTaskHours_type"),
				 ToUsePropagatorCalcPackage.Literals.LAYER_TASK_HOURS__ANTECEDENT_LAYER_TASK_HOURS_VAR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns LayerTaskHours.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LayerTaskHours"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((LayerTaskHours)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_LayerTaskHours_type") :
			getString("_UI_LayerTaskHours_type") + " " + label;
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
		return ToUsePropagatorCalcEditPlugin.INSTANCE;
	}

}
