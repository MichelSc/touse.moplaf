/**
 */
package com.misc.touse.moplaf.tousepropagator2.provider;


import com.misc.common.moplaf.propagator2.provider.ObjectWithPropagatorFunctionsItemProvider;
import com.misc.touse.moplaf.tousepropagator2.Task;
import com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorFactory;
import com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.touse.moplaf.tousepropagator2.Task} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskItemProvider
	extends ObjectWithPropagatorFunctionsItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskItemProvider(AdapterFactory adapterFactory) {
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

			addStartPropertyDescriptor(object);
			addEndPropertyDescriptor(object);
			addHoursPropertyDescriptor(object);
			addHoursItemsPropertyDescriptor(object);
			addHoursVarPropertyDescriptor(object);
			addHoursVarPerResPropertyDescriptor(object);
			addTaskNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Task_Start_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Task_Start_feature", "_UI_Task_type"),
				 ToUsePropagatorPackage.Literals.TASK__START,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__20DerivedPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the End feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Task_End_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Task_End_feature", "_UI_Task_type"),
				 ToUsePropagatorPackage.Literals.TASK__END,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__20DerivedPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Hours feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHoursPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Task_Hours_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Task_Hours_feature", "_UI_Task_type"),
				 ToUsePropagatorPackage.Literals.TASK__HOURS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__20DerivedPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Hours Items feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHoursItemsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Task_HoursItems_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Task_HoursItems_feature", "_UI_Task_type"),
				 ToUsePropagatorPackage.Literals.TASK__HOURS_ITEMS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__20DerivedPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Hours Var feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHoursVarPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Task_HoursVar_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Task_HoursVar_feature", "_UI_Task_type"),
				 ToUsePropagatorPackage.Literals.TASK__HOURS_VAR,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__20DerivedPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Hours Var Per Res feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHoursVarPerResPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Task_HoursVarPerRes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Task_HoursVarPerRes_feature", "_UI_Task_type"),
				 ToUsePropagatorPackage.Literals.TASK__HOURS_VAR_PER_RES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI__10TaskPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Task Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTaskNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Task_TaskName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Task_TaskName_feature", "_UI_Task_type"),
				 ToUsePropagatorPackage.Literals.TASK__TASK_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10TaskPropertyCategory"),
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ToUsePropagatorPackage.Literals.TASK__ITEMS);
			childrenFeatures.add(ToUsePropagatorPackage.Literals.TASK__RESOURCE_CANDIDATES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Task.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Task"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Task)object).getTaskName();
		return label == null || label.length() == 0 ?
			getString("_UI_Task_type") :
			getString("_UI_Task_type") + " " + label;
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

		switch (notification.getFeatureID(Task.class)) {
			case ToUsePropagatorPackage.TASK__START:
			case ToUsePropagatorPackage.TASK__END:
			case ToUsePropagatorPackage.TASK__HOURS:
			case ToUsePropagatorPackage.TASK__HOURS_ITEMS:
			case ToUsePropagatorPackage.TASK__HOURS_VAR:
			case ToUsePropagatorPackage.TASK__HOURS_VAR_PER_RES:
			case ToUsePropagatorPackage.TASK__TASK_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ToUsePropagatorPackage.TASK__ITEMS:
			case ToUsePropagatorPackage.TASK__RESOURCE_CANDIDATES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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
				(ToUsePropagatorPackage.Literals.TASK__ITEMS,
				 ToUsePropagatorFactory.eINSTANCE.createTaskItem()));

		newChildDescriptors.add
			(createChildParameter
				(ToUsePropagatorPackage.Literals.TASK__RESOURCE_CANDIDATES,
				 ToUsePropagatorFactory.eINSTANCE.createResourceCandidate()));
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
