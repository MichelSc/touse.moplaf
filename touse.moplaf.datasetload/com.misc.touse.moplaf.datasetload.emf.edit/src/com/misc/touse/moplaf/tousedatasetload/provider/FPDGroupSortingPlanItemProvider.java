/**
 */
package com.misc.touse.moplaf.tousedatasetload.provider;


import com.misc.common.moplaf.datasetload.provider.TableGroupItemProvider;

import com.misc.touse.moplaf.tousedatasetload.FPDGroupSortingPlan;
import com.misc.touse.moplaf.tousedatasetload.TousedatasetloadFactory;
import com.misc.touse.moplaf.tousedatasetload.TousedatasetloadPackage;

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
 * This is the item provider adapter for a {@link com.misc.touse.moplaf.tousedatasetload.FPDGroupSortingPlan} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FPDGroupSortingPlanItemProvider extends TableGroupItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPDGroupSortingPlanItemProvider(AdapterFactory adapterFactory) {
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

			addFromDatePropertyDescriptor(object);
			addToDatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the From Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFromDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FPDGroupSortingPlan_FromDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FPDGroupSortingPlan_FromDate_feature", "_UI_FPDGroupSortingPlan_type"),
				 TousedatasetloadPackage.Literals.FPD_GROUP_SORTING_PLAN__FROM_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the To Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FPDGroupSortingPlan_ToDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FPDGroupSortingPlan_ToDate_feature", "_UI_FPDGroupSortingPlan_type"),
				 TousedatasetloadPackage.Literals.FPD_GROUP_SORTING_PLAN__TO_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
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
			childrenFeatures.add(TousedatasetloadPackage.Literals.FPD_GROUP_SORTING_PLAN__SORTING_PLANS_TABLE);
			childrenFeatures.add(TousedatasetloadPackage.Literals.FPD_GROUP_SORTING_PLAN__SORTING_PLAN_INPUTS_TABLE);
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
	 * This returns FPDGroupSortingPlan.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FPDGroupSortingPlan"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FPDGroupSortingPlan)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_FPDGroupSortingPlan_type") :
			getString("_UI_FPDGroupSortingPlan_type") + " " + label;
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

		switch (notification.getFeatureID(FPDGroupSortingPlan.class)) {
			case TousedatasetloadPackage.FPD_GROUP_SORTING_PLAN__FROM_DATE:
			case TousedatasetloadPackage.FPD_GROUP_SORTING_PLAN__TO_DATE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TousedatasetloadPackage.FPD_GROUP_SORTING_PLAN__SORTING_PLANS_TABLE:
			case TousedatasetloadPackage.FPD_GROUP_SORTING_PLAN__SORTING_PLAN_INPUTS_TABLE:
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
				(TousedatasetloadPackage.Literals.FPD_GROUP_SORTING_PLAN__SORTING_PLANS_TABLE,
				 TousedatasetloadFactory.eINSTANCE.createFPDSortingPlans()));

		newChildDescriptors.add
			(createChildParameter
				(TousedatasetloadPackage.Literals.FPD_GROUP_SORTING_PLAN__SORTING_PLAN_INPUTS_TABLE,
				 TousedatasetloadFactory.eINSTANCE.createFPDSortingPlanInputs()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TousedatasetloadEditPlugin.INSTANCE;
	}

}
