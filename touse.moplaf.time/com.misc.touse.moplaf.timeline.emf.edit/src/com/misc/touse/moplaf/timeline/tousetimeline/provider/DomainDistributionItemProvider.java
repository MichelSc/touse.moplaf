/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline.provider;



import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import com.misc.common.moplaf.common.Color;
import com.misc.common.moplaf.time.continuous.provider.DistributionItemProvider;
import com.misc.touse.moplaf.timeline.tousetimeline.DomainDistribution;
import com.misc.touse.moplaf.timeline.tousetimeline.ToUseTimeLineFactory;
import com.misc.touse.moplaf.timeline.tousetimeline.ToUseTimeLinePackage;

/**
 * This is the item provider adapter for a {@link com.misc.touse.moplaf.timeline.tousetimeline.DomainDistribution} object.
 * <!-- begin-user-doc -->
 * @implements IItemColorProvider
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainDistributionItemProvider
	extends DistributionItemProvider implements IItemColorProvider  {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainDistributionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#isAdapterForType(java.lang.Object)
	 */
	@Override
	public boolean isAdapterForType(Object type) {
		if ( super.isAdapterForType(type) ){ return true; }
		if ( type == IItemColorProvider.class) { return true; }
		return false;
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

			addColorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainDistribution_Color_feature"),
				 getString("_UI_DomainDistribution_Color_description"),
				 ToUseTimeLinePackage.Literals.DOMAIN_DISTRIBUTION__COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__10ToUsePropertyCategory"),
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
			childrenFeatures.add(ToUseTimeLinePackage.Literals.DOMAIN_DISTRIBUTION__FUNCTIONS);
			childrenFeatures.add(ToUseTimeLinePackage.Literals.DOMAIN_DISTRIBUTION__POSSIBLES);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DomainDistribution)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DomainDistribution_type") :
			getString("_UI_DomainDistribution_type") + " " + label;
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

		switch (notification.getFeatureID(DomainDistribution.class)) {
			case ToUseTimeLinePackage.DOMAIN_DISTRIBUTION__COLOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ToUseTimeLinePackage.DOMAIN_DISTRIBUTION__FUNCTIONS:
			case ToUseTimeLinePackage.DOMAIN_DISTRIBUTION__POSSIBLES:
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
				(ToUseTimeLinePackage.Literals.DOMAIN_DISTRIBUTION__FUNCTIONS,
				 ToUseTimeLineFactory.eINSTANCE.createFunctionMinimum()));

		newChildDescriptors.add
			(createChildParameter
				(ToUseTimeLinePackage.Literals.DOMAIN_DISTRIBUTION__FUNCTIONS,
				 ToUseTimeLineFactory.eINSTANCE.createFunctionCumulated()));

		newChildDescriptors.add
			(createChildParameter
				(ToUseTimeLinePackage.Literals.DOMAIN_DISTRIBUTION__FUNCTIONS,
				 ToUseTimeLineFactory.eINSTANCE.createFunctionAverage()));

		newChildDescriptors.add
			(createChildParameter
				(ToUseTimeLinePackage.Literals.DOMAIN_DISTRIBUTION__POSSIBLES,
				 ToUseTimeLineFactory.eINSTANCE.createFunctionEarliestBelow()));

		newChildDescriptors.add
			(createChildParameter
				(ToUseTimeLinePackage.Literals.DOMAIN_DISTRIBUTION__POSSIBLES,
				 ToUseTimeLineFactory.eINSTANCE.createFunctionEarliestOutput()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ToUseTimeLineEditPlugin.INSTANCE;
	}

	@Override
	public Object getForeground(Object object) {
		DomainDistribution distribution = (DomainDistribution)object;
		Color color = new Color(distribution.getColor());
		return color.toURI();
	}

}
