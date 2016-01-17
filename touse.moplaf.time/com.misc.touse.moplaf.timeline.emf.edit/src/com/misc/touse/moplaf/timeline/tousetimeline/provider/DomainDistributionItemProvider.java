/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline.provider;


import com.misc.common.moplaf.emf.edit.Util;
import com.misc.common.moplaf.time.continuous.provider.DistributionItemProvider;
import com.misc.touse.moplaf.timeline.tousetimeline.DomainDistribution;
import com.misc.touse.moplaf.timeline.tousetimeline.TousetimelineFactory;
import com.misc.touse.moplaf.timeline.tousetimeline.TousetimelinePackage;
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
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

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

			addNamePropertyDescriptor(object);
			addColorPropertyDescriptor(object);
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
				 getString("_UI_DomainDistribution_Name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainDistribution_Name_feature", "_UI_DomainDistribution_type"),
				 TousetimelinePackage.Literals.DOMAIN_DISTRIBUTION__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainDistribution_Color_feature", "_UI_DomainDistribution_type"),
				 TousetimelinePackage.Literals.DOMAIN_DISTRIBUTION__COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(TousetimelinePackage.Literals.DOMAIN_DISTRIBUTION__FUNCTIONS);
			childrenFeatures.add(TousetimelinePackage.Literals.DOMAIN_DISTRIBUTION__POSSIBLES);
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
	 * This returns DomainDistribution.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DomainDistribution"));
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
			case TousetimelinePackage.DOMAIN_DISTRIBUTION__NAME:
			case TousetimelinePackage.DOMAIN_DISTRIBUTION__COLOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TousetimelinePackage.DOMAIN_DISTRIBUTION__FUNCTIONS:
			case TousetimelinePackage.DOMAIN_DISTRIBUTION__POSSIBLES:
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
				(TousetimelinePackage.Literals.DOMAIN_DISTRIBUTION__FUNCTIONS,
				 TousetimelineFactory.eINSTANCE.createFunctionInterval()));

		newChildDescriptors.add
			(createChildParameter
				(TousetimelinePackage.Literals.DOMAIN_DISTRIBUTION__FUNCTIONS,
				 TousetimelineFactory.eINSTANCE.createFunctionMinimum()));

		newChildDescriptors.add
			(createChildParameter
				(TousetimelinePackage.Literals.DOMAIN_DISTRIBUTION__FUNCTIONS,
				 TousetimelineFactory.eINSTANCE.createFunctionCumulated()));

		newChildDescriptors.add
			(createChildParameter
				(TousetimelinePackage.Literals.DOMAIN_DISTRIBUTION__FUNCTIONS,
				 TousetimelineFactory.eINSTANCE.createFunctionAverage()));

		newChildDescriptors.add
			(createChildParameter
				(TousetimelinePackage.Literals.DOMAIN_DISTRIBUTION__POSSIBLES,
				 TousetimelineFactory.eINSTANCE.createFunctionPossible()));

		newChildDescriptors.add
			(createChildParameter
				(TousetimelinePackage.Literals.DOMAIN_DISTRIBUTION__POSSIBLES,
				 TousetimelineFactory.eINSTANCE.createFunctionEarliestBelow()));
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
		RGB rgb = Util.integerToRgb(distribution.getColor());
		return new Color(Display.getCurrent(), rgb);
	}
	
	

}
